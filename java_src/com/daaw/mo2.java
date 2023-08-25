package com.daaw;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class mo2 {

    /* renamed from: a */
    public final wm2 f19025a;

    /* renamed from: b */
    public final String f19026b;

    /* renamed from: c */
    public final String f19027c;

    /* renamed from: e */
    public final Class[] f19029e;

    /* renamed from: d */
    public volatile Method f19028d = null;

    /* renamed from: f */
    public final CountDownLatch f19030f = new CountDownLatch(1);

    public mo2(wm2 wm2Var, String str, String str2, Class... clsArr) {
        this.f19025a = wm2Var;
        this.f19026b = str;
        this.f19027c = str2;
        this.f19029e = clsArr;
        wm2Var.m5995k().submit(new lo2(this));
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m15886b(mo2 mo2Var) {
        try {
            wm2 wm2Var = mo2Var.f19025a;
            Class loadClass = wm2Var.m5997i().loadClass(mo2Var.m15885c(wm2Var.m5985u(), mo2Var.f19026b));
            if (loadClass != null) {
                mo2Var.f19028d = loadClass.getMethod(mo2Var.m15885c(mo2Var.f19025a.m5985u(), mo2Var.f19027c), mo2Var.f19029e);
                Method method = mo2Var.f19028d;
            }
        } catch (xl2 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            mo2Var.f19030f.countDown();
            throw th;
        }
        mo2Var.f19030f.countDown();
    }

    /* renamed from: a */
    public final Method m15887a() {
        if (this.f19028d != null) {
            return this.f19028d;
        }
        try {
            if (this.f19030f.await(2L, TimeUnit.SECONDS)) {
                return this.f19028d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final String m15885c(byte[] bArr, String str) {
        return new String(this.f19025a.m6001e().m3582b(bArr, str), "UTF-8");
    }
}
