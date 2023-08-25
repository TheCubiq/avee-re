package com.daaw;

import java.util.Arrays;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class o97 {

    /* renamed from: a */
    public final Object f21179a;

    /* renamed from: b */
    public final byte[] f21180b;

    /* renamed from: c */
    public final zn7 f21181c;

    /* renamed from: d */
    public final int f21182d;

    /* renamed from: e */
    public final m87 f21183e;

    /* renamed from: f */
    public final int f21184f;

    public o97(Object obj, byte[] bArr, int i, zn7 zn7Var, int i2, m87 m87Var) {
        this.f21179a = obj;
        this.f21180b = Arrays.copyOf(bArr, bArr.length);
        this.f21184f = i;
        this.f21181c = zn7Var;
        this.f21182d = i2;
        this.f21183e = m87Var;
    }

    /* renamed from: a */
    public final int m14441a() {
        return this.f21182d;
    }

    /* renamed from: b */
    public final m87 m14440b() {
        return this.f21183e;
    }

    /* renamed from: c */
    public final l97 m14439c() {
        return this.f21183e.mo9195a();
    }

    /* renamed from: d */
    public final zn7 m14438d() {
        return this.f21181c;
    }

    /* renamed from: e */
    public final Object m14437e() {
        return this.f21179a;
    }

    @Nullable
    /* renamed from: f */
    public final byte[] m14436f() {
        byte[] bArr = this.f21180b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: g */
    public final int m14435g() {
        return this.f21184f;
    }
}
