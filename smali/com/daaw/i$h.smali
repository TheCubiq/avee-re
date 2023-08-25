.class public final Lcom/daaw/i$h;
.super Lcom/daaw/i$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/daaw/i$b;-><init>(Lcom/daaw/i$a;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/i;Lcom/daaw/i$e;Lcom/daaw/i$e;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/i<",
            "*>;",
            "Lcom/daaw/i$e;",
            "Lcom/daaw/i$e;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/daaw/i;->q:Lcom/daaw/i$e;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lcom/daaw/i;->q:Lcom/daaw/i$e;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public b(Lcom/daaw/i;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/i<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/daaw/i;->p:Ljava/lang/Object;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lcom/daaw/i;->p:Ljava/lang/Object;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public c(Lcom/daaw/i;Lcom/daaw/i$i;Lcom/daaw/i$i;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/i<",
            "*>;",
            "Lcom/daaw/i$i;",
            "Lcom/daaw/i$i;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/daaw/i;->r:Lcom/daaw/i$i;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lcom/daaw/i;->r:Lcom/daaw/i$i;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public d(Lcom/daaw/i$i;Lcom/daaw/i$i;)V
    .locals 0

    iput-object p2, p1, Lcom/daaw/i$i;->b:Lcom/daaw/i$i;

    return-void
.end method

.method public e(Lcom/daaw/i$i;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Lcom/daaw/i$i;->a:Ljava/lang/Thread;

    return-void
.end method
