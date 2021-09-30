package com.itdotaer.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * EmailServerConfig
 *
 * @author itdotaer
 * @date 2021/9/30
 */
@Configuration
@ConfigurationProperties(prefix = "server")
@Data
public class EmailServerConfig {

    private String username;

    private String password;

    private String host;

    private Integer port;

}
