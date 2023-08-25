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
public class LinearLayoutManager extends RecyclerView.AbstractC0391o implements RecyclerView.AbstractC0406y.InterfaceC0408b {

    /* renamed from: A */
    public int f1813A;

    /* renamed from: B */
    public int f1814B;

    /* renamed from: C */
    public boolean f1815C;

    /* renamed from: D */
    public SavedState f1816D;

    /* renamed from: E */
    public final C0367a f1817E;

    /* renamed from: F */
    public final C0368b f1818F;

    /* renamed from: G */
    public int f1819G;

    /* renamed from: H */
    public int[] f1820H;

    /* renamed from: s */
    public int f1821s;

    /* renamed from: t */
    public C0369c f1822t;

    /* renamed from: u */
    public AbstractC0446i f1823u;

    /* renamed from: v */
    public boolean f1824v;

    /* renamed from: w */
    public boolean f1825w;

    /* renamed from: x */
    public boolean f1826x;

    /* renamed from: y */
    public boolean f1827y;

    /* renamed from: z */
    public boolean f1828z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0366a();

        /* renamed from: p */
        public int f1829p;

        /* renamed from: q */
        public int f1830q;

        /* renamed from: r */
        public boolean f1831r;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        /* loaded from: classes.dex */
        public static class C0366a implements Parcelable.Creator<SavedState> {
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
            this.f1829p = parcel.readInt();
            this.f1830q = parcel.readInt();
            this.f1831r = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f1829p = savedState.f1829p;
            this.f1830q = savedState.f1830q;
            this.f1831r = savedState.f1831r;
        }

        /* renamed from: a */
        public boolean m28912a() {
            return this.f1829p >= 0;
        }

