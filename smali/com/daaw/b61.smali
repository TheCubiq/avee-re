.class public abstract Lcom/daaw/b61;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/b61$b;,
        Lcom/daaw/b61$d;,
        Lcom/daaw/b61$a;,
        Lcom/daaw/b61$c;
    }
.end annotation


# instance fields
.field public volatile a:Lcom/daaw/ji1;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public b:Ljava/util/concurrent/Executor;

.field public c:Ljava/util/concurrent/Executor;

.field public d:Lcom/daaw/ki1;

.field public final e:Landroidx/room/c;

.field public f:Z

.field public g:Z

.field public h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/b61$b;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public final j:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Lcom/daaw/b61;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lcom/daaw/b61;->j:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/b61;->k:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/daaw/b61;->e()Landroidx/room/c;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/b61;->e:Landroidx/room/c;

    return-void
.end method

.method public static n()Z
    .locals 2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/b61;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/daaw/b61;->n()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access database on the main thread since it may potentially lock the UI for a long period of time."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/b61;->k()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/b61;->j:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access database on a different coroutine context inherited from a suspending transaction."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public c()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/b61;->a()V

    iget-object v0, p0, Lcom/daaw/b61;->d:Lcom/daaw/ki1;

    invoke-interface {v0}, Lcom/daaw/ki1;->A()Lcom/daaw/ji1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/b61;->e:Landroidx/room/c;

    invoke-virtual {v1, v0}, Landroidx/room/c;->m(Lcom/daaw/ji1;)V

    invoke-interface {v0}, Lcom/daaw/ji1;->a()V

    return-void
.end method

.method public d(Ljava/lang/String;)Lcom/daaw/ni1;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/b61;->a()V

    invoke-virtual {p0}, Lcom/daaw/b61;->b()V

    iget-object v0, p0, Lcom/daaw/b61;->d:Lcom/daaw/ki1;

    invoke-interface {v0}, Lcom/daaw/ki1;->A()Lcom/daaw/ji1;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/ji1;->k(Ljava/lang/String;)Lcom/daaw/ni1;

    move-result-object p1

    return-object p1
.end method

.method public abstract e()Landroidx/room/c;
.end method

.method public abstract f(Lcom/daaw/sp;)Lcom/daaw/ki1;
.end method

.method public g()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/b61;->d:Lcom/daaw/ki1;

    invoke-interface {v0}, Lcom/daaw/ki1;->A()Lcom/daaw/ji1;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ji1;->C()V

    invoke-virtual {p0}, Lcom/daaw/b61;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/b61;->e:Landroidx/room/c;

    invoke-virtual {v0}, Landroidx/room/c;->f()V

    :cond_0
    return-void
.end method

.method public h()Ljava/util/concurrent/locks/Lock;
    .locals 1

    iget-object v0, p0, Lcom/daaw/b61;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    return-object v0
.end method

.method public i()Lcom/daaw/ki1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/b61;->d:Lcom/daaw/ki1;

    return-object v0
.end method

.method public j()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lcom/daaw/b61;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/b61;->d:Lcom/daaw/ki1;

    invoke-interface {v0}, Lcom/daaw/ki1;->A()Lcom/daaw/ji1;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ji1;->H()Z

    move-result v0

    return v0
.end method

.method public l(Lcom/daaw/sp;)V
    .locals 3

    invoke-virtual {p0, p1}, Lcom/daaw/b61;->f(Lcom/daaw/sp;)Lcom/daaw/ki1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/b61;->d:Lcom/daaw/ki1;

    instance-of v1, v0, Lcom/daaw/o61;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/daaw/o61;

    invoke-virtual {v0, p1}, Lcom/daaw/o61;->n(Lcom/daaw/sp;)V

    :cond_0
    iget-object v0, p1, Lcom/daaw/sp;->g:Lcom/daaw/b61$c;

    sget-object v1, Lcom/daaw/b61$c;->r:Lcom/daaw/b61$c;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/b61;->d:Lcom/daaw/ki1;

    invoke-interface {v1, v0}, Lcom/daaw/ki1;->setWriteAheadLoggingEnabled(Z)V

    iget-object v1, p1, Lcom/daaw/sp;->e:Ljava/util/List;

    iput-object v1, p0, Lcom/daaw/b61;->h:Ljava/util/List;

    iget-object v1, p1, Lcom/daaw/sp;->h:Ljava/util/concurrent/Executor;

    iput-object v1, p0, Lcom/daaw/b61;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/zm1;

    iget-object v2, p1, Lcom/daaw/sp;->i:Ljava/util/concurrent/Executor;

    invoke-direct {v1, v2}, Lcom/daaw/zm1;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v1, p0, Lcom/daaw/b61;->c:Ljava/util/concurrent/Executor;

    iget-boolean v1, p1, Lcom/daaw/sp;->f:Z

    iput-boolean v1, p0, Lcom/daaw/b61;->f:Z

    iput-boolean v0, p0, Lcom/daaw/b61;->g:Z

    iget-boolean v0, p1, Lcom/daaw/sp;->j:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/b61;->e:Landroidx/room/c;

    iget-object v1, p1, Lcom/daaw/sp;->b:Landroid/content/Context;

    iget-object p1, p1, Lcom/daaw/sp;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Landroidx/room/c;->i(Landroid/content/Context;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public m(Lcom/daaw/ji1;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/b61;->e:Landroidx/room/c;

    invoke-virtual {v0, p1}, Landroidx/room/c;->d(Lcom/daaw/ji1;)V

    return-void
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/b61;->a:Lcom/daaw/ji1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/ji1;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p(Lcom/daaw/mi1;)Landroid/database/Cursor;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/b61;->q(Lcom/daaw/mi1;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public q(Lcom/daaw/mi1;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/b61;->a()V

    invoke-virtual {p0}, Lcom/daaw/b61;->b()V

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/daaw/b61;->d:Lcom/daaw/ki1;

    invoke-interface {v0}, Lcom/daaw/ki1;->A()Lcom/daaw/ji1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/ji1;->z(Lcom/daaw/mi1;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p2, p0, Lcom/daaw/b61;->d:Lcom/daaw/ki1;

    invoke-interface {p2}, Lcom/daaw/ki1;->A()Lcom/daaw/ji1;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/daaw/ji1;->I(Lcom/daaw/mi1;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public r()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/b61;->d:Lcom/daaw/ki1;

    invoke-interface {v0}, Lcom/daaw/ki1;->A()Lcom/daaw/ji1;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ji1;->s()V

    return-void
.end method
