package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.internal.ads.zzchu;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class xl3 {
    public static final zzbb b = new vl3();
    public static final zzbb c = new wl3();
    public final jl3 a;

    public xl3(Context context, zzchu zzchuVar, String str, @Nullable vo6 vo6Var) {
        this.a = new jl3(context, zzchuVar, str, b, c, vo6Var);
    }

    public final nl3 a(String str, ql3 ql3Var, pl3 pl3Var) {
        return new bm3(this.a, str, ql3Var, pl3Var);
    }

    public final jm3 b() {
        return new jm3(this.a);
    }
}
