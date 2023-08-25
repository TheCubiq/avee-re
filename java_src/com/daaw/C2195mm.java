package com.daaw;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.daaw.AbstractC2057lm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* renamed from: com.daaw.mm */
/* loaded from: classes2.dex */
public class C2195mm {

    /* renamed from: e */
    public static final Map<String, Integer> f18969e;

    /* renamed from: f */
    public static final String f18970f;

    /* renamed from: a */
    public final Context f18971a;

    /* renamed from: b */
    public final ue0 f18972b;

    /* renamed from: c */
    public final C0602a5 f18973c;

    /* renamed from: d */
    public final ef1 f18974d;

    static {
        HashMap hashMap = new HashMap();
        f18969e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f18970f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.3.3");
    }

    public C2195mm(Context context, ue0 ue0Var, C0602a5 c0602a5, ef1 ef1Var) {
        this.f18971a = context;
        this.f18972b = ue0Var;
        this.f18973c = c0602a5;
        this.f18974d = ef1Var;
    }

    /* renamed from: e */
    public static int m15957e() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f18969e.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public final AbstractC2057lm.AbstractC2060b m15961a() {
        return AbstractC2057lm.m16847b().mo16809h("18.3.3").mo16813d(this.f18973c.f2887a).mo16812e(this.f18972b.mo8304a()).mo16815b(this.f18973c.f2891e).mo16814c(this.f18973c.f2892f).mo16810g(4);
    }

    /* renamed from: b */
    public AbstractC2057lm.AbstractC2067e.AbstractC2074d m15960b(AbstractC2057lm.AbstractC2058a abstractC2058a) {
        int i = this.f18971a.getResources().getConfiguration().orientation;
        return AbstractC2057lm.AbstractC2067e.AbstractC2074d.m16744a().mo14473f("anr").mo14474e(abstractC2058a.mo16827h()).mo14477b(m15954h(i, abstractC2058a)).mo14476c(m15952j(i)).mo14478a();
    }

    /* renamed from: c */
    public AbstractC2057lm.AbstractC2067e.AbstractC2074d m15959c(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.f18971a.getResources().getConfiguration().orientation;
        return AbstractC2057lm.AbstractC2067e.AbstractC2074d.m16744a().mo14473f(str).mo14474e(j).mo14477b(m15953i(i3, new bo1(th, this.f18974d), thread, i, i2, z)).mo14476c(m15952j(i3)).mo14478a();
    }

    /* renamed from: d */
    public AbstractC2057lm m15958d(String str, long j) {
        return m15961a().mo16808i(m15944r(str, j)).mo16816a();
    }

    /* renamed from: f */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a m15956f() {
        return AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a.m16741a().mo11598b(0L).mo11596d(0L).mo11597c(this.f18973c.f2890d).mo11595e(this.f18973c.f2888b).mo11599a();
    }

    /* renamed from: g */
    public final of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a> m15955g() {
        return of0.m14315e(m15956f());
    }

    /* renamed from: h */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a m15954h(int i, AbstractC2057lm.AbstractC2058a abstractC2058a) {
        return AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.m16743a().mo13603b(Boolean.valueOf(abstractC2058a.mo16833b() != 100)).mo13599f(i).mo13601d(m15949m(abstractC2058a)).mo13604a();
    }

    /* renamed from: i */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a m15953i(int i, bo1 bo1Var, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo m22657j = C1279fh.m22657j(this.f18973c.f2890d, this.f18971a);
        if (m22657j != null) {
            bool = Boolean.valueOf(m22657j.importance != 100);
        } else {
            bool = null;
        }
        return AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.m16743a().mo13603b(bool).mo13599f(i).mo13601d(m15948n(bo1Var, thread, i2, i3, z)).mo13604a();
    }

    /* renamed from: j */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c m15952j(int i) {
        C2272nb m15349a = C2272nb.m15349a(this.f18971a);
        Float m15348b = m15349a.m15348b();
        Double valueOf = m15348b != null ? Double.valueOf(m15348b.doubleValue()) : null;
        int m15347c = m15349a.m15347c();
        boolean m22652o = C1279fh.m22652o(this.f18971a);
        return AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c.m16734a().mo6351b(valueOf).mo6350c(m15347c).mo6347f(m22652o).mo6348e(i).mo6346g(C1279fh.m22648s() - C1279fh.m22666a(this.f18971a)).mo6349d(C1279fh.m22665b(Environment.getDataDirectory().getPath())).mo6352a();
    }

    /* renamed from: k */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c m15951k(bo1 bo1Var, int i, int i2) {
        return m15950l(bo1Var, i, i2, 0);
    }

