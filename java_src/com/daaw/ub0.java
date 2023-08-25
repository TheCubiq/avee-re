package com.daaw;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
/* loaded from: classes2.dex */
public class ub0 {
    public final String a;
    public final Map<String, String> b;
    public final Map<String, String> c = new HashMap();

    public ub0(String str, Map<String, String> map) {
        this.a = str;
        this.b = map;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            java.lang.String r4 = "UTF-8"
            java.lang.String r5 = ""
            if (r3 == 0) goto L36
        L2b:
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r4)
            goto L37
        L36:
            r1 = r5
        L37:
            r0.append(r1)
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r3 = "&"
            r0.append(r3)
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            if (r3 == 0) goto L36
            goto L2b
        L5e:
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ub0.a(java.util.Map):java.lang.String");
    }

    public final String b(String str, Map<String, String> map) {
        String a = a(map);
        if (a.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + a;
        }
        if (!str.endsWith("&")) {
            a = "&" + a;
        }
        return str + a;
    }

    public wb0 c() {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String e = null;
        inputStream = null;
        try {
            String b = b(this.a, this.b);
            ml0.f().i("GET Request URL: " + b);
            httpsURLConnection = (HttpsURLConnection) new URL(b).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        e = e(inputStream2);
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
                return new wb0(responseCode, e);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public ub0 d(String str, String str2) {
        this.c.put(str, str2);
        return this;
    }

    public final String e(InputStream inputStream) {
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
