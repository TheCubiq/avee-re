.class public final Lcom/google/android/gms/ads/internal/zza;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final zza:Lcom/daaw/f24;

.field public final zzb:Lcom/daaw/s44;


# direct methods
.method public constructor <init>(Lcom/daaw/s44;Lcom/daaw/f24;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zza;->zzb:Lcom/daaw/s44;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zza;->zza:Lcom/daaw/f24;

    return-void
.end method

.method public static zza()Lcom/google/android/gms/ads/internal/zza;
    .locals 4

    new-instance v0, Lcom/google/android/gms/ads/internal/zza;

    new-instance v1, Lcom/daaw/s44;

    invoke-direct {v1}, Lcom/daaw/s44;-><init>()V

    new-instance v2, Lcom/daaw/q24;

    invoke-direct {v2}, Lcom/daaw/q24;-><init>()V

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/ads/internal/zza;-><init>(Lcom/daaw/s44;Lcom/daaw/f24;[B)V

    return-object v0
.end method
