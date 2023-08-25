.class public Lcom/daaw/ey1;
.super Lcom/daaw/dy1;
.source ""


# static fields
.field public static final j:Ljava/lang/String;

.field public static k:Lcom/daaw/ey1;

.field public static l:Lcom/daaw/ey1;

.field public static final m:Ljava/lang/Object;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroidx/work/a;

.field public c:Landroidx/work/impl/WorkDatabase;

.field public d:Lcom/daaw/wj1;

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/r81;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lcom/daaw/jz0;

.field public g:Lcom/daaw/zy0;

.field public h:Z

.field public i:Landroid/content/BroadcastReceiver$PendingResult;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkManagerImpl"

    invoke-static {v0}, Lcom/daaw/ll0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/ey1;->j:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Lcom/daaw/ey1;->k:Lcom/daaw/ey1;

    sput-object v0, Lcom/daaw/ey1;->l:Lcom/daaw/ey1;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/ey1;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;Lcom/daaw/wj1;)V
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/daaw/y01;->a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/daaw/ey1;-><init>(Landroid/content/Context;Landroidx/work/a;Lcom/daaw/wj1;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;Lcom/daaw/wj1;Landroidx/work/impl/WorkDatabase;)V
    .locals 10

    invoke-direct {p0}, Lcom/daaw/dy1;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/daaw/ll0$a;

    invoke-virtual {p2}, Landroidx/work/a;->j()I

    move-result v2

    invoke-direct {v1, v2}, Lcom/daaw/ll0$a;-><init>(I)V

    invoke-static {v1}, Lcom/daaw/ll0;->e(Lcom/daaw/ll0;)V

    invoke-virtual {p0, v0, p2, p3}, Lcom/daaw/ey1;->g(Landroid/content/Context;Landroidx/work/a;Lcom/daaw/wj1;)Ljava/util/List;

    move-result-object v0

    new-instance v9, Lcom/daaw/jz0;

    move-object v3, v9

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object v8, v0

    invoke-direct/range {v3 .. v8}, Lcom/daaw/jz0;-><init>(Landroid/content/Context;Landroidx/work/a;Lcom/daaw/wj1;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    move-object v3, p0

    invoke-virtual/range {v3 .. v9}, Lcom/daaw/ey1;->q(Landroid/content/Context;Landroidx/work/a;Lcom/daaw/wj1;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Lcom/daaw/jz0;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;Lcom/daaw/wj1;Z)V
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-interface {p3}, Lcom/daaw/wj1;->c()Lcom/daaw/mb1;

    move-result-object v1

    invoke-static {v0, v1, p4}, Landroidx/work/impl/WorkDatabase;->s(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Landroidx/work/impl/WorkDatabase;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/daaw/ey1;-><init>(Landroid/content/Context;Landroidx/work/a;Lcom/daaw/wj1;Landroidx/work/impl/WorkDatabase;)V

    return-void
.end method

.method public static e(Landroid/content/Context;Landroidx/work/a;)V
    .locals 4

    sget-object v0, Lcom/daaw/ey1;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/ey1;->k:Lcom/daaw/ey1;

    if-eqz v1, :cond_1

    sget-object v2, Lcom/daaw/ey1;->l:Lcom/daaw/ey1;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    if-nez v1, :cond_3

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sget-object v1, Lcom/daaw/ey1;->l:Lcom/daaw/ey1;

    if-nez v1, :cond_2

    new-instance v1, Lcom/daaw/ey1;

    new-instance v2, Lcom/daaw/fy1;

    invoke-virtual {p1}, Landroidx/work/a;->l()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/daaw/fy1;-><init>(Ljava/util/concurrent/Executor;)V

    invoke-direct {v1, p0, p1, v2}, Lcom/daaw/ey1;-><init>(Landroid/content/Context;Landroidx/work/a;Lcom/daaw/wj1;)V

    sput-object v1, Lcom/daaw/ey1;->l:Lcom/daaw/ey1;

    :cond_2
    sget-object p0, Lcom/daaw/ey1;->l:Lcom/daaw/ey1;

    sput-object p0, Lcom/daaw/ey1;->k:Lcom/daaw/ey1;

    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static j()Lcom/daaw/ey1;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lcom/daaw/ey1;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/ey1;->k:Lcom/daaw/ey1;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    sget-object v1, Lcom/daaw/ey1;->l:Lcom/daaw/ey1;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static k(Landroid/content/Context;)Lcom/daaw/ey1;
    .locals 2

    sget-object v0, Lcom/daaw/ey1;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/daaw/ey1;->j()Lcom/daaw/ey1;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    instance-of v1, p0, Landroidx/work/a$c;

    if-eqz v1, :cond_0

    move-object v1, p0

    check-cast v1, Landroidx/work/a$c;

    invoke-interface {v1}, Landroidx/work/a$c;->a()Landroidx/work/a;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/daaw/ey1;->e(Landroid/content/Context;Landroidx/work/a;)V

    invoke-static {p0}, Lcom/daaw/ey1;->k(Landroid/content/Context;)Lcom/daaw/ey1;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/daaw/qu0;
    .locals 1

    invoke-static {p1, p0}, Lcom/daaw/rd;->d(Ljava/lang/String;Lcom/daaw/ey1;)Lcom/daaw/rd;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/ey1;->d:Lcom/daaw/wj1;

    invoke-interface {v0, p1}, Lcom/daaw/wj1;->b(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Lcom/daaw/rd;->e()Lcom/daaw/qu0;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/util/List;)Lcom/daaw/qu0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/daaw/oy1;",
            ">;)",
            "Lcom/daaw/qu0;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/ux1;

    invoke-direct {v0, p0, p1}, Lcom/daaw/ux1;-><init>(Lcom/daaw/ey1;Ljava/util/List;)V

    invoke-virtual {v0}, Lcom/daaw/ux1;->a()Lcom/daaw/qu0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "enqueue needs at least one WorkRequest."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Ljava/util/UUID;)Lcom/daaw/qu0;
    .locals 1

    invoke-static {p1, p0}, Lcom/daaw/rd;->b(Ljava/util/UUID;Lcom/daaw/ey1;)Lcom/daaw/rd;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/ey1;->d:Lcom/daaw/wj1;

    invoke-interface {v0, p1}, Lcom/daaw/wj1;->b(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Lcom/daaw/rd;->e()Lcom/daaw/qu0;

    move-result-object p1

    return-object p1
.end method

.method public g(Landroid/content/Context;Landroidx/work/a;Lcom/daaw/wj1;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/work/a;",
            "Lcom/daaw/wj1;",
            ")",
            "Ljava/util/List<",
            "Lcom/daaw/r81;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/daaw/r81;

    invoke-static {p1, p0}, Lcom/daaw/v81;->a(Landroid/content/Context;Lcom/daaw/ey1;)Lcom/daaw/r81;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lcom/daaw/h80;

    invoke-direct {v1, p1, p2, p3, p0}, Lcom/daaw/h80;-><init>(Landroid/content/Context;Landroidx/work/a;Lcom/daaw/wj1;Lcom/daaw/ey1;)V

    const/4 p1, 0x1

    aput-object v1, v0, p1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public h()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ey1;->a:Landroid/content/Context;

    return-object v0
.end method

.method public i()Landroidx/work/a;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ey1;->b:Landroidx/work/a;

    return-object v0
.end method

.method public l()Lcom/daaw/zy0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ey1;->g:Lcom/daaw/zy0;

    return-object v0
.end method

.method public m()Lcom/daaw/jz0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ey1;->f:Lcom/daaw/jz0;

    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/daaw/r81;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ey1;->e:Ljava/util/List;

    return-object v0
.end method

.method public o()Landroidx/work/impl/WorkDatabase;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ey1;->c:Landroidx/work/impl/WorkDatabase;

    return-object v0
.end method

.method public p()Lcom/daaw/wj1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ey1;->d:Lcom/daaw/wj1;

    return-object v0
.end method

.method public final q(Landroid/content/Context;Landroidx/work/a;Lcom/daaw/wj1;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Lcom/daaw/jz0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/work/a;",
            "Lcom/daaw/wj1;",
            "Landroidx/work/impl/WorkDatabase;",
            "Ljava/util/List<",
            "Lcom/daaw/r81;",
            ">;",
            "Lcom/daaw/jz0;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ey1;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/ey1;->b:Landroidx/work/a;

    iput-object p3, p0, Lcom/daaw/ey1;->d:Lcom/daaw/wj1;

    iput-object p4, p0, Lcom/daaw/ey1;->c:Landroidx/work/impl/WorkDatabase;

    iput-object p5, p0, Lcom/daaw/ey1;->e:Ljava/util/List;

    iput-object p6, p0, Lcom/daaw/ey1;->f:Lcom/daaw/jz0;

    new-instance p2, Lcom/daaw/zy0;

    invoke-direct {p2, p4}, Lcom/daaw/zy0;-><init>(Landroidx/work/impl/WorkDatabase;)V

    iput-object p2, p0, Lcom/daaw/ey1;->g:Lcom/daaw/zy0;

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/daaw/ey1;->h:Z

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x18

    if-lt p2, p3, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->isDeviceProtectedStorage()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot initialize WorkManager in direct boot mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object p2, p0, Lcom/daaw/ey1;->d:Lcom/daaw/wj1;

    new-instance p3, Landroidx/work/impl/utils/ForceStopRunnable;

    invoke-direct {p3, p1, p0}, Landroidx/work/impl/utils/ForceStopRunnable;-><init>(Landroid/content/Context;Lcom/daaw/ey1;)V

    invoke-interface {p2, p3}, Lcom/daaw/wj1;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public r()V
    .locals 2

    sget-object v0, Lcom/daaw/ey1;->m:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/daaw/ey1;->h:Z

    iget-object v1, p0, Lcom/daaw/ey1;->i:Landroid/content/BroadcastReceiver$PendingResult;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/ey1;->i:Landroid/content/BroadcastReceiver$PendingResult;

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public s()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ey1;->h()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/cj1;->b(Landroid/content/Context;)V

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/ey1;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->B()Lcom/daaw/ry1;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ry1;->u()I

    invoke-virtual {p0}, Lcom/daaw/ey1;->i()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/ey1;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {p0}, Lcom/daaw/ey1;->n()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/daaw/v81;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void
.end method

.method public t(Landroid/content/BroadcastReceiver$PendingResult;)V
    .locals 2

    sget-object v0, Lcom/daaw/ey1;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/daaw/ey1;->i:Landroid/content/BroadcastReceiver$PendingResult;

    iget-boolean v1, p0, Lcom/daaw/ey1;->h:Z

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/ey1;->i:Landroid/content/BroadcastReceiver$PendingResult;

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public u(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/ey1;->v(Ljava/lang/String;Landroidx/work/WorkerParameters$a;)V

    return-void
.end method

.method public v(Ljava/lang/String;Landroidx/work/WorkerParameters$a;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ey1;->d:Lcom/daaw/wj1;

    new-instance v1, Lcom/daaw/hf1;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/hf1;-><init>(Lcom/daaw/ey1;Ljava/lang/String;Landroidx/work/WorkerParameters$a;)V

    invoke-interface {v0, v1}, Lcom/daaw/wj1;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public w(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ey1;->d:Lcom/daaw/wj1;

    new-instance v1, Lcom/daaw/xf1;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lcom/daaw/xf1;-><init>(Lcom/daaw/ey1;Ljava/lang/String;Z)V

    invoke-interface {v0, v1}, Lcom/daaw/wj1;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public x(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ey1;->d:Lcom/daaw/wj1;

    new-instance v1, Lcom/daaw/xf1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/daaw/xf1;-><init>(Lcom/daaw/ey1;Ljava/lang/String;Z)V

    invoke-interface {v0, v1}, Lcom/daaw/wj1;->b(Ljava/lang/Runnable;)V

    return-void
.end method
