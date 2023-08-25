package com.daaw;

import com.google.android.gms.ads.internal.client.zza;
import java.util.Set;
/* loaded from: classes.dex */
public final class jq4 extends kw4 implements zza {
    public jq4(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        m17378B0(new jw4() { // from class: com.daaw.iq4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((zza) obj).onAdClicked();
            }
        });
    }
}
