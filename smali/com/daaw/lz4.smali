.class public final Lcom/daaw/lz4;
.super Lcom/daaw/kw4;
.source ""


# instance fields
.field public q:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/kw4;-><init>(Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 1

    sget-object v0, Lcom/daaw/hz4;->a:Lcom/daaw/hz4;

    invoke-virtual {p0, v0}, Lcom/daaw/kw4;->B0(Lcom/daaw/jw4;)V

    return-void
.end method

.method public final zzb()V
    .locals 1

    sget-object v0, Lcom/daaw/jz4;->a:Lcom/daaw/jz4;

    invoke-virtual {p0, v0}, Lcom/daaw/kw4;->B0(Lcom/daaw/jw4;)V

    return-void
.end method

.method public final declared-synchronized zzc()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/lz4;->q:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/daaw/iz4;->a:Lcom/daaw/iz4;

    invoke-virtual {p0, v0}, Lcom/daaw/kw4;->B0(Lcom/daaw/jw4;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/lz4;->q:Z

    :cond_0
    sget-object v0, Lcom/daaw/kz4;->a:Lcom/daaw/kz4;

    invoke-virtual {p0, v0}, Lcom/daaw/kw4;->B0(Lcom/daaw/jw4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zzd()V
    .locals 1

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/daaw/iz4;->a:Lcom/daaw/iz4;

    invoke-virtual {p0, v0}, Lcom/daaw/kw4;->B0(Lcom/daaw/jw4;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/lz4;->q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
