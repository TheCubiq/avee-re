package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
public final class zzea {
    public static <T> zzeb<T> zza(zzeb<T> zzebVar) {
        if ((zzebVar instanceof zzec) || (zzebVar instanceof zzed)) {
            return zzebVar;
        }
        if (zzebVar instanceof Serializable) {
            return new zzed(zzebVar);
        }
        return new zzec(zzebVar);
    }

    public static <T> zzeb<T> zza(@NullableDecl T t) {
        return new zzef(t);
    }
}