    /* renamed from: l */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c m15950l(bo1 bo1Var, int i, int i2, int i3) {
        String str = bo1Var.f5007b;
        String str2 = bo1Var.f5006a;
        StackTraceElement[] stackTraceElementArr = bo1Var.f5008c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        bo1 bo1Var2 = bo1Var.f5009d;
        if (i3 >= i2) {
            bo1 bo1Var3 = bo1Var2;
            while (bo1Var3 != null) {
                bo1Var3 = bo1Var3.f5009d;
                i4++;
            }
        }
        AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c.AbstractC2082a mo10552d = AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c.m16738a().mo10550f(str).mo10551e(str2).mo10553c(of0.m14316d(m15946p(stackTraceElementArr, i))).mo10552d(i4);
        if (bo1Var2 != null && i4 == 0) {
            mo10552d.mo10554b(m15950l(bo1Var2, i, i2, i3 + 1));
        }
        return mo10552d.mo10555a();
    }

    /* renamed from: m */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b m15949m(AbstractC2057lm.AbstractC2058a abstractC2058a) {
        return AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.m16742a().mo12715b(abstractC2058a).mo12712e(m15941u()).mo12714c(m15955g()).mo12716a();
    }

    /* renamed from: n */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b m15948n(bo1 bo1Var, Thread thread, int i, int i2, boolean z) {
        return AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.m16742a().mo12711f(m15938x(bo1Var, thread, i, z)).mo12713d(m15951k(bo1Var, i, i2)).mo12712e(m15941u()).mo12714c(m15955g()).mo12716a();
    }

    /* renamed from: o */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b m15947o(StackTraceElement stackTraceElement, AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b.AbstractC2088a abstractC2088a) {
        long j = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j = stackTraceElement.getLineNumber();
        }
        return abstractC2088a.mo7350e(max).mo7349f(str).mo7353b(fileName).mo7351d(j).mo7354a();
    }

    /* renamed from: p */
    public final of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b> m15946p(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(m15947o(stackTraceElement, AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b.m16735a().mo7352c(i)));
        }
        return of0.m14316d(arrayList);
    }

    /* renamed from: q */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2068a m15945q() {
        return AbstractC2057lm.AbstractC2067e.AbstractC2068a.m16773a().mo16761e(this.f18972b.m8299f()).mo16759g(this.f18973c.f2891e).mo16762d(this.f18973c.f2892f).mo16760f(this.f18972b.mo8304a()).mo16764b(this.f18973c.f2893g.m15783d()).mo16763c(this.f18973c.f2893g.m15782e()).mo16765a();
    }

    /* renamed from: r */
    public final AbstractC2057lm.AbstractC2067e m15944r(String str, long j) {
        return AbstractC2057lm.AbstractC2067e.m16789a().mo16747l(j).mo16750i(str).mo16752g(f18970f).mo16757b(m15945q()).mo16748k(m15942t()).mo16755d(m15943s()).mo16751h(3).mo16758a();
    }

    /* renamed from: s */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2072c m15943s() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int m15957e = m15957e();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long m22648s = C1279fh.m22648s();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean m22643x = C1279fh.m22643x();
        int m22654m = C1279fh.m22654m();
        String str = Build.MANUFACTURER;
        return AbstractC2057lm.AbstractC2067e.AbstractC2072c.m16745a().mo15467b(m15957e).mo15463f(Build.MODEL).mo15466c(availableProcessors).mo15461h(m22648s).mo15465d(blockCount).mo15460i(m22643x).mo15459j(m22654m).mo15464e(str).mo15462g(Build.PRODUCT).mo15468a();
    }

    /* renamed from: t */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2094e m15942t() {
        return AbstractC2057lm.AbstractC2067e.AbstractC2094e.m16732a().mo4020d(3).mo4019e(Build.VERSION.RELEASE).mo4022b(Build.VERSION.CODENAME).mo4021c(C1279fh.m22642y()).mo4023a();
    }

    /* renamed from: u */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d m15941u() {
        return AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d.m16737a().mo9458d("0").mo9459c("0").mo9460b(0L).mo9461a();
    }

    /* renamed from: v */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e m15940v(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return m15939w(thread, stackTraceElementArr, 0);
    }

    /* renamed from: w */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e m15939w(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.m16736a().mo8437d(thread.getName()).mo8438c(i).mo8439b(of0.m14316d(m15946p(stackTraceElementArr, i))).mo8440a();
    }

    /* renamed from: x */
    public final of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e> m15938x(bo1 bo1Var, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m15939w(thread, bo1Var.f5008c, i));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(m15940v(key, this.f18974d.mo9614a(entry.getValue())));
                }
            }
        }
        return of0.m14316d(arrayList);
    }
}
