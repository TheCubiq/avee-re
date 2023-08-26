package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzxz;
import com.google.android.gms.internal.ads.zzyc;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzax implements com.google.android.gms.ads.internal.gmsg.zzv<zzaqw> {
    private final /* synthetic */ zzxz zzzr;
    private final /* synthetic */ zzac zzzs;
    private final /* synthetic */ zzyc zzzt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzax(zzxz zzxzVar, zzac zzacVar, zzyc zzycVar) {
        this.zzzr = zzxzVar;
        this.zzzs = zzacVar;
        this.zzzt = zzycVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final /* synthetic */ void zza(zzaqw zzaqwVar, Map map) {
        zzaqw zzaqwVar2 = zzaqwVar;
        View view = zzaqwVar2.getView();
        if (view != null) {
            try {
                if (this.zzzr != null) {
                    if (this.zzzr.getOverrideClickHandling()) {
                        zzas.zzd(zzaqwVar2);
                        return;
                    }
                    this.zzzr.zzj(ObjectWrapper.wrap(view));
                    this.zzzs.zzxl.onAdClicked();
                } else if (this.zzzt != null) {
                    if (this.zzzt.getOverrideClickHandling()) {
                        zzas.zzd(zzaqwVar2);
                        return;
                    }
                    this.zzzt.zzj(ObjectWrapper.wrap(view));
                    this.zzzs.zzxl.onAdClicked();
                }
            } catch (RemoteException e) {
                zzakb.zzc("Unable to call handleClick on mapper", e);
            }
        }
    }
}
