package com.daaw;

import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes.dex */
public final class u74 implements zg3 {

    /* renamed from: a */
    public final /* synthetic */ w74 f28763a;

    public u74(w74 w74Var) {
        this.f28763a = w74Var;
    }

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2341a(Object obj, Map map) {
        int i;
        a74 a74Var = (a74) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.f28763a) {
                    w74 w74Var = this.f28763a;
                    i = w74Var.f30992U;
                    if (i != parseInt) {
                        w74Var.f30992U = parseInt;
                        this.f28763a.requestLayout();
                    }
                }
            } catch (Exception e) {
                k04.zzk("Exception occurred while getting webview content height", e);
            }
        }
    }
}
