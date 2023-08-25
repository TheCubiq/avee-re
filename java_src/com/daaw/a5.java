package com.daaw;

import android.content.Context;
import android.content.pm.PackageInfo;
/* loaded from: classes2.dex */
public class a5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final mt g;

    public a5(String str, String str2, String str3, String str4, String str5, String str6, mt mtVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = mtVar;
    }

    public static a5 a(Context context, ue0 ue0Var, String str, String str2, mt mtVar) {
        String packageName = context.getPackageName();
        String g = ue0Var.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a5(str, str2, g, packageName, num, str3, mtVar);
    }
}
