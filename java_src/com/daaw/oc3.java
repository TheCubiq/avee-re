package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class oc3 extends NativeAd.AdChoicesInfo {

    /* renamed from: a */
    public final nc3 f21267a;

    /* renamed from: b */
    public final List f21268b = new ArrayList();

    /* renamed from: c */
    public String f21269c;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        r4.f21268b.add(new com.daaw.wc3(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oc3(nc3 nc3Var) {
        IBinder iBinder;
        this.f21267a = nc3Var;
        try {
            this.f21269c = nc3Var.zzg();
        } catch (RemoteException e) {
            k04.zzh("", e);
            this.f21269c = "";
        }
        try {
            for (Object obj : nc3Var.zzh()) {
                vc3 vc3Var = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    vc3Var = queryLocalInterface instanceof vc3 ? (vc3) queryLocalInterface : new tc3(iBinder);
                }
            }
        } catch (RemoteException e2) {
            k04.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.f21268b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.f21269c;
    }
}
