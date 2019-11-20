package main.java.com.itcom.util;

/**
 * @author Zhangkj
 * @date 2019-04-25-21:36
 */

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import org.json.JSONException;

import java.io.IOException;

public class SMSUtil {
        public static String sendSMS(String phoneNumber,String code) {
            String reStr = ""; //定义返回值
            // 短信应用SDK AppID   // 1400开头
            int appid = 1400193243;
            // 短信应用SDK AppKey
            String appkey = "97b2c3d4727e73d0c2a1754e93dcacd3";
            // 短信模板ID，需要在短信应用中申请
            int templateId =  292945 ;
            // 签名，使用的是`签名内容`，而不是`签名ID`
            String smsSign = "";
            try {
                //参数，一定要对应短信模板中的参数顺序和个数，
                String[] params = {code,"2"};
                //创建ssender对象
                SmsSingleSender ssender = new SmsSingleSender(appid, appkey);
                //发送
                SmsSingleSenderResult result = ssender.sendWithParam("86", phoneNumber,templateId, params, smsSign, "", "");
                // 签名参数未提供或者为空时，会使用默认签名发送短信
                System.out.println(result.toString());
                if(result.result==0){
                    reStr = "success";
                }else{
                    reStr = "error";
                }
            } catch (HTTPException e) {
                // HTTP响应码错误
                e.printStackTrace();
            } catch (JSONException e) {
                // json解析错误
                e.printStackTrace();
            } catch (IOException e) {
                // 网络IO错误
                e.printStackTrace();
            }catch (Exception e) {
                // 网络IO错误
                e.printStackTrace();
            }
            return reStr;
        }


    public static void main(String[] args) {
        System.out.println((int)(Math.random()));
//        String code = SMSUtil.codeing();
//        String result = SMSUtil.sendSMS("15991630732", code);

    }

        public static String codeing(){
            System.out.println((int)((Math.random()*9+1)*100000));

            int coder = (int)((Math.random()*9+1)*100000);
            String code = coder+"";

            return code;

        }
    }
