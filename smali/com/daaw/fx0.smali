.class public final Lcom/daaw/fx0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/fx0$a;,
        Lcom/daaw/fx0$b;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/fx0$b;

.field public final b:Lcom/daaw/fx0$a;

.field public final c:Lcom/daaw/nl1;

.field public d:I

.field public e:Ljava/lang/Object;

.field public f:Landroid/os/Handler;

.field public g:I

.field public h:J

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>(Lcom/daaw/fx0$a;Lcom/daaw/fx0$b;Lcom/daaw/nl1;ILandroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fx0;->b:Lcom/daaw/fx0$a;

    iput-object p2, p0, Lcom/daaw/fx0;->a:Lcom/daaw/fx0$b;

    iput-object p3, p0, Lcom/daaw/fx0;->c:Lcom/daaw/nl1;

    iput-object p5, p0, Lcom/daaw/fx0;->f:Landroid/os/Handler;

    iput p4, p0, Lcom/daaw/fx0;->g:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/fx0;->h:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/fx0;->i:Z

    return-void
.end method


# virtual methods
.method public declared-synchronized a()Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/fx0;->j:Z

    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget-object v0, p0, Lcom/daaw/fx0;->f:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    :goto_1
    iget-boolean v0, p0, Lcom/daaw/fx0;->l:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_1

    :cond_1
    iget-boolean v0, p0, Lcom/daaw/fx0;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/fx0;->i:Z

    return v0
.end method

.method public c()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/daaw/fx0;->f:Landroid/os/Handler;

    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/fx0;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/fx0;->h:J

    return-wide v0
.end method

.method public f()Lcom/daaw/fx0$b;
    .locals 1

    iget-object v0, p0, Lcom/daaw/fx0;->a:Lcom/daaw/fx0$b;

    return-object v0
.end method

.method public g()Lcom/daaw/nl1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/fx0;->c:Lcom/daaw/nl1;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lcom/daaw/fx0;->d:I

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lcom/daaw/fx0;->g:I

    return v0
.end method

.method public declared-synchronized j()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/fx0;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized k(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/fx0;->k:Z

    or-int/2addr p1, v0

    iput-boolean p1, p0, Lcom/daaw/fx0;->k:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/fx0;->l:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public l()Lcom/daaw/fx0;
    .locals 6

    iget-boolean v0, p0, Lcom/daaw/fx0;->j:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget-wide v2, p0, Lcom/daaw/fx0;->h:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/fx0;->i:Z

    invoke-static {v0}, Lcom/daaw/s6;->a(Z)V

    :cond_0
    iput-boolean v1, p0, Lcom/daaw/fx0;->j:Z

    iget-object v0, p0, Lcom/daaw/fx0;->b:Lcom/daaw/fx0$a;

    invoke-interface {v0, p0}, Lcom/daaw/fx0$a;->b(Lcom/daaw/fx0;)V

    return-object p0
.end method

.method public m(Ljava/lang/Object;)Lcom/daaw/fx0;
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/fx0;->j:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iput-object p1, p0, Lcom/daaw/fx0;->e:Ljava/lang/Object;

    return-object p0
.end method

.method public n(I)Lcom/daaw/fx0;
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/fx0;->j:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iput p1, p0, Lcom/daaw/fx0;->d:I

    return-object p0
.end method
