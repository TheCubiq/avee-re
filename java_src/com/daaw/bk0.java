package com.daaw;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.ts1;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public abstract class bk0<T, V extends List<T>> extends yj implements ts1.a {
    public WeakReference<oc0> C;
    public V D;
    public w40<V> E;
    public r40<yj, V> F;

    public bk0(Context context, r40<yj, V> r40Var, w40<V> w40Var, String str, me0<String> me0Var, int i, int i2) {
        super(context, str, me0Var, i, i2);
        this.C = new WeakReference<>(null);
        this.F = r40Var;
        this.E = w40Var;
        this.D = r40Var.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.yj
    public boolean A() {
        if (B((String) Q(true).b, false)) {
            return true;
        }
        lo1 Q = Q(false);
        List list = (List) Q.a;
        if (list == null) {
            T(this.E.a(), null);
        } else {
            T(list, (String) Q.b);
        }
        return true;
    }

    public oc0 P() {
        return this.C.get();
    }

    public lo1<V, String> Q(boolean z) {
        V v;
        V a;
        if (z || (a = this.F.a(this)) == null) {
            v = null;
        } else {
            v = this.E.a();
            v.addAll(a);
        }
        return new lo1<>(v, "");
    }

    public Object R(int i) {
        return this.D.get(i);
    }

    public V S() {
        return this.D;
    }

    public void T(V v, String str) {
        if (B(str, true)) {
            return;
        }
        q6.f(v);
        this.D = v;
        oc0 P = P();
        if (P != null) {
            P.a();
        }
    }

    @Override // com.daaw.yj, com.daaw.wc0, com.daaw.ts1.a
    public int a() {
        return this.D.size();
    }

    @Override // com.daaw.ts1.a
    public void f(oc0 oc0Var) {
        this.C = new WeakReference<>(oc0Var);
    }

    @Override // com.daaw.ts1.a
    public void j(int i, int i2, List<Integer> list) {
    }

    @Override // com.daaw.ts1.a
    public void k() {
    }

    @Override // com.daaw.ts1.a
    public RecyclerView.c0 r(ViewGroup viewGroup, int i) {
        return gt1.a(viewGroup.getContext(), viewGroup, i, this);
    }

    @Override // com.daaw.ts1.a
    public int t(int i) {
        return i;
    }
}
