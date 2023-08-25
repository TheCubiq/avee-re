package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class wt6 {

    /* renamed from: a */
    public final File f31507a;

    /* renamed from: b */
    public final File f31508b;

    /* renamed from: c */
    public final SharedPreferences f31509c;

    /* renamed from: d */
    public final int f31510d;

    public wt6(Context context, int i) {
        this.f31509c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        xt6.m4521a(dir, false);
        this.f31507a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        xt6.m4521a(dir2, true);
        this.f31508b = dir2;
        this.f31510d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5809a(xo2 xo2Var, au6 au6Var) {
        boolean z;
        ap2 m5808b;
        ap2 m5808b2;
        String m27256U = xo2Var.m4880N().m27256U();
        byte[] m3415j = xo2Var.m4878P().m3415j();
        byte[] m3415j2 = xo2Var.m4879O().m3415j();
        if (!TextUtils.isEmpty(m27256U) && m3415j2 != null && m3415j2.length != 0) {
            xt6.m4518d(this.f31508b);
            this.f31508b.mkdirs();
            xt6.m4519c(m27256U, this.f31508b).mkdirs();
            File m4520b = xt6.m4520b(m27256U, "pcam.jar", this.f31508b);
            if ((m3415j == null || m3415j.length <= 0 || xt6.m4517e(m4520b, m3415j)) && xt6.m4517e(xt6.m4520b(m27256U, "pcbc", this.f31508b), m3415j2)) {
                File m4520b2 = xt6.m4520b(xo2Var.m4880N().m27256U(), "pcam.jar", this.f31508b);
                if (!m4520b2.exists() || au6Var == null || au6Var.mo18435a(m4520b2)) {
                    String m27256U2 = xo2Var.m4880N().m27256U();
                    if (!TextUtils.isEmpty(m27256U2)) {
                        File m4520b3 = xt6.m4520b(m27256U2, "pcam.jar", this.f31508b);
                        File m4520b4 = xt6.m4520b(m27256U2, "pcbc", this.f31508b);
                        File m4520b5 = xt6.m4520b(m27256U2, "pcam.jar", m5806d());
                        File m4520b6 = xt6.m4520b(m27256U2, "pcbc", m5806d());
                        if ((!m4520b3.exists() || m4520b3.renameTo(m4520b5)) && m4520b4.exists() && m4520b4.renameTo(m4520b6)) {
                            zo2 m27262O = ap2.m27262O();
                            m27262O.m2040w(xo2Var.m4880N().m27256U());
                            m27262O.m2044s(xo2Var.m4880N().m27257T());
                            m27262O.m2043t(xo2Var.m4880N().m27265L());
                            m27262O.m2041v(xo2Var.m4880N().m27263N());
                            m27262O.m2042u(xo2Var.m4880N().m27264M());
                            ap2 ap2Var = (ap2) m27262O.m22315n();
                            ap2 m5808b3 = m5808b(1);
                            SharedPreferences.Editor edit = this.f31509c.edit();
                            if (m5808b3 != null && !ap2Var.m27256U().equals(m5808b3.m27256U())) {
                                edit.putString(m5805e(), db0.m24574a(m5808b3.mo4516a()));
                            }
                            edit.putString(m5804f(), db0.m24574a(ap2Var.mo4516a()));
                            if (edit.commit()) {
                                z = true;
                                HashSet hashSet = new HashSet();
                                m5808b = m5808b(1);
                                if (m5808b != null) {
                                    hashSet.add(m5808b.m27256U());
                                }
                                m5808b2 = m5808b(2);
                                if (m5808b2 != null) {
                                    hashSet.add(m5808b2.m27256U());
                                }
                                for (File file : m5806d().listFiles()) {
                                    String name = file.getName();
                                    if (!hashSet.contains(name)) {
                                        xt6.m4518d(xt6.m4519c(name, m5806d()));
                                    }
                                }
                                return z;
                            }
                        }
                    }
                    z = false;
                    HashSet hashSet2 = new HashSet();
                    m5808b = m5808b(1);
                    if (m5808b != null) {
                    }
                    m5808b2 = m5808b(2);
                    if (m5808b2 != null) {
                    }
                    while (r4 < r1) {
                    }
                    return z;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final ap2 m5808b(int i) {
        SharedPreferences sharedPreferences;
        String m5805e;
        if (i == 1) {
            sharedPreferences = this.f31509c;
            m5805e = m5804f();
        } else {
            sharedPreferences = this.f31509c;
            m5805e = m5805e();
        }
        String string = sharedPreferences.getString(m5805e, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            ap2 m27259R = ap2.m27259R(yq7.m3424F(db0.m24572c(string)));
            String m27256U = m27259R.m27256U();
            File m4520b = xt6.m4520b(m27256U, "pcam.jar", m5806d());
            if (!m4520b.exists()) {
                m4520b = xt6.m4520b(m27256U, "pcam", m5806d());
            }
            File m4520b2 = xt6.m4520b(m27256U, "pcbc", m5806d());
            if (m4520b.exists()) {
                if (m4520b2.exists()) {
                    return m27259R;
                }
            }
        } catch (xs7 unused) {
        }
        return null;
    }

    /* renamed from: c */
    public final vt6 m5807c(int i) {
        ap2 m5808b = m5808b(1);
        if (m5808b == null) {
            return null;
        }
        String m27256U = m5808b.m27256U();
        File m4520b = xt6.m4520b(m27256U, "pcam.jar", m5806d());
        if (!m4520b.exists()) {
            m4520b = xt6.m4520b(m27256U, "pcam", m5806d());
        }
        return new vt6(m5808b, m4520b, xt6.m4520b(m27256U, "pcbc", m5806d()), xt6.m4520b(m27256U, "pcopt", m5806d()));
    }

    /* renamed from: d */
    public final File m5806d() {
        File file = new File(this.f31507a, Integer.toString(this.f31510d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: e */
    public final String m5805e() {
        int i = this.f31510d;
        StringBuilder sb = new StringBuilder();
        sb.append("FBAMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    /* renamed from: f */
    public final String m5804f() {
        int i = this.f31510d;
        StringBuilder sb = new StringBuilder();
        sb.append("LATMTD");
        sb.append(i - 1);
        return sb.toString();
    }
}
