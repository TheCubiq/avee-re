package com.daaw;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;
/* loaded from: classes.dex */
public class j40 implements ji1 {
    public static final String[] q = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] r = new String[0];
    public final SQLiteDatabase p;

    /* loaded from: classes.dex */
    public class a implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ mi1 a;

        public a(mi1 mi1Var) {
            this.a = mi1Var;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.d(new m40(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* loaded from: classes.dex */
    public class b implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ mi1 a;

        public b(mi1 mi1Var) {
            this.a = mi1Var;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.d(new m40(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public j40(SQLiteDatabase sQLiteDatabase) {
        this.p = sQLiteDatabase;
    }

    @Override // com.daaw.ji1
    public Cursor B(String str) {
        return I(new id1(str));
    }

    @Override // com.daaw.ji1
    public void C() {
        this.p.endTransaction();
    }

    @Override // com.daaw.ji1
    public String G() {
        return this.p.getPath();
    }

    @Override // com.daaw.ji1
    public boolean H() {
        return this.p.inTransaction();
    }

    @Override // com.daaw.ji1
    public Cursor I(mi1 mi1Var) {
        return this.p.rawQueryWithFactory(new a(mi1Var), mi1Var.n(), r, null);
    }

    @Override // com.daaw.ji1
    public void a() {
        this.p.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.p.close();
    }

    public boolean d(SQLiteDatabase sQLiteDatabase) {
        return this.p == sQLiteDatabase;
    }

    @Override // com.daaw.ji1
    public boolean f() {
        return this.p.isOpen();
    }

    @Override // com.daaw.ji1
    public List<Pair<String, String>> g() {
        return this.p.getAttachedDbs();
    }

    @Override // com.daaw.ji1
    public void h(String str) {
        this.p.execSQL(str);
    }

    @Override // com.daaw.ji1
    public ni1 k(String str) {
        return new n40(this.p.compileStatement(str));
    }

    @Override // com.daaw.ji1
    public void s() {
        this.p.setTransactionSuccessful();
    }

    @Override // com.daaw.ji1
    public void t(String str, Object[] objArr) {
        this.p.execSQL(str, objArr);
    }

    @Override // com.daaw.ji1
    public Cursor z(mi1 mi1Var, CancellationSignal cancellationSignal) {
        return this.p.rawQueryWithFactory(new b(mi1Var), mi1Var.n(), r, null, cancellationSignal);
    }
}
