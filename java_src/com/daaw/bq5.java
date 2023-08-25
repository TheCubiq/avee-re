package com.daaw;

import android.database.sqlite.SQLiteDatabase;
/* loaded from: classes.dex */
public final class bq5 implements o67 {
    public final /* synthetic */ em6 a;

    public bq5(cq5 cq5Var, em6 em6Var) {
        this.a = em6Var;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            this.a.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            k04.zzg("Error executing function on offline buffered ping database: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        k04.zzg("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }
}
