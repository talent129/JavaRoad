public class Bird {
    int age;

    public Bird(String name) {
        System.out.println("小鸟的名字是: " + name);
    }

    public int getAge() {
        System.out.println("小鸟的年龄为: " + age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        //创建对象
        Bird bird = new Bird("lily");
        //通过方法设定age
        bird.setAge(2);
        //调用另一个方法获取
        bird.getAge();
        //也可以像下面这样获取成员变量
        System.out.println("变量值: " + bird.age);
    }
}

//展示如何访问实例变量和调用成员方法：

/*
* 源文件声明规则
* 当在一个源文件中定义多个类，并且还有import语句和package语句时，要特别注意这些规则。
一个源文件中只能有一个public类
一个源文件可以有多个非public类
源文件的名称应该和public类的类名保持一致。例如：源文件中public类的类名是Employee，那么源文件应该命名为Employee.java。
如果一个类定义在某个包中，那么package语句应该在源文件的首行。
如果源文件包含import语句，那么应该放在package语句和类定义之间。如果没有package语句，那么import语句应该在源文件中最前面。
import语句和package语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。
* */

/*
* Java包
包主要用来对类和接口进行分类。当开发Java程序时，可能编写成百上千的类，因此很有必要对类和接口进行分类
* */

/*
* Import语句
在Java中，如果给出一个完整的限定名，包括包名、类名，那么Java编译器就可以很容易地定位到源代码或者类。Import语句就是用来提供一个合理的路径，使得编译器可以找到某个类。
* */
