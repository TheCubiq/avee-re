package com.daaw;

import android.content.Context;
import android.net.wifi.WifiManager;
/* loaded from: classes.dex */
public final class cb8 {
    public final WifiManager a;

    public cb8(Context context) {
        this.a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }
}
