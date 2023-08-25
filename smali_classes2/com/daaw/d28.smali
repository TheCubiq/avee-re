.class public final Lcom/daaw/d28;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Z

.field public final synthetic q:Lcom/daaw/p28;


# direct methods
.method public constructor <init>(Lcom/daaw/p28;Z)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/d28;->q:Lcom/daaw/p28;

    iput-boolean p2, p0, Lcom/daaw/d28;->p:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/d28;->q:Lcom/daaw/p28;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->n()Z

    move-result v0

    iget-object v1, p0, Lcom/daaw/d28;->q:Lcom/daaw/p28;

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->m()Z

    move-result v1

    iget-object v2, p0, Lcom/daaw/d28;->q:Lcom/daaw/p28;

    iget-object v2, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    iget-boolean v3, p0, Lcom/daaw/d28;->p:Z

    invoke-virtual {v2, v3}, Lcom/daaw/dr6;->j(Z)V

    iget-boolean v2, p0, Lcom/daaw/d28;->p:Z

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/daaw/d28;->q:Lcom/daaw/p28;

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v1

    iget-boolean v2, p0, Lcom/daaw/d28;->p:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "Default data collection state already set to"

    invoke-virtual {v1, v3, v2}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    iget-object v1, p0, Lcom/daaw/d28;->q:Lcom/daaw/p28;

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->n()Z

    move-result v1

    if-eq v1, v0, :cond_1

    iget-object v1, p0, Lcom/daaw/d28;->q:Lcom/daaw/p28;

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->n()Z

    move-result v1

    iget-object v2, p0, Lcom/daaw/d28;->q:Lcom/daaw/p28;

    iget-object v2, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->m()Z

    move-result v2

    if-eq v1, v2, :cond_2

    :cond_1
    iget-object v1, p0, Lcom/daaw/d28;->q:Lcom/daaw/p28;

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/om5;->x()Lcom/daaw/hk5;

    move-result-object v1

    iget-boolean v2, p0, Lcom/daaw/d28;->p:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v3, "Default data collection is different than actual status"

    invoke-virtual {v1, v3, v2, v0}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Lcom/daaw/d28;->q:Lcom/daaw/p28;

    invoke-static {v0}, Lcom/daaw/p28;->e0(Lcom/daaw/p28;)V

    return-void
.end method
