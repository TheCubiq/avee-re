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
    public final String g;
    public final zzg h;
    public long a = -1;
    public long b = -1;
    @GuardedBy("lock")
    public int c = -1;
    public int d = -1;
    public long e = 0;
    public final Object f = new Object();
    @GuardedBy("lock")
    public int i = 0;
    @GuardedBy("lock")
    public int j = 0;

    public rz3(String str, zzg zzgVar) {
        this.g = str;
        this.h = zzgVar;
    }

    public final Bundle a(Context context, String str) {
        Bundle bundle;
        String str2;
        synchronized (this.f) {
            bundle = new Bundle();
            if (!this.h.zzP()) {
                bundle.putString("session_id", this.g);
            }
            bundle.putLong("basets", this.b);
            bundle.putLong("currts", this.a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.c);
            bundle.putInt("preqs_in_session", this.d);
            bundle.putLong("time_in_session", this.e);
            bundle.putInt("pclick", this.i);
            bundle.putInt("pimp", this.j);
            Context a = av3.a(context);
            int identifier = a.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z = false;
            if (identifier == 0) {
                str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
            } else {
                try {
                    if (identifier == a.getPackageManager().getActivityInfo(new ComponentName(a.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
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

    public final void b() {
        synchronized (this.f) {
            this.i++;
        }
    }

    public final void c() {
        synchronized (this.f) {
            this.j++;
        }
    }

    public final void d() {
        g();
    }

    public final void e() {
        g();
    }

    public final void f(zzl zzlVar, long j) {
        synchronized (this.f) {
            long zzd = this.h.zzd();
            long a = zzt.zzB().a();
            if (this.b == -1) {
                if (a - zzd > ((Long) zzba.zzc().b(g93.N0)).longValue()) {
                    this.d = -1;
                } else {
                    this.d = this.h.zzc();
                }
                this.b = j;
            }
            this.a = j;
            Bundle bundle = zzlVar.zzc;
            if (bundle != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.c++;
            int i = this.d + 1;
            this.d = i;
            if (i == 0) {
                this.e = 0L;
                this.h.zzD(a);
            } else {
                this.e = a - this.h.zze();
            }
        }
    }

    public final void g() {
        if (((Boolean) lb3.a.e()).booleanValue()) {
            synchronized (this.f) {
                this.c--;
                this.d--;
            }
        }
    }
}
