package com.daaw;

import android.database.sqlite.SQLiteProgram;
/* loaded from: classes.dex */
public class m40 implements li1 {
    public final SQLiteProgram p;

    public m40(SQLiteProgram sQLiteProgram) {
        this.p = sQLiteProgram;
    }

    @Override // com.daaw.li1
    public void F(int i) {
        this.p.bindNull(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.p.close();
    }

    @Override // com.daaw.li1
    public void i(int i, String str) {
        this.p.bindString(i, str);
    }

    @Override // com.daaw.li1
    public void m(int i, double d) {
        this.p.bindDouble(i, d);
    }

    @Override // com.daaw.li1
    public void r(int i, long j) {
        this.p.bindLong(i, j);
    }

    @Override // com.daaw.li1
    public void x(int i, byte[] bArr) {
        this.p.bindBlob(i, bArr);
    }
}
