package com.google.android.gms.internal.ads;
@zzadh
/* loaded from: classes2.dex */
public final class zzaqe extends zzajx {
    final zzapw zzcyg;
    final zzaqh zzdav;
    private final String zzdaw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqe(zzapw zzapwVar, zzaqh zzaqhVar, String str) {
        this.zzcyg = zzapwVar;
        this.zzdav = zzaqhVar;
        this.zzdaw = str;
        com.google.android.gms.ads.internal.zzbv.zzff().zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void onStop() {
        this.zzdav.abort();
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zzdn() {
        try {
            this.zzdav.zzdp(this.zzdaw);
        } finally {
            zzakk.zzcrm.post(new zzaqf(this));
        }
    }
}
