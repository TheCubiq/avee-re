package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.DeviceProperties;
/* loaded from: classes2.dex */
final class zzadw implements zzady {
    private final /* synthetic */ Context val$context;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadw(Context context) {
        this.val$context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final boolean zza(zzang zzangVar) {
        boolean zzc;
        zzkb.zzif();
        boolean zzbe = zzamu.zzbe(this.val$context);
        boolean z = ((Boolean) zzkb.zzik().zzd(zznk.zzbeq)).booleanValue() && zzangVar.zzcvg;
        zzc = zzadv.zzc(this.val$context, zzangVar.zzcvg);
        if (zzc && zzbe && !z) {
            if (DeviceProperties.isSidewinder(this.val$context)) {
                if (!((Boolean) zzkb.zzik().zzd(zznk.zzawa)).booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }
}
