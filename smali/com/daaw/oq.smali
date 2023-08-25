.class public Lcom/daaw/oq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/hj;


# instance fields
.field public final p:Landroid/content/Context;

.field public final q:Lcom/daaw/hj$a;

.field public r:Z

.field public s:Z

.field public final t:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/hj$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/oq$a;

    invoke-direct {v0, p0}, Lcom/daaw/oq$a;-><init>(Lcom/daaw/oq;)V

    iput-object v0, p0, Lcom/daaw/oq;->t:Landroid/content/BroadcastReceiver;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/oq;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/oq;->q:Lcom/daaw/hj$a;

    return-void
.end method

.method public static synthetic d(Lcom/daaw/oq;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/oq;->r:Z

    return p0
.end method

.method public static synthetic f(Lcom/daaw/oq;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/oq;->r:Z

    return p1
.end method

.method public static synthetic l(Lcom/daaw/oq;Landroid/content/Context;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/oq;->n(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method public static synthetic m(Lcom/daaw/oq;)Lcom/daaw/hj$a;
    .locals 0

    iget-object p0, p0, Lcom/daaw/oq;->q:Lcom/daaw/hj$a;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/oq;->o()V

    return-void
.end method

.method public h()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/oq;->p()V

    return-void
.end method

.method public final n(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final o()V
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/oq;->s:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/oq;->p:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/daaw/oq;->n(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/oq;->r:Z

    iget-object v0, p0, Lcom/daaw/oq;->p:Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/oq;->t:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/oq;->s:Z

    return-void
.end method

.method public onDestroy()V
    .locals 0

    return-void
.end method

.method public final p()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/oq;->s:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/oq;->p:Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/oq;->t:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/oq;->s:Z

    return-void
.end method
