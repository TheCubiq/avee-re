package com.daaw;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* loaded from: classes.dex */
public final class o04 {
    /* renamed from: a */
    public static Context m14657a(Context context) {
        return m14655c(context).m1148b();
    }

    /* renamed from: b */
    public static Object m14656b(Context context, String str, m04 m04Var) {
        try {
            return m04Var.zza(m14655c(context).m1146d(str));
        } catch (Exception e) {
            throw new n04(e);
        }
    }

    /* renamed from: c */
    public static DynamiteModule m14655c(Context context) {
        try {
            return DynamiteModule.m1145e(context, DynamiteModule.f36678b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new n04(e);
        }
    }
}
