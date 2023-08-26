package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzjd;
@zzadh
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzm();
    public final int orientation;
    public final String url;
    public final zzang zzacr;
    public final zzc zzbyl;
    public final zzjd zzbym;
    public final zzn zzbyn;
    public final zzaqw zzbyo;
    public final com.google.android.gms.ads.internal.gmsg.zzd zzbyp;
    public final String zzbyq;
    public final boolean zzbyr;
    public final String zzbys;
    public final zzt zzbyt;
    public final int zzbyu;
    public final String zzbyv;
    public final zzaq zzbyw;
    public final com.google.android.gms.ads.internal.gmsg.zzb zzbyx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzang zzangVar, String str4, zzaq zzaqVar, IBinder iBinder6) {
        this.zzbyl = zzcVar;
        this.zzbym = (zzjd) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzbyn = (zzn) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzbyo = (zzaqw) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzbyx = (com.google.android.gms.ads.internal.gmsg.zzb) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zzbyp = (com.google.android.gms.ads.internal.gmsg.zzd) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzbyq = str;
        this.zzbyr = z;
        this.zzbys = str2;
        this.zzbyt = (zzt) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.orientation = i;
        this.zzbyu = i2;
        this.url = str3;
        this.zzacr = zzangVar;
        this.zzbyv = str4;
        this.zzbyw = zzaqVar;
    }

    public AdOverlayInfoParcel(zzc zzcVar, zzjd zzjdVar, zzn zznVar, zzt zztVar, zzang zzangVar) {
        this.zzbyl = zzcVar;
        this.zzbym = zzjdVar;
        this.zzbyn = zznVar;
        this.zzbyo = null;
        this.zzbyx = null;
        this.zzbyp = null;
        this.zzbyq = null;
        this.zzbyr = false;
        this.zzbys = null;
        this.zzbyt = zztVar;
        this.orientation = -1;
        this.zzbyu = 4;
        this.url = null;
        this.zzacr = zzangVar;
        this.zzbyv = null;
        this.zzbyw = null;
    }

    public AdOverlayInfoParcel(zzjd zzjdVar, zzn zznVar, com.google.android.gms.ads.internal.gmsg.zzb zzbVar, com.google.android.gms.ads.internal.gmsg.zzd zzdVar, zzt zztVar, zzaqw zzaqwVar, boolean z, int i, String str, zzang zzangVar) {
        this.zzbyl = null;
        this.zzbym = zzjdVar;
        this.zzbyn = zznVar;
        this.zzbyo = zzaqwVar;
        this.zzbyx = zzbVar;
        this.zzbyp = zzdVar;
        this.zzbyq = null;
        this.zzbyr = z;
        this.zzbys = null;
        this.zzbyt = zztVar;
        this.orientation = i;
        this.zzbyu = 3;
        this.url = str;
        this.zzacr = zzangVar;
        this.zzbyv = null;
        this.zzbyw = null;
    }

    public AdOverlayInfoParcel(zzjd zzjdVar, zzn zznVar, com.google.android.gms.ads.internal.gmsg.zzb zzbVar, com.google.android.gms.ads.internal.gmsg.zzd zzdVar, zzt zztVar, zzaqw zzaqwVar, boolean z, int i, String str, String str2, zzang zzangVar) {
        this.zzbyl = null;
        this.zzbym = zzjdVar;
        this.zzbyn = zznVar;
        this.zzbyo = zzaqwVar;
        this.zzbyx = zzbVar;
        this.zzbyp = zzdVar;
        this.zzbyq = str2;
        this.zzbyr = z;
        this.zzbys = str;
        this.zzbyt = zztVar;
        this.orientation = i;
        this.zzbyu = 3;
        this.url = null;
        this.zzacr = zzangVar;
        this.zzbyv = null;
        this.zzbyw = null;
    }

    public AdOverlayInfoParcel(zzjd zzjdVar, zzn zznVar, zzt zztVar, zzaqw zzaqwVar, int i, zzang zzangVar, String str, zzaq zzaqVar) {
        this.zzbyl = null;
        this.zzbym = zzjdVar;
        this.zzbyn = zznVar;
        this.zzbyo = zzaqwVar;
        this.zzbyx = null;
        this.zzbyp = null;
        this.zzbyq = null;
        this.zzbyr = false;
        this.zzbys = null;
        this.zzbyt = zztVar;
        this.orientation = i;
        this.zzbyu = 1;
        this.url = null;
        this.zzacr = zzangVar;
        this.zzbyv = str;
        this.zzbyw = zzaqVar;
    }

    public AdOverlayInfoParcel(zzjd zzjdVar, zzn zznVar, zzt zztVar, zzaqw zzaqwVar, boolean z, int i, zzang zzangVar) {
        this.zzbyl = null;
        this.zzbym = zzjdVar;
        this.zzbyn = zznVar;
        this.zzbyo = zzaqwVar;
        this.zzbyx = null;
        this.zzbyp = null;
        this.zzbyq = null;
        this.zzbyr = z;
        this.zzbys = null;
        this.zzbyt = zztVar;
        this.orientation = i;
        this.zzbyu = 2;
        this.url = null;
        this.zzacr = zzangVar;
        this.zzbyv = null;
        this.zzbyw = null;
    }

    public static void zza(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static AdOverlayInfoParcel zzc(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzbyl, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, ObjectWrapper.wrap(this.zzbym).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(this.zzbyn).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 5, ObjectWrapper.wrap(this.zzbyo).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 6, ObjectWrapper.wrap(this.zzbyp).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzbyq, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzbyr);
        SafeParcelWriter.writeString(parcel, 9, this.zzbys, false);
        SafeParcelWriter.writeIBinder(parcel, 10, ObjectWrapper.wrap(this.zzbyt).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 11, this.orientation);
        SafeParcelWriter.writeInt(parcel, 12, this.zzbyu);
        SafeParcelWriter.writeString(parcel, 13, this.url, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzacr, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzbyv, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzbyw, i, false);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.zzbyx).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
