package com.daaw;

import android.os.Binder;
/* loaded from: classes2.dex */
public final /* synthetic */ class v08 {
    public static Object a(y08 y08Var) {
        try {
            return y08Var.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return y08Var.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
