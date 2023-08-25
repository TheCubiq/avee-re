package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.daaw.aa;
import com.daaw.en;
import com.daaw.ie;
import com.daaw.rn1;
@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements aa {
    @Override // com.daaw.aa
    public rn1 create(en enVar) {
        return new ie(enVar.b(), enVar.e(), enVar.d());
    }
}
