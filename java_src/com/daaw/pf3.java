package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
/* loaded from: classes.dex */
public final class pf3 implements zg3 {
    @Override // com.daaw.zg3
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        a74 a74Var = (a74) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                k04.zzj("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                k04.zzj("No timestamp given for CSI tick.");
            } else {
                try {
                    long b = zzt.zzB().b() + (Long.parseLong(str4) - zzt.zzB().a());
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    a74Var.zzo().c(str2, str3, b);
                } catch (NumberFormatException e) {
                    k04.zzk("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                k04.zzj("No value given for CSI experiment.");
            } else {
                a74Var.zzo().a().d("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                k04.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                k04.zzj("No name given for CSI extra.");
            } else {
                a74Var.zzo().a().d(str6, str7);
            }
        }
    }
}
