.class public abstract Lcom/daaw/xj5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pa$a;
.implements Lcom/daaw/pa$b;


# instance fields
.field public final a:Lcom/daaw/e14;

.field public final b:Ljava/lang/Object;

.field public c:Z

.field public d:Z

.field public e:Lcom/google/android/gms/internal/ads/zzccb;

.field public f:Lcom/daaw/pt3;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/e14;

    invoke-direct {v0}, Lcom/daaw/e14;-><init>()V

    iput-object v0, p0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/xj5;->b:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/xj5;->c:Z

    iput-boolean v0, p0, Lcom/daaw/xj5;->d:Z

    return-void
.end method


# virtual methods
.method public final D(I)V
    .locals 0

    const-string p1, "Cannot connect to remote service, fallback to local instance."

    invoke-static {p1}, Lcom/daaw/k04;->zze(Ljava/lang/String;)V

    return-void
.end method

.method public I(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    const-string p1, "Disconnected from remote ad request service."

    invoke-static {p1}, Lcom/daaw/k04;->zze(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/xj5;->a:Lcom/daaw/e14;

    new-instance v0, Lcom/daaw/pk5;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/daaw/pk5;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/xj5;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/daaw/xj5;->d:Z

    iget-object v1, p0, Lcom/daaw/xj5;->f:Lcom/daaw/pt3;

    invoke-virtual {v1}, Lcom/daaw/pa;->isConnected()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/daaw/xj5;->f:Lcom/daaw/pt3;

    invoke-virtual {v1}, Lcom/daaw/pa;->isConnecting()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/daaw/xj5;->f:Lcom/daaw/pt3;

    invoke-virtual {v1}, Lcom/daaw/pa;->disconnect()V

    :cond_1
    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
