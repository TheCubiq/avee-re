package com.daaw;

import java.net.HttpURLConnection;
import java.util.Objects;
/* loaded from: classes.dex */
public final class yu6 extends ru6 {

    /* renamed from: p */
    public iz6<Integer> f34104p;

    /* renamed from: q */
    public iz6<Integer> f34105q;

    /* renamed from: r */
    public xu6 f34106r;

    /* renamed from: s */
    public HttpURLConnection f34107s;

    public yu6() {
        this(new iz6() { // from class: com.daaw.vu6
            @Override // com.daaw.iz6
            public final Object zza() {
                return yu6.m3218n();
            }
        }, new iz6() { // from class: com.daaw.wu6
            @Override // com.daaw.iz6
            public final Object zza() {
                return yu6.m3217q();
            }
        }, null);
    }

    public yu6(iz6<Integer> iz6Var, iz6<Integer> iz6Var2, xu6 xu6Var) {
        this.f34104p = iz6Var;
        this.f34105q = iz6Var2;
        this.f34106r = xu6Var;
    }

    /* renamed from: K */
    public static void m3219K(HttpURLConnection httpURLConnection) {
        su6.m9849a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: n */
    public static /* synthetic */ Integer m3218n() {
        return -1;
    }

    /* renamed from: q */
    public static /* synthetic */ Integer m3217q() {
        return -1;
    }

    /* renamed from: D */
    public HttpURLConnection m3221D() {
        su6.m9848b(((Integer) this.f34104p.zza()).intValue(), ((Integer) this.f34105q.zza()).intValue());
        xu6 xu6Var = this.f34106r;
        Objects.requireNonNull(xu6Var);
        HttpURLConnection httpURLConnection = (HttpURLConnection) xu6Var.zza();
        this.f34107s = httpURLConnection;
        return httpURLConnection;
    }

    /* renamed from: E */
    public HttpURLConnection m3220E(xu6 xu6Var, final int i, final int i2) {
        this.f34104p = new iz6() { // from class: com.daaw.tu6
            @Override // com.daaw.iz6
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.f34105q = new iz6() { // from class: com.daaw.uu6
            @Override // com.daaw.iz6
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.f34106r = xu6Var;
        return m3221D();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m3219K(this.f34107s);
    }
}
