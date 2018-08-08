# MyBatis Demo Project.

### Java EE Frameworks

### MyBaits (iBatis)

> [http://www.mybatis.org/mybatis-3/](http://www.mybatis.org/mybatis-3/)

> Database

1. Java Project
2. Java Web Project


### Spring

1. Spring MVC
2. Spring AOP
3. Spring IoC

### 练习：

1. MyBatis CRUD
2. MyBatis CRUD book
3. Web User 注册 / 登录 / 注销
4. Book CRUD

### Spring IoC / 

> Inversion of Control

>DI

test：

// MyBatis: user save 

test:

// Spring MVC + MyBaits
book CRUD

// Spring MVC + MyBatis
user + book

multiple delete?

1. build.gradle
2. db.sql
3. index.jsp / signUp.jsp
4. model.User.java
5. controller.BaseController.java
6. controller.UserController.java
7. WEB-INF/web.xml
8. resources/applicationContext.xml
9. WEB-INF/web-servlet.xml
10. resources/mybatis-config.xml
11. resources/jdbc.properties
12. resources/user-mapper.xml
13. util.MyBatisSession.java

// Spring MVC + MyBatis
book CRUD

// Spring MVC + MyBatis
review
CHECKBOX
SELECT ALL?
CANCEL ALL?
jQuery


Refactor: DAO

// Generic 泛型


// User
SignUp -> password encrypted MD5
SignIn -> ?


// User signIn method?

### user book
1 user : n books
n books : 1 user

1:n one to many
n:1 many to one

user address
1:1 one to one
bidirectional

student course
student_course
n:n many to many

student table:
    id
    name
    
course table:
    id
    title
    
====

Spring JSON
1. build.gradle jackson: jackson databind
2. Controller method: @ResponseBody
3. return List Model


===
Spring file upload
1. jsp <input type="file" ...>
2. jsp <form ...  enctype="multipart/form-data">    
3. build.gradle: commons fileupload
4. web-servlet.xml: multipartResolver bean
5. webapp: avatars folder
    
      
    














