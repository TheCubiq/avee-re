package com.daaw;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzaz;
/* loaded from: classes.dex */
public final class im5 extends du3 {
    public final /* synthetic */ jm5 p;

    public im5(jm5 jm5Var) {
        this.p = jm5Var;
    }

    @Override // com.daaw.eu3
    public final void K(zzaz zzazVar) {
        this.p.a.c(zzazVar.zza());
    }

    @Override // com.daaw.eu3
    public final void y(ParcelFileDescriptor parcelFileDescriptor) {
        this.p.a.b(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
