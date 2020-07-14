1.
 <!--是否自动提示***.yml文件中的自定义内容 比如输入 user 自动提示 user.namea -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-configuration-processor</artifactId>
      <optional>true</optional>
    </dependency>

2.配置文件
application.yml
application-dev.yml
application-prod.yml

application.yml 中有如下选项，表示 使用application-dev.yml
spring:
  profiles:
    active: dev

3. 编译banner更新
resources中增加banner.txt，编译的时候自动显示banner.txt中的文件内容
