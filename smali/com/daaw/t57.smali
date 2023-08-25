.class public final Lcom/daaw/t57;
.super Lcom/daaw/q57;
.source ""


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/s57;)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/daaw/q57;-><init>(Lcom/daaw/p57;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/u57;)I
    .locals 1

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lcom/daaw/u57;->D(Lcom/daaw/u57;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Lcom/daaw/u57;->H(Lcom/daaw/u57;I)V

    monitor-exit p1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b(Lcom/daaw/u57;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0
    .param p2    # Ljava/util/Set;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lcom/daaw/u57;->F(Lcom/daaw/u57;)Ljava/util/Set;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {p1, p3}, Lcom/daaw/u57;->I(Lcom/daaw/u57;Ljava/util/Set;)V

    :cond_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
