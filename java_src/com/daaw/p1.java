package com.daaw;

import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
/* loaded from: classes.dex */
public final /* synthetic */ class p1 implements OnUserEarnedRewardListener {
    public final /* synthetic */ r1 a;

    public /* synthetic */ p1(r1 r1Var) {
        this.a = r1Var;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public final void onUserEarnedReward(RewardItem rewardItem) {
        r1.a(this.a, rewardItem);
    }
}
