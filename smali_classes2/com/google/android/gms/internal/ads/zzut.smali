.class final synthetic Lcom/google/android/gms/internal/ads/zzut;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzbpo:Lcom/google/android/gms/internal/ads/zzus;

.field private final zzbpp:Lcom/google/android/gms/ads/internal/gmsg/zzv;

.field private final zzbpq:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzus;Lcom/google/android/gms/ads/internal/gmsg/zzv;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzut;->zzbpo:Lcom/google/android/gms/internal/ads/zzus;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzut;->zzbpp:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzut;->zzbpq:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzut;->zzbpo:Lcom/google/android/gms/internal/ads/zzus;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzut;->zzbpp:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzut;->zzbpq:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzus;->getReference()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/ads/internal/gmsg/zzv;->zza(Ljava/lang/Object;Ljava/util/Map;)V

    return-void
.end method
