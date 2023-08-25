package com.daaw;

import android.app.Activity;
import com.android.billingclient.api.Purchase;
import com.daaw.j01;
import com.daaw.kz0;
import com.daaw.tb;
import com.daaw.wb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class wb implements g01, d0, f01 {
    public static final nw1<String, String> h = new nw1<>();
    public qb a;
    public boolean b;
    public final e c;
    public final Activity d;
    public final List<Purchase> e = new ArrayList();
    public int f = 0;
    public int g = -1;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ kz0 p;
        public final /* synthetic */ Purchase q;

        public a(kz0 kz0Var, Purchase purchase) {
            this.p = kz0Var;
            this.q = purchase;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("Launching in-app purchase flow. ");
            sb.append(this.p);
            tb.a b = tb.a().b(Arrays.asList(tb.b.a().c(this.p).b(this.p.d().get(0).a()).a()));
            if (this.q != null) {
                b.c(tb.c.a().b(this.q.d()).d(3).a());
            }
            wb.this.a.d(wb.this.d, b.a());
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ List p;
        public final /* synthetic */ lz0 q;

        public b(List list, lz0 lz0Var) {
            this.p = list;
            this.q = lz0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wb.this.a == null) {
                return;
            }
            wb.this.a.f(j01.a().b(this.p).a(), this.q);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wb.this.e.clear();
            wb.this.f = 0;
            wb.this.a.g(k01.a().b("subs").a(), wb.this);
            wb.this.a.g(k01.a().b("inapp").a(), wb.this);
        }
    }

    /* loaded from: classes.dex */
    public class d implements sb {
        public final /* synthetic */ Runnable a;
        public final /* synthetic */ Runnable b;

        public d(Runnable runnable, Runnable runnable2) {
            this.a = runnable;
            this.b = runnable2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
            if (r0 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (r0 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
            r0.run();
         */
        @Override // com.daaw.sb
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(com.daaw.xb r3) {
            /*
                r2 = this;
                int r3 = r3.b()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Setup finished. Response code: "
                r0.append(r1)
                r0.append(r3)
                com.daaw.wb r0 = com.daaw.wb.this
                if (r3 != 0) goto L1e
                r1 = 1
                com.daaw.wb.i(r0, r1)
                java.lang.Runnable r0 = r2.a
                if (r0 == 0) goto L29
                goto L26
            L1e:
                r1 = 0
                com.daaw.wb.i(r0, r1)
                java.lang.Runnable r0 = r2.b
                if (r0 == 0) goto L29
            L26:
                r0.run()
            L29:
                com.daaw.wb r0 = com.daaw.wb.this
                com.daaw.wb.j(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.wb.d.a(com.daaw.xb):void");
        }

        @Override // com.daaw.sb
        public void b() {
            wb.this.b = false;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();

        void b();

        void c(List<Purchase> list, boolean z);
    }

    public wb(Activity activity, final e eVar) {
        this.d = activity;
        this.c = eVar;
        this.a = qb.e(activity).b().c(this).a();
        Runnable runnable = new Runnable() { // from class: com.daaw.vb
            @Override // java.lang.Runnable
            public final void run() {
                wb.this.q();
            }
        };
        Objects.requireNonNull(eVar);
        t(runnable, new Runnable() { // from class: com.daaw.ub
            @Override // java.lang.Runnable
            public final void run() {
                wb.e.this.a();
            }
        });
    }

    public static kz0.b m(kz0 kz0Var) {
        if (kz0Var.d() != null) {
            return kz0Var.d().get(0).b().a().get(0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.c.b();
        r();
    }

    @Override // com.daaw.d0
    public void a(xb xbVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Purchase acknowledged ");
        sb.append(xbVar.a());
    }

    @Override // com.daaw.g01
    public void b(xb xbVar, List<Purchase> list) {
        int b2 = xbVar.b();
        if (b2 == 0) {
            if (list != null) {
                for (Purchase purchase : list) {
                    o(purchase);
                }
            }
            this.c.c(this.e, this.f >= 2);
        } else if (b2 != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPurchasesUpdated() got unknown resultCode: ");
            sb.append(b2);
        }
    }

    @Override // com.daaw.f01
    public void c(xb xbVar, List<Purchase> list) {
        this.f++;
        if (this.a != null && xbVar.b() == 0) {
            b(xb.c().c(xbVar.b()).a(), list);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Billing client was null or result code (");
        sb.append(xbVar.b());
        sb.append(") was bad - quitting");
    }

    public void k() {
        qb qbVar = this.a;
        if (qbVar == null || !qbVar.c()) {
            return;
        }
        this.a.b();
        this.a = null;
    }

    public final void l(Runnable runnable) {
        if (this.b) {
            runnable.run();
        } else {
            t(runnable, null);
        }
    }

    public int n() {
        return this.g;
    }

    public final void o(Purchase purchase) {
        if (!u(purchase.a(), purchase.e())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Got a purchase: ");
            sb.append(purchase);
            sb.append("; but signature is bad. Skipping...");
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Got a verified purchase: ");
        sb2.append(purchase);
        if (purchase.c() == 1) {
            if (!purchase.f()) {
                this.a.a(c0.b().b(purchase.d()).a(), this);
            }
            this.e.add(purchase);
        }
    }

    public void p(kz0 kz0Var, Purchase purchase) {
        l(new a(kz0Var, purchase));
    }

    public void r() {
        l(new c());
    }

    public void s(List<j01.b> list, lz0 lz0Var) {
        l(new b(list, lz0Var));
    }

    public void t(Runnable runnable, Runnable runnable2) {
        this.a.h(new d(runnable, runnable2));
    }

    public final boolean u(String str, String str2) {
        try {
            return ca1.d(h.a("M", ""), str, str2);
        } catch (IOException unused) {
            return false;
        }
    }
}
