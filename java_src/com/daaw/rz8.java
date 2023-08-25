package com.daaw;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class rz8 implements k09 {

    /* renamed from: b */
    public final xp8 f25735b;

    /* renamed from: c */
    public final long f25736c;

    /* renamed from: d */
    public long f25737d;

    /* renamed from: f */
    public int f25739f;

    /* renamed from: g */
    public int f25740g;

    /* renamed from: e */
    public byte[] f25738e = new byte[65536];

    /* renamed from: a */
    public final byte[] f25734a = new byte[4096];

    static {
        k63.m18024b("media3.extractor");
    }

    public rz8(xp8 xp8Var, long j, long j2) {
        this.f25735b = xp8Var;
        this.f25737d = j;
        this.f25736c = j2;
    }

    @Override // com.daaw.k09, com.daaw.xp8
    /* renamed from: a */
    public final int mo1980a(byte[] bArr, int i, int i2) {
        int m10810m = m10810m(bArr, i, i2);
        if (m10810m == 0) {
            m10810m = m10809n(bArr, i, i2, 0, true);
        }
        m10807p(m10810m);
        return m10810m;
    }

    @Override // com.daaw.k09
    /* renamed from: b */
    public final int mo5665b(int i) {
        int m10808o = m10808o(1);
        if (m10808o == 0) {
            m10808o = m10809n(this.f25734a, 0, Math.min(1, 4096), 0, true);
        }
        m10807p(m10808o);
        return m10808o;
    }

    @Override // com.daaw.k09
    /* renamed from: c */
    public final void mo5664c(int i) {
        m10812k(i, false);
    }

    @Override // com.daaw.k09
    /* renamed from: e */
    public final boolean mo5663e(byte[] bArr, int i, int i2, boolean z) {
        int m10810m = m10810m(bArr, i, i2);
        while (m10810m < i2 && m10810m != -1) {
            m10810m = m10809n(bArr, i, i2, m10810m, z);
        }
        m10807p(m10810m);
        return m10810m != -1;
    }

    @Override // com.daaw.k09
    /* renamed from: f */
    public final int mo5662f(byte[] bArr, int i, int i2) {
        int min;
        m10806q(i2);
        int i3 = this.f25740g;
        int i4 = this.f25739f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = m10809n(this.f25738e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f25740g += min;
        } else {
            min = Math.min(i2, i5);
        }
        System.arraycopy(this.f25738e, this.f25739f, bArr, i, min);
        this.f25739f += min;
        return min;
    }

    @Override // com.daaw.k09
    /* renamed from: h */
    public final boolean mo5661h(byte[] bArr, int i, int i2, boolean z) {
        if (m10812k(i2, z)) {
            System.arraycopy(this.f25738e, this.f25739f - i2, bArr, i, i2);
            return true;
        }
        return false;
    }

    @Override // com.daaw.k09
    /* renamed from: i */
    public final void mo5660i(byte[] bArr, int i, int i2) {
        mo5663e(bArr, i, i2, false);
    }

    @Override // com.daaw.k09
    /* renamed from: j */
    public final void mo5659j(byte[] bArr, int i, int i2) {
        mo5661h(bArr, i, i2, false);
    }

    /* renamed from: k */
    public final boolean m10812k(int i, boolean z) {
        m10806q(i);
        int i2 = this.f25740g - this.f25739f;
        while (i2 < i) {
            i2 = m10809n(this.f25738e, this.f25739f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f25740g = this.f25739f + i2;
        }
        this.f25739f += i;
        return true;
    }

    /* renamed from: l */
    public final boolean m10811l(int i, boolean z) {
        int m10808o = m10808o(i);
        while (m10808o < i && m10808o != -1) {
            m10808o = m10809n(this.f25734a, -m10808o, Math.min(i, m10808o + 4096), m10808o, false);
        }
        m10807p(m10808o);
        return m10808o != -1;
    }

    /* renamed from: m */
    public final int m10810m(byte[] bArr, int i, int i2) {
        int i3 = this.f25740g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f25738e, 0, bArr, i, min);
        m10805r(min);
        return min;
    }

    /* renamed from: n */
    public final int m10809n(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int mo1980a = this.f25735b.mo1980a(bArr, i + i3, i2 - i3);
        if (mo1980a == -1) {
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        return i3 + mo1980a;
    }

    /* renamed from: o */
    public final int m10808o(int i) {
        int min = Math.min(this.f25740g, i);
        m10805r(min);
        return min;
    }

    /* renamed from: p */
    public final void m10807p(int i) {
        if (i != -1) {
            this.f25737d += i;
        }
    }

    /* renamed from: q */
    public final void m10806q(int i) {
        int i2 = this.f25739f + i;
        int length = this.f25738e.length;
        if (i2 > length) {
            this.f25738e = Arrays.copyOf(this.f25738e, it5.m19416P(length + length, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: r */
    public final void m10805r(int i) {
        int i2 = this.f25740g - i;
        this.f25740g = i2;
        this.f25739f = 0;
        byte[] bArr = this.f25738e;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f25738e = bArr2;
    }

    @Override // com.daaw.k09
    /* renamed from: u */
    public final void mo5658u(int i) {
        m10811l(i, false);
    }

    @Override // com.daaw.k09
    public final long zzd() {
        return this.f25736c;
    }

    @Override // com.daaw.k09
    public final long zze() {
        return this.f25737d + this.f25739f;
    }

    @Override // com.daaw.k09
    public final long zzf() {
        return this.f25737d;
    }

    @Override // com.daaw.k09
    public final void zzj() {
        this.f25739f = 0;
    }
}
