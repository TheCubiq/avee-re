package com.daaw;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class mf8 extends gg8 {
    public mf8(int i) {
        super(i, null);
    }

    @Override // com.daaw.gg8
    public final void a() {
        if (!j()) {
            for (int i = 0; i < b(); i++) {
                Map.Entry g = g(i);
                if (((x88) g.getKey()).zzc()) {
                    g.setValue(Collections.unmodifiableList((List) g.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((x88) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
