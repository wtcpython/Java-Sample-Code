package com.wtc.object.test;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "张三", 23);
        Student stu2 = new Student(2, "李四", 24);
        Student stu3 = new Student(3, "王五", 25);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        // AddStudent(arr);
        // removeStudent(arr);

        int index = getIndex(arr, 2);
        if (index >= 0) {
            // 存在，修改内容
            arr[index].setAge(arr[index].getAge() + 1);
            printArr(arr);
        } else {
            // 不存在，删除失败
            System.out.println("当前 id 不存在，修改失败");
        }
    }

    public static void removeStudent(Student[] arr) {
        int index = getIndex(arr, 2);
        if (index >= 0) {
            // 删除内容
            arr[index] = null;
            printArr(arr);
        } else {
            // 不存在，删除失败
            System.out.println("当前 id 不存在，删除失败");
        }
    }

    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                if (stu.getId() == id) {
                    return i;
                }
            }
        }
        // 未找到
        return -1;
    }

    public static void AddStudent(Student[] arr) {
        // 添加一个新的学生信息，并进行唯一性判断
        Student stu4 = new Student(4, "赵六", 26);

        if (contains(arr, stu4)) {
            System.out.println("当前 id 已存在，请修改后再添加！");
        } else {
            int count = getCount(arr);
            if (count == arr.length) {
                // 已经存满
                Student[] newArr = createNewArr(arr);
                newArr[count] = stu4;

                // 遍历所有学生信息
                printArr(newArr);
            } else {
                // 未存满
                arr[count] = stu4;

                // 遍历所有学生信息
                printArr(arr);
            }
        }
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu);
            }
        }
    }

    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static boolean contains(Student[] arr, Student stu) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (stu.getId() == arr[i].getId()) {
                    return true;
                }
            }
        }
        return false;
    }
}
