package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzaah {
    private final boolean zzbwr;
    private final boolean zzbws;
    private final boolean zzbwt;
    private final boolean zzbwu;
    private final boolean zzbwv;

    private zzaah(zzaaj zzaajVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        z = zzaajVar.zzbwr;
        this.zzbwr = z;
        z2 = zzaajVar.zzbws;
        this.zzbws = z2;
        z3 = zzaajVar.zzbwt;
        this.zzbwt = z3;
        z4 = zzaajVar.zzbwu;
        this.zzbwu = z4;
        z5 = zzaajVar.zzbwv;
        this.zzbwv = z5;
    }

    public final JSONObject zzng() {
        try {
            return new JSONObject().put("sms", this.zzbwr).put("tel", this.zzbws).put("calendar", this.zzbwt).put("storePicture", this.zzbwu).put("inlineVideo", this.zzbwv);
        } catch (JSONException e) {
            zzakb.zzb("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
