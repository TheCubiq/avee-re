package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzwq<I, O> implements zzwf<I, O> {
    private final zzvf zzbrh;
    private final zzwh<O> zzbri;
    private final zzwi<I> zzbrj;
    private final String zzbrk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwq(zzvf zzvfVar, String str, zzwi<I> zzwiVar, zzwh<O> zzwhVar) {
        this.zzbrh = zzvfVar;
        this.zzbrk = str;
        this.zzbrj = zzwiVar;
        this.zzbri = zzwhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzvs zzvsVar, zzwb zzwbVar, I i, zzaoj<O> zzaojVar) {
        try {
            com.google.android.gms.ads.internal.zzbv.zzek();
            String zzrh = zzakk.zzrh();
            com.google.android.gms.ads.internal.gmsg.zzf.zzbmc.zza(zzrh, new zzwt(this, zzvsVar, zzaojVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TtmlNode.ATTR_ID, zzrh);
            jSONObject.put("args", this.zzbrj.zzg(i));
            zzwbVar.zzb(this.zzbrk, jSONObject);
        } catch (Exception e) {
            try {
                zzaojVar.setException(e);
                zzakb.zzb("Unable to invokeJavaScript", e);
            } finally {
                zzvsVar.release();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanj
    public final zzanz<O> zzc(@Nullable I i) throws Exception {
        return zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final zzanz<O> zzf(I i) {
        zzaoj zzaojVar = new zzaoj();
        zzvs zzb = this.zzbrh.zzb((zzci) null);
        zzb.zza(new zzwr(this, zzb, i, zzaojVar), new zzws(this, zzaojVar, zzb));
        return zzaojVar;
    }
}
