package com.daaw;

import android.util.Pair;
import com.daaw.c1;
/* loaded from: classes.dex */
public abstract class nl1 {
    public static final nl1 a = new a();

    /* loaded from: classes.dex */
    public static class a extends nl1 {
        @Override // com.daaw.nl1
        public int b(Object obj) {
            return -1;
        }

        @Override // com.daaw.nl1
        public b g(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.daaw.nl1
        public int h() {
            return 0;
        }

        @Override // com.daaw.nl1
        public c m(int i, c cVar, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.daaw.nl1
        public int n() {
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public Object a;
        public Object b;
        public int c;
        public long d;
        public long e;
        public c1 f;

        public int a(int i) {
            return this.f.c[i].a;
        }

        public long b(int i, int i2) {
            c1.a aVar = this.f.c[i];
            if (aVar.a != -1) {
                return aVar.d[i2];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f.a;
        }

        public int d(long j) {
            return this.f.a(j);
        }

        public int e(long j) {
            return this.f.b(j);
        }

        public long f(int i) {
            return this.f.b[i];
        }

        public long g() {
            return this.f.d;
        }

        public long h() {
            return dd.b(this.d);
        }

        public long i() {
            return this.d;
        }

        public int j(int i) {
            return this.f.c[i].a();
        }

        public int k(int i, int i2) {
            return this.f.c[i].b(i2);
        }

        public long l() {
            return dd.b(this.e);
        }

        public boolean m(int i) {
            return !this.f.c[i].c();
        }

        public boolean n(int i, int i2) {
            c1.a aVar = this.f.c[i];
            return (aVar.a == -1 || aVar.c[i2] == 0) ? false : true;
        }

        public b o(Object obj, Object obj2, int i, long j, long j2) {
            return p(obj, obj2, i, j, j2, c1.f);
        }

        public b p(Object obj, Object obj2, int i, long j, long j2, c1 c1Var) {
            this.a = obj;
            this.b = obj2;
            this.c = i;
            this.d = j;
            this.e = j2;
            this.f = c1Var;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public Object a;
        public long b;
        public long c;
        public boolean d;
        public boolean e;
        public int f;
        public int g;
        public long h;
        public long i;
        public long j;

        public long a() {
            return dd.b(this.h);
        }

        public long b() {
            return this.h;
        }

        public long c() {
            return dd.b(this.i);
        }

        public long d() {
            return this.j;
        }

        public c e(Object obj, long j, long j2, boolean z, boolean z2, long j3, long j4, int i, int i2, long j5) {
            this.a = obj;
            this.b = j;
            this.c = j2;
            this.d = z;
            this.e = z2;
            this.h = j3;
            this.i = j4;
            this.f = i;
            this.g = i2;
            this.j = j5;
            return this;
        }
    }

    public int a(boolean z) {
        return o() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (o()) {
            return -1;
        }
        return n() - 1;
    }

    public final int d(int i, b bVar, c cVar, int i2, boolean z) {
        int i3 = f(i, bVar).c;
        if (k(i3, cVar).g == i) {
            int e = e(i3, i2, z);
            if (e == -1) {
                return -1;
            }
            return k(e, cVar).f;
        }
        return i + 1;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == c(z) ? a(z) : i + 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    public final b f(int i, b bVar) {
        return g(i, bVar, false);
    }

    public abstract b g(int i, b bVar, boolean z);

    public abstract int h();

    public final Pair<Integer, Long> i(c cVar, b bVar, int i, long j) {
        return j(cVar, bVar, i, j, 0L);
    }

    public final Pair<Integer, Long> j(c cVar, b bVar, int i, long j, long j2) {
        s6.c(i, 0, n());
        m(i, cVar, false, j2);
        if (j == -9223372036854775807L) {
            j = cVar.b();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.f;
        long d = cVar.d() + j;
        while (true) {
            long i3 = f(i2, bVar).i();
            if (i3 == -9223372036854775807L || d < i3 || i2 >= cVar.g) {
                break;
            }
            d -= i3;
            i2++;
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(d));
    }

    public final c k(int i, c cVar) {
        return l(i, cVar, false);
    }

    public final c l(int i, c cVar, boolean z) {
        return m(i, cVar, z, 0L);
    }

    public abstract c m(int i, c cVar, boolean z, long j);

    public abstract int n();

    public final boolean o() {
        return n() == 0;
    }

    public final boolean p(int i, b bVar, c cVar, int i2, boolean z) {
        return d(i, bVar, cVar, i2, z) == -1;
    }
}
