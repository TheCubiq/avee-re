package com.daaw;

import android.database.sqlite.SQLiteStatement;
/* loaded from: classes.dex */
public class n40 extends m40 implements ni1 {
    public final SQLiteStatement q;

    public n40(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.q = sQLiteStatement;
    }

    @Override // com.daaw.ni1
    public long S() {
        return this.q.executeInsert();
    }

    @Override // com.daaw.ni1
    public int j() {
        return this.q.executeUpdateDelete();
    }
}
