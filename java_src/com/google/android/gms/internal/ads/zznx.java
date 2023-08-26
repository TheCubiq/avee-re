package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zznx {
    private boolean zzbgn;
    private String zzbgq;
    private zznx zzbgr;
    private final List<zznv> zzbgo = new LinkedList();
    private final Map<String, String> zzbgp = new LinkedHashMap();
    private final Object mLock = new Object();

    public zznx(boolean z, String str, String str2) {
        this.zzbgn = z;
        this.zzbgp.put("action", str);
        this.zzbgp.put("ad_format", str2);
    }

    public final boolean zza(zznv zznvVar, long j, String... strArr) {
        synchronized (this.mLock) {
            for (String str : strArr) {
                this.zzbgo.add(new zznv(j, str, zznvVar));
            }
        }
        return true;
    }

    public final boolean zza(zznv zznvVar, String... strArr) {
        if (!this.zzbgn || zznvVar == null) {
            return false;
        }
        return zza(zznvVar, com.google.android.gms.ads.internal.zzbv.zzer().elapsedRealtime(), strArr);
    }

    public final void zzan(String str) {
        if (this.zzbgn) {
            synchronized (this.mLock) {
                this.zzbgq = str;
            }
        }
    }

    public final void zzc(zznx zznxVar) {
        synchronized (this.mLock) {
            this.zzbgr = zznxVar;
        }
    }

    public final zznv zzd(long j) {
        if (this.zzbgn) {
            return new zznv(j, null, null);
        }
        return null;
    }

    public final void zze(String str, String str2) {
        zznn zzpy;
        if (!this.zzbgn || TextUtils.isEmpty(str2) || (zzpy = com.google.android.gms.ads.internal.zzbv.zzeo().zzpy()) == null) {
            return;
        }
        synchronized (this.mLock) {
            zznr zzal = zzpy.zzal(str);
            Map<String, String> map = this.zzbgp;
            map.put(str, zzal.zzd(map.get(str), str2));
        }
    }

    public final zznv zzjj() {
        return zzd(com.google.android.gms.ads.internal.zzbv.zzer().elapsedRealtime());
    }

    public final String zzjk() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.mLock) {
            for (zznv zznvVar : this.zzbgo) {
                long time = zznvVar.getTime();
                String zzjg = zznvVar.zzjg();
                zznv zzjh = zznvVar.zzjh();
                if (zzjh != null && time > 0) {
                    sb2.append(zzjg);
                    sb2.append('.');
                    sb2.append(time - zzjh.getTime());
                    sb2.append(',');
                }
            }
            this.zzbgo.clear();
            if (!TextUtils.isEmpty(this.zzbgq)) {
                sb2.append(this.zzbgq);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> zzjl() {
        synchronized (this.mLock) {
            zznn zzpy = com.google.android.gms.ads.internal.zzbv.zzeo().zzpy();
            if (zzpy != null && this.zzbgr != null) {
                return zzpy.zza(this.zzbgp, this.zzbgr.zzjl());
            }
            return this.zzbgp;
        }
    }

    public final zznv zzjm() {
        synchronized (this.mLock) {
        }
        return null;
    }
}
