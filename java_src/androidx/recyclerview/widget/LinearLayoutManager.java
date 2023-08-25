package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.y.b {
    public int A;
    public int B;
    public boolean C;
    public SavedState D;
    public final a E;
    public final b F;
    public int G;
    public int[] H;
    public int s;
    public c t;
    public i u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int p;
        public int q;
        public boolean r;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.p = parcel.readInt();
            this.q = parcel.readInt();
            this.r = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.p = savedState.p;
            this.q = savedState.q;
            this.r = savedState.r;
        }

        public boolean a() {
            return this.p >= 0;
        }

        public void b() {
            this.p = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.p);
            parcel.writeInt(this.q);
            parcel.writeInt(this.r ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public i a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            e();
        }

        public void a() {
            this.c = this.d ? this.a.i() : this.a.m();
        }

        public void b(View view, int i) {
            this.c = this.d ? this.a.d(view) + this.a.o() : this.a.g(view);
            this.b = i;
        }

        public void c(View view, int i) {
            int o = this.a.o();
            if (o >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int i2 = (this.a.i() - o) - this.a.d(view);
                this.c = this.a.i() - i2;
                if (i2 > 0) {
                    int e = this.c - this.a.e(view);
                    int m = this.a.m();
                    int min = e - (m + Math.min(this.a.g(view) - m, 0));
                    if (min < 0) {
                        this.c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.a.g(view);
            int m2 = g - this.a.m();
            this.c = g;
            if (m2 > 0) {
                int i3 = (this.a.i() - Math.min(0, (this.a.i() - o) - this.a.d(view))) - (g + this.a.e(view));
                if (i3 < 0) {
                    this.c -= Math.min(m2, -i3);
                }
            }
        }

        public boolean d(View view, RecyclerView.z zVar) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < zVar.b();
        }

        public void e() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        public void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int k;
        public boolean m;
        public boolean a = true;
        public int h = 0;
        public int i = 0;
        public boolean j = false;
        public List<RecyclerView.c0> l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f = f(view);
            this.d = f == null ? -1 : ((RecyclerView.p) f.getLayoutParams()).a();
        }

        public boolean c(RecyclerView.z zVar) {
            int i = this.d;
            return i >= 0 && i < zVar.b();
        }

        public View d(RecyclerView.v vVar) {
            if (this.l != null) {
                return e();
            }
            View o = vVar.o(this.d);
            this.d += this.e;
            return o;
        }

        public final View e() {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                View view = this.l.get(i).a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.d == pVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int a;
            int size = this.l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.l.get(i2).a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (a = (pVar.a() - this.d) * this.e) >= 0 && a < i) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i = a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        C2(i);
        D2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.o.d i0 = RecyclerView.o.i0(context, attributeSet, i, i2);
        C2(i0.a);
        D2(i0.c);
        E2(i0.d);
    }

    public final void A2() {
        this.x = (this.s == 1 || !q2()) ? this.w : !this.w;
    }

    public int B2(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (J() == 0 || i == 0) {
            return 0;
        }
        T1();
        this.t.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        I2(i2, abs, true, zVar);
        c cVar = this.t;
        int U1 = cVar.g + U1(vVar, cVar, zVar, false);
        if (U1 < 0) {
            return 0;
        }
        if (abs > U1) {
            i = i2 * U1;
        }
        this.u.r(-i);
        this.t.k = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View C(int i) {
        int J = J();
        if (J == 0) {
            return null;
        }
        int h0 = i - h0(I(0));
        if (h0 >= 0 && h0 < J) {
            View I = I(h0);
            if (h0(I) == i) {
                return I;
            }
        }
        return super.C(i);
    }

    public void C2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        g(null);
        if (i != this.s || this.u == null) {
            i b2 = i.b(this, i);
            this.u = b2;
            this.E.a = b2;
            this.s = i;
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D() {
        return new RecyclerView.p(-2, -2);
    }

    public void D2(boolean z) {
        g(null);
        if (z == this.w) {
            return;
        }
        this.w = z;
        t1();
    }

    public void E2(boolean z) {
        g(null);
        if (this.y == z) {
            return;
        }
        this.y = z;
        t1();
    }

    public final boolean F2(RecyclerView.v vVar, RecyclerView.z zVar, a aVar) {
        boolean z = false;
        if (J() == 0) {
            return false;
        }
        View V = V();
        if (V != null && aVar.d(V, zVar)) {
            aVar.c(V, h0(V));
            return true;
        } else if (this.v != this.y) {
            return false;
        } else {
            View i2 = aVar.d ? i2(vVar, zVar) : j2(vVar, zVar);
            if (i2 != null) {
                aVar.b(i2, h0(i2));
                if (!zVar.e() && L1()) {
                    if ((this.u.g(i2) >= this.u.i() || this.u.d(i2) < this.u.m()) ? true : true) {
                        aVar.c = aVar.d ? this.u.i() : this.u.m();
                    }
                }
                return true;
            }
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean G1() {
        return (X() == 1073741824 || p0() == 1073741824 || !q0()) ? false : true;
    }

    public final boolean G2(RecyclerView.z zVar, a aVar) {
        int i;
        if (!zVar.e() && (i = this.A) != -1) {
            if (i >= 0 && i < zVar.b()) {
                aVar.b = this.A;
                SavedState savedState = this.D;
                if (savedState != null && savedState.a()) {
                    boolean z = this.D.r;
                    aVar.d = z;
                    aVar.c = z ? this.u.i() - this.D.q : this.u.m() + this.D.q;
                    return true;
                } else if (this.B != Integer.MIN_VALUE) {
                    boolean z2 = this.x;
                    aVar.d = z2;
                    aVar.c = z2 ? this.u.i() - this.B : this.u.m() + this.B;
                    return true;
                } else {
                    View C = C(this.A);
                    if (C == null) {
                        if (J() > 0) {
                            aVar.d = (this.A < h0(I(0))) == this.x;
                        }
                        aVar.a();
                    } else if (this.u.e(C) > this.u.n()) {
                        aVar.a();
                        return true;
                    } else if (this.u.g(C) - this.u.m() < 0) {
                        aVar.c = this.u.m();
                        aVar.d = false;
                        return true;
                    } else if (this.u.i() - this.u.d(C) < 0) {
                        aVar.c = this.u.i();
                        aVar.d = true;
                        return true;
                    } else {
                        aVar.c = aVar.d ? this.u.d(C) + this.u.o() : this.u.g(C);
                    }
                    return true;
                }
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    public final void H2(RecyclerView.v vVar, RecyclerView.z zVar, a aVar) {
        if (G2(zVar, aVar) || F2(vVar, zVar, aVar)) {
            return;
        }
        aVar.a();
        aVar.b = this.y ? zVar.b() - 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.I0(recyclerView, vVar);
        if (this.C) {
            k1(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I1(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i);
        J1(gVar);
    }

    public final void I2(int i, int i2, boolean z, RecyclerView.z zVar) {
        int m;
        this.t.m = z2();
        this.t.f = i;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(zVar, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        boolean z2 = i == 1;
        c cVar = this.t;
        int i3 = z2 ? max2 : max;
        cVar.h = i3;
        if (!z2) {
            max = max2;
        }
        cVar.i = max;
        if (z2) {
            cVar.h = i3 + this.u.j();
            View m2 = m2();
            c cVar2 = this.t;
            cVar2.e = this.x ? -1 : 1;
            int h0 = h0(m2);
            c cVar3 = this.t;
            cVar2.d = h0 + cVar3.e;
            cVar3.b = this.u.d(m2);
            m = this.u.d(m2) - this.u.i();
        } else {
            View n2 = n2();
            this.t.h += this.u.m();
            c cVar4 = this.t;
            cVar4.e = this.x ? 1 : -1;
            int h02 = h0(n2);
            c cVar5 = this.t;
            cVar4.d = h02 + cVar5.e;
            cVar5.b = this.u.g(n2);
            m = (-this.u.g(n2)) + this.u.m();
        }
        c cVar6 = this.t;
        cVar6.c = i2;
        if (z) {
            cVar6.c = i2 - m;
        }
        cVar6.g = m;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View J0(View view, int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        int R1;
        A2();
        if (J() == 0 || (R1 = R1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        T1();
        I2(R1, (int) (this.u.n() * 0.33333334f), false, zVar);
        c cVar = this.t;
        cVar.g = Integer.MIN_VALUE;
        cVar.a = false;
        U1(vVar, cVar, zVar, true);
        View g2 = R1 == -1 ? g2() : f2();
        View n2 = R1 == -1 ? n2() : m2();
        if (n2.hasFocusable()) {
            if (g2 == null) {
                return null;
            }
            return n2;
        }
        return g2;
    }

    public final void J2(int i, int i2) {
        this.t.c = this.u.i() - i2;
        c cVar = this.t;
        cVar.e = this.x ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            accessibilityEvent.setFromIndex(Z1());
            accessibilityEvent.setToIndex(c2());
        }
    }

    public final void K2(a aVar) {
        J2(aVar.b, aVar.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean L1() {
        return this.D == null && this.v == this.y;
    }

    public final void L2(int i, int i2) {
        this.t.c = i2 - this.u.m();
        c cVar = this.t;
        cVar.d = i;
        cVar.e = this.x ? 1 : -1;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    public void M1(RecyclerView.z zVar, int[] iArr) {
        int i;
        int o2 = o2(zVar);
        if (this.t.f == -1) {
            i = 0;
        } else {
            i = o2;
            o2 = 0;
        }
        iArr[0] = o2;
        iArr[1] = i;
    }

    public final void M2(a aVar) {
        L2(aVar.b, aVar.c);
    }

    public void N1(RecyclerView.z zVar, c cVar, RecyclerView.o.c cVar2) {
        int i = cVar.d;
        if (i < 0 || i >= zVar.b()) {
            return;
        }
        cVar2.a(i, Math.max(0, cVar.g));
    }

    public final int O1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.a(zVar, this.u, Y1(!this.z, true), X1(!this.z, true), this, this.z);
    }

    public final int P1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.b(zVar, this.u, Y1(!this.z, true), X1(!this.z, true), this, this.z, this.x);
    }

    public final int Q1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.c(zVar, this.u, Y1(!this.z, true), X1(!this.z, true), this, this.z);
    }

    public int R1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.s == 1) ? 1 : Integer.MIN_VALUE : this.s == 0 ? 1 : Integer.MIN_VALUE : this.s == 1 ? -1 : Integer.MIN_VALUE : this.s == 0 ? -1 : Integer.MIN_VALUE : (this.s != 1 && q2()) ? -1 : 1 : (this.s != 1 && q2()) ? 1 : -1;
    }

    public c S1() {
        return new c();
    }

    public void T1() {
        if (this.t == null) {
            this.t = S1();
        }
    }

    public int U1(RecyclerView.v vVar, c cVar, RecyclerView.z zVar, boolean z) {
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            v2(vVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.m && i3 <= 0) || !cVar.c(zVar)) {
                break;
            }
            bVar.a();
            s2(vVar, zVar, cVar, bVar);
            if (!bVar.b) {
                cVar.b += bVar.a * cVar.f;
                if (!bVar.c || cVar.l != null || !zVar.e()) {
                    int i4 = cVar.c;
                    int i5 = bVar.a;
                    cVar.c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.a;
                    cVar.g = i7;
                    int i8 = cVar.c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    v2(vVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    public final View V1() {
        return d2(0, J());
    }

    public final View W1(RecyclerView.v vVar, RecyclerView.z zVar) {
        return h2(vVar, zVar, 0, J(), zVar.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView.v vVar, RecyclerView.z zVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int k2;
        int i5;
        View C;
        int g;
        int i6;
        int i7 = -1;
        if (!(this.D == null && this.A == -1) && zVar.b() == 0) {
            k1(vVar);
            return;
        }
        SavedState savedState = this.D;
        if (savedState != null && savedState.a()) {
            this.A = this.D.p;
        }
        T1();
        this.t.a = false;
        A2();
        View V = V();
        a aVar = this.E;
        if (!aVar.e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.d = this.x ^ this.y;
            H2(vVar, zVar, aVar2);
            this.E.e = true;
        } else if (V != null && (this.u.g(V) >= this.u.i() || this.u.d(V) <= this.u.m())) {
            this.E.c(V, h0(V));
        }
        c cVar = this.t;
        cVar.f = cVar.k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(zVar, iArr);
        int max = Math.max(0, this.H[0]) + this.u.m();
        int max2 = Math.max(0, this.H[1]) + this.u.j();
        if (zVar.e() && (i5 = this.A) != -1 && this.B != Integer.MIN_VALUE && (C = C(i5)) != null) {
            if (this.x) {
                i6 = this.u.i() - this.u.d(C);
                g = this.B;
            } else {
                g = this.u.g(C) - this.u.m();
                i6 = this.B;
            }
            int i8 = i6 - g;
            if (i8 > 0) {
                max += i8;
            } else {
                max2 -= i8;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.d ? !this.x : this.x) {
            i7 = 1;
        }
        u2(vVar, zVar, aVar3, i7);
        w(vVar);
        this.t.m = z2();
        this.t.j = zVar.e();
        this.t.i = 0;
        a aVar4 = this.E;
        if (aVar4.d) {
            M2(aVar4);
            c cVar2 = this.t;
            cVar2.h = max;
            U1(vVar, cVar2, zVar, false);
            c cVar3 = this.t;
            i2 = cVar3.b;
            int i9 = cVar3.d;
            int i10 = cVar3.c;
            if (i10 > 0) {
                max2 += i10;
            }
            K2(this.E);
            c cVar4 = this.t;
            cVar4.h = max2;
            cVar4.d += cVar4.e;
            U1(vVar, cVar4, zVar, false);
            c cVar5 = this.t;
            i = cVar5.b;
            int i11 = cVar5.c;
            if (i11 > 0) {
                L2(i9, i2);
                c cVar6 = this.t;
                cVar6.h = i11;
                U1(vVar, cVar6, zVar, false);
                i2 = this.t.b;
            }
        } else {
            K2(aVar4);
            c cVar7 = this.t;
            cVar7.h = max2;
            U1(vVar, cVar7, zVar, false);
            c cVar8 = this.t;
            i = cVar8.b;
            int i12 = cVar8.d;
            int i13 = cVar8.c;
            if (i13 > 0) {
                max += i13;
            }
            M2(this.E);
            c cVar9 = this.t;
            cVar9.h = max;
            cVar9.d += cVar9.e;
            U1(vVar, cVar9, zVar, false);
            c cVar10 = this.t;
            i2 = cVar10.b;
            int i14 = cVar10.c;
            if (i14 > 0) {
                J2(i12, i);
                c cVar11 = this.t;
                cVar11.h = i14;
                U1(vVar, cVar11, zVar, false);
                i = this.t.b;
            }
        }
        if (J() > 0) {
            if (this.x ^ this.y) {
                int k22 = k2(i, vVar, zVar, true);
                i3 = i2 + k22;
                i4 = i + k22;
                k2 = l2(i3, vVar, zVar, false);
            } else {
                int l2 = l2(i2, vVar, zVar, true);
                i3 = i2 + l2;
                i4 = i + l2;
                k2 = k2(i4, vVar, zVar, false);
            }
            i2 = i3 + k2;
            i = i4 + k2;
        }
        t2(vVar, zVar, i2, i);
        if (zVar.e()) {
            this.E.e();
        } else {
            this.u.s();
        }
        this.v = this.y;
    }

    public View X1(boolean z, boolean z2) {
        int J;
        int i;
        if (this.x) {
            J = 0;
            i = J();
        } else {
            J = J() - 1;
            i = -1;
        }
        return e2(J, i, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.z zVar) {
        super.Y0(zVar);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    public View Y1(boolean z, boolean z2) {
        int i;
        int J;
        if (this.x) {
            i = J() - 1;
            J = -1;
        } else {
            i = 0;
            J = J();
        }
        return e2(i, J, z, z2);
    }

    public int Z1() {
        View e2 = e2(0, J(), false, true);
        if (e2 == null) {
            return -1;
        }
        return h0(e2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF a(int i) {
        if (J() == 0) {
            return null;
        }
        int i2 = (i < h0(I(0))) != this.x ? -1 : 1;
        return this.s == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final View a2() {
        return d2(J() - 1, -1);
    }

    public final View b2(RecyclerView.v vVar, RecyclerView.z zVar) {
        return h2(vVar, zVar, J() - 1, -1, zVar.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.D = (SavedState) parcelable;
            t1();
        }
    }

    public int c2() {
        View e2 = e2(J() - 1, -1, false, true);
        if (e2 == null) {
            return -1;
        }
        return h0(e2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable d1() {
        if (this.D != null) {
            return new SavedState(this.D);
        }
        SavedState savedState = new SavedState();
        if (J() > 0) {
            T1();
            boolean z = this.v ^ this.x;
            savedState.r = z;
            if (z) {
                View m2 = m2();
                savedState.q = this.u.i() - this.u.d(m2);
                savedState.p = h0(m2);
            } else {
                View n2 = n2();
                savedState.p = h0(n2);
                savedState.q = this.u.g(n2) - this.u.m();
            }
        } else {
            savedState.b();
        }
        return savedState;
    }

    public View d2(int i, int i2) {
        int i3;
        int i4;
        T1();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return I(i);
        }
        if (this.u.g(I(i)) < this.u.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.s == 0 ? this.e : this.f).a(i, i2, i3, i4);
    }

    public View e2(int i, int i2, boolean z, boolean z2) {
        T1();
        return (this.s == 0 ? this.e : this.f).a(i, i2, z ? 24579 : 320, z2 ? 320 : 0);
    }

    public final View f2() {
        return this.x ? V1() : a2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(String str) {
        if (this.D == null) {
            super.g(str);
        }
    }

    public final View g2() {
        return this.x ? a2() : V1();
    }

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
            if (h0 >= 0 && h0 < i3) {
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

    public final View i2(RecyclerView.v vVar, RecyclerView.z zVar) {
        return this.x ? W1(vVar, zVar) : b2(vVar, zVar);
    }

    public final View j2(RecyclerView.v vVar, RecyclerView.z zVar) {
        return this.x ? b2(vVar, zVar) : W1(vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean k() {
        return this.s == 0;
    }

    public final int k2(int i, RecyclerView.v vVar, RecyclerView.z zVar, boolean z) {
        int i2;
        int i3 = this.u.i() - i;
        if (i3 > 0) {
            int i4 = -B2(-i3, vVar, zVar);
            int i5 = i + i4;
            if (!z || (i2 = this.u.i() - i5) <= 0) {
                return i4;
            }
            this.u.r(i2);
            return i2 + i4;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l() {
        return this.s == 1;
    }

    public final int l2(int i, RecyclerView.v vVar, RecyclerView.z zVar, boolean z) {
        int m;
        int m2 = i - this.u.m();
        if (m2 > 0) {
            int i2 = -B2(m2, vVar, zVar);
            int i3 = i + i2;
            if (!z || (m = i3 - this.u.m()) <= 0) {
                return i2;
            }
            this.u.r(-m);
            return i2 - m;
        }
        return 0;
    }

    public final View m2() {
        return I(this.x ? 0 : J() - 1);
    }

    public final View n2() {
        return I(this.x ? J() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o(int i, int i2, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        if (this.s != 0) {
            i = i2;
        }
        if (J() == 0 || i == 0) {
            return;
        }
        T1();
        I2(i > 0 ? 1 : -1, Math.abs(i), true, zVar);
        N1(zVar, this.t, cVar);
    }

    @Deprecated
    public int o2(RecyclerView.z zVar) {
        if (zVar.d()) {
            return this.u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p(int i, RecyclerView.o.c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.D;
        if (savedState == null || !savedState.a()) {
            A2();
            z = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.D;
            z = savedState2.r;
            i2 = savedState2.p;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.G && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    public int p2() {
        return this.s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q(RecyclerView.z zVar) {
        return O1(zVar);
    }

    public boolean q2() {
        return Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.z zVar) {
        return P1(zVar);
    }

    public boolean r2() {
        return this.z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.z zVar) {
        return Q1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean s0() {
        return true;
    }

    public void s2(RecyclerView.v vVar, RecyclerView.z zVar, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int f;
        View d = cVar.d(vVar);
        if (d == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) d.getLayoutParams();
        if (cVar.l == null) {
            if (this.x == (cVar.f == -1)) {
                d(d);
            } else {
                e(d, 0);
            }
        } else {
            if (this.x == (cVar.f == -1)) {
                b(d);
            } else {
                c(d, 0);
            }
        }
        A0(d, 0, 0);
        bVar.a = this.u.e(d);
        if (this.s == 1) {
            if (q2()) {
                f = o0() - f0();
                i4 = f - this.u.f(d);
            } else {
                i4 = e0();
                f = this.u.f(d) + i4;
            }
            int i5 = cVar.f;
            int i6 = cVar.b;
            if (i5 == -1) {
                i3 = i6;
                i2 = f;
                i = i6 - bVar.a;
            } else {
                i = i6;
                i2 = f;
                i3 = bVar.a + i6;
            }
        } else {
            int g0 = g0();
            int f2 = this.u.f(d) + g0;
            int i7 = cVar.f;
            int i8 = cVar.b;
            if (i7 == -1) {
                i2 = i8;
                i = g0;
                i3 = f2;
                i4 = i8 - bVar.a;
            } else {
                i = g0;
                i2 = bVar.a + i8;
                i3 = f2;
                i4 = i8;
            }
        }
        z0(d, i4, i, i2, i3);
        if (pVar.c() || pVar.b()) {
            bVar.c = true;
        }
        bVar.d = d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.z zVar) {
        return O1(zVar);
    }

    public final void t2(RecyclerView.v vVar, RecyclerView.z zVar, int i, int i2) {
        if (!zVar.g() || J() == 0 || zVar.e() || !L1()) {
            return;
        }
        List<RecyclerView.c0> k = vVar.k();
        int size = k.size();
        int h0 = h0(I(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.c0 c0Var = k.get(i5);
            if (!c0Var.x()) {
                char c2 = (c0Var.o() < h0) != this.x ? (char) 65535 : (char) 1;
                int e = this.u.e(c0Var.a);
                if (c2 == 65535) {
                    i3 += e;
                } else {
                    i4 += e;
                }
            }
        }
        this.t.l = k;
        if (i3 > 0) {
            L2(h0(n2()), i);
            c cVar = this.t;
            cVar.h = i3;
            cVar.c = 0;
            cVar.a();
            U1(vVar, this.t, zVar, false);
        }
        if (i4 > 0) {
            J2(h0(m2()), i2);
            c cVar2 = this.t;
            cVar2.h = i4;
            cVar2.c = 0;
            cVar2.a();
            U1(vVar, this.t, zVar, false);
        }
        this.t.l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.z zVar) {
        return P1(zVar);
    }

    public void u2(RecyclerView.v vVar, RecyclerView.z zVar, a aVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        return Q1(zVar);
    }

    public final void v2(RecyclerView.v vVar, c cVar) {
        if (!cVar.a || cVar.m) {
            return;
        }
        int i = cVar.g;
        int i2 = cVar.i;
        if (cVar.f == -1) {
            x2(vVar, i, i2);
        } else {
            y2(vVar, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.s == 1) {
            return 0;
        }
        return B2(i, vVar, zVar);
    }

    public final void w2(RecyclerView.v vVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                n1(i, vVar);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            n1(i3, vVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void x1(int i) {
        this.A = i;
        this.B = Integer.MIN_VALUE;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.b();
        }
        t1();
    }

    public final void x2(RecyclerView.v vVar, int i, int i2) {
        int J = J();
        if (i < 0) {
            return;
        }
        int h = (this.u.h() - i) + i2;
        if (this.x) {
            for (int i3 = 0; i3 < J; i3++) {
                View I = I(i3);
                if (this.u.g(I) < h || this.u.q(I) < h) {
                    w2(vVar, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = J - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View I2 = I(i5);
            if (this.u.g(I2) < h || this.u.q(I2) < h) {
                w2(vVar, i4, i5);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.s == 0) {
            return 0;
        }
        return B2(i, vVar, zVar);
    }

    public final void y2(RecyclerView.v vVar, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int J = J();
        if (!this.x) {
            for (int i4 = 0; i4 < J; i4++) {
                View I = I(i4);
                if (this.u.d(I) > i3 || this.u.p(I) > i3) {
                    w2(vVar, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = J - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View I2 = I(i6);
            if (this.u.d(I2) > i3 || this.u.p(I2) > i3) {
                w2(vVar, i5, i6);
                return;
            }
        }
    }

    public boolean z2() {
        return this.u.k() == 0 && this.u.h() == 0;
    }
}
