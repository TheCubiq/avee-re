package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* loaded from: classes2.dex */
final class zzgs implements Comparator<zzgy> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgs(zzgr zzgrVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzgy zzgyVar, zzgy zzgyVar2) {
        zzgy zzgyVar3 = zzgyVar;
        zzgy zzgyVar4 = zzgyVar2;
        int i = zzgyVar3.zzajg - zzgyVar4.zzajg;
        return i != 0 ? i : (int) (zzgyVar3.value - zzgyVar4.value);
    }
}
