package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
final class zzis extends zziq {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzis() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zziq
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zziq
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzkt.zzf(obj, j);
        if (list instanceof zzin) {
            unmodifiableList = ((zzin) list).h_();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzjs) && (list instanceof zzid)) {
                zzid zzidVar = (zzid) list;
                if (zzidVar.zza()) {
                    zzidVar.i_();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzkt.zza(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j, int i) {
        zzio zzioVar;
        List<L> arrayList;
        List<L> zzc = zzc(obj, j);
        if (zzc.isEmpty()) {
            if (zzc instanceof zzin) {
                arrayList = new zzio(i);
            } else if ((zzc instanceof zzjs) && (zzc instanceof zzid)) {
                arrayList = ((zzid) zzc).zza(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            zzkt.zza(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(zzc.getClass())) {
            ArrayList arrayList2 = new ArrayList(zzc.size() + i);
            arrayList2.addAll(zzc);
            zzkt.zza(obj, j, arrayList2);
            zzioVar = arrayList2;
        } else if (zzc instanceof zzks) {
            zzio zzioVar2 = new zzio(zzc.size() + i);
            zzioVar2.addAll((zzks) zzc);
            zzkt.zza(obj, j, zzioVar2);
            zzioVar = zzioVar2;
        } else if ((zzc instanceof zzjs) && (zzc instanceof zzid)) {
            zzid zzidVar = (zzid) zzc;
            if (zzidVar.zza()) {
                return zzc;
            }
            zzid zza2 = zzidVar.zza(zzc.size() + i);
            zzkt.zza(obj, j, zza2);
            return zza2;
        } else {
            return zzc;
        }
        return zzioVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zziq
    public final <E> void zza(Object obj, Object obj2, long j) {
        List zzc = zzc(obj2, j);
        List zza2 = zza(obj, j, zzc.size());
        int size = zza2.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza2.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza2;
        }
        zzkt.zza(obj, j, zzc);
    }

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zzkt.zzf(obj, j);
    }
}
