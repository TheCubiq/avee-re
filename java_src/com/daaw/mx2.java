package com.daaw;

import android.net.Uri;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class mx2 {

    /* renamed from: a */
    public final Uri f19263a;

    /* renamed from: b */
    public final long f19264b;

    /* renamed from: c */
    public final long f19265c;

    /* renamed from: d */
    public final long f19266d;

    public mx2(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        az2.m26585c(j >= 0);
        az2.m26585c(j2 >= 0);
        if (j3 <= 0) {
            j3 = j3 == -1 ? -1L : j3;
            az2.m26585c(z);
            this.f19263a = uri;
            this.f19264b = j;
            this.f19265c = j2;
            this.f19266d = j3;
        }
        z = true;
        az2.m26585c(z);
        this.f19263a = uri;
        this.f19264b = j;
        this.f19265c = j2;
        this.f19266d = j3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19263a);
        String arrays = Arrays.toString((byte[]) null);
        long j = this.f19264b;
        long j2 = this.f19265c;
        long j3 = this.f19266d;
        return "DataSpec[" + valueOf + ", " + arrays + ", " + j + ", " + j2 + ", " + j3 + ", null, 0]";
    }
}
