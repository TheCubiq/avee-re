package com.daaw;

import com.google.android.gms.ads.rewarded.RewardItem;
/* loaded from: classes.dex */
public final class pw3 extends sv3 {

    /* renamed from: p */
    public final String f23444p;

    /* renamed from: q */
    public final int f23445q;

    public pw3(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    public pw3(String str, int i) {
        this.f23444p = str;
        this.f23445q = i;
    }

    @Override // com.daaw.tv3
    public final int zze() {
        return this.f23445q;
    }

    @Override // com.daaw.tv3
    public final String zzf() {
        return this.f23444p;
    }
}
