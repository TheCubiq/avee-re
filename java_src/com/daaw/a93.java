package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final class a93 {
    public static final SharedPreferences a(Context context) {
        return context.getSharedPreferences("google_ads_flags", 0);
    }
}
