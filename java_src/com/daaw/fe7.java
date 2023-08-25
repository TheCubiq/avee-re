package com.daaw;
/* loaded from: classes.dex */
public final /* synthetic */ class fe7 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f9500a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f9501b;

    static {
        int[] iArr = new int[mm7.values().length];
        f9501b = iArr;
        try {
            iArr[mm7.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f9501b[mm7.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[zn7.values().length];
        f9500a = iArr2;
        try {
            iArr2[zn7.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f9500a[zn7.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f9500a[zn7.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f9500a[zn7.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
