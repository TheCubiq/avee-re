package com.daaw;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.daaw.lm;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public class pb1 {
    public final mm a;
    public final ym b;
    public final rp c;
    public final fl0 d;
    public final nq1 e;

    public pb1(mm mmVar, ym ymVar, rp rpVar, fl0 fl0Var, nq1 nq1Var) {
        this.a = mmVar;
        this.b = ymVar;
        this.c = rpVar;
        this.d = fl0Var;
        this.e = nq1Var;
    }

    public static lm.a e(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = f(traceInputStream);
            }
        } catch (IOException e) {
            ml0 f = ml0.f();
            f.k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
        }
        return lm.a.a().b(applicationExitInfo.getImportance()).d(applicationExitInfo.getProcessName()).f(applicationExitInfo.getReason()).h(applicationExitInfo.getTimestamp()).c(applicationExitInfo.getPid()).e(applicationExitInfo.getPss()).g(applicationExitInfo.getRss()).i(str).a();
    }

    public static String f(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static pb1 g(Context context, ue0 ue0Var, h10 h10Var, a5 a5Var, fl0 fl0Var, nq1 nq1Var, ef1 ef1Var, zb1 zb1Var, fu0 fu0Var) {
        return new pb1(new mm(context, ue0Var, a5Var, ef1Var), new ym(h10Var, zb1Var), rp.b(context, zb1Var, fu0Var), fl0Var, nq1Var);
    }

    public static List<lm.c> k(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(lm.c.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.daaw.ob1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m;
                m = pb1.m((lm.c) obj, (lm.c) obj2);
                return m;
            }
        });
        return arrayList;
    }

    public static /* synthetic */ int m(lm.c cVar, lm.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    public final lm.e.d c(lm.e.d dVar) {
        return d(dVar, this.d, this.e);
    }

    public final lm.e.d d(lm.e.d dVar, fl0 fl0Var, nq1 nq1Var) {
        lm.e.d.b g = dVar.g();
        String c = fl0Var.c();
        if (c != null) {
            g.d(lm.e.d.AbstractC0074d.a().b(c).a());
        } else {
            ml0.f().i("No log data to include with this event.");
        }
        List<lm.c> k = k(nq1Var.a());
        List<lm.c> k2 = k(nq1Var.b());
        if (!k.isEmpty() || !k2.isEmpty()) {
            g.b(dVar.b().g().c(of0.d(k)).e(of0.d(k2)).a());
        }
        return g.a();
    }

    public void h(String str, List<wr0> list) {
        ml0.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (wr0 wr0Var : list) {
            lm.d.b d = wr0Var.d();
            if (d != null) {
                arrayList.add(d);
            }
        }
        this.b.l(str, lm.d.a().b(of0.d(arrayList)).a());
    }

    public void i(long j, String str) {
        this.b.k(str, j);
    }

    public final ApplicationExitInfo j(String str, List<ApplicationExitInfo> list) {
        long q = this.b.q(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getTimestamp() < q) {
                return null;
            }
            if (applicationExitInfo.getReason() == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    public boolean l() {
        return this.b.r();
    }

    public SortedSet<String> n() {
        return this.b.p();
    }

    public void o(String str, long j) {
        this.b.z(this.a.d(str, j));
    }

    public final boolean p(rj1<zm> rj1Var) {
        if (!rj1Var.n()) {
            ml0.f().l("Crashlytics report could not be enqueued to DataTransport", rj1Var.j());
            return false;
        }
        zm k = rj1Var.k();
        ml0 f = ml0.f();
        f.b("Crashlytics report successfully enqueued to DataTransport: " + k.d());
        File c = k.c();
        if (c.delete()) {
            ml0 f2 = ml0.f();
            f2.b("Deleted report file: " + c.getPath());
            return true;
        }
        ml0 f3 = ml0.f();
        f3.k("Crashlytics could not delete report file: " + c.getPath());
        return true;
    }

    public final void q(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        this.b.y(c(this.a.c(th, thread, str2, j, 4, 8, z)), str, str2.equals("crash"));
    }

    public void r(Throwable th, Thread thread, String str, long j) {
        ml0 f = ml0.f();
        f.i("Persisting fatal event for session " + str);
        q(th, thread, str, "crash", j, true);
    }

    public void s(Throwable th, Thread thread, String str, long j) {
        ml0 f = ml0.f();
        f.i("Persisting non-fatal event for session " + str);
        q(th, thread, str, "error", j, false);
    }

    public void t(String str, List<ApplicationExitInfo> list, fl0 fl0Var, nq1 nq1Var) {
        ApplicationExitInfo j = j(str, list);
        if (j == null) {
            ml0 f = ml0.f();
            f.i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        lm.e.d b = this.a.b(e(j));
        ml0 f2 = ml0.f();
        f2.b("Persisting anr for session " + str);
        this.b.y(d(b, fl0Var, nq1Var), str, true);
    }

    public void u() {
        this.b.i();
    }

    public rj1<Void> v(Executor executor) {
        return w(executor, null);
    }

    public rj1<Void> w(Executor executor, String str) {
        List<zm> w = this.b.w();
        ArrayList arrayList = new ArrayList();
        for (zm zmVar : w) {
            if (str == null || str.equals(zmVar.d())) {
                arrayList.add(this.c.c(zmVar, str != null).g(executor, new hl() { // from class: com.daaw.nb1
                    @Override // com.daaw.hl
                    public final Object a(rj1 rj1Var) {
                        boolean p;
                        p = pb1.this.p(rj1Var);
                        return Boolean.valueOf(p);
                    }
                }));
            }
        }
        return dk1.f(arrayList);
    }
}
