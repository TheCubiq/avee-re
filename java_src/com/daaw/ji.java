package com.daaw;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class ji implements li {
    public static /* synthetic */ Object c(String str, vh vhVar, bi biVar) {
        try {
            i20.b(str);
            return vhVar.h().a(biVar);
        } finally {
            i20.a();
        }
    }

    @Override // com.daaw.li
    public List<vh<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final vh<?> vhVar : componentRegistrar.getComponents()) {
            final String i = vhVar.i();
            if (i != null) {
                vhVar = vhVar.t(new gi() { // from class: com.daaw.ii
                    @Override // com.daaw.gi
                    public final Object a(bi biVar) {
                        Object c;
                        c = ji.c(i, vhVar, biVar);
                        return c;
                    }
                });
            }
            arrayList.add(vhVar);
        }
        return arrayList;
    }
}
