package com.daaw;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class gn2 {

    /* renamed from: e */
    public static final String[] f11470e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a */
    public long f11471a = 0;

    /* renamed from: b */
    public long f11472b = 0;

    /* renamed from: c */
    public long f11473c = -1;

    /* renamed from: d */
    public boolean f11474d = false;

    public gn2(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new fn2(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    /* renamed from: d */
    public static gn2 m21437d(Context context, Executor executor) {
        return new gn2(context, executor, f11470e);
    }

    /* renamed from: b */
    public final long m21439b() {
        long j = this.f11473c;
        this.f11473c = -1L;
        return j;
    }

    /* renamed from: c */
    public final long m21438c() {
        if (this.f11474d) {
            return this.f11472b - this.f11471a;
        }
        return -1L;
    }

    /* renamed from: h */
    public final void m21433h() {
        if (this.f11474d) {
            this.f11472b = System.currentTimeMillis();
        }
    }
}
