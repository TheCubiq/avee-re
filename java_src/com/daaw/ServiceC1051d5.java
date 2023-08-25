package com.daaw;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.IBinder;
/* renamed from: com.daaw.d5 */
/* loaded from: classes.dex */
public final class ServiceC1051d5 extends Service {

    /* renamed from: com.daaw.d5$a */
    /* loaded from: classes.dex */
    public static class C1052a {
        /* renamed from: a */
        public static int m24642a() {
            return 512;
        }
    }

    /* renamed from: a */
    public static ServiceInfo m24643a(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, ServiceC1051d5.class), Build.VERSION.SDK_INT >= 24 ? C1052a.m24642a() | 128 : 640);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
