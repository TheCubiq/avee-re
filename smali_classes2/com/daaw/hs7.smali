.class public final synthetic Lcom/daaw/hs7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/p28;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/p28;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hs7;->p:Lcom/daaw/p28;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/hs7;->p:Lcom/daaw/p28;

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    iget-object v1, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v1

    iget-object v1, v1, Lcom/daaw/l36;->s:Lcom/daaw/qw5;

    invoke-virtual {v1}, Lcom/daaw/qw5;->b()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v1

    iget-object v1, v1, Lcom/daaw/l36;->t:Lcom/daaw/xy5;

    invoke-virtual {v1}, Lcom/daaw/xy5;->a()J

    move-result-wide v1

    iget-object v3, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v3}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v3

    iget-object v3, v3, Lcom/daaw/l36;->t:Lcom/daaw/xy5;

    const-wide/16 v4, 0x1

    add-long/2addr v4, v1

    invoke-virtual {v3, v4, v5}, Lcom/daaw/xy5;->b(J)V

    iget-object v3, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v3}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    const-wide/16 v3, 0x5

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    iget-object v1, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object v1

    const-string v2, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."

    invoke-virtual {v1, v2}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/l36;->s:Lcom/daaw/qw5;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/qw5;->a(Z)V

    return-void

    :cond_0
    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->h()V

    return-void

    :cond_1
    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object v0

    const-string v1, "Deferred Deep Link already retrieved. Not fetching again."

    invoke-virtual {v0, v1}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    return-void
.end method
