.class public final Lcom/google/android/gms/internal/ads/zzji;
.super Lcom/google/android/gms/internal/ads/zzky;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field private final zzapv:Lcom/google/android/gms/ads/reward/zza;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/reward/zza;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzky;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzji;->zzapv:Lcom/google/android/gms/ads/reward/zza;

    return-void
.end method


# virtual methods
.method public final zzt()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzji;->zzapv:Lcom/google/android/gms/ads/reward/zza;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/reward/zza;->zzt()V

    :cond_0
    return-void
.end method
