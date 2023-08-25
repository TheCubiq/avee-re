.class public final Lcom/daaw/gr4;
.super Lcom/daaw/kw4;
.source ""


# instance fields
.field public q:Z


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/kw4;-><init>(Ljava/util/Set;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/gr4;->q:Z

    return-void
.end method


# virtual methods
.method public final declared-synchronized zza()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/gr4;->q:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/daaw/fr4;->a:Lcom/daaw/fr4;

    invoke-virtual {p0, v0}, Lcom/daaw/kw4;->B0(Lcom/daaw/jw4;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/gr4;->q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
