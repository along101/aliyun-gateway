package com.alibaba.cloudapi.client;

import com.alibaba.cloudapi.sdk.constant.SdkConstant;
import com.alibaba.cloudapi.sdk.model.ApiCallback;
import com.alibaba.cloudapi.sdk.model.ApiRequest;
import com.alibaba.cloudapi.sdk.model.ApiResponse;
import com.alibaba.cloudapi.sdk.model.HttpClientBuilderParams;

import java.io.IOException;
import java.nio.charset.Charset;


public class Demo_EGROUP_null {


    static String appKey = "25351297";
    static String appSecret = "9aa71a150a16cc6b6beb4a35fba97fe2";
    static String authorization = "N2FlNWFlY2U2N2Y1ZDNkMmY4NjNiYWZiNjJmZjQ1ZDJmZGRiNjkyZQ==";
    static String path = "/EAPI_1433282027106661_test12";
    static String body = "[{\"sex\":0,\"cp\":0,\"fbs\":0,\"restecg\":0,\"exang\":0,\"slop\":0,\"thal\":0,\"age\":0,\"trestbps\":0,\"chol\":0,\"thalach\":0,\"oldpeak\":0,\"ca\":0}]";
    public final static String HOST = "b6ed9bdb4a14444fb634436614c0609f-cn-shanghai.alicloudapi.com";

    static {
        //HTTP Client init
        HttpClientBuilderParams httpParam = new HttpClientBuilderParams();
        httpParam.setAppKey(appKey);
        httpParam.setAppSecret(appSecret);
        com.alibaba.cloudapi.client.HttpApiClient_EGROUP_null.getInstance().init(httpParam);
    }

    public static void main(String[] args) {
        com.alibaba.cloudapi.client.HttpApiClient_EGROUP_null.getInstance().EAPI_1664081855183111_testlr(new ApiCallback() {
            @Override
            public void onFailure(ApiRequest request, Exception e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(ApiRequest request, ApiResponse response) {
                try {
                    System.out.println(getResultString(response));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }, authorization, body.getBytes(Charset.forName("UTF-8")));
    }


    private static String getResultString(ApiResponse response) throws IOException {
        StringBuilder result = new StringBuilder();
        result.append("Response from backend server").append(SdkConstant.CLOUDAPI_LF).append(SdkConstant.CLOUDAPI_LF);
        result.append("ResultCode:").append(SdkConstant.CLOUDAPI_LF).append(response.getCode()).append(SdkConstant.CLOUDAPI_LF).append(SdkConstant.CLOUDAPI_LF);
        if (response.getCode() != 200) {
            result.append("Error description:").append(response.getHeaders().get("X-Ca-Error-Message")).append(SdkConstant.CLOUDAPI_LF).append(SdkConstant.CLOUDAPI_LF);
        }

        result.append("ResultBody:").append(SdkConstant.CLOUDAPI_LF).append(new String(response.getBody(), SdkConstant.CLOUDAPI_ENCODING));

        return result.toString();
    }
}
