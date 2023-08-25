.class public final Lcom/daaw/qk1;
.super Lcom/daaw/xa;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final A:Lcom/daaw/wh1;

.field public final B:Lcom/daaw/k30;

.field public C:Z

.field public D:Z

.field public E:I

.field public F:Lcom/google/android/exoplayer2/Format;

.field public G:Lcom/daaw/uh1;

.field public H:Lcom/daaw/xh1;

.field public I:Lcom/daaw/yh1;

.field public J:Lcom/daaw/yh1;

.field public K:I

.field public final y:Landroid/os/Handler;

.field public final z:Lcom/daaw/pk1;


# direct methods
.method public constructor <init>(Lcom/daaw/pk1;Landroid/os/Looper;)V
    .locals 1

    sget-object v0, Lcom/daaw/wh1;->a:Lcom/daaw/wh1;

    invoke-direct {p0, p1, p2, v0}, Lcom/daaw/qk1;-><init>(Lcom/daaw/pk1;Landroid/os/Looper;Lcom/daaw/wh1;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/pk1;Landroid/os/Looper;Lcom/daaw/wh1;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/daaw/xa;-><init>(I)V

    invoke-static {p1}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/pk1;

    iput-object p1, p0, Lcom/daaw/qk1;->z:Lcom/daaw/pk1;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    :goto_0
    iput-object p1, p0, Lcom/daaw/qk1;->y:Landroid/os/Handler;

    iput-object p3, p0, Lcom/daaw/qk1;->A:Lcom/daaw/wh1;

    new-instance p1, Lcom/daaw/k30;

    invoke-direct {p1}, Lcom/daaw/k30;-><init>()V

    iput-object p1, p0, Lcom/daaw/qk1;->B:Lcom/daaw/k30;

    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/qk1;->F:Lcom/google/android/exoplayer2/Format;

    invoke-virtual {p0}, Lcom/daaw/qk1;->J()V

    invoke-virtual {p0}, Lcom/daaw/qk1;->N()V

    return-void
.end method

.method public C(JZ)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/qk1;->J()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/qk1;->C:Z

    iput-boolean p1, p0, Lcom/daaw/qk1;->D:Z

    iget p1, p0, Lcom/daaw/qk1;->E:I

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/qk1;->O()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/qk1;->M()V

    iget-object p1, p0, Lcom/daaw/qk1;->G:Lcom/daaw/uh1;

    invoke-interface {p1}, Lcom/daaw/eq;->flush()V

    :goto_0
    return-void
.end method

.method public F([Lcom/google/android/exoplayer2/Format;J)V
    .locals 0

    const/4 p2, 0x0

    aget-object p1, p1, p2

    iput-object p1, p0, Lcom/daaw/qk1;->F:Lcom/google/android/exoplayer2/Format;

    iget-object p2, p0, Lcom/daaw/qk1;->G:Lcom/daaw/uh1;

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lcom/daaw/qk1;->E:I

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/daaw/qk1;->A:Lcom/daaw/wh1;

    invoke-interface {p2, p1}, Lcom/daaw/wh1;->b(Lcom/google/android/exoplayer2/Format;)Lcom/daaw/uh1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/qk1;->G:Lcom/daaw/uh1;

    :goto_0
    return-void
.end method

.method public final J()V
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/qk1;->P(Ljava/util/List;)V

    return-void
.end method

.method public final K()J
    .locals 2

    iget v0, p0, Lcom/daaw/qk1;->K:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Lcom/daaw/qk1;->I:Lcom/daaw/yh1;

    invoke-virtual {v1}, Lcom/daaw/yh1;->d()I

    move-result v1

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/qk1;->I:Lcom/daaw/yh1;

    iget v1, p0, Lcom/daaw/qk1;->K:I

    invoke-virtual {v0, v1}, Lcom/daaw/yh1;->b(I)J

    move-result-wide v0

    goto :goto_1

    :cond_1
    :goto_0
    const-wide v0, 0x7fffffffffffffffL

    :goto_1
    return-wide v0
.end method

.method public final L(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/ln;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/qk1;->z:Lcom/daaw/pk1;

    invoke-interface {v0, p1}, Lcom/daaw/pk1;->h(Ljava/util/List;)V

    return-void
.end method

.method public final M()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/qk1;->H:Lcom/daaw/xh1;

    const/4 v1, -0x1

    iput v1, p0, Lcom/daaw/qk1;->K:I

    iget-object v1, p0, Lcom/daaw/qk1;->I:Lcom/daaw/yh1;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/daaw/yh1;->m()V

    iput-object v0, p0, Lcom/daaw/qk1;->I:Lcom/daaw/yh1;

    :cond_0
    iget-object v1, p0, Lcom/daaw/qk1;->J:Lcom/daaw/yh1;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/daaw/yh1;->m()V

    iput-object v0, p0, Lcom/daaw/qk1;->J:Lcom/daaw/yh1;

    :cond_1
    return-void
.end method

.method public final N()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/qk1;->M()V

    iget-object v0, p0, Lcom/daaw/qk1;->G:Lcom/daaw/uh1;

    invoke-interface {v0}, Lcom/daaw/eq;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/qk1;->G:Lcom/daaw/uh1;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/qk1;->E:I

    return-void
.end method

.method public final O()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/qk1;->N()V

    iget-object v0, p0, Lcom/daaw/qk1;->A:Lcom/daaw/wh1;

    iget-object v1, p0, Lcom/daaw/qk1;->F:Lcom/google/android/exoplayer2/Format;

    invoke-interface {v0, v1}, Lcom/daaw/wh1;->b(Lcom/google/android/exoplayer2/Format;)Lcom/daaw/uh1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/qk1;->G:Lcom/daaw/uh1;

    return-void
.end method

.method public final P(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/ln;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/qk1;->y:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/qk1;->L(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public a(Lcom/google/android/exoplayer2/Format;)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/qk1;->A:Lcom/daaw/wh1;

    invoke-interface {v0, p1}, Lcom/daaw/wh1;->a(Lcom/google/android/exoplayer2/Format;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iget-object p1, p1, Lcom/google/android/exoplayer2/Format;->x:Lcom/google/android/exoplayer2/drm/DrmInitData;

    invoke-static {v0, p1}, Lcom/daaw/xa;->I(Lcom/daaw/yu;Lcom/google/android/exoplayer2/drm/DrmInitData;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    return p1

    :cond_1
    iget-object p1, p1, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/hq0;->l(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/qk1;->D:Z

    return v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/daaw/qk1;->L(Ljava/util/List;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public q(JJ)V
    .locals 8

    iget-boolean p3, p0, Lcom/daaw/qk1;->D:Z

    if-eqz p3, :cond_0

    return-void

    :cond_0
    iget-object p3, p0, Lcom/daaw/qk1;->J:Lcom/daaw/yh1;

    if-nez p3, :cond_1

    iget-object p3, p0, Lcom/daaw/qk1;->G:Lcom/daaw/uh1;

    invoke-interface {p3, p1, p2}, Lcom/daaw/uh1;->b(J)V

    :try_start_0
    iget-object p3, p0, Lcom/daaw/qk1;->G:Lcom/daaw/uh1;

    invoke-interface {p3}, Lcom/daaw/eq;->c()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/daaw/yh1;

    iput-object p3, p0, Lcom/daaw/qk1;->J:Lcom/daaw/yh1;
    :try_end_0
    .catch Lcom/daaw/vh1; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lcom/daaw/xa;->x()I

    move-result p2

    invoke-static {p1, p2}, Lcom/daaw/qz;->a(Ljava/lang/Exception;I)Lcom/daaw/qz;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/xa;->getState()I

    move-result p3

    const/4 p4, 0x2

    if-eq p3, p4, :cond_2

    return-void

    :cond_2
    iget-object p3, p0, Lcom/daaw/qk1;->I:Lcom/daaw/yh1;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p3, :cond_3

    invoke-virtual {p0}, Lcom/daaw/qk1;->K()J

    move-result-wide v2

    const/4 p3, 0x0

    :goto_1
    cmp-long v4, v2, p1

    if-gtz v4, :cond_4

    iget p3, p0, Lcom/daaw/qk1;->K:I

    add-int/2addr p3, v1

    iput p3, p0, Lcom/daaw/qk1;->K:I

    invoke-virtual {p0}, Lcom/daaw/qk1;->K()J

    move-result-wide v2

    const/4 p3, 0x1

    goto :goto_1

    :cond_3
    const/4 p3, 0x0

    :cond_4
    iget-object v2, p0, Lcom/daaw/qk1;->J:Lcom/daaw/yh1;

    const/4 v3, 0x0

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lcom/daaw/rc;->j()Z

    move-result v2

    if-eqz v2, :cond_6

    if-nez p3, :cond_8

    invoke-virtual {p0}, Lcom/daaw/qk1;->K()J

    move-result-wide v4

    const-wide v6, 0x7fffffffffffffffL

    cmp-long v2, v4, v6

    if-nez v2, :cond_8

    iget v2, p0, Lcom/daaw/qk1;->E:I

    if-ne v2, p4, :cond_5

    invoke-virtual {p0}, Lcom/daaw/qk1;->O()V

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lcom/daaw/qk1;->M()V

    iput-boolean v1, p0, Lcom/daaw/qk1;->D:Z

    goto :goto_2

    :cond_6
    iget-object v2, p0, Lcom/daaw/qk1;->J:Lcom/daaw/yh1;

    iget-wide v4, v2, Lcom/daaw/av0;->q:J

    cmp-long v2, v4, p1

    if-gtz v2, :cond_8

    iget-object p3, p0, Lcom/daaw/qk1;->I:Lcom/daaw/yh1;

    if-eqz p3, :cond_7

    invoke-virtual {p3}, Lcom/daaw/yh1;->m()V

    :cond_7
    iget-object p3, p0, Lcom/daaw/qk1;->J:Lcom/daaw/yh1;

    iput-object p3, p0, Lcom/daaw/qk1;->I:Lcom/daaw/yh1;

    iput-object v3, p0, Lcom/daaw/qk1;->J:Lcom/daaw/yh1;

    invoke-virtual {p3, p1, p2}, Lcom/daaw/yh1;->a(J)I

    move-result p3

    iput p3, p0, Lcom/daaw/qk1;->K:I

    const/4 p3, 0x1

    :cond_8
    :goto_2
    if-eqz p3, :cond_9

    iget-object p3, p0, Lcom/daaw/qk1;->I:Lcom/daaw/yh1;

    invoke-virtual {p3, p1, p2}, Lcom/daaw/yh1;->c(J)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/qk1;->P(Ljava/util/List;)V

    :cond_9
    iget p1, p0, Lcom/daaw/qk1;->E:I

    if-ne p1, p4, :cond_a

    return-void

    :cond_a
    :goto_3
    :try_start_1
    iget-boolean p1, p0, Lcom/daaw/qk1;->C:Z

    if-nez p1, :cond_f

    iget-object p1, p0, Lcom/daaw/qk1;->H:Lcom/daaw/xh1;

    if-nez p1, :cond_b

    iget-object p1, p0, Lcom/daaw/qk1;->G:Lcom/daaw/uh1;

    invoke-interface {p1}, Lcom/daaw/eq;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/xh1;

    iput-object p1, p0, Lcom/daaw/qk1;->H:Lcom/daaw/xh1;

    if-nez p1, :cond_b

    return-void

    :cond_b
    iget p1, p0, Lcom/daaw/qk1;->E:I

    if-ne p1, v1, :cond_c

    iget-object p1, p0, Lcom/daaw/qk1;->H:Lcom/daaw/xh1;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Lcom/daaw/rc;->l(I)V

    iget-object p1, p0, Lcom/daaw/qk1;->G:Lcom/daaw/uh1;

    iget-object p2, p0, Lcom/daaw/qk1;->H:Lcom/daaw/xh1;

    invoke-interface {p1, p2}, Lcom/daaw/eq;->e(Ljava/lang/Object;)V

    iput-object v3, p0, Lcom/daaw/qk1;->H:Lcom/daaw/xh1;

    iput p4, p0, Lcom/daaw/qk1;->E:I

    return-void

    :cond_c
    iget-object p1, p0, Lcom/daaw/qk1;->B:Lcom/daaw/k30;

    iget-object p2, p0, Lcom/daaw/qk1;->H:Lcom/daaw/xh1;

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/xa;->G(Lcom/daaw/k30;Lcom/daaw/gq;Z)I

    move-result p1

    const/4 p2, -0x4

    if-ne p1, p2, :cond_e

    iget-object p1, p0, Lcom/daaw/qk1;->H:Lcom/daaw/xh1;

    invoke-virtual {p1}, Lcom/daaw/rc;->j()Z

    move-result p1

    if-eqz p1, :cond_d

    iput-boolean v1, p0, Lcom/daaw/qk1;->C:Z

    goto :goto_4

    :cond_d
    iget-object p1, p0, Lcom/daaw/qk1;->H:Lcom/daaw/xh1;

    iget-object p2, p0, Lcom/daaw/qk1;->B:Lcom/daaw/k30;

    iget-object p2, p2, Lcom/daaw/k30;->a:Lcom/google/android/exoplayer2/Format;

    iget-wide p2, p2, Lcom/google/android/exoplayer2/Format;->L:J

    iput-wide p2, p1, Lcom/daaw/xh1;->u:J

    invoke-virtual {p1}, Lcom/daaw/gq;->o()V

    :goto_4
    iget-object p1, p0, Lcom/daaw/qk1;->G:Lcom/daaw/uh1;

    iget-object p2, p0, Lcom/daaw/qk1;->H:Lcom/daaw/xh1;

    invoke-interface {p1, p2}, Lcom/daaw/eq;->e(Ljava/lang/Object;)V

    iput-object v3, p0, Lcom/daaw/qk1;->H:Lcom/daaw/xh1;
    :try_end_1
    .catch Lcom/daaw/vh1; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :cond_e
    const/4 p2, -0x3

    if-ne p1, p2, :cond_a

    :cond_f
    return-void

    :catch_1
    move-exception p1

    invoke-virtual {p0}, Lcom/daaw/xa;->x()I

    move-result p2

    invoke-static {p1, p2}, Lcom/daaw/qz;->a(Ljava/lang/Exception;I)Lcom/daaw/qz;

    move-result-object p1

    goto :goto_6

    :goto_5
    throw p1

    :goto_6
    goto :goto_5
.end method
