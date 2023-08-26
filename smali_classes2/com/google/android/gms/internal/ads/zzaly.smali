.class final Lcom/google/android/gms/internal/ads/zzaly;
.super Lcom/google/android/gms/internal/ads/zzav;


# instance fields
.field private final synthetic zzctk:[B

.field private final synthetic zzctl:Ljava/util/Map;

.field private final synthetic zzctm:Lcom/google/android/gms/internal/ads/zzamy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzalt;ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzz;Lcom/google/android/gms/internal/ads/zzy;[BLjava/util/Map;Lcom/google/android/gms/internal/ads/zzamy;)V
    .locals 0

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzaly;->zzctk:[B

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzaly;->zzctl:Ljava/util/Map;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzaly;->zzctm:Lcom/google/android/gms/internal/ads/zzamy;

    invoke-direct {p0, p2, p3, p4, p5}, Lcom/google/android/gms/internal/ads/zzav;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzz;Lcom/google/android/gms/internal/ads/zzy;)V

    return-void
.end method


# virtual methods
.method public final getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zza;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaly;->zzctl:Ljava/util/Map;

    if-nez v0, :cond_0

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/zzav;->getHeaders()Ljava/util/Map;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method protected final synthetic zza(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzav;->zzh(Ljava/lang/String;)V

    return-void
.end method

.method public final zzg()[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zza;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaly;->zzctk:[B

    if-nez v0, :cond_0

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/zzav;->zzg()[B

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method protected final zzh(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaly;->zzctm:Lcom/google/android/gms/internal/ads/zzamy;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzamy;->zzdg(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/zzav;->zzh(Ljava/lang/String;)V

    return-void
.end method
