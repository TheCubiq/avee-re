.class public final Lcom/daaw/ow6;
.super Lcom/daaw/ax6;
.source ""


# instance fields
.field public final p:Lcom/daaw/uw6;

.field public final synthetic q:Lcom/daaw/pw6;


# direct methods
.method public constructor <init>(Lcom/daaw/pw6;Lcom/daaw/uw6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ow6;->q:Lcom/daaw/pw6;

    invoke-direct {p0}, Lcom/daaw/ax6;-><init>()V

    iput-object p2, p0, Lcom/daaw/ow6;->p:Lcom/daaw/uw6;

    return-void
.end method


# virtual methods
.method public final R1(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "statusCode"

    const/16 v1, 0x1fd6

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const-string v1, "sessionToken"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/daaw/tw6;->c()Lcom/daaw/sw6;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/sw6;->b(I)Lcom/daaw/sw6;

    if-eqz p1, :cond_0

    invoke-virtual {v1, p1}, Lcom/daaw/sw6;->a(Ljava/lang/String;)Lcom/daaw/sw6;

    :cond_0
    iget-object p1, p0, Lcom/daaw/ow6;->p:Lcom/daaw/uw6;

    invoke-virtual {v1}, Lcom/daaw/sw6;->c()Lcom/daaw/tw6;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/daaw/uw6;->a(Lcom/daaw/tw6;)V

    const/16 p1, 0x1fdd

    if-ne v0, p1, :cond_1

    iget-object p1, p0, Lcom/daaw/ow6;->q:Lcom/daaw/pw6;

    invoke-virtual {p1}, Lcom/daaw/pw6;->c()V

    :cond_1
    return-void
.end method
