package com.daaw;

import android.os.Bundle;
import java.util.Set;
/* loaded from: classes.dex */
public final class ls4 extends kw4 implements mf3 {
    public final Bundle q;

    public ls4(Set set) {
        super(set);
        this.q = new Bundle();
    }

    public final synchronized Bundle C0() {
        return new Bundle(this.q);
    }

    @Override // com.daaw.mf3
    public final synchronized void k(String str, Bundle bundle) {
        this.q.putAll(bundle);
        B0(new jw4() { // from class: com.daaw.ks4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((yr6) obj).k();
            }
        });
    }
}
