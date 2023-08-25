.class public final Lcom/daaw/o$h;
.super Lcom/daaw/o$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/daaw/o$b;-><init>(Lcom/daaw/o$a;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/o;Lcom/daaw/o$e;Lcom/daaw/o$e;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/o<",
            "*>;",
            "Lcom/daaw/o$e;",
            "Lcom/daaw/o$e;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/daaw/o;->q:Lcom/daaw/o$e;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lcom/daaw/o;->q:Lcom/daaw/o$e;

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

.method public b(Lcom/daaw/o;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/o<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/daaw/o;->p:Ljava/lang/Object;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lcom/daaw/o;->p:Ljava/lang/Object;

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

.method public c(Lcom/daaw/o;Lcom/daaw/o$i;Lcom/daaw/o$i;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/o<",
            "*>;",
            "Lcom/daaw/o$i;",
            "Lcom/daaw/o$i;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/daaw/o;->r:Lcom/daaw/o$i;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lcom/daaw/o;->r:Lcom/daaw/o$i;

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

.method public d(Lcom/daaw/o$i;Lcom/daaw/o$i;)V
    .locals 0

    iput-object p2, p1, Lcom/daaw/o$i;->b:Lcom/daaw/o$i;

    return-void
.end method

.method public e(Lcom/daaw/o$i;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Lcom/daaw/o$i;->a:Ljava/lang/Thread;

    return-void
.end method
