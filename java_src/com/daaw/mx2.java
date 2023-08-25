package com.daaw;

import android.net.Uri;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class mx2 {
    public final Uri a;
    public final long b;
    public final long c;
    public final long d;

    public mx2(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        az2.c(j >= 0);
        az2.c(j2 >= 0);
        if (j3 <= 0) {
            j3 = j3 == -1 ? -1L : j3;
            az2.c(z);
            this.a = uri;
            this.b = j;
            this.c = j2;
            this.d = j3;
        }
        z = true;
        az2.c(z);
        this.a = uri;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String arrays = Arrays.toString((byte[]) null);
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        return "DataSpec[" + valueOf + ", " + arrays + ", " + j + ", " + j2 + ", " + j3 + ", null, 0]";
    }
}
