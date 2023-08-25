package com.daaw;
/* loaded from: classes.dex */
public abstract class tv7 {
    public abstract int a(Object obj);

    public abstract int b(Object obj);

    public abstract Object c(Object obj);

    public abstract Object d(Object obj);

    public abstract Object e(Object obj, Object obj2);

    public abstract Object f();

    public abstract Object g(Object obj);

    public abstract void h(Object obj, int i, int i2);

    public abstract void i(Object obj, int i, long j);

    public abstract void j(Object obj, int i, Object obj2);

    public abstract void k(Object obj, int i, yq7 yq7Var);

    public abstract void l(Object obj, int i, long j);

    public abstract void m(Object obj);

    public abstract void n(Object obj, Object obj2);

    public abstract void o(Object obj, Object obj2);

    public final boolean p(Object obj, iu7 iu7Var) {
        int zzd = iu7Var.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 == 0) {
            l(obj, i, iu7Var.zzl());
            return true;
        } else if (i2 == 1) {
            i(obj, i, iu7Var.zzk());
            return true;
        } else if (i2 == 2) {
            k(obj, i, iu7Var.zzp());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    h(obj, i, iu7Var.zzf());
                    return true;
                }
                throw xs7.a();
            }
            return false;
        } else {
            Object f = f();
            int i3 = 4 | (i << 3);
            while (iu7Var.zzc() != Integer.MAX_VALUE && p(f, iu7Var)) {
            }
            if (i3 == iu7Var.zzd()) {
                g(f);
                j(obj, i, f);
                return true;
            }
            throw xs7.b();
        }
    }

    public abstract boolean q(iu7 iu7Var);

    public abstract void r(Object obj, rr7 rr7Var);
}
