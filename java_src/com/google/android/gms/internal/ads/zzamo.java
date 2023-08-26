package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
final class zzamo implements Callable<String> {
    private final /* synthetic */ Context val$context;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamo(zzamn zzamnVar, Context context) {
        this.val$context = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        SharedPreferences sharedPreferences = this.val$context.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (!TextUtils.isEmpty(string)) {
            zzakb.v("User agent is already initialized on Google Play Services.");
            return string;
        }
        zzakb.v("User agent is not initialized on Google Play Services. Initializing.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this.val$context);
        SharedPreferencesUtils.publishWorldReadableSharedPreferences(this.val$context, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
        return defaultUserAgent;
    }
}
