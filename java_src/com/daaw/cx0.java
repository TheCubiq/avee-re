package com.daaw;

import android.view.View;
import com.daaw.avee.MainActivity;
import com.daaw.avee.MediaControlsView;
import com.daaw.avee.comp.playback.C0743c;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.sw1;
import com.daaw.vw1;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class cx0 {

    /* renamed from: a */
    public List<Object> f6235a = new LinkedList();

    /* renamed from: com.daaw.cx0$a */
    /* loaded from: classes.dex */
    public class C1013a implements qw1.InterfaceC2788a<Boolean> {
        public C1013a() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Boolean bool) {
            int i;
            ko0 m17610q = ko0.m17610q();
            if (bool.booleanValue()) {
                if (m17610q != null) {
                    m17610q.m17611p(0);
                    return;
                }
                return;
            }
            MainActivity m26903r0 = MainActivity.m26903r0();
            if ((m26903r0 != null ? m26903r0.f3735N : 0) == 0) {
                if (m17610q == null) {
                    return;
                }
                i = 1;
            } else if (m17610q == null) {
                return;
            } else {
                i = 2;
            }
            m17610q.m17611p(i);
        }
    }

    /* renamed from: com.daaw.cx0$b */
    /* loaded from: classes.dex */
    public class C1014b implements sw1.InterfaceC2987a<View, View, View> {
        public C1014b() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(View view, View view2, View view3) {
            ko0 m17610q = ko0.m17610q();
            if (m17610q != null) {
                m17610q.m17605v(view, view2, view3);
            }
        }
    }

    /* renamed from: com.daaw.cx0$c */
    /* loaded from: classes.dex */
    public class C1015c implements pw1.InterfaceC2649a {
        public C1015c() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            l01 m17249c = l01.m17249c();
            if (m17249c != null) {
                m17249c.m17265H();
            }
        }
    }

    /* renamed from: com.daaw.cx0$d */
    /* loaded from: classes.dex */
    public class C1016d implements pw1.InterfaceC2649a {
        public C1016d() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            l01 m17249c = l01.m17249c();
            if (m17249c != null) {
                m17249c.m17232t();
            }
        }
    }

    /* renamed from: com.daaw.cx0$e */
    /* loaded from: classes.dex */
    public class C1017e implements pw1.InterfaceC2649a {
        public C1017e() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            C0743c.f4012f.m19309a(4);
        }
    }

    /* renamed from: com.daaw.cx0$f */
    /* loaded from: classes.dex */
    public class C1018f implements vw1.InterfaceC3381a<Long> {
        public C1018f() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Long mo3126a() {
            return Long.valueOf(xw0.f33012i);
        }
    }

    /* renamed from: com.daaw.cx0$g */
    /* loaded from: classes.dex */
    public class C1019g implements qw1.InterfaceC2788a<Long> {
        public C1019g() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Long l) {
            C0743c.f4015i.m19309a(l);
        }
    }

    /* renamed from: com.daaw.cx0$h */
    /* loaded from: classes.dex */
    public class C1020h implements vw1.InterfaceC3381a<Integer> {
        public C1020h() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Integer mo3126a() {
            MainActivity m26903r0 = MainActivity.m26903r0();
            return Integer.valueOf(cx0.this.m24940a(true, m26903r0 != null ? m26903r0.f3735N : 0));
        }
    }

    /* renamed from: com.daaw.cx0$i */
    /* loaded from: classes.dex */
    public class C1021i implements vw1.InterfaceC3381a<Integer> {
        public C1021i() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Integer mo3126a() {
            l01 m17249c = l01.m17249c();
            return Integer.valueOf(m17249c != null ? m17249c.m17237o() : 0);
        }
    }

    /* renamed from: com.daaw.cx0$j */
    /* loaded from: classes.dex */
    public class C1022j implements qw1.InterfaceC2788a<Integer> {
        public C1022j() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Integer num) {
            l01 m17249c = l01.m17249c();
            if (m17249c != null) {
                m17249c.m17253T(num.intValue(), true);
            }
        }
    }

    /* renamed from: com.daaw.cx0$k */
    /* loaded from: classes.dex */
    public class C1023k implements qw1.InterfaceC2788a<Integer> {
        public C1023k() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Integer num) {
            ko0 m17610q = ko0.m17610q();
            if (m17610q != null) {
                m17610q.m17601z(num.intValue());
            }
            dj0.m24357k(num.intValue());
        }
    }

    public cx0() {
        ko0.f16503I.m12989b(new C1015c(), this.f6235a);
        ko0.f16504J.m12989b(new C1016d(), this.f6235a);
        ko0.f16505K.m12989b(new C1017e(), this.f6235a);
        ko0.f16506L.m6691b(new C1018f(), this.f6235a);
        ko0.f16509O.m12017b(new C1019g(), this.f6235a);
        ko0.f16502H.m6691b(new C1020h(), this.f6235a);
        ko0.f16522b0.m6691b(new C1021i(), this.f6235a);
        ko0.f16523c0.m12017b(new C1022j(), this.f6235a);
        l01.f16926w.m12017b(new C1023k(), this.f6235a);
        MainActivity.f3702A0.m12017b(new C1013a(), this.f6235a);
        MediaControlsView.f3764p.m26885a().m9794b(new C1014b(), this.f6235a);
    }

    /* renamed from: a */
    public int m24940a(boolean z, int i) {
        if (dx0.m23837e() == null) {
            return 2;
        }
        if (z) {
            return i == 0 ? 1 : 2;
        }
        return 0;
    }
}
