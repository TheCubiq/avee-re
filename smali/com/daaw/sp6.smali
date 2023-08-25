.class public final Lcom/daaw/sp6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 2

    const-string v0, "Application Context cannot be null"

    invoke-static {p1, v0}, Lcom/daaw/fr6;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/daaw/sp6;->a:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/sp6;->a:Z

    invoke-static {}, Lcom/daaw/rq6;->b()Lcom/daaw/rq6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/rq6;->c(Landroid/content/Context;)V

    invoke-static {}, Lcom/daaw/mq6;->a()Lcom/daaw/mq6;

    move-result-object v0

    instance-of v1, p1, Landroid/app/Application;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Landroid/app/Application;

    invoke-virtual {v1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    :cond_0
    invoke-static {p1}, Lcom/daaw/br6;->g(Landroid/content/Context;)V

    invoke-static {}, Lcom/daaw/oq6;->b()Lcom/daaw/oq6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/oq6;->c(Landroid/content/Context;)V

    :cond_1
    return-void
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/sp6;->a:Z

    return v0
.end method
