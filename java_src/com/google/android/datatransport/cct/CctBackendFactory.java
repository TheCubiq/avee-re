package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.daaw.AbstractC1202en;
import com.daaw.C1685ie;
import com.daaw.InterfaceC0612aa;
import com.daaw.rn1;
@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements InterfaceC0612aa {
    @Override // com.daaw.InterfaceC0612aa
    public rn1 create(AbstractC1202en abstractC1202en) {
        return new C1685ie(abstractC1202en.mo23362b(), abstractC1202en.mo23359e(), abstractC1202en.mo23360d());
    }
}
