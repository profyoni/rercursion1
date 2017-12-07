package edu.touro.cs.mco264;

import java.util.LinkedList;
import java.util.List;

import static edu.touro.cs.mco264.Math.*;

class LSP
{
    public static <T>  void printAll(Object[] list) {
        for (Object o : list) {
            System.out.println(o);
        }
        list[0]= 5;
    }

    //List is a raw type - not strongly typed. STronglt discoureaged
    public <T> void printAll(List<T> list)
    {
        for(T o: list){
            System.out.println(o);
        }
    }

    public void main(){
        List<String> list = new LinkedList<>();
        printAll(list);
        list.add("");

        String [] list2 = new String[10];
        printAll(list2);

    }


}


class Hanoi
{
    public static void doomsday(int discs, String src, String dest, String tmp){
        if (discs == 1){
            System.out.printf("Move 1 disc from %s to %s%n", src, dest);
            return;
        }
        doomsday( discs-1, src, tmp, dest);
        doomsday( 1, src, dest, tmp);
        doomsday( discs-1, tmp, dest, src);
    }
}
class Math
{
    static long[] memo = new long[2000];

    static{ // static c-tor
        memo[1] = 1;
    }

    public static long fib(int i){
        if (memo[i] != 0)
            return memo[i];
        if (i <= 1)
            return i;
        memo[i] = fib(i-1)+fib(i-2);
        return memo[i];
    }
}

public class Main {

    static int factorial(int i){
        return i < 1 ? 1 : i * factorial(i-1);
    }
    static void foo(int i){
        System.out.println(i);
        long x1,x2,x3,x4,x5,x6,x7,x8,x9,x10;
        long x21,x22,x23,x24,x25,x26,x27,x28,x29,x210;
        long x31,x32,x33,x34,x35,x36,x37,x38,x39,x310;
        String s = "jflkjd";
        foo(i + 1);
    }
    public static void main(String[] args) {

        EightQueens.main(null);
//        String [] list2 = new String[10];
//        LSP.printAll(list2);
//        Hanoi.doomsday(12, "A", "C", "B");

//        long x = fib(1000);
//        System.out.println(x);
//        x = fib(1000);
//        System.out.println(x);
//        System.out.println(factorial(6));
//
//
//        foo(0);
//
//        LinkedList<String> list = new LinkedList<>();
//        int i = 0;
//        for (;;)
//        {
//            list.add(new String(i++ + ""));
//            if (i % 100000 == 0){
//                System.out.println(i / 100000);
//            }
//        }
    }
}
