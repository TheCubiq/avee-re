package com.daaw;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class zq2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ es2 p;

    public zq2(es2 es2Var) {
        this.p = es2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zzt.zzp();
        zzs.zzR(this.p.p, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
