.class public final Lcom/daaw/i86;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/g86;


# direct methods
.method public constructor <init>(Lcom/daaw/g86;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/i86;->a:Lcom/daaw/g86;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    const/4 v0, 0x0

    invoke-static {p1, v0, v0}, Lcom/daaw/dr6;->H(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzcl;Ljava/lang/Long;)Lcom/daaw/dr6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v1

    if-nez p2, :cond_0

    invoke-virtual {v1}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object p1

    const-string p2, "Receiver called with null intent"

    invoke-virtual {p1, p2}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/dr6;->a()Lcom/daaw/b52;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v0

    const-string v2, "Local receiver got"

    invoke-virtual {v0, v2, p2}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "com.google.android.gms.measurement.UPLOAD"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    const-string v2, "com.google.android.gms.measurement.AppMeasurementService"

    invoke-virtual {p2, p1, v2}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v1}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v0

    const-string v1, "Starting wakeful intent."

    invoke-virtual {v0, v1}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/i86;->a:Lcom/daaw/g86;

    invoke-interface {v0, p1, p2}, Lcom/daaw/g86;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void

    :cond_1
    const-string p1, "com.android.vending.INSTALL_REFERRER"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object p1

    const-string p2, "Install Referrer Broadcasts are deprecated"

    invoke-virtual {p1, p2}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
