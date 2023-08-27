package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public enum zzbbw {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzbah.class, zzbah.class, zzbah.zzdpq),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> zzdve;
    private final Class<?> zzdvf;
    private final Object zzdvg;

    zzbbw(Class cls, Class cls2, Object obj) {
        this.zzdve = cls;
        this.zzdvf = cls2;
        this.zzdvg = obj;
    }

    public final Class<?> zzadt() {
        return this.zzdvf;
    }
}
