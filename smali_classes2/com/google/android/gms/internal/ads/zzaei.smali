.class public final Lcom/google/android/gms/internal/ads/zzaei;
.super Lcom/google/android/gms/internal/ads/zzaer;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field private final zzcen:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/google/android/gms/internal/ads/zzadx;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzadx;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaer;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaei;->zzcen:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaej;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaei;->zzcen:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzadx;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzadx;->zza(Lcom/google/android/gms/internal/ads/zzaej;)V

    :cond_0
    return-void
.end method
