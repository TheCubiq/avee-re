package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzem {
    public final String a;
    public final Bundle b;
    public final String c;

    public zzem(String str, Bundle bundle, String str2) {
        this.a = str;
        this.b = bundle;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final Bundle zza() {
        return this.b;
    }

    public final String zzb() {
        return this.a;
    }

    public final String zzd() {
        if (TextUtils.isEmpty(this.c)) {
            return "";
        }
        try {
            return new JSONObject(this.c).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }
}
