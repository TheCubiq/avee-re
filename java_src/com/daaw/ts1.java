package com.daaw;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* loaded from: classes.dex */
public class ts1 extends RecyclerView.AbstractC0380g implements oc0 {

    /* renamed from: c */
    public InterfaceC3115a f28015c;

    /* renamed from: d */
    public wc0 f28016d;

    /* renamed from: com.daaw.ts1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3115a {
        /* renamed from: a */
        int mo2250a();

        /* renamed from: f */
        void mo2243f(oc0 oc0Var);

        int getItemViewType(int i);

        /* renamed from: j */
        void mo2237j(int i, int i2, List<Integer> list);

        /* renamed from: k */
        void mo2235k();

        /* renamed from: r */
        RecyclerView.AbstractC0376c0 mo2233r(ViewGroup viewGroup, int i);

        /* renamed from: t */
        int mo2232t(int i);

        /* renamed from: v */
        void mo2231v(RecyclerView.AbstractC0376c0 abstractC0376c0, int i);
    }

    public ts1(InterfaceC3115a interfaceC3115a, wc0 wc0Var) {
        this.f28016d = wc0Var;
        m28704v(false);
        this.f28015c = interfaceC3115a;
        interfaceC3115a.mo2243f(this);
    }

    /* renamed from: A */
    public void m8847A(int i, int i2, List<Integer> list) {
        this.f28015c.mo2237j(i, i2, list);
    }

    @Override // com.daaw.oc0
    /* renamed from: a */
    public void mo8846a() {
        m28714i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: d */
    public int mo497d() {
        return this.f28015c.mo2250a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: f */
    public int mo4978f(int i) {
        return this.f28015c.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: m */
    public void mo496m(RecyclerView.AbstractC0376c0 abstractC0376c0, int i) {
        this.f28015c.mo2231v(abstractC0376c0, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: o */
    public RecyclerView.AbstractC0376c0 mo495o(ViewGroup viewGroup, int i) {
        return this.f28015c.mo2233r(viewGroup, i);
    }

    /* renamed from: x */
    public int m8845x(int i) {
        return this.f28015c.mo2232t(i);
    }

    /* renamed from: y */
    public void m8844y() {
        this.f28015c.mo2235k();
    }

    /* renamed from: z */
    public wc0 m8843z() {
        return this.f28016d;
    }
}
