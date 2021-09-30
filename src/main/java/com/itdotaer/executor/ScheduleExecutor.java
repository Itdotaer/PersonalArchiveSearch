package com.itdotaer.executor;

import com.itdotaer.common.JacksonHelper;
import com.itdotaer.config.EmailConfig;
import com.itdotaer.model.PersonalArchive;
import com.itdotaer.service.notice.Notifier;
import com.itdotaer.service.search.PersonalArchiveSearch;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ScheduleExecutor
 *
 * @author itdotaer
 * @date 2021/9/29
 */
@Component
@EnableScheduling
public class ScheduleExecutor {

    @Resource
    private EmailConfig emailConfig;
    @Resource
    private PersonalArchiveSearch personalArchiveSearch;
    @Resource
    private Notifier notifier;

    @Scheduled(cron = "0 * * * * *")
    public void process() {
        String name = emailConfig.getName();
        String idCard = emailConfig.getIdCard();

        try {
            PersonalArchive personalArchive = personalArchiveSearch.search(name, idCard);

            // 拿到档案，发送通知
            Map<String, String> props = new HashMap<>(0);
            props.put("sender", emailConfig.getSender());
            props.put("receivers", emailConfig.getReceiver());

            if (Objects.isNull(personalArchive) || Objects.isNull(personalArchive.get档案号())) {
                notifier.notice(emailConfig.getTitleFailed(), JacksonHelper.toJson(personalArchive), props);
                return;
            }

            notifier.notice(emailConfig.getTitle(), emailConfig.getContent(), props);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
