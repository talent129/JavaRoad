public class Java教程 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/*
* Java 是由Sun Microsystems公司于1995年5月推出的高级程序设计语言。
Java可运行于多个平台，如Windows, Mac OS，及其他多种UNIX版本的系统。
* */

/*
* 注：String args[] 与 String[] args 都可以执行，但推荐使用 String[] args，这样可以避免歧义和误读。
* */

/*
* 执行命令解析：
以上我们使用了两个命令 javac 和 java。
javac 后面跟着的是java文件的文件名，例如 HelloWorld.java。 该命令用于将 java 源文件编译为 class 字节码文件，如： javac HelloWorld.java。
运行javac命令后，如果成功编译没有错误的话，会出现一个 HelloWorld.class 的文件。
java 后面跟着的是java文件中的类名,例如 HelloWorld 就是类名，如: java HelloWorld。
注意：java命令后面不要加.class。
* */

/*
* main 是一个程序的入口，一个 java 程序运行必须而且有且仅有一个 main 方法。
args[0] 是你传入的第一个参数，args[1]是传入的第二个参数，以此类推。
* */

/*
* String[] args 还有一种等价的写法： String... args
前者为数组形式, 后者为可变参数形式。
前者用得较多, 但是看到后者也应认识。
* */