package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzkh;
import com.google.android.gms.internal.ads.zzkk;
import com.google.android.gms.internal.ads.zzko;
import com.google.android.gms.internal.ads.zzlg;
import com.google.android.gms.internal.ads.zzpl;
import com.google.android.gms.internal.ads.zzqw;
import com.google.android.gms.internal.ads.zzqz;
import com.google.android.gms.internal.ads.zzrc;
import com.google.android.gms.internal.ads.zzrf;
import com.google.android.gms.internal.ads.zzri;
import com.google.android.gms.internal.ads.zzrl;
import com.google.android.gms.internal.ads.zzxn;
@zzadh
/* loaded from: classes.dex */
public final class zzak extends zzko {
    private final Context mContext;
    private final zzw zzwc;
    private final zzxn zzwh;
    private zzkh zzxs;
    private zzjn zzxx;
    private PublisherAdViewOptions zzxy;
    private zzpl zzyb;
    private zzlg zzyd;
    private final String zzye;
    private final zzang zzyf;
    private zzqw zzyk;
    private zzrl zzyl;
    private zzqz zzym;
    private zzri zzyp;
    private SimpleArrayMap<String, zzrf> zzyo = new SimpleArrayMap<>();
    private SimpleArrayMap<String, zzrc> zzyn = new SimpleArrayMap<>();

    public zzak(Context context, String str, zzxn zzxnVar, zzang zzangVar, zzw zzwVar) {
        this.mContext = context;
        this.zzye = str;
        this.zzwh = zzxnVar;
        this.zzyf = zzangVar;
        this.zzwc = zzwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzxy = publisherAdViewOptions;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zza(zzpl zzplVar) {
        this.zzyb = zzplVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zza(zzqw zzqwVar) {
        this.zzyk = zzqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zza(zzqz zzqzVar) {
        this.zzym = zzqzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zza(zzri zzriVar, zzjn zzjnVar) {
        this.zzyp = zzriVar;
        this.zzxx = zzjnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zza(zzrl zzrlVar) {
        this.zzyl = zzrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zza(String str, zzrf zzrfVar, zzrc zzrcVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        }
        this.zzyo.put(str, zzrfVar);
        this.zzyn.put(str, zzrcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zzb(zzkh zzkhVar) {
        this.zzxs = zzkhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zzb(zzlg zzlgVar) {
        this.zzyd = zzlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final zzkk zzdh() {
        return new zzah(this.mContext, this.zzye, this.zzwh, this.zzyf, this.zzxs, this.zzyk, this.zzyl, this.zzym, this.zzyo, this.zzyn, this.zzyb, this.zzyd, this.zzwc, this.zzyp, this.zzxx, this.zzxy);
    }
}
