package com.daaw;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzaz;
/* loaded from: classes.dex */
public final class im5 extends du3 {

    /* renamed from: p */
    public final /* synthetic */ jm5 f13795p;

    public im5(jm5 jm5Var) {
        this.f13795p = jm5Var;
    }

    @Override // com.daaw.eu3
    /* renamed from: K */
    public final void mo19641K(zzaz zzazVar) {
        this.f13795p.f15206a.m23796c(zzazVar.zza());
    }

    @Override // com.daaw.eu3
    /* renamed from: y */
    public final void mo19640y(ParcelFileDescriptor parcelFileDescriptor) {
        this.f13795p.f15206a.m23797b(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
