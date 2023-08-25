package com.daaw;
/* loaded from: classes.dex */
public final class h55 {
    public final Object a;
    public ny8 b = new ny8();
    public boolean c;
    public boolean d;

    public h55(Object obj) {
        this.a = obj;
    }

    public final void a(int i, c35 c35Var) {
        if (this.d) {
            return;
        }
        if (i != -1) {
            this.b.a(i);
        }
        this.c = true;
        c35Var.zza(this.a);
    }

    public final void b(e45 e45Var) {
        if (this.d || !this.c) {
            return;
        }
        r32 b = this.b.b();
        this.b = new ny8();
        this.c = false;
        e45Var.a(this.a, b);
    }

    public final void c(e45 e45Var) {
        this.d = true;
        if (this.c) {
            e45Var.a(this.a, this.b.b());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h55.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((h55) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
