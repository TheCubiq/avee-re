.class public Lcom/daaw/at7;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Lcom/daaw/vr7;


# instance fields
.field public volatile a:Lcom/daaw/xt7;

.field public volatile b:Lcom/daaw/yq7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/vr7;->c:Lcom/daaw/vr7;

    sput-object v0, Lcom/daaw/at7;->c:Lcom/daaw/vr7;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/at7;->b:Lcom/daaw/yq7;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/at7;->b:Lcom/daaw/yq7;

    check-cast v0, Lcom/daaw/uq7;

    iget-object v0, v0, Lcom/daaw/uq7;->t:[B

    array-length v0, v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/at7;->a:Lcom/daaw/xt7;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/at7;->a:Lcom/daaw/xt7;

    invoke-interface {v0}, Lcom/daaw/xt7;->i()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final b()Lcom/daaw/yq7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/at7;->b:Lcom/daaw/yq7;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/at7;->b:Lcom/daaw/yq7;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/at7;->b:Lcom/daaw/yq7;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/at7;->b:Lcom/daaw/yq7;

    monitor-exit p0

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/daaw/at7;->a:Lcom/daaw/xt7;

    if-nez v0, :cond_2

    sget-object v0, Lcom/daaw/yq7;->q:Lcom/daaw/yq7;

    :goto_0
    iput-object v0, p0, Lcom/daaw/at7;->b:Lcom/daaw/yq7;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/daaw/at7;->a:Lcom/daaw/xt7;

    invoke-interface {v0}, Lcom/daaw/xt7;->d()Lcom/daaw/yq7;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/daaw/at7;->b:Lcom/daaw/yq7;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method public final c(Lcom/daaw/xt7;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/at7;->a:Lcom/daaw/xt7;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/at7;->a:Lcom/daaw/xt7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    :try_start_1
    iput-object p1, p0, Lcom/daaw/at7;->a:Lcom/daaw/xt7;

    sget-object v0, Lcom/daaw/yq7;->q:Lcom/daaw/yq7;

    iput-object v0, p0, Lcom/daaw/at7;->b:Lcom/daaw/yq7;
    :try_end_1
    .catch Lcom/daaw/xs7; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    iput-object p1, p0, Lcom/daaw/at7;->a:Lcom/daaw/xt7;

    sget-object p1, Lcom/daaw/yq7;->q:Lcom/daaw/yq7;

    iput-object p1, p0, Lcom/daaw/at7;->b:Lcom/daaw/yq7;

    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/daaw/at7;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/daaw/at7;

    iget-object v0, p0, Lcom/daaw/at7;->a:Lcom/daaw/xt7;

    iget-object v1, p1, Lcom/daaw/at7;->a:Lcom/daaw/xt7;

    if-nez v0, :cond_3

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/at7;->b()Lcom/daaw/yq7;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/at7;->b()Lcom/daaw/yq7;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/yq7;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    if-eqz v0, :cond_5

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_5
    :goto_1
    if-eqz v0, :cond_6

    invoke-interface {v0}, Lcom/daaw/yt7;->c()Lcom/daaw/xt7;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/daaw/at7;->c(Lcom/daaw/xt7;)V

    iget-object p1, p1, Lcom/daaw/at7;->a:Lcom/daaw/xt7;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    invoke-interface {v1}, Lcom/daaw/yt7;->c()Lcom/daaw/xt7;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/at7;->c(Lcom/daaw/xt7;)V

    iget-object p1, p0, Lcom/daaw/at7;->a:Lcom/daaw/xt7;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
