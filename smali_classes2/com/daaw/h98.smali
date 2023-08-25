.class public final Lcom/daaw/h98;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/e98;

.field public final synthetic b:Lcom/daaw/ca8;


# direct methods
.method public constructor <init>(Lcom/daaw/ca8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/h98;->b:Lcom/daaw/ca8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 7

    new-instance v6, Lcom/daaw/e98;

    iget-object v0, p0, Lcom/daaw/h98;->b:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->b()Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->a()J

    move-result-wide v2

    move-object v0, v6

    move-object v1, p0

    move-wide v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/daaw/e98;-><init>(Lcom/daaw/h98;JJ)V

    iput-object v6, p0, Lcom/daaw/h98;->a:Lcom/daaw/e98;

    iget-object p1, p0, Lcom/daaw/h98;->b:Lcom/daaw/ca8;

    invoke-static {p1}, Lcom/daaw/ca8;->n(Lcom/daaw/ca8;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/h98;->a:Lcom/daaw/e98;

    const-wide/16 v0, 0x7d0

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/h98;->b:Lcom/daaw/ca8;

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    iget-object v0, p0, Lcom/daaw/h98;->a:Lcom/daaw/e98;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/h98;->b:Lcom/daaw/ca8;

    invoke-static {v1}, Lcom/daaw/ca8;->n(Lcom/daaw/ca8;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/h98;->b:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/l36;->r:Lcom/daaw/qw5;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/qw5;->a(Z)V

    return-void
.end method
