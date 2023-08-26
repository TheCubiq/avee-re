package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes2.dex */
public abstract class zzato extends zzek implements zzatn {
    public static zzatn zzab(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        return queryLocalInterface instanceof zzatn ? (zzatn) queryLocalInterface : new zzatp(iBinder);
    }
}
