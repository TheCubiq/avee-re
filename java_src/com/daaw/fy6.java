package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class fy6 {
    public static final CharSequence a(@CheckForNull Object obj, String str) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
