package cn.business.server.search.es.practise;

import cn.business.server.search.es.model.Posts;

import java.util.Date;

public class IndexApi {

    public static void createPosts(){

        Posts posts = new Posts(){
            {
                setUser("kimchty");
                setPostDate(new Date());
            }
        };
    }


    public static void main(String[] args) {

    }



}
