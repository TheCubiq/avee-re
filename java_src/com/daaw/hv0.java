package com.daaw;

import android.content.ComponentName;
import android.content.Context;
/* loaded from: classes.dex */
public class hv0 {

    /* renamed from: a */
    public static final String f13014a = ll0.m16883f("PackageManagerHelper");

    /* renamed from: a */
    public static void m20390a(Context context, Class<?> cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            ll0 m16885c = ll0.m16885c();
            String str = f13014a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? "enabled" : "disabled";
            m16885c.mo16882a(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            ll0 m16885c2 = ll0.m16885c();
            String str2 = f13014a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z ? "enabled" : "disabled";
            m16885c2.mo16882a(str2, String.format("%s could not be %s", objArr2), e);
        }
    }
}
