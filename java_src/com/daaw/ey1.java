package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.C0507a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import com.daaw.ll0;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public class ey1 extends dy1 {

    /* renamed from: j */
    public static final String f8935j = ll0.m16883f("WorkManagerImpl");

    /* renamed from: k */
    public static ey1 f8936k = null;

    /* renamed from: l */
    public static ey1 f8937l = null;

    /* renamed from: m */
    public static final Object f8938m = new Object();

    /* renamed from: a */
    public Context f8939a;

    /* renamed from: b */
    public C0507a f8940b;

    /* renamed from: c */
    public WorkDatabase f8941c;

    /* renamed from: d */
    public wj1 f8942d;

    /* renamed from: e */
    public List<r81> f8943e;

    /* renamed from: f */
    public jz0 f8944f;

    /* renamed from: g */
    public zy0 f8945g;

    /* renamed from: h */
    public boolean f8946h;

    /* renamed from: i */
    public BroadcastReceiver.PendingResult f8947i;

    public ey1(Context context, C0507a c0507a, wj1 wj1Var) {
        this(context, c0507a, wj1Var, context.getResources().getBoolean(y01.workmanager_test_configuration));
    }

    public ey1(Context context, C0507a c0507a, wj1 wj1Var, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        ll0.m16884e(new ll0.C2056a(c0507a.m27978j()));
        List<r81> m23008g = m23008g(applicationContext, c0507a, wj1Var);
        m22998q(context, c0507a, wj1Var, workDatabase, m23008g, new jz0(context, c0507a, wj1Var, workDatabase, m23008g));
    }

    public ey1(Context context, C0507a c0507a, wj1 wj1Var, boolean z) {
        this(context, c0507a, wj1Var, WorkDatabase.m27956s(context.getApplicationContext(), wj1Var.mo6050c(), z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (com.daaw.ey1.f8937l != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        com.daaw.ey1.f8937l = new com.daaw.ey1(r4, r5, new com.daaw.fy1(r5.m27976l()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        com.daaw.ey1.f8936k = com.daaw.ey1.f8937l;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m23010e(Context context, C0507a c0507a) {
        synchronized (f8938m) {
            ey1 ey1Var = f8936k;
            if (ey1Var != null && f8937l != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
        }
    }

    @Deprecated
    /* renamed from: j */
    public static ey1 m23005j() {
        synchronized (f8938m) {
            ey1 ey1Var = f8936k;
            if (ey1Var != null) {
                return ey1Var;
            }
            return f8937l;
        }
    }

    /* renamed from: k */
    public static ey1 m23004k(Context context) {
        ey1 m23005j;
        synchronized (f8938m) {
            m23005j = m23005j();
            if (m23005j == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof C0507a.InterfaceC0510c)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                m23010e(applicationContext, ((C0507a.InterfaceC0510c) applicationContext).m27973a());
                m23005j = m23004k(applicationContext);
            }
        }
        return m23005j;
    }

    @Override // com.daaw.dy1
    /* renamed from: a */
    public qu0 mo23012a(String str) {
        AbstractRunnableC2847rd m11414d = AbstractRunnableC2847rd.m11414d(str, this);
        this.f8942d.mo6051b(m11414d);
        return m11414d.m11413e();
    }

    @Override // com.daaw.dy1
    /* renamed from: c */
    public qu0 mo23011c(List<? extends oy1> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new ux1(this, list).m7664a();
    }

    /* renamed from: f */
    public qu0 m23009f(UUID uuid) {
        AbstractRunnableC2847rd m11416b = AbstractRunnableC2847rd.m11416b(uuid, this);
        this.f8942d.mo6051b(m11416b);
        return m11416b.m11413e();
    }

    /* renamed from: g */
    public List<r81> m23008g(Context context, C0507a c0507a, wj1 wj1Var) {
        return Arrays.asList(v81.m7347a(context, this), new h80(context, c0507a, wj1Var, this));
    }

    /* renamed from: h */
    public Context m23007h() {
        return this.f8939a;
    }

    /* renamed from: i */
    public C0507a m23006i() {
        return this.f8940b;
    }

    /* renamed from: l */
    public zy0 m23003l() {
        return this.f8945g;
    }

    /* renamed from: m */
    public jz0 m23002m() {
        return this.f8944f;
    }

    /* renamed from: n */
    public List<r81> m23001n() {
        return this.f8943e;
    }

    /* renamed from: o */
    public WorkDatabase m23000o() {
        return this.f8941c;
    }

    /* renamed from: p */
    public wj1 m22999p() {
        return this.f8942d;
    }

    /* renamed from: q */
    public final void m22998q(Context context, C0507a c0507a, wj1 wj1Var, WorkDatabase workDatabase, List<r81> list, jz0 jz0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f8939a = applicationContext;
        this.f8940b = c0507a;
        this.f8942d = wj1Var;
        this.f8941c = workDatabase;
        this.f8943e = list;
        this.f8944f = jz0Var;
        this.f8945g = new zy0(workDatabase);
        this.f8946h = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f8942d.mo6051b(new ForceStopRunnable(applicationContext, this));
    }

    /* renamed from: r */
    public void m22997r() {
        synchronized (f8938m) {
            this.f8946h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f8947i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f8947i = null;
            }
        }
    }

    /* renamed from: s */
    public void m22996s() {
        if (Build.VERSION.SDK_INT >= 23) {
            cj1.m25362b(m23007h());
        }
        m23000o().mo27951B().mo9711u();
        v81.m7346b(m23006i(), m23000o(), m23001n());
    }

    /* renamed from: t */
    public void m22995t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f8938m) {
            this.f8947i = pendingResult;
            if (this.f8946h) {
                pendingResult.finish();
                this.f8947i = null;
            }
        }
    }

    /* renamed from: u */
    public void m22994u(String str) {
        m22993v(str, null);
    }

    /* renamed from: v */
    public void m22993v(String str, WorkerParameters.C0506a c0506a) {
        this.f8942d.mo6051b(new hf1(this, str, c0506a));
    }

    /* renamed from: w */
    public void m22992w(String str) {
        this.f8942d.mo6051b(new xf1(this, str, true));
    }

    /* renamed from: x */
    public void m22991x(String str) {
        this.f8942d.mo6051b(new xf1(this, str, false));
    }
}
