package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
final class zzez<E> extends zzee<E> {
    private final zzew<E> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzez(zzew<E> zzewVar, int i) {
        super(zzewVar.size(), i);
        this.zza = zzewVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzee
    protected final E zza(int i) {
        return this.zza.get(i);
    }
}
