package com.daaw;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
public interface q09 {
    public static final q09 a = new q09() { // from class: com.daaw.o09
        @Override // com.daaw.q09
        public final /* synthetic */ j09[] a(Uri uri, Map map) {
            return p09.a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            int i = p09.a;
            return new j09[0];
        }
    };

    j09[] a(Uri uri, Map map);

    j09[] zza();
}
