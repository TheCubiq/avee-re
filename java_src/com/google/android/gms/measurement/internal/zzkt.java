package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzcd;
import com.google.android.gms.internal.measurement.zzmh;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzkt extends zzkm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkt(zzkp zzkpVar) {
        super(zzkpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkm
    protected final boolean zzd() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzcd.zzk.zza zzaVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzaVar.zza().zzb().zzc();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
        } else if (obj instanceof Long) {
            zzaVar.zzb(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
        } else {
            zzq().zze().zza("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzcd.zze.zza zzaVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzaVar.zza().zzb().zzc().zze();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
        } else if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
        } else if (zzmh.zzb() && zzs().zza(zzat.zzbz) && (obj instanceof Bundle[])) {
            zzaVar.zza(zza((Bundle[]) obj));
        } else {
            zzq().zze().zza("Ignoring invalid (type) event param value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcd.zze zza(zzcd.zzc zzcVar, String str) {
        for (zzcd.zze zzeVar : zzcVar.zza()) {
            if (zzeVar.zzb().equals(str)) {
                return zzeVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object zzb(zzcd.zzc zzcVar, String str) {
        zzcd.zze zza = zza(zzcVar, str);
        if (zza != null) {
            if (zza.zzc()) {
                return zza.zzd();
            }
            if (zza.zze()) {
                return Long.valueOf(zza.zzf());
            }
            if (zza.zzi()) {
                return Double.valueOf(zza.zzj());
            }
            if (zzmh.zzb() && zzs().zza(zzat.zzbz) && zza.zzl() > 0) {
                List<zzcd.zze> zzk = zza.zzk();
                ArrayList arrayList = new ArrayList();
                for (zzcd.zze zzeVar : zzk) {
                    if (zzeVar != null) {
                        Bundle bundle = new Bundle();
                        for (zzcd.zze zzeVar2 : zzeVar.zzk()) {
                            if (zzeVar2.zzc()) {
                                bundle.putString(zzeVar2.zzb(), zzeVar2.zzd());
                            } else if (zzeVar2.zze()) {
                                bundle.putLong(zzeVar2.zzb(), zzeVar2.zzf());
                            } else if (zzeVar2.zzi()) {
                                bundle.putDouble(zzeVar2.zzb(), zzeVar2.zzj());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcd.zzc zza(zzak zzakVar) {
        zzcd.zzc.zza zzb = zzcd.zzc.zzj().zzb(zzakVar.zzd);
        Iterator<String> it = zzakVar.zze.iterator();
        while (it.hasNext()) {
            String next = it.next();
            zzcd.zze.zza zza = zzcd.zze.zzm().zza(next);
            zza(zza, zzakVar.zze.zza(next));
            zzb.zza(zza);
        }
        return (zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzb.zzy());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzcd.zzc.zza zzaVar, String str, Object obj) {
        List<zzcd.zze> zza = zzaVar.zza();
        int i = 0;
        while (true) {
            if (i >= zza.size()) {
                i = -1;
                break;
            } else if (str.equals(zza.get(i).zzb())) {
                break;
            } else {
                i++;
            }
        }
        zzcd.zze.zza zza2 = zzcd.zze.zzm().zza(str);
        if (obj instanceof Long) {
            zza2.zza(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zza2.zzb((String) obj);
        } else if (obj instanceof Double) {
            zza2.zza(((Double) obj).doubleValue());
        } else if (zzmh.zzb() && zzs().zza(zzat.zzbz) && (obj instanceof Bundle[])) {
            zza2.zza(zza((Bundle[]) obj));
        }
        if (i >= 0) {
            zzaVar.zza(i, zza2);
        } else {
            zzaVar.zza(zza2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zza(zzcd.zzf zzfVar) {
        if (zzfVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (zzcd.zzg zzgVar : zzfVar.zza()) {
            if (zzgVar != null) {
                zza(sb, 1);
                sb.append("bundle {\n");
                if (zzgVar.zza()) {
                    zza(sb, 1, "protocol_version", Integer.valueOf(zzgVar.zzb()));
                }
                zza(sb, 1, "platform", zzgVar.zzq());
                if (zzgVar.zzz()) {
                    zza(sb, 1, "gmp_version", Long.valueOf(zzgVar.zzaa()));
                }
                if (zzgVar.zzab()) {
                    zza(sb, 1, "uploading_gmp_version", Long.valueOf(zzgVar.zzac()));
                }
                if (zzgVar.zzbc()) {
                    zza(sb, 1, "dynamite_version", Long.valueOf(zzgVar.zzbd()));
                }
                if (zzgVar.zzau()) {
                    zza(sb, 1, "config_version", Long.valueOf(zzgVar.zzav()));
                }
                zza(sb, 1, "gmp_app_id", zzgVar.zzam());
                zza(sb, 1, "admob_app_id", zzgVar.zzbb());
                zza(sb, 1, "app_id", zzgVar.zzx());
                zza(sb, 1, "app_version", zzgVar.zzy());
                if (zzgVar.zzar()) {
                    zza(sb, 1, "app_version_major", Integer.valueOf(zzgVar.zzas()));
                }
                zza(sb, 1, "firebase_instance_id", zzgVar.zzaq());
                if (zzgVar.zzah()) {
                    zza(sb, 1, "dev_cert_hash", Long.valueOf(zzgVar.zzai()));
                }
                zza(sb, 1, "app_store", zzgVar.zzw());
                if (zzgVar.zzg()) {
                    zza(sb, 1, "upload_timestamp_millis", Long.valueOf(zzgVar.zzh()));
                }
                if (zzgVar.zzi()) {
                    zza(sb, 1, "start_timestamp_millis", Long.valueOf(zzgVar.zzj()));
                }
                if (zzgVar.zzk()) {
                    zza(sb, 1, "end_timestamp_millis", Long.valueOf(zzgVar.zzl()));
                }
                if (zzgVar.zzm()) {
                    zza(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgVar.zzn()));
                }
                if (zzgVar.zzo()) {
                    zza(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgVar.zzp()));
                }
                zza(sb, 1, "app_instance_id", zzgVar.zzag());
                zza(sb, 1, "resettable_device_id", zzgVar.zzad());
                zza(sb, 1, "device_id", zzgVar.zzat());
                zza(sb, 1, "ds_id", zzgVar.zzay());
                if (zzgVar.zzae()) {
                    zza(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzgVar.zzaf()));
                }
                zza(sb, 1, "os_version", zzgVar.zzr());
                zza(sb, 1, "device_model", zzgVar.zzs());
                zza(sb, 1, "user_default_language", zzgVar.zzt());
                if (zzgVar.zzu()) {
                    zza(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzgVar.zzv()));
                }
                if (zzgVar.zzaj()) {
                    zza(sb, 1, "bundle_sequential_index", Integer.valueOf(zzgVar.zzak()));
                }
                if (zzgVar.zzan()) {
                    zza(sb, 1, "service_upload", Boolean.valueOf(zzgVar.zzao()));
                }
                zza(sb, 1, "health_monitor", zzgVar.zzal());
                if (!zzs().zza(zzat.zzcf) && zzgVar.zzaw() && zzgVar.zzax() != 0) {
                    zza(sb, 1, "android_id", Long.valueOf(zzgVar.zzax()));
                }
                if (zzgVar.zzaz()) {
                    zza(sb, 1, "retry_counter", Integer.valueOf(zzgVar.zzba()));
                }
                if (zzgVar.zzbf()) {
                    zza(sb, 1, "consent_signals", zzgVar.zzbg());
                }
                List<zzcd.zzk> zze = zzgVar.zze();
                if (zze != null) {
                    for (zzcd.zzk zzkVar : zze) {
                        if (zzkVar != null) {
                            zza(sb, 2);
                            sb.append("user_property {\n");
                            zza(sb, 2, "set_timestamp_millis", zzkVar.zza() ? Long.valueOf(zzkVar.zzb()) : null);
                            zza(sb, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, zzn().zzc(zzkVar.zzc()));
                            zza(sb, 2, "string_value", zzkVar.zze());
                            zza(sb, 2, "int_value", zzkVar.zzf() ? Long.valueOf(zzkVar.zzg()) : null);
                            zza(sb, 2, "double_value", zzkVar.zzh() ? Double.valueOf(zzkVar.zzi()) : null);
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzcd.zza> zzap = zzgVar.zzap();
                String zzx = zzgVar.zzx();
                if (zzap != null) {
                    for (zzcd.zza zzaVar : zzap) {
                        if (zzaVar != null) {
                            zza(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzaVar.zza()) {
                                zza(sb, 2, "audience_id", Integer.valueOf(zzaVar.zzb()));
                            }
                            if (zzaVar.zzf()) {
                                zza(sb, 2, "new_audience", Boolean.valueOf(zzaVar.zzg()));
                            }
                            zza(sb, 2, "current_data", zzaVar.zzc(), zzx);
                            if (zzaVar.zzd()) {
                                zza(sb, 2, "previous_data", zzaVar.zze(), zzx);
                            }
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzcd.zzc> zzc = zzgVar.zzc();
                if (zzc != null) {
                    for (zzcd.zzc zzcVar : zzc) {
                        if (zzcVar != null) {
                            zza(sb, 2);
                            sb.append("event {\n");
                            zza(sb, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, zzn().zza(zzcVar.zzc()));
                            if (zzcVar.zzd()) {
                                zza(sb, 2, "timestamp_millis", Long.valueOf(zzcVar.zze()));
                            }
                            if (zzcVar.zzf()) {
                                zza(sb, 2, "previous_timestamp_millis", Long.valueOf(zzcVar.zzg()));
                            }
                            if (zzcVar.zzh()) {
                                zza(sb, 2, "count", Integer.valueOf(zzcVar.zzi()));
                            }
                            if (zzcVar.zzb() != 0) {
                                zza(sb, 2, zzcVar.zza());
                            }
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                zza(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zza(zzbv.zzb zzbVar) {
        if (zzbVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzbVar.zza()) {
            zza(sb, 0, "filter_id", Integer.valueOf(zzbVar.zzb()));
        }
        zza(sb, 0, "event_name", zzn().zza(zzbVar.zzc()));
        String zza = zza(zzbVar.zzh(), zzbVar.zzi(), zzbVar.zzk());
        if (!zza.isEmpty()) {
            zza(sb, 0, "filter_type", zza);
        }
        if (zzbVar.zzf()) {
            zza(sb, 1, "event_count_filter", zzbVar.zzg());
        }
        if (zzbVar.zze() > 0) {
            sb.append("  filters {\n");
            for (zzbv.zzc zzcVar : zzbVar.zzd()) {
                zza(sb, 2, zzcVar);
            }
        }
        zza(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zza(zzbv.zze zzeVar) {
        if (zzeVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzeVar.zza()) {
            zza(sb, 0, "filter_id", Integer.valueOf(zzeVar.zzb()));
        }
        zza(sb, 0, "property_name", zzn().zzc(zzeVar.zzc()));
        String zza = zza(zzeVar.zze(), zzeVar.zzf(), zzeVar.zzh());
        if (!zza.isEmpty()) {
            zza(sb, 0, "filter_type", zza);
        }
        zza(sb, 1, zzeVar.zzd());
        sb.append("}\n");
        return sb.toString();
    }

    private static String zza(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private final void zza(StringBuilder sb, int i, List<zzcd.zze> list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        for (zzcd.zze zzeVar : list) {
            if (zzeVar != null) {
                zza(sb, i2);
                sb.append("param {\n");
                if (zzmh.zzb() && zzs().zza(zzat.zzbx)) {
                    zza(sb, i2, AppMeasurementSdk.ConditionalUserProperty.NAME, zzeVar.zza() ? zzn().zzb(zzeVar.zzb()) : null);
                    zza(sb, i2, "string_value", zzeVar.zzc() ? zzeVar.zzd() : null);
                    zza(sb, i2, "int_value", zzeVar.zze() ? Long.valueOf(zzeVar.zzf()) : null);
                    zza(sb, i2, "double_value", zzeVar.zzi() ? Double.valueOf(zzeVar.zzj()) : null);
                    if (zzeVar.zzl() > 0) {
                        zza(sb, i2, zzeVar.zzk());
                    }
                } else {
                    zza(sb, i2, AppMeasurementSdk.ConditionalUserProperty.NAME, zzn().zzb(zzeVar.zzb()));
                    zza(sb, i2, "string_value", zzeVar.zzd());
                    zza(sb, i2, "int_value", zzeVar.zze() ? Long.valueOf(zzeVar.zzf()) : null);
                    zza(sb, i2, "double_value", zzeVar.zzi() ? Double.valueOf(zzeVar.zzj()) : null);
                }
                zza(sb, i2);
                sb.append("}\n");
            }
        }
    }

    private static void zza(StringBuilder sb, int i, String str, zzcd.zzi zziVar, String str2) {
        if (zziVar == null) {
            return;
        }
        zza(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zziVar.zzd() != 0) {
            zza(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : zziVar.zzc()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (zziVar.zzb() != 0) {
            zza(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : zziVar.zza()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (zziVar.zzf() != 0) {
            zza(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (zzcd.zzb zzbVar : zziVar.zze()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(zzbVar.zza() ? Integer.valueOf(zzbVar.zzb()) : null);
                sb.append(":");
                sb.append(zzbVar.zzc() ? Long.valueOf(zzbVar.zzd()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (zziVar.zzh() != 0) {
            zza(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (zzcd.zzj zzjVar : zziVar.zzg()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(zzjVar.zza() ? Integer.valueOf(zzjVar.zzb()) : null);
                sb.append(": [");
                int i10 = 0;
                for (Long l3 : zzjVar.zzc()) {
                    long longValue = l3.longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        zza(sb, 3);
        sb.append("}\n");
    }

    private static void zza(StringBuilder sb, int i, String str, zzbv.zzd zzdVar) {
        if (zzdVar == null) {
            return;
        }
        zza(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (zzdVar.zza()) {
            zza(sb, i, "comparison_type", zzdVar.zzb().name());
        }
        if (zzdVar.zzc()) {
            zza(sb, i, "match_as_float", Boolean.valueOf(zzdVar.zzd()));
        }
        if (zzdVar.zze()) {
            zza(sb, i, "comparison_value", zzdVar.zzf());
        }
        if (zzdVar.zzg()) {
            zza(sb, i, "min_comparison_value", zzdVar.zzh());
        }
        if (zzdVar.zzi()) {
            zza(sb, i, "max_comparison_value", zzdVar.zzj());
        }
        zza(sb, i);
        sb.append("}\n");
    }

    private final void zza(StringBuilder sb, int i, zzbv.zzc zzcVar) {
        if (zzcVar == null) {
            return;
        }
        zza(sb, i);
        sb.append("filter {\n");
        if (zzcVar.zze()) {
            zza(sb, i, "complement", Boolean.valueOf(zzcVar.zzf()));
        }
        if (zzcVar.zzg()) {
            zza(sb, i, "param_name", zzn().zzb(zzcVar.zzh()));
        }
        if (zzcVar.zza()) {
            int i2 = i + 1;
            zzbv.zzf zzb = zzcVar.zzb();
            if (zzb != null) {
                zza(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (zzb.zza()) {
                    zza(sb, i2, "match_type", zzb.zzb().name());
                }
                if (zzb.zzc()) {
                    zza(sb, i2, "expression", zzb.zzd());
                }
                if (zzb.zze()) {
                    zza(sb, i2, "case_sensitive", Boolean.valueOf(zzb.zzf()));
                }
                if (zzb.zzh() > 0) {
                    zza(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str : zzb.zzg()) {
                        zza(sb, i2 + 2);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                zza(sb, i2);
                sb.append("}\n");
            }
        }
        if (zzcVar.zzc()) {
            zza(sb, i + 1, "number_filter", zzcVar.zzd());
        }
        zza(sb, i);
        sb.append("}\n");
    }

    private static void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zza(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T extends Parcelable> T zza(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            zzq().zze().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(zzar zzarVar, zzn zznVar) {
        Preconditions.checkNotNull(zzarVar);
        Preconditions.checkNotNull(zznVar);
        return (TextUtils.isEmpty(zznVar.zzb) && TextUtils.isEmpty(zznVar.zzr)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Long> zza(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Long> zza(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                zzq().zzh().zza("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    zzq().zzh().zza("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ (-1))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(zzl().currentTimeMillis() - j) > j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        zzo().zzc();
        MessageDigest zzh = zzkx.zzh();
        if (zzh == null) {
            zzq().zze().zza("Failed to get MD5");
            return 0L;
        }
        return zzkx.zza(zzh.digest(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] zzb(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            zzq().zze().zza("Failed to ungzip content", e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] zzc(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            zzq().zze().zza("Failed to gzip content", e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Integer> zze() {
        Map<String, String> zza = zzat.zza(this.zza.zzm());
        if (zza == null || zza.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = zzat.zzao.zza(null).intValue();
        for (Map.Entry<String, String> entry : zza.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            zzq().zzh().zza("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    zzq().zzh().zza("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <Builder extends com.google.android.gms.internal.measurement.zzjf> Builder zza(Builder builder, byte[] bArr) throws com.google.android.gms.internal.measurement.zzig {
        com.google.android.gms.internal.measurement.zzhi zzb = com.google.android.gms.internal.measurement.zzhi.zzb();
        if (zzb != null) {
            return (Builder) builder.zza(bArr, zzb);
        }
        return (Builder) builder.zza(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzcd.zzg.zza zzaVar, String str) {
        if (zzaVar == null) {
            return -1;
        }
        for (int i = 0; i < zzaVar.zze(); i++) {
            if (str.equals(zzaVar.zzd(i).zzc())) {
                return i;
            }
        }
        return -1;
    }

    private static List<zzcd.zze> zza(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                zzcd.zze.zza zzm = zzcd.zze.zzm();
                for (String str : bundle.keySet()) {
                    zzcd.zze.zza zza = zzcd.zze.zzm().zza(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        zza.zza(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        zza.zzb((String) obj);
                    } else if (obj instanceof Double) {
                        zza.zza(((Double) obj).doubleValue());
                    }
                    zzm.zza(zza);
                }
                if (zzm.zzd() > 0) {
                    arrayList.add((zzcd.zze) ((com.google.android.gms.internal.measurement.zzhv) zzm.zzy()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final /* bridge */ /* synthetic */ zzjv zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final /* bridge */ /* synthetic */ zzkt f_() {
        return super.f_();
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final /* bridge */ /* synthetic */ zzo zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final /* bridge */ /* synthetic */ zzac zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final /* bridge */ /* synthetic */ zzfv zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
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
}
