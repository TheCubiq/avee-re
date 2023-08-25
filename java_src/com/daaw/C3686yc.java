package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
/* renamed from: com.daaw.yc */
/* loaded from: classes.dex */
public final class C3686yc {

    /* renamed from: com.daaw.yc$a */
    /* loaded from: classes.dex */
    public static class C3687a {
        /* renamed from: a */
        public static IBinder m3871a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        /* renamed from: b */
        public static void m3870b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* renamed from: a */
    public static IBinder m3873a(Bundle bundle, String str) {
        return C3687a.m3871a(bundle, str);
    }

    /* renamed from: b */
    public static void m3872b(Bundle bundle, String str, IBinder iBinder) {
        C3687a.m3870b(bundle, str, iBinder);
    }
}
