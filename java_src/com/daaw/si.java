package com.daaw;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.ts1;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class si implements ts1.a {
    public WeakReference<oc0> a = new WeakReference<>(null);
    public b[] b;
    public ts1.a[] c;
    public wc0[] d;
    public oc0[] e;

    /* loaded from: classes.dex */
    public class a implements oc0 {
        public int a;

        public a(int i) {
            this.a = i;
        }

        @Override // com.daaw.oc0
        public void a() {
            oc0 b = si.this.b();
            if (b != null) {
                b.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public int a() {
            return this.a;
        }
    }

    public si(b[] bVarArr, ts1.a[] aVarArr, wc0[] wc0VarArr) {
        this.d = wc0VarArr;
        this.b = bVarArr;
        this.c = aVarArr;
        this.e = new oc0[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            this.e[i] = new a(i);
            aVarArr[i].f(this.e[i]);
        }
    }

    @Override // com.daaw.ts1.a
    public int a() {
        int i = 0;
        for (int i2 = 0; i2 < this.c.length; i2++) {
            i = this.d[i2].z() ? i + this.c[i2].a() + 1 : i + 1;
        }
        return i;
    }

    public oc0 b() {
        return this.a.get();
    }

    public lo1<Integer, Integer> c(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < this.c.length) {
            i3 = this.d[i2].z() ? i3 + this.c[i2].a() + 1 : i3 + 1;
            if (i < i3) {
                return new lo1<>(Integer.valueOf((i - i4) - 1), Integer.valueOf(i2));
            }
            i2++;
            i4 = i3;
        }
        return new lo1<>(-1, -1);
    }

    @Override // com.daaw.ts1.a
    public void f(oc0 oc0Var) {
        this.a = new WeakReference<>(oc0Var);
    }

    @Override // com.daaw.ts1.a
    public int getItemViewType(int i) {
        lo1<Integer, Integer> c = c(i);
        return c.a.intValue() < 0 ? this.b[c.b.intValue()].a() : this.c[c.b.intValue()].getItemViewType(c.a.intValue());
    }

    @Override // com.daaw.ts1.a
    public void j(int i, int i2, List<Integer> list) {
        lo1<Integer, Integer> c = c(i);
        lo1<Integer, Integer> c2 = c(i2);
        if (c.b.equals(c.a)) {
            this.c[c2.b.intValue()].j(c.a.intValue(), c2.a.intValue(), list);
            return;
        }
        lz1.c("Assert posFrom.obj2 != posFrom.obj1");
        this.c[c2.b.intValue()].j(c.a.intValue(), -1, list);
    }

    @Override // com.daaw.ts1.a
    public void k() {
        for (ts1.a aVar : this.c) {
            aVar.k();
        }
    }

    @Override // com.daaw.ts1.a
    public RecyclerView.c0 r(ViewGroup viewGroup, int i) {
        return gt1.a(viewGroup.getContext(), viewGroup, i, this.d[0]);
    }

    @Override // com.daaw.ts1.a
    public int t(int i) {
        return 0;
    }

    @Override // com.daaw.ts1.a
    public void v(RecyclerView.c0 c0Var, int i) {
        lo1<Integer, Integer> c = c(i);
        if (c.a.intValue() < 0) {
            ((eb) c0Var).O(this.d[c.b.intValue()], c.b.intValue());
        } else {
            this.c[c.b.intValue()].v(c0Var, c.a.intValue());
        }
    }
}
