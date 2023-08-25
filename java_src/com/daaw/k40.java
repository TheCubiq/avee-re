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
    public final Context p;
    public final String q;
    public final ki1.a r;
    public final boolean s;
    public final Object t = new Object();
    public a u;
    public boolean v;

    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {
        public final j40[] p;
        public final ki1.a q;
        public boolean r;

        /* renamed from: com.daaw.k40$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0059a implements DatabaseErrorHandler {
            public final /* synthetic */ ki1.a a;
            public final /* synthetic */ j40[] b;

            public C0059a(ki1.a aVar, j40[] j40VarArr) {
                this.a = aVar;
                this.b = j40VarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.a.c(a.n(this.b, sQLiteDatabase));
            }
        }

        public a(Context context, String str, j40[] j40VarArr, ki1.a aVar) {
            super(context, str, null, aVar.a, new C0059a(aVar, j40VarArr));
            this.q = aVar;
            this.p = j40VarArr;
        }

        public static j40 n(j40[] j40VarArr, SQLiteDatabase sQLiteDatabase) {
            j40 j40Var = j40VarArr[0];
            if (j40Var == null || !j40Var.d(sQLiteDatabase)) {
                j40VarArr[0] = new j40(sQLiteDatabase);
            }
            return j40VarArr[0];
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.p[0] = null;
        }

        public j40 d(SQLiteDatabase sQLiteDatabase) {
            return n(this.p, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.q.b(d(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.q.d(d(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.r = true;
            this.q.e(d(sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.r) {
                return;
            }
            this.q.f(d(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.r = true;
            this.q.g(d(sQLiteDatabase), i, i2);
        }

        public synchronized ji1 q() {
            this.r = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.r) {
                return d(writableDatabase);
            }
            close();
            return q();
        }
    }

    public k40(Context context, String str, ki1.a aVar, boolean z) {
        this.p = context;
        this.q = str;
        this.r = aVar;
        this.s = z;
    }

    @Override // com.daaw.ki1
    public ji1 A() {
        return d().q();
    }

    @Override // com.daaw.ki1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d().close();
    }

    public final a d() {
        a aVar;
        synchronized (this.t) {
            if (this.u == null) {
                j40[] j40VarArr = new j40[1];
                if (Build.VERSION.SDK_INT < 23 || this.q == null || !this.s) {
                    this.u = new a(this.p, this.q, j40VarArr, this.r);
                } else {
                    this.u = new a(this.p, new File(this.p.getNoBackupFilesDir(), this.q).getAbsolutePath(), j40VarArr, this.r);
                }
                this.u.setWriteAheadLoggingEnabled(this.v);
            }
            aVar = this.u;
        }
        return aVar;
    }

    @Override // com.daaw.ki1
    public String getDatabaseName() {
        return this.q;
    }

    @Override // com.daaw.ki1
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.t) {
            a aVar = this.u;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.v = z;
        }
    }
}
