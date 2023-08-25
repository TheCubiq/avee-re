package com.daaw;

import com.google.android.gms.ads.internal.client.zzl;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class fe6 implements cf6 {
    public final cf6 a;
    public final cf6 b;
    public final dl6 c;
    public final String d;
    @GuardedBy("this")
    public rp4 e;
    public final Executor f;

    public fe6(cf6 cf6Var, cf6 cf6Var2, dl6 dl6Var, String str, Executor executor) {
        this.a = cf6Var;
        this.b = cf6Var2;
        this.c = dl6Var;
        this.d = str;
        this.f = executor;
    }

    @Override // com.daaw.cf6
    public final /* bridge */ /* synthetic */ f77 a(df6 df6Var, ye6 ye6Var, Object obj) {
        return e(df6Var, ye6Var, null);
    }

    @Override // com.daaw.cf6
    /* renamed from: b */
    public final synchronized rp4 zzd() {
        return this.e;
    }

    public final /* synthetic */ f77 c(df6 df6Var, ee6 ee6Var, ye6 ye6Var, rp4 rp4Var, ke6 ke6Var) {
        if (ke6Var != null) {
            ee6 ee6Var2 = new ee6(ee6Var.a, ee6Var.b, ee6Var.c, ee6Var.d, ee6Var.e, ee6Var.f, ke6Var.a);
            if (ke6Var.c != null) {
                this.e = null;
                this.c.e(ee6Var2);
                return f(ke6Var.c, df6Var);
            }
            f77 a = this.c.a(ee6Var2);
            if (a != null) {
                this.e = null;
                return s67.n(a, new w57() { // from class: com.daaw.be6
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        return fe6.this.d((al6) obj);
                    }
                }, this.f);
            }
            this.c.e(ee6Var2);
            df6Var = new df6(df6Var.b, ke6Var.b);
        }
        f77 c = ((pe6) this.a).c(df6Var, ye6Var, rp4Var);
        this.e = rp4Var;
        return c;
    }

    public final /* synthetic */ f77 d(al6 al6Var) {
        cl6 cl6Var;
        if (al6Var == null || al6Var.a == null || (cl6Var = al6Var.b) == null) {
            throw new gi5(1, "Empty prefetch");
        }
        p43 L = v43.L();
        n43 L2 = o43.L();
        L2.v(2);
        L2.t(s43.N());
        L.s(L2);
        al6Var.a.a.zzb().c().l0((v43) L.n());
        return f(al6Var.a, ((ee6) cl6Var).b);
    }

    public final synchronized f77 e(final df6 df6Var, final ye6 ye6Var, rp4 rp4Var) {
        qp4 a = ye6Var.a(df6Var.b);
        a.f(new ge6(this.d));
        final rp4 rp4Var2 = (rp4) a.zzh();
        rp4Var2.zzg();
        rp4Var2.zzg();
        zzl zzlVar = rp4Var2.zzg().d;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            ri6 zzg = rp4Var2.zzg();
            final ee6 ee6Var = new ee6(ye6Var, df6Var, zzg.d, zzg.f, this.f, zzg.j, null);
            return s67.n(j67.D(((le6) this.b).c(df6Var, ye6Var, rp4Var2)), new w57() { // from class: com.daaw.ce6
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    return fe6.this.c(df6Var, ee6Var, ye6Var, rp4Var2, (ke6) obj);
                }
            }, this.f);
        }
        this.e = rp4Var2;
        return ((pe6) this.a).c(df6Var, ye6Var, rp4Var2);
    }

    public final f77 f(qk6 qk6Var, df6 df6Var) {
        rp4 rp4Var = qk6Var.a;
        this.e = rp4Var;
        if (qk6Var.c != null) {
            if (rp4Var.zzf() != null) {
                qk6Var.c.f().e(qk6Var.a.zzf());
            }
            return s67.i(qk6Var.c);
        }
        rp4Var.zzb().l(qk6Var.b);
        return ((pe6) this.a).c(df6Var, null, qk6Var.a);
    }
}
