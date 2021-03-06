package com.sgrain.boot.autoconfigure.httpclient.service;

import com.sgrain.boot.autoconfigure.httpclient.po.AsyncLogHttpClient;

public interface AsyncLogHttpClientService {
    /**
     * @Description 记录请求信息
     * @Version 1.0
     */
    void traceRequest(AsyncLogHttpClient asyncLogHttpClient);

    /**
     * @Description 记录响应信息
     * @Version 1.0
     */
    void traceResponse(AsyncLogHttpClient asyncLogHttpClient);
}
