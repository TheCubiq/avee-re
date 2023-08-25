package com.daaw;

import com.google.android.gms.common.Feature;
/* loaded from: classes.dex */
public final class rp1 extends UnsupportedOperationException {
    public final Feature p;

    public rp1(Feature feature) {
        this.p = feature;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.p));
    }
}
