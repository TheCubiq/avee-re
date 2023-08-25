.class public final Lcom/daaw/p84;
.super Lcom/daaw/l75;
.source ""


# instance fields
.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Lcom/daaw/oq3;

.field public final synthetic w:Lcom/daaw/gk5;


# direct methods
.method public constructor <init>(Lcom/daaw/gk5;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/oq3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/p84;->w:Lcom/daaw/gk5;

    iput-object p2, p0, Lcom/daaw/p84;->t:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/p84;->u:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/p84;->v:Lcom/daaw/oq3;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/daaw/l75;-><init>(Lcom/daaw/gk5;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/p84;->w:Lcom/daaw/gk5;

    invoke-static {v0}, Lcom/daaw/gk5;->s(Lcom/daaw/gk5;)Lcom/daaw/ju3;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ju3;

    iget-object v1, p0, Lcom/daaw/p84;->t:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/p84;->u:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/p84;->v:Lcom/daaw/oq3;

    invoke-interface {v0, v1, v2, v3}, Lcom/daaw/ju3;->getConditionalUserProperties(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/ox3;)V

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/p84;->v:Lcom/daaw/oq3;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/oq3;->T0(Landroid/os/Bundle;)V

    return-void
.end method
