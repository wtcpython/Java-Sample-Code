`Node<K, V>[] table` 哈希表结构中数组的名称

`DEFAULT_INITIAL_CAPACITY`  数组的默认长度 16

`DEFAULT_LOAD_FACTOR`  默认加载因子 0.75

Java 中 HashMap 的键值对默认存储方式

```java
static class Node<K,V> implements Map.Entry<K,V> {
    final int hash;   // 键的哈希值
    final K key;      // 键
    V value;          // 值
    Node<K,V> next;   // 下一个节点的地址值
}
```

当存储数据时，会计算键值对的键的哈希值，若两个键的哈希值相等，且键值对的值不同时，新的键值对将以链表的形式接在已有的数据下，形成一条链表

当链表长度大于 8 且 数组长度大于 64 时，这条链表将转换为红黑树以增强效率，存储结构将变为：

```java
static final class TreeNode<K,V> extends LinkedHashMap.Entry<K,V> {
    TreeNode<K,V> parent;  // red-black tree links
    TreeNode<K,V> left;
    TreeNode<K,V> right;
    TreeNode<K,V> prev;    // needed to unlink next upon deletion
    boolean red;
    TreeNode(int hash, K key, V val, Node<K,V> next) {
        super(hash, key, val, next);
    }
}
```

添加元素时的行为

```java
// key: 键
// value: 值

// return: 被覆盖元素的值，没有就是 null
public V put(K key, V value) {
    return putVal(hash(key), key, value, false, true);
}
```

```java
static final int hash(Object key) {
    int h;
    return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
}
```

hash 函数用于计算 key 的 hash 值，如果 key 为 null，则直接返回 0，否则返回其 hashCode 和其他混合计算的结果。

```java
// hash: 键的 hash 值
// key: 键
// value: 值
// onlyIfAbsent: 是否保留旧元素的值
final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                boolean evict) {
    // 记录哈希表中数组的地址值
    Node<K,V>[] tab;
    // 临时变量，记录键值对对象
    Node<K,V> p;
    // 当前数组长度
    int n;
    // 索引记录
    int i;
    
    // 判断非空
    if ((tab = table) == null || (n = tab.length) == 0)
        // 如果是第一次添加数据，系统会初始化一个长度为 16，加载因子为 0.75 的数组
        // 如果不是第一次，会检查数组的元素是否达到扩容条件，若达到则会扩容 2 倍
        n = (tab = resize()).length; // 16

    // 如果计算后的 Hash 值索引所在的值为空，则直接创建新 键值对对象 并赋值
    if ((p = tab[i = (n - 1) & hash]) == null)
        tab[i] = newNode(hash, key, value, null);
    else {
        // 已存在数据，即 Hash 值相同
        Node<K,V> e; K k;
        // 判断键是否相同，若相同直接覆盖
        // 判断 hash 值是否相等
        // 且两者的键指向同一引用对象 或 equals 函数相等
        if (p.hash == hash &&
            ((k = p.key) == key || (key != null && key.equals(k))))
            e = p;
        // 红黑树形式添加节点
        else if (p instanceof TreeNode)
            e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
        // 链表形式添加节点
        else {
            for (int binCount = 0; ; ++binCount) {
                if ((e = p.next) == null) {
                    p.next = newNode(hash, key, value, null);
                    if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                        treeifyBin(tab, hash);
                    break;
                }
                if (e.hash == hash &&
                    ((k = e.key) == key || (key != null && key.equals(k))))
                    break;
                p = e;
            }
        }
        if (e != null) { // existing mapping for key
            // 数据已存在，需要覆盖旧数据
            V oldValue = e.value;
            if (!onlyIfAbsent || oldValue == null)
                // 实际上为修改旧数据的 value 所指向的值，地址值不变
                e.value = value;
            afterNodeAccess(e);
            return oldValue;
        }
    }
    // 并发修改异常判断
    ++modCount;
    // threshold 就是 16 * 0.75 即扩容时机
    if (++size > threshold)
        // 需要扩容
        resize();
    afterNodeInsertion(evict);
    // 表示没有覆盖任何元素
    return null;
}
```
