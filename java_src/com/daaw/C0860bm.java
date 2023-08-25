package com.daaw;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.daaw.C0650an;
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
/* renamed from: com.daaw.bm */
/* loaded from: classes2.dex */
public class C0860bm {

    /* renamed from: s */
    public static final FilenameFilter f4905s = new FilenameFilter() { // from class: com.daaw.am
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean m26045I;
            m26045I = C0860bm.m26045I(file, str);
            return m26045I;
        }
    };

    /* renamed from: a */
    public final Context f4906a;

    /* renamed from: b */
    public final C1209ep f4907b;

    /* renamed from: c */
    public final C1200em f4908c;

    /* renamed from: d */
    public final nq1 f4909d;

    /* renamed from: e */
    public final C3873zl f4910e;

    /* renamed from: f */
    public final ue0 f4911f;

    /* renamed from: g */
    public final h10 f4912g;

    /* renamed from: h */
    public final C0602a5 f4913h;

    /* renamed from: i */
    public final fl0 f4914i;

    /* renamed from: j */
    public final InterfaceC1306fm f4915j;

    /* renamed from: k */
    public final InterfaceC3277v2 f4916k;

    /* renamed from: l */
    public final pb1 f4917l;

    /* renamed from: m */
    public C0650an f4918m;

    /* renamed from: n */
    public zb1 f4919n = null;

    /* renamed from: o */
    public final tj1<Boolean> f4920o = new tj1<>();

    /* renamed from: p */
    public final tj1<Boolean> f4921p = new tj1<>();

    /* renamed from: q */
    public final tj1<Void> f4922q = new tj1<>();

    /* renamed from: r */
    public final AtomicBoolean f4923r = new AtomicBoolean(false);

    /* renamed from: com.daaw.bm$a */
    /* loaded from: classes2.dex */
    public class C0861a implements C0650an.InterfaceC0651a {
        public C0861a() {
        }

        @Override // com.daaw.C0650an.InterfaceC0651a
        /* renamed from: a */
        public void mo26009a(zb1 zb1Var, Thread thread, Throwable th) {
            C0860bm.this.m26048F(zb1Var, thread, th);
        }
    }

    /* renamed from: com.daaw.bm$b */
    /* loaded from: classes2.dex */
    public class CallableC0862b implements Callable<rj1<Void>> {

        /* renamed from: a */
        public final /* synthetic */ long f4925a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f4926b;

        /* renamed from: c */
        public final /* synthetic */ Thread f4927c;

        /* renamed from: d */
        public final /* synthetic */ zb1 f4928d;

        /* renamed from: e */
        public final /* synthetic */ boolean f4929e;

        /* renamed from: com.daaw.bm$b$a */
        /* loaded from: classes2.dex */
        public class C0863a implements ai1<tb1, Void> {

            /* renamed from: a */
            public final /* synthetic */ Executor f4931a;

            /* renamed from: b */
            public final /* synthetic */ String f4932b;

            public C0863a(Executor executor, String str) {
                this.f4931a = executor;
                this.f4932b = str;
            }

            @Override // com.daaw.ai1
            /* renamed from: b */
            public rj1<Void> mo6209a(tb1 tb1Var) {
                if (tb1Var == null) {
                    ml0.m15976f().m15971k("Received null app settings, cannot send reports at crash time.");
                    return dk1.m24304e(null);
                }
                rj1[] rj1VarArr = new rj1[2];
                rj1VarArr[0] = C0860bm.this.m26042L();
                rj1VarArr[1] = C0860bm.this.f4917l.m13470w(this.f4931a, CallableC0862b.this.f4929e ? this.f4932b : null);
                return dk1.m24302g(rj1VarArr);
            }
        }

        public CallableC0862b(long j, Throwable th, Thread thread, zb1 zb1Var, boolean z) {
            this.f4925a = j;
            this.f4926b = th;
            this.f4927c = thread;
            this.f4928d = zb1Var;
            this.f4929e = z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public rj1<Void> call() {
            long m26049E = C0860bm.m26049E(this.f4925a);
            String m26052B = C0860bm.this.m26052B();
            if (m26052B == null) {
                ml0.m15976f().m15978d("Tried to write a fatal exception while no session was open.");
                return dk1.m24304e(null);
            }
            C0860bm.this.f4908c.m23379a();
            C0860bm.this.f4917l.m13475r(this.f4926b, this.f4927c, m26052B, m26049E);
            C0860bm.this.m26013w(this.f4925a);
            C0860bm.this.m26016t(this.f4928d);
            C0860bm.this.m26014v(new C1269fd(C0860bm.this.f4911f).toString());
            if (C0860bm.this.f4907b.m23322d()) {
                Executor m2147c = C0860bm.this.f4910e.m2147c();
                return this.f4928d.mo2555a().mo11234p(m2147c, new C0863a(m2147c, m26052B));
            }
            return dk1.m24304e(null);
        }
    }

    /* renamed from: com.daaw.bm$c */
    /* loaded from: classes2.dex */
    public class C0864c implements ai1<Void, Boolean> {
        public C0864c() {
        }

        @Override // com.daaw.ai1
        /* renamed from: b */
        public rj1<Boolean> mo6209a(Void r1) {
            return dk1.m24304e(Boolean.TRUE);
        }
    }

    /* renamed from: com.daaw.bm$d */
    /* loaded from: classes2.dex */
    public class C0865d implements ai1<Boolean, Void> {

        /* renamed from: a */
        public final /* synthetic */ rj1 f4935a;

        /* renamed from: com.daaw.bm$d$a */
        /* loaded from: classes2.dex */
        public class CallableC0866a implements Callable<rj1<Void>> {

            /* renamed from: a */
            public final /* synthetic */ Boolean f4937a;

            /* renamed from: com.daaw.bm$d$a$a */
            /* loaded from: classes2.dex */
            public class C0867a implements ai1<tb1, Void> {

                /* renamed from: a */
                public final /* synthetic */ Executor f4939a;

                public C0867a(Executor executor) {
                    this.f4939a = executor;
                }

                @Override // com.daaw.ai1
                /* renamed from: b */
                public rj1<Void> mo6209a(tb1 tb1Var) {
                    if (tb1Var == null) {
                        ml0.m15976f().m15971k("Received null app settings at app startup. Cannot send cached reports");
                    } else {
                        C0860bm.this.m26042L();
                        C0860bm.this.f4917l.m13471v(this.f4939a);
                        C0860bm.this.f4922q.m9078e(null);
                    }
                    return dk1.m24304e(null);
                }
            }

            public CallableC0866a(Boolean bool) {
                this.f4937a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public rj1<Void> call() {
                if (this.f4937a.booleanValue()) {
                    ml0.m15976f().m15980b("Sending cached crash reports...");
                    C0860bm.this.f4907b.m23323c(this.f4937a.booleanValue());
                    Executor m2147c = C0860bm.this.f4910e.m2147c();
                    return C0865d.this.f4935a.mo11234p(m2147c, new C0867a(m2147c));
                }
                ml0.m15976f().m15973i("Deleting cached crash reports...");
                C0860bm.m26018r(C0860bm.this.m26044J());
                C0860bm.this.f4917l.m13472u();
                C0860bm.this.f4922q.m9078e(null);
                return dk1.m24304e(null);
            }
        }

        public C0865d(rj1 rj1Var) {
            this.f4935a = rj1Var;
        }

        @Override // com.daaw.ai1
        /* renamed from: b */
        public rj1<Void> mo6209a(Boolean bool) {
            return C0860bm.this.f4910e.m2141i(new CallableC0866a(bool));
        }
    }

    /* renamed from: com.daaw.bm$e */
    /* loaded from: classes2.dex */
    public class CallableC0868e implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ long f4941a;

        /* renamed from: b */
        public final /* synthetic */ String f4942b;

        public CallableC0868e(long j, String str) {
            this.f4941a = j;
            this.f4942b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            if (C0860bm.this.m26046H()) {
                return null;
            }
            C0860bm.this.f4914i.m22508g(this.f4941a, this.f4942b);
            return null;
        }
    }

    /* renamed from: com.daaw.bm$f */
    /* loaded from: classes2.dex */
    public class RunnableC0869f implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ long f4944p;

        /* renamed from: q */
        public final /* synthetic */ Throwable f4945q;

        /* renamed from: r */
        public final /* synthetic */ Thread f4946r;

        public RunnableC0869f(long j, Throwable th, Thread thread) {
            this.f4944p = j;
            this.f4945q = th;
            this.f4946r = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0860bm.this.m26046H()) {
                return;
            }
            long m26049E = C0860bm.m26049E(this.f4944p);
            String m26052B = C0860bm.this.m26052B();
            if (m26052B == null) {
                ml0.m15976f().m15971k("Tried to write a non-fatal exception while no session was open.");
            } else {
                C0860bm.this.f4917l.m13474s(this.f4945q, this.f4946r, m26052B, m26049E);
            }
        }
    }

    /* renamed from: com.daaw.bm$g */
    /* loaded from: classes2.dex */
    public class CallableC0870g implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ String f4948a;

        public CallableC0870g(String str) {
            this.f4948a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            C0860bm.this.m26014v(this.f4948a);
            return null;
        }
    }

    /* renamed from: com.daaw.bm$h */
    /* loaded from: classes2.dex */
    public class CallableC0871h implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ long f4950a;

        public CallableC0871h(long j) {
            this.f4950a = j;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f4950a);
            C0860bm.this.f4916k.mo7545a("_ae", bundle);
            return null;
        }
    }

    public C0860bm(Context context, C3873zl c3873zl, ue0 ue0Var, C1209ep c1209ep, h10 h10Var, C1200em c1200em, C0602a5 c0602a5, nq1 nq1Var, fl0 fl0Var, pb1 pb1Var, InterfaceC1306fm interfaceC1306fm, InterfaceC3277v2 interfaceC3277v2) {
        this.f4906a = context;
        this.f4910e = c3873zl;
        this.f4911f = ue0Var;
        this.f4907b = c1209ep;
        this.f4912g = h10Var;
        this.f4908c = c1200em;
        this.f4913h = c0602a5;
        this.f4909d = nq1Var;
        this.f4914i = fl0Var;
        this.f4915j = interfaceC1306fm;
        this.f4916k = interfaceC3277v2;
        this.f4917l = pb1Var;
    }

    /* renamed from: A */
    public static boolean m26053A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: C */
    public static long m26051C() {
        return m26049E(System.currentTimeMillis());
    }

    /* renamed from: D */
    public static List<wr0> m26050D(yr0 yr0Var, String str, h10 h10Var, byte[] bArr) {
        File m21097o = h10Var.m21097o(str, "user-data");
        File m21097o2 = h10Var.m21097o(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0947cd("logs_file", "logs", bArr));
        arrayList.add(new s00("crash_meta_file", "metadata", yr0Var.mo3383f()));
        arrayList.add(new s00("session_meta_file", "session", yr0Var.mo3384e()));
        arrayList.add(new s00("app_meta_file", "app", yr0Var.mo3388a()));
        arrayList.add(new s00("device_meta_file", "device", yr0Var.mo3386c()));
        arrayList.add(new s00("os_meta_file", "os", yr0Var.mo3387b()));
        arrayList.add(new s00("minidump_file", "minidump", yr0Var.mo3385d()));
        arrayList.add(new s00("user_meta_file", "user", m21097o));
        arrayList.add(new s00("keys_file", "keys", m21097o2));
        return arrayList;
    }

    /* renamed from: E */
    public static long m26049E(long j) {
        return j / 1000;
    }

    /* renamed from: I */
    public static /* synthetic */ boolean m26045I(File file, String str) {
        return str.startsWith(".ae");
    }

    /* renamed from: o */
    public static of1.AbstractC2435a m26021o(ue0 ue0Var, C0602a5 c0602a5) {
        return of1.AbstractC2435a.m14313b(ue0Var.m8299f(), c0602a5.f2891e, c0602a5.f2892f, ue0Var.mo8304a(), EnumC3464ws.m5831a(c0602a5.f2889c).m5830b(), c0602a5.f2893g);
    }

    /* renamed from: p */
    public static of1.AbstractC2436b m26020p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return of1.AbstractC2436b.m14312c(C1279fh.m22655l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C1279fh.m22648s(), statFs.getBlockCount() * statFs.getBlockSize(), C1279fh.m22643x(), C1279fh.m22654m(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: q */
    public static of1.AbstractC2437c m26019q() {
        return of1.AbstractC2437c.m14311a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C1279fh.m22642y());
    }

    /* renamed from: r */
    public static void m26018r(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    /* renamed from: B */
    public final String m26052B() {
        SortedSet<String> m13479n = this.f4917l.m13479n();
        if (m13479n.isEmpty()) {
            return null;
        }
        return m13479n.first();
    }

    /* renamed from: F */
    public void m26048F(zb1 zb1Var, Thread thread, Throwable th) {
        m26047G(zb1Var, thread, th, false);
    }

    /* renamed from: G */
    public synchronized void m26047G(zb1 zb1Var, Thread thread, Throwable th, boolean z) {
        ml0 m15976f = ml0.m15976f();
        m15976f.m15980b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            yq1.m3444d(this.f4910e.m2141i(new CallableC0862b(System.currentTimeMillis(), th, thread, zb1Var, z)));
        } catch (TimeoutException unused) {
            ml0.m15976f().m15978d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e) {
            ml0.m15976f().m15977e("Error handling uncaught exception", e);
        }
    }

    /* renamed from: H */
    public boolean m26046H() {
        C0650an c0650an = this.f4918m;
        return c0650an != null && c0650an.m27337a();
    }

    /* renamed from: J */
    public List<File> m26044J() {
        return this.f4912g.m21106f(f4905s);
    }

    /* renamed from: K */
    public final rj1<Void> m26043K(long j) {
        if (m26053A()) {
            ml0.m15976f().m15971k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return dk1.m24304e(null);
        }
        ml0.m15976f().m15980b("Logging app exception event to Firebase Analytics");
        return dk1.m24306c(new ScheduledThreadPoolExecutor(1), new CallableC0871h(j));
    }

    /* renamed from: L */
    public final rj1<Void> m26042L() {
        ArrayList arrayList = new ArrayList();
        for (File file : m26044J()) {
            try {
                arrayList.add(m26043K(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                ml0 m15976f = ml0.m15976f();
                m15976f.m15971k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return dk1.m24303f(arrayList);
    }

    /* renamed from: M */
    public void m26041M(String str) {
        this.f4910e.m2142h(new CallableC0870g(str));
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: N */
    public rj1<Void> m26040N(rj1<tb1> rj1Var) {
        if (this.f4917l.m13481l()) {
            ml0.m15976f().m15973i("Crash reports are available to be sent.");
            return m26039O().mo11235o(new C0865d(rj1Var));
        }
        ml0.m15976f().m15973i("No crash reports are available to be sent.");
        this.f4920o.m9078e(Boolean.FALSE);
        return dk1.m24304e(null);
    }

    /* renamed from: O */
    public final rj1<Boolean> m26039O() {
        if (this.f4907b.m23322d()) {
            ml0.m15976f().m15980b("Automatic data collection is enabled. Allowing upload.");
            this.f4920o.m9078e(Boolean.FALSE);
            return dk1.m24304e(Boolean.TRUE);
        }
        ml0.m15976f().m15980b("Automatic data collection is disabled.");
        ml0.m15976f().m15973i("Notifying that unsent reports are available.");
        this.f4920o.m9078e(Boolean.TRUE);
        rj1<TContinuationResult> mo11235o = this.f4907b.m23319g().mo11235o(new C0864c());
        ml0.m15976f().m15980b("Waiting for send/deleteUnsentReports to be called.");
        return yq1.m3438j(mo11235o, this.f4921p.m9082a());
    }

    /* renamed from: P */
    public final void m26038P(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            ml0 m15976f = ml0.m15976f();
            m15976f.m15973i("ANR feature enabled, but device is API " + i);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f4906a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f4917l.m13473t(str, historicalProcessExitReasons, new fl0(this.f4912g, str), nq1.m14885c(str, this.f4912g, this.f4910e));
            return;
        }
        ml0 m15976f2 = ml0.m15976f();
        m15976f2.m15973i("No ApplicationExitInfo available. Session: " + str);
    }

    /* renamed from: Q */
    public void m26037Q(Thread thread, Throwable th) {
        this.f4910e.m2143g(new RunnableC0869f(System.currentTimeMillis(), th, thread));
    }

    /* renamed from: R */
    public void m26036R(long j, String str) {
        this.f4910e.m2142h(new CallableC0868e(j, str));
    }

    /* renamed from: s */
    public boolean m26017s() {
        if (!this.f4908c.m23377c()) {
            String m26052B = m26052B();
            return m26052B != null && this.f4915j.mo19653c(m26052B);
        }
        ml0.m15976f().m15973i("Found previous crash marker.");
        this.f4908c.m23376d();
        return true;
    }

    /* renamed from: t */
    public void m26016t(zb1 zb1Var) {
        m26015u(false, zb1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public final void m26015u(boolean z, zb1 zb1Var) {
        ArrayList arrayList = new ArrayList(this.f4917l.m13479n());
        if (arrayList.size() <= z) {
            ml0.m15976f().m15973i("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z ? 1 : 0);
        if (zb1Var.mo2554b().f27200b.f27208b) {
            m26038P(str);
        } else {
            ml0.m15976f().m15973i("ANR feature disabled.");
        }
        if (this.f4915j.mo19653c(str)) {
            m26011y(str);
        }
        this.f4917l.m13484i(m26051C(), z != 0 ? (String) arrayList.get(0) : null);
    }

    /* renamed from: v */
    public final void m26014v(String str) {
        long m26051C = m26051C();
        ml0 m15976f = ml0.m15976f();
        m15976f.m15980b("Opening a new session with ID " + str);
        this.f4915j.mo19652d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C1103dm.m24242i()), m26051C, of1.m14314b(m26021o(this.f4911f, this.f4913h), m26019q(), m26020p()));
        this.f4914i.m22510e(str);
        this.f4917l.m13478o(str, m26051C);
    }

    /* renamed from: w */
    public final void m26013w(long j) {
        try {
            h10 h10Var = this.f4912g;
            if (h10Var.m21107e(".ae" + j).createNewFile()) {
                return;
            }
            throw new IOException("Create new file failed.");
        } catch (IOException e) {
            ml0.m15976f().m15970l("Could not create app exception marker file.", e);
        }
    }

    /* renamed from: x */
    public void m26012x(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, zb1 zb1Var) {
        this.f4919n = zb1Var;
        m26041M(str);
        C0650an c0650an = new C0650an(new C0861a(), zb1Var, uncaughtExceptionHandler, this.f4915j);
        this.f4918m = c0650an;
        Thread.setDefaultUncaughtExceptionHandler(c0650an);
    }

    /* renamed from: y */
    public final void m26011y(String str) {
        ml0 m15976f = ml0.m15976f();
        m15976f.m15973i("Finalizing native report for session " + str);
        yr0 mo19655a = this.f4915j.mo19655a(str);
        File mo3385d = mo19655a.mo3385d();
        if (mo3385d == null || !mo3385d.exists()) {
            ml0 m15976f2 = ml0.m15976f();
            m15976f2.m15971k("No minidump data found for session " + str);
            return;
        }
        long lastModified = mo3385d.lastModified();
        fl0 fl0Var = new fl0(this.f4912g, str);
        File m21103i = this.f4912g.m21103i(str);
        if (!m21103i.isDirectory()) {
            ml0.m15976f().m15971k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        m26013w(lastModified);
        List<wr0> m26050D = m26050D(mo19655a, str, this.f4912g, fl0Var.m22513b());
        xr0.m4787b(m21103i, m26050D);
        ml0.m15976f().m15980b("CrashlyticsController#finalizePreviousNativeSession");
        this.f4917l.m13485h(str, m26050D);
        fl0Var.m22514a();
    }

    /* renamed from: z */
    public boolean m26010z(zb1 zb1Var) {
        this.f4910e.m2148b();
        if (m26046H()) {
            ml0.m15976f().m15971k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        ml0.m15976f().m15973i("Finalizing previously open sessions.");
        try {
            m26015u(true, zb1Var);
            ml0.m15976f().m15973i("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            ml0.m15976f().m15977e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }
}
