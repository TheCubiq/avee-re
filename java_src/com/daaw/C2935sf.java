package com.daaw;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.daaw.sf */
/* loaded from: classes.dex */
public final class C2935sf {
    /* renamed from: a */
    public static byte[] m10430a(byte[] bArr) {
        return sq1.f26525a >= 27 ? bArr : sq1.m10041D(m10428c(sq1.m10000p(bArr)));
    }

    /* renamed from: b */
    public static byte[] m10429b(byte[] bArr) {
        if (sq1.f26525a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(sq1.m10000p(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(m10427d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(m10427d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return sq1.m10041D(sb.toString());
        } catch (JSONException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to adjust response data: ");
            sb2.append(sq1.m10000p(bArr));
            return bArr;
        }
    }

    /* renamed from: c */
    public static String m10428c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    /* renamed from: d */
    public static String m10427d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
