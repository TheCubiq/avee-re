package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzfh<K, V> extends zzfc<K, V> {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r9.zzg() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzfe<K, V> zza() {
        zzff zzffVar;
        Set<Map.Entry<K, Collection<V>>> entrySet = this.zza.entrySet();
        if (entrySet.isEmpty()) {
            return zzev.zza;
        }
        zzfa zzfaVar = new zzfa(entrySet.size());
        Iterator<Map.Entry<K, Collection<V>>> it = entrySet.iterator();
        int i = 0;
        while (true) {
            int i2 = 1;
            if (it.hasNext()) {
                Map.Entry<K, Collection<V>> next = it.next();
                K key = next.getKey();
                Collection<V> value = next.getValue();
                if ((value instanceof zzff) && !(value instanceof SortedSet)) {
                    zzffVar = (zzff) value;
                }
                Object[] array = value.toArray();
                int length = array.length;
                while (true) {
                    if (length == 0) {
                        zzffVar = zzfr.zza;
                        break;
                    } else if (length == i2) {
                        zzffVar = new zzft(array[0]);
                        break;
                    } else {
                        int zza = zzff.zza(length);
                        Object[] objArr = new Object[zza];
                        int i3 = zza - 1;
                        int i4 = 0;
                        int i5 = 0;
                        for (int i6 = 0; i6 < length; i6++) {
                            Object zza2 = zzfi.zza(array[i6], i6);
                            int hashCode = zza2.hashCode();
                            int zza3 = zzeu.zza(hashCode);
                            while (true) {
                                int i7 = zza3 & i3;
                                Object obj = objArr[i7];
                                if (obj == null) {
                                    array[i4] = zza2;
                                    objArr[i7] = zza2;
                                    i5 += hashCode;
                                    i4++;
                                    break;
                                } else if (!obj.equals(zza2)) {
                                    zza3++;
                                }
                            }
                        }
                        Arrays.fill(array, i4, length, (Object) null);
                        if (i4 == 1) {
                            zzffVar = new zzft(array[0], i5);
                            break;
                        } else if (zzff.zza(i4) < zza / 2) {
                            length = i4;
                            i2 = 1;
                        } else {
                            int length2 = array.length;
                            if (i4 < (length2 >> 1) + (length2 >> 2)) {
                                array = Arrays.copyOf(array, i4);
                            }
                            zzffVar = new zzfr(array, i5, objArr, i3, i4);
                        }
                    }
                }
                if (!zzffVar.isEmpty()) {
                    int i8 = (zzfaVar.zzb + 1) << 1;
                    if (i8 > zzfaVar.zza.length) {
                        Object[] objArr2 = zzfaVar.zza;
                        int length3 = zzfaVar.zza.length;
                        if (i8 < 0) {
                            throw new AssertionError("cannot store more than MAX_VALUE elements");
                        }
                        int i9 = length3 + (length3 >> 1) + 1;
                        if (i9 < i8) {
                            i9 = Integer.highestOneBit(i8 - 1) << 1;
                        }
                        if (i9 < 0) {
                            i9 = Integer.MAX_VALUE;
                        }
                        zzfaVar.zza = Arrays.copyOf(objArr2, i9);
                        zzfaVar.zzc = false;
                    }
                    zzei.zza(key, zzffVar);
                    zzfaVar.zza[zzfaVar.zzb * 2] = key;
                    zzfaVar.zza[(zzfaVar.zzb * 2) + 1] = zzffVar;
                    zzfaVar.zzb++;
                    i += zzffVar.size();
                }
            } else {
                zzfaVar.zzc = true;
                return new zzfe<>(zzfk.zza(zzfaVar.zzb, zzfaVar.zza), i, null);
            }
        }
    }
}
