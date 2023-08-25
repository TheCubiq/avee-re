package com.daaw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.wn */
/* loaded from: classes.dex */
public class C3450wn extends RecyclerView.AbstractC0380g<C3723yn> {

    /* renamed from: c */
    public final Context f31371c;

    /* renamed from: d */
    public List<lo1<String, String>> f31372d;

    /* renamed from: e */
    public InterfaceC3453c f31373e;

    /* renamed from: f */
    public InterfaceC3454d f31374f;

    /* renamed from: g */
    public ViewGroup f31375g;

    /* renamed from: h */
    public int f31376h = -1;

    /* renamed from: i */
    public boolean f31377i = false;

    /* renamed from: com.daaw.wn$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3451a implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ C3723yn f31378p;

        public View$OnClickListenerC3451a(C3723yn c3723yn) {
            this.f31378p = c3723yn;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C3450wn.this.f31374f.mo5946a(this.f31378p.m28734l(), this.f31378p.f1947a);
        }
    }

    /* renamed from: com.daaw.wn$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3452b implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ C3723yn f31380p;

        public View$OnClickListenerC3452b(C3723yn c3723yn) {
            this.f31380p = c3723yn;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C3450wn.this.f31374f.mo5946a(this.f31380p.m28734l(), this.f31380p.f1947a);
        }
    }

    /* renamed from: com.daaw.wn$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3453c {
        /* renamed from: a */
        void mo5947a(View view);
    }

    /* renamed from: com.daaw.wn$d */
    /* loaded from: classes.dex */
    public interface InterfaceC3454d {
        /* renamed from: a */
        boolean mo5946a(int i, View view);
    }

    public C3450wn(Context context, List<lo1<String, String>> list, ViewGroup viewGroup) {
        this.f31371c = context;
        if (list != null) {
            this.f31372d = list;
        } else {
            this.f31372d = new ArrayList();
        }
        this.f31375g = viewGroup;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: A */
    public C3723yn mo495o(ViewGroup viewGroup, int i) {
        return new C3723yn(LayoutInflater.from(this.f31371c).inflate(R.layout.custom_simple_item, viewGroup, false), this.f31373e, this.f31375g);
    }

    /* renamed from: B */
    public void m5956B(List<lo1<String, String>> list) {
        this.f31372d = list;
        m28714i();
    }

    /* renamed from: C */
    public void m5955C(boolean z) {
        if (this.f31377i == z) {
            return;
        }
        this.f31377i = z;
        m28714i();
    }

    /* renamed from: D */
    public void m5954D(int i, lo1<String, String> lo1Var) {
        if (i < 0 || i >= this.f31372d.size()) {
            return;
        }
        this.f31372d.set(i, lo1Var);
    }

    /* renamed from: E */
    public void m5953E(InterfaceC3453c interfaceC3453c) {
        this.f31373e = interfaceC3453c;
    }

    /* renamed from: F */
    public void m5952F(InterfaceC3454d interfaceC3454d) {
        this.f31374f = interfaceC3454d;
    }

    /* renamed from: G */
    public void m5951G(int i, View view) {
        if (view != null) {
            view.setSelected(true);
        } else {
            int i2 = this.f31376h;
            if (i2 >= 0) {
                m28713j(i2);
            }
        }
        this.f31376h = i;
        if (i >= 0) {
            m28713j(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: d */
    public int mo497d() {
        return this.f31372d.size();
    }

    /* renamed from: y */
    public boolean m5949y() {
        return this.f31377i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: z */
    public void mo496m(C3723yn c3723yn, int i) {
        c3723yn.m3493P();
        lo1<String, String> lo1Var = this.f31372d.get(i);
        c3723yn.f33869u.setText(lo1Var.f17576a);
        c3723yn.m3491R(lo1Var.f17577b);
        c3723yn.f33872x.setVisibility(this.f31377i ? 8 : 0);
        c3723yn.f1947a.setOnClickListener(new View$OnClickListenerC3451a(c3723yn));
        c3723yn.f33871w.setOnClickListener(new View$OnClickListenerC3452b(c3723yn));
        c3723yn.f1947a.setSelected(c3723yn.f33873y == this.f31376h);
    }
}
