.class public final Lcom/daaw/fb6;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lcom/daaw/ga6;Lcom/daaw/b56;Ljava/util/concurrent/ScheduledExecutorService;I)Lcom/daaw/i76;
    .locals 2

    const-wide/16 v0, 0x0

    if-nez p3, :cond_0

    new-instance p0, Lcom/daaw/j56;

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/daaw/j56;-><init>(Lcom/daaw/i76;JLjava/util/concurrent/ScheduledExecutorService;)V

    return-object p0

    :cond_0
    new-instance p1, Lcom/daaw/j56;

    invoke-direct {p1, p0, v0, v1, p2}, Lcom/daaw/j56;-><init>(Lcom/daaw/i76;JLjava/util/concurrent/ScheduledExecutorService;)V

    return-object p1
.end method

.method public static b(Lcom/daaw/ta6;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/i76;
    .locals 3

    new-instance v0, Lcom/daaw/j56;

    sget-object v1, Lcom/daaw/g93;->C3:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-direct {v0, p0, v1, v2, p1}, Lcom/daaw/j56;-><init>(Lcom/daaw/i76;JLjava/util/concurrent/ScheduledExecutorService;)V

    return-object v0
.end method

.method public static c(Lcom/daaw/ob6;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/i76;
    .locals 3

    new-instance v0, Lcom/daaw/j56;

    const-wide/16 v1, 0x0

    invoke-direct {v0, p0, v1, v2, p1}, Lcom/daaw/j56;-><init>(Lcom/daaw/i76;JLjava/util/concurrent/ScheduledExecutorService;)V

    return-object v0
.end method
