package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class bu6 {

    /* renamed from: f */
    public static final Object f5188f = new Object();

    /* renamed from: a */
    public final Context f5189a;

    /* renamed from: b */
    public final SharedPreferences f5190b;

    /* renamed from: c */
    public final String f5191c;

    /* renamed from: d */
    public final nt6 f5192d;

    /* renamed from: e */
    public boolean f5193e;

    public bu6(Context context, int i, nt6 nt6Var, boolean z) {
        this.f5193e = false;
        this.f5189a = context;
        this.f5191c = Integer.toString(i - 1);
        this.f5190b = context.getSharedPreferences("pcvmspf", 0);
        this.f5192d = nt6Var;
        this.f5193e = z;
    }

    /* renamed from: f */
    public static String m25819f(xo2 xo2Var) {
        zo2 m27262O = ap2.m27262O();
        m27262O.m2040w(xo2Var.m4880N().m27256U());
        m27262O.m2044s(xo2Var.m4880N().m27257T());
        m27262O.m2043t(xo2Var.m4880N().m27265L());
        m27262O.m2041v(xo2Var.m4880N().m27263N());
        m27262O.m2042u(xo2Var.m4880N().m27264M());
        return db0.m24574a(((ap2) m27262O.m22315n()).mo4516a());
    }

    /* renamed from: a */
    public final boolean m25824a(xo2 xo2Var) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f5188f) {
            if (!xt6.m4517e(new File(m25820e(xo2Var.m4880N().m27256U()), "pcbc"), xo2Var.m4879O().m3415j())) {
                m25816i(4020, currentTimeMillis);
                return false;
            }
            String m25819f = m25819f(xo2Var);
            SharedPreferences.Editor edit = this.f5190b.edit();
            edit.putString(m25817h(), m25819f);
            boolean commit = edit.commit();
            if (commit) {
                m25816i(5015, currentTimeMillis);
            } else {
                m25816i(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    /* renamed from: b */
    public final boolean m25823b(xo2 xo2Var, au6 au6Var) {
        File[] listFiles;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f5188f) {
            ap2 m25814k = m25814k(1);
            String m27256U = xo2Var.m4880N().m27256U();
            if (m25814k != null && m25814k.m27256U().equals(m27256U)) {
                m25816i(4014, currentTimeMillis);
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            File m25820e = m25820e(m27256U);
            if (m25820e.exists()) {
                m25815j(4023, currentTimeMillis2, "d:" + (true != m25820e.isDirectory() ? "0" : "1") + ",f:" + (true != m25820e.isFile() ? "0" : "1"));
                m25816i(4015, currentTimeMillis2);
            } else if (!m25820e.mkdirs()) {
                m25815j(4024, currentTimeMillis2, "cw:".concat(true != m25820e.canWrite() ? "0" : "1"));
                m25816i(4015, currentTimeMillis2);
                return false;
            }
            File m25820e2 = m25820e(m27256U);
            File file = new File(m25820e2, "pcam.jar");
            File file2 = new File(m25820e2, "pcbc");
            if (!xt6.m4517e(file, xo2Var.m4878P().m3415j())) {
                m25816i(4016, currentTimeMillis);
                return false;
            } else if (!xt6.m4517e(file2, xo2Var.m4879O().m3415j())) {
                m25816i(4017, currentTimeMillis);
                return false;
            } else if (au6Var != null && !au6Var.mo18435a(file)) {
                m25816i(4018, currentTimeMillis);
                xt6.m4518d(m25820e2);
                return false;
            } else {
                String m25819f = m25819f(xo2Var);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = this.f5190b.getString(m25817h(), null);
                SharedPreferences.Editor edit = this.f5190b.edit();
                edit.putString(m25817h(), m25819f);
                if (string != null) {
                    edit.putString(m25818g(), string);
                }
                if (!edit.commit()) {
                    m25816i(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                ap2 m25814k2 = m25814k(1);
                if (m25814k2 != null) {
                    hashSet.add(m25814k2.m27256U());
                }
                ap2 m25814k3 = m25814k(2);
                if (m25814k3 != null) {
                    hashSet.add(m25814k3.m27256U());
                }
                for (File file3 : new File(this.f5189a.getDir("pccache", 0), this.f5191c).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        xt6.m4518d(file3);
                    }
                }
                m25816i(5014, currentTimeMillis);
                return true;
            }
        }
    }

    /* renamed from: c */
    public final vt6 m25822c(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f5188f) {
            ap2 m25814k = m25814k(1);
            if (m25814k == null) {
                m25816i(4022, currentTimeMillis);
                return null;
            }
            File m25820e = m25820e(m25814k.m27256U());
            File file = new File(m25820e, "pcam.jar");
            if (!file.exists()) {
                file = new File(m25820e, "pcam");
            }
            File file2 = new File(m25820e, "pcbc");
            File file3 = new File(m25820e, "pcopt");
            m25816i(5016, currentTimeMillis);
            return new vt6(m25814k, file, file2, file3);
        }
    }

    /* renamed from: d */
    public final boolean m25821d(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f5188f) {
            ap2 m25814k = m25814k(1);
            if (m25814k == null) {
                m25816i(4025, currentTimeMillis);
                return false;
            }
            File m25820e = m25820e(m25814k.m27256U());
            if (!new File(m25820e, "pcam.jar").exists()) {
                m25816i(4026, currentTimeMillis);
                return false;
            } else if (new File(m25820e, "pcbc").exists()) {
                m25816i(5019, currentTimeMillis);
                return true;
            } else {
                m25816i(4027, currentTimeMillis);
                return false;
            }
        }
    }

    /* renamed from: e */
    public final File m25820e(String str) {
        return new File(new File(this.f5189a.getDir("pccache", 0), this.f5191c), str);
    }

    /* renamed from: g */
    public final String m25818g() {
        return "FBAMTD".concat(String.valueOf(this.f5191c));
    }

    /* renamed from: h */
    public final String m25817h() {
        return "LATMTD".concat(String.valueOf(this.f5191c));
    }

    /* renamed from: i */
    public final void m25816i(int i, long j) {
        nt6 nt6Var = this.f5192d;
        if (nt6Var != null) {
            nt6Var.mo9846b(i, j);
        }
    }

    /* renamed from: j */
    public final void m25815j(int i, long j, String str) {
        nt6 nt6Var = this.f5192d;
        if (nt6Var != null) {
            nt6Var.mo9847a(i, j, str);
        }
    }

    /* renamed from: k */
    public final ap2 m25814k(int i) {
        SharedPreferences sharedPreferences;
        String m25818g;
        int i2;
        if (i == 1) {
            sharedPreferences = this.f5190b;
            m25818g = m25817h();
        } else {
            sharedPreferences = this.f5190b;
            m25818g = m25818g();
        }
        String string = sharedPreferences.getString(m25818g, null);
        if (string == null) {
            return null;
        }
        try {
            return ap2.m27258S(yq7.m3424F(db0.m24572c(string)), this.f5193e ? vr7.m6834a() : vr7.m6833b());
        } catch (xs7 unused) {
            return null;
        } catch (NullPointerException unused2) {
            i2 = 2029;
            m25816i(i2, System.currentTimeMillis());
            return null;
        } catch (RuntimeException unused3) {
            i2 = 2032;
            m25816i(i2, System.currentTimeMillis());
            return null;
        }
    }
}
