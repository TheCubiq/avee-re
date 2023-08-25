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
    /* renamed from: a */
    public final /* synthetic */ Object mo1391a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof cd3 ? (cd3) queryLocalInterface : new ad3(iBinder);
    }

    /* renamed from: c */
    public final zc3 m27492c(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder mo25417g1 = ((cd3) m11808b(context)).mo25417g1(nt0.m14830g3(context), nt0.m14830g3(frameLayout), nt0.m14830g3(frameLayout2), 224400000);
            if (mo25417g1 == null) {
                return null;
            }
            IInterface queryLocalInterface = mo25417g1.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof zc3 ? (zc3) queryLocalInterface : new xc3(mo25417g1);
        } catch (RemoteException | r31.C2817a e) {
            k04.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
