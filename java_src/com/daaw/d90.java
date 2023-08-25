package com.daaw;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.ts1;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class d90 implements ts1.a {
    public WeakReference<oc0> a = new WeakReference<>(null);
    public ts1.a b;
    public int c;
    public int d;
    public wc0 e;
    public oc0 f;

    /* loaded from: classes.dex */
    public class a implements oc0 {
        public a() {
        }

        @Override // com.daaw.oc0
        public void a() {
            oc0 b = d90.this.b();
            if (b != null) {
                b.a();
            }
        }
    }

    public d90(ts1.a aVar, wc0 wc0Var, int i, int i2) {
        this.e = wc0Var;
        this.b = aVar;
        this.c = i;
        this.d = i2;
        a aVar2 = new a();
        this.f = aVar2;
        aVar.f(aVar2);
    }

    @Override // com.daaw.ts1.a
    public int a() {
        return this.b.a() + 2;
    }

    public oc0 b() {
        return this.a.get();
    }

    @Override // com.daaw.ts1.a
    public void f(oc0 oc0Var) {
        this.a = new WeakReference<>(oc0Var);
    }

    @Override // com.daaw.ts1.a
    public int getItemViewType(int i) {
        return i == 0 ? this.c : i == this.b.a() + 1 ? this.d : this.b.getItemViewType(i - 1);
    }

    @Override // com.daaw.ts1.a
    public void j(int i, int i2, List<Integer> list) {
        this.b.j(i - 1, i2 - 1, list);
    }

    @Override // com.daaw.ts1.a
    public void k() {
        this.b.k();
    }

    @Override // com.daaw.ts1.a
    public RecyclerView.c0 r(ViewGroup viewGroup, int i) {
        if (i != this.c && i != this.d) {
            return this.b.r(viewGroup, i);
        }
        return gt1.a(viewGroup.getContext(), viewGroup, i, this.e);
    }

    @Override // com.daaw.ts1.a
    public int t(int i) {
        return i + 1;
    }

    @Override // com.daaw.ts1.a
    public void v(RecyclerView.c0 c0Var, int i) {
        if (i <= 0 || i >= this.b.a() + 1) {
            ((eb) c0Var).O(this.e, i);
        } else {
            this.b.v(c0Var, i - 1);
        }
    }
}
