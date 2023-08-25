package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import com.daaw.c80;
import com.daaw.lc1;
import com.daaw.vf;
/* loaded from: classes.dex */
public final class zzce {
    public static zzce b;
    public String a;

    public static zzce zza() {
        if (b == null) {
            b = new zzce();
        }
        return b;
    }

    public final void zzb(Context context) {
        zze.zza("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.a)) {
            Context c = c80.c(context);
            if (!vf.a()) {
                if (c == null) {
                    c = null;
                }
                this.a = defaultUserAgent;
            }
            SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
            if (c == null) {
                putString.apply();
            } else {
                lc1.a(context, putString, "admob_user_agent");
            }
            this.a = defaultUserAgent;
        }
        zze.zza("User agent is updated.");
    }
}
