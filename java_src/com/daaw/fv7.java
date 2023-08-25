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
    /* renamed from: a */
    public final void mo13015a() {
        if (!m13006j()) {
            for (int i = 0; i < m13014b(); i++) {
                Map.Entry m13009g = m13009g(i);
                if (((zr7) m13009g.getKey()).zzc()) {
                    m13009g.setValue(Collections.unmodifiableList((List) m13009g.getValue()));
                }
            }
            for (Map.Entry entry : m13013c()) {
                if (((zr7) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo13015a();
    }
}
