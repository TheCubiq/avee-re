.class public final Lcom/google/android/gms/internal/ads/zzays;
.super Ljava/lang/Object;


# instance fields
.field private final zzdnk:Lcom/google/android/gms/internal/ads/zzazh;

.field private final zzdnl:Lcom/google/android/gms/internal/ads/zzazh;


# direct methods
.method public constructor <init>([B[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzazh;->zzm([B)Lcom/google/android/gms/internal/ads/zzazh;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzays;->zzdnk:Lcom/google/android/gms/internal/ads/zzazh;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzazh;->zzm([B)Lcom/google/android/gms/internal/ads/zzazh;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzays;->zzdnl:Lcom/google/android/gms/internal/ads/zzazh;

    return-void
.end method


# virtual methods
.method public final zzaap()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzays;->zzdnk:Lcom/google/android/gms/internal/ads/zzazh;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzazh;->getBytes()[B

    move-result-object v0

    return-object v0
.end method

.method public final zzaaq()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzays;->zzdnl:Lcom/google/android/gms/internal/ads/zzazh;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzazh;->getBytes()[B

    move-result-object v0

    return-object v0
.end method
