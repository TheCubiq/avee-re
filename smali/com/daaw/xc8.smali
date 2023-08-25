.class public final Lcom/daaw/xc8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qo8;


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ljava/lang/Object;

.field public c:Lcom/daaw/gu0;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/daaw/gu0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/xc8;->b:Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/xc8;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/daaw/xc8;->c:Lcom/daaw/gu0;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/xc8;)Lcom/daaw/gu0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/xc8;->c:Lcom/daaw/gu0;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/daaw/xc8;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/daaw/xc8;->b:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/daaw/rj1;)V
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/rj1;->n()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/rj1;->l()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/xc8;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/xc8;->c:Lcom/daaw/gu0;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/xc8;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/t98;

    invoke-direct {v1, p0, p1}, Lcom/daaw/t98;-><init>(Lcom/daaw/xc8;Lcom/daaw/rj1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_1
    return-void
.end method
