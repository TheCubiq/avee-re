package com.daaw;

import android.os.Handler;
import com.daaw.C2120lv;
import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.playback.AbstractC0738b;
import com.daaw.avee.comp.playback.C0743c;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.qw1;
import com.daaw.rw1;
import com.daaw.vw1;
import com.daaw.ww1;
import java.util.LinkedList;
import java.util.List;
/* renamed from: com.daaw.j7 */
/* loaded from: classes.dex */
public class C1800j7 {

    /* renamed from: a */
    public List<Object> f14467a = new LinkedList();

    /* renamed from: b */
    public Handler f14468b = new Handler();

    /* renamed from: c */
    public C2120lv[] f14469c;

    /* renamed from: d */
    public C2120lv f14470d;

    /* renamed from: e */
    public C2120lv f14471e;

    /* renamed from: com.daaw.j7$a */
    /* loaded from: classes.dex */
    public class C1801a implements rw1.InterfaceC2894a<Integer, C0645al> {
        public C1801a() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Integer num, C0645al c0645al) {
            if (num.intValue() == 3) {
                DialogFragmentC2789qx.m11984q(c0645al);
            }
        }
    }

    /* renamed from: com.daaw.j7$b */
    /* loaded from: classes.dex */
    public class C1802b implements qw1.InterfaceC2788a<C0645al> {
        public C1802b() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(C0645al c0645al) {
            DialogFragmentC2789qx.m11984q(c0645al);
        }
    }

    /* renamed from: com.daaw.j7$c */
    /* loaded from: classes.dex */
    public class C1803c implements vw1.InterfaceC3381a<Boolean> {
        public C1803c() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Boolean mo3126a() {
            return Boolean.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14266B));
        }
    }

    /* renamed from: com.daaw.j7$d */
    /* loaded from: classes.dex */
    public class C1804d implements vw1.InterfaceC3381a<C2895rx> {
        public C1804d() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public C2895rx mo3126a() {
            AbstractC0738b.C0740b m15745a = C0743c.f4030x.m15745a(null);
            if (m15745a == null) {
                return null;
            }
            return C1800j7.this.m18779e(m15745a);
        }
    }

    /* renamed from: com.daaw.j7$e */
    /* loaded from: classes.dex */
    public class C1805e implements rw1.InterfaceC2894a<Integer, Boolean> {
        public C1805e() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Integer num, Boolean bool) {
            ko0 m17610q;
            if (num.intValue() != SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14266B || (m17610q = ko0.m17610q()) == null) {
                return;
            }
            m17610q.m17604w(bool.booleanValue());
        }
    }

    /* renamed from: com.daaw.j7$f */
    /* loaded from: classes.dex */
    public class C1806f implements rw1.InterfaceC2894a<C2988sx, C2895rx> {
        public C1806f() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(C2988sx c2988sx, C2895rx c2895rx) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18935a0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14266B, c2988sx.f26727a);
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14281Q, c2988sx.f26728b);
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18923g0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14310m0, C2120lv.m16494e(c2988sx.f26729c));
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14282R, (int) (c2988sx.f26730d * 1000.0f));
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14283S, (int) (c2988sx.f26731e * 1000.0f));
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14284T, (int) (c2988sx.f26733g * 1000.0f));
            AbstractC0738b.C0741c c0741c = new AbstractC0738b.C0741c();
            C2120lv.C2121a[] c2121aArr = c2988sx.f26732f.f17809b;
            float[] fArr = new float[c2121aArr.length];
            float[] fArr2 = new float[c2121aArr.length];
            int i = 0;
            while (true) {
                C2120lv c2120lv = c2988sx.f26732f;
                C2120lv.C2121a[] c2121aArr2 = c2120lv.f17809b;
                if (i >= c2121aArr2.length) {
                    C2650px.m12963b(c2120lv, C1800j7.this.f14470d, C1800j7.this.f14471e, c2988sx.f26730d, c2988sx.f26731e, fArr, fArr2);
                    c0741c.f4002a = c2988sx.f26727a;
                    c0741c.f4003b = false;
                    c0741c.f4004c = -1;
                    c0741c.f4005d = fArr;
                    c0741c.f4006e = c2988sx.f26733g;
                    C0743c.f4031y.m19309a(c0741c);
                    return;
                }
                fArr2[i] = c2121aArr2[i].f17810a;
                i++;
            }
        }
    }

    /* renamed from: com.daaw.j7$g */
    /* loaded from: classes.dex */
    public class C1807g implements ww1.InterfaceC3477a<String, AbstractC0738b.C0741c> {
        public C1807g() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public AbstractC0738b.C0741c mo5751b(String str) {
            AbstractC0738b.C0741c c0741c = new AbstractC0738b.C0741c();
            C2120lv m16497b = C2120lv.m16497b(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18906t(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14310m0));
            float m18916k = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14282R) * 0.001f;
            float m18916k2 = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14283S) * 0.001f;
            C2120lv.C2121a[] c2121aArr = m16497b.f17809b;
            float[] fArr = new float[c2121aArr.length];
            float[] fArr2 = new float[c2121aArr.length];
            int i = 0;
            while (true) {
                C2120lv.C2121a[] c2121aArr2 = m16497b.f17809b;
                if (i >= c2121aArr2.length) {
                    C2650px.m12963b(m16497b, C1800j7.this.f14470d, C1800j7.this.f14471e, m18916k, m18916k2, fArr, fArr2);
                    c0741c.f4002a = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14266B);
                    c0741c.f4003b = false;
                    c0741c.f4004c = -1;
                    c0741c.f4005d = fArr;
                    c0741c.f4006e = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14284T) * 0.001f;
                    return c0741c;
                }
                fArr2[i] = c2121aArr2[i].f17810a;
                i++;
            }
        }
    }

    /* renamed from: com.daaw.j7$h */
    /* loaded from: classes.dex */
    public class C1808h implements ww1.InterfaceC3477a<String, Boolean> {
        public C1808h() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public Boolean mo5751b(String str) {
            return Boolean.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14266B));
        }
    }

    /* renamed from: com.daaw.j7$i */
    /* loaded from: classes.dex */
    public class C1809i implements qw1.InterfaceC2788a<AbstractC0738b.C0740b> {

        /* renamed from: com.daaw.j7$i$a */
        /* loaded from: classes.dex */
        public class RunnableC1810a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ AbstractC0738b.C0740b f14481p;

            public RunnableC1810a(AbstractC0738b.C0740b c0740b) {
                this.f14481p = c0740b;
            }

            @Override // java.lang.Runnable
            public void run() {
                DialogFragmentC2789qx.f24569K.m12018a(C1800j7.this.m18779e(this.f14481p));
            }
        }

        public C1809i() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(AbstractC0738b.C0740b c0740b) {
            C1800j7.this.f14468b.post(new RunnableC1810a(c0740b));
        }
    }

    public C1800j7() {
        C2120lv c2120lv = new C2120lv("Bass Boost", 2);
        this.f14470d = c2120lv;
        c2120lv.f17809b[0] = new C2120lv.C2121a(100.0f, 1.0f);
        this.f14470d.f17809b[1] = new C2120lv.C2121a(500.0f, 0.0f);
        C2120lv c2120lv2 = new C2120lv("Treble Boost", 2);
        this.f14471e = c2120lv2;
        c2120lv2.f17809b[0] = new C2120lv.C2121a(1000.0f, 0.0f);
        this.f14471e.f17809b[1] = new C2120lv.C2121a(20000.0f, 1.0f);
        this.f14471e.f17809b[1] = new C2120lv.C2121a(20000.0f, 1.0f);
        m18778f();
        MainActivity.f3725r0.m10861b(new C1801a(), this.f14467a);
        ko0.f16520Z.m12017b(new C1802b(), this.f14467a);
        ko0.f16521a0.m6691b(new C1803c(), this.f14467a);
        DialogFragmentC2789qx.f24571M.m6691b(new C1804d(), this.f14467a);
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14299h.m10861b(new C1805e(), this.f14467a);
        DialogFragmentC2789qx.f24570L.m10861b(new C1806f(), this.f14467a);
        MediaPlaybackService.f3879w0.m5752b(new C1807g(), this.f14467a);
        MediaPlaybackService.f3880x0.m5752b(new C1808h(), this.f14467a);
        MediaPlaybackService.f3881y0.m12017b(new C1809i(), this.f14467a);
    }

    /* renamed from: e */
    public final C2895rx m18779e(AbstractC0738b.C0740b c0740b) {
        if (c0740b == null) {
            c0740b = AbstractC0738b.C0740b.f3995g;
        }
        C2895rx c2895rx = new C2895rx();
        c2895rx.f25678a = c0740b.f3996a;
        C2120lv m16497b = C2120lv.m16497b(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18906t(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14310m0));
        if (m16497b.f17809b.length != c0740b.f4001f.length) {
            m16497b = new C2120lv("", c0740b.f4001f.length);
            for (int i = 0; i < c0740b.f4001f.length; i++) {
                m16497b.f17809b[i] = new C2120lv.C2121a(0.0f, 0.0f);
            }
        }
        for (int i2 = 0; i2 < c0740b.f4001f.length; i2++) {
            m16497b.f17809b[i2].f17810a = c0740b.f4000e[i2] * 0.001f;
        }
        c2895rx.f25679b = m16497b;
        c2895rx.f25680c = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14266B);
        c2895rx.f25681d = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14281Q);
        c2895rx.f25683f = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14282R) * 0.001f;
        c2895rx.f25685h = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14283S) * 0.001f;
        c2895rx.f25684g = this.f14470d;
        c2895rx.f25686i = this.f14471e;
        c2895rx.f25682e = this.f14469c;
        c2895rx.f25687j = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14284T) * 0.001f;
        return c2895rx;
    }

    /* renamed from: f */
    public final void m18778f() {
        this.f14469c = new C2120lv[15];
        C2120lv c2120lv = new C2120lv("Default", 2);
        c2120lv.f17809b[0] = new C2120lv.C2121a(20.0f, 0.0f);
        c2120lv.f17809b[1] = new C2120lv.C2121a(20000.0f, 0.0f);
        this.f14469c[0] = c2120lv;
        C2120lv c2120lv2 = new C2120lv("Classical", 18);
        c2120lv2.f17809b[0] = new C2120lv.C2121a(55.0f, 3.0f);
        c2120lv2.f17809b[1] = new C2120lv.C2121a(77.0f, 2.0f);
        c2120lv2.f17809b[2] = new C2120lv.C2121a(110.0f, 1.0f);
        c2120lv2.f17809b[3] = new C2120lv.C2121a(156.0f, 0.0f);
        c2120lv2.f17809b[4] = new C2120lv.C2121a(220.0f, 2.0f);
        c2120lv2.f17809b[5] = new C2120lv.C2121a(311.0f, 1.0f);
        c2120lv2.f17809b[6] = new C2120lv.C2121a(440.0f, 2.0f);
        c2120lv2.f17809b[7] = new C2120lv.C2121a(622.0f, 1.0f);
        c2120lv2.f17809b[8] = new C2120lv.C2121a(880.0f, 2.0f);
        c2120lv2.f17809b[9] = new C2120lv.C2121a(1200.0f, 3.0f);
        c2120lv2.f17809b[10] = new C2120lv.C2121a(1800.0f, 1.0f);
        c2120lv2.f17809b[11] = new C2120lv.C2121a(2500.0f, 1.0f);
        c2120lv2.f17809b[12] = new C2120lv.C2121a(3500.0f, 1.0f);
        c2120lv2.f17809b[13] = new C2120lv.C2121a(5000.0f, 2.0f);
        c2120lv2.f17809b[14] = new C2120lv.C2121a(7000.0f, 4.0f);
        c2120lv2.f17809b[15] = new C2120lv.C2121a(10000.0f, 3.0f);
        c2120lv2.f17809b[16] = new C2120lv.C2121a(14000.0f, 2.0f);
        c2120lv2.f17809b[17] = new C2120lv.C2121a(20000.0f, 1.0f);
        c2120lv2.m16496c(10.0f);
        this.f14469c[1] = c2120lv2;
        C2120lv c2120lv3 = new C2120lv("Club", 18);
        c2120lv3.f17809b[0] = new C2120lv.C2121a(55.0f, 0.0f);
        c2120lv3.f17809b[1] = new C2120lv.C2121a(77.0f, 0.0f);
        c2120lv3.f17809b[2] = new C2120lv.C2121a(110.0f, 0.0f);
        c2120lv3.f17809b[3] = new C2120lv.C2121a(156.0f, 2.0f);
        c2120lv3.f17809b[4] = new C2120lv.C2121a(220.0f, 2.0f);
        c2120lv3.f17809b[5] = new C2120lv.C2121a(311.0f, 5.0f);
        c2120lv3.f17809b[6] = new C2120lv.C2121a(440.0f, 5.0f);
        c2120lv3.f17809b[7] = new C2120lv.C2121a(622.0f, 8.0f);
        c2120lv3.f17809b[8] = new C2120lv.C2121a(880.0f, 8.0f);
        c2120lv3.f17809b[9] = new C2120lv.C2121a(1200.0f, 8.0f);
        c2120lv3.f17809b[10] = new C2120lv.C2121a(1800.0f, 8.0f);
        c2120lv3.f17809b[11] = new C2120lv.C2121a(2500.0f, 8.0f);
        c2120lv3.f17809b[12] = new C2120lv.C2121a(3500.0f, 8.0f);
        c2120lv3.f17809b[13] = new C2120lv.C2121a(5000.0f, 5.0f);
        c2120lv3.f17809b[14] = new C2120lv.C2121a(7000.0f, 5.0f);
        c2120lv3.f17809b[15] = new C2120lv.C2121a(10000.0f, 2.0f);
        c2120lv3.f17809b[16] = new C2120lv.C2121a(14000.0f, 0.0f);
        c2120lv3.f17809b[17] = new C2120lv.C2121a(20000.0f, 0.0f);
        c2120lv3.m16496c(10.0f);
        this.f14469c[2] = c2120lv3;
        C2120lv c2120lv4 = new C2120lv("Dance", 18);
        c2120lv4.f17809b[0] = new C2120lv.C2121a(55.0f, 11.0f);
        c2120lv4.f17809b[1] = new C2120lv.C2121a(77.0f, 11.0f);
        c2120lv4.f17809b[2] = new C2120lv.C2121a(110.0f, 8.0f);
        c2120lv4.f17809b[3] = new C2120lv.C2121a(156.0f, 8.0f);
        c2120lv4.f17809b[4] = new C2120lv.C2121a(220.0f, 8.0f);
        c2120lv4.f17809b[5] = new C2120lv.C2121a(311.0f, 5.0f);
        c2120lv4.f17809b[6] = new C2120lv.C2121a(440.0f, 5.0f);
        c2120lv4.f17809b[7] = new C2120lv.C2121a(622.0f, 0.0f);
        c2120lv4.f17809b[8] = new C2120lv.C2121a(880.0f, 0.0f);
        c2120lv4.f17809b[9] = new C2120lv.C2121a(1200.0f, 0.0f);
        c2120lv4.f17809b[10] = new C2120lv.C2121a(1800.0f, 0.0f);
        c2120lv4.f17809b[11] = new C2120lv.C2121a(2500.0f, -5.0f);
        c2120lv4.f17809b[12] = new C2120lv.C2121a(3500.0f, -5.0f);
        c2120lv4.f17809b[13] = new C2120lv.C2121a(5000.0f, -5.0f);
        c2120lv4.f17809b[14] = new C2120lv.C2121a(7000.0f, -8.0f);
        c2120lv4.f17809b[15] = new C2120lv.C2121a(10000.0f, -8.0f);
        c2120lv4.f17809b[16] = new C2120lv.C2121a(14000.0f, 0.0f);
        c2120lv4.f17809b[17] = new C2120lv.C2121a(20000.0f, 0.0f);
        c2120lv4.m16496c(13.0f);
        this.f14469c[3] = c2120lv4;
        C2120lv c2120lv5 = new C2120lv("Disco", 18);
        c2120lv5.f17809b[0] = new C2120lv.C2121a(55.0f, 3.0f);
        c2120lv5.f17809b[1] = new C2120lv.C2121a(77.0f, 3.0f);
        c2120lv5.f17809b[2] = new C2120lv.C2121a(110.0f, 1.0f);
        c2120lv5.f17809b[3] = new C2120lv.C2121a(156.0f, 1.0f);
        c2120lv5.f17809b[4] = new C2120lv.C2121a(220.0f, 3.0f);
        c2120lv5.f17809b[5] = new C2120lv.C2121a(311.0f, 1.0f);
        c2120lv5.f17809b[6] = new C2120lv.C2121a(440.0f, 1.0f);
        c2120lv5.f17809b[7] = new C2120lv.C2121a(622.0f, 1.0f);
        c2120lv5.f17809b[8] = new C2120lv.C2121a(880.0f, 2.0f);
        c2120lv5.f17809b[9] = new C2120lv.C2121a(1200.0f, 6.0f);
        c2120lv5.f17809b[10] = new C2120lv.C2121a(1800.0f, 5.0f);
        c2120lv5.f17809b[11] = new C2120lv.C2121a(2500.0f, 4.0f);
        c2120lv5.f17809b[12] = new C2120lv.C2121a(3500.0f, 3.0f);
        c2120lv5.f17809b[13] = new C2120lv.C2121a(5000.0f, 2.0f);
        c2120lv5.f17809b[14] = new C2120lv.C2121a(7000.0f, 2.0f);
        c2120lv5.f17809b[15] = new C2120lv.C2121a(10000.0f, 2.0f);
        c2120lv5.f17809b[16] = new C2120lv.C2121a(14000.0f, 2.0f);
        c2120lv5.f17809b[17] = new C2120lv.C2121a(20000.0f, 1.0f);
        c2120lv5.m16496c(10.0f);
        this.f14469c[4] = c2120lv5;
        C2120lv c2120lv6 = new C2120lv("Drum & Bass", 18);
        c2120lv6.f17809b[0] = new C2120lv.C2121a(55.0f, 3.0f);
        c2120lv6.f17809b[1] = new C2120lv.C2121a(77.0f, 4.0f);
        c2120lv6.f17809b[2] = new C2120lv.C2121a(110.0f, 3.0f);
        c2120lv6.f17809b[3] = new C2120lv.C2121a(156.0f, 2.0f);
        c2120lv6.f17809b[4] = new C2120lv.C2121a(220.0f, 2.0f);
        c2120lv6.f17809b[5] = new C2120lv.C2121a(311.0f, 1.0f);
        c2120lv6.f17809b[6] = new C2120lv.C2121a(440.0f, 0.0f);
        c2120lv6.f17809b[7] = new C2120lv.C2121a(622.0f, 0.0f);
        c2120lv6.f17809b[8] = new C2120lv.C2121a(880.0f, 1.0f);
        c2120lv6.f17809b[9] = new C2120lv.C2121a(1200.0f, 3.0f);
        c2120lv6.f17809b[10] = new C2120lv.C2121a(1800.0f, 5.0f);
        c2120lv6.f17809b[11] = new C2120lv.C2121a(2500.0f, 3.0f);
        c2120lv6.f17809b[12] = new C2120lv.C2121a(3500.0f, 2.0f);
        c2120lv6.f17809b[13] = new C2120lv.C2121a(5000.0f, 1.0f);
        c2120lv6.f17809b[14] = new C2120lv.C2121a(7000.0f, 2.0f);
        c2120lv6.f17809b[15] = new C2120lv.C2121a(10000.0f, 2.0f);
        c2120lv6.f17809b[16] = new C2120lv.C2121a(14000.0f, 1.0f);
        c2120lv6.f17809b[17] = new C2120lv.C2121a(20000.0f, 2.0f);
        c2120lv6.m16496c(10.0f);
        this.f14469c[5] = c2120lv6;
        C2120lv c2120lv7 = new C2120lv("Heavy Metal", 18);
        c2120lv7.f17809b[0] = new C2120lv.C2121a(55.0f, 4.0f);
        c2120lv7.f17809b[1] = new C2120lv.C2121a(77.0f, 3.0f);
        c2120lv7.f17809b[2] = new C2120lv.C2121a(110.0f, 2.0f);
        c2120lv7.f17809b[3] = new C2120lv.C2121a(156.0f, 3.0f);
        c2120lv7.f17809b[4] = new C2120lv.C2121a(220.0f, 6.0f);
        c2120lv7.f17809b[5] = new C2120lv.C2121a(311.0f, 6.0f);
        c2120lv7.f17809b[6] = new C2120lv.C2121a(440.0f, 6.0f);
        c2120lv7.f17809b[7] = new C2120lv.C2121a(622.0f, 6.0f);
        c2120lv7.f17809b[8] = new C2120lv.C2121a(880.0f, 6.0f);
        c2120lv7.f17809b[9] = new C2120lv.C2121a(1200.0f, 5.0f);
        c2120lv7.f17809b[10] = new C2120lv.C2121a(1800.0f, 4.0f);
        c2120lv7.f17809b[11] = new C2120lv.C2121a(2500.0f, 3.0f);
        c2120lv7.f17809b[12] = new C2120lv.C2121a(3500.0f, 3.0f);
        c2120lv7.f17809b[13] = new C2120lv.C2121a(5000.0f, 3.0f);
        c2120lv7.f17809b[14] = new C2120lv.C2121a(7000.0f, 2.0f);
        c2120lv7.f17809b[15] = new C2120lv.C2121a(10000.0f, 2.0f);
        c2120lv7.f17809b[16] = new C2120lv.C2121a(14000.0f, 2.0f);
        c2120lv7.f17809b[17] = new C2120lv.C2121a(20000.0f, 1.0f);
        c2120lv7.m16496c(10.0f);
        this.f14469c[6] = c2120lv7;
        C2120lv c2120lv8 = new C2120lv("Jazz", 18);
        c2120lv8.f17809b[0] = new C2120lv.C2121a(55.0f, 0.0f);
        c2120lv8.f17809b[1] = new C2120lv.C2121a(77.0f, 1.0f);
        c2120lv8.f17809b[2] = new C2120lv.C2121a(110.0f, 2.0f);
        c2120lv8.f17809b[3] = new C2120lv.C2121a(156.0f, 2.0f);
        c2120lv8.f17809b[4] = new C2120lv.C2121a(220.0f, 3.0f);
        c2120lv8.f17809b[5] = new C2120lv.C2121a(311.0f, 1.0f);
        c2120lv8.f17809b[6] = new C2120lv.C2121a(440.0f, 2.0f);
        c2120lv8.f17809b[7] = new C2120lv.C2121a(622.0f, 0.0f);
        c2120lv8.f17809b[8] = new C2120lv.C2121a(880.0f, 0.0f);
        c2120lv8.f17809b[9] = new C2120lv.C2121a(1200.0f, 2.0f);
        c2120lv8.f17809b[10] = new C2120lv.C2121a(1800.0f, 1.0f);
        c2120lv8.f17809b[11] = new C2120lv.C2121a(2500.0f, 2.0f);
        c2120lv8.f17809b[12] = new C2120lv.C2121a(3500.0f, 4.0f);
        c2120lv8.f17809b[13] = new C2120lv.C2121a(5000.0f, 3.0f);
        c2120lv8.f17809b[14] = new C2120lv.C2121a(7000.0f, 3.0f);
        c2120lv8.f17809b[15] = new C2120lv.C2121a(10000.0f, 2.0f);
        c2120lv8.f17809b[16] = new C2120lv.C2121a(14000.0f, 1.0f);
        c2120lv8.f17809b[17] = new C2120lv.C2121a(20000.0f, 0.0f);
        c2120lv8.m16496c(10.0f);
        this.f14469c[7] = c2120lv8;
        C2120lv c2120lv9 = new C2120lv("Latin", 18);
        c2120lv9.f17809b[0] = new C2120lv.C2121a(55.0f, 0.0f);
        c2120lv9.f17809b[1] = new C2120lv.C2121a(77.0f, -2.0f);
        c2120lv9.f17809b[2] = new C2120lv.C2121a(110.0f, -1.0f);
        c2120lv9.f17809b[3] = new C2120lv.C2121a(156.0f, 0.0f);
        c2120lv9.f17809b[4] = new C2120lv.C2121a(220.0f, 1.0f);
        c2120lv9.f17809b[5] = new C2120lv.C2121a(311.0f, 1.0f);
        c2120lv9.f17809b[6] = new C2120lv.C2121a(440.0f, 2.0f);
        c2120lv9.f17809b[7] = new C2120lv.C2121a(622.0f, 2.0f);
        c2120lv9.f17809b[8] = new C2120lv.C2121a(880.0f, 3.0f);
        c2120lv9.f17809b[9] = new C2120lv.C2121a(1200.0f, 4.0f);
        c2120lv9.f17809b[10] = new C2120lv.C2121a(1800.0f, 1.0f);
        c2120lv9.f17809b[11] = new C2120lv.C2121a(2500.0f, 2.0f);
        c2120lv9.f17809b[12] = new C2120lv.C2121a(3500.0f, 2.0f);
        c2120lv9.f17809b[13] = new C2120lv.C2121a(5000.0f, 2.0f);
        c2120lv9.f17809b[14] = new C2120lv.C2121a(7000.0f, 3.0f);
        c2120lv9.f17809b[15] = new C2120lv.C2121a(10000.0f, 2.0f);
        c2120lv9.f17809b[16] = new C2120lv.C2121a(14000.0f, 1.0f);
        c2120lv9.f17809b[17] = new C2120lv.C2121a(20000.0f, 1.0f);
        c2120lv9.m16496c(10.0f);
        this.f14469c[8] = c2120lv9;
        C2120lv c2120lv10 = new C2120lv("New Age", 18);
        c2120lv10.f17809b[0] = new C2120lv.C2121a(55.0f, 3.0f);
        c2120lv10.f17809b[1] = new C2120lv.C2121a(77.0f, 1.0f);
        c2120lv10.f17809b[2] = new C2120lv.C2121a(110.0f, 3.0f);
        c2120lv10.f17809b[3] = new C2120lv.C2121a(156.0f, 2.0f);
        c2120lv10.f17809b[4] = new C2120lv.C2121a(220.0f, 2.0f);
        c2120lv10.f17809b[5] = new C2120lv.C2121a(311.0f, 2.0f);
        c2120lv10.f17809b[6] = new C2120lv.C2121a(440.0f, 3.0f);
        c2120lv10.f17809b[7] = new C2120lv.C2121a(622.0f, 2.0f);
        c2120lv10.f17809b[8] = new C2120lv.C2121a(880.0f, 0.0f);
        c2120lv10.f17809b[9] = new C2120lv.C2121a(1200.0f, 2.0f);
        c2120lv10.f17809b[10] = new C2120lv.C2121a(1800.0f, 4.0f);
        c2120lv10.f17809b[11] = new C2120lv.C2121a(2500.0f, 1.0f);
        c2120lv10.f17809b[12] = new C2120lv.C2121a(3500.0f, 3.0f);
        c2120lv10.f17809b[13] = new C2120lv.C2121a(5000.0f, 2.0f);
        c2120lv10.f17809b[14] = new C2120lv.C2121a(7000.0f, 4.0f);
        c2120lv10.f17809b[15] = new C2120lv.C2121a(10000.0f, 2.0f);
        c2120lv10.f17809b[16] = new C2120lv.C2121a(14000.0f, 1.0f);
        c2120lv10.f17809b[17] = new C2120lv.C2121a(20000.0f, 1.0f);
        c2120lv10.m16496c(10.0f);
        this.f14469c[9] = c2120lv10;
        C2120lv c2120lv11 = new C2120lv("Party", 18);
        c2120lv11.f17809b[0] = new C2120lv.C2121a(55.0f, 7.0f);
        c2120lv11.f17809b[1] = new C2120lv.C2121a(77.0f, 6.0f);
        c2120lv11.f17809b[2] = new C2120lv.C2121a(110.0f, 5.0f);
        c2120lv11.f17809b[3] = new C2120lv.C2121a(156.0f, 3.0f);
        c2120lv11.f17809b[4] = new C2120lv.C2121a(220.0f, 2.0f);
        c2120lv11.f17809b[5] = new C2120lv.C2121a(311.0f, 1.0f);
        c2120lv11.f17809b[6] = new C2120lv.C2121a(440.0f, 0.0f);
        c2120lv11.f17809b[7] = new C2120lv.C2121a(622.0f, 0.0f);
        c2120lv11.f17809b[8] = new C2120lv.C2121a(880.0f, 0.0f);
        c2120lv11.f17809b[9] = new C2120lv.C2121a(1200.0f, 0.0f);
        c2120lv11.f17809b[10] = new C2120lv.C2121a(1800.0f, 0.0f);
        c2120lv11.f17809b[11] = new C2120lv.C2121a(2500.0f, 0.0f);
        c2120lv11.f17809b[12] = new C2120lv.C2121a(3500.0f, 0.0f);
        c2120lv11.f17809b[13] = new C2120lv.C2121a(5000.0f, 1.0f);
        c2120lv11.f17809b[14] = new C2120lv.C2121a(7000.0f, 2.0f);
        c2120lv11.f17809b[15] = new C2120lv.C2121a(10000.0f, 4.0f);
        c2120lv11.f17809b[16] = new C2120lv.C2121a(14000.0f, 5.0f);
        c2120lv11.f17809b[17] = new C2120lv.C2121a(20000.0f, 5.0f);
        c2120lv11.m16496c(10.0f);
        this.f14469c[10] = c2120lv11;
        C2120lv c2120lv12 = new C2120lv("Pop", 18);
        c2120lv12.f17809b[0] = new C2120lv.C2121a(55.0f, 1.0f);
        c2120lv12.f17809b[1] = new C2120lv.C2121a(77.0f, -1.0f);
        c2120lv12.f17809b[2] = new C2120lv.C2121a(110.0f, -3.0f);
        c2120lv12.f17809b[3] = new C2120lv.C2121a(156.0f, 0.0f);
        c2120lv12.f17809b[4] = new C2120lv.C2121a(220.0f, 1.0f);
        c2120lv12.f17809b[5] = new C2120lv.C2121a(311.0f, 2.0f);
        c2120lv12.f17809b[6] = new C2120lv.C2121a(440.0f, 3.0f);
        c2120lv12.f17809b[7] = new C2120lv.C2121a(622.0f, 1.0f);
        c2120lv12.f17809b[8] = new C2120lv.C2121a(880.0f, 1.0f);
        c2120lv12.f17809b[9] = new C2120lv.C2121a(1200.0f, 2.0f);
        c2120lv12.f17809b[10] = new C2120lv.C2121a(1800.0f, 0.0f);
        c2120lv12.f17809b[11] = new C2120lv.C2121a(2500.0f, -1.0f);
        c2120lv12.f17809b[12] = new C2120lv.C2121a(3500.0f, -2.0f);
        c2120lv12.f17809b[13] = new C2120lv.C2121a(5000.0f, 0.0f);
        c2120lv12.f17809b[14] = new C2120lv.C2121a(7000.0f, 1.0f);
        c2120lv12.f17809b[15] = new C2120lv.C2121a(10000.0f, 2.0f);
        c2120lv12.f17809b[16] = new C2120lv.C2121a(14000.0f, 2.0f);
        c2120lv12.f17809b[17] = new C2120lv.C2121a(20000.0f, 2.0f);
        c2120lv12.m16496c(10.0f);
        this.f14469c[11] = c2120lv12;
        C2120lv c2120lv13 = new C2120lv("Rock", 18);
        c2120lv13.f17809b[0] = new C2120lv.C2121a(55.0f, 3.0f);
        c2120lv13.f17809b[1] = new C2120lv.C2121a(77.0f, -3.0f);
        c2120lv13.f17809b[2] = new C2120lv.C2121a(110.0f, -2.0f);
        c2120lv13.f17809b[3] = new C2120lv.C2121a(156.0f, -2.0f);
        c2120lv13.f17809b[4] = new C2120lv.C2121a(220.0f, -2.0f);
        c2120lv13.f17809b[5] = new C2120lv.C2121a(311.0f, -2.0f);
        c2120lv13.f17809b[6] = new C2120lv.C2121a(440.0f, -2.0f);
        c2120lv13.f17809b[7] = new C2120lv.C2121a(622.0f, -2.0f);
        c2120lv13.f17809b[8] = new C2120lv.C2121a(880.0f, -1.0f);
        c2120lv13.f17809b[9] = new C2120lv.C2121a(1200.0f, -1.0f);
        c2120lv13.f17809b[10] = new C2120lv.C2121a(1800.0f, -1.0f);
        c2120lv13.f17809b[11] = new C2120lv.C2121a(2500.0f, -1.0f);
        c2120lv13.f17809b[12] = new C2120lv.C2121a(3500.0f, 0.0f);
        c2120lv13.f17809b[13] = new C2120lv.C2121a(5000.0f, 1.0f);
        c2120lv13.f17809b[14] = new C2120lv.C2121a(7000.0f, 2.0f);
        c2120lv13.f17809b[15] = new C2120lv.C2121a(10000.0f, 3.0f);
        c2120lv13.f17809b[16] = new C2120lv.C2121a(14000.0f, 4.0f);
        c2120lv13.f17809b[17] = new C2120lv.C2121a(20000.0f, 5.0f);
        c2120lv13.m16496c(10.0f);
        this.f14469c[12] = c2120lv13;
        C2120lv c2120lv14 = new C2120lv("Techno", 18);
        c2120lv14.f17809b[0] = new C2120lv.C2121a(55.0f, 3.0f);
        c2120lv14.f17809b[1] = new C2120lv.C2121a(77.0f, 5.0f);
        c2120lv14.f17809b[2] = new C2120lv.C2121a(110.0f, 3.0f);
        c2120lv14.f17809b[3] = new C2120lv.C2121a(156.0f, 1.0f);
        c2120lv14.f17809b[4] = new C2120lv.C2121a(220.0f, -1.0f);
        c2120lv14.f17809b[5] = new C2120lv.C2121a(311.0f, 0.0f);
        c2120lv14.f17809b[6] = new C2120lv.C2121a(440.0f, 1.0f);
        c2120lv14.f17809b[7] = new C2120lv.C2121a(622.0f, 1.0f);
        c2120lv14.f17809b[8] = new C2120lv.C2121a(880.0f, 2.0f);
        c2120lv14.f17809b[9] = new C2120lv.C2121a(1200.0f, 5.0f);
        c2120lv14.f17809b[10] = new C2120lv.C2121a(1800.0f, 3.0f);
        c2120lv14.f17809b[11] = new C2120lv.C2121a(2500.0f, 2.0f);
        c2120lv14.f17809b[12] = new C2120lv.C2121a(3500.0f, 5.0f);
        c2120lv14.f17809b[13] = new C2120lv.C2121a(5000.0f, 1.0f);
        c2120lv14.f17809b[14] = new C2120lv.C2121a(7000.0f, 2.0f);
        c2120lv14.f17809b[15] = new C2120lv.C2121a(10000.0f, 3.0f);
        c2120lv14.f17809b[16] = new C2120lv.C2121a(14000.0f, 4.0f);
        c2120lv14.f17809b[17] = new C2120lv.C2121a(20000.0f, 4.0f);
        c2120lv14.m16496c(10.0f);
        this.f14469c[13] = c2120lv14;
        C2120lv c2120lv15 = new C2120lv("Vocal", 18);
        c2120lv15.f17809b[0] = new C2120lv.C2121a(55.0f, 2.0f);
        c2120lv15.f17809b[1] = new C2120lv.C2121a(77.0f, -1.0f);
        c2120lv15.f17809b[2] = new C2120lv.C2121a(110.0f, -1.0f);
        c2120lv15.f17809b[3] = new C2120lv.C2121a(156.0f, -1.0f);
        c2120lv15.f17809b[4] = new C2120lv.C2121a(220.0f, 2.0f);
        c2120lv15.f17809b[5] = new C2120lv.C2121a(311.0f, 2.0f);
        c2120lv15.f17809b[6] = new C2120lv.C2121a(440.0f, 4.0f);
        c2120lv15.f17809b[7] = new C2120lv.C2121a(622.0f, 3.0f);
        c2120lv15.f17809b[8] = new C2120lv.C2121a(880.0f, 4.0f);
        c2120lv15.f17809b[9] = new C2120lv.C2121a(1200.0f, 4.0f);
        c2120lv15.f17809b[10] = new C2120lv.C2121a(1800.0f, 3.0f);
        c2120lv15.f17809b[11] = new C2120lv.C2121a(2500.0f, 2.0f);
        c2120lv15.f17809b[12] = new C2120lv.C2121a(3500.0f, 0.0f);
        c2120lv15.f17809b[13] = new C2120lv.C2121a(5000.0f, 0.0f);
        c2120lv15.f17809b[14] = new C2120lv.C2121a(7000.0f, 0.0f);
        c2120lv15.f17809b[15] = new C2120lv.C2121a(10000.0f, 0.0f);
        c2120lv15.f17809b[16] = new C2120lv.C2121a(14000.0f, -1.0f);
        c2120lv15.f17809b[17] = new C2120lv.C2121a(20000.0f, -1.0f);
        c2120lv15.m16496c(10.0f);
        this.f14469c[14] = c2120lv15;
    }
}
