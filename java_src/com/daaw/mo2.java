package com.daaw;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class mo2 {
    public final wm2 a;
    public final String b;
    public final String c;
    public final Class[] e;
    public volatile Method d = null;
    public final CountDownLatch f = new CountDownLatch(1);

    public mo2(wm2 wm2Var, String str, String str2, Class... clsArr) {
        this.a = wm2Var;
        this.b = str;
        this.c = str2;
        this.e = clsArr;
        wm2Var.k().submit(new lo2(this));
    }

    public static /* bridge */ /* synthetic */ void b(mo2 mo2Var) {
        try {
            wm2 wm2Var = mo2Var.a;
            Class loadClass = wm2Var.i().loadClass(mo2Var.c(wm2Var.u(), mo2Var.b));
            if (loadClass != null) {
                mo2Var.d = loadClass.getMethod(mo2Var.c(mo2Var.a.u(), mo2Var.c), mo2Var.e);
                Method method = mo2Var.d;
            }
        } catch (xl2 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            mo2Var.f.countDown();
            throw th;
        }
        mo2Var.f.countDown();
    }

    public final Method a() {
        if (this.d != null) {
            return this.d;
        }
        try {
            if (this.f.await(2L, TimeUnit.SECONDS)) {
                return this.d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final String c(byte[] bArr, String str) {
        return new String(this.a.e().b(bArr, str), "UTF-8");
    }
}
