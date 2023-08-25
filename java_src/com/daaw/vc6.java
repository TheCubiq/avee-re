package com.daaw;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class vc6 implements p46 {
    public final Context a;
    public final List b = new ArrayList();
    public final p46 c;
    public p46 d;
    public p46 e;
    public p46 f;
    public p46 g;
    public p46 h;
    public p46 i;
    public p46 j;
    public p46 k;

    public vc6(Context context, p46 p46Var) {
        this.a = context.getApplicationContext();
        this.c = p46Var;
    }

    public static final void m(p46 p46Var, qz6 qz6Var) {
        if (p46Var != null) {
            p46Var.d(qz6Var);
        }
    }

    @Override // com.daaw.xp8
    public final int a(byte[] bArr, int i, int i2) {
        p46 p46Var = this.k;
        Objects.requireNonNull(p46Var);
        return p46Var.a(bArr, i, i2);
    }

    @Override // com.daaw.p46
    public final void d(qz6 qz6Var) {
        Objects.requireNonNull(qz6Var);
        this.c.d(qz6Var);
        this.b.add(qz6Var);
        m(this.d, qz6Var);
        m(this.e, qz6Var);
        m(this.f, qz6Var);
        m(this.g, qz6Var);
        m(this.h, qz6Var);
        m(this.i, qz6Var);
        m(this.j, qz6Var);
    }

    @Override // com.daaw.p46
    public final long g(pa6 pa6Var) {
        p46 p46Var;
        uo4.f(this.k == null);
        String scheme = pa6Var.a.getScheme();
        if (it5.w(pa6Var.a)) {
            String path = pa6Var.a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    um6 um6Var = new um6();
                    this.d = um6Var;
                    l(um6Var);
                }
                p46Var = this.d;
                this.k = p46Var;
                return this.k.g(pa6Var);
            }
            p46Var = k();
            this.k = p46Var;
            return this.k.g(pa6Var);
        }
        if (!"asset".equals(scheme)) {
            if ("content".equals(scheme)) {
                if (this.f == null) {
                    f16 f16Var = new f16(this.a);
                    this.f = f16Var;
                    l(f16Var);
                }
                p46Var = this.f;
            } else if ("rtmp".equals(scheme)) {
                if (this.g == null) {
                    try {
                        p46 p46Var2 = (p46) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.g = p46Var2;
                        l(p46Var2);
                    } catch (ClassNotFoundException unused) {
                        s95.e("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.g == null) {
                        this.g = this.c;
                    }
                }
                p46Var = this.g;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    g27 g27Var = new g27(2000);
                    this.h = g27Var;
                    l(g27Var);
                }
                p46Var = this.h;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    g26 g26Var = new g26();
                    this.i = g26Var;
                    l(g26Var);
                }
                p46Var = this.i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    kx6 kx6Var = new kx6(this.a);
                    this.j = kx6Var;
                    l(kx6Var);
                }
                p46Var = this.j;
            } else {
                p46Var = this.c;
            }
            this.k = p46Var;
            return this.k.g(pa6Var);
        }
        p46Var = k();
        this.k = p46Var;
        return this.k.g(pa6Var);
    }

    public final p46 k() {
        if (this.e == null) {
            rw5 rw5Var = new rw5(this.a);
            this.e = rw5Var;
            l(rw5Var);
        }
        return this.e;
    }

    public final void l(p46 p46Var) {
        for (int i = 0; i < this.b.size(); i++) {
            p46Var.d((qz6) this.b.get(i));
        }
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        p46 p46Var = this.k;
        if (p46Var == null) {
            return null;
        }
        return p46Var.zzc();
    }

    @Override // com.daaw.p46
    public final void zzd() {
        p46 p46Var = this.k;
        if (p46Var != null) {
            try {
                p46Var.zzd();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // com.daaw.p46
    public final Map zze() {
        p46 p46Var = this.k;
        return p46Var == null ? Collections.emptyMap() : p46Var.zze();
    }
}
