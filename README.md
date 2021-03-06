# 设计模式日常学习

# 设计模式6大原则

1.单一原则

>一个类应该只有一个引起它变化的原因。

2.里氏替换原则

>所有使用父类的地方都能透明的使用子类对象。<br/>
>**注意需要避免子类的“个性”，因为一旦子类有了个性父类和子类
>之间的关系就很难调和了。**

3.依赖倒置原则

>对象之间应该依赖抽象而不是实现。参考spring依赖倒置的作用。

4.接口隔离

>接口需要细化和纯洁。<br/>
>例如: userService userServiceForRpc。 <br/>
>userService提供的是供自身系统使用的接口。<br/>
>userServiceForRpc提供的是给外部调用的rpc接口。

5.迪米特法则

>一个对象应该对其他对象有最少的了解。
>例如有一个软件安装类，让你一步一步安装<br/>
>![软件安装类](https://github.com/langzhigang/design-pattern-demo/blob/master/src/main/resources/wizard.png)
><br/>
>优化过后，只提供一个安装的方法<br/>
>![软件安装类](https://github.com/langzhigang/design-pattern-demo/blob/master/src/main/resources/wizard1.png)
><br/>
>对于调用方来说，第二种更好，因为知道的细节更少。

6.开闭原则

>对修改关闭对新增开放。