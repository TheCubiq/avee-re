.class public final Lcom/daaw/w98;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:J

.field public b:J

.field public final c:Lcom/daaw/hl2;

.field public final synthetic d:Lcom/daaw/ca8;


# direct methods
.method public constructor <init>(Lcom/daaw/ca8;)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/w98;->d:Lcom/daaw/ca8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/k98;

    iget-object v1, p1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-direct {v0, p0, v1}, Lcom/daaw/k98;-><init>(Lcom/daaw/w98;Lcom/daaw/xe7;)V

    iput-object v0, p0, Lcom/daaw/w98;->c:Lcom/daaw/hl2;

    iget-object p1, p1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->b()Lcom/daaw/ag;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/ag;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/w98;->a:J

    iput-wide v0, p0, Lcom/daaw/w98;->b:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/w98;->c:Lcom/daaw/hl2;

    invoke-virtual {v0}, Lcom/daaw/hl2;->b()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/w98;->a:J

    iput-wide v0, p0, Lcom/daaw/w98;->b:J

    return-void
.end method

.method public final b(J)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/w98;->c:Lcom/daaw/hl2;

    invoke-virtual {p1}, Lcom/daaw/hl2;->b()V

    return-void
.end method

.method public final c(J)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/w98;->d:Lcom/daaw/ca8;

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    iget-object v0, p0, Lcom/daaw/w98;->c:Lcom/daaw/hl2;

    invoke-virtual {v0}, Lcom/daaw/hl2;->b()V

    iput-wide p1, p0, Lcom/daaw/w98;->a:J

    iput-wide p1, p0, Lcom/daaw/w98;->b:J

    return-void
.end method

.method public final d(ZZJ)Z
    .locals 4

    iget-object v0, p0, Lcom/daaw/w98;->d:Lcom/daaw/ca8;

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    iget-object v0, p0, Lcom/daaw/w98;->d:Lcom/daaw/ca8;

    invoke-virtual {v0}, Lcom/daaw/c86;->g()V

    invoke-static {}, Lcom/daaw/rk8;->b()Z

    iget-object v0, p0, Lcom/daaw/w98;->d:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v0

    sget-object v1, Lcom/daaw/m75;->f0:Lcom/daaw/j65;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/daaw/qa2;->B(Ljava/lang/String;Lcom/daaw/j65;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/w98;->d:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/w98;->d:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/l36;->o:Lcom/daaw/xy5;

    iget-object v1, p0, Lcom/daaw/w98;->d:Lcom/daaw/ca8;

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->b()Lcom/daaw/ag;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/ag;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/xy5;->b(J)V

    :cond_1
    iget-wide v0, p0, Lcom/daaw/w98;->a:J

    sub-long v0, p3, v0

    if-nez p1, :cond_3

    const-wide/16 v2, 0x3e8

    cmp-long p1, v0, v2

    if-ltz p1, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/daaw/w98;->d:Lcom/daaw/ca8;

    iget-object p1, p1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string p3, "Screen exposed for less than 1000 ms. Event not sent. time"

    invoke-virtual {p1, p3, p2}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_0
    if-nez p2, :cond_4

    iget-wide v0, p0, Lcom/daaw/w98;->b:J

    sub-long v0, p3, v0

    iput-wide p3, p0, Lcom/daaw/w98;->b:J

    :cond_4
    iget-object p1, p0, Lcom/daaw/w98;->d:Lcom/daaw/ca8;

    iget-object p1, p1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "Recording user engagement, ms"

    invoke-virtual {p1, v3, v2}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "_et"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-object v0, p0, Lcom/daaw/w98;->d:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/qa2;->D()Z

    move-result v0

    iget-object v1, p0, Lcom/daaw/w98;->d:Lcom/daaw/ca8;

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->K()Lcom/daaw/r48;

    move-result-object v1

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    invoke-virtual {v1, v0}, Lcom/daaw/r48;->s(Z)Lcom/daaw/t38;

    move-result-object v0

    invoke-static {v0, p1, v2}, Lcom/daaw/dd8;->y(Lcom/daaw/t38;Landroid/os/Bundle;Z)V

    if-nez p2, :cond_5

    iget-object p2, p0, Lcom/daaw/w98;->d:Lcom/daaw/ca8;

    iget-object p2, p2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p2

    const-string v0, "auto"

    const-string v1, "_e"

    invoke-virtual {p2, v0, v1, p1}, Lcom/daaw/p28;->u(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_5
    iput-wide p3, p0, Lcom/daaw/w98;->a:J

    iget-object p1, p0, Lcom/daaw/w98;->c:Lcom/daaw/hl2;

    invoke-virtual {p1}, Lcom/daaw/hl2;->b()V

    iget-object p1, p0, Lcom/daaw/w98;->c:Lcom/daaw/hl2;

    const-wide/32 p2, 0x36ee80

    invoke-virtual {p1, p2, p3}, Lcom/daaw/hl2;->d(J)V

    return v2
.end method
