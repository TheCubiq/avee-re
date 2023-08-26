package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzaey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaey> CREATOR = new zzaez();
    private final ApplicationInfo applicationInfo;
    private final String packageName;
    @Nullable
    private final PackageInfo zzccw;
    private final List<String> zzcdj;
    private final String zzcds;
    private final Bundle zzcfy;
    private final zzang zzcfz;
    private final boolean zzcga;
    private final String zzcgb;

    public zzaey(Bundle bundle, zzang zzangVar, ApplicationInfo applicationInfo, String str, List<String> list, @Nullable PackageInfo packageInfo, String str2, boolean z, String str3) {
        this.zzcfy = bundle;
        this.zzcfz = zzangVar;
        this.packageName = str;
        this.applicationInfo = applicationInfo;
        this.zzcdj = list;
        this.zzccw = packageInfo;
        this.zzcds = str2;
        this.zzcga = z;
        this.zzcgb = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zzcfy, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzcfz, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.applicationInfo, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.packageName, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzcdj, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzccw, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzcds, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzcga);
        SafeParcelWriter.writeString(parcel, 9, this.zzcgb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
