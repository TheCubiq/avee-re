package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.ads.AdActivity;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
@zzadh
/* loaded from: classes2.dex */
public final class zzajr {
    private final String zzasc;
    private long zzcqd = -1;
    private long zzcqe = -1;
    private int zzcqf = -1;
    int zzcqg = -1;
    private long zzcqh = 0;
    private final Object mLock = new Object();
    private int zzcqi = 0;
    private int zzcqj = 0;

    public zzajr(String str) {
        this.zzasc = str;
    }

    private static boolean zzah(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", TtmlNode.TAG_STYLE, AbstractSpiCall.ANDROID_CLIENT_TYPE);
        if (identifier == 0) {
            zzakb.zzdj("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            zzakb.zzdj("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            zzakb.zzdk("Fail to fetch AdActivity theme");
            zzakb.zzdj("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    public final void zzb(zzjj zzjjVar, long j) {
        synchronized (this.mLock) {
            long zzrb = com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzrb();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzbv.zzer().currentTimeMillis();
            if (this.zzcqe == -1) {
                if (currentTimeMillis - zzrb > ((Long) zzkb.zzik().zzd(zznk.zzayi)).longValue()) {
                    this.zzcqg = -1;
                } else {
                    this.zzcqg = com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzrc();
                }
                this.zzcqe = j;
            }
            this.zzcqd = j;
            if (zzjjVar == null || zzjjVar.extras == null || zzjjVar.extras.getInt("gw", 2) != 1) {
                this.zzcqf++;
                int i = this.zzcqg + 1;
                this.zzcqg = i;
                if (i == 0) {
                    this.zzcqh = 0L;
                    com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzk(currentTimeMillis);
                } else {
                    this.zzcqh = currentTimeMillis - com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzrd();
                }
            }
        }
    }

    public final Bundle zzk(Context context, String str) {
        Bundle bundle;
        synchronized (this.mLock) {
            bundle = new Bundle();
            bundle.putString("session_id", this.zzasc);
            bundle.putLong("basets", this.zzcqe);
            bundle.putLong("currts", this.zzcqd);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzcqf);
            bundle.putInt("preqs_in_session", this.zzcqg);
            bundle.putLong("time_in_session", this.zzcqh);
            bundle.putInt("pclick", this.zzcqi);
            bundle.putInt("pimp", this.zzcqj);
            bundle.putBoolean("support_transparent_background", zzah(context));
        }
        return bundle;
    }

    public final void zzpm() {
        synchronized (this.mLock) {
            this.zzcqj++;
        }
    }

    public final void zzpn() {
        synchronized (this.mLock) {
            this.zzcqi++;
        }
    }
}
