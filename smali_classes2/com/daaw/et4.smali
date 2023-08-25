.class public final Lcom/daaw/et4;
.super Lcom/daaw/l75;
.source ""


# instance fields
.field public final synthetic t:Landroid/os/Bundle;

.field public final synthetic u:Lcom/daaw/oq3;

.field public final synthetic v:Lcom/daaw/gk5;


# direct methods
.method public constructor <init>(Lcom/daaw/gk5;Landroid/os/Bundle;Lcom/daaw/oq3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/et4;->v:Lcom/daaw/gk5;

    iput-object p2, p0, Lcom/daaw/et4;->t:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/daaw/et4;->u:Lcom/daaw/oq3;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/daaw/l75;-><init>(Lcom/daaw/gk5;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/et4;->v:Lcom/daaw/gk5;

    invoke-static {v0}, Lcom/daaw/gk5;->s(Lcom/daaw/gk5;)Lcom/daaw/ju3;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ju3;

    iget-object v1, p0, Lcom/daaw/et4;->t:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/daaw/et4;->u:Lcom/daaw/oq3;

    iget-wide v3, p0, Lcom/daaw/l75;->p:J

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/daaw/ju3;->performAction(Landroid/os/Bundle;Lcom/daaw/ox3;J)V

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/et4;->u:Lcom/daaw/oq3;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/oq3;->T0(Landroid/os/Bundle;)V

    return-void
.end method
