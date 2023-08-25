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
/* loaded from: classes.dex */
public class c {
    public static final String[] m = {"UPDATE", "DELETE", "INSERT"};
    public final String[] b;
    public Map<String, Set<String>> c;
    public final b61 d;
    public volatile ni1 g;
    public b h;
    public final zg0 i;
    public androidx.room.d k;
    public AtomicBoolean e = new AtomicBoolean(false);
    public volatile boolean f = false;
    @SuppressLint({"RestrictedApi"})
    public final v71<AbstractC0028c, d> j = new v71<>();
    public Runnable l = new a();
    public final HashMap<String, Integer> a = new HashMap<>();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        public final Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor p = c.this.d.p(new id1("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (p.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(p.getInt(0)));
                } catch (Throwable th) {
                    p.close();
                    throw th;
                }
            }
            p.close();
            if (!hashSet.isEmpty()) {
                c.this.g.j();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock h = c.this.d.h();
            Set<Integer> set = null;
            try {
                h.lock();
            } catch (SQLiteException | IllegalStateException unused) {
            } catch (Throwable th) {
                h.unlock();
                throw th;
            }
            if (!c.this.c()) {
                h.unlock();
            } else if (!c.this.e.compareAndSet(true, false)) {
                h.unlock();
            } else if (c.this.d.k()) {
                h.unlock();
            } else {
                b61 b61Var = c.this.d;
                if (b61Var.g) {
                    ji1 A = b61Var.i().A();
                    A.a();
                    try {
                        set = a();
                        A.s();
                        A.C();
                    } catch (Throwable th2) {
                        A.C();
                        throw th2;
                    }
                } else {
                    set = a();
                }
                h.unlock();
                if (set == null || set.isEmpty()) {
                    return;
                }
                synchronized (c.this.j) {
                    Iterator<Map.Entry<AbstractC0028c, d>> it = c.this.j.iterator();
                    while (it.hasNext()) {
                        it.next().getValue().a(set);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final long[] a;
        public final boolean[] b;
        public final int[] c;
        public boolean d;
        public boolean e;

        public b(int i) {
            long[] jArr = new long[i];
            this.a = jArr;
            boolean[] zArr = new boolean[i];
            this.b = zArr;
            this.c = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public int[] a() {
            synchronized (this) {
                if (this.d && !this.e) {
                    int length = this.a.length;
                    int i = 0;
                    while (true) {
                        int i2 = 1;
                        if (i >= length) {
                            this.e = true;
                            this.d = false;
                            return this.c;
                        }
                        boolean z = this.a[i] > 0;
                        boolean[] zArr = this.b;
                        if (z != zArr[i]) {
                            int[] iArr = this.c;
                            if (!z) {
                                i2 = 2;
                            }
                            iArr[i] = i2;
                        } else {
                            this.c[i] = 0;
                        }
                        zArr[i] = z;
                        i++;
                    }
                }
                return null;
            }
        }

        public boolean b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.a;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        this.d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        public boolean c(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        this.d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        public void d() {
            synchronized (this) {
                this.e = false;
            }
        }
    }

    /* renamed from: androidx.room.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0028c {
        public final String[] a;

        public AbstractC0028c(String[] strArr) {
            this.a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    /* loaded from: classes.dex */
    public static class d {
        public final int[] a;
        public final String[] b;
        public final AbstractC0028c c;
        public final Set<String> d;

        public d(AbstractC0028c abstractC0028c, int[] iArr, String[] strArr) {
            Set<String> set;
            this.c = abstractC0028c;
            this.a = iArr;
            this.b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                set = Collections.unmodifiableSet(hashSet);
            } else {
                set = null;
            }
            this.d = set;
        }

        public void a(Set<Integer> set) {
            int length = this.a.length;
            Set<String> set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.a[i]))) {
                    if (length == 1) {
                        set2 = this.d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.c.b(set2);
            }
        }

        public void b(String[] strArr) {
            Set<String> set = null;
            if (this.b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.b[0])) {
                        set = this.d;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.b;
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
                this.c.b(set);
            }
        }
    }

    public c(b61 b61Var, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.d = b61Var;
        this.h = new b(strArr.length);
        this.c = map2;
        this.i = new zg0(b61Var);
        int length = strArr.length;
        this.b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.a.put(lowerCase, Integer.valueOf(i));
            String str2 = map.get(strArr[i]);
            if (str2 != null) {
                this.b[i] = str2.toLowerCase(locale);
            } else {
                this.b[i] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    public static void b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    @SuppressLint({"RestrictedApi"})
    public void a(AbstractC0028c abstractC0028c) {
        d k;
        String[] h = h(abstractC0028c.a);
        int[] iArr = new int[h.length];
        int length = h.length;
        for (int i = 0; i < length; i++) {
            Integer num = this.a.get(h[i].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + h[i]);
            }
            iArr[i] = num.intValue();
        }
        d dVar = new d(abstractC0028c, iArr, h);
        synchronized (this.j) {
            k = this.j.k(abstractC0028c, dVar);
        }
        if (k == null && this.h.b(iArr)) {
            l();
        }
    }

    public boolean c() {
        if (this.d.o()) {
            if (!this.f) {
                this.d.i().A();
            }
            return this.f;
        }
        return false;
    }

    public void d(ji1 ji1Var) {
        synchronized (this) {
            if (this.f) {
                return;
            }
            ji1Var.h("PRAGMA temp_store = MEMORY;");
            ji1Var.h("PRAGMA recursive_triggers='ON';");
            ji1Var.h("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m(ji1Var);
            this.g = ji1Var.k("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f = true;
        }
    }

    public void e(String... strArr) {
        synchronized (this.j) {
            Iterator<Map.Entry<AbstractC0028c, d>> it = this.j.iterator();
            while (it.hasNext()) {
                Map.Entry<AbstractC0028c, d> next = it.next();
                if (!next.getKey().a()) {
                    next.getValue().b(strArr);
                }
            }
        }
    }

    public void f() {
        if (this.e.compareAndSet(false, true)) {
            this.d.j().execute(this.l);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void g(AbstractC0028c abstractC0028c) {
        d m2;
        synchronized (this.j) {
            m2 = this.j.m(abstractC0028c);
        }
        if (m2 == null || !this.h.c(m2.a)) {
            return;
        }
        l();
    }

    public final String[] h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.c.containsKey(lowerCase)) {
                hashSet.addAll(this.c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public void i(Context context, String str) {
        this.k = new androidx.room.d(context, str, this, this.d.j());
    }

    public final void j(ji1 ji1Var, int i) {
        String[] strArr;
        ji1Var.h("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb, str, str2);
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
            ji1Var.h(sb.toString());
        }
    }

    public final void k(ji1 ji1Var, int i) {
        String[] strArr;
        String str = this.b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            b(sb, str, str2);
            ji1Var.h(sb.toString());
        }
    }

    public void l() {
        if (this.d.o()) {
            m(this.d.i().A());
        }
    }

    public void m(ji1 ji1Var) {
        if (ji1Var.H()) {
            return;
        }
        while (true) {
            try {
                Lock h = this.d.h();
                h.lock();
                int[] a2 = this.h.a();
                if (a2 == null) {
                    h.unlock();
                    return;
                }
                int length = a2.length;
                ji1Var.a();
                for (int i = 0; i < length; i++) {
                    int i2 = a2[i];
                    if (i2 == 1) {
                        j(ji1Var, i);
                    } else if (i2 == 2) {
                        k(ji1Var, i);
                    }
                }
                ji1Var.s();
                ji1Var.C();
                this.h.d();
                h.unlock();
            } catch (SQLiteException | IllegalStateException unused) {
                return;
            }
        }
    }
}
