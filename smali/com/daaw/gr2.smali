.class public Lcom/daaw/gr2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Landroid/media/AudioTrack;

.field public b:Z

.field public c:I

.field public d:J

.field public e:J

.field public f:J

.field public g:J

.field public h:J

.field public i:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/fr2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 11

    iget-wide v0, p0, Lcom/daaw/gr2;->g:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/gr2;->g:J

    iget v4, p0, Lcom/daaw/gr2;->c:I

    iget-wide v5, p0, Lcom/daaw/gr2;->i:J

    iget-wide v7, p0, Lcom/daaw/gr2;->h:J

    const-wide/16 v9, 0x3e8

    mul-long v0, v0, v9

    sub-long/2addr v0, v2

    int-to-long v2, v4

    mul-long v0, v0, v2

    const-wide/32 v2, 0xf4240

    div-long/2addr v0, v2

    add-long/2addr v7, v0

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/gr2;->a:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x1

    const-wide/16 v2, 0x0

    if-ne v0, v1, :cond_1

    return-wide v2

    :cond_1
    iget-object v1, p0, Lcom/daaw/gr2;->a:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlaybackHeadPosition()I

    move-result v1

    int-to-long v4, v1

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    iget-boolean v1, p0, Lcom/daaw/gr2;->b:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    cmp-long v0, v4, v2

    if-nez v0, :cond_2

    iget-wide v0, p0, Lcom/daaw/gr2;->d:J

    iput-wide v0, p0, Lcom/daaw/gr2;->f:J

    :cond_2
    iget-wide v0, p0, Lcom/daaw/gr2;->f:J

    add-long/2addr v4, v0

    :cond_3
    iget-wide v0, p0, Lcom/daaw/gr2;->d:J

    cmp-long v2, v0, v4

    if-lez v2, :cond_4

    iget-wide v0, p0, Lcom/daaw/gr2;->e:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/daaw/gr2;->e:J

    :cond_4
    iput-wide v4, p0, Lcom/daaw/gr2;->d:J

    iget-wide v0, p0, Lcom/daaw/gr2;->e:J

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    add-long/2addr v4, v0

    return-wide v4
.end method

.method public final b()J
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/gr2;->a()J

    move-result-wide v0

    const-wide/32 v2, 0xf4240

    mul-long v0, v0, v2

    iget v2, p0, Lcom/daaw/gr2;->c:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public c()J
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public d()J
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final e(J)V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/gr2;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/gr2;->h:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v0, v0, v2

    iput-wide v0, p0, Lcom/daaw/gr2;->g:J

    iput-wide p1, p0, Lcom/daaw/gr2;->i:J

    iget-object p1, p0, Lcom/daaw/gr2;->a:Landroid/media/AudioTrack;

    invoke-virtual {p1}, Landroid/media/AudioTrack;->stop()V

    return-void
.end method

.method public final f()V
    .locals 5

    iget-wide v0, p0, Lcom/daaw/gr2;->g:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/gr2;->a:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    return-void
.end method

.method public g(Landroid/media/AudioTrack;Z)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/gr2;->a:Landroid/media/AudioTrack;

    iput-boolean p2, p0, Lcom/daaw/gr2;->b:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/gr2;->g:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/gr2;->d:J

    iput-wide v0, p0, Lcom/daaw/gr2;->e:J

    iput-wide v0, p0, Lcom/daaw/gr2;->f:J

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/media/AudioTrack;->getSampleRate()I

    move-result p1

    iput p1, p0, Lcom/daaw/gr2;->c:I

    :cond_0
    return-void
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
