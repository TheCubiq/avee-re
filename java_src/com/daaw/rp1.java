package com.daaw;

import com.google.android.gms.common.Feature;
/* loaded from: classes.dex */
public final class rp1 extends UnsupportedOperationException {

    /* renamed from: p */
    public final Feature f25465p;

    public rp1(Feature feature) {
        this.f25465p = feature;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f25465p));
    }
}
