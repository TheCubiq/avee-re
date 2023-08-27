package com.google.firebase.crashlytics.internal.network;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
/* loaded from: classes2.dex */
public class HttpRequest {
    private static final OkHttpClient CLIENT = new OkHttpClient().newBuilder().callTimeout(10000, TimeUnit.MILLISECONDS).build();
    private static final int DEFAULT_TIMEOUT_MS = 10000;
    private MultipartBody.Builder bodyBuilder = null;
    private final Map<String, String> headers = new HashMap();
    private final HttpMethod method;
    private final Map<String, String> queryParams;
    private final String url;

    public HttpRequest(HttpMethod httpMethod, String str, Map<String, String> map) {
        this.method = httpMethod;
        this.url = str;
        this.queryParams = map;
    }

    public HttpRequest header(String str, String str2) {
        this.headers.put(str, str2);
        return this;
    }

    public HttpRequest header(Map.Entry<String, String> entry) {
        return header(entry.getKey(), entry.getValue());
    }

    private MultipartBody.Builder getOrCreateBodyBuilder() {
        if (this.bodyBuilder == null) {
            this.bodyBuilder = new MultipartBody.Builder().setType(MultipartBody.FORM);
        }
        return this.bodyBuilder;
    }

    public HttpRequest part(String str, String str2) {
        this.bodyBuilder = getOrCreateBodyBuilder().addFormDataPart(str, str2);
        return this;
    }

    public HttpRequest part(String str, String str2, String str3, File file) {
        this.bodyBuilder = getOrCreateBodyBuilder().addFormDataPart(str, str2, RequestBody.create(MediaType.parse(str3), file));
        return this;
    }

    public String method() {
        return this.method.name();
    }

    private Request build() {
        Request.Builder cacheControl = new Request.Builder().cacheControl(new CacheControl.Builder().noCache().build());
        HttpUrl.Builder newBuilder = HttpUrl.parse(this.url).newBuilder();
        for (Map.Entry<String, String> entry : this.queryParams.entrySet()) {
            newBuilder = newBuilder.addEncodedQueryParameter(entry.getKey(), entry.getValue());
        }
        Request.Builder url = cacheControl.url(newBuilder.build());
        for (Map.Entry<String, String> entry2 : this.headers.entrySet()) {
            url = url.header(entry2.getKey(), entry2.getValue());
        }
        MultipartBody.Builder builder = this.bodyBuilder;
        return url.method(this.method.name(), builder == null ? null : builder.build()).build();
    }

    public HttpResponse execute() throws IOException {
        return HttpResponse.create(CLIENT.newCall(build()).execute());
    }
}
