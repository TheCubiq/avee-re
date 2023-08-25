package com.daaw;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.C3985R;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
/* loaded from: classes.dex */
public final class eq3 extends hq3 {

    /* renamed from: c */
    public final Map f8686c;

    /* renamed from: d */
    public final Context f8687d;

    public eq3(a74 a74Var, Map map) {
        super(a74Var, "storePicture");
        this.f8686c = map;
        this.f8687d = a74Var.zzk();
    }

    /* renamed from: i */
    public final void m23279i() {
        if (this.f8687d == null) {
            m20488c("Activity context is not available");
            return;
        }
        zzt.zzp();
        if (!new m83(this.f8687d).m16166c()) {
            m20488c("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.f8686c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            m20488c("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            m20488c("Invalid image url: ".concat(String.valueOf(str)));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            zzt.zzp();
            if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                m20488c("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
                return;
            }
            Resources m11919d = zzt.zzo().m11919d();
            zzt.zzp();
            AlertDialog.Builder zzG = zzs.zzG(this.f8687d);
            zzG.setTitle(m11919d != null ? m11919d.getString(C3985R.string.s1) : "Save image");
            zzG.setMessage(m11919d != null ? m11919d.getString(C3985R.string.s2) : "Allow Ad to store image in Picture gallery?");
            zzG.setPositiveButton(m11919d != null ? m11919d.getString(C3985R.string.s3) : "Accept", new cq3(this, str, lastPathSegment));
            zzG.setNegativeButton(m11919d != null ? m11919d.getString(C3985R.string.s4) : "Decline", new dq3(this));
            zzG.create().show();
        }
    }
}
