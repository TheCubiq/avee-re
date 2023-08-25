package com.daaw;

import com.google.android.gms.ads.rewarded.RewardItem;
/* loaded from: classes.dex */
public final class pw3 extends sv3 {
    public final String p;
    public final int q;

    public pw3(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    public pw3(String str, int i) {
        this.p = str;
        this.q = i;
    }

    @Override // com.daaw.tv3
    public final int zze() {
        return this.q;
    }

    @Override // com.daaw.tv3
    public final String zzf() {
        return this.p;
    }
}
