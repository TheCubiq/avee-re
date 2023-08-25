package com.daaw;

import android.media.Spatializer;
/* loaded from: classes.dex */
public final class jv8 implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ rv8 a;

    public jv8(kv8 kv8Var, rv8 rv8Var) {
        this.a = rv8Var;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        rv8.o(this.a);
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        rv8.o(this.a);
    }
}
