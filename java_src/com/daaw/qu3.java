package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Locale;
/* loaded from: classes.dex */
public final class qu3 {

    /* renamed from: A */
    public int f24366A;

    /* renamed from: B */
    public final String f24367B;

    /* renamed from: C */
    public boolean f24368C;

    /* renamed from: a */
    public int f24369a;

    /* renamed from: b */
    public boolean f24370b;

    /* renamed from: c */
    public boolean f24371c;

    /* renamed from: d */
    public int f24372d;

    /* renamed from: e */
    public int f24373e;

    /* renamed from: f */
    public int f24374f;

    /* renamed from: g */
    public String f24375g;

    /* renamed from: h */
    public int f24376h;

    /* renamed from: i */
    public int f24377i;

    /* renamed from: j */
    public int f24378j;

    /* renamed from: k */
    public boolean f24379k;

    /* renamed from: l */
    public int f24380l;

    /* renamed from: m */
    public double f24381m;

    /* renamed from: n */
    public boolean f24382n;

    /* renamed from: o */
    public String f24383o;

    /* renamed from: p */
    public String f24384p;

    /* renamed from: q */
    public final boolean f24385q;

    /* renamed from: r */
    public final boolean f24386r;

    /* renamed from: s */
    public final String f24387s;

    /* renamed from: t */
    public final boolean f24388t;

    /* renamed from: u */
    public final boolean f24389u;

    /* renamed from: v */
    public final boolean f24390v;

    /* renamed from: w */
    public final String f24391w;

    /* renamed from: x */
    public final String f24392x;

    /* renamed from: y */
    public float f24393y;

