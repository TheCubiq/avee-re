package com.daaw;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class lp5 implements fn6 {

    /* renamed from: p */
    public final zo5 f17599p;

    /* renamed from: q */
    public final dp5 f17600q;

    public lp5(zo5 zo5Var, dp5 dp5Var) {
        this.f17599p = zo5Var;
        this.f17600q = dp5Var;
    }

    @Override // com.daaw.fn6
    /* renamed from: A */
    public final void mo5182A(ym6 ym6Var, String str) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10407E5)).booleanValue()) {
            if (ym6.RENDERER == ym6Var) {
                this.f17599p.m2033g(zzt.zzB().mo15859b());
            } else if (ym6.PRELOADED_LOADER == ym6Var || ym6.SERVER_TRANSACTION == ym6Var) {
                this.f17599p.m2032h(zzt.zzB().mo15859b());
                final dp5 dp5Var = this.f17600q;
                final long m2036d = this.f17599p.m2036d();
                dp5Var.f13910b.m10115a(new em6() { // from class: com.daaw.cp5
                    @Override // com.daaw.em6
                    public final Object zza(Object obj) {
                        dp5 dp5Var2 = dp5.this;
                        long j = m2036d;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (dp5Var2.m19529a()) {
                            return null;
                        }
                        s63 m9507T = t63.m9507T();
                        m9507T.m10661z(j);
                        byte[] mo4516a = ((t63) m9507T.m22315n()).mo4516a();
                        kp5.m17539g(sQLiteDatabase, false, false);
                        kp5.m17542d(sQLiteDatabase, j, mo4516a);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.daaw.fn6
    /* renamed from: M */
    public final void mo5179M(ym6 ym6Var, String str) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10407E5)).booleanValue() && ym6.RENDERER == ym6Var && this.f17599p.m2037c() != 0) {
            this.f17599p.m2034f(zzt.zzB().mo15859b() - this.f17599p.m2037c());
        }
    }

    @Override // com.daaw.fn6
    /* renamed from: S */
    public final void mo5178S(ym6 ym6Var, String str, Throwable th) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10407E5)).booleanValue() && ym6.RENDERER == ym6Var && this.f17599p.m2037c() != 0) {
            this.f17599p.m2034f(zzt.zzB().mo15859b() - this.f17599p.m2037c());
        }
    }

    @Override // com.daaw.fn6
    /* renamed from: k */
    public final void mo5172k(ym6 ym6Var, String str) {
    }
}
