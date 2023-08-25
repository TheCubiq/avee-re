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

    /* renamed from: q */
    public static final String[] f14235q = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: r */
    public static final String[] f14236r = new String[0];

    /* renamed from: p */
    public final SQLiteDatabase f14237p;

    /* renamed from: com.daaw.j40$a */
    /* loaded from: classes.dex */
    public class C1783a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        public final /* synthetic */ mi1 f14238a;

        public C1783a(mi1 mi1Var) {
            this.f14238a = mi1Var;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f14238a.mo16024d(new m40(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* renamed from: com.daaw.j40$b */
    /* loaded from: classes.dex */
    public class C1784b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        public final /* synthetic */ mi1 f14240a;

        public C1784b(mi1 mi1Var) {
            this.f14240a = mi1Var;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f14240a.mo16024d(new m40(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public j40(SQLiteDatabase sQLiteDatabase) {
        this.f14237p = sQLiteDatabase;
    }

    @Override // com.daaw.ji1
    /* renamed from: B */
    public Cursor mo18504B(String str) {
        return mo18500I(new id1(str));
    }

    @Override // com.daaw.ji1
    /* renamed from: C */
    public void mo18503C() {
        this.f14237p.endTransaction();
    }

    @Override // com.daaw.ji1
    /* renamed from: G */
    public String mo18502G() {
        return this.f14237p.getPath();
    }

    @Override // com.daaw.ji1
    /* renamed from: H */
    public boolean mo18501H() {
        return this.f14237p.inTransaction();
    }

    @Override // com.daaw.ji1
    /* renamed from: I */
    public Cursor mo18500I(mi1 mi1Var) {
        return this.f14237p.rawQueryWithFactory(new C1783a(mi1Var), mi1Var.mo16023n(), f14236r, null);
    }

    @Override // com.daaw.ji1
    /* renamed from: a */
    public void mo18499a() {
        this.f14237p.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14237p.close();
    }

    /* renamed from: d */
    public boolean m19091d(SQLiteDatabase sQLiteDatabase) {
        return this.f14237p == sQLiteDatabase;
    }

    @Override // com.daaw.ji1
    /* renamed from: f */
    public boolean mo18498f() {
        return this.f14237p.isOpen();
    }

    @Override // com.daaw.ji1
    /* renamed from: g */
    public List<Pair<String, String>> mo18497g() {
        return this.f14237p.getAttachedDbs();
    }

    @Override // com.daaw.ji1
    /* renamed from: h */
    public void mo18496h(String str) {
        this.f14237p.execSQL(str);
    }

    @Override // com.daaw.ji1
    /* renamed from: k */
    public ni1 mo18495k(String str) {
        return new n40(this.f14237p.compileStatement(str));
    }

    @Override // com.daaw.ji1
    /* renamed from: s */
    public void mo18494s() {
        this.f14237p.setTransactionSuccessful();
    }

    @Override // com.daaw.ji1
    /* renamed from: t */
    public void mo18493t(String str, Object[] objArr) {
        this.f14237p.execSQL(str, objArr);
    }

    @Override // com.daaw.ji1
    /* renamed from: z */
    public Cursor mo18492z(mi1 mi1Var, CancellationSignal cancellationSignal) {
        return this.f14237p.rawQueryWithFactory(new C1784b(mi1Var), mi1Var.mo16023n(), f14236r, null, cancellationSignal);
    }
}
