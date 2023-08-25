package com.daaw;

import android.content.Context;
import android.net.Uri;
/* renamed from: com.daaw.rq */
/* loaded from: classes.dex */
public final class C2875rq implements InterfaceC2200mp {

    /* renamed from: a */
    public final Context f25499a;

    /* renamed from: b */
    public final bn1<? super InterfaceC2200mp> f25500b;

    /* renamed from: c */
    public final InterfaceC2200mp f25501c;

    /* renamed from: d */
    public InterfaceC2200mp f25502d;

    /* renamed from: e */
    public InterfaceC2200mp f25503e;

    /* renamed from: f */
    public InterfaceC2200mp f25504f;

    /* renamed from: g */
    public InterfaceC2200mp f25505g;

    /* renamed from: h */
    public InterfaceC2200mp f25506h;

    /* renamed from: i */
    public InterfaceC2200mp f25507i;

    /* renamed from: j */
    public InterfaceC2200mp f25508j;

    public C2875rq(Context context, bn1<? super InterfaceC2200mp> bn1Var, InterfaceC2200mp interfaceC2200mp) {
        this.f25499a = context.getApplicationContext();
        this.f25500b = bn1Var;
        this.f25501c = (InterfaceC2200mp) C2914s6.m10686e(interfaceC2200mp);
    }

    /* renamed from: a */
    public final InterfaceC2200mp m11077a() {
        if (this.f25503e == null) {
            this.f25503e = new C3014t6(this.f25499a, this.f25500b);
        }
        return this.f25503e;
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: b */
    public int mo8642b(byte[] bArr, int i, int i2) {
        return this.f25508j.mo8642b(bArr, i, i2);
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: c */
    public long mo8641c(C2570pp c2570pp) {
        InterfaceC2200mp m11076e;
        C2914s6.m10685f(this.f25508j == null);
        String scheme = c2570pp.f23115a.getScheme();
        if (sq1.m10034K(c2570pp.f23115a)) {
            if (!c2570pp.f23115a.getPath().startsWith("/android_asset/")) {
                m11076e = m11074g();
            }
            m11076e = m11077a();
        } else {
            if (!"asset".equals(scheme)) {
                m11076e = "content".equals(scheme) ? m11076e() : "rtmp".equals(scheme) ? m11072i() : "data".equals(scheme) ? m11075f() : "rawresource".equals(scheme) ? m11073h() : this.f25501c;
            }
            m11076e = m11077a();
        }
        this.f25508j = m11076e;
        return this.f25508j.mo8641c(c2570pp);
    }

    @Override // com.daaw.InterfaceC2200mp
    public void close() {
        InterfaceC2200mp interfaceC2200mp = this.f25508j;
        if (interfaceC2200mp != null) {
            try {
                interfaceC2200mp.close();
            } finally {
                this.f25508j = null;
            }
        }
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: d */
    public Uri mo8640d() {
        InterfaceC2200mp interfaceC2200mp = this.f25508j;
        if (interfaceC2200mp == null) {
            return null;
        }
        return interfaceC2200mp.mo8640d();
    }

    /* renamed from: e */
    public final InterfaceC2200mp m11076e() {
        if (this.f25504f == null) {
            this.f25504f = new C2946sk(this.f25499a, this.f25500b);
        }
        return this.f25504f;
    }

    /* renamed from: f */
    public final InterfaceC2200mp m11075f() {
        if (this.f25506h == null) {
            this.f25506h = new C2101lp();
        }
        return this.f25506h;
    }

    /* renamed from: g */
    public final InterfaceC2200mp m11074g() {
        if (this.f25502d == null) {
            this.f25502d = new t00(this.f25500b);
        }
        return this.f25502d;
    }

    /* renamed from: h */
    public final InterfaceC2200mp m11073h() {
        if (this.f25507i == null) {
            this.f25507i = new i31(this.f25499a, this.f25500b);
        }
        return this.f25507i;
    }

    /* renamed from: i */
    public final InterfaceC2200mp m11072i() {
        if (this.f25505g == null) {
            try {
                this.f25505g = (InterfaceC2200mp) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f25505g == null) {
                this.f25505g = this.f25501c;
            }
        }
        return this.f25505g;
    }
}
