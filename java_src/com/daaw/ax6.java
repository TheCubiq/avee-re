package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class ax6 extends cp2 implements bx6 {
    public ax6() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            dp2.c(parcel);
            R1((Bundle) dp2.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
