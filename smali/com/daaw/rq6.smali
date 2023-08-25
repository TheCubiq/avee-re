.class public final Lcom/daaw/rq6;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static f:Lcom/daaw/rq6;


# instance fields
.field public a:F

.field public final b:Lcom/daaw/kq6;

.field public final c:Lcom/daaw/iq6;

.field public d:Lcom/daaw/jq6;

.field public e:Lcom/daaw/lq6;


# direct methods
.method public constructor <init>(Lcom/daaw/kq6;Lcom/daaw/iq6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/rq6;->a:F

    iput-object p1, p0, Lcom/daaw/rq6;->b:Lcom/daaw/kq6;

    iput-object p2, p0, Lcom/daaw/rq6;->c:Lcom/daaw/iq6;

    return-void
.end method

.method public static b()Lcom/daaw/rq6;
    .locals 3

    sget-object v0, Lcom/daaw/rq6;->f:Lcom/daaw/rq6;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/iq6;

    invoke-direct {v0}, Lcom/daaw/iq6;-><init>()V

    new-instance v1, Lcom/daaw/kq6;

    invoke-direct {v1}, Lcom/daaw/kq6;-><init>()V

    new-instance v2, Lcom/daaw/rq6;

    invoke-direct {v2, v1, v0}, Lcom/daaw/rq6;-><init>(Lcom/daaw/kq6;Lcom/daaw/iq6;)V

    sput-object v2, Lcom/daaw/rq6;->f:Lcom/daaw/rq6;

    :cond_0
    sget-object v0, Lcom/daaw/rq6;->f:Lcom/daaw/rq6;

    return-object v0
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget v0, p0, Lcom/daaw/rq6;->a:F

    return v0
.end method

.method public final c(Landroid/content/Context;)V
    .locals 7

    new-instance v3, Lcom/daaw/hq6;

    invoke-direct {v3}, Lcom/daaw/hq6;-><init>()V

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v6, Lcom/daaw/jq6;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v2, p1

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/jq6;-><init>(Landroid/os/Handler;Landroid/content/Context;Lcom/daaw/hq6;Lcom/daaw/rq6;[B)V

    iput-object v6, p0, Lcom/daaw/rq6;->d:Lcom/daaw/jq6;

    return-void
.end method

.method public final d(F)V
    .locals 2

    iput p1, p0, Lcom/daaw/rq6;->a:F

    iget-object v0, p0, Lcom/daaw/rq6;->e:Lcom/daaw/lq6;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/lq6;->a()Lcom/daaw/lq6;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/rq6;->e:Lcom/daaw/lq6;

    :cond_0
    iget-object v0, p0, Lcom/daaw/rq6;->e:Lcom/daaw/lq6;

    invoke-virtual {v0}, Lcom/daaw/lq6;->b()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/xp6;

    invoke-virtual {v1}, Lcom/daaw/xp6;->g()Lcom/daaw/xq6;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/daaw/xq6;->h(F)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final e()V
    .locals 1

    invoke-static {}, Lcom/daaw/mq6;->a()Lcom/daaw/mq6;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/mq6;->d(Lcom/daaw/rq6;)V

    invoke-static {}, Lcom/daaw/mq6;->a()Lcom/daaw/mq6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/mq6;->b()V

    invoke-static {}, Lcom/daaw/pr6;->d()Lcom/daaw/pr6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/pr6;->i()V

    iget-object v0, p0, Lcom/daaw/rq6;->d:Lcom/daaw/jq6;

    invoke-virtual {v0}, Lcom/daaw/jq6;->a()V

    return-void
.end method

.method public final f()V
    .locals 1

    invoke-static {}, Lcom/daaw/pr6;->d()Lcom/daaw/pr6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/pr6;->j()V

    invoke-static {}, Lcom/daaw/mq6;->a()Lcom/daaw/mq6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/mq6;->c()V

    iget-object v0, p0, Lcom/daaw/rq6;->d:Lcom/daaw/jq6;

    invoke-virtual {v0}, Lcom/daaw/jq6;->b()V

    return-void
.end method
