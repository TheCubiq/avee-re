package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
public final class zzdz<T> extends zzdx<T> {
    private final T zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdz(T t) {
        this.zza = t;
    }

    @Override // com.google.android.gms.internal.measurement.zzdx
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzdx
    public final T zzb() {
        return this.zza;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof zzdz) {
            return this.zza.equals(((zzdz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
