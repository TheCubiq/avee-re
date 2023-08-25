.class public final Lcom/daaw/jj;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tq0$b;


# instance fields
.field public final a:J

.field public final b:I

.field public final c:J

.field public final d:I

.field public final e:J


# direct methods
.method public constructor <init>(JJLcom/daaw/yq0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p3, p0, Lcom/daaw/jj;->a:J

    iget v0, p5, Lcom/daaw/yq0;->c:I

    iput v0, p0, Lcom/daaw/jj;->b:I

    iget p5, p5, Lcom/daaw/yq0;->f:I

    iput p5, p0, Lcom/daaw/jj;->d:I

    const-wide/16 v0, -0x1

    cmp-long p5, p1, v0

    if-nez p5, :cond_0

    iput-wide v0, p0, Lcom/daaw/jj;->c:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_0

    :cond_0
    sub-long p3, p1, p3

    iput-wide p3, p0, Lcom/daaw/jj;->c:J

    invoke-virtual {p0, p1, p2}, Lcom/daaw/jj;->b(J)J

    move-result-wide p1

    :goto_0
    iput-wide p1, p0, Lcom/daaw/jj;->e:J

    return-void
.end method


# virtual methods
.method public b(J)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/jj;->a:J

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    const-wide/32 v0, 0xf4240

    mul-long p1, p1, v0

    const-wide/16 v0, 0x8

    mul-long p1, p1, v0

    iget v0, p0, Lcom/daaw/jj;->d:I

    int-to-long v0, v0

    div-long/2addr p1, v0

    return-wide p1
.end method

.method public e()Z
    .locals 5

    iget-wide v0, p0, Lcom/daaw/jj;->c:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g(J)Lcom/daaw/da1$a;
    .locals 13

    iget-wide v0, p0, Lcom/daaw/jj;->c:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    new-instance p1, Lcom/daaw/da1$a;

    new-instance p2, Lcom/daaw/fa1;

    const-wide/16 v0, 0x0

    iget-wide v2, p0, Lcom/daaw/jj;->a:J

    invoke-direct {p2, v0, v1, v2, v3}, Lcom/daaw/fa1;-><init>(JJ)V

    invoke-direct {p1, p2}, Lcom/daaw/da1$a;-><init>(Lcom/daaw/fa1;)V

    return-object p1

    :cond_0
    iget v2, p0, Lcom/daaw/jj;->d:I

    int-to-long v2, v2

    mul-long v2, v2, p1

    const-wide/32 v4, 0x7a1200

    div-long/2addr v2, v4

    iget v4, p0, Lcom/daaw/jj;->b:I

    int-to-long v5, v4

    div-long/2addr v2, v5

    int-to-long v5, v4

    mul-long v7, v2, v5

    const-wide/16 v9, 0x0

    int-to-long v2, v4

    sub-long v11, v0, v2

    invoke-static/range {v7 .. v12}, Lcom/daaw/sq1;->m(JJJ)J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/jj;->a:J

    add-long/2addr v2, v0

    invoke-virtual {p0, v2, v3}, Lcom/daaw/jj;->b(J)J

    move-result-wide v4

    new-instance v6, Lcom/daaw/fa1;

    invoke-direct {v6, v4, v5, v2, v3}, Lcom/daaw/fa1;-><init>(JJ)V

    cmp-long v7, v4, p1

    if-gez v7, :cond_2

    iget-wide p1, p0, Lcom/daaw/jj;->c:J

    iget v4, p0, Lcom/daaw/jj;->b:I

    int-to-long v7, v4

    sub-long/2addr p1, v7

    cmp-long v5, v0, p1

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    int-to-long p1, v4

    add-long/2addr v2, p1

    invoke-virtual {p0, v2, v3}, Lcom/daaw/jj;->b(J)J

    move-result-wide p1

    new-instance v0, Lcom/daaw/fa1;

    invoke-direct {v0, p1, p2, v2, v3}, Lcom/daaw/fa1;-><init>(JJ)V

    new-instance p1, Lcom/daaw/da1$a;

    invoke-direct {p1, v6, v0}, Lcom/daaw/da1$a;-><init>(Lcom/daaw/fa1;Lcom/daaw/fa1;)V

    return-object p1

    :cond_2
    :goto_0
    new-instance p1, Lcom/daaw/da1$a;

    invoke-direct {p1, v6}, Lcom/daaw/da1$a;-><init>(Lcom/daaw/fa1;)V

    return-object p1
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/jj;->e:J

    return-wide v0
.end method
