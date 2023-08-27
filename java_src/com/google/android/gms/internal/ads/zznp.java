package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zznp {
    public static void zza(zznn zznnVar, zznm zznmVar) {
        if (zznmVar.getContext() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zznmVar.zzfw())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zznnVar.zza(zznmVar.getContext(), zznmVar.zzfw(), zznmVar.zzjd(), zznmVar.zzje());
    }
}
