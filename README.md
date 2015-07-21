基于Java的技术栈学习
==============

##考察点
* Spring + hibernate的配置和环境搭建
* Spring REST API的编写
* Ajax应用，angular框架，Bootstrap使用
* 数据库迁移的概念
* gradle
* git
* ...


## 需求

实现用户管理系统，全程用git版本控制

### 第一阶段

1. 将网站跑起来，能在网页上看到"Hello World"
2. 使用JSP在页面上显示出用户的基本信息（静态信息），包括姓名、性别、邮箱、年龄。

提示：
- gradle启动jetty
- index.jsp（用最简单的方式实现第2问）

知识点：
- 如何在Intellij中导入工程
- 什么是gradle，查看gradle任务、运行jetty的命令分别是什么，buildscript的设置和普通的设置有什么区别
- gradle运行环境、项目结构、运行机制、依赖管理（依赖是怎么下下来的，放在哪里）、任务管理、插件，compile & runtime 区别
- 用户和服务器如何对话，HTTP协议、HTTP方法、解剖URL的不同部分、HTTP请求报头（如何查看）
- 服务器主机、Web服务器、应用服务器（Web容器），三者的概念及之间的关系
- 部署描述符DD，web.xml文件


### 第二阶段

使用MySQL来记录用户的信息，并将JSP页面上显示的用户数据换为数据库的数据

提示：
- MySQL中建立数据库
- Java连接MySQL

知识点：
- 安装MySQL
- MySQL的基本使用
    * 启动服务、登陆进入命令行
    * 更改用户名密码
    * 创建数据库、创建表、查看表结构、修改表、删除表
    * 查询数据、删除数据
    * 查看数据库状态
- 关系型数据库的基本概念
- Java如何操作数据库，jdbc
- SQL语句的两种形式（字符串拼接，问号形式），有SQL注入攻击的安全问题
- 数据库连接池
- Servlet的生命周期
- Web请求和响应的流程（在浏览器地址栏中输入URL之后，到页面显示数据，中间发生了什么）
- JSP工作原理，JSP EL，为什么会有JSP
- JSTL基本用法
- View Resolver


### 第三阶段

1. 完成用户信息的增删改
2. 数据库的使用：使用gradle来初始化数据库，数据库迁移的问题

提示：
- gradle task: cleanSeed & initSeed

知识点：
- 基本的MVC的分层概念
- 数据库迁移的概念，为什么要做数据库迁移（解决的问题），flyway的工作原理
- 数据库初始化 
- gradle创建任务


### 第四阶段

引入Spring 和 hibernate

知识点：
- Spring MVC的概念和工作原理，ModelAndView
- AOP的概念
- IoC的概念，对什么进行了控制反转
- Spring中的依赖注入有几种方式
- Spring中两种配置方式，基于annotation以及XML
- Hibernate作用、工作原理，ORM的概念，两种基本配置和使用（Hibernates.cfg.xml文件+Entity注解 或 Hibernates.cfg.xml文件+Entity.hbm.xml文件）
- Hibernate缓存机制
- REST的思想


### 第五阶段

1. 在JSP版本的实现上，写一个登录页面，实现登录功能，用session实现。
2. 现行的JSP实现和基础数据是没有在创建和修改用户时对密码进行md5码加密的，要求自己加上。
3. 把JSP版本下的所有用户管理界面的URL，都管理起来，不登录不能访问，直接跳回登录页面。
4. 如果访问了某不登录无法访问的页面A，就跳回登录页。登录成功就可以跳回页面A，要求用cookie实现。（登录了失败了N次之后，再登录成功也能跳回，一旦登录成功了，来源页面在cookie里的记录应该被清空）

知识点：
- session 和 cookie 的区别，使用的时候有哪些方面需要注意
- Web应用的安全问题，密码加密
- filter模型，拦截器interceptor的工作原理、带来的好处
- Java代码debug，Web应用程序debug
- 单例是什么，有什么好处，Spring中哪里用到了单例


### 第六阶段

1. 这是一个健身房管理系统。系统里有雇员（Employee）, 顾客（Customer）, 课程（Course）, Employee有三种：OPs，HR，COACH（教练）。
2. 一个顾客可以上多门课，每门课有一个教练。每门课要有课程的时间安排，一门课一定是跨很多天的（精确到天就可以了）。
3. 每个雇员要关联一个User，1对1的关系
4. 一个顾客可以指定一个私人教练，且只能指定一个，顾客可以跟私人教练约私人课程，时间是现约现安排，但是教练有课程的日子不能约私人课程
5. 所有的设置，都参考User的增删改查。只要能增删改查就好了，理解为有一个人操作一台电脑处理所有的企业运转数据。
6. 显示课程表
7. 要求所有的关系都是lazy loading， Coach要单独要建成一个类。

数据库中相关的考察点：
- 数据库中一对一、一对多、多对多的关系，以及相应的lazy loading
- 根据表的关系来分子类
- 不同实体之间的关系类型
- 一个东西的两个视图，比如添加修改的视图、展示的视图
- 时间上的冲突
- 前台数据如何传到后台

知识点：
- 对需求的分析
- 数据库的设计，实体的关系类型 
- Hibernate中的lazy loading是什么，有什么好处
- 单元测试和集成测试，在哪一层进行测试
- Test Double是什么，有几种，哪些情况下使用，mock & stub 的区别
- Spring中的测试怎么写，Test Fixtures是什么，数据驱动测试（DDT，JUnit theories）是什么

    
### 第七阶段

引入前端知识体系

知识点：
- HTML & CSS
- jQuery
- JavaScript基本语法、DOM操作与事件机制
- AngularJS
- 构建工具Gulp


##Java中的概念

- 继承（重载、覆盖）
- 封装
- 多态
- 类、抽象类、接口
- 包及访问权限
- 构造函数
- 注解
- 异常
- 垃圾回收
- 泛型
- 反射
- 面向对象三特性五原则
- 常用的设计模式（工厂、单例、策略、代理等）
- 数据类型（基本数据类型、引用数据类型、枚举）
- 数组和集合（List、Set、Map）
- 语法中的关键字（this super final static class interface implements extends throw/throws try-catch-finally  ） 
