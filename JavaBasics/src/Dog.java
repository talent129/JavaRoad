public class Dog {
    String breed;
    int age;
    String color;
    void barking() {

    }

    void hungry() {

    }

    void sleeping() {

    }
}

/*
* 一个类可以包含以下类型变量：
局部变量：在方法、构造方法或者语句块中定义的变量被称为局部变量。变量声明和初始化都是在方法中，方法结束后，变量就会自动销毁。
成员变量：成员变量是定义在类中，方法体之外的变量。这种变量在创建对象的时候实例化。成员变量可以被类中方法、构造方法和特定类的语句块访问。
类变量：类变量也声明在类中，方法体之外，但必须声明为static类型。
一个类可以拥有多个方法，在上面的例子中：barking()、hungry()和sleeping()都是Dog类的方法。
* */