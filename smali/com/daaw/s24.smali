.class public final Lcom/daaw/s24;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:J

.field public b:J

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v1, Lcom/daaw/g93;->B:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/s24;->a:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/s24;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/SurfaceTexture;Lcom/daaw/d24;)V
    .locals 6

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->getTimestamp()J

    move-result-wide v0

    iget-boolean p1, p0, Lcom/daaw/s24;->c:Z

    if-nez p1, :cond_2

    iget-wide v2, p0, Lcom/daaw/s24;->b:J

    sub-long v2, v0, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    iget-wide v4, p0, Lcom/daaw/s24;->a:J

    cmp-long p1, v2, v4

    if-ltz p1, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/s24;->c:Z

    iput-wide v0, p0, Lcom/daaw/s24;->b:J

    sget-object p1, Lcom/google/android/gms/ads/internal/util/zzs;->zza:Lcom/daaw/gv6;

    new-instance v0, Lcom/daaw/r24;

    invoke-direct {v0, p2}, Lcom/daaw/r24;-><init>(Lcom/daaw/d24;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/s24;->c:Z

    return-void
.end method
