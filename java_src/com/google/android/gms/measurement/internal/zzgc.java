package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.measurement.zzmb;
import com.google.android.gms.internal.measurement.zznr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzgc extends zzeo {
    private final zzkp zza;
    private Boolean zzb;
    private String zzc;

    public zzgc(zzkp zzkpVar) {
        this(zzkpVar, null);
    }

    private zzgc(zzkp zzkpVar, String str) {
        Preconditions.checkNotNull(zzkpVar);
        this.zza = zzkpVar;
        this.zzc = null;
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zzb(zzn zznVar) {
        zzb(zznVar, false);
        zza(new zzge(this, zznVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zze(zzn zznVar) {
        if (zzmb.zzb() && this.zza.zzb().zza(zzat.zzcp)) {
            Preconditions.checkNotEmpty(zznVar.zza);
            Preconditions.checkNotNull(zznVar.zzw);
            zzgm zzgmVar = new zzgm(this, zznVar);
            Preconditions.checkNotNull(zzgmVar);
            if (this.zza.zzp().zzf()) {
                zzgmVar.run();
            } else {
                this.zza.zzp().zzb(zzgmVar);
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zza(zzar zzarVar, zzn zznVar) {
        Preconditions.checkNotNull(zzarVar);
        zzb(zznVar, false);
        zza(new zzgp(this, zzarVar, zznVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzar zzb(zzar zzarVar, zzn zznVar) {
        boolean z = false;
        if ("_cmp".equals(zzarVar.zza) && zzarVar.zzb != null && zzarVar.zzb.zza() != 0) {
            String zzd = zzarVar.zzb.zzd("_cis");
            if (!TextUtils.isEmpty(zzd) && (("referrer broadcast".equals(zzd) || "referrer API".equals(zzd)) && this.zza.zzb().zze(zznVar.zza, zzat.zzar))) {
                z = true;
            }
        }
        if (z) {
            this.zza.zzq().zzu().zza("Event has been filtered ", zzarVar.toString());
            return new zzar("_cmpx", zzarVar.zzb, zzarVar.zzc, zzarVar.zzd);
        }
        return zzarVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zza(zzar zzarVar, String str, String str2) {
        Preconditions.checkNotNull(zzarVar);
        Preconditions.checkNotEmpty(str);
        zza(str, true);
        zza(new zzgo(this, zzarVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final byte[] zza(zzar zzarVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzarVar);
        zza(str, true);
        this.zza.zzq().zzv().zza("Log and bundle. event", this.zza.zzj().zza(zzarVar.zza));
        long nanoTime = this.zza.zzl().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zza.zzp().zzb(new zzgr(this, zzarVar, str)).get();
            if (bArr == null) {
                this.zza.zzq().zze().zza("Log and bundle returned null. appId", zzex.zza(str));
                bArr = new byte[0];
            }
            this.zza.zzq().zzv().zza("Log and bundle processed. event, size, time_ms", this.zza.zzj().zza(zzarVar.zza), Integer.valueOf(bArr.length), Long.valueOf((this.zza.zzl().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzq().zze().zza("Failed to log and bundle. appId, event, error", zzex.zza(str), this.zza.zzj().zza(zzarVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zza(zzkw zzkwVar, zzn zznVar) {
        Preconditions.checkNotNull(zzkwVar);
        zzb(zznVar, false);
        zza(new zzgq(this, zzkwVar, zznVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final List<zzkw> zza(zzn zznVar, boolean z) {
        zzb(zznVar, false);
        try {
            List<zzky> list = (List) this.zza.zzp().zza(new zzgt(this, zznVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzky zzkyVar : list) {
                if (z || !zzkx.zzd(zzkyVar.zzc)) {
                    arrayList.add(new zzkw(zzkyVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzq().zze().zza("Failed to get user properties. appId", zzex.zza(zznVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zza(zzn zznVar) {
        zzb(zznVar, false);
        zza(new zzgs(this, zznVar));
    }

    private final void zzb(zzn zznVar, boolean z) {
        Preconditions.checkNotNull(zznVar);
        zza(zznVar.zza, false);
        this.zza.zzk().zza(zznVar.zzb, zznVar.zzr, zznVar.zzv);
    }

    private final void zza(String str, boolean z) {
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            this.zza.zzq().zze().zza("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.zzb == null) {
                    if (!"com.google.android.gms".equals(this.zzc) && !UidVerifier.isGooglePlayServicesUid(this.zza.zzm(), Binder.getCallingUid()) && !GoogleSignatureVerifier.getInstance(this.zza.zzm()).isUidGoogleSigned(Binder.getCallingUid())) {
                        z2 = false;
                        this.zzb = Boolean.valueOf(z2);
                    }
                    z2 = true;
                    this.zzb = Boolean.valueOf(z2);
                }
                if (this.zzb.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.zza.zzq().zze().zza("Measurement Service called with invalid calling package. appId", zzex.zza(str));
                throw e;
            }
        }
        if (this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzm(), Binder.getCallingUid(), str)) {
            this.zzc = str;
        }
        if (str.equals(this.zzc)) {
            return;
        }
        throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zza(long j, String str, String str2, String str3) {
        zza(new zzgv(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zza(final Bundle bundle, final zzn zznVar) {
        if (zznr.zzb() && this.zza.zzb().zza(zzat.zzch)) {
            zzb(zznVar, false);
            zza(new Runnable(this, zznVar, bundle) { // from class: com.google.android.gms.measurement.internal.zzgf
                private final zzgc zza;
                private final zzn zzb;
                private final Bundle zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zznVar;
                    this.zzc = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(this.zzb, this.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final String zzc(zzn zznVar) {
        zzb(zznVar, false);
        return this.zza.zzd(zznVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zza(zzw zzwVar, zzn zznVar) {
        Preconditions.checkNotNull(zzwVar);
        Preconditions.checkNotNull(zzwVar.zzc);
        zzb(zznVar, false);
        zzw zzwVar2 = new zzw(zzwVar);
        zzwVar2.zza = zznVar.zza;
        zza(new zzgh(this, zzwVar2, zznVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zza(zzw zzwVar) {
        Preconditions.checkNotNull(zzwVar);
        Preconditions.checkNotNull(zzwVar.zzc);
        zza(zzwVar.zza, true);
        zza(new zzgg(this, new zzw(zzwVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final List<zzkw> zza(String str, String str2, boolean z, zzn zznVar) {
        zzb(zznVar, false);
        try {
            List<zzky> list = (List) this.zza.zzp().zza(new zzgj(this, zznVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzky zzkyVar : list) {
                if (z || !zzkx.zzd(zzkyVar.zzc)) {
                    arrayList.add(new zzkw(zzkyVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzq().zze().zza("Failed to query user properties. appId", zzex.zza(zznVar.zza), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final List<zzkw> zza(String str, String str2, String str3, boolean z) {
        zza(str, true);
        try {
            List<zzky> list = (List) this.zza.zzp().zza(new zzgi(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzky zzkyVar : list) {
                if (z || !zzkx.zzd(zzkyVar.zzc)) {
                    arrayList.add(new zzkw(zzkyVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzq().zze().zza("Failed to get user properties as. appId", zzex.zza(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final List<zzw> zza(String str, String str2, zzn zznVar) {
        zzb(zznVar, false);
        try {
            return (List) this.zza.zzp().zza(new zzgl(this, zznVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzq().zze().zza("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final List<zzw> zza(String str, String str2, String str3) {
        zza(str, true);
        try {
            return (List) this.zza.zzp().zza(new zzgk(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzq().zze().zza("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzep
    public final void zzd(zzn zznVar) {
        zza(zznVar.zza, false);
        zza(new zzgn(this, zznVar));
    }

    private final void zza(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.zza.zzp().zzf()) {
            runnable.run();
        } else {
            this.zza.zzp().zza(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzn zznVar, Bundle bundle) {
        this.zza.zze().zza(zznVar.zza, bundle);
    }
}
