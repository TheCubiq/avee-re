package com.google.android.gms.ads.query;

import com.daaw.k04;
import org.json.JSONException;
import org.json.JSONObject;
@Deprecated
/* loaded from: classes.dex */
public class AdInfo {

    /* renamed from: a */
    public final QueryInfo f36537a;

    /* renamed from: b */
    public final String f36538b;

    public AdInfo(QueryInfo queryInfo, String str) {
        this.f36537a = queryInfo;
        this.f36538b = str;
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
        return this.f36538b;
    }

    public QueryInfo getQueryInfo() {
        return this.f36537a;
    }
}
