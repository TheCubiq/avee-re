package com.daaw;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import androidx.room.C0471c;
import com.daaw.ki1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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

    /* renamed from: a */
    public volatile ji1 f4324a;

    /* renamed from: b */
    public Executor f4325b;

    /* renamed from: c */
    public Executor f4326c;

    /* renamed from: d */
    public ki1 f4327d;

    /* renamed from: f */
    public boolean f4329f;

    /* renamed from: g */
    public boolean f4330g;
    @Deprecated

    /* renamed from: h */
    public List<AbstractC0818b> f4331h;

    /* renamed from: i */
    public final ReentrantReadWriteLock f4332i = new ReentrantReadWriteLock();

    /* renamed from: j */
    public final ThreadLocal<Integer> f4333j = new ThreadLocal<>();

    /* renamed from: k */
    public final Map<String, Object> f4334k = new ConcurrentHashMap();

    /* renamed from: e */
    public final C0471c f4328e = mo26479e();

    /* renamed from: com.daaw.b61$a */
    /* loaded from: classes.dex */
    public static class C0817a<T extends b61> {

        /* renamed from: a */
        public final Class<T> f4335a;

        /* renamed from: b */
        public final String f4336b;

        /* renamed from: c */
        public final Context f4337c;

        /* renamed from: d */
        public ArrayList<AbstractC0818b> f4338d;

        /* renamed from: e */
        public Executor f4339e;

        /* renamed from: f */
        public Executor f4340f;

        /* renamed from: g */
        public ki1.InterfaceC1952c f4341g;

        /* renamed from: h */
        public boolean f4342h;

        /* renamed from: j */
        public boolean f4344j;

        /* renamed from: l */
        public boolean f4346l;

        /* renamed from: n */
        public Set<Integer> f4348n;

        /* renamed from: o */
        public Set<Integer> f4349o;

        /* renamed from: p */
        public String f4350p;

        /* renamed from: q */
        public File f4351q;

        /* renamed from: i */
        public EnumC0819c f4343i = EnumC0819c.AUTOMATIC;

        /* renamed from: k */
        public boolean f4345k = true;

        /* renamed from: m */
        public final C0820d f4347m = new C0820d();

        public C0817a(Context context, Class<T> cls, String str) {
            this.f4337c = context;
            this.f4335a = cls;
            this.f4336b = str;
        }

        /* renamed from: a */
        public C0817a<T> m26465a(AbstractC0818b abstractC0818b) {
            if (this.f4338d == null) {
                this.f4338d = new ArrayList<>();
            }
            this.f4338d.add(abstractC0818b);
            return this;
        }

        /* renamed from: b */
        public C0817a<T> m26464b(gq0... gq0VarArr) {
            if (this.f4349o == null) {
                this.f4349o = new HashSet();
            }
            for (gq0 gq0Var : gq0VarArr) {
                this.f4349o.add(Integer.valueOf(gq0Var.f11568a));
                this.f4349o.add(Integer.valueOf(gq0Var.f11569b));
            }
            this.f4347m.m26452b(gq0VarArr);
            return this;
        }

        /* renamed from: c */
        public C0817a<T> m26463c() {
            this.f4342h = true;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
            if (r1 != null) goto L10;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
        @SuppressLint({"RestrictedApi"})
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public T m26462d() {
            Executor executor;
            Set<Integer> set;
            String str;
            if (this.f4337c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.f4335a == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            Executor executor2 = this.f4339e;
            if (executor2 != null || this.f4340f != null) {
                if (executor2 != null && this.f4340f == null) {
                    this.f4340f = executor2;
                } else if (executor2 == null) {
                    executor = this.f4340f;
                }
                set = this.f4349o;
                if (set != null && this.f4348n != null) {
                    for (Integer num : set) {
                        if (this.f4348n.contains(num)) {
                            throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                        }
                    }
                }
                if (this.f4341g == null) {
                    this.f4341g = new l40();
                }
                str = this.f4350p;
                if (str == null || this.f4351q != null) {
                    if (this.f4336b != null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    if (str != null && this.f4351q != null) {
                        throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                    }
                    this.f4341g = new p61(str, this.f4351q, this.f4341g);
                }
                Context context = this.f4337c;
                C2963sp c2963sp = new C2963sp(context, this.f4336b, this.f4341g, this.f4347m, this.f4338d, this.f4342h, this.f4343i.m26454b(context), this.f4339e, this.f4340f, this.f4344j, this.f4345k, this.f4346l, this.f4348n, this.f4350p, this.f4351q);
                T t = (T) a61.m27598b(this.f4335a, "_Impl");
                t.m26472l(c2963sp);
                return t;
            }
            executor = C2825r5.m11734d();
            this.f4340f = executor;
            this.f4339e = executor;
            set = this.f4349o;
            if (set != null) {
                while (r1.hasNext()) {
                }
            }
            if (this.f4341g == null) {
            }
            str = this.f4350p;
            if (str == null) {
            }
            if (this.f4336b != null) {
            }
        }

        /* renamed from: e */
        public C0817a<T> m26461e() {
            this.f4345k = false;
            this.f4346l = true;
            return this;
        }

        /* renamed from: f */
        public C0817a<T> m26460f(ki1.InterfaceC1952c interfaceC1952c) {
            this.f4341g = interfaceC1952c;
            return this;
        }

        /* renamed from: g */
        public C0817a<T> m26459g(Executor executor) {
            this.f4339e = executor;
            return this;
        }
    }

    /* renamed from: com.daaw.b61$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0818b {
        /* renamed from: a */
        public void m26458a(ji1 ji1Var) {
        }

        /* renamed from: b */
        public void m26457b(ji1 ji1Var) {
        }

        /* renamed from: c */
        public void mo26456c(ji1 ji1Var) {
        }
    }

    /* renamed from: com.daaw.b61$c */
    /* loaded from: classes.dex */
    public enum EnumC0819c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: a */
        public static boolean m26455a(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        @SuppressLint({"NewApi"})
        /* renamed from: b */
        public EnumC0819c m26454b(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || m26455a(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* renamed from: com.daaw.b61$d */
    /* loaded from: classes.dex */
    public static class C0820d {

        /* renamed from: a */
        public HashMap<Integer, TreeMap<Integer, gq0>> f4356a = new HashMap<>();

        /* renamed from: a */
        public final void m26453a(gq0 gq0Var) {
            int i = gq0Var.f11568a;
            int i2 = gq0Var.f11569b;
            TreeMap<Integer, gq0> treeMap = this.f4356a.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f4356a.put(Integer.valueOf(i), treeMap);
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

        /* renamed from: b */
        public void m26452b(gq0... gq0VarArr) {
            for (gq0 gq0Var : gq0VarArr) {
                m26453a(gq0Var);
            }
        }

        /* renamed from: c */
        public List<gq0> m26451c(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return m26450d(new ArrayList(), i2 > i, i, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<gq0> m26450d(List<gq0> list, boolean z, int i, int i2) {
            TreeMap<Integer, gq0> treeMap;
            boolean z2;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                    treeMap = this.f4356a.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        Iterator<Integer> it = (z ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                        while (true) {
                            z2 = true;
                            boolean z3 = false;
                            if (!it.hasNext()) {
                                z2 = false;
                                continue;
                                break;
                            }
                            int intValue = it.next().intValue();
                            if (!z ? !(intValue < i2 || intValue >= i) : !(intValue > i2 || intValue <= i)) {
                                z3 = true;
                                continue;
                            }
                            if (z3) {
                                list.add(treeMap.get(Integer.valueOf(intValue)));
                                i = intValue;
                                continue;
                                break;
                            }
                        }
                    } else {
                        return null;
                    }
                } else {
                    if (i <= i2) {
                        return list;
                    }
                    treeMap = this.f4356a.get(Integer.valueOf(i));
                    if (treeMap == null) {
                    }
                }
            } while (z2);
            return null;
        }
    }

    /* renamed from: n */
    public static boolean m26470n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: a */
    public void m26483a() {
        if (!this.f4329f && m26470n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: b */
    public void m26482b() {
        if (!m26473k() && this.f4333j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    /* renamed from: c */
    public void m26481c() {
        m26483a();
        ji1 mo14533A = this.f4327d.mo14533A();
        this.f4328e.m28074m(mo14533A);
        mo14533A.mo18499a();
    }

    /* renamed from: d */
    public ni1 m26480d(String str) {
        m26483a();
        m26482b();
        return this.f4327d.mo14533A().mo18495k(str);
    }

    /* renamed from: e */
    public abstract C0471c mo26479e();

    /* renamed from: f */
    public abstract ki1 mo26478f(C2963sp c2963sp);

    @Deprecated
    /* renamed from: g */
    public void m26477g() {
        this.f4327d.mo14533A().mo18503C();
        if (m26473k()) {
            return;
        }
        this.f4328e.m28081f();
    }

    /* renamed from: h */
    public Lock m26476h() {
        return this.f4332i.readLock();
    }

    /* renamed from: i */
    public ki1 m26475i() {
        return this.f4327d;
    }

    /* renamed from: j */
    public Executor m26474j() {
        return this.f4325b;
    }

    /* renamed from: k */
    public boolean m26473k() {
        return this.f4327d.mo14533A().mo18501H();
    }

    /* renamed from: l */
    public void m26472l(C2963sp c2963sp) {
        ki1 mo26478f = mo26478f(c2963sp);
        this.f4327d = mo26478f;
        if (mo26478f instanceof o61) {
            ((o61) mo26478f).m14531n(c2963sp);
        }
        boolean z = c2963sp.f26470g == EnumC0819c.WRITE_AHEAD_LOGGING;
        this.f4327d.setWriteAheadLoggingEnabled(z);
        this.f4331h = c2963sp.f26468e;
        this.f4325b = c2963sp.f26471h;
        this.f4326c = new zm1(c2963sp.f26472i);
        this.f4329f = c2963sp.f26469f;
        this.f4330g = z;
        if (c2963sp.f26473j) {
            this.f4328e.m28078i(c2963sp.f26465b, c2963sp.f26466c);
        }
    }

    /* renamed from: m */
    public void m26471m(ji1 ji1Var) {
        this.f4328e.m28083d(ji1Var);
    }

    /* renamed from: o */
    public boolean m26469o() {
        ji1 ji1Var = this.f4324a;
        return ji1Var != null && ji1Var.mo18498f();
    }

    /* renamed from: p */
    public Cursor m26468p(mi1 mi1Var) {
        return m26467q(mi1Var, null);
    }

    /* renamed from: q */
    public Cursor m26467q(mi1 mi1Var, CancellationSignal cancellationSignal) {
        m26483a();
        m26482b();
        return cancellationSignal != null ? this.f4327d.mo14533A().mo18492z(mi1Var, cancellationSignal) : this.f4327d.mo14533A().mo18500I(mi1Var);
    }

    @Deprecated
    /* renamed from: r */
    public void m26466r() {
        this.f4327d.mo14533A().mo18494s();
    }
}
