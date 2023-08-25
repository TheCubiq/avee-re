package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.daaw.r31;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class bf3 extends r31 {
    public bf3() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.daaw.r31
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof id3 ? (id3) queryLocalInterface : new gd3(iBinder);
    }

    public final fd3 c(View view, HashMap hashMap, HashMap hashMap2) {
        try {
            IBinder d0 = ((id3) b(view.getContext())).d0(nt0.g3(view), nt0.g3(hashMap), nt0.g3(hashMap2));
            if (d0 == null) {
                return null;
            }
            IInterface queryLocalInterface = d0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return queryLocalInterface instanceof fd3 ? (fd3) queryLocalInterface : new dd3(d0);
        } catch (RemoteException | r31.a e) {
            k04.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
