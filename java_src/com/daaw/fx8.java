package com.daaw;

import android.util.Log;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class fx8 {
    public static final fx8 e = new fx8(true, 3, 1, null, null);
    public final boolean a;
    @Nullable
    public final String b;
    @Nullable
    public final Throwable c;
    public final int d;

    public fx8(boolean z, int i, int i2, @Nullable String str, @Nullable Throwable th) {
        this.a = z;
        this.d = i;
        this.b = str;
        this.c = th;
    }

    @Deprecated
    public static fx8 b() {
        return e;
    }

    public static fx8 c(String str) {
        return new fx8(false, 1, 5, str, null);
    }

    public static fx8 d(String str, Throwable th) {
        return new fx8(false, 1, 5, str, th);
    }

    public static fx8 f(int i) {
        return new fx8(true, i, 1, null, null);
    }

    public static fx8 g(int i, int i2, String str, @Nullable Throwable th) {
        return new fx8(false, i, i2, str, th);
    }

    @Nullable
    public String a() {
        return this.b;
    }

    public final void e() {
        if (this.a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.c;
        a();
    }
}
