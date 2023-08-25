package com.daaw;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.daaw.AbstractC1066da;
import com.daaw.dl0;
import com.daaw.ri1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class eq1 {

    /* renamed from: a */
    public final Context f8677a;

    /* renamed from: b */
    public final InterfaceC0828ba f8678b;

    /* renamed from: c */
    public final InterfaceC2134ly f8679c;

    /* renamed from: d */
    public final py1 f8680d;

    /* renamed from: e */
    public final Executor f8681e;

    /* renamed from: f */
    public final ri1 f8682f;

    /* renamed from: g */
    public final InterfaceC0951cg f8683g;

    /* renamed from: h */
    public final InterfaceC0951cg f8684h;

    /* renamed from: i */
    public final InterfaceC3072tf f8685i;

    public eq1(Context context, InterfaceC0828ba interfaceC0828ba, InterfaceC2134ly interfaceC2134ly, py1 py1Var, Executor executor, ri1 ri1Var, InterfaceC0951cg interfaceC0951cg, InterfaceC0951cg interfaceC0951cg2, InterfaceC3072tf interfaceC3072tf) {
        this.f8677a = context;
        this.f8678b = interfaceC0828ba;
        this.f8679c = interfaceC2134ly;
        this.f8680d = py1Var;
        this.f8681e = executor;
        this.f8682f = ri1Var;
        this.f8683g = interfaceC0951cg;
        this.f8684h = interfaceC0951cg2;
        this.f8685i = interfaceC3072tf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m23291l(sn1 sn1Var) {
        return Boolean.valueOf(this.f8679c.mo11625l(sn1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m23290m(sn1 sn1Var) {
        return this.f8679c.mo11607y(sn1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m23289n(Iterable iterable, sn1 sn1Var, long j) {
        this.f8679c.mo11665O(iterable);
        this.f8679c.mo11619p(sn1Var, this.f8683g.mo21345a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m23288o(Iterable iterable) {
        this.f8679c.mo11634e(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m23287p() {
        this.f8685i.mo9215d();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m23286q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f8685i.mo9213u(((Integer) entry.getValue()).intValue(), dl0.EnumC1102b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m23285r(sn1 sn1Var, long j) {
        this.f8679c.mo11619p(sn1Var, this.f8683g.mo21345a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m23284s(sn1 sn1Var, int i) {
        this.f8680d.mo7556a(sn1Var, i + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m23283t(final sn1 sn1Var, final int i, Runnable runnable) {
        try {
            try {
                ri1 ri1Var = this.f8682f;
                final InterfaceC2134ly interfaceC2134ly = this.f8679c;
                Objects.requireNonNull(interfaceC2134ly);
                ri1Var.mo11287q(new ri1.InterfaceC2864a() { // from class: com.daaw.vp1
                    @Override // com.daaw.ri1.InterfaceC2864a
                    /* renamed from: a */
                    public final Object mo1807a() {
                        return Integer.valueOf(InterfaceC2134ly.this.mo11639c());
                    }
                });
                if (m23292k()) {
                    m23282u(sn1Var, i);
                } else {
                    this.f8682f.mo11287q(new ri1.InterfaceC2864a() { // from class: com.daaw.zp1
                        @Override // com.daaw.ri1.InterfaceC2864a
                        /* renamed from: a */
                        public final Object mo1807a() {
                            Object m23284s;
                            m23284s = eq1.this.m23284s(sn1Var, i);
                            return m23284s;
                        }
                    });
                }
            } catch (qi1 unused) {
                this.f8680d.mo7556a(sn1Var, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    /* renamed from: j */
    public AbstractC0896by m23293j(rn1 rn1Var) {
        ri1 ri1Var = this.f8682f;
        final InterfaceC3072tf interfaceC3072tf = this.f8685i;
        Objects.requireNonNull(interfaceC3072tf);
        return rn1Var.mo11155b(AbstractC0896by.m25748a().mo25495i(this.f8683g.mo21345a()).mo25493k(this.f8684h.mo21345a()).mo25494j("GDT_CLIENT_METRICS").mo25496h(new C3475ww(C0892bx.m25779b("proto"), ((C3435wf) ri1Var.mo11287q(new ri1.InterfaceC2864a() { // from class: com.daaw.tp1
            @Override // com.daaw.ri1.InterfaceC2864a
            /* renamed from: a */
            public final Object mo1807a() {
                return InterfaceC3072tf.this.mo9214n();
            }
        })).m6104f())).mo25500d());
    }

    /* renamed from: k */
    public boolean m23292k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f8677a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: u */
    public AbstractC1066da m23282u(final sn1 sn1Var, int i) {
        AbstractC1066da mo11156a;
        rn1 mo13246a = this.f8678b.mo13246a(sn1Var.mo6336b());
        long j = 0;
        AbstractC1066da m24583e = AbstractC1066da.m24583e(0L);
        while (true) {
            final long j2 = j;
            while (((Boolean) this.f8682f.mo11287q(new ri1.InterfaceC2864a() { // from class: com.daaw.xp1
                @Override // com.daaw.ri1.InterfaceC2864a
                /* renamed from: a */
                public final Object mo1807a() {
                    Boolean m23291l;
                    m23291l = eq1.this.m23291l(sn1Var);
                    return m23291l;
                }
            })).booleanValue()) {
                final Iterable<iw0> iterable = (Iterable) this.f8682f.mo11287q(new ri1.InterfaceC2864a() { // from class: com.daaw.yp1
                    @Override // com.daaw.ri1.InterfaceC2864a
                    /* renamed from: a */
                    public final Object mo1807a() {
                        Iterable m23290m;
                        m23290m = eq1.this.m23290m(sn1Var);
                        return m23290m;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return m24583e;
                }
                if (mo13246a == null) {
                    nl0.m15088b("Uploader", "Unknown backend for %s, deleting event batch for it...", sn1Var);
                    mo11156a = AbstractC1066da.m24587a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (iw0 iw0Var : iterable) {
                        arrayList.add(iw0Var.mo17097b());
                    }
                    if (sn1Var.m10150e()) {
                        arrayList.add(m23293j(mo13246a));
                    }
                    mo11156a = mo13246a.mo11156a(AbstractC0943ca.m25479a().mo25475b(arrayList).mo25474c(sn1Var.mo6335c()).mo25476a());
                }
                m24583e = mo11156a;
                if (m24583e.mo24585c() == AbstractC1066da.EnumC1067a.TRANSIENT_ERROR) {
                    this.f8682f.mo11287q(new ri1.InterfaceC2864a() { // from class: com.daaw.cq1
                        @Override // com.daaw.ri1.InterfaceC2864a
                        /* renamed from: a */
                        public final Object mo1807a() {
                            Object m23289n;
                            m23289n = eq1.this.m23289n(iterable, sn1Var, j2);
                            return m23289n;
                        }
                    });
                    this.f8680d.mo7555b(sn1Var, i + 1, true);
                    return m24583e;
                }
                this.f8682f.mo11287q(new ri1.InterfaceC2864a() { // from class: com.daaw.bq1
                    @Override // com.daaw.ri1.InterfaceC2864a
                    /* renamed from: a */
                    public final Object mo1807a() {
                        Object m23288o;
                        m23288o = eq1.this.m23288o(iterable);
                        return m23288o;
                    }
                });
                if (m24583e.mo24585c() == AbstractC1066da.EnumC1067a.OK) {
                    j = Math.max(j2, m24583e.mo24586b());
                    if (sn1Var.m10150e()) {
                        this.f8682f.mo11287q(new ri1.InterfaceC2864a() { // from class: com.daaw.wp1
                            @Override // com.daaw.ri1.InterfaceC2864a
                            /* renamed from: a */
                            public final Object mo1807a() {
                                Object m23287p;
                                m23287p = eq1.this.m23287p();
                                return m23287p;
                            }
                        });
                    }
                } else if (m24583e.mo24585c() == AbstractC1066da.EnumC1067a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    for (iw0 iw0Var2 : iterable) {
                        String mo25502j = iw0Var2.mo17097b().mo25502j();
                        hashMap.put(mo25502j, !hashMap.containsKey(mo25502j) ? 1 : Integer.valueOf(((Integer) hashMap.get(mo25502j)).intValue() + 1));
                    }
                    this.f8682f.mo11287q(new ri1.InterfaceC2864a() { // from class: com.daaw.dq1
                        @Override // com.daaw.ri1.InterfaceC2864a
                        /* renamed from: a */
                        public final Object mo1807a() {
                            Object m23286q;
                            m23286q = eq1.this.m23286q(hashMap);
                            return m23286q;
                        }
                    });
                }
            }
            this.f8682f.mo11287q(new ri1.InterfaceC2864a() { // from class: com.daaw.aq1
                @Override // com.daaw.ri1.InterfaceC2864a
                /* renamed from: a */
                public final Object mo1807a() {
                    Object m23285r;
                    m23285r = eq1.this.m23285r(sn1Var, j2);
                    return m23285r;
                }
            });
            return m24583e;
        }
    }

    /* renamed from: v */
    public void m23281v(final sn1 sn1Var, final int i, final Runnable runnable) {
        this.f8681e.execute(new Runnable() { // from class: com.daaw.up1
            @Override // java.lang.Runnable
            public final void run() {
                eq1.this.m23283t(sn1Var, i, runnable);
            }
        });
    }
}
