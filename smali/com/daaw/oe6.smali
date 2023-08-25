.class public final Lcom/daaw/oe6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cf6;


# instance fields
.field public a:Lcom/daaw/rp4;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/df6;Lcom/daaw/ye6;Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/oe6;->c(Lcom/daaw/df6;Lcom/daaw/ye6;Lcom/daaw/rp4;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized b()Lcom/daaw/rp4;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/oe6;->a:Lcom/daaw/rp4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized c(Lcom/daaw/df6;Lcom/daaw/ye6;Lcom/daaw/rp4;)Lcom/daaw/f77;
    .locals 0

    monitor-enter p0

    if-eqz p3, :cond_0

    :try_start_0
    iput-object p3, p0, Lcom/daaw/oe6;->a:Lcom/daaw/rp4;

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lcom/daaw/df6;->b:Lcom/daaw/xe6;

    invoke-interface {p2, p1}, Lcom/daaw/ye6;->a(Lcom/daaw/xe6;)Lcom/daaw/qp4;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/qp4;->zzh()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/rp4;

    iput-object p1, p0, Lcom/daaw/oe6;->a:Lcom/daaw/rp4;

    :goto_0
    iget-object p1, p0, Lcom/daaw/oe6;->a:Lcom/daaw/rp4;

    invoke-interface {p1}, Lcom/daaw/rp4;->zzb()Lcom/daaw/jn4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/jn4;->j()Lcom/daaw/f77;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/jn4;->i(Lcom/daaw/f77;)Lcom/daaw/f77;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final bridge synthetic zzd()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/oe6;->b()Lcom/daaw/rp4;

    move-result-object v0

    return-object v0
.end method
