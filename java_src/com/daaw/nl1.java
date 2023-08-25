package com.daaw;

import android.util.Pair;
import com.daaw.C0908c1;
/* loaded from: classes.dex */
public abstract class nl1 {

    /* renamed from: a */
    public static final nl1 f20215a = new C2313a();

    /* renamed from: com.daaw.nl1$a */
    /* loaded from: classes.dex */
    public static class C2313a extends nl1 {
        @Override // com.daaw.nl1
        /* renamed from: b */
        public int mo14379b(Object obj) {
            return -1;
        }

        @Override // com.daaw.nl1
        /* renamed from: g */
        public C2314b mo14378g(int i, C2314b c2314b, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.daaw.nl1
        /* renamed from: h */
        public int mo14377h() {
            return 0;
        }

        @Override // com.daaw.nl1
        /* renamed from: m */
        public C2315c mo14376m(int i, C2315c c2315c, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.daaw.nl1
        /* renamed from: n */
        public int mo14375n() {
            return 0;
        }
    }

    /* renamed from: com.daaw.nl1$b */
    /* loaded from: classes.dex */
    public static final class C2314b {

        /* renamed from: a */
        public Object f20216a;

        /* renamed from: b */
        public Object f20217b;

        /* renamed from: c */
        public int f20218c;

        /* renamed from: d */
        public long f20219d;

        /* renamed from: e */
        public long f20220e;

        /* renamed from: f */
        public C0908c1 f20221f;

        /* renamed from: a */
        public int m15071a(int i) {
            return this.f20221f.f5363c[i].f5366a;
        }

        /* renamed from: b */
        public long m15070b(int i, int i2) {
            C0908c1.C0909a c0909a = this.f20221f.f5363c[i];
            if (c0909a.f5366a != -1) {
                return c0909a.f5369d[i2];
            }
            return -9223372036854775807L;
        }

        /* renamed from: c */
        public int m15069c() {
            return this.f20221f.f5361a;
        }

        /* renamed from: d */
        public int m15068d(long j) {
            return this.f20221f.m25690a(j);
        }

        /* renamed from: e */
        public int m15067e(long j) {
            return this.f20221f.m25689b(j);
        }

        /* renamed from: f */
        public long m15066f(int i) {
            return this.f20221f.f5362b[i];
        }

        /* renamed from: g */
        public long m15065g() {
            return this.f20221f.f5364d;
        }

        /* renamed from: h */
        public long m15064h() {
            return C1075dd.m24526b(this.f20219d);
        }

        /* renamed from: i */
        public long m15063i() {
            return this.f20219d;
        }

        /* renamed from: j */
        public int m15062j(int i) {
            return this.f20221f.f5363c[i].m25688a();
        }

        /* renamed from: k */
        public int m15061k(int i, int i2) {
            return this.f20221f.f5363c[i].m25687b(i2);
        }

        /* renamed from: l */
        public long m15060l() {
            return C1075dd.m24526b(this.f20220e);
        }

        /* renamed from: m */
        public boolean m15059m(int i) {
            return !this.f20221f.f5363c[i].m25686c();
        }

        /* renamed from: n */
        public boolean m15058n(int i, int i2) {
            C0908c1.C0909a c0909a = this.f20221f.f5363c[i];
            return (c0909a.f5366a == -1 || c0909a.f5368c[i2] == 0) ? false : true;
        }

        /* renamed from: o */
        public C2314b m15057o(Object obj, Object obj2, int i, long j, long j2) {
            return m15056p(obj, obj2, i, j, j2, C0908c1.f5360f);
        }

        /* renamed from: p */
        public C2314b m15056p(Object obj, Object obj2, int i, long j, long j2, C0908c1 c0908c1) {
            this.f20216a = obj;
            this.f20217b = obj2;
            this.f20218c = i;
            this.f20219d = j;
            this.f20220e = j2;
            this.f20221f = c0908c1;
            return this;
        }
    }

    /* renamed from: com.daaw.nl1$c */
    /* loaded from: classes.dex */
    public static final class C2315c {

        /* renamed from: a */
        public Object f20222a;

        /* renamed from: b */
        public long f20223b;

        /* renamed from: c */
        public long f20224c;

        /* renamed from: d */
        public boolean f20225d;

        /* renamed from: e */
        public boolean f20226e;

        /* renamed from: f */
        public int f20227f;

        /* renamed from: g */
        public int f20228g;

        /* renamed from: h */
        public long f20229h;

        /* renamed from: i */
        public long f20230i;

        /* renamed from: j */
        public long f20231j;

        /* renamed from: a */
        public long m15055a() {
            return C1075dd.m24526b(this.f20229h);
        }

        /* renamed from: b */
        public long m15054b() {
            return this.f20229h;
        }

        /* renamed from: c */
        public long m15053c() {
            return C1075dd.m24526b(this.f20230i);
        }

        /* renamed from: d */
        public long m15052d() {
            return this.f20231j;
        }

        /* renamed from: e */
        public C2315c m15051e(Object obj, long j, long j2, boolean z, boolean z2, long j3, long j4, int i, int i2, long j5) {
            this.f20222a = obj;
            this.f20223b = j;
            this.f20224c = j2;
            this.f20225d = z;
            this.f20226e = z2;
            this.f20229h = j3;
            this.f20230i = j4;
            this.f20227f = i;
            this.f20228g = i2;
            this.f20231j = j5;
            return this;
        }
    }

    /* renamed from: a */
    public int m15082a(boolean z) {
        return m15073o() ? -1 : 0;
    }

    /* renamed from: b */
    public abstract int mo14379b(Object obj);

    /* renamed from: c */
    public int m15081c(boolean z) {
        if (m15073o()) {
            return -1;
        }
        return mo14375n() - 1;
    }

    /* renamed from: d */
    public final int m15080d(int i, C2314b c2314b, C2315c c2315c, int i2, boolean z) {
        int i3 = m15078f(i, c2314b).f20218c;
        if (m15075k(i3, c2315c).f20228g == i) {
            int m15079e = m15079e(i3, i2, z);
            if (m15079e == -1) {
                return -1;
            }
            return m15075k(m15079e, c2315c).f20227f;
        }
        return i + 1;
    }

    /* renamed from: e */
    public int m15079e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == m15081c(z)) {
                return -1;
            }
            return i + 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == m15081c(z) ? m15082a(z) : i + 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    /* renamed from: f */
    public final C2314b m15078f(int i, C2314b c2314b) {
        return mo14378g(i, c2314b, false);
    }

