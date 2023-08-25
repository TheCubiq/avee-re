package com.daaw;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public interface ki1 extends Closeable {

    /* loaded from: classes.dex */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("deleting the database file: ");
            sb.append(str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception unused) {
            }
        }

        public void b(ji1 ji1Var) {
        }

        public void c(ji1 ji1Var) {
            StringBuilder sb = new StringBuilder();
            sb.append("Corruption reported by sqlite on database: ");
            sb.append(ji1Var.G());
            if (!ji1Var.f()) {
                a(ji1Var.G());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = ji1Var.g();
                } catch (SQLiteException unused) {
                }
                try {
                    ji1Var.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (list != null) {
                    for (Pair<String, String> next : list) {
                        a((String) next.second);
                    }
                } else {
                    a(ji1Var.G());
                }
            }
        }

        public abstract void d(ji1 ji1Var);

        public abstract void e(ji1 ji1Var, int i, int i2);

        public void f(ji1 ji1Var) {
        }

        public abstract void g(ji1 ji1Var, int i, int i2);
    }

    /* loaded from: classes.dex */
    public static class b {
        public final Context a;
        public final String b;
        public final a c;
        public final boolean d;

        /* loaded from: classes.dex */
        public static class a {
            public Context a;
            public String b;
            public a c;
            public boolean d;

            public a(Context context) {
                this.a = context;
            }

            public b a() {
                if (this.c != null) {
                    if (this.a != null) {
                        if (this.d && TextUtils.isEmpty(this.b)) {
                            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                        }
                        return new b(this.a, this.b, this.c, this.d);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            public a b(a aVar) {
                this.c = aVar;
                return this;
            }

            public a c(String str) {
                this.b = str;
                return this;
            }

            public a d(boolean z) {
                this.d = z;
                return this;
            }
        }

        public b(Context context, String str, a aVar, boolean z) {
            this.a = context;
            this.b = str;
            this.c = aVar;
            this.d = z;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        ki1 a(b bVar);
    }

    ji1 A();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
