package com.daaw;

import android.os.AsyncTask;
import com.daaw.avee.MainActivity;
import com.daaw.qw1;
import com.daaw.rw1;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.vw1;
import com.daaw.xw1;
import java.util.LinkedList;
import java.util.List;
/* renamed from: com.daaw.ui */
/* loaded from: classes.dex */
public class C3211ui {

    /* renamed from: b */
    public static t91 f29086b = new t91();

    /* renamed from: a */
    public List<Object> f29087a = new LinkedList();

    /* renamed from: com.daaw.ui$a */
    /* loaded from: classes.dex */
    public class C3212a implements sw1.InterfaceC2987a<AsyncTask, Integer, Object> {
        public C3212a() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(AsyncTask asyncTask, Integer num, Object obj) {
            C3211ui.f29086b.m9424d(asyncTask, num.intValue());
        }
    }

    /* renamed from: com.daaw.ui$b */
    /* loaded from: classes.dex */
    public class C3213b implements tw1.InterfaceC3140a<Integer, Integer, ee0, Boolean> {
        public C3213b() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(Integer num, Integer num2, ee0 ee0Var, Boolean bool) {
            n30 m26905p0;
            if (ee0Var == null || ee0Var.mo17092c() == null || ee0Var.mo17092c().isEmpty()) {
                C3211ui.f29086b.m9426b(num2.intValue());
            }
            MainActivity m26903r0 = MainActivity.m26903r0();
            if (m26903r0 == null) {
                return;
            }
            if (num.equals(num2)) {
                m26903r0.m26929U0(ee0Var);
            }
            if (!bool.booleanValue() || ee0Var == null) {
                return;
            }
            if (num2.intValue() == 0) {
                m30 m26906o0 = MainActivity.m26906o0();
                if (m26906o0 != null) {
                    m26906o0.m16260D(m26903r0, ee0Var.mo17092c());
                }
            } else if (num2.intValue() != 1 || (m26905p0 = MainActivity.m26905p0()) == null) {
            } else {
                m26905p0.m15553t(m26903r0, ee0Var.mo17092c());
            }
        }
    }

    /* renamed from: com.daaw.ui$c */
    /* loaded from: classes.dex */
    public class C3214c implements rw1.InterfaceC2894a<Integer, String> {
        public C3214c() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Integer num, String str) {
            s70 m10606c = s70.m10606c();
            if (m10606c == null) {
                return;
            }
            m10606c.m10602g(str);
        }
    }

    /* renamed from: com.daaw.ui$d */
    /* loaded from: classes.dex */
    public class C3215d implements rw1.InterfaceC2894a<Integer, String> {
        public C3215d() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Integer num, String str) {
            s70 m10606c = s70.m10606c();
            if (m10606c == null) {
                return;
            }
            m10606c.m10603f(num.intValue(), str);
        }
    }

    /* renamed from: com.daaw.ui$e */
    /* loaded from: classes.dex */
    public class C3216e implements qw1.InterfaceC2788a<Boolean> {
        public C3216e() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Boolean bool) {
            s70 m10606c = s70.m10606c();
            if (m10606c == null) {
                return;
            }
            m10606c.m10602g(null);
        }
    }

    /* renamed from: com.daaw.ui$f */
    /* loaded from: classes.dex */
    public class C3217f implements qw1.InterfaceC2788a<Integer> {
        public C3217f() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Integer num) {
            n30 m26905p0;
            s70 m10606c = s70.m10606c();
            if (m10606c == null) {
                return;
            }
            m91 m91Var = m91.f18679d;
            if (num.intValue() == 0) {
                m30 m26906o0 = MainActivity.m26906o0();
                if (m26906o0 != null) {
                    m91Var = m26906o0.m16256n();
                }
            } else if (num.intValue() == 1 && (m26905p0 = MainActivity.m26905p0()) != null) {
                m91Var = m26905p0.m15560m();
            }
            if (m91Var != m91.f18679d) {
                if (m91Var != null) {
                    m10606c.m10600i(num.intValue(), m91Var.f18680a, m91Var.f18681b, m91Var.f18682c);
                } else {
                    m10606c.m10600i(num.intValue(), false, "", null);
                }
            }
            m10606c.m10601h(num.intValue());
        }
    }

    /* renamed from: com.daaw.ui$g */
    /* loaded from: classes.dex */
    public class C3218g implements vw1.InterfaceC3381a<ee0> {
        public C3218g() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public ee0 mo3126a() {
            s70 m10606c = s70.m10606c();
            if (m10606c == null) {
                return null;
            }
            return m10606c.m10607b();
        }
    }

    /* renamed from: com.daaw.ui$h */
    /* loaded from: classes.dex */
    public class C3219h implements xw1.InterfaceC3648a<Integer, sd0, String> {
        public C3219h() {
        }

        @Override // com.daaw.xw1.InterfaceC3648a
        /* renamed from: a */
        public String mo4423c(Integer num, sd0 sd0Var) {
            l91 m10605d;
            s70 m10606c = s70.m10606c();
            if (m10606c == null || (m10605d = m10606c.m10605d(num.intValue())) == null || !br1.m25902g(m10605d.m17091d(), sd0Var)) {
                return null;
            }
            return m10605d.mo17092c();
        }
    }

    /* renamed from: com.daaw.ui$i */
    /* loaded from: classes.dex */
    public class C3220i implements tw1.InterfaceC3140a<Integer, Boolean, String, sd0> {
        public C3220i() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(Integer num, Boolean bool, String str, sd0 sd0Var) {
            s70 m10606c = s70.m10606c();
            if (m10606c == null) {
                return;
            }
            m10606c.m10600i(num.intValue(), bool.booleanValue(), str, sd0Var);
        }
    }

    /* renamed from: com.daaw.ui$j */
    /* loaded from: classes.dex */
    public class C3221j implements xw1.InterfaceC3648a<AsyncTask, Integer, Boolean> {
        public C3221j() {
        }

        @Override // com.daaw.xw1.InterfaceC3648a
        /* renamed from: a */
        public Boolean mo4423c(AsyncTask asyncTask, Integer num) {
            return Boolean.valueOf(C3211ui.f29086b.m9425c(asyncTask, num.intValue()));
        }
    }

    public C3211ui() {
        s70.f25949c.m8755b(new C3213b(), this.f29087a);
        MainActivity.f3729v0.m10861b(new C3214c(), this.f29087a);
        t91.f27136c.m10861b(new C3215d(), this.f29087a);
        MainActivity.f3730w0.m12017b(new C3216e(), this.f29087a);
        MainActivity.f3731x0.m12017b(new C3217f(), this.f29087a);
        MainActivity.f3732y0.m6691b(new C3218g(), this.f29087a);
        dj0.f7161Y.m4424b(new C3219h(), this.f29087a);
        dj0.f7180r.m8755b(new C3220i(), this.f29087a);
        dj0.f7170h0.m4424b(new C3221j(), this.f29087a);
        dj0.f7171i0.m9794b(new C3212a(), this.f29087a);
    }
}
