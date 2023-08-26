.class final Lcom/google/android/gms/internal/ads/zzaoc;
.super Ljava/util/concurrent/FutureTask;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzanz;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/FutureTask<",
        "TV;>;",
        "Lcom/google/android/gms/internal/ads/zzanz<",
        "TV;>;"
    }
.end annotation


# instance fields
.field private final zzcvt:Lcom/google/android/gms/internal/ads/zzaoa;


# direct methods
.method constructor <init>(Ljava/lang/Runnable;Ljava/lang/Object;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "TV;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaoa;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaoa;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaoc;->zzcvt:Lcom/google/android/gms/internal/ads/zzaoa;

    return-void
.end method

.method constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaoa;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaoa;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaoc;->zzcvt:Lcom/google/android/gms/internal/ads/zzaoa;

    return-void
.end method


# virtual methods
.method protected final done()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoc;->zzcvt:Lcom/google/android/gms/internal/ads/zzaoa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaoa;->zzsm()V

    return-void
.end method

.method public final zza(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoc;->zzcvt:Lcom/google/android/gms/internal/ads/zzaoa;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzaoa;->zza(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method
