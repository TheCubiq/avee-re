package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.lu;
import com.daaw.tx0;
import com.daaw.wc0;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class n30 extends dj0 {
    public qk p0;
    public RecyclerView q0;
    public ArrayDeque<vd0> r0 = new ArrayDeque<>();

    /* loaded from: classes.dex */
    public class a implements r40<yj, er0<tx0, vd0>> {
        public a() {
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public er0<tx0, vd0> a(yj yjVar) {
            return dj0.v.a(new er0<>());
        }
    }

    /* loaded from: classes.dex */
    public class b implements lu.c {
        public b() {
        }

        @Override // com.daaw.lu.c
        public void a(int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(0);
            ((ts1) n30.this.q0.getAdapter()).A(i, i2, arrayList);
        }
    }

    /* loaded from: classes.dex */
    public class c implements wc0.c {
        public final /* synthetic */ lu a;

        public c(lu luVar) {
            this.a = luVar;
        }

        @Override // com.daaw.wc0.c
        public void a(View view) {
            this.a.j(view);
        }
    }

    public static n30 o() {
        n30 n30Var = new n30();
        n30Var.setArguments(new Bundle());
        return n30Var;
    }

    public m91 m() {
        RecyclerView recyclerView;
        ts1 ts1Var;
        Activity activity = getActivity();
        if (activity != null && (recyclerView = this.q0) != null && (ts1Var = (ts1) recyclerView.getAdapter()) != null) {
            return dj0.h(activity, ts1Var);
        }
        return m91.d;
    }

    public boolean n() {
        return this.q0 != null;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_1, viewGroup, false);
        gr1.u(inflate.findViewById(R.id.viewStatusBarBg));
        dj0.t.a(1, inflate.findViewById(R.id.viewActionBarBgSkin));
        this.q0 = (RecyclerView) inflate.findViewById(R.id.recyclerViewItems);
        this.q0.setLayoutManager(new LinearLayoutManager(getActivity()));
        qk qkVar = new qk(getActivity(), new a(), "nowplaying", "Playlist", true, 1);
        this.p0 = qkVar;
        qkVar.q(new WeakReference<>(this));
        this.q0.setAdapter(this.p0.G(getActivity(), 1));
        RecyclerView recyclerView = this.q0;
        recyclerView.h(new ke1(1, gr1.n(recyclerView, R.attr.containerBackgroundDark)));
        lu luVar = new lu();
        luVar.x(R.id.btnItemMore);
        luVar.t(0.4f);
        luVar.u(getActivity().getResources().getColor(R.color.black_alpha_2));
        luVar.r(0.3f);
        luVar.s(0.1f);
        luVar.w(new b());
        this.q0.h(luVar);
        this.q0.j(luVar);
        this.q0.k(luVar.q());
        this.p0.M(new c(luVar));
        v(dj0.v.a(new er0<>()));
        u(ww0.e, ww0.b, ww0.d, ww0.c);
        s();
        return inflate;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        p(false);
        super.onDestroy();
    }

    public void p(boolean z) {
    }

    public void q(sd0 sd0Var) {
        ts1 ts1Var = (ts1) this.q0.getAdapter();
        if (ts1Var == null || !ts1Var.z().y(sd0Var)) {
            return;
        }
        ts1Var.i();
    }

    public void r() {
        ts1 ts1Var;
        if (n() && (ts1Var = (ts1) this.q0.getAdapter()) != null) {
            ts1Var.i();
        }
    }

    public void s() {
        q6.f(getActivity());
        m91 m = m();
        dj0.r.a(1, Boolean.valueOf(m.a), m.b, m.c);
    }

    public void t(Context context, String str) {
        if (this.q0 != null) {
            this.p0.o(context, str);
        }
    }

    public void u(int i, tx0 tx0Var, tx0.b bVar, vd0 vd0Var) {
        RecyclerView recyclerView;
        ts1 ts1Var;
        RecyclerView recyclerView2;
        if (getActivity() == null || (recyclerView = this.q0) == null || (ts1Var = (ts1) recyclerView.getAdapter()) == null) {
            return;
        }
        if (this.p0 != null) {
            if (this.r0.size() > 1) {
                this.r0.removeFirst();
            }
            if (vd0Var != null && (this.r0.peekLast() == null || !this.r0.peekLast().equals(vd0Var))) {
                this.r0.add(vd0Var);
            }
            Iterator<vd0> it = this.r0.iterator();
            while (it.hasNext()) {
                int e0 = this.p0.e0(it.next());
                if (e0 >= 0) {
                    RecyclerView.c0 X = this.q0.X(ts1Var.x(e0));
                    if (X instanceof uk) {
                        ((uk) X).R();
                    }
                }
            }
        } else {
            ts1Var.i();
        }
        if (dj0.T.a(Boolean.FALSE).booleanValue()) {
            int integer = getResources().getInteger(R.integer.player_controls_height_in_items);
            if (i >= Math.max(((LinearLayoutManager) this.q0.getLayoutManager()).c2() - (integer + 1), 0)) {
                recyclerView2 = this.q0;
                i += integer;
            } else {
                recyclerView2 = this.q0;
            }
            recyclerView2.j1(ts1Var.x(i));
        }
    }

    public void v(er0<tx0, vd0> er0Var) {
        qk qkVar = this.p0;
        if (qkVar != null) {
            qkVar.h(true);
        }
    }
}
