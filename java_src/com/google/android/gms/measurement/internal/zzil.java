package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcd;
import com.google.android.gms.internal.measurement.zzmb;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zznr;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzil extends zzkm {
    public zzil(zzkp zzkpVar) {
        super(zzkpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkm
    protected final boolean zzd() {
        return false;
    }

    public final byte[] zza(zzar zzarVar, String str) {
        zzky zzkyVar;
        Bundle zzb;
        zzf zzfVar;
        zzcd.zzg.zza zzaVar;
        zzcd.zzf.zza zzaVar2;
        Bundle bundle;
        byte[] bArr;
        long j;
        zzan zza;
        zzc();
        this.zzy.zzad();
        Preconditions.checkNotNull(zzarVar);
        Preconditions.checkNotEmpty(str);
        if (!zzs().zze(str, zzat.zzaw)) {
            zzq().zzv().zza("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        } else if (!"_iap".equals(zzarVar.zza) && !"_iapx".equals(zzarVar.zza)) {
            zzq().zzv().zza("Generating a payload for this event is not available. package_name, event_name", str, zzarVar.zza);
            return null;
        } else {
            zzcd.zzf.zza zzb2 = zzcd.zzf.zzb();
            zzi().zze();
            try {
                zzf zzb3 = zzi().zzb(str);
                if (zzb3 == null) {
                    zzq().zzv().zza("Log and bundle not available. package_name", str);
                    return new byte[0];
                } else if (!zzb3.zzr()) {
                    zzq().zzv().zza("Log and bundle disabled. package_name", str);
                    return new byte[0];
                } else {
                    zzcd.zzg.zza zza2 = zzcd.zzg.zzbh().zza(1).zza(AbstractSpiCall.ANDROID_CLIENT_TYPE);
                    if (!TextUtils.isEmpty(zzb3.zzc())) {
                        zza2.zzf(zzb3.zzc());
                    }
                    if (!TextUtils.isEmpty(zzb3.zzn())) {
                        zza2.zze(zzb3.zzn());
                    }
                    if (!TextUtils.isEmpty(zzb3.zzl())) {
                        zza2.zzg(zzb3.zzl());
                    }
                    if (zzb3.zzm() != -2147483648L) {
                        zza2.zzh((int) zzb3.zzm());
                    }
                    zza2.zzf(zzb3.zzo()).zzk(zzb3.zzq());
                    if (zznq.zzb() && zzs().zze(zzb3.zzc(), zzat.zzbj)) {
                        if (!TextUtils.isEmpty(zzb3.zze())) {
                            zza2.zzk(zzb3.zze());
                        } else if (!TextUtils.isEmpty(zzb3.zzg())) {
                            zza2.zzp(zzb3.zzg());
                        } else if (!TextUtils.isEmpty(zzb3.zzf())) {
                            zza2.zzo(zzb3.zzf());
                        }
                    } else if (!TextUtils.isEmpty(zzb3.zze())) {
                        zza2.zzk(zzb3.zze());
                    } else if (!TextUtils.isEmpty(zzb3.zzf())) {
                        zza2.zzo(zzb3.zzf());
                    }
                    zzad zza3 = this.zza.zza(str);
                    zza2.zzh(zzb3.zzp());
                    if (this.zzy.zzaa() && zzs().zzh(zza2.zzj())) {
                        if (zzmb.zzb() && zzs().zza(zzat.zzcp)) {
                            if (zza3.zzc() && !TextUtils.isEmpty(null)) {
                                zza2.zzn(null);
                            }
                        } else {
                            zza2.zzj();
                            if (!TextUtils.isEmpty(null)) {
                                zza2.zzn(null);
                            }
                        }
                    }
                    if (zzmb.zzb() && zzs().zza(zzat.zzcp)) {
                        zza2.zzq(zza3.zza());
                    }
                    if (!zzmb.zzb() || !zzs().zza(zzat.zzcp) || zza3.zzc()) {
                        Pair<String, Boolean> zza4 = zzf().zza(zzb3.zzc(), zza3);
                        if (zzb3.zzaf() && zza4 != null && !TextUtils.isEmpty((CharSequence) zza4.first)) {
                            zza2.zzh(zza((String) zza4.first, Long.toString(zzarVar.zzd)));
                            if (zza4.second != null) {
                                zza2.zza(((Boolean) zza4.second).booleanValue());
                            }
                        }
                    }
                    zzk().zzaa();
                    zzcd.zzg.zza zzc = zza2.zzc(Build.MODEL);
                    zzk().zzaa();
                    zzc.zzb(Build.VERSION.RELEASE).zzf((int) zzk().zze()).zzd(zzk().zzf());
                    if (!zzmb.zzb() || !zzs().zza(zzat.zzcp) || zza3.zze()) {
                        zza2.zzi(zza(zzb3.zzd(), Long.toString(zzarVar.zzd)));
                    }
                    if (!TextUtils.isEmpty(zzb3.zzi())) {
                        zza2.zzl(zzb3.zzi());
                    }
                    String zzc2 = zzb3.zzc();
                    List<zzky> zza5 = zzi().zza(zzc2);
                    Iterator<zzky> it = zza5.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zzkyVar = null;
                            break;
                        }
                        zzkyVar = it.next();
                        if ("_lte".equals(zzkyVar.zzc)) {
                            break;
                        }
                    }
                    if (zzkyVar == null || zzkyVar.zze == null) {
                        zzky zzkyVar2 = new zzky(zzc2, "auto", "_lte", zzl().currentTimeMillis(), 0L);
                        zza5.add(zzkyVar2);
                        zzi().zza(zzkyVar2);
                    }
                    zzkt f_ = f_();
                    f_.zzq().zzw().zza("Checking account type status for ad personalization signals");
                    if (f_.zzk().zzi()) {
                        String zzc3 = zzb3.zzc();
                        if (zzb3.zzaf() && f_.zzj().zze(zzc3)) {
                            f_.zzq().zzv().zza("Turning off ad personalization due to account type");
                            Iterator<zzky> it2 = zza5.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if ("_npa".equals(it2.next().zzc)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            zza5.add(new zzky(zzc3, "auto", "_npa", f_.zzl().currentTimeMillis(), 1L));
                        }
                    }
                    zzcd.zzk[] zzkVarArr = new zzcd.zzk[zza5.size()];
                    for (int i = 0; i < zza5.size(); i++) {
                        zzcd.zzk.zza zza6 = zzcd.zzk.zzj().zza(zza5.get(i).zzc).zza(zza5.get(i).zzd);
                        f_().zza(zza6, zza5.get(i).zze);
                        zzkVarArr[i] = (zzcd.zzk) ((com.google.android.gms.internal.measurement.zzhv) zza6.zzy());
                    }
                    zza2.zzb(Arrays.asList(zzkVarArr));
                    if (zznr.zzb() && zzs().zza(zzat.zzch) && zzs().zza(zzat.zzci)) {
                        zzfb zza7 = zzfb.zza(zzarVar);
                        zzo().zza(zza7.zzb, zzi().zzi(str));
                        zzo().zza(zza7, zzs().zza(str));
                        zzb = zza7.zzb;
                    } else {
                        zzb = zzarVar.zzb.zzb();
                    }
                    Bundle bundle2 = zzb;
                    bundle2.putLong("_c", 1L);
                    zzq().zzv().zza("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1L);
                    bundle2.putString("_o", zzarVar.zzc);
                    if (zzo().zze(zza2.zzj())) {
                        zzo().zza(bundle2, "_dbg", (Object) 1L);
                        zzo().zza(bundle2, "_r", (Object) 1L);
                    }
                    zzan zza8 = zzi().zza(str, zzarVar.zza);
                    if (zza8 == null) {
                        zzfVar = zzb3;
                        zzaVar = zza2;
                        zzaVar2 = zzb2;
                        bundle = bundle2;
                        bArr = null;
                        zza = new zzan(str, zzarVar.zza, 0L, 0L, zzarVar.zzd, 0L, null, null, null, null);
                        j = 0;
                    } else {
                        zzfVar = zzb3;
                        zzaVar = zza2;
                        zzaVar2 = zzb2;
                        bundle = bundle2;
                        bArr = null;
                        j = zza8.zzf;
                        zza = zza8.zza(zzarVar.zzd);
                    }
                    zzi().zza(zza);
                    zzak zzakVar = new zzak(this.zzy, zzarVar.zzc, str, zzarVar.zza, zzarVar.zzd, j, bundle);
                    zzcd.zzc.zza zzb4 = zzcd.zzc.zzj().zza(zzakVar.zzc).zza(zzakVar.zzb).zzb(zzakVar.zzd);
                    Iterator<String> it3 = zzakVar.zze.iterator();
                    while (it3.hasNext()) {
                        String next = it3.next();
                        zzcd.zze.zza zza9 = zzcd.zze.zzm().zza(next);
                        f_().zza(zza9, zzakVar.zze.zza(next));
                        zzb4.zza(zza9);
                    }
                    zzcd.zzg.zza zzaVar3 = zzaVar;
                    zzaVar3.zza(zzb4).zza(zzcd.zzh.zza().zza(zzcd.zzd.zza().zza(zza.zzc).zza(zzarVar.zza)));
                    zzaVar3.zzc(zzh().zza(zzfVar.zzc(), Collections.emptyList(), zzaVar3.zzd(), Long.valueOf(zzb4.zzf()), Long.valueOf(zzb4.zzf())));
                    if (zzb4.zze()) {
                        zzaVar3.zzb(zzb4.zzf()).zzc(zzb4.zzf());
                    }
                    long zzk = zzfVar.zzk();
                    if (zzk != 0) {
                        zzaVar3.zze(zzk);
                    }
                    long zzj = zzfVar.zzj();
                    if (zzj != 0) {
                        zzaVar3.zzd(zzj);
                    } else if (zzk != 0) {
                        zzaVar3.zzd(zzk);
                    }
                    zzfVar.zzv();
                    zzaVar3.zzg((int) zzfVar.zzs()).zzg(31049L).zza(zzl().currentTimeMillis()).zzb(Boolean.TRUE.booleanValue());
                    zzcd.zzf.zza zzaVar4 = zzaVar2;
                    zzaVar4.zza(zzaVar3);
                    zzf zzfVar2 = zzfVar;
                    zzfVar2.zza(zzaVar3.zzf());
                    zzfVar2.zzb(zzaVar3.zzg());
                    zzi().zza(zzfVar2);
                    zzi().b_();
                    try {
                        return f_().zzc(((zzcd.zzf) ((com.google.android.gms.internal.measurement.zzhv) zzaVar4.zzy())).zzbk());
                    } catch (IOException e) {
                        zzq().zze().zza("Data loss. Failed to bundle and serialize. appId", zzex.zza(str), e);
                        return bArr;
                    }
                }
            } catch (SecurityException e2) {
                zzq().zzv().zza("Resettable device id encryption failed", e2.getMessage());
                return new byte[0];
            } catch (SecurityException e3) {
                zzq().zzv().zza("app instance id encryption failed", e3.getMessage());
                return new byte[0];
            } finally {
                zzi().zzg();
            }
        }
    }

    private static String zza(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }
}
