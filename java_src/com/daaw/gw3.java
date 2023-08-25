package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;
/* loaded from: classes.dex */
public final class gw3 implements RewardItem {
    public final tv3 a;

    public gw3(tv3 tv3Var) {
        this.a = tv3Var;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        tv3 tv3Var = this.a;
        if (tv3Var != null) {
            try {
                return tv3Var.zze();
            } catch (RemoteException e) {
                k04.zzk("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        tv3 tv3Var = this.a;
        if (tv3Var != null) {
            try {
                return tv3Var.zzf();
            } catch (RemoteException e) {
                k04.zzk("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
