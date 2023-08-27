package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzadh;
@zzadh
/* loaded from: classes.dex */
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
    public final boolean zzze;
    public final boolean zzzf;
    private final String zzzg;
    public final boolean zzzh;
    public final float zzzi;
    public final int zzzj;
    public final boolean zzzk;
    public final boolean zzzl;
    public final boolean zzzm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaq(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.zzze = z;
        this.zzzf = z2;
        this.zzzg = str;
        this.zzzh = z3;
        this.zzzi = f;
        this.zzzj = i;
        this.zzzk = z4;
        this.zzzl = z5;
        this.zzzm = z6;
    }

    public zzaq(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, i, z4, z5, z6);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzze);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzzf);
        SafeParcelWriter.writeString(parcel, 4, this.zzzg, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzzh);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzzi);
        SafeParcelWriter.writeInt(parcel, 7, this.zzzj);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzzk);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzzl);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzzm);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
