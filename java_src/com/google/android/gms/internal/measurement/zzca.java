package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzhv;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzca {

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    /* loaded from: classes2.dex */
    public static final class zza extends zzhv<zza, C0017zza> implements zzji {
        private static final zza zzh;
        private static volatile zzjp<zza> zzi;
        private int zzc;
        private String zzd = "";
        private boolean zze;
        private boolean zzf;
        private int zzg;

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
        /* renamed from: com.google.android.gms.internal.measurement.zzca$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0017zza extends zzhv.zzb<zza, C0017zza> implements zzji {
            private C0017zza() {
                super(zza.zzh);
            }

            public final String zza() {
                return ((zza) this.zza).zza();
            }

            public final C0017zza zza(String str) {
                if (this.zzb) {
                    zzu();
                    this.zzb = false;
                }
                ((zza) this.zza).zza(str);
                return this;
            }

            public final boolean zzb() {
                return ((zza) this.zza).zzb();
            }

            public final boolean zzc() {
                return ((zza) this.zza).zzc();
            }

            public final boolean zzd() {
                return ((zza) this.zza).zzd();
            }

            public final int zze() {
                return ((zza) this.zza).zze();
            }

            /* synthetic */ C0017zza(zzcc zzccVar) {
                this();
            }
        }

        public final String zza() {
            return this.zzd;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        public final boolean zzb() {
            return this.zze;
        }

        public final boolean zzc() {
            return this.zzf;
        }

        public final boolean zzd() {
            return (this.zzc & 8) != 0;
        }

        public final int zze() {
            return this.zzg;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzhv
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzcc.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0017zza(null);
                case 3:
                    return zza(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    zzjp<zza> zzjpVar = zzi;
                    if (zzjpVar == null) {
                        synchronized (zza.class) {
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

        static {
            zza zzaVar = new zza();
            zzh = zzaVar;
            zzhv.zza(zza.class, zzaVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    /* loaded from: classes2.dex */
    public static final class zzb extends zzhv<zzb, zza> implements zzji {
        private static final zzb zzm;
        private static volatile zzjp<zzb> zzn;
        private int zzc;
        private long zzd;
        private int zzf;
        private boolean zzk;
        private String zze = "";
        private zzid<zzc> zzg = zzbs();
        private zzid<zza> zzh = zzbs();
        private zzid<zzbv.zza> zzi = zzbs();
        private String zzj = "";
        private zzid<zzci.zza> zzl = zzbs();

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
        /* loaded from: classes2.dex */
        public static final class zza extends zzhv.zzb<zzb, zza> implements zzji {
            private zza() {
                super(zzb.zzm);
            }

            public final int zza() {
                return ((zzb) this.zza).zzf();
            }

            public final zza zza(int i) {
                return ((zzb) this.zza).zza(i);
            }

            public final zza zza(int i, zza.C0017zza c0017zza) {
                if (this.zzb) {
                    zzu();
                    this.zzb = false;
                }
                ((zzb) this.zza).zza(i, (zza) ((zzhv) c0017zza.zzy()));
                return this;
            }

            public final List<zzbv.zza> zzb() {
                return Collections.unmodifiableList(((zzb) this.zza).zzg());
            }

            public final zza zzc() {
                if (this.zzb) {
                    zzu();
                    this.zzb = false;
                }
                ((zzb) this.zza).zzl();
                return this;
            }

            /* synthetic */ zza(zzcc zzccVar) {
                this();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final long zzb() {
            return this.zzd;
        }

        public final boolean zzc() {
            return (this.zzc & 2) != 0;
        }

        public final String zzd() {
            return this.zze;
        }

        public final List<zzc> zze() {
            return this.zzg;
        }

        public final int zzf() {
            return this.zzh.size();
        }

        public final zza zza(int i) {
            return this.zzh.get(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, zza zzaVar) {
            zzaVar.getClass();
            zzid<zza> zzidVar = this.zzh;
            if (!zzidVar.zza()) {
                this.zzh = zzhv.zza(zzidVar);
            }
            this.zzh.set(i, zzaVar);
        }

        public final List<zzbv.zza> zzg() {
            return this.zzi;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzl() {
            this.zzi = zzbs();
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public static zza zzi() {
            return zzm.zzbm();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzhv
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzcc.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zzc.class, "zzh", zza.class, "zzi", zzbv.zza.class, "zzj", "zzk", "zzl", zzci.zza.class});
                case 4:
                    return zzm;
                case 5:
                    zzjp<zzb> zzjpVar = zzn;
                    if (zzjpVar == null) {
                        synchronized (zzb.class) {
                            zzjpVar = zzn;
                            if (zzjpVar == null) {
                                zzjpVar = new zzhv.zza<>(zzm);
                                zzn = zzjpVar;
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

        public static zzb zzj() {
            return zzm;
        }

        static {
            zzb zzbVar = new zzb();
            zzm = zzbVar;
            zzhv.zza(zzb.class, zzbVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    /* loaded from: classes2.dex */
    public static final class zzc extends zzhv<zzc, zza> implements zzji {
        private static final zzc zzf;
        private static volatile zzjp<zzc> zzg;
        private int zzc;
        private String zzd = "";
        private String zze = "";

        private zzc() {
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
        /* loaded from: classes2.dex */
        public static final class zza extends zzhv.zzb<zzc, zza> implements zzji {
            private zza() {
                super(zzc.zzf);
            }

            /* synthetic */ zza(zzcc zzccVar) {
                this();
            }
        }

        public final String zza() {
            return this.zzd;
        }

        public final String zzb() {
            return this.zze;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzhv
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzcc.zza[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    zzjp<zzc> zzjpVar = zzg;
                    if (zzjpVar == null) {
                        synchronized (zzc.class) {
                            zzjpVar = zzg;
                            if (zzjpVar == null) {
                                zzjpVar = new zzhv.zza<>(zzf);
                                zzg = zzjpVar;
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
            zzc zzcVar = new zzc();
            zzf = zzcVar;
            zzhv.zza(zzc.class, zzcVar);
        }
    }
}
