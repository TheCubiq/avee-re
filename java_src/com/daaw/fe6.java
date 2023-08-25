package com.daaw;

import com.google.android.gms.ads.internal.client.zzl;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class fe6 implements cf6 {

    /* renamed from: a */
    public final cf6 f9494a;

    /* renamed from: b */
    public final cf6 f9495b;

    /* renamed from: c */
    public final dl6 f9496c;

    /* renamed from: d */
    public final String f9497d;
    @GuardedBy("this")

    /* renamed from: e */
    public rp4 f9498e;

    /* renamed from: f */
    public final Executor f9499f;

    public fe6(cf6 cf6Var, cf6 cf6Var2, dl6 dl6Var, String str, Executor executor) {
        this.f9494a = cf6Var;
        this.f9495b = cf6Var2;
        this.f9496c = dl6Var;
        this.f9497d = str;
        this.f9499f = executor;
    }

    @Override // com.daaw.cf6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ f77 mo13423a(df6 df6Var, ye6 ye6Var, Object obj) {
        return m22744e(df6Var, ye6Var, null);
    }

    @Override // com.daaw.cf6
    /* renamed from: b */
    public final synchronized rp4 zzd() {
        return this.f9498e;
    }

    /* renamed from: c */
    public final /* synthetic */ f77 m22746c(df6 df6Var, ee6 ee6Var, ye6 ye6Var, rp4 rp4Var, ke6 ke6Var) {
        if (ke6Var != null) {
            ee6 ee6Var2 = new ee6(ee6Var.f8415a, ee6Var.f8416b, ee6Var.f8417c, ee6Var.f8418d, ee6Var.f8419e, ee6Var.f8420f, ke6Var.f16326a);
            if (ke6Var.f16328c != null) {
                this.f9498e = null;
                this.f9496c.m24260e(ee6Var2);
                return m22743f(ke6Var.f16328c, df6Var);
            }
            f77 m24264a = this.f9496c.m24264a(ee6Var2);
            if (m24264a != null) {
                this.f9498e = null;
                return s67.m10629n(m24264a, new w57() { // from class: com.daaw.be6
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        return fe6.this.m22745d((al6) obj);
                    }
                }, this.f9499f);
            }
            this.f9496c.m24260e(ee6Var2);
            df6Var = new df6(df6Var.f7039b, ke6Var.f16327b);
        }
        f77 m13421c = ((pe6) this.f9494a).m13421c(df6Var, ye6Var, rp4Var);
        this.f9498e = rp4Var;
        return m13421c;
    }

    /* renamed from: d */
    public final /* synthetic */ f77 m22745d(al6 al6Var) {
        cl6 cl6Var;
        if (al6Var == null || al6Var.f3306a == null || (cl6Var = al6Var.f3307b) == null) {
            throw new gi5(1, "Empty prefetch");
        }
        p43 m7458L = v43.m7458L();
        n43 m14559L = o43.m14559L();
        m14559L.m15525v(2);
        m14559L.m15527t(s43.m10713N());
        m7458L.m13640s(m14559L);
        al6Var.f3306a.f24123a.zzb().m18389c().mo5935l0((v43) m7458L.m22315n());
        return m22743f(al6Var.f3306a, ((ee6) cl6Var).f8416b);
    }

    /* renamed from: e */
    public final synchronized f77 m22744e(final df6 df6Var, final ye6 ye6Var, rp4 rp4Var) {
        qp4 mo3795a = ye6Var.mo3795a(df6Var.f7039b);
        mo3795a.mo7276f(new ge6(this.f9497d));
        final rp4 rp4Var2 = (rp4) mo3795a.zzh();
        rp4Var2.zzg();
        rp4Var2.zzg();
        zzl zzlVar = rp4Var2.zzg().f25344d;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            ri6 zzg = rp4Var2.zzg();
            final ee6 ee6Var = new ee6(ye6Var, df6Var, zzg.f25344d, zzg.f25346f, this.f9499f, zzg.f25350j, null);
            return s67.m10629n(j67.m18784D(((le6) this.f9495b).m16982c(df6Var, ye6Var, rp4Var2)), new w57() { // from class: com.daaw.ce6
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    return fe6.this.m22746c(df6Var, ee6Var, ye6Var, rp4Var2, (ke6) obj);
                }
            }, this.f9499f);
        }
        this.f9498e = rp4Var2;
        return ((pe6) this.f9494a).m13421c(df6Var, ye6Var, rp4Var2);
    }

    /* renamed from: f */
    public final f77 m22743f(qk6 qk6Var, df6 df6Var) {
        rp4 rp4Var = qk6Var.f24123a;
        this.f9498e = rp4Var;
        if (qk6Var.f24125c != null) {
            if (rp4Var.zzf() != null) {
                qk6Var.f24125c.m2127f().mo6129e(qk6Var.f24123a.zzf());
            }
            return s67.m10634i(qk6Var.f24125c);
        }
        rp4Var.zzb().m18380l(qk6Var.f24124b);
        return ((pe6) this.f9494a).m13421c(df6Var, null, qk6Var.f24123a);
    }
}
