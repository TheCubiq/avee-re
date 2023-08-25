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
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
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
import com.daaw.xc;
import com.daaw.yx1;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {
    public static final String s = ll0.f("ForceStopRunnable");
    public static final long t = TimeUnit.DAYS.toMillis(3650);
    public final Context p;
    public final ey1 q;
    public int r = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        public static final String a = ll0.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            ll0.c().g(a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, ey1 ey1Var) {
        this.p = context.getApplicationContext();
        this.q = ey1Var;
    }

    public static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public static PendingIntent d(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, c(context), i);
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d = d(context, xc.b() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + t;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d);
        }
    }

    public boolean a() {
        boolean i = Build.VERSION.SDK_INT >= 23 ? cj1.i(this.p, this.q) : false;
        WorkDatabase o = this.q.o();
        ry1 B = o.B();
        ky1 A = o.A();
        o.c();
        try {
            List<qy1> h = B.h();
            boolean z = (h == null || h.isEmpty()) ? false : true;
            if (z) {
                for (qy1 qy1Var : h) {
                    B.k(yx1.ENQUEUED, qy1Var.a);
                    B.b(qy1Var.a, -1L);
                }
            }
            A.c();
            o.r();
            return z || i;
        } finally {
            o.g();
        }
    }

    public void b() {
        boolean a = a();
        if (h()) {
            ll0.c().a(s, "Rescheduling Workers.", new Throwable[0]);
            this.q.s();
            this.q.l().c(false);
        } else if (e()) {
            ll0.c().a(s, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.q.s();
        } else if (a) {
            ll0.c().a(s, "Found unfinished work, scheduling it.", new Throwable[0]);
            v81.b(this.q.i(), this.q.o(), this.q.n());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    public boolean e() {
        try {
            PendingIntent d = d(this.p, xc.b() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d != null) {
                    d.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.p.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i = 0; i < historicalProcessExitReasons.size(); i++) {
                        if (historicalProcessExitReasons.get(i).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (d == null) {
                g(this.p);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e) {
            ll0.c().h(s, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a i = this.q.i();
        if (TextUtils.isEmpty(i.c())) {
            ll0.c().a(s, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b = iz0.b(this.p, i);
        ll0.c().a(s, String.format("Is default app process = %s", Boolean.valueOf(b)), new Throwable[0]);
        return b;
    }

    public boolean h() {
        return this.q.l().a();
    }

    public void i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        try {
            if (f()) {
                while (true) {
                    vx1.e(this.p);
                    ll0.c().a(s, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                        i = this.r + 1;
                        this.r = i;
                        if (i >= 3) {
                            ll0 c = ll0.c();
                            String str = s;
                            c.b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            vf0 d = this.q.i().d();
                            if (d == null) {
                                throw illegalStateException;
                            }
                            ll0.c().a(str, "Routing exception to the specified exception handler", illegalStateException);
                            d.a(illegalStateException);
                        } else {
                            ll0.c().a(s, String.format("Retrying after %s", Long.valueOf(i * 300)), e);
                            i(this.r * 300);
                        }
                    }
                    ll0.c().a(s, String.format("Retrying after %s", Long.valueOf(i * 300)), e);
                    i(this.r * 300);
                }
            }
        } finally {
            this.q.r();
        }
    }
}
