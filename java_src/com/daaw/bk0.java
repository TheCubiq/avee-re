package com.daaw;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.ts1;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public abstract class bk0<T, V extends List<T>> extends AbstractC3711yj implements ts1.InterfaceC3115a {

    /* renamed from: C */
    public WeakReference<oc0> f4870C;

    /* renamed from: D */
    public V f4871D;

    /* renamed from: E */
    public w40<V> f4872E;

    /* renamed from: F */
    public r40<AbstractC3711yj, V> f4873F;

    public bk0(Context context, r40<AbstractC3711yj, V> r40Var, w40<V> w40Var, String str, me0<String> me0Var, int i, int i2) {
        super(context, str, me0Var, i, i2);
        this.f4870C = new WeakReference<>(null);
        this.f4873F = r40Var;
        this.f4872E = w40Var;
        this.f4871D = r40Var.mo5050a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.AbstractC3711yj
    /* renamed from: A */
    public boolean mo2264A() {
        if (m3684B((String) mo15605Q(true).f17577b, false)) {
            return true;
        }
        lo1 mo15605Q = mo15605Q(false);
        List list = (List) mo15605Q.f17576a;
        if (list == null) {
            m26094T(this.f4872E.mo3478a(), null);
        } else {
            m26094T(list, (String) mo15605Q.f17577b);
        }
        return true;
    }

    /* renamed from: P */
    public oc0 m26097P() {
        return this.f4870C.get();
    }

    /* renamed from: Q */
    public lo1<V, String> mo15605Q(boolean z) {
        V v;
        V mo5050a;
        if (z || (mo5050a = this.f4873F.mo5050a(this)) == null) {
            v = null;
        } else {
            v = this.f4872E.mo3478a();
            v.addAll(mo5050a);
        }
        return new lo1<>(v, "");
    }

    /* renamed from: R */
    public Object m26096R(int i) {
        return this.f4871D.get(i);
    }

    /* renamed from: S */
    public V m26095S() {
        return this.f4871D;
    }

    /* renamed from: T */
    public void m26094T(V v, String str) {
        if (m3684B(str, true)) {
            return;
        }
        C2691q6.m12752f(v);
        this.f4871D = v;
        oc0 m26097P = m26097P();
        if (m26097P != null) {
            m26097P.mo8846a();
        }
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0, com.daaw.ts1.InterfaceC3115a
    /* renamed from: a */
    public int mo2250a() {
        return this.f4871D.size();
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: f */
    public void mo2243f(oc0 oc0Var) {
        this.f4870C = new WeakReference<>(oc0Var);
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: j */
    public void mo2237j(int i, int i2, List<Integer> list) {
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: k */
    public void mo2235k() {
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: r */
    public RecyclerView.AbstractC0376c0 mo2233r(ViewGroup viewGroup, int i) {
        return gt1.m21239a(viewGroup.getContext(), viewGroup, i, this);
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: t */
    public int mo2232t(int i) {
        return i;
    }
}
