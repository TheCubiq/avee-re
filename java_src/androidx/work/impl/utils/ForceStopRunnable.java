package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C0507a;
import androidx.work.impl.WorkDatabase;
import com.daaw.C3523xc;
import com.daaw.cj1;
import com.daaw.ey1;
import com.daaw.iz0;
import com.daaw.ky1;
import com.daaw.ll0;
import com.daaw.qy1;
import com.daaw.ry1;
import com.daaw.v81;
import com.daaw.vf0;
import com.daaw.vx1;
import com.daaw.yx1;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: s */
    public static final String f2566s = ll0.m16883f("ForceStopRunnable");

    /* renamed from: t */
    public static final long f2567t = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: p */
    public final Context f2568p;

    /* renamed from: q */
    public final ey1 f2569q;

    /* renamed from: r */
    public int f2570r = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public static final String f2571a = ll0.m16883f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            ll0.m16885c().mo16879g(f2571a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.m27878g(context);
        }
    }

    public ForceStopRunnable(Context context, ey1 ey1Var) {
        this.f2568p = context.getApplicationContext();
        this.f2569q = ey1Var;
    }

    /* renamed from: c */
    public static Intent m27882c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* renamed from: d */
    public static PendingIntent m27881d(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, m27882c(context), i);
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: g */
    public static void m27878g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent m27881d = m27881d(context, C3523xc.m5291b() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f2567t;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, m27881d);
        }
    }

    /* renamed from: a */
    public boolean m27884a() {
        boolean m25357i = Build.VERSION.SDK_INT >= 23 ? cj1.m25357i(this.f2568p, this.f2569q) : false;
        WorkDatabase m23000o = this.f2569q.m23000o();
        ry1 mo27951B = m23000o.mo27951B();
        ky1 mo27952A = m23000o.mo27952A();
        m23000o.m26481c();
        try {
            List<qy1> mo9724h = mo27951B.mo9724h();
            boolean z = (mo9724h == null || mo9724h.isEmpty()) ? false : true;
            if (z) {
                for (qy1 qy1Var : mo9724h) {
                    mo27951B.mo9721k(yx1.ENQUEUED, qy1Var.f24624a);
                    mo27951B.mo9730b(qy1Var.f24624a, -1L);
                }
            }
            mo27952A.mo16376c();
            m23000o.m26466r();
            return z || m25357i;
        } finally {
            m23000o.m26477g();
        }
    }

    /* renamed from: b */
    public void m27883b() {
        boolean m27884a = m27884a();
        if (m27877h()) {
            ll0.m16885c().mo16882a(f2566s, "Rescheduling Workers.", new Throwable[0]);
            this.f2569q.m22996s();
            this.f2569q.m23003l().m1791c(false);
        } else if (m27880e()) {
            ll0.m16885c().mo16882a(f2566s, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f2569q.m22996s();
        } else if (m27884a) {
            ll0.m16885c().mo16882a(f2566s, "Found unfinished work, scheduling it.", new Throwable[0]);
            v81.m7346b(this.f2569q.m23006i(), this.f2569q.m23000o(), this.f2569q.m23001n());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: e */
    public boolean m27880e() {
        try {
            PendingIntent m27881d = m27881d(this.f2568p, C3523xc.m5291b() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (m27881d != null) {
                    m27881d.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f2568p.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i = 0; i < historicalProcessExitReasons.size(); i++) {
                        if (historicalProcessExitReasons.get(i).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (m27881d == null) {
                m27878g(this.f2568p);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e) {
            ll0.m16885c().mo16878h(f2566s, "Ignoring exception", e);
            return true;
        }
    }

    /* renamed from: f */
    public boolean m27879f() {
        C0507a m23006i = this.f2569q.m23006i();
        if (TextUtils.isEmpty(m23006i.m27985c())) {
            ll0.m16885c().mo16882a(f2566s, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean m19252b = iz0.m19252b(this.f2568p, m23006i);
        ll0.m16885c().mo16882a(f2566s, String.format("Is default app process = %s", Boolean.valueOf(m19252b)), new Throwable[0]);
        return m19252b;
    }

    /* renamed from: h */
    public boolean m27877h() {
        return this.f2569q.m23003l().m1793a();
    }

    /* renamed from: i */
    public void m27876i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        try {
            if (m27879f()) {
                while (true) {
                    vx1.m6676e(this.f2568p);
                    ll0.m16885c().mo16882a(f2566s, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        m27883b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                        i = this.f2570r + 1;
                        this.f2570r = i;
                        if (i >= 3) {
                            ll0 m16885c = ll0.m16885c();
                            String str = f2566s;
                            m16885c.mo16881b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            vf0 m27984d = this.f2569q.m23006i().m27984d();
                            if (m27984d == null) {
                                throw illegalStateException;
                            }
                            ll0.m16885c().mo16882a(str, "Routing exception to the specified exception handler", illegalStateException);
                            m27984d.m7197a(illegalStateException);
                        } else {
                            ll0.m16885c().mo16882a(f2566s, String.format("Retrying after %s", Long.valueOf(i * 300)), e);
                            m27876i(this.f2570r * 300);
                        }
                    }
                    ll0.m16885c().mo16882a(f2566s, String.format("Retrying after %s", Long.valueOf(i * 300)), e);
                    m27876i(this.f2570r * 300);
                }
            }
        } finally {
            this.f2569q.m22997r();
        }
    }
}
