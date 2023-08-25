package com.daaw;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
/* loaded from: classes2.dex */
public final class q18 {

    /* renamed from: a */
    public static volatile y38 f23612a = y38.m4137c();

    /* renamed from: b */
    public static final Object f23613b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(10:18|(1:20)(7:32|(1:34)(1:40)|35|(2:37|(1:39))|27|28|29)|21|22|23|24|(1:26)|27|28|29) */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m12802a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (!f23612a.mo4138b()) {
            synchronized (f23613b) {
                if (f23612a.mo4138b()) {
                    return ((Boolean) f23612a.mo4139a()).booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (resolveContentProvider != null) {
                        if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        }
                    }
                    f23612a = y38.m4136d(Boolean.valueOf(z));
                }
                if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                    z = true;
                }
                f23612a = y38.m4136d(Boolean.valueOf(z));
            }
        }
        return ((Boolean) f23612a.mo4139a()).booleanValue();
    }
}
