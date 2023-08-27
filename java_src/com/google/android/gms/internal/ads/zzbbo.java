package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
import com.google.android.gms.internal.ads.zzbbo.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public abstract class zzbbo<MessageType extends zzbbo<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzazy<MessageType, BuilderType> {
    private static Map<Object, zzbbo<?, ?>> zzdtv = new ConcurrentHashMap();
    protected zzbef zzdtt = zzbef.zzagc();
    private int zzdtu = -1;

    /* loaded from: classes2.dex */
    public static abstract class zza<MessageType extends zzbbo<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzazz<MessageType, BuilderType> {
        private final MessageType zzdtw;
        protected MessageType zzdtx;
        private boolean zzdty = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public zza(MessageType messagetype) {
            this.zzdtw = messagetype;
            this.zzdtx = (MessageType) messagetype.zza(zze.zzdud, null, null);
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzbdg.zzaeo().zzab(messagetype).zzc(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.ads.zzazz
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zzaVar = (zza) this.zzdtw.zza(zze.zzdue, null, null);
            if (!this.zzdty) {
                MessageType messagetype = this.zzdtx;
                zzbdg.zzaeo().zzab(messagetype).zzo(messagetype);
                this.zzdty = true;
            }
            zzaVar.zza((zza) this.zzdtx);
            return zzaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbcw
        public final boolean isInitialized() {
            return zzbbo.zza(this.zzdtx, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.ads.zzazz
        protected final /* synthetic */ zzazz zza(zzazy zzazyVar) {
            return zza((zza<MessageType, BuilderType>) ((zzbbo) zzazyVar));
        }

        public final BuilderType zza(MessageType messagetype) {
            zzadh();
            zza(this.zzdtx, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.ads.zzazz
        public final /* synthetic */ zzazz zzaax() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.ads.zzbcw
        public final /* synthetic */ zzbcu zzadg() {
            return this.zzdtw;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void zzadh() {
            if (this.zzdty) {
                MessageType messagetype = (MessageType) this.zzdtx.zza(zze.zzdud, null, null);
                zza(messagetype, this.zzdtx);
                this.zzdtx = messagetype;
                this.zzdty = false;
            }
        }

        public final MessageType zzadi() {
            boolean z = true;
            if (!this.zzdty) {
                MessageType messagetype = this.zzdtx;
                zzbdg.zzaeo().zzab(messagetype).zzo(messagetype);
                this.zzdty = true;
            }
            MessageType messagetype2 = this.zzdtx;
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype2.zza(zze.zzdua, null, null)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = zzbdg.zzaeo().zzab(messagetype2).zzaa(messagetype2);
                    if (booleanValue) {
                        messagetype2.zza(zze.zzdub, z ? messagetype2 : null, null);
                    }
                }
            }
            if (z) {
                return messagetype2;
            }
            throw new zzbed(messagetype2);
        }

        @Override // com.google.android.gms.internal.ads.zzbcv
        public final /* synthetic */ zzbcu zzadj() {
            if (this.zzdty) {
                return this.zzdtx;
            }
            MessageType messagetype = this.zzdtx;
            zzbdg.zzaeo().zzab(messagetype).zzo(messagetype);
            this.zzdty = true;
            return this.zzdtx;
        }

        @Override // com.google.android.gms.internal.ads.zzbcv
        public final /* synthetic */ zzbcu zzadk() {
            boolean z = true;
            if (!this.zzdty) {
                MessageType messagetype = this.zzdtx;
                zzbdg.zzaeo().zzab(messagetype).zzo(messagetype);
                this.zzdty = true;
            }
            MessageType messagetype2 = this.zzdtx;
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype2.zza(zze.zzdua, null, null)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = zzbdg.zzaeo().zzab(messagetype2).zzaa(messagetype2);
                    if (booleanValue) {
                        messagetype2.zza(zze.zzdub, z ? messagetype2 : null, null);
                    }
                }
            }
            if (z) {
                return messagetype2;
            }
            throw new zzbed(messagetype2);
        }
    }

    /* loaded from: classes2.dex */
    public static class zzb<T extends zzbbo<T, ?>> extends zzbaa<T> {
        private T zzdtw;

        public zzb(T t) {
            this.zzdtw = t;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class zzc<MessageType extends zzc<MessageType, BuilderType>, BuilderType> extends zzbbo<MessageType, BuilderType> implements zzbcw {
        protected zzbbg<Object> zzdtz = zzbbg.zzacv();
    }

    /* loaded from: classes2.dex */
    public static class zzd<ContainingType extends zzbcu, Type> extends zzbaz<ContainingType, Type> {
    }

    /* loaded from: classes2.dex */
    public enum zze {
        public static final int zzdua = 1;
        public static final int zzdub = 2;
        public static final int zzduc = 3;
        public static final int zzdud = 4;
        public static final int zzdue = 5;
        public static final int zzduf = 6;
        public static final int zzdug = 7;
        public static final int zzdui = 1;
        public static final int zzduj = 2;
        public static final int zzdul = 1;
        public static final int zzdum = 2;
        private static final /* synthetic */ int[] zzduh = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] zzduk = {1, 2};
        private static final /* synthetic */ int[] zzdun = {1, 2};

        public static int[] values$50KLMJ33DTMIUPRFDTJMOP9FE1P6UT3FC9QMCBQ7CLN6ASJ1EHIM8JB5EDPM2PR59HKN8P949LIN8Q3FCHA6UIBEEPNMMP9R0() {
            return (int[]) zzduh.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzbbo<T, ?>> T zza(T t, zzbah zzbahVar) throws zzbbu {
        boolean zzaa;
        T t2 = (T) zza(t, zzbahVar, zzbbb.zzacr());
        boolean z = false;
        if (t2 != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) t2.zza(zze.zzdua, null, null)).byteValue();
            if (byteValue == 1) {
                zzaa = true;
            } else if (byteValue == 0) {
                zzaa = false;
            } else {
                zzaa = zzbdg.zzaeo().zzab(t2).zzaa(t2);
                if (booleanValue) {
                    t2.zza(zze.zzdub, zzaa ? t2 : null, null);
                }
            }
            if (!zzaa) {
                throw new zzbed(t2).zzaga().zzj(t2);
            }
        }
        if (t2 != null) {
            boolean booleanValue2 = Boolean.TRUE.booleanValue();
            byte byteValue2 = ((Byte) t2.zza(zze.zzdua, null, null)).byteValue();
            if (byteValue2 == 1) {
                z = true;
            } else if (byteValue2 != 0) {
                z = zzbdg.zzaeo().zzab(t2).zzaa(t2);
                if (booleanValue2) {
                    t2.zza(zze.zzdub, z ? t2 : null, null);
                }
            }
            if (!z) {
                throw new zzbed(t2).zzaga().zzj(t2);
            }
        }
        return t2;
    }

    private static <T extends zzbbo<T, ?>> T zza(T t, zzbah zzbahVar, zzbbb zzbbbVar) throws zzbbu {
        try {
            zzbaq zzabf = zzbahVar.zzabf();
            T t2 = (T) zza(t, zzabf, zzbbbVar);
            try {
                zzabf.zzbp(0);
                return t2;
            } catch (zzbbu e) {
                throw e.zzj(t2);
            }
        } catch (zzbbu e2) {
            throw e2;
        }
    }

    private static <T extends zzbbo<T, ?>> T zza(T t, zzbaq zzbaqVar, zzbbb zzbbbVar) throws zzbbu {
        T t2 = (T) t.zza(zze.zzdud, null, null);
        try {
            zzbdg.zzaeo().zzab(t2).zza(t2, zzbat.zza(zzbaqVar), zzbbbVar);
            zzbdg.zzaeo().zzab(t2).zzo(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof zzbbu) {
                throw ((zzbbu) e.getCause());
            }
            throw new zzbbu(e.getMessage()).zzj(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zzbbu) {
                throw ((zzbbu) e2.getCause());
            }
            throw e2;
        }
    }

    private static <T extends zzbbo<T, ?>> T zza(T t, byte[] bArr) throws zzbbu {
        T t2 = (T) t.zza(zze.zzdud, null, null);
        try {
            zzbdg.zzaeo().zzab(t2).zza(t2, bArr, 0, bArr.length, new zzbae());
            zzbdg.zzaeo().zzab(t2).zzo(t2);
            if (t2.zzdpf == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzbbu) {
                throw ((zzbbu) e.getCause());
            }
            throw new zzbbu(e.getMessage()).zzj(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzbbu.zzadl().zzj(t2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zza(zzbcu zzbcuVar, String str, Object[] objArr) {
        return new zzbdi(zzbcuVar, str, objArr);
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

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzbbo<?, ?>> void zza(Class<T> cls, T t) {
        zzdtv.put(cls, t);
    }

    protected static final <T extends zzbbo<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zze.zzdua, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return zzbdg.zzaeo().zzab(t).zzaa(t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzbbt<E> zzadd() {
        return zzbdh.zzaep();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzbbo<T, ?>> T zzb(T t, byte[] bArr) throws zzbbu {
        T t2 = (T) zza(t, bArr);
        if (t2 != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) t2.zza(zze.zzdua, null, null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = zzbdg.zzaeo().zzab(t2).zzaa(t2);
                    if (booleanValue) {
                        t2.zza(zze.zzdub, z ? t2 : null, null);
                    }
                }
            }
            if (!z) {
                throw new zzbed(t2).zzaga().zzj(t2);
            }
        }
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzbbo<?, ?>> T zzc(Class<T> cls) {
        T t = (T) zzdtv.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzdtv.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? "Unable to get default instance for: ".concat(valueOf) : new String("Unable to get default instance for: "));
        }
        return t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((zzbbo) zza(zze.zzduf, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return zzbdg.zzaeo().zzab(this).equals(this, (zzbbo) obj);
        }
        return false;
    }

    public int hashCode() {
        if (this.zzdpf != 0) {
            return this.zzdpf;
        }
        this.zzdpf = zzbdg.zzaeo().zzab(this).hashCode(this);
        return this.zzdpf;
    }

    @Override // com.google.android.gms.internal.ads.zzbcw
    public final boolean isInitialized() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) zza(zze.zzdua, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzaa = zzbdg.zzaeo().zzab(this).zzaa(this);
        if (booleanValue) {
            zza(zze.zzdub, zzaa ? this : null, (Object) null);
        }
        return zzaa;
    }

    public String toString() {
        return zzbcx.zza(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.zzazy
    final int zzaaw() {
        return this.zzdtu;
    }

    @Override // com.google.android.gms.internal.ads.zzbcu
    public final int zzacw() {
        if (this.zzdtu == -1) {
            this.zzdtu = zzbdg.zzaeo().zzab(this).zzy(this);
        }
        return this.zzdtu;
    }

    @Override // com.google.android.gms.internal.ads.zzbcu
    public final /* synthetic */ zzbcv zzade() {
        zza zzaVar = (zza) zza(zze.zzdue, (Object) null, (Object) null);
        zzaVar.zza((zza) this);
        return zzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbcu
    public final /* synthetic */ zzbcv zzadf() {
        return (zza) zza(zze.zzdue, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.ads.zzbcw
    public final /* synthetic */ zzbcu zzadg() {
        return (zzbbo) zza(zze.zzduf, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.ads.zzbcu
    public final void zzb(zzbav zzbavVar) throws IOException {
        zzbdg.zzaeo().zze(getClass()).zza(this, zzbax.zza(zzbavVar));
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    final void zzbj(int i) {
        this.zzdtu = i;
    }
}
