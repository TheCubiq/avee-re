.class final Lcom/google/android/gms/internal/ads/zzsc;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzblg:Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

.field private final synthetic zzblh:Lcom/google/android/gms/internal/ads/zzks;

.field private final synthetic zzbli:Lcom/google/android/gms/internal/ads/zzsb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzsb;Lcom/google/android/gms/ads/doubleclick/PublisherAdView;Lcom/google/android/gms/internal/ads/zzks;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsc;->zzbli:Lcom/google/android/gms/internal/ads/zzsb;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzsc;->zzblg:Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzsc;->zzblh:Lcom/google/android/gms/internal/ads/zzks;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsc;->zzblg:Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsc;->zzblh:Lcom/google/android/gms/internal/ads/zzks;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->zza(Lcom/google/android/gms/internal/ads/zzks;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsc;->zzbli:Lcom/google/android/gms/internal/ads/zzsb;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzsb;->zza(Lcom/google/android/gms/internal/ads/zzsb;)Lcom/google/android/gms/ads/formats/OnPublisherAdViewLoadedListener;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsc;->zzblg:Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/formats/OnPublisherAdViewLoadedListener;->onPublisherAdViewLoaded(Lcom/google/android/gms/ads/doubleclick/PublisherAdView;)V

    return-void

    :cond_0
    const-string v0, "Could not bind."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzane;->zzdk(Ljava/lang/String;)V

    return-void
.end method
