package com.daaw;

import android.database.sqlite.SQLiteProgram;
/* loaded from: classes.dex */
public class m40 implements li1 {

    /* renamed from: p */
    public final SQLiteProgram f18432p;

    public m40(SQLiteProgram sQLiteProgram) {
        this.f18432p = sQLiteProgram;
    }

    @Override // com.daaw.li1
    /* renamed from: F */
    public void mo16232F(int i) {
        this.f18432p.bindNull(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f18432p.close();
    }

    @Override // com.daaw.li1
    /* renamed from: i */
    public void mo16231i(int i, String str) {
        this.f18432p.bindString(i, str);
    }

    @Override // com.daaw.li1
    /* renamed from: m */
    public void mo16230m(int i, double d) {
        this.f18432p.bindDouble(i, d);
    }

    @Override // com.daaw.li1
    /* renamed from: r */
    public void mo16229r(int i, long j) {
        this.f18432p.bindLong(i, j);
    }

    @Override // com.daaw.li1
    /* renamed from: x */
    public void mo16228x(int i, byte[] bArr) {
        this.f18432p.bindBlob(i, bArr);
    }
}
