package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class bu6 {
    public static final Object f = new Object();
    public final Context a;
    public final SharedPreferences b;
    public final String c;
    public final nt6 d;
    public boolean e;

    public bu6(Context context, int i, nt6 nt6Var, boolean z) {
        this.e = false;
        this.a = context;
        this.c = Integer.toString(i - 1);
        this.b = context.getSharedPreferences("pcvmspf", 0);
        this.d = nt6Var;
        this.e = z;
    }

    public static String f(xo2 xo2Var) {
        zo2 O = ap2.O();
        O.w(xo2Var.N().U());
        O.s(xo2Var.N().T());
        O.t(xo2Var.N().L());
        O.v(xo2Var.N().N());
        O.u(xo2Var.N().M());
        return db0.a(((ap2) O.n()).a());
    }

    public final boolean a(xo2 xo2Var) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            if (!xt6.e(new File(e(xo2Var.N().U()), "pcbc"), xo2Var.O().j())) {
                i(4020, currentTimeMillis);
                return false;
            }
            String f2 = f(xo2Var);
            SharedPreferences.Editor edit = this.b.edit();
            edit.putString(h(), f2);
            boolean commit = edit.commit();
            if (commit) {
                i(5015, currentTimeMillis);
            } else {
                i(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    public final boolean b(xo2 xo2Var, au6 au6Var) {
        File[] listFiles;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            ap2 k = k(1);
            String U = xo2Var.N().U();
            if (k != null && k.U().equals(U)) {
                i(4014, currentTimeMillis);
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            File e = e(U);
            if (e.exists()) {
                j(4023, currentTimeMillis2, "d:" + (true != e.isDirectory() ? "0" : "1") + ",f:" + (true != e.isFile() ? "0" : "1"));
                i(4015, currentTimeMillis2);
            } else if (!e.mkdirs()) {
                j(4024, currentTimeMillis2, "cw:".concat(true != e.canWrite() ? "0" : "1"));
                i(4015, currentTimeMillis2);
                return false;
            }
            File e2 = e(U);
            File file = new File(e2, "pcam.jar");
            File file2 = new File(e2, "pcbc");
            if (!xt6.e(file, xo2Var.P().j())) {
                i(4016, currentTimeMillis);
                return false;
            } else if (!xt6.e(file2, xo2Var.O().j())) {
                i(4017, currentTimeMillis);
                return false;
            } else if (au6Var != null && !au6Var.a(file)) {
                i(4018, currentTimeMillis);
                xt6.d(e2);
                return false;
            } else {
                String f2 = f(xo2Var);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = this.b.getString(h(), null);
                SharedPreferences.Editor edit = this.b.edit();
                edit.putString(h(), f2);
                if (string != null) {
                    edit.putString(g(), string);
                }
                if (!edit.commit()) {
                    i(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                ap2 k2 = k(1);
                if (k2 != null) {
                    hashSet.add(k2.U());
                }
                ap2 k3 = k(2);
                if (k3 != null) {
                    hashSet.add(k3.U());
                }
                for (File file3 : new File(this.a.getDir("pccache", 0), this.c).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        xt6.d(file3);
                    }
                }
                i(5014, currentTimeMillis);
                return true;
            }
        }
    }

    public final vt6 c(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            ap2 k = k(1);
            if (k == null) {
                i(4022, currentTimeMillis);
                return null;
            }
            File e = e(k.U());
            File file = new File(e, "pcam.jar");
            if (!file.exists()) {
                file = new File(e, "pcam");
            }
            File file2 = new File(e, "pcbc");
            File file3 = new File(e, "pcopt");
            i(5016, currentTimeMillis);
            return new vt6(k, file, file2, file3);
        }
    }

    public final boolean d(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            ap2 k = k(1);
            if (k == null) {
                i(4025, currentTimeMillis);
                return false;
            }
            File e = e(k.U());
            if (!new File(e, "pcam.jar").exists()) {
                i(4026, currentTimeMillis);
                return false;
            } else if (new File(e, "pcbc").exists()) {
                i(5019, currentTimeMillis);
                return true;
            } else {
                i(4027, currentTimeMillis);
                return false;
            }
        }
    }

    public final File e(String str) {
        return new File(new File(this.a.getDir("pccache", 0), this.c), str);
    }

    public final String g() {
        return "FBAMTD".concat(String.valueOf(this.c));
    }

    public final String h() {
        return "LATMTD".concat(String.valueOf(this.c));
    }

    public final void i(int i, long j) {
        nt6 nt6Var = this.d;
        if (nt6Var != null) {
            nt6Var.b(i, j);
        }
    }

    public final void j(int i, long j, String str) {
        nt6 nt6Var = this.d;
        if (nt6Var != null) {
            nt6Var.a(i, j, str);
        }
    }

    public final ap2 k(int i) {
        SharedPreferences sharedPreferences;
        String g;
        int i2;
        if (i == 1) {
            sharedPreferences = this.b;
            g = h();
        } else {
            sharedPreferences = this.b;
            g = g();
        }
        String string = sharedPreferences.getString(g, null);
        if (string == null) {
            return null;
        }
        try {
            return ap2.S(yq7.F(db0.c(string)), this.e ? vr7.a() : vr7.b());
        } catch (xs7 unused) {
            return null;
        } catch (NullPointerException unused2) {
            i2 = 2029;
            i(i2, System.currentTimeMillis());
            return null;
        } catch (RuntimeException unused3) {
            i2 = 2032;
            i(i2, System.currentTimeMillis());
            return null;
        }
    }
}
