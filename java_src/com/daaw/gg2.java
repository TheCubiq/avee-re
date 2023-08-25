package com.daaw;

import java.util.Comparator;
/* loaded from: classes.dex */
public final class gg2 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((byte[]) obj).length - ((byte[]) obj2).length;
    }
}
