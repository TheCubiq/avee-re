package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzaej extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaej> CREATOR = new zzaek();
    public final int errorCode;
    public final int orientation;
    private final int versionCode;
    public final String zzamj;
    public final boolean zzare;
    public final boolean zzarf;
    public final boolean zzarg;
    public final List<String> zzbsn;
    public final List<String> zzbso;
    public final List<String> zzbsp;
    public final List<String> zzbsr;
    public final boolean zzbss;
    public final long zzbsu;
    private zzaef zzbuc;
    public final String zzbyq;
    public final boolean zzcdd;
    public final boolean zzcdr;
    public String zzcds;
    public final boolean zzced;
    public String zzceo;
    public final long zzcep;
    public final boolean zzceq;
    public final long zzcer;
    public final List<String> zzces;
    public final String zzcet;
    public final long zzceu;
    public final String zzcev;
    public final boolean zzcew;
    public final String zzcex;
    public final String zzcey;
    public final boolean zzcez;
    public final boolean zzcfa;
    public final boolean zzcfb;
    private zzaev zzcfc;
    public String zzcfd;
    public final zzaig zzcfe;
    public final List<String> zzcff;
    public final List<String> zzcfg;
    public final boolean zzcfh;
    public final zzael zzcfi;
    public final String zzcfj;
    public final zzaiq zzcfk;
    public final String zzcfl;
    public final boolean zzcfm;
    private Bundle zzcfn;
    public final int zzcfo;
    public final boolean zzcfp;
    public final String zzcfq;
    public final boolean zzzl;
    public final boolean zzzm;

    public zzaej(int i) {
        this(19, null, null, null, i, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null);
    }

    public zzaej(int i, long j) {
        this(19, null, null, null, i, null, -1L, false, -1L, null, j, -1, null, -1L, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaej(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, zzaev zzaevVar, String str7, String str8, boolean z8, boolean z9, zzaig zzaigVar, List<String> list4, List<String> list5, boolean z10, zzael zzaelVar, boolean z11, String str9, List<String> list6, boolean z12, String str10, zzaiq zzaiqVar, String str11, boolean z13, boolean z14, Bundle bundle, boolean z15, int i4, boolean z16, List<String> list7, boolean z17, String str12) {
        zzafj zzafjVar;
        this.versionCode = i;
        this.zzbyq = str;
        this.zzceo = str2;
        this.zzbsn = list != null ? Collections.unmodifiableList(list) : null;
        this.errorCode = i2;
        this.zzbso = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.zzcep = j;
        this.zzceq = z;
        this.zzcer = j2;
        this.zzces = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.zzbsu = j3;
        this.orientation = i3;
        this.zzcet = str3;
        this.zzceu = j4;
        this.zzcev = str4;
        this.zzcew = z2;
        this.zzcex = str5;
        this.zzcey = str6;
        this.zzcez = z3;
        this.zzare = z4;
        this.zzcdd = z5;
        this.zzcfa = z6;
        this.zzcfm = z13;
        this.zzcfb = z7;
        this.zzcfc = zzaevVar;
        this.zzcfd = str7;
        this.zzamj = str8;
        if (this.zzceo == null && zzaevVar != null && (zzafjVar = (zzafj) zzaevVar.zza(zzafj.CREATOR)) != null && !TextUtils.isEmpty(zzafjVar.zzbgu)) {
            this.zzceo = zzafjVar.zzbgu;
        }
        this.zzarf = z8;
        this.zzarg = z9;
        this.zzcfe = zzaigVar;
        this.zzcff = list4;
        this.zzcfg = list5;
        this.zzcfh = z10;
        this.zzcfi = zzaelVar;
        this.zzcdr = z11;
        this.zzcds = str9;
        this.zzbsr = list6;
        this.zzbss = z12;
        this.zzcfj = str10;
        this.zzcfk = zzaiqVar;
        this.zzcfl = str11;
        this.zzced = z14;
        this.zzcfn = bundle;
        this.zzzl = z15;
        this.zzcfo = i4;
        this.zzcfp = z16;
        this.zzbsp = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.zzzm = z17;
        this.zzcfq = str12;
    }

    public zzaej(zzaef zzaefVar, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, zzaig zzaigVar, List<String> list4, List<String> list5, boolean z9, zzael zzaelVar, boolean z10, String str7, List<String> list6, boolean z11, String str8, zzaiq zzaiqVar, String str9, boolean z12, boolean z13, boolean z14, int i2, boolean z15, List<String> list7, boolean z16, String str10) {
        this(19, str, str2, list, -2, list2, j, z, -1L, list3, j3, i, str3, j4, str4, false, null, str5, z2, z3, z4, z5, false, null, null, str6, z7, z8, zzaigVar, list4, list5, z9, zzaelVar, z10, str7, list6, z11, str8, zzaiqVar, str9, z12, z13, null, z14, i2, z15, list7, z16, str10);
        this.zzbuc = zzaefVar;
    }

    public zzaej(zzaef zzaefVar, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, zzaig zzaigVar, List<String> list4, List<String> list5, boolean z10, zzael zzaelVar, boolean z11, String str8, List<String> list6, boolean z12, String str9, zzaiq zzaiqVar, String str10, boolean z13, boolean z14, boolean z15, int i2, boolean z16, List<String> list7, boolean z17, String str11) {
        this(19, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, null, null, str7, z8, z9, zzaigVar, list4, list5, z10, zzaelVar, z11, str8, list6, z12, str9, zzaiqVar, str10, z13, z14, null, z15, 0, z16, list7, z17, str11);
        this.zzbuc = zzaefVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzaef zzaefVar = this.zzbuc;
        if (zzaefVar != null && zzaefVar.versionCode >= 9 && !TextUtils.isEmpty(this.zzceo)) {
            this.zzcfc = new zzaev(new zzafj(this.zzceo));
            this.zzceo = null;
        }
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeString(parcel, 2, this.zzbyq, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzceo, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.zzbsn, false);
        SafeParcelWriter.writeInt(parcel, 5, this.errorCode);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzbso, false);
        SafeParcelWriter.writeLong(parcel, 7, this.zzcep);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzceq);
        SafeParcelWriter.writeLong(parcel, 9, this.zzcer);
        SafeParcelWriter.writeStringList(parcel, 10, this.zzces, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzbsu);
        SafeParcelWriter.writeInt(parcel, 12, this.orientation);
        SafeParcelWriter.writeString(parcel, 13, this.zzcet, false);
        SafeParcelWriter.writeLong(parcel, 14, this.zzceu);
        SafeParcelWriter.writeString(parcel, 15, this.zzcev, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzcew);
        SafeParcelWriter.writeString(parcel, 19, this.zzcex, false);
        SafeParcelWriter.writeString(parcel, 21, this.zzcey, false);
        SafeParcelWriter.writeBoolean(parcel, 22, this.zzcez);
        SafeParcelWriter.writeBoolean(parcel, 23, this.zzare);
        SafeParcelWriter.writeBoolean(parcel, 24, this.zzcdd);
        SafeParcelWriter.writeBoolean(parcel, 25, this.zzcfa);
        SafeParcelWriter.writeBoolean(parcel, 26, this.zzcfb);
        SafeParcelWriter.writeParcelable(parcel, 28, this.zzcfc, i, false);
        SafeParcelWriter.writeString(parcel, 29, this.zzcfd, false);
        SafeParcelWriter.writeString(parcel, 30, this.zzamj, false);
        SafeParcelWriter.writeBoolean(parcel, 31, this.zzarf);
        SafeParcelWriter.writeBoolean(parcel, 32, this.zzarg);
        SafeParcelWriter.writeParcelable(parcel, 33, this.zzcfe, i, false);
        SafeParcelWriter.writeStringList(parcel, 34, this.zzcff, false);
        SafeParcelWriter.writeStringList(parcel, 35, this.zzcfg, false);
        SafeParcelWriter.writeBoolean(parcel, 36, this.zzcfh);
        SafeParcelWriter.writeParcelable(parcel, 37, this.zzcfi, i, false);
        SafeParcelWriter.writeBoolean(parcel, 38, this.zzcdr);
        SafeParcelWriter.writeString(parcel, 39, this.zzcds, false);
        SafeParcelWriter.writeStringList(parcel, 40, this.zzbsr, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.zzbss);
        SafeParcelWriter.writeString(parcel, 43, this.zzcfj, false);
        SafeParcelWriter.writeParcelable(parcel, 44, this.zzcfk, i, false);
        SafeParcelWriter.writeString(parcel, 45, this.zzcfl, false);
        SafeParcelWriter.writeBoolean(parcel, 46, this.zzcfm);
        SafeParcelWriter.writeBoolean(parcel, 47, this.zzced);
        SafeParcelWriter.writeBundle(parcel, 48, this.zzcfn, false);
        SafeParcelWriter.writeBoolean(parcel, 49, this.zzzl);
        SafeParcelWriter.writeInt(parcel, 50, this.zzcfo);
        SafeParcelWriter.writeBoolean(parcel, 51, this.zzcfp);
        SafeParcelWriter.writeStringList(parcel, 52, this.zzbsp, false);
        SafeParcelWriter.writeBoolean(parcel, 53, this.zzzm);
        SafeParcelWriter.writeString(parcel, 54, this.zzcfq, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
