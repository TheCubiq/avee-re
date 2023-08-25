package com.daaw;

import android.os.Build;
import android.text.TextUtils;
import androidx.work.C0511b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.daaw.qu0;
import com.daaw.qy1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.daaw.mx */
/* loaded from: classes.dex */
public class RunnableC2217mx implements Runnable {

    /* renamed from: r */
    public static final String f19218r = ll0.m16883f("EnqueueRunnable");

    /* renamed from: p */
    public final ux1 f19219p;

    /* renamed from: q */
    public final ru0 f19220q = new ru0();

    public RunnableC2217mx(ux1 ux1Var) {
        this.f19219p = ux1Var;
    }

    /* renamed from: b */
    public static boolean m15737b(ux1 ux1Var) {
        boolean m15736c = m15736c(ux1Var.m7658g(), ux1Var.m7659f(), (String[]) ux1.m7653l(ux1Var).toArray(new String[0]), ux1Var.m7661d(), ux1Var.m7663b());
        ux1Var.m7654k();
        return m15736c;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01db A[LOOP:5: B:126:0x01d5->B:128:0x01db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0159  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m15736c(ey1 ey1Var, List<? extends oy1> list, String[] strArr, String str, EnumC2138lz enumC2138lz) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        int i;
        boolean z5;
        InterfaceC0885bt interfaceC0885bt;
        ey1 ey1Var2 = ey1Var;
        String[] strArr2 = strArr;
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase m23000o = ey1Var.m23000o();
        boolean z6 = strArr2 != null && strArr2.length > 0;
        if (z6) {
            z = true;
            z2 = false;
            z3 = false;
            for (String str2 : strArr2) {
                qy1 mo9719m = m23000o.mo27951B().mo9719m(str2);
                if (mo9719m == null) {
                    ll0.m16885c().mo16881b(f19218r, String.format("Prerequisite %s doesn't exist; not enqueuing", str2), new Throwable[0]);
                    return false;
                }
                yx1 yx1Var = mo9719m.f24625b;
                z &= yx1Var == yx1.SUCCEEDED;
                if (yx1Var == yx1.FAILED) {
                    z3 = true;
                } else if (yx1Var == yx1.CANCELLED) {
                    z2 = true;
                }
            }
        } else {
            z = true;
            z2 = false;
            z3 = false;
        }
        boolean z7 = !TextUtils.isEmpty(str);
        if (z7 && !z6) {
            List<qy1.C2801b> mo9729c = m23000o.mo27951B().mo9729c(str);
            if (!mo9729c.isEmpty()) {
                if (enumC2138lz != EnumC2138lz.APPEND && enumC2138lz != EnumC2138lz.APPEND_OR_REPLACE) {
                    if (enumC2138lz == EnumC2138lz.KEEP) {
                        for (qy1.C2801b c2801b : mo9729c) {
                            yx1 yx1Var2 = c2801b.f24643b;
                            if (yx1Var2 == yx1.ENQUEUED || yx1Var2 == yx1.RUNNING) {
                                return false;
                            }
                            while (r3.hasNext()) {
                            }
                        }
                    }
                    AbstractRunnableC2847rd.m11415c(str, ey1Var2, false).run();
                    ry1 mo27951B = m23000o.mo27951B();
                    for (qy1.C2801b c2801b2 : mo9729c) {
                        mo27951B.mo9731a(c2801b2.f24642a);
                    }
                    z4 = true;
                    for (oy1 oy1Var : list) {
                        qy1 m13868c = oy1Var.m13868c();
                        if (z6 && !z) {
                            m13868c.f24625b = z3 ? yx1.FAILED : z2 ? yx1.CANCELLED : yx1.BLOCKED;
                        } else if (m13868c.m11935d()) {
                            j = currentTimeMillis;
                            m13868c.f24637n = 0L;
                            i = Build.VERSION.SDK_INT;
                            if ((i >= 23 && i <= 25) || (i <= 22 && m15731h(ey1Var2, "androidx.work.impl.background.gcm.GcmScheduler"))) {
                                m15732g(m13868c);
                            }
                            if (m13868c.f24625b == yx1.ENQUEUED) {
                                z4 = true;
                            }
                            m23000o.mo27951B().mo9715q(m13868c);
                            if (z6) {
                                for (String str3 : strArr2) {
                                    m23000o.mo27938t().mo24981d(new C3566xs(oy1Var.m13870a(), str3));
                                }
                            }
                            for (String str4 : oy1Var.m13869b()) {
                                m23000o.mo27950C().mo6669b(new ty1(str4, oy1Var.m13870a()));
                            }
                            if (z7) {
                                m23000o.mo27935z().mo19262a(new gy1(str, oy1Var.m13870a()));
                            }
                            ey1Var2 = ey1Var;
                            currentTimeMillis = j;
                        } else {
                            m13868c.f24637n = currentTimeMillis;
                        }
                        j = currentTimeMillis;
                        i = Build.VERSION.SDK_INT;
                        if (i >= 23) {
                            m15732g(m13868c);
                            if (m13868c.f24625b == yx1.ENQUEUED) {
                            }
                            m23000o.mo27951B().mo9715q(m13868c);
                            if (z6) {
                            }
                            while (r0.hasNext()) {
                            }
                            if (z7) {
                            }
                            ey1Var2 = ey1Var;
                            currentTimeMillis = j;
                        }
                        m15732g(m13868c);
                        if (m13868c.f24625b == yx1.ENQUEUED) {
                        }
                        m23000o.mo27951B().mo9715q(m13868c);
                        if (z6) {
                        }
                        while (r0.hasNext()) {
                        }
                        if (z7) {
                        }
                        ey1Var2 = ey1Var;
                        currentTimeMillis = j;
                    }
                    return z4;
                }
                InterfaceC0885bt mo27938t = m23000o.mo27938t();
                List arrayList = new ArrayList();
                for (qy1.C2801b c2801b3 : mo9729c) {
                    if (mo27938t.mo24982c(c2801b3.f24642a)) {
                        interfaceC0885bt = mo27938t;
                    } else {
                        yx1 yx1Var3 = c2801b3.f24643b;
                        interfaceC0885bt = mo27938t;
                        boolean z8 = (yx1Var3 == yx1.SUCCEEDED) & z;
                        if (yx1Var3 == yx1.FAILED) {
                            z3 = true;
                        } else if (yx1Var3 == yx1.CANCELLED) {
                            z2 = true;
                        }
                        arrayList.add(c2801b3.f24642a);
                        z = z8;
                    }
                    mo27938t = interfaceC0885bt;
                }
                if (enumC2138lz == EnumC2138lz.APPEND_OR_REPLACE && (z2 || z3)) {
                    ry1 mo27951B2 = m23000o.mo27951B();
                    for (qy1.C2801b c2801b4 : mo27951B2.mo9729c(str)) {
                        mo27951B2.mo9731a(c2801b4.f24642a);
                    }
                    arrayList = Collections.emptyList();
                    z5 = false;
                    z2 = false;
                } else {
                    z5 = z3;
                }
                strArr2 = (String[]) arrayList.toArray(strArr2);
                z6 = strArr2.length > 0;
                z3 = z5;
            }
        }
        z4 = false;
        while (r7.hasNext()) {
        }
        return z4;
    }

    /* renamed from: e */
    public static boolean m15734e(ux1 ux1Var) {
        List<ux1> m7660e = ux1Var.m7660e();
        boolean z = false;
        if (m7660e != null) {
            boolean z2 = false;
            for (ux1 ux1Var2 : m7660e) {
                if (ux1Var2.m7655j()) {
                    ll0.m16885c().mo16878h(f19218r, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", ux1Var2.m7662c())), new Throwable[0]);
                } else {
                    z2 |= m15734e(ux1Var2);
                }
            }
            z = z2;
        }
        return m15737b(ux1Var) | z;
    }

    /* renamed from: g */
    public static void m15732g(qy1 qy1Var) {
        C2943sj c2943sj = qy1Var.f24633j;
        String str = qy1Var.f24626c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (c2943sj.m10318f() || c2943sj.m10315i()) {
            C0511b.C0512a c0512a = new C0511b.C0512a();
            c0512a.m27959c(qy1Var.f24628e).m27957e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            qy1Var.f24626c = ConstraintTrackingWorker.class.getName();
            qy1Var.f24628e = c0512a.m27961a();
        }
    }

    /* renamed from: h */
    public static boolean m15731h(ey1 ey1Var, String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (r81 r81Var : ey1Var.m23001n()) {
                if (cls.isAssignableFrom(r81Var.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public boolean m15738a() {
        WorkDatabase m23000o = this.f19219p.m7658g().m23000o();
        m23000o.m26481c();
        try {
            boolean m15734e = m15734e(this.f19219p);
            m23000o.m26466r();
            return m15734e;
        } finally {
            m23000o.m26477g();
        }
    }

    /* renamed from: d */
    public qu0 m15735d() {
        return this.f19220q;
    }

    /* renamed from: f */
    public void m15733f() {
        ey1 m7658g = this.f19219p.m7658g();
        v81.m7346b(m7658g.m23006i(), m7658g.m23000o(), m7658g.m23001n());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f19219p.m7657h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f19219p));
            }
            if (m15738a()) {
                hv0.m20390a(this.f19219p.m7658g().m23007h(), RescheduleReceiver.class, true);
                m15733f();
            }
            this.f19220q.m10938a(qu0.f24327a);
        } catch (Throwable th) {
            this.f19220q.m10938a(new qu0.AbstractC2755b.C2756a(th));
        }
    }
}
