package com.daaw;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.daaw.C3412wb;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.PrControls.PrButton;
import com.daaw.avee.comp.Common.PrControls.PrCheckBox;
import com.daaw.avee.comp.Common.PrControls.PrEditText;
import com.daaw.avee.comp.Common.PrControls.PrImageButton;
import com.daaw.j01;
import com.daaw.qw1;
import com.daaw.rw1;
import com.daaw.vw1;
import com.daaw.ww1;
import com.daaw.xw1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class nc0 {

    /* renamed from: g */
    public static vw1<Boolean> f19989g = new vw1<>();

    /* renamed from: h */
    public static ww1<C0645al, Boolean> f19990h = new ww1<>();

    /* renamed from: i */
    public static ww1<Boolean, Boolean> f19991i = new ww1<>();

    /* renamed from: j */
    public static xw1<Object, Integer[], Boolean> f19992j = new xw1<>();

    /* renamed from: k */
    public static final Long f19993k = 1682294400000L;

    /* renamed from: l */
    public static boolean f19994l = false;

    /* renamed from: m */
    public static boolean f19995m = false;

    /* renamed from: n */
    public static ww1<Boolean, Boolean> f19996n = new ww1<>();

    /* renamed from: o */
    public static ww1<String, Boolean> f19997o = new ww1<>();

    /* renamed from: p */
    public static vw1<Boolean> f19998p = new vw1<>();

    /* renamed from: q */
    public static ww1<Boolean, Boolean> f19999q = new ww1<>();

    /* renamed from: r */
    public static vw1<List<kz0>> f20000r = new vw1<>();

    /* renamed from: a */
    public final List<Object> f20001a;

    /* renamed from: b */
    public C2282i f20002b;

    /* renamed from: c */
    public C3412wb f20003c;

    /* renamed from: d */
    public List<String> f20004d;

    /* renamed from: e */
    public List<Purchase> f20005e;

    /* renamed from: f */
    public List<kz0> f20006f;

    /* renamed from: com.daaw.nc0$a */
    /* loaded from: classes.dex */
    public class C2274a implements qw1.InterfaceC2788a<Activity> {
        public C2274a() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Activity activity) {
            nc0.this.m15257x(activity);
        }
    }

    /* renamed from: com.daaw.nc0$b */
    /* loaded from: classes.dex */
    public class C2275b implements xw1.InterfaceC3648a<C0645al, PrCheckBox, Boolean> {
        public C2275b() {
        }

        @Override // com.daaw.xw1.InterfaceC3648a
        /* renamed from: a */
        public Boolean mo4423c(C0645al c0645al, PrCheckBox prCheckBox) {
            if (nc0.this.m15301A().booleanValue()) {
                return Boolean.FALSE;
            }
            nc0.this.m15282T(c0645al);
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.daaw.nc0$c */
    /* loaded from: classes.dex */
    public class C2276c implements xw1.InterfaceC3648a<C0645al, PrEditText, Boolean> {
        public C2276c() {
        }

        @Override // com.daaw.xw1.InterfaceC3648a
        /* renamed from: a */
        public Boolean mo4423c(C0645al c0645al, PrEditText prEditText) {
            if (nc0.this.m15301A().booleanValue()) {
                return Boolean.FALSE;
            }
            nc0.this.m15282T(c0645al);
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.daaw.nc0$d */
    /* loaded from: classes.dex */
    public class C2277d implements xw1.InterfaceC3648a<C0645al, PrButton, Boolean> {
        public C2277d() {
        }

        @Override // com.daaw.xw1.InterfaceC3648a
        /* renamed from: a */
        public Boolean mo4423c(C0645al c0645al, PrButton prButton) {
            if (nc0.this.m15301A().booleanValue()) {
                return Boolean.FALSE;
            }
            nc0.this.m15282T(c0645al);
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.daaw.nc0$e */
    /* loaded from: classes.dex */
    public class C2278e implements qw1.InterfaceC2788a<Activity> {
        public C2278e() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Activity activity) {
            nc0.this.m15257x(activity);
            nc0.this.m15281U(activity, false);
        }
    }

    /* renamed from: com.daaw.nc0$f */
    /* loaded from: classes.dex */
    public class C2279f implements qw1.InterfaceC2788a<C0645al> {
        public C2279f() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(C0645al c0645al) {
            nc0.this.m15300B();
        }
    }

    /* renamed from: com.daaw.nc0$g */
    /* loaded from: classes.dex */
    public class C2280g implements rw1.InterfaceC2894a<Integer, C0645al> {
        public C2280g() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Integer num, C0645al c0645al) {
            if (num.intValue() == 4) {
                nc0.this.m15282T(c0645al);
            }
        }
    }

    /* renamed from: com.daaw.nc0$h */
    /* loaded from: classes.dex */
    public class C2281h implements vw1.InterfaceC3381a<lo1<Boolean, Boolean>> {
        public C2281h() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public lo1<Boolean, Boolean> mo3126a() {
            return new lo1<>(nc0.this.m15301A(), Boolean.TRUE);
        }
    }

    /* renamed from: com.daaw.nc0$i */
    /* loaded from: classes.dex */
    public class C2282i implements C3412wb.InterfaceC3417e {
        public C2282i() {
        }

        public /* synthetic */ C2282i(nc0 nc0Var, C2274a c2274a) {
            this();
        }

        @Override // com.daaw.C3412wb.InterfaceC3417e
        /* renamed from: a */
        public void mo6230a() {
            nc0.f19995m = true;
            boolean unused = nc0.f19994l = false;
        }

        @Override // com.daaw.C3412wb.InterfaceC3417e
        /* renamed from: b */
        public void mo6229b() {
            if (nc0.this.f20003c != null) {
                nc0.this.m15287O();
                return;
            }
            x10.m5653a().m5651c("no billing manager from it's listener");
            mo6230a();
        }

        @Override // com.daaw.C3412wb.InterfaceC3417e
        /* renamed from: c */
        public void mo6228c(List<Purchase> list, boolean z) {
            ArrayList<Purchase> arrayList = new ArrayList();
            Iterator<Purchase> it = list.iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                Purchase next = it.next();
                Iterator<String> it2 = next.m27865b().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if ("premium".equals(it2.next())) {
                            boolean unused = nc0.f19994l = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Purchase purchase : arrayList) {
                arrayList2.addAll(purchase.m27865b());
            }
            if (nc0.this.f20005e == null || z) {
                nc0.this.f20004d = arrayList2;
                nc0.this.f20005e = arrayList;
            }
            ww1<Boolean, Boolean> ww1Var = nc0.f19996n;
            Boolean bool = Boolean.TRUE;
            ww1Var.m5753a(bool, bool);
            nc0.f19995m = true;
            nc0.this.m15285Q();
        }
    }

    public nc0() {
        LinkedList linkedList = new LinkedList();
        this.f20001a = linkedList;
        this.f20004d = null;
        this.f20005e = null;
        this.f20006f = null;
        this.f20002b = new C2282i(this, null);
        MainActivity.f3715h0.m12017b(new C2274a(), linkedList);
        PrCheckBox.f3798u.m4424b(new C2275b(), linkedList);
        PrEditText.f3800y.m4424b(new C2276c(), linkedList);
        PrButton.f3794s.m4424b(new C2277d(), linkedList);
        MainActivity.f3717j0.m12017b(new C2278e(), linkedList);
        MainActivity.f3721n0.m12017b(new C2279f(), linkedList);
        hg1.f12513A.m12017b(new qw1.InterfaceC2788a() { // from class: com.daaw.ec0
            @Override // com.daaw.qw1.InterfaceC2788a
            /* renamed from: b */
            public final void mo3122b(Object obj) {
                nc0.this.m15256y((String) obj);
            }
        }, linkedList);
        MainActivity.f3725r0.m10861b(new C2280g(), linkedList);
        PrImageButton.f3808q.m4424b(new xw1.InterfaceC3648a() { // from class: com.daaw.dc0
            @Override // com.daaw.xw1.InterfaceC3648a
            /* renamed from: c */
            public final Object mo4423c(Object obj, Object obj2) {
                Boolean m15299C;
                m15299C = nc0.this.m15299C((C0645al) obj, (PrImageButton) obj2);
                return m15299C;
            }
        }, linkedList);
        f19990h.m5752b(new ww1.InterfaceC3477a() { // from class: com.daaw.kc0
            @Override // com.daaw.ww1.InterfaceC3477a
            /* renamed from: b */
            public final Object mo5751b(Object obj) {
                Boolean m15298D;
                m15298D = nc0.this.m15298D((C0645al) obj);
                return m15298D;
            }
        }, linkedList);
        oy0.f22097a.m6691b(new fc0(this), linkedList);
        PrCheckBox.f3797t.m6691b(new fc0(this), linkedList);
        PrEditText.f3799x.m6691b(new vw1.InterfaceC3381a() { // from class: com.daaw.hc0
            @Override // com.daaw.vw1.InterfaceC3381a
            /* renamed from: a */
            public final Object mo3126a() {
                Boolean m15292J;
                m15292J = nc0.this.m15292J();
                return m15292J;
            }
        }, linkedList);
        PrButton.f3793r.m5752b(new ww1.InterfaceC3477a() { // from class: com.daaw.mc0
            @Override // com.daaw.ww1.InterfaceC3477a
            /* renamed from: b */
            public final Object mo5751b(Object obj) {
                Boolean m15291K;
                m15291K = nc0.this.m15291K((Integer[]) obj);
                return m15291K;
            }
        }, linkedList);
        PrImageButton.f3807p.m6691b(new vw1.InterfaceC3381a() { // from class: com.daaw.gc0
            @Override // com.daaw.vw1.InterfaceC3381a
            /* renamed from: a */
            public final Object mo3126a() {
                Boolean m15290L;
                m15290L = nc0.this.m15290L();
                return m15290L;
            }
        }, linkedList);
        C3723yn.f33867z.m6691b(new fc0(this), linkedList);
        pl0.f23009X.m5752b(new ww1.InterfaceC3477a() { // from class: com.daaw.bc0
            @Override // com.daaw.ww1.InterfaceC3477a
            /* renamed from: b */
            public final Object mo5751b(Object obj) {
                Boolean m15289M;
                m15289M = nc0.this.m15289M(obj);
                return m15289M;
            }
        }, linkedList);
        C3543xi.f32730S.m5752b(new ww1.InterfaceC3477a() { // from class: com.daaw.cc0
            @Override // com.daaw.ww1.InterfaceC3477a
            /* renamed from: b */
            public final Object mo5751b(Object obj) {
                Boolean m15297E;
                m15297E = nc0.this.m15297E(obj);
                return m15297E;
            }
        }, linkedList);
        qv1.f24436P.m5752b(new ww1.InterfaceC3477a() { // from class: com.daaw.ac0
            @Override // com.daaw.ww1.InterfaceC3477a
            /* renamed from: b */
            public final Object mo5751b(Object obj) {
                Boolean m15296F;
                m15296F = nc0.this.m15296F((Integer[]) obj);
                return m15296F;
            }
        }, linkedList);
        MainActivity.f3709H0.m6691b(new C2281h(), linkedList);
        hg1.f12514B.m6691b(new fc0(this), linkedList);
        f19989g.m6691b(new fc0(this), linkedList);
        f19997o.m5752b(new ww1.InterfaceC3477a() { // from class: com.daaw.lc0
            @Override // com.daaw.ww1.InterfaceC3477a
            /* renamed from: b */
            public final Object mo5751b(Object obj) {
                Boolean m15295G;
                m15295G = nc0.this.m15295G((String) obj);
                return m15295G;
            }
        }, linkedList);
        f20000r.m6691b(new vw1.InterfaceC3381a() { // from class: com.daaw.jc0
            @Override // com.daaw.vw1.InterfaceC3381a
            /* renamed from: a */
            public final Object mo3126a() {
                List m15294H;
                m15294H = nc0.this.m15294H();
                return m15294H;
            }
        }, linkedList);
        f19998p.m6691b(new vw1.InterfaceC3381a() { // from class: com.daaw.ic0
            @Override // com.daaw.vw1.InterfaceC3381a
            /* renamed from: a */
            public final Object mo3126a() {
                Boolean m15293I;
                m15293I = nc0.this.m15293I();
                return m15293I;
            }
        }, linkedList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ Boolean m15299C(C0645al c0645al, PrImageButton prImageButton) {
        if (m15301A().booleanValue()) {
            return Boolean.FALSE;
        }
        m15282T(c0645al);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ Boolean m15298D(C0645al c0645al) {
        m15282T(c0645al);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ Boolean m15297E(Object obj) {
        return m15301A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ Boolean m15296F(Integer[] numArr) {
        return Boolean.valueOf(m15301A().booleanValue() && f19992j.m4425a(this, numArr, Boolean.FALSE).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ Boolean m15295G(String str) {
        List<String> list = this.f20004d;
        return Boolean.valueOf(list != null && list.contains(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ List m15294H() {
        return this.f20006f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ Boolean m15293I() {
        List<Purchase> list = this.f20005e;
        return Boolean.valueOf((list == null || list.isEmpty()) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ Boolean m15292J() {
        boolean z = true;
        Integer[] numArr = {1, 7, 5, 3};
        return Boolean.valueOf((m15301A().booleanValue() && f19992j.m4425a(this, numArr, Boolean.FALSE).booleanValue() && numArr[2].equals(numArr[3])) ? false : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ Boolean m15291K(Integer[] numArr) {
        return Boolean.valueOf(m15301A().booleanValue() && f19992j.m4425a(this, numArr, Boolean.FALSE).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ Boolean m15290L() {
        boolean z = false;
        Integer[] numArr = {4, 4, 6, 4};
        if (m15301A().booleanValue() && f19992j.m4425a(this, numArr, Boolean.FALSE).booleanValue() && numArr[2].equals(numArr[3])) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ Boolean m15289M(Object obj) {
        return m15301A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m15288N(C3518xb c3518xb, List list) {
        if (c3518xb.m5324b() == 0) {
            this.f20006f = list;
            f19999q.m5753a(Boolean.TRUE, Boolean.FALSE);
            return;
        }
        ww1<Boolean, Boolean> ww1Var = f19999q;
        Boolean bool = Boolean.FALSE;
        ww1Var.m5753a(bool, bool);
    }

    /* renamed from: A */
    public Boolean m15301A() {
        List<String> list;
        return Boolean.valueOf(((!f19994l || System.currentTimeMillis() >= f19993k.longValue()) && ((list = this.f20004d) == null || list.isEmpty())) ? true : true);
    }

    /* renamed from: B */
    public final void m15300B() {
        lz1.m16365a("killHelper");
        m15286P();
    }

    /* renamed from: O */
    public void m15287O() {
        m15283S();
    }

    /* renamed from: P */
    public void m15286P() {
        lz1.m16365a("Destroying helper.");
        C3412wb c3412wb = this.f20003c;
        if (c3412wb != null) {
            c3412wb.m6243k();
        }
        this.f20003c = null;
    }

    /* renamed from: Q */
    public final void m15285Q() {
        MainActivity m26903r0 = MainActivity.m26903r0();
        if (m26903r0 != null) {
            m26903r0.m26933S0();
        }
    }

    /* renamed from: R */
    public final void m15284R() {
        C3412wb c3412wb = this.f20003c;
        if (c3412wb == null || c3412wb.m6240n() != 0) {
            return;
        }
        this.f20003c.m6236r();
    }

    /* renamed from: S */
    public void m15283S() {
        this.f20003c.m6235s(m15255z(), new lz0() { // from class: com.daaw.zb0
            @Override // com.daaw.lz0
            /* renamed from: a */
            public final void mo2556a(C3518xb c3518xb, List list) {
                nc0.this.m15288N(c3518xb, list);
            }
        });
    }

    /* renamed from: T */
    public final void m15282T(C0645al c0645al) {
        hg1.m20813f(c0645al);
    }

    /* renamed from: U */
    public final boolean m15281U(Activity activity, boolean z) {
        m15284R();
        return false;
    }

    /* renamed from: x */
    public final void m15257x(Activity activity) {
        if (this.f20003c == null) {
            this.f20003c = new C3412wb(activity, this.f20002b);
        }
    }

    /* renamed from: y */
    public final void m15256y(String str) {
        Purchase purchase;
        kz0 kz0Var;
        Context m23837e;
        C3412wb c3412wb = this.f20003c;
        if (c3412wb == null || c3412wb.m6240n() <= -1) {
            if (dx0.m23837e() != null) {
                C3385vy.f30703a.m12018a("Billing manager not initialized");
                return;
            }
            return;
        }
        if (3 == this.f20003c.m6240n() && (m23837e = dx0.m23837e()) != null) {
            C3385vy.f30703a.m12018a("" + ((Object) m23837e.getText(R.string.error_billing_unavailable)));
        }
        m15287O();
        try {
            Iterator<kz0> it = this.f20006f.iterator();
            while (true) {
                purchase = null;
                if (!it.hasNext()) {
                    kz0Var = null;
                    break;
                }
                kz0Var = it.next();
                if (kz0Var.m17311b().equals(str)) {
                    break;
                }
            }
        } catch (Exception e) {
            lz1.m16363c("launchPurchaseFlow exception: " + e.getMessage());
        }
        if (kz0Var == null) {
            return;
        }
        List<Purchase> list = this.f20005e;
        if (list != null && !list.isEmpty()) {
            for (Purchase purchase2 : this.f20005e) {
                if (purchase2.m27860g()) {
                    purchase = purchase2;
                }
            }
            if (purchase == null) {
                purchase = this.f20005e.get(0);
            }
        }
        this.f20003c.m6238p(kz0Var, purchase);
        m15285Q();
    }

    /* renamed from: z */
    public final List<j01.C1777b> m15255z() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j01.C1777b.m19207a().m19203b("premium_1month").m19202c("subs").m19204a());
        arrayList.add(j01.C1777b.m19207a().m19203b("premium_3month").m19202c("subs").m19204a());
        arrayList.add(j01.C1777b.m19207a().m19203b("premium_12month").m19202c("subs").m19204a());
        return arrayList;
    }
}
