package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzbbf {
    private static final zzbbd<?> zzdqv = new zzbbe();
    private static final zzbbd<?> zzdqw = zzacs();

    private static zzbbd<?> zzacs() {
        try {
            return (zzbbd) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbbd<?> zzact() {
        return zzdqv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbbd<?> zzacu() {
        zzbbd<?> zzbbdVar = zzdqw;
        if (zzbbdVar != null) {
            return zzbbdVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
