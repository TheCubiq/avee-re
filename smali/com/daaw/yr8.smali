.class public final Lcom/daaw/yr8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:I

.field public final b:Lcom/daaw/pr8;

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>()V
    .locals 6

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/yr8;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILcom/daaw/pr8;J)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILcom/daaw/pr8;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yr8;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput p2, p0, Lcom/daaw/yr8;->a:I

    iput-object p3, p0, Lcom/daaw/yr8;->b:Lcom/daaw/pr8;

    return-void
.end method

.method public static final n(J)J
    .locals 3

    invoke-static {p0, p1}, Lcom/daaw/it5;->j0(J)J

    move-result-wide p0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p0, v0

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    return-wide p0
.end method


# virtual methods
.method public final a(ILcom/daaw/pr8;J)Lcom/daaw/yr8;
    .locals 6

    new-instance p3, Lcom/daaw/yr8;

    iget-object v1, p0, Lcom/daaw/yr8;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    const-wide/16 v4, 0x0

    move-object v0, p3

    move v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/daaw/yr8;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILcom/daaw/pr8;J)V

    return-object p3
.end method

.method public final b(Landroid/os/Handler;Lcom/daaw/zr8;)V
    .locals 2

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/yr8;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Lcom/daaw/xr8;

    invoke-direct {v1, p1, p2}, Lcom/daaw/xr8;-><init>(Landroid/os/Handler;Lcom/daaw/zr8;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Lcom/daaw/lr8;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/yr8;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/xr8;

    iget-object v2, v1, Lcom/daaw/xr8;->b:Lcom/daaw/zr8;

    iget-object v1, v1, Lcom/daaw/xr8;->a:Landroid/os/Handler;

    new-instance v3, Lcom/daaw/sr8;

    invoke-direct {v3, p0, v2, p1}, Lcom/daaw/sr8;-><init>(Lcom/daaw/yr8;Lcom/daaw/zr8;Lcom/daaw/lr8;)V

    invoke-static {v1, v3}, Lcom/daaw/it5;->y(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(ILcom/daaw/f92;ILjava/lang/Object;J)V
    .locals 11

    new-instance v10, Lcom/daaw/lr8;

    invoke-static/range {p5 .. p6}, Lcom/daaw/yr8;->n(J)J

    move-result-wide v6

    const/4 v1, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, v10

    move v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v9}, Lcom/daaw/lr8;-><init>(IILcom/daaw/f92;ILjava/lang/Object;JJ)V

    move-object v0, p0

    invoke-virtual {p0, v10}, Lcom/daaw/yr8;->c(Lcom/daaw/lr8;)V

    return-void
.end method

.method public final e(Lcom/daaw/ar8;Lcom/daaw/lr8;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/yr8;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/xr8;

    iget-object v2, v1, Lcom/daaw/xr8;->b:Lcom/daaw/zr8;

    iget-object v1, v1, Lcom/daaw/xr8;->a:Landroid/os/Handler;

    new-instance v3, Lcom/daaw/tr8;

    invoke-direct {v3, p0, v2, p1, p2}, Lcom/daaw/tr8;-><init>(Lcom/daaw/yr8;Lcom/daaw/zr8;Lcom/daaw/ar8;Lcom/daaw/lr8;)V

    invoke-static {v1, v3}, Lcom/daaw/it5;->y(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final f(Lcom/daaw/ar8;IILcom/daaw/f92;ILjava/lang/Object;JJ)V
    .locals 11

    new-instance v10, Lcom/daaw/lr8;

    invoke-static/range {p7 .. p8}, Lcom/daaw/yr8;->n(J)J

    move-result-wide v6

    invoke-static/range {p9 .. p10}, Lcom/daaw/yr8;->n(J)J

    move-result-wide v8

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/daaw/lr8;-><init>(IILcom/daaw/f92;ILjava/lang/Object;JJ)V

    move-object v0, p0

    move-object v1, p1

    invoke-virtual {p0, p1, v10}, Lcom/daaw/yr8;->e(Lcom/daaw/ar8;Lcom/daaw/lr8;)V

    return-void
.end method

.method public final g(Lcom/daaw/ar8;Lcom/daaw/lr8;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/yr8;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/xr8;

    iget-object v2, v1, Lcom/daaw/xr8;->b:Lcom/daaw/zr8;

    iget-object v1, v1, Lcom/daaw/xr8;->a:Landroid/os/Handler;

    new-instance v3, Lcom/daaw/wr8;

    invoke-direct {v3, p0, v2, p1, p2}, Lcom/daaw/wr8;-><init>(Lcom/daaw/yr8;Lcom/daaw/zr8;Lcom/daaw/ar8;Lcom/daaw/lr8;)V

    invoke-static {v1, v3}, Lcom/daaw/it5;->y(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final h(Lcom/daaw/ar8;IILcom/daaw/f92;ILjava/lang/Object;JJ)V
    .locals 11

    new-instance v10, Lcom/daaw/lr8;

    invoke-static/range {p7 .. p8}, Lcom/daaw/yr8;->n(J)J

    move-result-wide v6

    invoke-static/range {p9 .. p10}, Lcom/daaw/yr8;->n(J)J

    move-result-wide v8

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/daaw/lr8;-><init>(IILcom/daaw/f92;ILjava/lang/Object;JJ)V

    move-object v0, p0

    move-object v1, p1

    invoke-virtual {p0, p1, v10}, Lcom/daaw/yr8;->g(Lcom/daaw/ar8;Lcom/daaw/lr8;)V

    return-void
.end method

.method public final i(Lcom/daaw/ar8;Lcom/daaw/lr8;Ljava/io/IOException;Z)V
    .locals 10

    iget-object v0, p0, Lcom/daaw/yr8;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/xr8;

    iget-object v4, v1, Lcom/daaw/xr8;->b:Lcom/daaw/zr8;

    iget-object v1, v1, Lcom/daaw/xr8;->a:Landroid/os/Handler;

    new-instance v9, Lcom/daaw/ur8;

    move-object v2, v9

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move v8, p4

    invoke-direct/range {v2 .. v8}, Lcom/daaw/ur8;-><init>(Lcom/daaw/yr8;Lcom/daaw/zr8;Lcom/daaw/ar8;Lcom/daaw/lr8;Ljava/io/IOException;Z)V

    invoke-static {v1, v9}, Lcom/daaw/it5;->y(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final j(Lcom/daaw/ar8;IILcom/daaw/f92;ILjava/lang/Object;JJLjava/io/IOException;Z)V
    .locals 11

    new-instance v10, Lcom/daaw/lr8;

    invoke-static/range {p7 .. p8}, Lcom/daaw/yr8;->n(J)J

    move-result-wide v6

    invoke-static/range {p9 .. p10}, Lcom/daaw/yr8;->n(J)J

    move-result-wide v8

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/daaw/lr8;-><init>(IILcom/daaw/f92;ILjava/lang/Object;JJ)V

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p11

    move/from16 v3, p12

    invoke-virtual {p0, p1, v10, v2, v3}, Lcom/daaw/yr8;->i(Lcom/daaw/ar8;Lcom/daaw/lr8;Ljava/io/IOException;Z)V

    return-void
.end method

.method public final k(Lcom/daaw/ar8;Lcom/daaw/lr8;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/yr8;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/xr8;

    iget-object v2, v1, Lcom/daaw/xr8;->b:Lcom/daaw/zr8;

    iget-object v1, v1, Lcom/daaw/xr8;->a:Landroid/os/Handler;

    new-instance v3, Lcom/daaw/vr8;

    invoke-direct {v3, p0, v2, p1, p2}, Lcom/daaw/vr8;-><init>(Lcom/daaw/yr8;Lcom/daaw/zr8;Lcom/daaw/ar8;Lcom/daaw/lr8;)V

    invoke-static {v1, v3}, Lcom/daaw/it5;->y(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final l(Lcom/daaw/ar8;IILcom/daaw/f92;ILjava/lang/Object;JJ)V
    .locals 11

    new-instance v10, Lcom/daaw/lr8;

    invoke-static/range {p7 .. p8}, Lcom/daaw/yr8;->n(J)J

    move-result-wide v6

    invoke-static/range {p9 .. p10}, Lcom/daaw/yr8;->n(J)J

    move-result-wide v8

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/daaw/lr8;-><init>(IILcom/daaw/f92;ILjava/lang/Object;JJ)V

    move-object v0, p0

    move-object v1, p1

    invoke-virtual {p0, p1, v10}, Lcom/daaw/yr8;->k(Lcom/daaw/ar8;Lcom/daaw/lr8;)V

    return-void
.end method

.method public final m(Lcom/daaw/zr8;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/yr8;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/xr8;

    iget-object v2, v1, Lcom/daaw/xr8;->b:Lcom/daaw/zr8;

    if-ne v2, p1, :cond_0

    iget-object v2, p0, Lcom/daaw/yr8;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method
