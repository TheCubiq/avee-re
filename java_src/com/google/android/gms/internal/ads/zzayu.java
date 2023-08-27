package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final /* synthetic */ class zzayu {
    static final /* synthetic */ int[] zzdnm;
    static final /* synthetic */ int[] zzdnn;

    static {
        int[] iArr = new int[zzayv.values().length];
        zzdnn = iArr;
        try {
            iArr[zzayv.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzdnn[zzayv.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zzdnn[zzayv.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[zzayw.values().length];
        zzdnm = iArr2;
        try {
            iArr2[zzayw.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zzdnm[zzayw.COMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
