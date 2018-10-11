package cn.business.server.search.es.utils;

import java.util.Collection;

public class Utils {

    public static boolean isEmpty(String text){
        return text == null || text.length() == 0 || "null".equalsIgnoreCase(text);
    }

    public static boolean isEmpty(Collection coll){
        return coll == null || coll.size() == 0;
    }
}
