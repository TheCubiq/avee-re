.class public final Lcom/daaw/e38;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/rj1;

.field public final synthetic q:Lcom/daaw/k68;


# direct methods
.method public constructor <init>(Lcom/daaw/k68;Lcom/daaw/rj1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/e38;->q:Lcom/daaw/k68;

    iput-object p2, p0, Lcom/daaw/e38;->p:Lcom/daaw/rj1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/e38;->q:Lcom/daaw/k68;

    invoke-static {v0}, Lcom/daaw/k68;->c(Lcom/daaw/k68;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/e38;->q:Lcom/daaw/k68;

    invoke-static {v1}, Lcom/daaw/k68;->b(Lcom/daaw/k68;)Lcom/daaw/cu0;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lcom/daaw/k68;->b(Lcom/daaw/k68;)Lcom/daaw/cu0;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/e38;->p:Lcom/daaw/rj1;

    invoke-interface {v1, v2}, Lcom/daaw/cu0;->a(Lcom/daaw/rj1;)V

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
