.class public Lcom/daaw/vr0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/vr0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/vr0$b$a;
    }
.end annotation


# instance fields
.field public A:I

.field public final synthetic B:Lcom/daaw/vr0;

.field public p:Landroid/media/MediaPlayer;

.field public q:Z

.field public r:F

.field public s:J

.field public t:F

.field public u:F

.field public v:F

.field public volatile w:Lcom/daaw/vr0$b$a;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lcom/daaw/vr0;)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/vr0$b;->B:Lcom/daaw/vr0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/vr0$b;->q:Z

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/daaw/vr0$b;->r:F

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/vr0$b;->s:J

    iput p1, p0, Lcom/daaw/vr0$b;->t:F

    iput p1, p0, Lcom/daaw/vr0$b;->u:F

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/vr0$b;->v:F

    new-instance p1, Lcom/daaw/vr0$b$a;

    invoke-direct {p1, p0}, Lcom/daaw/vr0$b$a;-><init>(Lcom/daaw/vr0$b;)V

    iput-object p1, p0, Lcom/daaw/vr0$b;->w:Lcom/daaw/vr0$b$a;

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/vr0$b;->x:I

    iput p1, p0, Lcom/daaw/vr0$b;->y:I

    iput p1, p0, Lcom/daaw/vr0$b;->z:I

    iput p1, p0, Lcom/daaw/vr0$b;->A:I

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 6

    iget-object v0, p0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/vr0$b;->b()I

    move-result v0

    const/4 v2, 0x2

    if-ge v0, v2, :cond_1

    return v1

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getTrackInfo()[Landroid/media/MediaPlayer$TrackInfo;

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, v0, v3

    invoke-virtual {v4}, Landroid/media/MediaPlayer$TrackInfo;->getTrackType()I

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v5, 0x1

    if-ne v4, v5, :cond_2

    return v5

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_3
    return v1
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/daaw/vr0$b;->x:I

    return v0
.end method

.method public c()Z
    .locals 1

    iget v0, p0, Lcom/daaw/vr0$b;->x:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()Z
    .locals 3

    iget v0, p0, Lcom/daaw/vr0$b;->x:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_1

    :cond_0
    iget-boolean v2, p0, Lcom/daaw/vr0$b;->q:Z

    if-nez v2, :cond_3

    :cond_1
    const/4 v2, 0x5

    if-ne v0, v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1
.end method

.method public e(J)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/vr0$b;->s:J

    iget-object p1, p0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepareAsync()V

    return-void
.end method

.method public f()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/vr0$b;->B:Lcom/daaw/vr0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/vr0;->m(Landroid/view/SurfaceHolder;)V

    iget-object v0, p0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/vr0$b;->b()I

    move-result v0

    const/4 v2, 0x2

    if-le v0, v2, :cond_0

    iget-object v0, p0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    :cond_1
    iput-object v1, p0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    return-void
.end method

.method public g(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/vr0$b;->u:F

    invoke-virtual {p0}, Lcom/daaw/vr0$b;->o()V

    return-void
.end method

.method public h(F)Z
    .locals 3

    iget v0, p0, Lcom/daaw/vr0$b;->x:I

    const/4 v1, 0x1

    if-gez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    iget v2, p0, Lcom/daaw/vr0$b;->u:F

    add-float/2addr v2, p1

    iput v2, p0, Lcom/daaw/vr0$b;->u:F

    const/4 p1, 0x0

    cmpg-float v2, v2, p1

    if-gtz v2, :cond_1

    iput p1, p0, Lcom/daaw/vr0$b;->u:F

    const/4 v0, 0x1

    :cond_1
    iget p1, p0, Lcom/daaw/vr0$b;->u:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float p1, p1, v2

    if-ltz p1, :cond_2

    iput v2, p0, Lcom/daaw/vr0$b;->u:F

    goto :goto_0

    :cond_2
    move v1, v0

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/vr0$b;->o()V

    return v1
.end method

.method public i(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/vr0$b;->r:F

    return-void
.end method

.method public j(I)V
    .locals 1

    iput p1, p0, Lcom/daaw/vr0$b;->x:I

    new-instance v0, Lcom/daaw/vr0$b$a;

    invoke-direct {v0, p0}, Lcom/daaw/vr0$b$a;-><init>(Lcom/daaw/vr0$b;)V

    iput p1, v0, Lcom/daaw/vr0$b$a;->a:I

    invoke-virtual {p0}, Lcom/daaw/vr0$b;->d()Z

    move-result p1

    iput-boolean p1, v0, Lcom/daaw/vr0$b$a;->b:Z

    iget-object p1, p0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getAudioSessionId()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput p1, v0, Lcom/daaw/vr0$b$a;->c:I

    iput-object v0, p0, Lcom/daaw/vr0$b;->w:Lcom/daaw/vr0$b$a;

    return-void
.end method

.method public k(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/vr0$b;->b()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    invoke-static {p1}, Lcom/daaw/vr0;->z(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setVideoScalingMode(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public l(Landroid/view/Surface;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setSurface(Landroid/view/Surface;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setSurface(Landroid/view/Surface;)V

    :goto_0
    return-void
.end method

.method public m(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/vr0$b;->t:F

    invoke-virtual {p0}, Lcom/daaw/vr0$b;->o()V

    return-void
.end method

.method public n(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/vr0$b;->v:F

    invoke-virtual {p0}, Lcom/daaw/vr0$b;->o()V

    return-void
.end method

.method public o()V
    .locals 5

    iget v0, p0, Lcom/daaw/vr0$b;->x:I

    if-gez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lcom/daaw/vr0$b;->v:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v0, v1, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iget v2, p0, Lcom/daaw/vr0$b;->v:F

    add-float/2addr v2, v1

    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iget-object v2, p0, Lcom/daaw/vr0$b;->p:Landroid/media/MediaPlayer;

    iget v3, p0, Lcom/daaw/vr0$b;->u:F

    mul-float v0, v0, v3

    iget v4, p0, Lcom/daaw/vr0$b;->t:F

    mul-float v0, v0, v4

    mul-float v1, v1, v3

    mul-float v1, v1, v4

    invoke-virtual {v2, v0, v1}, Landroid/media/MediaPlayer;->setVolume(FF)V

    return-void
.end method

.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 2

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/daaw/vr0$b;->j(I)V

    iget-wide v0, p0, Lcom/daaw/vr0$b;->s:J

    long-to-int v1, v0

    invoke-virtual {p1, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    iget p1, p0, Lcom/daaw/vr0$b;->r:F

    invoke-virtual {p0, p1}, Lcom/daaw/vr0$b;->g(F)V

    iget-boolean p1, p0, Lcom/daaw/vr0$b;->q:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/vr0$b;->B:Lcom/daaw/vr0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/vr0;->A(Lcom/daaw/vr0;Z)V

    :cond_0
    iget-object p1, p0, Lcom/daaw/vr0$b;->B:Lcom/daaw/vr0;

    iget-object p1, p1, Lcom/daaw/vr0;->r:Lcom/daaw/avee/comp/playback/e$b;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/daaw/avee/comp/playback/e$b;->a(ZLjava/lang/String;)V

    return-void
.end method
