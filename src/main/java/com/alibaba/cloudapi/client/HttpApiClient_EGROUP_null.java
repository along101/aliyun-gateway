package com.alibaba.cloudapi.client;

import com.alibaba.cloudapi.sdk.client.ApacheHttpClient;
import com.alibaba.cloudapi.sdk.enums.HttpMethod;
import com.alibaba.cloudapi.sdk.enums.ParamPosition;
import com.alibaba.cloudapi.sdk.enums.Scheme;
import com.alibaba.cloudapi.sdk.model.ApiCallback;
import com.alibaba.cloudapi.sdk.model.ApiRequest;
import com.alibaba.cloudapi.sdk.model.HttpClientBuilderParams;

import static com.alibaba.cloudapi.client.Demo_EGROUP_null.HOST;
import static com.alibaba.cloudapi.client.Demo_EGROUP_null.path;


public class HttpApiClient_EGROUP_null extends ApacheHttpClient {
    static HttpApiClient_EGROUP_null instance = new HttpApiClient_EGROUP_null();

    public static HttpApiClient_EGROUP_null getInstance() {
        return instance;
    }

    @Override
    public void init(HttpClientBuilderParams httpClientBuilderParams) {
        httpClientBuilderParams.setScheme(Scheme.HTTP);
        httpClientBuilderParams.setHost(HOST);
        super.init(httpClientBuilderParams);
    }


    public void EAPI_1664081855183111_testlr(ApiCallback callback, String authorization, byte[] body) {
        ApiRequest request = new ApiRequest(HttpMethod.POST_BODY, path, body);
        request.addParam("Authorization", authorization, ParamPosition.HEAD, true);
        sendAsyncRequest(request, callback);
    }
}