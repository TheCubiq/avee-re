package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import com.daaw.ll0;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public class ey1 extends dy1 {
    public static final String j = ll0.f("WorkManagerImpl");
    public static ey1 k = null;
    public static ey1 l = null;
    public static final Object m = new Object();
    public Context a;
    public androidx.work.a b;
    public WorkDatabase c;
    public wj1 d;
    public List<r81> e;
    public jz0 f;
    public zy0 g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;

    public ey1(Context context, androidx.work.a aVar, wj1 wj1Var) {
        this(context, aVar, wj1Var, context.getResources().getBoolean(y01.workmanager_test_configuration));
    }

    public ey1(Context context, androidx.work.a aVar, wj1 wj1Var, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        ll0.e(new ll0.a(aVar.j()));
        List<r81> g = g(applicationContext, aVar, wj1Var);
        q(context, aVar, wj1Var, workDatabase, g, new jz0(context, aVar, wj1Var, workDatabase, g));
    }

    public ey1(Context context, androidx.work.a aVar, wj1 wj1Var, boolean z) {
        this(context, aVar, wj1Var, WorkDatabase.s(context.getApplicationContext(), wj1Var.c(), z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (com.daaw.ey1.l != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        com.daaw.ey1.l = new com.daaw.ey1(r4, r5, new com.daaw.fy1(r5.l()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        com.daaw.ey1.k = com.daaw.ey1.l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(android.content.Context r4, androidx.work.a r5) {
        /*
            java.lang.Object r0 = com.daaw.ey1.m
            monitor-enter(r0)
            com.daaw.ey1 r1 = com.daaw.ey1.k     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L14
            com.daaw.ey1 r2 = com.daaw.ey1.l     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L14:
            if (r1 != 0) goto L32
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L34
            com.daaw.ey1 r1 = com.daaw.ey1.l     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L2e
            com.daaw.ey1 r1 = new com.daaw.ey1     // Catch: java.lang.Throwable -> L34
            com.daaw.fy1 r2 = new com.daaw.fy1     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Executor r3 = r5.l()     // Catch: java.lang.Throwable -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L34
            com.daaw.ey1.l = r1     // Catch: java.lang.Throwable -> L34
        L2e:
            com.daaw.ey1 r4 = com.daaw.ey1.l     // Catch: java.lang.Throwable -> L34
            com.daaw.ey1.k = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ey1.e(android.content.Context, androidx.work.a):void");
    }

    @Deprecated
    public static ey1 j() {
        synchronized (m) {
            ey1 ey1Var = k;
            if (ey1Var != null) {
                return ey1Var;
            }
            return l;
        }
    }

    public static ey1 k(Context context) {
        ey1 j2;
        synchronized (m) {
            j2 = j();
            if (j2 == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof a.c)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                e(applicationContext, ((a.c) applicationContext).a());
                j2 = k(applicationContext);
            }
        }
        return j2;
    }

    @Override // com.daaw.dy1
    public qu0 a(String str) {
        rd d = rd.d(str, this);
        this.d.b(d);
        return d.e();
    }

    @Override // com.daaw.dy1
    public qu0 c(List<? extends oy1> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new ux1(this, list).a();
    }

    public qu0 f(UUID uuid) {
        rd b = rd.b(uuid, this);
        this.d.b(b);
        return b.e();
    }

    public List<r81> g(Context context, androidx.work.a aVar, wj1 wj1Var) {
        return Arrays.asList(v81.a(context, this), new h80(context, aVar, wj1Var, this));
    }

    public Context h() {
        return this.a;
    }

    public androidx.work.a i() {
        return this.b;
    }

    public zy0 l() {
        return this.g;
    }

    public jz0 m() {
        return this.f;
    }

    public List<r81> n() {
        return this.e;
    }

    public WorkDatabase o() {
        return this.c;
    }

    public wj1 p() {
        return this.d;
    }

    public final void q(Context context, androidx.work.a aVar, wj1 wj1Var, WorkDatabase workDatabase, List<r81> list, jz0 jz0Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = aVar;
        this.d = wj1Var;
        this.c = workDatabase;
        this.e = list;
        this.f = jz0Var;
        this.g = new zy0(workDatabase);
        this.h = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.d.b(new ForceStopRunnable(applicationContext, this));
    }

    public void r() {
        synchronized (m) {
            this.h = true;
            BroadcastReceiver.PendingResult pendingResult = this.i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.i = null;
            }
        }
    }

    public void s() {
        if (Build.VERSION.SDK_INT >= 23) {
            cj1.b(h());
        }
        o().B().u();
        v81.b(i(), o(), n());
    }

    public void t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (m) {
            this.i = pendingResult;
            if (this.h) {
                pendingResult.finish();
                this.i = null;
            }
        }
    }

    public void u(String str) {
        v(str, null);
    }

    public void v(String str, WorkerParameters.a aVar) {
        this.d.b(new hf1(this, str, aVar));
    }

    public void w(String str) {
        this.d.b(new xf1(this, str, true));
    }

    public void x(String str) {
        this.d.b(new xf1(this, str, false));
    }
}
