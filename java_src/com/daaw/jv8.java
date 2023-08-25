package com.daaw;

import android.media.Spatializer;
/* loaded from: classes.dex */
public final class jv8 implements Spatializer.OnSpatializerStateChangedListener {

    /* renamed from: a */
    public final /* synthetic */ rv8 f15470a;

    public jv8(kv8 kv8Var, rv8 rv8Var) {
        this.f15470a = rv8Var;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        rv8.m10869o(this.f15470a);
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        rv8.m10869o(this.f15470a);
    }
}
