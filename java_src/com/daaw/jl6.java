package com.daaw;

import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class jl6 {
    public final cl6 a;
    public final f77 b;
    @GuardedBy("this")
    public boolean c = false;
    @GuardedBy("this")
    public boolean d = false;

    public jl6(final fk6 fk6Var, final bl6 bl6Var, final cl6 cl6Var) {
        this.a = cl6Var;
        this.b = s67.g(s67.n(bl6Var.a(cl6Var), new w57() { // from class: com.daaw.hl6
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return jl6.this.b(bl6Var, fk6Var, cl6Var, (qk6) obj);
            }
        }, cl6Var.zzb()), Exception.class, new w57() { // from class: com.daaw.il6
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return jl6.this.c(bl6Var, (Exception) obj);
            }
        }, cl6Var.zzb());
    }

    public final synchronized f77 a(cl6 cl6Var) {
        if (!this.d && !this.c) {
            if (this.a.zza() != null && cl6Var.zza() != null && this.a.zza().equals(cl6Var.zza())) {
                this.c = true;
                return this.b;
            }
            return null;
        }
        return null;
    }

    public final /* synthetic */ f77 b(bl6 bl6Var, fk6 fk6Var, cl6 cl6Var, qk6 qk6Var) {
        synchronized (this) {
            this.d = true;
            bl6Var.b(qk6Var);
            if (this.c) {
                return s67.i(new al6(qk6Var, cl6Var));
            }
            fk6Var.d(cl6Var.zza(), qk6Var);
            return s67.i(null);
        }
    }

    public final /* synthetic */ f77 c(bl6 bl6Var, Exception exc) {
        synchronized (this) {
            this.d = true;
            throw exc;
        }
    }

    public final synchronized void d(o67 o67Var) {
        s67.r(s67.n(this.b, new w57() { // from class: com.daaw.gl6
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                al6 al6Var = (al6) obj;
                return s67.j();
            }
        }, this.a.zzb()), o67Var, this.a.zzb());
    }
}