    /* renamed from: z */
    public int f24394z;

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)(1:34)|4|(1:6)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:23|24)(1:22)))|9|10|11|12|(0)|16|(1:18)(3:20|23|24)) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[Catch: Exception -> 0x00b1, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b1, blocks: (B:20:0x008c, B:22:0x009a), top: B:36:0x008c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qu3(Context context) {
        ActivityInfo activityInfo;
        PackageInfo m19341f;
        String str;
        Resources resources;
        DisplayMetrics displayMetrics;
        PackageInfo m19341f2;
        PackageManager packageManager = context.getPackageManager();
        g93.m21879c(context);
        m12205c(context);
        m12203e(context);
        m12204d(context);
        Locale locale = Locale.getDefault();
        this.f24385q = m12206b(packageManager, "geo:0,0?q=donuts") != null;
        this.f24386r = m12206b(packageManager, "http://www.google.com") != null;
        this.f24387s = locale.getCountry();
        zzt.zzp();
        zzay.zzb();
        this.f24388t = d04.m24808x();
        this.f24389u = C2365nt.m14838c(context);
        this.f24390v = C2365nt.m14837d(context);
        this.f24391w = locale.getLanguage();
        ResolveInfo m12206b = m12206b(packageManager, "market://details?id=com.google.android.gms.ads");
        String str2 = null;
        if (m12206b != null && (activityInfo = m12206b.activityInfo) != null) {
            try {
                m19341f = ez1.m22979a(context).m19341f(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (m19341f != null) {
                str = m19341f.versionCode + "." + activityInfo.packageName;
                this.f24392x = str;
                m19341f2 = ez1.m22979a(context).m19341f("com.android.vending", 128);
                if (m19341f2 != null) {
                    str2 = m19341f2.versionCode + "." + m19341f2.packageName;
                }
                this.f24367B = str2;
                resources = context.getResources();
                if (resources == null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    this.f24393y = displayMetrics.density;
                    this.f24394z = displayMetrics.widthPixels;
                    this.f24366A = displayMetrics.heightPixels;
                }
                return;
            }
        }
        str = null;
        this.f24392x = str;
        m19341f2 = ez1.m22979a(context).m19341f("com.android.vending", 128);
        if (m19341f2 != null) {
        }
        this.f24367B = str2;
        resources = context.getResources();
        if (resources == null) {
            return;
        }
        this.f24393y = displayMetrics.density;
        this.f24394z = displayMetrics.widthPixels;
        this.f24366A = displayMetrics.heightPixels;
    }

    public qu3(Context context, ru3 ru3Var) {
        g93.m21879c(context);
        m12205c(context);
        m12203e(context);
        m12204d(context);
        this.f24383o = Build.FINGERPRINT;
        this.f24384p = Build.DEVICE;
        this.f24368C = ia3.m20002g(context);
        this.f24385q = ru3Var.f25611a;
        this.f24386r = ru3Var.f25612b;
        this.f24387s = ru3Var.f25614d;
        this.f24388t = ru3Var.f25615e;
        this.f24389u = ru3Var.f25616f;
        this.f24390v = ru3Var.f25617g;
        this.f24391w = ru3Var.f25618h;
        this.f24392x = ru3Var.f25619i;
        this.f24367B = ru3Var.f25620j;
        this.f24393y = ru3Var.f25623m;
        this.f24394z = ru3Var.f25624n;
        this.f24366A = ru3Var.f25625o;
    }

    /* renamed from: b */
    public static ResolveInfo m12206b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            zzt.zzo().m11902u(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* renamed from: a */
    public final ru3 m12207a() {
        return new ru3(this.f24369a, this.f24385q, this.f24386r, this.f24375g, this.f24387s, this.f24388t, this.f24389u, this.f24390v, this.f24370b, this.f24371c, this.f24391w, this.f24392x, this.f24367B, this.f24372d, this.f24376h, this.f24377i, this.f24378j, this.f24373e, this.f24374f, this.f24393y, this.f24394z, this.f24366A, this.f24381m, this.f24382n, this.f24379k, this.f24380l, this.f24383o, this.f24368C, this.f24384p);
    }

    /* renamed from: c */
    public final void m12205c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f24369a = audioManager.getMode();
                this.f24370b = audioManager.isMusicActive();
                this.f24371c = audioManager.isSpeakerphoneOn();
                this.f24372d = audioManager.getStreamVolume(3);
                this.f24373e = audioManager.getRingerMode();
                this.f24374f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                zzt.zzo().m11902u(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f24369a = -2;
        this.f24370b = false;
        this.f24371c = false;
        this.f24372d = 0;
        this.f24373e = 2;
        this.f24374f = 0;
    }

    @SuppressLint({"UnprotectedReceiver"})
    /* renamed from: d */
    public final void m12204d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = (!((Boolean) zzba.zzc().m23658b(g93.f10675e9)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        boolean z = false;
        if (registerReceiver == null) {
            this.f24381m = -1.0d;
            this.f24382n = false;
            return;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        this.f24381m = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        this.f24382n = (intExtra == 2 || intExtra == 5) ? true : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m12203e(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f24375g = telephonyManager.getNetworkOperator();
        if (vw0.m6694k()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10419F7)).booleanValue()) {
                networkType = 0;
                this.f24377i = networkType;
                this.f24378j = telephonyManager.getPhoneType();
                this.f24376h = -2;
                this.f24379k = false;
                this.f24380l = -1;
                zzt.zzp();
                if (zzs.zzx(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    return;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    this.f24376h = activeNetworkInfo.getType();
                    this.f24380l = activeNetworkInfo.getDetailedState().ordinal();
                } else {
                    this.f24376h = -1;
                }
                this.f24379k = connectivityManager.isActiveNetworkMetered();
                return;
            }
        }
        networkType = telephonyManager.getNetworkType();
        this.f24377i = networkType;
        this.f24378j = telephonyManager.getPhoneType();
        this.f24376h = -2;
        this.f24379k = false;
        this.f24380l = -1;
        zzt.zzp();
        if (zzs.zzx(context, "android.permission.ACCESS_NETWORK_STATE")) {
        }
    }
}
