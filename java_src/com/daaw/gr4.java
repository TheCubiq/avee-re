package com.daaw;

import java.util.Set;
/* loaded from: classes.dex */
public final class gr4 extends kw4 {

    /* renamed from: q */
    public boolean f11625q;

    public gr4(Set set) {
        super(set);
        this.f11625q = false;
    }

    public final synchronized void zza() {
        if (this.f11625q) {
            return;
        }
        m17378B0(new jw4() { // from class: com.daaw.fr4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((ir4) obj).zzl();
            }
        });
        this.f11625q = true;
    }
}
