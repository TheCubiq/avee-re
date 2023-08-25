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
import com.daaw.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.y.b {
    public BitSet B;
    public boolean G;
    public boolean H;
    public SavedState I;
    public int J;
    public int[] O;
    public d[] t;
    public i u;
    public i v;
    public int w;
    public int x;
    public final f y;
    public int s = -1;
    public boolean z = false;
    public boolean A = false;
    public int C = -1;
    public int D = Integer.MIN_VALUE;
    public LazySpanLookup E = new LazySpanLookup();
    public int F = 2;
    public final Rect K = new Rect();
    public final b L = new b();
    public boolean M = false;
    public boolean N = true;
    public final Runnable P = new a();

    /* loaded from: classes.dex */
    public static class LazySpanLookup {
        public int[] a;
        public List<FullSpanItem> b;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();
            public int p;
            public int q;
            public int[] r;
            public boolean s;

            /* loaded from: classes.dex */
            public static class a implements Parcelable.Creator<FullSpanItem> {
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
                this.p = parcel.readInt();
                this.q = parcel.readInt();
                this.s = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.r = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i) {
                int[] iArr = this.r;
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
                return "FullSpanItem{mPosition=" + this.p + ", mGapDir=" + this.q + ", mHasUnwantedGapAfter=" + this.s + ", mGapPerSpan=" + Arrays.toString(this.r) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.p);
                parcel.writeInt(this.q);
                parcel.writeInt(this.s ? 1 : 0);
                int[] iArr = this.r;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.r);
            }
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.b.get(i);
                if (fullSpanItem2.p == fullSpanItem.p) {
                    this.b.remove(i);
                }
                if (fullSpanItem2.p >= fullSpanItem.p) {
                    this.b.add(i, fullSpanItem);
                    return;
                }
            }
            this.b.add(fullSpanItem);
        }

        public void b() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public void c(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[o(i)];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i) {
            List<FullSpanItem> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.b.get(size).p >= i) {
                        this.b.remove(size);
                    }
                }
            }
            return h(i);
        }

        public FullSpanItem e(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.b.get(i4);
                int i5 = fullSpanItem.p;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.q == i3 || (z && fullSpanItem.s))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                if (fullSpanItem.p == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public int g(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        public int h(int i) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i2 = i(i);
                if (i2 == -1) {
                    int[] iArr2 = this.a;
                    Arrays.fill(iArr2, i, iArr2.length, -1);
                    return this.a.length;
                }
                int i3 = i2 + 1;
                Arrays.fill(this.a, i, i3, -1);
                return i3;
            }
            return -1;
        }

        public final int i(int i) {
            if (this.b == null) {
                return -1;
            }
            FullSpanItem f = f(i);
            if (f != null) {
                this.b.remove(f);
            }
            int size = this.b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.b.get(i2).p >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                this.b.remove(i2);
                return this.b.get(i2).p;
            }
            return -1;
        }

        public void j(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.a, i, i3, -1);
            l(i, i2);
        }

        public void k(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m(i, i2);
        }

        public final void l(int i, int i2) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                int i3 = fullSpanItem.p;
                if (i3 >= i) {
                    fullSpanItem.p = i3 + i2;
                }
            }
        }

        public final void m(int i, int i2) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                int i4 = fullSpanItem.p;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        fullSpanItem.p = i4 - i2;
                    }
                }
            }
        }

        public void n(int i, d dVar) {
            c(i);
            this.a[i] = dVar.e;
        }

        public int o(int i) {
            int length = this.a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int p;
        public int q;
        public int r;
        public int[] s;
        public int t;
        public int[] u;
        public List<LazySpanLookup.FullSpanItem> v;
        public boolean w;
        public boolean x;
        public boolean y;

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
            int readInt = parcel.readInt();
            this.r = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.s = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.t = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.u = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.w = parcel.readInt() == 1;
            this.x = parcel.readInt() == 1;
            this.y = parcel.readInt() == 1;
            this.v = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.r = savedState.r;
            this.p = savedState.p;
            this.q = savedState.q;
            this.s = savedState.s;
            this.t = savedState.t;
            this.u = savedState.u;
            this.w = savedState.w;
            this.x = savedState.x;
            this.y = savedState.y;
            this.v = savedState.v;
        }

        public void a() {
            this.s = null;
            this.r = 0;
            this.p = -1;
            this.q = -1;
        }

        public void b() {
            this.s = null;
            this.r = 0;
            this.t = 0;
            this.u = null;
            this.v = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.p);
            parcel.writeInt(this.q);
            parcel.writeInt(this.r);
            if (this.r > 0) {
                parcel.writeIntArray(this.s);
            }
            parcel.writeInt(this.t);
            if (this.t > 0) {
                parcel.writeIntArray(this.u);
            }
            parcel.writeInt(this.w ? 1 : 0);
            parcel.writeInt(this.x ? 1 : 0);
            parcel.writeInt(this.y ? 1 : 0);
            parcel.writeList(this.v);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.S1();
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            c();
        }

        public void a() {
            this.b = this.c ? StaggeredGridLayoutManager.this.u.i() : StaggeredGridLayoutManager.this.u.m();
        }

        public void b(int i) {
            this.b = this.c ? StaggeredGridLayoutManager.this.u.i() - i : StaggeredGridLayoutManager.this.u.m() + i;
        }

        public void c() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f;
            if (iArr == null || iArr.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f[i] = dVarArr[i].p(Integer.MIN_VALUE);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.p {
        public d e;
        public boolean f;

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public final int e() {
            d dVar = this.e;
            if (dVar == null) {
                return -1;
            }
            return dVar.e;
        }

        public boolean f() {
            return this.f;
        }
    }

    /* loaded from: classes.dex */
    public class d {
        public ArrayList<View> a = new ArrayList<>();
        public int b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;
        public int d = 0;
        public final int e;

        public d(int i) {
            this.e = i;
        }

        public void a(View view) {
            c n = n(view);
            n.e = this;
            this.a.add(view);
            this.c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        public void b(boolean z, int i) {
            int l = z ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (l == Integer.MIN_VALUE) {
                return;
            }
            if (!z || l >= StaggeredGridLayoutManager.this.u.i()) {
                if (z || l <= StaggeredGridLayoutManager.this.u.m()) {
                    if (i != Integer.MIN_VALUE) {
                        l += i;
                    }
                    this.c = l;
                    this.b = l;
                }
            }
        }

        public void c() {
            LazySpanLookup.FullSpanItem f;
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            c n = n(view);
            this.c = StaggeredGridLayoutManager.this.u.d(view);
            if (n.f && (f = StaggeredGridLayoutManager.this.E.f(n.a())) != null && f.q == 1) {
                this.c += f.a(this.e);
            }
        }

        public void d() {
            LazySpanLookup.FullSpanItem f;
            View view = this.a.get(0);
            c n = n(view);
            this.b = StaggeredGridLayoutManager.this.u.g(view);
            if (n.f && (f = StaggeredGridLayoutManager.this.E.f(n.a())) != null && f.q == -1) {
                this.b -= f.a(this.e);
            }
        }

        public void e() {
            this.a.clear();
            q();
            this.d = 0;
        }

        public int f() {
            int i;
            int size;
            if (StaggeredGridLayoutManager.this.z) {
                i = this.a.size() - 1;
                size = -1;
            } else {
                i = 0;
                size = this.a.size();
            }
            return i(i, size, true);
        }

        public int g() {
            int size;
            int i;
            if (StaggeredGridLayoutManager.this.z) {
                size = 0;
                i = this.a.size();
            } else {
                size = this.a.size() - 1;
                i = -1;
            }
            return i(size, i, true);
        }

        public int h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.u.m();
            int i3 = StaggeredGridLayoutManager.this.u.i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.a.get(i);
                int g = StaggeredGridLayoutManager.this.u.g(view);
                int d = StaggeredGridLayoutManager.this.u.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g >= i3 : g > i3;
                if (!z3 ? d > m : d >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && g >= m && d <= i3) {
                        }
                        return StaggeredGridLayoutManager.this.h0(view);
                    } else if (g >= m && d <= i3) {
                        return StaggeredGridLayoutManager.this.h0(view);
                    }
                }
                i += i4;
            }
            return -1;
        }

        public int i(int i, int i2, boolean z) {
            return h(i, i2, false, false, z);
        }

        public int j() {
            return this.d;
        }

        public int k() {
            int i = this.c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            c();
            return this.c;
        }

        public int l(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            c();
            return this.c;
        }

        public View m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = this.a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.h0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.h0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.h0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.h0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        public int o() {
            int i = this.b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            d();
            return this.b;
        }

        public int p(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            d();
            return this.b;
        }

        public void q() {
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
        }

        public void r(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2 + i;
            }
            int i3 = this.c;
            if (i3 != Integer.MIN_VALUE) {
                this.c = i3 + i;
            }
        }

        public void s() {
            int size = this.a.size();
            View remove = this.a.remove(size - 1);
            c n = n(remove);
            n.e = null;
            if (n.c() || n.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        public void t() {
            View remove = this.a.remove(0);
            c n = n(remove);
            n.e = null;
            if (this.a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            this.b = Integer.MIN_VALUE;
        }

        public void u(View view) {
            c n = n(view);
            n.e = this;
            this.a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        public void v(int i) {
            this.b = i;
            this.c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.o.d i0 = RecyclerView.o.i0(context, attributeSet, i, i2);
        H2(i0.a);
        J2(i0.b);
        I2(i0.c);
        this.y = new f();
        a2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
        if (r4.e == (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A2(androidx.recyclerview.widget.RecyclerView.v r3, androidx.recyclerview.widget.f r4) {
        /*
            r2 = this;
            boolean r0 = r4.a
            if (r0 == 0) goto L4d
            boolean r0 = r4.i
            if (r0 == 0) goto L9
            goto L4d
        L9:
            int r0 = r4.b
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.e
            if (r0 != r1) goto L18
        L12:
            int r4 = r4.g
        L14:
            r2.B2(r3, r4)
            goto L4d
        L18:
            int r4 = r4.f
        L1a:
            r2.C2(r3, r4)
            goto L4d
        L1e:
            int r0 = r4.e
            if (r0 != r1) goto L37
            int r0 = r4.f
            int r1 = r2.m2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2c
            goto L12
        L2c:
            int r1 = r4.g
            int r4 = r4.b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L14
        L37:
            int r0 = r4.g
            int r0 = r2.n2(r0)
            int r1 = r4.g
            int r0 = r0 - r1
            if (r0 >= 0) goto L43
            goto L18
        L43:
            int r1 = r4.f
            int r4 = r4.b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L1a
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.f):void");
    }

    public final void B2(RecyclerView.v vVar, int i) {
        for (int J = J() - 1; J >= 0; J--) {
            View I = I(J);
            if (this.u.g(I) < i || this.u.q(I) < i) {
                return;
            }
            c cVar = (c) I.getLayoutParams();
            if (cVar.f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].s();
                }
            } else if (cVar.e.a.size() == 1) {
                return;
            } else {
                cVar.e.s();
            }
            m1(I, vVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C0(int i) {
        super.C0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C1(Rect rect, int i, int i2) {
        int n;
        int n2;
        int e0 = e0() + f0();
        int g0 = g0() + d0();
        if (this.w == 1) {
            n2 = RecyclerView.o.n(i2, rect.height() + g0, b0());
            n = RecyclerView.o.n(i, (this.x * this.s) + e0, c0());
        } else {
            n = RecyclerView.o.n(i, rect.width() + e0, c0());
            n2 = RecyclerView.o.n(i2, (this.x * this.s) + g0, b0());
        }
        B1(n, n2);
    }

    public final void C2(RecyclerView.v vVar, int i) {
        while (J() > 0) {
            View I = I(0);
            if (this.u.d(I) > i || this.u.p(I) > i) {
                return;
            }
            c cVar = (c) I.getLayoutParams();
            if (cVar.f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].t();
                }
            } else if (cVar.e.a.size() == 1) {
                return;
            } else {
                cVar.e.t();
            }
            m1(I, vVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D() {
        return this.w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void D0(int i) {
        super.D0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    public final void D2() {
        if (this.v.k() == 1073741824) {
            return;
        }
        float f = 0.0f;
        int J = J();
        for (int i = 0; i < J; i++) {
            View I = I(i);
            float e = this.v.e(I);
            if (e >= f) {
                if (((c) I.getLayoutParams()).f()) {
                    e = (e * 1.0f) / this.s;
                }
                f = Math.max(f, e);
            }
        }
        int i2 = this.x;
        int round = Math.round(f * this.s);
        if (this.v.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.v.n());
        }
        P2(round);
        if (this.x == i2) {
            return;
        }
        for (int i3 = 0; i3 < J; i3++) {
            View I2 = I(i3);
            c cVar = (c) I2.getLayoutParams();
            if (!cVar.f) {
                if (t2() && this.w == 1) {
                    int i4 = this.s;
                    int i5 = cVar.e.e;
                    I2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.x) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = cVar.e.e;
                    int i7 = this.w;
                    int i8 = (this.x * i6) - (i6 * i2);
                    if (i7 == 1) {
                        I2.offsetLeftAndRight(i8);
                    } else {
                        I2.offsetTopAndBottom(i8);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public final void E2() {
        this.A = (this.w == 1 || !t2()) ? this.z : !this.z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public int F2(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (J() == 0 || i == 0) {
            return 0;
        }
        y2(i, zVar);
        int b2 = b2(vVar, this.y, zVar);
        if (this.y.b >= b2) {
            i = i < 0 ? -b2 : b2;
        }
        this.u.r(-i);
        this.G = this.A;
        f fVar = this.y;
        fVar.b = 0;
        A2(vVar, fVar);
        return i;
    }

    public final void G2(int i) {
        f fVar = this.y;
        fVar.e = i;
        fVar.d = this.A != (i == -1) ? -1 : 1;
    }

    public void H2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        g(null);
        if (i == this.w) {
            return;
        }
        this.w = i;
        i iVar = this.u;
        this.u = this.v;
        this.v = iVar;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.I0(recyclerView, vVar);
        o1(this.P);
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I1(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i);
        J1(gVar);
    }

    public void I2(boolean z) {
        g(null);
        SavedState savedState = this.I;
        if (savedState != null && savedState.w != z) {
            savedState.w = z;
        }
        this.z = z;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View J0(View view, int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        View B;
        View m;
        if (J() == 0 || (B = B(view)) == null) {
            return null;
        }
        E2();
        int X1 = X1(i);
        if (X1 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) B.getLayoutParams();
        boolean z = cVar.f;
        d dVar = cVar.e;
        int k2 = X1 == 1 ? k2() : j2();
        O2(k2, zVar);
        G2(X1);
        f fVar = this.y;
        fVar.c = fVar.d + k2;
        fVar.b = (int) (this.u.n() * 0.33333334f);
        f fVar2 = this.y;
        fVar2.h = true;
        fVar2.a = false;
        b2(vVar, fVar2, zVar);
        this.G = this.A;
        if (z || (m = dVar.m(k2, X1)) == null || m == B) {
            if (x2(X1)) {
                for (int i2 = this.s - 1; i2 >= 0; i2--) {
                    View m2 = this.t[i2].m(k2, X1);
                    if (m2 != null && m2 != B) {
                        return m2;
                    }
                }
            } else {
                for (int i3 = 0; i3 < this.s; i3++) {
                    View m3 = this.t[i3].m(k2, X1);
                    if (m3 != null && m3 != B) {
                        return m3;
                    }
                }
            }
            boolean z2 = (this.z ^ true) == (X1 == -1);
            if (!z) {
                View C = C(z2 ? dVar.f() : dVar.g());
                if (C != null && C != B) {
                    return C;
                }
            }
            if (x2(X1)) {
                for (int i4 = this.s - 1; i4 >= 0; i4--) {
                    if (i4 != dVar.e) {
                        d[] dVarArr = this.t;
                        View C2 = C(z2 ? dVarArr[i4].f() : dVarArr[i4].g());
                        if (C2 != null && C2 != B) {
                            return C2;
                        }
                    }
                }
            } else {
                for (int i5 = 0; i5 < this.s; i5++) {
                    d[] dVarArr2 = this.t;
                    View C3 = C(z2 ? dVarArr2[i5].f() : dVarArr2[i5].g());
                    if (C3 != null && C3 != B) {
                        return C3;
                    }
                }
            }
            return null;
        }
        return m;
    }

    public void J2(int i) {
        g(null);
        if (i != this.s) {
            s2();
            this.s = i;
            this.B = new BitSet(this.s);
            this.t = new d[this.s];
            for (int i2 = 0; i2 < this.s; i2++) {
                this.t[i2] = new d(i2);
            }
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            View e2 = e2(false);
            View d2 = d2(false);
            if (e2 == null || d2 == null) {
                return;
            }
            int h0 = h0(e2);
            int h02 = h0(d2);
            if (h0 < h02) {
                accessibilityEvent.setFromIndex(h0);
                accessibilityEvent.setToIndex(h02);
                return;
            }
            accessibilityEvent.setFromIndex(h02);
            accessibilityEvent.setToIndex(h0);
        }
    }

    public final void K2(int i, int i2) {
        for (int i3 = 0; i3 < this.s; i3++) {
            if (!this.t[i3].a.isEmpty()) {
                Q2(this.t[i3], i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean L1() {
        return this.I == null;
    }

    public final boolean L2(RecyclerView.z zVar, b bVar) {
        boolean z = this.G;
        int b2 = zVar.b();
        bVar.a = z ? g2(b2) : c2(b2);
        bVar.b = Integer.MIN_VALUE;
        return true;
    }

    public final void M1(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].a(view);
        }
    }

    public boolean M2(RecyclerView.z zVar, b bVar) {
        int i;
        int m;
        int g;
        if (!zVar.e() && (i = this.C) != -1) {
            if (i >= 0 && i < zVar.b()) {
                SavedState savedState = this.I;
                if (savedState == null || savedState.p == -1 || savedState.r < 1) {
                    View C = C(this.C);
                    if (C != null) {
                        bVar.a = this.A ? k2() : j2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.c) {
                                m = this.u.i() - this.D;
                                g = this.u.d(C);
                            } else {
                                m = this.u.m() + this.D;
                                g = this.u.g(C);
                            }
                            bVar.b = m - g;
                            return true;
                        } else if (this.u.e(C) > this.u.n()) {
                            bVar.b = bVar.c ? this.u.i() : this.u.m();
                            return true;
                        } else {
                            int g2 = this.u.g(C) - this.u.m();
                            if (g2 < 0) {
                                bVar.b = -g2;
                                return true;
                            }
                            int i2 = this.u.i() - this.u.d(C);
                            if (i2 < 0) {
                                bVar.b = i2;
                                return true;
                            }
                            bVar.b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i3 = this.C;
                        bVar.a = i3;
                        int i4 = this.D;
                        if (i4 == Integer.MIN_VALUE) {
                            bVar.c = R1(i3) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i4);
                        }
                        bVar.d = true;
                    }
                } else {
                    bVar.b = Integer.MIN_VALUE;
                    bVar.a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int N(RecyclerView.v vVar, RecyclerView.z zVar) {
        return this.w == 1 ? this.s : super.N(vVar, zVar);
    }

    public final void N1(b bVar) {
        boolean z;
        SavedState savedState = this.I;
        int i = savedState.r;
        if (i > 0) {
            if (i == this.s) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    this.t[i2].e();
                    SavedState savedState2 = this.I;
                    int i3 = savedState2.s[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += savedState2.x ? this.u.i() : this.u.m();
                    }
                    this.t[i2].v(i3);
                }
            } else {
                savedState.b();
                SavedState savedState3 = this.I;
                savedState3.p = savedState3.q;
            }
        }
        SavedState savedState4 = this.I;
        this.H = savedState4.y;
        I2(savedState4.w);
        E2();
        SavedState savedState5 = this.I;
        int i4 = savedState5.p;
        if (i4 != -1) {
            this.C = i4;
            z = savedState5.x;
        } else {
            z = this.A;
        }
        bVar.c = z;
        if (savedState5.t > 1) {
            LazySpanLookup lazySpanLookup = this.E;
            lazySpanLookup.a = savedState5.u;
            lazySpanLookup.b = savedState5.v;
        }
    }

    public void N2(RecyclerView.z zVar, b bVar) {
        if (M2(zVar, bVar) || L2(zVar, bVar)) {
            return;
        }
        bVar.a();
        bVar.a = 0;
    }

    public boolean O1() {
        int l = this.t[0].l(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].l(Integer.MIN_VALUE) != l) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O2(int r5, androidx.recyclerview.widget.RecyclerView.z r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.y
            r1 = 0
            r0.b = r1
            r0.c = r5
            boolean r0 = r4.x0()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.c()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.i r5 = r4.u
            int r5 = r5.n()
            goto L2f
        L25:
            androidx.recyclerview.widget.i r5 = r4.u
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.M()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.f r0 = r4.y
            androidx.recyclerview.widget.i r3 = r4.u
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f = r3
            androidx.recyclerview.widget.f r6 = r4.y
            androidx.recyclerview.widget.i r0 = r4.u
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.f r0 = r4.y
            androidx.recyclerview.widget.i r3 = r4.u
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.g = r3
            androidx.recyclerview.widget.f r5 = r4.y
            int r6 = -r6
            r5.f = r6
        L5d:
            androidx.recyclerview.widget.f r5 = r4.y
            r5.h = r1
            r5.a = r2
            androidx.recyclerview.widget.i r6 = r4.u
            int r6 = r6.k()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.i r6 = r4.u
            int r6 = r6.h()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.O2(int, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView.v vVar, RecyclerView.z zVar, View view, y yVar) {
        int i;
        int i2;
        int e;
        int i3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.O0(view, yVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.w == 0) {
            i = cVar.e();
            i2 = cVar.f ? this.s : 1;
            e = -1;
            i3 = -1;
        } else {
            i = -1;
            i2 = -1;
            e = cVar.e();
            i3 = cVar.f ? this.s : 1;
        }
        yVar.e0(y.c.a(i, i2, e, i3, false, false));
    }

    public boolean P1() {
        int p = this.t[0].p(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].p(Integer.MIN_VALUE) != p) {
                return false;
            }
        }
        return true;
    }

    public void P2(int i) {
        this.x = i / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(i, this.v.k());
    }

    public final void Q1(View view, c cVar, f fVar) {
        if (fVar.e == 1) {
            if (cVar.f) {
                M1(view);
            } else {
                cVar.e.a(view);
            }
        } else if (cVar.f) {
            z2(view);
        } else {
            cVar.e.u(view);
        }
    }

    public final void Q2(d dVar, int i, int i2) {
        int j = dVar.j();
        if (i == -1) {
            if (dVar.o() + j > i2) {
                return;
            }
        } else if (dVar.k() - j < i2) {
            return;
        }
        this.B.set(dVar.e, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(RecyclerView recyclerView, int i, int i2) {
        q2(i, i2, 1);
    }

    public final int R1(int i) {
        if (J() == 0) {
            return this.A ? 1 : -1;
        }
        return (i < j2()) != this.A ? -1 : 1;
    }

    public final int R2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void S0(RecyclerView recyclerView) {
        this.E.b();
        t1();
    }

    public boolean S1() {
        int j2;
        int k2;
        if (J() == 0 || this.F == 0 || !r0()) {
            return false;
        }
        if (this.A) {
            j2 = k2();
            k2 = j2();
        } else {
            j2 = j2();
            k2 = k2();
        }
        if (j2 == 0 && r2() != null) {
            this.E.b();
        } else if (!this.M) {
            return false;
        } else {
            int i = this.A ? -1 : 1;
            int i2 = k2 + 1;
            LazySpanLookup.FullSpanItem e = this.E.e(j2, i2, i, true);
            if (e == null) {
                this.M = false;
                this.E.d(i2);
                return false;
            }
            LazySpanLookup.FullSpanItem e2 = this.E.e(j2, e.p, i * (-1), true);
            if (e2 == null) {
                this.E.d(e.p);
            } else {
                this.E.d(e2.p + 1);
            }
        }
        u1();
        t1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(RecyclerView recyclerView, int i, int i2, int i3) {
        q2(i, i2, 8);
    }

    public final boolean T1(d dVar) {
        if (this.A) {
            if (dVar.k() < this.u.i()) {
                ArrayList<View> arrayList = dVar.a;
                return !dVar.n(arrayList.get(arrayList.size() - 1)).f;
            }
        } else if (dVar.o() > this.u.m()) {
            return !dVar.n(dVar.a.get(0)).f;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(RecyclerView recyclerView, int i, int i2) {
        q2(i, i2, 2);
    }

    public final int U1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        return l.a(zVar, this.u, e2(!this.N), d2(!this.N), this, this.N);
    }

    public final int V1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        return l.b(zVar, this.u, e2(!this.N), d2(!this.N), this, this.N, this.A);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        q2(i, i2, 4);
    }

    public final int W1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        return l.c(zVar, this.u, e2(!this.N), d2(!this.N), this, this.N);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView.v vVar, RecyclerView.z zVar) {
        w2(vVar, zVar, true);
    }

    public final int X1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.w == 1) ? 1 : Integer.MIN_VALUE : this.w == 0 ? 1 : Integer.MIN_VALUE : this.w == 1 ? -1 : Integer.MIN_VALUE : this.w == 0 ? -1 : Integer.MIN_VALUE : (this.w != 1 && t2()) ? -1 : 1 : (this.w != 1 && t2()) ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.z zVar) {
        super.Y0(zVar);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    public final LazySpanLookup.FullSpanItem Y1(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.r = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            fullSpanItem.r[i2] = i - this.t[i2].l(i);
        }
        return fullSpanItem;
    }

    public final LazySpanLookup.FullSpanItem Z1(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.r = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            fullSpanItem.r[i2] = this.t[i2].p(i) - i;
        }
        return fullSpanItem;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF a(int i) {
        int R1 = R1(i);
        PointF pointF = new PointF();
        if (R1 == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = R1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = R1;
        }
        return pointF;
    }

    public final void a2() {
        this.u = i.b(this, this.w);
        this.v = i.b(this, 1 - this.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final int b2(RecyclerView.v vVar, f fVar, RecyclerView.z zVar) {
        int i;
        d dVar;
        int e;
        int i2;
        int i3;
        int e2;
        RecyclerView.o oVar;
        View view;
        int i4;
        int i5;
        ?? r9 = 0;
        this.B.set(0, this.s, true);
        if (this.y.i) {
            i = fVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = fVar.e == 1 ? fVar.g + fVar.b : fVar.f - fVar.b;
        }
        K2(fVar.e, i);
        int i6 = this.A ? this.u.i() : this.u.m();
        boolean z = false;
        while (fVar.a(zVar) && (this.y.i || !this.B.isEmpty())) {
            View b2 = fVar.b(vVar);
            c cVar = (c) b2.getLayoutParams();
            int a2 = cVar.a();
            int g = this.E.g(a2);
            boolean z2 = g == -1;
            if (z2) {
                dVar = cVar.f ? this.t[r9] : p2(fVar);
                this.E.n(a2, dVar);
            } else {
                dVar = this.t[g];
            }
            d dVar2 = dVar;
            cVar.e = dVar2;
            if (fVar.e == 1) {
                d(b2);
            } else {
                e(b2, r9);
            }
            v2(b2, cVar, r9);
            if (fVar.e == 1) {
                int l2 = cVar.f ? l2(i6) : dVar2.l(i6);
                int e3 = this.u.e(b2) + l2;
                if (z2 && cVar.f) {
                    LazySpanLookup.FullSpanItem Y1 = Y1(l2);
                    Y1.q = -1;
                    Y1.p = a2;
                    this.E.a(Y1);
                }
                i2 = e3;
                e = l2;
            } else {
                int o2 = cVar.f ? o2(i6) : dVar2.p(i6);
                e = o2 - this.u.e(b2);
                if (z2 && cVar.f) {
                    LazySpanLookup.FullSpanItem Z1 = Z1(o2);
                    Z1.q = 1;
                    Z1.p = a2;
                    this.E.a(Z1);
                }
                i2 = o2;
            }
            if (cVar.f && fVar.d == -1) {
                if (!z2) {
                    if (!(fVar.e == 1 ? O1() : P1())) {
                        LazySpanLookup.FullSpanItem f = this.E.f(a2);
                        if (f != null) {
                            f.s = true;
                        }
                    }
                }
                this.M = true;
            }
            Q1(b2, cVar, fVar);
            if (t2() && this.w == 1) {
                int i7 = cVar.f ? this.v.i() : this.v.i() - (((this.s - 1) - dVar2.e) * this.x);
                e2 = i7;
                i3 = i7 - this.v.e(b2);
            } else {
                int m = cVar.f ? this.v.m() : (dVar2.e * this.x) + this.v.m();
                i3 = m;
                e2 = this.v.e(b2) + m;
            }
            if (this.w == 1) {
                oVar = this;
                view = b2;
                i4 = i3;
                i3 = e;
                i5 = e2;
            } else {
                oVar = this;
                view = b2;
                i4 = e;
                i5 = i2;
                i2 = e2;
            }
            oVar.z0(view, i4, i3, i5, i2);
            if (cVar.f) {
                K2(this.y.e, i);
            } else {
                Q2(dVar2, this.y.e, i);
            }
            A2(vVar, this.y);
            if (this.y.h && b2.hasFocusable()) {
                if (cVar.f) {
                    this.B.clear();
                } else {
                    this.B.set(dVar2.e, false);
                    z = true;
                    r9 = 0;
                }
            }
            z = true;
            r9 = 0;
        }
        if (!z) {
            A2(vVar, this.y);
        }
        int m2 = this.y.e == -1 ? this.u.m() - o2(this.u.m()) : l2(this.u.i()) - this.u.i();
        if (m2 > 0) {
            return Math.min(fVar.b, m2);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.I = (SavedState) parcelable;
            t1();
        }
    }

    public final int c2(int i) {
        int J = J();
        for (int i2 = 0; i2 < J; i2++) {
            int h0 = h0(I(i2));
            if (h0 >= 0 && h0 < i) {
                return h0;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable d1() {
        int p;
        int m;
        int[] iArr;
        if (this.I != null) {
            return new SavedState(this.I);
        }
        SavedState savedState = new SavedState();
        savedState.w = this.z;
        savedState.x = this.G;
        savedState.y = this.H;
        LazySpanLookup lazySpanLookup = this.E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.a) == null) {
            savedState.t = 0;
        } else {
            savedState.u = iArr;
            savedState.t = iArr.length;
            savedState.v = lazySpanLookup.b;
        }
        if (J() > 0) {
            savedState.p = this.G ? k2() : j2();
            savedState.q = f2();
            int i = this.s;
            savedState.r = i;
            savedState.s = new int[i];
            for (int i2 = 0; i2 < this.s; i2++) {
                if (this.G) {
                    p = this.t[i2].l(Integer.MIN_VALUE);
                    if (p != Integer.MIN_VALUE) {
                        m = this.u.i();
                        p -= m;
                        savedState.s[i2] = p;
                    } else {
                        savedState.s[i2] = p;
                    }
                } else {
                    p = this.t[i2].p(Integer.MIN_VALUE);
                    if (p != Integer.MIN_VALUE) {
                        m = this.u.m();
                        p -= m;
                        savedState.s[i2] = p;
                    } else {
                        savedState.s[i2] = p;
                    }
                }
            }
        } else {
            savedState.p = -1;
            savedState.q = -1;
            savedState.r = 0;
        }
        return savedState;
    }

    public View d2(boolean z) {
        int m = this.u.m();
        int i = this.u.i();
        View view = null;
        for (int J = J() - 1; J >= 0; J--) {
            View I = I(J);
            int g = this.u.g(I);
            int d2 = this.u.d(I);
            if (d2 > m && g < i) {
                if (d2 <= i || !z) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e1(int i) {
        if (i == 0) {
            S1();
        }
    }

    public View e2(boolean z) {
        int m = this.u.m();
        int i = this.u.i();
        int J = J();
        View view = null;
        for (int i2 = 0; i2 < J; i2++) {
            View I = I(i2);
            int g = this.u.g(I);
            if (this.u.d(I) > m && g < i) {
                if (g >= m || !z) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    public int f2() {
        View d2 = this.A ? d2(true) : e2(true);
        if (d2 == null) {
            return -1;
        }
        return h0(d2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(String str) {
        if (this.I == null) {
            super.g(str);
        }
    }

    public final int g2(int i) {
        for (int J = J() - 1; J >= 0; J--) {
            int h0 = h0(I(J));
            if (h0 >= 0 && h0 < i) {
                return h0;
            }
        }
        return 0;
    }

    public final void h2(RecyclerView.v vVar, RecyclerView.z zVar, boolean z) {
        int i;
        int l2 = l2(Integer.MIN_VALUE);
        if (l2 != Integer.MIN_VALUE && (i = this.u.i() - l2) > 0) {
            int i2 = i - (-F2(-i, vVar, zVar));
            if (!z || i2 <= 0) {
                return;
            }
            this.u.r(i2);
        }
    }

    public final void i2(RecyclerView.v vVar, RecyclerView.z zVar, boolean z) {
        int m;
        int o2 = o2(Integer.MAX_VALUE);
        if (o2 != Integer.MAX_VALUE && (m = o2 - this.u.m()) > 0) {
            int F2 = m - F2(m, vVar, zVar);
            if (!z || F2 <= 0) {
                return;
            }
            this.u.r(-F2);
        }
    }

    public int j2() {
        if (J() == 0) {
            return 0;
        }
        return h0(I(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean k() {
        return this.w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int k0(RecyclerView.v vVar, RecyclerView.z zVar) {
        return this.w == 0 ? this.s : super.k0(vVar, zVar);
    }

    public int k2() {
        int J = J();
        if (J == 0) {
            return 0;
        }
        return h0(I(J - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l() {
        return this.w == 1;
    }

    public final int l2(int i) {
        int l = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int l2 = this.t[i2].l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean m(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    public final int m2(int i) {
        int p = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int p2 = this.t[i2].p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    public final int n2(int i) {
        int l = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int l2 = this.t[i2].l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o(int i, int i2, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        int l;
        int i3;
        if (this.w != 0) {
            i = i2;
        }
        if (J() == 0 || i == 0) {
            return;
        }
        y2(i, zVar);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.s) {
            this.O = new int[this.s];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.s; i5++) {
            f fVar = this.y;
            if (fVar.d == -1) {
                l = fVar.f;
                i3 = this.t[i5].p(l);
            } else {
                l = this.t[i5].l(fVar.g);
                i3 = this.y.g;
            }
            int i6 = l - i3;
            if (i6 >= 0) {
                this.O[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.O, 0, i4);
        for (int i7 = 0; i7 < i4 && this.y.a(zVar); i7++) {
            cVar.a(this.y.c, this.O[i7]);
            f fVar2 = this.y;
            fVar2.c += fVar2.d;
        }
    }

    public final int o2(int i) {
        int p = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int p2 = this.t[i2].p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    public final d p2(f fVar) {
        int i;
        int i2;
        int i3 = -1;
        if (x2(fVar.e)) {
            i = this.s - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.s;
            i2 = 1;
        }
        d dVar = null;
        if (fVar.e == 1) {
            int i4 = Integer.MAX_VALUE;
            int m = this.u.m();
            while (i != i3) {
                d dVar2 = this.t[i];
                int l = dVar2.l(m);
                if (l < i4) {
                    dVar = dVar2;
                    i4 = l;
                }
                i += i2;
            }
            return dVar;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = this.u.i();
        while (i != i3) {
            d dVar3 = this.t[i];
            int p = dVar3.p(i6);
            if (p > i5) {
                dVar = dVar3;
                i5 = p;
            }
            i += i2;
        }
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q(RecyclerView.z zVar) {
        return U1(zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.k2()
            goto Ld
        L9:
            int r0 = r6.j2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.E
            r7.j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.A
            if (r7 == 0) goto L4d
            int r7 = r6.j2()
            goto L51
        L4d:
            int r7 = r6.k2()
        L51:
            if (r3 > r7) goto L56
            r6.t1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.q2(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.z zVar) {
        return V1(zVar);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View r2() {
        /*
            r12 = this;
            int r0 = r12.J()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.s
            r2.<init>(r3)
            int r3 = r12.s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.w
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.t2()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.A
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.I(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            int r9 = r9.e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            boolean r9 = r12.T1(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            int r9 = r9.e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.I(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.i r10 = r12.u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.i r11 = r12.u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.i r10 = r12.u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.i r11 = r12.u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.e
            int r8 = r8.e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.e
            int r9 = r9.e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.z zVar) {
        return W1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean s0() {
        return this.F != 0;
    }

    public void s2() {
        this.E.b();
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.z zVar) {
        return U1(zVar);
    }

    public boolean t2() {
        return Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.z zVar) {
        return V1(zVar);
    }

    public final void u2(View view, int i, int i2, boolean z) {
        j(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int R2 = R2(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int R22 = R2(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z ? H1(view, R2, R22, cVar) : F1(view, R2, R22, cVar)) {
            view.measure(R2, R22);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        return W1(zVar);
    }

    public final void v2(View view, c cVar, boolean z) {
        int K;
        int K2;
        if (cVar.f) {
            if (this.w != 1) {
                u2(view, RecyclerView.o.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z);
                return;
            }
            K = this.J;
        } else if (this.w != 1) {
            K = RecyclerView.o.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
            K2 = RecyclerView.o.K(this.x, X(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            u2(view, K, K2, z);
        } else {
            K = RecyclerView.o.K(this.x, p0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false);
        }
        K2 = RecyclerView.o.K(W(), X(), g0() + d0(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
        u2(view, K, K2, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        return F2(i, vVar, zVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x014b, code lost:
        if (S1() != false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w2(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.z r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.w2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void x1(int i) {
        SavedState savedState = this.I;
        if (savedState != null && savedState.p != i) {
            savedState.a();
        }
        this.C = i;
        this.D = Integer.MIN_VALUE;
        t1();
    }

    public final boolean x2(int i) {
        if (this.w == 0) {
            return (i == -1) != this.A;
        }
        return ((i == -1) == this.A) == t2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        return F2(i, vVar, zVar);
    }

    public void y2(int i, RecyclerView.z zVar) {
        int j2;
        int i2;
        if (i > 0) {
            j2 = k2();
            i2 = 1;
        } else {
            j2 = j2();
            i2 = -1;
        }
        this.y.a = true;
        O2(j2, zVar);
        G2(i2);
        f fVar = this.y;
        fVar.c = j2 + fVar.d;
        fVar.b = Math.abs(i);
    }

    public final void z2(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].u(view);
        }
    }
}
