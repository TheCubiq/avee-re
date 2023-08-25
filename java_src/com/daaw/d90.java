package com.daaw;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.ts1;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class d90 implements ts1.InterfaceC3115a {

    /* renamed from: a */
    public WeakReference<oc0> f6630a = new WeakReference<>(null);

    /* renamed from: b */
    public ts1.InterfaceC3115a f6631b;

    /* renamed from: c */
    public int f6632c;

    /* renamed from: d */
    public int f6633d;

    /* renamed from: e */
    public wc0 f6634e;

    /* renamed from: f */
    public oc0 f6635f;

    /* renamed from: com.daaw.d90$a */
    /* loaded from: classes.dex */
    public class C1065a implements oc0 {
        public C1065a() {
        }

        @Override // com.daaw.oc0
        /* renamed from: a */
        public void mo8846a() {
            oc0 m24594b = d90.this.m24594b();
            if (m24594b != null) {
                m24594b.mo8846a();
            }
        }
    }

    public d90(ts1.InterfaceC3115a interfaceC3115a, wc0 wc0Var, int i, int i2) {
        this.f6634e = wc0Var;
        this.f6631b = interfaceC3115a;
        this.f6632c = i;
        this.f6633d = i2;
        C1065a c1065a = new C1065a();
        this.f6635f = c1065a;
        interfaceC3115a.mo2243f(c1065a);
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: a */
    public int mo2250a() {
        return this.f6631b.mo2250a() + 2;
    }

    /* renamed from: b */
    public oc0 m24594b() {
        return this.f6630a.get();
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: f */
    public void mo2243f(oc0 oc0Var) {
        this.f6630a = new WeakReference<>(oc0Var);
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    public int getItemViewType(int i) {
        return i == 0 ? this.f6632c : i == this.f6631b.mo2250a() + 1 ? this.f6633d : this.f6631b.getItemViewType(i - 1);
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: j */
    public void mo2237j(int i, int i2, List<Integer> list) {
        this.f6631b.mo2237j(i - 1, i2 - 1, list);
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: k */
    public void mo2235k() {
        this.f6631b.mo2235k();
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: r */
    public RecyclerView.AbstractC0376c0 mo2233r(ViewGroup viewGroup, int i) {
        if (i != this.f6632c && i != this.f6633d) {
            return this.f6631b.mo2233r(viewGroup, i);
        }
        return gt1.m21239a(viewGroup.getContext(), viewGroup, i, this.f6634e);
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: t */
    public int mo2232t(int i) {
        return i + 1;
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: v */
    public void mo2231v(RecyclerView.AbstractC0376c0 abstractC0376c0, int i) {
        if (i <= 0 || i >= this.f6631b.mo2250a() + 1) {
            ((AbstractC1172eb) abstractC0376c0).mo4018O(this.f6634e, i);
        } else {
            this.f6631b.mo2231v(abstractC0376c0, i - 1);
        }
    }
}
