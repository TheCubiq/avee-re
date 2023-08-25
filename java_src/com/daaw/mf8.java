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
    /* renamed from: a */
    public final void mo16039a() {
        if (!m21647j()) {
            for (int i = 0; i < m21655b(); i++) {
                Map.Entry m21650g = m21650g(i);
                if (((x88) m21650g.getKey()).zzc()) {
                    m21650g.setValue(Collections.unmodifiableList((List) m21650g.getValue()));
                }
            }
            for (Map.Entry entry : m21654c()) {
                if (((x88) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo16039a();
    }
}
