package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public class zzbcb {
    private static final zzbbb zzdph = zzbbb.zzacr();
    private zzbah zzdvk;
    private volatile zzbcu zzdvl;
    private volatile zzbah zzdvm;

    private final zzbcu zzk(zzbcu zzbcuVar) {
        if (this.zzdvl == null) {
            synchronized (this) {
                if (this.zzdvl == null) {
                    try {
                        this.zzdvl = zzbcuVar;
                        this.zzdvm = zzbah.zzdpq;
                    } catch (zzbbu unused) {
                        this.zzdvl = zzbcuVar;
                        this.zzdvm = zzbah.zzdpq;
                    }
                }
            }
        }
        return this.zzdvl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbcb) {
            zzbcb zzbcbVar = (zzbcb) obj;
            zzbcu zzbcuVar = this.zzdvl;
            zzbcu zzbcuVar2 = zzbcbVar.zzdvl;
            return (zzbcuVar == null && zzbcuVar2 == null) ? zzaav().equals(zzbcbVar.zzaav()) : (zzbcuVar == null || zzbcuVar2 == null) ? zzbcuVar != null ? zzbcuVar.equals(zzbcbVar.zzk(zzbcuVar.zzadg())) : zzk(zzbcuVar2.zzadg()).equals(zzbcuVar2) : zzbcuVar.equals(zzbcuVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final zzbah zzaav() {
        if (this.zzdvm != null) {
            return this.zzdvm;
        }
        synchronized (this) {
            if (this.zzdvm != null) {
                return this.zzdvm;
            }
            this.zzdvm = this.zzdvl == null ? zzbah.zzdpq : this.zzdvl.zzaav();
            return this.zzdvm;
        }
    }

    public final int zzacw() {
        if (this.zzdvm != null) {
            return this.zzdvm.size();
        }
        if (this.zzdvl != null) {
            return this.zzdvl.zzacw();
        }
        return 0;
    }

    public final zzbcu zzl(zzbcu zzbcuVar) {
        zzbcu zzbcuVar2 = this.zzdvl;
        this.zzdvk = null;
        this.zzdvm = null;
        this.zzdvl = zzbcuVar;
        return zzbcuVar2;
    }
}
