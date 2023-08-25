.class public final Lcom/daaw/b00$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jk0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/b00;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Lcom/daaw/mp;

.field public final c:Lcom/daaw/b00$d;

.field public final d:Lcom/daaw/bj;

.field public final e:Lcom/daaw/iy0;

.field public volatile f:Z

.field public g:Z

.field public h:J

.field public i:Lcom/daaw/pp;

.field public j:J

.field public k:J

.field public final synthetic l:Lcom/daaw/b00;


# direct methods
.method public constructor <init>(Lcom/daaw/b00;Landroid/net/Uri;Lcom/daaw/mp;Lcom/daaw/b00$d;Lcom/daaw/bj;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/b00$c;->l:Lcom/daaw/b00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    iput-object p1, p0, Lcom/daaw/b00$c;->a:Landroid/net/Uri;

    invoke-static {p3}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/mp;

    iput-object p1, p0, Lcom/daaw/b00$c;->b:Lcom/daaw/mp;

    invoke-static {p4}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/b00$d;

    iput-object p1, p0, Lcom/daaw/b00$c;->c:Lcom/daaw/b00$d;

    iput-object p5, p0, Lcom/daaw/b00$c;->d:Lcom/daaw/bj;

    new-instance p1, Lcom/daaw/iy0;

    invoke-direct {p1}, Lcom/daaw/iy0;-><init>()V

    iput-object p1, p0, Lcom/daaw/b00$c;->e:Lcom/daaw/iy0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/b00$c;->g:Z

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lcom/daaw/b00$c;->j:J

    return-void
.end method

.method public static synthetic c(Lcom/daaw/b00$c;)Lcom/daaw/pp;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b00$c;->i:Lcom/daaw/pp;

    return-object p0
.end method

.method public static synthetic d(Lcom/daaw/b00$c;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/b00$c;->h:J

    return-wide v0
.end method

.method public static synthetic e(Lcom/daaw/b00$c;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/b00$c;->k:J

    return-wide v0
.end method

.method public static synthetic f(Lcom/daaw/b00$c;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/b00$c;->j:J

    return-wide v0
.end method


# virtual methods
.method public a()V
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_5

    iget-boolean v2, p0, Lcom/daaw/b00$c;->f:Z

    if-nez v2, :cond_5

    const/4 v2, 0x0

    const/4 v3, 0x1

    :try_start_0
    iget-object v4, p0, Lcom/daaw/b00$c;->e:Lcom/daaw/iy0;

    iget-wide v12, v4, Lcom/daaw/iy0;->a:J

    new-instance v4, Lcom/daaw/pp;

    iget-object v6, p0, Lcom/daaw/b00$c;->a:Landroid/net/Uri;

    const-wide/16 v9, -0x1

    iget-object v5, p0, Lcom/daaw/b00$c;->l:Lcom/daaw/b00;

    invoke-static {v5}, Lcom/daaw/b00;->z(Lcom/daaw/b00;)Ljava/lang/String;

    move-result-object v11

    move-object v5, v4

    move-wide v7, v12

    invoke-direct/range {v5 .. v11}, Lcom/daaw/pp;-><init>(Landroid/net/Uri;JJLjava/lang/String;)V

    iput-object v4, p0, Lcom/daaw/b00$c;->i:Lcom/daaw/pp;

    iget-object v5, p0, Lcom/daaw/b00$c;->b:Lcom/daaw/mp;

    invoke-interface {v5, v4}, Lcom/daaw/mp;->c(Lcom/daaw/pp;)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/daaw/b00$c;->j:J

    const-wide/16 v6, -0x1

    cmp-long v8, v4, v6

    if-eqz v8, :cond_0

    add-long/2addr v4, v12

    iput-wide v4, p0, Lcom/daaw/b00$c;->j:J

    :cond_0
    new-instance v4, Lcom/daaw/wq;

    iget-object v6, p0, Lcom/daaw/b00$c;->b:Lcom/daaw/mp;

    iget-wide v9, p0, Lcom/daaw/b00$c;->j:J

    move-object v5, v4

    move-wide v7, v12

    invoke-direct/range {v5 .. v10}, Lcom/daaw/wq;-><init>(Lcom/daaw/mp;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Lcom/daaw/b00$c;->c:Lcom/daaw/b00$d;

    iget-object v5, p0, Lcom/daaw/b00$c;->b:Lcom/daaw/mp;

    invoke-interface {v5}, Lcom/daaw/mp;->d()Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lcom/daaw/b00$d;->b(Lcom/daaw/a00;Landroid/net/Uri;)Lcom/daaw/zz;

    move-result-object v2

    iget-boolean v5, p0, Lcom/daaw/b00$c;->g:Z

    if-eqz v5, :cond_1

    iget-wide v5, p0, Lcom/daaw/b00$c;->h:J

    invoke-interface {v2, v12, v13, v5, v6}, Lcom/daaw/zz;->f(JJ)V

    iput-boolean v0, p0, Lcom/daaw/b00$c;->g:Z

    :cond_1
    :goto_1
    if-nez v1, :cond_2

    iget-boolean v5, p0, Lcom/daaw/b00$c;->f:Z

    if-nez v5, :cond_2

    iget-object v5, p0, Lcom/daaw/b00$c;->d:Lcom/daaw/bj;

    invoke-virtual {v5}, Lcom/daaw/bj;->a()V

    iget-object v5, p0, Lcom/daaw/b00$c;->e:Lcom/daaw/iy0;

    invoke-interface {v2, v4, v5}, Lcom/daaw/zz;->d(Lcom/daaw/a00;Lcom/daaw/iy0;)I

    move-result v1

    invoke-interface {v4}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v5

    iget-object v7, p0, Lcom/daaw/b00$c;->l:Lcom/daaw/b00;

    invoke-static {v7}, Lcom/daaw/b00;->A(Lcom/daaw/b00;)J

    move-result-wide v7

    add-long/2addr v7, v12

    cmp-long v9, v5, v7

    if-lez v9, :cond_1

    invoke-interface {v4}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v12

    iget-object v5, p0, Lcom/daaw/b00$c;->d:Lcom/daaw/bj;

    invoke-virtual {v5}, Lcom/daaw/bj;->b()Z

    iget-object v5, p0, Lcom/daaw/b00$c;->l:Lcom/daaw/b00;

    invoke-static {v5}, Lcom/daaw/b00;->x(Lcom/daaw/b00;)Landroid/os/Handler;

    move-result-object v5

    iget-object v6, p0, Lcom/daaw/b00$c;->l:Lcom/daaw/b00;

    invoke-static {v6}, Lcom/daaw/b00;->w(Lcom/daaw/b00;)Ljava/lang/Runnable;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_2
    if-ne v1, v3, :cond_3

    const/4 v1, 0x0

    goto :goto_2

    :cond_3
    iget-object v2, p0, Lcom/daaw/b00$c;->e:Lcom/daaw/iy0;

    invoke-interface {v4}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v3

    iput-wide v3, v2, Lcom/daaw/iy0;->a:J

    iget-object v2, p0, Lcom/daaw/b00$c;->e:Lcom/daaw/iy0;

    iget-wide v2, v2, Lcom/daaw/iy0;->a:J

    iget-object v4, p0, Lcom/daaw/b00$c;->i:Lcom/daaw/pp;

    iget-wide v4, v4, Lcom/daaw/pp;->c:J

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lcom/daaw/b00$c;->k:J

    :goto_2
    iget-object v2, p0, Lcom/daaw/b00$c;->b:Lcom/daaw/mp;

    invoke-static {v2}, Lcom/daaw/sq1;->h(Lcom/daaw/mp;)V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    move-object v2, v4

    goto :goto_3

    :catchall_1
    move-exception v0

    :goto_3
    if-eq v1, v3, :cond_4

    if-eqz v2, :cond_4

    iget-object v1, p0, Lcom/daaw/b00$c;->e:Lcom/daaw/iy0;

    invoke-interface {v2}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/daaw/iy0;->a:J

    iget-object v1, p0, Lcom/daaw/b00$c;->e:Lcom/daaw/iy0;

    iget-wide v1, v1, Lcom/daaw/iy0;->a:J

    iget-object v3, p0, Lcom/daaw/b00$c;->i:Lcom/daaw/pp;

    iget-wide v3, v3, Lcom/daaw/pp;->c:J

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lcom/daaw/b00$c;->k:J

    :cond_4
    iget-object v1, p0, Lcom/daaw/b00$c;->b:Lcom/daaw/mp;

    invoke-static {v1}, Lcom/daaw/sq1;->h(Lcom/daaw/mp;)V

    throw v0

    :cond_5
    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/b00$c;->f:Z

    return-void
.end method

.method public g(JJ)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/b00$c;->e:Lcom/daaw/iy0;

    iput-wide p1, v0, Lcom/daaw/iy0;->a:J

    iput-wide p3, p0, Lcom/daaw/b00$c;->h:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/b00$c;->g:Z

    return-void
.end method
