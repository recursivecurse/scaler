package javaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //Buffered Reader

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String name = br.readLine();
//        System.out.println(name);

        //Scanner
        Scanner sc = new Scanner(System.in);
        String ss = sc.nextLine();
        Integer x = sc.nextInt();
        String s = sc.next();

        System.out.println(ss);
        System.out.println(x);
        System.out.println(s);


    }
}
