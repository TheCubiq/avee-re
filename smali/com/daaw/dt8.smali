.class public final Lcom/daaw/dt8;
.super Lcom/daaw/lq8;
.source ""

# interfaces
.implements Lcom/daaw/us8;


# instance fields
.field public final h:Lcom/daaw/f53;

.field public final i:Lcom/daaw/jv2;

.field public final j:Lcom/daaw/m36;

.field public final k:Lcom/daaw/vn8;

.field public final l:I

.field public m:Z

.field public n:J

.field public o:Z

.field public p:Z

.field public q:Lcom/daaw/qz6;

.field public final r:Lcom/daaw/at8;

.field public final s:Lcom/daaw/rw8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/f53;Lcom/daaw/m36;Lcom/daaw/at8;Lcom/daaw/vn8;Lcom/daaw/rw8;ILcom/daaw/ct8;[B)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/lq8;-><init>()V

    iget-object p7, p1, Lcom/daaw/f53;->b:Lcom/daaw/jv2;

    invoke-static {p7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p7, p0, Lcom/daaw/dt8;->i:Lcom/daaw/jv2;

    iput-object p1, p0, Lcom/daaw/dt8;->h:Lcom/daaw/f53;

    iput-object p2, p0, Lcom/daaw/dt8;->j:Lcom/daaw/m36;

    iput-object p3, p0, Lcom/daaw/dt8;->r:Lcom/daaw/at8;

    iput-object p4, p0, Lcom/daaw/dt8;->k:Lcom/daaw/vn8;

    iput-object p5, p0, Lcom/daaw/dt8;->s:Lcom/daaw/rw8;

    iput p6, p0, Lcom/daaw/dt8;->l:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/dt8;->m:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/dt8;->n:J

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 25

    move-object/from16 v0, p0

    new-instance v10, Lcom/daaw/xt8;

    iget-wide v8, v0, Lcom/daaw/dt8;->n:J

    iget-boolean v11, v0, Lcom/daaw/dt8;->o:Z

    iget-boolean v1, v0, Lcom/daaw/dt8;->p:Z

    iget-object v14, v0, Lcom/daaw/dt8;->h:Lcom/daaw/f53;

    if-eqz v1, :cond_0

    iget-object v1, v14, Lcom/daaw/f53;->d:Lcom/daaw/ht2;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object/from16 v21, v1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v12, 0x0

    const-wide/16 v15, 0x0

    move-object/from16 v20, v14

    move-wide v14, v15

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v1, v10

    move-wide/from16 v22, v8

    move-object/from16 v24, v10

    move/from16 v16, v11

    move-wide/from16 v10, v22

    invoke-direct/range {v1 .. v21}, Lcom/daaw/xt8;-><init>(JJJJJJJZZZLjava/lang/Object;Lcom/daaw/f53;Lcom/daaw/ht2;)V

    iget-boolean v1, v0, Lcom/daaw/dt8;->m:Z

    if-eqz v1, :cond_1

    new-instance v10, Lcom/daaw/zs8;

    move-object/from16 v1, v24

    invoke-direct {v10, v0, v1}, Lcom/daaw/zs8;-><init>(Lcom/daaw/dt8;Lcom/daaw/l64;)V

    goto :goto_1

    :cond_1
    move-object/from16 v1, v24

    move-object v10, v1

    :goto_1
    invoke-virtual {v0, v10}, Lcom/daaw/lq8;->x(Lcom/daaw/l64;)V

    return-void
.end method

.method public final c(JZZ)V
    .locals 3

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    iget-wide p1, p0, Lcom/daaw/dt8;->n:J

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/dt8;->m:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Lcom/daaw/dt8;->n:J

    cmp-long v2, v0, p1

    if-nez v2, :cond_1

    iget-boolean v0, p0, Lcom/daaw/dt8;->o:Z

    if-ne v0, p3, :cond_1

    iget-boolean v0, p0, Lcom/daaw/dt8;->p:Z

    if-ne v0, p4, :cond_1

    return-void

    :cond_1
    iput-wide p1, p0, Lcom/daaw/dt8;->n:J

    iput-boolean p3, p0, Lcom/daaw/dt8;->o:Z

    iput-boolean p4, p0, Lcom/daaw/dt8;->p:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/dt8;->m:Z

    invoke-virtual {p0}, Lcom/daaw/dt8;->A()V

    return-void
.end method

.method public final e()V
    .locals 0

    return-void
.end method

.method public final h()Lcom/daaw/f53;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dt8;->h:Lcom/daaw/f53;

    return-object v0
.end method

.method public final k(Lcom/daaw/pr8;Lcom/daaw/nw8;J)Lcom/daaw/nr8;
    .locals 15

    move-object v13, p0

    iget-object v0, v13, Lcom/daaw/dt8;->j:Lcom/daaw/m36;

    invoke-interface {v0}, Lcom/daaw/m36;->zza()Lcom/daaw/p46;

    move-result-object v2

    iget-object v0, v13, Lcom/daaw/dt8;->q:Lcom/daaw/qz6;

    if-eqz v0, :cond_0

    invoke-interface {v2, v0}, Lcom/daaw/p46;->d(Lcom/daaw/qz6;)V

    :cond_0
    new-instance v14, Lcom/daaw/ys8;

    iget-object v0, v13, Lcom/daaw/dt8;->i:Lcom/daaw/jv2;

    iget-object v1, v0, Lcom/daaw/jv2;->a:Landroid/net/Uri;

    iget-object v0, v13, Lcom/daaw/dt8;->r:Lcom/daaw/at8;

    invoke-virtual {p0}, Lcom/daaw/lq8;->o()Lcom/daaw/lh8;

    iget-object v0, v0, Lcom/daaw/at8;->a:Lcom/daaw/q09;

    new-instance v3, Lcom/daaw/mq8;

    invoke-direct {v3, v0}, Lcom/daaw/mq8;-><init>(Lcom/daaw/q09;)V

    iget-object v4, v13, Lcom/daaw/dt8;->k:Lcom/daaw/vn8;

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/lq8;->q(Lcom/daaw/pr8;)Lcom/daaw/jn8;

    move-result-object v5

    iget-object v6, v13, Lcom/daaw/dt8;->s:Lcom/daaw/rw8;

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/lq8;->s(Lcom/daaw/pr8;)Lcom/daaw/yr8;

    move-result-object v7

    iget-object v0, v13, Lcom/daaw/dt8;->i:Lcom/daaw/jv2;

    iget-object v0, v0, Lcom/daaw/jv2;->d:Ljava/lang/String;

    const/4 v10, 0x0

    iget v11, v13, Lcom/daaw/dt8;->l:I

    const/4 v12, 0x0

    move-object v0, v14

    move-object v8, p0

    move-object/from16 v9, p2

    invoke-direct/range {v0 .. v12}, Lcom/daaw/ys8;-><init>(Landroid/net/Uri;Lcom/daaw/p46;Lcom/daaw/os8;Lcom/daaw/vn8;Lcom/daaw/jn8;Lcom/daaw/rw8;Lcom/daaw/yr8;Lcom/daaw/us8;Lcom/daaw/nw8;Ljava/lang/String;I[B)V

    return-object v14
.end method

.method public final l(Lcom/daaw/nr8;)V
    .locals 0

    check-cast p1, Lcom/daaw/ys8;

    invoke-virtual {p1}, Lcom/daaw/ys8;->v()V

    return-void
.end method

.method public final w(Lcom/daaw/qz6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/dt8;->q:Lcom/daaw/qz6;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/daaw/lq8;->o()Lcom/daaw/lh8;

    invoke-virtual {p0}, Lcom/daaw/dt8;->A()V

    return-void
.end method

.method public final y()V
    .locals 0

    return-void
.end method
