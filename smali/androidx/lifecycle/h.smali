.class public Landroidx/lifecycle/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sj0;


# static fields
.field public static final x:Landroidx/lifecycle/h;


# instance fields
.field public p:I

.field public q:I

.field public r:Z

.field public s:Z

.field public t:Landroid/os/Handler;

.field public final u:Landroidx/lifecycle/e;

.field public v:Ljava/lang/Runnable;

.field public w:Landroidx/lifecycle/i$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/h;

    invoke-direct {v0}, Landroidx/lifecycle/h;-><init>()V

    sput-object v0, Landroidx/lifecycle/h;->x:Landroidx/lifecycle/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/lifecycle/h;->p:I

    iput v0, p0, Landroidx/lifecycle/h;->q:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/h;->r:Z

    iput-boolean v0, p0, Landroidx/lifecycle/h;->s:Z

    new-instance v0, Landroidx/lifecycle/e;

    invoke-direct {v0, p0}, Landroidx/lifecycle/e;-><init>(Lcom/daaw/sj0;)V

    iput-object v0, p0, Landroidx/lifecycle/h;->u:Landroidx/lifecycle/e;

    new-instance v0, Landroidx/lifecycle/h$a;

    invoke-direct {v0, p0}, Landroidx/lifecycle/h$a;-><init>(Landroidx/lifecycle/h;)V

    iput-object v0, p0, Landroidx/lifecycle/h;->v:Ljava/lang/Runnable;

    new-instance v0, Landroidx/lifecycle/h$b;

    invoke-direct {v0, p0}, Landroidx/lifecycle/h$b;-><init>(Landroidx/lifecycle/h;)V

    iput-object v0, p0, Landroidx/lifecycle/h;->w:Landroidx/lifecycle/i$a;

    return-void
.end method

.method public static k()Lcom/daaw/sj0;
    .locals 1

    sget-object v0, Landroidx/lifecycle/h;->x:Landroidx/lifecycle/h;

    return-object v0
.end method

.method public static l(Landroid/content/Context;)V
    .locals 1

    sget-object v0, Landroidx/lifecycle/h;->x:Landroidx/lifecycle/h;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/h;->g(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/c;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/h;->u:Landroidx/lifecycle/e;

    return-object v0
.end method

.method public b()V
    .locals 4

    iget v0, p0, Landroidx/lifecycle/h;->q:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/lifecycle/h;->q:I

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/h;->t:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/lifecycle/h;->v:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2bc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/h;->q:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/h;->q:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Landroidx/lifecycle/h;->r:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/h;->u:Landroidx/lifecycle/e;

    sget-object v1, Landroidx/lifecycle/c$b;->ON_RESUME:Landroidx/lifecycle/c$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/c$b;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/h;->r:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/h;->t:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/lifecycle/h;->v:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public e()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/h;->p:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/h;->p:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Landroidx/lifecycle/h;->s:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/h;->u:Landroidx/lifecycle/e;

    sget-object v1, Landroidx/lifecycle/c$b;->ON_START:Landroidx/lifecycle/c$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/c$b;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/h;->s:Z

    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    iget v0, p0, Landroidx/lifecycle/h;->p:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/lifecycle/h;->p:I

    invoke-virtual {p0}, Landroidx/lifecycle/h;->j()V

    return-void
.end method

.method public g(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/h;->t:Landroid/os/Handler;

    iget-object v0, p0, Landroidx/lifecycle/h;->u:Landroidx/lifecycle/e;

    sget-object v1, Landroidx/lifecycle/c$b;->ON_CREATE:Landroidx/lifecycle/c$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/c$b;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    new-instance v0, Landroidx/lifecycle/h$c;

    invoke-direct {v0, p0}, Landroidx/lifecycle/h$c;-><init>(Landroidx/lifecycle/h;)V

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public h()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/h;->q:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/h;->r:Z

    iget-object v0, p0, Landroidx/lifecycle/h;->u:Landroidx/lifecycle/e;

    sget-object v1, Landroidx/lifecycle/c$b;->ON_PAUSE:Landroidx/lifecycle/c$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/c$b;)V

    :cond_0
    return-void
.end method

.method public j()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/h;->p:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/lifecycle/h;->r:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/h;->u:Landroidx/lifecycle/e;

    sget-object v1, Landroidx/lifecycle/c$b;->ON_STOP:Landroidx/lifecycle/c$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/c$b;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/h;->s:Z

    :cond_0
    return-void
.end method
