package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzazy;
import com.google.android.gms.internal.ads.zzazz;
/* loaded from: classes2.dex */
public abstract class zzazz<MessageType extends zzazy<MessageType, BuilderType>, BuilderType extends zzazz<MessageType, BuilderType>> implements zzbcv {
    protected abstract BuilderType zza(MessageType messagetype);

    @Override // 
    /* renamed from: zzaax */
    public abstract BuilderType clone();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbcv
    public final /* synthetic */ zzbcv zzd(zzbcu zzbcuVar) {
        if (zzadg().getClass().isInstance(zzbcuVar)) {
            return zza((zzazy) zzbcuVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
