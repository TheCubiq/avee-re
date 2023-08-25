.class public final synthetic Lcom/daaw/b98;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/e98;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/e98;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/b98;->p:Lcom/daaw/e98;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/b98;->p:Lcom/daaw/e98;

    iget-object v1, v0, Lcom/daaw/e98;->r:Lcom/daaw/h98;

    iget-wide v5, v0, Lcom/daaw/e98;->p:J

    iget-wide v2, v0, Lcom/daaw/e98;->q:J

    iget-object v0, v1, Lcom/daaw/h98;->b:Lcom/daaw/ca8;

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    iget-object v0, v1, Lcom/daaw/h98;->b:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object v0

    const-string v4, "Application going to the background"

    invoke-virtual {v0, v4}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    iget-object v0, v1, Lcom/daaw/h98;->b:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/l36;->r:Lcom/daaw/qw5;

    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Lcom/daaw/qw5;->a(Z)V

    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    iget-object v0, v1, Lcom/daaw/h98;->b:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/qa2;->D()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, v1, Lcom/daaw/h98;->b:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/ca8;->e:Lcom/daaw/w98;

    invoke-virtual {v0, v2, v3}, Lcom/daaw/w98;->b(J)V

    iget-object v0, v1, Lcom/daaw/h98;->b:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/ca8;->e:Lcom/daaw/w98;

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v4, v2, v3}, Lcom/daaw/w98;->d(ZZJ)Z

    :cond_0
    iget-object v0, v1, Lcom/daaw/h98;->b:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v2

    const-string v3, "auto"

    const-string v4, "_ab"

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/p28;->v(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    return-void
.end method
