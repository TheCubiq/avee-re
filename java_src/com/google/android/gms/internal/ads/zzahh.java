package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
@zzadh
/* loaded from: classes2.dex */
public final class zzahh implements RewardItem {
    private final zzagu zzcli;

    public zzahh(zzagu zzaguVar) {
        this.zzcli = zzaguVar;
    }

    @Override // com.google.android.gms.ads.reward.RewardItem
    public final int getAmount() {
        zzagu zzaguVar = this.zzcli;
        if (zzaguVar == null) {
            return 0;
        }
        try {
            return zzaguVar.getAmount();
        } catch (RemoteException e) {
            zzane.zzc("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardItem
    public final String getType() {
        zzagu zzaguVar = this.zzcli;
        if (zzaguVar == null) {
            return null;
        }
        try {
            return zzaguVar.getType();
        } catch (RemoteException e) {
            zzane.zzc("Could not forward getType to RewardItem", e);
            return null;
        }
    }
}
