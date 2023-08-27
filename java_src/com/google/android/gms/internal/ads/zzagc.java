package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
@zzadh
/* loaded from: classes2.dex */
public final class zzagc {
    private WeakHashMap<Context, zzage> zzckj = new WeakHashMap<>();

    public final Future<zzaga> zzq(Context context) {
        return zzaki.zza(new zzagd(this, context));
    }
}
