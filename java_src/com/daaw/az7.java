package com.daaw;

import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public abstract class az7 implements ih2 {

    /* renamed from: y */
    public static final oz7 f4127y = oz7.m13793b(az7.class);

    /* renamed from: p */
    public final String f4128p;

    /* renamed from: q */
    public jh2 f4129q;

    /* renamed from: t */
    public ByteBuffer f4132t;

    /* renamed from: u */
    public long f4133u;

    /* renamed from: w */
    public iz7 f4135w;

    /* renamed from: v */
    public long f4134v = -1;

    /* renamed from: x */
    public ByteBuffer f4136x = null;

    /* renamed from: s */
    public boolean f4131s = true;

    /* renamed from: r */
    public boolean f4130r = true;

    public az7(String str) {
        this.f4128p = str;
    }

    /* renamed from: a */
    public final synchronized void m26573a() {
        if (this.f4131s) {
            return;
        }
        try {
            oz7 oz7Var = f4127y;
            String str = this.f4128p;
            oz7Var.mo13794a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.f4132t = this.f4135w.mo12774R(this.f4133u, this.f4134v);
            this.f4131s = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public abstract void mo16028b(ByteBuffer byteBuffer);

    /* renamed from: c */
    public final synchronized void m26572c() {
        m26573a();
        oz7 oz7Var = f4127y;
        String str = this.f4128p;
        oz7Var.mo13794a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.f4132t;
        if (byteBuffer != null) {
            this.f4130r = true;
            byteBuffer.rewind();
            mo16028b(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.f4136x = byteBuffer.slice();
            }
            this.f4132t = null;
        }
    }

    @Override // com.daaw.ih2
    /* renamed from: d */
    public final void mo19823d(iz7 iz7Var, ByteBuffer byteBuffer, long j, fh2 fh2Var) {
        this.f4133u = iz7Var.zzb();
        byteBuffer.remaining();
        this.f4134v = j;
        this.f4135w = iz7Var;
        iz7Var.mo12773b(iz7Var.zzb() + j);
        this.f4131s = false;
        this.f4130r = false;
        m26572c();
    }

    @Override // com.daaw.ih2
    /* renamed from: n */
    public final void mo19822n(jh2 jh2Var) {
        this.f4129q = jh2Var;
    }

    @Override // com.daaw.ih2
    public final String zza() {
        return this.f4128p;
    }
}
