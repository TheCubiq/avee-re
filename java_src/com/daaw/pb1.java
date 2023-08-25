package com.daaw;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.daaw.AbstractC2057lm;
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

    /* renamed from: a */
    public final C2195mm f22798a;

    /* renamed from: b */
    public final C3717ym f22799b;

    /* renamed from: c */
    public final C2874rp f22800c;

    /* renamed from: d */
    public final fl0 f22801d;

    /* renamed from: e */
    public final nq1 f22802e;

    public pb1(C2195mm c2195mm, C3717ym c3717ym, C2874rp c2874rp, fl0 fl0Var, nq1 nq1Var) {
        this.f22798a = c2195mm;
        this.f22799b = c3717ym;
        this.f22800c = c2874rp;
        this.f22801d = fl0Var;
        this.f22802e = nq1Var;
    }

    /* renamed from: e */
    public static AbstractC2057lm.AbstractC2058a m13488e(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = m13487f(traceInputStream);
            }
        } catch (IOException e) {
            ml0 m15976f = ml0.m15976f();
            m15976f.m15971k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
        }
        return AbstractC2057lm.AbstractC2058a.m16834a().mo16824b(applicationExitInfo.getImportance()).mo16822d(applicationExitInfo.getProcessName()).mo16820f(applicationExitInfo.getReason()).mo16818h(applicationExitInfo.getTimestamp()).mo16823c(applicationExitInfo.getPid()).mo16821e(applicationExitInfo.getPss()).mo16819g(applicationExitInfo.getRss()).mo16817i(str).mo16825a();
    }

    /* renamed from: f */
    public static String m13487f(InputStream inputStream) {
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

    /* renamed from: g */
    public static pb1 m13486g(Context context, ue0 ue0Var, h10 h10Var, C0602a5 c0602a5, fl0 fl0Var, nq1 nq1Var, ef1 ef1Var, zb1 zb1Var, fu0 fu0Var) {
        return new pb1(new C2195mm(context, ue0Var, c0602a5, ef1Var), new C3717ym(h10Var, zb1Var), C2874rp.m11102b(context, zb1Var, fu0Var), fl0Var, nq1Var);
    }

    /* renamed from: k */
    public static List<AbstractC2057lm.AbstractC2061c> m13482k(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(AbstractC2057lm.AbstractC2061c.m16807a().mo16803b(entry.getKey()).mo16802c(entry.getValue()).mo16804a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.daaw.ob1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m13480m;
                m13480m = pb1.m13480m((AbstractC2057lm.AbstractC2061c) obj, (AbstractC2057lm.AbstractC2061c) obj2);
                return m13480m;
            }
        });
        return arrayList;
    }

    /* renamed from: m */
    public static /* synthetic */ int m13480m(AbstractC2057lm.AbstractC2061c abstractC2061c, AbstractC2057lm.AbstractC2061c abstractC2061c2) {
        return abstractC2061c.mo16806b().compareTo(abstractC2061c2.mo16806b());
    }

    /* renamed from: c */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d m13490c(AbstractC2057lm.AbstractC2067e.AbstractC2074d abstractC2074d) {
        return m13489d(abstractC2074d, this.f22801d, this.f22802e);
    }

    /* renamed from: d */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d m13489d(AbstractC2057lm.AbstractC2067e.AbstractC2074d abstractC2074d, fl0 fl0Var, nq1 nq1Var) {
        AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2089b mo14479g = abstractC2074d.mo14479g();
        String m22512c = fl0Var.m22512c();
        if (m22512c != null) {
            mo14479g.mo14475d(AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d.m16733a().mo5446b(m22512c).mo5447a());
        } else {
            ml0.m15976f().m15973i("No log data to include with this event.");
        }
        List<AbstractC2057lm.AbstractC2061c> m13482k = m13482k(nq1Var.m14887a());
        List<AbstractC2057lm.AbstractC2061c> m13482k2 = m13482k(nq1Var.m14886b());
        if (!m13482k.isEmpty() || !m13482k2.isEmpty()) {
            mo14479g.mo14477b(abstractC2074d.mo14484b().mo13605g().mo13602c(of0.m14316d(m13482k)).mo13600e(of0.m14316d(m13482k2)).mo13604a());
        }
        return mo14479g.mo14478a();
    }

    /* renamed from: h */
    public void m13485h(String str, List<wr0> list) {
        ml0.m15976f().m15980b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (wr0 wr0Var : list) {
            AbstractC2057lm.AbstractC2063d.AbstractC2065b mo5839d = wr0Var.mo5839d();
            if (mo5839d != null) {
                arrayList.add(mo5839d);
            }
        }
        this.f22799b.m3550l(str, AbstractC2057lm.AbstractC2063d.m16801a().mo16797b(of0.m14316d(arrayList)).mo16798a());
    }

    /* renamed from: i */
    public void m13484i(long j, String str) {
        this.f22799b.m3551k(str, j);
    }

    /* renamed from: j */
    public final ApplicationExitInfo m13483j(String str, List<ApplicationExitInfo> list) {
        long m3545q = this.f22799b.m3545q(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getTimestamp() < m3545q) {
                return null;
            }
            if (applicationExitInfo.getReason() == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    /* renamed from: l */
    public boolean m13481l() {
        return this.f22799b.m3544r();
    }

    /* renamed from: n */
    public SortedSet<String> m13479n() {
        return this.f22799b.m3546p();
    }

    /* renamed from: o */
    public void m13478o(String str, long j) {
        this.f22799b.m3536z(this.f22798a.m15958d(str, j));
    }

    /* renamed from: p */
    public final boolean m13477p(rj1<AbstractC3878zm> rj1Var) {
        if (!rj1Var.mo11236n()) {
            ml0.m15976f().m15970l("Crashlytics report could not be enqueued to DataTransport", rj1Var.mo11240j());
            return false;
        }
        AbstractC3878zm mo11239k = rj1Var.mo11239k();
        ml0 m15976f = ml0.m15976f();
        m15976f.m15980b("Crashlytics report successfully enqueued to DataTransport: " + mo11239k.mo2116d());
        File mo2117c = mo11239k.mo2117c();
        if (mo2117c.delete()) {
            ml0 m15976f2 = ml0.m15976f();
            m15976f2.m15980b("Deleted report file: " + mo2117c.getPath());
            return true;
        }
        ml0 m15976f3 = ml0.m15976f();
        m15976f3.m15971k("Crashlytics could not delete report file: " + mo2117c.getPath());
        return true;
    }

    /* renamed from: q */
    public final void m13476q(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        this.f22799b.m3537y(m13490c(this.f22798a.m15959c(th, thread, str2, j, 4, 8, z)), str, str2.equals("crash"));
    }

    /* renamed from: r */
    public void m13475r(Throwable th, Thread thread, String str, long j) {
        ml0 m15976f = ml0.m15976f();
        m15976f.m15973i("Persisting fatal event for session " + str);
        m13476q(th, thread, str, "crash", j, true);
    }

    /* renamed from: s */
    public void m13474s(Throwable th, Thread thread, String str, long j) {
        ml0 m15976f = ml0.m15976f();
        m15976f.m15973i("Persisting non-fatal event for session " + str);
        m13476q(th, thread, str, "error", j, false);
    }

    /* renamed from: t */
    public void m13473t(String str, List<ApplicationExitInfo> list, fl0 fl0Var, nq1 nq1Var) {
        ApplicationExitInfo m13483j = m13483j(str, list);
        if (m13483j == null) {
            ml0 m15976f = ml0.m15976f();
            m15976f.m15973i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        AbstractC2057lm.AbstractC2067e.AbstractC2074d m15960b = this.f22798a.m15960b(m13488e(m13483j));
        ml0 m15976f2 = ml0.m15976f();
        m15976f2.m15980b("Persisting anr for session " + str);
        this.f22799b.m3537y(m13489d(m15960b, fl0Var, nq1Var), str, true);
    }

    /* renamed from: u */
    public void m13472u() {
        this.f22799b.m3553i();
    }

    /* renamed from: v */
    public rj1<Void> m13471v(Executor executor) {
        return m13470w(executor, null);
    }

    /* renamed from: w */
    public rj1<Void> m13470w(Executor executor, String str) {
        List<AbstractC3878zm> m3539w = this.f22799b.m3539w();
        ArrayList arrayList = new ArrayList();
        for (AbstractC3878zm abstractC3878zm : m3539w) {
            if (str == null || str.equals(abstractC3878zm.mo2116d())) {
                arrayList.add(this.f22800c.m11101c(abstractC3878zm, str != null).mo11243g(executor, new InterfaceC1587hl() { // from class: com.daaw.nb1
                    @Override // com.daaw.InterfaceC1587hl
                    /* renamed from: a */
                    public final Object mo2139a(rj1 rj1Var) {
                        boolean m13477p;
                        m13477p = pb1.this.m13477p(rj1Var);
                        return Boolean.valueOf(m13477p);
                    }
                }));
            }
        }
        return dk1.m24303f(arrayList);
    }
}
