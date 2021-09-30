##上海人才引进到档查询

配置方法如下：
### Step 1:
在resource中application.yml配置邮箱服务器和发件人，收件人。

### Step 2:
a. mvn clean install, 将编译好的jar包，用jar命令执行；
b. 或者直接找到Application run man方法。

### Step 3:
每天早上8点（可配置），会收到一封邮件，告知档案有没有到达。效果如下：

到档
![Alt text](./images/到档.jpg?raw=true "到档")

未到档
![Alt text](./images/未到档.jpg?raw=true "到档")
