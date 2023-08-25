package com.daaw;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
/* loaded from: classes.dex */
public final class eq3 extends hq3 {
    public final Map c;
    public final Context d;

    public eq3(a74 a74Var, Map map) {
        super(a74Var, "storePicture");
        this.c = map;
        this.d = a74Var.zzk();
    }

    public final void i() {
        if (this.d == null) {
            c("Activity context is not available");
            return;
        }
        zzt.zzp();
        if (!new m83(this.d).c()) {
            c("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            c("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            c("Invalid image url: ".concat(String.valueOf(str)));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            zzt.zzp();
            if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                c("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
                return;
            }
            Resources d = zzt.zzo().d();
            zzt.zzp();
            AlertDialog.Builder zzG = zzs.zzG(this.d);
            zzG.setTitle(d != null ? d.getString(R.string.s1) : "Save image");
            zzG.setMessage(d != null ? d.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
            zzG.setPositiveButton(d != null ? d.getString(R.string.s3) : "Accept", new cq3(this, str, lastPathSegment));
            zzG.setNegativeButton(d != null ? d.getString(R.string.s4) : "Decline", new dq3(this));
            zzG.create().show();
        }
    }
}
