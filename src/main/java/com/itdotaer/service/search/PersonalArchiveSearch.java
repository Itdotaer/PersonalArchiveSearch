package com.itdotaer.service.search;

import com.itdotaer.model.PersonalArchive;

import java.io.IOException;

/**
 * PersonalArchiveSearch
 *
 * @author itdotaer
 * @date 2021/9/29
 */
public interface PersonalArchiveSearch {

    /**
     * 查找人事档案情况
     *
     * @param name
     * @param idCard
     * @return
     */
    PersonalArchive search(String name, String idCard) throws IOException;

}
