.class public Lcom/daaw/gx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/lx$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/gx$c;,
        Lcom/daaw/gx$b;
    }
.end annotation


# static fields
.field public static final q:Lcom/daaw/gx$b;

.field public static final r:Landroid/os/Handler;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/b51;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/gx$b;

.field public final c:Lcom/daaw/hx;

.field public final d:Lcom/daaw/hi0;

.field public final e:Ljava/util/concurrent/ExecutorService;

.field public final f:Ljava/util/concurrent/ExecutorService;

.field public final g:Z

.field public h:Z

.field public i:Lcom/daaw/z41;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/z41<",
            "*>;"
        }
    .end annotation
.end field

.field public j:Z

.field public k:Ljava/lang/Exception;

.field public l:Z

.field public m:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/daaw/b51;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lcom/daaw/lx;

.field public o:Lcom/daaw/kx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/kx<",
            "*>;"
        }
    .end annotation
.end field

.field public volatile p:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/daaw/gx$b;

    invoke-direct {v0}, Lcom/daaw/gx$b;-><init>()V

    sput-object v0, Lcom/daaw/gx;->q:Lcom/daaw/gx$b;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/daaw/gx$c;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/daaw/gx$c;-><init>(Lcom/daaw/gx$a;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    sput-object v0, Lcom/daaw/gx;->r:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/hi0;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;ZLcom/daaw/hx;)V
    .locals 7

    sget-object v6, Lcom/daaw/gx;->q:Lcom/daaw/gx$b;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/daaw/gx;-><init>(Lcom/daaw/hi0;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;ZLcom/daaw/hx;Lcom/daaw/gx$b;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/hi0;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;ZLcom/daaw/hx;Lcom/daaw/gx$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/gx;->a:Ljava/util/List;

    iput-object p1, p0, Lcom/daaw/gx;->d:Lcom/daaw/hi0;

    iput-object p2, p0, Lcom/daaw/gx;->e:Ljava/util/concurrent/ExecutorService;

    iput-object p3, p0, Lcom/daaw/gx;->f:Ljava/util/concurrent/ExecutorService;

    iput-boolean p4, p0, Lcom/daaw/gx;->g:Z

    iput-object p5, p0, Lcom/daaw/gx;->c:Lcom/daaw/hx;

    iput-object p6, p0, Lcom/daaw/gx;->b:Lcom/daaw/gx$b;

    return-void
.end method

.method public static synthetic b(Lcom/daaw/gx;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/gx;->j()V

    return-void
.end method

.method public static synthetic c(Lcom/daaw/gx;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/gx;->i()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 1

    iput-object p1, p0, Lcom/daaw/gx;->k:Ljava/lang/Exception;

    sget-object p1, Lcom/daaw/gx;->r:Landroid/os/Handler;

    const/4 v0, 0x2

    invoke-virtual {p1, v0, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public d(Lcom/daaw/z41;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/gx;->i:Lcom/daaw/z41;

    sget-object p1, Lcom/daaw/gx;->r:Landroid/os/Handler;

    const/4 v0, 0x1

    invoke-virtual {p1, v0, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public e(Lcom/daaw/b51;)V
    .locals 1

    invoke-static {}, Lcom/daaw/tq1;->b()V

    iget-boolean v0, p0, Lcom/daaw/gx;->j:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/gx;->o:Lcom/daaw/kx;

    invoke-interface {p1, v0}, Lcom/daaw/b51;->d(Lcom/daaw/z41;)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/gx;->l:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/gx;->k:Ljava/lang/Exception;

    invoke-interface {p1, v0}, Lcom/daaw/b51;->a(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/gx;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public final f(Lcom/daaw/b51;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/gx;->m:Ljava/util/Set;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/daaw/gx;->m:Ljava/util/Set;

    :cond_0
    iget-object v0, p0, Lcom/daaw/gx;->m:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/gx;->l:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/daaw/gx;->j:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/daaw/gx;->h:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/gx;->n:Lcom/daaw/lx;

    invoke-virtual {v0}, Lcom/daaw/lx;->b()V

    iget-object v0, p0, Lcom/daaw/gx;->p:Ljava/util/concurrent/Future;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_1
    iput-boolean v1, p0, Lcom/daaw/gx;->h:Z

    iget-object v0, p0, Lcom/daaw/gx;->c:Lcom/daaw/hx;

    iget-object v1, p0, Lcom/daaw/gx;->d:Lcom/daaw/hi0;

    invoke-interface {v0, p0, v1}, Lcom/daaw/hx;->b(Lcom/daaw/gx;Lcom/daaw/hi0;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public h(Lcom/daaw/lx;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/gx;->f:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/gx;->p:Ljava/util/concurrent/Future;

    return-void
.end method

.method public final i()V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/gx;->h:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/gx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/gx;->l:Z

    iget-object v0, p0, Lcom/daaw/gx;->c:Lcom/daaw/hx;

    iget-object v1, p0, Lcom/daaw/gx;->d:Lcom/daaw/hi0;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/daaw/hx;->a(Lcom/daaw/hi0;Lcom/daaw/kx;)V

    iget-object v0, p0, Lcom/daaw/gx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/b51;

    invoke-virtual {p0, v1}, Lcom/daaw/gx;->k(Lcom/daaw/b51;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/daaw/gx;->k:Ljava/lang/Exception;

    invoke-interface {v1, v2}, Lcom/daaw/b51;->a(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Received an exception without any callbacks to notify"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public final j()V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/gx;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/gx;->i:Lcom/daaw/z41;

    invoke-interface {v0}, Lcom/daaw/z41;->c()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/gx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/gx;->b:Lcom/daaw/gx$b;

    iget-object v1, p0, Lcom/daaw/gx;->i:Lcom/daaw/z41;

    iget-boolean v2, p0, Lcom/daaw/gx;->g:Z

    invoke-virtual {v0, v1, v2}, Lcom/daaw/gx$b;->a(Lcom/daaw/z41;Z)Lcom/daaw/kx;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gx;->o:Lcom/daaw/kx;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/gx;->j:Z

    invoke-virtual {v0}, Lcom/daaw/kx;->b()V

    iget-object v0, p0, Lcom/daaw/gx;->c:Lcom/daaw/hx;

    iget-object v1, p0, Lcom/daaw/gx;->d:Lcom/daaw/hi0;

    iget-object v2, p0, Lcom/daaw/gx;->o:Lcom/daaw/kx;

    invoke-interface {v0, v1, v2}, Lcom/daaw/hx;->a(Lcom/daaw/hi0;Lcom/daaw/kx;)V

    iget-object v0, p0, Lcom/daaw/gx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/b51;

    invoke-virtual {p0, v1}, Lcom/daaw/gx;->k(Lcom/daaw/b51;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/daaw/gx;->o:Lcom/daaw/kx;

    invoke-virtual {v2}, Lcom/daaw/kx;->b()V

    iget-object v2, p0, Lcom/daaw/gx;->o:Lcom/daaw/kx;

    invoke-interface {v1, v2}, Lcom/daaw/b51;->d(Lcom/daaw/z41;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/gx;->o:Lcom/daaw/kx;

    invoke-virtual {v0}, Lcom/daaw/kx;->e()V

    return-void

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Received a resource without any callbacks to notify"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public final k(Lcom/daaw/b51;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/gx;->m:Ljava/util/Set;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public l(Lcom/daaw/b51;)V
    .locals 1

    invoke-static {}, Lcom/daaw/tq1;->b()V

    iget-boolean v0, p0, Lcom/daaw/gx;->j:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/gx;->l:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/gx;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/daaw/gx;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/daaw/gx;->g()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lcom/daaw/gx;->f(Lcom/daaw/b51;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public m(Lcom/daaw/lx;)V
    .locals 1

    iput-object p1, p0, Lcom/daaw/gx;->n:Lcom/daaw/lx;

    iget-object v0, p0, Lcom/daaw/gx;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/gx;->p:Ljava/util/concurrent/Future;

    return-void
.end method
