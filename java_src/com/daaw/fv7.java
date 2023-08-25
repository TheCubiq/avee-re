package com.daaw;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class fv7 extends pv7 {
    public fv7(int i) {
        super(i, null);
    }

    @Override // com.daaw.pv7
    public final void a() {
        if (!j()) {
            for (int i = 0; i < b(); i++) {
                Map.Entry g = g(i);
                if (((zr7) g.getKey()).zzc()) {
                    g.setValue(Collections.unmodifiableList((List) g.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((zr7) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
