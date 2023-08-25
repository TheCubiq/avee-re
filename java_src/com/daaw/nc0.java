package com.daaw;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.Purchase;
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
import com.daaw.wb;
import com.daaw.ww1;
import com.daaw.xw1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class nc0 {
    public static vw1<Boolean> g = new vw1<>();
    public static ww1<al, Boolean> h = new ww1<>();
    public static ww1<Boolean, Boolean> i = new ww1<>();
    public static xw1<Object, Integer[], Boolean> j = new xw1<>();
    public static final Long k = 1682294400000L;
    public static boolean l = false;
    public static boolean m = false;
    public static ww1<Boolean, Boolean> n = new ww1<>();
    public static ww1<String, Boolean> o = new ww1<>();
    public static vw1<Boolean> p = new vw1<>();
    public static ww1<Boolean, Boolean> q = new ww1<>();
    public static vw1<List<kz0>> r = new vw1<>();
    public final List<Object> a;
    public i b;
    public wb c;
    public List<String> d;
    public List<Purchase> e;
    public List<kz0> f;

    /* loaded from: classes.dex */
    public class a implements qw1.a<Activity> {
        public a() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Activity activity) {
            nc0.this.x(activity);
        }
    }

    /* loaded from: classes.dex */
    public class b implements xw1.a<al, PrCheckBox, Boolean> {
        public b() {
        }

        @Override // com.daaw.xw1.a
        /* renamed from: a */
        public Boolean c(al alVar, PrCheckBox prCheckBox) {
            if (nc0.this.A().booleanValue()) {
                return Boolean.FALSE;
            }
            nc0.this.T(alVar);
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public class c implements xw1.a<al, PrEditText, Boolean> {
        public c() {
        }

        @Override // com.daaw.xw1.a
        /* renamed from: a */
        public Boolean c(al alVar, PrEditText prEditText) {
            if (nc0.this.A().booleanValue()) {
                return Boolean.FALSE;
            }
            nc0.this.T(alVar);
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public class d implements xw1.a<al, PrButton, Boolean> {
        public d() {
        }

        @Override // com.daaw.xw1.a
        /* renamed from: a */
        public Boolean c(al alVar, PrButton prButton) {
            if (nc0.this.A().booleanValue()) {
                return Boolean.FALSE;
            }
            nc0.this.T(alVar);
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public class e implements qw1.a<Activity> {
        public e() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Activity activity) {
            nc0.this.x(activity);
            nc0.this.U(activity, false);
        }
    }

    /* loaded from: classes.dex */
    public class f implements qw1.a<al> {
        public f() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(al alVar) {
            nc0.this.B();
        }
    }

    /* loaded from: classes.dex */
    public class g implements rw1.a<Integer, al> {
        public g() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Integer num, al alVar) {
            if (num.intValue() == 4) {
                nc0.this.T(alVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements vw1.a<lo1<Boolean, Boolean>> {
        public h() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public lo1<Boolean, Boolean> a() {
            return new lo1<>(nc0.this.A(), Boolean.TRUE);
        }
    }

    /* loaded from: classes.dex */
    public class i implements wb.e {
        public i() {
        }

        public /* synthetic */ i(nc0 nc0Var, a aVar) {
            this();
        }

        @Override // com.daaw.wb.e
        public void a() {
            nc0.m = true;
            boolean unused = nc0.l = false;
        }

        @Override // com.daaw.wb.e
        public void b() {
            if (nc0.this.c != null) {
                nc0.this.O();
                return;
            }
            x10.a().c("no billing manager from it's listener");
            a();
        }

        @Override // com.daaw.wb.e
        public void c(List<Purchase> list, boolean z) {
            ArrayList<Purchase> arrayList = new ArrayList();
            Iterator<Purchase> it = list.iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                Purchase next = it.next();
                Iterator<String> it2 = next.b().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if ("premium".equals(it2.next())) {
                            boolean unused = nc0.l = true;
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
                arrayList2.addAll(purchase.b());
            }
            if (nc0.this.e == null || z) {
                nc0.this.d = arrayList2;
                nc0.this.e = arrayList;
            }
            ww1<Boolean, Boolean> ww1Var = nc0.n;
            Boolean bool = Boolean.TRUE;
            ww1Var.a(bool, bool);
            nc0.m = true;
            nc0.this.Q();
        }
    }

    public nc0() {
        LinkedList linkedList = new LinkedList();
        this.a = linkedList;
        this.d = null;
        this.e = null;
        this.f = null;
        this.b = new i(this, null);
        MainActivity.h0.b(new a(), linkedList);
        PrCheckBox.u.b(new b(), linkedList);
        PrEditText.y.b(new c(), linkedList);
        PrButton.s.b(new d(), linkedList);
        MainActivity.j0.b(new e(), linkedList);
        MainActivity.n0.b(new f(), linkedList);
        hg1.A.b(new qw1.a() { // from class: com.daaw.ec0
            @Override // com.daaw.qw1.a
            public final void b(Object obj) {
                nc0.this.y((String) obj);
            }
        }, linkedList);
        MainActivity.r0.b(new g(), linkedList);
        PrImageButton.q.b(new xw1.a() { // from class: com.daaw.dc0
            @Override // com.daaw.xw1.a
            public final Object c(Object obj, Object obj2) {
                Boolean C;
                C = nc0.this.C((al) obj, (PrImageButton) obj2);
                return C;
            }
        }, linkedList);
        h.b(new ww1.a() { // from class: com.daaw.kc0
            @Override // com.daaw.ww1.a
            public final Object b(Object obj) {
                Boolean D;
                D = nc0.this.D((al) obj);
                return D;
            }
        }, linkedList);
        oy0.a.b(new fc0(this), linkedList);
        PrCheckBox.t.b(new fc0(this), linkedList);
        PrEditText.x.b(new vw1.a() { // from class: com.daaw.hc0
            @Override // com.daaw.vw1.a
            public final Object a() {
                Boolean J;
                J = nc0.this.J();
                return J;
            }
        }, linkedList);
        PrButton.r.b(new ww1.a() { // from class: com.daaw.mc0
            @Override // com.daaw.ww1.a
            public final Object b(Object obj) {
                Boolean K;
                K = nc0.this.K((Integer[]) obj);
                return K;
            }
        }, linkedList);
        PrImageButton.p.b(new vw1.a() { // from class: com.daaw.gc0
            @Override // com.daaw.vw1.a
            public final Object a() {
                Boolean L;
                L = nc0.this.L();
                return L;
            }
        }, linkedList);
        yn.z.b(new fc0(this), linkedList);
        pl0.X.b(new ww1.a() { // from class: com.daaw.bc0
            @Override // com.daaw.ww1.a
            public final Object b(Object obj) {
                Boolean M;
                M = nc0.this.M(obj);
                return M;
            }
        }, linkedList);
        xi.S.b(new ww1.a() { // from class: com.daaw.cc0
            @Override // com.daaw.ww1.a
            public final Object b(Object obj) {
                Boolean E;
                E = nc0.this.E(obj);
                return E;
            }
        }, linkedList);
        qv1.P.b(new ww1.a() { // from class: com.daaw.ac0
            @Override // com.daaw.ww1.a
            public final Object b(Object obj) {
                Boolean F;
                F = nc0.this.F((Integer[]) obj);
                return F;
            }
        }, linkedList);
        MainActivity.H0.b(new h(), linkedList);
        hg1.B.b(new fc0(this), linkedList);
        g.b(new fc0(this), linkedList);
        o.b(new ww1.a() { // from class: com.daaw.lc0
            @Override // com.daaw.ww1.a
            public final Object b(Object obj) {
                Boolean G;
                G = nc0.this.G((String) obj);
                return G;
            }
        }, linkedList);
        r.b(new vw1.a() { // from class: com.daaw.jc0
            @Override // com.daaw.vw1.a
            public final Object a() {
                List H;
                H = nc0.this.H();
                return H;
            }
        }, linkedList);
        p.b(new vw1.a() { // from class: com.daaw.ic0
            @Override // com.daaw.vw1.a
            public final Object a() {
                Boolean I;
                I = nc0.this.I();
                return I;
            }
        }, linkedList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean C(al alVar, PrImageButton prImageButton) {
        if (A().booleanValue()) {
            return Boolean.FALSE;
        }
        T(alVar);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean D(al alVar) {
        T(alVar);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean E(Object obj) {
        return A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean F(Integer[] numArr) {
        return Boolean.valueOf(A().booleanValue() && j.a(this, numArr, Boolean.FALSE).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean G(String str) {
        List<String> list = this.d;
        return Boolean.valueOf(list != null && list.contains(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List H() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean I() {
        List<Purchase> list = this.e;
        return Boolean.valueOf((list == null || list.isEmpty()) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean J() {
        boolean z = true;
        Integer[] numArr = {1, 7, 5, 3};
        return Boolean.valueOf((A().booleanValue() && j.a(this, numArr, Boolean.FALSE).booleanValue() && numArr[2].equals(numArr[3])) ? false : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean K(Integer[] numArr) {
        return Boolean.valueOf(A().booleanValue() && j.a(this, numArr, Boolean.FALSE).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean L() {
        boolean z = false;
        Integer[] numArr = {4, 4, 6, 4};
        if (A().booleanValue() && j.a(this, numArr, Boolean.FALSE).booleanValue() && numArr[2].equals(numArr[3])) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean M(Object obj) {
        return A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(xb xbVar, List list) {
        if (xbVar.b() == 0) {
            this.f = list;
            q.a(Boolean.TRUE, Boolean.FALSE);
            return;
        }
        ww1<Boolean, Boolean> ww1Var = q;
        Boolean bool = Boolean.FALSE;
        ww1Var.a(bool, bool);
    }

    public Boolean A() {
        List<String> list;
        return Boolean.valueOf(((!l || System.currentTimeMillis() >= k.longValue()) && ((list = this.d) == null || list.isEmpty())) ? true : true);
    }

    public final void B() {
        lz1.a("killHelper");
        P();
    }

    public void O() {
        S();
    }

    public void P() {
        lz1.a("Destroying helper.");
        wb wbVar = this.c;
        if (wbVar != null) {
            wbVar.k();
        }
        this.c = null;
    }

    public final void Q() {
        MainActivity r0 = MainActivity.r0();
        if (r0 != null) {
            r0.S0();
        }
    }

    public final void R() {
        wb wbVar = this.c;
        if (wbVar == null || wbVar.n() != 0) {
            return;
        }
        this.c.r();
    }

    public void S() {
        this.c.s(z(), new lz0() { // from class: com.daaw.zb0
            @Override // com.daaw.lz0
            public final void a(xb xbVar, List list) {
                nc0.this.N(xbVar, list);
            }
        });
    }

    public final void T(al alVar) {
        hg1.f(alVar);
    }

    public final boolean U(Activity activity, boolean z) {
        R();
        return false;
    }

    public final void x(Activity activity) {
        if (this.c == null) {
            this.c = new wb(activity, this.b);
        }
    }

    public final void y(String str) {
        Purchase purchase;
        kz0 kz0Var;
        Context e2;
        wb wbVar = this.c;
        if (wbVar == null || wbVar.n() <= -1) {
            if (dx0.e() != null) {
                vy.a.a("Billing manager not initialized");
                return;
            }
            return;
        }
        if (3 == this.c.n() && (e2 = dx0.e()) != null) {
            vy.a.a("" + ((Object) e2.getText(R.string.error_billing_unavailable)));
        }
        O();
        try {
            Iterator<kz0> it = this.f.iterator();
            while (true) {
                purchase = null;
                if (!it.hasNext()) {
                    kz0Var = null;
                    break;
                }
                kz0Var = it.next();
                if (kz0Var.b().equals(str)) {
                    break;
                }
            }
        } catch (Exception e3) {
            lz1.c("launchPurchaseFlow exception: " + e3.getMessage());
        }
        if (kz0Var == null) {
            return;
        }
        List<Purchase> list = this.e;
        if (list != null && !list.isEmpty()) {
            for (Purchase purchase2 : this.e) {
                if (purchase2.g()) {
                    purchase = purchase2;
                }
            }
            if (purchase == null) {
                purchase = this.e.get(0);
            }
        }
        this.c.p(kz0Var, purchase);
        Q();
    }

    public final List<j01.b> z() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j01.b.a().b("premium_1month").c("subs").a());
        arrayList.add(j01.b.a().b("premium_3month").c("subs").a());
        arrayList.add(j01.b.a().b("premium_12month").c("subs").a());
        return arrayList;
    }
}
