package cn.business.server.search.es.practise;

import org.apache.commons.codec.Charsets;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class CharPra {

    public static void main(String[] args) throws UnsupportedEncodingException {

//        String str = "abcd";

//        System.out.println(c.length() + " -- " + c.getBytes(Charsets.UTF_8).length + " -- "+charToStr(c.getBytes(Charsets.UTF_8)));
//        System.out.println(c.length() + " -- " + c.getBytes(Charsets.ISO_8859_1).length + " -- "+charToStr(c.getBytes(Charsets.ISO_8859_1)));
//        System.out.println(c.length() + " -- " + c.getBytes(Charsets.UTF_16).length);
//        System.out.println(c.length() + " -- " + c.getBytes(Charsets.US_ASCII).length);
//        System.out.println(new String(c.getBytes()));
//        System.out.println(new String(c.getChars();));


//        String str = "汉字";
//        System.out.println(str.getBytes("GBK").length);
//        System.out.println(arrryToString(str.getBytes(Charsets.UTF_8)));
//        System.out.println(arrryToString(str.getBytes(Charsets.UTF_16)));
//        System.out.println(arrryToString(str.getBytes(Charsets.toCharset("GBK"))));
//        String result = new String(str.getBytes(Charsets.toCharset("UTF-8")), Charsets.toCharset("GBK"));
//        System.out.println(result);


        String result = makeStr(Integer.MAX_VALUE);


    }


    private static char[] parseChar(byte[] bytes){
        char[] result = new char[bytes.length];
        for(int i = 0 ; i < bytes.length ; i++){
            result[i] = (char)bytes[i];
        }
        return result;
    }

    private static byte[] byteArray(String str){
        return byteArray(str, Charset.defaultCharset());
    }
    private static byte[] byteArray(String str, Charset charset){
        return str.getBytes(charset);
    }

    private static char[] charArray(String str){
        return str.toCharArray();
    }

    private static String arrryToString(char[] chars){
        String result = "";
        for(char c : chars){
            result += ("-" + c );
        }
        return result;
    }
    private static String arrryToString(byte[] bytes){
        String result = "";
        for(byte c : bytes){
            result +=  ("-" + c);
        }
        return result;
    }

    private static String makeStr(long length){
        StringBuilder str = new StringBuilder();
        for(long i = 0 ; i < length; i++){
            try{
                str.append(1);
            }catch (Exception e){
                System.out.println(i);
                throw e;
            }

        }
        return str.toString();
    }
}
