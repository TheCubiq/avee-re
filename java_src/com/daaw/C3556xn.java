package com.daaw;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C3450wn;
import java.util.List;
/* renamed from: com.daaw.xn */
/* loaded from: classes.dex */
public class C3556xn extends RecyclerView.AbstractC0380g<RecyclerView.AbstractC0376c0> {

    /* renamed from: c */
    public final Context f32806c;

    /* renamed from: e */
    public int f32808e;

    /* renamed from: f */
    public C3450wn f32809f;

    /* renamed from: i */
    public C3450wn.InterfaceC3454d f32812i;

    /* renamed from: j */
    public final w40<Boolean> f32813j;

    /* renamed from: d */
    public boolean f32807d = true;

    /* renamed from: g */
    public SparseArray<C3560d> f32810g = new SparseArray<>();

    /* renamed from: h */
    public int f32811h = -1;

    /* renamed from: com.daaw.xn$a */
    /* loaded from: classes.dex */
    public class C3557a extends RecyclerView.AbstractC0382i {
        public C3557a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0382i
        /* renamed from: a */
        public void mo4974a() {
            C3556xn c3556xn = C3556xn.this;
            c3556xn.f32807d = c3556xn.f32809f.mo497d() > 0;
            C3556xn.this.m28714i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0382i
        /* renamed from: b */
        public void mo4973b(int i, int i2) {
            C3556xn c3556xn = C3556xn.this;
            c3556xn.f32807d = c3556xn.f32809f.mo497d() > 0;
            C3556xn.this.m28712k(i, i2);
        }
    }

    /* renamed from: com.daaw.xn$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3558b implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ C3723yn f32815p;

        public View$OnClickListenerC3558b(C3723yn c3723yn) {
            this.f32815p = c3723yn;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C3556xn.this.f32812i.mo5946a(this.f32815p.m28734l(), this.f32815p.f1947a);
        }
    }

    /* renamed from: com.daaw.xn$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3559c implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ C3723yn f32817p;

        public View$OnClickListenerC3559c(C3723yn c3723yn) {
            this.f32817p = c3723yn;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C3556xn.this.f32812i.mo5946a(this.f32817p.m28734l(), this.f32817p.f1947a);
        }
    }

    /* renamed from: com.daaw.xn$d */
    /* loaded from: classes.dex */
    public static class C3560d {

        /* renamed from: a */
        public int f32819a;

        /* renamed from: b */
        public int f32820b;

        /* renamed from: c */
        public CharSequence f32821c;

        public C3560d(int i, CharSequence charSequence) {
            this.f32819a = i;
            this.f32821c = charSequence;
        }
    }

    public C3556xn(Context context, int i, int i2, C3450wn c3450wn, w40<Boolean> w40Var) {
        this.f32808e = i;
        this.f32809f = c3450wn;
        this.f32806c = context;
        this.f32813j = w40Var;
        c3450wn.m28705u(new C3557a());
    }

    /* renamed from: B */
    public void m4985B(int i, lo1<String, String> lo1Var) {
        this.f32809f.m5954D(m4983D(i), lo1Var);
        m28713j(i);
    }

    /* renamed from: C */
    public boolean m4984C(int i) {
        return this.f32810g.get(i) != null;
    }

    /* renamed from: D */
    public int m4983D(int i) {
        if (m4984C(i)) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f32810g.size() && this.f32810g.valueAt(i3).f32820b <= i; i3++) {
            i2--;
        }
        return i + i2;
    }

    /* renamed from: E */
    public void m4982E(C3450wn.InterfaceC3454d interfaceC3454d) {
        this.f32812i = interfaceC3454d;
    }

    /* renamed from: F */
    public void m4981F(List<C3560d> list) {
        this.f32810g.clear();
        int i = 0;
        for (C3560d c3560d : list) {
            int i2 = c3560d.f32819a + i;
            c3560d.f32820b = i2;
            this.f32810g.append(i2, c3560d);
            i++;
        }
        m28714i();
    }

    /* renamed from: G */
    public void m4980G(int i) {
        m4979H(i, null);
    }

    /* renamed from: H */
    public void m4979H(int i, View view) {
        if (m4984C(i)) {
            this.f32809f.m5951G(-1, null);
            m4977x(i, view);
            return;
        }
        m4977x(-1, null);
        this.f32809f.m5951G(i, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: d */
    public int mo497d() {
        return this.f32809f.mo497d() + this.f32810g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: e */
    public long mo504e(int i) {
        return m4984C(i) ? Integer.MAX_VALUE - this.f32810g.indexOfKey(i) : this.f32809f.mo504e(m4983D(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: f */
    public int mo4978f(int i) {
        if (m4984C(i)) {
            return 0;
        }
        return this.f32809f.mo4978f(m4983D(i)) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: m */
    public void mo496m(RecyclerView.AbstractC0376c0 abstractC0376c0, int i) {
        if (!m4984C(i)) {
            this.f32809f.mo496m((C3723yn) abstractC0376c0, m4983D(i));
            return;
        }
        C3723yn c3723yn = (C3723yn) abstractC0376c0;
        c3723yn.m3493P();
        c3723yn.f33869u.setText(this.f32810g.get(i).f32821c);
        c3723yn.m3491R("");
        c3723yn.f33872x.setVisibility(this.f32813j.mo3478a().booleanValue() ? 8 : 0);
        c3723yn.f1947a.setOnClickListener(new View$OnClickListenerC3558b(c3723yn));
        c3723yn.f33871w.setOnClickListener(new View$OnClickListenerC3559c(c3723yn));
        c3723yn.f1947a.setSelected(c3723yn.f33873y == this.f32811h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: o */
    public RecyclerView.AbstractC0376c0 mo495o(ViewGroup viewGroup, int i) {
        return i == 0 ? new C3723yn(LayoutInflater.from(this.f32806c).inflate(this.f32808e, viewGroup, false)) : this.f32809f.mo495o(viewGroup, i - 1);
    }

    /* renamed from: x */
    public final void m4977x(int i, View view) {
        if (view != null) {
            view.setSelected(true);
        } else {
            int i2 = this.f32811h;
            if (i2 >= 0) {
                m28713j(i2);
            }
        }
        this.f32811h = i;
        if (i >= 0) {
            m28713j(i);
        }
    }
}
