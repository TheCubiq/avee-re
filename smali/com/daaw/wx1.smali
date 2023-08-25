.class public Lcom/daaw/wx1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final v:Ljava/lang/String;


# instance fields
.field public final p:Lcom/daaw/sb1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/sb1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Landroid/content/Context;

.field public final r:Lcom/daaw/qy1;

.field public final s:Landroidx/work/ListenableWorker;

.field public final t:Lcom/daaw/j30;

.field public final u:Lcom/daaw/wj1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkForegroundRunnable"

    invoke-static {v0}, Lcom/daaw/ll0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/wx1;->v:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/qy1;Landroidx/work/ListenableWorker;Lcom/daaw/j30;Lcom/daaw/wj1;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/daaw/sb1;->u()Lcom/daaw/sb1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/wx1;->p:Lcom/daaw/sb1;

    iput-object p1, p0, Lcom/daaw/wx1;->q:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/wx1;->r:Lcom/daaw/qy1;

    iput-object p3, p0, Lcom/daaw/wx1;->s:Landroidx/work/ListenableWorker;

    iput-object p4, p0, Lcom/daaw/wx1;->t:Lcom/daaw/j30;

    iput-object p5, p0, Lcom/daaw/wx1;->u:Lcom/daaw/wj1;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/fk0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/fk0<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/wx1;->p:Lcom/daaw/sb1;

    return-object v0
.end method

.method public run()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnsafeExperimentalUsageError"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/wx1;->r:Lcom/daaw/qy1;

    iget-boolean v0, v0, Lcom/daaw/qy1;->q:Z

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/daaw/xc;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/sb1;->u()Lcom/daaw/sb1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/wx1;->u:Lcom/daaw/wj1;

    invoke-interface {v1}, Lcom/daaw/wj1;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/daaw/wx1$a;

    invoke-direct {v2, p0, v0}, Lcom/daaw/wx1$a;-><init>(Lcom/daaw/wx1;Lcom/daaw/sb1;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance v1, Lcom/daaw/wx1$b;

    invoke-direct {v1, p0, v0}, Lcom/daaw/wx1$b;-><init>(Lcom/daaw/wx1;Lcom/daaw/sb1;)V

    iget-object v2, p0, Lcom/daaw/wx1;->u:Lcom/daaw/wj1;

    invoke-interface {v2}, Lcom/daaw/wj1;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/i;->d(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/wx1;->p:Lcom/daaw/sb1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/sb1;->q(Ljava/lang/Object;)Z

    return-void
.end method
