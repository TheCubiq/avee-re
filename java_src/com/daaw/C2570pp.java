package com.daaw;

import android.net.Uri;
import java.util.Arrays;
/* renamed from: com.daaw.pp */
/* loaded from: classes.dex */
public final class C2570pp {

    /* renamed from: a */
    public final Uri f23115a;

    /* renamed from: b */
    public final byte[] f23116b;

    /* renamed from: c */
    public final long f23117c;

    /* renamed from: d */
    public final long f23118d;

    /* renamed from: e */
    public final long f23119e;

    /* renamed from: f */
    public final String f23120f;

    /* renamed from: g */
    public final int f23121g;

    public C2570pp(Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    public C2570pp(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public C2570pp(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public C2570pp(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public C2570pp(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        C2914s6.m10690a(j >= 0);
        C2914s6.m10690a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C2914s6.m10690a(z);
        this.f23115a = uri;
        this.f23116b = bArr;
        this.f23117c = j;
        this.f23118d = j2;
        this.f23119e = j3;
        this.f23120f = str;
        this.f23121g = i;
    }

    /* renamed from: a */
    public boolean m13249a(int i) {
        return (this.f23121g & i) == i;
    }

    /* renamed from: b */
    public C2570pp m13248b(long j) {
        long j2 = this.f23119e;
        return m13247c(j, j2 != -1 ? j2 - j : -1L);
    }

    /* renamed from: c */
    public C2570pp m13247c(long j, long j2) {
        return (j == 0 && this.f23119e == j2) ? this : new C2570pp(this.f23115a, this.f23116b, this.f23117c + j, this.f23118d + j, j2, this.f23120f, this.f23121g);
    }

    public String toString() {
        return "DataSpec[" + this.f23115a + ", " + Arrays.toString(this.f23116b) + ", " + this.f23117c + ", " + this.f23118d + ", " + this.f23119e + ", " + this.f23120f + ", " + this.f23121g + "]";
    }
}
