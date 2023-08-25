.class public final Lcom/daaw/g74;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/zzo;


# instance fields
.field public final p:Lcom/daaw/a74;

.field public final q:Lcom/google/android/gms/ads/internal/overlay/zzo;


# direct methods
.method public constructor <init>(Lcom/daaw/a74;Lcom/google/android/gms/ads/internal/overlay/zzo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g74;->p:Lcom/daaw/a74;

    iput-object p2, p0, Lcom/daaw/g74;->q:Lcom/google/android/gms/ads/internal/overlay/zzo;

    return-void
.end method


# virtual methods
.method public final zzb()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g74;->q:Lcom/google/android/gms/ads/internal/overlay/zzo;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/overlay/zzo;->zzb()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/g74;->p:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->zzZ()V

    return-void
.end method

.method public final zzbE()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g74;->q:Lcom/google/android/gms/ads/internal/overlay/zzo;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/overlay/zzo;->zzbE()V

    :cond_0
    return-void
.end method

.method public final zzbM()V
    .locals 0

    return-void
.end method

.method public final zzbs()V
    .locals 0

    return-void
.end method

.method public final zze()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g74;->q:Lcom/google/android/gms/ads/internal/overlay/zzo;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/overlay/zzo;->zze()V

    :cond_0
    return-void
.end method

.method public final zzf(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g74;->q:Lcom/google/android/gms/ads/internal/overlay/zzo;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/internal/overlay/zzo;->zzf(I)V

    :cond_0
    iget-object p1, p0, Lcom/daaw/g74;->p:Lcom/daaw/a74;

    invoke-interface {p1}, Lcom/daaw/a74;->zzX()V

    return-void
.end method
