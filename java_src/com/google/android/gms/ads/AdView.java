package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.daaw.ry0;
/* loaded from: classes.dex */
public final class AdView extends BaseAdView {
    public AdView(Context context) {
        super(context, 0);
        ry0.k(context, "Context cannot be null");
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    public final VideoController zza() {
        return this.p.zzf();
    }
}
