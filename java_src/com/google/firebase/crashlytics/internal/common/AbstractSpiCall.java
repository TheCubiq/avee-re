package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.network.HttpMethod;
import com.google.firebase.crashlytics.internal.network.HttpRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public abstract class AbstractSpiCall {
    public static final String ACCEPT_JSON_VALUE = "application/json";
    public static final String ANDROID_CLIENT_TYPE = "android";
    public static final String CRASHLYTICS_USER_AGENT = "Crashlytics Android SDK/";
    public static final String HEADER_ACCEPT = "Accept";
    public static final String HEADER_CLIENT_TYPE = "X-CRASHLYTICS-API-CLIENT-TYPE";
    public static final String HEADER_CLIENT_VERSION = "X-CRASHLYTICS-API-CLIENT-VERSION";
    public static final String HEADER_DEVELOPER_TOKEN = "X-CRASHLYTICS-DEVELOPER-TOKEN";
    public static final String HEADER_GOOGLE_APP_ID = "X-CRASHLYTICS-GOOGLE-APP-ID";
    public static final String HEADER_ORG_ID = "X-CRASHLYTICS-ORG-ID";
    public static final String HEADER_REQUEST_ID = "X-REQUEST-ID";
    public static final String HEADER_USER_AGENT = "User-Agent";
    private static final Pattern PROTOCOL_AND_HOST_PATTERN = Pattern.compile("http(s?)://[^\\/]+", 2);
    private final HttpMethod method;
    private final String protocolAndHostOverride;
    private final HttpRequestFactory requestFactory;
    private final String url;

    public AbstractSpiCall(String str, String str2, HttpRequestFactory httpRequestFactory, HttpMethod httpMethod) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        if (httpRequestFactory == null) {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
        this.protocolAndHostOverride = str;
        this.url = overrideProtocolAndHost(str2);
        this.requestFactory = httpRequestFactory;
        this.method = httpMethod;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getUrl() {
        return this.url;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public HttpRequest getHttpRequest() {
        return getHttpRequest(Collections.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public HttpRequest getHttpRequest(Map<String, String> map) {
        HttpRequest buildHttpRequest = this.requestFactory.buildHttpRequest(this.method, getUrl(), map);
        return buildHttpRequest.header(HEADER_USER_AGENT, CRASHLYTICS_USER_AGENT + CrashlyticsCore.getVersion()).header(HEADER_DEVELOPER_TOKEN, "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    private String overrideProtocolAndHost(String str) {
        return !CommonUtils.isNullOrEmpty(this.protocolAndHostOverride) ? PROTOCOL_AND_HOST_PATTERN.matcher(str).replaceFirst(this.protocolAndHostOverride) : str;
    }
}
