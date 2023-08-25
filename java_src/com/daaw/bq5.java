package com.daaw;

import android.database.sqlite.SQLiteDatabase;
/* loaded from: classes.dex */
public final class bq5 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ em6 f5060a;

    public bq5(cq5 cq5Var, em6 em6Var) {
        this.f5060a = em6Var;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2151a(Object obj) {
        try {
            this.f5060a.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            k04.zzg("Error executing function on offline buffered ping database: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        k04.zzg("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }
}
