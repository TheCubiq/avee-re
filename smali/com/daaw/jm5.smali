.class public abstract Lcom/daaw/jm5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pa$a;
.implements Lcom/daaw/pa$b;


# instance fields
.field public final a:Lcom/daaw/e14;

.field public b:Z

.field public c:Z

.field public d:Lcom/daaw/rt3;

.field public e:Landroid/content/Context;

.field public f:Landroid/os/Looper;

.field public g:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/e14;

    invoke-direct {v0}, Lcom/daaw/e14;-><init>()V

    iput-object v0, p0, Lcom/daaw/jm5;->a:Lcom/daaw/e14;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/jm5;->b:Z

    iput-boolean v0, p0, Lcom/daaw/jm5;->c:Z

    return-void
.end method


# virtual methods
.method public D(I)V
    .locals 4

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "Remote ad service connection suspended, cause: %d."

    invoke-static {v0, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/k04;->zze(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/jm5;->a:Lcom/daaw/e14;

    new-instance v2, Lcom/daaw/pk5;

    invoke-direct {v2, v1, p1}, Lcom/daaw/pk5;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final I(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 4

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->h()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "Remote ad service connection failed, cause: %d."

    invoke-static {v0, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/k04;->zze(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/jm5;->a:Lcom/daaw/e14;

    new-instance v2, Lcom/daaw/pk5;

    invoke-direct {v2, v1, p1}, Lcom/daaw/pk5;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final declared-synchronized a()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/jm5;->d:Lcom/daaw/rt3;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/rt3;

    iget-object v1, p0, Lcom/daaw/jm5;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/jm5;->f:Landroid/os/Looper;

    invoke-direct {v0, v1, v2, p0, p0}, Lcom/daaw/rt3;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/pa$a;Lcom/daaw/pa$b;)V

    iput-object v0, p0, Lcom/daaw/jm5;->d:Lcom/daaw/rt3;

    :cond_0
    iget-object v0, p0, Lcom/daaw/jm5;->d:Lcom/daaw/rt3;

    invoke-virtual {v0}, Lcom/daaw/pa;->checkAvailabilityAndConnect()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/daaw/jm5;->c:Z

    iget-object v0, p0, Lcom/daaw/jm5;->d:Lcom/daaw/rt3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lcom/daaw/pa;->isConnected()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/jm5;->d:Lcom/daaw/rt3;

    invoke-virtual {v0}, Lcom/daaw/pa;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/daaw/jm5;->d:Lcom/daaw/rt3;

    invoke-virtual {v0}, Lcom/daaw/pa;->disconnect()V

    :cond_2
    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
