package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public interface zzep extends IInterface {
    List<zzkw> zza(zzn zznVar, boolean z) throws RemoteException;

    List<zzw> zza(String str, String str2, zzn zznVar) throws RemoteException;

    List<zzw> zza(String str, String str2, String str3) throws RemoteException;

    List<zzkw> zza(String str, String str2, String str3, boolean z) throws RemoteException;

    List<zzkw> zza(String str, String str2, boolean z, zzn zznVar) throws RemoteException;

    void zza(long j, String str, String str2, String str3) throws RemoteException;

    void zza(Bundle bundle, zzn zznVar) throws RemoteException;

    void zza(zzar zzarVar, zzn zznVar) throws RemoteException;

    void zza(zzar zzarVar, String str, String str2) throws RemoteException;

    void zza(zzkw zzkwVar, zzn zznVar) throws RemoteException;

    void zza(zzn zznVar) throws RemoteException;

    void zza(zzw zzwVar) throws RemoteException;

    void zza(zzw zzwVar, zzn zznVar) throws RemoteException;

    byte[] zza(zzar zzarVar, String str) throws RemoteException;

    void zzb(zzn zznVar) throws RemoteException;

    String zzc(zzn zznVar) throws RemoteException;

    void zzd(zzn zznVar) throws RemoteException;

    void zze(zzn zznVar) throws RemoteException;
}
