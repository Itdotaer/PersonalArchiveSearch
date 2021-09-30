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
![到档](https://user-images.githubusercontent.com/7733506/135424864-bc0f4350-43de-4402-9ddd-06bf5a24ec38.jpg)

未到档
![未到档](https://user-images.githubusercontent.com/7733506/135424888-9033dce7-f64c-440a-b598-c1c14ad63e4c.jpg)
