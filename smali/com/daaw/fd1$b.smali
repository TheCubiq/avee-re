.class public final Lcom/daaw/fd1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rs1;
.implements Lcom/daaw/n7;
.implements Lcom/daaw/pk1;
.implements Lcom/daaw/xp0;
.implements Landroid/view/SurfaceHolder$Callback;
.implements Landroid/view/TextureView$SurfaceTextureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/fd1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/fd1;


# direct methods
.method public constructor <init>(Lcom/daaw/fd1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/fd1;Lcom/daaw/fd1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/fd1$b;-><init>(Lcom/daaw/fd1;)V

    return-void
.end method


# virtual methods
.method public B(IJJ)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->z(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/daaw/n7;

    move v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-interface/range {v2 .. v7}, Lcom/daaw/n7;->B(IJJ)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public D(Lcom/daaw/fq;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0, p1}, Lcom/daaw/fd1;->y(Lcom/daaw/fd1;Lcom/daaw/fq;)Lcom/daaw/fq;

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->z(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/n7;

    invoke-interface {v1, p1}, Lcom/daaw/n7;->D(Lcom/daaw/fq;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0, p1}, Lcom/daaw/fd1;->A(Lcom/daaw/fd1;I)I

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->z(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/n7;

    invoke-interface {v1, p1}, Lcom/daaw/n7;->a(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(IIIF)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->w(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/qs1;

    invoke-interface {v1, p1, p2, p3, p4}, Lcom/daaw/qs1;->b(IIIF)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->u(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/rs1;

    invoke-interface {v1, p1, p2, p3, p4}, Lcom/daaw/rs1;->b(IIIF)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public f(Ljava/lang/String;JJ)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->u(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/daaw/rs1;

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-interface/range {v2 .. v7}, Lcom/daaw/rs1;->f(Ljava/lang/String;JJ)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/ln;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0, p1}, Lcom/daaw/fd1;->p(Lcom/daaw/fd1;Ljava/util/List;)Ljava/util/List;

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->r(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/pk1;

    invoke-interface {v1, p1}, Lcom/daaw/pk1;->h(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i(Landroid/view/Surface;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->x(Lcom/daaw/fd1;)Landroid/view/Surface;

    move-result-object v0

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->w(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/qs1;

    invoke-interface {v1}, Lcom/daaw/qs1;->f()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->u(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/rs1;

    invoke-interface {v1, p1}, Lcom/daaw/rs1;->i(Landroid/view/Surface;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public j(Lcom/daaw/fq;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->z(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/n7;

    invoke-interface {v1, p1}, Lcom/daaw/n7;->j(Lcom/daaw/fq;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/fd1;->B(Lcom/daaw/fd1;Lcom/google/android/exoplayer2/Format;)Lcom/google/android/exoplayer2/Format;

    iget-object p1, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {p1, v0}, Lcom/daaw/fd1;->y(Lcom/daaw/fd1;Lcom/daaw/fq;)Lcom/daaw/fq;

    iget-object p1, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/fd1;->A(Lcom/daaw/fd1;I)I

    return-void
.end method

.method public n(Ljava/lang/String;JJ)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->z(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/daaw/n7;

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-interface/range {v2 .. v7}, Lcom/daaw/n7;->n(Ljava/lang/String;JJ)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    iget-object p2, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    new-instance p3, Landroid/view/Surface;

    invoke-direct {p3, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    const/4 p1, 0x1

    invoke-static {p2, p3, p1}, Lcom/daaw/fd1;->t(Lcom/daaw/fd1;Landroid/view/Surface;Z)V

    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 2

    iget-object p1, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lcom/daaw/fd1;->t(Lcom/daaw/fd1;Landroid/view/Surface;Z)V

    return v1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method

.method public p(Lcom/google/android/exoplayer2/metadata/Metadata;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->s(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/xp0;

    invoke-interface {v1, p1}, Lcom/daaw/xp0;->p(Lcom/google/android/exoplayer2/metadata/Metadata;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public q(IJ)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->u(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/rs1;

    invoke-interface {v1, p1, p2, p3}, Lcom/daaw/rs1;->q(IJ)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/daaw/fd1;->t(Lcom/daaw/fd1;Landroid/view/Surface;Z)V

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/daaw/fd1;->t(Lcom/daaw/fd1;Landroid/view/Surface;Z)V

    return-void
.end method

.method public u(Lcom/daaw/fq;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->u(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/rs1;

    invoke-interface {v1, p1}, Lcom/daaw/rs1;->u(Lcom/daaw/fq;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/fd1;->v(Lcom/daaw/fd1;Lcom/google/android/exoplayer2/Format;)Lcom/google/android/exoplayer2/Format;

    iget-object p1, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {p1, v0}, Lcom/daaw/fd1;->q(Lcom/daaw/fd1;Lcom/daaw/fq;)Lcom/daaw/fq;

    return-void
.end method

.method public x(Lcom/google/android/exoplayer2/Format;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0, p1}, Lcom/daaw/fd1;->v(Lcom/daaw/fd1;Lcom/google/android/exoplayer2/Format;)Lcom/google/android/exoplayer2/Format;

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->u(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/rs1;

    invoke-interface {v1, p1}, Lcom/daaw/rs1;->x(Lcom/google/android/exoplayer2/Format;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public y(Lcom/daaw/fq;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0, p1}, Lcom/daaw/fd1;->q(Lcom/daaw/fd1;Lcom/daaw/fq;)Lcom/daaw/fq;

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->u(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/rs1;

    invoke-interface {v1, p1}, Lcom/daaw/rs1;->y(Lcom/daaw/fq;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public z(Lcom/google/android/exoplayer2/Format;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0, p1}, Lcom/daaw/fd1;->B(Lcom/daaw/fd1;Lcom/google/android/exoplayer2/Format;)Lcom/google/android/exoplayer2/Format;

    iget-object v0, p0, Lcom/daaw/fd1$b;->p:Lcom/daaw/fd1;

    invoke-static {v0}, Lcom/daaw/fd1;->z(Lcom/daaw/fd1;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/n7;

    invoke-interface {v1, p1}, Lcom/daaw/n7;->z(Lcom/google/android/exoplayer2/Format;)V

    goto :goto_0

    :cond_0
    return-void
.end method
