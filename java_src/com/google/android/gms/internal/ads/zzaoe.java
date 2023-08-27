package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
@zzadh
/* loaded from: classes2.dex */
public final class zzaoe {
    public static final Executor zzcvy = new zzaof();
    public static final Executor zzcvz = new zzaog();
    private static final zzaod zzcwa = zza(zzcvy);
    private static final zzaod zzcwb = zza(zzcvz);

    public static zzaod zza(Executor executor) {
        return new zzaoh(executor, null);
    }
}
