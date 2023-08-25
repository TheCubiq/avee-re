package com.daaw;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzaz;
/* loaded from: classes.dex */
public final class wj5 extends gu3 {
    public final /* synthetic */ xj5 p;

    public wj5(xj5 xj5Var) {
        this.p = xj5Var;
    }

    @Override // com.daaw.hu3
    public final void K(zzaz zzazVar) {
        this.p.a.c(zzazVar.zza());
    }

    @Override // com.daaw.hu3
    public final void y(ParcelFileDescriptor parcelFileDescriptor) {
        this.p.a.b(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
