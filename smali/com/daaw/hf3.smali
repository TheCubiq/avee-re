.class public final Lcom/daaw/hf3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/google/android/gms/ads/admanager/AdManagerAdView;

.field public final synthetic q:Lcom/google/android/gms/ads/internal/client/zzbu;

.field public final synthetic r:Lcom/daaw/if3;


# direct methods
.method public constructor <init>(Lcom/daaw/if3;Lcom/google/android/gms/ads/admanager/AdManagerAdView;Lcom/google/android/gms/ads/internal/client/zzbu;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hf3;->r:Lcom/daaw/if3;

    iput-object p2, p0, Lcom/daaw/hf3;->p:Lcom/google/android/gms/ads/admanager/AdManagerAdView;

    iput-object p3, p0, Lcom/daaw/hf3;->q:Lcom/google/android/gms/ads/internal/client/zzbu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/hf3;->p:Lcom/google/android/gms/ads/admanager/AdManagerAdView;

    iget-object v1, p0, Lcom/daaw/hf3;->q:Lcom/google/android/gms/ads/internal/client/zzbu;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/admanager/AdManagerAdView;->zzb(Lcom/google/android/gms/ads/internal/client/zzbu;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/hf3;->r:Lcom/daaw/if3;

    invoke-static {v0}, Lcom/daaw/if3;->h3(Lcom/daaw/if3;)Lcom/google/android/gms/ads/formats/OnAdManagerAdViewLoadedListener;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/hf3;->p:Lcom/google/android/gms/ads/admanager/AdManagerAdView;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/formats/OnAdManagerAdViewLoadedListener;->onAdManagerAdViewLoaded(Lcom/google/android/gms/ads/admanager/AdManagerAdView;)V

    return-void

    :cond_0
    const-string v0, "Could not bind."

    invoke-static {v0}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    return-void
.end method
