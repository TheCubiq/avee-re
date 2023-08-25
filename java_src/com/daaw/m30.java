package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.astuetz.PagerSlidingTabStrip;
import com.daaw.avee.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* loaded from: classes.dex */
public class m30 extends dj0 {
    public HashMap<String, b> p0 = new HashMap<>();
    public String q0 = "";
    public View r0;
    public PagerSlidingTabStrip s0;
    public RecyclerView t0;
    public ts1 u0;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m30.this.t(null, (String) view.getTag());
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public int a = 0;

        public b() {
        }
    }

    public static m30 w() {
        m30 m30Var = new m30();
        m30Var.setArguments(new Bundle());
        return m30Var;
    }

    public void A() {
        wc0 z;
        if (p()) {
            boolean z2 = false;
            ts1 ts1Var = (ts1) this.t0.getAdapter();
            if (ts1Var != null && (z = ts1Var.z()) != null) {
                z2 = z.h(true);
            }
            if (z2) {
                return;
            }
            u(null, this.q0, true);
        }
    }

    public void B() {
        RecyclerView recyclerView = this.t0;
        C(recyclerView != null ? (ts1) recyclerView.getAdapter() : null);
    }

    public final void C(ts1 ts1Var) {
        q6.f(getActivity());
        m91 o = o(ts1Var);
        dj0.r.a(0, Boolean.valueOf(o.a), o.b, o.c);
    }

    public void D(Context context, String str) {
        ts1 ts1Var;
        RecyclerView recyclerView = this.t0;
        if (recyclerView == null || (ts1Var = (ts1) recyclerView.getAdapter()) == null) {
            return;
        }
        ts1Var.z().o(context, str);
    }

    public void E() {
        RecyclerView.g adapter;
        RecyclerView recyclerView = this.t0;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        int d = adapter.d();
        for (int i = 0; i < d; i++) {
            RecyclerView.c0 X = this.t0.X(i);
            if (X instanceof uk) {
                ((uk) X).R();
            }
        }
    }

    public boolean l() {
        String str = this.q0;
        return (str == null || str.equals("/")) ? false : true;
    }

    public int m() {
        RecyclerView.o layoutManager = this.t0.getLayoutManager();
        if (layoutManager == null || !(layoutManager instanceof LinearLayoutManager)) {
            return 0;
        }
        return ((LinearLayoutManager) layoutManager).Z1();
    }

    public m91 n() {
        RecyclerView recyclerView = this.t0;
        return o(recyclerView != null ? (ts1) recyclerView.getAdapter() : null);
    }

    public final m91 o(ts1 ts1Var) {
        Activity activity = getActivity();
        return activity == null ? m91.d : dj0.h(activity, ts1Var);
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        String t = j5.e().t(j5.a0);
        this.q0 = t;
        if (t == null) {
            this.q0 = "";
        }
        t(null, this.q0);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String t = j5.e().t(j5.a0);
        this.q0 = t;
        if (t == null) {
            this.q0 = "";
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_0, viewGroup, false);
        gr1.u(inflate.findViewById(R.id.viewStatusBarBg));
        dj0.t.a(0, inflate.findViewById(R.id.viewActionBarBgSkin));
        this.r0 = inflate.findViewById(R.id.backSwipeProgress);
        r(0.0f);
        this.s0 = (PagerSlidingTabStrip) inflate.findViewById(R.id.tabStripPath);
        int color = getResources().getColor(R.color.action_bar_fg);
        this.s0.setTextColor(color);
        this.s0.setTextColorSelected(color);
        this.s0.setDividerColor(color);
        this.s0.setUnderlineColor(color);
        this.s0.setIndicatorColor(color);
        this.s0.setOnClickListener(new a());
        this.t0 = (RecyclerView) inflate.findViewById(R.id.recyclerViewItems);
        this.t0.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView recyclerView = this.t0;
        recyclerView.h(new ke1(1, gr1.n(recyclerView, R.attr.containerBackgroundDark)));
        View findViewById = inflate.findViewById(R.id.tabStripPathGroup);
        gr1.i(findViewById, findViewById.getParent());
        this.u0 = new jk(getActivity(), 0, new WeakReference(this)).F(getActivity());
        t(null, this.q0);
        E();
        B();
        return inflate;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    public boolean p() {
        return this.s0 != null;
    }

    public void q() {
        String str = this.q0;
        int lastIndexOf = str.charAt(str.length() + (-1)) == '/' ? str.lastIndexOf(47, str.length() - 2) : str.lastIndexOf(47);
        t(null, lastIndexOf <= 0 ? "/" : str.substring(0, lastIndexOf));
    }

    public void r(float f) {
        View view = this.r0;
        if (view == null) {
            return;
        }
        view.setPivotX(1.0f);
        this.r0.setScaleX(f);
    }

    public void s(ts1 ts1Var, String str) {
        if (ts1Var == null) {
            ts1Var = (ts1) this.t0.getAdapter();
        }
        if (ts1Var == null) {
            return;
        }
        ts1 v = v(ts1Var, str);
        this.q0 = v.z().e();
        j5.e().g0(j5.a0, this.q0);
        y(v);
    }

    public void t(ts1 ts1Var, String str) {
        u(ts1Var, str, false);
    }

    public void u(ts1 ts1Var, String str, boolean z) {
        RecyclerView recyclerView;
        ts1 ts1Var2;
        str = (str.length() <= 0 || str.charAt(0) != '/') ? "/" : "/";
        if (ts1Var == null) {
            ts1Var = this.u0;
        }
        if (z || ts1Var == null || (recyclerView = this.t0) == null || (ts1Var2 = (ts1) recyclerView.getAdapter()) == null || !ts1Var.z().p(str).equals(ts1Var2.z().e())) {
            if (str.length() > 0 && str.charAt(0) == '/') {
                if (ts1Var == null) {
                    ts1Var = this.u0;
                }
                this.s0.v();
                this.s0.u(ts1Var.z().l(), ts1Var.z().i(), ts1Var.z().e());
                str = str.substring(1, str.length());
            }
            ts1 v = v(ts1Var, str);
            this.q0 = v.z().e();
            j5.e().g0(j5.a0, this.q0);
            y(v);
        }
    }

    public ts1 v(ts1 ts1Var, String str) {
        String substring;
        if (str == null || str.isEmpty()) {
            return ts1Var;
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            substring = "";
        } else {
            String substring2 = str.substring(0, indexOf);
            substring = str.substring(indexOf + 1, str.length());
            str = substring2;
        }
        ts1 d = ts1Var.z().d(getActivity(), str);
        if (d != null) {
            this.s0.u(d.z().l(), d.z().i(), d.z().e());
            return v(d, substring);
        }
        return ts1Var;
    }

    public void x(sd0 sd0Var) {
        ts1 ts1Var;
        RecyclerView recyclerView = this.t0;
        if (recyclerView == null || (ts1Var = (ts1) recyclerView.getAdapter()) == null || !ts1Var.z().y(sd0Var)) {
            return;
        }
        ts1Var.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r2.equals(r3) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(com.daaw.ts1 r8) {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r7.t0
            androidx.recyclerview.widget.RecyclerView$g r0 = r0.getAdapter()
            com.daaw.ts1 r0 = (com.daaw.ts1) r0
            r1 = 0
            if (r0 == 0) goto L57
            com.daaw.wc0 r2 = r0.z()
            java.lang.String r2 = r2.e()
            com.daaw.wc0 r3 = r8.z()
            java.lang.String r3 = r3.e()
            int r4 = r3.length()
            int r5 = r2.length()
            r6 = 1
            if (r4 >= r5) goto L2e
            boolean r4 = r2.contains(r3)
            if (r4 == 0) goto L2e
            r1 = 1
            goto L35
        L2e:
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L35
            goto L36
        L35:
            r6 = 0
        L36:
            if (r1 == 0) goto L3e
            java.util.HashMap<java.lang.String, com.daaw.m30$b> r3 = r7.p0
            r3.remove(r2)
            goto L58
        L3e:
            com.daaw.m30$b r2 = new com.daaw.m30$b
            r2.<init>()
            int r3 = r7.m()
            r2.a = r3
            java.util.HashMap<java.lang.String, com.daaw.m30$b> r3 = r7.p0
            com.daaw.wc0 r4 = r0.z()
            java.lang.String r4 = r4.e()
            r3.put(r4, r2)
            goto L58
        L57:
            r6 = 0
        L58:
            if (r0 == r8) goto L82
            if (r0 == 0) goto L5f
            r0.y()
        L5f:
            r7.C(r8)
            androidx.recyclerview.widget.RecyclerView r0 = r7.t0
            r0.setAdapter(r8)
            if (r1 != 0) goto L6b
            if (r6 == 0) goto L82
        L6b:
            java.util.HashMap<java.lang.String, com.daaw.m30$b> r0 = r7.p0
            com.daaw.wc0 r8 = r8.z()
            java.lang.String r8 = r8.e()
            java.lang.Object r8 = r0.get(r8)
            com.daaw.m30$b r8 = (com.daaw.m30.b) r8
            if (r8 == 0) goto L82
            int r8 = r8.a
            r7.z(r8)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.m30.y(com.daaw.ts1):void");
    }

    public void z(int i) {
        RecyclerView.o layoutManager = this.t0.getLayoutManager();
        if (layoutManager == null || i == -1) {
            return;
        }
        layoutManager.x1(i);
    }
}
