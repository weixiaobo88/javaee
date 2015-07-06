userManagement
==============

##教学内容
教学的内容以软件开发为主线，主要涉及的内容和辅助工具有：
* Web开发框架：Spring + Hibernate + Mysql
* 前端开发： JQuery + CSS 
* 源代码管理： Git版本控制
* 构建管理：Gradle/Maven
* 部署管理：Go/Jenkins

##考察点
* Spring + hibernate的配置和环境搭建
* Spring REST API的编写
* Ajax应用
* 持续集成的概念
* 数据库迁移的概念

##主要验证方式
- 边学习边验证
- 博客，一周一篇博客
- 每天的code review

##开发需求：
- 用户管理模块，JQuery单页面的程序，在管理页面，可以对用户进行增删改查，批量删除、搜索和排序。
- 在后台需要提供出用户的增删改，以及批量删除和搜索功能的REST API。
- 用户有姓名、密码、邮箱、年龄的属性，都是必不可少的。

###第一步
- 使用Gradle生成Web项目的structure
- 将项目上传至Github
- 验收标准：提交Github地址到 [Google Drive (共享于学生和Team Lead)]

###第二步
- 配置Spring + Hibernate + Mysql
- 开始编写Spring REST API，首先编写查找所有用户
- 验收标准：在访问URL的时候，页面上会显示所有用户的信息，不需要任何样式，默认数据格式就好。

###第三步
- 编写其他API，增删改，批量删除和搜索。
- 验收标准：可以通过POSTMAN等客户端测试工具测试成功。

###第四步
- 加入密码加密功能，采用MD5
- 验收标准：数据库中的密码以密文存储。

###第五步
- 单页面程序前端实现，一个展示所有用户的页面，页面上可以对用户进行增删改、批量删除、搜索和排序
- 验收标准：可以通过前端的交互对用户进行增删改查、批量删除、搜索和按照年龄排序

###第六步
- 使用Go/Jenkins创建Pipeline，搭建持续集成的环境





##Todo

* Role Management
  - A user/role has several kinds of permissions, 
  - One kind of permission has several resources(URLs)
  - A user can be assigned several roles which have related permissions


