.class public final Lcom/daaw/zg8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/hh8;


# static fields
.field public static final h:Lcom/daaw/iz6;

.field public static final i:Ljava/util/Random;


# instance fields
.field public final a:Lcom/daaw/i54;

.field public final b:Lcom/daaw/d34;

.field public final c:Ljava/util/HashMap;

.field public final d:Lcom/daaw/iz6;

.field public e:Lcom/daaw/fh8;

.field public f:Lcom/daaw/l64;

.field public g:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/vg8;->p:Lcom/daaw/vg8;

    sput-object v0, Lcom/daaw/zg8;->h:Lcom/daaw/iz6;

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lcom/daaw/zg8;->i:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/iz6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zg8;->d:Lcom/daaw/iz6;

    new-instance p1, Lcom/daaw/i54;

    invoke-direct {p1}, Lcom/daaw/i54;-><init>()V

    iput-object p1, p0, Lcom/daaw/zg8;->a:Lcom/daaw/i54;

    new-instance p1, Lcom/daaw/d34;

    invoke-direct {p1}, Lcom/daaw/d34;-><init>()V

    iput-object p1, p0, Lcom/daaw/zg8;->b:Lcom/daaw/d34;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/daaw/zg8;->c:Ljava/util/HashMap;

    sget-object p1, Lcom/daaw/l64;->a:Lcom/daaw/l64;

    iput-object p1, p0, Lcom/daaw/zg8;->f:Lcom/daaw/l64;

    return-void
.end method

.method public static bridge synthetic g(Lcom/daaw/zg8;)Lcom/daaw/d34;
    .locals 0

    iget-object p0, p0, Lcom/daaw/zg8;->b:Lcom/daaw/d34;

    return-object p0
.end method

.method public static bridge synthetic h(Lcom/daaw/zg8;)Lcom/daaw/i54;
    .locals 0

    iget-object p0, p0, Lcom/daaw/zg8;->a:Lcom/daaw/i54;

    return-object p0
.end method

