.class public abstract Lcom/daaw/yh1;
.super Lcom/daaw/av0;
.source ""

# interfaces
.implements Lcom/daaw/th1;


# instance fields
.field public s:Lcom/daaw/th1;

.field public t:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/av0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 3

    iget-object v0, p0, Lcom/daaw/yh1;->s:Lcom/daaw/th1;

    iget-wide v1, p0, Lcom/daaw/yh1;->t:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lcom/daaw/th1;->a(J)I

    move-result p1

    return p1
.end method

.method public b(I)J
    .locals 4

    iget-object v0, p0, Lcom/daaw/yh1;->s:Lcom/daaw/th1;

    invoke-interface {v0, p1}, Lcom/daaw/th1;->b(I)J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/yh1;->t:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public c(J)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lcom/daaw/ln;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/yh1;->s:Lcom/daaw/th1;

    iget-wide v1, p0, Lcom/daaw/yh1;->t:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lcom/daaw/th1;->c(J)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/yh1;->s:Lcom/daaw/th1;

    invoke-interface {v0}, Lcom/daaw/th1;->d()I

    move-result v0

    return v0
.end method

.method public f()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/rc;->f()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/yh1;->s:Lcom/daaw/th1;

    return-void
.end method

.method public abstract m()V
.end method

.method public n(JLcom/daaw/th1;J)V
    .locals 2

    iput-wide p1, p0, Lcom/daaw/av0;->q:J

    iput-object p3, p0, Lcom/daaw/yh1;->s:Lcom/daaw/th1;

    const-wide v0, 0x7fffffffffffffffL

    cmp-long p3, p4, v0

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    move-wide p1, p4

    :goto_0
    iput-wide p1, p0, Lcom/daaw/yh1;->t:J

    return-void
.end method
