package com.daaw;

import android.text.TextUtils;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.daaw.qu0;
import java.util.List;
/* loaded from: classes.dex */
public class mx implements Runnable {
    public static final String r = ll0.f("EnqueueRunnable");
    public final ux1 p;
    public final ru0 q = new ru0();

    public mx(ux1 ux1Var) {
        this.p = ux1Var;
    }

    public static boolean b(ux1 ux1Var) {
        boolean c = c(ux1Var.g(), ux1Var.f(), (String[]) ux1.l(ux1Var).toArray(new String[0]), ux1Var.d(), ux1Var.b());
        ux1Var.k();
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01db A[LOOP:5: B:126:0x01d5->B:128:0x01db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(com.daaw.ey1 r19, java.util.List<? extends com.daaw.oy1> r20, java.lang.String[] r21, java.lang.String r22, com.daaw.lz r23) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.mx.c(com.daaw.ey1, java.util.List, java.lang.String[], java.lang.String, com.daaw.lz):boolean");
    }

    public static boolean e(ux1 ux1Var) {
        List<ux1> e = ux1Var.e();
        boolean z = false;
        if (e != null) {
            boolean z2 = false;
            for (ux1 ux1Var2 : e) {
                if (ux1Var2.j()) {
                    ll0.c().h(r, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", ux1Var2.c())), new Throwable[0]);
                } else {
                    z2 |= e(ux1Var2);
                }
            }
            z = z2;
        }
        return b(ux1Var) | z;
    }

    public static void g(qy1 qy1Var) {
        sj sjVar = qy1Var.j;
        String str = qy1Var.c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (sjVar.f() || sjVar.i()) {
            b.a aVar = new b.a();
            aVar.c(qy1Var.e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            qy1Var.c = ConstraintTrackingWorker.class.getName();
            qy1Var.e = aVar.a();
        }
    }

    public static boolean h(ey1 ey1Var, String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (r81 r81Var : ey1Var.n()) {
                if (cls.isAssignableFrom(r81Var.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean a() {
        WorkDatabase o = this.p.g().o();
        o.c();
        try {
            boolean e = e(this.p);
            o.r();
            return e;
        } finally {
            o.g();
        }
    }

    public qu0 d() {
        return this.q;
    }

    public void f() {
        ey1 g = this.p.g();
        v81.b(g.i(), g.o(), g.n());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.p.h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.p));
            }
            if (a()) {
                hv0.a(this.p.g().h(), RescheduleReceiver.class, true);
                f();
            }
            this.q.a(qu0.a);
        } catch (Throwable th) {
            this.q.a(new qu0.b.a(th));
        }
    }
}
