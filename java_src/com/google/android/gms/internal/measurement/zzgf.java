package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgf;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public abstract class zzgf<MessageType extends zzgd<MessageType, BuilderType>, BuilderType extends zzgf<MessageType, BuilderType>> implements zzjf {
    protected abstract BuilderType zza(MessageType messagetype);

    public abstract BuilderType zza(zzgy zzgyVar, zzhi zzhiVar) throws IOException;

    @Override // 
    /* renamed from: zzt */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i, int i2) throws zzig {
        try {
            zzgy zza = zzgy.zza(bArr, 0, i2, false);
            zza(zza, zzhi.zza());
            zza.zza(0);
            return this;
        } catch (zzig e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public BuilderType zza(byte[] bArr, int i, int i2, zzhi zzhiVar) throws zzig {
        try {
            zzgy zza = zzgy.zza(bArr, 0, i2, false);
            zza(zza, zzhiVar);
            zza.zza(0);
            return this;
        } catch (zzig e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    private final String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + String.valueOf(str).length());
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzjf
    public final /* synthetic */ zzjf zza(zzjg zzjgVar) {
        if (!zzbv().getClass().isInstance(zzjgVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return zza((zzgf<MessageType, BuilderType>) ((zzgd) zzjgVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzjf
    public final /* synthetic */ zzjf zza(byte[] bArr, zzhi zzhiVar) throws zzig {
        return zza(bArr, 0, bArr.length, zzhiVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzjf
    public final /* synthetic */ zzjf zza(byte[] bArr) throws zzig {
        return zza(bArr, 0, bArr.length);
    }
}
