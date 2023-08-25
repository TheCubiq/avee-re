package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C3654y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC0391o implements RecyclerView.AbstractC0406y.InterfaceC0408b {

    /* renamed from: B */
    public BitSet f2057B;

    /* renamed from: G */
    public boolean f2062G;

    /* renamed from: H */
    public boolean f2063H;

    /* renamed from: I */
    public SavedState f2064I;

    /* renamed from: J */
    public int f2065J;

    /* renamed from: O */
    public int[] f2070O;

    /* renamed from: t */
    public C0415d[] f2073t;

    /* renamed from: u */
    public AbstractC0446i f2074u;

    /* renamed from: v */
    public AbstractC0446i f2075v;

    /* renamed from: w */
    public int f2076w;

    /* renamed from: x */
    public int f2077x;

    /* renamed from: y */
    public final C0442f f2078y;

    /* renamed from: s */
    public int f2072s = -1;

    /* renamed from: z */
    public boolean f2079z = false;

    /* renamed from: A */
    public boolean f2056A = false;

    /* renamed from: C */
    public int f2058C = -1;

    /* renamed from: D */
    public int f2059D = Integer.MIN_VALUE;

    /* renamed from: E */
    public LazySpanLookup f2060E = new LazySpanLookup();

    /* renamed from: F */
    public int f2061F = 2;

    /* renamed from: K */
    public final Rect f2066K = new Rect();

    /* renamed from: L */
    public final C0413b f2067L = new C0413b();

    /* renamed from: M */
    public boolean f2068M = false;

    /* renamed from: N */
    public boolean f2069N = true;

    /* renamed from: P */
    public final Runnable f2071P = new RunnableC0412a();

    /* loaded from: classes.dex */
    public static class LazySpanLookup {

        /* renamed from: a */
        public int[] f2080a;

        /* renamed from: b */
        public List<FullSpanItem> f2081b;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C0410a();

            /* renamed from: p */
            public int f2082p;

            /* renamed from: q */
            public int f2083q;

            /* renamed from: r */
            public int[] f2084r;

            /* renamed from: s */
            public boolean f2085s;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            /* loaded from: classes.dex */
            public static class C0410a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            public FullSpanItem() {
            }

            public FullSpanItem(Parcel parcel) {
                this.f2082p = parcel.readInt();
                this.f2083q = parcel.readInt();
                this.f2085s = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2084r = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            public int m28377a(int i) {
                int[] iArr = this.f2084r;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f2082p + ", mGapDir=" + this.f2083q + ", mHasUnwantedGapAfter=" + this.f2085s + ", mGapPerSpan=" + Arrays.toString(this.f2084r) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2082p);
                parcel.writeInt(this.f2083q);
                parcel.writeInt(this.f2085s ? 1 : 0);
                int[] iArr = this.f2084r;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2084r);
            }
        }

        /* renamed from: a */
        public void m28392a(FullSpanItem fullSpanItem) {
            if (this.f2081b == null) {
                this.f2081b = new ArrayList();
            }
            int size = this.f2081b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f2081b.get(i);
                if (fullSpanItem2.f2082p == fullSpanItem.f2082p) {
                    this.f2081b.remove(i);
                }
                if (fullSpanItem2.f2082p >= fullSpanItem.f2082p) {
                    this.f2081b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f2081b.add(fullSpanItem);
        }

        /* renamed from: b */
        public void m28391b() {
            int[] iArr = this.f2080a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2081b = null;
        }

        /* renamed from: c */
        public void m28390c(int i) {
            int[] iArr = this.f2080a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f2080a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[m28378o(i)];
                this.f2080a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2080a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        public int m28389d(int i) {
            List<FullSpanItem> list = this.f2081b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f2081b.get(size).f2082p >= i) {
                        this.f2081b.remove(size);
                    }
                }
            }
            return m28385h(i);
        }

        /* renamed from: e */
        public FullSpanItem m28388e(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f2081b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f2081b.get(i4);
                int i5 = fullSpanItem.f2082p;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f2083q == i3 || (z && fullSpanItem.f2085s))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: f */
        public FullSpanItem m28387f(int i) {
            List<FullSpanItem> list = this.f2081b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f2081b.get(size);
                if (fullSpanItem.f2082p == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: g */
        public int m28386g(int i) {
            int[] iArr = this.f2080a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* renamed from: h */
        public int m28385h(int i) {
            int[] iArr = this.f2080a;
            if (iArr != null && i < iArr.length) {
                int m28384i = m28384i(i);
                if (m28384i == -1) {
                    int[] iArr2 = this.f2080a;
                    Arrays.fill(iArr2, i, iArr2.length, -1);
                    return this.f2080a.length;
                }
                int i2 = m28384i + 1;
                Arrays.fill(this.f2080a, i, i2, -1);
                return i2;
            }
            return -1;
        }

        /* renamed from: i */
        public final int m28384i(int i) {
            if (this.f2081b == null) {
                return -1;
            }
            FullSpanItem m28387f = m28387f(i);
            if (m28387f != null) {
                this.f2081b.remove(m28387f);
            }
            int size = this.f2081b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f2081b.get(i2).f2082p >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                this.f2081b.remove(i2);
                return this.f2081b.get(i2).f2082p;
            }
            return -1;
        }

        /* renamed from: j */
        public void m28383j(int i, int i2) {
            int[] iArr = this.f2080a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m28390c(i3);
            int[] iArr2 = this.f2080a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f2080a, i, i3, -1);
            m28381l(i, i2);
        }

        /* renamed from: k */
        public void m28382k(int i, int i2) {
            int[] iArr = this.f2080a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m28390c(i3);
            int[] iArr2 = this.f2080a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f2080a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m28380m(i, i2);
        }

        /* renamed from: l */
        public final void m28381l(int i, int i2) {
            List<FullSpanItem> list = this.f2081b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f2081b.get(size);
                int i3 = fullSpanItem.f2082p;
                if (i3 >= i) {
                    fullSpanItem.f2082p = i3 + i2;
                }
            }
        }

        /* renamed from: m */
        public final void m28380m(int i, int i2) {
            List<FullSpanItem> list = this.f2081b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f2081b.get(size);
                int i4 = fullSpanItem.f2082p;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f2081b.remove(size);
                    } else {
                        fullSpanItem.f2082p = i4 - i2;
                    }
                }
            }
        }

        /* renamed from: n */
        public void m28379n(int i, C0415d c0415d) {
            m28390c(i);
            this.f2080a[i] = c0415d.f2110e;
        }

        /* renamed from: o */
        public int m28378o(int i) {
            int length = this.f2080a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0411a();

        /* renamed from: p */
        public int f2086p;

        /* renamed from: q */
        public int f2087q;

        /* renamed from: r */
        public int f2088r;

        /* renamed from: s */
        public int[] f2089s;

        /* renamed from: t */
        public int f2090t;

        /* renamed from: u */
        public int[] f2091u;

        /* renamed from: v */
        public List<LazySpanLookup.FullSpanItem> f2092v;

        /* renamed from: w */
        public boolean f2093w;

        /* renamed from: x */
        public boolean f2094x;

        /* renamed from: y */
        public boolean f2095y;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        /* loaded from: classes.dex */
        public static class C0411a implements Parcelable.Creator<SavedState> {
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
            this.f2086p = parcel.readInt();
            this.f2087q = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2088r = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2089s = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2090t = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2091u = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f2093w = parcel.readInt() == 1;
            this.f2094x = parcel.readInt() == 1;
            this.f2095y = parcel.readInt() == 1;
            this.f2092v = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f2088r = savedState.f2088r;
            this.f2086p = savedState.f2086p;
            this.f2087q = savedState.f2087q;
            this.f2089s = savedState.f2089s;
            this.f2090t = savedState.f2090t;
            this.f2091u = savedState.f2091u;
            this.f2093w = savedState.f2093w;
            this.f2094x = savedState.f2094x;
            this.f2095y = savedState.f2095y;
            this.f2092v = savedState.f2092v;
        }

        /* renamed from: a */
        public void m28374a() {
            this.f2089s = null;
            this.f2088r = 0;
            this.f2086p = -1;
            this.f2087q = -1;
        }

        /* renamed from: b */
        public void m28373b() {
            this.f2089s = null;
            this.f2088r = 0;
            this.f2090t = 0;
            this.f2091u = null;
            this.f2092v = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2086p);
            parcel.writeInt(this.f2087q);
            parcel.writeInt(this.f2088r);
            if (this.f2088r > 0) {
                parcel.writeIntArray(this.f2089s);
            }
            parcel.writeInt(this.f2090t);
            if (this.f2090t > 0) {
                parcel.writeIntArray(this.f2091u);
            }
            parcel.writeInt(this.f2093w ? 1 : 0);
            parcel.writeInt(this.f2094x ? 1 : 0);
            parcel.writeInt(this.f2095y ? 1 : 0);
            parcel.writeList(this.f2092v);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    /* loaded from: classes.dex */
    public class RunnableC0412a implements Runnable {
        public RunnableC0412a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m28451S1();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    /* loaded from: classes.dex */
    public class C0413b {

        /* renamed from: a */
        public int f2097a;

        /* renamed from: b */
        public int f2098b;

        /* renamed from: c */
        public boolean f2099c;

        /* renamed from: d */
        public boolean f2100d;

        /* renamed from: e */
        public boolean f2101e;

        /* renamed from: f */
        public int[] f2102f;

        public C0413b() {
            m28368c();
        }

        /* renamed from: a */
        public void m28370a() {
            this.f2098b = this.f2099c ? StaggeredGridLayoutManager.this.f2074u.mo28189i() : StaggeredGridLayoutManager.this.f2074u.mo28185m();
        }

        /* renamed from: b */
        public void m28369b(int i) {
            this.f2098b = this.f2099c ? StaggeredGridLayoutManager.this.f2074u.mo28189i() - i : StaggeredGridLayoutManager.this.f2074u.mo28185m() + i;
        }

        /* renamed from: c */
        public void m28368c() {
            this.f2097a = -1;
            this.f2098b = Integer.MIN_VALUE;
            this.f2099c = false;
            this.f2100d = false;
            this.f2101e = false;
            int[] iArr = this.f2102f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        public void m28367d(C0415d[] c0415dArr) {
            int length = c0415dArr.length;
            int[] iArr = this.f2102f;
            if (iArr == null || iArr.length < length) {
                this.f2102f = new int[StaggeredGridLayoutManager.this.f2073t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f2102f[i] = c0415dArr[i].m28349p(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C0414c extends RecyclerView.C0396p {

        /* renamed from: e */
        public C0415d f2104e;

        /* renamed from: f */
        public boolean f2105f;

        public C0414c(int i, int i2) {
            super(i, i2);
        }

        public C0414c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0414c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0414c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: e */
        public final int m28366e() {
            C0415d c0415d = this.f2104e;
            if (c0415d == null) {
                return -1;
            }
            return c0415d.f2110e;
        }

        /* renamed from: f */
        public boolean m28365f() {
            return this.f2105f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    /* loaded from: classes.dex */
    public class C0415d {

        /* renamed from: a */
        public ArrayList<View> f2106a = new ArrayList<>();

        /* renamed from: b */
        public int f2107b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f2108c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f2109d = 0;

        /* renamed from: e */
        public final int f2110e;

        public C0415d(int i) {
            this.f2110e = i;
        }

        /* renamed from: a */
        public void m28364a(View view) {
            C0414c m28351n = m28351n(view);
            m28351n.f2104e = this;
            this.f2106a.add(view);
            this.f2108c = Integer.MIN_VALUE;
            if (this.f2106a.size() == 1) {
                this.f2107b = Integer.MIN_VALUE;
            }
            if (m28351n.m28573c() || m28351n.m28574b()) {
                this.f2109d += StaggeredGridLayoutManager.this.f2074u.mo28193e(view);
            }
        }

        /* renamed from: b */
        public void m28363b(boolean z, int i) {
            int m28353l = z ? m28353l(Integer.MIN_VALUE) : m28349p(Integer.MIN_VALUE);
            m28360e();
            if (m28353l == Integer.MIN_VALUE) {
                return;
            }
            if (!z || m28353l >= StaggeredGridLayoutManager.this.f2074u.mo28189i()) {
                if (z || m28353l <= StaggeredGridLayoutManager.this.f2074u.mo28185m()) {
                    if (i != Integer.MIN_VALUE) {
                        m28353l += i;
                    }
                    this.f2108c = m28353l;
                    this.f2107b = m28353l;
                }
            }
        }

        /* renamed from: c */
        public void m28362c() {
            LazySpanLookup.FullSpanItem m28387f;
            ArrayList<View> arrayList = this.f2106a;
            View view = arrayList.get(arrayList.size() - 1);
            C0414c m28351n = m28351n(view);
            this.f2108c = StaggeredGridLayoutManager.this.f2074u.mo28194d(view);
            if (m28351n.f2105f && (m28387f = StaggeredGridLayoutManager.this.f2060E.m28387f(m28351n.m28575a())) != null && m28387f.f2083q == 1) {
                this.f2108c += m28387f.m28377a(this.f2110e);
            }
        }

        /* renamed from: d */
        public void m28361d() {
            LazySpanLookup.FullSpanItem m28387f;
            View view = this.f2106a.get(0);
            C0414c m28351n = m28351n(view);
            this.f2107b = StaggeredGridLayoutManager.this.f2074u.mo28191g(view);
            if (m28351n.f2105f && (m28387f = StaggeredGridLayoutManager.this.f2060E.m28387f(m28351n.m28575a())) != null && m28387f.f2083q == -1) {
                this.f2107b -= m28387f.m28377a(this.f2110e);
            }
        }

        /* renamed from: e */
        public void m28360e() {
            this.f2106a.clear();
            m28348q();
            this.f2109d = 0;
        }

        /* renamed from: f */
        public int m28359f() {
            int i;
            int size;
            if (StaggeredGridLayoutManager.this.f2079z) {
                i = this.f2106a.size() - 1;
                size = -1;
            } else {
                i = 0;
                size = this.f2106a.size();
            }
            return m28356i(i, size, true);
        }

        /* renamed from: g */
        public int m28358g() {
            int size;
            int i;
            if (StaggeredGridLayoutManager.this.f2079z) {
                size = 0;
                i = this.f2106a.size();
            } else {
                size = this.f2106a.size() - 1;
                i = -1;
            }
            return m28356i(size, i, true);
        }

        /* renamed from: h */
        public int m28357h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int mo28185m = StaggeredGridLayoutManager.this.f2074u.mo28185m();
            int mo28189i = StaggeredGridLayoutManager.this.f2074u.mo28189i();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f2106a.get(i);
                int mo28191g = StaggeredGridLayoutManager.this.f2074u.mo28191g(view);
                int mo28194d = StaggeredGridLayoutManager.this.f2074u.mo28194d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? mo28191g >= mo28189i : mo28191g > mo28189i;
                if (!z3 ? mo28194d > mo28185m : mo28194d >= mo28185m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && mo28191g >= mo28185m && mo28194d <= mo28189i) {
                        }
                        return StaggeredGridLayoutManager.this.m28616h0(view);
                    } else if (mo28191g >= mo28185m && mo28194d <= mo28189i) {
                        return StaggeredGridLayoutManager.this.m28616h0(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: i */
        public int m28356i(int i, int i2, boolean z) {
            return m28357h(i, i2, false, false, z);
        }

        /* renamed from: j */
        public int m28355j() {
            return this.f2109d;
        }

        /* renamed from: k */
        public int m28354k() {
            int i = this.f2108c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m28362c();
            return this.f2108c;
        }

        /* renamed from: l */
        public int m28353l(int i) {
            int i2 = this.f2108c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2106a.size() == 0) {
                return i;
            }
            m28362c();
            return this.f2108c;
        }

        /* renamed from: m */
        public View m28352m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f2106a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2106a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f2079z && staggeredGridLayoutManager.m28616h0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f2079z && staggeredGridLayoutManager2.m28616h0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2106a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f2106a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f2079z && staggeredGridLayoutManager3.m28616h0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f2079z && staggeredGridLayoutManager4.m28616h0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: n */
        public C0414c m28351n(View view) {
            return (C0414c) view.getLayoutParams();
        }

        /* renamed from: o */
        public int m28350o() {
            int i = this.f2107b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m28361d();
            return this.f2107b;
        }

        /* renamed from: p */
        public int m28349p(int i) {
            int i2 = this.f2107b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2106a.size() == 0) {
                return i;
            }
            m28361d();
            return this.f2107b;
        }

        /* renamed from: q */
        public void m28348q() {
            this.f2107b = Integer.MIN_VALUE;
            this.f2108c = Integer.MIN_VALUE;
        }

        /* renamed from: r */
        public void m28347r(int i) {
            int i2 = this.f2107b;
            if (i2 != Integer.MIN_VALUE) {
                this.f2107b = i2 + i;
            }
            int i3 = this.f2108c;
            if (i3 != Integer.MIN_VALUE) {
                this.f2108c = i3 + i;
            }
        }

        /* renamed from: s */
        public void m28346s() {
            int size = this.f2106a.size();
            View remove = this.f2106a.remove(size - 1);
            C0414c m28351n = m28351n(remove);
            m28351n.f2104e = null;
            if (m28351n.m28573c() || m28351n.m28574b()) {
                this.f2109d -= StaggeredGridLayoutManager.this.f2074u.mo28193e(remove);
            }
            if (size == 1) {
                this.f2107b = Integer.MIN_VALUE;
            }
            this.f2108c = Integer.MIN_VALUE;
        }

        /* renamed from: t */
        public void m28345t() {
            View remove = this.f2106a.remove(0);
            C0414c m28351n = m28351n(remove);
            m28351n.f2104e = null;
            if (this.f2106a.size() == 0) {
                this.f2108c = Integer.MIN_VALUE;
            }
            if (m28351n.m28573c() || m28351n.m28574b()) {
                this.f2109d -= StaggeredGridLayoutManager.this.f2074u.mo28193e(remove);
            }
            this.f2107b = Integer.MIN_VALUE;
        }

        /* renamed from: u */
        public void m28344u(View view) {
            C0414c m28351n = m28351n(view);
            m28351n.f2104e = this;
            this.f2106a.add(0, view);
            this.f2107b = Integer.MIN_VALUE;
            if (this.f2106a.size() == 1) {
                this.f2108c = Integer.MIN_VALUE;
            }
            if (m28351n.m28573c() || m28351n.m28574b()) {
                this.f2109d += StaggeredGridLayoutManager.this.f2074u.mo28193e(view);
            }
        }

        /* renamed from: v */
        public void m28343v(int i) {
            this.f2107b = i;
            this.f2108c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.AbstractC0391o.C0395d m28613i0 = RecyclerView.AbstractC0391o.m28613i0(context, attributeSet, i, i2);
        m28476H2(m28613i0.f2001a);
        m28472J2(m28613i0.f2002b);
        m28474I2(m28613i0.f2003c);
        this.f2078y = new C0442f();
        m28437a2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
        if (r4.f2235e == (-1)) goto L9;
     */
    /* renamed from: A2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m28489A2(RecyclerView.C0403v c0403v, C0442f c0442f) {
        int min;
        int min2;
        if (!c0442f.f2231a || c0442f.f2239i) {
            return;
        }
        if (c0442f.f2232b != 0) {
            if (c0442f.f2235e == -1) {
                int i = c0442f.f2236f;
                int m28417m2 = i - m28417m2(i);
                if (m28417m2 >= 0) {
                    min2 = c0442f.f2237g - Math.min(m28417m2, c0442f.f2232b);
                    m28488B2(c0403v, min2);
                    return;
                }
                min2 = c0442f.f2237g;
                m28488B2(c0403v, min2);
                return;
            }
            int m28416n2 = m28416n2(c0442f.f2237g) - c0442f.f2237g;
            if (m28416n2 >= 0) {
                min = Math.min(m28416n2, c0442f.f2232b) + c0442f.f2236f;
                m28485C2(c0403v, min);
            }
            min = c0442f.f2236f;
            m28485C2(c0403v, min);
        }
    }

    /* renamed from: B2 */
    public final void m28488B2(RecyclerView.C0403v c0403v, int i) {
        for (int m28658J = m28658J() - 1; m28658J >= 0; m28658J--) {
            View m28659I = m28659I(m28658J);
            if (this.f2074u.mo28191g(m28659I) < i || this.f2074u.mo28182q(m28659I) < i) {
                return;
            }
            C0414c c0414c = (C0414c) m28659I.getLayoutParams();
            if (c0414c.f2105f) {
                for (int i2 = 0; i2 < this.f2072s; i2++) {
                    if (this.f2073t[i2].f2106a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f2072s; i3++) {
                    this.f2073t[i3].m28346s();
                }
            } else if (c0414c.f2104e.f2106a.size() == 1) {
                return;
            } else {
                c0414c.f2104e.m28346s();
            }
            m28604m1(m28659I, c0403v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: C0 */
    public void mo28487C0(int i) {
        super.mo28487C0(i);
        for (int i2 = 0; i2 < this.f2072s; i2++) {
            this.f2073t[i2].m28347r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: C1 */
    public void mo28486C1(Rect rect, int i, int i2) {
        int m28603n;
        int m28603n2;
        int m28623e0 = m28623e0() + m28621f0();
        int m28619g0 = m28619g0() + m28625d0();
        if (this.f2076w == 1) {
            m28603n2 = RecyclerView.AbstractC0391o.m28603n(i2, rect.height() + m28619g0, m28630b0());
            m28603n = RecyclerView.AbstractC0391o.m28603n(i, (this.f2077x * this.f2072s) + m28623e0, m28627c0());
        } else {
            m28603n = RecyclerView.AbstractC0391o.m28603n(i, rect.width() + m28623e0, m28627c0());
            m28603n2 = RecyclerView.AbstractC0391o.m28603n(i2, (this.f2077x * this.f2072s) + m28619g0, m28630b0());
        }
        m28672B1(m28603n, m28603n2);
    }

    /* renamed from: C2 */
    public final void m28485C2(RecyclerView.C0403v c0403v, int i) {
        while (m28658J() > 0) {
            View m28659I = m28659I(0);
            if (this.f2074u.mo28194d(m28659I) > i || this.f2074u.mo28183p(m28659I) > i) {
                return;
            }
            C0414c c0414c = (C0414c) m28659I.getLayoutParams();
            if (c0414c.f2105f) {
                for (int i2 = 0; i2 < this.f2072s; i2++) {
                    if (this.f2073t[i2].f2106a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f2072s; i3++) {
                    this.f2073t[i3].m28345t();
                }
            } else if (c0414c.f2104e.f2106a.size() == 1) {
                return;
            } else {
                c0414c.f2104e.m28345t();
            }
            m28604m1(m28659I, c0403v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: D */
    public RecyclerView.C0396p mo28484D() {
        return this.f2076w == 0 ? new C0414c(-2, -1) : new C0414c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: D0 */
    public void mo28483D0(int i) {
        super.mo28483D0(i);
        for (int i2 = 0; i2 < this.f2072s; i2++) {
            this.f2073t[i2].m28347r(i);
        }
    }

    /* renamed from: D2 */
    public final void m28482D2() {
        if (this.f2075v.mo28187k() == 1073741824) {
            return;
        }
        float f = 0.0f;
        int m28658J = m28658J();
        for (int i = 0; i < m28658J; i++) {
            View m28659I = m28659I(i);
            float mo28193e = this.f2075v.mo28193e(m28659I);
            if (mo28193e >= f) {
                if (((C0414c) m28659I.getLayoutParams()).m28365f()) {
                    mo28193e = (mo28193e * 1.0f) / this.f2072s;
                }
                f = Math.max(f, mo28193e);
            }
        }
        int i2 = this.f2077x;
        int round = Math.round(f * this.f2072s);
        if (this.f2075v.mo28187k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f2075v.mo28184n());
        }
        m28458P2(round);
        if (this.f2077x == i2) {
            return;
        }
        for (int i3 = 0; i3 < m28658J; i3++) {
            View m28659I2 = m28659I(i3);
            C0414c c0414c = (C0414c) m28659I2.getLayoutParams();
            if (!c0414c.f2105f) {
                if (m28404t2() && this.f2076w == 1) {
                    int i4 = this.f2072s;
                    int i5 = c0414c.f2104e.f2110e;
                    m28659I2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.f2077x) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = c0414c.f2104e.f2110e;
                    int i7 = this.f2076w;
                    int i8 = (this.f2077x * i6) - (i6 * i2);
                    if (i7 == 1) {
                        m28659I2.offsetLeftAndRight(i8);
                    } else {
                        m28659I2.offsetTopAndBottom(i8);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: E */
    public RecyclerView.C0396p mo28481E(Context context, AttributeSet attributeSet) {
        return new C0414c(context, attributeSet);
    }

    /* renamed from: E2 */
    public final void m28480E2() {
        this.f2056A = (this.f2076w == 1 || !m28404t2()) ? this.f2079z : !this.f2079z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: F */
    public RecyclerView.C0396p mo28479F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0414c((ViewGroup.MarginLayoutParams) layoutParams) : new C0414c(layoutParams);
    }

    /* renamed from: F2 */
    public int m28478F2(int i, RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        if (m28658J() == 0 || i == 0) {
            return 0;
        }
        m28394y2(i, c0409z);
        int m28436b2 = m28436b2(c0403v, this.f2078y, c0409z);
        if (this.f2078y.f2232b >= m28436b2) {
            i = i < 0 ? -m28436b2 : m28436b2;
        }
        this.f2074u.mo28181r(-i);
        this.f2062G = this.f2056A;
        C0442f c0442f = this.f2078y;
        c0442f.f2232b = 0;
        m28489A2(c0403v, c0442f);
        return i;
    }

    /* renamed from: G2 */
    public final void m28477G2(int i) {
        C0442f c0442f = this.f2078y;
        c0442f.f2235e = i;
        c0442f.f2234d = this.f2056A != (i == -1) ? -1 : 1;
    }

    /* renamed from: H2 */
    public void m28476H2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo28428g(null);
        if (i == this.f2076w) {
            return;
        }
        this.f2076w = i;
        AbstractC0446i abstractC0446i = this.f2074u;
        this.f2074u = this.f2075v;
        this.f2075v = abstractC0446i;
        m28589t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: I0 */
    public void mo28475I0(RecyclerView recyclerView, RecyclerView.C0403v c0403v) {
        super.mo28475I0(recyclerView, c0403v);
        m28599o1(this.f2071P);
        for (int i = 0; i < this.f2072s; i++) {
            this.f2073t[i].m28360e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: I1 */
    public void mo2469I1(RecyclerView recyclerView, RecyclerView.C0409z c0409z, int i) {
        C0443g c0443g = new C0443g(recyclerView.getContext());
        c0443g.m28504p(i);
        m28657J1(c0443g);
    }

    /* renamed from: I2 */
    public void m28474I2(boolean z) {
        mo28428g(null);
        SavedState savedState = this.f2064I;
        if (savedState != null && savedState.f2093w != z) {
            savedState.f2093w = z;
        }
        this.f2079z = z;
        m28589t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: J0 */
    public View mo28473J0(View view, int i, RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        View m28674B;
        View m28352m;
        if (m28658J() == 0 || (m28674B = m28674B(view)) == null) {
            return null;
        }
        m28480E2();
        int m28442X1 = m28442X1(i);
        if (m28442X1 == Integer.MIN_VALUE) {
            return null;
        }
        C0414c c0414c = (C0414c) m28674B.getLayoutParams();
        boolean z = c0414c.f2105f;
        C0415d c0415d = c0414c.f2104e;
        int m28421k2 = m28442X1 == 1 ? m28421k2() : m28424j2();
        m28461O2(m28421k2, c0409z);
        m28477G2(m28442X1);
        C0442f c0442f = this.f2078y;
        c0442f.f2233c = c0442f.f2234d + m28421k2;
        c0442f.f2232b = (int) (this.f2074u.mo28184n() * 0.33333334f);
        C0442f c0442f2 = this.f2078y;
        c0442f2.f2238h = true;
        c0442f2.f2231a = false;
        m28436b2(c0403v, c0442f2, c0409z);
        this.f2062G = this.f2056A;
        if (z || (m28352m = c0415d.m28352m(m28421k2, m28442X1)) == null || m28352m == m28674B) {
            if (m28396x2(m28442X1)) {
                for (int i2 = this.f2072s - 1; i2 >= 0; i2--) {
                    View m28352m2 = this.f2073t[i2].m28352m(m28421k2, m28442X1);
                    if (m28352m2 != null && m28352m2 != m28674B) {
                        return m28352m2;
                    }
                }
            } else {
                for (int i3 = 0; i3 < this.f2072s; i3++) {
                    View m28352m3 = this.f2073t[i3].m28352m(m28421k2, m28442X1);
                    if (m28352m3 != null && m28352m3 != m28674B) {
                        return m28352m3;
                    }
                }
            }
            boolean z2 = (this.f2079z ^ true) == (m28442X1 == -1);
            if (!z) {
                View mo28671C = mo28671C(z2 ? c0415d.m28359f() : c0415d.m28358g());
                if (mo28671C != null && mo28671C != m28674B) {
                    return mo28671C;
                }
            }
            if (m28396x2(m28442X1)) {
                for (int i4 = this.f2072s - 1; i4 >= 0; i4--) {
                    if (i4 != c0415d.f2110e) {
                        C0415d[] c0415dArr = this.f2073t;
                        View mo28671C2 = mo28671C(z2 ? c0415dArr[i4].m28359f() : c0415dArr[i4].m28358g());
                        if (mo28671C2 != null && mo28671C2 != m28674B) {
                            return mo28671C2;
                        }
                    }
                }
            } else {
                for (int i5 = 0; i5 < this.f2072s; i5++) {
                    C0415d[] c0415dArr2 = this.f2073t;
                    View mo28671C3 = mo28671C(z2 ? c0415dArr2[i5].m28359f() : c0415dArr2[i5].m28358g());
                    if (mo28671C3 != null && mo28671C3 != m28674B) {
                        return mo28671C3;
                    }
                }
            }
            return null;
        }
        return m28352m;
    }

    /* renamed from: J2 */
    public void m28472J2(int i) {
        mo28428g(null);
        if (i != this.f2072s) {
            m28406s2();
            this.f2072s = i;
            this.f2057B = new BitSet(this.f2072s);
            this.f2073t = new C0415d[this.f2072s];
            for (int i2 = 0; i2 < this.f2072s; i2++) {
                this.f2073t[i2] = new C0415d(i2);
            }
            m28589t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: K0 */
    public void mo28471K0(AccessibilityEvent accessibilityEvent) {
        super.mo28471K0(accessibilityEvent);
        if (m28658J() > 0) {
            View m28430e2 = m28430e2(false);
            View m28432d2 = m28432d2(false);
            if (m28430e2 == null || m28432d2 == null) {
                return;
            }
            int m28616h0 = m28616h0(m28430e2);
            int m28616h02 = m28616h0(m28432d2);
            if (m28616h0 < m28616h02) {
                accessibilityEvent.setFromIndex(m28616h0);
                accessibilityEvent.setToIndex(m28616h02);
                return;
            }
            accessibilityEvent.setFromIndex(m28616h02);
            accessibilityEvent.setToIndex(m28616h0);
        }
    }

    /* renamed from: K2 */
    public final void m28470K2(int i, int i2) {
        for (int i3 = 0; i3 < this.f2072s; i3++) {
            if (!this.f2073t[i3].f2106a.isEmpty()) {
                m28456Q2(this.f2073t[i3], i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: L1 */
    public boolean mo28469L1() {
        return this.f2064I == null;
    }

    /* renamed from: L2 */
    public final boolean m28468L2(RecyclerView.C0409z c0409z, C0413b c0413b) {
        boolean z = this.f2062G;
        int m28495b = c0409z.m28495b();
        c0413b.f2097a = z ? m28427g2(m28495b) : m28434c2(m28495b);
        c0413b.f2098b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: M1 */
    public final void m28467M1(View view) {
        for (int i = this.f2072s - 1; i >= 0; i--) {
            this.f2073t[i].m28364a(view);
        }
    }

    /* renamed from: M2 */
    public boolean m28466M2(RecyclerView.C0409z c0409z, C0413b c0413b) {
        int i;
        int mo28185m;
        int mo28191g;
        if (!c0409z.m28492e() && (i = this.f2058C) != -1) {
            if (i >= 0 && i < c0409z.m28495b()) {
                SavedState savedState = this.f2064I;
                if (savedState == null || savedState.f2086p == -1 || savedState.f2088r < 1) {
                    View mo28671C = mo28671C(this.f2058C);
                    if (mo28671C != null) {
                        c0413b.f2097a = this.f2056A ? m28421k2() : m28424j2();
                        if (this.f2059D != Integer.MIN_VALUE) {
                            if (c0413b.f2099c) {
                                mo28185m = this.f2074u.mo28189i() - this.f2059D;
                                mo28191g = this.f2074u.mo28194d(mo28671C);
                            } else {
                                mo28185m = this.f2074u.mo28185m() + this.f2059D;
                                mo28191g = this.f2074u.mo28191g(mo28671C);
                            }
                            c0413b.f2098b = mo28185m - mo28191g;
                            return true;
                        } else if (this.f2074u.mo28193e(mo28671C) > this.f2074u.mo28184n()) {
                            c0413b.f2098b = c0413b.f2099c ? this.f2074u.mo28189i() : this.f2074u.mo28185m();
                            return true;
                        } else {
                            int mo28191g2 = this.f2074u.mo28191g(mo28671C) - this.f2074u.mo28185m();
                            if (mo28191g2 < 0) {
                                c0413b.f2098b = -mo28191g2;
                                return true;
                            }
                            int mo28189i = this.f2074u.mo28189i() - this.f2074u.mo28194d(mo28671C);
                            if (mo28189i < 0) {
                                c0413b.f2098b = mo28189i;
                                return true;
                            }
                            c0413b.f2098b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i2 = this.f2058C;
                        c0413b.f2097a = i2;
                        int i3 = this.f2059D;
                        if (i3 == Integer.MIN_VALUE) {
                            c0413b.f2099c = m28454R1(i2) == 1;
                            c0413b.m28370a();
                        } else {
                            c0413b.m28369b(i3);
                        }
                        c0413b.f2100d = true;
                    }
                } else {
                    c0413b.f2098b = Integer.MIN_VALUE;
                    c0413b.f2097a = this.f2058C;
                }
                return true;
            }
            this.f2058C = -1;
            this.f2059D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: N */
    public int mo28465N(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        return this.f2076w == 1 ? this.f2072s : super.mo28465N(c0403v, c0409z);
    }

    /* renamed from: N1 */
    public final void m28464N1(C0413b c0413b) {
        boolean z;
        SavedState savedState = this.f2064I;
        int i = savedState.f2088r;
        if (i > 0) {
            if (i == this.f2072s) {
                for (int i2 = 0; i2 < this.f2072s; i2++) {
                    this.f2073t[i2].m28360e();
                    SavedState savedState2 = this.f2064I;
                    int i3 = savedState2.f2089s[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += savedState2.f2094x ? this.f2074u.mo28189i() : this.f2074u.mo28185m();
                    }
                    this.f2073t[i2].m28343v(i3);
                }
            } else {
                savedState.m28373b();
                SavedState savedState3 = this.f2064I;
                savedState3.f2086p = savedState3.f2087q;
            }
        }
        SavedState savedState4 = this.f2064I;
        this.f2063H = savedState4.f2095y;
        m28474I2(savedState4.f2093w);
        m28480E2();
        SavedState savedState5 = this.f2064I;
        int i4 = savedState5.f2086p;
        if (i4 != -1) {
            this.f2058C = i4;
            z = savedState5.f2094x;
        } else {
            z = this.f2056A;
        }
        c0413b.f2099c = z;
        if (savedState5.f2090t > 1) {
            LazySpanLookup lazySpanLookup = this.f2060E;
            lazySpanLookup.f2080a = savedState5.f2091u;
            lazySpanLookup.f2081b = savedState5.f2092v;
        }
    }

    /* renamed from: N2 */
    public void m28463N2(RecyclerView.C0409z c0409z, C0413b c0413b) {
        if (m28466M2(c0409z, c0413b) || m28468L2(c0409z, c0413b)) {
            return;
        }
        c0413b.m28370a();
        c0413b.f2097a = 0;
    }

    /* renamed from: O1 */
    public boolean m28462O1() {
        int m28353l = this.f2073t[0].m28353l(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2072s; i++) {
            if (this.f2073t[i].m28353l(Integer.MIN_VALUE) != m28353l) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* renamed from: O2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m28461O2(int i, RecyclerView.C0409z c0409z) {
        int i2;
        int i3;
        int m28494c;
        C0442f c0442f = this.f2078y;
        boolean z = false;
        c0442f.f2232b = 0;
        c0442f.f2233c = i;
        if (!m28581x0() || (m28494c = c0409z.m28494c()) == -1) {
            i2 = 0;
        } else {
            if (this.f2056A != (m28494c < i)) {
                i3 = this.f2074u.mo28184n();
                i2 = 0;
                if (m28652M()) {
                    this.f2078y.f2237g = this.f2074u.mo28190h() + i2;
                    this.f2078y.f2236f = -i3;
                } else {
                    this.f2078y.f2236f = this.f2074u.mo28185m() - i3;
                    this.f2078y.f2237g = this.f2074u.mo28189i() + i2;
                }
                C0442f c0442f2 = this.f2078y;
                c0442f2.f2238h = false;
                c0442f2.f2231a = true;
                if (this.f2074u.mo28187k() == 0 && this.f2074u.mo28190h() == 0) {
                    z = true;
                }
                c0442f2.f2239i = z;
            }
            i2 = this.f2074u.mo28184n();
        }
        i3 = 0;
        if (m28652M()) {
        }
        C0442f c0442f22 = this.f2078y;
        c0442f22.f2238h = false;
        c0442f22.f2231a = true;
        if (this.f2074u.mo28187k() == 0) {
            z = true;
        }
        c0442f22.f2239i = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: P0 */
    public void mo28460P0(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, View view, C3654y c3654y) {
        int i;
        int i2;
        int m28366e;
        int i3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0414c)) {
            super.m28648O0(view, c3654y);
            return;
        }
        C0414c c0414c = (C0414c) layoutParams;
        if (this.f2076w == 0) {
            i = c0414c.m28366e();
            i2 = c0414c.f2105f ? this.f2072s : 1;
            m28366e = -1;
            i3 = -1;
        } else {
            i = -1;
            i2 = -1;
            m28366e = c0414c.m28366e();
            i3 = c0414c.f2105f ? this.f2072s : 1;
        }
        c3654y.m4329e0(C3654y.C3657c.m4280a(i, i2, m28366e, i3, false, false));
    }

    /* renamed from: P1 */
    public boolean m28459P1() {
        int m28349p = this.f2073t[0].m28349p(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2072s; i++) {
            if (this.f2073t[i].m28349p(Integer.MIN_VALUE) != m28349p) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P2 */
    public void m28458P2(int i) {
        this.f2077x = i / this.f2072s;
        this.f2065J = View.MeasureSpec.makeMeasureSpec(i, this.f2075v.mo28187k());
    }

    /* renamed from: Q1 */
    public final void m28457Q1(View view, C0414c c0414c, C0442f c0442f) {
        if (c0442f.f2235e == 1) {
            if (c0414c.f2105f) {
                m28467M1(view);
            } else {
                c0414c.f2104e.m28364a(view);
            }
        } else if (c0414c.f2105f) {
            m28393z2(view);
        } else {
            c0414c.f2104e.m28344u(view);
        }
    }

    /* renamed from: Q2 */
    public final void m28456Q2(C0415d c0415d, int i, int i2) {
        int m28355j = c0415d.m28355j();
        if (i == -1) {
            if (c0415d.m28350o() + m28355j > i2) {
                return;
            }
        } else if (c0415d.m28354k() - m28355j < i2) {
            return;
        }
        this.f2057B.set(c0415d.f2110e, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: R0 */
    public void mo28455R0(RecyclerView recyclerView, int i, int i2) {
        m28411q2(i, i2, 1);
    }

    /* renamed from: R1 */
    public final int m28454R1(int i) {
        if (m28658J() == 0) {
            return this.f2056A ? 1 : -1;
        }
        return (i < m28424j2()) != this.f2056A ? -1 : 1;
    }

    /* renamed from: R2 */
    public final int m28453R2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: S0 */
    public void mo28452S0(RecyclerView recyclerView) {
        this.f2060E.m28391b();
        m28589t1();
    }

    /* renamed from: S1 */
    public boolean m28451S1() {
        int m28424j2;
        int m28421k2;
        if (m28658J() == 0 || this.f2061F == 0 || !m28593r0()) {
            return false;
        }
        if (this.f2056A) {
            m28424j2 = m28421k2();
            m28421k2 = m28424j2();
        } else {
            m28424j2 = m28424j2();
            m28421k2 = m28421k2();
        }
        if (m28424j2 == 0 && m28409r2() != null) {
            this.f2060E.m28391b();
        } else if (!this.f2068M) {
            return false;
        } else {
            int i = this.f2056A ? -1 : 1;
            int i2 = m28421k2 + 1;
            LazySpanLookup.FullSpanItem m28388e = this.f2060E.m28388e(m28424j2, i2, i, true);
            if (m28388e == null) {
                this.f2068M = false;
                this.f2060E.m28389d(i2);
                return false;
            }
            LazySpanLookup.FullSpanItem m28388e2 = this.f2060E.m28388e(m28424j2, m28388e.f2082p, i * (-1), true);
            if (m28388e2 == null) {
                this.f2060E.m28389d(m28388e.f2082p);
            } else {
                this.f2060E.m28389d(m28388e2.f2082p + 1);
            }
        }
        m28587u1();
        m28589t1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: T0 */
    public void mo28450T0(RecyclerView recyclerView, int i, int i2, int i3) {
        m28411q2(i, i2, 8);
    }

    /* renamed from: T1 */
    public final boolean m28449T1(C0415d c0415d) {
        if (this.f2056A) {
            if (c0415d.m28354k() < this.f2074u.mo28189i()) {
                ArrayList<View> arrayList = c0415d.f2106a;
                return !c0415d.m28351n(arrayList.get(arrayList.size() - 1)).f2105f;
            }
        } else if (c0415d.m28350o() > this.f2074u.mo28185m()) {
            return !c0415d.m28351n(c0415d.f2106a.get(0)).f2105f;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: U0 */
    public void mo28448U0(RecyclerView recyclerView, int i, int i2) {
        m28411q2(i, i2, 2);
    }

    /* renamed from: U1 */
    public final int m28447U1(RecyclerView.C0409z c0409z) {
        if (m28658J() == 0) {
            return 0;
        }
        return C0453l.m28167a(c0409z, this.f2074u, m28430e2(!this.f2069N), m28432d2(!this.f2069N), this, this.f2069N);
    }

    /* renamed from: V1 */
    public final int m28446V1(RecyclerView.C0409z c0409z) {
        if (m28658J() == 0) {
            return 0;
        }
        return C0453l.m28166b(c0409z, this.f2074u, m28430e2(!this.f2069N), m28432d2(!this.f2069N), this, this.f2069N, this.f2056A);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: W0 */
    public void mo28445W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m28411q2(i, i2, 4);
    }

    /* renamed from: W1 */
    public final int m28444W1(RecyclerView.C0409z c0409z) {
        if (m28658J() == 0) {
            return 0;
        }
        return C0453l.m28165c(c0409z, this.f2074u, m28430e2(!this.f2069N), m28432d2(!this.f2069N), this, this.f2069N);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: X0 */
    public void mo28443X0(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        m28398w2(c0403v, c0409z, true);
    }

    /* renamed from: X1 */
    public final int m28442X1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f2076w == 1) ? 1 : Integer.MIN_VALUE : this.f2076w == 0 ? 1 : Integer.MIN_VALUE : this.f2076w == 1 ? -1 : Integer.MIN_VALUE : this.f2076w == 0 ? -1 : Integer.MIN_VALUE : (this.f2076w != 1 && m28404t2()) ? -1 : 1 : (this.f2076w != 1 && m28404t2()) ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: Y0 */
    public void mo28441Y0(RecyclerView.C0409z c0409z) {
        super.mo28441Y0(c0409z);
        this.f2058C = -1;
        this.f2059D = Integer.MIN_VALUE;
        this.f2064I = null;
        this.f2067L.m28368c();
    }

    /* renamed from: Y1 */
    public final LazySpanLookup.FullSpanItem m28440Y1(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f2084r = new int[this.f2072s];
        for (int i2 = 0; i2 < this.f2072s; i2++) {
            fullSpanItem.f2084r[i2] = i - this.f2073t[i2].m28353l(i);
        }
        return fullSpanItem;
    }

    /* renamed from: Z1 */
    public final LazySpanLookup.FullSpanItem m28439Z1(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f2084r = new int[this.f2072s];
        for (int i2 = 0; i2 < this.f2072s; i2++) {
            fullSpanItem.f2084r[i2] = this.f2073t[i2].m28349p(i) - i;
        }
        return fullSpanItem;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0406y.InterfaceC0408b
    /* renamed from: a */
    public PointF mo28438a(int i) {
        int m28454R1 = m28454R1(i);
        PointF pointF = new PointF();
        if (m28454R1 == 0) {
            return null;
        }
        if (this.f2076w == 0) {
            pointF.x = m28454R1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m28454R1;
        }
        return pointF;
    }

    /* renamed from: a2 */
    public final void m28437a2() {
        this.f2074u = AbstractC0446i.m28198b(this, this.f2076w);
        this.f2075v = AbstractC0446i.m28198b(this, 1 - this.f2076w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: b2 */
    public final int m28436b2(RecyclerView.C0403v c0403v, C0442f c0442f, RecyclerView.C0409z c0409z) {
        int i;
        C0415d c0415d;
        int mo28193e;
        int i2;
        int i3;
        int mo28193e2;
        RecyclerView.AbstractC0391o abstractC0391o;
        View view;
        int i4;
        int i5;
        ?? r9 = 0;
        this.f2057B.set(0, this.f2072s, true);
        if (this.f2078y.f2239i) {
            i = c0442f.f2235e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = c0442f.f2235e == 1 ? c0442f.f2237g + c0442f.f2232b : c0442f.f2236f - c0442f.f2232b;
        }
        m28470K2(c0442f.f2235e, i);
        int mo28189i = this.f2056A ? this.f2074u.mo28189i() : this.f2074u.mo28185m();
        boolean z = false;
        while (c0442f.m28221a(c0409z) && (this.f2078y.f2239i || !this.f2057B.isEmpty())) {
            View m28220b = c0442f.m28220b(c0403v);
            C0414c c0414c = (C0414c) m28220b.getLayoutParams();
            int m28575a = c0414c.m28575a();
            int m28386g = this.f2060E.m28386g(m28575a);
            boolean z2 = m28386g == -1;
            if (z2) {
                c0415d = c0414c.f2105f ? this.f2073t[r9] : m28413p2(c0442f);
                this.f2060E.m28379n(m28575a, c0415d);
            } else {
                c0415d = this.f2073t[m28386g];
            }
            C0415d c0415d2 = c0415d;
            c0414c.f2104e = c0415d2;
            if (c0442f.f2235e == 1) {
                m28626d(m28220b);
            } else {
                m28624e(m28220b, r9);
            }
            m28400v2(m28220b, c0414c, r9);
            if (c0442f.f2235e == 1) {
                int m28419l2 = c0414c.f2105f ? m28419l2(mo28189i) : c0415d2.m28353l(mo28189i);
                int mo28193e3 = this.f2074u.mo28193e(m28220b) + m28419l2;
                if (z2 && c0414c.f2105f) {
                    LazySpanLookup.FullSpanItem m28440Y1 = m28440Y1(m28419l2);
                    m28440Y1.f2083q = -1;
                    m28440Y1.f2082p = m28575a;
                    this.f2060E.m28392a(m28440Y1);
                }
                i2 = mo28193e3;
                mo28193e = m28419l2;
            } else {
                int m28414o2 = c0414c.f2105f ? m28414o2(mo28189i) : c0415d2.m28349p(mo28189i);
                mo28193e = m28414o2 - this.f2074u.mo28193e(m28220b);
                if (z2 && c0414c.f2105f) {
                    LazySpanLookup.FullSpanItem m28439Z1 = m28439Z1(m28414o2);
                    m28439Z1.f2083q = 1;
                    m28439Z1.f2082p = m28575a;
                    this.f2060E.m28392a(m28439Z1);
                }
                i2 = m28414o2;
            }
            if (c0414c.f2105f && c0442f.f2234d == -1) {
                if (!z2) {
                    if (!(c0442f.f2235e == 1 ? m28462O1() : m28459P1())) {
                        LazySpanLookup.FullSpanItem m28387f = this.f2060E.m28387f(m28575a);
                        if (m28387f != null) {
                            m28387f.f2085s = true;
                        }
                    }
                }
                this.f2068M = true;
            }
            m28457Q1(m28220b, c0414c, c0442f);
            if (m28404t2() && this.f2076w == 1) {
                int mo28189i2 = c0414c.f2105f ? this.f2075v.mo28189i() : this.f2075v.mo28189i() - (((this.f2072s - 1) - c0415d2.f2110e) * this.f2077x);
                mo28193e2 = mo28189i2;
                i3 = mo28189i2 - this.f2075v.mo28193e(m28220b);
            } else {
                int mo28185m = c0414c.f2105f ? this.f2075v.mo28185m() : (c0415d2.f2110e * this.f2077x) + this.f2075v.mo28185m();
                i3 = mo28185m;
                mo28193e2 = this.f2075v.mo28193e(m28220b) + mo28185m;
            }
            if (this.f2076w == 1) {
                abstractC0391o = this;
                view = m28220b;
                i4 = i3;
                i3 = mo28193e;
                i5 = mo28193e2;
            } else {
                abstractC0391o = this;
                view = m28220b;
                i4 = mo28193e;
                i5 = i2;
                i2 = mo28193e2;
            }
            abstractC0391o.m28577z0(view, i4, i3, i5, i2);
            if (c0414c.f2105f) {
                m28470K2(this.f2078y.f2235e, i);
            } else {
                m28456Q2(c0415d2, this.f2078y.f2235e, i);
            }
            m28489A2(c0403v, this.f2078y);
            if (this.f2078y.f2238h && m28220b.hasFocusable()) {
                if (c0414c.f2105f) {
                    this.f2057B.clear();
                } else {
                    this.f2057B.set(c0415d2.f2110e, false);
                    z = true;
                    r9 = 0;
                }
            }
            z = true;
            r9 = 0;
        }
        if (!z) {
            m28489A2(c0403v, this.f2078y);
        }
        int mo28185m2 = this.f2078y.f2235e == -1 ? this.f2074u.mo28185m() - m28414o2(this.f2074u.mo28185m()) : m28419l2(this.f2074u.mo28189i()) - this.f2074u.mo28189i();
        if (mo28185m2 > 0) {
            return Math.min(c0442f.f2232b, mo28185m2);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: c1 */
    public void mo28435c1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f2064I = (SavedState) parcelable;
            m28589t1();
        }
    }

    /* renamed from: c2 */
    public final int m28434c2(int i) {
        int m28658J = m28658J();
        for (int i2 = 0; i2 < m28658J; i2++) {
            int m28616h0 = m28616h0(m28659I(i2));
            if (m28616h0 >= 0 && m28616h0 < i) {
                return m28616h0;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: d1 */
    public Parcelable mo28433d1() {
        int m28349p;
        int mo28185m;
        int[] iArr;
        if (this.f2064I != null) {
            return new SavedState(this.f2064I);
        }
        SavedState savedState = new SavedState();
        savedState.f2093w = this.f2079z;
        savedState.f2094x = this.f2062G;
        savedState.f2095y = this.f2063H;
        LazySpanLookup lazySpanLookup = this.f2060E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f2080a) == null) {
            savedState.f2090t = 0;
        } else {
            savedState.f2091u = iArr;
            savedState.f2090t = iArr.length;
            savedState.f2092v = lazySpanLookup.f2081b;
        }
        if (m28658J() > 0) {
            savedState.f2086p = this.f2062G ? m28421k2() : m28424j2();
            savedState.f2087q = m28429f2();
            int i = this.f2072s;
            savedState.f2088r = i;
            savedState.f2089s = new int[i];
            for (int i2 = 0; i2 < this.f2072s; i2++) {
                if (this.f2062G) {
                    m28349p = this.f2073t[i2].m28353l(Integer.MIN_VALUE);
                    if (m28349p != Integer.MIN_VALUE) {
                        mo28185m = this.f2074u.mo28189i();
                        m28349p -= mo28185m;
                        savedState.f2089s[i2] = m28349p;
                    } else {
                        savedState.f2089s[i2] = m28349p;
                    }
                } else {
                    m28349p = this.f2073t[i2].m28349p(Integer.MIN_VALUE);
                    if (m28349p != Integer.MIN_VALUE) {
                        mo28185m = this.f2074u.mo28185m();
                        m28349p -= mo28185m;
                        savedState.f2089s[i2] = m28349p;
                    } else {
                        savedState.f2089s[i2] = m28349p;
                    }
                }
            }
        } else {
            savedState.f2086p = -1;
            savedState.f2087q = -1;
            savedState.f2088r = 0;
        }
        return savedState;
    }

    /* renamed from: d2 */
    public View m28432d2(boolean z) {
        int mo28185m = this.f2074u.mo28185m();
        int mo28189i = this.f2074u.mo28189i();
        View view = null;
        for (int m28658J = m28658J() - 1; m28658J >= 0; m28658J--) {
            View m28659I = m28659I(m28658J);
            int mo28191g = this.f2074u.mo28191g(m28659I);
            int mo28194d = this.f2074u.mo28194d(m28659I);
            if (mo28194d > mo28185m && mo28191g < mo28189i) {
                if (mo28194d <= mo28189i || !z) {
                    return m28659I;
                }
                if (view == null) {
                    view = m28659I;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: e1 */
    public void mo28431e1(int i) {
        if (i == 0) {
            m28451S1();
        }
    }

    /* renamed from: e2 */
    public View m28430e2(boolean z) {
        int mo28185m = this.f2074u.mo28185m();
        int mo28189i = this.f2074u.mo28189i();
        int m28658J = m28658J();
        View view = null;
        for (int i = 0; i < m28658J; i++) {
            View m28659I = m28659I(i);
            int mo28191g = this.f2074u.mo28191g(m28659I);
            if (this.f2074u.mo28194d(m28659I) > mo28185m && mo28191g < mo28189i) {
                if (mo28191g >= mo28185m || !z) {
                    return m28659I;
                }
                if (view == null) {
                    view = m28659I;
                }
            }
        }
        return view;
    }

    /* renamed from: f2 */
    public int m28429f2() {
        View m28432d2 = this.f2056A ? m28432d2(true) : m28430e2(true);
        if (m28432d2 == null) {
            return -1;
        }
        return m28616h0(m28432d2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: g */
    public void mo28428g(String str) {
        if (this.f2064I == null) {
            super.mo28428g(str);
        }
    }

    /* renamed from: g2 */
    public final int m28427g2(int i) {
        for (int m28658J = m28658J() - 1; m28658J >= 0; m28658J--) {
            int m28616h0 = m28616h0(m28659I(m28658J));
            if (m28616h0 >= 0 && m28616h0 < i) {
                return m28616h0;
            }
        }
        return 0;
    }

    /* renamed from: h2 */
    public final void m28426h2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, boolean z) {
        int mo28189i;
        int m28419l2 = m28419l2(Integer.MIN_VALUE);
        if (m28419l2 != Integer.MIN_VALUE && (mo28189i = this.f2074u.mo28189i() - m28419l2) > 0) {
            int i = mo28189i - (-m28478F2(-mo28189i, c0403v, c0409z));
            if (!z || i <= 0) {
                return;
            }
            this.f2074u.mo28181r(i);
        }
    }

    /* renamed from: i2 */
    public final void m28425i2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, boolean z) {
        int mo28185m;
        int m28414o2 = m28414o2(Integer.MAX_VALUE);
        if (m28414o2 != Integer.MAX_VALUE && (mo28185m = m28414o2 - this.f2074u.mo28185m()) > 0) {
            int m28478F2 = mo28185m - m28478F2(mo28185m, c0403v, c0409z);
            if (!z || m28478F2 <= 0) {
                return;
            }
            this.f2074u.mo28181r(-m28478F2);
        }
    }

    /* renamed from: j2 */
    public int m28424j2() {
        if (m28658J() == 0) {
            return 0;
        }
        return m28616h0(m28659I(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: k */
    public boolean mo28423k() {
        return this.f2076w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: k0 */
    public int mo28422k0(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        return this.f2076w == 0 ? this.f2072s : super.mo28422k0(c0403v, c0409z);
    }

    /* renamed from: k2 */
    public int m28421k2() {
        int m28658J = m28658J();
        if (m28658J == 0) {
            return 0;
        }
        return m28616h0(m28659I(m28658J - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: l */
    public boolean mo28420l() {
        return this.f2076w == 1;
    }

    /* renamed from: l2 */
    public final int m28419l2(int i) {
        int m28353l = this.f2073t[0].m28353l(i);
        for (int i2 = 1; i2 < this.f2072s; i2++) {
            int m28353l2 = this.f2073t[i2].m28353l(i);
            if (m28353l2 > m28353l) {
                m28353l = m28353l2;
            }
        }
        return m28353l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: m */
    public boolean mo28418m(RecyclerView.C0396p c0396p) {
        return c0396p instanceof C0414c;
    }

    /* renamed from: m2 */
    public final int m28417m2(int i) {
        int m28349p = this.f2073t[0].m28349p(i);
        for (int i2 = 1; i2 < this.f2072s; i2++) {
            int m28349p2 = this.f2073t[i2].m28349p(i);
            if (m28349p2 > m28349p) {
                m28349p = m28349p2;
            }
        }
        return m28349p;
    }

    /* renamed from: n2 */
    public final int m28416n2(int i) {
        int m28353l = this.f2073t[0].m28353l(i);
        for (int i2 = 1; i2 < this.f2072s; i2++) {
            int m28353l2 = this.f2073t[i2].m28353l(i);
            if (m28353l2 < m28353l) {
                m28353l = m28353l2;
            }
        }
        return m28353l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: o */
    public void mo28415o(int i, int i2, RecyclerView.C0409z c0409z, RecyclerView.AbstractC0391o.InterfaceC0394c interfaceC0394c) {
        int m28353l;
        int i3;
        if (this.f2076w != 0) {
            i = i2;
        }
        if (m28658J() == 0 || i == 0) {
            return;
        }
        m28394y2(i, c0409z);
        int[] iArr = this.f2070O;
        if (iArr == null || iArr.length < this.f2072s) {
            this.f2070O = new int[this.f2072s];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f2072s; i5++) {
            C0442f c0442f = this.f2078y;
            if (c0442f.f2234d == -1) {
                m28353l = c0442f.f2236f;
                i3 = this.f2073t[i5].m28349p(m28353l);
            } else {
                m28353l = this.f2073t[i5].m28353l(c0442f.f2237g);
                i3 = this.f2078y.f2237g;
            }
            int i6 = m28353l - i3;
            if (i6 >= 0) {
                this.f2070O[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.f2070O, 0, i4);
        for (int i7 = 0; i7 < i4 && this.f2078y.m28221a(c0409z); i7++) {
            interfaceC0394c.mo28227a(this.f2078y.f2233c, this.f2070O[i7]);
            C0442f c0442f2 = this.f2078y;
            c0442f2.f2233c += c0442f2.f2234d;
        }
    }

    /* renamed from: o2 */
    public final int m28414o2(int i) {
        int m28349p = this.f2073t[0].m28349p(i);
        for (int i2 = 1; i2 < this.f2072s; i2++) {
            int m28349p2 = this.f2073t[i2].m28349p(i);
            if (m28349p2 < m28349p) {
                m28349p = m28349p2;
            }
        }
        return m28349p;
    }

    /* renamed from: p2 */
    public final C0415d m28413p2(C0442f c0442f) {
        int i;
        int i2;
        int i3 = -1;
        if (m28396x2(c0442f.f2235e)) {
            i = this.f2072s - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.f2072s;
            i2 = 1;
        }
        C0415d c0415d = null;
        if (c0442f.f2235e == 1) {
            int i4 = Integer.MAX_VALUE;
            int mo28185m = this.f2074u.mo28185m();
            while (i != i3) {
                C0415d c0415d2 = this.f2073t[i];
                int m28353l = c0415d2.m28353l(mo28185m);
                if (m28353l < i4) {
                    c0415d = c0415d2;
                    i4 = m28353l;
                }
                i += i2;
            }
            return c0415d;
        }
        int i5 = Integer.MIN_VALUE;
        int mo28189i = this.f2074u.mo28189i();
        while (i != i3) {
            C0415d c0415d3 = this.f2073t[i];
            int m28349p = c0415d3.m28349p(mo28189i);
            if (m28349p > i5) {
                c0415d = c0415d3;
                i5 = m28349p;
            }
            i += i2;
        }
        return c0415d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: q */
    public int mo28412q(RecyclerView.C0409z c0409z) {
        return m28447U1(c0409z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* renamed from: q2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m28411q2(int i, int i2, int i3) {
        int i4;
        int i5;
        int m28421k2 = this.f2056A ? m28421k2() : m28424j2();
        if (i3 != 8) {
            i4 = i + i2;
        } else if (i >= i2) {
            i4 = i + 1;
            i5 = i2;
            this.f2060E.m28385h(i5);
            if (i3 != 1) {
                this.f2060E.m28383j(i, i2);
            } else if (i3 == 2) {
                this.f2060E.m28382k(i, i2);
            } else if (i3 == 8) {
                this.f2060E.m28382k(i, 1);
                this.f2060E.m28383j(i2, 1);
            }
            if (i4 > m28421k2) {
                return;
            }
            if (i5 <= (this.f2056A ? m28424j2() : m28421k2())) {
                m28589t1();
                return;
            }
            return;
        } else {
            i4 = i2 + 1;
        }
        i5 = i;
        this.f2060E.m28385h(i5);
        if (i3 != 1) {
        }
        if (i4 > m28421k2) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: r */
    public int mo28410r(RecyclerView.C0409z c0409z) {
        return m28446V1(c0409z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: r2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View m28409r2() {
        int i;
        int i2;
        boolean z;
        int m28658J = m28658J() - 1;
        BitSet bitSet = new BitSet(this.f2072s);
        bitSet.set(0, this.f2072s, true);
        char c = (this.f2076w == 1 && m28404t2()) ? (char) 1 : (char) 65535;
        if (this.f2056A) {
            i = -1;
        } else {
            i = m28658J + 1;
            m28658J = 0;
        }
        int i3 = m28658J < i ? 1 : -1;
        while (m28658J != i) {
            View m28659I = m28659I(m28658J);
            C0414c c0414c = (C0414c) m28659I.getLayoutParams();
            if (bitSet.get(c0414c.f2104e.f2110e)) {
                if (m28449T1(c0414c.f2104e)) {
                    return m28659I;
                }
                bitSet.clear(c0414c.f2104e.f2110e);
            }
            if (!c0414c.f2105f && (i2 = m28658J + i3) != i) {
                View m28659I2 = m28659I(i2);
                if (this.f2056A) {
                    int mo28194d = this.f2074u.mo28194d(m28659I);
                    int mo28194d2 = this.f2074u.mo28194d(m28659I2);
                    if (mo28194d < mo28194d2) {
                        return m28659I;
                    }
                } else {
                    int mo28191g = this.f2074u.mo28191g(m28659I);
                    int mo28191g2 = this.f2074u.mo28191g(m28659I2);
                    if (mo28191g > mo28191g2) {
                        return m28659I;
                    }
                }
                if (z) {
                    if ((c0414c.f2104e.f2110e - ((C0414c) m28659I2.getLayoutParams()).f2104e.f2110e < 0) != (c < 0)) {
                        return m28659I;
                    }
                } else {
                    continue;
                }
            }
            m28658J += i3;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: s */
    public int mo28408s(RecyclerView.C0409z c0409z) {
        return m28444W1(c0409z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: s0 */
    public boolean mo28407s0() {
        return this.f2061F != 0;
    }

    /* renamed from: s2 */
    public void m28406s2() {
        this.f2060E.m28391b();
        m28589t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: t */
    public int mo28405t(RecyclerView.C0409z c0409z) {
        return m28447U1(c0409z);
    }

    /* renamed from: t2 */
    public boolean m28404t2() {
        return m28635Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: u */
    public int mo28403u(RecyclerView.C0409z c0409z) {
        return m28446V1(c0409z);
    }

    /* renamed from: u2 */
    public final void m28402u2(View view, int i, int i2, boolean z) {
        m28611j(view, this.f2066K);
        C0414c c0414c = (C0414c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0414c).leftMargin;
        Rect rect = this.f2066K;
        int m28453R2 = m28453R2(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) c0414c).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) c0414c).topMargin;
        Rect rect2 = this.f2066K;
        int m28453R22 = m28453R2(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) c0414c).bottomMargin + rect2.bottom);
        if (z ? m28660H1(view, m28453R2, m28453R22, c0414c) : m28666F1(view, m28453R2, m28453R22, c0414c)) {
            view.measure(m28453R2, m28453R22);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: v */
    public int mo28401v(RecyclerView.C0409z c0409z) {
        return m28444W1(c0409z);
    }

    /* renamed from: v2 */
    public final void m28400v2(View view, C0414c c0414c, boolean z) {
        int m28656K;
        int m28656K2;
        if (c0414c.f2105f) {
            if (this.f2076w != 1) {
                m28402u2(view, RecyclerView.AbstractC0391o.m28656K(m28600o0(), m28597p0(), m28623e0() + m28621f0(), ((ViewGroup.MarginLayoutParams) c0414c).width, true), this.f2065J, z);
                return;
            }
            m28656K = this.f2065J;
        } else if (this.f2076w != 1) {
            m28656K = RecyclerView.AbstractC0391o.m28656K(m28600o0(), m28597p0(), m28623e0() + m28621f0(), ((ViewGroup.MarginLayoutParams) c0414c).width, true);
            m28656K2 = RecyclerView.AbstractC0391o.m28656K(this.f2077x, m28637X(), 0, ((ViewGroup.MarginLayoutParams) c0414c).height, false);
            m28402u2(view, m28656K, m28656K2, z);
        } else {
            m28656K = RecyclerView.AbstractC0391o.m28656K(this.f2077x, m28597p0(), 0, ((ViewGroup.MarginLayoutParams) c0414c).width, false);
        }
        m28656K2 = RecyclerView.AbstractC0391o.m28656K(m28638W(), m28637X(), m28619g0() + m28625d0(), ((ViewGroup.MarginLayoutParams) c0414c).height, true);
        m28402u2(view, m28656K, m28656K2, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: w1 */
    public int mo28399w1(int i, RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        return m28478F2(i, c0403v, c0409z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x014b, code lost:
        if (m28451S1() != false) goto L83;
     */
    /* renamed from: w2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m28398w2(RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z, boolean z) {
        SavedState savedState;
        C0413b c0413b = this.f2067L;
        if (!(this.f2064I == null && this.f2058C == -1) && c0409z.m28495b() == 0) {
            m28608k1(c0403v);
            c0413b.m28368c();
            return;
        }
        boolean z2 = true;
        boolean z3 = (c0413b.f2101e && this.f2058C == -1 && this.f2064I == null) ? false : true;
        if (z3) {
            c0413b.m28368c();
            if (this.f2064I != null) {
                m28464N1(c0413b);
            } else {
                m28480E2();
                c0413b.f2099c = this.f2056A;
            }
            m28463N2(c0409z, c0413b);
            c0413b.f2101e = true;
        }
        if (this.f2064I == null && this.f2058C == -1 && (c0413b.f2099c != this.f2062G || m28404t2() != this.f2063H)) {
            this.f2060E.m28391b();
            c0413b.f2100d = true;
        }
        if (m28658J() > 0 && ((savedState = this.f2064I) == null || savedState.f2088r < 1)) {
            if (c0413b.f2100d) {
                for (int i = 0; i < this.f2072s; i++) {
                    this.f2073t[i].m28360e();
                    int i2 = c0413b.f2098b;
                    if (i2 != Integer.MIN_VALUE) {
                        this.f2073t[i].m28343v(i2);
                    }
                }
            } else if (z3 || this.f2067L.f2102f == null) {
                for (int i3 = 0; i3 < this.f2072s; i3++) {
                    this.f2073t[i3].m28363b(this.f2056A, c0413b.f2098b);
                }
                this.f2067L.m28367d(this.f2073t);
            } else {
                for (int i4 = 0; i4 < this.f2072s; i4++) {
                    C0415d c0415d = this.f2073t[i4];
                    c0415d.m28360e();
                    c0415d.m28343v(this.f2067L.f2102f[i4]);
                }
            }
        }
        m28584w(c0403v);
        this.f2078y.f2231a = false;
        this.f2068M = false;
        m28458P2(this.f2075v.mo28184n());
        m28461O2(c0413b.f2097a, c0409z);
        if (c0413b.f2099c) {
            m28477G2(-1);
            m28436b2(c0403v, this.f2078y, c0409z);
            m28477G2(1);
        } else {
            m28477G2(1);
            m28436b2(c0403v, this.f2078y, c0409z);
            m28477G2(-1);
        }
        C0442f c0442f = this.f2078y;
        c0442f.f2233c = c0413b.f2097a + c0442f.f2234d;
        m28436b2(c0403v, c0442f, c0409z);
        m28482D2();
        if (m28658J() > 0) {
            if (this.f2056A) {
                m28426h2(c0403v, c0409z, true);
                m28425i2(c0403v, c0409z, false);
            } else {
                m28425i2(c0403v, c0409z, true);
                m28426h2(c0403v, c0409z, false);
            }
        }
        if (z && !c0409z.m28492e()) {
            if (this.f2061F != 0 && m28658J() > 0 && (this.f2068M || m28409r2() != null)) {
                m28599o1(this.f2071P);
            }
        }
        z2 = false;
        if (c0409z.m28492e()) {
            this.f2067L.m28368c();
        }
        this.f2062G = c0413b.f2099c;
        this.f2063H = m28404t2();
        if (z2) {
            this.f2067L.m28368c();
            m28398w2(c0403v, c0409z, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: x1 */
    public void mo28397x1(int i) {
        SavedState savedState = this.f2064I;
        if (savedState != null && savedState.f2086p != i) {
            savedState.m28374a();
        }
        this.f2058C = i;
        this.f2059D = Integer.MIN_VALUE;
        m28589t1();
    }

    /* renamed from: x2 */
    public final boolean m28396x2(int i) {
        if (this.f2076w == 0) {
            return (i == -1) != this.f2056A;
        }
        return ((i == -1) == this.f2056A) == m28404t2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: y1 */
    public int mo28395y1(int i, RecyclerView.C0403v c0403v, RecyclerView.C0409z c0409z) {
        return m28478F2(i, c0403v, c0409z);
    }

    /* renamed from: y2 */
    public void m28394y2(int i, RecyclerView.C0409z c0409z) {
        int m28424j2;
        int i2;
        if (i > 0) {
            m28424j2 = m28421k2();
            i2 = 1;
        } else {
            m28424j2 = m28424j2();
            i2 = -1;
        }
        this.f2078y.f2231a = true;
        m28461O2(m28424j2, c0409z);
        m28477G2(i2);
        C0442f c0442f = this.f2078y;
        c0442f.f2233c = m28424j2 + c0442f.f2234d;
        c0442f.f2232b = Math.abs(i);
    }

    /* renamed from: z2 */
    public final void m28393z2(View view) {
        for (int i = this.f2072s - 1; i >= 0; i--) {
            this.f2073t[i].m28344u(view);
        }
    }
}
