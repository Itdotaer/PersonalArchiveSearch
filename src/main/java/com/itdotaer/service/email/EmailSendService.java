package com.itdotaer.service.email;

import javax.mail.MessagingException;

/**
 * EmailSendService
 *
 * @author itdotaer
 * @date 2021/9/30
 */
public interface EmailSendService {

    /**
     * 发送邮件
     *
     * @param sender
     * @param receivers
     * @param subject
     * @param content
     */
    void sendEmailNotice(String sender, String receivers, String subject, String content) throws MessagingException;
}
