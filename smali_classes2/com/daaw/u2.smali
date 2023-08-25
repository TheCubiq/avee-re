.class public Lcom/daaw/u2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/es<",
            "Lcom/daaw/p2;",
            ">;"
        }
    .end annotation
.end field

.field public volatile b:Lcom/daaw/v2;

.field public volatile c:Lcom/daaw/pc;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/oc;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/es;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/es<",
            "Lcom/daaw/p2;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/daaw/tt;

    invoke-direct {v0}, Lcom/daaw/tt;-><init>()V

    new-instance v1, Lcom/daaw/gp1;

    invoke-direct {v1}, Lcom/daaw/gp1;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Lcom/daaw/u2;-><init>(Lcom/daaw/es;Lcom/daaw/pc;Lcom/daaw/v2;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/es;Lcom/daaw/pc;Lcom/daaw/v2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/es<",
            "Lcom/daaw/p2;",
            ">;",
            "Lcom/daaw/pc;",
            "Lcom/daaw/v2;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/u2;->a:Lcom/daaw/es;

    iput-object p2, p0, Lcom/daaw/u2;->c:Lcom/daaw/pc;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/u2;->d:Ljava/util/List;

    iput-object p3, p0, Lcom/daaw/u2;->b:Lcom/daaw/v2;

    invoke-virtual {p0}, Lcom/daaw/u2;->f()V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/u2;Lcom/daaw/b01;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/u2;->i(Lcom/daaw/b01;)V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/u2;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/u2;->g(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic c(Lcom/daaw/u2;Lcom/daaw/oc;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/u2;->h(Lcom/daaw/oc;)V

    return-void
.end method

.method private synthetic g(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/u2;->b:Lcom/daaw/v2;

    invoke-interface {v0, p1, p2}, Lcom/daaw/v2;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method private synthetic h(Lcom/daaw/oc;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/u2;->c:Lcom/daaw/pc;

    instance-of v0, v0, Lcom/daaw/tt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/u2;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Lcom/daaw/u2;->c:Lcom/daaw/pc;

    invoke-interface {v0, p1}, Lcom/daaw/pc;->a(Lcom/daaw/oc;)V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private synthetic i(Lcom/daaw/b01;)V
    .locals 5

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "AnalyticsConnector now available."

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/daaw/b01;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/p2;

    new-instance v0, Lcom/daaw/jm;

    invoke-direct {v0, p1}, Lcom/daaw/jm;-><init>(Lcom/daaw/p2;)V

    new-instance v1, Lcom/daaw/yl;

    invoke-direct {v1}, Lcom/daaw/yl;-><init>()V

    invoke-static {p1, v1}, Lcom/daaw/u2;->j(Lcom/daaw/p2;Lcom/daaw/yl;)Lcom/daaw/p2$a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    const-string v2, "Registered Firebase Analytics listener."

    invoke-virtual {p1, v2}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/nc;

    invoke-direct {p1}, Lcom/daaw/nc;-><init>()V

    new-instance v2, Lcom/daaw/hc;

    const/16 v3, 0x1f4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v2, v0, v3, v4}, Lcom/daaw/hc;-><init>(Lcom/daaw/jm;ILjava/util/concurrent/TimeUnit;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/u2;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/oc;

    invoke-virtual {p1, v3}, Lcom/daaw/nc;->a(Lcom/daaw/oc;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1}, Lcom/daaw/yl;->d(Lcom/daaw/w2;)V

    invoke-virtual {v1, v2}, Lcom/daaw/yl;->e(Lcom/daaw/w2;)V

    iput-object p1, p0, Lcom/daaw/u2;->c:Lcom/daaw/pc;

    iput-object v2, p0, Lcom/daaw/u2;->b:Lcom/daaw/v2;

    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    const-string v0, "Could not register Firebase Analytics listener; a listener is already registered."

    invoke-virtual {p1, v0}, Lcom/daaw/ml0;->k(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public static j(Lcom/daaw/p2;Lcom/daaw/yl;)Lcom/daaw/p2$a;
    .locals 2

    const-string v0, "clx"

    invoke-interface {p0, v0, p1}, Lcom/daaw/p2;->a(Ljava/lang/String;Lcom/daaw/p2$b;)Lcom/daaw/p2$a;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "Could not register AnalyticsConnectorListener with Crashlytics origin."

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    const-string v0, "crash"

    invoke-interface {p0, v0, p1}, Lcom/daaw/p2;->a(Ljava/lang/String;Lcom/daaw/p2$b;)Lcom/daaw/p2$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p0

    const-string p1, "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."

    invoke-virtual {p0, p1}, Lcom/daaw/ml0;->k(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public d()Lcom/daaw/v2;
    .locals 1

    new-instance v0, Lcom/daaw/r2;

    invoke-direct {v0, p0}, Lcom/daaw/r2;-><init>(Lcom/daaw/u2;)V

    return-object v0
.end method

.method public e()Lcom/daaw/pc;
    .locals 1

    new-instance v0, Lcom/daaw/s2;

    invoke-direct {v0, p0}, Lcom/daaw/s2;-><init>(Lcom/daaw/u2;)V

    return-object v0
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/u2;->a:Lcom/daaw/es;

    new-instance v1, Lcom/daaw/t2;

    invoke-direct {v1, p0}, Lcom/daaw/t2;-><init>(Lcom/daaw/u2;)V

    invoke-interface {v0, v1}, Lcom/daaw/es;->a(Lcom/daaw/es$a;)V

    return-void
.end method
