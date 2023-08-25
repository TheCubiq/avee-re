.class public final synthetic Lcom/daaw/yo7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/p28;

.field public final synthetic q:Landroid/os/Bundle;

.field public final synthetic r:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/p28;Landroid/os/Bundle;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yo7;->p:Lcom/daaw/p28;

    iput-object p2, p0, Lcom/daaw/yo7;->q:Landroid/os/Bundle;

    iput-wide p3, p0, Lcom/daaw/yo7;->r:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/yo7;->p:Lcom/daaw/p28;

    iget-object v1, p0, Lcom/daaw/yo7;->q:Landroid/os/Bundle;

    iget-wide v2, p0, Lcom/daaw/yo7;->r:J

    iget-object v4, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v4}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/xb5;->t()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Lcom/daaw/p28;->F(Landroid/os/Bundle;IJ)V

    return-void

    :cond_0
    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->x()Lcom/daaw/hk5;

    move-result-object v0

    const-string v1, "Using developer consent only; google app id found"

    invoke-virtual {v0, v1}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    return-void
.end method
