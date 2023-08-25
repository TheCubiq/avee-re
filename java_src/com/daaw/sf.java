package com.daaw;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class sf {
    public static byte[] a(byte[] bArr) {
        return sq1.a >= 27 ? bArr : sq1.D(c(sq1.p(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (sq1.a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(sq1.p(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return sq1.D(sb.toString());
        } catch (JSONException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to adjust response data: ");
            sb2.append(sq1.p(bArr));
            return bArr;
        }
    }

    public static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
