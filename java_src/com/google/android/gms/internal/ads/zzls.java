package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public abstract class zzls extends zzek implements zzlr {
    public zzls() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onVideoStart();
        } else if (i == 2) {
            onVideoPlay();
        } else if (i == 3) {
            onVideoPause();
        } else if (i == 4) {
            onVideoEnd();
        } else if (i != 5) {
            return false;
        } else {
            onVideoMute(zzel.zza(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
