.class public final Lcom/google/android/gms/internal/ads/zzavc;
.super Ljava/lang/Object;


# static fields
.field public static final zzdht:Lcom/google/android/gms/internal/ads/zzayf;

.field private static final zzdhu:Lcom/google/android/gms/internal/ads/zzayf;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzayf;->zzaam()Lcom/google/android/gms/internal/ads/zzayf$zza;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzaur;->zzdht:Lcom/google/android/gms/internal/ads/zzayf;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zza(Lcom/google/android/gms/internal/ads/zzbbo;)Lcom/google/android/gms/internal/ads/zzbbo$zza;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzayf$zza;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "TinkHybridDecrypt"

    const-string v4, "HybridDecrypt"

    const-string v5, "EciesAeadHkdfPrivateKey"

    invoke-static {v3, v4, v5, v2, v1}, Lcom/google/android/gms/internal/ads/zzaub;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)Lcom/google/android/gms/internal/ads/zzaxp;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzayf$zza;->zzb(Lcom/google/android/gms/internal/ads/zzaxp;)Lcom/google/android/gms/internal/ads/zzayf$zza;

    move-result-object v0

    const-string v4, "TinkHybridEncrypt"

    const-string v5, "HybridEncrypt"

    const-string v6, "EciesAeadHkdfPublicKey"

    invoke-static {v4, v5, v6, v2, v1}, Lcom/google/android/gms/internal/ads/zzaub;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)Lcom/google/android/gms/internal/ads/zzaxp;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzayf$zza;->zzb(Lcom/google/android/gms/internal/ads/zzaxp;)Lcom/google/android/gms/internal/ads/zzayf$zza;

    move-result-object v0

    const-string v1, "TINK_HYBRID_1_0_0"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzayf$zza;->zzej(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzayf$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadi()Lcom/google/android/gms/internal/ads/zzbbo;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzayf;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzavc;->zzdht:Lcom/google/android/gms/internal/ads/zzayf;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzayf;->zzaam()Lcom/google/android/gms/internal/ads/zzayf$zza;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzavc;->zzdht:Lcom/google/android/gms/internal/ads/zzayf;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zza(Lcom/google/android/gms/internal/ads/zzbbo;)Lcom/google/android/gms/internal/ads/zzbbo$zza;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzayf$zza;

    const-string v1, "TINK_HYBRID_1_1_0"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzayf$zza;->zzej(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzayf$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadi()Lcom/google/android/gms/internal/ads/zzbbo;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzayf;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzavc;->zzdhu:Lcom/google/android/gms/internal/ads/zzayf;

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzave;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzave;-><init>()V

    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzauo;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaua;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzavd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzavd;-><init>()V

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/ads/zzauo;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaua;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzaur;->zzwk()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
