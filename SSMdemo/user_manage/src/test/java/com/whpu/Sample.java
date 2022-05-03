package com.whpu;

import com.aliyun.dysmsapi20170525.Client;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.dysmsapi20170525.models.*;

/**
 * @author liusr
 * @create 2022-04-27
 * @package com.whpu
 */
public class Sample {
    public static void main(String[] args_) throws Exception {
        Config config = new Config()
                // 您的AccessKey ID
                .setAccessKeyId("accessKeyId")
                // 您的AccessKey Secret
                .setAccessKeySecret("accessKeySecret");
        // 访问的域名
        config.endpoint = "dysmsapi.aliyuncs.com";
        Client client = new Client(config);
        SendSmsRequest sendSmsRequest = new SendSmsRequest()
                .setSignName("阿里云短信测试")
                .setTemplateCode("SMS_154950909")
                .setPhoneNumbers("15997646731")
                .setTemplateParam("{\"code\":\"1234\"}");
        // 复制代码运行请自行打印 API 的返回值
        client.sendSms(sendSmsRequest);
    }
}
