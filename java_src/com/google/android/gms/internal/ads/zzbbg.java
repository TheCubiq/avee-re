package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
final class zzbbg<FieldDescriptorType extends zzbbi<FieldDescriptorType>> {
    private static final zzbbg zzdra = new zzbbg(true);
    private boolean zzdqy;
    private boolean zzdqz = false;
    private final zzbdp<FieldDescriptorType, Object> zzdqx = zzbdp.zzcx(16);

    private zzbbg() {
    }

    private zzbbg(boolean z) {
        zzaaz();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzbes zzbesVar, int i, Object obj) {
        int zzcd = zzbav.zzcd(i);
        if (zzbesVar == zzbes.zzeaj) {
            zzbbq.zzi((zzbcu) obj);
            zzcd <<= 1;
        }
        return zzcd + zzb(zzbesVar, obj);
    }

    private final Object zza(FieldDescriptorType fielddescriptortype) {
        Object obj = this.zzdqx.get(fielddescriptortype);
        return obj instanceof zzbbx ? zzbbx.zzadu() : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzbav zzbavVar, zzbes zzbesVar, int i, Object obj) throws IOException {
        if (zzbesVar == zzbes.zzeaj) {
            zzbcu zzbcuVar = (zzbcu) obj;
            zzbbq.zzi(zzbcuVar);
            zzbavVar.zzl(i, 3);
            zzbcuVar.zzb(zzbavVar);
            zzbavVar.zzl(i, 4);
            return;
        }
        zzbavVar.zzl(i, zzbesVar.zzagm());
        switch (zzbbh.zzdql[zzbesVar.ordinal()]) {
            case 1:
                zzbavVar.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzbavVar.zzb(((Float) obj).floatValue());
                return;
            case 3:
                zzbavVar.zzm(((Long) obj).longValue());
                return;
            case 4:
                zzbavVar.zzm(((Long) obj).longValue());
                return;
            case 5:
                zzbavVar.zzbz(((Integer) obj).intValue());
                return;
            case 6:
                zzbavVar.zzo(((Long) obj).longValue());
                return;
            case 7:
                zzbavVar.zzcc(((Integer) obj).intValue());
                return;
            case 8:
                zzbavVar.zzap(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzbcu) obj).zzb(zzbavVar);
                return;
            case 10:
                zzbavVar.zze((zzbcu) obj);
                return;
            case 11:
                if (obj instanceof zzbah) {
                    zzbavVar.zzan((zzbah) obj);
                    return;
                } else {
                    zzbavVar.zzen((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzbah) {
                    zzbavVar.zzan((zzbah) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzbavVar.zze(bArr, 0, bArr.length);
                return;
            case 13:
                zzbavVar.zzca(((Integer) obj).intValue());
                return;
            case 14:
                zzbavVar.zzcc(((Integer) obj).intValue());
                return;
            case 15:
                zzbavVar.zzo(((Long) obj).longValue());
                return;
            case 16:
                zzbavVar.zzcb(((Integer) obj).intValue());
                return;
            case 17:
                zzbavVar.zzn(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzbbr) {
                    zzbavVar.zzbz(((zzbbr) obj).zzhq());
                    return;
                } else {
                    zzbavVar.zzbz(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    private final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.zzada()) {
            zza(fielddescriptortype.zzacy(), obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(fielddescriptortype.zzacy(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzbbx) {
            this.zzdqz = true;
        }
        this.zzdqx.zza((zzbdp<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzbbr) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzbbx) == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzbes zzbesVar, Object obj) {
        zzbbq.checkNotNull(obj);
        boolean z = true;
        boolean z2 = false;
        switch (zzbbh.zzdrb[zzbesVar.zzagl().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                z2 = z;
                if (z2) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                return;
            case 2:
                z = obj instanceof Long;
                z2 = z;
                if (z2) {
                }
                break;
            case 3:
                z = obj instanceof Float;
                z2 = z;
                if (z2) {
                }
                break;
            case 4:
                z = obj instanceof Double;
                z2 = z;
                if (z2) {
                }
                break;
            case 5:
                z = obj instanceof Boolean;
                z2 = z;
                if (z2) {
                }
                break;
            case 6:
                z = obj instanceof String;
                z2 = z;
                if (z2) {
                }
                break;
            case 7:
                if (!(obj instanceof zzbah)) {
                    break;
                }
                z2 = z;
                if (z2) {
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                z2 = z;
                if (z2) {
                }
                break;
            case 9:
                if (!(obj instanceof zzbcu)) {
                    break;
                }
                z2 = z;
                if (z2) {
                }
                break;
            default:
                if (z2) {
                }
                break;
        }
    }

    public static <T extends zzbbi<T>> zzbbg<T> zzacv() {
        return zzdra;
    }

    private static int zzb(zzbbi<?> zzbbiVar, Object obj) {
        zzbes zzacy = zzbbiVar.zzacy();
        int zzhq = zzbbiVar.zzhq();
        if (zzbbiVar.zzada()) {
            int i = 0;
            List<Object> list = (List) obj;
            if (zzbbiVar.zzadb()) {
                for (Object obj2 : list) {
                    i += zzb(zzacy, obj2);
                }
                return zzbav.zzcd(zzhq) + i + zzbav.zzcl(i);
            }
            for (Object obj3 : list) {
                i += zza(zzacy, zzhq, obj3);
            }
            return i;
        }
        return zza(zzacy, zzhq, obj);
    }

    private static int zzb(zzbes zzbesVar, Object obj) {
        switch (zzbbh.zzdql[zzbesVar.ordinal()]) {
            case 1:
                return zzbav.zzc(((Double) obj).doubleValue());
            case 2:
                return zzbav.zzc(((Float) obj).floatValue());
            case 3:
                return zzbav.zzp(((Long) obj).longValue());
            case 4:
                return zzbav.zzq(((Long) obj).longValue());
            case 5:
                return zzbav.zzce(((Integer) obj).intValue());
            case 6:
                return zzbav.zzs(((Long) obj).longValue());
            case 7:
                return zzbav.zzch(((Integer) obj).intValue());
            case 8:
                return zzbav.zzaq(((Boolean) obj).booleanValue());
            case 9:
                return zzbav.zzg((zzbcu) obj);
            case 10:
                return obj instanceof zzbbx ? zzbav.zza((zzbbx) obj) : zzbav.zzf((zzbcu) obj);
            case 11:
                return obj instanceof zzbah ? zzbav.zzao((zzbah) obj) : zzbav.zzeo((String) obj);
            case 12:
                return obj instanceof zzbah ? zzbav.zzao((zzbah) obj) : zzbav.zzr((byte[]) obj);
            case 13:
                return zzbav.zzcf(((Integer) obj).intValue());
            case 14:
                return zzbav.zzci(((Integer) obj).intValue());
            case 15:
                return zzbav.zzt(((Long) obj).longValue());
            case 16:
                return zzbav.zzcg(((Integer) obj).intValue());
            case 17:
                return zzbav.zzr(((Long) obj).longValue());
            case 18:
                return obj instanceof zzbbr ? zzbav.zzcj(((zzbbr) obj).zzhq()) : zzbav.zzcj(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean zzb(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.zzacz() == zzbex.MESSAGE) {
            boolean zzada = key.zzada();
            Object value = entry.getValue();
            if (zzada) {
                for (zzbcu zzbcuVar : (List) value) {
                    if (!zzbcuVar.isInitialized()) {
                        return false;
                    }
                }
            } else if (!(value instanceof zzbcu)) {
                if (value instanceof zzbbx) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            } else if (!((zzbcu) value).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    private final void zzc(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzbbx) {
            value = zzbbx.zzadu();
        }
        if (key.zzada()) {
            Object zza = zza((zzbbg<FieldDescriptorType>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) zza).add(zzp(obj));
            }
            this.zzdqx.zza((zzbdp<FieldDescriptorType, Object>) key, (FieldDescriptorType) zza);
        } else if (key.zzacz() != zzbex.MESSAGE) {
            this.zzdqx.zza((zzbdp<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzp(value));
        } else {
            Object zza2 = zza((zzbbg<FieldDescriptorType>) key);
            if (zza2 == null) {
                this.zzdqx.zza((zzbdp<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzp(value));
            } else {
                this.zzdqx.zza((zzbdp<FieldDescriptorType, Object>) key, (FieldDescriptorType) (zza2 instanceof zzbdb ? key.zza((zzbdb) zza2, (zzbdb) value) : key.zza(((zzbcu) zza2).zzade(), (zzbcu) value).zzadk()));
            }
        }
    }

    private static int zzd(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzacz() != zzbex.MESSAGE || key.zzada() || key.zzadb()) {
            return zzb((zzbbi<?>) key, value);
        }
        boolean z = value instanceof zzbbx;
        int zzhq = entry.getKey().zzhq();
        return z ? zzbav.zzb(zzhq, (zzbbx) value) : zzbav.zzb(zzhq, (zzbcu) value);
    }

    private static Object zzp(Object obj) {
        if (obj instanceof zzbdb) {
            return ((zzbdb) obj).zzaek();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzbbg zzbbgVar = new zzbbg();
        for (int i = 0; i < this.zzdqx.zzafs(); i++) {
            Map.Entry<FieldDescriptorType, Object> zzcy = this.zzdqx.zzcy(i);
            zzbbgVar.zza((zzbbg) zzcy.getKey(), zzcy.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzdqx.zzaft()) {
            zzbbgVar.zza((zzbbg) entry.getKey(), entry.getValue());
        }
        zzbbgVar.zzdqz = this.zzdqz;
        return zzbbgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> descendingIterator() {
        return this.zzdqz ? new zzbca(this.zzdqx.zzafu().iterator()) : this.zzdqx.zzafu().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbbg) {
            return this.zzdqx.equals(((zzbbg) obj).zzdqx);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzdqx.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean isEmpty() {
        return this.zzdqx.isEmpty();
    }

    public final boolean isImmutable() {
        return this.zzdqy;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzdqx.zzafs(); i++) {
            if (!zzb(this.zzdqx.zzcy(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzdqx.zzaft()) {
            if (!zzb(entry)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        return this.zzdqz ? new zzbca(this.zzdqx.entrySet().iterator()) : this.zzdqx.entrySet().iterator();
    }

    public final void zza(zzbbg<FieldDescriptorType> zzbbgVar) {
        for (int i = 0; i < zzbbgVar.zzdqx.zzafs(); i++) {
            zzc(zzbbgVar.zzdqx.zzcy(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : zzbbgVar.zzdqx.zzaft()) {
            zzc(entry);
        }
    }

    public final void zzaaz() {
        if (this.zzdqy) {
            return;
        }
        this.zzdqx.zzaaz();
        this.zzdqy = true;
    }

    public final int zzacw() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzdqx.zzafs(); i2++) {
            Map.Entry<FieldDescriptorType, Object> zzcy = this.zzdqx.zzcy(i2);
            i += zzb((zzbbi<?>) zzcy.getKey(), zzcy.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzdqx.zzaft()) {
            i += zzb((zzbbi<?>) entry.getKey(), entry.getValue());
        }
        return i;
    }

    public final int zzacx() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzdqx.zzafs(); i2++) {
            i += zzd(this.zzdqx.zzcy(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzdqx.zzaft()) {
            i += zzd(entry);
        }
        return i;
    }
}
