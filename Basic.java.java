/*
J2SE(core java), J2EE(advance java)

total keyword= 
java is high level programming language.
why we use java- java is hardware independent
               - plateform independent ex- window,linux etc
               - secure language
               - gaurbage collection
               - used byte code- code in byte formate

How to java implemented-
               - Software- JDK (java development kit)   JDK8
                 
set of instruction is called program which are use to communicate with system.


**********************************************************************
 Java is a Object oriented programing 
 public =
 class =
 class name =

  


 javac filename    for compile
 java  filename    for run
*/  
import java.util.Scanner;
public class Basic {

    public static void main(Stri ng [] args)
    {
        System.out.println("enter a Number");
        Scanner sc=new Scanner(System.in);
        int no;
        no=sc.nextInt();
        System.out.println(no);
        System.out.println("hello");
    }
}