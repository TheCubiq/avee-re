package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public final class zzef extends zzei {
    private final View zztl;

    public zzef(zzcz zzczVar, String str, String str2, zzba zzbaVar, int i, int i2, View view) {
        super(zzczVar, str, str2, zzbaVar, i, 57);
        this.zztl = view;
    }

    @Override // com.google.android.gms.internal.ads.zzei
    protected final void zzar() throws IllegalAccessException, InvocationTargetException {
        if (this.zztl != null) {
            zzdh zzdhVar = new zzdh((String) this.zztz.invoke(null, this.zztl, this.zzps.getContext().getResources().getDisplayMetrics()));
            zzbc zzbcVar = new zzbc();
            zzbcVar.zzgi = zzdhVar.zzsx;
            zzbcVar.zzgj = zzdhVar.zzgj;
            zzbcVar.zzgk = zzdhVar.zzgk;
            this.zztq.zzev = zzbcVar;
        }
    }
}
