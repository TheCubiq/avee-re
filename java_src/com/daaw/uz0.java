package com.daaw;
/* loaded from: classes.dex */
public @interface uz0 {

    /* loaded from: classes.dex */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
