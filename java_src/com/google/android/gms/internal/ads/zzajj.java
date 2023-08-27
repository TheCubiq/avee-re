package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
@zzadh
/* loaded from: classes2.dex */
public final class zzajj {
    private final Object mLock;
    private final zzajv zzacn;
    private boolean zzcif;
    private final LinkedList<zzajk> zzcot;
    private final String zzcou;
    private final String zzcov;
    private long zzcow;
    private long zzcox;
    private long zzcoy;
    private long zzcoz;
    private long zzcpa;
    private long zzcpb;

    private zzajj(zzajv zzajvVar, String str, String str2) {
        this.mLock = new Object();
        this.zzcow = -1L;
        this.zzcox = -1L;
        this.zzcif = false;
        this.zzcoy = -1L;
        this.zzcoz = 0L;
        this.zzcpa = -1L;
        this.zzcpb = -1L;
        this.zzacn = zzajvVar;
        this.zzcou = str;
        this.zzcov = str2;
        this.zzcot = new LinkedList<>();
    }

    public zzajj(String str, String str2) {
        this(com.google.android.gms.ads.internal.zzbv.zzep(), str, str2);
    }

    public final Bundle toBundle() {
        Bundle bundle;
        synchronized (this.mLock) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.zzcou);
            bundle.putString("slotid", this.zzcov);
            bundle.putBoolean("ismediation", this.zzcif);
            bundle.putLong("treq", this.zzcpa);
            bundle.putLong("tresponse", this.zzcpb);
            bundle.putLong("timp", this.zzcox);
            bundle.putLong("tload", this.zzcoy);
            bundle.putLong("pcc", this.zzcoz);
            bundle.putLong("tfetch", this.zzcow);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<zzajk> it = this.zzcot.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toBundle());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final void zzh(long j) {
        synchronized (this.mLock) {
            this.zzcpb = j;
            if (j != -1) {
                this.zzacn.zza(this);
            }
        }
    }

    public final void zzi(long j) {
        synchronized (this.mLock) {
            if (this.zzcpb != -1) {
                this.zzcow = j;
                this.zzacn.zza(this);
            }
        }
    }

    public final void zzn(zzjj zzjjVar) {
        synchronized (this.mLock) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzcpa = elapsedRealtime;
            this.zzacn.zzb(zzjjVar, elapsedRealtime);
        }
    }

    public final void zzpm() {
        synchronized (this.mLock) {
            if (this.zzcpb != -1 && this.zzcox == -1) {
                this.zzcox = SystemClock.elapsedRealtime();
                this.zzacn.zza(this);
            }
            this.zzacn.zzpm();
        }
    }

    public final void zzpn() {
        synchronized (this.mLock) {
            if (this.zzcpb != -1) {
                zzajk zzajkVar = new zzajk();
                zzajkVar.zzpr();
                this.zzcot.add(zzajkVar);
                this.zzcoz++;
                this.zzacn.zzpn();
                this.zzacn.zza(this);
            }
        }
    }

    public final void zzpo() {
        synchronized (this.mLock) {
            if (this.zzcpb != -1 && !this.zzcot.isEmpty()) {
                zzajk last = this.zzcot.getLast();
                if (last.zzpp() == -1) {
                    last.zzpq();
                    this.zzacn.zza(this);
                }
            }
        }
    }

    public final void zzy(boolean z) {
        synchronized (this.mLock) {
            if (this.zzcpb != -1) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.zzcoy = elapsedRealtime;
                if (!z) {
                    this.zzcox = elapsedRealtime;
                    this.zzacn.zza(this);
                }
            }
        }
    }

    public final void zzz(boolean z) {
        synchronized (this.mLock) {
            if (this.zzcpb != -1) {
                this.zzcif = z;
                this.zzacn.zza(this);
            }
        }
    }
}
