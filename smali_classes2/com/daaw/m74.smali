.class public final Lcom/daaw/m74;
.super Lcom/daaw/l75;
.source ""


# instance fields
.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Landroid/os/Bundle;

.field public final synthetic w:Lcom/daaw/gk5;


# direct methods
.method public constructor <init>(Lcom/daaw/gk5;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/m74;->w:Lcom/daaw/gk5;

    iput-object p2, p0, Lcom/daaw/m74;->t:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/m74;->u:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/m74;->v:Landroid/os/Bundle;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/daaw/l75;-><init>(Lcom/daaw/gk5;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/m74;->w:Lcom/daaw/gk5;

    invoke-static {v0}, Lcom/daaw/gk5;->s(Lcom/daaw/gk5;)Lcom/daaw/ju3;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ju3;

    iget-object v1, p0, Lcom/daaw/m74;->t:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/m74;->u:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/m74;->v:Landroid/os/Bundle;

    invoke-interface {v0, v1, v2, v3}, Lcom/daaw/ju3;->clearConditionalUserProperty(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
