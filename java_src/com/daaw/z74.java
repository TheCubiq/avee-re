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

    /* renamed from: A */
    public boolean f34553A;
    @GuardedBy("lock")

    /* renamed from: B */
    public boolean f34554B;
    @GuardedBy("lock")

    /* renamed from: C */
    public ge3 f34555C;

    /* renamed from: p */
    public final y24 f34556p;

    /* renamed from: r */
    public final boolean f34558r;

    /* renamed from: s */
    public final boolean f34559s;
    @GuardedBy("lock")

    /* renamed from: t */
    public int f34560t;
    @GuardedBy("lock")

    /* renamed from: u */
    public zzdt f34561u;
    @GuardedBy("lock")

    /* renamed from: v */
    public boolean f34562v;
    @GuardedBy("lock")

    /* renamed from: x */
    public float f34564x;
    @GuardedBy("lock")

    /* renamed from: y */
    public float f34565y;
    @GuardedBy("lock")

    /* renamed from: z */
    public float f34566z;

    /* renamed from: q */
    public final Object f34557q = new Object();
    @GuardedBy("lock")

    /* renamed from: w */
    public boolean f34563w = true;

    public z74(y24 y24Var, float f, boolean z, boolean z2) {
        this.f34556p = y24Var;
        this.f34564x = f;
        this.f34558r = z;
        this.f34559s = z2;
    }

    /* renamed from: b */
    public final void m2694b() {
        boolean z;
        int i;
        synchronized (this.f34557q) {
            z = this.f34563w;
            i = this.f34560t;
            this.f34560t = 3;
        }
        m2687m3(i, 3, z, z);
    }

    /* renamed from: g3 */
    public final void m2693g3(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.f34557q) {
            z2 = true;
            if (f2 == this.f34564x && f3 == this.f34566z) {
                z2 = false;
            }
            this.f34564x = f2;
            this.f34565y = f;
            z3 = this.f34563w;
            this.f34563w = z;
            i2 = this.f34560t;
            this.f34560t = i;
            float f4 = this.f34566z;
            this.f34566z = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.f34556p.mo6418g().invalidate();
            }
        }
        if (z2) {
            try {
                ge3 ge3Var = this.f34555C;
                if (ge3Var != null) {
                    ge3Var.zze();
                }
            } catch (RemoteException e) {
                k04.zzl("#007 Could not call remote method.", e);
            }
        }
        m2687m3(i2, i, z3, z);
    }

    /* renamed from: h3 */
    public final /* synthetic */ void m2692h3(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        zzdt zzdtVar;
        zzdt zzdtVar2;
        zzdt zzdtVar3;
        synchronized (this.f34557q) {
            boolean z5 = false;
            boolean z6 = i != i2;
            boolean z7 = this.f34562v;
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
            this.f34562v = (z7 || z3) ? true : true;
            if (z3) {
                try {
                    zzdt zzdtVar4 = this.f34561u;
                    if (zzdtVar4 != null) {
                        zzdtVar4.zzi();
                    }
                } catch (RemoteException e) {
                    k04.zzl("#007 Could not call remote method.", e);
                }
            }
            if (z4 && (zzdtVar3 = this.f34561u) != null) {
                zzdtVar3.zzh();
            }
            if (z8 && (zzdtVar2 = this.f34561u) != null) {
                zzdtVar2.zzg();
            }
            if (z9) {
                zzdt zzdtVar5 = this.f34561u;
                if (zzdtVar5 != null) {
                    zzdtVar5.zze();
                }
                this.f34556p.mo4240e();
            }
            if (z != z2 && (zzdtVar = this.f34561u) != null) {
                zzdtVar.zzf(z2);
            }
        }
    }

    /* renamed from: i3 */
    public final /* synthetic */ void m2691i3(Map map) {
        this.f34556p.mo6434T("pubVideoCmd", map);
    }

    /* renamed from: j3 */
    public final void m2690j3(zzfl zzflVar) {
        boolean z = zzflVar.zza;
        boolean z2 = zzflVar.zzb;
        boolean z3 = zzflVar.zzc;
        synchronized (this.f34557q) {
            this.f34553A = z2;
            this.f34554B = z3;
        }
        m2686n3("initialState", C1701ig.m19846d("muteStart", true != z ? "0" : "1", "customControlsRequested", true != z2 ? "0" : "1", "clickToExpandRequested", true != z3 ? "0" : "1"));
    }

    /* renamed from: k3 */
    public final void m2689k3(float f) {
        synchronized (this.f34557q) {
            this.f34565y = f;
        }
    }

    /* renamed from: l3 */
    public final void m2688l3(ge3 ge3Var) {
        synchronized (this.f34557q) {
            this.f34555C = ge3Var;
        }
    }

    /* renamed from: m3 */
    public final void m2687m3(final int i, final int i2, final boolean z, final boolean z2) {
        z04.f34309e.execute(new Runnable() { // from class: com.daaw.y74
            @Override // java.lang.Runnable
            public final void run() {
                z74.this.m2692h3(i, i2, z, z2);
            }
        });
    }

    /* renamed from: n3 */
    public final void m2686n3(String str, Map map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        z04.f34309e.execute(new Runnable() { // from class: com.daaw.x74
            @Override // java.lang.Runnable
            public final void run() {
                z74.this.m2691i3(hashMap);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        float f;
        synchronized (this.f34557q) {
            f = this.f34566z;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        float f;
        synchronized (this.f34557q) {
            f = this.f34565y;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        float f;
        synchronized (this.f34557q) {
            f = this.f34564x;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        int i;
        synchronized (this.f34557q) {
            i = this.f34560t;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final zzdt zzi() {
        zzdt zzdtVar;
        synchronized (this.f34557q) {
            zzdtVar = this.f34561u;
        }
        return zzdtVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z) {
        m2686n3(true != z ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() {
        m2686n3("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() {
        m2686n3("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(zzdt zzdtVar) {
        synchronized (this.f34557q) {
            this.f34561u = zzdtVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() {
        m2686n3("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() {
        boolean z;
        boolean zzp = zzp();
        synchronized (this.f34557q) {
            z = false;
            if (!zzp) {
                try {
                    if (this.f34554B && this.f34559s) {
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
        synchronized (this.f34557q) {
            z = false;
            if (this.f34558r && this.f34553A) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() {
        boolean z;
        synchronized (this.f34557q) {
            z = this.f34563w;
        }
        return z;
    }
}
