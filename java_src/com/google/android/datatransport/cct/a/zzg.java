package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.zzp;
/* loaded from: classes.dex */
final class zzg extends zzp {
    private final zzp.zzb zza;
    private final com.google.android.datatransport.cct.a.zza zzb;

    /* loaded from: classes.dex */
    static final class zza extends zzp.zza {
        private zzp.zzb zza;
        private com.google.android.datatransport.cct.a.zza zzb;

        @Override // com.google.android.datatransport.cct.a.zzp.zza
        public zzp.zza zza(zzp.zzb zzbVar) {
            this.zza = zzbVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzp.zza
        public zzp.zza zza(com.google.android.datatransport.cct.a.zza zzaVar) {
            this.zzb = zzaVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzp.zza
        public zzp zza() {
            return new zzg(this.zza, this.zzb, null);
        }
    }

    /* synthetic */ zzg(zzp.zzb zzbVar, com.google.android.datatransport.cct.a.zza zzaVar, zzf zzfVar) {
        this.zza = zzbVar;
        this.zzb = zzaVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzp) {
            zzp.zzb zzbVar = this.zza;
            if (zzbVar != null ? zzbVar.equals(((zzg) obj).zza) : ((zzg) obj).zza == null) {
                com.google.android.datatransport.cct.a.zza zzaVar = this.zzb;
                if (zzaVar == null) {
                    if (((zzg) obj).zzb == null) {
                        return true;
                    }
                } else if (zzaVar.equals(((zzg) obj).zzb)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        zzp.zzb zzbVar = this.zza;
        int hashCode = ((zzbVar == null ? 0 : zzbVar.hashCode()) ^ 1000003) * 1000003;
        com.google.android.datatransport.cct.a.zza zzaVar = this.zzb;
        return hashCode ^ (zzaVar != null ? zzaVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.zza + ", androidClientInfo=" + this.zzb + "}";
    }

    @Override // com.google.android.datatransport.cct.a.zzp
    public com.google.android.datatransport.cct.a.zza zzb() {
        return this.zzb;
    }

    @Override // com.google.android.datatransport.cct.a.zzp
    public zzp.zzb zzc() {
        return this.zza;
    }
}
