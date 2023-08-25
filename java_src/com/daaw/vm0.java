package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;
import com.daaw.avee.MainActivity;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.rw1;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.tx0;
import com.daaw.vw1;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class vm0 {

    /* renamed from: a */
    public List<Object> f30307a = new LinkedList();

    /* renamed from: b */
    public int f30308b = 0;

    /* renamed from: c */
    public int f30309c = 0;

    /* renamed from: com.daaw.vm0$a */
    /* loaded from: classes.dex */
    public class C3345a implements vw1.InterfaceC3381a<tx0.C3143b> {
        public C3345a() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public tx0.C3143b mo3126a() {
            return xw0.f33010g;
        }
    }

    /* renamed from: com.daaw.vm0$b */
    /* loaded from: classes.dex */
    public class C3346b implements tw1.InterfaceC3140a<C1652i2, af0, Integer, Integer> {
        public C3346b() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(C1652i2 c1652i2, af0 af0Var, Integer num, Integer num2) {
            new C1354g2().m22067v(false, c1652i2.f13192a, c1652i2.f13193b, c1652i2.f13194c, af0Var, num.intValue(), num2.intValue(), 0, -1, true, null, null);
        }
    }

    /* renamed from: com.daaw.vm0$c */
    /* loaded from: classes.dex */
    public class C3347c implements rw1.InterfaceC2894a<Integer, C0645al> {
        public C3347c() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Integer num, C0645al c0645al) {
            if (num.intValue() == 2) {
                vm0.this.m7050e(false);
                vm0.this.m7049f();
            }
        }
    }

    /* renamed from: com.daaw.vm0$d */
    /* loaded from: classes.dex */
    public class C3348d implements sw1.InterfaceC2987a<Integer, Integer, Boolean> {
        public C3348d() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(Integer num, Integer num2, Boolean bool) {
            if (num.intValue() == SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14274J) {
                vm0.this.m7048g(num2.intValue());
            }
        }
    }

    /* renamed from: com.daaw.vm0$e */
    /* loaded from: classes.dex */
    public class C3349e implements vw1.InterfaceC3381a<Boolean> {
        public C3349e() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Boolean mo3126a() {
            int i = vm0.this.f30308b;
            if (i != 0) {
                return Boolean.valueOf(i != 0);
            }
            return Boolean.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14274J) != 0);
        }
    }

    /* renamed from: com.daaw.vm0$f */
    /* loaded from: classes.dex */
    public class C3350f implements rw1.InterfaceC2894a<List<tx0>, Integer> {
        public C3350f() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(List<tx0> list, Integer num) {
            l01 m17249c = l01.m17249c();
            if (m17249c != null) {
                m17249c.m17263J(list, num.intValue(), null);
            }
        }
    }

    /* renamed from: com.daaw.vm0$g */
    /* loaded from: classes.dex */
    public class C3351g implements pw1.InterfaceC2649a {
        public C3351g() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            MainActivity m26903r0 = MainActivity.m26903r0();
            if (m26903r0 != null) {
                m26903r0.m26908m0();
            }
        }
    }

    /* renamed from: com.daaw.vm0$h */
    /* loaded from: classes.dex */
    public class C3352h implements rw1.InterfaceC2894a<Integer, Activity> {
        public C3352h() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Integer num, Activity activity) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14271G, num.intValue());
        }
    }

    /* renamed from: com.daaw.vm0$i */
    /* loaded from: classes.dex */
    public class C3353i implements qw1.InterfaceC2788a<Context> {
        public C3353i() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Context context) {
            m30 m26906o0 = MainActivity.m26906o0();
            if (m26906o0 != null) {
                m26906o0.m16253q();
            }
        }
    }

    /* renamed from: com.daaw.vm0$j */
    /* loaded from: classes.dex */
    public class C3354j implements rw1.InterfaceC2894a<Float, Context> {
        public C3354j() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Float f, Context context) {
            m30 m26906o0 = MainActivity.m26906o0();
            if (m26906o0 != null) {
                m26906o0.m16252r(f.floatValue());
            }
        }
    }

    public vm0() {
        MainActivity.f3726s0.m8755b(new C3346b(), this.f30307a);
        MainActivity.f3725r0.m10861b(new C3347c(), this.f30307a);
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14297g.m9794b(new C3348d(), this.f30307a);
        MainActivity.f3728u0.m6691b(new C3349e(), this.f30307a);
        MainActivity.f3733z0.m10861b(new C3350f(), this.f30307a);
        C3265uy.f29609a.m12989b(new C3351g(), this.f30307a);
        MainActivity.f3723p0.m10861b(new C3352h(), this.f30307a);
        MainActivity.f3703B0.m12017b(new C3353i(), this.f30307a);
        MainActivity.f3704C0.m10861b(new C3354j(), this.f30307a);
        MainActivity.f3708G0.m6691b(new C3345a(), this.f30307a);
    }

    /* renamed from: c */
    public int m7052c(MainActivity mainActivity) {
        int rotation = ((WindowManager) mainActivity.getSystemService("window")).getDefaultDisplay().getRotation();
        if (mainActivity.getResources().getConfiguration().orientation == 1) {
            if (rotation != 0) {
                if (rotation == 1 || rotation == 2) {
                    return 3;
                }
                return rotation != 3 ? 0 : 1;
            }
            return 1;
        } else if (mainActivity.getResources().getConfiguration().orientation == 2) {
            if (rotation == 0 || rotation == 1) {
                return 2;
            }
            return (rotation == 2 || rotation == 3) ? 4 : 0;
        } else {
            return 0;
        }
    }

    /* renamed from: d */
    public void m7051d(MainActivity mainActivity, int i) {
        if (i == 0 || !(i == 1 || i == 2 || i == 3 || i == 4)) {
            mainActivity.setRequestedOrientation(-1);
        } else {
            mainActivity.setRequestedOrientation(14);
        }
    }

    /* renamed from: e */
    public void m7050e(boolean z) {
        int i;
        this.f30308b = 0;
        if (z) {
            MainActivity m26903r0 = MainActivity.m26903r0();
            if (m26903r0 != null) {
                this.f30308b = m7052c(m26903r0);
            }
            this.f30309c = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14274J);
            i = this.f30308b;
        } else {
            i = this.f30309c;
        }
        m7048g(i);
    }

    /* renamed from: f */
    public final void m7049f() {
        int m18916k = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14274J);
        if (m18916k == 0) {
            MainActivity m26903r0 = MainActivity.m26903r0();
            if (m26903r0 != null) {
                m18916k = m7052c(m26903r0);
            }
        } else {
            m18916k = 0;
        }
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14274J, m18916k);
    }

    /* renamed from: g */
    public final void m7048g(int i) {
        MainActivity m26903r0 = MainActivity.m26903r0();
        if (m26903r0 != null) {
            m26903r0.m26934R0(i != 0, false);
            if (i == 0) {
                m26903r0.setRequestedOrientation(-1);
            } else if (m26903r0.getRequestedOrientation() == -1) {
                m7051d(m26903r0, i);
            }
        }
    }
}
