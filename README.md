# 单体架构多模块应用构建(SpringBoot 2.2.6.RELEASE)

### 启动前注意配置

* 启动类添加扫描controller，service，dao

```text
@MapperScan(basePackages = "com.tz.dao")
@SpringBootApplication(scanBasePackages = {"com.tz"})
```

### 打包步骤(瘦身jar包步骤)
* 打包包含依赖的jar包文件，修改micro-web/pom.xml文件

```xml
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
```

* 执行打包命令

```shell script
mvn clean package -Dmaven.test.skip=true
```

* 如果不对jar包进行瘦身，到这一步即可运行，如果想对jar包瘦身，那就跟我继续看下去吧

* 打包结束，解压压缩包，找到BOOT-INF/lib文件夹，放到指定位置，例如/my_app_lib/lib

* 打包不包含依赖的jar文件，修改micro-web/pom.xml文件
```xml
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <mainClass>com.tz.web.MicroWebApplication</mainClass>
                    <layout>ZIP</layout>
                    <includes>
                        <include>
                            <groupId>nothing</groupId>
                            <artifactId>nothing</artifactId>
                        </include>
                    </includes>
                </configuration>
                <executions>
                    <execution>
                        <goals>
                            <goal>repackage</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
```

* 执行打包命令

```shell script
mvn clean package -Dmaven.test.skip=true
```

* 启动jar包（需要指定我们刚才解压的lib包）

```shell script
java -Dloader.path=/my_app_lib/lib -jar web-0.0.1-SNAPSHOT.jar
```

