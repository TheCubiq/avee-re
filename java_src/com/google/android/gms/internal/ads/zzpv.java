package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;
@zzadh
/* loaded from: classes2.dex */
public final class zzpv extends NativeAd.AdChoicesInfo {
    private final List<NativeAd.Image> zzbhf = new ArrayList();
    private final zzps zzbkk;
    private String zzbkl;

    public zzpv(zzps zzpsVar) {
        zzpw zzpwVar;
        IBinder iBinder;
        this.zzbkk = zzpsVar;
        try {
            this.zzbkl = zzpsVar.getText();
        } catch (RemoteException e) {
            zzane.zzb("", e);
            this.zzbkl = "";
        }
        try {
            for (zzpw zzpwVar2 : zzpsVar.zzjr()) {
                if (!(zzpwVar2 instanceof IBinder) || (iBinder = (IBinder) zzpwVar2) == null) {
                    zzpwVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzpwVar = queryLocalInterface instanceof zzpw ? (zzpw) queryLocalInterface : new zzpy(iBinder);
                }
                if (zzpwVar != null) {
                    this.zzbhf.add(new zzpz(zzpwVar));
                }
            }
        } catch (RemoteException e2) {
            zzane.zzb("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzbhf;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzbkl;
    }
}
