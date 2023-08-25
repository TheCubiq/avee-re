package com.daaw;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class jq3 extends NativeAd.AdChoicesInfo {

    /* renamed from: a */
    public final List f15332a = new ArrayList();

    /* renamed from: b */
    public String f15333b;

    public jq3(nc3 nc3Var) {
        try {
            this.f15333b = nc3Var.zzg();
        } catch (RemoteException e) {
            k04.zzh("", e);
            this.f15333b = "";
        }
        try {
            for (Object obj : nc3Var.zzh()) {
                vc3 m8320g3 = obj instanceof IBinder ? uc3.m8320g3((IBinder) obj) : null;
                if (m8320g3 != null) {
                    this.f15332a.add(new lq3(m8320g3));
                }
            }
        } catch (RemoteException e2) {
            k04.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.f15332a;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.f15333b;
    }
}
