package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C3654y;
import java.util.Arrays;
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    public boolean f1798I;

    /* renamed from: J */
    public int f1799J;

    /* renamed from: K */
    public int[] f1800K;

    /* renamed from: L */
    public View[] f1801L;

    /* renamed from: M */
    public final SparseIntArray f1802M;

    /* renamed from: N */
    public final SparseIntArray f1803N;

    /* renamed from: O */
    public AbstractC0365c f1804O;

    /* renamed from: P */
    public final Rect f1805P;

    /* renamed from: Q */
    public boolean f1806Q;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    /* loaded from: classes.dex */
    public static final class C0363a extends AbstractC0365c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0365c
        /* renamed from: e */
        public int mo28968e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0365c
        /* renamed from: f */
        public int mo28967f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C0364b extends RecyclerView.C0396p {

        /* renamed from: e */
        public int f1807e;

        /* renamed from: f */
        public int f1808f;

        public C0364b(int i, int i2) {
            super(i, i2);
            this.f1807e = -1;
            this.f1808f = 0;
        }

        public C0364b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1807e = -1;
            this.f1808f = 0;
        }

        public C0364b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1807e = -1;
            this.f1808f = 0;
        }

        public C0364b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1807e = -1;
            this.f1808f = 0;
        }

        /* renamed from: e */
        public int m28974e() {
            return this.f1807e;
        }

        /* renamed from: f */
        public int m28973f() {
            return this.f1808f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0365c {

        /* renamed from: a */
        public final SparseIntArray f1809a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f1810b = new SparseIntArray();

        /* renamed from: c */
        public boolean f1811c = false;

        /* renamed from: d */
        public boolean f1812d = false;

        /* renamed from: a */
        public static int m28972a(SparseIntArray sparseIntArray, int i) {
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

        /* renamed from: b */
        public int m28971b(int i, int i2) {
            if (this.f1812d) {
                int i3 = this.f1810b.get(i, -1);
                if (i3 != -1) {
                    return i3;
                }
                int m28969d = m28969d(i, i2);
                this.f1810b.put(i, m28969d);
                return m28969d;
            }
            return m28969d(i, i2);
        }

        /* renamed from: c */
        public int m28970c(int i, int i2) {
            if (this.f1811c) {
                int i3 = this.f1809a.get(i, -1);
                if (i3 != -1) {
                    return i3;
                }
                int mo28968e = mo28968e(i, i2);
                this.f1809a.put(i, mo28968e);
                return mo28968e;
            }
            return mo28968e(i, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int m28969d(int i, int i2) {
            int i3;
            int i4;
            int m28972a;
            if (this.f1812d && (m28972a = m28972a(this.f1810b, i)) != -1) {
                int i5 = this.f1810b.get(m28972a);
                i3 = m28972a + 1;
                i4 = m28970c(m28972a, i2) + mo28967f(m28972a);
                i5 = i4 == i2 ? i5 + 1 : 0;
                int mo28967f = mo28967f(i);
                while (i3 < i) {
                    int mo28967f2 = mo28967f(i3);
                    i4 += mo28967f2;
                    if (i4 == i2) {
                        i5++;
                        i4 = 0;
                    } else if (i4 > i2) {
                        i5++;
                        i4 = mo28967f2;
                    }
                    i3++;
                }
                return i4 + mo28967f <= i2 ? i5 + 1 : i5;
            }
            i3 = 0;
            i4 = 0;
            int mo28967f3 = mo28967f(i);
            while (i3 < i) {
            }
            if (i4 + mo28967f3 <= i2) {
            }
        }

        /* renamed from: e */
        public abstract int mo28968e(int i, int i2);

        /* renamed from: f */
        public abstract int mo28967f(int i);

        /* renamed from: g */
        public void m28966g() {
            this.f1810b.clear();
        }

        /* renamed from: h */
        public void m28965h() {
            this.f1809a.clear();
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.f1798I = false;
        this.f1799J = -1;
        this.f1802M = new SparseIntArray();
        this.f1803N = new SparseIntArray();
        this.f1804O = new C0363a();
        this.f1805P = new Rect();
        m28976e3(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1798I = false;
        this.f1799J = -1;
        this.f1802M = new SparseIntArray();
        this.f1803N = new SparseIntArray();
        this.f1804O = new C0363a();
        this.f1805P = new Rect();
        m28976e3(RecyclerView.AbstractC0391o.m28613i0(context, attributeSet, i, i2).f2002b);
    }

    /* renamed from: Q2 */
    public static int[] m28990Q2(int[] iArr, int i, int i2) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: C1 */
    public void mo28486C1(Rect rect, int i, int i2) {
        int m28603n;
        int m28603n2;
        if (this.f1800K == null) {
            super.mo28486C1(rect, i, i2);
        }
        int m28623e0 = m28623e0() + m28621f0();
        int m28619g0 = m28619g0() + m28625d0();
        if (this.f1821s == 1) {
            m28603n2 = RecyclerView.AbstractC0391o.m28603n(i2, rect.height() + m28619g0, m28630b0());
            int[] iArr = this.f1800K;
            m28603n = RecyclerView.AbstractC0391o.m28603n(i, iArr[iArr.length - 1] + m28623e0, m28627c0());
        } else {
            m28603n = RecyclerView.AbstractC0391o.m28603n(i, rect.width() + m28623e0, m28627c0());
            int[] iArr2 = this.f1800K;
            m28603n2 = RecyclerView.AbstractC0391o.m28603n(i2, iArr2[iArr2.length - 1] + m28619g0, m28630b0());
        }
        m28672B1(m28603n, m28603n2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: D */
    public RecyclerView.C0396p mo28484D() {
        return this.f1821s == 0 ? new C0364b(-2, -1) : new C0364b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: E */
    public RecyclerView.C0396p mo28481E(Context context, AttributeSet attributeSet) {
        return new C0364b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: E2 */
    public void mo28960E2(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo28960E2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: F */
    public RecyclerView.C0396p mo28479F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0364b((ViewGroup.MarginLayoutParams) layoutParams) : new C0364b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
        if (r13 == (r2 > r7)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo28473J0(View view, int i, RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        int m28658J;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        RecyclerView.C0403v c0403v2 = c0403v;
        RecyclerView.C0409z c0409z2 = c0409z;
        View m28674B = m28674B(view);
        View view4 = null;
        if (m28674B == null) {
            return null;
        }
        C0364b c0364b = (C0364b) m28674B.getLayoutParams();
        int i8 = c0364b.f1807e;
        int i9 = c0364b.f1808f + i8;
        if (super.mo28473J0(view, i, c0403v, c0409z) == null) {
            return null;
        }
        if ((m28947R1(i) == 1) != this.f1826x) {
            i2 = m28658J() - 1;
            m28658J = -1;
            i3 = -1;
        } else {
            m28658J = m28658J();
            i2 = 0;
            i3 = 1;
        }
        boolean z2 = this.f1821s == 1 && m28922q2();
        int m28982Y2 = m28982Y2(c0403v2, c0409z2, i2);
        int i10 = i2;
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        View view5 = null;
        while (i10 != m28658J) {
            int m28982Y22 = m28982Y2(c0403v2, c0409z2, i10);
            View m28659I = m28659I(i10);
            if (m28659I == m28674B) {
                break;
            }
            if (!m28659I.hasFocusable() || m28982Y22 == m28982Y2) {
                C0364b c0364b2 = (C0364b) m28659I.getLayoutParams();
                int i15 = c0364b2.f1807e;
                view2 = m28674B;
                int i16 = c0364b2.f1808f + i15;
                if (m28659I.hasFocusable() && i15 == i8 && i16 == i9) {
                    return m28659I;
                }
                if (!(m28659I.hasFocusable() && view4 == null) && (m28659I.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int min = Math.min(i16, i9) - Math.max(i15, i8);
                    if (m28659I.hasFocusable()) {
                        if (min <= i11) {
                            if (min == i11) {
                            }
                        }
                    } else if (view4 == null) {
                        i4 = i11;
                        i5 = m28658J;
                        if (m28579y0(m28659I, false, true)) {
                            i6 = i14;
                            if (min > i6) {
                                i7 = i13;
                                if (z) {
                                    if (m28659I.hasFocusable()) {
                                        i12 = c0364b2.f1807e;
                                        i13 = i7;
                                        i14 = i6;
                                        view5 = view3;
                                        view4 = m28659I;
                                        i11 = Math.min(i16, i9) - Math.max(i15, i8);
                                    } else {
                                        int i17 = c0364b2.f1807e;
                                        i14 = Math.min(i16, i9) - Math.max(i15, i8);
                                        i13 = i17;
                                        i11 = i4;
                                        view5 = m28659I;
                                    }
                                    i10 += i3;
                                    c0403v2 = c0403v;
                                    c0409z2 = c0409z;
                                    m28674B = view2;
                                    m28658J = i5;
                                }
                            } else {
                                if (min == i6) {
                                    i7 = i13;
                                } else {
                                    i7 = i13;
                                }
                                z = false;
                                if (z) {
                                }
                            }
                        }
                        i7 = i13;
                        i6 = i14;
                        z = false;
                        if (z) {
                        }
                    }
                    i4 = i11;
                    i5 = m28658J;
                    i7 = i13;
                    i6 = i14;
                    z = false;
                    if (z) {
                    }
                } else {
                    view3 = view5;
                }
                i4 = i11;
                i5 = m28658J;
                i7 = i13;
                i6 = i14;
                z = true;
                if (z) {
                }
            } else if (view4 != null) {
                break;
            } else {
                view2 = m28674B;
                view3 = view5;
                i4 = i11;
                i5 = m28658J;
                i7 = i13;
                i6 = i14;
            }
            i13 = i7;
            i14 = i6;
            i11 = i4;
            view5 = view3;
            i10 += i3;
            c0403v2 = c0403v;
            c0409z2 = c0409z;
            m28674B = view2;
            m28658J = i5;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: L1 */
    public boolean mo28469L1() {
        return this.f1816D == null && !this.f1798I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: N */
    public int mo28465N(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        if (this.f1821s == 1) {
            return this.f1799J;
        }
        if (c0409z.m28495b() < 1) {
            return 0;
        }
        return m28982Y2(c0403v, c0409z, c0409z.m28495b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: N1 */
    public void mo28951N1(RecyclerView.C0409z c0409z, LinearLayoutManager.C0369c c0369c, RecyclerView.AbstractC0391o.InterfaceC0394c interfaceC0394c) {
        int i = this.f1799J;
        for (int i2 = 0; i2 < this.f1799J && c0369c.m28900c(c0409z) && i > 0; i2++) {
            int i3 = c0369c.f1844d;
            interfaceC0394c.mo28227a(i3, Math.max(0, c0369c.f1847g));
            i -= this.f1804O.mo28967f(i3);
            c0369c.f1844d += c0369c.f1845e;
        }
    }

    /* renamed from: N2 */
    public final void m28993N2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, int i, boolean z) {
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
            View view = this.f1801L[i2];
            C0364b c0364b = (C0364b) view.getLayoutParams();
            int m28980a3 = m28980a3(c0403v, c0409z, m28616h0(view));
            c0364b.f1808f = m28980a3;
            c0364b.f1807e = i4;
            i4 += m28980a3;
            i2 += i3;
        }
    }

    /* renamed from: O2 */
    public final void m28992O2() {
        int m28658J = m28658J();
        for (int i = 0; i < m28658J; i++) {
            C0364b c0364b = (C0364b) m28659I(i).getLayoutParams();
            int m28575a = c0364b.m28575a();
            this.f1802M.put(m28575a, c0364b.m28973f());
            this.f1803N.put(m28575a, c0364b.m28974e());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: P0 */
    public void mo28460P0(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, View view, C3654y c3654y) {
        int i;
        int m28974e;
        int m28973f;
        boolean z;
        boolean z2;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0364b)) {
            super.m28648O0(view, c3654y);
            return;
        }
        C0364b c0364b = (C0364b) layoutParams;
        int m28982Y2 = m28982Y2(c0403v, c0409z, c0364b.m28575a());
        if (this.f1821s == 0) {
            i2 = c0364b.m28974e();
            i = c0364b.m28973f();
            m28973f = 1;
            z = false;
            z2 = false;
            m28974e = m28982Y2;
        } else {
            i = 1;
            m28974e = c0364b.m28974e();
            m28973f = c0364b.m28973f();
            z = false;
            z2 = false;
            i2 = m28982Y2;
        }
        c3654y.m4329e0(C3654y.C3657c.m4280a(i2, i, m28974e, m28973f, z, z2));
    }

    /* renamed from: P2 */
    public final void m28991P2(int i) {
        this.f1800K = m28990Q2(this.f1800K, this.f1799J, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: R0 */
    public void mo28455R0(RecyclerView recyclerView, int i, int i2) {
        this.f1804O.m28965h();
        this.f1804O.m28966g();
    }

    /* renamed from: R2 */
    public final void m28989R2() {
        this.f1802M.clear();
        this.f1803N.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: S0 */
    public void mo28452S0(RecyclerView recyclerView) {
        this.f1804O.m28965h();
        this.f1804O.m28966g();
    }

    /* renamed from: S2 */
    public final int m28988S2(RecyclerView.C0409z c0409z) {
        if (m28658J() != 0 && c0409z.m28495b() != 0) {
            m28945T1();
            boolean m28921r2 = m28921r2();
            View m28940Y1 = m28940Y1(!m28921r2, true);
            View m28941X1 = m28941X1(!m28921r2, true);
            if (m28940Y1 != null && m28941X1 != null) {
                int m28971b = this.f1804O.m28971b(m28616h0(m28940Y1), this.f1799J);
                int m28971b2 = this.f1804O.m28971b(m28616h0(m28941X1), this.f1799J);
                int min = Math.min(m28971b, m28971b2);
                int max = this.f1826x ? Math.max(0, ((this.f1804O.m28971b(c0409z.m28495b() - 1, this.f1799J) + 1) - Math.max(m28971b, m28971b2)) - 1) : Math.max(0, min);
                if (m28921r2) {
                    return Math.round((max * (Math.abs(this.f1823u.mo28194d(m28941X1) - this.f1823u.mo28191g(m28940Y1)) / ((this.f1804O.m28971b(m28616h0(m28941X1), this.f1799J) - this.f1804O.m28971b(m28616h0(m28940Y1), this.f1799J)) + 1))) + (this.f1823u.mo28185m() - this.f1823u.mo28191g(m28940Y1)));
                }
                return max;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: T0 */
    public void mo28450T0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f1804O.m28965h();
        this.f1804O.m28966g();
    }

    /* renamed from: T2 */
    public final int m28987T2(RecyclerView.C0409z c0409z) {
        if (m28658J() != 0 && c0409z.m28495b() != 0) {
            m28945T1();
            View m28940Y1 = m28940Y1(!m28921r2(), true);
            View m28941X1 = m28941X1(!m28921r2(), true);
            if (m28940Y1 != null && m28941X1 != null) {
                if (m28921r2()) {
                    int mo28194d = this.f1823u.mo28194d(m28941X1) - this.f1823u.mo28191g(m28940Y1);
                    int m28971b = this.f1804O.m28971b(m28616h0(m28940Y1), this.f1799J);
                    return (int) ((mo28194d / ((this.f1804O.m28971b(m28616h0(m28941X1), this.f1799J) - m28971b) + 1)) * (this.f1804O.m28971b(c0409z.m28495b() - 1, this.f1799J) + 1));
                }
                return this.f1804O.m28971b(c0409z.m28495b() - 1, this.f1799J) + 1;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: U0 */
    public void mo28448U0(RecyclerView recyclerView, int i, int i2) {
        this.f1804O.m28965h();
        this.f1804O.m28966g();
    }

    /* renamed from: U2 */
    public final void m28986U2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, LinearLayoutManager.C0367a c0367a, int i) {
        boolean z = i == 1;
        int m28981Z2 = m28981Z2(c0403v, c0409z, c0367a.f1833b);
        if (z) {
            while (m28981Z2 > 0) {
                int i2 = c0367a.f1833b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                c0367a.f1833b = i3;
                m28981Z2 = m28981Z2(c0403v, c0409z, i3);
            }
            return;
        }
        int m28495b = c0409z.m28495b() - 1;
        int i4 = c0367a.f1833b;
        while (i4 < m28495b) {
            int i5 = i4 + 1;
            int m28981Z22 = m28981Z2(c0403v, c0409z, i5);
            if (m28981Z22 <= m28981Z2) {
                break;
            }
            i4 = i5;
            m28981Z2 = m28981Z22;
        }
        c0367a.f1833b = i4;
    }

    /* renamed from: V2 */
    public final void m28985V2() {
        View[] viewArr = this.f1801L;
        if (viewArr == null || viewArr.length != this.f1799J) {
            this.f1801L = new View[this.f1799J];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: W0 */
    public void mo28445W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f1804O.m28965h();
        this.f1804O.m28966g();
    }

    /* renamed from: W2 */
    public int m28984W2(int i, int i2) {
        if (this.f1821s != 1 || !m28922q2()) {
            int[] iArr = this.f1800K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f1800K;
        int i3 = this.f1799J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: X0 */
    public void mo28443X0(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        if (c0409z.m28492e()) {
            m28992O2();
        }
        super.mo28443X0(c0403v, c0409z);
        m28989R2();
    }

    /* renamed from: X2 */
    public int m28983X2() {
        return this.f1799J;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: Y0 */
    public void mo28441Y0(RecyclerView.C0409z c0409z) {
        super.mo28441Y0(c0409z);
        this.f1798I = false;
    }

    /* renamed from: Y2 */
    public final int m28982Y2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, int i) {
        if (c0409z.m28492e()) {
            int m28539f = c0403v.m28539f(i);
            if (m28539f == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot find span size for pre layout position. ");
                sb.append(i);
                return 0;
            }
            return this.f1804O.m28971b(m28539f, this.f1799J);
        }
        return this.f1804O.m28971b(i, this.f1799J);
    }

    /* renamed from: Z2 */
    public final int m28981Z2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, int i) {
        if (c0409z.m28492e()) {
            int i2 = this.f1803N.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            int m28539f = c0403v.m28539f(i);
            if (m28539f == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
                sb.append(i);
                return 0;
            }
            return this.f1804O.m28970c(m28539f, this.f1799J);
        }
        return this.f1804O.m28970c(i, this.f1799J);
    }

    /* renamed from: a3 */
    public final int m28980a3(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, int i) {
        if (c0409z.m28492e()) {
            int i2 = this.f1802M.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            int m28539f = c0403v.m28539f(i);
            if (m28539f == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
                sb.append(i);
                return 1;
            }
            return this.f1804O.mo28967f(m28539f);
        }
        return this.f1804O.mo28967f(i);
    }

    /* renamed from: b3 */
    public final void m28979b3(float f, int i) {
        m28991P2(Math.max(Math.round(f * this.f1799J), i));
    }

    /* renamed from: c3 */
    public final void m28978c3(View view, int i, boolean z) {
        int i2;
        int i3;
        C0364b c0364b = (C0364b) view.getLayoutParams();
        Rect rect = c0364b.f2006b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0364b).topMargin + ((ViewGroup.MarginLayoutParams) c0364b).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0364b).leftMargin + ((ViewGroup.MarginLayoutParams) c0364b).rightMargin;
        int m28984W2 = m28984W2(c0364b.f1807e, c0364b.f1808f);
        if (this.f1821s == 1) {
            i3 = RecyclerView.AbstractC0391o.m28656K(m28984W2, i, i5, ((ViewGroup.MarginLayoutParams) c0364b).width, false);
            i2 = RecyclerView.AbstractC0391o.m28656K(this.f1823u.mo28184n(), m28637X(), i4, ((ViewGroup.MarginLayoutParams) c0364b).height, true);
        } else {
            int m28656K = RecyclerView.AbstractC0391o.m28656K(m28984W2, i, i4, ((ViewGroup.MarginLayoutParams) c0364b).height, false);
            int m28656K2 = RecyclerView.AbstractC0391o.m28656K(this.f1823u.mo28184n(), m28597p0(), i5, ((ViewGroup.MarginLayoutParams) c0364b).width, true);
            i2 = m28656K;
            i3 = m28656K2;
        }
        m28977d3(view, i3, i2, z);
    }

    /* renamed from: d3 */
    public final void m28977d3(View view, int i, int i2, boolean z) {
        RecyclerView.C0396p c0396p = (RecyclerView.C0396p) view.getLayoutParams();
        if (z ? m28660H1(view, i, i2, c0396p) : m28666F1(view, i, i2, c0396p)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: e3 */
    public void m28976e3(int i) {
        if (i == this.f1799J) {
            return;
        }
        this.f1798I = true;
        if (i >= 1) {
            this.f1799J = i;
            this.f1804O.m28965h();
            m28589t1();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
    }

    /* renamed from: f3 */
    public final void m28975f3() {
        int m28638W;
        int m28619g0;
        if (m28923p2() == 1) {
            m28638W = m28600o0() - m28621f0();
            m28619g0 = m28623e0();
        } else {
            m28638W = m28638W() - m28625d0();
            m28619g0 = m28619g0();
        }
        m28991P2(m28638W - m28619g0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: h2 */
    public View mo28931h2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, int i, int i2, int i3) {
        m28945T1();
        int mo28185m = this.f1823u.mo28185m();
        int mo28189i = this.f1823u.mo28189i();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View m28659I = m28659I(i);
            int m28616h0 = m28616h0(m28659I);
            if (m28616h0 >= 0 && m28616h0 < i3 && m28981Z2(c0403v, c0409z, m28616h0) == 0) {
                if (((RecyclerView.C0396p) m28659I.getLayoutParams()).m28573c()) {
                    if (view2 == null) {
                        view2 = m28659I;
                    }
                } else if (this.f1823u.mo28191g(m28659I) < mo28189i && this.f1823u.mo28194d(m28659I) >= mo28185m) {
                    return m28659I;
                } else {
                    if (view == null) {
                        view = m28659I;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: k0 */
    public int mo28422k0(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        if (this.f1821s == 0) {
            return this.f1799J;
        }
        if (c0409z.m28495b() < 1) {
            return 0;
        }
        return m28982Y2(c0403v, c0409z, c0409z.m28495b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: m */
    public boolean mo28418m(RecyclerView.C0396p c0396p) {
        return c0396p instanceof C0364b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: r */
    public int mo28410r(RecyclerView.C0409z c0409z) {
        return this.f1806Q ? m28988S2(c0409z) : super.mo28410r(c0409z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: s */
    public int mo28408s(RecyclerView.C0409z c0409z) {
        return this.f1806Q ? m28987T2(c0409z) : super.mo28408s(c0409z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        r21.f1838b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: s2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo28920s2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, LinearLayoutManager.C0369c c0369c, LinearLayoutManager.C0368b c0368b) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int mo28192f;
        int i7;
        int m28656K;
        int i8;
        View m28899d;
        int mo28186l = this.f1823u.mo28186l();
        ?? r5 = 0;
        boolean z = mo28186l != 1073741824;
        int i9 = m28658J() > 0 ? this.f1800K[this.f1799J] : 0;
        if (z) {
            m28975f3();
        }
        boolean z2 = c0369c.f1845e == 1;
        int i10 = this.f1799J;
        if (!z2) {
            i10 = m28981Z2(c0403v, c0409z, c0369c.f1844d) + m28980a3(c0403v, c0409z, c0369c.f1844d);
        }
        int i11 = 0;
        while (i11 < this.f1799J && c0369c.m28900c(c0409z) && i10 > 0) {
            int i12 = c0369c.f1844d;
            int m28980a3 = m28980a3(c0403v, c0409z, i12);
            if (m28980a3 > this.f1799J) {
                throw new IllegalArgumentException("Item at position " + i12 + " requires " + m28980a3 + " spans but GridLayoutManager has only " + this.f1799J + " spans.");
            }
            i10 -= m28980a3;
            if (i10 < 0 || (m28899d = c0369c.m28899d(c0403v)) == null) {
                break;
            }
            this.f1801L[i11] = m28899d;
            i11++;
        }
        float f = 0.0f;
        m28993N2(c0403v, c0409z, i11, z2);
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            View view = this.f1801L[i13];
            if (c0369c.f1852l == null) {
                if (z2) {
                    m28626d(view);
                } else {
                    m28624e(view, r5);
                }
            } else if (z2) {
                m28631b(view);
            } else {
                m28628c(view, r5);
            }
            m28611j(view, this.f1805P);
            m28978c3(view, mo28186l, r5);
            int mo28193e = this.f1823u.mo28193e(view);
            if (mo28193e > i14) {
                i14 = mo28193e;
            }
            float mo28192f2 = (this.f1823u.mo28192f(view) * 1.0f) / ((C0364b) view.getLayoutParams()).f1808f;
            if (mo28192f2 > f) {
                f = mo28192f2;
            }
            i13++;
            r5 = 0;
        }
        if (z) {
            m28979b3(f, i9);
            i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                View view2 = this.f1801L[i15];
                m28978c3(view2, 1073741824, true);
                int mo28193e2 = this.f1823u.mo28193e(view2);
                if (mo28193e2 > i14) {
                    i14 = mo28193e2;
                }
            }
        }
        for (int i16 = 0; i16 < i11; i16++) {
            View view3 = this.f1801L[i16];
            if (this.f1823u.mo28193e(view3) != i14) {
                C0364b c0364b = (C0364b) view3.getLayoutParams();
                Rect rect = c0364b.f2006b;
                int i17 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0364b).topMargin + ((ViewGroup.MarginLayoutParams) c0364b).bottomMargin;
                int i18 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0364b).leftMargin + ((ViewGroup.MarginLayoutParams) c0364b).rightMargin;
                int m28984W2 = m28984W2(c0364b.f1807e, c0364b.f1808f);
                if (this.f1821s == 1) {
                    i8 = RecyclerView.AbstractC0391o.m28656K(m28984W2, 1073741824, i18, ((ViewGroup.MarginLayoutParams) c0364b).width, false);
                    m28656K = View.MeasureSpec.makeMeasureSpec(i14 - i17, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i18, 1073741824);
                    m28656K = RecyclerView.AbstractC0391o.m28656K(m28984W2, 1073741824, i17, ((ViewGroup.MarginLayoutParams) c0364b).height, false);
                    i8 = makeMeasureSpec;
                }
                m28977d3(view3, i8, m28656K, true);
            }
        }
        int i19 = 0;
        c0368b.f1837a = i14;
        if (this.f1821s == 1) {
            if (c0369c.f1846f == -1) {
                i3 = c0369c.f1842b;
                i4 = i3 - i14;
            } else {
                int i20 = c0369c.f1842b;
                i4 = i20;
                i3 = i14 + i20;
            }
            i = 0;
            i2 = 0;
        } else if (c0369c.f1846f == -1) {
            int i21 = c0369c.f1842b;
            i2 = i21 - i14;
            i4 = 0;
            i = i21;
            i3 = 0;
        } else {
            int i22 = c0369c.f1842b;
            i = i14 + i22;
            i2 = i22;
            i3 = 0;
            i4 = 0;
        }
        while (i19 < i11) {
            View view4 = this.f1801L[i19];
            C0364b c0364b2 = (C0364b) view4.getLayoutParams();
            if (this.f1821s != 1) {
                int m28619g0 = m28619g0() + this.f1800K[c0364b2.f1807e];
                i5 = m28619g0;
                i6 = i;
                mo28192f = this.f1823u.mo28192f(view4) + m28619g0;
            } else if (m28922q2()) {
                int m28623e0 = m28623e0() + this.f1800K[this.f1799J - c0364b2.f1807e];
                i2 = m28623e0 - this.f1823u.mo28192f(view4);
                mo28192f = i3;
                i6 = m28623e0;
                i5 = i4;
            } else {
                int m28623e02 = m28623e0() + this.f1800K[c0364b2.f1807e];
                mo28192f = i3;
                i7 = m28623e02;
                i5 = i4;
                i6 = this.f1823u.mo28192f(view4) + m28623e02;
                m28577z0(view4, i7, i5, i6, mo28192f);
                if (!c0364b2.m28573c() || c0364b2.m28574b()) {
                    c0368b.f1839c = true;
                }
                c0368b.f1840d |= view4.hasFocusable();
                i19++;
                i3 = mo28192f;
                i = i6;
                i4 = i5;
                i2 = i7;
            }
            i7 = i2;
            m28577z0(view4, i7, i5, i6, mo28192f);
            if (!c0364b2.m28573c()) {
            }
            c0368b.f1839c = true;
            c0368b.f1840d |= view4.hasFocusable();
            i19++;
            i3 = mo28192f;
            i = i6;
            i4 = i5;
            i2 = i7;
        }
        Arrays.fill(this.f1801L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: u */
    public int mo28403u(RecyclerView.C0409z c0409z) {
        return this.f1806Q ? m28988S2(c0409z) : super.mo28403u(c0409z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: u2 */
    public void mo28918u2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, LinearLayoutManager.C0367a c0367a, int i) {
        super.mo28918u2(c0403v, c0409z, c0367a, i);
        m28975f3();
        if (c0409z.m28495b() > 0 && !c0409z.m28492e()) {
            m28986U2(c0403v, c0409z, c0367a, i);
        }
        m28985V2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: v */
    public int mo28401v(RecyclerView.C0409z c0409z) {
        return this.f1806Q ? m28987T2(c0409z) : super.mo28401v(c0409z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: w1 */
    public int mo28399w1(int i, RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        m28975f3();
        m28985V2();
        return super.mo28399w1(i, c0403v, c0409z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: y1 */
    public int mo28395y1(int i, RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        m28975f3();
        m28985V2();
        return super.mo28395y1(i, c0403v, c0409z);
    }
}
