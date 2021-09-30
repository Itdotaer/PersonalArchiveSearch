package com.itdotaer.common;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * HttpHelper
 *
 * @author itdotaer
 * @date 2021/9/29
 */
public class HttpHelper {

    /**
     * 发起post请求
     *
     * @param url
     * @param json
     * @return
     * @throws IOException
     */
    public static String post(String url, String json) throws IOException {
        CloseableHttpClient client = null;
        try {
            client = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(url);

            StringEntity entity = new StringEntity(json);
            httpPost.setEntity(entity);
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");

            CloseableHttpResponse response = client.execute(httpPost);
            return EntityUtils.toString(response.getEntity(), "UTF-8");
        } finally {
            if (client != null) {
                client.close();
            }
        }


    }

}
