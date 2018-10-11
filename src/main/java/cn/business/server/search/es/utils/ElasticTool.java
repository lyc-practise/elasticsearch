package cn.business.server.search.es.utils;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;

public class ElasticTool {

    private static final String server = "192.168.150.129";
    private static final Integer port = 9200;
    private static final String channel = "http";

    public static RestHighLevelClient getClient(){
        return new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost(server, port, channel)
                )
        );
    }

    public static void main(String[] args) {
        RestHighLevelClient client = getClient();
        System.out.println(client);
        if (client != null){
            try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
