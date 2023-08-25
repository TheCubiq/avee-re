package com.daaw;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class du6 {
    public static final HashMap g = new HashMap();
    public final Context a;
    public final eu6 b;
    public final es6 c;
    public final zr6 d;
    public ut6 e;
    public final Object f = new Object();

    public du6(Context context, eu6 eu6Var, es6 es6Var, zr6 zr6Var) {
        this.a = context;
        this.b = eu6Var;
        this.c = es6Var;
        this.d = zr6Var;
    }

    public final ks6 a() {
        ut6 ut6Var;
        synchronized (this.f) {
            ut6Var = this.e;
        }
        return ut6Var;
    }

    public final vt6 b() {
        synchronized (this.f) {
            ut6 ut6Var = this.e;
            if (ut6Var != null) {
                return ut6Var.f();
            }
            return null;
        }
    }

    public final boolean c(vt6 vt6Var) {
        int i;
        cu6 cu6Var;
        es6 es6Var;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                ut6 ut6Var = new ut6(d(vt6Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.a, "msa-r", vt6Var.e(), null, new Bundle(), 2), vt6Var, this.b, this.c);
                if (ut6Var.h()) {
                    int e = ut6Var.e();
                    if (e != 0) {
                        throw new cu6(4001, "ci: " + e);
                    }
                    synchronized (this.f) {
                        ut6 ut6Var2 = this.e;
                        if (ut6Var2 != null) {
                            try {
                                ut6Var2.g();
                            } catch (cu6 e2) {
                                this.c.c(e2.a(), -1L, e2);
                            }
                        }
                        this.e = ut6Var;
                    }
                    this.c.d(3000, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                throw new cu6(4000, "init failed");
            } catch (Exception e3) {
                throw new cu6(2004, e3);
            }
        } catch (cu6 e4) {
            es6 es6Var2 = this.c;
            i = e4.a();
            es6Var = es6Var2;
            cu6Var = e4;
            es6Var.c(i, System.currentTimeMillis() - currentTimeMillis, cu6Var);
            return false;
        } catch (Exception e5) {
            i = 4010;
            es6Var = this.c;
            cu6Var = e5;
            es6Var.c(i, System.currentTimeMillis() - currentTimeMillis, cu6Var);
            return false;
        }
    }

    public final synchronized Class d(vt6 vt6Var) {
        String U = vt6Var.a().U();
        HashMap hashMap = g;
        Class cls = (Class) hashMap.get(U);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.d.a(vt6Var.c())) {
                throw new cu6(2026, "VM did not pass signature verification");
            }
            try {
                File b = vt6Var.b();
                if (!b.exists()) {
                    b.mkdirs();
                }
                Class loadClass = new DexClassLoader(vt6Var.c().getAbsolutePath(), b.getAbsolutePath(), null, this.a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(U, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new cu6(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new cu6(2026, e2);
        }
    }
}
