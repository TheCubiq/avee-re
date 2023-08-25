package com.daaw;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.daaw.r31;
/* loaded from: classes.dex */
public final class er3 extends r31 {
    public er3() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.daaw.r31
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof kr3 ? (kr3) queryLocalInterface : new ir3(iBinder);
    }

    public final hr3 c(Activity activity) {
        try {
            IBinder zze = ((kr3) b(activity)).zze(nt0.g3(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof hr3 ? (hr3) queryLocalInterface : new fr3(zze);
        } catch (RemoteException e) {
            k04.zzk("Could not create remote AdOverlay.", e);
            return null;
        } catch (r31.a e2) {
            k04.zzk("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
