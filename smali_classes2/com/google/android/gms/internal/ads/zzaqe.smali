.class public final Lcom/google/android/gms/internal/ads/zzaqe;
.super Lcom/google/android/gms/internal/ads/zzajx;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field final zzcyg:Lcom/google/android/gms/internal/ads/zzapw;

.field final zzdav:Lcom/google/android/gms/internal/ads/zzaqh;

.field private final zzdaw:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzapw;Lcom/google/android/gms/internal/ads/zzaqh;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzajx;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqe;->zzcyg:Lcom/google/android/gms/internal/ads/zzapw;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaqe;->zzdav:Lcom/google/android/gms/internal/ads/zzaqh;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzaqe;->zzdaw:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzff()Lcom/google/android/gms/internal/ads/zzaqg;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/ads/zzaqg;->zza(Lcom/google/android/gms/internal/ads/zzaqe;)V

    return-void
.end method


# virtual methods
.method public final onStop()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqe;->zzdav:Lcom/google/android/gms/internal/ads/zzaqh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaqh;->abort()V

    return-void
.end method

.method public final zzdn()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqe;->zzdav:Lcom/google/android/gms/internal/ads/zzaqh;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaqe;->zzdaw:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzaqh;->zzdp(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzakk;->zzcrm:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzaqf;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzaqf;-><init>(Lcom/google/android/gms/internal/ads/zzaqe;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzakk;->zzcrm:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzaqf;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/zzaqf;-><init>(Lcom/google/android/gms/internal/ads/zzaqe;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    throw v0
.end method
