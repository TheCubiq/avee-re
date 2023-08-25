package com.daaw;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.daaw.lm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes2.dex */
public class mm {
    public static final Map<String, Integer> e;
    public static final String f;
    public final Context a;
    public final ue0 b;
    public final a5 c;
    public final ef1 d;

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.3.3");
    }

    public mm(Context context, ue0 ue0Var, a5 a5Var, ef1 ef1Var) {
        this.a = context;
        this.b = ue0Var;
        this.c = a5Var;
        this.d = ef1Var;
    }

    public static int e() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = e.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    public final lm.b a() {
        return lm.b().h("18.3.3").d(this.c.a).e(this.b.a()).b(this.c.e).c(this.c.f).g(4);
    }

    public lm.e.d b(lm.a aVar) {
        int i = this.a.getResources().getConfiguration().orientation;
        return lm.e.d.a().f("anr").e(aVar.h()).b(h(i, aVar)).c(j(i)).a();
    }

    public lm.e.d c(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.a.getResources().getConfiguration().orientation;
        return lm.e.d.a().f(str).e(j).b(i(i3, new bo1(th, this.d), thread, i, i2, z)).c(j(i3)).a();
    }

    public lm d(String str, long j) {
        return a().i(r(str, j)).a();
    }

    public final lm.e.d.a.b.AbstractC0064a f() {
        return lm.e.d.a.b.AbstractC0064a.a().b(0L).d(0L).c(this.c.d).e(this.c.b).a();
    }

    public final of0<lm.e.d.a.b.AbstractC0064a> g() {
        return of0.e(f());
    }

    public final lm.e.d.a h(int i, lm.a aVar) {
        return lm.e.d.a.a().b(Boolean.valueOf(aVar.b() != 100)).f(i).d(m(aVar)).a();
    }

    public final lm.e.d.a i(int i, bo1 bo1Var, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo j = fh.j(this.c.d, this.a);
        if (j != null) {
            bool = Boolean.valueOf(j.importance != 100);
        } else {
            bool = null;
        }
        return lm.e.d.a.a().b(bool).f(i).d(n(bo1Var, thread, i2, i3, z)).a();
    }

    public final lm.e.d.c j(int i) {
        nb a = nb.a(this.a);
        Float b = a.b();
        Double valueOf = b != null ? Double.valueOf(b.doubleValue()) : null;
        int c = a.c();
        boolean o = fh.o(this.a);
        return lm.e.d.c.a().b(valueOf).c(c).f(o).e(i).g(fh.s() - fh.a(this.a)).d(fh.b(Environment.getDataDirectory().getPath())).a();
    }

    public final lm.e.d.a.b.c k(bo1 bo1Var, int i, int i2) {
        return l(bo1Var, i, i2, 0);
    }

    public final lm.e.d.a.b.c l(bo1 bo1Var, int i, int i2, int i3) {
        String str = bo1Var.b;
        String str2 = bo1Var.a;
        StackTraceElement[] stackTraceElementArr = bo1Var.c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        bo1 bo1Var2 = bo1Var.d;
        if (i3 >= i2) {
            bo1 bo1Var3 = bo1Var2;
            while (bo1Var3 != null) {
                bo1Var3 = bo1Var3.d;
                i4++;
            }
        }
        lm.e.d.a.b.c.AbstractC0067a d = lm.e.d.a.b.c.a().f(str).e(str2).c(of0.d(p(stackTraceElementArr, i))).d(i4);
        if (bo1Var2 != null && i4 == 0) {
            d.b(l(bo1Var2, i, i2, i3 + 1));
        }
        return d.a();
    }

    public final lm.e.d.a.b m(lm.a aVar) {
        return lm.e.d.a.b.a().b(aVar).e(u()).c(g()).a();
    }

    public final lm.e.d.a.b n(bo1 bo1Var, Thread thread, int i, int i2, boolean z) {
        return lm.e.d.a.b.a().f(x(bo1Var, thread, i, z)).d(k(bo1Var, i, i2)).e(u()).c(g()).a();
    }

    public final lm.e.d.a.b.AbstractC0070e.AbstractC0072b o(StackTraceElement stackTraceElement, lm.e.d.a.b.AbstractC0070e.AbstractC0072b.AbstractC0073a abstractC0073a) {
        long j = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j = stackTraceElement.getLineNumber();
        }
        return abstractC0073a.e(max).f(str).b(fileName).d(j).a();
    }

    public final of0<lm.e.d.a.b.AbstractC0070e.AbstractC0072b> p(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(o(stackTraceElement, lm.e.d.a.b.AbstractC0070e.AbstractC0072b.a().c(i)));
        }
        return of0.d(arrayList);
    }

    public final lm.e.a q() {
        return lm.e.a.a().e(this.b.f()).g(this.c.e).d(this.c.f).f(this.b.a()).b(this.c.g.d()).c(this.c.g.e()).a();
    }

    public final lm.e r(String str, long j) {
        return lm.e.a().l(j).i(str).g(f).b(q()).k(t()).d(s()).h(3).a();
    }

    public final lm.e.c s() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int e2 = e();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long s = fh.s();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean x = fh.x();
        int m = fh.m();
        String str = Build.MANUFACTURER;
        return lm.e.c.a().b(e2).f(Build.MODEL).c(availableProcessors).h(s).d(blockCount).i(x).j(m).e(str).g(Build.PRODUCT).a();
    }

    public final lm.e.AbstractC0075e t() {
        return lm.e.AbstractC0075e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(fh.y()).a();
    }

    public final lm.e.d.a.b.AbstractC0068d u() {
        return lm.e.d.a.b.AbstractC0068d.a().d("0").c("0").b(0L).a();
    }

    public final lm.e.d.a.b.AbstractC0070e v(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return w(thread, stackTraceElementArr, 0);
    }

    public final lm.e.d.a.b.AbstractC0070e w(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return lm.e.d.a.b.AbstractC0070e.a().d(thread.getName()).c(i).b(of0.d(p(stackTraceElementArr, i))).a();
    }

    public final of0<lm.e.d.a.b.AbstractC0070e> x(bo1 bo1Var, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(w(thread, bo1Var.c, i));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(v(key, this.d.a(entry.getValue())));
                }
            }
        }
        return of0.d(arrayList);
    }
}
