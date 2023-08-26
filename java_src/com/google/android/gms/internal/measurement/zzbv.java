package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhv;
import java.util.List;
import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzbv {

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    /* loaded from: classes2.dex */
    public static final class zza extends zzhv<zza, C0016zza> implements zzji {
        private static final zza zzi;
        private static volatile zzjp<zza> zzj;
        private int zzc;
        private int zzd;
        private zzid<zze> zze = zzbs();
        private zzid<zzb> zzf = zzbs();
        private boolean zzg;
        private boolean zzh;

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
        /* renamed from: com.google.android.gms.internal.measurement.zzbv$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0016zza extends zzhv.zzb<zza, C0016zza> implements zzji {
            private C0016zza() {
                super(zza.zzi);
            }

            public final int zza() {
                return ((zza) this.zza).zzd();
            }

            public final zze zza(int i) {
                return ((zza) this.zza).zza(i);
            }

            public final C0016zza zza(int i, zze.zza zzaVar) {
                if (this.zzb) {
                    zzu();
                    this.zzb = false;
                }
                ((zza) this.zza).zza(i, (zze) ((zzhv) zzaVar.zzy()));
                return this;
            }

            public final int zzb() {
                return ((zza) this.zza).zzf();
            }

            public final zzb zzb(int i) {
                return ((zza) this.zza).zzb(i);
            }

            public final C0016zza zza(int i, zzb.zza zzaVar) {
                if (this.zzb) {
                    zzu();
                    this.zzb = false;
                }
                ((zza) this.zza).zza(i, (zzb) ((zzhv) zzaVar.zzy()));
                return this;
            }

            /* synthetic */ C0016zza(zzbw zzbwVar) {
                this();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final int zzb() {
            return this.zzd;
        }

        public final List<zze> zzc() {
            return this.zze;
        }

        public final int zzd() {
            return this.zze.size();
        }

        public final zze zza(int i) {
            return this.zze.get(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, zze zzeVar) {
            zzeVar.getClass();
            zzid<zze> zzidVar = this.zze;
            if (!zzidVar.zza()) {
                this.zze = zzhv.zza(zzidVar);
            }
            this.zze.set(i, zzeVar);
        }

        public final List<zzb> zze() {
            return this.zzf;
        }

        public final int zzf() {
            return this.zzf.size();
        }

        public final zzb zzb(int i) {
            return this.zzf.get(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, zzb zzbVar) {
            zzbVar.getClass();
            zzid<zzb> zzidVar = this.zzf;
            if (!zzidVar.zza()) {
                this.zzf = zzhv.zza(zzidVar);
            }
            this.zzf.set(i, zzbVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzhv
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbw.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0016zza(null);
                case 3:
                    return zza(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzc", "zzd", "zze", zze.class, "zzf", zzb.class, "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    zzjp<zza> zzjpVar = zzj;
                    if (zzjpVar == null) {
                        synchronized (zza.class) {
                            zzjpVar = zzj;
                            if (zzjpVar == null) {
                                zzjpVar = new zzhv.zza<>(zzi);
                                zzj = zzjpVar;
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
            zzi = zzaVar;
            zzhv.zza(zza.class, zzaVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    /* loaded from: classes2.dex */
    public static final class zzb extends zzhv<zzb, zza> implements zzji {
        private static final zzb zzl;
        private static volatile zzjp<zzb> zzm;
        private int zzc;
        private int zzd;
        private String zze = "";
        private zzid<zzc> zzf = zzbs();
        private boolean zzg;
        private zzd zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
        /* loaded from: classes2.dex */
        public static final class zza extends zzhv.zzb<zzb, zza> implements zzji {
            private zza() {
                super(zzb.zzl);
            }

            public final String zza() {
                return ((zzb) this.zza).zzc();
            }

            public final zza zza(String str) {
                if (this.zzb) {
                    zzu();
                    this.zzb = false;
                }
                ((zzb) this.zza).zza(str);
                return this;
            }

            public final int zzb() {
                return ((zzb) this.zza).zze();
            }

            public final zzc zza(int i) {
                return ((zzb) this.zza).zza(i);
            }

            public final zza zza(int i, zzc zzcVar) {
                if (this.zzb) {
                    zzu();
                    this.zzb = false;
                }
                ((zzb) this.zza).zza(i, zzcVar);
                return this;
            }

            /* synthetic */ zza(zzbw zzbwVar) {
                this();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final int zzb() {
            return this.zzd;
        }

        public final String zzc() {
            return this.zze;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        public final List<zzc> zzd() {
            return this.zzf;
        }

        public final int zze() {
            return this.zzf.size();
        }

        public final zzc zza(int i) {
            return this.zzf.get(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, zzc zzcVar) {
            zzcVar.getClass();
            zzid<zzc> zzidVar = this.zzf;
            if (!zzidVar.zza()) {
                this.zzf = zzhv.zza(zzidVar);
            }
            this.zzf.set(i, zzcVar);
        }

        public final boolean zzf() {
            return (this.zzc & 8) != 0;
        }

        public final zzd zzg() {
            zzd zzdVar = this.zzh;
            return zzdVar == null ? zzd.zzk() : zzdVar;
        }

        public final boolean zzh() {
            return this.zzi;
        }

        public final boolean zzi() {
            return this.zzj;
        }

        public final boolean zzj() {
            return (this.zzc & 64) != 0;
        }

        public final boolean zzk() {
            return this.zzk;
        }

        public static zza zzl() {
            return zzl.zzbm();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzhv
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbw.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", zzc.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzl;
                case 5:
                    zzjp<zzb> zzjpVar = zzm;
                    if (zzjpVar == null) {
                        synchronized (zzb.class) {
                            zzjpVar = zzm;
                            if (zzjpVar == null) {
                                zzjpVar = new zzhv.zza<>(zzl);
                                zzm = zzjpVar;
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
            zzl = zzbVar;
            zzhv.zza(zzb.class, zzbVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    /* loaded from: classes2.dex */
    public static final class zzd extends zzhv<zzd, zzb> implements zzji {
        private static final zzd zzi;
        private static volatile zzjp<zzd> zzj;
        private int zzc;
        private int zzd;
        private boolean zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
        /* loaded from: classes2.dex */
        public enum zza implements zzia {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);
            
            private static final zzhz<zza> zzf = new zzby();
            private final int zzg;

            @Override // com.google.android.gms.internal.measurement.zzia
            public final int zza() {
                return this.zzg;
            }

            public static zza zza(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    return null;
                                }
                                return BETWEEN;
                            }
                            return EQUAL;
                        }
                        return GREATER_THAN;
                    }
                    return LESS_THAN;
                }
                return UNKNOWN_COMPARISON_TYPE;
            }

            public static zzic zzb() {
                return zzbx.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + Typography.greater;
            }

            zza(int i) {
                this.zzg = i;
            }
        }

        private zzd() {
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
        /* loaded from: classes2.dex */
        public static final class zzb extends zzhv.zzb<zzd, zzb> implements zzji {
            private zzb() {
                super(zzd.zzi);
            }

            /* synthetic */ zzb(zzbw zzbwVar) {
                this();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final zza zzb() {
            zza zza2 = zza.zza(this.zzd);
            return zza2 == null ? zza.UNKNOWN_COMPARISON_TYPE : zza2;
        }

        public final boolean zzc() {
            return (this.zzc & 2) != 0;
        }

        public final boolean zzd() {
            return this.zze;
        }

        public final boolean zze() {
            return (this.zzc & 4) != 0;
        }

        public final String zzf() {
            return this.zzf;
        }

        public final boolean zzg() {
            return (this.zzc & 8) != 0;
        }

        public final String zzh() {
            return this.zzg;
        }

        public final boolean zzi() {
            return (this.zzc & 16) != 0;
        }

        public final String zzj() {
            return this.zzh;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzhv
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbw.zza[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb(null);
                case 3:
                    return zza(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzc", "zzd", zza.zzb(), "zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    zzjp<zzd> zzjpVar = zzj;
                    if (zzjpVar == null) {
                        synchronized (zzd.class) {
                            zzjpVar = zzj;
                            if (zzjpVar == null) {
                                zzjpVar = new zzhv.zza<>(zzi);
                                zzj = zzjpVar;
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

        public static zzd zzk() {
            return zzi;
        }

        static {
            zzd zzdVar = new zzd();
            zzi = zzdVar;
            zzhv.zza(zzd.class, zzdVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    /* loaded from: classes2.dex */
    public static final class zzf extends zzhv<zzf, zza> implements zzji {
        private static final zzf zzh;
        private static volatile zzjp<zzf> zzi;
        private int zzc;
        private int zzd;
        private boolean zzf;
        private String zze = "";
        private zzid<String> zzg = zzhv.zzbs();

        /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
        /* loaded from: classes2.dex */
        public enum zzb implements zzia {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);
            
            private static final zzhz<zzb> zzh = new zzbz();
            private final int zzi;

            @Override // com.google.android.gms.internal.measurement.zzia
            public final int zza() {
                return this.zzi;
            }

            public static zzb zza(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }

            public static zzic zzb() {
                return zzcb.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + Typography.greater;
            }

            zzb(int i) {
                this.zzi = i;
            }
        }

        private zzf() {
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
        /* loaded from: classes2.dex */
        public static final class zza extends zzhv.zzb<zzf, zza> implements zzji {
            private zza() {
                super(zzf.zzh);
            }

            /* synthetic */ zza(zzbw zzbwVar) {
                this();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final zzb zzb() {
            zzb zza2 = zzb.zza(this.zzd);
            return zza2 == null ? zzb.UNKNOWN_MATCH_TYPE : zza2;
        }

        public final boolean zzc() {
            return (this.zzc & 2) != 0;
        }

        public final String zzd() {
            return this.zze;
        }

        public final boolean zze() {
            return (this.zzc & 4) != 0;
        }

        public final boolean zzf() {
            return this.zzf;
        }

        public final List<String> zzg() {
            return this.zzg;
        }

        public final int zzh() {
            return this.zzg.size();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzhv
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbw.zza[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzc", "zzd", zzb.zzb(), "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    zzjp<zzf> zzjpVar = zzi;
                    if (zzjpVar == null) {
                        synchronized (zzf.class) {
                            zzjpVar = zzi;
                            if (zzjpVar == null) {
                                zzjpVar = new zzhv.zza<>(zzh);
                                zzi = zzjpVar;
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

        public static zzf zzi() {
            return zzh;
        }

        static {
            zzf zzfVar = new zzf();
            zzh = zzfVar;
            zzhv.zza(zzf.class, zzfVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    /* loaded from: classes2.dex */
    public static final class zzc extends zzhv<zzc, zza> implements zzji {
        private static final zzc zzh;
        private static volatile zzjp<zzc> zzi;
        private int zzc;
        private zzf zzd;
        private zzd zze;
        private boolean zzf;
        private String zzg = "";

        private zzc() {
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
        /* loaded from: classes2.dex */
        public static final class zza extends zzhv.zzb<zzc, zza> implements zzji {
            private zza() {
                super(zzc.zzh);
            }

            public final zza zza(String str) {
                if (this.zzb) {
                    zzu();
                    this.zzb = false;
                }
                ((zzc) this.zza).zza(str);
                return this;
            }

            /* synthetic */ zza(zzbw zzbwVar) {
                this();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final zzf zzb() {
            zzf zzfVar = this.zzd;
            return zzfVar == null ? zzf.zzi() : zzfVar;
        }

        public final boolean zzc() {
            return (this.zzc & 2) != 0;
        }

        public final zzd zzd() {
            zzd zzdVar = this.zze;
            return zzdVar == null ? zzd.zzk() : zzdVar;
        }

        public final boolean zze() {
            return (this.zzc & 4) != 0;
        }

        public final boolean zzf() {
            return this.zzf;
        }

        public final boolean zzg() {
            return (this.zzc & 8) != 0;
        }

        public final String zzh() {
            return this.zzg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zzc |= 8;
            this.zzg = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzhv
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbw.zza[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    zzjp<zzc> zzjpVar = zzi;
                    if (zzjpVar == null) {
                        synchronized (zzc.class) {
                            zzjpVar = zzi;
                            if (zzjpVar == null) {
                                zzjpVar = new zzhv.zza<>(zzh);
                                zzi = zzjpVar;
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

        public static zzc zzi() {
            return zzh;
        }

        static {
            zzc zzcVar = new zzc();
            zzh = zzcVar;
            zzhv.zza(zzc.class, zzcVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    /* loaded from: classes2.dex */
    public static final class zze extends zzhv<zze, zza> implements zzji {
        private static final zze zzj;
        private static volatile zzjp<zze> zzk;
        private int zzc;
        private int zzd;
        private String zze = "";
        private zzc zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;

        private zze() {
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
        /* loaded from: classes2.dex */
        public static final class zza extends zzhv.zzb<zze, zza> implements zzji {
            private zza() {
                super(zze.zzj);
            }

            public final zza zza(String str) {
                if (this.zzb) {
                    zzu();
                    this.zzb = false;
                }
                ((zze) this.zza).zza(str);
                return this;
            }

            /* synthetic */ zza(zzbw zzbwVar) {
                this();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final int zzb() {
            return this.zzd;
        }

        public final String zzc() {
            return this.zze;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        public final zzc zzd() {
            zzc zzcVar = this.zzf;
            return zzcVar == null ? zzc.zzi() : zzcVar;
        }

        public final boolean zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return this.zzh;
        }

        public final boolean zzg() {
            return (this.zzc & 32) != 0;
        }

        public final boolean zzh() {
            return this.zzi;
        }

        public static zza zzi() {
            return zzj.zzbm();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzhv
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbw.zza[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    zzjp<zze> zzjpVar = zzk;
                    if (zzjpVar == null) {
                        synchronized (zze.class) {
                            zzjpVar = zzk;
                            if (zzjpVar == null) {
                                zzjpVar = new zzhv.zza<>(zzj);
                                zzk = zzjpVar;
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
            zze zzeVar = new zze();
            zzj = zzeVar;
            zzhv.zza(zze.class, zzeVar);
        }
    }
}
