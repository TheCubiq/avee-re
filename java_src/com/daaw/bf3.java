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
    /* renamed from: a */
    public final /* synthetic */ Object mo1391a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof InterfaceC1684id3 ? (InterfaceC1684id3) queryLocalInterface : new gd3(iBinder);
    }

    /* renamed from: c */
    public final fd3 m26189c(View view, HashMap hashMap, HashMap hashMap2) {
        try {
            IBinder mo19913d0 = ((InterfaceC1684id3) m11808b(view.getContext())).mo19913d0(nt0.m14830g3(view), nt0.m14830g3(hashMap), nt0.m14830g3(hashMap2));
            if (mo19913d0 == null) {
                return null;
            }
            IInterface queryLocalInterface = mo19913d0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return queryLocalInterface instanceof fd3 ? (fd3) queryLocalInterface : new dd3(mo19913d0);
        } catch (RemoteException | r31.C2817a e) {
            k04.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
