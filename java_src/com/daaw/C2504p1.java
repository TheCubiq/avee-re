package com.daaw;

import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
/* renamed from: com.daaw.p1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2504p1 implements OnUserEarnedRewardListener {

    /* renamed from: a */
    public final /* synthetic */ C2812r1 f22193a;

    public /* synthetic */ C2504p1(C2812r1 c2812r1) {
        this.f22193a = c2812r1;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public final void onUserEarnedReward(RewardItem rewardItem) {
        C2812r1.m11863a(this.f22193a, rewardItem);
    }
}
