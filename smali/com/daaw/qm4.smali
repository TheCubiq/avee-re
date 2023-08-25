.class public final Lcom/daaw/qm4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final c:Lcom/daaw/f77;

.field public volatile d:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/f77;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/qm4;->d:Z

    iput-object p1, p0, Lcom/daaw/qm4;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/daaw/qm4;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Lcom/daaw/qm4;->c:Lcom/daaw/f77;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/qm4;Ljava/util/List;Lcom/daaw/o67;)V
    .locals 5

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/f77;

    new-instance v2, Lcom/daaw/im4;

    invoke-direct {v2, p2}, Lcom/daaw/im4;-><init>(Lcom/daaw/o67;)V

    iget-object v3, p0, Lcom/daaw/qm4;->a:Ljava/util/concurrent/Executor;

    const-class v4, Ljava/lang/Throwable;

    invoke-static {v0, v4, v2, v3}, Lcom/daaw/s67;->g(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    new-instance v2, Lcom/daaw/jm4;

    invoke-direct {v2, p0, p2, v1}, Lcom/daaw/jm4;-><init>(Lcom/daaw/qm4;Lcom/daaw/o67;Lcom/daaw/f77;)V

    iget-object v1, p0, Lcom/daaw/qm4;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v2, v1}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/daaw/pm4;

    invoke-direct {p1, p0, p2}, Lcom/daaw/pm4;-><init>(Lcom/daaw/qm4;Lcom/daaw/o67;)V

    iget-object p0, p0, Lcom/daaw/qm4;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, p1, p0}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_2
    :goto_1
    iget-object p0, p0, Lcom/daaw/qm4;->a:Ljava/util/concurrent/Executor;

    new-instance p1, Lcom/daaw/hm4;

    invoke-direct {p1, p2}, Lcom/daaw/hm4;-><init>(Lcom/daaw/o67;)V

    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic c(Lcom/daaw/qm4;)V
    .locals 2

    sget-object v0, Lcom/daaw/z04;->e:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/km4;

    invoke-direct {v1, p0}, Lcom/daaw/km4;-><init>(Lcom/daaw/qm4;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/daaw/o67;Lcom/daaw/f77;Lcom/daaw/zl4;)Lcom/daaw/f77;
    .locals 2

    if-eqz p3, :cond_0

    invoke-interface {p1, p3}, Lcom/daaw/o67;->a(Ljava/lang/Object;)V

    :cond_0
    sget-object p1, Lcom/daaw/rb3;->b:Lcom/daaw/ma3;

    invoke-virtual {p1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object p3, p0, Lcom/daaw/qm4;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {p2, v0, v1, p1, p3}, Lcom/daaw/s67;->o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/qm4;->d:Z

    return-void
.end method

.method public final e(Lcom/daaw/o67;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qm4;->c:Lcom/daaw/f77;

    new-instance v1, Lcom/daaw/lm4;

    invoke-direct {v1, p0, p1}, Lcom/daaw/lm4;-><init>(Lcom/daaw/qm4;Lcom/daaw/o67;)V

    iget-object p1, p0, Lcom/daaw/qm4;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/qm4;->d:Z

    return v0
.end method
