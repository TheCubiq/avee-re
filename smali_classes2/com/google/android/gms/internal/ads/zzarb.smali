.class final Lcom/google/android/gms/internal/ads/zzarb;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/zzn;


# instance fields
.field private zzbnc:Lcom/google/android/gms/ads/internal/overlay/zzn;

.field private zzdcj:Lcom/google/android/gms/internal/ads/zzaqw;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzaqw;Lcom/google/android/gms/ads/internal/overlay/zzn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzdcj:Lcom/google/android/gms/internal/ads/zzaqw;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzbnc:Lcom/google/android/gms/ads/internal/overlay/zzn;

    return-void
.end method


# virtual methods
.method public final onPause()V
    .locals 0

    return-void
.end method

.method public final onResume()V
    .locals 0

    return-void
.end method

.method public final zzcb()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzbnc:Lcom/google/android/gms/ads/internal/overlay/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/overlay/zzn;->zzcb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzdcj:Lcom/google/android/gms/internal/ads/zzaqw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->zzty()V

    return-void
.end method

.method public final zzcc()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzbnc:Lcom/google/android/gms/ads/internal/overlay/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/overlay/zzn;->zzcc()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzdcj:Lcom/google/android/gms/internal/ads/zzaqw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->zzno()V

    return-void
.end method
