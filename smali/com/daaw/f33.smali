.class public final Lcom/daaw/f33;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pa$a;


# instance fields
.field public final synthetic a:Lcom/daaw/h33;


# direct methods
.method public constructor <init>(Lcom/daaw/h33;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/f33;->a:Lcom/daaw/h33;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final D(I)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/f33;->a:Lcom/daaw/h33;

    invoke-static {p1}, Lcom/daaw/h33;->e(Lcom/daaw/h33;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/f33;->a:Lcom/daaw/h33;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/h33;->k(Lcom/daaw/h33;Lcom/daaw/l33;)V

    iget-object v0, p0, Lcom/daaw/f33;->a:Lcom/daaw/h33;

    invoke-static {v0}, Lcom/daaw/h33;->e(Lcom/daaw/h33;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final M(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/f33;->a:Lcom/daaw/h33;

    invoke-static {p1}, Lcom/daaw/h33;->e(Lcom/daaw/h33;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/f33;->a:Lcom/daaw/h33;

    invoke-static {v0}, Lcom/daaw/h33;->c(Lcom/daaw/h33;)Lcom/daaw/j33;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/daaw/h33;->c(Lcom/daaw/h33;)Lcom/daaw/j33;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/j33;->K()Lcom/daaw/l33;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/h33;->k(Lcom/daaw/h33;Lcom/daaw/l33;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_1
    const-string v1, "Unable to obtain a cache service instance."

    invoke-static {v1, v0}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/daaw/f33;->a:Lcom/daaw/h33;

    invoke-static {v0}, Lcom/daaw/h33;->h(Lcom/daaw/h33;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/daaw/f33;->a:Lcom/daaw/h33;

    invoke-static {v0}, Lcom/daaw/h33;->e(Lcom/daaw/h33;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
