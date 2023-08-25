.class public final Lcom/daaw/gf1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ao0;


# instance fields
.field public final p:Lcom/daaw/zf;

.field public q:Z

.field public r:J

.field public s:J

.field public t:Lcom/daaw/zw0;


# direct methods
.method public constructor <init>(Lcom/daaw/zf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gf1;->p:Lcom/daaw/zf;

    sget-object p1, Lcom/daaw/zw0;->e:Lcom/daaw/zw0;

    iput-object p1, p0, Lcom/daaw/gf1;->t:Lcom/daaw/zw0;

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/gf1;->r:J

    iget-boolean p1, p0, Lcom/daaw/gf1;->q:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/gf1;->p:Lcom/daaw/zf;

    invoke-interface {p1}, Lcom/daaw/zf;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/gf1;->s:J

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/gf1;->q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/gf1;->p:Lcom/daaw/zf;

    invoke-interface {v0}, Lcom/daaw/zf;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/gf1;->s:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/gf1;->q:Z

    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/gf1;->q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/gf1;->o()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/gf1;->a(J)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/gf1;->q:Z

    :cond_0
    return-void
.end method

.method public f(Lcom/daaw/zw0;)Lcom/daaw/zw0;
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/gf1;->q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/gf1;->o()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/gf1;->a(J)V

    :cond_0
    iput-object p1, p0, Lcom/daaw/gf1;->t:Lcom/daaw/zw0;

    return-object p1
.end method

.method public h()Lcom/daaw/zw0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gf1;->t:Lcom/daaw/zw0;

    return-object v0
.end method

.method public o()J
    .locals 7

    iget-wide v0, p0, Lcom/daaw/gf1;->r:J

    iget-boolean v2, p0, Lcom/daaw/gf1;->q:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/daaw/gf1;->p:Lcom/daaw/zf;

    invoke-interface {v2}, Lcom/daaw/zf;->b()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/daaw/gf1;->s:J

    sub-long/2addr v2, v4

    iget-object v4, p0, Lcom/daaw/gf1;->t:Lcom/daaw/zw0;

    iget v5, v4, Lcom/daaw/zw0;->a:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v5, v5, v6

    if-nez v5, :cond_0

    invoke-static {v2, v3}, Lcom/daaw/dd;->a(J)J

    move-result-wide v2

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v2, v3}, Lcom/daaw/zw0;->a(J)J

    move-result-wide v2

    :goto_0
    add-long/2addr v0, v2

    :cond_1
    return-wide v0
.end method
