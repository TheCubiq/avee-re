package com.daaw;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.daaw.an;
import com.daaw.of1;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class bm {
    public static final FilenameFilter s = new FilenameFilter() { // from class: com.daaw.am
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean I;
            I = bm.I(file, str);
            return I;
        }
    };
    public final Context a;
    public final ep b;
    public final em c;
    public final nq1 d;
    public final zl e;
    public final ue0 f;
    public final h10 g;
    public final a5 h;
    public final fl0 i;
    public final fm j;
    public final v2 k;
    public final pb1 l;
    public an m;
    public zb1 n = null;
    public final tj1<Boolean> o = new tj1<>();
    public final tj1<Boolean> p = new tj1<>();
    public final tj1<Void> q = new tj1<>();
    public final AtomicBoolean r = new AtomicBoolean(false);

    /* loaded from: classes2.dex */
    public class a implements an.a {
        public a() {
        }

        @Override // com.daaw.an.a
        public void a(zb1 zb1Var, Thread thread, Throwable th) {
            bm.this.F(zb1Var, thread, th);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Callable<rj1<Void>> {
        public final /* synthetic */ long a;
        public final /* synthetic */ Throwable b;
        public final /* synthetic */ Thread c;
        public final /* synthetic */ zb1 d;
        public final /* synthetic */ boolean e;

        /* loaded from: classes2.dex */
        public class a implements ai1<tb1, Void> {
            public final /* synthetic */ Executor a;
            public final /* synthetic */ String b;

            public a(Executor executor, String str) {
                this.a = executor;
                this.b = str;
            }

            @Override // com.daaw.ai1
            /* renamed from: b */
            public rj1<Void> a(tb1 tb1Var) {
                if (tb1Var == null) {
                    ml0.f().k("Received null app settings, cannot send reports at crash time.");
                    return dk1.e(null);
                }
                rj1[] rj1VarArr = new rj1[2];
                rj1VarArr[0] = bm.this.L();
                rj1VarArr[1] = bm.this.l.w(this.a, b.this.e ? this.b : null);
                return dk1.g(rj1VarArr);
            }
        }

        public b(long j, Throwable th, Thread thread, zb1 zb1Var, boolean z) {
            this.a = j;
            this.b = th;
            this.c = thread;
            this.d = zb1Var;
            this.e = z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public rj1<Void> call() {
            long E = bm.E(this.a);
            String B = bm.this.B();
            if (B == null) {
                ml0.f().d("Tried to write a fatal exception while no session was open.");
                return dk1.e(null);
            }
            bm.this.c.a();
            bm.this.l.r(this.b, this.c, B, E);
            bm.this.w(this.a);
            bm.this.t(this.d);
            bm.this.v(new fd(bm.this.f).toString());
            if (bm.this.b.d()) {
                Executor c = bm.this.e.c();
                return this.d.a().p(c, new a(c, B));
            }
            return dk1.e(null);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements ai1<Void, Boolean> {
        public c() {
        }

        @Override // com.daaw.ai1
        /* renamed from: b */
        public rj1<Boolean> a(Void r1) {
            return dk1.e(Boolean.TRUE);
        }
    }

    /* loaded from: classes2.dex */
    public class d implements ai1<Boolean, Void> {
        public final /* synthetic */ rj1 a;

        /* loaded from: classes2.dex */
        public class a implements Callable<rj1<Void>> {
            public final /* synthetic */ Boolean a;

            /* renamed from: com.daaw.bm$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public class C0044a implements ai1<tb1, Void> {
                public final /* synthetic */ Executor a;

                public C0044a(Executor executor) {
                    this.a = executor;
                }

                @Override // com.daaw.ai1
                /* renamed from: b */
                public rj1<Void> a(tb1 tb1Var) {
                    if (tb1Var == null) {
                        ml0.f().k("Received null app settings at app startup. Cannot send cached reports");
                    } else {
                        bm.this.L();
                        bm.this.l.v(this.a);
                        bm.this.q.e(null);
                    }
                    return dk1.e(null);
                }
            }

            public a(Boolean bool) {
                this.a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public rj1<Void> call() {
                if (this.a.booleanValue()) {
                    ml0.f().b("Sending cached crash reports...");
                    bm.this.b.c(this.a.booleanValue());
                    Executor c = bm.this.e.c();
                    return d.this.a.p(c, new C0044a(c));
                }
                ml0.f().i("Deleting cached crash reports...");
                bm.r(bm.this.J());
                bm.this.l.u();
                bm.this.q.e(null);
                return dk1.e(null);
            }
        }

        public d(rj1 rj1Var) {
            this.a = rj1Var;
        }

        @Override // com.daaw.ai1
        /* renamed from: b */
        public rj1<Void> a(Boolean bool) {
            return bm.this.e.i(new a(bool));
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Callable<Void> {
        public final /* synthetic */ long a;
        public final /* synthetic */ String b;

        public e(long j, String str) {
            this.a = j;
            this.b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            if (bm.this.H()) {
                return null;
            }
            bm.this.i.g(this.a, this.b);
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {
        public final /* synthetic */ long p;
        public final /* synthetic */ Throwable q;
        public final /* synthetic */ Thread r;

        public f(long j, Throwable th, Thread thread) {
            this.p = j;
            this.q = th;
            this.r = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (bm.this.H()) {
                return;
            }
            long E = bm.E(this.p);
            String B = bm.this.B();
            if (B == null) {
                ml0.f().k("Tried to write a non-fatal exception while no session was open.");
            } else {
                bm.this.l.s(this.q, this.r, B, E);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Callable<Void> {
        public final /* synthetic */ String a;

        public g(String str) {
            this.a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            bm.this.v(this.a);
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Callable<Void> {
        public final /* synthetic */ long a;

        public h(long j) {
            this.a = j;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.a);
            bm.this.k.a("_ae", bundle);
            return null;
        }
    }

    public bm(Context context, zl zlVar, ue0 ue0Var, ep epVar, h10 h10Var, em emVar, a5 a5Var, nq1 nq1Var, fl0 fl0Var, pb1 pb1Var, fm fmVar, v2 v2Var) {
        this.a = context;
        this.e = zlVar;
        this.f = ue0Var;
        this.b = epVar;
        this.g = h10Var;
        this.c = emVar;
        this.h = a5Var;
        this.d = nq1Var;
        this.i = fl0Var;
        this.j = fmVar;
        this.k = v2Var;
        this.l = pb1Var;
    }

    public static boolean A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static long C() {
        return E(System.currentTimeMillis());
    }

    public static List<wr0> D(yr0 yr0Var, String str, h10 h10Var, byte[] bArr) {
        File o = h10Var.o(str, "user-data");
        File o2 = h10Var.o(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cd("logs_file", "logs", bArr));
        arrayList.add(new s00("crash_meta_file", "metadata", yr0Var.f()));
        arrayList.add(new s00("session_meta_file", "session", yr0Var.e()));
        arrayList.add(new s00("app_meta_file", "app", yr0Var.a()));
        arrayList.add(new s00("device_meta_file", "device", yr0Var.c()));
        arrayList.add(new s00("os_meta_file", "os", yr0Var.b()));
        arrayList.add(new s00("minidump_file", "minidump", yr0Var.d()));
        arrayList.add(new s00("user_meta_file", "user", o));
        arrayList.add(new s00("keys_file", "keys", o2));
        return arrayList;
    }

    public static long E(long j) {
        return j / 1000;
    }

    public static /* synthetic */ boolean I(File file, String str) {
        return str.startsWith(".ae");
    }

    public static of1.a o(ue0 ue0Var, a5 a5Var) {
        return of1.a.b(ue0Var.f(), a5Var.e, a5Var.f, ue0Var.a(), ws.a(a5Var.c).b(), a5Var.g);
    }

    public static of1.b p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return of1.b.c(fh.l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), fh.s(), statFs.getBlockCount() * statFs.getBlockSize(), fh.x(), fh.m(), Build.MANUFACTURER, Build.PRODUCT);
    }

    public static of1.c q() {
        return of1.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, fh.y());
    }

    public static void r(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    public final String B() {
        SortedSet<String> n = this.l.n();
        if (n.isEmpty()) {
            return null;
        }
        return n.first();
    }

    public void F(zb1 zb1Var, Thread thread, Throwable th) {
        G(zb1Var, thread, th, false);
    }

    public synchronized void G(zb1 zb1Var, Thread thread, Throwable th, boolean z) {
        ml0 f2 = ml0.f();
        f2.b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            yq1.d(this.e.i(new b(System.currentTimeMillis(), th, thread, zb1Var, z)));
        } catch (TimeoutException unused) {
            ml0.f().d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e2) {
            ml0.f().e("Error handling uncaught exception", e2);
        }
    }

    public boolean H() {
        an anVar = this.m;
        return anVar != null && anVar.a();
    }

    public List<File> J() {
        return this.g.f(s);
    }

    public final rj1<Void> K(long j) {
        if (A()) {
            ml0.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return dk1.e(null);
        }
        ml0.f().b("Logging app exception event to Firebase Analytics");
        return dk1.c(new ScheduledThreadPoolExecutor(1), new h(j));
    }

    public final rj1<Void> L() {
        ArrayList arrayList = new ArrayList();
        for (File file : J()) {
            try {
                arrayList.add(K(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                ml0 f2 = ml0.f();
                f2.k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return dk1.f(arrayList);
    }

    public void M(String str) {
        this.e.h(new g(str));
    }

    @SuppressLint({"TaskMainThread"})
    public rj1<Void> N(rj1<tb1> rj1Var) {
        if (this.l.l()) {
            ml0.f().i("Crash reports are available to be sent.");
            return O().o(new d(rj1Var));
        }
        ml0.f().i("No crash reports are available to be sent.");
        this.o.e(Boolean.FALSE);
        return dk1.e(null);
    }

    public final rj1<Boolean> O() {
        if (this.b.d()) {
            ml0.f().b("Automatic data collection is enabled. Allowing upload.");
            this.o.e(Boolean.FALSE);
            return dk1.e(Boolean.TRUE);
        }
        ml0.f().b("Automatic data collection is disabled.");
        ml0.f().i("Notifying that unsent reports are available.");
        this.o.e(Boolean.TRUE);
        rj1<TContinuationResult> o = this.b.g().o(new c());
        ml0.f().b("Waiting for send/deleteUnsentReports to be called.");
        return yq1.j(o, this.p.a());
    }

    public final void P(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            ml0 f2 = ml0.f();
            f2.i("ANR feature enabled, but device is API " + i);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.l.t(str, historicalProcessExitReasons, new fl0(this.g, str), nq1.c(str, this.g, this.e));
            return;
        }
        ml0 f3 = ml0.f();
        f3.i("No ApplicationExitInfo available. Session: " + str);
    }

    public void Q(Thread thread, Throwable th) {
        this.e.g(new f(System.currentTimeMillis(), th, thread));
    }

    public void R(long j, String str) {
        this.e.h(new e(j, str));
    }

    public boolean s() {
        if (!this.c.c()) {
            String B = B();
            return B != null && this.j.c(B);
        }
        ml0.f().i("Found previous crash marker.");
        this.c.d();
        return true;
    }

    public void t(zb1 zb1Var) {
        u(false, zb1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(boolean z, zb1 zb1Var) {
        ArrayList arrayList = new ArrayList(this.l.n());
        if (arrayList.size() <= z) {
            ml0.f().i("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z ? 1 : 0);
        if (zb1Var.b().b.b) {
            P(str);
        } else {
            ml0.f().i("ANR feature disabled.");
        }
        if (this.j.c(str)) {
            y(str);
        }
        this.l.i(C(), z != 0 ? (String) arrayList.get(0) : null);
    }

    public final void v(String str) {
        long C = C();
        ml0 f2 = ml0.f();
        f2.b("Opening a new session with ID " + str);
        this.j.d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", dm.i()), C, of1.b(o(this.f, this.h), q(), p()));
        this.i.e(str);
        this.l.o(str, C);
    }

    public final void w(long j) {
        try {
            h10 h10Var = this.g;
            if (h10Var.e(".ae" + j).createNewFile()) {
                return;
            }
            throw new IOException("Create new file failed.");
        } catch (IOException e2) {
            ml0.f().l("Could not create app exception marker file.", e2);
        }
    }

    public void x(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, zb1 zb1Var) {
        this.n = zb1Var;
        M(str);
        an anVar = new an(new a(), zb1Var, uncaughtExceptionHandler, this.j);
        this.m = anVar;
        Thread.setDefaultUncaughtExceptionHandler(anVar);
    }

    public final void y(String str) {
        ml0 f2 = ml0.f();
        f2.i("Finalizing native report for session " + str);
        yr0 a2 = this.j.a(str);
        File d2 = a2.d();
        if (d2 == null || !d2.exists()) {
            ml0 f3 = ml0.f();
            f3.k("No minidump data found for session " + str);
            return;
        }
        long lastModified = d2.lastModified();
        fl0 fl0Var = new fl0(this.g, str);
        File i = this.g.i(str);
        if (!i.isDirectory()) {
            ml0.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        w(lastModified);
        List<wr0> D = D(a2, str, this.g, fl0Var.b());
        xr0.b(i, D);
        ml0.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.l.h(str, D);
        fl0Var.a();
    }

    public boolean z(zb1 zb1Var) {
        this.e.b();
        if (H()) {
            ml0.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        ml0.f().i("Finalizing previously open sessions.");
        try {
            u(true, zb1Var);
            ml0.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e2) {
            ml0.f().e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }
}
