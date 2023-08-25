package com.daaw;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class yb3 {
    public final Context a;

    public yb3(Context context) {
        this.a = context;
    }

    public final void a(ot3 ot3Var) {
        String valueOf;
        String str;
        try {
            ((zb3) o04.b(this.a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new m04() { // from class: com.daaw.xb3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return queryLocalInterface instanceof zb3 ? (zb3) queryLocalInterface : new zb3(obj);
                }
            })).h3(ot3Var);
        } catch (RemoteException e) {
            valueOf = String.valueOf(e.getMessage());
            str = "Error calling setFlagsAccessedBeforeInitializedListener: ";
            k04.zzj(str.concat(valueOf));
        } catch (n04 e2) {
            valueOf = String.valueOf(e2.getMessage());
            str = "Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:";
            k04.zzj(str.concat(valueOf));
        }
    }
}
