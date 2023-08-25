package com.daaw;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class du6 {

    /* renamed from: g */
    public static final HashMap f7823g = new HashMap();

    /* renamed from: a */
    public final Context f7824a;

    /* renamed from: b */
    public final eu6 f7825b;

    /* renamed from: c */
    public final es6 f7826c;

    /* renamed from: d */
    public final zr6 f7827d;

    /* renamed from: e */
    public ut6 f7828e;

    /* renamed from: f */
    public final Object f7829f = new Object();

    public du6(Context context, eu6 eu6Var, es6 es6Var, zr6 zr6Var) {
        this.f7824a = context;
        this.f7825b = eu6Var;
        this.f7826c = es6Var;
        this.f7827d = zr6Var;
    }

    /* renamed from: a */
    public final ks6 m23944a() {
        ut6 ut6Var;
        synchronized (this.f7829f) {
            ut6Var = this.f7828e;
        }
        return ut6Var;
    }

    /* renamed from: b */
    public final vt6 m23943b() {
        synchronized (this.f7829f) {
            ut6 ut6Var = this.f7828e;
            if (ut6Var != null) {
                return ut6Var.m7710f();
            }
            return null;
        }
    }

    /* renamed from: c */
    public final boolean m23942c(vt6 vt6Var) {
        int i;
        cu6 cu6Var;
        es6 es6Var;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                ut6 ut6Var = new ut6(m23941d(vt6Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f7824a, "msa-r", vt6Var.m6792e(), null, new Bundle(), 2), vt6Var, this.f7825b, this.f7826c);
                if (ut6Var.m7708h()) {
                    int m7711e = ut6Var.m7711e();
                    if (m7711e != 0) {
                        throw new cu6(4001, "ci: " + m7711e);
                    }
                    synchronized (this.f7829f) {
                        ut6 ut6Var2 = this.f7828e;
                        if (ut6Var2 != null) {
                            try {
                                ut6Var2.m7709g();
                            } catch (cu6 e) {
                                this.f7826c.m23229c(e.m24974a(), -1L, e);
                            }
                        }
                        this.f7828e = ut6Var;
                    }
                    this.f7826c.m23228d(3000, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                throw new cu6(4000, "init failed");
            } catch (Exception e2) {
                throw new cu6(2004, e2);
            }
        } catch (cu6 e3) {
            es6 es6Var2 = this.f7826c;
            i = e3.m24974a();
            es6Var = es6Var2;
            cu6Var = e3;
            es6Var.m23229c(i, System.currentTimeMillis() - currentTimeMillis, cu6Var);
            return false;
        } catch (Exception e4) {
            i = 4010;
            es6Var = this.f7826c;
            cu6Var = e4;
            es6Var.m23229c(i, System.currentTimeMillis() - currentTimeMillis, cu6Var);
            return false;
        }
    }

    /* renamed from: d */
    public final synchronized Class m23941d(vt6 vt6Var) {
        String m27256U = vt6Var.m6796a().m27256U();
        HashMap hashMap = f7823g;
        Class cls = (Class) hashMap.get(m27256U);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.f7827d.m1962a(vt6Var.m6794c())) {
                throw new cu6(2026, "VM did not pass signature verification");
            }
            try {
                File m6795b = vt6Var.m6795b();
                if (!m6795b.exists()) {
                    m6795b.mkdirs();
                }
                Class loadClass = new DexClassLoader(vt6Var.m6794c().getAbsolutePath(), m6795b.getAbsolutePath(), null, this.f7824a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(m27256U, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new cu6(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new cu6(2026, e2);
        }
    }
}
