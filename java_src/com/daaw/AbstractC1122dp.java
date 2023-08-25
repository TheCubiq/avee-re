package com.daaw;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;
/* renamed from: com.daaw.dp */
/* loaded from: classes.dex */
public abstract class AbstractC1122dp extends AbstractC1180ef {

    /* renamed from: i */
    public byte[] f7594i;

    /* renamed from: j */
    public int f7595j;

    /* renamed from: k */
    public volatile boolean f7596k;

    public AbstractC1122dp(InterfaceC2200mp interfaceC2200mp, C2570pp c2570pp, int i, Format format, int i2, Object obj, byte[] bArr) {
        super(interfaceC2200mp, c2570pp, i, format, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.f7594i = bArr;
    }

    @Override // com.daaw.jk0.InterfaceC1836c
    /* renamed from: a */
    public final void mo6740a() {
        try {
            this.f8435h.mo8641c(this.f8428a);
            int i = 0;
            this.f7595j = 0;
            while (i != -1 && !this.f7596k) {
                m24114g();
                i = this.f8435h.mo8642b(this.f7594i, this.f7595j, 16384);
                if (i != -1) {
                    this.f7595j += i;
                }
            }
            if (!this.f7596k) {
                mo23615e(this.f7594i, this.f7595j);
            }
        } finally {
            sq1.m10008h(this.f8435h);
        }
    }

    @Override // com.daaw.jk0.InterfaceC1836c
    /* renamed from: b */
    public final void mo6739b() {
        this.f7596k = true;
    }

    @Override // com.daaw.AbstractC1180ef
    /* renamed from: c */
    public long mo8279c() {
        return this.f7595j;
    }

    /* renamed from: e */
    public abstract void mo23615e(byte[] bArr, int i);

    /* renamed from: f */
    public byte[] m24115f() {
        return this.f7594i;
    }

    /* renamed from: g */
    public final void m24114g() {
        byte[] bArr = this.f7594i;
        if (bArr == null) {
            this.f7594i = new byte[16384];
        } else if (bArr.length < this.f7595j + 16384) {
            this.f7594i = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
