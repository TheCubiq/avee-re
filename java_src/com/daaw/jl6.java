package com.daaw;

import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class jl6 {

    /* renamed from: a */
    public final cl6 f15191a;

    /* renamed from: b */
    public final f77 f15192b;
    @GuardedBy("this")

    /* renamed from: c */
    public boolean f15193c = false;
    @GuardedBy("this")

    /* renamed from: d */
    public boolean f15194d = false;

    public jl6(final fk6 fk6Var, final bl6 bl6Var, final cl6 cl6Var) {
        this.f15191a = cl6Var;
        this.f15192b = s67.m10636g(s67.m10629n(bl6Var.mo24443a(cl6Var), new w57() { // from class: com.daaw.hl6
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return jl6.this.m18422b(bl6Var, fk6Var, cl6Var, (qk6) obj);
            }
        }, cl6Var.zzb()), Exception.class, new w57() { // from class: com.daaw.il6
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return jl6.this.m18421c(bl6Var, (Exception) obj);
            }
        }, cl6Var.zzb());
    }

    /* renamed from: a */
    public final synchronized f77 m18423a(cl6 cl6Var) {
        if (!this.f15194d && !this.f15193c) {
            if (this.f15191a.zza() != null && cl6Var.zza() != null && this.f15191a.zza().equals(cl6Var.zza())) {
                this.f15193c = true;
                return this.f15192b;
            }
            return null;
        }
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ f77 m18422b(bl6 bl6Var, fk6 fk6Var, cl6 cl6Var, qk6 qk6Var) {
        synchronized (this) {
            this.f15194d = true;
            bl6Var.mo24442b(qk6Var);
            if (this.f15193c) {
                return s67.m10634i(new al6(qk6Var, cl6Var));
            }
            fk6Var.mo21506d(cl6Var.zza(), qk6Var);
            return s67.m10634i(null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ f77 m18421c(bl6 bl6Var, Exception exc) {
        synchronized (this) {
            this.f15194d = true;
            throw exc;
        }
    }

    /* renamed from: d */
    public final synchronized void m18420d(o67 o67Var) {
        s67.m10625r(s67.m10629n(this.f15192b, new w57() { // from class: com.daaw.gl6
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                al6 al6Var = (al6) obj;
                return s67.m10633j();
            }
        }, this.f15191a.zzb()), o67Var, this.f15191a.zzb());
    }
}
