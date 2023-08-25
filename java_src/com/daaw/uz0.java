package com.daaw;
/* loaded from: classes.dex */
public @interface uz0 {

    /* renamed from: com.daaw.uz0$a */
    /* loaded from: classes.dex */
    public enum EnumC3272a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    EnumC3272a intEncoding() default EnumC3272a.DEFAULT;

    int tag();
}
