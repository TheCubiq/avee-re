package com.daaw;

import android.content.Context;
import com.daaw.hj;
/* loaded from: classes.dex */
public class ij {
    public hj a(Context context, hj.a aVar) {
        return context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? new oq(context, aVar) : new ht0();
    }
}
