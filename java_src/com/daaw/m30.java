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

    /* renamed from: p0 */
    public HashMap<String, C2149b> f18411p0 = new HashMap<>();

    /* renamed from: q0 */
    public String f18412q0 = "";

    /* renamed from: r0 */
    public View f18413r0;

    /* renamed from: s0 */
    public PagerSlidingTabStrip f18414s0;

    /* renamed from: t0 */
    public RecyclerView f18415t0;

    /* renamed from: u0 */
    public ts1 f18416u0;

    /* renamed from: com.daaw.m30$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2148a implements View.OnClickListener {
        public View$OnClickListenerC2148a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m30.this.m16250t(null, (String) view.getTag());
        }
    }

    /* renamed from: com.daaw.m30$b */
    /* loaded from: classes.dex */
    public class C2149b {

        /* renamed from: a */
        public int f18418a = 0;

        public C2149b() {
        }
    }

    /* renamed from: w */
    public static m30 m16247w() {
        m30 m30Var = new m30();
        m30Var.setArguments(new Bundle());
        return m30Var;
    }

    /* renamed from: A */
    public void m16263A() {
        wc0 m8843z;
        if (m16254p()) {
            boolean z = false;
            ts1 ts1Var = (ts1) this.f18415t0.getAdapter();
            if (ts1Var != null && (m8843z = ts1Var.m8843z()) != null) {
                z = m8843z.mo3669h(true);
            }
            if (z) {
                return;
            }
            m16249u(null, this.f18412q0, true);
        }
    }

    /* renamed from: B */
    public void m16262B() {
        RecyclerView recyclerView = this.f18415t0;
        m16261C(recyclerView != null ? (ts1) recyclerView.getAdapter() : null);
    }

    /* renamed from: C */
    public final void m16261C(ts1 ts1Var) {
        C2691q6.m12752f(getActivity());
        m91 m16255o = m16255o(ts1Var);
        dj0.f7180r.m8756a(0, Boolean.valueOf(m16255o.f18680a), m16255o.f18681b, m16255o.f18682c);
    }

    /* renamed from: D */
    public void m16260D(Context context, String str) {
        ts1 ts1Var;
        RecyclerView recyclerView = this.f18415t0;
        if (recyclerView == null || (ts1Var = (ts1) recyclerView.getAdapter()) == null) {
            return;
        }
        ts1Var.m8843z().mo2234o(context, str);
    }

    /* renamed from: E */
    public void m16259E() {
        RecyclerView.AbstractC0380g adapter;
        RecyclerView recyclerView = this.f18415t0;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        int mo497d = adapter.mo497d();
        for (int i = 0; i < mo497d; i++) {
            RecyclerView.AbstractC0376c0 m28850X = this.f18415t0.m28850X(i);
            if (m28850X instanceof C3223uk) {
                ((C3223uk) m28850X).m8096R();
            }
        }
    }

    /* renamed from: l */
    public boolean m16258l() {
        String str = this.f18412q0;
        return (str == null || str.equals("/")) ? false : true;
    }

    /* renamed from: m */
    public int m16257m() {
        RecyclerView.AbstractC0391o layoutManager = this.f18415t0.getLayoutManager();
        if (layoutManager == null || !(layoutManager instanceof LinearLayoutManager)) {
            return 0;
        }
        return ((LinearLayoutManager) layoutManager).m28939Z1();
    }

    /* renamed from: n */
    public m91 m16256n() {
        RecyclerView recyclerView = this.f18415t0;
        return m16255o(recyclerView != null ? (ts1) recyclerView.getAdapter() : null);
    }

    /* renamed from: o */
    public final m91 m16255o(ts1 ts1Var) {
        Activity activity = getActivity();
        return activity == null ? m91.f18679d : dj0.m24360h(activity, ts1Var);
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        String m18906t = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18906t(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14291a0);
        this.f18412q0 = m18906t;
        if (m18906t == null) {
            this.f18412q0 = "";
        }
        m16250t(null, this.f18412q0);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String m18906t = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18906t(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14291a0);
        this.f18412q0 = m18906t;
        if (m18906t == null) {
            this.f18412q0 = "";
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_0, viewGroup, false);
        gr1.m21314u(inflate.findViewById(R.id.viewStatusBarBg));
        dj0.f7182t.m10862a(0, inflate.findViewById(R.id.viewActionBarBgSkin));
        this.f18413r0 = inflate.findViewById(R.id.backSwipeProgress);
        m16252r(0.0f);
        this.f18414s0 = (PagerSlidingTabStrip) inflate.findViewById(R.id.tabStripPath);
        int color = getResources().getColor(R.color.action_bar_fg);
        this.f18414s0.setTextColor(color);
        this.f18414s0.setTextColorSelected(color);
        this.f18414s0.setDividerColor(color);
        this.f18414s0.setUnderlineColor(color);
        this.f18414s0.setIndicatorColor(color);
        this.f18414s0.setOnClickListener(new View$OnClickListenerC2148a());
        this.f18415t0 = (RecyclerView) inflate.findViewById(R.id.recyclerViewItems);
        this.f18415t0.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView recyclerView = this.f18415t0;
        recyclerView.m28824h(new ke1(1, gr1.m21321n(recyclerView, R.attr.containerBackgroundDark)));
        View findViewById = inflate.findViewById(R.id.tabStripPathGroup);
        gr1.m21326i(findViewById, findViewById.getParent());
        this.f18416u0 = new C1832jk(getActivity(), 0, new WeakReference(this)).m3681F(getActivity());
        m16250t(null, this.f18412q0);
        m16259E();
        m16262B();
        return inflate;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: p */
    public boolean m16254p() {
        return this.f18414s0 != null;
    }

    /* renamed from: q */
    public void m16253q() {
        String str = this.f18412q0;
        int lastIndexOf = str.charAt(str.length() + (-1)) == '/' ? str.lastIndexOf(47, str.length() - 2) : str.lastIndexOf(47);
        m16250t(null, lastIndexOf <= 0 ? "/" : str.substring(0, lastIndexOf));
    }

    /* renamed from: r */
    public void m16252r(float f) {
        View view = this.f18413r0;
        if (view == null) {
            return;
        }
        view.setPivotX(1.0f);
        this.f18413r0.setScaleX(f);
    }

    /* renamed from: s */
    public void m16251s(ts1 ts1Var, String str) {
        if (ts1Var == null) {
            ts1Var = (ts1) this.f18415t0.getAdapter();
        }
        if (ts1Var == null) {
            return;
        }
        ts1 m16248v = m16248v(ts1Var, str);
        this.f18412q0 = m16248v.m8843z().mo3670e();
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18923g0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14291a0, this.f18412q0);
        m16245y(m16248v);
    }

    /* renamed from: t */
    public void m16250t(ts1 ts1Var, String str) {
        m16249u(ts1Var, str, false);
    }

    /* renamed from: u */
    public void m16249u(ts1 ts1Var, String str, boolean z) {
        RecyclerView recyclerView;
        ts1 ts1Var2;
        str = (str.length() <= 0 || str.charAt(0) != '/') ? "/" : "/";
        if (ts1Var == null) {
            ts1Var = this.f18416u0;
        }
        if (z || ts1Var == null || (recyclerView = this.f18415t0) == null || (ts1Var2 = (ts1) recyclerView.getAdapter()) == null || !ts1Var.m8843z().mo3664p(str).equals(ts1Var2.m8843z().mo3670e())) {
            if (str.length() > 0 && str.charAt(0) == '/') {
                if (ts1Var == null) {
                    ts1Var = this.f18416u0;
                }
                this.f18414s0.m27826v();
                this.f18414s0.m27827u(ts1Var.m8843z().mo3667l(), ts1Var.m8843z().mo3668i(), ts1Var.m8843z().mo3670e());
                str = str.substring(1, str.length());
            }
            ts1 m16248v = m16248v(ts1Var, str);
            this.f18412q0 = m16248v.m8843z().mo3670e();
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18923g0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14291a0, this.f18412q0);
            m16245y(m16248v);
        }
    }

    /* renamed from: v */
    public ts1 m16248v(ts1 ts1Var, String str) {
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
        ts1 mo2246d = ts1Var.m8843z().mo2246d(getActivity(), str);
        if (mo2246d != null) {
            this.f18414s0.m27827u(mo2246d.m8843z().mo3667l(), mo2246d.m8843z().mo3668i(), mo2246d.m8843z().mo3670e());
            return m16248v(mo2246d, substring);
        }
        return ts1Var;
    }

    /* renamed from: x */
    public void m16246x(sd0 sd0Var) {
        ts1 ts1Var;
        RecyclerView recyclerView = this.f18415t0;
        if (recyclerView == null || (ts1Var = (ts1) recyclerView.getAdapter()) == null || !ts1Var.m8843z().mo3659y(sd0Var)) {
            return;
        }
        ts1Var.m28714i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r2.equals(r3) != false) goto L9;
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m16245y(ts1 ts1Var) {
        boolean z;
        C2149b c2149b;
        ts1 ts1Var2 = (ts1) this.f18415t0.getAdapter();
        boolean z2 = false;
        if (ts1Var2 != null) {
            String mo3670e = ts1Var2.m8843z().mo3670e();
            String mo3670e2 = ts1Var.m8843z().mo3670e();
            z = true;
            if (mo3670e2.length() < mo3670e.length() && mo3670e.contains(mo3670e2)) {
                z2 = true;
            }
            z = false;
            if (z2) {
                this.f18411p0.remove(mo3670e);
            } else {
                C2149b c2149b2 = new C2149b();
                c2149b2.f18418a = m16257m();
                this.f18411p0.put(ts1Var2.m8843z().mo3670e(), c2149b2);
            }
        } else {
            z = false;
        }
        if (ts1Var2 != ts1Var) {
            if (ts1Var2 != null) {
                ts1Var2.m8844y();
            }
            m16261C(ts1Var);
            this.f18415t0.setAdapter(ts1Var);
            if ((z2 || z) && (c2149b = this.f18411p0.get(ts1Var.m8843z().mo3670e())) != null) {
                m16244z(c2149b.f18418a);
            }
        }
    }

    /* renamed from: z */
    public void m16244z(int i) {
        RecyclerView.AbstractC0391o layoutManager = this.f18415t0.getLayoutManager();
        if (layoutManager == null || i == -1) {
            return;
        }
        layoutManager.mo28397x1(i);
    }
}
