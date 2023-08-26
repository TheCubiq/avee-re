package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzbde {
    private static final zzbdc zzdwy = zzaen();
    private static final zzbdc zzdwz = new zzbdd();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbdc zzael() {
        return zzdwy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbdc zzaem() {
        return zzdwz;
    }

    private static zzbdc zzaen() {
        try {
            return (zzbdc) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
