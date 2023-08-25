package com.daaw;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class pa6 {

    /* renamed from: a */
    public final Uri f22769a;

    /* renamed from: b */
    public final int f22770b;

    /* renamed from: c */
    public final byte[] f22771c;

    /* renamed from: d */
    public final Map f22772d;
    @Deprecated

    /* renamed from: e */
    public final long f22773e;

    /* renamed from: f */
    public final long f22774f;

    /* renamed from: g */
    public final long f22775g;

    /* renamed from: h */
    public final String f22776h;

    /* renamed from: i */
    public final int f22777i;

    static {
        k63.m18024b("media3.datasource");
    }

    public pa6(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        long j4 = j + j2;
        boolean z = false;
        uo4.m7874d(j4 >= 0);
        uo4.m7874d(j2 >= 0);
        long j5 = -1;
        if (j3 > 0) {
            j5 = j3;
        } else if (j3 != -1) {
            j5 = j3;
            uo4.m7874d(z);
            this.f22769a = uri;
            this.f22770b = 1;
            this.f22771c = null;
            this.f22772d = Collections.unmodifiableMap(new HashMap(map));
            this.f22774f = j2;
            this.f22773e = j4;
            this.f22775g = j5;
            this.f22776h = null;
            this.f22777i = i2;
        }
        z = true;
        uo4.m7874d(z);
        this.f22769a = uri;
        this.f22770b = 1;
        this.f22771c = null;
        this.f22772d = Collections.unmodifiableMap(new HashMap(map));
        this.f22774f = j2;
        this.f22773e = j4;
        this.f22775g = j5;
        this.f22776h = null;
        this.f22777i = i2;
    }

    @Deprecated
    public pa6(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        this(uri, j - j2, 1, null, Collections.emptyMap(), j2, j3, null, i, null);
    }

    /* renamed from: a */
    public static String m13535a(int i) {
        return "GET";
    }

    /* renamed from: b */
    public final boolean m13534b(int i) {
        return (this.f22777i & i) == i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f22769a);
        long j = this.f22774f;
        long j2 = this.f22775g;
        int i = this.f22777i;
        return "DataSpec[" + m13535a(1) + " " + valueOf + ", " + j + ", " + j2 + ", null, " + i + "]";
    }
}
