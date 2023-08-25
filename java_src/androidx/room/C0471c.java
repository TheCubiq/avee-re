package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.daaw.b61;
import com.daaw.id1;
import com.daaw.ji1;
import com.daaw.ni1;
import com.daaw.v71;
import com.daaw.zg0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
/* renamed from: androidx.room.c */
/* loaded from: classes.dex */
public class C0471c {

    /* renamed from: m */
    public static final String[] f2286m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b */
    public final String[] f2288b;

    /* renamed from: c */
    public Map<String, Set<String>> f2289c;

    /* renamed from: d */
    public final b61 f2290d;

    /* renamed from: g */
    public volatile ni1 f2293g;

    /* renamed from: h */
    public C0473b f2294h;

    /* renamed from: i */
    public final zg0 f2295i;

    /* renamed from: k */
    public C0476d f2297k;

    /* renamed from: e */
    public AtomicBoolean f2291e = new AtomicBoolean(false);

    /* renamed from: f */
    public volatile boolean f2292f = false;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: j */
    public final v71<AbstractC0474c, C0475d> f2296j = new v71<>();

    /* renamed from: l */
    public Runnable f2298l = new RunnableC0472a();

    /* renamed from: a */
    public final HashMap<String, Integer> f2287a = new HashMap<>();

    /* renamed from: androidx.room.c$a */
    /* loaded from: classes.dex */
    public class RunnableC0472a implements Runnable {
        public RunnableC0472a() {
        }

