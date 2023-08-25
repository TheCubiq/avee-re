package com.daaw;

import android.net.Uri;
import com.daaw.InterfaceC2200mp;
import com.daaw.b00;
import com.daaw.bp0;
/* loaded from: classes.dex */
public final class c00 extends AbstractC3190ua implements b00.InterfaceC0798e {

    /* renamed from: A */
    public final Object f5310A;

    /* renamed from: B */
    public long f5311B;

    /* renamed from: C */
    public boolean f5312C;

    /* renamed from: u */
    public final Uri f5313u;

    /* renamed from: v */
    public final InterfaceC2200mp.InterfaceC2201a f5314v;

    /* renamed from: w */
    public final e00 f5315w;

    /* renamed from: x */
    public final int f5316x;

    /* renamed from: y */
    public final String f5317y;

    /* renamed from: z */
    public final int f5318z;

    /* renamed from: com.daaw.c00$b */
    /* loaded from: classes.dex */
    public static final class C0905b {

        /* renamed from: a */
        public final InterfaceC2200mp.InterfaceC2201a f5319a;

        /* renamed from: b */
        public e00 f5320b;

        /* renamed from: c */
        public String f5321c;

        /* renamed from: d */
        public Object f5322d;

        /* renamed from: e */
        public int f5323e = -1;

        /* renamed from: f */
        public int f5324f = 1048576;

        /* renamed from: g */
        public boolean f5325g;

        public C0905b(InterfaceC2200mp.InterfaceC2201a interfaceC2201a) {
            this.f5319a = interfaceC2201a;
        }

        /* renamed from: a */
        public c00 m25702a(Uri uri) {
            this.f5325g = true;
            if (this.f5320b == null) {
                this.f5320b = new C3564xq();
            }
            return new c00(uri, this.f5319a, this.f5320b, this.f5323e, this.f5321c, this.f5324f, this.f5322d);
        }
    }

    public c00(Uri uri, InterfaceC2200mp.InterfaceC2201a interfaceC2201a, e00 e00Var, int i, String str, int i2, Object obj) {
        this.f5313u = uri;
        this.f5314v = interfaceC2201a;
        this.f5315w = e00Var;
        this.f5316x = i;
        this.f5317y = str;
        this.f5318z = i2;
        this.f5311B = -9223372036854775807L;
        this.f5310A = obj;
    }

    @Override // com.daaw.bp0
    /* renamed from: a */
    public void mo16120a(qo0 qo0Var) {
        ((b00) qo0Var).m26547Q();
    }

    @Override // com.daaw.b00.InterfaceC0798e
    /* renamed from: b */
    public void mo25704b(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.f5311B;
        }
        if (this.f5311B == j && this.f5312C == z) {
            return;
        }
        m25703q(j, z);
    }

    @Override // com.daaw.bp0
    /* renamed from: e */
    public void mo16119e() {
    }

    @Override // com.daaw.bp0
    /* renamed from: g */
    public qo0 mo16118g(bp0.C0880a c0880a, InterfaceC2006l2 interfaceC2006l2) {
        C2914s6.m10690a(c0880a.f5022a == 0);
        return new b00(this.f5313u, this.f5314v.mo9376a(), this.f5315w.mo4824a(), this.f5316x, m8400j(c0880a), this, interfaceC2006l2, this.f5317y, this.f5318z);
    }

    @Override // com.daaw.AbstractC3190ua
    /* renamed from: m */
    public void mo8398m(InterfaceC2898rz interfaceC2898rz, boolean z) {
        m25703q(this.f5311B, false);
    }

    @Override // com.daaw.AbstractC3190ua
    /* renamed from: p */
    public void mo8396p() {
    }

    /* renamed from: q */
    public final void m25703q(long j, boolean z) {
        this.f5311B = j;
        this.f5312C = z;
        m8397n(new od1(this.f5311B, this.f5312C, false, this.f5310A), null);
    }
}
