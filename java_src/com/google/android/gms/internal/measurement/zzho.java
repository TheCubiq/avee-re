package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzho<T extends zzhq<T>> {
    private static final zzho zzd = new zzho(true);
    final zzka<T, Object> zza;
    private boolean zzb;
    private boolean zzc;

    private zzho() {
        this.zza = zzka.zza(16);
    }

    private zzho(boolean z) {
        this(zzka.zza(0));
        zzb();
    }

    private zzho(zzka<T, Object> zzkaVar) {
        this.zza = zzkaVar;
        zzb();
    }

    public static <T extends zzhq<T>> zzho<T> zza() {
        return zzd;
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        this.zza.zza();
        this.zzb = true;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzho) {
            return this.zza.equals(((zzho) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zzc) {
            return new zzim(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> zze() {
        if (this.zzc) {
            return new zzim(this.zza.zze().iterator());
        }
        return this.zza.zze().iterator();
    }

    private final Object zza(T t) {
        Object obj = this.zza.get(t);
        if (obj instanceof zzih) {
            zzih zzihVar = (zzih) obj;
            return zzih.zza();
        }
        return obj;
    }

    private final void zzb(T t, Object obj) {
        if (t.zzd()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(t.zzb(), obj2);
            }
            obj = arrayList;
        } else {
            zza(t.zzb(), obj);
        }
        if (obj instanceof zzih) {
            this.zzc = true;
        }
        this.zza.zza((zzka<T, Object>) t, (T) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzia) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzih) == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzle zzleVar, Object obj) {
        zzhx.zza(obj);
        boolean z = true;
        switch (zzhn.zza[zzleVar.zza().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof zzgm)) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof zzjg)) {
                    break;
                }
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public final boolean zzf() {
        for (int i = 0; i < this.zza.zzc(); i++) {
            if (!zza((Map.Entry) this.zza.zzb(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.zza.zzd()) {
            if (!zza((Map.Entry) entry)) {
                return false;
            }
        }
        return true;
    }

    private static <T extends zzhq<T>> boolean zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() == zzlh.MESSAGE) {
            if (key.zzd()) {
                for (zzjg zzjgVar : (List) entry.getValue()) {
                    if (!zzjgVar.zzbn()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzjg) {
                    if (!((zzjg) value).zzbn()) {
                        return false;
                    }
                } else if (value instanceof zzih) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzho<T> zzhoVar) {
        for (int i = 0; i < zzhoVar.zza.zzc(); i++) {
            zzb(zzhoVar.zza.zzb(i));
        }
        for (Map.Entry<T, Object> entry : zzhoVar.zza.zzd()) {
            zzb(entry);
        }
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzjl) {
            return ((zzjl) obj).zza();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        zzjg zzy;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzih) {
            zzih zzihVar = (zzih) value;
            value = zzih.zza();
        }
        if (key.zzd()) {
            Object zza = zza((zzho<T>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) zza).add(zza(obj));
            }
            this.zza.zza((zzka<T, Object>) key, (T) zza);
        } else if (key.zzc() == zzlh.MESSAGE) {
            Object zza2 = zza((zzho<T>) key);
            if (zza2 == null) {
                this.zza.zza((zzka<T, Object>) key, (T) zza(value));
                return;
            }
            if (zza2 instanceof zzjl) {
                zzy = key.zza((zzjl) zza2, (zzjl) value);
            } else {
                zzy = key.zza(((zzjg) zza2).zzbt(), (zzjg) value).zzy();
            }
            this.zza.zza((zzka<T, Object>) key, (T) zzy);
        } else {
            this.zza.zza((zzka<T, Object>) key, (T) zza(value));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzhf zzhfVar, zzle zzleVar, int i, Object obj) throws IOException {
        if (zzleVar == zzle.zzj) {
            zzjg zzjgVar = (zzjg) obj;
            zzhx.zza(zzjgVar);
            zzhfVar.zza(i, 3);
            zzjgVar.zza(zzhfVar);
            zzhfVar.zza(i, 4);
            return;
        }
        zzhfVar.zza(i, zzleVar.zzb());
        switch (zzhn.zzb[zzleVar.ordinal()]) {
            case 1:
                zzhfVar.zza(((Double) obj).doubleValue());
                return;
            case 2:
                zzhfVar.zza(((Float) obj).floatValue());
                return;
            case 3:
                zzhfVar.zza(((Long) obj).longValue());
                return;
            case 4:
                zzhfVar.zza(((Long) obj).longValue());
                return;
            case 5:
                zzhfVar.zza(((Integer) obj).intValue());
                return;
            case 6:
                zzhfVar.zzc(((Long) obj).longValue());
                return;
            case 7:
                zzhfVar.zzd(((Integer) obj).intValue());
                return;
            case 8:
                zzhfVar.zza(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzjg) obj).zza(zzhfVar);
                return;
            case 10:
                zzhfVar.zza((zzjg) obj);
                return;
            case 11:
                if (obj instanceof zzgm) {
                    zzhfVar.zza((zzgm) obj);
                    return;
                } else {
                    zzhfVar.zza((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzgm) {
                    zzhfVar.zza((zzgm) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzhfVar.zzb(bArr, 0, bArr.length);
                return;
            case 13:
                zzhfVar.zzb(((Integer) obj).intValue());
                return;
            case 14:
                zzhfVar.zzd(((Integer) obj).intValue());
                return;
            case 15:
                zzhfVar.zzc(((Long) obj).longValue());
                return;
            case 16:
                zzhfVar.zzc(((Integer) obj).intValue());
                return;
            case 17:
                zzhfVar.zzb(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzia) {
                    zzhfVar.zza(((zzia) obj).zza());
                    return;
                } else {
                    zzhfVar.zza(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzg() {
        int i = 0;
        for (int i2 = 0; i2 < this.zza.zzc(); i2++) {
            i += zzc(this.zza.zzb(i2));
        }
        for (Map.Entry<T, Object> entry : this.zza.zzd()) {
            i += zzc(entry);
        }
        return i;
    }

    private static int zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzlh.MESSAGE && !key.zzd() && !key.zze()) {
            if (value instanceof zzih) {
                return zzhf.zzb(entry.getKey().zza(), (zzih) value);
            }
            return zzhf.zzb(entry.getKey().zza(), (zzjg) value);
        }
        return zza((zzhq<?>) key, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzle zzleVar, int i, Object obj) {
        int zze = zzhf.zze(i);
        if (zzleVar == zzle.zzj) {
            zzhx.zza((zzjg) obj);
            zze <<= 1;
        }
        return zze + zzb(zzleVar, obj);
    }

    private static int zzb(zzle zzleVar, Object obj) {
        switch (zzhn.zzb[zzleVar.ordinal()]) {
            case 1:
                return zzhf.zzb(((Double) obj).doubleValue());
            case 2:
                return zzhf.zzb(((Float) obj).floatValue());
            case 3:
                return zzhf.zzd(((Long) obj).longValue());
            case 4:
                return zzhf.zze(((Long) obj).longValue());
            case 5:
                return zzhf.zzf(((Integer) obj).intValue());
            case 6:
                return zzhf.zzg(((Long) obj).longValue());
            case 7:
                return zzhf.zzi(((Integer) obj).intValue());
            case 8:
                return zzhf.zzb(((Boolean) obj).booleanValue());
            case 9:
                return zzhf.zzc((zzjg) obj);
            case 10:
                if (obj instanceof zzih) {
                    return zzhf.zza((zzih) obj);
                }
                return zzhf.zzb((zzjg) obj);
            case 11:
                if (obj instanceof zzgm) {
                    return zzhf.zzb((zzgm) obj);
                }
                return zzhf.zzb((String) obj);
            case 12:
                if (obj instanceof zzgm) {
                    return zzhf.zzb((zzgm) obj);
                }
                return zzhf.zzb((byte[]) obj);
            case 13:
                return zzhf.zzg(((Integer) obj).intValue());
            case 14:
                return zzhf.zzj(((Integer) obj).intValue());
            case 15:
                return zzhf.zzh(((Long) obj).longValue());
            case 16:
                return zzhf.zzh(((Integer) obj).intValue());
            case 17:
                return zzhf.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzia) {
                    return zzhf.zzk(((zzia) obj).zza());
                }
                return zzhf.zzk(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zza(zzhq<?> zzhqVar, Object obj) {
        zzle zzb = zzhqVar.zzb();
        int zza = zzhqVar.zza();
        if (zzhqVar.zzd()) {
            int i = 0;
            if (zzhqVar.zze()) {
                for (Object obj2 : (List) obj) {
                    i += zzb(zzb, obj2);
                }
                return zzhf.zze(zza) + i + zzhf.zzl(i);
            }
            for (Object obj3 : (List) obj) {
                i += zza(zzb, zza, obj3);
            }
            return i;
        }
        return zza(zzb, zza, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzho zzhoVar = new zzho();
        for (int i = 0; i < this.zza.zzc(); i++) {
            Map.Entry<T, Object> zzb = this.zza.zzb(i);
            zzhoVar.zzb((zzho) zzb.getKey(), zzb.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzd()) {
            zzhoVar.zzb((zzho) entry.getKey(), entry.getValue());
        }
        zzhoVar.zzc = this.zzc;
        return zzhoVar;
    }
}
