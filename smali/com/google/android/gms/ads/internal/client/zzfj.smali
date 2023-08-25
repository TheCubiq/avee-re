.class public final Lcom/google/android/gms/ads/internal/client/zzfj;
.super Lcom/daaw/re3;
.source ""


# instance fields
.field public final p:Lcom/google/android/gms/ads/formats/ShouldDelayBannerRenderingListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/formats/ShouldDelayBannerRenderingListener;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/re3;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/zzfj;->p:Lcom/google/android/gms/ads/formats/ShouldDelayBannerRenderingListener;

    return-void
.end method


# virtual methods
.method public final zzb(Lcom/daaw/yd0;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzfj;->p:Lcom/google/android/gms/ads/formats/ShouldDelayBannerRenderingListener;

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Runnable;

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/formats/ShouldDelayBannerRenderingListener;->shouldDelayBannerRendering(Ljava/lang/Runnable;)Z

    move-result p1

    return p1
.end method
