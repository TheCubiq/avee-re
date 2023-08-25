.class public final Lcom/daaw/al3;
.super Lcom/daaw/l14;
.source ""


# instance fields
.field public final c:Ljava/lang/Object;

.field public final d:Lcom/daaw/il3;

.field public e:Z


# direct methods
.method public constructor <init>(Lcom/daaw/il3;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/l14;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/al3;->c:Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/al3;->d:Lcom/daaw/il3;

    return-void
.end method

.method public static bridge synthetic f(Lcom/daaw/al3;)Lcom/daaw/il3;
    .locals 0

    iget-object p0, p0, Lcom/daaw/al3;->d:Lcom/daaw/il3;

    return-object p0
.end method


# virtual methods
.method public final g()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/al3;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/al3;->e:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/al3;->e:Z

    new-instance v1, Lcom/daaw/xk3;

    invoke-direct {v1, p0}, Lcom/daaw/xk3;-><init>(Lcom/daaw/al3;)V

    new-instance v2, Lcom/daaw/h14;

    invoke-direct {v2}, Lcom/daaw/h14;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/daaw/l14;->e(Lcom/daaw/i14;Lcom/daaw/g14;)V

    new-instance v1, Lcom/daaw/yk3;

    invoke-direct {v1, p0}, Lcom/daaw/yk3;-><init>(Lcom/daaw/al3;)V

    new-instance v2, Lcom/daaw/zk3;

    invoke-direct {v2, p0}, Lcom/daaw/zk3;-><init>(Lcom/daaw/al3;)V

    invoke-virtual {p0, v1, v2}, Lcom/daaw/l14;->e(Lcom/daaw/i14;Lcom/daaw/g14;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
