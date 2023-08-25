package com.daaw;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class jq3 extends NativeAd.AdChoicesInfo {
    public final List a = new ArrayList();
    public String b;

    public jq3(nc3 nc3Var) {
        try {
            this.b = nc3Var.zzg();
        } catch (RemoteException e) {
            k04.zzh("", e);
            this.b = "";
        }
        try {
            for (Object obj : nc3Var.zzh()) {
                vc3 g3 = obj instanceof IBinder ? uc3.g3((IBinder) obj) : null;
                if (g3 != null) {
                    this.a.add(new lq3(g3));
                }
            }
        } catch (RemoteException e2) {
            k04.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.b;
    }
}
