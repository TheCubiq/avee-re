package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
final class zzef<T> implements zzeb<T>, Serializable {
    @NullableDecl
    private final T zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzef(@NullableDecl T t) {
        this.zza = t;
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final T zza() {
        return this.zza;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof zzef) {
            return zzdu.zza(this.zza, ((zzef) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
