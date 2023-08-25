package com.daaw;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzx;
import java.util.Map;
/* loaded from: classes.dex */
public final class hh3 implements zzx {
    public boolean a = false;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zza c;
    public final /* synthetic */ Map d;
    public final /* synthetic */ Map e;

    public hh3(jh3 jh3Var, boolean z, zza zzaVar, Map map, Map map2) {
        this.b = z;
        this.c = zzaVar;
        this.d = map;
        this.e = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzx
    public final void zza(boolean z) {
        if (this.a) {
            return;
        }
        if (z && this.b) {
            ((vy4) this.c).zzq();
        }
        this.a = true;
        this.d.put((String) this.e.get("event_id"), Boolean.valueOf(z));
        ((uj3) this.c).T("openIntentAsync", this.d);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzx
    public final void zzb(int i) {
    }
}
