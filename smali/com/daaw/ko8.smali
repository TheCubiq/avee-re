.class public final Lcom/daaw/ko8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic p:Lcom/daaw/vp8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/vp8;Lcom/daaw/mm8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ko8;->p:Lcom/daaw/vp8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 6

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/ko8;->p:Lcom/daaw/vp8;

    invoke-static {v0}, Lcom/daaw/vp8;->k(Lcom/daaw/vp8;)Ljava/util/HashMap;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/rh8;

    iget-object v2, p0, Lcom/daaw/ko8;->p:Lcom/daaw/vp8;

    invoke-static {v2}, Lcom/daaw/vp8;->k(Lcom/daaw/vp8;)Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/zj8;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/daaw/zj8;->a()I

    move-result v3

    const/4 v4, 0x3

    if-ne v3, v4, :cond_3

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Timeout waiting for ServiceConnection callback "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Ljava/lang/Exception;

    invoke-direct {v3}, Ljava/lang/Exception;-><init>()V

    invoke-virtual {v2}, Lcom/daaw/zj8;->b()Landroid/content/ComponentName;

    move-result-object v3

    if-nez v3, :cond_1

    invoke-virtual {p1}, Lcom/daaw/rh8;->b()Landroid/content/ComponentName;

    move-result-object v3

    :cond_1
    if-nez v3, :cond_2

    new-instance v3, Landroid/content/ComponentName;

    invoke-virtual {p1}, Lcom/daaw/rh8;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "unknown"

    invoke-direct {v3, p1, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v2, v3}, Lcom/daaw/zj8;->onServiceDisconnected(Landroid/content/ComponentName;)V

    :cond_3
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_4
    iget-object v0, p0, Lcom/daaw/ko8;->p:Lcom/daaw/vp8;

    invoke-static {v0}, Lcom/daaw/vp8;->k(Lcom/daaw/vp8;)Ljava/util/HashMap;

    move-result-object v0

    monitor-enter v0

    :try_start_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/rh8;

    iget-object v2, p0, Lcom/daaw/ko8;->p:Lcom/daaw/vp8;

    invoke-static {v2}, Lcom/daaw/vp8;->k(Lcom/daaw/vp8;)Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/zj8;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/daaw/zj8;->i()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v2}, Lcom/daaw/zj8;->j()Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v3, "GmsClientSupervisor"

    invoke-virtual {v2, v3}, Lcom/daaw/zj8;->g(Ljava/lang/String;)V

    :cond_5
    iget-object v2, p0, Lcom/daaw/ko8;->p:Lcom/daaw/vp8;

    invoke-static {v2}, Lcom/daaw/vp8;->k(Lcom/daaw/vp8;)Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    monitor-exit v0

    return v1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1
.end method
