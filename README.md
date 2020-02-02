# Getting Started（2020.2.2）

### IDEA版本及相关配置
* 项目框架：spring boot+thymeleaf(gradle)
* IntelliJ IDEA 2019.3.2 (Community Edition)
* Build #IC-193.6015.39, built on January 21, 2020
* VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o
* jdk：1.8.0_121
* gradle:3.5
* MYSQL：我用的是8.0.18版本

### 配置文件
* bookstream/build.gradle 添加插件的地方(compile……)
* bookstream/gradle/wrapper/gradle-wrapper.properties 修改gradle版本
* bookstream/src/main/resource/application.properties 
  配置数据库连接，自动映射建表，根据自己的mysql版本修改相应配置以及连接的url

### 导入工程的操作
* 从github上git下来，推荐使用github客户端（可以监控每一个人所做的修改）
* 安装好IDEA、MYSQL等软件
* 打开MYSQL命令行：
   建立数据库（注意名字，改了的话就要改相应配置  
    ######DROP DATABASE IF EXISTS bookStream;  
    ######CREATE DATABASE bookStream DEFAULT CHARSET utf8 COLLATE utf8_general_ci;  
   修改密码  
    ######use mysql;  
    ######update user set authentication_string='' where user='root';  
    ######alter user 'root'@'localhost' identified by '123456'；  
* 打开IDEA导入工程，运行BookStreamApplication.java，检查数据库，看几张表是否建成。  
* 测试：
    ######用命令行插入数据
    ######INSERT INTO `bookstream`.`users_table` (`phone_number`, `age`, `name`, `password`, `sex`) VALUES ('00000000000', '0', '交易对象为空', '123456', '10');
    ######INSERT INTO `bookstream`.`users_table` (`phone_number`, `age`, `name`, `password`, `sex`) VALUES ('11111111111', '0', '平台', '123456', '10');
    ######INSERT INTO `bookstream`.`users_table` (`phone_number`, `age`, `name`, `password`, `sex`) VALUES ('15696028246', '23', '陈建伟', '123456', '1');
    ######INSERT INTO `bookstream`.`users_table` (`phone_number`, `age`, `name`, `password`, `sex`) VALUES ('13723458907', '22', '潘海明', '12345678', '1');
    ######访问 http://localhost:8080/users/test?phone_number=15696028246 看能否返回正常的jason串
