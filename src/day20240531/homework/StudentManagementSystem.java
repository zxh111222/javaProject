package day20240531.homework;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: StudentManagementSystem
 * @date 2024/6/1 14:59
 */

import java.util.ArrayList;
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
    private static ArrayList<Student> students = new ArrayList<>();
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

            switch (choice) {
                case "1":
                    showStudentsList();
                    break;
                case "2":
                    addStudent();
                    break;
                case "3":
                    deleteStudent();
                    break;
                case "4":
                    updateStudent();
                    break;
                case "5":
                    findStudent();
                    break;
                default:
                    System.out.println("--- 您的输入有误，请重新输入! ---");
            }

        }
    }


    /**
     * @description: 查找指定学生信息(根据姓名)
     * @author XinhaoZheng
     * @date 2024/6/1 15:44
     * @version 1.0
     */
    private static void findStudent() {
    }


    /**
     * @description: 更改指定学生信息(根据姓名)
     * @author XinhaoZheng
     * @date 2024/6/1 15:44
     * @version 1.0
     */
    private static void updateStudent() {
        System.out.println("请输入要更新信息的学生姓名:");
        String name = scanner.nextLine();

        for (Student student : students) {
            if (student.name.equals(name)) {
                System.out.println("请输入新的学生年龄:");
                int newAge = scanner.nextInt();
                scanner.nextLine();
                System.out.println("请输入新的学生家乡:");
                String newHometown = scanner.nextLine();

                student.age = newAge;
                student.hometown = newHometown;
                System.out.println("学生信息已更新成功!");
                System.out.println("==================================================\n\n");
                return;
            }
        }
        System.out.println("未找到该学生!");
        System.out.println("==================================================\n\n");
    }


    /**
     * @description: 删除指定学生(根据姓名)
     * @author XinhaoZheng
     * @date 2024/6/1 15:43
     * @version 1.0
     */
    private static void deleteStudent() {
        System.out.println("请输入要删除学生的姓名:");
        String name = scanner.nextLine();

        for (Student student : students) {
            if (student.name.equals(name)) {
                students.remove(student);
                System.out.println("已删除该学生的信息!");
                System.out.println("==================================================\n\n");
                return;
            }
        }
        System.out.println("未找到该学生!");
        System.out.println("==================================================\n\n");
    }

    /**
     * @description: 增加学生
     * @author XinhaoZheng
     * @date 2024/6/1 15:43
     * @version 1.0
     */
    private static void addStudent() {
        System.out.println("请输入要添加学生的姓名:");
        String name = scanner.nextLine();
        System.out.println("请输入该学生的年龄:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("请输入该学生的家乡:");
        String hometown = scanner.nextLine();

        students.add(new Student(name, age, hometown));
        System.out.println("添加成功!");
        System.out.println("==================================================\n\n");
    }

    /**
     * @description: 列出所有学生信息
     * @author XinhaoZheng
     * @date 2024/6/1 15:41
     * @version 1.0
     */
    private static void showStudentsList() {
        if (students.isEmpty()) {
            System.out.println("还未录入学生信息!");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
        System.out.println("==================================================\n\n");
    }
}
