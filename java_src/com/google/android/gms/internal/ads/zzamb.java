package com.google.android.gms.internal.ads;

import androidx.browser.trusted.sharing.ShareTarget;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzamb extends zzr<zzp> {
    private final zzaoj<zzp> zzctn;
    private final Map<String, String> zzcto;
    private final zzamy zzctp;

    public zzamb(String str, zzaoj<zzp> zzaojVar) {
        this(str, null, zzaojVar);
    }

    private zzamb(String str, Map<String, String> map, zzaoj<zzp> zzaojVar) {
        super(0, str, new zzamc(zzaojVar));
        this.zzcto = null;
        this.zzctn = zzaojVar;
        zzamy zzamyVar = new zzamy();
        this.zzctp = zzamyVar;
        zzamyVar.zza(str, ShareTarget.METHOD_GET, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.internal.ads.zzr
    public final zzx<zzp> zza(zzp zzpVar) {
        return zzx.zza(zzpVar, zzap.zzb(zzpVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzr
    public final /* synthetic */ void zza(zzp zzpVar) {
        zzp zzpVar2 = zzpVar;
        this.zzctp.zza(zzpVar2.zzab, zzpVar2.statusCode);
        zzamy zzamyVar = this.zzctp;
        byte[] bArr = zzpVar2.data;
        if (zzamy.isEnabled() && bArr != null) {
            zzamyVar.zzf(bArr);
        }
        this.zzctn.set(zzpVar2);
    }
}
