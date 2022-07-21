package com.atguigu.git;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

/**
 * @author LZX
 * @create 2022-07-19 9:55
 */
public class Customer {

    private String aaa;
    private Integer ccc;

    public static void main(String[] args) {

        int i = 100;

        
        System.out.println("push test1111ccccc");

        System.out.println("hot-fix");
        System.out.println("ccccccc");
        System.out.println("github test1111111111");
        System.out.println("bbbbmaster");

        System.out.println("aaa = " + i);
        System.out.println("module3");
        System.out.println("module1");
        System.out.println("module4");
        System.out.println("module5");
        System.out.println("module7");
        System.out.println("module6");
        System.out.println("module8");
        System.out.println("module2");
        System.out.println("module2");
        System.out.println("module2");
        System.out.println("module2");
        Date date = new Date();

        System.out.println("date = " + date);
        System.out.println("date = " + date);




        User user = new User();
        user.show();

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("ccc");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
















