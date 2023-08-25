package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.daaw.et3;
import com.daaw.k04;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class zzcb {
    @Deprecated
    public static Object zza(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            k04.zzh("Unexpected exception.", th);
            et3.m23193c(context).mo21236a(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
