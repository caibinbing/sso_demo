package com.caibinbing.controller;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Base64;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ApiController {
    private Logger logger = LogManager.getLogger(ApiController.class);

    @RequestMapping(value = "/getaccesstoken")
    public String getAccessToken(String code){
        logger.info("Authorization code : " + code);
        String url = "http://120.76.242.182:8090/oauth/token";
        List<NameValuePair> params = new LinkedList<>();
        params.add(new BasicNameValuePair("code", code));
        params.add(new BasicNameValuePair("grant_type", "authorization_code"));
        params.add(new BasicNameValuePair("redirect_uri", "http://112.74.59.189/auth_client_2-0.0.1-SNAPSHOT/api/getaccesstoken"));
        params.add(new BasicNameValuePair("scope", "read_profile"));
        UrlEncodedFormEntity urlEncodedFormEntity =new UrlEncodedFormEntity(params, Consts.UTF_8);
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Authorization", "Basic " + Base64.getUrlEncoder().encodeToString(("EEKA:EEKA@2019").getBytes()));
        httpPost.setEntity(urlEncodedFormEntity);
        CloseableHttpClient httpclient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        try {
            response = httpclient.execute(httpPost);
        } catch (IOException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        if (response == null) {
            return "";
        }
        HttpEntity httpEntity = response.getEntity();
        if (httpEntity != null) {
            String result = null;
            try {
                result = EntityUtils.toString(httpEntity);
            } catch (IOException e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }
            logger.info("获取access_token结果 : " + result);
            return result;
        }
        return "";
    }
}
