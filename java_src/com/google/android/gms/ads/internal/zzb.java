package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.daaw.cx3;
import com.google.android.gms.internal.ads.zzcbh;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzb {
    public final Context a;
    public boolean b;
    public final cx3 c;
    public final zzcbh d = new zzcbh(false, Collections.emptyList());

    public zzb(Context context, cx3 cx3Var, zzcbh zzcbhVar) {
        this.a = context;
        this.c = cx3Var;
    }

    public final boolean a() {
        cx3 cx3Var = this.c;
        return (cx3Var != null && cx3Var.zza().u) || this.d.p;
    }

    public final void zza() {
        this.b = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (a()) {
            if (str == null) {
                str = "";
            }
            cx3 cx3Var = this.c;
            if (cx3Var != null) {
                cx3Var.a(str, null, 3);
                return;
            }
            zzcbh zzcbhVar = this.d;
            if (!zzcbhVar.p || (list = zzcbhVar.q) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzs.zzH(this.a, "", replace);
                }
            }
        }
    }

    public final boolean zzc() {
        return !a() || this.b;
    }
}
