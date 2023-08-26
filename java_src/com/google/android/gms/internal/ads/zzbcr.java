package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzbcr {
    private static final zzbcp zzdwd = zzaeg();
    private static final zzbcp zzdwe = new zzbcq();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbcp zzaee() {
        return zzdwd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbcp zzaef() {
        return zzdwe;
    }

    private static zzbcp zzaeg() {
        try {
            return (zzbcp) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
