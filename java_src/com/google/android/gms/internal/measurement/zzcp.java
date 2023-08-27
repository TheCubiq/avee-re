package com.google.android.gms.internal.measurement;

import android.content.Context;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
public final class zzcp extends zzdk {
    private final Context zza;
    private final zzeb<zzdx<zzcy>> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcp(Context context, @Nullable zzeb<zzdx<zzcy>> zzebVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context;
        this.zzb = zzebVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzdk
    public final Context zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzdk
    @Nullable
    public final zzeb<zzdx<zzcy>> zzb() {
        return this.zzb;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("FlagsContext{context=");
        sb.append(valueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        zzeb<zzdx<zzcy>> zzebVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdk) {
            zzdk zzdkVar = (zzdk) obj;
            if (this.zza.equals(zzdkVar.zza()) && ((zzebVar = this.zzb) != null ? zzebVar.equals(zzdkVar.zzb()) : zzdkVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzeb<zzdx<zzcy>> zzebVar = this.zzb;
        return hashCode ^ (zzebVar == null ? 0 : zzebVar.hashCode());
    }
}
