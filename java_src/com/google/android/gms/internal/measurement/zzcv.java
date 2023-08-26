package com.google.android.gms.internal.measurement;

import android.os.Binder;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzcv {
    public static <V> V zza(zzcu<V> zzcuVar) {
        try {
            return zzcuVar.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzcuVar.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
