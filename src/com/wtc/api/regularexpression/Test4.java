package com.wtc.api.regularexpression;

public class Test4 {
    public static void main(String[] args) {

        // 解析电话号码
        String regex1 = "1[3-9]\\d{9}";

        System.out.println("13112345678".matches(regex1));
        System.out.println("13712345667".matches(regex1));
        System.out.println("13945679027".matches(regex1));
        System.out.println("139456790271".matches(regex1));

        System.out.println("-------------------------");

        // 座机号码
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        //
        System.out.println("020-2324242".matches(regex2));
        System.out.println("02122442".matches(regex2));
        System.out.println("027-42424".matches(regex2));
        System.out.println("0712-3242434".matches(regex2));

        System.out.println("-------------------------");

        // 邮箱号码
        String regex3 = "\\w+@[a-zA-Z0-9]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";

        System.out.println("3232323@qq.com".matches(regex3));
        System.out.println("zhangsan@itcast.cnn".matches(regex3));
        System.out.println("dlei0009@163.com".matches(regex3));
        System.out.println("dlei0009@pci.com.cn".matches(regex3));
    }
}
