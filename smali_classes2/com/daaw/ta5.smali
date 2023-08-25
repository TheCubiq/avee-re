.class public final Lcom/daaw/ta5;
.super Lcom/daaw/l75;
.source ""


# instance fields
.field public final synthetic t:Landroid/os/Bundle;

.field public final synthetic u:Landroid/app/Activity;

.field public final synthetic v:Lcom/daaw/dj5;


# direct methods
.method public constructor <init>(Lcom/daaw/dj5;Landroid/os/Bundle;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ta5;->v:Lcom/daaw/dj5;

    iput-object p2, p0, Lcom/daaw/ta5;->t:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/daaw/ta5;->u:Landroid/app/Activity;

    iget-object p1, p1, Lcom/daaw/dj5;->p:Lcom/daaw/gk5;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/daaw/l75;-><init>(Lcom/daaw/gk5;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/ta5;->t:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/daaw/ta5;->t:Landroid/os/Bundle;

    const-string v2, "com.google.app_measurement.screen_service"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/ta5;->t:Landroid/os/Bundle;

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Landroid/os/Bundle;

    if-eqz v3, :cond_1

    check-cast v1, Landroid/os/Bundle;

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/daaw/ta5;->v:Lcom/daaw/dj5;

    iget-object v1, v1, Lcom/daaw/dj5;->p:Lcom/daaw/gk5;

    invoke-static {v1}, Lcom/daaw/gk5;->s(Lcom/daaw/gk5;)Lcom/daaw/ju3;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ju3;

    iget-object v2, p0, Lcom/daaw/ta5;->u:Landroid/app/Activity;

    invoke-static {v2}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v2

    iget-wide v3, p0, Lcom/daaw/l75;->q:J

    invoke-interface {v1, v2, v0, v3, v4}, Lcom/daaw/ju3;->onActivityCreated(Lcom/daaw/yd0;Landroid/os/Bundle;J)V

    return-void
.end method
