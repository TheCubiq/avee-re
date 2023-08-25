package com.daaw;

import android.net.Uri;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class pp {
    public final Uri a;
    public final byte[] b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    public pp(Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    public pp(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public pp(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public pp(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public pp(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        s6.a(j >= 0);
        s6.a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        s6.a(z);
        this.a = uri;
        this.b = bArr;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
        this.g = i;
    }

    public boolean a(int i) {
        return (this.g & i) == i;
    }

    public pp b(long j) {
        long j2 = this.e;
        return c(j, j2 != -1 ? j2 - j : -1L);
    }

    public pp c(long j, long j2) {
        return (j == 0 && this.e == j2) ? this : new pp(this.a, this.b, this.c + j, this.d + j, j2, this.f, this.g);
    }

    public String toString() {
        return "DataSpec[" + this.a + ", " + Arrays.toString(this.b) + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + "]";
    }
}
