.class public final Lcom/daaw/yp0;
.super Lcom/daaw/xa;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final A:Landroid/os/Handler;

.field public final B:Lcom/daaw/k30;

.field public final C:Lcom/daaw/tp0;

.field public final D:[Lcom/google/android/exoplayer2/metadata/Metadata;

.field public final E:[J

.field public F:I

.field public G:I

.field public H:Lcom/daaw/rp0;

.field public I:Z

.field public final y:Lcom/daaw/sp0;

.field public final z:Lcom/daaw/xp0;


# direct methods
.method public constructor <init>(Lcom/daaw/xp0;Landroid/os/Looper;)V
    .locals 1

    sget-object v0, Lcom/daaw/sp0;->a:Lcom/daaw/sp0;

    invoke-direct {p0, p1, p2, v0}, Lcom/daaw/yp0;-><init>(Lcom/daaw/xp0;Landroid/os/Looper;Lcom/daaw/sp0;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/xp0;Landroid/os/Looper;Lcom/daaw/sp0;)V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/daaw/xa;-><init>(I)V

    invoke-static {p1}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/xp0;

    iput-object p1, p0, Lcom/daaw/yp0;->z:Lcom/daaw/xp0;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    :goto_0
    iput-object p1, p0, Lcom/daaw/yp0;->A:Landroid/os/Handler;

    invoke-static {p3}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/sp0;

    iput-object p1, p0, Lcom/daaw/yp0;->y:Lcom/daaw/sp0;

    new-instance p1, Lcom/daaw/k30;

    invoke-direct {p1}, Lcom/daaw/k30;-><init>()V

    iput-object p1, p0, Lcom/daaw/yp0;->B:Lcom/daaw/k30;

    new-instance p1, Lcom/daaw/tp0;

    invoke-direct {p1}, Lcom/daaw/tp0;-><init>()V

    iput-object p1, p0, Lcom/daaw/yp0;->C:Lcom/daaw/tp0;

    const/4 p1, 0x5

    new-array p2, p1, [Lcom/google/android/exoplayer2/metadata/Metadata;

    iput-object p2, p0, Lcom/daaw/yp0;->D:[Lcom/google/android/exoplayer2/metadata/Metadata;

    new-array p1, p1, [J

    iput-object p1, p0, Lcom/daaw/yp0;->E:[J

    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/yp0;->J()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/yp0;->H:Lcom/daaw/rp0;

    return-void
.end method

.method public C(JZ)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/yp0;->J()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/yp0;->I:Z

    return-void
.end method

.method public F([Lcom/google/android/exoplayer2/Format;J)V
    .locals 0

    iget-object p2, p0, Lcom/daaw/yp0;->y:Lcom/daaw/sp0;

    const/4 p3, 0x0

    aget-object p1, p1, p3

    invoke-interface {p2, p1}, Lcom/daaw/sp0;->b(Lcom/google/android/exoplayer2/Format;)Lcom/daaw/rp0;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/yp0;->H:Lcom/daaw/rp0;

    return-void
.end method

.method public final J()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/yp0;->D:[Lcom/google/android/exoplayer2/metadata/Metadata;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/yp0;->F:I

    iput v0, p0, Lcom/daaw/yp0;->G:I

    return-void
.end method

.method public final K(Lcom/google/android/exoplayer2/metadata/Metadata;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/yp0;->A:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/yp0;->L(Lcom/google/android/exoplayer2/metadata/Metadata;)V

    :goto_0
    return-void
.end method

.method public final L(Lcom/google/android/exoplayer2/metadata/Metadata;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/yp0;->z:Lcom/daaw/xp0;

    invoke-interface {v0, p1}, Lcom/daaw/xp0;->p(Lcom/google/android/exoplayer2/metadata/Metadata;)V

    return-void
.end method

.method public a(Lcom/google/android/exoplayer2/Format;)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/yp0;->y:Lcom/daaw/sp0;

    invoke-interface {v0, p1}, Lcom/daaw/sp0;->a(Lcom/google/android/exoplayer2/Format;)Z

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
    const/4 p1, 0x0

    return p1
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/yp0;->I:Z

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

    check-cast p1, Lcom/google/android/exoplayer2/metadata/Metadata;

    invoke-virtual {p0, p1}, Lcom/daaw/yp0;->L(Lcom/google/android/exoplayer2/metadata/Metadata;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public q(JJ)V
    .locals 4

    iget-boolean p3, p0, Lcom/daaw/yp0;->I:Z

    const/4 p4, 0x5

    const/4 v0, 0x1

    if-nez p3, :cond_2

    iget p3, p0, Lcom/daaw/yp0;->G:I

    if-ge p3, p4, :cond_2

    iget-object p3, p0, Lcom/daaw/yp0;->C:Lcom/daaw/tp0;

    invoke-virtual {p3}, Lcom/daaw/gq;->f()V

    iget-object p3, p0, Lcom/daaw/yp0;->B:Lcom/daaw/k30;

    iget-object v1, p0, Lcom/daaw/yp0;->C:Lcom/daaw/tp0;

    const/4 v2, 0x0

    invoke-virtual {p0, p3, v1, v2}, Lcom/daaw/xa;->G(Lcom/daaw/k30;Lcom/daaw/gq;Z)I

    move-result p3

    const/4 v1, -0x4

    if-ne p3, v1, :cond_2

    iget-object p3, p0, Lcom/daaw/yp0;->C:Lcom/daaw/tp0;

    invoke-virtual {p3}, Lcom/daaw/rc;->j()Z

    move-result p3

    if-eqz p3, :cond_0

    iput-boolean v0, p0, Lcom/daaw/yp0;->I:Z

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lcom/daaw/yp0;->C:Lcom/daaw/tp0;

    invoke-virtual {p3}, Lcom/daaw/rc;->i()Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    iget-object p3, p0, Lcom/daaw/yp0;->C:Lcom/daaw/tp0;

    iget-object v1, p0, Lcom/daaw/yp0;->B:Lcom/daaw/k30;

    iget-object v1, v1, Lcom/daaw/k30;->a:Lcom/google/android/exoplayer2/Format;

    iget-wide v1, v1, Lcom/google/android/exoplayer2/Format;->L:J

    iput-wide v1, p3, Lcom/daaw/tp0;->u:J

    invoke-virtual {p3}, Lcom/daaw/gq;->o()V

    iget p3, p0, Lcom/daaw/yp0;->F:I

    iget v1, p0, Lcom/daaw/yp0;->G:I

    add-int/2addr p3, v1

    rem-int/2addr p3, p4

    iget-object v1, p0, Lcom/daaw/yp0;->D:[Lcom/google/android/exoplayer2/metadata/Metadata;

    iget-object v2, p0, Lcom/daaw/yp0;->H:Lcom/daaw/rp0;

    iget-object v3, p0, Lcom/daaw/yp0;->C:Lcom/daaw/tp0;

    invoke-interface {v2, v3}, Lcom/daaw/rp0;->a(Lcom/daaw/tp0;)Lcom/google/android/exoplayer2/metadata/Metadata;

    move-result-object v2

    aput-object v2, v1, p3

    iget-object v1, p0, Lcom/daaw/yp0;->E:[J

    iget-object v2, p0, Lcom/daaw/yp0;->C:Lcom/daaw/tp0;

    iget-wide v2, v2, Lcom/daaw/gq;->s:J

    aput-wide v2, v1, p3

    iget p3, p0, Lcom/daaw/yp0;->G:I

    add-int/2addr p3, v0

    iput p3, p0, Lcom/daaw/yp0;->G:I

    :cond_2
    :goto_0
    iget p3, p0, Lcom/daaw/yp0;->G:I

    if-lez p3, :cond_3

    iget-object p3, p0, Lcom/daaw/yp0;->E:[J

    iget v1, p0, Lcom/daaw/yp0;->F:I

    aget-wide v2, p3, v1

    cmp-long p3, v2, p1

    if-gtz p3, :cond_3

    iget-object p1, p0, Lcom/daaw/yp0;->D:[Lcom/google/android/exoplayer2/metadata/Metadata;

    aget-object p1, p1, v1

    invoke-virtual {p0, p1}, Lcom/daaw/yp0;->K(Lcom/google/android/exoplayer2/metadata/Metadata;)V

    iget-object p1, p0, Lcom/daaw/yp0;->D:[Lcom/google/android/exoplayer2/metadata/Metadata;

    iget p2, p0, Lcom/daaw/yp0;->F:I

    const/4 p3, 0x0

    aput-object p3, p1, p2

    add-int/2addr p2, v0

    rem-int/2addr p2, p4

    iput p2, p0, Lcom/daaw/yp0;->F:I

    iget p1, p0, Lcom/daaw/yp0;->G:I

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/yp0;->G:I

    :cond_3
    return-void
.end method
