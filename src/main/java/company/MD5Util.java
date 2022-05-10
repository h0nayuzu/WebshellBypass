package company;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class MD5Util {
    //返回32位16进制MD5的前16位
    public static String Getmd5_32(String args){
        String str = args;
        byte[] digest = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            digest  = md5.digest(str.getBytes("utf-8"));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //16是表示转换为16进制数
        String md5Str = new BigInteger(1, digest).toString(16);
        // System.out.println("MD5: " + md5Str);
        String sub = md5Str.substring(0, 16);
        // System.out.println("MD5前16位: " + sub);
        String base_64_string = Base64.getEncoder().encodeToString(sub.getBytes(StandardCharsets.UTF_8));
        // System.out.println("MD5前16位base64: " + base_64_string);
        return md5Str;
    }
    public static String Getmd5_16(String args) {
        String MD5_32 = MD5Util.Getmd5_32(args);
        return MD5_32.substring(0, 16);
    }

    public static String Getmd5_16_to_base64(String args) {
        String MD5_16 = MD5Util.Getmd5_16(args);
        String MD5_16_base64 = Base64.getEncoder().encodeToString(MD5_16.getBytes(StandardCharsets.UTF_8));
        return MD5_16_base64;
    }

    public static void main(String[] args) {
        System.out.println(MD5Util.Getmd5_32("baihua666"));
        System.out.println(MD5Util.Getmd5_16("baihua666"));
        System.out.println(MD5Util.Getmd5_16_to_base64("baihua666"));

        Scanner pwd = new Scanner(System.in);
        String passwd = pwd.nextLine();
        if (passwd.isEmpty()) {
            System.out.println("kong");
        }

    }

}