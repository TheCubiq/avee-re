package com.daaw;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class pa6 {
    public final Uri a;
    public final int b;
    public final byte[] c;
    public final Map d;
    @Deprecated
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    static {
        k63.b("media3.datasource");
    }

    public pa6(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        long j4 = j + j2;
        boolean z = false;
        uo4.d(j4 >= 0);
        uo4.d(j2 >= 0);
        long j5 = -1;
        if (j3 > 0) {
            j5 = j3;
        } else if (j3 != -1) {
            j5 = j3;
            uo4.d(z);
            this.a = uri;
            this.b = 1;
            this.c = null;
            this.d = Collections.unmodifiableMap(new HashMap(map));
            this.f = j2;
            this.e = j4;
            this.g = j5;
            this.h = null;
            this.i = i2;
        }
        z = true;
        uo4.d(z);
        this.a = uri;
        this.b = 1;
        this.c = null;
        this.d = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.e = j4;
        this.g = j5;
        this.h = null;
        this.i = i2;
    }

    @Deprecated
    public pa6(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        this(uri, j - j2, 1, null, Collections.emptyMap(), j2, j3, null, i, null);
    }

    public static String a(int i) {
        return "GET";
    }

    public final boolean b(int i) {
        return (this.i & i) == i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.f;
        long j2 = this.g;
        int i = this.i;
        return "DataSpec[" + a(1) + " " + valueOf + ", " + j + ", " + j2 + ", null, " + i + "]";
    }
}
