package com.daaw;

import android.view.View;
import com.daaw.avee.MainActivity;
import com.daaw.avee.MediaControlsView;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.sw1;
import com.daaw.vw1;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class cx0 {
    public List<Object> a = new LinkedList();

    /* loaded from: classes.dex */
    public class a implements qw1.a<Boolean> {
        public a() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Boolean bool) {
            int i;
            ko0 q = ko0.q();
            if (bool.booleanValue()) {
                if (q != null) {
                    q.p(0);
                    return;
                }
                return;
            }
            MainActivity r0 = MainActivity.r0();
            if ((r0 != null ? r0.N : 0) == 0) {
                if (q == null) {
                    return;
                }
                i = 1;
            } else if (q == null) {
                return;
            } else {
                i = 2;
            }
            q.p(i);
        }
    }

    /* loaded from: classes.dex */
    public class b implements sw1.a<View, View, View> {
        public b() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(View view, View view2, View view3) {
            ko0 q = ko0.q();
            if (q != null) {
                q.v(view, view2, view3);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements pw1.a {
        public c() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            l01 c = l01.c();
            if (c != null) {
                c.H();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements pw1.a {
        public d() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            l01 c = l01.c();
            if (c != null) {
                c.t();
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements pw1.a {
        public e() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            com.daaw.avee.comp.playback.c.f.a(4);
        }
    }

    /* loaded from: classes.dex */
    public class f implements vw1.a<Long> {
        public f() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Long a() {
            return Long.valueOf(xw0.i);
        }
    }

    /* loaded from: classes.dex */
    public class g implements qw1.a<Long> {
        public g() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Long l) {
            com.daaw.avee.comp.playback.c.i.a(l);
        }
    }

    /* loaded from: classes.dex */
    public class h implements vw1.a<Integer> {
        public h() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Integer a() {
            MainActivity r0 = MainActivity.r0();
            return Integer.valueOf(cx0.this.a(true, r0 != null ? r0.N : 0));
        }
    }

    /* loaded from: classes.dex */
    public class i implements vw1.a<Integer> {
        public i() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Integer a() {
            l01 c = l01.c();
            return Integer.valueOf(c != null ? c.o() : 0);
        }
    }

    /* loaded from: classes.dex */
    public class j implements qw1.a<Integer> {
        public j() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Integer num) {
            l01 c = l01.c();
            if (c != null) {
                c.T(num.intValue(), true);
            }
        }
    }

    /* loaded from: classes.dex */
    public class k implements qw1.a<Integer> {
        public k() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Integer num) {
            ko0 q = ko0.q();
            if (q != null) {
                q.z(num.intValue());
            }
            dj0.k(num.intValue());
        }
    }

    public cx0() {
        ko0.I.b(new c(), this.a);
        ko0.J.b(new d(), this.a);
        ko0.K.b(new e(), this.a);
        ko0.L.b(new f(), this.a);
        ko0.O.b(new g(), this.a);
        ko0.H.b(new h(), this.a);
        ko0.b0.b(new i(), this.a);
        ko0.c0.b(new j(), this.a);
        l01.w.b(new k(), this.a);
        MainActivity.A0.b(new a(), this.a);
        MediaControlsView.p.a().b(new b(), this.a);
    }

    public int a(boolean z, int i2) {
        if (dx0.e() == null) {
            return 2;
        }
        if (z) {
            return i2 == 0 ? 1 : 2;
        }
        return 0;
    }
}
