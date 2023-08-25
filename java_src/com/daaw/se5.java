package com.daaw;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
/* loaded from: classes.dex */
public final class se5 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final bi5 a;

    public se5(bi5 bi5Var) {
        this.a = bi5Var;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        bi5.c(this.a, true == (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) ? 10 : 5);
    }
}
