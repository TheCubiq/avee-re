package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.lm1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes.dex */
public final class RunnableC0438e implements Runnable {

    /* renamed from: t */
    public static final ThreadLocal<RunnableC0438e> f2216t = new ThreadLocal<>();

    /* renamed from: u */
    public static Comparator<C0441c> f2217u = new C0439a();

    /* renamed from: q */
    public long f2219q;

    /* renamed from: r */
    public long f2220r;

    /* renamed from: p */
    public ArrayList<RecyclerView> f2218p = new ArrayList<>();

    /* renamed from: s */
    public ArrayList<C0441c> f2221s = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* loaded from: classes.dex */
    public static class C0439a implements Comparator<C0441c> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C0441c c0441c, C0441c c0441c2) {
            RecyclerView recyclerView = c0441c.f2229d;
            if ((recyclerView == null) != (c0441c2.f2229d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = c0441c.f2226a;
            if (z != c0441c2.f2226a) {
                return z ? -1 : 1;
            }
            int i = c0441c2.f2227b - c0441c.f2227b;
            if (i != 0) {
                return i;
            }
            int i2 = c0441c.f2228c - c0441c2.f2228c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.e$b */
    /* loaded from: classes.dex */
    public static class C0440b implements RecyclerView.AbstractC0391o.InterfaceC0394c {

        /* renamed from: a */
        public int f2222a;

        /* renamed from: b */
        public int f2223b;

        /* renamed from: c */
        public int[] f2224c;

        /* renamed from: d */
        public int f2225d;

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o.InterfaceC0394c
        /* renamed from: a */
        public void mo28227a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f2225d * 2;
            int[] iArr = this.f2224c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f2224c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.f2224c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f2224c;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.f2225d++;
        }

        /* renamed from: b */
        public void m28226b() {
            int[] iArr = this.f2224c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2225d = 0;
        }

        /* renamed from: c */
        public void m28225c(RecyclerView recyclerView, boolean z) {
            this.f2225d = 0;
            int[] iArr = this.f2224c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC0391o abstractC0391o = recyclerView.f1865B;
            if (recyclerView.f1863A == null || abstractC0391o == null || !abstractC0391o.m28588u0()) {
                return;
            }
            if (z) {
                if (!recyclerView.f1920s.m28329p()) {
                    abstractC0391o.mo28598p(recyclerView.f1863A.mo497d(), this);
                }
            } else if (!recyclerView.m28805n0()) {
                abstractC0391o.mo28415o(this.f2222a, this.f2223b, recyclerView.f1929w0, this);
            }
            int i = this.f2225d;
            if (i > abstractC0391o.f1993m) {
                abstractC0391o.f1993m = i;
                abstractC0391o.f1994n = z;
                recyclerView.f1916q.m28547K();
            }
        }

        /* renamed from: d */
        public boolean m28224d(int i) {
            if (this.f2224c != null) {
                int i2 = this.f2225d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f2224c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        public void m28223e(int i, int i2) {
            this.f2222a = i;
            this.f2223b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    /* loaded from: classes.dex */
    public static class C0441c {

        /* renamed from: a */
        public boolean f2226a;

        /* renamed from: b */
        public int f2227b;

        /* renamed from: c */
        public int f2228c;

        /* renamed from: d */
        public RecyclerView f2229d;

        /* renamed from: e */
        public int f2230e;

        /* renamed from: a */
        public void m28222a() {
            this.f2226a = false;
            this.f2227b = 0;
            this.f2228c = 0;
            this.f2229d = null;
            this.f2230e = 0;
        }
    }

    /* renamed from: e */
    public static boolean m28234e(RecyclerView recyclerView, int i) {
        int m28303j = recyclerView.f1922t.m28303j();
        for (int i2 = 0; i2 < m28303j; i2++) {
            RecyclerView.AbstractC0376c0 m28823h0 = RecyclerView.m28823h0(recyclerView.f1922t.m28304i(i2));
            if (m28823h0.f1949c == i && !m28823h0.m28724v()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m28238a(RecyclerView recyclerView) {
        this.f2218p.add(recyclerView);
    }

    /* renamed from: b */
    public final void m28237b() {
        C0441c c0441c;
        int size = this.f2218p.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f2218p.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f1927v0.m28225c(recyclerView, false);
                i += recyclerView.f1927v0.f2225d;
            }
        }
        this.f2221s.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f2218p.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0440b c0440b = recyclerView2.f1927v0;
                int abs = Math.abs(c0440b.f2222a) + Math.abs(c0440b.f2223b);
                for (int i5 = 0; i5 < c0440b.f2225d * 2; i5 += 2) {
                    if (i3 >= this.f2221s.size()) {
                        c0441c = new C0441c();
                        this.f2221s.add(c0441c);
                    } else {
                        c0441c = this.f2221s.get(i3);
                    }
                    int[] iArr = c0440b.f2224c;
                    int i6 = iArr[i5 + 1];
                    c0441c.f2226a = i6 <= abs;
                    c0441c.f2227b = abs;
                    c0441c.f2228c = i6;
                    c0441c.f2229d = recyclerView2;
                    c0441c.f2230e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f2221s, f2217u);
    }

    /* renamed from: c */
    public final void m28236c(C0441c c0441c, long j) {
        RecyclerView.AbstractC0376c0 m28230i = m28230i(c0441c.f2229d, c0441c.f2230e, c0441c.f2226a ? Long.MAX_VALUE : j);
        if (m28230i == null || m28230i.f1948b == null || !m28230i.m28725u() || m28230i.m28724v()) {
            return;
        }
        m28231h(m28230i.f1948b.get(), j);
    }

    /* renamed from: d */
    public final void m28235d(long j) {
        for (int i = 0; i < this.f2221s.size(); i++) {
            C0441c c0441c = this.f2221s.get(i);
            if (c0441c.f2229d == null) {
                return;
            }
            m28236c(c0441c, j);
            c0441c.m28222a();
        }
    }

    /* renamed from: f */
    public void m28233f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f2219q == 0) {
            this.f2219q = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f1927v0.m28223e(i, i2);
    }

    /* renamed from: g */
    public void m28232g(long j) {
        m28237b();
        m28235d(j);
    }

    /* renamed from: h */
    public final void m28231h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f1894S && recyclerView.f1922t.m28303j() != 0) {
            recyclerView.m28851W0();
        }
        C0440b c0440b = recyclerView.f1927v0;
        c0440b.m28225c(recyclerView, true);
        if (c0440b.f2225d != 0) {
            try {
                lm1.m16730a("RV Nested Prefetch");
                recyclerView.f1929w0.m28491f(recyclerView.f1863A);
                for (int i = 0; i < c0440b.f2225d * 2; i += 2) {
                    m28230i(recyclerView, c0440b.f2224c[i], j);
                }
            } finally {
                lm1.m16729b();
            }
        }
    }

    /* renamed from: i */
    public final RecyclerView.AbstractC0376c0 m28230i(RecyclerView recyclerView, int i, long j) {
        if (m28234e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C0403v c0403v = recyclerView.f1916q;
        try {
            recyclerView.m28879I0();
            RecyclerView.AbstractC0376c0 m28549I = c0403v.m28549I(i, false, j);
            if (m28549I != null) {
                if (!m28549I.m28725u() || m28549I.m28724v()) {
                    c0403v.m28544a(m28549I, false);
                } else {
                    c0403v.m28556B(m28549I.f1947a);
                }
            }
            return m28549I;
        } finally {
            recyclerView.m28875K0(false);
        }
    }

    /* renamed from: j */
    public void m28229j(RecyclerView recyclerView) {
        this.f2218p.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            lm1.m16730a("RV Prefetch");
            if (!this.f2218p.isEmpty()) {
                int size = this.f2218p.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f2218p.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    m28232g(TimeUnit.MILLISECONDS.toNanos(j) + this.f2220r);
                }
            }
        } finally {
            this.f2219q = 0L;
            lm1.m16729b();
        }
    }
}
