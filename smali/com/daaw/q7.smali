.class public final Lcom/daaw/q7;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/q7$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/q7$a;

.field public b:I

.field public c:J

.field public d:J

.field public e:J

.field public f:J


# direct methods
.method public constructor <init>(Landroid/media/AudioTrack;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    new-instance v0, Lcom/daaw/q7$a;

    invoke-direct {v0, p1}, Lcom/daaw/q7$a;-><init>(Landroid/media/AudioTrack;)V

    iput-object v0, p0, Lcom/daaw/q7;->a:Lcom/daaw/q7$a;

    invoke-virtual {p0}, Lcom/daaw/q7;->h()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/q7;->a:Lcom/daaw/q7$a;

    const/4 p1, 0x3

    invoke-virtual {p0, p1}, Lcom/daaw/q7;->i(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget v0, p0, Lcom/daaw/q7;->b:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/q7;->h()V

    :cond_0
    return-void
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/q7;->a:Lcom/daaw/q7$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/q7$a;->a()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, -0x1

    :goto_0
    return-wide v0
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/q7;->a:Lcom/daaw/q7$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/q7$a;->b()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    return-wide v0
.end method

.method public d()Z
    .locals 3

    iget v0, p0, Lcom/daaw/q7;->b:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public e()Z
    .locals 2

    iget v0, p0, Lcom/daaw/q7;->b:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f(J)Z
    .locals 7

    iget-object v0, p0, Lcom/daaw/q7;->a:Lcom/daaw/q7$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    iget-wide v2, p0, Lcom/daaw/q7;->e:J

    sub-long v2, p1, v2

    iget-wide v4, p0, Lcom/daaw/q7;->d:J

    cmp-long v6, v2, v4

    if-gez v6, :cond_0

    goto :goto_2

    :cond_0
    iput-wide p1, p0, Lcom/daaw/q7;->e:J

    invoke-virtual {v0}, Lcom/daaw/q7$a;->c()Z

    move-result v0

    iget v2, p0, Lcom/daaw/q7;->b:I

    const/4 v3, 0x3

    const/4 v4, 0x1

    if-eqz v2, :cond_6

    const/4 p1, 0x2

    if-eq v2, v4, :cond_4

    if-eq v2, p1, :cond_3

    if-eq v2, v3, :cond_2

    const/4 p1, 0x4

    if-ne v2, p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    if-eqz v0, :cond_8

    goto :goto_0

    :cond_3
    if-nez v0, :cond_8

    goto :goto_0

    :cond_4
    if-eqz v0, :cond_5

    iget-object p2, p0, Lcom/daaw/q7;->a:Lcom/daaw/q7$a;

    invoke-virtual {p2}, Lcom/daaw/q7$a;->a()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/daaw/q7;->f:J

    cmp-long p2, v1, v3

    if-lez p2, :cond_8

    invoke-virtual {p0, p1}, Lcom/daaw/q7;->i(I)V

    goto :goto_1

    :cond_5
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/q7;->h()V

    goto :goto_1

    :cond_6
    if-eqz v0, :cond_7

    iget-object p1, p0, Lcom/daaw/q7;->a:Lcom/daaw/q7$a;

    invoke-virtual {p1}, Lcom/daaw/q7$a;->b()J

    move-result-wide p1

    iget-wide v2, p0, Lcom/daaw/q7;->c:J

    cmp-long v5, p1, v2

    if-ltz v5, :cond_9

    iget-object p1, p0, Lcom/daaw/q7;->a:Lcom/daaw/q7$a;

    invoke-virtual {p1}, Lcom/daaw/q7$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/q7;->f:J

    invoke-virtual {p0, v4}, Lcom/daaw/q7;->i(I)V

    goto :goto_1

    :cond_7
    iget-wide v1, p0, Lcom/daaw/q7;->c:J

    sub-long/2addr p1, v1

    const-wide/32 v1, 0x7a120

    cmp-long v4, p1, v1

    if-lez v4, :cond_8

    invoke-virtual {p0, v3}, Lcom/daaw/q7;->i(I)V

    :cond_8
    :goto_1
    move v1, v0

    :cond_9
    :goto_2
    return v1
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/daaw/q7;->i(I)V

    return-void
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/q7;->a:Lcom/daaw/q7$a;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/q7;->i(I)V

    :cond_0
    return-void
.end method

.method public final i(I)V
    .locals 6

    iput p1, p0, Lcom/daaw/q7;->b:I

    const-wide/16 v0, 0x1388

    if-eqz p1, :cond_2

    const/4 v2, 0x1

    if-eq p1, v2, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    const-wide/32 v0, 0x7a120

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    const-wide/32 v0, 0x989680

    goto :goto_0

    :cond_2
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/daaw/q7;->e:J

    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/daaw/q7;->f:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    iput-wide v2, p0, Lcom/daaw/q7;->c:J

    :cond_3
    :goto_0
    iput-wide v0, p0, Lcom/daaw/q7;->d:J

    return-void
.end method
