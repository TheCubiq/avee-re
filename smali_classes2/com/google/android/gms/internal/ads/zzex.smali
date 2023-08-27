.class public final Lcom/google/android/gms/internal/ads/zzex;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgd;


# instance fields
.field private zzafm:Lcom/google/android/gms/internal/ads/zzoz;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzoz;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzex;->zzafm:Lcom/google/android/gms/internal/ads/zzoz;

    return-void
.end method


# virtual methods
.method public final zzgh()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzex;->zzafm:Lcom/google/android/gms/internal/ads/zzoz;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzoz;->zzkr()Landroid/view/View;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzgi()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzex;->zzafm:Lcom/google/android/gms/internal/ads/zzoz;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzgj()Lcom/google/android/gms/internal/ads/zzgd;
    .locals 0

    return-object p0
.end method
