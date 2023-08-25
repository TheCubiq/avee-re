.class public final Lcom/daaw/ca8;
.super Lcom/daaw/c86;
.source ""


# instance fields
.field public c:Landroid/os/Handler;

.field public final d:Lcom/daaw/z98;

.field public final e:Lcom/daaw/w98;

.field public final f:Lcom/daaw/h98;


# direct methods
.method public constructor <init>(Lcom/daaw/dr6;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/c86;-><init>(Lcom/daaw/dr6;)V

    new-instance p1, Lcom/daaw/z98;

    invoke-direct {p1, p0}, Lcom/daaw/z98;-><init>(Lcom/daaw/ca8;)V

    iput-object p1, p0, Lcom/daaw/ca8;->d:Lcom/daaw/z98;

    new-instance p1, Lcom/daaw/w98;

    invoke-direct {p1, p0}, Lcom/daaw/w98;-><init>(Lcom/daaw/ca8;)V

    iput-object p1, p0, Lcom/daaw/ca8;->e:Lcom/daaw/w98;

    new-instance p1, Lcom/daaw/h98;

    invoke-direct {p1, p0}, Lcom/daaw/h98;-><init>(Lcom/daaw/ca8;)V

    iput-object p1, p0, Lcom/daaw/ca8;->f:Lcom/daaw/h98;

    return-void
.end method

.method public static bridge synthetic n(Lcom/daaw/ca8;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ca8;->c:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic o(Lcom/daaw/ca8;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/ca8;->s()V

    return-void
.end method

.method public static bridge synthetic p(Lcom/daaw/ca8;J)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0}, Lcom/daaw/ca8;->s()V

    iget-object v0, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Activity paused, time"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/ca8;->f:Lcom/daaw/h98;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/h98;->a(J)V

    iget-object v0, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/qa2;->D()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/daaw/ca8;->e:Lcom/daaw/w98;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/w98;->b(J)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic q(Lcom/daaw/ca8;J)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0}, Lcom/daaw/ca8;->s()V

    iget-object v0, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Activity resumed, time"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/qa2;->D()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/l36;->r:Lcom/daaw/qw5;

    invoke-virtual {v0}, Lcom/daaw/qw5;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/ca8;->e:Lcom/daaw/w98;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/w98;->c(J)V

    :cond_1
    iget-object p1, p0, Lcom/daaw/ca8;->f:Lcom/daaw/h98;

    invoke-virtual {p1}, Lcom/daaw/h98;->b()V

    iget-object p0, p0, Lcom/daaw/ca8;->d:Lcom/daaw/z98;

    iget-object p1, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    invoke-virtual {p1}, Lcom/daaw/rc7;->f()V

    iget-object p1, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object p1, p1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->n()Z

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    iget-object p1, p0, Lcom/daaw/z98;->a:Lcom/daaw/ca8;

    iget-object p1, p1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->b()Lcom/daaw/ag;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/ag;->a()J

    move-result-wide p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/z98;->b(JZ)V

    return-void
.end method


# virtual methods
.method public final m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final s()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    iget-object v0, p0, Lcom/daaw/ca8;->c:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/np3;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/np3;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/daaw/ca8;->c:Landroid/os/Handler;

    :cond_0
    return-void
.end method
