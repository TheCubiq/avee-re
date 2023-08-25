package com.daaw;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zq8 implements p46 {

    /* renamed from: a */
    public final p46 f35412a;

    /* renamed from: b */
    public final int f35413b;

    /* renamed from: c */
    public final yq8 f35414c;

    /* renamed from: d */
    public final byte[] f35415d;

    /* renamed from: e */
    public int f35416e;

    public zq8(p46 p46Var, int i, yq8 yq8Var) {
        uo4.m7874d(i > 0);
        this.f35412a = p46Var;
        this.f35413b = i;
        this.f35414c = yq8Var;
        this.f35415d = new byte[1];
        this.f35416e = i;
    }

    @Override // com.daaw.xp8
    /* renamed from: a */
    public final int mo1980a(byte[] bArr, int i, int i2) {
        int i3 = this.f35416e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.f35412a.mo1980a(this.f35415d, 0, 1) != -1) {
                int i5 = (this.f35415d[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int mo1980a = this.f35412a.mo1980a(bArr2, i4, i6);
                        if (mo1980a != -1) {
                            i4 += mo1980a;
                            i6 -= mo1980a;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.f35414c.mo3399a(new ik5(bArr2, i5));
                    }
                }
                i3 = this.f35413b;
                this.f35416e = i3;
            }
            return -1;
        }
        int mo1980a2 = this.f35412a.mo1980a(bArr, i, Math.min(i3, i2));
        if (mo1980a2 != -1) {
            this.f35416e -= mo1980a2;
        }
        return mo1980a2;
    }

    @Override // com.daaw.p46
    /* renamed from: d */
    public final void mo1979d(qz6 qz6Var) {
        Objects.requireNonNull(qz6Var);
        this.f35412a.mo1979d(qz6Var);
    }

    @Override // com.daaw.p46
    /* renamed from: g */
    public final long mo1978g(pa6 pa6Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        return this.f35412a.zzc();
    }

    @Override // com.daaw.p46
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.p46
    public final Map zze() {
        return this.f35412a.zze();
    }
}
