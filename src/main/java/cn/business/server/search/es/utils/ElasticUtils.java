package cn.business.server.search.es.utils;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticUtils {

    @Value("${elastic.server}")
    private String server;
    @Value("${elastic.port}")
    private Integer port;
    @Value("${elastic.channel}")
    private String channel;

    @Bean
    public RestHighLevelClient getClient(){
        return new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost(server, port, channel)
                )
        );
    }

}
