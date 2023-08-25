package com.daaw;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
/* loaded from: classes.dex */
public class iv0 {

    /* renamed from: a */
    public final Context f14023a;

    public iv0(Context context) {
        this.f14023a = context;
    }

    /* renamed from: a */
    public int m19346a(String str) {
        return this.f14023a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int m19345b(String str, String str2) {
        return this.f14023a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: c */
    public ApplicationInfo m19344c(String str, int i) {
        return this.f14023a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: d */
    public CharSequence m19343d(String str) {
        return this.f14023a.getPackageManager().getApplicationLabel(this.f14023a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: e */
    public ov0<CharSequence, Drawable> m19342e(String str) {
        ApplicationInfo applicationInfo = this.f14023a.getPackageManager().getApplicationInfo(str, 0);
        return ov0.m13911a(this.f14023a.getPackageManager().getApplicationLabel(applicationInfo), this.f14023a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    /* renamed from: f */
    public PackageInfo m19341f(String str, int i) {
        return this.f14023a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: g */
    public boolean m19340g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return lg0.m16965a(this.f14023a);
        }
        if (!vw0.m6696i() || (nameForUid = this.f14023a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f14023a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    /* renamed from: h */
    public final boolean m19339h(int i, String str) {
        if (vw0.m6701d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f14023a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f14023a.getPackageManager().getPackagesForUid(i);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
