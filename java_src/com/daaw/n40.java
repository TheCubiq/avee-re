package com.daaw;

import android.database.sqlite.SQLiteStatement;
/* loaded from: classes.dex */
public class n40 extends m40 implements ni1 {

    /* renamed from: q */
    public final SQLiteStatement f19457q;

    public n40(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f19457q = sQLiteStatement;
    }

    @Override // com.daaw.ni1
    /* renamed from: S */
    public long mo15166S() {
        return this.f19457q.executeInsert();
    }

    @Override // com.daaw.ni1
    /* renamed from: j */
    public int mo15165j() {
        return this.f19457q.executeUpdateDelete();
    }
}
