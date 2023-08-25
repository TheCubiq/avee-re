.class public Landroidx/room/d;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public c:I

.field public final d:Landroidx/room/c;

.field public final e:Landroidx/room/c$c;

.field public f:Landroidx/room/b;

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:Landroidx/room/a;

.field public final i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final j:Landroid/content/ServiceConnection;

.field public final k:Ljava/lang/Runnable;

.field public final l:Ljava/lang/Runnable;

.field public final m:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroidx/room/c;Ljava/util/concurrent/Executor;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/room/d$a;

    invoke-direct {v0, p0}, Landroidx/room/d$a;-><init>(Landroidx/room/d;)V

    iput-object v0, p0, Landroidx/room/d;->h:Landroidx/room/a;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Landroidx/room/d;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Landroidx/room/d$b;

    invoke-direct {v0, p0}, Landroidx/room/d$b;-><init>(Landroidx/room/d;)V

    iput-object v0, p0, Landroidx/room/d;->j:Landroid/content/ServiceConnection;

    new-instance v2, Landroidx/room/d$c;

    invoke-direct {v2, p0}, Landroidx/room/d$c;-><init>(Landroidx/room/d;)V

    iput-object v2, p0, Landroidx/room/d;->k:Ljava/lang/Runnable;

    new-instance v2, Landroidx/room/d$d;

    invoke-direct {v2, p0}, Landroidx/room/d$d;-><init>(Landroidx/room/d;)V

    iput-object v2, p0, Landroidx/room/d;->l:Ljava/lang/Runnable;

    new-instance v2, Landroidx/room/d$e;

    invoke-direct {v2, p0}, Landroidx/room/d$e;-><init>(Landroidx/room/d;)V

    iput-object v2, p0, Landroidx/room/d;->m:Ljava/lang/Runnable;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/room/d;->a:Landroid/content/Context;

    iput-object p2, p0, Landroidx/room/d;->b:Ljava/lang/String;

    iput-object p3, p0, Landroidx/room/d;->d:Landroidx/room/c;

    iput-object p4, p0, Landroidx/room/d;->g:Ljava/util/concurrent/Executor;

    iget-object p2, p3, Landroidx/room/c;->a:Ljava/util/HashMap;

    invoke-virtual {p2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p2

    new-instance p3, Landroidx/room/d$f;

    new-array p4, v1, [Ljava/lang/String;

    invoke-interface {p2, p4}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-direct {p3, p0, p2}, Landroidx/room/d$f;-><init>(Landroidx/room/d;[Ljava/lang/String;)V

    iput-object p3, p0, Landroidx/room/d;->e:Landroidx/room/c$c;

    new-instance p2, Landroid/content/Intent;

    const-class p3, Landroidx/room/MultiInstanceInvalidationService;

    invoke-direct {p2, p1, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 p3, 0x1

    invoke-virtual {p1, p2, v0, p3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return-void
.end method
