package com.wtc.advanceclass.inherit;

import java.util.Scanner;

import org.openjdk.jol.vm.VM;

public class VMAddress {
    public static void main(String[] args) {
        Zi z = new Zi();

        System.out.println(Long.toHexString(VM.current().addressOf(z)));

        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}

class Fu {
    private int a = 0x111;
    int b = 0x222;

    public void fuShow1() {
        System.out.println("public --- FuShow");

    }

    private void fuShow2() {
        System.out.println("private --- FuShow");

    }
}

class Zi extends Fu {
    int c = 0x333;

    public void ziShow() {
        System.out.println("public --- ZiShow");
    }
}
