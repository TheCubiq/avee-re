.class public final Lcom/daaw/l77;
.super Lcom/daaw/i77;
.source ""

# interfaces
.implements Ljava/util/concurrent/ScheduledExecutorService;


# instance fields
.field public final q:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/i77;-><init>(Ljava/util/concurrent/ExecutorService;)V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/l77;->q:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method


# virtual methods
.method public final bridge synthetic schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/v77;->E(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/daaw/v77;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/l77;->q:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, p1, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p2

    new-instance p3, Lcom/daaw/j77;

    invoke-direct {p3, p1, p2}, Lcom/daaw/j77;-><init>(Lcom/daaw/f77;Ljava/util/concurrent/ScheduledFuture;)V

    return-object p3
.end method

.method public final bridge synthetic schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1

    new-instance v0, Lcom/daaw/v77;

    invoke-direct {v0, p1}, Lcom/daaw/v77;-><init>(Ljava/util/concurrent/Callable;)V

    iget-object p1, p0, Lcom/daaw/l77;->q:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1, v0, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    new-instance p2, Lcom/daaw/j77;

    invoke-direct {p2, v0, p1}, Lcom/daaw/j77;-><init>(Lcom/daaw/f77;Ljava/util/concurrent/ScheduledFuture;)V

    return-object p2
.end method

.method public final bridge synthetic scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8

    new-instance v7, Lcom/daaw/k77;

    invoke-direct {v7, p1}, Lcom/daaw/k77;-><init>(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/daaw/l77;->q:Ljava/util/concurrent/ScheduledExecutorService;

    move-object v1, v7

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    new-instance p2, Lcom/daaw/j77;

    invoke-direct {p2, v7, p1}, Lcom/daaw/j77;-><init>(Lcom/daaw/f77;Ljava/util/concurrent/ScheduledFuture;)V

    return-object p2
.end method

.method public final bridge synthetic scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8

    new-instance v7, Lcom/daaw/k77;

    invoke-direct {v7, p1}, Lcom/daaw/k77;-><init>(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/daaw/l77;->q:Ljava/util/concurrent/ScheduledExecutorService;

    move-object v1, v7

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    new-instance p2, Lcom/daaw/j77;

    invoke-direct {p2, v7, p1}, Lcom/daaw/j77;-><init>(Lcom/daaw/f77;Ljava/util/concurrent/ScheduledFuture;)V

    return-object p2
.end method
