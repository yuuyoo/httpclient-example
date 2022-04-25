package cn.technotes;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * <p>Title: App</p>
 * <p>Description: </p>
 *
 * @author DJL
 * @version 1.0.0
 * @date 2022/04/25 11:50
 */
public class App {

    public static void main(String[] args) {
        String url = "https://ip.taobao.com/outGetIpInfo?ip=123.160.173.34&accessKey=alibaba-inc";

        CloseableHttpClient client = HttpClients.custom().build();

        HttpGet request = new HttpGet(url);

        CloseableHttpResponse response = null;
        try {
            response = client.execute(request);

            HttpEntity entity = response.getEntity();

            String result = EntityUtils.toString(entity);
            System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != response) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
