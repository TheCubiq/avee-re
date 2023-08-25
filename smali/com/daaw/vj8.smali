.class public final Lcom/daaw/vj8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/tj8;

.field public b:I

.field public c:J

.field public d:J

.field public e:J

.field public f:J


# direct methods
.method public constructor <init>(Landroid/media/AudioTrack;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lcom/daaw/it5;->a:I

    new-instance v0, Lcom/daaw/tj8;

    invoke-direct {v0, p1}, Lcom/daaw/tj8;-><init>(Landroid/media/AudioTrack;)V

    iput-object v0, p0, Lcom/daaw/vj8;->a:Lcom/daaw/tj8;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/vj8;->h(I)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    iget-object v0, p0, Lcom/daaw/vj8;->a:Lcom/daaw/tj8;

    invoke-virtual {v0}, Lcom/daaw/tj8;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()J
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    iget-object v0, p0, Lcom/daaw/vj8;->a:Lcom/daaw/tj8;

    invoke-virtual {v0}, Lcom/daaw/tj8;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()V
    .locals 2

    iget v0, p0, Lcom/daaw/vj8;->b:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/vj8;->h(I)V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/daaw/vj8;->h(I)V

    return-void
.end method

.method public final e()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/vj8;->h(I)V

    return-void
.end method

.method public final f()Z
    .locals 2

    iget v0, p0, Lcom/daaw/vj8;->b:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g(J)Z
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    iget-object v0, p0, Lcom/daaw/vj8;->a:Lcom/daaw/tj8;

    iget-wide v1, p0, Lcom/daaw/vj8;->e:J

    sub-long v1, p1, v1

    iget-wide v3, p0, Lcom/daaw/vj8;->d:J

    const/4 v5, 0x0

    cmp-long v6, v1, v3

    if-gez v6, :cond_0

    return v5

    :cond_0
    iput-wide p1, p0, Lcom/daaw/vj8;->e:J

    invoke-virtual {v0}, Lcom/daaw/tj8;->c()Z

    move-result v0

    iget v1, p0, Lcom/daaw/vj8;->b:I

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eqz v1, :cond_8

    const/4 p1, 0x2

    if-eq v1, v3, :cond_5

    if-eq v1, p1, :cond_3

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v5}, Lcom/daaw/vj8;->h(I)V

    return v3

    :cond_3
    if-eqz v0, :cond_4

    const/4 v5, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {p0, v5}, Lcom/daaw/vj8;->h(I)V

    return v5

    :cond_5
    if-eqz v0, :cond_7

    iget-object p2, p0, Lcom/daaw/vj8;->a:Lcom/daaw/tj8;

    invoke-virtual {p2}, Lcom/daaw/tj8;->a()J

    move-result-wide v1

    iget-wide v4, p0, Lcom/daaw/vj8;->f:J

    cmp-long p2, v1, v4

    if-gtz p2, :cond_6

    goto :goto_0

    :cond_6
    invoke-virtual {p0, p1}, Lcom/daaw/vj8;->h(I)V

    return v3

    :cond_7
    invoke-virtual {p0, v5}, Lcom/daaw/vj8;->h(I)V

    goto :goto_0

    :cond_8
    if-eqz v0, :cond_a

    iget-object p1, p0, Lcom/daaw/vj8;->a:Lcom/daaw/tj8;

    invoke-virtual {p1}, Lcom/daaw/tj8;->b()J

    move-result-wide p1

    iget-wide v0, p0, Lcom/daaw/vj8;->c:J

    cmp-long v2, p1, v0

    if-gez v2, :cond_9

    goto :goto_1

    :cond_9
    iget-object p1, p0, Lcom/daaw/vj8;->a:Lcom/daaw/tj8;

    invoke-virtual {p1}, Lcom/daaw/tj8;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/vj8;->f:J

    invoke-virtual {p0, v3}, Lcom/daaw/vj8;->h(I)V

    return v3

    :cond_a
    iget-wide v3, p0, Lcom/daaw/vj8;->c:J

    sub-long/2addr p1, v3

    const-wide/32 v3, 0x7a120

    cmp-long v1, p1, v3

    if-gtz v1, :cond_b

    :goto_0
    move v5, v0

    :goto_1
    return v5

    :cond_b
    invoke-virtual {p0, v2}, Lcom/daaw/vj8;->h(I)V

    return v5
.end method

.method public final h(I)V
    .locals 6

    iput p1, p0, Lcom/daaw/vj8;->b:I

    const-wide/16 v0, 0x2710

    if-eqz p1, :cond_2

    const/4 v2, 0x1

    if-eq p1, v2, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const-wide/32 v0, 0x7a120

    :goto_0
    iput-wide v0, p0, Lcom/daaw/vj8;->d:J

    return-void

    :cond_0
    const-wide/32 v0, 0x989680

    goto :goto_0

    :cond_1
    iput-wide v0, p0, Lcom/daaw/vj8;->d:J

    return-void

    :cond_2
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/daaw/vj8;->e:J

    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/daaw/vj8;->f:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    iput-wide v2, p0, Lcom/daaw/vj8;->c:J

    goto :goto_0
.end method
