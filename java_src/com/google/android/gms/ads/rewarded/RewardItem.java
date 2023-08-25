package com.google.android.gms.ads.rewarded;

import com.daaw.j32;
/* loaded from: classes.dex */
public interface RewardItem {
    public static final RewardItem DEFAULT_REWARD = new j32();

    int getAmount();

    String getType();
}
