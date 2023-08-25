package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
/* loaded from: classes.dex */
public final class yc {

    /* loaded from: classes.dex */
    public static class a {
        public static IBinder a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    public static IBinder a(Bundle bundle, String str) {
        return a.a(bundle, str);
    }

    public static void b(Bundle bundle, String str, IBinder iBinder) {
        a.b(bundle, str, iBinder);
    }
}
