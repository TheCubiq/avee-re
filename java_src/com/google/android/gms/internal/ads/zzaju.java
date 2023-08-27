package com.google.android.gms.internal.ads;

import android.os.Bundle;
@zzadh
/* loaded from: classes2.dex */
public final class zzaju {
    private final Object mLock;
    private final zzajv zzacn;
    private final String zzcov;
    private int zzcql;
    private int zzcqm;

    private zzaju(zzajv zzajvVar, String str) {
        this.mLock = new Object();
        this.zzacn = zzajvVar;
        this.zzcov = str;
    }

    public zzaju(String str) {
        this(com.google.android.gms.ads.internal.zzbv.zzep(), str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.zzcov;
            String str2 = ((zzaju) obj).zzcov;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzcov;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final Bundle toBundle() {
        Bundle bundle;
        synchronized (this.mLock) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.zzcql);
            bundle.putInt("pmnll", this.zzcqm);
        }
        return bundle;
    }

    public final void zze(int i, int i2) {
        synchronized (this.mLock) {
            this.zzcql = i;
            this.zzcqm = i2;
            this.zzacn.zza(this);
        }
    }

    public final String zzqm() {
        return this.zzcov;
    }
}
