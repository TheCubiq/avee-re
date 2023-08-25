.class public Lcom/daaw/bo;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/yc0;

.field public final b:Landroid/content/ComponentName;

.field public final c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/daaw/yc0;Landroid/content/ComponentName;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bo;->a:Lcom/daaw/yc0;

    iput-object p2, p0, Lcom/daaw/bo;->b:Landroid/content/ComponentName;

    iput-object p3, p0, Lcom/daaw/bo;->c:Landroid/content/Context;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/do;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/daaw/do;->b(Landroid/content/Context;)V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.support.customtabs.action.CustomTabsService"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    const/16 p1, 0x21

    invoke-virtual {p0, v0, p2, p1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final b(Lcom/daaw/ao;)Lcom/daaw/xc0$a;
    .locals 1

    new-instance v0, Lcom/daaw/bo$a;

    invoke-direct {v0, p0, p1}, Lcom/daaw/bo$a;-><init>(Lcom/daaw/bo;Lcom/daaw/ao;)V

    return-object v0
.end method

.method public c(Lcom/daaw/ao;)Lcom/daaw/eo;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/bo;->d(Lcom/daaw/ao;Landroid/app/PendingIntent;)Lcom/daaw/eo;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lcom/daaw/ao;Landroid/app/PendingIntent;)Lcom/daaw/eo;
    .locals 3

    invoke-virtual {p0, p1}, Lcom/daaw/bo;->b(Lcom/daaw/ao;)Lcom/daaw/xc0$a;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    :try_start_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "android.support.customtabs.extra.SESSION_ID"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v2, p0, Lcom/daaw/bo;->a:Lcom/daaw/yc0;

    invoke-interface {v2, p1, v1}, Lcom/daaw/yc0;->h2(Lcom/daaw/xc0;Landroid/os/Bundle;)Z

    move-result v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/bo;->a:Lcom/daaw/yc0;

    invoke-interface {v1, p1}, Lcom/daaw/yc0;->o0(Lcom/daaw/xc0;)Z

    move-result v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    if-nez v1, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Lcom/daaw/eo;

    iget-object v1, p0, Lcom/daaw/bo;->a:Lcom/daaw/yc0;

    iget-object v2, p0, Lcom/daaw/bo;->b:Landroid/content/ComponentName;

    invoke-direct {v0, v1, p1, v2, p2}, Lcom/daaw/eo;-><init>(Lcom/daaw/yc0;Lcom/daaw/xc0;Landroid/content/ComponentName;Landroid/app/PendingIntent;)V

    :catch_0
    return-object v0
.end method

.method public e(J)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/bo;->a:Lcom/daaw/yc0;

    invoke-interface {v0, p1, p2}, Lcom/daaw/yc0;->e1(J)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method
