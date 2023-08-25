package com.daaw;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzaz;
/* loaded from: classes.dex */
public final class wj5 extends gu3 {

    /* renamed from: p */
    public final /* synthetic */ xj5 f31275p;

    public wj5(xj5 xj5Var) {
        this.f31275p = xj5Var;
    }

    @Override // com.daaw.hu3
    /* renamed from: K */
    public final void mo6047K(zzaz zzazVar) {
        this.f31275p.f32767a.m23796c(zzazVar.zza());
    }

    @Override // com.daaw.hu3
    /* renamed from: y */
    public final void mo6046y(ParcelFileDescriptor parcelFileDescriptor) {
        this.f31275p.f32767a.m23797b(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
