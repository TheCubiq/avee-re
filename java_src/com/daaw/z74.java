package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzfl;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class z74 extends zzdp {
    @GuardedBy("lock")
    public boolean A;
    @GuardedBy("lock")
    public boolean B;
    @GuardedBy("lock")
    public ge3 C;
    public final y24 p;
    public final boolean r;
    public final boolean s;
    @GuardedBy("lock")
    public int t;
    @GuardedBy("lock")
    public zzdt u;
    @GuardedBy("lock")
    public boolean v;
    @GuardedBy("lock")
    public float x;
    @GuardedBy("lock")
    public float y;
    @GuardedBy("lock")
    public float z;
    public final Object q = new Object();
    @GuardedBy("lock")
    public boolean w = true;

    public z74(y24 y24Var, float f, boolean z, boolean z2) {
        this.p = y24Var;
        this.x = f;
        this.r = z;
        this.s = z2;
    }

    public final void b() {
        boolean z;
        int i;
        synchronized (this.q) {
            z = this.w;
            i = this.t;
            this.t = 3;
        }
        m3(i, 3, z, z);
    }

    public final void g3(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.q) {
            z2 = true;
            if (f2 == this.x && f3 == this.z) {
                z2 = false;
            }
            this.x = f2;
            this.y = f;
            z3 = this.w;
            this.w = z;
            i2 = this.t;
            this.t = i;
            float f4 = this.z;
            this.z = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.p.g().invalidate();
            }
        }
        if (z2) {
            try {
                ge3 ge3Var = this.C;
                if (ge3Var != null) {
                    ge3Var.zze();
                }
            } catch (RemoteException e) {
                k04.zzl("#007 Could not call remote method.", e);
            }
        }
        m3(i2, i, z3, z);
    }

    public final /* synthetic */ void h3(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        zzdt zzdtVar;
        zzdt zzdtVar2;
        zzdt zzdtVar3;
        synchronized (this.q) {
            boolean z5 = false;
            boolean z6 = i != i2;
            boolean z7 = this.v;
            if (z7 || i2 != 1) {
                z3 = false;
            } else {
                i2 = 1;
                z3 = true;
            }
            if (z6 && i2 == 1) {
                i2 = 1;
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = z6 && i2 == 2;
            boolean z9 = z6 && i2 == 3;
            this.v = (z7 || z3) ? true : true;
            if (z3) {
                try {
                    zzdt zzdtVar4 = this.u;
                    if (zzdtVar4 != null) {
                        zzdtVar4.zzi();
                    }
                } catch (RemoteException e) {
                    k04.zzl("#007 Could not call remote method.", e);
                }
            }
            if (z4 && (zzdtVar3 = this.u) != null) {
                zzdtVar3.zzh();
            }
            if (z8 && (zzdtVar2 = this.u) != null) {
                zzdtVar2.zzg();
            }
            if (z9) {
                zzdt zzdtVar5 = this.u;
                if (zzdtVar5 != null) {
                    zzdtVar5.zze();
                }
                this.p.e();
            }
            if (z != z2 && (zzdtVar = this.u) != null) {
                zzdtVar.zzf(z2);
            }
        }
    }

    public final /* synthetic */ void i3(Map map) {
        this.p.T("pubVideoCmd", map);
    }

    public final void j3(zzfl zzflVar) {
        boolean z = zzflVar.zza;
        boolean z2 = zzflVar.zzb;
        boolean z3 = zzflVar.zzc;
        synchronized (this.q) {
            this.A = z2;
            this.B = z3;
        }
        n3("initialState", ig.d("muteStart", true != z ? "0" : "1", "customControlsRequested", true != z2 ? "0" : "1", "clickToExpandRequested", true != z3 ? "0" : "1"));
    }

    public final void k3(float f) {
        synchronized (this.q) {
            this.y = f;
        }
    }

    public final void l3(ge3 ge3Var) {
        synchronized (this.q) {
            this.C = ge3Var;
        }
    }

    public final void m3(final int i, final int i2, final boolean z, final boolean z2) {
        z04.e.execute(new Runnable() { // from class: com.daaw.y74
            @Override // java.lang.Runnable
            public final void run() {
                z74.this.h3(i, i2, z, z2);
            }
        });
    }

    public final void n3(String str, Map map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        z04.e.execute(new Runnable() { // from class: com.daaw.x74
            @Override // java.lang.Runnable
            public final void run() {
                z74.this.i3(hashMap);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        float f;
        synchronized (this.q) {
            f = this.z;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        float f;
        synchronized (this.q) {
            f = this.y;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        float f;
        synchronized (this.q) {
            f = this.x;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        int i;
        synchronized (this.q) {
            i = this.t;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final zzdt zzi() {
        zzdt zzdtVar;
        synchronized (this.q) {
            zzdtVar = this.u;
        }
        return zzdtVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z) {
        n3(true != z ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() {
        n3("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() {
        n3("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(zzdt zzdtVar) {
        synchronized (this.q) {
            this.u = zzdtVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() {
        n3("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() {
        boolean z;
        boolean zzp = zzp();
        synchronized (this.q) {
            z = false;
            if (!zzp) {
                try {
                    if (this.B && this.s) {
                        z = true;
                    }
                } finally {
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() {
        boolean z;
        synchronized (this.q) {
            z = false;
            if (this.r && this.A) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() {
        boolean z;
        synchronized (this.q) {
            z = this.w;
        }
        return z;
    }
}
