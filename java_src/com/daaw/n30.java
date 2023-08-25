package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C2116lu;
import com.daaw.avee.R;
import com.daaw.tx0;
import com.daaw.wc0;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class n30 extends dj0 {

    /* renamed from: p0 */
    public C2719qk f19435p0;

    /* renamed from: q0 */
    public RecyclerView f19436q0;

    /* renamed from: r0 */
    public ArrayDeque<vd0> f19437r0 = new ArrayDeque<>();

    /* renamed from: com.daaw.n30$a */
    /* loaded from: classes.dex */
    public class C2238a implements r40<AbstractC3711yj, er0<tx0, vd0>> {
        public C2238a() {
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public er0<tx0, vd0> mo5050a(AbstractC3711yj abstractC3711yj) {
            return dj0.f7184v.m6692a(new er0<>());
        }
    }

    /* renamed from: com.daaw.n30$b */
    /* loaded from: classes.dex */
    public class C2239b implements C2116lu.InterfaceC2119c {
        public C2239b() {
        }

        @Override // com.daaw.C2116lu.InterfaceC2119c
        /* renamed from: a */
        public void mo15549a(int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(0);
            ((ts1) n30.this.f19436q0.getAdapter()).m8847A(i, i2, arrayList);
        }
    }

    /* renamed from: com.daaw.n30$c */
    /* loaded from: classes.dex */
    public class C2240c implements wc0.InterfaceC3422c {

        /* renamed from: a */
        public final /* synthetic */ C2116lu f19440a;

        public C2240c(C2116lu c2116lu) {
            this.f19440a = c2116lu;
        }

        @Override // com.daaw.wc0.InterfaceC3422c
        /* renamed from: a */
        public void mo6181a(View view) {
            this.f19440a.m16519j(view);
        }
    }

    /* renamed from: o */
    public static n30 m15558o() {
        n30 n30Var = new n30();
        n30Var.setArguments(new Bundle());
        return n30Var;
    }

    /* renamed from: m */
    public m91 m15560m() {
        RecyclerView recyclerView;
        ts1 ts1Var;
        Activity activity = getActivity();
        if (activity != null && (recyclerView = this.f19436q0) != null && (ts1Var = (ts1) recyclerView.getAdapter()) != null) {
            return dj0.m24360h(activity, ts1Var);
        }
        return m91.f18679d;
    }

    /* renamed from: n */
    public boolean m15559n() {
        return this.f19436q0 != null;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_1, viewGroup, false);
        gr1.m21314u(inflate.findViewById(R.id.viewStatusBarBg));
        dj0.f7182t.m10862a(1, inflate.findViewById(R.id.viewActionBarBgSkin));
        this.f19436q0 = (RecyclerView) inflate.findViewById(R.id.recyclerViewItems);
        this.f19436q0.setLayoutManager(new LinearLayoutManager(getActivity()));
        C2719qk c2719qk = new C2719qk(getActivity(), new C2238a(), "nowplaying", "Playlist", true, 1);
        this.f19435p0 = c2719qk;
        c2719qk.mo3663q(new WeakReference<>(this));
        this.f19436q0.setAdapter(this.f19435p0.m3680G(getActivity(), 1));
        RecyclerView recyclerView = this.f19436q0;
        recyclerView.m28824h(new ke1(1, gr1.m21321n(recyclerView, R.attr.containerBackgroundDark)));
        C2116lu c2116lu = new C2116lu();
        c2116lu.m16505x(R.id.btnItemMore);
        c2116lu.m16509t(0.4f);
        c2116lu.m16508u(getActivity().getResources().getColor(R.color.black_alpha_2));
        c2116lu.m16511r(0.3f);
        c2116lu.m16510s(0.1f);
        c2116lu.m16506w(new C2239b());
        this.f19436q0.m28824h(c2116lu);
        this.f19436q0.m28818j(c2116lu);
        this.f19436q0.m28815k(c2116lu.m16512q());
        this.f19435p0.m3675M(new C2240c(c2116lu));
        m15551v(dj0.f7184v.m6692a(new er0<>()));
        m15552u(ww0.f31598e, ww0.f31595b, ww0.f31597d, ww0.f31596c);
        m15554s();
        return inflate;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        m15557p(false);
        super.onDestroy();
    }

    /* renamed from: p */
    public void m15557p(boolean z) {
    }

    /* renamed from: q */
    public void m15556q(sd0 sd0Var) {
        ts1 ts1Var = (ts1) this.f19436q0.getAdapter();
        if (ts1Var == null || !ts1Var.m8843z().mo3659y(sd0Var)) {
            return;
        }
        ts1Var.m28714i();
    }

    /* renamed from: r */
    public void m15555r() {
        ts1 ts1Var;
        if (m15559n() && (ts1Var = (ts1) this.f19436q0.getAdapter()) != null) {
            ts1Var.m28714i();
        }
    }

    /* renamed from: s */
    public void m15554s() {
        C2691q6.m12752f(getActivity());
        m91 m15560m = m15560m();
        dj0.f7180r.m8756a(1, Boolean.valueOf(m15560m.f18680a), m15560m.f18681b, m15560m.f18682c);
    }

    /* renamed from: t */
    public void m15553t(Context context, String str) {
        if (this.f19436q0 != null) {
            this.f19435p0.mo2234o(context, str);
        }
    }

    /* renamed from: u */
    public void m15552u(int i, tx0 tx0Var, tx0.C3143b c3143b, vd0 vd0Var) {
        RecyclerView recyclerView;
        ts1 ts1Var;
        RecyclerView recyclerView2;
        if (getActivity() == null || (recyclerView = this.f19436q0) == null || (ts1Var = (ts1) recyclerView.getAdapter()) == null) {
            return;
        }
        if (this.f19435p0 != null) {
            if (this.f19437r0.size() > 1) {
                this.f19437r0.removeFirst();
            }
            if (vd0Var != null && (this.f19437r0.peekLast() == null || !this.f19437r0.peekLast().equals(vd0Var))) {
                this.f19437r0.add(vd0Var);
            }
            Iterator<vd0> it = this.f19437r0.iterator();
            while (it.hasNext()) {
                int m12377e0 = this.f19435p0.m12377e0(it.next());
                if (m12377e0 >= 0) {
                    RecyclerView.AbstractC0376c0 m28850X = this.f19436q0.m28850X(ts1Var.m8845x(m12377e0));
                    if (m28850X instanceof C3223uk) {
                        ((C3223uk) m28850X).m8096R();
                    }
                }
            }
        } else {
            ts1Var.m28714i();
        }
        if (dj0.f7156T.m6692a(Boolean.FALSE).booleanValue()) {
            int integer = getResources().getInteger(R.integer.player_controls_height_in_items);
            if (i >= Math.max(((LinearLayoutManager) this.f19436q0.getLayoutManager()).m28936c2() - (integer + 1), 0)) {
                recyclerView2 = this.f19436q0;
                i += integer;
            } else {
                recyclerView2 = this.f19436q0;
            }
            recyclerView2.m28816j1(ts1Var.m8845x(i));
        }
    }

    /* renamed from: v */
    public void m15551v(er0<tx0, vd0> er0Var) {
        C2719qk c2719qk = this.f19435p0;
        if (c2719qk != null) {
            c2719qk.mo3669h(true);
        }
    }
}
