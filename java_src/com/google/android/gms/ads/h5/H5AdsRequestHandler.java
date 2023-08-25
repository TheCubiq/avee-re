package com.google.android.gms.ads.h5;

import android.content.Context;
import com.daaw.gi3;
/* loaded from: classes.dex */
public final class H5AdsRequestHandler {
    public final gi3 a;

    public H5AdsRequestHandler(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.a = new gi3(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.a.a();
    }

    public boolean handleH5AdsRequest(String str) {
        return this.a.b(str);
    }

    public boolean shouldInterceptRequest(String str) {
        return gi3.c(str);
    }
}
