package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.errorprone.annotations.RestrictedInheritance;
import javax.annotation.Nullable;
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public class d80 {
    @Nullable

    /* renamed from: c */
    public static d80 f6601c;

    /* renamed from: a */
    public final Context f6602a;

    /* renamed from: b */
    public volatile String f6603b;

    public d80(Context context) {
        this.f6602a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static d80 m24607a(Context context) {
        ry0.m10830j(context);
        synchronized (d80.class) {
            if (f6601c == null) {
                qh8.m12511d(context);
                f6601c = new d80(context);
            }
        }
        return f6601c;
    }

    @Nullable
    /* renamed from: d */
    public static final l68 m24604d(PackageInfo packageInfo, l68... l68VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            m98 m98Var = new m98(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < l68VarArr.length; i++) {
                if (l68VarArr[i].equals(m98Var)) {
                    return l68VarArr[i];
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m24603e(PackageInfo packageInfo, boolean z) {
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? m24604d(packageInfo, df8.f7041a) : m24604d(packageInfo, df8.f7041a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m24606b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m24603e(packageInfo, false)) {
            return true;
        }
        return m24603e(packageInfo, true) && c80.m25523e(this.f6602a);
    }

    /* renamed from: c */
    public boolean m24605c(int i) {
        fx8 m22143c;
        int length;
        String[] packagesForUid = this.f6602a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            m22143c = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    ry0.m10830j(m22143c);
                    break;
                }
                m22143c = m24602f(packagesForUid[i2], false, false);
                if (m22143c.f10086a) {
                    break;
                }
                i2++;
            }
        } else {
            m22143c = fx8.m22143c("no pkgs");
        }
        m22143c.m22141e();
        return m22143c.f10086a;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: f */
    public final fx8 m24602f(String str, boolean z, boolean z2) {
        fx8 fx8Var;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return fx8.m22143c("null pkg");
        }
        if (str.equals(this.f6603b)) {
            return fx8.m22144b();
        }
        if (qh8.m12510e()) {
            fx8Var = qh8.m12513b(str, c80.m25523e(this.f6602a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f6602a.getPackageManager().getPackageInfo(str, 64);
                boolean m25523e = c80.m25523e(this.f6602a);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        m98 m98Var = new m98(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        fx8 m12514a = qh8.m12514a(str3, m98Var, m25523e, false);
                        if (!m12514a.f10086a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !qh8.m12514a(str3, m98Var, false, true).f10086a) {
                            fx8Var = m12514a;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                }
                fx8Var = fx8.m22143c(str2);
            } catch (PackageManager.NameNotFoundException e) {
                return fx8.m22142d("no pkg ".concat(str), e);
            }
        }
        if (fx8Var.f10086a) {
            this.f6603b = str;
        }
        return fx8Var;
    }
}
