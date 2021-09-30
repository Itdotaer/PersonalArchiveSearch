package com.itdotaer.service.search;

import com.itdotaer.common.Constants;
import com.itdotaer.common.HttpHelper;
import com.itdotaer.common.JacksonHelper;
import com.itdotaer.config.EmailConfig;
import com.itdotaer.model.PersonalArchive;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * PersonalArchiveSearchImpl
 *
 * @author itdotaer
 * @date 2021/9/29
 */
@Service
public class PersonalArchiveSearchImpl implements PersonalArchiveSearch {

    @Resource
    private EmailConfig emailConfig;

    /**
     * 查找人事档案情况
     *
     * @param name
     * @param idCard
     * @return
     */
    @Override
    public PersonalArchive search(String name, String idCard) throws IOException {
        String rs = HttpHelper.post(emailConfig.getPostUrl(), String.format(Constants.POST_JSON_FMT, name, idCard));
        if (StringUtils.isEmpty(rs)) {
            return null;
        }

        return JacksonHelper.toObject(rs, PersonalArchive.class);
    }
}
