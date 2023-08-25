package com.google.android.gms.ads.query;

import com.daaw.k04;
import org.json.JSONException;
import org.json.JSONObject;
@Deprecated
/* loaded from: classes.dex */
public class AdInfo {
    public final QueryInfo a;
    public final String b;

    public AdInfo(QueryInfo queryInfo, String str) {
        this.a = queryInfo;
        this.b = str;
    }

    public static String getRequestId(String str) {
        String str2;
        if (str == null) {
            str2 = "adString passed to AdInfo.getRequestId() cannot be null. Returning empty string.";
        } else {
            try {
                return new JSONObject(str).optString("request_id", "");
            } catch (JSONException unused) {
                str2 = "Invalid adString passed to AdInfo.getRequestId(). Returning empty string.";
            }
        }
        k04.zzj(str2);
        return "";
    }

    public String getAdString() {
        return this.b;
    }

    public QueryInfo getQueryInfo() {
        return this.a;
    }
}
