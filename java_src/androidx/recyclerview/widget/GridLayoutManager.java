package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.y;
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public c O;
    public final Rect P;
    public boolean Q;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.p {
        public int e;
        public int f;

        public b(int i, int i2) {
            super(i, i2);
            this.e = -1;
            this.f = 0;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.e = -1;
            this.f = 0;
        }

        public int e() {
            return this.e;
        }

        public int f() {
            return this.f;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();
        public boolean c = false;
        public boolean d = false;

        public static int a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        public int b(int i, int i2) {
            if (this.d) {
                int i3 = this.b.get(i, -1);
                if (i3 != -1) {
                    return i3;
                }
                int d = d(i, i2);
                this.b.put(i, d);
                return d;
            }
            return d(i, i2);
        }

        public int c(int i, int i2) {
            if (this.c) {
                int i3 = this.a.get(i, -1);
                if (i3 != -1) {
                    return i3;
                }
                int e = e(i, i2);
                this.a.put(i, e);
                return e;
            }
            return e(i, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.d
                r1 = 0
                if (r0 == 0) goto L24
                android.util.SparseIntArray r0 = r6.b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L24
                android.util.SparseIntArray r2 = r6.b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.c(r0, r8)
                int r0 = r6.f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L27
                int r2 = r2 + 1
                goto L26
            L24:
                r2 = 0
                r3 = 0
            L26:
                r4 = 0
            L27:
                int r0 = r6.f(r7)
            L2b:
                if (r3 >= r7) goto L40
                int r5 = r6.f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L38
                int r2 = r2 + 1
                r4 = 0
                goto L3d
            L38:
                if (r4 <= r8) goto L3d
                int r2 = r2 + 1
                r4 = r5
            L3d:
                int r3 = r3 + 1
                goto L2b
            L40:
                int r4 = r4 + r0
                if (r4 <= r8) goto L45
                int r2 = r2 + 1
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.d(int, int):int");
        }

        public abstract int e(int i, int i2);

        public abstract int f(int i);

        public void g() {
            this.b.clear();
        }

        public void h() {
            this.a.clear();
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        e3(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        e3(RecyclerView.o.i0(context, attributeSet, i, i2).b);
    }

    public static int[] Q2(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C1(Rect rect, int i, int i2) {
        int n;
        int n2;
        if (this.K == null) {
            super.C1(rect, i, i2);
        }
        int e0 = e0() + f0();
        int g0 = g0() + d0();
        if (this.s == 1) {
            n2 = RecyclerView.o.n(i2, rect.height() + g0, b0());
            int[] iArr = this.K;
            n = RecyclerView.o.n(i, iArr[iArr.length - 1] + e0, c0());
        } else {
            n = RecyclerView.o.n(i, rect.width() + e0, c0());
            int[] iArr2 = this.K;
            n2 = RecyclerView.o.n(i2, iArr2[iArr2.length - 1] + g0, b0());
        }
        B1(n, n2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D() {
        return this.s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void E2(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.E2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
        if (r13 == (r2 > r7)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View J0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.z r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.J0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean L1() {
        return this.D == null && !this.I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int N(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.s == 1) {
            return this.J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return Y2(vVar, zVar, zVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void N1(RecyclerView.z zVar, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i = this.J;
        for (int i2 = 0; i2 < this.J && cVar.c(zVar) && i > 0; i2++) {
            int i3 = cVar.d;
            cVar2.a(i3, Math.max(0, cVar.g));
            i -= this.O.f(i3);
            cVar.d += cVar.e;
        }
    }

    public final void N2(RecyclerView.v vVar, RecyclerView.z zVar, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = i - 1;
            i3 = -1;
        }
        while (i2 != i5) {
            View view = this.L[i2];
            b bVar = (b) view.getLayoutParams();
            int a3 = a3(vVar, zVar, h0(view));
            bVar.f = a3;
            bVar.e = i4;
            i4 += a3;
            i2 += i3;
        }
    }

    public final void O2() {
        int J = J();
        for (int i = 0; i < J; i++) {
            b bVar = (b) I(i).getLayoutParams();
            int a2 = bVar.a();
            this.M.put(a2, bVar.f());
            this.N.put(a2, bVar.e());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView.v vVar, RecyclerView.z zVar, View view, y yVar) {
        int i;
        int e;
        int f;
        boolean z;
        boolean z2;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.O0(view, yVar);
            return;
        }
        b bVar = (b) layoutParams;
        int Y2 = Y2(vVar, zVar, bVar.a());
        if (this.s == 0) {
            i2 = bVar.e();
            i = bVar.f();
            f = 1;
            z = false;
            z2 = false;
            e = Y2;
        } else {
            i = 1;
            e = bVar.e();
            f = bVar.f();
            z = false;
            z2 = false;
            i2 = Y2;
        }
        yVar.e0(y.c.a(i2, i, e, f, z, z2));
    }

    public final void P2(int i) {
        this.K = Q2(this.K, this.J, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(RecyclerView recyclerView, int i, int i2) {
        this.O.h();
        this.O.g();
    }

    public final void R2() {
        this.M.clear();
        this.N.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void S0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    public final int S2(RecyclerView.z zVar) {
        if (J() != 0 && zVar.b() != 0) {
            T1();
            boolean r2 = r2();
            View Y1 = Y1(!r2, true);
            View X1 = X1(!r2, true);
            if (Y1 != null && X1 != null) {
                int b2 = this.O.b(h0(Y1), this.J);
                int b3 = this.O.b(h0(X1), this.J);
                int min = Math.min(b2, b3);
                int max = this.x ? Math.max(0, ((this.O.b(zVar.b() - 1, this.J) + 1) - Math.max(b2, b3)) - 1) : Math.max(0, min);
                if (r2) {
                    return Math.round((max * (Math.abs(this.u.d(X1) - this.u.g(Y1)) / ((this.O.b(h0(X1), this.J) - this.O.b(h0(Y1), this.J)) + 1))) + (this.u.m() - this.u.g(Y1)));
                }
                return max;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.O.h();
        this.O.g();
    }

    public final int T2(RecyclerView.z zVar) {
        if (J() != 0 && zVar.b() != 0) {
            T1();
            View Y1 = Y1(!r2(), true);
            View X1 = X1(!r2(), true);
            if (Y1 != null && X1 != null) {
                if (r2()) {
                    int d = this.u.d(X1) - this.u.g(Y1);
                    int b2 = this.O.b(h0(Y1), this.J);
                    return (int) ((d / ((this.O.b(h0(X1), this.J) - b2) + 1)) * (this.O.b(zVar.b() - 1, this.J) + 1));
                }
                return this.O.b(zVar.b() - 1, this.J) + 1;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(RecyclerView recyclerView, int i, int i2) {
        this.O.h();
        this.O.g();
    }

    public final void U2(RecyclerView.v vVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i) {
        boolean z = i == 1;
        int Z2 = Z2(vVar, zVar, aVar.b);
        if (z) {
            while (Z2 > 0) {
                int i2 = aVar.b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                aVar.b = i3;
                Z2 = Z2(vVar, zVar, i3);
            }
            return;
        }
        int b2 = zVar.b() - 1;
        int i4 = aVar.b;
        while (i4 < b2) {
            int i5 = i4 + 1;
            int Z22 = Z2(vVar, zVar, i5);
            if (Z22 <= Z2) {
                break;
            }
            i4 = i5;
            Z2 = Z22;
        }
        aVar.b = i4;
    }

    public final void V2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.O.h();
        this.O.g();
    }

    public int W2(int i, int i2) {
        if (this.s != 1 || !q2()) {
            int[] iArr = this.K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.K;
        int i3 = this.J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (zVar.e()) {
            O2();
        }
        super.X0(vVar, zVar);
        R2();
    }

    public int X2() {
        return this.J;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.z zVar) {
        super.Y0(zVar);
        this.I = false;
    }

    public final int Y2(RecyclerView.v vVar, RecyclerView.z zVar, int i) {
        if (zVar.e()) {
            int f = vVar.f(i);
            if (f == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot find span size for pre layout position. ");
                sb.append(i);
                return 0;
            }
            return this.O.b(f, this.J);
        }
        return this.O.b(i, this.J);
    }

    public final int Z2(RecyclerView.v vVar, RecyclerView.z zVar, int i) {
        if (zVar.e()) {
            int i2 = this.N.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            int f = vVar.f(i);
            if (f == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
                sb.append(i);
                return 0;
            }
            return this.O.c(f, this.J);
        }
        return this.O.c(i, this.J);
    }

    public final int a3(RecyclerView.v vVar, RecyclerView.z zVar, int i) {
        if (zVar.e()) {
            int i2 = this.M.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            int f = vVar.f(i);
            if (f == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
                sb.append(i);
                return 1;
            }
            return this.O.f(f);
        }
        return this.O.f(i);
    }

    public final void b3(float f, int i) {
        P2(Math.max(Math.round(f * this.J), i));
    }

    public final void c3(View view, int i, boolean z) {
        int i2;
        int i3;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int W2 = W2(bVar.e, bVar.f);
        if (this.s == 1) {
            i3 = RecyclerView.o.K(W2, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i2 = RecyclerView.o.K(this.u.n(), X(), i4, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int K = RecyclerView.o.K(W2, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int K2 = RecyclerView.o.K(this.u.n(), p0(), i5, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i2 = K;
            i3 = K2;
        }
        d3(view, i3, i2, z);
    }

    public final void d3(View view, int i, int i2, boolean z) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z ? H1(view, i, i2, pVar) : F1(view, i, i2, pVar)) {
            view.measure(i, i2);
        }
    }

    public void e3(int i) {
        if (i == this.J) {
            return;
        }
        this.I = true;
        if (i >= 1) {
            this.J = i;
            this.O.h();
            t1();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
    }

    public final void f3() {
        int W;
        int g0;
        if (p2() == 1) {
            W = o0() - f0();
            g0 = e0();
        } else {
            W = W() - d0();
            g0 = g0();
        }
        P2(W - g0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View h2(RecyclerView.v vVar, RecyclerView.z zVar, int i, int i2, int i3) {
        T1();
        int m = this.u.m();
        int i4 = this.u.i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View I = I(i);
            int h0 = h0(I);
            if (h0 >= 0 && h0 < i3 && Z2(vVar, zVar, h0) == 0) {
                if (((RecyclerView.p) I.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = I;
                    }
                } else if (this.u.g(I) < i4 && this.u.d(I) >= m) {
                    return I;
                } else {
                    if (view == null) {
                        view = I;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int k0(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.s == 0) {
            return this.J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return Y2(vVar, zVar, zVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean m(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.z zVar) {
        return this.Q ? S2(zVar) : super.r(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.z zVar) {
        return this.Q ? T2(zVar) : super.s(zVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s2(androidx.recyclerview.widget.RecyclerView.v r18, androidx.recyclerview.widget.RecyclerView.z r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.s2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.z zVar) {
        return this.Q ? S2(zVar) : super.u(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void u2(RecyclerView.v vVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i) {
        super.u2(vVar, zVar, aVar, i);
        f3();
        if (zVar.b() > 0 && !zVar.e()) {
            U2(vVar, zVar, aVar, i);
        }
        V2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        return this.Q ? T2(zVar) : super.v(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int w1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        f3();
        V2();
        return super.w1(i, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int y1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        f3();
        V2();
        return super.y1(i, vVar, zVar);
    }
}
