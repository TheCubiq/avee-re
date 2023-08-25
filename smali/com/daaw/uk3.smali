.class public final Lcom/daaw/uk3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/il3;

.field public final synthetic q:Lcom/daaw/bk3;

.field public final synthetic r:Lcom/daaw/jl3;


# direct methods
.method public constructor <init>(Lcom/daaw/jl3;Lcom/daaw/il3;Lcom/daaw/bk3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/uk3;->r:Lcom/daaw/jl3;

    iput-object p2, p0, Lcom/daaw/uk3;->p:Lcom/daaw/il3;

    iput-object p3, p0, Lcom/daaw/uk3;->q:Lcom/daaw/bk3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/uk3;->r:Lcom/daaw/jl3;

    invoke-static {v0}, Lcom/daaw/jl3;->f(Lcom/daaw/jl3;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/uk3;->p:Lcom/daaw/il3;

    invoke-virtual {v1}, Lcom/daaw/l14;->a()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Lcom/daaw/uk3;->p:Lcom/daaw/il3;

    invoke-virtual {v1}, Lcom/daaw/l14;->a()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/uk3;->p:Lcom/daaw/il3;

    invoke-virtual {v1}, Lcom/daaw/l14;->c()V

    sget-object v1, Lcom/daaw/z04;->e:Lcom/daaw/g77;

    iget-object v2, p0, Lcom/daaw/uk3;->q:Lcom/daaw/bk3;

    new-instance v3, Lcom/daaw/tk3;

    invoke-direct {v3, v2}, Lcom/daaw/tk3;-><init>(Lcom/daaw/bk3;)V

    invoke-interface {v1, v3}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    const-string v1, "Could not receive loaded message in a timely manner. Rejecting."

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
