package com.daaw;

import android.net.Uri;
/* loaded from: classes.dex */
public final class om3 extends p04 {
    public final nm3 b;

    public om3(nm3 nm3Var, String str) {
        super(str);
        this.b = nm3Var;
    }

    @Override // com.daaw.p04, com.daaw.c04
    public final boolean zza(String str) {
        k04.zze("LeibnizHttpUrlPinger pinging URL: ".concat(String.valueOf(str)));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return true;
        }
        k04.zze("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        return super.zza(str);
    }
}
