package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class qu3 {
    public int A;
    public final String B;
    public boolean C;
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public String g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public double m;
    public boolean n;
    public String o;
    public String p;
    public final boolean q;
    public final boolean r;
    public final String s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final String w;
    public final String x;
    public float y;
    public int z;

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)(1:34)|4|(1:6)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:23|24)(1:22)))|9|10|11|12|(0)|16|(1:18)(3:20|23|24)) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[Catch: Exception -> 0x00b1, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b1, blocks: (B:20:0x008c, B:22:0x009a), top: B:36:0x008c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qu3(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            com.daaw.g93.c(r7)
            r6.c(r7)
            r6.e(r7)
            r6.d(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = b(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
            r6.q = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = b(r0, r2)
            if (r2 == 0) goto L2f
            goto L30
        L2f:
            r3 = 0
        L30:
            r6.r = r3
            java.lang.String r2 = r1.getCountry()
            r6.s = r2
            com.google.android.gms.ads.internal.zzt.zzp()
            com.google.android.gms.ads.internal.client.zzay.zzb()
            boolean r2 = com.daaw.d04.x()
            r6.t = r2
            boolean r2 = com.daaw.nt.c(r7)
            r6.u = r2
            boolean r2 = com.daaw.nt.d(r7)
            r6.v = r2
            java.lang.String r1 = r1.getLanguage()
            r6.w = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = b(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L63
        L61:
            r0 = r2
            goto L8a
        L63:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L68
            goto L61
        L68:
            com.daaw.iv0 r3 = com.daaw.ez1.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r5 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.content.pm.PackageInfo r3 = r3.f(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            if (r3 == 0) goto L61
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r0 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
        L8a:
            r6.x = r0
            com.daaw.iv0 r0 = com.daaw.ez1.a(r7)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r0.f(r3, r4)     // Catch: java.lang.Exception -> Lb1
            if (r0 == 0) goto Lb2
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Lb1
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Lb1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb1
            r4.<init>()     // Catch: java.lang.Exception -> Lb1
            r4.append(r3)     // Catch: java.lang.Exception -> Lb1
            r4.append(r1)     // Catch: java.lang.Exception -> Lb1
            r4.append(r0)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Lb1
            goto Lb2
        Lb1:
        Lb2:
            r6.B = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto Lbb
            return
        Lbb:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 != 0) goto Lc2
            return
        Lc2:
            float r0 = r7.density
            r6.y = r0
            int r0 = r7.widthPixels
            r6.z = r0
            int r7 = r7.heightPixels
            r6.A = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.qu3.<init>(android.content.Context):void");
    }

    public qu3(Context context, ru3 ru3Var) {
        g93.c(context);
        c(context);
        e(context);
        d(context);
        this.o = Build.FINGERPRINT;
        this.p = Build.DEVICE;
        this.C = ia3.g(context);
        this.q = ru3Var.a;
        this.r = ru3Var.b;
        this.s = ru3Var.d;
        this.t = ru3Var.e;
        this.u = ru3Var.f;
        this.v = ru3Var.g;
        this.w = ru3Var.h;
        this.x = ru3Var.i;
        this.B = ru3Var.j;
        this.y = ru3Var.m;
        this.z = ru3Var.n;
        this.A = ru3Var.o;
    }

    public static ResolveInfo b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            zzt.zzo().u(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    public final ru3 a() {
        return new ru3(this.a, this.q, this.r, this.g, this.s, this.t, this.u, this.v, this.b, this.c, this.w, this.x, this.B, this.d, this.h, this.i, this.j, this.e, this.f, this.y, this.z, this.A, this.m, this.n, this.k, this.l, this.o, this.C, this.p);
    }

    public final void c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.a = audioManager.getMode();
                this.b = audioManager.isMusicActive();
                this.c = audioManager.isSpeakerphoneOn();
                this.d = audioManager.getStreamVolume(3);
                this.e = audioManager.getRingerMode();
                this.f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                zzt.zzo().u(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.a = -2;
        this.b = false;
        this.c = false;
        this.d = 0;
        this.e = 2;
        this.f = 0;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = (!((Boolean) zzba.zzc().b(g93.e9)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        boolean z = false;
        if (registerReceiver == null) {
            this.m = -1.0d;
            this.n = false;
            return;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        this.m = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        this.n = (intExtra == 2 || intExtra == 5) ? true : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.g = r2
            boolean r2 = com.daaw.vw0.k()
            r3 = 0
            if (r2 == 0) goto L31
            com.daaw.y83 r2 = com.daaw.g93.F7
            com.daaw.e93 r4 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r4.b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L31
            r2 = 0
            goto L35
        L31:
            int r2 = r0.getNetworkType()
        L35:
            r5.i = r2
            int r0 = r0.getPhoneType()
            r5.j = r0
            r0 = -2
            r5.h = r0
            r5.k = r3
            r0 = -1
            r5.l = r0
            com.google.android.gms.ads.internal.zzt.zzp()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = com.google.android.gms.ads.internal.util.zzs.zzx(r6, r2)
            if (r6 == 0) goto L6f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L67
            int r0 = r6.getType()
            r5.h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.l = r6
            goto L69
        L67:
            r5.h = r0
        L69:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.k = r6
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.qu3.e(android.content.Context):void");
    }
}
