package com.daaw;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class nw8 {

    /* renamed from: a */
    public int f20809a;

    /* renamed from: b */
    public int f20810b;

    /* renamed from: c */
    public int f20811c = 0;

    /* renamed from: d */
    public gw8[] f20812d = new gw8[100];

    public nw8(boolean z, int i) {
    }

    /* renamed from: a */
    public final synchronized int m14759a() {
        return this.f20810b * 65536;
    }

    /* renamed from: b */
    public final synchronized gw8 m14758b() {
        gw8 gw8Var;
        this.f20810b++;
        int i = this.f20811c;
        if (i > 0) {
            gw8[] gw8VarArr = this.f20812d;
            int i2 = i - 1;
            this.f20811c = i2;
            gw8Var = gw8VarArr[i2];
            Objects.requireNonNull(gw8Var);
            gw8VarArr[i2] = null;
        } else {
            gw8Var = new gw8(new byte[65536], 0);
            int i3 = this.f20810b;
            gw8[] gw8VarArr2 = this.f20812d;
            int length = gw8VarArr2.length;
            if (i3 > length) {
                this.f20812d = (gw8[]) Arrays.copyOf(gw8VarArr2, length + length);
                return gw8Var;
            }
        }
        return gw8Var;
    }

    /* renamed from: c */
    public final synchronized void m14757c(gw8 gw8Var) {
        gw8[] gw8VarArr = this.f20812d;
        int i = this.f20811c;
        this.f20811c = i + 1;
        gw8VarArr[i] = gw8Var;
        this.f20810b--;
        notifyAll();
    }

    /* renamed from: d */
    public final synchronized void m14756d(hw8 hw8Var) {
        while (hw8Var != null) {
            gw8[] gw8VarArr = this.f20812d;
            int i = this.f20811c;
            this.f20811c = i + 1;
            gw8VarArr[i] = hw8Var.zzc();
            this.f20810b--;
            hw8Var = hw8Var.zzd();
        }
        notifyAll();
    }

    /* renamed from: e */
    public final synchronized void m14755e() {
        m14754f(0);
    }

    /* renamed from: f */
    public final synchronized void m14754f(int i) {
        int i2 = this.f20809a;
        this.f20809a = i;
        if (i < i2) {
            m14753g();
        }
    }

    /* renamed from: g */
    public final synchronized void m14753g() {
        int max = Math.max(0, it5.m19417O(this.f20809a, 65536) - this.f20810b);
        int i = this.f20811c;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.f20812d, max, i, (Object) null);
        this.f20811c = max;
    }
}
