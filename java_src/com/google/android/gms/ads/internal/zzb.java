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

    /* renamed from: a */
    public final Context f36345a;

    /* renamed from: b */
    public boolean f36346b;

    /* renamed from: c */
    public final cx3 f36347c;

    /* renamed from: d */
    public final zzcbh f36348d = new zzcbh(false, Collections.emptyList());

    public zzb(Context context, cx3 cx3Var, zzcbh zzcbhVar) {
        this.f36345a = context;
        this.f36347c = cx3Var;
    }

    /* renamed from: a */
    public final boolean m1320a() {
        cx3 cx3Var = this.f36347c;
        return (cx3Var != null && cx3Var.zza().f36986u) || this.f36348d.f36951p;
    }

    public final void zza() {
        this.f36346b = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (m1320a()) {
            if (str == null) {
                str = "";
            }
            cx3 cx3Var = this.f36347c;
            if (cx3Var != null) {
                cx3Var.mo3152a(str, null, 3);
                return;
            }
            zzcbh zzcbhVar = this.f36348d;
            if (!zzcbhVar.f36951p || (list = zzcbhVar.f36952q) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzs.zzH(this.f36345a, "", replace);
                }
            }
        }
    }

    public final boolean zzc() {
        return !m1320a() || this.f36346b;
    }
}
