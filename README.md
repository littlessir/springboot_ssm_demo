# springboot_ssm_demo
## 作为初学者的一个SpringBoot下的ssm的小demo，用来显示用户信息（用户名查找）
### 遇到的一些很恼人的问题

问题1 将src/main目录的java和resource文件夹设置maven管理格式方便后续自动引包  
问题2 SpringBoot核心开关SpringbootSsmDemoApplication  
问题3 mapper映射对应具体的sql操作(MySql数据库)  
问题4 application.properties配置本地数据库（跑不动的主要问题就在这了）  
----提示TimeZone报错需要在url后添加?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT  
问题5 SpringBoot有内置的Tomcat的服务器配合在application.properties文件中，连接外部服务器需要另行配置  
问题6 一些注解  
----@Mapper 在接口类上添加，在编译之后会生成相应的接口实现类  
----@MapperScan("com.example.springboot_ssm_demo.dao")在启动类上添加，指定要变成实现类的接口所在的包，然后包下面的所有接口在编译之后都会生成相应的实现类  
----@Repository //标注数据访问组件，即DAO组件  
----@Autowired //它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。通过@Autowired的使用来消除setget方法。
----@RequestMapping //处理请求地址映射的注解，可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。  
----@EnableTransactionManagement//开启事务支持  
----@Override重写父类方法，也可以直接重写，提示重写的方法是否正确  
