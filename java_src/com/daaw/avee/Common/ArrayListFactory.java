package com.daaw.avee.Common;

import com.daaw.avee.Common.Func.Func;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ArrayListFactory<T> implements Func<List<T>> {
    @Override // com.daaw.avee.Common.Func.Func
    public List<T> onInvoke() {
        return new ArrayList();
    }
}
