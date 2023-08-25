.class public final Lcom/daaw/zk6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/cl6;

.field public final synthetic b:Lcom/daaw/dl6;


# direct methods
.method public constructor <init>(Lcom/daaw/dl6;Lcom/daaw/cl6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zk6;->b:Lcom/daaw/dl6;

    iput-object p2, p0, Lcom/daaw/zk6;->a:Lcom/daaw/cl6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Ljava/lang/Void;

    iget-object p1, p0, Lcom/daaw/zk6;->b:Lcom/daaw/dl6;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/zk6;->b:Lcom/daaw/dl6;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/dl6;->c(Lcom/daaw/dl6;Lcom/daaw/jl6;)V

    iget-object v0, p0, Lcom/daaw/zk6;->b:Lcom/daaw/dl6;

    invoke-static {v0}, Lcom/daaw/dl6;->b(Lcom/daaw/dl6;)Ljava/util/ArrayDeque;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/zk6;->a:Lcom/daaw/cl6;

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/zk6;->b:Lcom/daaw/dl6;

    invoke-static {v0}, Lcom/daaw/dl6;->g(Lcom/daaw/dl6;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    invoke-static {v0}, Lcom/daaw/dl6;->d(Lcom/daaw/dl6;)V

    :cond_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/zk6;->b:Lcom/daaw/dl6;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/zk6;->b:Lcom/daaw/dl6;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/dl6;->c(Lcom/daaw/dl6;Lcom/daaw/jl6;)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
