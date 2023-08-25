package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import com.daaw.C3327vf;
import com.daaw.c80;
import com.daaw.lc1;
/* loaded from: classes.dex */
public final class zzce {

    /* renamed from: b */
    public static zzce f36290b;

    /* renamed from: a */
    public String f36291a;

    public static zzce zza() {
        if (f36290b == null) {
            f36290b = new zzce();
        }
        return f36290b;
    }

    public final void zzb(Context context) {
        zze.zza("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.f36291a)) {
            Context m25525c = c80.m25525c(context);
            if (!C3327vf.m7198a()) {
                if (m25525c == null) {
                    m25525c = null;
                }
                this.f36291a = defaultUserAgent;
            }
            SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
            if (m25525c == null) {
                putString.apply();
            } else {
                lc1.m17052a(context, putString, "admob_user_agent");
            }
            this.f36291a = defaultUserAgent;
        }
        zze.zza("User agent is updated.");
    }
}
