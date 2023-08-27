package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhv;
import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzci {

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    /* loaded from: classes2.dex */
    public static final class zza extends zzhv<zza, C0019zza> implements zzji {
        private static final zza zzd;
        private static volatile zzjp<zza> zze;
        private zzid<zzb> zzc = zzbs();

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
        /* renamed from: com.google.android.gms.internal.measurement.zzci$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0019zza extends zzhv.zzb<zza, C0019zza> implements zzji {
            private C0019zza() {
                super(zza.zzd);
            }

            /* synthetic */ C0019zza(zzch zzchVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzhv
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzch.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0019zza(null);
                case 3:
                    return zza(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzb.class});
                case 4:
                    return zzd;
                case 5:
                    zzjp<zza> zzjpVar = zze;
                    if (zzjpVar == null) {
                        synchronized (zza.class) {
                            zzjpVar = zze;
                            if (zzjpVar == null) {
                                zzjpVar = new zzhv.zza<>(zzd);
                                zze = zzjpVar;
                            }
                        }
                    }
                    return zzjpVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zza zzaVar = new zza();
            zzd = zzaVar;
            zzhv.zza(zza.class, zzaVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    /* loaded from: classes2.dex */
    public static final class zzb extends zzhv<zzb, zza> implements zzji {
        private static final zzb zzk;
        private static volatile zzjp<zzb> zzl;
        private int zzc;
        private int zzd;
        private boolean zzf;
        private long zzg;
        private double zzh;
        private String zze = "";
        private zzid<zzb> zzi = zzbs();
        private String zzj = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
        /* renamed from: com.google.android.gms.internal.measurement.zzci$zzb$zzb  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum EnumC0020zzb implements zzia {
            UNDEFINED(0),
            NULL(1),
            STRING(2),
            NUMBER(3),
            BOOLEAN(4),
            LIST(5),
            MAP(6),
            STATEMENT(7);
            
            private static final zzhz<EnumC0020zzb> zzi = new zzcj();
            private final int zzj;

            @Override // com.google.android.gms.internal.measurement.zzia
            public final int zza() {
                return this.zzj;
            }

            public static EnumC0020zzb zza(int i) {
                switch (i) {
                    case 0:
                        return UNDEFINED;
                    case 1:
                        return NULL;
                    case 2:
                        return STRING;
                    case 3:
                        return NUMBER;
                    case 4:
                        return BOOLEAN;
                    case 5:
                        return LIST;
                    case 6:
                        return MAP;
                    case 7:
                        return STATEMENT;
                    default:
                        return null;
                }
            }

            public static zzic zzb() {
                return zzcl.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzj + " name=" + name() + Typography.greater;
            }

            EnumC0020zzb(int i) {
                this.zzj = i;
            }
        }

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
        /* loaded from: classes2.dex */
        public static final class zza extends zzhv.zzb<zzb, zza> implements zzji {
            private zza() {
                super(zzb.zzk);
            }

            /* synthetic */ zza(zzch zzchVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzhv
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzch.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005က\u0004\u0006\u001b\u0007ဈ\u0005", new Object[]{"zzc", "zzd", EnumC0020zzb.zzb(), "zze", "zzf", "zzg", "zzh", "zzi", zzb.class, "zzj"});
                case 4:
                    return zzk;
                case 5:
                    zzjp<zzb> zzjpVar = zzl;
                    if (zzjpVar == null) {
                        synchronized (zzb.class) {
                            zzjpVar = zzl;
                            if (zzjpVar == null) {
                                zzjpVar = new zzhv.zza<>(zzk);
                                zzl = zzjpVar;
                            }
                        }
                    }
                    return zzjpVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzk = zzbVar;
            zzhv.zza(zzb.class, zzbVar);
        }
    }
}
