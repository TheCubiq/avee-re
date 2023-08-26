package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* loaded from: classes2.dex */
public final class zzhb implements Comparator<zzgp> {
    public zzhb(zzha zzhaVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzgp zzgpVar, zzgp zzgpVar2) {
        zzgp zzgpVar3 = zzgpVar;
        zzgp zzgpVar4 = zzgpVar2;
        if (zzgpVar3.zzhc() < zzgpVar4.zzhc()) {
            return -1;
        }
        if (zzgpVar3.zzhc() > zzgpVar4.zzhc()) {
            return 1;
        }
        if (zzgpVar3.zzhb() < zzgpVar4.zzhb()) {
            return -1;
        }
        if (zzgpVar3.zzhb() > zzgpVar4.zzhb()) {
            return 1;
        }
        float zzhe = (zzgpVar3.zzhe() - zzgpVar3.zzhc()) * (zzgpVar3.zzhd() - zzgpVar3.zzhb());
        float zzhe2 = (zzgpVar4.zzhe() - zzgpVar4.zzhc()) * (zzgpVar4.zzhd() - zzgpVar4.zzhb());
        if (zzhe > zzhe2) {
            return -1;
        }
        return zzhe < zzhe2 ? 1 : 0;
    }
}
