package com.itdotaer.model;

import lombok.Data;

/**
 * PersonalArchive
 * resp json:
 * {"id":null,"姓名":null,"身份证号码":null,"档案所在网点":null,"档案托管时间":null,"网点代码":null,"网点地址":null,"档案号":null,"arnum":0}
 * @author itdotaer
 * @date 2021/9/29
 */
@Data
public class PersonalArchive {

    private String id;
    private String 姓名;
    private String 身份证号码;
    private String 档案所在网点;
    private String 档案托管时间;
    private String 网点代码;
    private String 网点地址;
    private String 档案号;
    private String arnum;

}
