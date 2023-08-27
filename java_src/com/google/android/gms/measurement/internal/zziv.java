package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzmb;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zziv extends zzg {
    private final zzjp zza;
    private zzep zzb;
    private volatile Boolean zzc;
    private final zzaj zzd;
    private final zzki zze;
    private final List<Runnable> zzf;
    private final zzaj zzg;

    /* JADX INFO: Access modifiers changed from: protected */
    public zziv(zzgb zzgbVar) {
        super(zzgbVar);
        this.zzf = new ArrayList();
        this.zze = new zzki(zzgbVar.zzl());
        this.zza = new zzjp(this);
        this.zzd = new zziu(this, zzgbVar);
        this.zzg = new zzje(this, zzgbVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzy() {
        return false;
    }

    public final boolean zzaa() {
        zzc();
        zzv();
        return this.zzb != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzab() {
        zzc();
        zzv();
        zza(new zzjg(this, zzb(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(boolean z) {
        if (zzmb.zzb() && zzs().zza(zzat.zzco)) {
            zzc();
            zzv();
            if (z) {
                zzi().zzaa();
            }
            if (zzai()) {
                zza(new zzjj(this, zzb(false)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzep zzepVar, AbstractSafeParcelable abstractSafeParcelable, zzn zznVar) {
        int i;
        zzc();
        zzv();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List<AbstractSafeParcelable> zza = zzi().zza(100);
            if (zza != null) {
                arrayList.addAll(zza);
                i = zza.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzar) {
                    try {
                        zzepVar.zza((zzar) abstractSafeParcelable2, zznVar);
                    } catch (RemoteException e) {
                        zzq().zze().zza("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkw) {
                    try {
                        zzepVar.zza((zzkw) abstractSafeParcelable2, zznVar);
                    } catch (RemoteException e2) {
                        zzq().zze().zza("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzw) {
                    try {
                        zzepVar.zza((zzw) abstractSafeParcelable2, zznVar);
                    } catch (RemoteException e3) {
                        zzq().zze().zza("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    zzq().zze().zza("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzar zzarVar, String str) {
        Preconditions.checkNotNull(zzarVar);
        zzc();
        zzv();
        zza(new zzji(this, true, zzi().zza(zzarVar), zzarVar, zzb(true), str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzw zzwVar) {
        Preconditions.checkNotNull(zzwVar);
        zzc();
        zzv();
        zza(new zzjl(this, true, zzi().zza(zzwVar), new zzw(zzwVar), zzb(true), zzwVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zzw>> atomicReference, String str, String str2, String str3) {
        zzc();
        zzv();
        zza(new zzjk(this, atomicReference, str, str2, str3, zzb(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(com.google.android.gms.internal.measurement.zzw zzwVar, String str, String str2) {
        zzc();
        zzv();
        zza(new zzjn(this, str, str2, zzb(false), zzwVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zzkw>> atomicReference, String str, String str2, String str3, boolean z) {
        zzc();
        zzv();
        zza(new zzjm(this, atomicReference, str, str2, str3, z, zzb(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(com.google.android.gms.internal.measurement.zzw zzwVar, String str, String str2, boolean z) {
        zzc();
        zzv();
        zza(new zzix(this, str, str2, z, zzb(false), zzwVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzkw zzkwVar) {
        zzc();
        zzv();
        zza(new zziw(this, zzi().zza(zzkwVar), zzkwVar, zzb(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zzkw>> atomicReference, boolean z) {
        zzc();
        zzv();
        zza(new zziz(this, atomicReference, zzb(false), z));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzac() {
        zzc();
        zzv();
        zzn zzb = zzb(false);
        zzi().zzaa();
        zza(new zziy(this, zzb));
    }

    public final void zza(AtomicReference<String> atomicReference) {
        zzc();
        zzv();
        zza(new zzjb(this, atomicReference, zzb(false)));
    }

    public final void zza(com.google.android.gms.internal.measurement.zzw zzwVar) {
        zzc();
        zzv();
        zza(new zzja(this, zzb(false), zzwVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzad() {
        zzc();
        zzv();
        zzn zzb = zzb(true);
        zzi().zzab();
        zza(new zzjd(this, zzb));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzin zzinVar) {
        zzc();
        zzv();
        zza(new zzjc(this, zzinVar));
    }

    public final void zza(Bundle bundle) {
        zzc();
        zzv();
        zza(new zzjf(this, bundle, zzb(false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaj() {
        zzc();
        this.zze.zza();
        this.zzd.zza(zzat.zzai.zza(null).longValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzae() {
        zzc();
        zzv();
        if (zzaa()) {
            return;
        }
        if (zzak()) {
            this.zza.zzb();
        } else if (zzs().zzw()) {
        } else {
            List<ResolveInfo> queryIntentServices = zzm().getPackageManager().queryIntentServices(new Intent().setClassName(zzm(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                intent.setComponent(new ComponentName(zzm(), "com.google.android.gms.measurement.AppMeasurementService"));
                this.zza.zza(intent);
                return;
            }
            zzq().zze().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzaf() {
        return this.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzak() {
        boolean z;
        zzc();
        zzv();
        if (this.zzc == null) {
            zzc();
            zzv();
            Boolean zzi = zzr().zzi();
            if (zzi == null || !zzi.booleanValue()) {
                boolean z2 = false;
                if (zzf().zzaf() != 1) {
                    zzq().zzw().zza("Checking service availability");
                    int zza = zzo().zza(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                    if (zza != 0) {
                        if (zza == 1) {
                            zzq().zzw().zza("Service missing");
                        } else if (zza == 2) {
                            zzq().zzv().zza("Service container out of date");
                            if (zzo().zzi() >= 17443) {
                                r1 = zzi == null;
                                z = false;
                                if (r1) {
                                }
                                z2 = z;
                                if (z2) {
                                }
                            }
                        } else {
                            if (zza == 3) {
                                zzq().zzh().zza("Service disabled");
                            } else if (zza == 9) {
                                zzq().zzh().zza("Service invalid");
                            } else if (zza == 18) {
                                zzq().zzh().zza("Service updating");
                            } else {
                                zzq().zzh().zza("Unexpected service status", Integer.valueOf(zza));
                            }
                            z = false;
                            r1 = false;
                            if (r1 && zzs().zzw()) {
                                zzq().zze().zza("No way to upload. Consider using the full version of Analytics");
                            } else {
                                z2 = z;
                            }
                            if (z2) {
                                zzr().zza(r1);
                            }
                        }
                        z = true;
                        r1 = false;
                        if (r1) {
                        }
                        z2 = z;
                        if (z2) {
                        }
                    } else {
                        zzq().zzw().zza("Service available");
                    }
                }
                z = true;
                if (r1) {
                }
                z2 = z;
                if (z2) {
                }
            }
            this.zzc = Boolean.valueOf(r1);
        }
        return this.zzc.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzep zzepVar) {
        zzc();
        Preconditions.checkNotNull(zzepVar);
        this.zzb = zzepVar;
        zzaj();
        zzam();
    }

    public final void zzag() {
        zzc();
        zzv();
        this.zza.zza();
        try {
            ConnectionTracker.getInstance().unbindService(zzm(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(ComponentName componentName) {
        zzc();
        if (this.zzb != null) {
            this.zzb = null;
            zzq().zzw().zza("Disconnected from device MeasurementService", componentName);
            zzc();
            zzae();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzal() {
        zzc();
        if (zzaa()) {
            zzq().zzw().zza("Inactivity, disconnecting from the service");
            zzag();
        }
    }

    private final void zza(Runnable runnable) throws IllegalStateException {
        zzc();
        if (zzaa()) {
            runnable.run();
        } else if (this.zzf.size() >= 1000) {
            zzq().zze().zza("Discarding data. Max runnable queue size reached");
        } else {
            this.zzf.add(runnable);
            this.zzg.zza(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            zzae();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzam() {
        zzc();
        zzq().zzw().zza("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        for (Runnable runnable : this.zzf) {
            try {
                runnable.run();
            } catch (Exception e) {
                zzq().zze().zza("Task exception while flushing queue", e);
            }
        }
        this.zzf.clear();
        this.zzg.zzc();
    }

    private final zzn zzb(boolean z) {
        return zzf().zza(z ? zzq().zzx() : null);
    }

    public final void zza(com.google.android.gms.internal.measurement.zzw zzwVar, zzar zzarVar, String str) {
        zzc();
        zzv();
        if (zzo().zza(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            zzq().zzh().zza("Not bundling data. Service unavailable or out of date");
            zzo().zza(zzwVar, new byte[0]);
            return;
        }
        zza(new zzjh(this, zzarVar, str, zzwVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzah() {
        zzc();
        zzv();
        return !zzak() || zzo().zzi() >= 200900;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzai() {
        zzc();
        zzv();
        if (zzs().zza(zzat.zzcp)) {
            return !zzak() || zzo().zzi() >= zzat.zzcq.zza(null).intValue();
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zza zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzhe zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzeq zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zziv zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzim zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzet zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzkb zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzal zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ Clock zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ Context zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzev zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzkx zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ zzfu zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ zzex zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzfj zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzy zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ zzx zzt() {
        return super.zzt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzep zza(zziv zzivVar, zzep zzepVar) {
        zzivVar.zzb = null;
        return null;
    }
}
