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

    /* renamed from: com.daaw.ki1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1949a {

        /* renamed from: a */
        public final int f16393a;

        public AbstractC1949a(int i) {
            this.f16393a = i;
        }

        /* renamed from: a */
        public final void m17730a(String str) {
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

        /* renamed from: b */
        public void mo17729b(ji1 ji1Var) {
        }

        /* renamed from: c */
        public void m17728c(ji1 ji1Var) {
            StringBuilder sb = new StringBuilder();
            sb.append("Corruption reported by sqlite on database: ");
            sb.append(ji1Var.mo18502G());
            if (!ji1Var.mo18498f()) {
                m17730a(ji1Var.mo18502G());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = ji1Var.mo18497g();
                } catch (SQLiteException unused) {
                }
                try {
                    ji1Var.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (list != null) {
                    for (Pair<String, String> next : list) {
                        m17730a((String) next.second);
                    }
                } else {
                    m17730a(ji1Var.mo18502G());
                }
            }
        }

        /* renamed from: d */
        public abstract void mo17727d(ji1 ji1Var);

        /* renamed from: e */
        public abstract void mo17726e(ji1 ji1Var, int i, int i2);

        /* renamed from: f */
        public void mo17725f(ji1 ji1Var) {
        }

        /* renamed from: g */
        public abstract void mo17724g(ji1 ji1Var, int i, int i2);
    }

    /* renamed from: com.daaw.ki1$b */
    /* loaded from: classes.dex */
    public static class C1950b {

        /* renamed from: a */
        public final Context f16394a;

        /* renamed from: b */
        public final String f16395b;

        /* renamed from: c */
        public final AbstractC1949a f16396c;

        /* renamed from: d */
        public final boolean f16397d;

        /* renamed from: com.daaw.ki1$b$a */
        /* loaded from: classes.dex */
        public static class C1951a {

            /* renamed from: a */
            public Context f16398a;

            /* renamed from: b */
            public String f16399b;

            /* renamed from: c */
            public AbstractC1949a f16400c;

            /* renamed from: d */
            public boolean f16401d;

            public C1951a(Context context) {
                this.f16398a = context;
            }

            /* renamed from: a */
            public C1950b m17722a() {
                if (this.f16400c != null) {
                    if (this.f16398a != null) {
                        if (this.f16401d && TextUtils.isEmpty(this.f16399b)) {
                            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                        }
                        return new C1950b(this.f16398a, this.f16399b, this.f16400c, this.f16401d);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            /* renamed from: b */
            public C1951a m17721b(AbstractC1949a abstractC1949a) {
                this.f16400c = abstractC1949a;
                return this;
            }

            /* renamed from: c */
            public C1951a m17720c(String str) {
                this.f16399b = str;
                return this;
            }

            /* renamed from: d */
            public C1951a m17719d(boolean z) {
                this.f16401d = z;
                return this;
            }
        }

        public C1950b(Context context, String str, AbstractC1949a abstractC1949a, boolean z) {
            this.f16394a = context;
            this.f16395b = str;
            this.f16396c = abstractC1949a;
            this.f16397d = z;
        }

        /* renamed from: a */
        public static C1951a m17723a(Context context) {
            return new C1951a(context);
        }
    }

    /* renamed from: com.daaw.ki1$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1952c {
        /* renamed from: a */
        ki1 mo13616a(C1950b c1950b);
    }

    /* renamed from: A */
    ji1 mo14533A();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
