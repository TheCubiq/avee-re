.class public final Lcom/daaw/t98;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/rj1;

.field public final synthetic q:Lcom/daaw/xc8;


# direct methods
.method public constructor <init>(Lcom/daaw/xc8;Lcom/daaw/rj1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/t98;->q:Lcom/daaw/xc8;

    iput-object p2, p0, Lcom/daaw/t98;->p:Lcom/daaw/rj1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/t98;->q:Lcom/daaw/xc8;

    invoke-static {v0}, Lcom/daaw/xc8;->c(Lcom/daaw/xc8;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/t98;->q:Lcom/daaw/xc8;

    invoke-static {v1}, Lcom/daaw/xc8;->b(Lcom/daaw/xc8;)Lcom/daaw/gu0;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lcom/daaw/xc8;->b(Lcom/daaw/xc8;)Lcom/daaw/gu0;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/t98;->p:Lcom/daaw/rj1;

    invoke-virtual {v2}, Lcom/daaw/rj1;->j()Ljava/lang/Exception;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Exception;

    invoke-interface {v1, v2}, Lcom/daaw/gu0;->c(Ljava/lang/Exception;)V

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
