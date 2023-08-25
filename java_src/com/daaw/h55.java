package com.daaw;
/* loaded from: classes.dex */
public final class h55 {

    /* renamed from: a */
    public final Object f12069a;

    /* renamed from: b */
    public ny8 f12070b = new ny8();

    /* renamed from: c */
    public boolean f12071c;

    /* renamed from: d */
    public boolean f12072d;

    public h55(Object obj) {
        this.f12069a = obj;
    }

    /* renamed from: a */
    public final void m21020a(int i, c35 c35Var) {
        if (this.f12072d) {
            return;
        }
        if (i != -1) {
            this.f12070b.m14715a(i);
        }
        this.f12071c = true;
        c35Var.zza(this.f12069a);
    }

    /* renamed from: b */
    public final void m21019b(e45 e45Var) {
        if (this.f12072d || !this.f12071c) {
            return;
        }
        r32 m14714b = this.f12070b.m14714b();
        this.f12070b = new ny8();
        this.f12071c = false;
        e45Var.mo8306a(this.f12069a, m14714b);
    }

    /* renamed from: c */
    public final void m21018c(e45 e45Var) {
        this.f12072d = true;
        if (this.f12071c) {
            e45Var.mo8306a(this.f12069a, this.f12070b.m14714b());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h55.class != obj.getClass()) {
            return false;
        }
        return this.f12069a.equals(((h55) obj).f12069a);
    }

    public final int hashCode() {
        return this.f12069a.hashCode();
    }
}
