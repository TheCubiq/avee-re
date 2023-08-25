.class public final Lcom/daaw/s77;
.super Lcom/daaw/i67;
.source ""


# instance fields
.field public w:Lcom/daaw/f77;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field public x:Ljava/util/concurrent/ScheduledFuture;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/f77;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/i67;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/s77;->w:Lcom/daaw/f77;

    return-void
.end method

.method public static bridge synthetic E(Lcom/daaw/s77;)Lcom/daaw/f77;
    .locals 0

    iget-object p0, p0, Lcom/daaw/s77;->w:Lcom/daaw/f77;

    return-object p0
.end method

.method public static F(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;
    .locals 2

    new-instance v0, Lcom/daaw/s77;

    invoke-direct {v0, p0}, Lcom/daaw/s77;-><init>(Lcom/daaw/f77;)V

    new-instance v1, Lcom/daaw/p77;

    invoke-direct {v1, v0}, Lcom/daaw/p77;-><init>(Lcom/daaw/s77;)V

    invoke-interface {p4, v1, p1, p2, p3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, v0, Lcom/daaw/s77;->x:Ljava/util/concurrent/ScheduledFuture;

    sget-object p1, Lcom/daaw/g67;->p:Lcom/daaw/g67;

    invoke-interface {p0, v1, p1}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static bridge synthetic G(Lcom/daaw/s77;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    iget-object p0, p0, Lcom/daaw/s77;->x:Ljava/util/concurrent/ScheduledFuture;

    return-object p0
.end method

.method public static bridge synthetic H(Lcom/daaw/s77;Ljava/util/concurrent/ScheduledFuture;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/s77;->x:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 6
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    iget-object v0, p0, Lcom/daaw/s77;->w:Lcom/daaw/f77;

    iget-object v1, p0, Lcom/daaw/s77;->x:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "inputFuture=["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2}, Ljava/util/concurrent/ScheduledFuture;->getDelay(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", remaining delay=["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " ms]"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/s77;->w:Lcom/daaw/f77;

    invoke-virtual {p0, v0}, Lcom/daaw/c57;->v(Ljava/util/concurrent/Future;)V

    iget-object v0, p0, Lcom/daaw/s77;->x:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/s77;->w:Lcom/daaw/f77;

    iput-object v0, p0, Lcom/daaw/s77;->x:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method
