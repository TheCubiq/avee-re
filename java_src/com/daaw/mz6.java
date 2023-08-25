package com.daaw;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class mz6 extends g07 implements m27 {
    public mz6(Map map) {
        super(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.g07
    /* renamed from: i */
    public final Collection mo15651i(Collection collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // com.daaw.g07
    /* renamed from: j */
    public final Collection mo15650j(Object obj, Collection collection) {
        return m22110o(obj, (List) collection, null);
    }
}
