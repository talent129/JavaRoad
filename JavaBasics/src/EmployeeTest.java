import java.io.*;

public class EmployeeTest {
    public static void main(String[] args) {
        //使用构造器创建两个对象
        Employee one = new Employee("one");
        Employee two = new Employee("two");

        //调用这两个对象的成员方法
        one.empAge(26);
        one.empDesignation("高级程序员");
        one.empSalary(1000);
        one.printEmployee();

        System.out.println();

        two.empAge(21);
        two.empDesignation("菜鸟程序员");
        two.empSalary(500);
        two.printEmployee();
    }
}
