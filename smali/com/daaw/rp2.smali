.class public final Lcom/daaw/rp2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/op2;


# instance fields
.field public final a:[Lcom/daaw/gq2;

.field public final b:Lcom/daaw/fx2;

.field public final c:Lcom/daaw/dx2;

.field public final d:Landroid/os/Handler;

.field public final e:Lcom/daaw/aq2;

.field public final f:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final g:Lcom/daaw/lq2;

.field public final h:Lcom/daaw/kq2;

.field public i:Z

.field public j:Z

.field public k:I

.field public l:I

.field public m:I

.field public n:Z

.field public o:Lcom/daaw/mq2;

.field public p:Ljava/lang/Object;

.field public q:Lcom/daaw/rw2;

.field public r:Lcom/daaw/dx2;

.field public s:Lcom/daaw/fq2;

.field public t:Lcom/daaw/tp2;

.field public u:J


# direct methods
.method public constructor <init>([Lcom/daaw/gq2;Lcom/daaw/fx2;Lcom/daaw/y34;[B)V
    .locals 11
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p4, Lcom/daaw/pz2;->e:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Init ExoPlayerLib/2.4.2 ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "]"

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iput-object p1, p0, Lcom/daaw/rp2;->a:[Lcom/daaw/gq2;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/rp2;->b:Lcom/daaw/fx2;

    const/4 p4, 0x0

    iput-boolean p4, p0, Lcom/daaw/rp2;->j:Z

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/rp2;->k:I

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/daaw/rp2;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Lcom/daaw/dx2;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/daaw/vw2;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/dx2;-><init>([Lcom/daaw/vw2;[B)V

    iput-object v0, p0, Lcom/daaw/rp2;->c:Lcom/daaw/dx2;

    sget-object v1, Lcom/daaw/mq2;->a:Lcom/daaw/mq2;

    iput-object v1, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    new-instance v1, Lcom/daaw/lq2;

    invoke-direct {v1}, Lcom/daaw/lq2;-><init>()V

    iput-object v1, p0, Lcom/daaw/rp2;->g:Lcom/daaw/lq2;

    new-instance v1, Lcom/daaw/kq2;

    invoke-direct {v1}, Lcom/daaw/kq2;-><init>()V

    iput-object v1, p0, Lcom/daaw/rp2;->h:Lcom/daaw/kq2;

    sget-object v1, Lcom/daaw/rw2;->d:Lcom/daaw/rw2;

    iput-object v1, p0, Lcom/daaw/rp2;->q:Lcom/daaw/rw2;

    iput-object v0, p0, Lcom/daaw/rp2;->r:Lcom/daaw/dx2;

    sget-object v0, Lcom/daaw/fq2;->d:Lcom/daaw/fq2;

    iput-object v0, p0, Lcom/daaw/rp2;->s:Lcom/daaw/fq2;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    :goto_0
    new-instance v7, Lcom/daaw/qp2;

    invoke-direct {v7, p0, v0}, Lcom/daaw/qp2;-><init>(Lcom/daaw/rp2;Landroid/os/Looper;)V

    iput-object v7, p0, Lcom/daaw/rp2;->d:Landroid/os/Handler;

    new-instance v8, Lcom/daaw/tp2;

    const-wide/16 v0, 0x0

    invoke-direct {v8, p4, v0, v1}, Lcom/daaw/tp2;-><init>(IJ)V

    iput-object v8, p0, Lcom/daaw/rp2;->t:Lcom/daaw/tp2;

    new-instance p4, Lcom/daaw/aq2;

    iget-boolean v5, p0, Lcom/daaw/rp2;->j:Z

    const/4 v6, 0x0

    const/4 v10, 0x0

    move-object v1, p4

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v9, p0

    invoke-direct/range {v1 .. v10}, Lcom/daaw/aq2;-><init>([Lcom/daaw/gq2;Lcom/daaw/fx2;Lcom/daaw/y34;ZILandroid/os/Handler;Lcom/daaw/tp2;Lcom/daaw/op2;[B)V

    iput-object p4, p0, Lcom/daaw/rp2;->e:Lcom/daaw/aq2;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 4

    iget-object v0, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    invoke-virtual {v0}, Lcom/daaw/mq2;->h()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/daaw/rp2;->l:I

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    iget-object v2, p0, Lcom/daaw/rp2;->t:Lcom/daaw/tp2;

    iget v2, v2, Lcom/daaw/tp2;->a:I

    iget-object v3, p0, Lcom/daaw/rp2;->h:Lcom/daaw/kq2;

    invoke-virtual {v0, v2, v3, v1}, Lcom/daaw/mq2;->d(ILcom/daaw/kq2;Z)Lcom/daaw/kq2;

    :cond_1
    :goto_0
    return v1
.end method

.method public final b(Landroid/os/Message;)V
    .locals 3

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :pswitch_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/kp2;

    iget-object v0, p0, Lcom/daaw/rp2;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/lp2;

    invoke-interface {v1, p1}, Lcom/daaw/lp2;->m(Lcom/daaw/kp2;)V

    goto :goto_0

    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/fq2;

    iget-object v0, p0, Lcom/daaw/rp2;->s:Lcom/daaw/fq2;

    invoke-virtual {v0, p1}, Lcom/daaw/fq2;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, Lcom/daaw/rp2;->s:Lcom/daaw/fq2;

    iget-object v0, p0, Lcom/daaw/rp2;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/lp2;

    invoke-interface {v1, p1}, Lcom/daaw/lp2;->v(Lcom/daaw/fq2;)V

    goto :goto_1

    :pswitch_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/zp2;

    iget v0, p0, Lcom/daaw/rp2;->l:I

    iget v1, p1, Lcom/daaw/zp2;->d:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/rp2;->l:I

    iget v0, p0, Lcom/daaw/rp2;->m:I

    if-nez v0, :cond_1

    iget-object v0, p1, Lcom/daaw/zp2;->a:Lcom/daaw/mq2;

    iput-object v0, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    iget-object v0, p1, Lcom/daaw/zp2;->b:Ljava/lang/Object;

    iput-object v0, p0, Lcom/daaw/rp2;->p:Ljava/lang/Object;

    iget-object p1, p1, Lcom/daaw/zp2;->c:Lcom/daaw/tp2;

    iput-object p1, p0, Lcom/daaw/rp2;->t:Lcom/daaw/tp2;

    iget-object p1, p0, Lcom/daaw/rp2;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/lp2;

    iget-object v1, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    iget-object v2, p0, Lcom/daaw/rp2;->p:Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Lcom/daaw/lp2;->z(Lcom/daaw/mq2;Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_3
    iget v0, p0, Lcom/daaw/rp2;->l:I

    if-nez v0, :cond_1

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/tp2;

    iput-object p1, p0, Lcom/daaw/rp2;->t:Lcom/daaw/tp2;

    iget-object p1, p0, Lcom/daaw/rp2;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/lp2;

    invoke-interface {v0}, Lcom/daaw/lp2;->zze()V

    goto :goto_3

    :pswitch_4
    iget v0, p0, Lcom/daaw/rp2;->l:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/daaw/rp2;->l:I

    if-nez v0, :cond_1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/tp2;

    iput-object v0, p0, Lcom/daaw/rp2;->t:Lcom/daaw/tp2;

    iget p1, p1, Landroid/os/Message;->arg1:I

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/rp2;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/lp2;

    invoke-interface {v0}, Lcom/daaw/lp2;->zze()V

    goto :goto_4

    :pswitch_5
    iget v0, p0, Lcom/daaw/rp2;->m:I

    if-nez v0, :cond_1

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/gx2;

    iput-boolean v1, p0, Lcom/daaw/rp2;->i:Z

    iget-object v0, p1, Lcom/daaw/gx2;->a:Lcom/daaw/rw2;

    iput-object v0, p0, Lcom/daaw/rp2;->q:Lcom/daaw/rw2;

    iget-object v0, p1, Lcom/daaw/gx2;->b:Lcom/daaw/dx2;

    iput-object v0, p0, Lcom/daaw/rp2;->r:Lcom/daaw/dx2;

    iget-object v0, p0, Lcom/daaw/rp2;->b:Lcom/daaw/fx2;

    iget-object p1, p1, Lcom/daaw/gx2;->c:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Lcom/daaw/fx2;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/rp2;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/lp2;

    iget-object v1, p0, Lcom/daaw/rp2;->q:Lcom/daaw/rw2;

    iget-object v2, p0, Lcom/daaw/rp2;->r:Lcom/daaw/dx2;

    invoke-interface {v0, v1, v2}, Lcom/daaw/lp2;->h(Lcom/daaw/rw2;Lcom/daaw/dx2;)V

    goto :goto_5

    :pswitch_6
    iget p1, p1, Landroid/os/Message;->arg1:I

    if-eqz p1, :cond_0

    goto :goto_6

    :cond_0
    const/4 v1, 0x0

    :goto_6
    iput-boolean v1, p0, Lcom/daaw/rp2;->n:Z

    iget-object p1, p0, Lcom/daaw/rp2;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/lp2;

    iget-boolean v1, p0, Lcom/daaw/rp2;->n:Z

    invoke-interface {v0, v1}, Lcom/daaw/lp2;->zza(Z)V

    goto :goto_7

    :pswitch_7
    iget p1, p1, Landroid/os/Message;->arg1:I

    iput p1, p0, Lcom/daaw/rp2;->k:I

    iget-object p1, p0, Lcom/daaw/rp2;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/lp2;

    iget-boolean v1, p0, Lcom/daaw/rp2;->j:Z

    iget v2, p0, Lcom/daaw/rp2;->k:I

    invoke-interface {v0, v1, v2}, Lcom/daaw/lp2;->B(ZI)V

    goto :goto_8

    :cond_1
    return-void

    :pswitch_8
    iget p1, p0, Lcom/daaw/rp2;->m:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/daaw/rp2;->m:I

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/rp2;->e:Lcom/daaw/aq2;

    invoke-virtual {v0, p1}, Lcom/daaw/aq2;->x(I)V

    return-void
.end method

.method public final j(J)V
    .locals 8

    invoke-virtual {p0}, Lcom/daaw/rp2;->a()I

    iget-object v0, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    invoke-virtual {v0}, Lcom/daaw/mq2;->h()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    invoke-virtual {v0}, Lcom/daaw/mq2;->c()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/dq2;

    iget-object v2, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    invoke-direct {v0, v2, v1, p1, p2}, Lcom/daaw/dq2;-><init>(Lcom/daaw/mq2;IJ)V

    throw v0

    :cond_1
    :goto_0
    iget v0, p0, Lcom/daaw/rp2;->l:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/rp2;->l:I

    iget-object v0, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    invoke-virtual {v0}, Lcom/daaw/mq2;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    iget-object v2, p0, Lcom/daaw/rp2;->g:Lcom/daaw/lq2;

    invoke-virtual {v0, v1, v2, v1}, Lcom/daaw/mq2;->g(ILcom/daaw/lq2;Z)Lcom/daaw/lq2;

    invoke-static {p1, p2}, Lcom/daaw/jp2;->a(J)J

    move-result-wide v2

    iget-object v0, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    iget-object v4, p0, Lcom/daaw/rp2;->h:Lcom/daaw/kq2;

    invoke-virtual {v0, v1, v4, v1}, Lcom/daaw/mq2;->d(ILcom/daaw/kq2;Z)Lcom/daaw/kq2;

    move-result-object v0

    iget-wide v4, v0, Lcom/daaw/kq2;->c:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v4, v6

    if-eqz v0, :cond_3

    cmp-long v0, v2, v4

    :cond_3
    :goto_1
    iput-wide p1, p0, Lcom/daaw/rp2;->u:J

    iget-object v0, p0, Lcom/daaw/rp2;->e:Lcom/daaw/aq2;

    iget-object v2, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    invoke-static {p1, p2}, Lcom/daaw/jp2;->a(J)J

    move-result-wide p1

    invoke-virtual {v0, v2, v1, p1, p2}, Lcom/daaw/aq2;->B(Lcom/daaw/mq2;IJ)V

    iget-object p1, p0, Lcom/daaw/rp2;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/lp2;

    invoke-interface {p2}, Lcom/daaw/lp2;->zze()V

    goto :goto_2

    :cond_4
    return-void
.end method

.method public final k(Z)V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/rp2;->j:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/daaw/rp2;->j:Z

    iget-object v0, p0, Lcom/daaw/rp2;->e:Lcom/daaw/aq2;

    invoke-virtual {v0, p1}, Lcom/daaw/aq2;->F(Z)V

    iget-object v0, p0, Lcom/daaw/rp2;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/lp2;

    iget v2, p0, Lcom/daaw/rp2;->k:I

    invoke-interface {v1, p1, v2}, Lcom/daaw/lp2;->B(ZI)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final l(Lcom/daaw/lp2;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/rp2;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final m(Lcom/daaw/yv2;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    invoke-virtual {v0}, Lcom/daaw/mq2;->h()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rp2;->p:Ljava/lang/Object;

    if-eqz v0, :cond_1

    :cond_0
    sget-object v0, Lcom/daaw/mq2;->a:Lcom/daaw/mq2;

    iput-object v0, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    iput-object v1, p0, Lcom/daaw/rp2;->p:Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/rp2;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/lp2;

    iget-object v3, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    iget-object v4, p0, Lcom/daaw/rp2;->p:Ljava/lang/Object;

    invoke-interface {v2, v3, v4}, Lcom/daaw/lp2;->z(Lcom/daaw/mq2;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/daaw/rp2;->i:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/rp2;->i:Z

    sget-object v0, Lcom/daaw/rw2;->d:Lcom/daaw/rw2;

    iput-object v0, p0, Lcom/daaw/rp2;->q:Lcom/daaw/rw2;

    iget-object v0, p0, Lcom/daaw/rp2;->c:Lcom/daaw/dx2;

    iput-object v0, p0, Lcom/daaw/rp2;->r:Lcom/daaw/dx2;

    iget-object v0, p0, Lcom/daaw/rp2;->b:Lcom/daaw/fx2;

    invoke-virtual {v0, v1}, Lcom/daaw/fx2;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/rp2;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/lp2;

    iget-object v2, p0, Lcom/daaw/rp2;->q:Lcom/daaw/rw2;

    iget-object v3, p0, Lcom/daaw/rp2;->r:Lcom/daaw/dx2;

    invoke-interface {v1, v2, v3}, Lcom/daaw/lp2;->h(Lcom/daaw/rw2;Lcom/daaw/dx2;)V

    goto :goto_1

    :cond_2
    iget v0, p0, Lcom/daaw/rp2;->m:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/rp2;->m:I

    iget-object v0, p0, Lcom/daaw/rp2;->e:Lcom/daaw/aq2;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/aq2;->z(Lcom/daaw/yv2;Z)V

    return-void
.end method

.method public final varargs n([Lcom/daaw/np2;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/rp2;->e:Lcom/daaw/aq2;

    invoke-virtual {v0}, Lcom/daaw/aq2;->I()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/rp2;->e:Lcom/daaw/aq2;

    invoke-virtual {v0, p1}, Lcom/daaw/aq2;->H([Lcom/daaw/np2;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/rp2;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/lp2;

    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/util/concurrent/TimeoutException;

    const-string v3, "ExoPlayer3 blockingSendMessages timeout"

    invoke-direct {v2, v3}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v1}, Lcom/daaw/kp2;->c(Ljava/lang/RuntimeException;)Lcom/daaw/kp2;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/lp2;->m(Lcom/daaw/kp2;)V

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/daaw/rp2;->e:Lcom/daaw/aq2;

    invoke-virtual {v0, p1}, Lcom/daaw/aq2;->v([Lcom/daaw/np2;)V

    return-void
.end method

.method public final varargs o([Lcom/daaw/np2;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/rp2;->e:Lcom/daaw/aq2;

    invoke-virtual {v0, p1}, Lcom/daaw/aq2;->C([Lcom/daaw/np2;)V

    return-void
.end method

.method public final p(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/rp2;->e:Lcom/daaw/aq2;

    invoke-virtual {v0, p1}, Lcom/daaw/aq2;->D(I)V

    return-void
.end method

.method public final q(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/rp2;->e:Lcom/daaw/aq2;

    invoke-virtual {v0, p1}, Lcom/daaw/aq2;->E(I)V

    return-void
.end method

.method public final r(Lcom/daaw/lp2;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/rp2;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/daaw/rp2;->k:I

    return v0
.end method

.method public final zzb()J
    .locals 4

    iget-object v0, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    invoke-virtual {v0}, Lcom/daaw/mq2;->h()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/daaw/rp2;->l:I

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    iget-object v1, p0, Lcom/daaw/rp2;->t:Lcom/daaw/tp2;

    iget v1, v1, Lcom/daaw/tp2;->a:I

    iget-object v2, p0, Lcom/daaw/rp2;->h:Lcom/daaw/kq2;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/mq2;->d(ILcom/daaw/kq2;Z)Lcom/daaw/kq2;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Lcom/daaw/jp2;->b(J)J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/rp2;->t:Lcom/daaw/tp2;

    iget-wide v2, v2, Lcom/daaw/tp2;->d:J

    invoke-static {v2, v3}, Lcom/daaw/jp2;->b(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    return-wide v0

    :cond_1
    :goto_0
    iget-wide v0, p0, Lcom/daaw/rp2;->u:J

    return-wide v0
.end method

.method public final zzc()J
    .locals 4

    iget-object v0, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    invoke-virtual {v0}, Lcom/daaw/mq2;->h()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/daaw/rp2;->l:I

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    iget-object v1, p0, Lcom/daaw/rp2;->t:Lcom/daaw/tp2;

    iget v1, v1, Lcom/daaw/tp2;->a:I

    iget-object v2, p0, Lcom/daaw/rp2;->h:Lcom/daaw/kq2;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/mq2;->d(ILcom/daaw/kq2;Z)Lcom/daaw/kq2;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Lcom/daaw/jp2;->b(J)J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/rp2;->t:Lcom/daaw/tp2;

    iget-wide v2, v2, Lcom/daaw/tp2;->c:J

    invoke-static {v2, v3}, Lcom/daaw/jp2;->b(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    return-wide v0

    :cond_1
    :goto_0
    iget-wide v0, p0, Lcom/daaw/rp2;->u:J

    return-wide v0
.end method

.method public final zzd()J
    .locals 3

    iget-object v0, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    invoke-virtual {v0}, Lcom/daaw/mq2;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/rp2;->o:Lcom/daaw/mq2;

    invoke-virtual {p0}, Lcom/daaw/rp2;->a()I

    iget-object v1, p0, Lcom/daaw/rp2;->g:Lcom/daaw/lq2;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, v2}, Lcom/daaw/mq2;->g(ILcom/daaw/lq2;Z)Lcom/daaw/lq2;

    move-result-object v0

    iget-wide v0, v0, Lcom/daaw/lq2;->a:J

    invoke-static {v0, v1}, Lcom/daaw/jp2;->b(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzg()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/rp2;->e:Lcom/daaw/aq2;

    invoke-virtual {v0}, Lcom/daaw/aq2;->w()V

    return-void
.end method

.method public final zzi()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/rp2;->e:Lcom/daaw/aq2;

    invoke-virtual {v0}, Lcom/daaw/aq2;->y()V

    return-void
.end method

.method public final zzk()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/rp2;->e:Lcom/daaw/aq2;

    invoke-virtual {v0}, Lcom/daaw/aq2;->I()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/rp2;->e:Lcom/daaw/aq2;

    invoke-virtual {v0}, Lcom/daaw/aq2;->J()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rp2;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/lp2;

    new-instance v3, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/util/concurrent/TimeoutException;

    const-string v5, "ExoPlayer3 release timeout"

    invoke-direct {v4, v5}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v3}, Lcom/daaw/kp2;->c(Ljava/lang/RuntimeException;)Lcom/daaw/kp2;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/daaw/lp2;->m(Lcom/daaw/kp2;)V

    goto :goto_0

    :cond_0
    :goto_1
    iget-object v0, p0, Lcom/daaw/rp2;->d:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/daaw/rp2;->e:Lcom/daaw/aq2;

    invoke-virtual {v0}, Lcom/daaw/aq2;->A()V

    goto :goto_1
.end method

.method public final zzr()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/rp2;->e:Lcom/daaw/aq2;

    invoke-virtual {v0}, Lcom/daaw/aq2;->G()V

    return-void
.end method
