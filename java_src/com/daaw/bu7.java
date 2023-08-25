package com.daaw;
/* loaded from: classes.dex */
public final class bu7 implements cv7 {

    /* renamed from: a */
    public final xt7 f5194a;

    /* renamed from: b */
    public final tv7 f5195b;

    /* renamed from: c */
    public final boolean f5196c;

    /* renamed from: d */
    public final wr7 f5197d;

    public bu7(tv7 tv7Var, wr7 wr7Var, xt7 xt7Var) {
        this.f5195b = tv7Var;
        this.f5196c = wr7Var.mo4777h(xt7Var);
        this.f5197d = wr7Var;
        this.f5194a = xt7Var;
    }

    /* renamed from: i */
    public static bu7 m25813i(tv7 tv7Var, wr7 wr7Var, xt7 xt7Var) {
        return new bu7(tv7Var, wr7Var, xt7Var);
    }

    @Override // com.daaw.cv7
    /* renamed from: a */
    public final int mo24961a(Object obj) {
        int hashCode = this.f5195b.mo6724d(obj).hashCode();
        if (this.f5196c) {
            this.f5197d.mo4784a(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // com.daaw.cv7
    /* renamed from: b */
    public final void mo24960b(Object obj) {
        this.f5195b.mo6715m(obj);
        this.f5197d.mo4780e(obj);
    }

    @Override // com.daaw.cv7
    /* renamed from: c */
    public final boolean mo24959c(Object obj) {
        this.f5197d.mo4784a(obj);
        throw null;
    }

    @Override // com.daaw.cv7
    /* renamed from: d */
    public final void mo24958d(Object obj, Object obj2) {
        ev7.m23133f(this.f5195b, obj, obj2);
        if (this.f5196c) {
            ev7.m23134e(this.f5197d, obj, obj2);
        }
    }

    @Override // com.daaw.cv7
    /* renamed from: e */
    public final boolean mo24957e(Object obj, Object obj2) {
        if (this.f5195b.mo6724d(obj).equals(this.f5195b.mo6724d(obj2))) {
            if (this.f5196c) {
                this.f5197d.mo4784a(obj);
                this.f5197d.mo4784a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.cv7
    /* renamed from: f */
    public final void mo24956f(Object obj, rr7 rr7Var) {
        this.f5197d.mo4784a(obj);
        throw null;
    }

    @Override // com.daaw.cv7
    /* renamed from: g */
    public final void mo24955g(Object obj, byte[] bArr, int i, int i2, kq7 kq7Var) {
        ls7 ls7Var = (ls7) obj;
        if (ls7Var.zzc == uv7.m7679c()) {
            ls7Var.zzc = uv7.m7676f();
        }
        js7 js7Var = (js7) obj;
        throw null;
    }

    @Override // com.daaw.cv7
    /* renamed from: h */
    public final void mo24954h(Object obj, iu7 iu7Var, vr7 vr7Var) {
        boolean zzO;
        tv7 tv7Var = this.f5195b;
        wr7 wr7Var = this.f5197d;
        Object mo6725c = tv7Var.mo6725c(obj);
        as7 mo4783b = wr7Var.mo4783b(obj);
        while (iu7Var.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = iu7Var.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object mo4782c = wr7Var.mo4782c(vr7Var, this.f5194a, zzd >>> 3);
                        if (mo4782c != null) {
                            wr7Var.mo4779f(iu7Var, mo4782c, vr7Var, mo4783b);
                        } else {
                            zzO = tv7Var.m8760p(mo6725c, iu7Var);
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
                            obj2 = wr7Var.mo4782c(vr7Var, this.f5194a, i);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                wr7Var.mo4779f(iu7Var, obj2, vr7Var, mo4783b);
                            } else {
                                yq7Var = iu7Var.zzp();
                            }
                        } else if (!iu7Var.zzO()) {
                            break;
                        }
                    }
                    if (iu7Var.zzd() != 12) {
                        throw xs7.m4542b();
                    } else if (yq7Var != null) {
                        if (obj2 != null) {
                            wr7Var.mo4778g(yq7Var, obj2, vr7Var, mo4783b);
                        } else {
                            tv7Var.mo6717k(mo6725c, i, yq7Var);
                        }
                    }
                }
            } finally {
                tv7Var.mo6714n(obj, mo6725c);
            }
        }
    }

    @Override // com.daaw.cv7
    public final int zza(Object obj) {
        tv7 tv7Var = this.f5195b;
        int mo6726b = tv7Var.mo6726b(tv7Var.mo6724d(obj));
        if (this.f5196c) {
            this.f5197d.mo4784a(obj);
            throw null;
        }
        return mo6726b;
    }

    @Override // com.daaw.cv7
    public final Object zze() {
        xt7 xt7Var = this.f5194a;
        return xt7Var instanceof ls7 ? ((ls7) xt7Var).m16585n() : xt7Var.mo4515b().mo5803l();
    }
}
