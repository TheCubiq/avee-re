package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class et8 implements hw8 {

    /* renamed from: a */
    public long f8827a;

    /* renamed from: b */
    public long f8828b;

    /* renamed from: c */
    public gw8 f8829c;

    /* renamed from: d */
    public et8 f8830d;

    public et8(long j, int i) {
        m23181c(j, 65536);
    }

    /* renamed from: a */
    public final int m23183a(long j) {
        long j2 = this.f8827a;
        int i = this.f8829c.f11795b;
        return (int) (j - j2);
    }

    /* renamed from: b */
    public final et8 m23182b() {
        this.f8829c = null;
        et8 et8Var = this.f8830d;
        this.f8830d = null;
        return et8Var;
    }

    /* renamed from: c */
    public final void m23181c(long j, int i) {
        uo4.m7872f(this.f8829c == null);
        this.f8827a = j;
        this.f8828b = j + 65536;
    }

    @Override // com.daaw.hw8
    public final gw8 zzc() {
        gw8 gw8Var = this.f8829c;
        Objects.requireNonNull(gw8Var);
        return gw8Var;
    }

    @Override // com.daaw.hw8
    public final hw8 zzd() {
        et8 et8Var = this.f8830d;
        if (et8Var == null || et8Var.f8829c == null) {
            return null;
        }
        return et8Var;
    }
}
