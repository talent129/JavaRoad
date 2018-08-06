public class Cat {

    String color;
    int age;

    void sleeping() {

    }

    public Cat(String name) {
        System.out.println("小猫的名字是: " + name);
    }

    public static void main(String [] args) {
        //下面的语句将创建一个Cat对象 //实例化对象
        Cat cat = new Cat("tommy");

        //访问类中变量
        String catColor = cat.color;
        //访问类中方法
        cat.sleeping();

    }
}

/*
* 访问实例变量和方法
通过已创建的对象来访问成员变量和成员方法
* */