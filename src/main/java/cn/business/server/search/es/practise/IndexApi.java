package cn.business.server.search.es.practise;

import cn.business.server.search.es.model.Posts;

public class IndexApi {

    public static void createPosts(){

        Posts posts = new Posts(){
            {
                setUser("kimchty");
                setPostDate(JSON.toJSONString()).;
            }
        }
    }


    public static void main(String[] args) {

    }



}
