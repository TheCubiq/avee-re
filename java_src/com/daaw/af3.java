package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.daaw.r31;
/* loaded from: classes.dex */
public final class af3 extends r31 {
    public af3() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.daaw.r31
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof cd3 ? (cd3) queryLocalInterface : new ad3(iBinder);
    }

    public final zc3 c(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder g1 = ((cd3) b(context)).g1(nt0.g3(context), nt0.g3(frameLayout), nt0.g3(frameLayout2), 224400000);
            if (g1 == null) {
                return null;
            }
            IInterface queryLocalInterface = g1.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof zc3 ? (zc3) queryLocalInterface : new xc3(g1);
        } catch (RemoteException | r31.a e) {
            k04.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