    /* renamed from: g */
    public abstract C2314b mo14378g(int i, C2314b c2314b, boolean z);

    /* renamed from: h */
    public abstract int mo14377h();

    /* renamed from: i */
    public final Pair<Integer, Long> m15077i(C2315c c2315c, C2314b c2314b, int i, long j) {
        return m15076j(c2315c, c2314b, i, j, 0L);
    }

    /* renamed from: j */
    public final Pair<Integer, Long> m15076j(C2315c c2315c, C2314b c2314b, int i, long j, long j2) {
        C2914s6.m10688c(i, 0, mo14375n());
        mo14376m(i, c2315c, false, j2);
        if (j == -9223372036854775807L) {
            j = c2315c.m15054b();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c2315c.f20227f;
        long m15052d = c2315c.m15052d() + j;
        while (true) {
            long m15063i = m15078f(i2, c2314b).m15063i();
            if (m15063i == -9223372036854775807L || m15052d < m15063i || i2 >= c2315c.f20228g) {
                break;
            }
            m15052d -= m15063i;
            i2++;
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(m15052d));
    }

    /* renamed from: k */
    public final C2315c m15075k(int i, C2315c c2315c) {
        return m15074l(i, c2315c, false);
    }

    /* renamed from: l */
    public final C2315c m15074l(int i, C2315c c2315c, boolean z) {
        return mo14376m(i, c2315c, z, 0L);
    }

    /* renamed from: m */
    public abstract C2315c mo14376m(int i, C2315c c2315c, boolean z, long j);

    /* renamed from: n */
    public abstract int mo14375n();

    /* renamed from: o */
    public final boolean m15073o() {
        return mo14375n() == 0;
    }

    /* renamed from: p */
    public final boolean m15072p(int i, C2314b c2314b, C2315c c2315c, int i2, boolean z) {
        return m15080d(i, c2314b, c2315c, i2, z) == -1;
    }
}
