package com.daaw;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.daaw.C2719qk;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.gh0;
import com.daaw.jh0;
import com.daaw.kw1;
import com.daaw.qw1;
import com.daaw.rw1;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.tx0;
import com.daaw.vw1;
import com.daaw.ww1;
import com.daaw.yw1;
import com.daaw.zt1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class hj0 {

    /* renamed from: c */
    public lo1<Integer, Boolean> f12560c;

    /* renamed from: d */
    public lo1<Integer, Boolean> f12561d;

    /* renamed from: a */
    public List<Object> f12558a = new LinkedList();

    /* renamed from: b */
    public boolean f12559b = true;

    /* renamed from: e */
    public int f12562e = 0;

    /* renamed from: com.daaw.hj0$a */
    /* loaded from: classes.dex */
    public class C1541a implements sw1.InterfaceC2987a<Context, String, String> {
        public C1541a() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(Context context, String str, String str2) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18954I(str, str2, context);
            hj0.this.m20732A();
        }
    }

    /* renamed from: com.daaw.hj0$a0 */
    /* loaded from: classes.dex */
    public class C1542a0 implements ww1.InterfaceC3477a<Integer, Boolean> {
        public C1542a0() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public Boolean mo5751b(Integer num) {
            return Boolean.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18922h(num.intValue()));
        }
    }

    /* renamed from: com.daaw.hj0$b */
    /* loaded from: classes.dex */
    public class C1543b implements rw1.InterfaceC2894a<Context, List<String>> {
        public C1543b() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Context context, List<String> list) {
            hj0.this.m20727d(context, list);
        }
    }

    /* renamed from: com.daaw.hj0$b0 */
    /* loaded from: classes.dex */
    public class C1544b0 implements qw1.InterfaceC2788a<C0645al> {
        public C1544b0() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(C0645al c0645al) {
            am1.m27342a(c0645al);
        }
    }

    /* renamed from: com.daaw.hj0$c */
    /* loaded from: classes.dex */
    public class C1545c implements vw1.InterfaceC3381a<Boolean> {
        public C1545c() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Boolean mo3126a() {
            return Boolean.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14317q));
        }
    }

    /* renamed from: com.daaw.hj0$c0 */
    /* loaded from: classes.dex */
    public class C1546c0 implements rw1.InterfaceC2894a<Boolean, Class<?>> {
        public C1546c0() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Boolean bool, Class<?> cls) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5 m18928e;
            int i;
            if (!cls.equals(C1428gk.class)) {
                if (cls.equals(C1577hk.class)) {
                    m18928e = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e();
                    i = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14329w;
                }
                hj0.this.m20732A();
            }
            m18928e = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e();
            i = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14327v;
            m18928e.m18935a0(i, bool.booleanValue());
            hj0.this.m20732A();
        }
    }

    /* renamed from: com.daaw.hj0$d */
    /* loaded from: classes.dex */
    public class C1547d implements tw1.InterfaceC3140a<C1652i2, ImageView, Boolean, Boolean> {
        public C1547d() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(C1652i2 c1652i2, ImageView imageView, Boolean bool, Boolean bool2) {
            new C1354g2().m22069t(c1652i2.f13192a, c1652i2.f13193b, c1652i2.f13194c, imageView, bool.booleanValue());
        }
    }

    /* renamed from: com.daaw.hj0$d0 */
    /* loaded from: classes.dex */
    public class C1548d0 implements vw1.InterfaceC3381a<er0<tx0, vd0>> {
        public C1548d0() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public er0<tx0, vd0> mo3126a() {
            l01 m17249c = l01.m17249c();
            return m17249c != null ? m17249c.m17240l() : new er0<>();
        }
    }

    /* renamed from: com.daaw.hj0$e */
    /* loaded from: classes.dex */
    public class C1549e implements tw1.InterfaceC3140a<C1652i2, ImageView, Boolean, Boolean> {
        public C1549e() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(C1652i2 c1652i2, ImageView imageView, Boolean bool, Boolean bool2) {
            hj0.this.m20715p(c1652i2, imageView, bool);
        }
    }

    /* renamed from: com.daaw.hj0$e0 */
    /* loaded from: classes.dex */
    public class C1550e0 implements vw1.InterfaceC3381a<be0> {
        public C1550e0() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public be0 mo3126a() {
            l01 m17249c = l01.m17249c();
            if (m17249c != null) {
                return m17249c.m17236p();
            }
            return null;
        }
    }

    /* renamed from: com.daaw.hj0$f */
    /* loaded from: classes.dex */
    public class C1551f implements vw1.InterfaceC3381a<Boolean> {
        public C1551f() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Boolean mo3126a() {
            return Boolean.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14321s));
        }
    }

    /* renamed from: com.daaw.hj0$f0 */
    /* loaded from: classes.dex */
    public class C1552f0 implements vw1.InterfaceC3381a<Integer> {
        public C1552f0() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Integer mo3126a() {
            l01 m17249c = l01.m17249c();
            return Integer.valueOf(m17249c != null ? m17249c.m17237o() : 0);
        }
    }

    /* renamed from: com.daaw.hj0$g */
    /* loaded from: classes.dex */
    public class C1553g implements rw1.InterfaceC2894a<C0645al, List<gh0.C1408d>> {
        public C1553g() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(C0645al c0645al, List<gh0.C1408d> list) {
            tx0 m21635a;
            if (list.size() >= 1 && (m21635a = list.get(list.size() - 1).m21635a()) != null) {
                fe1.m22753a(c0645al, c0645al.m27377b(), m21635a);
            }
        }
    }

    /* renamed from: com.daaw.hj0$g0 */
    /* loaded from: classes.dex */
    public class C1554g0 implements rw1.InterfaceC2894a<C0645al, String> {
        public C1554g0() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(C0645al c0645al, String str) {
            tx0 tx0Var = new tx0(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(tx0Var);
            l01 m17249c = l01.m17249c();
            if (m17249c != null) {
                m17249c.m17268E(arrayList, 0, 0, null);
            }
        }
    }

    /* renamed from: com.daaw.hj0$h */
    /* loaded from: classes.dex */
    public class C1555h implements ww1.InterfaceC3477a<wc0, lo1<Integer, Boolean>> {
        public C1555h() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public lo1<Integer, Boolean> mo5751b(wc0 wc0Var) {
            return "/".equals(wc0Var.mo3670e()) ? hj0.this.m20714q() : hj0.this.m20713r();
        }
    }

    /* renamed from: com.daaw.hj0$h0 */
    /* loaded from: classes.dex */
    public class C1556h0 implements rw1.InterfaceC2894a<String, String> {
        public C1556h0() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(String str, String str2) {
            if (str.equals("/") && "6".equals(str2)) {
                hj0.this.f12562e = 1;
                hj0.this.m20732A();
                return;
            }
            m30 m26906o0 = MainActivity.m26906o0();
            if (m26906o0 != null) {
                m26906o0.m16251s(null, str2);
            }
        }
    }

    /* renamed from: com.daaw.hj0$i */
    /* loaded from: classes.dex */
    public class C1557i implements vw1.InterfaceC3381a<Integer> {
        public C1557i() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Integer mo3126a() {
            return Integer.valueOf(hj0.this.f12562e);
        }
    }

    /* renamed from: com.daaw.hj0$i0 */
    /* loaded from: classes.dex */
    public class C1558i0 implements sw1.InterfaceC2987a<C0645al, Integer, View> {
        public C1558i0() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(C0645al c0645al, Integer num, View view) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5 m18928e;
            int i;
            Context m23840b = dx0.m23840b();
            if (m23840b == null) {
                return;
            }
            FragmentManager m27376c = c0645al.m27376c();
            int intValue = num.intValue();
            if (intValue == 120) {
                DialogFragmentC2971st.m9913g(c0645al, "libraryAddFolder", R.string.dialog_add_folder_title, "");
            } else if (intValue == 125) {
                if (view != null) {
                    zt1.m1918b(c0645al, view, "");
                }
            } else if (intValue == 1110) {
                l01 m17249c = l01.m17249c();
                if (m17249c != null) {
                    m17249c.m17268E(new ArrayList(), -1, -1, null);
                }
            } else {
                switch (intValue) {
                    case 110:
                        if (m27376c != null) {
                            DialogFragmentC1241f1.m22971c(c0645al);
                            return;
                        }
                        return;
                    case 111:
                        C3385vy.f30703a.m12018a(m23840b.getResources().getString(R.string.hold_to_clear_queue));
                        return;
                    case 112:
                        l01 m17249c2 = l01.m17249c();
                        if (m17249c2 != null) {
                            ox0.m13896c(c0645al, m17249c2.m17240l().m23260w(), Boolean.TRUE);
                            return;
                        }
                        return;
                    case 113:
                        hj0.this.m20708w();
                        return;
                    case 114:
                        m18928e = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e();
                        i = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14317q;
                        break;
                    case 115:
                        m18928e = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e();
                        i = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14321s;
                        break;
                    default:
                        return;
                }
                m18928e.m18915k0(i);
            }
        }
    }

    /* renamed from: com.daaw.hj0$j */
    /* loaded from: classes.dex */
    public class C1559j implements rw1.InterfaceC2894a<Integer, Boolean> {
        public C1559j() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Integer num, Boolean bool) {
            if (num.intValue() == SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14317q) {
                dj0.m24359i(bool.booleanValue());
                return;
            }
            if (num.intValue() == SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14321s) {
                dj0.m24358j(bool.booleanValue());
            } else if (num.intValue() != SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14267C) {
                return;
            }
            hj0.this.m20732A();
            hj0.this.m20731B();
        }
    }

    /* renamed from: com.daaw.hj0$k */
    /* loaded from: classes.dex */
    public class C1560k implements kw1.InterfaceC1991a<C3223uk, tx0.C3143b, Boolean> {
        public C1560k() {
        }

        @Override // com.daaw.kw1.InterfaceC1991a
        /* renamed from: b */
        public void mo17380a(C3223uk c3223uk, tx0.C3143b c3143b, Boolean bool) {
            hj0.this.m20705z(c3223uk, c3143b, bool.booleanValue());
        }
    }

    /* renamed from: com.daaw.hj0$l */
    /* loaded from: classes.dex */
    public class C1561l implements sw1.InterfaceC2987a<Integer, Integer, Boolean> {
        public C1561l() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(Integer num, Integer num2, Boolean bool) {
            if (num.intValue() == SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14286V) {
                lo1 m20707x = hj0.this.m20707x(num2);
                if (m20707x != null) {
                    hj0.this.f12561d = m20707x;
                }
                hj0.this.m20732A();
                hj0.this.m20731B();
            }
        }
    }

    /* renamed from: com.daaw.hj0$m */
    /* loaded from: classes.dex */
    public class C1562m implements sw1.InterfaceC2987a<C0645al, String, String> {
        public C1562m() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(C0645al c0645al, String str, String str2) {
            if (str2.equals("libraryAddFolder")) {
                hj0.this.m20726e(c0645al.m27377b(), new String[]{str});
            }
        }
    }

    /* renamed from: com.daaw.hj0$n */
    /* loaded from: classes.dex */
    public class C1563n implements rw1.InterfaceC2894a<jh0.C1829a<Object>, Boolean> {
        public C1563n() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(jh0.C1829a<Object> c1829a, Boolean bool) {
            hj0.this.m20706y(c1829a.m18518c());
        }
    }

    /* renamed from: com.daaw.hj0$o */
    /* loaded from: classes.dex */
    public class C1564o implements qw1.InterfaceC2788a<sd0> {
        public C1564o() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(sd0 sd0Var) {
            hj0.this.m20706y(sd0Var);
        }
    }

    /* renamed from: com.daaw.hj0$p */
    /* loaded from: classes.dex */
    public class C1565p implements rw1.InterfaceC2894a<Collection<tx0>, Integer> {
        public C1565p() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Collection<tx0> collection, Integer num) {
            l01 m17249c = l01.m17249c();
            if (m17249c != null) {
                m17249c.m17248d(collection, num.intValue(), 0);
            }
        }
    }

    /* renamed from: com.daaw.hj0$q */
    /* loaded from: classes.dex */
    public class C1566q implements sw1.InterfaceC2987a<Integer, Integer, List<Integer>> {
        public C1566q() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(Integer num, Integer num2, List<Integer> list) {
            l01 m17249c = l01.m17249c();
            if (m17249c != null) {
                m17249c.m17234r(num.intValue(), num2.intValue(), list, 0);
            }
        }
    }

    /* renamed from: com.daaw.hj0$r */
    /* loaded from: classes.dex */
    public class C1567r implements sw1.InterfaceC2987a<List<tx0>, Integer, be0> {
        public C1567r() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(List<tx0> list, Integer num, be0 be0Var) {
            l01 m17249c = l01.m17249c();
            if (m17249c != null) {
                m17249c.m17268E(list, num.intValue(), -1, be0Var);
            }
        }
    }

    /* renamed from: com.daaw.hj0$s */
    /* loaded from: classes.dex */
    public class C1568s implements sw1.InterfaceC2987a<List<tx0>, Integer, be0> {
        public C1568s() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(List<tx0> list, Integer num, be0 be0Var) {
            hj0.this.m20709v(list, num, be0Var);
        }
    }

    /* renamed from: com.daaw.hj0$t */
    /* loaded from: classes.dex */
    public class C1569t implements sw1.InterfaceC2987a<List<tx0>, Integer, be0> {
        public C1569t() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(List<tx0> list, Integer num, be0 be0Var) {
            hj0.this.m20709v(list, num, be0Var);
        }
    }

    /* renamed from: com.daaw.hj0$u */
    /* loaded from: classes.dex */
    public class C1570u implements qw1.InterfaceC2788a<Object> {
        public C1570u() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: b */
        public void mo3122b(Object obj) {
            if (obj instanceof C2719qk.C2738s) {
                C2719qk.C2738s c2738s = (C2719qk.C2738s) obj;
                l01 m17249c = l01.m17249c();
                if (m17249c != null) {
                    m17249c.m17256Q(c2738s.f24101c, 0);
                }
            }
        }
    }

    /* renamed from: com.daaw.hj0$v */
    /* loaded from: classes.dex */
    public class C1571v implements ww1.InterfaceC3477a<Class<?>, Boolean> {
        public C1571v() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public Boolean mo5751b(Class<?> cls) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5 m18928e;
            int i;
            if (cls.equals(C1428gk.class)) {
                m18928e = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e();
                i = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14327v;
            } else if (!cls.equals(C1577hk.class)) {
                return Boolean.TRUE;
            } else {
                m18928e = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e();
                i = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14329w;
            }
            return Boolean.valueOf(m18928e.m18922h(i));
        }
    }

    /* renamed from: com.daaw.hj0$w */
    /* loaded from: classes.dex */
    public class C1572w implements qw1.InterfaceC2788a<List<vd0>> {
        public C1572w() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(List<vd0> list) {
            l01 m17249c = l01.m17249c();
            if (m17249c != null) {
                m17249c.m17260M(list);
            }
        }
    }

    /* renamed from: com.daaw.hj0$x */
    /* loaded from: classes.dex */
    public class C1573x implements qw1.InterfaceC2788a<Integer> {
        public C1573x() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Integer num) {
            l01 m17249c = l01.m17249c();
            if (m17249c != null) {
                m17249c.m17255R(num.intValue());
            }
        }
    }

    /* renamed from: com.daaw.hj0$y */
    /* loaded from: classes.dex */
    public class C1574y implements qw1.InterfaceC2788a<vd0> {
        public C1574y() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(vd0 vd0Var) {
            l01 m17249c = l01.m17249c();
            if (m17249c != null) {
                m17249c.m17258O(vd0Var);
            }
        }
    }

    /* renamed from: com.daaw.hj0$z */
    /* loaded from: classes.dex */
    public class C1575z implements rw1.InterfaceC2894a<er0<tx0, vd0>, be0> {
        public C1575z() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(er0<tx0, vd0> er0Var, be0 be0Var) {
            n30 m26905p0 = MainActivity.m26905p0();
            if (m26905p0 != null) {
                m26905p0.m15551v(er0Var);
            }
        }
    }

    public hj0() {
        this.f12560c = null;
        this.f12561d = null;
        this.f12561d = m20713r();
        this.f12560c = m20714q();
        dj0.f7174l0.m17381b(new C1560k(), this.f12558a);
        dj0.f7164b0.m5752b(new C1571v(), this.f12558a);
        dj0.f7165c0.m10861b(new C1546c0(), this.f12558a);
        dj0.f7184v.m6691b(new C1548d0(), this.f12558a);
        dj0.f7183u.m6691b(new C1550e0(), this.f12558a);
        dj0.f7178p.m6691b(new C1552f0(), this.f12558a);
        DialogFragmentC1241f1.f8988q.m10861b(new C1554g0(), this.f12558a);
        dj0.f7179q.m10861b(new C1556h0(), this.f12558a);
        dj0.f7153Q.m9794b(new C1558i0(), this.f12558a);
        dj0.f7148L.m9794b(new C1541a(), this.f12558a);
        dj0.f7149M.m10861b(new C1543b(), this.f12558a);
        dj0.f7156T.m6691b(new C1545c(), this.f12558a);
        fe1.f9487p.m8755b(new C1547d(), this.f12558a);
        dj0.f7167e0.m8755b(new C1549e(), this.f12558a);
        dj0.f7168f0.m6691b(new C1551f(), this.f12558a);
        dj0.f7137A.m10861b(new C1553g(), this.f12558a);
        dj0.f7173k0.m5752b(new C1555h(), this.f12558a);
        dj0.f7181s.m6691b(new C1557i(), this.f12558a);
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14299h.m10861b(new C1559j(), this.f12558a);
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14297g.m9794b(new C1561l(), this.f12558a);
        DialogFragmentC2971st.f26613t.m9794b(new C1562m(), this.f12558a);
        C1195el.f8547g.m10861b(new C1563n(), this.f12558a);
        C1195el.f8548h.m12017b(new C1564o(), this.f12558a);
        dj0.f7187y.m10861b(new C1565p(), this.f12558a);
        dj0.f7166d0.m9794b(new C1566q(), this.f12558a);
        dj0.f7188z.m9794b(new C1567r(), this.f12558a);
        dj0.f7143G.m9794b(new C1568s(), this.f12558a);
        dj0.f7144H.m9794b(new C1569t(), this.f12558a);
        dj0.f7152P.m12017b(new C1570u(), this.f12558a);
        dj0.f7140D.m12017b(new C1572w(), this.f12558a);
        dj0.f7185w.m12017b(new C1573x(), this.f12558a);
        dj0.f7139C.m12017b(new C1574y(), this.f12558a);
        l01.f16925v.m10861b(new C1575z(), this.f12558a);
        dj0.f7141E.m5752b(new C1542a0(), this.f12558a);
        dj0.f7142F.m12017b(new C1544b0(), this.f12558a);
        zt1.f35479c.m3154b(new yw1.InterfaceC3757a() { // from class: com.daaw.gj0
            @Override // com.daaw.yw1.InterfaceC3757a
            /* renamed from: a */
            public final Object mo3153a(Object obj, Object obj2, Object obj3) {
                zt1.C3898c m20712s;
                m20712s = hj0.m20712s((Integer) obj, (sd0) obj2, (String) obj3);
                return m20712s;
            }
        }, this.f12558a);
        zt1.f35480d.m9794b(new sw1.InterfaceC2987a() { // from class: com.daaw.fj0
            @Override // com.daaw.sw1.InterfaceC2987a
            /* renamed from: a */
            public final void mo3118a(Object obj, Object obj2, Object obj3) {
                hj0.m20711t((Integer) obj, (sd0) obj2, (zt1.C3898c) obj3);
            }
        }, this.f12558a);
        MainActivity.f3716i0.m12017b(new qw1.InterfaceC2788a() { // from class: com.daaw.ej0
            @Override // com.daaw.qw1.InterfaceC2788a
            /* renamed from: b */
            public final void mo3122b(Object obj) {
                hj0.m20710u((Activity) obj);
            }
        }, this.f12558a);
    }

    /* renamed from: s */
    public static /* synthetic */ zt1.C3898c m20712s(Integer num, sd0 sd0Var, String str) {
        zt1.C3898c c3898c = new zt1.C3898c();
        c3898c.f35487a = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14286V);
        c3898c.f35488b = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14321s);
        return c3898c;
    }

    /* renamed from: t */
    public static /* synthetic */ void m20711t(Integer num, sd0 sd0Var, zt1.C3898c c3898c) {
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14286V, c3898c.f35487a);
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18935a0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14321s, c3898c.f35488b);
    }

    /* renamed from: u */
    public static /* synthetic */ void m20710u(Activity activity) {
        Context m23837e = dx0.m23837e();
        if (m23837e != null && C1658i5.m20123a(m23837e, null) && l01.m17249c().m17240l().isEmpty()) {
            l01.m17249c().m17269D(C3442wj.m6054j0(m23837e, 0, null), -1, 2, null, null, 0, false);
        }
    }

    /* renamed from: A */
    public void m20732A() {
        m30 m26906o0 = MainActivity.m26906o0();
        if (m26906o0 != null) {
            m26906o0.m16263A();
        }
    }

    /* renamed from: B */
    public void m20731B() {
        n30 m26905p0 = MainActivity.m26905p0();
        if (m26905p0 != null) {
            m26905p0.m15555r();
        }
    }

    /* renamed from: d */
    public final void m20727d(Context context, Collection<String> collection) {
        for (String str : collection) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18959D(str, context);
        }
        m20732A();
    }

    /* renamed from: e */
    public final void m20726e(Context context, String[] strArr) {
        for (String str : strArr) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18959D(str, context);
        }
        m20732A();
    }

    /* renamed from: p */
    public final void m20715p(C1652i2 c1652i2, ImageView imageView, Boolean bool) {
        new C1354g2().m22069t(c1652i2.f13192a, c1652i2.f13193b, c1652i2.f13194c, imageView, bool.booleanValue());
    }

    /* renamed from: q */
    public lo1<Integer, Boolean> m20714q() {
        if (this.f12560c == null) {
            this.f12560c = m20707x(-1);
        }
        if (this.f12560c == null) {
            this.f12560c = new lo1<>(56, Boolean.TRUE);
        }
        return this.f12560c;
    }

    /* renamed from: r */
    public lo1<Integer, Boolean> m20713r() {
        if (this.f12561d == null) {
            this.f12561d = m20707x(-1);
        }
        if (this.f12561d == null) {
            this.f12561d = new lo1<>(56, Boolean.TRUE);
        }
        return this.f12561d;
    }

    /* renamed from: v */
    public final void m20709v(List<tx0> list, Integer num, be0 be0Var) {
        if (list == null) {
            Context m23837e = dx0.m23837e();
            if (m23837e != null) {
                C3385vy.f30703a.m12018a(m23837e.getResources().getString(R.string.failed_to_open_network_error));
                return;
            }
            return;
        }
        l01 m17249c = l01.m17249c();
        if (m17249c != null) {
            m17249c.m17261L(-1);
            m17249c.m17269D(list, num.intValue(), 0, null, null, -1, false);
        }
    }

    /* renamed from: w */
    public final void m20708w() {
        l01 m17249c = l01.m17249c();
        int i = 0;
        int m17237o = m17249c != null ? m17249c.m17237o() : 0;
        if (m17237o == 0) {
            i = 1;
        } else if (m17237o != 1) {
            i = m17237o;
        }
        if (m17249c != null) {
            m17249c.m17253T(i, true);
        }
    }

    /* renamed from: x */
    public final lo1<Integer, Boolean> m20707x(Integer num) {
        int intValue = num.intValue();
        int i = intValue != 0 ? (intValue == 1 || intValue != 2) ? 56 : 112 : 28;
        Context m23837e = dx0.m23837e();
        if (m23837e == null) {
            return null;
        }
        return new lo1<>(Integer.valueOf((int) TypedValue.applyDimension(1, i, m23837e.getResources().getDisplayMetrics())), Boolean.valueOf(i >= 56));
    }

    /* renamed from: y */
    public final void m20706y(sd0 sd0Var) {
        m30 m26906o0 = MainActivity.m26906o0();
        if (m26906o0 != null) {
            m26906o0.m16246x(sd0Var);
        }
        n30 m26905p0 = MainActivity.m26905p0();
        if (m26905p0 != null) {
            m26905p0.m15556q(sd0Var);
        }
    }

    /* renamed from: z */
    public void m20705z(C3223uk c3223uk, tx0.C3143b c3143b, boolean z) {
        String str;
        if (z) {
            c3223uk.f29122x.setVisibility(0);
            c3223uk.m8092V(-1);
            m20715p(new C1652i2(c3143b.f28203a, c3143b.m8729d(), c3143b.m8731b()), c3223uk.f29122x, Boolean.TRUE);
        } else {
            c3223uk.f29122x.setVisibility(8);
            c3223uk.m8093U(null);
        }
        if (c3143b.m8724i()) {
            c3223uk.f29124z.setText(c3143b.f28207e);
            c3223uk.m8084d0(0);
            if (c3143b.m8726g()) {
                str = c3143b.f28210h + "   |   " + c3143b.f28208f;
            } else {
                str = c3143b.f28210h;
            }
            c3223uk.m8085c0(str);
        } else {
            c3223uk.f29124z.setText(c3143b.f28207e);
            c3223uk.m8084d0(8);
        }
        c3223uk.f29112B.setText(!c3143b.f28205c ? br1.m25894o(c3143b.f28212j / 1000) : "");
    }
}
