.class public final Lcom/daaw/v77;
.super Lcom/daaw/i67;
.source ""

# interfaces
.implements Ljava/util/concurrent/RunnableFuture;


# instance fields
.field public volatile w:Lcom/daaw/e77;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/v57;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/i67;-><init>()V

    new-instance v0, Lcom/daaw/t77;

    invoke-direct {v0, p0, p1}, Lcom/daaw/t77;-><init>(Lcom/daaw/v77;Lcom/daaw/v57;)V

    iput-object v0, p0, Lcom/daaw/v77;->w:Lcom/daaw/e77;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/i67;-><init>()V

    new-instance v0, Lcom/daaw/u77;

    invoke-direct {v0, p0, p1}, Lcom/daaw/u77;-><init>(Lcom/daaw/v77;Ljava/util/concurrent/Callable;)V

    iput-object v0, p0, Lcom/daaw/v77;->w:Lcom/daaw/e77;

    return-void
.end method

.method public static E(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/daaw/v77;
    .locals 1

    new-instance v0, Lcom/daaw/v77;

    invoke-static {p0, p1}, Ljava/util/concurrent/Executors;->callable(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Callable;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/daaw/v77;-><init>(Ljava/util/concurrent/Callable;)V

    return-object v0
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 3
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    iget-object v0, p0, Lcom/daaw/v77;->w:Lcom/daaw/e77;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "task=["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/daaw/c57;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final g()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/c57;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/v77;->w:Lcom/daaw/e77;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/e77;->g()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/v77;->w:Lcom/daaw/e77;

    return-void
.end method

.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/v77;->w:Lcom/daaw/e77;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/e77;->run()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/v77;->w:Lcom/daaw/e77;

    return-void
.end method
