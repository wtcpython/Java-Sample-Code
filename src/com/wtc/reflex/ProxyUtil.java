package com.wtc.reflex;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    // 创建代理
    public static IStar CreateProxy(BigStar bigStar) {
        // public static Object newProxyInstance(ClassLoader loader, Class <? >[]
        // interfaces, InvocationHandler h)
        // 参数一：用于指定类加载器
        // 参数二：指定代理接口
        // 参数三：用来指定生成的代理对象要做什么

        IStar star = (IStar) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),
                new Class[] { IStar.class },
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // proxy: 代理本身
                        // method: 要运行的方法
                        // args: 调用方法时，传入的参数
                        if ("sing".equals(method.getName())) {
                            System.out.println("准备话筒，收钱");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("准备场地，收钱");
                        }
                        // 返回值就是 要调用的对象 的方法 的返回值
                        return method.invoke(bigStar, args);
                    }
                });
        return star;
    };
}
