.class public final Lcom/daaw/c18;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ox3;

.field public final synthetic q:Lcom/daaw/p28;


# direct methods
.method public constructor <init>(Lcom/daaw/p28;Lcom/daaw/ox3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/c18;->q:Lcom/daaw/p28;

    iput-object p2, p0, Lcom/daaw/c18;->p:Lcom/daaw/ox3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/c18;->q:Lcom/daaw/p28;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->M()Lcom/daaw/ca8;

    move-result-object v0

    invoke-static {}, Lcom/daaw/tm8;->b()Z

    iget-object v1, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v1

    sget-object v2, Lcom/daaw/m75;->w0:Lcom/daaw/j65;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Lcom/daaw/qa2;->B(Ljava/lang/String;Lcom/daaw/j65;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/l36;->p()Lcom/daaw/cd2;

    move-result-object v1

    sget-object v2, Lcom/daaw/vb2;->r:Lcom/daaw/vb2;

    invoke-virtual {v1, v2}, Lcom/daaw/cd2;->i(Lcom/daaw/vb2;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->x()Lcom/daaw/hk5;

    move-result-object v0

    const-string v1, "Analytics storage consent denied; will not get session id"

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v1

    iget-object v2, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->b()Lcom/daaw/ag;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/ag;->a()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/daaw/l36;->v(J)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v1

    iget-object v1, v1, Lcom/daaw/l36;->p:Lcom/daaw/xy5;

    invoke-virtual {v1}, Lcom/daaw/xy5;->a()J

    move-result-wide v1

    const-wide/16 v4, 0x0

    cmp-long v6, v1, v4

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/l36;->p:Lcom/daaw/xy5;

    invoke-virtual {v0}, Lcom/daaw/xy5;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_2

    :cond_2
    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->x()Lcom/daaw/hk5;

    move-result-object v0

    const-string v1, "getSessionId has been disabled."

    :goto_0
    invoke-virtual {v0, v1}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    :cond_3
    :goto_1
    move-object v0, v3

    :goto_2
    if-eqz v0, :cond_4

    iget-object v1, p0, Lcom/daaw/c18;->q:Lcom/daaw/p28;

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/c18;->p:Lcom/daaw/ox3;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/dd8;->I(Lcom/daaw/ox3;J)V

    return-void

    :cond_4
    :try_start_0
    iget-object v0, p0, Lcom/daaw/c18;->p:Lcom/daaw/ox3;

    invoke-interface {v0, v3}, Lcom/daaw/ox3;->T0(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/c18;->q:Lcom/daaw/p28;

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v1

    const-string v2, "getSessionId failed with exception"

    invoke-virtual {v1, v2, v0}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
