package com.example.demo;

import com.sun.deploy.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class Test {
    @Autowired
    private Environment env;
    @RequestMapping("test")
    @ResponseBody
    public String index(){

        for(int i=0;i<10;i++){
            new Thread(){
			public void run(){
				try {
                  doTask();
				}catch (Exception e){
					e.printStackTrace();
				}
			}
		}.start();
        }
        return "hello world" ;
    }





    @RequestMapping("test2")
    @ResponseBody
    public void index2()throws Exception{

        for(int i=0;i<4;i++){
            new Thread(){
                public void run(){
                    try {
                        doTask2();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
    public void doTask2 ()throws Exception{
        Long startTime=Long.parseLong("0");
        String url="http://localhost:8080/test3";
        URL restURL = new URL(url);
        BufferedReader br =null;
        String line;
        StringBuilder sb = null;
        String result="";
        while(true){
            HttpURLConnection conn = (HttpURLConnection) restURL.openConnection();
            startTime=System.currentTimeMillis();
            conn.setRequestMethod("GET");
            conn.setDoOutput(true);
            conn.setAllowUserInteraction(false);
            sb = new StringBuilder();
            br =new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            br.close();// 关闭流
            conn.disconnect();
            Long endTime=System.currentTimeMillis();
            System.out.println("调用接口成功，总耗时："+(endTime-startTime));
        }
    }

    @RequestMapping("test3")
    @ResponseBody
    public String index3(){
        return "klafaskfakfkasjfasjkfalksflkjewlrkjfjsoidjfisajfkasjlfjasidf" ;
    }


    @RequestMapping("test4")
    @ResponseBody
    public void index5(){
        for(int i=0;1<400;i++){
            new Thread(){
                public void run(){
                    try {
                        index4();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
    public String index4(){
        List<String> aaaaa=new ArrayList<String>();
        List<String> aaaaa1=new ArrayList<String>();
        List<String> aaaaa2=new ArrayList<String>();
        List<String> aaaaa3=new ArrayList<String>();
        List<String> aaaaa4=new ArrayList<String>();
        List<String> aaaaa5=new ArrayList<String>();
        List<String> aaaaa6=new ArrayList<String>();
        List<String> aaaaa7=new ArrayList<String>();
        List<String> aaaaa8=new ArrayList<String>();
        List<String> aaaaa9=new ArrayList<String>();
        List<String> aaaaa10=new ArrayList<String>();
        while (true){
            String aaa=new String("aaaihuishafhsfshadkfhkjsadhfkjahjkfashdjkfhajsdhfkjsh");
            String bbb="hihiuhiufasuhfiashfhhsdfh";
            String ccc="hihiuhiufasuhfiashfhhsdfh";
            String ddd="hihiuhiufasuhfiashfhhsdfh";
            StringBuilder sb = new StringBuilder();
            aaaaa.add(aaa);
            aaaaa.add(bbb);
            aaaaa.add(ccc);
            aaaaa.add(ddd);

            aaaaa2.add(aaa);
            aaaaa2.add(bbb);
            aaaaa2.add(ccc);
            aaaaa2.add(ddd);

            aaaaa3.add(aaa);
            aaaaa3.add(bbb);
            aaaaa3.add(ccc);
            aaaaa3.add(ddd);

            aaaaa4.add(aaa);
            aaaaa4.add(bbb);
            aaaaa4.add(ccc);
            aaaaa4.add(ddd);

            aaaaa5.add(aaa);
            aaaaa5.add(bbb);
            aaaaa5.add(ccc);
            aaaaa5.add(ddd);

            aaaaa6.add(aaa);
            aaaaa6.add(bbb);
            aaaaa6.add(ccc);
            aaaaa6.add(ddd);

            aaaaa7.add(aaa);
            aaaaa7.add(bbb);
            aaaaa7.add(ccc);
            aaaaa7.add(ddd);

            aaaaa8.add(aaa);
            aaaaa8.add(bbb);
            aaaaa8.add(ccc);
            aaaaa8.add(ddd);

            aaaaa9.addAll(aaaaa);
            aaaaa9.addAll(aaaaa2);
            aaaaa9.addAll(aaaaa3);
            aaaaa9.addAll(aaaaa4);
            aaaaa9.addAll(aaaaa5);
            aaaaa9.addAll(aaaaa6);
            aaaaa9.addAll(aaaaa7);
            aaaaa9.addAll(aaaaa8);
            System.out.println(aaaaa9.size());
        }
//        return "klafaskfakfkasjfasjkfalksflkjewlrkjfjsoidjfisajfkasjlfjasidf" ;
    }
    @RequestMapping("test5")
    @ResponseBody
    public String test5(){

        return "klafaskfakfkasjfasjkfalksflkjewlrkjfjsoidjfisajfkasjlfjasidf" ;
    }
    public void doTask(){
        int x=0;
        while (1==1){
            x=(int)Math.random()*(int)Math.random();
        }
//        System.out.println(z);
    }


}
