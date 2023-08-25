package com.daaw;

import android.content.Context;
import android.content.pm.PackageInfo;
/* renamed from: com.daaw.a5 */
/* loaded from: classes2.dex */
public class C0602a5 {

    /* renamed from: a */
    public final String f2887a;

    /* renamed from: b */
    public final String f2888b;

    /* renamed from: c */
    public final String f2889c;

    /* renamed from: d */
    public final String f2890d;

    /* renamed from: e */
    public final String f2891e;

    /* renamed from: f */
    public final String f2892f;

    /* renamed from: g */
    public final C2209mt f2893g;

    public C0602a5(String str, String str2, String str3, String str4, String str5, String str6, C2209mt c2209mt) {
        this.f2887a = str;
        this.f2888b = str2;
        this.f2889c = str3;
        this.f2890d = str4;
        this.f2891e = str5;
        this.f2892f = str6;
        this.f2893g = c2209mt;
    }

    /* renamed from: a */
    public static C0602a5 m27610a(Context context, ue0 ue0Var, String str, String str2, C2209mt c2209mt) {
        String packageName = context.getPackageName();
        String m8298g = ue0Var.m8298g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C0602a5(str, str2, m8298g, packageName, num, str3, c2209mt);
    }
}
