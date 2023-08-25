package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzem {

    /* renamed from: a */
    public final String f36173a;

    /* renamed from: b */
    public final Bundle f36174b;

    /* renamed from: c */
    public final String f36175c;

    public zzem(String str, Bundle bundle, String str2) {
        this.f36173a = str;
        this.f36174b = bundle;
        this.f36175c = str2;
    }

    /* renamed from: a */
    public final String m1395a() {
        return this.f36175c;
    }

    public final Bundle zza() {
        return this.f36174b;
    }

    public final String zzb() {
        return this.f36173a;
    }

    public final String zzd() {
        if (TextUtils.isEmpty(this.f36175c)) {
            return "";
        }
        try {
            return new JSONObject(this.f36175c).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }
}
