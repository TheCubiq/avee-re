package com.daaw;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.daaw.ki1;
import java.io.File;
/* loaded from: classes.dex */
public class k40 implements ki1 {

    /* renamed from: p */
    public final Context f15645p;

    /* renamed from: q */
    public final String f15646q;

    /* renamed from: r */
    public final ki1.AbstractC1949a f15647r;

    /* renamed from: s */
    public final boolean f15648s;

    /* renamed from: t */
    public final Object f15649t = new Object();

    /* renamed from: u */
    public C1910a f15650u;

    /* renamed from: v */
    public boolean f15651v;

    /* renamed from: com.daaw.k40$a */
    /* loaded from: classes.dex */
    public static class C1910a extends SQLiteOpenHelper {

        /* renamed from: p */
        public final j40[] f15652p;

        /* renamed from: q */
        public final ki1.AbstractC1949a f15653q;

        /* renamed from: r */
        public boolean f15654r;

        /* renamed from: com.daaw.k40$a$a */
        /* loaded from: classes.dex */
        public class C1911a implements DatabaseErrorHandler {

            /* renamed from: a */
            public final /* synthetic */ ki1.AbstractC1949a f15655a;

            /* renamed from: b */
            public final /* synthetic */ j40[] f15656b;

            public C1911a(ki1.AbstractC1949a abstractC1949a, j40[] j40VarArr) {
                this.f15655a = abstractC1949a;
                this.f15656b = j40VarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f15655a.m17728c(C1910a.m18054n(this.f15656b, sQLiteDatabase));
            }
        }

        public C1910a(Context context, String str, j40[] j40VarArr, ki1.AbstractC1949a abstractC1949a) {
            super(context, str, null, abstractC1949a.f16393a, new C1911a(abstractC1949a, j40VarArr));
            this.f15653q = abstractC1949a;
            this.f15652p = j40VarArr;
        }

        /* renamed from: n */
        public static j40 m18054n(j40[] j40VarArr, SQLiteDatabase sQLiteDatabase) {
            j40 j40Var = j40VarArr[0];
            if (j40Var == null || !j40Var.m19091d(sQLiteDatabase)) {
                j40VarArr[0] = new j40(sQLiteDatabase);
            }
            return j40VarArr[0];
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f15652p[0] = null;
        }

        /* renamed from: d */
        public j40 m18055d(SQLiteDatabase sQLiteDatabase) {
            return m18054n(this.f15652p, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f15653q.mo17729b(m18055d(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f15653q.mo17727d(m18055d(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f15654r = true;
            this.f15653q.mo17726e(m18055d(sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f15654r) {
                return;
            }
            this.f15653q.mo17725f(m18055d(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f15654r = true;
            this.f15653q.mo17724g(m18055d(sQLiteDatabase), i, i2);
        }

        /* renamed from: q */
        public synchronized ji1 m18053q() {
            this.f15654r = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f15654r) {
                return m18055d(writableDatabase);
            }
            close();
            return m18053q();
        }
    }

    public k40(Context context, String str, ki1.AbstractC1949a abstractC1949a, boolean z) {
        this.f15645p = context;
        this.f15646q = str;
        this.f15647r = abstractC1949a;
        this.f15648s = z;
    }

    @Override // com.daaw.ki1
    /* renamed from: A */
    public ji1 mo14533A() {
        return m18056d().m18053q();
    }

    @Override // com.daaw.ki1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m18056d().close();
    }

    /* renamed from: d */
    public final C1910a m18056d() {
        C1910a c1910a;
        synchronized (this.f15649t) {
            if (this.f15650u == null) {
                j40[] j40VarArr = new j40[1];
                if (Build.VERSION.SDK_INT < 23 || this.f15646q == null || !this.f15648s) {
                    this.f15650u = new C1910a(this.f15645p, this.f15646q, j40VarArr, this.f15647r);
                } else {
                    this.f15650u = new C1910a(this.f15645p, new File(this.f15645p.getNoBackupFilesDir(), this.f15646q).getAbsolutePath(), j40VarArr, this.f15647r);
                }
                this.f15650u.setWriteAheadLoggingEnabled(this.f15651v);
            }
            c1910a = this.f15650u;
        }
        return c1910a;
    }

    @Override // com.daaw.ki1
    public String getDatabaseName() {
        return this.f15646q;
    }

    @Override // com.daaw.ki1
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f15649t) {
            C1910a c1910a = this.f15650u;
            if (c1910a != null) {
                c1910a.setWriteAheadLoggingEnabled(z);
            }
            this.f15651v = z;
        }
    }
}
