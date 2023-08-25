package com.daaw;

import java.util.Objects;
/* loaded from: classes2.dex */
public final class rm8 {
    /* renamed from: a */
    public static void m11174a(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 != null) {
        } else {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }
}
