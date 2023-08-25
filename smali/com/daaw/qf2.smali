.class public abstract Lcom/daaw/qf2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final A:Lcom/daaw/af2;

.field public final p:Lcom/daaw/bg2;

.field public final q:I

.field public final r:Ljava/lang/String;

.field public final s:I

.field public final t:Ljava/lang/Object;

.field public final u:Lcom/daaw/uf2;

.field public v:Ljava/lang/Integer;

.field public w:Lcom/daaw/tf2;

.field public x:Z

.field public y:Lcom/daaw/ve2;

.field public z:Lcom/daaw/pf2;


# direct methods
.method public constructor <init>(ILjava/lang/String;Lcom/daaw/uf2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-boolean v0, Lcom/daaw/bg2;->c:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/daaw/bg2;

    invoke-direct {v0}, Lcom/daaw/bg2;-><init>()V

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iput-object v0, p0, Lcom/daaw/qf2;->p:Lcom/daaw/bg2;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/qf2;->t:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/qf2;->x:Z

    iput-object v1, p0, Lcom/daaw/qf2;->y:Lcom/daaw/ve2;

    iput p1, p0, Lcom/daaw/qf2;->q:I

    iput-object p2, p0, Lcom/daaw/qf2;->r:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/qf2;->u:Lcom/daaw/uf2;

    new-instance p1, Lcom/daaw/af2;

    invoke-direct {p1}, Lcom/daaw/af2;-><init>()V

    iput-object p1, p0, Lcom/daaw/qf2;->A:Lcom/daaw/af2;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    :cond_1
    iput v0, p0, Lcom/daaw/qf2;->s:I

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/qf2;)Lcom/daaw/bg2;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qf2;->p:Lcom/daaw/bg2;

    return-object p0
.end method


# virtual methods
.method public abstract a(Lcom/daaw/mf2;)Lcom/daaw/wf2;
.end method

.method public abstract c(Ljava/lang/Object;)V
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/daaw/qf2;

    iget-object v0, p0, Lcom/daaw/qf2;->v:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object p1, p1, Lcom/daaw/qf2;->v:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public final d(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/qf2;->w:Lcom/daaw/tf2;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/daaw/tf2;->b(Lcom/daaw/qf2;)V

    :cond_0
    sget-boolean v0, Lcom/daaw/bg2;->c:Z

    if-eqz v0, :cond_2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    if-eq v2, v3, :cond_1

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lcom/daaw/of2;

    invoke-direct {v3, p0, p1, v0, v1}, Lcom/daaw/of2;-><init>(Lcom/daaw/qf2;Ljava/lang/String;J)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    iget-object v2, p0, Lcom/daaw/qf2;->p:Lcom/daaw/bg2;

    invoke-virtual {v2, p1, v0, v1}, Lcom/daaw/bg2;->a(Ljava/lang/String;J)V

    iget-object p1, p0, Lcom/daaw/qf2;->p:Lcom/daaw/bg2;

    invoke-virtual {p0}, Lcom/daaw/qf2;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/bg2;->b(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qf2;->t:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/qf2;->z:Lcom/daaw/pf2;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v1, p0}, Lcom/daaw/pf2;->zza(Lcom/daaw/qf2;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final f(Lcom/daaw/wf2;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qf2;->t:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/qf2;->z:Lcom/daaw/pf2;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v1, p0, p1}, Lcom/daaw/pf2;->a(Lcom/daaw/qf2;Lcom/daaw/wf2;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final g(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qf2;->w:Lcom/daaw/tf2;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1}, Lcom/daaw/tf2;->c(Lcom/daaw/qf2;I)V

    :cond_0
    return-void
.end method

.method public final h(Lcom/daaw/pf2;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qf2;->t:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/daaw/qf2;->z:Lcom/daaw/pf2;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/daaw/qf2;->s:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/qf2;->zzw()Z

    iget-object v1, p0, Lcom/daaw/qf2;->r:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/qf2;->v:Ljava/lang/Integer;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "[ ] "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "0x"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " NORMAL "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/daaw/qf2;->q:I

    return v0
.end method

.method public final zzb()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/qf2;->A:Lcom/daaw/af2;

    invoke-virtual {v0}, Lcom/daaw/af2;->b()I

    move-result v0

    return v0
.end method

.method public final zzc()I
    .locals 1

    iget v0, p0, Lcom/daaw/qf2;->s:I

    return v0
.end method

.method public final zzd()Lcom/daaw/ve2;
    .locals 1

    iget-object v0, p0, Lcom/daaw/qf2;->y:Lcom/daaw/ve2;

    return-object v0
.end method

.method public final zze(Lcom/daaw/ve2;)Lcom/daaw/qf2;
    .locals 0

    iput-object p1, p0, Lcom/daaw/qf2;->y:Lcom/daaw/ve2;

    return-object p0
.end method

.method public final zzf(Lcom/daaw/tf2;)Lcom/daaw/qf2;
    .locals 0

    iput-object p1, p0, Lcom/daaw/qf2;->w:Lcom/daaw/tf2;

    return-object p0
.end method

.method public final zzg(I)Lcom/daaw/qf2;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/qf2;->v:Ljava/lang/Integer;

    return-object p0
.end method

.method public final zzj()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/daaw/qf2;->r:Ljava/lang/String;

    iget v1, p0, Lcom/daaw/qf2;->q:I

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final zzk()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/qf2;->r:Ljava/lang/String;

    return-object v0
.end method

.method public zzl()Ljava/util/Map;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final zzm(Ljava/lang/String;)V
    .locals 3

    sget-boolean v0, Lcom/daaw/bg2;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/qf2;->p:Lcom/daaw/bg2;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/daaw/bg2;->a(Ljava/lang/String;J)V

    :cond_0
    return-void
.end method

.method public final zzn(Lcom/daaw/zf2;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qf2;->t:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/qf2;->u:Lcom/daaw/uf2;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lcom/daaw/uf2;->a(Lcom/daaw/zf2;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final zzq()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qf2;->t:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/daaw/qf2;->x:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final zzv()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/qf2;->t:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/qf2;->x:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final zzw()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/qf2;->t:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public zzx()[B
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzy()Lcom/daaw/af2;
    .locals 1

    iget-object v0, p0, Lcom/daaw/qf2;->A:Lcom/daaw/af2;

    return-object v0
.end method
