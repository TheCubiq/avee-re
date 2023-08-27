package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzer extends com.google.android.gms.internal.measurement.zza implements zzep {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzer(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zza(zzar zzarVar, zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzarVar);
        com.google.android.gms.internal.measurement.zzb.zza(a_, zznVar);
        zzb(1, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zza(zzkw zzkwVar, zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzkwVar);
        com.google.android.gms.internal.measurement.zzb.zza(a_, zznVar);
        zzb(2, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zza(zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zznVar);
        zzb(4, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zza(zzar zzarVar, String str, String str2) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzarVar);
        a_.writeString(str);
        a_.writeString(str2);
        zzb(5, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zzb(zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zznVar);
        zzb(6, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final List<zzkw> zza(zzn zznVar, boolean z) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zznVar);
        com.google.android.gms.internal.measurement.zzb.zza(a_, z);
        Parcel zza = zza(7, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzkw.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final byte[] zza(zzar zzarVar, String str) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzarVar);
        a_.writeString(str);
        Parcel zza = zza(9, a_);
        byte[] createByteArray = zza.createByteArray();
        zza.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zza(long j, String str, String str2, String str3) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j);
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        zzb(10, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final String zzc(zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zznVar);
        Parcel zza = zza(11, a_);
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zza(zzw zzwVar, zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzwVar);
        com.google.android.gms.internal.measurement.zzb.zza(a_, zznVar);
        zzb(12, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zza(zzw zzwVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zzwVar);
        zzb(13, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final List<zzkw> zza(String str, String str2, boolean z, zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        com.google.android.gms.internal.measurement.zzb.zza(a_, z);
        com.google.android.gms.internal.measurement.zzb.zza(a_, zznVar);
        Parcel zza = zza(14, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzkw.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final List<zzkw> zza(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        com.google.android.gms.internal.measurement.zzb.zza(a_, z);
        Parcel zza = zza(15, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzkw.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final List<zzw> zza(String str, String str2, zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        com.google.android.gms.internal.measurement.zzb.zza(a_, zznVar);
        Parcel zza = zza(16, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzw.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final List<zzw> zza(String str, String str2, String str3) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        Parcel zza = zza(17, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzw.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zzd(zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zznVar);
        zzb(18, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zza(Bundle bundle, zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, bundle);
        com.google.android.gms.internal.measurement.zzb.zza(a_, zznVar);
        zzb(19, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zze(zzn zznVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(a_, zznVar);
        zzb(20, a_);
    }
}
