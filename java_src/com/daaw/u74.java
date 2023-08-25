package com.daaw;

import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes.dex */
public final class u74 implements zg3 {
    public final /* synthetic */ w74 a;

    public u74(w74 w74Var) {
        this.a = w74Var;
    }

    @Override // com.daaw.zg3
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        int i;
        a74 a74Var = (a74) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.a) {
                    w74 w74Var = this.a;
                    i = w74Var.U;
                    if (i != parseInt) {
                        w74Var.U = parseInt;
                        this.a.requestLayout();
                    }
                }
            } catch (Exception e) {
                k04.zzk("Exception occurred while getting webview content height", e);
            }
        }
    }
}
