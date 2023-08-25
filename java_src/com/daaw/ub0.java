package com.daaw;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
/* loaded from: classes2.dex */
public class ub0 {

    /* renamed from: a */
    public final String f28859a;

    /* renamed from: b */
    public final Map<String, String> f28860b;

    /* renamed from: c */
    public final Map<String, String> f28861c = new HashMap();

    public ub0(String str, Map<String, String> map) {
        this.f28859a = str;
        this.f28860b = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
        return r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (r1.getValue() != null) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
        r1 = java.net.URLEncoder.encode(r1.getValue(), "UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
        if (r7.hasNext() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
        r1 = r7.next();
        r0.append("&");
        r0.append(r1.getKey());
        r0.append("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
        if (r1.getValue() == null) goto L11;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x0036 -> B:6:0x0037). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005b -> B:4:0x002b). Please submit an issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m8357a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        sb.append(next.getKey());
        sb.append("=");
    }

    /* renamed from: b */
    public final String m8356b(String str, Map<String, String> map) {
        String m8357a = m8357a(map);
        if (m8357a.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + m8357a;
        }
        if (!str.endsWith("&")) {
            m8357a = "&" + m8357a;
        }
        return str + m8357a;
    }

    /* renamed from: c */
    public wb0 m8355c() {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String m8353e = null;
        inputStream = null;
        try {
            String m8356b = m8356b(this.f28859a, this.f28860b);
            ml0.m15976f().m15973i("GET Request URL: " + m8356b);
            httpsURLConnection = (HttpsURLConnection) new URL(m8356b).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.f28861c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        m8353e = m8353e(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new wb0(responseCode, m8353e);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    /* renamed from: d */
    public ub0 m8354d(String str, String str2) {
        this.f28861c.put(str, str2);
        return this;
    }

    /* renamed from: e */
    public final String m8353e(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }
}
