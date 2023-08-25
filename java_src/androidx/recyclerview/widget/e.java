package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.lm1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class e implements Runnable {
    public static final ThreadLocal<e> t = new ThreadLocal<>();
    public static Comparator<c> u = new a();
    public long q;
    public long r;
    public ArrayList<RecyclerView> p = new ArrayList<>();
    public ArrayList<c> s = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.d;
            if ((recyclerView == null) != (cVar2.d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.a;
            if (z != cVar2.a) {
                return z ? -1 : 1;
            }
            int i = cVar2.b - cVar.b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.c - cVar2.c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.o.c {
        public int a;
        public int b;
        public int[] c;
        public int d;

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.d * 2;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.c;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.d++;
        }

        public void b() {
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.B;
            if (recyclerView.A == null || oVar == null || !oVar.u0()) {
                return;
            }
            if (z) {
                if (!recyclerView.s.p()) {
                    oVar.p(recyclerView.A.d(), this);
                }
            } else if (!recyclerView.n0()) {
                oVar.o(this.a, this.b, recyclerView.w0, this);
            }
            int i = this.d;
            if (i > oVar.m) {
                oVar.m = i;
                oVar.n = z;
                recyclerView.q.K();
            }
        }

        public boolean d(int i) {
            if (this.c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        public void a() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = null;
            this.e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i) {
        int j = recyclerView.t.j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.c0 h0 = RecyclerView.h0(recyclerView.t.i(i2));
            if (h0.c == i && !h0.v()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        this.p.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.p.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.p.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.v0.c(recyclerView, false);
                i += recyclerView.v0.d;
            }
        }
        this.s.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.p.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.v0;
                int abs = Math.abs(bVar.a) + Math.abs(bVar.b);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= this.s.size()) {
                        cVar = new c();
                        this.s.add(cVar);
                    } else {
                        cVar = this.s.get(i3);
                    }
                    int[] iArr = bVar.c;
                    int i6 = iArr[i5 + 1];
                    cVar.a = i6 <= abs;
                    cVar.b = abs;
                    cVar.c = i6;
                    cVar.d = recyclerView2;
                    cVar.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.s, u);
    }

    public final void c(c cVar, long j) {
        RecyclerView.c0 i = i(cVar.d, cVar.e, cVar.a ? Long.MAX_VALUE : j);
        if (i == null || i.b == null || !i.u() || i.v()) {
            return;
        }
        h(i.b.get(), j);
    }

    public final void d(long j) {
        for (int i = 0; i < this.s.size(); i++) {
            c cVar = this.s.get(i);
            if (cVar.d == null) {
                return;
            }
            c(cVar, j);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.q == 0) {
            this.q = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.v0.e(i, i2);
    }

    public void g(long j) {
        b();
        d(j);
    }

    public final void h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.S && recyclerView.t.j() != 0) {
            recyclerView.W0();
        }
        b bVar = recyclerView.v0;
        bVar.c(recyclerView, true);
        if (bVar.d != 0) {
            try {
                lm1.a("RV Nested Prefetch");
                recyclerView.w0.f(recyclerView.A);
                for (int i = 0; i < bVar.d * 2; i += 2) {
                    i(recyclerView, bVar.c[i], j);
                }
            } finally {
                lm1.b();
            }
        }
    }

    public final RecyclerView.c0 i(RecyclerView recyclerView, int i, long j) {
        if (e(recyclerView, i)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.q;
        try {
            recyclerView.I0();
            RecyclerView.c0 I = vVar.I(i, false, j);
            if (I != null) {
                if (!I.u() || I.v()) {
                    vVar.a(I, false);
                } else {
                    vVar.B(I.a);
                }
            }
            return I;
        } finally {
            recyclerView.K0(false);
        }
    }

    public void j(RecyclerView recyclerView) {
        this.p.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            lm1.a("RV Prefetch");
            if (!this.p.isEmpty()) {
                int size = this.p.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.p.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j) + this.r);
                }
            }
        } finally {
            this.q = 0L;
            lm1.b();
        }
    }
}
