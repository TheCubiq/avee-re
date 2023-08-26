package com.google.firebase.crashlytics.internal.network;

import java.util.Collections;
import java.util.Map;
/* loaded from: classes2.dex */
public class HttpRequestFactory {
    public HttpRequest buildHttpRequest(HttpMethod httpMethod, String str) {
        return buildHttpRequest(httpMethod, str, Collections.emptyMap());
    }

    public HttpRequest buildHttpRequest(HttpMethod httpMethod, String str, Map<String, String> map) {
        return new HttpRequest(httpMethod, str, map);
    }
}