.method public static synthetic i()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/daaw/zg8;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static k()Ljava/lang/String;
    .locals 2

    const/16 v0, 0xc

    new-array v0, v0, [B

    sget-object v1, Lcom/daaw/zg8;->i:Ljava/util/Random;

    invoke-virtual {v1, v0}, Ljava/util/Random;->nextBytes([B)V

    const/16 v1, 0xa

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized a(Lcom/daaw/l64;Lcom/daaw/pr8;)Ljava/lang/String;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p2, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/zg8;->b:Lcom/daaw/d34;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object p1

    iget p1, p1, Lcom/daaw/d34;->c:I

    invoke-virtual {p0, p1, p2}, Lcom/daaw/zg8;->j(ILcom/daaw/pr8;)Lcom/daaw/xg8;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/xg8;->d(Lcom/daaw/xg8;)Ljava/lang/String;

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

.method public final declared-synchronized b(Lcom/daaw/ib8;)V
    .locals 4

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/daaw/zg8;->g:Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/zg8;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/xg8;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    invoke-static {v1}, Lcom/daaw/xg8;->i(Lcom/daaw/xg8;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/daaw/zg8;->e:Lcom/daaw/fh8;

    if-eqz v2, :cond_0

    invoke-static {v1}, Lcom/daaw/xg8;->d(Lcom/daaw/xg8;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-interface {v2, p1, v1, v3}, Lcom/daaw/fh8;->a(Lcom/daaw/ib8;Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final declared-synchronized c(Lcom/daaw/ib8;)V
    .locals 9

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/zg8;->e:Lcom/daaw/fh8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    iget-object v0, p1, Lcom/daaw/ib8;->b:Lcom/daaw/l64;

    invoke-virtual {v0}, Lcom/daaw/l64;->o()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_2
    iget-object v0, p0, Lcom/daaw/zg8;->c:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/daaw/zg8;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/xg8;

    iget-object v1, p1, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    if-eqz v1, :cond_3

    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/daaw/xg8;->b(Lcom/daaw/xg8;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    invoke-static {v0}, Lcom/daaw/xg8;->a(Lcom/daaw/xg8;)I

    move-result v0

    iget v1, p1, Lcom/daaw/ib8;->c:I

    if-ne v0, v1, :cond_2

    goto :goto_0

    :cond_1
    iget-object v1, p1, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    iget-wide v1, v1, Lcom/daaw/md3;->d:J

    invoke-static {v0}, Lcom/daaw/xg8;->b(Lcom/daaw/xg8;)J

    move-result-wide v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    cmp-long v0, v1, v3

    if-gez v0, :cond_3

    :cond_2
    monitor-exit p0

    return-void

    :cond_3
    :goto_0
    :try_start_3
    iget v0, p1, Lcom/daaw/ib8;->c:I

    iget-object v1, p1, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    invoke-virtual {p0, v0, v1}, Lcom/daaw/zg8;->j(ILcom/daaw/pr8;)Lcom/daaw/xg8;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/zg8;->g:Ljava/lang/String;

    if-nez v1, :cond_4

    invoke-static {v0}, Lcom/daaw/xg8;->d(Lcom/daaw/xg8;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/zg8;->g:Ljava/lang/String;

    :cond_4
    iget-object v1, p1, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    const/4 v2, 0x1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/daaw/md3;->b()Z

    move-result v3

    if-eqz v3, :cond_5

    new-instance v3, Lcom/daaw/pr8;

    iget-object v4, v1, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-wide v5, v1, Lcom/daaw/md3;->d:J

    iget v1, v1, Lcom/daaw/md3;->b:I

    invoke-direct {v3, v4, v5, v6, v1}, Lcom/daaw/pr8;-><init>(Ljava/lang/Object;JI)V

    iget v1, p1, Lcom/daaw/ib8;->c:I

    invoke-virtual {p0, v1, v3}, Lcom/daaw/zg8;->j(ILcom/daaw/pr8;)Lcom/daaw/xg8;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/xg8;->i(Lcom/daaw/xg8;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-static {v1, v2}, Lcom/daaw/xg8;->f(Lcom/daaw/xg8;Z)V

    iget-object v3, p1, Lcom/daaw/ib8;->b:Lcom/daaw/l64;

    iget-object v4, p1, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    iget-object v4, v4, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v5, p0, Lcom/daaw/zg8;->b:Lcom/daaw/d34;

    invoke-virtual {v3, v4, v5}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    iget-object v3, p0, Lcom/daaw/zg8;->b:Lcom/daaw/d34;

    iget-object v4, p1, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    iget v4, v4, Lcom/daaw/md3;->b:I

    invoke-virtual {v3, v4}, Lcom/daaw/d34;->h(I)J

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v5

    invoke-static {v3, v4}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v7

    add-long/2addr v5, v7

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    invoke-static {v1}, Lcom/daaw/xg8;->d(Lcom/daaw/xg8;)Ljava/lang/String;

    :cond_5
    invoke-static {v0}, Lcom/daaw/xg8;->i(Lcom/daaw/xg8;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-static {v0, v2}, Lcom/daaw/xg8;->f(Lcom/daaw/xg8;Z)V

    invoke-static {v0}, Lcom/daaw/xg8;->d(Lcom/daaw/xg8;)Ljava/lang/String;

    :cond_6
    invoke-static {v0}, Lcom/daaw/xg8;->d(Lcom/daaw/xg8;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/zg8;->g:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {v0}, Lcom/daaw/xg8;->h(Lcom/daaw/xg8;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-static {v0, v2}, Lcom/daaw/xg8;->e(Lcom/daaw/xg8;Z)V

    iget-object v1, p0, Lcom/daaw/zg8;->e:Lcom/daaw/fh8;

    invoke-static {v0}, Lcom/daaw/xg8;->d(Lcom/daaw/xg8;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, p1, v0}, Lcom/daaw/fh8;->c(Lcom/daaw/ib8;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :cond_7
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final d(Lcom/daaw/fh8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zg8;->e:Lcom/daaw/fh8;

    return-void
.end method

.method public final declared-synchronized e(Lcom/daaw/ib8;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/zg8;->e:Lcom/daaw/fh8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    iget-object v0, p0, Lcom/daaw/zg8;->f:Lcom/daaw/l64;

    iget-object v1, p1, Lcom/daaw/ib8;->b:Lcom/daaw/l64;

    iput-object v1, p0, Lcom/daaw/zg8;->f:Lcom/daaw/l64;

    iget-object v1, p0, Lcom/daaw/zg8;->c:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/xg8;

    iget-object v3, p0, Lcom/daaw/zg8;->f:Lcom/daaw/l64;

    invoke-virtual {v2, v0, v3}, Lcom/daaw/xg8;->l(Lcom/daaw/l64;Lcom/daaw/l64;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, p1}, Lcom/daaw/xg8;->k(Lcom/daaw/ib8;)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    invoke-static {v2}, Lcom/daaw/xg8;->i(Lcom/daaw/xg8;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v2}, Lcom/daaw/xg8;->d(Lcom/daaw/xg8;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/zg8;->g:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    iput-object v3, p0, Lcom/daaw/zg8;->g:Ljava/lang/String;

    :cond_2
    iget-object v3, p0, Lcom/daaw/zg8;->e:Lcom/daaw/fh8;

    invoke-static {v2}, Lcom/daaw/xg8;->d(Lcom/daaw/xg8;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-interface {v3, p1, v2, v4}, Lcom/daaw/fh8;->a(Lcom/daaw/ib8;Ljava/lang/String;Z)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1}, Lcom/daaw/zg8;->l(Lcom/daaw/ib8;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final declared-synchronized f(Lcom/daaw/ib8;I)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/zg8;->e:Lcom/daaw/fh8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    iget-object v0, p0, Lcom/daaw/zg8;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/xg8;

    invoke-virtual {v1, p1}, Lcom/daaw/xg8;->k(Lcom/daaw/ib8;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    invoke-static {v1}, Lcom/daaw/xg8;->i(Lcom/daaw/xg8;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lcom/daaw/xg8;->d(Lcom/daaw/xg8;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/zg8;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez p2, :cond_1

    if-eqz v2, :cond_1

    invoke-static {v1}, Lcom/daaw/xg8;->h(Lcom/daaw/xg8;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v3, 0x1

    :cond_1
    if-eqz v2, :cond_2

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/daaw/zg8;->g:Ljava/lang/String;

    :cond_2
    iget-object v2, p0, Lcom/daaw/zg8;->e:Lcom/daaw/fh8;

    invoke-static {v1}, Lcom/daaw/xg8;->d(Lcom/daaw/xg8;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, p1, v1, v3}, Lcom/daaw/fh8;->a(Lcom/daaw/ib8;Ljava/lang/String;Z)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1}, Lcom/daaw/zg8;->l(Lcom/daaw/ib8;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final j(ILcom/daaw/pr8;)Lcom/daaw/xg8;
    .locals 10

    iget-object v0, p0, Lcom/daaw/zg8;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const-wide v2, 0x7fffffffffffffffL

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/xg8;

    invoke-virtual {v4, p1, p2}, Lcom/daaw/xg8;->g(ILcom/daaw/pr8;)V

    invoke-virtual {v4, p1, p2}, Lcom/daaw/xg8;->j(ILcom/daaw/pr8;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v4}, Lcom/daaw/xg8;->b(Lcom/daaw/xg8;)J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v9, v5, v7

    if-eqz v9, :cond_2

    cmp-long v7, v5, v2

    if-gez v7, :cond_1

    goto :goto_1

    :cond_1
    cmp-long v7, v5, v2

    if-nez v7, :cond_0

    sget v5, Lcom/daaw/it5;->a:I

    invoke-static {v1}, Lcom/daaw/xg8;->c(Lcom/daaw/xg8;)Lcom/daaw/pr8;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-static {v4}, Lcom/daaw/xg8;->c(Lcom/daaw/xg8;)Lcom/daaw/pr8;

    move-result-object v5

    if-eqz v5, :cond_0

    move-object v1, v4

    goto :goto_0

    :cond_2
    :goto_1
    move-object v1, v4

    move-wide v2, v5

    goto :goto_0

    :cond_3
    if-nez v1, :cond_4

    invoke-static {}, Lcom/daaw/zg8;->k()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/daaw/xg8;

    invoke-direct {v1, p0, v0, p1, p2}, Lcom/daaw/xg8;-><init>(Lcom/daaw/zg8;Ljava/lang/String;ILcom/daaw/pr8;)V

    iget-object p1, p0, Lcom/daaw/zg8;->c:Ljava/util/HashMap;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object v1
.end method

.method public final l(Lcom/daaw/ib8;)V
    .locals 7
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "listener"
        }
    .end annotation

    iget-object v0, p1, Lcom/daaw/ib8;->b:Lcom/daaw/l64;

    invoke-virtual {v0}, Lcom/daaw/l64;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/zg8;->g:Ljava/lang/String;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/zg8;->c:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/daaw/zg8;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/xg8;

    iget v1, p1, Lcom/daaw/ib8;->c:I

    iget-object v2, p1, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    invoke-virtual {p0, v1, v2}, Lcom/daaw/zg8;->j(ILcom/daaw/pr8;)Lcom/daaw/xg8;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/xg8;->d(Lcom/daaw/xg8;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/zg8;->g:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/zg8;->c(Lcom/daaw/ib8;)V

    iget-object v2, p1, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/daaw/md3;->b()Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/daaw/xg8;->b(Lcom/daaw/xg8;)J

    move-result-wide v2

    iget-object v4, p1, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    iget-wide v4, v4, Lcom/daaw/md3;->d:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_1

    invoke-static {v0}, Lcom/daaw/xg8;->c(Lcom/daaw/xg8;)Lcom/daaw/pr8;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v0}, Lcom/daaw/xg8;->c(Lcom/daaw/xg8;)Lcom/daaw/pr8;

    move-result-object v2

    iget v2, v2, Lcom/daaw/md3;->b:I

    iget-object v3, p1, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    iget v3, v3, Lcom/daaw/md3;->b:I

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lcom/daaw/xg8;->c(Lcom/daaw/xg8;)Lcom/daaw/pr8;

    move-result-object v0

    iget v0, v0, Lcom/daaw/md3;->c:I

    iget-object v2, p1, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    iget v2, v2, Lcom/daaw/md3;->c:I

    if-eq v0, v2, :cond_2

    :cond_1
    new-instance v0, Lcom/daaw/pr8;

    iget-object v2, p1, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    iget-object v3, v2, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-wide v4, v2, Lcom/daaw/md3;->d:J

    invoke-direct {v0, v3, v4, v5}, Lcom/daaw/pr8;-><init>(Ljava/lang/Object;J)V

    iget p1, p1, Lcom/daaw/ib8;->c:I

    invoke-virtual {p0, p1, v0}, Lcom/daaw/zg8;->j(ILcom/daaw/pr8;)Lcom/daaw/xg8;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/xg8;->d(Lcom/daaw/xg8;)Ljava/lang/String;

    invoke-static {v1}, Lcom/daaw/xg8;->d(Lcom/daaw/xg8;)Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public final declared-synchronized zzd()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/zg8;->g:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
