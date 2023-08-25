package com.daaw;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import com.daaw.ki1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes.dex */
public abstract class b61 {
    @Deprecated
    public volatile ji1 a;
    public Executor b;
    public Executor c;
    public ki1 d;
    public boolean f;
    public boolean g;
    @Deprecated
    public List<b> h;
    public final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    public final ThreadLocal<Integer> j = new ThreadLocal<>();
    public final Map<String, Object> k = new ConcurrentHashMap();
    public final androidx.room.c e = e();

    /* loaded from: classes.dex */
    public static class a<T extends b61> {
        public final Class<T> a;
        public final String b;
        public final Context c;
        public ArrayList<b> d;
        public Executor e;
        public Executor f;
        public ki1.c g;
        public boolean h;
        public boolean j;
        public boolean l;
        public Set<Integer> n;
        public Set<Integer> o;
        public String p;
        public File q;
        public c i = c.AUTOMATIC;
        public boolean k = true;
        public final d m = new d();

        public a(Context context, Class<T> cls, String str) {
            this.c = context;
            this.a = cls;
            this.b = str;
        }

        public a<T> a(b bVar) {
            if (this.d == null) {
                this.d = new ArrayList<>();
            }
            this.d.add(bVar);
            return this;
        }

        public a<T> b(gq0... gq0VarArr) {
            if (this.o == null) {
                this.o = new HashSet();
            }
            for (gq0 gq0Var : gq0VarArr) {
                this.o.add(Integer.valueOf(gq0Var.a));
                this.o.add(Integer.valueOf(gq0Var.b));
            }
            this.m.b(gq0VarArr);
            return this;
        }

        public a<T> c() {
            this.h = true;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
            if (r1 != null) goto L10;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
        @android.annotation.SuppressLint({"RestrictedApi"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public T d() {
            /*
                Method dump skipped, instructions count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.b61.a.d():com.daaw.b61");
        }

        public a<T> e() {
            this.k = false;
            this.l = true;
            return this;
        }

        public a<T> f(ki1.c cVar) {
            this.g = cVar;
            return this;
        }

        public a<T> g(Executor executor) {
            this.e = executor;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(ji1 ji1Var) {
        }

        public void b(ji1 ji1Var) {
        }

        public void c(ji1 ji1Var) {
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public static boolean a(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        @SuppressLint({"NewApi"})
        public c b(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || a(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public HashMap<Integer, TreeMap<Integer, gq0>> a = new HashMap<>();

        public final void a(gq0 gq0Var) {
            int i = gq0Var.a;
            int i2 = gq0Var.b;
            TreeMap<Integer, gq0> treeMap = this.a.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.a.put(Integer.valueOf(i), treeMap);
            }
            gq0 gq0Var2 = treeMap.get(Integer.valueOf(i2));
            if (gq0Var2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Overriding migration ");
                sb.append(gq0Var2);
                sb.append(" with ");
                sb.append(gq0Var);
            }
            treeMap.put(Integer.valueOf(i2), gq0Var);
        }

        public void b(gq0... gq0VarArr) {
            for (gq0 gq0Var : gq0VarArr) {
                a(gq0Var);
            }
        }

        public List<gq0> c(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i2 > i, i, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<com.daaw.gq0> d(java.util.List<com.daaw.gq0> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L58
                goto L7
            L5:
                if (r9 <= r10) goto L58
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, com.daaw.gq0>> r0 = r6.a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L54
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = 1
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                r7.add(r9)
                r9 = r3
                goto L55
            L54:
                r4 = 0
            L55:
                if (r4 != 0) goto L0
                return r1
            L58:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.b61.d.d(java.util.List, boolean, int, int):java.util.List");
        }
    }

    public static boolean n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void a() {
        if (!this.f && n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!k() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        ji1 A = this.d.A();
        this.e.m(A);
        A.a();
    }

    public ni1 d(String str) {
        a();
        b();
        return this.d.A().k(str);
    }

    public abstract androidx.room.c e();

    public abstract ki1 f(sp spVar);

    @Deprecated
    public void g() {
        this.d.A().C();
        if (k()) {
            return;
        }
        this.e.f();
    }

    public Lock h() {
        return this.i.readLock();
    }

    public ki1 i() {
        return this.d;
    }

    public Executor j() {
        return this.b;
    }

    public boolean k() {
        return this.d.A().H();
    }

    public void l(sp spVar) {
        ki1 f = f(spVar);
        this.d = f;
        if (f instanceof o61) {
            ((o61) f).n(spVar);
        }
        boolean z = spVar.g == c.WRITE_AHEAD_LOGGING;
        this.d.setWriteAheadLoggingEnabled(z);
        this.h = spVar.e;
        this.b = spVar.h;
        this.c = new zm1(spVar.i);
        this.f = spVar.f;
        this.g = z;
        if (spVar.j) {
            this.e.i(spVar.b, spVar.c);
        }
    }

    public void m(ji1 ji1Var) {
        this.e.d(ji1Var);
    }

    public boolean o() {
        ji1 ji1Var = this.a;
        return ji1Var != null && ji1Var.f();
    }

    public Cursor p(mi1 mi1Var) {
        return q(mi1Var, null);
    }

    public Cursor q(mi1 mi1Var, CancellationSignal cancellationSignal) {
        a();
        b();
        return cancellationSignal != null ? this.d.A().z(mi1Var, cancellationSignal) : this.d.A().I(mi1Var);
    }

    @Deprecated
    public void r() {
        this.d.A().s();
    }
}
