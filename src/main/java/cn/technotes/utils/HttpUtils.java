package cn.technotes.utils;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * <p>Title: HttpUtils</p>
 * <p>Description: </p>
 *
 * @author DJL
 * @version 1.0.0
 * @date 2022/04/25 11:44
 */
public class HttpUtils {

    public static HttpClient createHttpClient() {
        return HttpClients.custom().build();
    }

}
