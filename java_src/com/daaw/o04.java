package com.daaw;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* loaded from: classes.dex */
public final class o04 {
    public static Context a(Context context) {
        return c(context).b();
    }

    public static Object b(Context context, String str, m04 m04Var) {
        try {
            return m04Var.zza(c(context).d(str));
        } catch (Exception e) {
            throw new n04(e);
        }
    }

    public static DynamiteModule c(Context context) {
        try {
            return DynamiteModule.e(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new n04(e);
        }
    }
}
