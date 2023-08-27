package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbfc;
import java.io.IOException;
/* loaded from: classes2.dex */
public abstract class zzbfc<M extends zzbfc<M>> extends zzbfi {
    protected zzbfe zzebk;

    @Override // com.google.android.gms.internal.ads.zzbfi
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzbfc zzbfcVar = (zzbfc) super.clone();
        zzbfg.zza(this, zzbfcVar);
        return zzbfcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzebk == null) {
            return;
        }
        for (int i = 0; i < this.zzebk.size(); i++) {
            this.zzebk.zzdg(i).zza(zzbfaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zza(zzbez zzbezVar, int i) throws IOException {
        int position = zzbezVar.getPosition();
        if (zzbezVar.zzbq(i)) {
            int i2 = i >>> 3;
            zzbfk zzbfkVar = new zzbfk(i, zzbezVar.zzab(position, zzbezVar.getPosition() - position));
            zzbff zzbffVar = null;
            zzbfe zzbfeVar = this.zzebk;
            if (zzbfeVar == null) {
                this.zzebk = new zzbfe();
            } else {
                zzbffVar = zzbfeVar.zzdf(i2);
            }
            if (zzbffVar == null) {
                zzbffVar = new zzbff();
                this.zzebk.zza(i2, zzbffVar);
            }
            zzbffVar.zza(zzbfkVar);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* synthetic */ zzbfi zzago() throws CloneNotSupportedException {
        return (zzbfc) clone();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfi
    public int zzr() {
        if (this.zzebk != null) {
            int i = 0;
            for (int i2 = 0; i2 < this.zzebk.size(); i2++) {
                i += this.zzebk.zzdg(i2).zzr();
            }
            return i;
        }
        return 0;
    }
}
