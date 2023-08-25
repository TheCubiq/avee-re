package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class rz3 {

    /* renamed from: g */
    public final String f25723g;

    /* renamed from: h */
    public final zzg f25724h;

    /* renamed from: a */
    public long f25717a = -1;

    /* renamed from: b */
    public long f25718b = -1;
    @GuardedBy("lock")

    /* renamed from: c */
    public int f25719c = -1;

    /* renamed from: d */
    public int f25720d = -1;

    /* renamed from: e */
    public long f25721e = 0;

    /* renamed from: f */
    public final Object f25722f = new Object();
    @GuardedBy("lock")

    /* renamed from: i */
    public int f25725i = 0;
    @GuardedBy("lock")

    /* renamed from: j */
    public int f25726j = 0;

    public rz3(String str, zzg zzgVar) {
        this.f25723g = str;
        this.f25724h = zzgVar;
    }

    /* renamed from: a */
    public final Bundle m10821a(Context context, String str) {
        Bundle bundle;
        String str2;
        synchronized (this.f25722f) {
            bundle = new Bundle();
            if (!this.f25724h.zzP()) {
                bundle.putString("session_id", this.f25723g);
            }
            bundle.putLong("basets", this.f25718b);
            bundle.putLong("currts", this.f25717a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f25719c);
            bundle.putInt("preqs_in_session", this.f25720d);
            bundle.putLong("time_in_session", this.f25721e);
            bundle.putInt("pclick", this.f25725i);
            bundle.putInt("pimp", this.f25726j);
            Context m26956a = av3.m26956a(context);
            int identifier = m26956a.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z = false;
            if (identifier == 0) {
                str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
            } else {
                try {
                    if (identifier == m26956a.getPackageManager().getActivityInfo(new ComponentName(m26956a.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                        z = true;
                    } else {
                        k04.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    k04.zzj("Fail to fetch AdActivity theme");
                    str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
                }
                bundle.putBoolean("support_transparent_background", z);
            }
            k04.zzi(str2);
            bundle.putBoolean("support_transparent_background", z);
        }
        return bundle;
    }

    /* renamed from: b */
    public final void m10820b() {
        synchronized (this.f25722f) {
            this.f25725i++;
        }
    }

    /* renamed from: c */
    public final void m10819c() {
        synchronized (this.f25722f) {
            this.f25726j++;
        }
    }

    /* renamed from: d */
    public final void m10818d() {
        m10815g();
    }

    /* renamed from: e */
    public final void m10817e() {
        m10815g();
    }

    /* renamed from: f */
    public final void m10816f(zzl zzlVar, long j) {
        synchronized (this.f25722f) {
            long zzd = this.f25724h.zzd();
            long mo15860a = zzt.zzB().mo15860a();
            if (this.f25718b == -1) {
                if (mo15860a - zzd > ((Long) zzba.zzc().m23658b(g93.f10492N0)).longValue()) {
                    this.f25720d = -1;
                } else {
                    this.f25720d = this.f25724h.zzc();
                }
                this.f25718b = j;
            }
            this.f25717a = j;
            Bundle bundle = zzlVar.zzc;
            if (bundle != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.f25719c++;
            int i = this.f25720d + 1;
            this.f25720d = i;
            if (i == 0) {
                this.f25721e = 0L;
                this.f25724h.zzD(mo15860a);
            } else {
                this.f25721e = mo15860a - this.f25724h.zze();
            }
        }
    }

    /* renamed from: g */
    public final void m10815g() {
        if (((Boolean) lb3.f17221a.m16137e()).booleanValue()) {
            synchronized (this.f25722f) {
                this.f25719c--;
                this.f25720d--;
            }
        }
    }
}
