package com.daaw;

import java.util.Arrays;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class o97 {
    public final Object a;
    public final byte[] b;
    public final zn7 c;
    public final int d;
    public final m87 e;
    public final int f;

    public o97(Object obj, byte[] bArr, int i, zn7 zn7Var, int i2, m87 m87Var) {
        this.a = obj;
        this.b = Arrays.copyOf(bArr, bArr.length);
        this.f = i;
        this.c = zn7Var;
        this.d = i2;
        this.e = m87Var;
    }

    public final int a() {
        return this.d;
    }

    public final m87 b() {
        return this.e;
    }

    public final l97 c() {
        return this.e.a();
    }

    public final zn7 d() {
        return this.c;
    }

    public final Object e() {
        return this.a;
    }

    @Nullable
    public final byte[] f() {
        byte[] bArr = this.b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int g() {
        return this.f;
    }
}
