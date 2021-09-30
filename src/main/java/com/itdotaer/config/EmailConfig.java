package com.itdotaer.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * LocalConfig
 *
 * @author itdotaer
 * @date 2021/9/29
 */
@Configuration
@ConfigurationProperties(prefix = "email")
@Data
public class EmailConfig {

    private String sender;

    private String receiver;

    private String postUrl;

    private String name;

    private String idCard;

    private String titleFailed;

    private String title;

    private String content;

}
