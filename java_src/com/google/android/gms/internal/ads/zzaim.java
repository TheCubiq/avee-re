package com.google.android.gms.internal.ads;

import java.util.List;
/* loaded from: classes2.dex */
final class zzaim implements zzanl<Void> {
    private final /* synthetic */ zzanz zzcnb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaim(zzaii zzaiiVar, zzanz zzanzVar) {
        this.zzcnb = zzanzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zzb(Throwable th) {
        List list;
        list = zzaii.zzcml;
        list.remove(this.zzcnb);
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final /* synthetic */ void zzh(Void r2) {
        List list;
        list = zzaii.zzcml;
        list.remove(this.zzcnb);
    }
}
