package com.daaw;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
/* loaded from: classes.dex */
public final class a16 implements i76 {
    public final Set a;

    public a16(Set set) {
        this.a = set;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 8;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        final ArrayList arrayList = new ArrayList();
        for (String str : this.a) {
            arrayList.add(str);
        }
        return s67.i(new h76() { // from class: com.daaw.z06
            @Override // com.daaw.h76
            public final void b(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
