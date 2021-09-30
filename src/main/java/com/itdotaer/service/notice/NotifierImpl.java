package com.itdotaer.service.notice;

import com.itdotaer.service.email.EmailSendService;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Map;

/**
 * NotifierImpl
 *
 * @author itdotaer
 * @date 2021/9/29
 */
@Service
public class NotifierImpl implements Notifier {

    @Resource
    private EmailSendService emailSendService;

    /**
     * 通知
     *
     * @param title
     * @param content
     * @param props
     * @return
     */
    @Override
    public Boolean notice(String title, String content, Map<String, String> props) {
        Assert.notNull(props, "props is null");
        String sender = props.get("sender");
        String receivers = props.get("receivers");

        try {
            emailSendService.sendEmailNotice(sender, receivers, title, content);
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}
