package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.WindowManager;
@TargetApi(16)
/* loaded from: classes.dex */
public final class c03 {

    /* renamed from: a */
    public final b03 f5343a;

    /* renamed from: b */
    public final boolean f5344b;

    /* renamed from: c */
    public final long f5345c;

    /* renamed from: d */
    public final long f5346d;

    /* renamed from: e */
    public long f5347e;

    /* renamed from: f */
    public long f5348f;

    /* renamed from: g */
    public long f5349g;

    /* renamed from: h */
    public boolean f5350h;

    /* renamed from: i */
    public long f5351i;

    /* renamed from: j */
    public long f5352j;

    /* renamed from: k */
    public long f5353k;

    public c03(double d) {
        long j;
        boolean z = d != -1.0d;
        this.f5344b = z;
        if (z) {
            this.f5343a = b03.m26528a();
            long j2 = (long) (1.0E9d / d);
            this.f5345c = j2;
            j = (j2 * 80) / 100;
        } else {
            this.f5343a = null;
            j = -1;
            this.f5345c = -1L;
        }
        this.f5346d = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c03(Context context) {
        this(r3.getDefaultDisplay() != null ? r3.getDefaultDisplay().getRefreshRate() : -1.0d);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (m25694d(r0, r14) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m25697a(long j, long j2) {
        long j3;
        long j4;
        b03 b03Var;
        long j5;
        long j6 = 1000 * j;
        if (this.f5350h) {
            if (j != this.f5347e) {
                this.f5353k++;
                this.f5348f = this.f5349g;
            }
            long j7 = this.f5353k;
            if (j7 >= 6) {
                j4 = this.f5348f + ((j6 - this.f5352j) / j7);
                if (!m25694d(j4, j2)) {
                    j3 = (this.f5351i + j4) - this.f5352j;
                    if (!this.f5350h) {
                        this.f5352j = j6;
                        this.f5351i = j2;
                        this.f5353k = 0L;
                        this.f5350h = true;
                    }
                    this.f5347e = j;
                    this.f5349g = j4;
                    b03Var = this.f5343a;
                    if (b03Var != null || b03Var.f4207p == 0) {
                        return j3;
                    }
                    long j8 = this.f5343a.f4207p;
                    long j9 = this.f5345c;
                    long j10 = j8 + (((j3 - j8) / j9) * j9);
                    if (j3 <= j10) {
                        j5 = j10 - j9;
                    } else {
                        j10 = j9 + j10;
                        j5 = j10;
                    }
                    if (j10 - j3 >= j3 - j5) {
                        j10 = j5;
                    }
                    return j10 - this.f5346d;
                }
            }
            this.f5350h = false;
        }
        j3 = j2;
        j4 = j6;
        if (!this.f5350h) {
        }
        this.f5347e = j;
        this.f5349g = j4;
        b03Var = this.f5343a;
        if (b03Var != null) {
        }
        return j3;
    }

    /* renamed from: b */
    public final void m25696b() {
        if (this.f5344b) {
            this.f5343a.m26526c();
        }
    }

    /* renamed from: c */
    public final void m25695c() {
        this.f5350h = false;
        if (this.f5344b) {
            this.f5343a.m26527b();
        }
    }

    /* renamed from: d */
    public final boolean m25694d(long j, long j2) {
        return Math.abs((j2 - this.f5351i) - (j - this.f5352j)) > 20000000;
    }
}
