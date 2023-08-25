package com.daaw;

import com.daaw.avee.comp.playback.C0729a;
import com.daaw.avee.comp.playback.C0743c;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.ow1;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.sw1;
/* loaded from: classes.dex */
public class ew0 extends C1983kt {

    /* renamed from: b */
    public volatile C3485wz f8854b = null;

    /* renamed from: d */
    public C2668pz f8856d = new C2668pz();

    /* renamed from: e */
    public final Object f8857e = new Object();

    /* renamed from: c */
    public dw0 f8855c = null;

    /* renamed from: com.daaw.ew0$a */
    /* loaded from: classes.dex */
    public class C1223a implements qw1.InterfaceC2788a<C2668pz> {
        public C1223a() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(C2668pz c2668pz) {
            ew0.this.f8856d = c2668pz;
            if (c2668pz.f23539a) {
                C3485wz c3485wz = ew0.this.f8854b;
                if (c3485wz != null) {
                    c3485wz.m5706d(c2668pz.f23540b, c2668pz.f23541c, c2668pz.f23542d, c2668pz.f23543e, c2668pz.f23544f, c2668pz.f23545g);
                }
                dw0 dw0Var = ew0.this.f8855c;
                if (dw0Var != null) {
                    dw0Var.m23858e(c2668pz.f23540b, c2668pz.f23541c, c2668pz.f23542d, c2668pz.f23543e, c2668pz.f23544f, c2668pz.f23545g);
                }
            }
        }
    }

    /* renamed from: com.daaw.ew0$b */
    /* loaded from: classes.dex */
    public class C1224b implements pw1.InterfaceC2649a {
        public C1224b() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            C3485wz c3485wz = ew0.this.f8854b;
            if (c3485wz != null) {
                c3485wz.m5707c();
            }
            dw0 dw0Var = ew0.this.f8855c;
            if (dw0Var != null) {
                dw0Var.m23859d();
            }
        }
    }

    /* renamed from: com.daaw.ew0$c */
    /* loaded from: classes.dex */
    public class C1225c implements sw1.InterfaceC2987a<Boolean, Long, Boolean> {
        public C1225c() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(Boolean bool, Long l, Boolean bool2) {
            if (bool.booleanValue()) {
                ew0.this.f8855c = new dw0("tempexport", l.longValue() * 1000);
                return;
            }
            if (ew0.this.f8855c != null) {
                ew0.this.f8855c.m23861b();
            }
            ew0.this.f8855c = null;
        }
    }

    /* renamed from: com.daaw.ew0$d */
    /* loaded from: classes.dex */
    public class C1226d implements ow1.InterfaceC2485a<C0729a, C0729a.C0736g, C0729a> {
        public C1226d() {
        }

        @Override // com.daaw.ow1.InterfaceC2485a
        /* renamed from: a */
        public C0729a mo13904c(C0729a c0729a, C0729a.C0736g c0736g) {
            return ew0.this.m23106f(c0729a, c0736g, false);
        }
    }

    /* renamed from: com.daaw.ew0$e */
    /* loaded from: classes.dex */
    public class C1227e implements ow1.InterfaceC2485a<C0729a, C0729a.C0736g, C0729a> {
        public C1227e() {
        }

        @Override // com.daaw.ow1.InterfaceC2485a
        /* renamed from: a */
        public C0729a mo13904c(C0729a c0729a, C0729a.C0736g c0736g) {
            return ew0.this.m23106f(c0729a, c0736g, true);
        }
    }

    public ew0() {
        MediaPlaybackService.f3856B0.m12017b(new C1223a(), this.f16736a);
        MediaPlaybackService.f3855A0.m12989b(new C1224b(), this.f16736a);
        qv1.f24437Q.m9794b(new C1225c(), this.f16736a);
        pv1.f23313u.m13905b(new C1226d(), this.f16736a);
        qv1.f24438R.m13905b(new C1227e(), this.f16736a);
    }

    /* renamed from: f */
    public final C0729a m23106f(C0729a c0729a, C0729a.C0736g c0736g, boolean z) {
        C0729a m13906a = C0743c.f4010d.m13906a(c0729a, c0736g, null);
        if (m13906a == null) {
            if (z) {
                lz1.m16363c("AudioFrameData is null, MediaService not started?");
            }
            return m13906a;
        } else if (m13906a.f3959r) {
            dw0 dw0Var = this.f8855c;
            if (dw0Var != null) {
                long j = c0736g.f3978g;
                if (j < 0) {
                    j = m13906a.f3960s;
                }
                return dw0Var.m23860c(j, c0736g, c0729a, this.f8856d.f23545g);
            }
            return m23105g(m13906a.f3960s, c0729a, c0736g);
        } else {
            return m13906a;
        }
    }

    /* renamed from: g */
    public C0729a m23105g(long j, C0729a c0729a, C0729a.C0736g c0736g) {
        C0729a m5708b;
        if (c0729a == null) {
            return null;
        }
        synchronized (this.f8857e) {
            C3485wz c3485wz = this.f8854b;
            if (c3485wz == null) {
                c3485wz = new C3485wz();
            }
            C3485wz c3485wz2 = c3485wz;
            long j2 = c0736g.f3978g;
            m5708b = c3485wz2.m5708b(j2 < 0 ? j : j2, c0736g, c0729a, c0736g.f3979h);
            this.f8854b = c3485wz2;
        }
        return m5708b;
    }
}
