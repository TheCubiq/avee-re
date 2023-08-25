package com.daaw;

import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.playback.C0743c;
import com.daaw.pw1;
import com.daaw.rw1;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.vw1;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class wd1 {

    /* renamed from: a */
    public List<Object> f31177a = new LinkedList();

    /* renamed from: com.daaw.wd1$a */
    /* loaded from: classes.dex */
    public class C3426a implements rw1.InterfaceC2894a<Integer, C0645al> {
        public C3426a() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Integer num, C0645al c0645al) {
            td1 m9289c;
            if (c0645al.m27376c() == null) {
                return;
            }
            if (num.intValue() == 1) {
                xd1.m5217g(c0645al);
            } else if (num.intValue() != 10 || (m9289c = td1.m9289c()) == null) {
            } else {
                ud1 m9287e = m9289c.m9287e();
                m9289c.m9290b(false, m9287e.f28894b, m9289c.m9285g(), m9287e.f28895c);
            }
        }
    }

    /* renamed from: com.daaw.wd1$b */
    /* loaded from: classes.dex */
    public class C3427b implements vw1.InterfaceC3381a<ud1> {
        public C3427b() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public ud1 mo3126a() {
            td1 m9289c = td1.m9289c();
            return m9289c == null ? new ud1() : m9289c.m9287e();
        }
    }

    /* renamed from: com.daaw.wd1$c */
    /* loaded from: classes.dex */
    public class C3428c implements sw1.InterfaceC2987a<Boolean, Integer, Boolean> {
        public C3428c() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(Boolean bool, Integer num, Boolean bool2) {
            ud1 ud1Var = new ud1();
            ud1Var.f28893a = bool.booleanValue();
            ud1Var.f28894b = num.intValue();
            ud1Var.f28895c = bool2.booleanValue();
            MainActivity m26903r0 = MainActivity.m26903r0();
            if (m26903r0 != null) {
                m26903r0.m26925W0(ud1Var.f28893a, false);
            }
        }
    }

    /* renamed from: com.daaw.wd1$d */
    /* loaded from: classes.dex */
    public class C3429d implements pw1.InterfaceC2649a {
        public C3429d() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            C0743c.f4012f.m19309a(3);
        }
    }

    /* renamed from: com.daaw.wd1$e */
    /* loaded from: classes.dex */
    public class C3430e implements tw1.InterfaceC3140a<Boolean, Integer, Date, Boolean> {
        public C3430e() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(Boolean bool, Integer num, Date date, Boolean bool2) {
            td1 m9289c = td1.m9289c();
            if (m9289c == null) {
                return;
            }
            m9289c.m9290b(bool.booleanValue(), num.intValue(), date, bool2.booleanValue());
        }
    }

    /* renamed from: com.daaw.wd1$f */
    /* loaded from: classes.dex */
    public class C3431f implements vw1.InterfaceC3381a<ud1> {
        public C3431f() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public ud1 mo3126a() {
            td1 m9289c = td1.m9289c();
            return m9289c == null ? new ud1() : m9289c.m9287e();
        }
    }

    /* renamed from: com.daaw.wd1$g */
    /* loaded from: classes.dex */
    public class C3432g implements vw1.InterfaceC3381a<Integer> {
        public C3432g() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Integer mo3126a() {
            td1 m9289c = td1.m9289c();
            return Integer.valueOf(m9289c == null ? 0 : m9289c.m9286f());
        }
    }

    public wd1() {
        MainActivity.f3725r0.m10861b(new C3426a(), this.f31177a);
        MainActivity.f3727t0.m6691b(new C3427b(), this.f31177a);
        td1.f27493f.m9794b(new C3428c(), this.f31177a);
        td1.f27494g.m12989b(new C3429d(), this.f31177a);
        xd1.f32577x.m8755b(new C3430e(), this.f31177a);
        xd1.f32578y.m6691b(new C3431f(), this.f31177a);
        xd1.f32579z.m6691b(new C3432g(), this.f31177a);
        xd1.f32576A.m6691b(new vw1.InterfaceC3381a() { // from class: com.daaw.vd1
            @Override // com.daaw.vw1.InterfaceC3381a
            /* renamed from: a */
            public final Object mo3126a() {
                lo1 m6163b;
                m6163b = wd1.m6163b();
                return m6163b;
            }
        }, this.f31177a);
    }

    /* renamed from: b */
    public static /* synthetic */ lo1 m6163b() {
        td1 m9289c = td1.m9289c();
        return m9289c == null ? new lo1(new Date(), Boolean.FALSE) : new lo1(m9289c.m9285g(), Boolean.valueOf(m9289c.m9287e().f28893a));
    }
}
