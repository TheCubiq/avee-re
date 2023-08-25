package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcdd;
import java.util.Map;
/* loaded from: classes.dex */
public final class ph3 implements zg3 {
    public final oh3 a;

    public ph3(oh3 oh3Var) {
        this.a = oh3Var;
    }

    public static void b(a74 a74Var, oh3 oh3Var) {
        a74Var.y("/reward", new ph3(oh3Var));
    }

    @Override // com.daaw.zg3
    public final void a(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.a.zzc();
                return;
            } else if ("video_complete".equals(str)) {
                this.a.zzb();
                return;
            } else {
                return;
            }
        }
        zzcdd zzcddVar = null;
        try {
            int parseInt = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzcddVar = new zzcdd(str2, parseInt);
            }
        } catch (NumberFormatException e) {
            k04.zzk("Unable to parse reward amount.", e);
        }
        this.a.h0(zzcddVar);
    }
}
