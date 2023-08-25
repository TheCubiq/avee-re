package com.daaw;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* loaded from: classes.dex */
public class ts1 extends RecyclerView.g implements oc0 {
    public a c;
    public wc0 d;

    /* loaded from: classes.dex */
    public interface a {
        int a();

        void f(oc0 oc0Var);

        int getItemViewType(int i);

        void j(int i, int i2, List<Integer> list);

        void k();

        RecyclerView.c0 r(ViewGroup viewGroup, int i);

        int t(int i);

        void v(RecyclerView.c0 c0Var, int i);
    }

    public ts1(a aVar, wc0 wc0Var) {
        this.d = wc0Var;
        v(false);
        this.c = aVar;
        aVar.f(this);
    }

    public void A(int i, int i2, List<Integer> list) {
        this.c.j(i, i2, list);
    }

    @Override // com.daaw.oc0
    public void a() {
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int d() {
        return this.c.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int f(int i) {
        return this.c.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void m(RecyclerView.c0 c0Var, int i) {
        this.c.v(c0Var, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.c0 o(ViewGroup viewGroup, int i) {
        return this.c.r(viewGroup, i);
    }

    public int x(int i) {
        return this.c.t(i);
    }

    public void y() {
        this.c.k();
    }

    public wc0 z() {
        return this.d;
    }
}
