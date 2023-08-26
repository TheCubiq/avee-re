package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhv.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public abstract class zzhv<MessageType extends zzhv<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzgd<MessageType, BuilderType> {
    private static Map<Object, zzhv<?, ?>> zzd = new ConcurrentHashMap();
    protected zzkq zzb = zzkq.zza();
    private int zzc = -1;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    /* loaded from: classes2.dex */
    public static class zza<T extends zzhv<T, ?>> extends zzgh<T> {
        private final T zza;

        public zza(T t) {
            this.zza = t;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    /* loaded from: classes2.dex */
    static final class zzc implements zzhq<zzc> {
        @Override // com.google.android.gms.internal.measurement.zzhq
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzhq
        public final zzle zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzhq
        public final zzlh zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzhq
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzhq
        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzhq
        public final zzjf zza(zzjf zzjfVar, zzjg zzjgVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzhq
        public final zzjl zza(zzjl zzjlVar, zzjl zzjlVar2) {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    /* loaded from: classes2.dex */
    public enum zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 1;
        public static final int zzi = 2;
        public static final int zzj = 1;
        public static final int zzk = 2;
        private static final /* synthetic */ int[] zzl = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] zzm = {1, 2};
        private static final /* synthetic */ int[] zzn = {1, 2};

        public static int[] zza() {
            return (int[]) zzl.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    /* loaded from: classes2.dex */
    public static class zzf<ContainingType extends zzjg, Type> extends zzhj<ContainingType, Type> {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    /* loaded from: classes2.dex */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzhv<MessageType, BuilderType> implements zzji {
        protected zzho<zzc> zzc = zzho.zza();

        /* JADX INFO: Access modifiers changed from: package-private */
        public final zzho<zzc> zza() {
            if (this.zzc.zzc()) {
                this.zzc = (zzho) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public String toString() {
        return zzjh.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zza != 0) {
            return this.zza;
        }
        this.zza = zzjr.zza().zza((zzjr) this).zza(this);
        return this.zza;
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    /* loaded from: classes2.dex */
    public static abstract class zzb<MessageType extends zzhv<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzgf<MessageType, BuilderType> {
        protected MessageType zza;
        protected boolean zzb = false;
        private final MessageType zzc;

        /* JADX INFO: Access modifiers changed from: protected */
        public zzb(MessageType messagetype) {
            this.zzc = messagetype;
            this.zza = (MessageType) messagetype.zza(zze.zzd, null, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void zzu() {
            MessageType messagetype = (MessageType) this.zza.zza(zze.zzd, null, null);
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.measurement.zzji
        public final boolean zzbn() {
            return zzhv.zza(this.zza, false);
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        /* renamed from: zzv */
        public MessageType zzx() {
            if (this.zzb) {
                return this.zza;
            }
            MessageType messagetype = this.zza;
            zzjr.zza().zza((zzjr) messagetype).zzc(messagetype);
            this.zzb = true;
            return this.zza;
        }

        @Override // com.google.android.gms.internal.measurement.zzjf
        /* renamed from: zzw */
        public final MessageType zzy() {
            MessageType messagetype = (MessageType) zzx();
            if (messagetype.zzbn()) {
                return messagetype;
            }
            throw new zzko(messagetype);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb) {
                zzu();
                this.zzb = false;
            }
            zza(this.zza, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzjr.zza().zza((zzjr) messagetype).zzb(messagetype, messagetype2);
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzhi zzhiVar) throws zzig {
            if (this.zzb) {
                zzu();
                this.zzb = false;
            }
            try {
                zzjr.zza().zza((zzjr) this.zza).zza(this.zza, bArr, 0, i2, new zzgl(zzhiVar));
                return this;
            } catch (zzig e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzig.zza();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.measurement.zzgf
        /* renamed from: zzb */
        public final BuilderType zza(zzgy zzgyVar, zzhi zzhiVar) throws IOException {
            if (this.zzb) {
                zzu();
                this.zzb = false;
            }
            try {
                zzjr.zza().zza((zzjr) this.zza).zza(this.zza, zzhd.zza(zzgyVar), zzhiVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.measurement.zzgf
        protected final /* synthetic */ zzgf zza(zzgd zzgdVar) {
            return zza((zzb<MessageType, BuilderType>) ((zzhv) zzgdVar));
        }

        @Override // com.google.android.gms.internal.measurement.zzgf
        public final /* synthetic */ zzgf zza(byte[] bArr, int i, int i2, zzhi zzhiVar) throws zzig {
            return zzb(bArr, 0, i2, zzhiVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzgf
        public final /* synthetic */ zzgf zza(byte[] bArr, int i, int i2) throws zzig {
            return zzb(bArr, 0, i2, zzhi.zza());
        }

        @Override // com.google.android.gms.internal.measurement.zzgf
        public final /* synthetic */ zzgf zzt() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.measurement.zzji
        public final /* synthetic */ zzjg zzbv() {
            return this.zzc;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.measurement.zzgf
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzbVar = (zzb) this.zzc.zza(zze.zze, null, null);
            zzbVar.zza((zzb) ((zzhv) zzx()));
            return zzbVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzjr.zza().zza((zzjr) this).zza(this, (zzhv) obj);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends zzhv<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzbm() {
        return (BuilderType) zza(zze.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzji
    public final boolean zzbn() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    public final BuilderType zzbo() {
        BuilderType buildertype = (BuilderType) zza(zze.zze, (Object) null, (Object) null);
        buildertype.zza(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.measurement.zzgd
    final int zzbl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzgd
    final void zzc(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zza(zzhf zzhfVar) throws IOException {
        zzjr.zza().zza((zzjr) this).zza((zzjv) this, (zzlk) zzhh.zza(zzhfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final int zzbp() {
        if (this.zzc == -1) {
            this.zzc = zzjr.zza().zza((zzjr) this).zzb(this);
        }
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzhv<?, ?>> T zza(Class<T> cls) {
        zzhv<?, ?> zzhvVar = zzd.get(cls);
        if (zzhvVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzhvVar = zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzhvVar == null) {
            zzhvVar = (T) ((zzhv) zzkt.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
            if (zzhvVar == null) {
                throw new IllegalStateException();
            }
            zzd.put(cls, zzhvVar);
        }
        return (T) zzhvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzhv<?, ?>> void zza(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zza(zzjg zzjgVar, String str, Object[] objArr) {
        return new zzjt(zzjgVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends zzhv<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zze.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = zzjr.zza().zza((zzjr) t).zzd(t);
        if (z) {
            t.zza(zze.zzb, zzd2 ? t : null, null);
        }
        return zzd2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzib zzbq() {
        return zzhy.zzd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzie zzbr() {
        return zziu.zzd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzie zza(zzie zzieVar) {
        int size = zzieVar.size();
        return zzieVar.zzc(size == 0 ? 10 : size << 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzid<E> zzbs() {
        return zzju.zzd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzid<E> zza(zzid<E> zzidVar) {
        int size = zzidVar.size();
        return zzidVar.zza(size == 0 ? 10 : size << 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final /* synthetic */ zzjf zzbt() {
        zzb zzbVar = (zzb) zza(zze.zze, (Object) null, (Object) null);
        zzbVar.zza((zzb) this);
        return zzbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final /* synthetic */ zzjf zzbu() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzji
    public final /* synthetic */ zzjg zzbv() {
        return (zzhv) zza(zze.zzf, (Object) null, (Object) null);
    }
}
