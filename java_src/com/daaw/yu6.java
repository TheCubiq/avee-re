package com.daaw;

import java.net.HttpURLConnection;
import java.util.Objects;
/* loaded from: classes.dex */
public final class yu6 extends ru6 {
    public iz6<Integer> p;
    public iz6<Integer> q;
    public xu6 r;
    public HttpURLConnection s;

    public yu6() {
        this(new iz6() { // from class: com.daaw.vu6
            @Override // com.daaw.iz6
            public final Object zza() {
                return yu6.n();
            }
        }, new iz6() { // from class: com.daaw.wu6
            @Override // com.daaw.iz6
            public final Object zza() {
                return yu6.q();
            }
        }, null);
    }

    public yu6(iz6<Integer> iz6Var, iz6<Integer> iz6Var2, xu6 xu6Var) {
        this.p = iz6Var;
        this.q = iz6Var2;
        this.r = xu6Var;
    }

    public static void K(HttpURLConnection httpURLConnection) {
        su6.a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public static /* synthetic */ Integer n() {
        return -1;
    }

    public static /* synthetic */ Integer q() {
        return -1;
    }

    public HttpURLConnection D() {
        su6.b(((Integer) this.p.zza()).intValue(), ((Integer) this.q.zza()).intValue());
        xu6 xu6Var = this.r;
        Objects.requireNonNull(xu6Var);
        HttpURLConnection httpURLConnection = (HttpURLConnection) xu6Var.zza();
        this.s = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection E(xu6 xu6Var, final int i, final int i2) {
        this.p = new iz6() { // from class: com.daaw.tu6
            @Override // com.daaw.iz6
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.q = new iz6() { // from class: com.daaw.uu6
            @Override // com.daaw.iz6
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.r = xu6Var;
        return D();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        K(this.s);
    }
}
