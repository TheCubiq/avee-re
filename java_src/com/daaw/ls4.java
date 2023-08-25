package com.daaw;

import android.os.Bundle;
import java.util.Set;
/* loaded from: classes.dex */
public final class ls4 extends kw4 implements mf3 {

    /* renamed from: q */
    public final Bundle f17734q;

    public ls4(Set set) {
        super(set);
        this.f17734q = new Bundle();
    }

    /* renamed from: C0 */
    public final synchronized Bundle m16604C0() {
        return new Bundle(this.f17734q);
    }

    @Override // com.daaw.mf3
    /* renamed from: k */
    public final synchronized void mo5430k(String str, Bundle bundle) {
        this.f17734q.putAll(bundle);
        m17378B0(new jw4() { // from class: com.daaw.ks4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((yr6) obj).mo3375k();
            }
        });
    }
}
