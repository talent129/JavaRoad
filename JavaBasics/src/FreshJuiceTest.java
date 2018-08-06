

public class FreshJuiceTest {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println(juice.size);
    }
}

class FreshJuice {
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}
    FreshJuiceSize size;
}

//注意：枚举可以单独声明或者声明在类里面。方法、变量、构造函数也可以在枚举中定义

/*
* Java 关键字
下面列出了Java 关键字。这些保留字不能用于常量、变量、和任何标识符的名称。
类别	关键字	说明
访问控制	private	私有的
protected	受保护的
public	公共的
类、方法和变量修饰符	abstract	声明抽象
class	类
extends	扩允,继承
final	最终值,不可改变的
implements	实现（接口）
interface	接口
native	本地，原生方法（非Java实现）
new	新,创建
static	静态
strictfp	严格,精准
synchronized	线程,同步
transient	短暂
volatile	易失
程序控制语句	break	跳出循环
case	定义一个值以供switch选择
continue	继续
default	默认
do	运行
else	否则
for	循环
if	如果
instanceof	实例
return	返回
switch	根据值选择执行
while	循环
错误处理	assert	断言表达式是否为真
catch	捕捉异常
finally	有没有异常都执行
throw	抛出一个异常对象
throws	声明一个异常可能被抛出
try	捕获异常
包相关	import	引入
package	包
基本类型	boolean	布尔型
byte	字节型
char	字符型
double	双精度浮点
float	单精度浮点
int	整型
long	长整型
short	短整型
变量引用	super	父类,超类
this	本类
void	无返回值
保留关键字	goto	是关键字，但不能使用
const	是关键字，但不能使用
null	空
*
* */

/*
* Java 空行
空白行，或者有注释的行，Java编译器都会忽略掉。
* */

//单行注释 alt + /
/*  */ //ctrl + shift + /
/*
*
* */

/*
* 继承
在Java中，一个类可以由其他类派生。如果你要创建一个类，而且已经存在一个类具有你所需要的属性或方法，那么你可以将新创建的类继承该类。
利用继承的方法，可以重用已存在类的方法和属性，而不用重写这些代码。被继承的类称为超类（super class），派生类称为子类（subclass）。
* */

/*
* 接口
在Java中，接口可理解为对象间相互通信的协议。接口在继承中扮演着很重要的角色。
接口只定义派生要用到的方法，但是方法的具体实现完全取决于派生类。
* */