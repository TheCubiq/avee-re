.class public final Lcom/daaw/cy5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pz5;


# instance fields
.field public final synthetic a:Lcom/daaw/dy5;


# direct methods
.method public constructor <init>(Lcom/daaw/dy5;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/cy5;->a:Lcom/daaw/dy5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/daaw/zi4;

    iget-object v0, p0, Lcom/daaw/cy5;->a:Lcom/daaw/dy5;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/cy5;->a:Lcom/daaw/dy5;

    invoke-static {v1}, Lcom/daaw/dy5;->g3(Lcom/daaw/dy5;)Lcom/daaw/zi4;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lcom/daaw/dy5;->g3(Lcom/daaw/dy5;)Lcom/daaw/zi4;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/zl4;->a()V

    :cond_0
    iget-object v1, p0, Lcom/daaw/cy5;->a:Lcom/daaw/dy5;

    invoke-static {v1, p1}, Lcom/daaw/dy5;->h3(Lcom/daaw/dy5;Lcom/daaw/zi4;)V

    iget-object p1, p0, Lcom/daaw/cy5;->a:Lcom/daaw/dy5;

    invoke-static {p1}, Lcom/daaw/dy5;->g3(Lcom/daaw/dy5;)Lcom/daaw/zi4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/zl4;->b()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zza()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/cy5;->a:Lcom/daaw/dy5;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/cy5;->a:Lcom/daaw/dy5;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/daaw/dy5;->h3(Lcom/daaw/dy5;Lcom/daaw/zi4;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
