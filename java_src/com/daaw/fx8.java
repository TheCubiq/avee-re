package com.daaw;

import android.util.Log;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class fx8 {

    /* renamed from: e */
    public static final fx8 f10085e = new fx8(true, 3, 1, null, null);

    /* renamed from: a */
    public final boolean f10086a;
    @Nullable

    /* renamed from: b */
    public final String f10087b;
    @Nullable

    /* renamed from: c */
    public final Throwable f10088c;

    /* renamed from: d */
    public final int f10089d;

    public fx8(boolean z, int i, int i2, @Nullable String str, @Nullable Throwable th) {
        this.f10086a = z;
        this.f10089d = i;
        this.f10087b = str;
        this.f10088c = th;
    }

    @Deprecated
    /* renamed from: b */
    public static fx8 m22144b() {
        return f10085e;
    }

    /* renamed from: c */
    public static fx8 m22143c(String str) {
        return new fx8(false, 1, 5, str, null);
    }

    /* renamed from: d */
    public static fx8 m22142d(String str, Throwable th) {
        return new fx8(false, 1, 5, str, th);
    }

    /* renamed from: f */
    public static fx8 m22140f(int i) {
        return new fx8(true, i, 1, null, null);
    }

    /* renamed from: g */
    public static fx8 m22139g(int i, int i2, String str, @Nullable Throwable th) {
        return new fx8(false, i, i2, str, th);
    }

    @Nullable
    /* renamed from: a */
    public String mo7701a() {
        return this.f10087b;
    }

    /* renamed from: e */
    public final void m22141e() {
        if (this.f10086a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.f10088c;
        mo7701a();
    }
}
