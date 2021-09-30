package com.itdotaer.service.notice;

import java.util.Map;

/**
 * Notifier
 *
 * @author itdotaer
 * @date 2021/9/29
 */
public interface Notifier {

    /**
     * 通知
     *
     * @param title
     * @param content
     * @param props
     * @return
     */
    Boolean notice(String title, String content, Map<String, String> props);

}
