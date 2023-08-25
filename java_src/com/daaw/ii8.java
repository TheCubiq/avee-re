package com.daaw;
/* loaded from: classes2.dex */
public enum ii8 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(y68.q),
    ENUM(null),
    MESSAGE(null);
    
    public final Object p;

    ii8(Object obj) {
        this.p = obj;
    }
}
