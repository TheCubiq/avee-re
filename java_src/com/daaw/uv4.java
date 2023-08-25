package com.daaw;

import java.util.Set;
/* loaded from: classes.dex */
public final class uv4 extends kw4 implements of3 {
    public uv4(Set set) {
        super(set);
    }

    @Override // com.daaw.of3
    public final synchronized void W(final String str, final String str2) {
        B0(new jw4() { // from class: com.daaw.tv4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((hp2) obj).H(str, str2);
            }
        });
    }
}
