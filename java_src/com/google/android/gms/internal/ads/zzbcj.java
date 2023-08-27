package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbcj implements zzbdn {
    private static final zzbct zzdvw = new zzbck();
    private final zzbct zzdvv;

    public zzbcj() {
        this(new zzbcl(zzbbn.zzadc(), zzaea()));
    }

    private zzbcj(zzbct zzbctVar) {
        this.zzdvv = (zzbct) zzbbq.zza(zzbctVar, "messageInfoFactory");
    }

    private static boolean zza(zzbcs zzbcsVar) {
        return zzbcsVar.zzaeh() == zzbbo.zze.zzdui;
    }

    private static zzbct zzaea() {
        try {
            return (zzbct) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return zzdvw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdn
    public final <T> zzbdm<T> zzd(Class<T> cls) {
        zzbdo.zzf(cls);
        zzbcs zzb = this.zzdvv.zzb(cls);
        if (zzb.zzaei()) {
            return zzbbo.class.isAssignableFrom(cls) ? zzbda.zza(zzbdo.zzafp(), zzbbf.zzact(), zzb.zzaej()) : zzbda.zza(zzbdo.zzafn(), zzbbf.zzacu(), zzb.zzaej());
        } else if (!zzbbo.class.isAssignableFrom(cls)) {
            boolean zza = zza(zzb);
            zzbdc zzael = zzbde.zzael();
            zzbce zzady = zzbce.zzady();
            return zza ? zzbcy.zza(cls, zzb, zzael, zzady, zzbdo.zzafn(), zzbbf.zzacu(), zzbcr.zzaee()) : zzbcy.zza(cls, zzb, zzael, zzady, zzbdo.zzafo(), (zzbbd<?>) null, zzbcr.zzaee());
        } else {
            boolean zza2 = zza(zzb);
            zzbdc zzaem = zzbde.zzaem();
            zzbce zzadz = zzbce.zzadz();
            zzbee<?, ?> zzafp = zzbdo.zzafp();
            return zza2 ? zzbcy.zza(cls, zzb, zzaem, zzadz, zzafp, zzbbf.zzact(), zzbcr.zzaef()) : zzbcy.zza(cls, zzb, zzaem, zzadz, zzafp, (zzbbd<?>) null, zzbcr.zzaef());
        }
    }
}
