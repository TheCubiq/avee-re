.class final Lcom/google/android/gms/internal/ads/zzacc;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzcay:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final synthetic zzcaz:I

.field private final synthetic zzcba:Lcom/google/android/gms/internal/ads/zzaoj;

.field private final synthetic zzcbb:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/util/concurrent/atomic/AtomicInteger;ILcom/google/android/gms/internal/ads/zzaoj;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzacc;->zzcay:Ljava/util/concurrent/atomic/AtomicInteger;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzacc;->zzcaz:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzacc;->zzcba:Lcom/google/android/gms/internal/ads/zzaoj;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzacc;->zzcbb:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzacc;->zzcay:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzacc;->zzcaz:I

    if-lt v0, v1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzacc;->zzcba:Lcom/google/android/gms/internal/ads/zzaoj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzacc;->zzcbb:Ljava/util/List;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzabv;->zzl(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzaoj;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    const-string v1, "Unable to convert list of futures to a future of list"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
