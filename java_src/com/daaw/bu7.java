package com.daaw;
/* loaded from: classes.dex */
public final class bu7 implements cv7 {
    public final xt7 a;
    public final tv7 b;
    public final boolean c;
    public final wr7 d;

    public bu7(tv7 tv7Var, wr7 wr7Var, xt7 xt7Var) {
        this.b = tv7Var;
        this.c = wr7Var.h(xt7Var);
        this.d = wr7Var;
        this.a = xt7Var;
    }

    public static bu7 i(tv7 tv7Var, wr7 wr7Var, xt7 xt7Var) {
        return new bu7(tv7Var, wr7Var, xt7Var);
    }

    @Override // com.daaw.cv7
    public final int a(Object obj) {
        int hashCode = this.b.d(obj).hashCode();
        if (this.c) {
            this.d.a(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // com.daaw.cv7
    public final void b(Object obj) {
        this.b.m(obj);
        this.d.e(obj);
    }

    @Override // com.daaw.cv7
    public final boolean c(Object obj) {
        this.d.a(obj);
        throw null;
    }

    @Override // com.daaw.cv7
    public final void d(Object obj, Object obj2) {
        ev7.f(this.b, obj, obj2);
        if (this.c) {
            ev7.e(this.d, obj, obj2);
        }
    }

    @Override // com.daaw.cv7
    public final boolean e(Object obj, Object obj2) {
        if (this.b.d(obj).equals(this.b.d(obj2))) {
            if (this.c) {
                this.d.a(obj);
                this.d.a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.cv7
    public final void f(Object obj, rr7 rr7Var) {
        this.d.a(obj);
        throw null;
    }

    @Override // com.daaw.cv7
    public final void g(Object obj, byte[] bArr, int i, int i2, kq7 kq7Var) {
        ls7 ls7Var = (ls7) obj;
        if (ls7Var.zzc == uv7.c()) {
            ls7Var.zzc = uv7.f();
        }
        js7 js7Var = (js7) obj;
        throw null;
    }

    @Override // com.daaw.cv7
    public final void h(Object obj, iu7 iu7Var, vr7 vr7Var) {
        boolean zzO;
        tv7 tv7Var = this.b;
        wr7 wr7Var = this.d;
        Object c = tv7Var.c(obj);
        as7 b = wr7Var.b(obj);
        while (iu7Var.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = iu7Var.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object c2 = wr7Var.c(vr7Var, this.a, zzd >>> 3);
                        if (c2 != null) {
                            wr7Var.f(iu7Var, c2, vr7Var, b);
                        } else {
                            zzO = tv7Var.p(c, iu7Var);
                        }
                    } else {
                        zzO = iu7Var.zzO();
                    }
                    if (!zzO) {
                        return;
                    }
                } else {
                    int i = 0;
                    Object obj2 = null;
                    yq7 yq7Var = null;
                    while (iu7Var.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = iu7Var.zzd();
                        if (zzd2 == 16) {
                            i = iu7Var.zzj();
                            obj2 = wr7Var.c(vr7Var, this.a, i);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                wr7Var.f(iu7Var, obj2, vr7Var, b);
                            } else {
                                yq7Var = iu7Var.zzp();
                            }
                        } else if (!iu7Var.zzO()) {
                            break;
                        }
                    }
                    if (iu7Var.zzd() != 12) {
                        throw xs7.b();
                    } else if (yq7Var != null) {
                        if (obj2 != null) {
                            wr7Var.g(yq7Var, obj2, vr7Var, b);
                        } else {
                            tv7Var.k(c, i, yq7Var);
                        }
                    }
                }
            } finally {
                tv7Var.n(obj, c);
            }
        }
    }

    @Override // com.daaw.cv7
    public final int zza(Object obj) {
        tv7 tv7Var = this.b;
        int b = tv7Var.b(tv7Var.d(obj));
        if (this.c) {
            this.d.a(obj);
            throw null;
        }
        return b;
    }

    @Override // com.daaw.cv7
    public final Object zze() {
        xt7 xt7Var = this.a;
        return xt7Var instanceof ls7 ? ((ls7) xt7Var).n() : xt7Var.b().l();
    }
}
