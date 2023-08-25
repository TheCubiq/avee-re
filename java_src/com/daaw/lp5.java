package com.daaw;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class lp5 implements fn6 {
    public final zo5 p;
    public final dp5 q;

    public lp5(zo5 zo5Var, dp5 dp5Var) {
        this.p = zo5Var;
        this.q = dp5Var;
    }

    @Override // com.daaw.fn6
    public final void A(ym6 ym6Var, String str) {
        if (((Boolean) zzba.zzc().b(g93.E5)).booleanValue()) {
            if (ym6.RENDERER == ym6Var) {
                this.p.g(zzt.zzB().b());
            } else if (ym6.PRELOADED_LOADER == ym6Var || ym6.SERVER_TRANSACTION == ym6Var) {
                this.p.h(zzt.zzB().b());
                final dp5 dp5Var = this.q;
                final long d = this.p.d();
                dp5Var.b.a(new em6() { // from class: com.daaw.cp5
                    @Override // com.daaw.em6
                    public final Object zza(Object obj) {
                        dp5 dp5Var2 = dp5.this;
                        long j = d;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (dp5Var2.a()) {
                            return null;
                        }
                        s63 T = t63.T();
                        T.z(j);
                        byte[] a = ((t63) T.n()).a();
                        kp5.g(sQLiteDatabase, false, false);
                        kp5.d(sQLiteDatabase, j, a);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.daaw.fn6
    public final void M(ym6 ym6Var, String str) {
        if (((Boolean) zzba.zzc().b(g93.E5)).booleanValue() && ym6.RENDERER == ym6Var && this.p.c() != 0) {
            this.p.f(zzt.zzB().b() - this.p.c());
        }
    }

    @Override // com.daaw.fn6
    public final void S(ym6 ym6Var, String str, Throwable th) {
        if (((Boolean) zzba.zzc().b(g93.E5)).booleanValue() && ym6.RENDERER == ym6Var && this.p.c() != 0) {
            this.p.f(zzt.zzB().b() - this.p.c());
        }
    }

    @Override // com.daaw.fn6
    public final void k(ym6 ym6Var, String str) {
    }
}
