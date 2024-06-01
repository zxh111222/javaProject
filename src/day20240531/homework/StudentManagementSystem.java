package day20240531.homework;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: StudentManagementSystem
 * @date 2024/6/1 14:59
 */

import java.util.Scanner;

/**
 * 基于命令行的学生管理系统需求:
 * 1. 列出所有学生信息
 * 2. 增加学生                    - 增
 * 3. 删除指定学生(根据姓名)        - 删
 * 4. 更改指定学生信息(根据姓名)     - 改
 * 5. 查找指定学生信息(根据姓名)     - 查
 * 6. 退出系统
 * 思路:
 * 1. 需要主程序里面不停循环，当达到一个条件————输入`q`时退出
 * 2. 需要一个 Student 类
 * 3. 需要在主程序中调用不同的函数，实现学生管理系统中的需求
 */

public class StudentManagementSystem {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("==================  学生管理系统  ==================");
            System.out.println("\t请输入操作编号或输入 q/quit 退出系统:");
            System.out.println("\t1. 列出所有学生信息");
            System.out.println("\t2. 增加学生");
            System.out.println("\t3. 删除指定学生");
            System.out.println("\t4. 更改指定学生信息");
            System.out.println("\t5. 查找指定学生信息");
            System.out.println("==================================================");

            System.out.println("请输入您的操作:");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("q") || choice.equals("quit")) {
                System.out.println("退出系统!");
                break;
            }

        }
    }
}
