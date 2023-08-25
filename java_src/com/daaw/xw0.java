package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.daaw.SurfaceHolder$CallbackC2495oz;
import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.playback.C0743c;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.rw1;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.tx0;
import com.daaw.uw1;
import com.daaw.vw1;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class xw0 {

    /* renamed from: d */
    public static volatile boolean f33007d;

    /* renamed from: e */
    public static volatile boolean f33008e;

    /* renamed from: f */
    public static volatile tx0 f33009f = tx0.f28191k;

    /* renamed from: g */
    public static volatile tx0.C3143b f33010g = tx0.f28188h;

    /* renamed from: h */
    public static volatile hx0 f33011h = hx0.f13043c;

    /* renamed from: i */
    public static volatile long f33012i = 0;

    /* renamed from: j */
    public static volatile int f33013j = 0;

    /* renamed from: k */
    public static volatile int f33014k = 10;

    /* renamed from: l */
    public static volatile boolean f33015l = false;

    /* renamed from: m */
    public static volatile boolean f33016m = true;

    /* renamed from: a */
    public uf1 f33017a;

    /* renamed from: b */
    public List<Object> f33018b = new LinkedList();

    /* renamed from: c */
    public Handler f33019c = new Handler();

    /* renamed from: com.daaw.xw0$a */
    /* loaded from: classes.dex */
    public class C3597a implements qw1.InterfaceC2788a<Boolean> {
        public C3597a() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Boolean bool) {
            xw0.f33015l = bool.booleanValue();
        }
    }

    /* renamed from: com.daaw.xw0$a0 */
    /* loaded from: classes.dex */
    public class C3598a0 implements qw1.InterfaceC2788a<Integer> {
        public C3598a0() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Integer num) {
            C0743c.f4016j.m19309a(num);
        }
    }

    /* renamed from: com.daaw.xw0$b */
    /* loaded from: classes.dex */
    public class C3599b implements vw1.InterfaceC3381a<Boolean> {
        public C3599b() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Boolean mo3126a() {
            return Boolean.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14319r));
        }
    }

    /* renamed from: com.daaw.xw0$b0 */
    /* loaded from: classes.dex */
    public class C3600b0 implements vw1.InterfaceC3381a<lo1<tx0.C3143b, hx0>> {
        public C3600b0() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public lo1<tx0.C3143b, hx0> mo3126a() {
            return new lo1<>(xw0.f33010g, xw0.f33011h);
        }
    }

    /* renamed from: com.daaw.xw0$c */
    /* loaded from: classes.dex */
    public class C3601c implements vw1.InterfaceC3381a<Float> {
        public C3601c() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Float mo3126a() {
            return Float.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14279O) * 0.01f);
        }
    }

    /* renamed from: com.daaw.xw0$c0 */
    /* loaded from: classes.dex */
    public class C3602c0 implements vw1.InterfaceC3381a<lo1<Boolean, Boolean>> {
        public C3602c0() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public lo1<Boolean, Boolean> mo3126a() {
            return new lo1<>(Boolean.valueOf(xw0.f33007d), Boolean.valueOf(xw0.f33008e));
        }
    }

    /* renamed from: com.daaw.xw0$d */
    /* loaded from: classes.dex */
    public class C3603d implements vw1.InterfaceC3381a<Float> {
        public C3603d() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Float mo3126a() {
            return Float.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14280P) * 0.001f * xw0.this.m4469e());
        }
    }

    /* renamed from: com.daaw.xw0$d0 */
    /* loaded from: classes.dex */
    public class C3604d0 implements pw1.InterfaceC2649a {
        public C3604d0() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            C0743c.f4009c.m20363a();
        }
    }

    /* renamed from: com.daaw.xw0$e */
    /* loaded from: classes.dex */
    public class C3605e implements pw1.InterfaceC2649a {

        /* renamed from: com.daaw.xw0$e$a */
        /* loaded from: classes.dex */
        public class RunnableC3606a implements Runnable {
            public RunnableC3606a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l01 m17249c = l01.m17249c();
                if (m17249c != null) {
                    if (m17249c.m17237o() == 0) {
                        m17249c.m17253T(1, true);
                    } else {
                        m17249c.m17253T(0, true);
                    }
                }
            }
        }

        public C3605e() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            xw0.this.f33019c.post(new RunnableC3606a());
        }
    }

    /* renamed from: com.daaw.xw0$e0 */
    /* loaded from: classes.dex */
    public class C3607e0 implements qw1.InterfaceC2788a<Activity> {
        public C3607e0() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Activity activity) {
            xw0.f33016m = false;
            C0743c.f4013g.m20363a();
            C0743c.f4014h.m19309a(Boolean.FALSE);
        }
    }

    /* renamed from: com.daaw.xw0$f */
    /* loaded from: classes.dex */
    public class C3608f implements pw1.InterfaceC2649a {

        /* renamed from: com.daaw.xw0$f$a */
        /* loaded from: classes.dex */
        public class RunnableC3609a implements Runnable {
            public RunnableC3609a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l01.m17249c().m17265H();
            }
        }

        public C3608f() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            xw0.this.f33019c.post(new RunnableC3609a());
        }
    }

    /* renamed from: com.daaw.xw0$f0 */
    /* loaded from: classes.dex */
    public class C3610f0 implements qw1.InterfaceC2788a<Activity> {
        public C3610f0() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Activity activity) {
            xw0.f33016m = true;
            C0743c.f4014h.m19309a(Boolean.TRUE);
        }
    }

    /* renamed from: com.daaw.xw0$g */
    /* loaded from: classes.dex */
    public class C3611g implements pw1.InterfaceC2649a {

        /* renamed from: com.daaw.xw0$g$a */
        /* loaded from: classes.dex */
        public class RunnableC3612a implements Runnable {
            public RunnableC3612a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l01.m17249c().m17232t();
            }
        }

        public C3611g() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            xw0.this.f33019c.post(new RunnableC3612a());
        }
    }

    /* renamed from: com.daaw.xw0$g0 */
    /* loaded from: classes.dex */
    public class C3613g0 implements vw1.InterfaceC3381a<Boolean> {
        public C3613g0() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Boolean mo3126a() {
            return Boolean.valueOf(xw0.f33016m);
        }
    }

    /* renamed from: com.daaw.xw0$h */
    /* loaded from: classes.dex */
    public class C3614h implements uw1.InterfaceC3263a<Context, C1652i2, af0, Integer, Integer> {

        /* renamed from: com.daaw.xw0$h$a */
        /* loaded from: classes.dex */
        public class RunnableC3615a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ C1652i2 f33038p;

            /* renamed from: q */
            public final /* synthetic */ af0 f33039q;

            /* renamed from: r */
            public final /* synthetic */ Integer f33040r;

            /* renamed from: s */
            public final /* synthetic */ Integer f33041s;

            public RunnableC3615a(C1652i2 c1652i2, af0 af0Var, Integer num, Integer num2) {
                this.f33038p = c1652i2;
                this.f33039q = af0Var;
                this.f33040r = num;
                this.f33041s = num2;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1354g2 c1354g2 = new C1354g2();
                C1652i2 c1652i2 = this.f33038p;
                c1354g2.m22067v(false, c1652i2.f13192a, c1652i2.f13193b, c1652i2.f13194c, this.f33039q, this.f33040r.intValue(), this.f33041s.intValue(), 0, -1, false, null, null);
            }
        }

        public C3614h() {
        }

        @Override // com.daaw.uw1.InterfaceC3263a
        /* renamed from: b */
        public void mo3116a(Context context, C1652i2 c1652i2, af0 af0Var, Integer num, Integer num2) {
            xw0.this.f33019c.post(new RunnableC3615a(c1652i2, af0Var, num, num2));
        }
    }

    /* renamed from: com.daaw.xw0$h0 */
    /* loaded from: classes.dex */
    public class C3616h0 implements sw1.InterfaceC2987a<Integer, Integer, Boolean> {
        public C3616h0() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(Integer num, Integer num2, Boolean bool) {
            iw1<Float> iw1Var;
            float intValue;
            float m4469e;
            if (num.intValue() == SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14275K) {
                xw0.this.m4463k(num2);
                return;
            }
            if (num.intValue() == SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14279O) {
                ko0 m17610q = ko0.m17610q();
                if (m17610q != null) {
                    m17610q.m17606u(xw0.this.m4464j());
                }
                iw1Var = C0743c.f4025s;
                intValue = num2.intValue();
                m4469e = 0.01f;
            } else if (num.intValue() != SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14280P) {
                return;
            } else {
                iw1Var = C0743c.f4026t;
                intValue = num2.intValue() * 0.001f;
                m4469e = xw0.this.m4469e();
            }
            iw1Var.m19309a(Float.valueOf(intValue * m4469e));
        }
    }

    /* renamed from: com.daaw.xw0$i */
    /* loaded from: classes.dex */
    public class C3617i implements qw1.InterfaceC2788a<Integer> {
        public C3617i() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Integer num) {
            if (num.intValue() == 0) {
                SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14275K, 0);
            } else if (num.intValue() == 1) {
                SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14275K, 1);
            }
        }
    }

    /* renamed from: com.daaw.xw0$i0 */
    /* loaded from: classes.dex */
    public class C3618i0 implements rw1.InterfaceC2894a<Integer, Boolean> {
        public C3618i0() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Integer num, Boolean bool) {
            if (num.intValue() == SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14319r) {
                ko0 m17610q = ko0.m17610q();
                if (m17610q != null) {
                    m17610q.m17636A(bool.booleanValue());
                }
                C0743c.f4023q.m19309a(bool);
            }
        }
    }

    /* renamed from: com.daaw.xw0$j */
    /* loaded from: classes.dex */
    public class C3619j implements qw1.InterfaceC2788a<C0645al> {
        public C3619j() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(C0645al c0645al) {
            SurfaceHolder$CallbackC2495oz.C2500e.f22159b.m18205a(c0645al.m27378a(), "Select track");
        }
    }

    /* renamed from: com.daaw.xw0$j0 */
    /* loaded from: classes.dex */
    public class RunnableC3620j0 implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ boolean f33047p;

        /* renamed from: q */
        public final /* synthetic */ tx0 f33048q;

        /* renamed from: r */
        public final /* synthetic */ Long f33049r;

        /* renamed from: s */
        public final /* synthetic */ Integer f33050s;

        public RunnableC3620j0(boolean z, tx0 tx0Var, Long l, Integer num) {
            this.f33047p = z;
            this.f33048q = tx0Var;
            this.f33049r = l;
            this.f33050s = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            l01 m17249c;
            l01 m17249c2;
            if (this.f33047p && xw0.this.f33017a.m8278a(this.f33048q)) {
                m17249c2 = l01.m17249c();
                if (m17249c2 == null) {
                    return;
                }
            } else if (this.f33050s.intValue() != 1) {
                if (this.f33050s.intValue() == 2) {
                    m17249c = l01.m17249c();
                    if (m17249c == null) {
                        return;
                    }
                    if (m17249c.m17235q()) {
                        m17249c.m17266G(this.f33049r);
                        return;
                    }
                } else {
                    m17249c = l01.m17249c();
                    if (m17249c == null) {
                        return;
                    }
                }
                m17249c.m17233s(this.f33049r);
                return;
            } else {
                m17249c2 = l01.m17249c();
                if (m17249c2 == null) {
                    return;
                }
            }
            m17249c2.m17267F(this.f33049r);
        }
    }

    /* renamed from: com.daaw.xw0$k */
    /* loaded from: classes.dex */
    public class C3621k implements qw1.InterfaceC2788a<Activity> {
        public C3621k() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Activity activity) {
            l01 m17249c = l01.m17249c();
            if (m17249c != null) {
                m17249c.m17228x(activity);
            }
            C0743c.f4008b.m20363a();
        }
    }

    /* renamed from: com.daaw.xw0$k0 */
    /* loaded from: classes.dex */
    public class RunnableC3622k0 implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ String f33053p;

        /* renamed from: q */
        public final /* synthetic */ Boolean f33054q;

        /* renamed from: r */
        public final /* synthetic */ Boolean f33055r;

        /* renamed from: s */
        public final /* synthetic */ boolean f33056s;

        public RunnableC3622k0(String str, Boolean bool, Boolean bool2, boolean z) {
            this.f33053p = str;
            this.f33054q = bool;
            this.f33055r = bool2;
            this.f33056s = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.f33053p;
            if (str != null && str.length() > 0) {
                C3385vy.f30703a.m12018a(this.f33053p);
            }
            ko0 m17610q = ko0.m17610q();
            if (m17610q != null) {
                m17610q.m17629H(this.f33054q.booleanValue(), this.f33055r.booleanValue());
            }
            MainActivity m26903r0 = MainActivity.m26903r0();
            if (m26903r0 != null) {
                m26903r0.m26941K0(this.f33056s || (m26903r0.f3735N == 2 && this.f33054q.booleanValue()), this.f33056s);
            }
        }
    }

    /* renamed from: com.daaw.xw0$l */
    /* loaded from: classes.dex */
    public class C3623l implements pw1.InterfaceC2649a {
        public C3623l() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18915k0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14319r);
        }
    }

    /* renamed from: com.daaw.xw0$l0 */
    /* loaded from: classes.dex */
    public class RunnableC3624l0 implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ boolean f33059p;

        public RunnableC3624l0(boolean z) {
            this.f33059p = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity m26903r0 = MainActivity.m26903r0();
            if (m26903r0 != null) {
                m26903r0.m26941K0(this.f33059p || (m26903r0.f3735N == 2 && xw0.f33007d), this.f33059p);
            }
        }
    }

    /* renamed from: com.daaw.xw0$m */
    /* loaded from: classes.dex */
    public class C3625m implements vw1.InterfaceC3381a<Integer> {
        public C3625m() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Integer mo3126a() {
            return Integer.valueOf(xw0.this.m4466h());
        }
    }

    /* renamed from: com.daaw.xw0$m0 */
    /* loaded from: classes.dex */
    public class C3626m0 implements vw1.InterfaceC3381a<Integer> {
        public C3626m0() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Integer mo3126a() {
            return Integer.valueOf(xw0.this.m4466h());
        }
    }

    /* renamed from: com.daaw.xw0$n */
    /* loaded from: classes.dex */
    public class C3627n implements vw1.InterfaceC3381a<Boolean> {
        public C3627n() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Boolean mo3126a() {
            return Boolean.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14319r));
        }
    }

    /* renamed from: com.daaw.xw0$n0 */
    /* loaded from: classes.dex */
    public class C3628n0 implements tw1.InterfaceC3140a<tx0, vd0, tx0.C3143b, hx0> {

        /* renamed from: com.daaw.xw0$n0$a */
        /* loaded from: classes.dex */
        public class RunnableC3629a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ tx0.C3143b f33065p;

            public RunnableC3629a(tx0.C3143b c3143b) {
                this.f33065p = c3143b;
            }

            @Override // java.lang.Runnable
            public void run() {
                MainActivity m26903r0 = MainActivity.m26903r0();
                if (m26903r0 != null) {
                    m26903r0.m26935Q0(this.f33065p);
                }
                ko0 m17610q = ko0.m17610q();
                if (m17610q != null) {
                    m17610q.m17628I(xw0.f33010g, xw0.f33011h);
                }
            }
        }

        public C3628n0() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(tx0 tx0Var, vd0 vd0Var, tx0.C3143b c3143b, hx0 hx0Var) {
            xw0.f33009f = tx0Var;
            xw0.f33011h = hx0Var;
            xw0.f33010g = c3143b;
            xw0.this.f33019c.post(new RunnableC3629a(c3143b));
        }
    }

    /* renamed from: com.daaw.xw0$o */
    /* loaded from: classes.dex */
    public class C3630o implements vw1.InterfaceC3381a<Boolean> {
        public C3630o() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Boolean mo3126a() {
            return Boolean.valueOf(xw0.this.m4464j());
        }
    }

    /* renamed from: com.daaw.xw0$o0 */
    /* loaded from: classes.dex */
    public class C3631o0 implements qw1.InterfaceC2788a<Long> {
        public C3631o0() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Long l) {
            xw0.f33012i = l.longValue();
        }
    }

    /* renamed from: com.daaw.xw0$p */
    /* loaded from: classes.dex */
    public class C3632p implements vw1.InterfaceC3381a<lo1<Integer, Integer>> {
        public C3632p() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public lo1<Integer, Integer> mo3126a() {
            return new lo1<>(Integer.valueOf(C0743c.f4022p.m15745a(0).intValue()), Integer.valueOf(xw0.f33014k));
        }
    }

    /* renamed from: com.daaw.xw0$p0 */
    /* loaded from: classes.dex */
    public class C3633p0 implements qw1.InterfaceC2788a<Integer> {

        /* renamed from: com.daaw.xw0$p0$a */
        /* loaded from: classes.dex */
        public class RunnableC3634a implements Runnable {
            public RunnableC3634a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ko0 m17610q = ko0.m17610q();
                if (m17610q != null) {
                    m17610q.m17602y(xw0.f33013j);
                }
            }
        }

        public C3633p0() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Integer num) {
            xw0.f33013j = num.intValue();
            xw0.this.f33019c.post(new RunnableC3634a());
        }
    }

    /* renamed from: com.daaw.xw0$q */
    /* loaded from: classes.dex */
    public class C3635q implements vw1.InterfaceC3381a<lo1<Integer, Integer>> {
        public C3635q() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public lo1<Integer, Integer> mo3126a() {
            return new lo1<>(Integer.valueOf((SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14279O) / 20) + 5), 10);
        }
    }

    /* renamed from: com.daaw.xw0$q0 */
    /* loaded from: classes.dex */
    public class C3636q0 implements qw1.InterfaceC2788a<Context> {

        /* renamed from: com.daaw.xw0$q0$a */
        /* loaded from: classes.dex */
        public class RunnableC3637a implements Runnable {
            public RunnableC3637a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ko0 m17610q = ko0.m17610q();
                if (m17610q != null) {
                    m17610q.m17629H(false, false);
                }
            }
        }

        public C3636q0() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Context context) {
            xw0.this.f33019c.post(new RunnableC3637a());
        }
    }

    /* renamed from: com.daaw.xw0$r */
    /* loaded from: classes.dex */
    public class C3638r implements vw1.InterfaceC3381a<lo1<Integer, Integer>> {
        public C3638r() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public lo1<Integer, Integer> mo3126a() {
            return null;
        }
    }

    /* renamed from: com.daaw.xw0$r0 */
    /* loaded from: classes.dex */
    public class C3639r0 implements qw1.InterfaceC2788a<Integer> {
        public C3639r0() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Integer num) {
            xw0.f33014k = num.intValue();
        }
    }

    /* renamed from: com.daaw.xw0$s */
    /* loaded from: classes.dex */
    public class C3640s implements vw1.InterfaceC3381a<mo1<Integer, Integer, Float>> {
        public C3640s() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public mo1<Integer, Integer, Float> mo3126a() {
            return new mo1<>(Integer.valueOf((SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14280P) / 1000) + 1), 10, Float.valueOf(xw0.this.m4469e()));
        }
    }

    /* renamed from: com.daaw.xw0$t */
    /* loaded from: classes.dex */
    public class C3641t implements rw1.InterfaceC2894a<Integer, Integer> {
        public C3641t() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Integer num, Integer num2) {
            C0743c.f4020n.m19309a(num);
        }
    }

    /* renamed from: com.daaw.xw0$u */
    /* loaded from: classes.dex */
    public class C3642u implements rw1.InterfaceC2894a<Integer, Integer> {
        public C3642u() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Integer num, Integer num2) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14279O, (num.intValue() - 5) * 20);
        }
    }

    /* renamed from: com.daaw.xw0$v */
    /* loaded from: classes.dex */
    public class C3643v implements qw1.InterfaceC2788a<Context> {
        public C3643v() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Context context) {
            gr1.m21332c();
            l01 m17249c = l01.m17249c();
            if (m17249c != null) {
                m17249c.m17228x(context);
            }
        }
    }

    /* renamed from: com.daaw.xw0$w */
    /* loaded from: classes.dex */
    public class C3644w implements rw1.InterfaceC2894a<Integer, Integer> {
        public C3644w() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Integer num, Integer num2) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14280P, (num.intValue() - 1) * 1000);
        }
    }

    /* renamed from: com.daaw.xw0$x */
    /* loaded from: classes.dex */
    public class C3645x implements vw1.InterfaceC3381a<Boolean> {
        public C3645x() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Boolean mo3126a() {
            return Boolean.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14335z));
        }
    }

    /* renamed from: com.daaw.xw0$y */
    /* loaded from: classes.dex */
    public class C3646y implements qw1.InterfaceC2788a<Boolean> {
        public C3646y() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Boolean bool) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18935a0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14335z, bool.booleanValue());
        }
    }

    /* renamed from: com.daaw.xw0$z */
    /* loaded from: classes.dex */
    public class C3647z implements vw1.InterfaceC3381a<Integer> {
        public C3647z() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Integer mo3126a() {
            return Integer.valueOf(xw0.f33013j);
        }
    }

    public xw0(uf1 uf1Var) {
        this.f33017a = uf1Var;
        MainActivity.f3719l0.m12017b(new C3621k(), this.f33018b);
        MediaPlaybackService.f3859c0.m12017b(new C3643v(), this.f33018b);
        MediaPlaybackService.f3862f0.m6691b(new C3613g0(), this.f33018b);
        MediaPlaybackService.f3861e0.m6691b(new C3626m0(), this.f33018b);
        MediaPlaybackService.f3864h0.m8755b(new C3628n0(), this.f33018b);
        MediaPlaybackService.f3875s0.m12017b(new C3631o0(), this.f33018b);
        MediaPlaybackService.f3865i0.m12017b(new C3633p0(), this.f33018b);
        MediaPlaybackService.f3860d0.m12017b(new C3636q0(), this.f33018b);
        MediaPlaybackService.f3866j0.m12017b(new C3639r0(), this.f33018b);
        MediaPlaybackService.f3867k0.m12017b(new C3597a(), this.f33018b);
        MediaPlaybackService.f3868l0.m6691b(new C3599b(), this.f33018b);
        MediaPlaybackService.f3869m0.m6691b(new C3601c(), this.f33018b);
        MediaPlaybackService.f3870n0.m6691b(new C3603d(), this.f33018b);
        MediaPlaybackService.f3871o0.m12989b(new C3605e(), this.f33018b);
        MediaPlaybackService.f3874r0.m12989b(new C3608f(), this.f33018b);
        MediaPlaybackService.f3873q0.m12989b(new C3611g(), this.f33018b);
        MediaPlaybackService.f3882z0.m7666b(new C3614h(), this.f33018b);
        ko0.f16527g0.m12017b(new C3617i(), this.f33018b);
        ko0.f16528h0.m12017b(new C3619j(), this.f33018b);
        ko0.f16519Y.m12989b(new C3623l(), this.f33018b);
        ko0.f16526f0.m6691b(new C3625m(), this.f33018b);
        ko0.f16500F.m6691b(new C3627n(), this.f33018b);
        ko0.f16501G.m6691b(new C3630o(), this.f33018b);
        ko0.f16510P.m6691b(new C3632p(), this.f33018b);
        ko0.f16511Q.m6691b(new C3635q(), this.f33018b);
        ko0.f16512R.m6691b(new C3638r(), this.f33018b);
        ko0.f16513S.m6691b(new C3640s(), this.f33018b);
        ko0.f16514T.m10861b(new C3641t(), this.f33018b);
        ko0.f16515U.m10861b(new C3642u(), this.f33018b);
        ko0.f16516V.m10861b(new C3644w(), this.f33018b);
        ko0.f16517W.m6691b(new C3645x(), this.f33018b);
        ko0.f16518X.m12017b(new C3646y(), this.f33018b);
        ko0.f16524d0.m6691b(new C3647z(), this.f33018b);
        ko0.f16525e0.m12017b(new C3598a0(), this.f33018b);
        ko0.f16507M.m6691b(new C3600b0(), this.f33018b);
        ko0.f16508N.m6691b(new C3602c0(), this.f33018b);
        MainActivity.f3722o0.m12989b(new C3604d0(), this.f33018b);
        MainActivity.f3716i0.m12017b(new C3607e0(), this.f33018b);
        MainActivity.f3719l0.m12017b(new C3610f0(), this.f33018b);
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14297g.m9794b(new C3616h0(), this.f33018b);
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14299h.m10861b(new C3618i0(), this.f33018b);
    }

    /* renamed from: e */
    public final float m4469e() {
        return 1.0f;
    }

    /* renamed from: f */
    public void m4468f(Boolean bool, Boolean bool2, Integer num, String str, tx0 tx0Var, boolean z) {
        f33007d = bool.booleanValue();
        f33008e = bool2.booleanValue();
        this.f33019c.post(new RunnableC3622k0(str, bool, bool2, z));
    }

    /* renamed from: g */
    public void m4467g(Integer num, Boolean bool, Long l, boolean z, tx0 tx0Var) {
        if (bool.booleanValue()) {
            this.f33019c.post(new RunnableC3620j0(z, tx0Var, l, num));
        }
    }

    /* renamed from: h */
    public final int m4466h() {
        return SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14275K);
    }

    /* renamed from: i */
    public void m4465i(Integer num, Activity activity, boolean z) {
        MainActivity m26903r0 = MainActivity.m26903r0();
        if (m26903r0 != null) {
            m26903r0.m26941K0(z || (num.intValue() == 2 && f33007d), z);
        }
    }

    /* renamed from: j */
    public final boolean m4464j() {
        return SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14279O) != 0;
    }

    /* renamed from: k */
    public void m4463k(Integer num) {
        C0743c.f4028v.m19309a(num);
        ko0 m17610q = ko0.m17610q();
        if (m17610q != null) {
            m17610q.m17603x(num.intValue());
        }
    }

    /* renamed from: l */
    public void m4462l(boolean z) {
        this.f33019c.post(new RunnableC3624l0(z));
    }
}
