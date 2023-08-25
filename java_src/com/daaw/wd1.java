package com.daaw;

import com.daaw.avee.MainActivity;
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
    public List<Object> a = new LinkedList();

    /* loaded from: classes.dex */
    public class a implements rw1.a<Integer, al> {
        public a() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Integer num, al alVar) {
            td1 c;
            if (alVar.c() == null) {
                return;
            }
            if (num.intValue() == 1) {
                xd1.g(alVar);
            } else if (num.intValue() != 10 || (c = td1.c()) == null) {
            } else {
                ud1 e = c.e();
                c.b(false, e.b, c.g(), e.c);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements vw1.a<ud1> {
        public b() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public ud1 a() {
            td1 c = td1.c();
            return c == null ? new ud1() : c.e();
        }
    }

    /* loaded from: classes.dex */
    public class c implements sw1.a<Boolean, Integer, Boolean> {
        public c() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(Boolean bool, Integer num, Boolean bool2) {
            ud1 ud1Var = new ud1();
            ud1Var.a = bool.booleanValue();
            ud1Var.b = num.intValue();
            ud1Var.c = bool2.booleanValue();
            MainActivity r0 = MainActivity.r0();
            if (r0 != null) {
                r0.W0(ud1Var.a, false);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements pw1.a {
        public d() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            com.daaw.avee.comp.playback.c.f.a(3);
        }
    }

    /* loaded from: classes.dex */
    public class e implements tw1.a<Boolean, Integer, Date, Boolean> {
        public e() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(Boolean bool, Integer num, Date date, Boolean bool2) {
            td1 c = td1.c();
            if (c == null) {
                return;
            }
            c.b(bool.booleanValue(), num.intValue(), date, bool2.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public class f implements vw1.a<ud1> {
        public f() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public ud1 a() {
            td1 c = td1.c();
            return c == null ? new ud1() : c.e();
        }
    }

    /* loaded from: classes.dex */
    public class g implements vw1.a<Integer> {
        public g() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Integer a() {
            td1 c = td1.c();
            return Integer.valueOf(c == null ? 0 : c.f());
        }
    }

    public wd1() {
        MainActivity.r0.b(new a(), this.a);
        MainActivity.t0.b(new b(), this.a);
        td1.f.b(new c(), this.a);
        td1.g.b(new d(), this.a);
        xd1.x.b(new e(), this.a);
        xd1.y.b(new f(), this.a);
        xd1.z.b(new g(), this.a);
        xd1.A.b(new vw1.a() { // from class: com.daaw.vd1
            @Override // com.daaw.vw1.a
            public final Object a() {
                lo1 b2;
                b2 = wd1.b();
                return b2;
            }
        }, this.a);
    }

    public static /* synthetic */ lo1 b() {
        td1 c2 = td1.c();
        return c2 == null ? new lo1(new Date(), Boolean.FALSE) : new lo1(c2.g(), Boolean.valueOf(c2.e().a));
    }
}
