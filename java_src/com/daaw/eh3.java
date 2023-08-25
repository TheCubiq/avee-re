package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
/* loaded from: classes.dex */
public final class eh3 implements zg3 {

    /* renamed from: a */
    public final Context f8480a;

    public eh3(Context context) {
        this.f8480a = context;
    }

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final void mo2341a(Object obj, Map map) {
        char c;
        if (zzt.zzn().m17317z(this.f8480a)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int hashCode = str.hashCode();
            if (hashCode == 94399) {
                if (str.equals("_aa")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("_ac")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                zzt.zzn().m17325r(this.f8480a, str2);
            } else if (c == 1) {
                zzt.zzn().m17324s(this.f8480a, str2);
            } else if (c != 2) {
                k04.zzg("logScionEvent gmsg contained unsupported eventName");
            } else {
                zzt.zzn().m17327p(this.f8480a, str2);
            }
        }
    }
}
