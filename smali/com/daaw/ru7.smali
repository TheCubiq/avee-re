.class public final Lcom/daaw/ru7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qo8;


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ljava/lang/Object;

.field public c:Lcom/daaw/zt0;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/daaw/zt0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/ru7;->b:Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/ru7;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/daaw/ru7;->c:Lcom/daaw/zt0;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/ru7;)Lcom/daaw/zt0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ru7;->c:Lcom/daaw/zt0;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/daaw/ru7;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ru7;->b:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/daaw/rj1;)V
    .locals 1

    invoke-virtual {p1}, Lcom/daaw/rj1;->l()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/ru7;->b:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ru7;->c:Lcom/daaw/zt0;

    if-nez v0, :cond_0

    monitor-exit p1

    return-void

    :cond_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/daaw/ru7;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/daaw/y07;

    invoke-direct {v0, p0}, Lcom/daaw/y07;-><init>(Lcom/daaw/ru7;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    return-void
.end method
