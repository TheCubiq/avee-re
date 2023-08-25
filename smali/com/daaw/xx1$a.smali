.class public Lcom/daaw/xx1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xx1;->a(Landroid/content/Context;Ljava/util/UUID;Lcom/daaw/g30;)Lcom/daaw/fk0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/sb1;

.field public final synthetic q:Ljava/util/UUID;

.field public final synthetic r:Lcom/daaw/g30;

.field public final synthetic s:Landroid/content/Context;

.field public final synthetic t:Lcom/daaw/xx1;


# direct methods
.method public constructor <init>(Lcom/daaw/xx1;Lcom/daaw/sb1;Ljava/util/UUID;Lcom/daaw/g30;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xx1$a;->t:Lcom/daaw/xx1;

    iput-object p2, p0, Lcom/daaw/xx1$a;->p:Lcom/daaw/sb1;

    iput-object p3, p0, Lcom/daaw/xx1$a;->q:Ljava/util/UUID;

    iput-object p4, p0, Lcom/daaw/xx1$a;->r:Lcom/daaw/g30;

    iput-object p5, p0, Lcom/daaw/xx1$a;->s:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/daaw/xx1$a;->p:Lcom/daaw/sb1;

    invoke-virtual {v0}, Lcom/daaw/i;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/xx1$a;->q:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/xx1$a;->t:Lcom/daaw/xx1;

    iget-object v1, v1, Lcom/daaw/xx1;->c:Lcom/daaw/ry1;

    invoke-interface {v1, v0}, Lcom/daaw/ry1;->l(Ljava/lang/String;)Lcom/daaw/yx1;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/daaw/yx1;->a()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/daaw/xx1$a;->t:Lcom/daaw/xx1;

    iget-object v1, v1, Lcom/daaw/xx1;->b:Lcom/daaw/i30;

    iget-object v2, p0, Lcom/daaw/xx1$a;->r:Lcom/daaw/g30;

    invoke-interface {v1, v0, v2}, Lcom/daaw/i30;->a(Ljava/lang/String;Lcom/daaw/g30;)V

    iget-object v1, p0, Lcom/daaw/xx1$a;->s:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/xx1$a;->r:Lcom/daaw/g30;

    invoke-static {v1, v0, v2}, Landroidx/work/impl/foreground/a;->a(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/g30;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/xx1$a;->s:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    :cond_0
    const-string v0, "Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/xx1$a;->p:Lcom/daaw/sb1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/sb1;->q(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/xx1$a;->p:Lcom/daaw/sb1;

    invoke-virtual {v1, v0}, Lcom/daaw/sb1;->r(Ljava/lang/Throwable;)Z

    :goto_1
    return-void
.end method