        /* renamed from: a */
        public final Set<Integer> m28073a() {
            HashSet hashSet = new HashSet();
            Cursor m26468p = C0471c.this.f2290d.m26468p(new id1("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (m26468p.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(m26468p.getInt(0)));
                } catch (Throwable th) {
                    m26468p.close();
                    throw th;
                }
            }
            m26468p.close();
            if (!hashSet.isEmpty()) {
                C0471c.this.f2293g.mo15165j();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock m26476h = C0471c.this.f2290d.m26476h();
            Set<Integer> set = null;
            try {
                m26476h.lock();
            } catch (SQLiteException | IllegalStateException unused) {
            } catch (Throwable th) {
                m26476h.unlock();
                throw th;
            }
            if (!C0471c.this.m28084c()) {
                m26476h.unlock();
            } else if (!C0471c.this.f2291e.compareAndSet(true, false)) {
                m26476h.unlock();
            } else if (C0471c.this.f2290d.m26473k()) {
                m26476h.unlock();
            } else {
                b61 b61Var = C0471c.this.f2290d;
                if (b61Var.f4330g) {
                    ji1 mo14533A = b61Var.m26475i().mo14533A();
                    mo14533A.mo18499a();
                    try {
                        set = m28073a();
                        mo14533A.mo18494s();
                        mo14533A.mo18503C();
                    } catch (Throwable th2) {
                        mo14533A.mo18503C();
                        throw th2;
                    }
                } else {
                    set = m28073a();
                }
                m26476h.unlock();
                if (set == null || set.isEmpty()) {
                    return;
                }
                synchronized (C0471c.this.f2296j) {
                    Iterator<Map.Entry<AbstractC0474c, C0475d>> it = C0471c.this.f2296j.iterator();
                    while (it.hasNext()) {
                        it.next().getValue().m28068a(set);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.room.c$b */
    /* loaded from: classes.dex */
    public static class C0473b {

        /* renamed from: a */
        public final long[] f2300a;

        /* renamed from: b */
        public final boolean[] f2301b;

        /* renamed from: c */
        public final int[] f2302c;

        /* renamed from: d */
        public boolean f2303d;

        /* renamed from: e */
        public boolean f2304e;

        public C0473b(int i) {
            long[] jArr = new long[i];
            this.f2300a = jArr;
            boolean[] zArr = new boolean[i];
            this.f2301b = zArr;
            this.f2302c = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        /* renamed from: a */
        public int[] m28072a() {
            synchronized (this) {
                if (this.f2303d && !this.f2304e) {
                    int length = this.f2300a.length;
                    int i = 0;
                    while (true) {
                        int i2 = 1;
                        if (i >= length) {
                            this.f2304e = true;
                            this.f2303d = false;
                            return this.f2302c;
                        }
                        boolean z = this.f2300a[i] > 0;
                        boolean[] zArr = this.f2301b;
                        if (z != zArr[i]) {
                            int[] iArr = this.f2302c;
                            if (!z) {
                                i2 = 2;
                            }
                            iArr[i] = i2;
                        } else {
                            this.f2302c[i] = 0;
                        }
                        zArr[i] = z;
                        i++;
                    }
                }
                return null;
            }
        }

        /* renamed from: b */
        public boolean m28071b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f2300a;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        this.f2303d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* renamed from: c */
        public boolean m28070c(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f2300a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        this.f2303d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* renamed from: d */
        public void m28069d() {
            synchronized (this) {
                this.f2304e = false;
            }
        }
    }

    /* renamed from: androidx.room.c$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0474c {

        /* renamed from: a */
        public final String[] f2305a;

        public AbstractC0474c(String[] strArr) {
            this.f2305a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* renamed from: a */
        public boolean mo28065a() {
            return false;
        }

        /* renamed from: b */
        public abstract void mo28064b(Set<String> set);
    }

    /* renamed from: androidx.room.c$d */
    /* loaded from: classes.dex */
    public static class C0475d {

        /* renamed from: a */
        public final int[] f2306a;

        /* renamed from: b */
        public final String[] f2307b;

        /* renamed from: c */
        public final AbstractC0474c f2308c;

        /* renamed from: d */
        public final Set<String> f2309d;

        public C0475d(AbstractC0474c abstractC0474c, int[] iArr, String[] strArr) {
            Set<String> set;
            this.f2308c = abstractC0474c;
            this.f2306a = iArr;
            this.f2307b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                set = Collections.unmodifiableSet(hashSet);
            } else {
                set = null;
            }
            this.f2309d = set;
        }

        /* renamed from: a */
        public void m28068a(Set<Integer> set) {
            int length = this.f2306a.length;
            Set<String> set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.f2306a[i]))) {
                    if (length == 1) {
                        set2 = this.f2309d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.f2307b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.f2308c.mo28064b(set2);
            }
        }

        /* renamed from: b */
        public void m28067b(String[] strArr) {
            Set<String> set = null;
            if (this.f2307b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.f2307b[0])) {
                        set = this.f2309d;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f2307b;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            String str2 = strArr2[i2];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i2++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f2308c.mo28064b(set);
            }
        }
    }

    public C0471c(b61 b61Var, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f2290d = b61Var;
        this.f2294h = new C0473b(strArr.length);
        this.f2289c = map2;
        this.f2295i = new zg0(b61Var);
        int length = strArr.length;
        this.f2288b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f2287a.put(lowerCase, Integer.valueOf(i));
            String str2 = map.get(strArr[i]);
            if (str2 != null) {
                this.f2288b[i] = str2.toLowerCase(locale);
            } else {
                this.f2288b[i] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            if (this.f2287a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f2287a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    /* renamed from: b */
    public static void m28085b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public void m28086a(AbstractC0474c abstractC0474c) {
        C0475d mo7370k;
        String[] m28079h = m28079h(abstractC0474c.f2305a);
        int[] iArr = new int[m28079h.length];
        int length = m28079h.length;
        for (int i = 0; i < length; i++) {
            Integer num = this.f2287a.get(m28079h[i].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + m28079h[i]);
            }
            iArr[i] = num.intValue();
        }
        C0475d c0475d = new C0475d(abstractC0474c, iArr, m28079h);
        synchronized (this.f2296j) {
            mo7370k = this.f2296j.mo7370k(abstractC0474c, c0475d);
        }
        if (mo7370k == null && this.f2294h.m28071b(iArr)) {
            m28075l();
        }
    }

    /* renamed from: c */
    public boolean m28084c() {
        if (this.f2290d.m26469o()) {
            if (!this.f2292f) {
                this.f2290d.m26475i().mo14533A();
            }
            return this.f2292f;
        }
        return false;
    }

    /* renamed from: d */
    public void m28083d(ji1 ji1Var) {
        synchronized (this) {
            if (this.f2292f) {
                return;
            }
            ji1Var.mo18496h("PRAGMA temp_store = MEMORY;");
            ji1Var.mo18496h("PRAGMA recursive_triggers='ON';");
            ji1Var.mo18496h("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m28074m(ji1Var);
            this.f2293g = ji1Var.mo18495k("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f2292f = true;
        }
    }

    /* renamed from: e */
    public void m28082e(String... strArr) {
        synchronized (this.f2296j) {
            Iterator<Map.Entry<AbstractC0474c, C0475d>> it = this.f2296j.iterator();
            while (it.hasNext()) {
                Map.Entry<AbstractC0474c, C0475d> next = it.next();
                if (!next.getKey().mo28065a()) {
                    next.getValue().m28067b(strArr);
                }
            }
        }
    }

    /* renamed from: f */
    public void m28081f() {
        if (this.f2291e.compareAndSet(false, true)) {
            this.f2290d.m26474j().execute(this.f2298l);
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: g */
    public void m28080g(AbstractC0474c abstractC0474c) {
        C0475d mo7369m;
        synchronized (this.f2296j) {
            mo7369m = this.f2296j.mo7369m(abstractC0474c);
        }
        if (mo7369m == null || !this.f2294h.m28070c(mo7369m.f2306a)) {
            return;
        }
        m28075l();
    }

    /* renamed from: h */
    public final String[] m28079h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f2289c.containsKey(lowerCase)) {
                hashSet.addAll(this.f2289c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: i */
    public void m28078i(Context context, String str) {
        this.f2297k = new C0476d(context, str, this, this.f2290d.m26474j());
    }

    /* renamed from: j */
    public final void m28077j(ji1 ji1Var, int i) {
        String[] strArr;
        ji1Var.mo18496h("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f2288b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f2286m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m28085b(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            ji1Var.mo18496h(sb.toString());
        }
    }

    /* renamed from: k */
    public final void m28076k(ji1 ji1Var, int i) {
        String[] strArr;
        String str = this.f2288b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f2286m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m28085b(sb, str, str2);
            ji1Var.mo18496h(sb.toString());
        }
    }

    /* renamed from: l */
    public void m28075l() {
        if (this.f2290d.m26469o()) {
            m28074m(this.f2290d.m26475i().mo14533A());
        }
    }

    /* renamed from: m */
    public void m28074m(ji1 ji1Var) {
        if (ji1Var.mo18501H()) {
            return;
        }
        while (true) {
            try {
                Lock m26476h = this.f2290d.m26476h();
                m26476h.lock();
                int[] m28072a = this.f2294h.m28072a();
                if (m28072a == null) {
                    m26476h.unlock();
                    return;
                }
                int length = m28072a.length;
                ji1Var.mo18499a();
                for (int i = 0; i < length; i++) {
                    int i2 = m28072a[i];
                    if (i2 == 1) {
                        m28077j(ji1Var, i);
                    } else if (i2 == 2) {
                        m28076k(ji1Var, i);
                    }
                }
                ji1Var.mo18494s();
                ji1Var.mo18503C();
                this.f2294h.m28069d();
                m26476h.unlock();
            } catch (SQLiteException | IllegalStateException unused) {
                return;
            }
        }
    }
}