        /* renamed from: b */
        public void m28911b() {
            this.f1829p = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1829p);
            parcel.writeInt(this.f1830q);
            parcel.writeInt(this.f1831r ? 1 : 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    /* loaded from: classes.dex */
    public static class C0367a {

        /* renamed from: a */
        public AbstractC0446i f1832a;

        /* renamed from: b */
        public int f1833b;

        /* renamed from: c */
        public int f1834c;

        /* renamed from: d */
        public boolean f1835d;

        /* renamed from: e */
        public boolean f1836e;

        public C0367a() {
            m28904e();
        }

        /* renamed from: a */
        public void m28908a() {
            this.f1834c = this.f1835d ? this.f1832a.mo28189i() : this.f1832a.mo28185m();
        }

        /* renamed from: b */
        public void m28907b(View view, int i) {
            this.f1834c = this.f1835d ? this.f1832a.mo28194d(view) + this.f1832a.m28196o() : this.f1832a.mo28191g(view);
            this.f1833b = i;
        }

        /* renamed from: c */
        public void m28906c(View view, int i) {
            int m28196o = this.f1832a.m28196o();
            if (m28196o >= 0) {
                m28907b(view, i);
                return;
            }
            this.f1833b = i;
            if (this.f1835d) {
                int mo28189i = (this.f1832a.mo28189i() - m28196o) - this.f1832a.mo28194d(view);
                this.f1834c = this.f1832a.mo28189i() - mo28189i;
                if (mo28189i > 0) {
                    int mo28193e = this.f1834c - this.f1832a.mo28193e(view);
                    int mo28185m = this.f1832a.mo28185m();
                    int min = mo28193e - (mo28185m + Math.min(this.f1832a.mo28191g(view) - mo28185m, 0));
                    if (min < 0) {
                        this.f1834c += Math.min(mo28189i, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int mo28191g = this.f1832a.mo28191g(view);
            int mo28185m2 = mo28191g - this.f1832a.mo28185m();
            this.f1834c = mo28191g;
            if (mo28185m2 > 0) {
                int mo28189i2 = (this.f1832a.mo28189i() - Math.min(0, (this.f1832a.mo28189i() - m28196o) - this.f1832a.mo28194d(view))) - (mo28191g + this.f1832a.mo28193e(view));
                if (mo28189i2 < 0) {
                    this.f1834c -= Math.min(mo28185m2, -mo28189i2);
                }
            }
        }

        /* renamed from: d */
        public boolean m28905d(View view, RecyclerView.C0409z c0409z) {
            RecyclerView.C0396p c0396p = (RecyclerView.C0396p) view.getLayoutParams();
            return !c0396p.m28573c() && c0396p.m28575a() >= 0 && c0396p.m28575a() < c0409z.m28495b();
        }

        /* renamed from: e */
        public void m28904e() {
            this.f1833b = -1;
            this.f1834c = Integer.MIN_VALUE;
            this.f1835d = false;
            this.f1836e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f1833b + ", mCoordinate=" + this.f1834c + ", mLayoutFromEnd=" + this.f1835d + ", mValid=" + this.f1836e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C0368b {

        /* renamed from: a */
        public int f1837a;

        /* renamed from: b */
        public boolean f1838b;

        /* renamed from: c */
        public boolean f1839c;

        /* renamed from: d */
        public boolean f1840d;

        /* renamed from: a */
        public void m28903a() {
            this.f1837a = 0;
            this.f1838b = false;
            this.f1839c = false;
            this.f1840d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C0369c {

        /* renamed from: b */
        public int f1842b;

        /* renamed from: c */
        public int f1843c;

        /* renamed from: d */
        public int f1844d;

        /* renamed from: e */
        public int f1845e;

        /* renamed from: f */
        public int f1846f;

        /* renamed from: g */
        public int f1847g;

        /* renamed from: k */
        public int f1851k;

        /* renamed from: m */
        public boolean f1853m;

        /* renamed from: a */
        public boolean f1841a = true;

        /* renamed from: h */
        public int f1848h = 0;

        /* renamed from: i */
        public int f1849i = 0;

        /* renamed from: j */
        public boolean f1850j = false;

        /* renamed from: l */
        public List<RecyclerView.AbstractC0376c0> f1852l = null;

        /* renamed from: a */
        public void m28902a() {
            m28901b(null);
        }

        /* renamed from: b */
        public void m28901b(View view) {
            View m28897f = m28897f(view);
            this.f1844d = m28897f == null ? -1 : ((RecyclerView.C0396p) m28897f.getLayoutParams()).m28575a();
        }

        /* renamed from: c */
        public boolean m28900c(RecyclerView.C0409z c0409z) {
            int i = this.f1844d;
            return i >= 0 && i < c0409z.m28495b();
        }

        /* renamed from: d */
        public View m28899d(RecyclerView.C0403v c0403v) {
            if (this.f1852l != null) {
                return m28898e();
            }
            View m28530o = c0403v.m28530o(this.f1844d);
            this.f1844d += this.f1845e;
            return m28530o;
        }

        /* renamed from: e */
        public final View m28898e() {
            int size = this.f1852l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f1852l.get(i).f1947a;
                RecyclerView.C0396p c0396p = (RecyclerView.C0396p) view.getLayoutParams();
                if (!c0396p.m28573c() && this.f1844d == c0396p.m28575a()) {
                    m28901b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: f */
        public View m28897f(View view) {
            int m28575a;
            int size = this.f1852l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f1852l.get(i2).f1947a;
                RecyclerView.C0396p c0396p = (RecyclerView.C0396p) view3.getLayoutParams();
                if (view3 != view && !c0396p.m28573c() && (m28575a = (c0396p.m28575a() - this.f1844d) * this.f1845e) >= 0 && m28575a < i) {
                    view2 = view3;
                    if (m28575a == 0) {
                        break;
                    }
                    i = m28575a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f1821s = 1;
        this.f1825w = false;
        this.f1826x = false;
        this.f1827y = false;
        this.f1828z = true;
        this.f1813A = -1;
        this.f1814B = Integer.MIN_VALUE;
        this.f1816D = null;
        this.f1817E = new C0367a();
        this.f1818F = new C0368b();
        this.f1819G = 2;
        this.f1820H = new int[2];
        m28962C2(i);
        m28961D2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1821s = 1;
        this.f1825w = false;
        this.f1826x = false;
        this.f1827y = false;
        this.f1828z = true;
        this.f1813A = -1;
        this.f1814B = Integer.MIN_VALUE;
        this.f1816D = null;
        this.f1817E = new C0367a();
        this.f1818F = new C0368b();
        this.f1819G = 2;
        this.f1820H = new int[2];
        RecyclerView.AbstractC0391o.C0395d m28613i0 = RecyclerView.AbstractC0391o.m28613i0(context, attributeSet, i, i2);
        m28962C2(m28613i0.f2001a);
        m28961D2(m28613i0.f2003c);
        mo28960E2(m28613i0.f2004d);
    }

    /* renamed from: A2 */
    public final void m28964A2() {
        this.f1826x = (this.f1821s == 1 || !m28922q2()) ? this.f1825w : !this.f1825w;
    }

    /* renamed from: B2 */
    public int m28963B2(int i, RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        if (m28658J() == 0 || i == 0) {
            return 0;
        }
        m28945T1();
        this.f1822t.f1841a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m28956I2(i2, abs, true, c0409z);
        C0369c c0369c = this.f1822t;
        int m28944U1 = c0369c.f1847g + m28944U1(c0403v, c0369c, c0409z, false);
        if (m28944U1 < 0) {
            return 0;
        }
        if (abs > m28944U1) {
            i = i2 * m28944U1;
        }
        this.f1823u.mo28181r(-i);
        this.f1822t.f1851k = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: C */
    public View mo28671C(int i) {
        int m28658J = m28658J();
        if (m28658J == 0) {
            return null;
        }
        int m28616h0 = i - m28616h0(m28659I(0));
        if (m28616h0 >= 0 && m28616h0 < m28658J) {
            View m28659I = m28659I(m28616h0);
            if (m28616h0(m28659I) == i) {
                return m28659I;
            }
        }
        return super.mo28671C(i);
    }

    /* renamed from: C2 */
    public void m28962C2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        mo28428g(null);
        if (i != this.f1821s || this.f1823u == null) {
            AbstractC0446i m28198b = AbstractC0446i.m28198b(this, i);
            this.f1823u = m28198b;
            this.f1817E.f1832a = m28198b;
            this.f1821s = i;
            m28589t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: D */
    public RecyclerView.C0396p mo28484D() {
        return new RecyclerView.C0396p(-2, -2);
    }

    /* renamed from: D2 */
    public void m28961D2(boolean z) {
        mo28428g(null);
        if (z == this.f1825w) {
            return;
        }
        this.f1825w = z;
        m28589t1();
    }

    /* renamed from: E2 */
    public void mo28960E2(boolean z) {
        mo28428g(null);
        if (this.f1827y == z) {
            return;
        }
        this.f1827y = z;
        m28589t1();
    }

    /* renamed from: F2 */
    public final boolean m28959F2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, C0367a c0367a) {
        boolean z = false;
        if (m28658J() == 0) {
            return false;
        }
        View m28640V = m28640V();
        if (m28640V != null && c0367a.m28905d(m28640V, c0409z)) {
            c0367a.m28906c(m28640V, m28616h0(m28640V));
            return true;
        } else if (this.f1824v != this.f1827y) {
            return false;
        } else {
            View m28930i2 = c0367a.f1835d ? m28930i2(c0403v, c0409z) : m28929j2(c0403v, c0409z);
            if (m28930i2 != null) {
                c0367a.m28907b(m28930i2, m28616h0(m28930i2));
                if (!c0409z.m28492e() && mo28469L1()) {
                    if ((this.f1823u.mo28191g(m28930i2) >= this.f1823u.mo28189i() || this.f1823u.mo28194d(m28930i2) < this.f1823u.mo28185m()) ? true : true) {
                        c0367a.f1834c = c0367a.f1835d ? this.f1823u.mo28189i() : this.f1823u.mo28185m();
                    }
                }
                return true;
            }
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: G1 */
    public boolean mo28663G1() {
        return (m28637X() == 1073741824 || m28597p0() == 1073741824 || !m28595q0()) ? false : true;
    }

    /* renamed from: G2 */
    public final boolean m28958G2(RecyclerView.C0409z c0409z, C0367a c0367a) {
        int i;
        if (!c0409z.m28492e() && (i = this.f1813A) != -1) {
            if (i >= 0 && i < c0409z.m28495b()) {
                c0367a.f1833b = this.f1813A;
                SavedState savedState = this.f1816D;
                if (savedState != null && savedState.m28912a()) {
                    boolean z = this.f1816D.f1831r;
                    c0367a.f1835d = z;
                    c0367a.f1834c = z ? this.f1823u.mo28189i() - this.f1816D.f1830q : this.f1823u.mo28185m() + this.f1816D.f1830q;
                    return true;
                } else if (this.f1814B != Integer.MIN_VALUE) {
                    boolean z2 = this.f1826x;
                    c0367a.f1835d = z2;
                    c0367a.f1834c = z2 ? this.f1823u.mo28189i() - this.f1814B : this.f1823u.mo28185m() + this.f1814B;
                    return true;
                } else {
                    View mo28671C = mo28671C(this.f1813A);
                    if (mo28671C == null) {
                        if (m28658J() > 0) {
                            c0367a.f1835d = (this.f1813A < m28616h0(m28659I(0))) == this.f1826x;
                        }
                        c0367a.m28908a();
                    } else if (this.f1823u.mo28193e(mo28671C) > this.f1823u.mo28184n()) {
                        c0367a.m28908a();
                        return true;
                    } else if (this.f1823u.mo28191g(mo28671C) - this.f1823u.mo28185m() < 0) {
                        c0367a.f1834c = this.f1823u.mo28185m();
                        c0367a.f1835d = false;
                        return true;
                    } else if (this.f1823u.mo28189i() - this.f1823u.mo28194d(mo28671C) < 0) {
                        c0367a.f1834c = this.f1823u.mo28189i();
                        c0367a.f1835d = true;
                        return true;
                    } else {
                        c0367a.f1834c = c0367a.f1835d ? this.f1823u.mo28194d(mo28671C) + this.f1823u.m28196o() : this.f1823u.mo28191g(mo28671C);
                    }
                    return true;
                }
            }
            this.f1813A = -1;
            this.f1814B = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: H2 */
    public final void m28957H2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, C0367a c0367a) {
        if (m28958G2(c0409z, c0367a) || m28959F2(c0403v, c0409z, c0367a)) {
            return;
        }
        c0367a.m28908a();
        c0367a.f1833b = this.f1827y ? c0409z.m28495b() - 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: I0 */
    public void mo28475I0(RecyclerView recyclerView, RecyclerView.C0403v c0403v) {
        super.mo28475I0(recyclerView, c0403v);
        if (this.f1815C) {
            m28608k1(c0403v);
            c0403v.m28542c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: I1 */
    public void mo2469I1(RecyclerView recyclerView, RecyclerView.C0409z c0409z, int i) {
        C0443g c0443g = new C0443g(recyclerView.getContext());
        c0443g.m28504p(i);
        m28657J1(c0443g);
    }

    /* renamed from: I2 */
    public final void m28956I2(int i, int i2, boolean z, RecyclerView.C0409z c0409z) {
        int mo28185m;
        this.f1822t.f1853m = m28913z2();
        this.f1822t.f1846f = i;
        int[] iArr = this.f1820H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo554M1(c0409z, iArr);
        int max = Math.max(0, this.f1820H[0]);
        int max2 = Math.max(0, this.f1820H[1]);
        boolean z2 = i == 1;
        C0369c c0369c = this.f1822t;
        int i3 = z2 ? max2 : max;
        c0369c.f1848h = i3;
        if (!z2) {
            max = max2;
        }
        c0369c.f1849i = max;
        if (z2) {
            c0369c.f1848h = i3 + this.f1823u.mo28188j();
            View m28926m2 = m28926m2();
            C0369c c0369c2 = this.f1822t;
            c0369c2.f1845e = this.f1826x ? -1 : 1;
            int m28616h0 = m28616h0(m28926m2);
            C0369c c0369c3 = this.f1822t;
            c0369c2.f1844d = m28616h0 + c0369c3.f1845e;
            c0369c3.f1842b = this.f1823u.mo28194d(m28926m2);
            mo28185m = this.f1823u.mo28194d(m28926m2) - this.f1823u.mo28189i();
        } else {
            View m28925n2 = m28925n2();
            this.f1822t.f1848h += this.f1823u.mo28185m();
            C0369c c0369c4 = this.f1822t;
            c0369c4.f1845e = this.f1826x ? 1 : -1;
            int m28616h02 = m28616h0(m28925n2);
            C0369c c0369c5 = this.f1822t;
            c0369c4.f1844d = m28616h02 + c0369c5.f1845e;
            c0369c5.f1842b = this.f1823u.mo28191g(m28925n2);
            mo28185m = (-this.f1823u.mo28191g(m28925n2)) + this.f1823u.mo28185m();
        }
        C0369c c0369c6 = this.f1822t;
        c0369c6.f1843c = i2;
        if (z) {
            c0369c6.f1843c = i2 - mo28185m;
        }
        c0369c6.f1847g = mo28185m;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: J0 */
    public View mo28473J0(View view, int i, RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        int m28947R1;
        m28964A2();
        if (m28658J() == 0 || (m28947R1 = m28947R1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m28945T1();
        m28956I2(m28947R1, (int) (this.f1823u.mo28184n() * 0.33333334f), false, c0409z);
        C0369c c0369c = this.f1822t;
        c0369c.f1847g = Integer.MIN_VALUE;
        c0369c.f1841a = false;
        m28944U1(c0403v, c0369c, c0409z, true);
        View m28932g2 = m28947R1 == -1 ? m28932g2() : m28933f2();
        View m28925n2 = m28947R1 == -1 ? m28925n2() : m28926m2();
        if (m28925n2.hasFocusable()) {
            if (m28932g2 == null) {
                return null;
            }
            return m28925n2;
        }
        return m28932g2;
    }

    /* renamed from: J2 */
    public final void m28955J2(int i, int i2) {
        this.f1822t.f1843c = this.f1823u.mo28189i() - i2;
        C0369c c0369c = this.f1822t;
        c0369c.f1845e = this.f1826x ? -1 : 1;
        c0369c.f1844d = i;
        c0369c.f1846f = 1;
        c0369c.f1842b = i2;
        c0369c.f1847g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: K0 */
    public void mo28471K0(AccessibilityEvent accessibilityEvent) {
        super.mo28471K0(accessibilityEvent);
        if (m28658J() > 0) {
            accessibilityEvent.setFromIndex(m28939Z1());
            accessibilityEvent.setToIndex(m28936c2());
        }
    }

    /* renamed from: K2 */
    public final void m28954K2(C0367a c0367a) {
        m28955J2(c0367a.f1833b, c0367a.f1834c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: L1 */
    public boolean mo28469L1() {
        return this.f1816D == null && this.f1824v == this.f1827y;
    }

    /* renamed from: L2 */
    public final void m28953L2(int i, int i2) {
        this.f1822t.f1843c = i2 - this.f1823u.mo28185m();
        C0369c c0369c = this.f1822t;
        c0369c.f1844d = i;
        c0369c.f1845e = this.f1826x ? 1 : -1;
        c0369c.f1846f = -1;
        c0369c.f1842b = i2;
        c0369c.f1847g = Integer.MIN_VALUE;
    }

    /* renamed from: M1 */
    public void mo554M1(RecyclerView.C0409z c0409z, int[] iArr) {
        int i;
        int m28924o2 = m28924o2(c0409z);
        if (this.f1822t.f1846f == -1) {
            i = 0;
        } else {
            i = m28924o2;
            m28924o2 = 0;
        }
        iArr[0] = m28924o2;
        iArr[1] = i;
    }

    /* renamed from: M2 */
    public final void m28952M2(C0367a c0367a) {
        m28953L2(c0367a.f1833b, c0367a.f1834c);
    }

    /* renamed from: N1 */
    public void mo28951N1(RecyclerView.C0409z c0409z, C0369c c0369c, RecyclerView.AbstractC0391o.InterfaceC0394c interfaceC0394c) {
        int i = c0369c.f1844d;
        if (i < 0 || i >= c0409z.m28495b()) {
            return;
        }
        interfaceC0394c.mo28227a(i, Math.max(0, c0369c.f1847g));
    }

    /* renamed from: O1 */
    public final int m28950O1(RecyclerView.C0409z c0409z) {
        if (m28658J() == 0) {
            return 0;
        }
        m28945T1();
        return C0453l.m28167a(c0409z, this.f1823u, m28940Y1(!this.f1828z, true), m28941X1(!this.f1828z, true), this, this.f1828z);
    }

    /* renamed from: P1 */
    public final int m28949P1(RecyclerView.C0409z c0409z) {
        if (m28658J() == 0) {
            return 0;
        }
        m28945T1();
        return C0453l.m28166b(c0409z, this.f1823u, m28940Y1(!this.f1828z, true), m28941X1(!this.f1828z, true), this, this.f1828z, this.f1826x);
    }

    /* renamed from: Q1 */
    public final int m28948Q1(RecyclerView.C0409z c0409z) {
        if (m28658J() == 0) {
            return 0;
        }
        m28945T1();
        return C0453l.m28165c(c0409z, this.f1823u, m28940Y1(!this.f1828z, true), m28941X1(!this.f1828z, true), this, this.f1828z);
    }

    /* renamed from: R1 */
    public int m28947R1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f1821s == 1) ? 1 : Integer.MIN_VALUE : this.f1821s == 0 ? 1 : Integer.MIN_VALUE : this.f1821s == 1 ? -1 : Integer.MIN_VALUE : this.f1821s == 0 ? -1 : Integer.MIN_VALUE : (this.f1821s != 1 && m28922q2()) ? -1 : 1 : (this.f1821s != 1 && m28922q2()) ? 1 : -1;
    }

    /* renamed from: S1 */
    public C0369c m28946S1() {
        return new C0369c();
    }

    /* renamed from: T1 */
    public void m28945T1() {
        if (this.f1822t == null) {
            this.f1822t = m28946S1();
        }
    }

    /* renamed from: U1 */
    public int m28944U1(RecyclerView.C0403v c0403v, C0369c c0369c, RecyclerView.C0409z c0409z, boolean z) {
        int i = c0369c.f1843c;
        int i2 = c0369c.f1847g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c0369c.f1847g = i2 + i;
            }
            m28917v2(c0403v, c0369c);
        }
        int i3 = c0369c.f1843c + c0369c.f1848h;
        C0368b c0368b = this.f1818F;
        while (true) {
            if ((!c0369c.f1853m && i3 <= 0) || !c0369c.m28900c(c0409z)) {
                break;
            }
            c0368b.m28903a();
            mo28920s2(c0403v, c0409z, c0369c, c0368b);
            if (!c0368b.f1838b) {
                c0369c.f1842b += c0368b.f1837a * c0369c.f1846f;
                if (!c0368b.f1839c || c0369c.f1852l != null || !c0409z.m28492e()) {
                    int i4 = c0369c.f1843c;
                    int i5 = c0368b.f1837a;
                    c0369c.f1843c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = c0369c.f1847g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + c0368b.f1837a;
                    c0369c.f1847g = i7;
                    int i8 = c0369c.f1843c;
                    if (i8 < 0) {
                        c0369c.f1847g = i7 + i8;
                    }
                    m28917v2(c0403v, c0369c);
                }
                if (z && c0368b.f1840d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c0369c.f1843c;
    }

    /* renamed from: V1 */
    public final View m28943V1() {
        return m28935d2(0, m28658J());
    }

    /* renamed from: W1 */
    public final View m28942W1(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        return mo28931h2(c0403v, c0409z, 0, m28658J(), c0409z.m28495b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: X0 */
    public void mo28443X0(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        int i;
        int i2;
        int i3;
        int i4;
        int m28928k2;
        int i5;
        View mo28671C;
        int mo28191g;
        int i6;
        int i7 = -1;
        if (!(this.f1816D == null && this.f1813A == -1) && c0409z.m28495b() == 0) {
            m28608k1(c0403v);
            return;
        }
        SavedState savedState = this.f1816D;
        if (savedState != null && savedState.m28912a()) {
            this.f1813A = this.f1816D.f1829p;
        }
        m28945T1();
        this.f1822t.f1841a = false;
        m28964A2();
        View m28640V = m28640V();
        C0367a c0367a = this.f1817E;
        if (!c0367a.f1836e || this.f1813A != -1 || this.f1816D != null) {
            c0367a.m28904e();
            C0367a c0367a2 = this.f1817E;
            c0367a2.f1835d = this.f1826x ^ this.f1827y;
            m28957H2(c0403v, c0409z, c0367a2);
            this.f1817E.f1836e = true;
        } else if (m28640V != null && (this.f1823u.mo28191g(m28640V) >= this.f1823u.mo28189i() || this.f1823u.mo28194d(m28640V) <= this.f1823u.mo28185m())) {
            this.f1817E.m28906c(m28640V, m28616h0(m28640V));
        }
        C0369c c0369c = this.f1822t;
        c0369c.f1846f = c0369c.f1851k >= 0 ? 1 : -1;
        int[] iArr = this.f1820H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo554M1(c0409z, iArr);
        int max = Math.max(0, this.f1820H[0]) + this.f1823u.mo28185m();
        int max2 = Math.max(0, this.f1820H[1]) + this.f1823u.mo28188j();
        if (c0409z.m28492e() && (i5 = this.f1813A) != -1 && this.f1814B != Integer.MIN_VALUE && (mo28671C = mo28671C(i5)) != null) {
            if (this.f1826x) {
                i6 = this.f1823u.mo28189i() - this.f1823u.mo28194d(mo28671C);
                mo28191g = this.f1814B;
            } else {
                mo28191g = this.f1823u.mo28191g(mo28671C) - this.f1823u.mo28185m();
                i6 = this.f1814B;
            }
            int i8 = i6 - mo28191g;
            if (i8 > 0) {
                max += i8;
            } else {
                max2 -= i8;
            }
        }
        C0367a c0367a3 = this.f1817E;
        if (!c0367a3.f1835d ? !this.f1826x : this.f1826x) {
            i7 = 1;
        }
        mo28918u2(c0403v, c0409z, c0367a3, i7);
        m28584w(c0403v);
        this.f1822t.f1853m = m28913z2();
        this.f1822t.f1850j = c0409z.m28492e();
        this.f1822t.f1849i = 0;
        C0367a c0367a4 = this.f1817E;
        if (c0367a4.f1835d) {
            m28952M2(c0367a4);
            C0369c c0369c2 = this.f1822t;
            c0369c2.f1848h = max;
            m28944U1(c0403v, c0369c2, c0409z, false);
            C0369c c0369c3 = this.f1822t;
            i2 = c0369c3.f1842b;
            int i9 = c0369c3.f1844d;
            int i10 = c0369c3.f1843c;
            if (i10 > 0) {
                max2 += i10;
            }
            m28954K2(this.f1817E);
            C0369c c0369c4 = this.f1822t;
            c0369c4.f1848h = max2;
            c0369c4.f1844d += c0369c4.f1845e;
            m28944U1(c0403v, c0369c4, c0409z, false);
            C0369c c0369c5 = this.f1822t;
            i = c0369c5.f1842b;
            int i11 = c0369c5.f1843c;
            if (i11 > 0) {
                m28953L2(i9, i2);
                C0369c c0369c6 = this.f1822t;
                c0369c6.f1848h = i11;
                m28944U1(c0403v, c0369c6, c0409z, false);
                i2 = this.f1822t.f1842b;
            }
        } else {
            m28954K2(c0367a4);
            C0369c c0369c7 = this.f1822t;
            c0369c7.f1848h = max2;
            m28944U1(c0403v, c0369c7, c0409z, false);
            C0369c c0369c8 = this.f1822t;
            i = c0369c8.f1842b;
            int i12 = c0369c8.f1844d;
            int i13 = c0369c8.f1843c;
            if (i13 > 0) {
                max += i13;
            }
            m28952M2(this.f1817E);
            C0369c c0369c9 = this.f1822t;
            c0369c9.f1848h = max;
            c0369c9.f1844d += c0369c9.f1845e;
            m28944U1(c0403v, c0369c9, c0409z, false);
            C0369c c0369c10 = this.f1822t;
            i2 = c0369c10.f1842b;
            int i14 = c0369c10.f1843c;
            if (i14 > 0) {
                m28955J2(i12, i);
                C0369c c0369c11 = this.f1822t;
                c0369c11.f1848h = i14;
                m28944U1(c0403v, c0369c11, c0409z, false);
                i = this.f1822t.f1842b;
            }
        }
        if (m28658J() > 0) {
            if (this.f1826x ^ this.f1827y) {
                int m28928k22 = m28928k2(i, c0403v, c0409z, true);
                i3 = i2 + m28928k22;
                i4 = i + m28928k22;
                m28928k2 = m28927l2(i3, c0403v, c0409z, false);
            } else {
                int m28927l2 = m28927l2(i2, c0403v, c0409z, true);
                i3 = i2 + m28927l2;
                i4 = i + m28927l2;
                m28928k2 = m28928k2(i4, c0403v, c0409z, false);
            }
            i2 = i3 + m28928k2;
            i = i4 + m28928k2;
        }
        m28919t2(c0403v, c0409z, i2, i);
        if (c0409z.m28492e()) {
            this.f1817E.m28904e();
        } else {
            this.f1823u.m28195s();
        }
        this.f1824v = this.f1827y;
    }

    /* renamed from: X1 */
    public View m28941X1(boolean z, boolean z2) {
        int m28658J;
        int i;
        if (this.f1826x) {
            m28658J = 0;
            i = m28658J();
        } else {
            m28658J = m28658J() - 1;
            i = -1;
        }
        return m28934e2(m28658J, i, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: Y0 */
    public void mo28441Y0(RecyclerView.C0409z c0409z) {
        super.mo28441Y0(c0409z);
        this.f1816D = null;
        this.f1813A = -1;
        this.f1814B = Integer.MIN_VALUE;
        this.f1817E.m28904e();
    }

    /* renamed from: Y1 */
    public View m28940Y1(boolean z, boolean z2) {
        int i;
        int m28658J;
        if (this.f1826x) {
            i = m28658J() - 1;
            m28658J = -1;
        } else {
            i = 0;
            m28658J = m28658J();
        }
        return m28934e2(i, m28658J, z, z2);
    }

    /* renamed from: Z1 */
    public int m28939Z1() {
        View m28934e2 = m28934e2(0, m28658J(), false, true);
        if (m28934e2 == null) {
            return -1;
        }
        return m28616h0(m28934e2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0406y.InterfaceC0408b
    /* renamed from: a */
    public PointF mo28438a(int i) {
        if (m28658J() == 0) {
            return null;
        }
        int i2 = (i < m28616h0(m28659I(0))) != this.f1826x ? -1 : 1;
        return this.f1821s == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    /* renamed from: a2 */
    public final View m28938a2() {
        return m28935d2(m28658J() - 1, -1);
    }

    /* renamed from: b2 */
    public final View m28937b2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        return mo28931h2(c0403v, c0409z, m28658J() - 1, -1, c0409z.m28495b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: c1 */
    public void mo28435c1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f1816D = (SavedState) parcelable;
            m28589t1();
        }
    }

    /* renamed from: c2 */
    public int m28936c2() {
        View m28934e2 = m28934e2(m28658J() - 1, -1, false, true);
        if (m28934e2 == null) {
            return -1;
        }
        return m28616h0(m28934e2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: d1 */
    public Parcelable mo28433d1() {
        if (this.f1816D != null) {
            return new SavedState(this.f1816D);
        }
        SavedState savedState = new SavedState();
        if (m28658J() > 0) {
            m28945T1();
            boolean z = this.f1824v ^ this.f1826x;
            savedState.f1831r = z;
            if (z) {
                View m28926m2 = m28926m2();
                savedState.f1830q = this.f1823u.mo28189i() - this.f1823u.mo28194d(m28926m2);
                savedState.f1829p = m28616h0(m28926m2);
            } else {
                View m28925n2 = m28925n2();
                savedState.f1829p = m28616h0(m28925n2);
                savedState.f1830q = this.f1823u.mo28191g(m28925n2) - this.f1823u.mo28185m();
            }
        } else {
            savedState.m28911b();
        }
        return savedState;
    }

    /* renamed from: d2 */
    public View m28935d2(int i, int i2) {
        int i3;
        int i4;
        m28945T1();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return m28659I(i);
        }
        if (this.f1823u.mo28191g(m28659I(i)) < this.f1823u.mo28185m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.f1821s == 0 ? this.f1985e : this.f1986f).m28128a(i, i2, i3, i4);
    }

    /* renamed from: e2 */
    public View m28934e2(int i, int i2, boolean z, boolean z2) {
        m28945T1();
        return (this.f1821s == 0 ? this.f1985e : this.f1986f).m28128a(i, i2, z ? 24579 : 320, z2 ? 320 : 0);
    }

    /* renamed from: f2 */
    public final View m28933f2() {
        return this.f1826x ? m28943V1() : m28938a2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: g */
    public void mo28428g(String str) {
        if (this.f1816D == null) {
            super.mo28428g(str);
        }
    }

    /* renamed from: g2 */
    public final View m28932g2() {
        return this.f1826x ? m28938a2() : m28943V1();
    }

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
            if (m28616h0 >= 0 && m28616h0 < i3) {
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

    /* renamed from: i2 */
    public final View m28930i2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        return this.f1826x ? m28942W1(c0403v, c0409z) : m28937b2(c0403v, c0409z);
    }

    /* renamed from: j2 */
    public final View m28929j2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        return this.f1826x ? m28937b2(c0403v, c0409z) : m28942W1(c0403v, c0409z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: k */
    public boolean mo28423k() {
        return this.f1821s == 0;
    }

    /* renamed from: k2 */
    public final int m28928k2(int i, RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, boolean z) {
        int mo28189i;
        int mo28189i2 = this.f1823u.mo28189i() - i;
        if (mo28189i2 > 0) {
            int i2 = -m28963B2(-mo28189i2, c0403v, c0409z);
            int i3 = i + i2;
            if (!z || (mo28189i = this.f1823u.mo28189i() - i3) <= 0) {
                return i2;
            }
            this.f1823u.mo28181r(mo28189i);
            return mo28189i + i2;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: l */
    public boolean mo28420l() {
        return this.f1821s == 1;
    }

    /* renamed from: l2 */
    public final int m28927l2(int i, RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, boolean z) {
        int mo28185m;
        int mo28185m2 = i - this.f1823u.mo28185m();
        if (mo28185m2 > 0) {
            int i2 = -m28963B2(mo28185m2, c0403v, c0409z);
            int i3 = i + i2;
            if (!z || (mo28185m = i3 - this.f1823u.mo28185m()) <= 0) {
                return i2;
            }
            this.f1823u.mo28181r(-mo28185m);
            return i2 - mo28185m;
        }
        return 0;
    }

    /* renamed from: m2 */
    public final View m28926m2() {
        return m28659I(this.f1826x ? 0 : m28658J() - 1);
    }

    /* renamed from: n2 */
    public final View m28925n2() {
        return m28659I(this.f1826x ? m28658J() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: o */
    public void mo28415o(int i, int i2, RecyclerView.C0409z c0409z, RecyclerView.AbstractC0391o.InterfaceC0394c interfaceC0394c) {
        if (this.f1821s != 0) {
            i = i2;
        }
        if (m28658J() == 0 || i == 0) {
            return;
        }
        m28945T1();
        m28956I2(i > 0 ? 1 : -1, Math.abs(i), true, c0409z);
        mo28951N1(c0409z, this.f1822t, interfaceC0394c);
    }

    @Deprecated
    /* renamed from: o2 */
    public int m28924o2(RecyclerView.C0409z c0409z) {
        if (c0409z.m28493d()) {
            return this.f1823u.mo28184n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: p */
    public void mo28598p(int i, RecyclerView.AbstractC0391o.InterfaceC0394c interfaceC0394c) {
        boolean z;
        int i2;
        SavedState savedState = this.f1816D;
        if (savedState == null || !savedState.m28912a()) {
            m28964A2();
            z = this.f1826x;
            i2 = this.f1813A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f1816D;
            z = savedState2.f1831r;
            i2 = savedState2.f1829p;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f1819G && i2 >= 0 && i2 < i; i4++) {
            interfaceC0394c.mo28227a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: p2 */
    public int m28923p2() {
        return this.f1821s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: q */
    public int mo28412q(RecyclerView.C0409z c0409z) {
        return m28950O1(c0409z);
    }

    /* renamed from: q2 */
    public boolean m28922q2() {
        return m28635Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: r */
    public int mo28410r(RecyclerView.C0409z c0409z) {
        return m28949P1(c0409z);
    }

    /* renamed from: r2 */
    public boolean m28921r2() {
        return this.f1828z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: s */
    public int mo28408s(RecyclerView.C0409z c0409z) {
        return m28948Q1(c0409z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: s0 */
    public boolean mo28407s0() {
        return true;
    }

    /* renamed from: s2 */
    public void mo28920s2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, C0369c c0369c, C0368b c0368b) {
        int i;
        int i2;
        int i3;
        int i4;
        int mo28192f;
        View m28899d = c0369c.m28899d(c0403v);
        if (m28899d == null) {
            c0368b.f1838b = true;
            return;
        }
        RecyclerView.C0396p c0396p = (RecyclerView.C0396p) m28899d.getLayoutParams();
        if (c0369c.f1852l == null) {
            if (this.f1826x == (c0369c.f1846f == -1)) {
                m28626d(m28899d);
            } else {
                m28624e(m28899d, 0);
            }
        } else {
            if (this.f1826x == (c0369c.f1846f == -1)) {
                m28631b(m28899d);
            } else {
                m28628c(m28899d, 0);
            }
        }
        m28676A0(m28899d, 0, 0);
        c0368b.f1837a = this.f1823u.mo28193e(m28899d);
        if (this.f1821s == 1) {
            if (m28922q2()) {
                mo28192f = m28600o0() - m28621f0();
                i4 = mo28192f - this.f1823u.mo28192f(m28899d);
            } else {
                i4 = m28623e0();
                mo28192f = this.f1823u.mo28192f(m28899d) + i4;
            }
            int i5 = c0369c.f1846f;
            int i6 = c0369c.f1842b;
            if (i5 == -1) {
                i3 = i6;
                i2 = mo28192f;
                i = i6 - c0368b.f1837a;
            } else {
                i = i6;
                i2 = mo28192f;
                i3 = c0368b.f1837a + i6;
            }
        } else {
            int m28619g0 = m28619g0();
            int mo28192f2 = this.f1823u.mo28192f(m28899d) + m28619g0;
            int i7 = c0369c.f1846f;
            int i8 = c0369c.f1842b;
            if (i7 == -1) {
                i2 = i8;
                i = m28619g0;
                i3 = mo28192f2;
                i4 = i8 - c0368b.f1837a;
            } else {
                i = m28619g0;
                i2 = c0368b.f1837a + i8;
                i3 = mo28192f2;
                i4 = i8;
            }
        }
        m28577z0(m28899d, i4, i, i2, i3);
        if (c0396p.m28573c() || c0396p.m28574b()) {
            c0368b.f1839c = true;
        }
        c0368b.f1840d = m28899d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: t */
    public int mo28405t(RecyclerView.C0409z c0409z) {
        return m28950O1(c0409z);
    }

    /* renamed from: t2 */
    public final void m28919t2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, int i, int i2) {
        if (!c0409z.m28490g() || m28658J() == 0 || c0409z.m28492e() || !mo28469L1()) {
            return;
        }
        List<RecyclerView.AbstractC0376c0> m28534k = c0403v.m28534k();
        int size = m28534k.size();
        int m28616h0 = m28616h0(m28659I(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.AbstractC0376c0 abstractC0376c0 = m28534k.get(i5);
            if (!abstractC0376c0.m28722x()) {
                char c = (abstractC0376c0.m28731o() < m28616h0) != this.f1826x ? (char) 65535 : (char) 1;
                int mo28193e = this.f1823u.mo28193e(abstractC0376c0.f1947a);
                if (c == 65535) {
                    i3 += mo28193e;
                } else {
                    i4 += mo28193e;
                }
            }
        }
        this.f1822t.f1852l = m28534k;
        if (i3 > 0) {
            m28953L2(m28616h0(m28925n2()), i);
            C0369c c0369c = this.f1822t;
            c0369c.f1848h = i3;
            c0369c.f1843c = 0;
            c0369c.m28902a();
            m28944U1(c0403v, this.f1822t, c0409z, false);
        }
        if (i4 > 0) {
            m28955J2(m28616h0(m28926m2()), i2);
            C0369c c0369c2 = this.f1822t;
            c0369c2.f1848h = i4;
            c0369c2.f1843c = 0;
            c0369c2.m28902a();
            m28944U1(c0403v, this.f1822t, c0409z, false);
        }
        this.f1822t.f1852l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: u */
    public int mo28403u(RecyclerView.C0409z c0409z) {
        return m28949P1(c0409z);
    }

    /* renamed from: u2 */
    public void mo28918u2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, C0367a c0367a, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: v */
    public int mo28401v(RecyclerView.C0409z c0409z) {
        return m28948Q1(c0409z);
    }

    /* renamed from: v2 */
    public final void m28917v2(RecyclerView.C0403v c0403v, C0369c c0369c) {
        if (!c0369c.f1841a || c0369c.f1853m) {
            return;
        }
        int i = c0369c.f1847g;
        int i2 = c0369c.f1849i;
        if (c0369c.f1846f == -1) {
            m28915x2(c0403v, i, i2);
        } else {
            m28914y2(c0403v, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: w1 */
    public int mo28399w1(int i, RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        if (this.f1821s == 1) {
            return 0;
        }
        return m28963B2(i, c0403v, c0409z);
    }

    /* renamed from: w2 */
    public final void m28916w2(RecyclerView.C0403v c0403v, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m28601n1(i, c0403v);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            m28601n1(i3, c0403v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: x1 */
    public void mo28397x1(int i) {
        this.f1813A = i;
        this.f1814B = Integer.MIN_VALUE;
        SavedState savedState = this.f1816D;
        if (savedState != null) {
            savedState.m28911b();
        }
        m28589t1();
    }

    /* renamed from: x2 */
    public final void m28915x2(RecyclerView.C0403v c0403v, int i, int i2) {
        int m28658J = m28658J();
        if (i < 0) {
            return;
        }
        int mo28190h = (this.f1823u.mo28190h() - i) + i2;
        if (this.f1826x) {
            for (int i3 = 0; i3 < m28658J; i3++) {
                View m28659I = m28659I(i3);
                if (this.f1823u.mo28191g(m28659I) < mo28190h || this.f1823u.mo28182q(m28659I) < mo28190h) {
                    m28916w2(c0403v, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = m28658J - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View m28659I2 = m28659I(i5);
            if (this.f1823u.mo28191g(m28659I2) < mo28190h || this.f1823u.mo28182q(m28659I2) < mo28190h) {
                m28916w2(c0403v, i4, i5);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: y1 */
    public int mo28395y1(int i, RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        if (this.f1821s == 0) {
            return 0;
        }
        return m28963B2(i, c0403v, c0409z);
    }

    /* renamed from: y2 */
    public final void m28914y2(RecyclerView.C0403v c0403v, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int m28658J = m28658J();
        if (!this.f1826x) {
            for (int i4 = 0; i4 < m28658J; i4++) {
                View m28659I = m28659I(i4);
                if (this.f1823u.mo28194d(m28659I) > i3 || this.f1823u.mo28183p(m28659I) > i3) {
                    m28916w2(c0403v, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = m28658J - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View m28659I2 = m28659I(i6);
            if (this.f1823u.mo28194d(m28659I2) > i3 || this.f1823u.mo28183p(m28659I2) > i3) {
                m28916w2(c0403v, i5, i6);
                return;
            }
        }
    }

    /* renamed from: z2 */
    public boolean m28913z2() {
        return this.f1823u.mo28187k() == 0 && this.f1823u.mo28190h() == 0;
    }
}
