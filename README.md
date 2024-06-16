## 码匠社区
## 资料
[Spring 文档](https://docs.spring.io/spring-boot/documentation.html)  
[Spring Web MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)   
[es](https://elasticsearch.cn/explore)  
[Github deploy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)  
[Bootstrap](https://v3.bootcss.com/getting-started/)    
[Github OAuth Document](https://docs.github.com/en/apps/oauth-apps/building-oauth-apps/creating-an-oauth-app)    
[OkHttp](https://square.github.io/okhttp/)  
[Maven Repository](https://mvnrepository.com/)  
[菜鸟教程](https://www.runoob.com/mysql/mysql-tutorial.html)  
[SQL Databases](https://docs.spring.io/spring-boot/reference/data/sql.html)  
[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.1/usingthymeleaf.html)  
[MyBatis Generator](https://mybatis.org/generator/index.html)  
## 工具 
[Git](https://git-scm.com/download)  
[Visual Paradigm](https://www.visual-paradigm.com)  
[Flyway](https://flywaydb.org/)  
[Lombok](https://projectlombok.org/)  
[Apifox](https://app.apifox.com/main/teams/2654958?tab=project)  
[Editor.md](https://github.com/pandao/editor.md?tab=readme-ov-file)
## 快捷键
```idea
ctrl+shift+f  类内搜索关键字
```
## 脚本
```sql
-- auto-generated definition
create table user_k
(
    id           int auto_increment
        primary key,
    account_id   varchar(100) null,
    name         varchar(50)  null,
    token        char(36)     null,
    gmt_create   bigint       null,
    gmt_modified bigint       null
);

```
```
mvn flyway:migrate
```
```
mvn '-Dmybatis.generator.overwrite=true' mybatis-generator:generate
```