package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzcd;
import com.google.android.gms.internal.measurement.zzms;
import java.util.HashSet;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzs extends zzv {
    private zzbv.zzb zzg;
    private final /* synthetic */ zzo zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzo zzoVar, String str, int i, zzbv.zzb zzbVar) {
        super(str, i);
        this.zzh = zzoVar;
        this.zzg = zzbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzv
    public final boolean zzb() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzv
    public final int zza() {
        return this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzv
    public final boolean zzc() {
        return this.zzg.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010f, code lost:
        if (r6.booleanValue() == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(Long l, Long l2, zzcd.zzc zzcVar, long j, zzan zzanVar, boolean z) {
        Boolean zza;
        Boolean bool = false;
        boolean z2 = zzms.zzb() && this.zzh.zzs().zzd(this.zza, zzat.zzbc);
        long j2 = this.zzg.zzk() ? zzanVar.zze : j;
        if (this.zzh.zzq().zza(2)) {
            this.zzh.zzq().zzw().zza("Evaluating filter. audience, filter, event", Integer.valueOf(this.zzb), this.zzg.zza() ? Integer.valueOf(this.zzg.zzb()) : null, this.zzh.zzn().zza(this.zzg.zzc()));
            this.zzh.zzq().zzw().zza("Filter definition", this.zzh.f_().zza(this.zzg));
        }
        if (!this.zzg.zza() || this.zzg.zzb() > 256) {
            this.zzh.zzq().zzh().zza("Invalid event filter ID. appId, id", zzex.zza(this.zza), String.valueOf(this.zzg.zza() ? Integer.valueOf(this.zzg.zzb()) : null));
            return false;
        }
        boolean z3 = this.zzg.zzh() || this.zzg.zzi() || this.zzg.zzk();
        if (z && !z3) {
            this.zzh.zzq().zzw().zza("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzb), this.zzg.zza() ? Integer.valueOf(this.zzg.zzb()) : null);
            return true;
        }
        zzbv.zzb zzbVar = this.zzg;
        String zzc = zzcVar.zzc();
        if (zzbVar.zzf()) {
            Boolean zza2 = zza(j2, zzbVar.zzg());
            if (zza2 != null) {
            }
            bool = null;
            this.zzh.zzq().zzw().zza("Event filter result", bool != null ? "null" : bool);
            if (bool != null) {
                return false;
            }
            this.zzc = true;
            if (bool.booleanValue()) {
                this.zzd = true;
                if (z3 && zzcVar.zzd()) {
                    Long valueOf = Long.valueOf(zzcVar.zze());
                    if (this.zzg.zzi()) {
                        if (z2 && this.zzg.zzf()) {
                            valueOf = l;
                        }
                        this.zzf = valueOf;
                    } else {
                        if (z2 && this.zzg.zzf()) {
                            valueOf = l2;
                        }
                        this.zze = valueOf;
                    }
                }
                return true;
            }
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator<zzbv.zzc> it = zzbVar.zzd().iterator();
        while (true) {
            if (it.hasNext()) {
                zzbv.zzc next = it.next();
                if (next.zzh().isEmpty()) {
                    this.zzh.zzq().zzh().zza("null or empty param name in filter. event", this.zzh.zzn().zza(zzc));
                    break;
                }
                hashSet.add(next.zzh());
            } else {
                ArrayMap arrayMap = new ArrayMap();
                Iterator<zzcd.zze> it2 = zzcVar.zza().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zzcd.zze next2 = it2.next();
                        if (hashSet.contains(next2.zzb())) {
                            if (next2.zze()) {
                                arrayMap.put(next2.zzb(), next2.zze() ? Long.valueOf(next2.zzf()) : null);
                            } else if (next2.zzi()) {
                                arrayMap.put(next2.zzb(), next2.zzi() ? Double.valueOf(next2.zzj()) : null);
                            } else if (next2.zzc()) {
                                arrayMap.put(next2.zzb(), next2.zzd());
                            } else {
                                this.zzh.zzq().zzh().zza("Unknown value for param. event, param", this.zzh.zzn().zza(zzc), this.zzh.zzn().zzb(next2.zzb()));
                                break;
                            }
                        }
                    } else {
                        Iterator<zzbv.zzc> it3 = zzbVar.zzd().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                zzbv.zzc next3 = it3.next();
                                boolean z4 = next3.zze() && next3.zzf();
                                String zzh = next3.zzh();
                                if (zzh.isEmpty()) {
                                    this.zzh.zzq().zzh().zza("Event has empty param name. event", this.zzh.zzn().zza(zzc));
                                    break;
                                }
                                Object obj = arrayMap.get(zzh);
                                if (obj instanceof Long) {
                                    if (!next3.zzc()) {
                                        this.zzh.zzq().zzh().zza("No number filter for long param. event, param", this.zzh.zzn().zza(zzc), this.zzh.zzn().zzb(zzh));
                                        break;
                                    }
                                    Boolean zza3 = zza(((Long) obj).longValue(), next3.zzd());
                                    if (zza3 == null) {
                                        break;
                                    } else if (zza3.booleanValue() == z4) {
                                        break;
                                    }
                                } else if (obj instanceof Double) {
                                    if (!next3.zzc()) {
                                        this.zzh.zzq().zzh().zza("No number filter for double param. event, param", this.zzh.zzn().zza(zzc), this.zzh.zzn().zzb(zzh));
                                        break;
                                    }
                                    Boolean zza4 = zza(((Double) obj).doubleValue(), next3.zzd());
                                    if (zza4 == null) {
                                        break;
                                    } else if (zza4.booleanValue() == z4) {
                                        break;
                                    }
                                } else if (obj instanceof String) {
                                    if (next3.zza()) {
                                        zza = zza((String) obj, next3.zzb(), this.zzh.zzq());
                                    } else if (next3.zzc()) {
                                        String str = (String) obj;
                                        if (zzkt.zza(str)) {
                                            zza = zza(str, next3.zzd());
                                        } else {
                                            this.zzh.zzq().zzh().zza("Invalid param value for number filter. event, param", this.zzh.zzn().zza(zzc), this.zzh.zzn().zzb(zzh));
                                            break;
                                        }
                                    } else {
                                        this.zzh.zzq().zzh().zza("No filter for String param. event, param", this.zzh.zzn().zza(zzc), this.zzh.zzn().zzb(zzh));
                                        break;
                                    }
                                    if (zza == null) {
                                        break;
                                    } else if (zza.booleanValue() == z4) {
                                        break;
                                    }
                                } else if (obj == null) {
                                    this.zzh.zzq().zzw().zza("Missing param for filter. event, param", this.zzh.zzn().zza(zzc), this.zzh.zzn().zzb(zzh));
                                } else {
                                    this.zzh.zzq().zzh().zza("Unknown param type. event, param", this.zzh.zzn().zza(zzc), this.zzh.zzn().zzb(zzh));
                                }
                            } else {
                                bool = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        this.zzh.zzq().zzw().zza("Event filter result", bool != null ? "null" : bool);
        if (bool != null) {
        }
    }
}
