package com.daaw;
/* loaded from: classes.dex */
public abstract class tv7 {
    /* renamed from: a */
    public abstract int mo6727a(Object obj);

    /* renamed from: b */
    public abstract int mo6726b(Object obj);

    /* renamed from: c */
    public abstract Object mo6725c(Object obj);

    /* renamed from: d */
    public abstract Object mo6724d(Object obj);

    /* renamed from: e */
    public abstract Object mo6723e(Object obj, Object obj2);

    /* renamed from: f */
    public abstract Object mo6722f();

    /* renamed from: g */
    public abstract Object mo6721g(Object obj);

    /* renamed from: h */
    public abstract void mo6720h(Object obj, int i, int i2);

    /* renamed from: i */
    public abstract void mo6719i(Object obj, int i, long j);

    /* renamed from: j */
    public abstract void mo6718j(Object obj, int i, Object obj2);

    /* renamed from: k */
    public abstract void mo6717k(Object obj, int i, yq7 yq7Var);

    /* renamed from: l */
    public abstract void mo6716l(Object obj, int i, long j);

    /* renamed from: m */
    public abstract void mo6715m(Object obj);

    /* renamed from: n */
    public abstract void mo6714n(Object obj, Object obj2);

    /* renamed from: o */
    public abstract void mo6713o(Object obj, Object obj2);

    /* renamed from: p */
    public final boolean m8760p(Object obj, iu7 iu7Var) {
        int zzd = iu7Var.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 == 0) {
            mo6716l(obj, i, iu7Var.zzl());
            return true;
        } else if (i2 == 1) {
            mo6719i(obj, i, iu7Var.zzk());
            return true;
        } else if (i2 == 2) {
            mo6717k(obj, i, iu7Var.zzp());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    mo6720h(obj, i, iu7Var.zzf());
                    return true;
                }
                throw xs7.m4543a();
            }
            return false;
        } else {
            Object mo6722f = mo6722f();
            int i3 = 4 | (i << 3);
            while (iu7Var.zzc() != Integer.MAX_VALUE && m8760p(mo6722f, iu7Var)) {
            }
            if (i3 == iu7Var.zzd()) {
                mo6721g(mo6722f);
                mo6718j(obj, i, mo6722f);
                return true;
            }
            throw xs7.m4542b();
        }
    }

    /* renamed from: q */
    public abstract boolean mo6712q(iu7 iu7Var);

    /* renamed from: r */
    public abstract void mo6711r(Object obj, rr7 rr7Var);
}
