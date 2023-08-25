package com.daaw;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.wn;
import java.util.List;
/* loaded from: classes.dex */
public class xn extends RecyclerView.g<RecyclerView.c0> {
    public final Context c;
    public int e;
    public wn f;
    public wn.d i;
    public final w40<Boolean> j;
    public boolean d = true;
    public SparseArray<d> g = new SparseArray<>();
    public int h = -1;

    /* loaded from: classes.dex */
    public class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            xn xnVar = xn.this;
            xnVar.d = xnVar.f.d() > 0;
            xn.this.i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void b(int i, int i2) {
            xn xnVar = xn.this;
            xnVar.d = xnVar.f.d() > 0;
            xn.this.k(i, i2);
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ yn p;

        public b(yn ynVar) {
            this.p = ynVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            xn.this.i.a(this.p.l(), this.p.a);
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ yn p;

        public c(yn ynVar) {
            this.p = ynVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            xn.this.i.a(this.p.l(), this.p.a);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public int a;
        public int b;
        public CharSequence c;

        public d(int i, CharSequence charSequence) {
            this.a = i;
            this.c = charSequence;
        }
    }

    public xn(Context context, int i, int i2, wn wnVar, w40<Boolean> w40Var) {
        this.e = i;
        this.f = wnVar;
        this.c = context;
        this.j = w40Var;
        wnVar.u(new a());
    }

    public void B(int i, lo1<String, String> lo1Var) {
        this.f.D(D(i), lo1Var);
        j(i);
    }

    public boolean C(int i) {
        return this.g.get(i) != null;
    }

    public int D(int i) {
        if (C(i)) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.g.size() && this.g.valueAt(i3).b <= i; i3++) {
            i2--;
        }
        return i + i2;
    }

    public void E(wn.d dVar) {
        this.i = dVar;
    }

    public void F(List<d> list) {
        this.g.clear();
        int i = 0;
        for (d dVar : list) {
            int i2 = dVar.a + i;
            dVar.b = i2;
            this.g.append(i2, dVar);
            i++;
        }
        i();
    }

    public void G(int i) {
        H(i, null);
    }

    public void H(int i, View view) {
        if (C(i)) {
            this.f.G(-1, null);
            x(i, view);
            return;
        }
        x(-1, null);
        this.f.G(i, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int d() {
        return this.f.d() + this.g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long e(int i) {
        return C(i) ? Integer.MAX_VALUE - this.g.indexOfKey(i) : this.f.e(D(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int f(int i) {
        if (C(i)) {
            return 0;
        }
        return this.f.f(D(i)) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void m(RecyclerView.c0 c0Var, int i) {
        if (!C(i)) {
            this.f.m((yn) c0Var, D(i));
            return;
        }
        yn ynVar = (yn) c0Var;
        ynVar.P();
        ynVar.u.setText(this.g.get(i).c);
        ynVar.R("");
        ynVar.x.setVisibility(this.j.a().booleanValue() ? 8 : 0);
        ynVar.a.setOnClickListener(new b(ynVar));
        ynVar.w.setOnClickListener(new c(ynVar));
        ynVar.a.setSelected(ynVar.y == this.h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.c0 o(ViewGroup viewGroup, int i) {
        return i == 0 ? new yn(LayoutInflater.from(this.c).inflate(this.e, viewGroup, false)) : this.f.o(viewGroup, i - 1);
    }

    public final void x(int i, View view) {
        if (view != null) {
            view.setSelected(true);
        } else {
            int i2 = this.h;
            if (i2 >= 0) {
                j(i2);
            }
        }
        this.h = i;
        if (i >= 0) {
            j(i);
        }
    }
}
