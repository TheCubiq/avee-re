package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzael;
import com.google.android.gms.internal.ads.zzait;
import com.google.android.gms.internal.ads.zzakk;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzx {
    private final Context mContext;
    private boolean zzxc;
    private zzait zzxd;
    private zzael zzxe;

    public zzx(Context context, zzait zzaitVar, zzael zzaelVar) {
        this.mContext = context;
        this.zzxd = zzaitVar;
        this.zzxe = zzaelVar;
        if (zzaelVar == null) {
            this.zzxe = new zzael();
        }
    }

    private final boolean zzcx() {
        zzait zzaitVar = this.zzxd;
        return (zzaitVar != null && zzaitVar.zzpg().zzcni) || this.zzxe.zzcfr;
    }

    public final void recordClick() {
        this.zzxc = true;
    }

    public final boolean zzcy() {
        return !zzcx() || this.zzxc;
    }

    public final void zzs(String str) {
        if (zzcx()) {
            if (str == null) {
                str = "";
            }
            zzait zzaitVar = this.zzxd;
            if (zzaitVar != null) {
                zzaitVar.zza(str, null, 3);
            } else if (this.zzxe.zzcfr && this.zzxe.zzcfs != null) {
                for (String str2 : this.zzxe.zzcfs) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzbv.zzek();
                        zzakk.zzd(this.mContext, "", replace);
                    }
                }
            }
        }
    }
}
