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
    public static d80 c;
    public final Context a;
    public volatile String b;

    public d80(Context context) {
        this.a = context.getApplicationContext();
    }

    public static d80 a(Context context) {
        ry0.j(context);
        synchronized (d80.class) {
            if (c == null) {
                qh8.d(context);
                c = new d80(context);
            }
        }
        return c;
    }

    @Nullable
    public static final l68 d(PackageInfo packageInfo, l68... l68VarArr) {
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

    public static final boolean e(PackageInfo packageInfo, boolean z) {
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? d(packageInfo, df8.a) : d(packageInfo, df8.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        return e(packageInfo, true) && c80.e(this.a);
    }

    public boolean c(int i) {
        fx8 c2;
        int length;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c2 = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    ry0.j(c2);
                    break;
                }
                c2 = f(packagesForUid[i2], false, false);
                if (c2.a) {
                    break;
                }
                i2++;
            }
        } else {
            c2 = fx8.c("no pkgs");
        }
        c2.e();
        return c2.a;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public final fx8 f(String str, boolean z, boolean z2) {
        fx8 fx8Var;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return fx8.c("null pkg");
        }
        if (str.equals(this.b)) {
            return fx8.b();
        }
        if (qh8.e()) {
            fx8Var = qh8.b(str, c80.e(this.a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 64);
                boolean e = c80.e(this.a);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        m98 m98Var = new m98(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        fx8 a = qh8.a(str3, m98Var, e, false);
                        if (!a.a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !qh8.a(str3, m98Var, false, true).a) {
                            fx8Var = a;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                }
                fx8Var = fx8.c(str2);
            } catch (PackageManager.NameNotFoundException e2) {
                return fx8.d("no pkg ".concat(str), e2);
            }
        }
        if (fx8Var.a) {
            this.b = str;
        }
        return fx8Var;
    }
}
