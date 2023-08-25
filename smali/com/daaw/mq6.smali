.class public final Lcom/daaw/mq6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field public static final s:Lcom/daaw/mq6;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field


# instance fields
.field public p:Z

.field public q:Z

.field public r:Lcom/daaw/rq6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/mq6;

    invoke-direct {v0}, Lcom/daaw/mq6;-><init>()V

    sput-object v0, Lcom/daaw/mq6;->s:Lcom/daaw/mq6;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/mq6;
    .locals 1

    sget-object v0, Lcom/daaw/mq6;->s:Lcom/daaw/mq6;

    return-object v0
.end method


# virtual methods
.method public final b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/mq6;->p:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/mq6;->q:Z

    invoke-virtual {p0}, Lcom/daaw/mq6;->e()V

    return-void
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/mq6;->p:Z

    iput-boolean v0, p0, Lcom/daaw/mq6;->q:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/mq6;->r:Lcom/daaw/rq6;

    return-void
.end method

.method public final d(Lcom/daaw/rq6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/mq6;->r:Lcom/daaw/rq6;

    return-void
.end method

.method public final e()V
    .locals 7

    iget-boolean v0, p0, Lcom/daaw/mq6;->q:Z

    invoke-static {}, Lcom/daaw/lq6;->a()Lcom/daaw/lq6;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/lq6;->c()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/xp6;

    invoke-virtual {v2}, Lcom/daaw/xp6;->g()Lcom/daaw/xq6;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/xq6;->k()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    if-eq v3, v0, :cond_1

    const-string v4, "foregrounded"

    goto :goto_1

    :cond_1
    const-string v4, "backgrounded"

    :goto_1
    invoke-static {}, Lcom/daaw/qq6;->a()Lcom/daaw/qq6;

    move-result-object v5

    invoke-virtual {v2}, Lcom/daaw/xq6;->a()Landroid/webkit/WebView;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v4, v3, v6

    const-string v4, "setState"

    invoke-virtual {v5, v2, v4, v3}, Lcom/daaw/qq6;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final f(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/mq6;->q:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, Lcom/daaw/mq6;->q:Z

    iget-boolean v0, p0, Lcom/daaw/mq6;->p:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/mq6;->e()V

    iget-object v0, p0, Lcom/daaw/mq6;->r:Lcom/daaw/rq6;

    if-eqz v0, :cond_1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/daaw/pr6;->d()Lcom/daaw/pr6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/pr6;->i()V

    return-void

    :cond_0
    invoke-static {}, Lcom/daaw/pr6;->d()Lcom/daaw/pr6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/pr6;->h()V

    :cond_1
    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/mq6;->f(Z)V

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 6

    new-instance p1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    invoke-direct {p1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    invoke-static {p1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    iget p1, p1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    invoke-static {}, Lcom/daaw/lq6;->a()Lcom/daaw/lq6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/lq6;->b()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/xp6;

    invoke-virtual {v4}, Lcom/daaw/xp6;->j()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Lcom/daaw/xp6;->f()Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/view/View;->hasWindowFocus()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_1
    const/16 v0, 0x64

    if-eq p1, v0, :cond_2

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p0, v1}, Lcom/daaw/mq6;->f(Z)V

    return-void
.end method
