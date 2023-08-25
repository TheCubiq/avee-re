package com.daaw;

import android.app.Activity;
import com.android.billingclient.api.Purchase;
import com.daaw.C3030tb;
import com.daaw.C3412wb;
import com.daaw.j01;
import com.daaw.kz0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* renamed from: com.daaw.wb */
/* loaded from: classes.dex */
public class C3412wb implements g01, InterfaceC1032d0, f01 {

    /* renamed from: h */
    public static final nw1<String, String> f31115h = new nw1<>();

    /* renamed from: a */
    public AbstractC2701qb f31116a;

    /* renamed from: b */
    public boolean f31117b;

    /* renamed from: c */
    public final InterfaceC3417e f31118c;

    /* renamed from: d */
    public final Activity f31119d;

    /* renamed from: e */
    public final List<Purchase> f31120e = new ArrayList();

    /* renamed from: f */
    public int f31121f = 0;

    /* renamed from: g */
    public int f31122g = -1;

    /* renamed from: com.daaw.wb$a */
    /* loaded from: classes.dex */
    public class RunnableC3413a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ kz0 f31123p;

        /* renamed from: q */
        public final /* synthetic */ Purchase f31124q;

        public RunnableC3413a(kz0 kz0Var, Purchase purchase) {
            this.f31123p = kz0Var;
            this.f31124q = purchase;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("Launching in-app purchase flow. ");
            sb.append(this.f31123p);
            C3030tb.C3031a m9398b = C3030tb.m9415a().m9398b(Arrays.asList(C3030tb.C3032b.m9396a().m9391c(this.f31123p).m9392b(this.f31123p.m17309d().get(0).m17301a()).m9393a()));
            if (this.f31124q != null) {
                m9398b.m9397c(C3030tb.C3034c.m9388a().m9381b(this.f31124q.m27863d()).m9379d(3).m9382a());
            }
            C3412wb.this.f31116a.mo11526d(C3412wb.this.f31119d, m9398b.m9399a());
        }
    }

    /* renamed from: com.daaw.wb$b */
    /* loaded from: classes.dex */
    public class RunnableC3414b implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ List f31126p;

        /* renamed from: q */
        public final /* synthetic */ lz0 f31127q;

        public RunnableC3414b(List list, lz0 lz0Var) {
            this.f31126p = list;
            this.f31127q = lz0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3412wb.this.f31116a == null) {
                return;
            }
            C3412wb.this.f31116a.mo11525f(j01.m19213a().m19209b(this.f31126p).m19210a(), this.f31127q);
        }
    }

    /* renamed from: com.daaw.wb$c */
    /* loaded from: classes.dex */
    public class RunnableC3415c implements Runnable {
        public RunnableC3415c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3412wb.this.f31120e.clear();
            C3412wb.this.f31121f = 0;
            C3412wb.this.f31116a.mo11524g(k01.m18105a().m18102b("subs").m18103a(), C3412wb.this);
            C3412wb.this.f31116a.mo11524g(k01.m18105a().m18102b("inapp").m18103a(), C3412wb.this);
        }
    }

    /* renamed from: com.daaw.wb$d */
    /* loaded from: classes.dex */
    public class C3416d implements InterfaceC2929sb {

        /* renamed from: a */
        public final /* synthetic */ Runnable f31130a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f31131b;

        public C3416d(Runnable runnable, Runnable runnable2) {
            this.f31130a = runnable;
            this.f31131b = runnable2;
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
        @Override // com.daaw.InterfaceC2929sb
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo6232a(C3518xb c3518xb) {
            Runnable runnable;
            int m5324b = c3518xb.m5324b();
            StringBuilder sb = new StringBuilder();
            sb.append("Setup finished. Response code: ");
            sb.append(m5324b);
            C3412wb c3412wb = C3412wb.this;
            if (m5324b == 0) {
                c3412wb.f31117b = true;
                runnable = this.f31130a;
            } else {
                c3412wb.f31117b = false;
                runnable = this.f31131b;
            }
            C3412wb.this.f31122g = m5324b;
        }

        @Override // com.daaw.InterfaceC2929sb
        /* renamed from: b */
        public void mo6231b() {
            C3412wb.this.f31117b = false;
        }
    }

    /* renamed from: com.daaw.wb$e */
    /* loaded from: classes.dex */
    public interface InterfaceC3417e {
        /* renamed from: a */
        void mo6230a();

        /* renamed from: b */
        void mo6229b();

        /* renamed from: c */
        void mo6228c(List<Purchase> list, boolean z);
    }

    public C3412wb(Activity activity, final InterfaceC3417e interfaceC3417e) {
        this.f31119d = activity;
        this.f31118c = interfaceC3417e;
        this.f31116a = AbstractC2701qb.m12648e(activity).m12646b().m12645c(this).m12647a();
        Runnable runnable = new Runnable() { // from class: com.daaw.vb
            @Override // java.lang.Runnable
            public final void run() {
                C3412wb.this.m6237q();
            }
        };
        Objects.requireNonNull(interfaceC3417e);
        m6234t(runnable, new Runnable() { // from class: com.daaw.ub
            @Override // java.lang.Runnable
            public final void run() {
                C3412wb.InterfaceC3417e.this.mo6230a();
            }
        });
    }

    /* renamed from: m */
    public static kz0.C1999b m6241m(kz0 kz0Var) {
        if (kz0Var.m17309d() != null) {
            return kz0Var.m17309d().get(0).m17300b().m17302a().get(0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m6237q() {
        this.f31118c.mo6229b();
        m6236r();
    }

    @Override // com.daaw.InterfaceC1032d0
    /* renamed from: a */
    public void mo6253a(C3518xb c3518xb) {
        StringBuilder sb = new StringBuilder();
        sb.append("Purchase acknowledged ");
        sb.append(c3518xb.m5325a());
    }

    @Override // com.daaw.g01
    /* renamed from: b */
    public void mo6252b(C3518xb c3518xb, List<Purchase> list) {
        int m5324b = c3518xb.m5324b();
        if (m5324b == 0) {
            if (list != null) {
                for (Purchase purchase : list) {
                    m6239o(purchase);
                }
            }
            this.f31118c.mo6228c(this.f31120e, this.f31121f >= 2);
        } else if (m5324b != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPurchasesUpdated() got unknown resultCode: ");
            sb.append(m5324b);
        }
    }

    @Override // com.daaw.f01
    /* renamed from: c */
    public void mo6251c(C3518xb c3518xb, List<Purchase> list) {
        this.f31121f++;
        if (this.f31116a != null && c3518xb.m5324b() == 0) {
            mo6252b(C3518xb.m5323c().m5318c(c3518xb.m5324b()).m5320a(), list);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Billing client was null or result code (");
        sb.append(c3518xb.m5324b());
        sb.append(") was bad - quitting");
    }

    /* renamed from: k */
    public void m6243k() {
        AbstractC2701qb abstractC2701qb = this.f31116a;
        if (abstractC2701qb == null || !abstractC2701qb.mo11527c()) {
            return;
        }
        this.f31116a.mo11528b();
        this.f31116a = null;
    }

    /* renamed from: l */
    public final void m6242l(Runnable runnable) {
        if (this.f31117b) {
            runnable.run();
        } else {
            m6234t(runnable, null);
        }
    }

    /* renamed from: n */
    public int m6240n() {
        return this.f31122g;
    }

    /* renamed from: o */
    public final void m6239o(Purchase purchase) {
        if (!m6233u(purchase.m27866a(), purchase.m27862e())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Got a purchase: ");
            sb.append(purchase);
            sb.append("; but signature is bad. Skipping...");
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Got a verified purchase: ");
        sb2.append(purchase);
        if (purchase.m27864c() == 1) {
            if (!purchase.m27861f()) {
                this.f31116a.mo11529a(C0902c0.m25708b().m25705b(purchase.m27863d()).m25706a(), this);
            }
            this.f31120e.add(purchase);
        }
    }

    /* renamed from: p */
    public void m6238p(kz0 kz0Var, Purchase purchase) {
        m6242l(new RunnableC3413a(kz0Var, purchase));
    }

    /* renamed from: r */
    public void m6236r() {
        m6242l(new RunnableC3415c());
    }

    /* renamed from: s */
    public void m6235s(List<j01.C1777b> list, lz0 lz0Var) {
        m6242l(new RunnableC3414b(list, lz0Var));
    }

    /* renamed from: t */
    public void m6234t(Runnable runnable, Runnable runnable2) {
        this.f31116a.mo11523h(new C3416d(runnable, runnable2));
    }

    /* renamed from: u */
    public final boolean m6233u(String str, String str2) {
        try {
            return ca1.m25470d(f31115h.m14761a("M", ""), str, str2);
        } catch (IOException unused) {
            return false;
        }
    }
}
