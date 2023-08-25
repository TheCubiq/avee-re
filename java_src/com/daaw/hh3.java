package com.daaw;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzx;
import java.util.Map;
/* loaded from: classes.dex */
public final class hh3 implements zzx {

    /* renamed from: a */
    public boolean f12541a = false;

    /* renamed from: b */
    public final /* synthetic */ boolean f12542b;

    /* renamed from: c */
    public final /* synthetic */ zza f12543c;

    /* renamed from: d */
    public final /* synthetic */ Map f12544d;

    /* renamed from: e */
    public final /* synthetic */ Map f12545e;

    public hh3(jh3 jh3Var, boolean z, zza zzaVar, Map map, Map map2) {
        this.f12542b = z;
        this.f12543c = zzaVar;
        this.f12544d = map;
        this.f12545e = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzx
    public final void zza(boolean z) {
        if (this.f12541a) {
            return;
        }
        if (z && this.f12542b) {
            ((vy4) this.f12543c).zzq();
        }
        this.f12541a = true;
        this.f12544d.put((String) this.f12545e.get("event_id"), Boolean.valueOf(z));
        ((uj3) this.f12543c).mo6434T("openIntentAsync", this.f12544d);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzx
    public final void zzb(int i) {
    }
}
