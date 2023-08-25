package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class ax6 extends cp2 implements bx6 {
    public ax6() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            dp2.m24105c(parcel);
            mo13902R1((Bundle) dp2.m24107a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
