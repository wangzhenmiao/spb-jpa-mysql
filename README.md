springboot集成jpa,hibernate写读写数据库mysql
特点：
1、hibernate会自动在url中制定的test数据库中创建表，写入数据
2、项目支持h2内存数据库，操作办法是code完毕后，pom中加入h2依赖，配置文件中h2的引用设置为ture
启动项目，访问url：http://localhost:8080/h2-console
3、数据库的访问url：http://localhost:8080/users
配置文件中设置了：spring.jpa.hibernate.ddl-auto=create-drop
既每次项目启动后，都会自动删除并创建数据库表

运行条件
1、本机安装mysql,启动正常

