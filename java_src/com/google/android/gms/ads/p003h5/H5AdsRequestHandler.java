package com.google.android.gms.ads.p003h5;

import android.content.Context;
import com.daaw.gi3;
/* renamed from: com.google.android.gms.ads.h5.H5AdsRequestHandler */
/* loaded from: classes.dex */
public final class H5AdsRequestHandler {

    /* renamed from: a */
    public final gi3 f36073a;

    public H5AdsRequestHandler(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.f36073a = new gi3(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.f36073a.m21577a();
    }

    public boolean handleH5AdsRequest(String str) {
        return this.f36073a.m21576b(str);
    }

    public boolean shouldInterceptRequest(String str) {
        return gi3.m21575c(str);
    }
}
