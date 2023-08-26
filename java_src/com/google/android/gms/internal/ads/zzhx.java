package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
@zzadh
/* loaded from: classes2.dex */
public final class zzhx {
    zzen zzaln;
    boolean zzalo;

    public zzhx() {
    }

    public zzhx(Context context) {
        zznk.initialize(context);
        if (((Boolean) zzkb.zzik().zzd(zznk.zzbeo)).booleanValue()) {
            try {
                this.zzaln = zzeo.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
                ObjectWrapper.wrap(context);
                this.zzaln.zza(ObjectWrapper.wrap(context), "GMA_SDK");
                this.zzalo = true;
            } catch (RemoteException | DynamiteModule.LoadingException | NullPointerException unused) {
                zzane.zzck("Cannot dynamite load clearcut");
            }
        }
    }

    public zzhx(Context context, String str, String str2) {
        zznk.initialize(context);
        try {
            this.zzaln = zzeo.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
            ObjectWrapper.wrap(context);
            this.zzaln.zza(ObjectWrapper.wrap(context), str, null);
            this.zzalo = true;
        } catch (RemoteException | DynamiteModule.LoadingException | NullPointerException unused) {
            zzane.zzck("Cannot dynamite load clearcut");
        }
    }

    public final zzhz zzd(byte[] bArr) {
        return new zzhz(this, bArr);
    }
}
