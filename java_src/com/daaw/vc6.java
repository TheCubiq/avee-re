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

    /* renamed from: a */
    public final Context f30142a;

    /* renamed from: b */
    public final List f30143b = new ArrayList();

    /* renamed from: c */
    public final p46 f30144c;

    /* renamed from: d */
    public p46 f30145d;

    /* renamed from: e */
    public p46 f30146e;

    /* renamed from: f */
    public p46 f30147f;

    /* renamed from: g */
    public p46 f30148g;

    /* renamed from: h */
    public p46 f30149h;

    /* renamed from: i */
    public p46 f30150i;

    /* renamed from: j */
    public p46 f30151j;

    /* renamed from: k */
    public p46 f30152k;

    public vc6(Context context, p46 p46Var) {
        this.f30142a = context.getApplicationContext();
        this.f30144c = p46Var;
    }

    /* renamed from: m */
    public static final void m7269m(p46 p46Var, qz6 qz6Var) {
        if (p46Var != null) {
            p46Var.mo1979d(qz6Var);
        }
    }

    @Override // com.daaw.xp8
    /* renamed from: a */
    public final int mo1980a(byte[] bArr, int i, int i2) {
        p46 p46Var = this.f30152k;
        Objects.requireNonNull(p46Var);
        return p46Var.mo1980a(bArr, i, i2);
    }

    @Override // com.daaw.p46
    /* renamed from: d */
    public final void mo1979d(qz6 qz6Var) {
        Objects.requireNonNull(qz6Var);
        this.f30144c.mo1979d(qz6Var);
        this.f30143b.add(qz6Var);
        m7269m(this.f30145d, qz6Var);
        m7269m(this.f30146e, qz6Var);
        m7269m(this.f30147f, qz6Var);
        m7269m(this.f30148g, qz6Var);
        m7269m(this.f30149h, qz6Var);
        m7269m(this.f30150i, qz6Var);
        m7269m(this.f30151j, qz6Var);
    }

    @Override // com.daaw.p46
    /* renamed from: g */
    public final long mo1978g(pa6 pa6Var) {
        p46 p46Var;
        uo4.m7872f(this.f30152k == null);
        String scheme = pa6Var.f22769a.getScheme();
        if (it5.m19373w(pa6Var.f22769a)) {
            String path = pa6Var.f22769a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f30145d == null) {
                    um6 um6Var = new um6();
                    this.f30145d = um6Var;
                    m7270l(um6Var);
                }
                p46Var = this.f30145d;
                this.f30152k = p46Var;
                return this.f30152k.mo1978g(pa6Var);
            }
            p46Var = m7271k();
            this.f30152k = p46Var;
            return this.f30152k.mo1978g(pa6Var);
        }
        if (!"asset".equals(scheme)) {
            if ("content".equals(scheme)) {
                if (this.f30147f == null) {
                    f16 f16Var = new f16(this.f30142a);
                    this.f30147f = f16Var;
                    m7270l(f16Var);
                }
                p46Var = this.f30147f;
            } else if ("rtmp".equals(scheme)) {
                if (this.f30148g == null) {
                    try {
                        p46 p46Var2 = (p46) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f30148g = p46Var2;
                        m7270l(p46Var2);
                    } catch (ClassNotFoundException unused) {
                        s95.m10493e("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.f30148g == null) {
                        this.f30148g = this.f30144c;
                    }
                }
                p46Var = this.f30148g;
            } else if ("udp".equals(scheme)) {
                if (this.f30149h == null) {
                    g27 g27Var = new g27(2000);
                    this.f30149h = g27Var;
                    m7270l(g27Var);
                }
                p46Var = this.f30149h;
            } else if ("data".equals(scheme)) {
                if (this.f30150i == null) {
                    g26 g26Var = new g26();
                    this.f30150i = g26Var;
                    m7270l(g26Var);
                }
                p46Var = this.f30150i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f30151j == null) {
                    kx6 kx6Var = new kx6(this.f30142a);
                    this.f30151j = kx6Var;
                    m7270l(kx6Var);
                }
                p46Var = this.f30151j;
            } else {
                p46Var = this.f30144c;
            }
            this.f30152k = p46Var;
            return this.f30152k.mo1978g(pa6Var);
        }
        p46Var = m7271k();
        this.f30152k = p46Var;
        return this.f30152k.mo1978g(pa6Var);
    }

    /* renamed from: k */
    public final p46 m7271k() {
        if (this.f30146e == null) {
            rw5 rw5Var = new rw5(this.f30142a);
            this.f30146e = rw5Var;
            m7270l(rw5Var);
        }
        return this.f30146e;
    }

    /* renamed from: l */
    public final void m7270l(p46 p46Var) {
        for (int i = 0; i < this.f30143b.size(); i++) {
            p46Var.mo1979d((qz6) this.f30143b.get(i));
        }
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        p46 p46Var = this.f30152k;
        if (p46Var == null) {
            return null;
        }
        return p46Var.zzc();
    }

    @Override // com.daaw.p46
    public final void zzd() {
        p46 p46Var = this.f30152k;
        if (p46Var != null) {
            try {
                p46Var.zzd();
            } finally {
                this.f30152k = null;
            }
        }
    }

    @Override // com.daaw.p46
    public final Map zze() {
        p46 p46Var = this.f30152k;
        return p46Var == null ? Collections.emptyMap() : p46Var.zze();
    }
}
