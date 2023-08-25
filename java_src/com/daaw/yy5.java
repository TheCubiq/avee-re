package com.daaw;

import android.net.Uri;
import java.util.Objects;
/* loaded from: classes.dex */
public final class yy5 extends sx5 {

    /* renamed from: e */
    public final byte[] f34259e;

    /* renamed from: f */
    public Uri f34260f;

    /* renamed from: g */
    public int f34261g;

    /* renamed from: h */
    public int f34262h;

    /* renamed from: i */
    public boolean f34263i;

    public yy5(byte[] bArr) {
        super(false);
        Objects.requireNonNull(bArr);
        uo4.m7874d(bArr.length > 0);
        this.f34259e = bArr;
    }

    @Override // com.daaw.xp8
    /* renamed from: a */
    public final int mo1980a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f34262h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f34259e, this.f34261g, bArr, i, min);
        this.f34261g += min;
        this.f34262h -= min;
        m9782c(min);
        return min;
    }

    @Override // com.daaw.p46
    /* renamed from: g */
    public final long mo1978g(pa6 pa6Var) {
        this.f34260f = pa6Var.f22769a;
        m9780l(pa6Var);
        long j = pa6Var.f22774f;
        int length = this.f34259e.length;
        if (j <= length) {
            int i = (int) j;
            this.f34261g = i;
            int i2 = length - i;
            this.f34262h = i2;
            long j2 = pa6Var.f22775g;
            if (j2 != -1) {
                this.f34262h = (int) Math.min(i2, j2);
            }
            this.f34263i = true;
            m9779m(pa6Var);
            long j3 = pa6Var.f22775g;
            return j3 != -1 ? j3 : this.f34262h;
        }
        throw new s56(2008);
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        return this.f34260f;
    }

    @Override // com.daaw.p46
    public final void zzd() {
        if (this.f34263i) {
            this.f34263i = false;
            m9781k();
        }
        this.f34260f = null;
    }
}
