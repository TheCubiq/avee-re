.class public final Lcom/google/android/gms/internal/ads/zzaki;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# static fields
.field public static final zzcrj:Lcom/google/android/gms/internal/ads/zzaod;

.field private static final zzcrk:Lcom/google/android/gms/internal/ads/zzaod;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v6}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const-string v0, "Default"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaki;->zzct(Ljava/lang/String;)Ljava/util/concurrent/ThreadFactory;

    move-result-object v7

    const/4 v1, 0x2

    const v2, 0x7fffffff

    const-wide/16 v3, 0xa

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzaoe;->zza(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzaod;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaki;->zzcrj:Lcom/google/android/gms/internal/ads/zzaod;

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const-string v1, "Loader"

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzaki;->zzct(Ljava/lang/String;)Ljava/util/concurrent/ThreadFactory;

    move-result-object v8

    const/4 v2, 0x5

    const/4 v3, 0x5

    const-wide/16 v4, 0xa

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaoe;->zza(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzaod;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaki;->zzcrk:Lcom/google/android/gms/internal/ads/zzaod;

    return-void
.end method

.method public static zza(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/zzanz;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaki;->zzcrj:Lcom/google/android/gms/internal/ads/zzaod;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/zzaod;->zza(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object p0

    return-object p0
.end method

.method public static zzb(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/ads/zzanz;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaki;->zzcrj:Lcom/google/android/gms/internal/ads/zzaod;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/zzaod;->zze(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object p0

    return-object p0
.end method

.method public static zzc(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/ads/zzanz;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaki;->zzcrk:Lcom/google/android/gms/internal/ads/zzaod;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/zzaod;->zze(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object p0

    return-object p0
.end method

.method private static zzct(Ljava/lang/String;)Ljava/util/concurrent/ThreadFactory;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzakj;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzakj;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
