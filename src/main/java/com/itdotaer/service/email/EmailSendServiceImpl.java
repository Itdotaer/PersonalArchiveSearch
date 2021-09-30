package com.itdotaer.service.email;

import com.itdotaer.common.MailHelper;
import com.itdotaer.config.EmailServerConfig;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * EmailSendServiceImpl
 *
 * @author itdotaer
 * @date 2021/9/30
 */
@Service
public class EmailSendServiceImpl implements EmailSendService {

    @Resource
    private EmailServerConfig serverConfig;

    /**
     * 发送邮件
     *
     * @param sender
     * @param receivers
     * @param subject
     * @param content
     */
    @Override
    public void sendEmailNotice(String sender, String receivers, String subject, String content) throws MessagingException {
        MailHelper.sendEmail(serverConfig.getHost(), serverConfig.getPort(), serverConfig.getUsername(),
                serverConfig.getPassword(), sender, receivers, subject, content);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println(sdf.format(new Date()) + " tencent send email :" + content);
    }
}
