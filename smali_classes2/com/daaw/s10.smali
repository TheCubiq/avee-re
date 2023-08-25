.class public Lcom/daaw/s10;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/s10$b;,
        Lcom/daaw/s10$c;,
        Lcom/daaw/s10$a;
    }
.end annotation


# static fields
.field public static final k:Ljava/lang/Object;

.field public static final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/daaw/s10;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/daaw/h20;

.field public final d:Lcom/daaw/qi;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final g:Lcom/daaw/xi0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/xi0<",
            "Lcom/daaw/fp;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lcom/daaw/b01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/b01<",
            "Lcom/daaw/cr;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/s10$a;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/s10;->k:Ljava/lang/Object;

    new-instance v0, Lcom/daaw/g6;

    invoke-direct {v0}, Lcom/daaw/g6;-><init>()V

    sput-object v0, Lcom/daaw/s10;->l:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/h20;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/daaw/s10;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/daaw/s10;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/s10;->i:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/s10;->j:Ljava/util/List;

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lcom/daaw/s10;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/s10;->b:Ljava/lang/String;

    invoke-static {p3}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/h20;

    iput-object p2, p0, Lcom/daaw/s10;->c:Lcom/daaw/h20;

    invoke-static {}, Lcom/google/firebase/provider/FirebaseInitProvider;->b()Lcom/daaw/jf1;

    move-result-object p2

    const-string v0, "Firebase"

    invoke-static {v0}, Lcom/daaw/i20;->b(Ljava/lang/String;)V

    const-string v0, "ComponentDiscovery"

    invoke-static {v0}, Lcom/daaw/i20;->b(Ljava/lang/String;)V

    const-class v0, Lcom/google/firebase/components/ComponentDiscoveryService;

    invoke-static {p1, v0}, Lcom/daaw/fi;->c(Landroid/content/Context;Ljava/lang/Class;)Lcom/daaw/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/fi;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lcom/daaw/i20;->a()V

    const-string v2, "Runtime"

    invoke-static {v2}, Lcom/daaw/i20;->b(Ljava/lang/String;)V

    sget-object v2, Lcom/daaw/dp1;->p:Lcom/daaw/dp1;

    invoke-static {v2}, Lcom/daaw/qi;->m(Ljava/util/concurrent/Executor;)Lcom/daaw/qi$b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/qi$b;->d(Ljava/util/Collection;)Lcom/daaw/qi$b;

    move-result-object v0

    new-instance v2, Lcom/google/firebase/FirebaseCommonRegistrar;

    invoke-direct {v2}, Lcom/google/firebase/FirebaseCommonRegistrar;-><init>()V

    invoke-virtual {v0, v2}, Lcom/daaw/qi$b;->c(Lcom/google/firebase/components/ComponentRegistrar;)Lcom/daaw/qi$b;

    move-result-object v0

    new-instance v2, Lcom/google/firebase/concurrent/ExecutorsRegistrar;

    invoke-direct {v2}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;-><init>()V

    invoke-virtual {v0, v2}, Lcom/daaw/qi$b;->c(Lcom/google/firebase/components/ComponentRegistrar;)Lcom/daaw/qi$b;

    move-result-object v0

    const-class v2, Landroid/content/Context;

    new-array v3, v1, [Ljava/lang/Class;

    invoke-static {p1, v2, v3}, Lcom/daaw/vh;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lcom/daaw/vh;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/daaw/qi$b;->b(Lcom/daaw/vh;)Lcom/daaw/qi$b;

    move-result-object v0

    const-class v2, Lcom/daaw/s10;

    new-array v3, v1, [Ljava/lang/Class;

    invoke-static {p0, v2, v3}, Lcom/daaw/vh;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lcom/daaw/vh;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/daaw/qi$b;->b(Lcom/daaw/vh;)Lcom/daaw/qi$b;

    move-result-object v0

    const-class v2, Lcom/daaw/h20;

    new-array v3, v1, [Ljava/lang/Class;

    invoke-static {p3, v2, v3}, Lcom/daaw/vh;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lcom/daaw/vh;

    move-result-object p3

    invoke-virtual {v0, p3}, Lcom/daaw/qi$b;->b(Lcom/daaw/vh;)Lcom/daaw/qi$b;

    move-result-object p3

    new-instance v0, Lcom/daaw/ji;

    invoke-direct {v0}, Lcom/daaw/ji;-><init>()V

    invoke-virtual {p3, v0}, Lcom/daaw/qi$b;->g(Lcom/daaw/li;)Lcom/daaw/qi$b;

    move-result-object p3

    invoke-static {p1}, Lcom/daaw/mq1;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/firebase/provider/FirebaseInitProvider;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const-class v0, Lcom/daaw/jf1;

    new-array v1, v1, [Ljava/lang/Class;

    invoke-static {p2, v0, v1}, Lcom/daaw/vh;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lcom/daaw/vh;

    move-result-object p2

    invoke-virtual {p3, p2}, Lcom/daaw/qi$b;->b(Lcom/daaw/vh;)Lcom/daaw/qi$b;

    :cond_0
    invoke-virtual {p3}, Lcom/daaw/qi$b;->e()Lcom/daaw/qi;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/s10;->d:Lcom/daaw/qi;

    invoke-static {}, Lcom/daaw/i20;->a()V

    new-instance p3, Lcom/daaw/xi0;

    new-instance v0, Lcom/daaw/r10;

    invoke-direct {v0, p0, p1}, Lcom/daaw/r10;-><init>(Lcom/daaw/s10;Landroid/content/Context;)V

    invoke-direct {p3, v0}, Lcom/daaw/xi0;-><init>(Lcom/daaw/b01;)V

    iput-object p3, p0, Lcom/daaw/s10;->g:Lcom/daaw/xi0;

    const-class p1, Lcom/daaw/cr;

    invoke-virtual {p2, p1}, Lcom/daaw/qi;->d(Ljava/lang/Class;)Lcom/daaw/b01;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/s10;->h:Lcom/daaw/b01;

    new-instance p1, Lcom/daaw/q10;

    invoke-direct {p1, p0}, Lcom/daaw/q10;-><init>(Lcom/daaw/s10;)V

    invoke-virtual {p0, p1}, Lcom/daaw/s10;->g(Lcom/daaw/s10$a;)V

    invoke-static {}, Lcom/daaw/i20;->a()V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/s10;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/s10;->v(Z)V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/s10;Landroid/content/Context;)Lcom/daaw/fp;
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/s10;->u(Landroid/content/Context;)Lcom/daaw/fp;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/daaw/s10;->k:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic d(Lcom/daaw/s10;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/s10;->o()V

    return-void
.end method

.method public static synthetic e(Lcom/daaw/s10;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/daaw/s10;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static synthetic f(Lcom/daaw/s10;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/s10;->x(Z)V

    return-void
.end method

.method public static k()Lcom/daaw/s10;
    .locals 4

    sget-object v0, Lcom/daaw/s10;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/s10;->l:Ljava/util/Map;

    const-string v2, "[DEFAULT]"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/s10;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Default FirebaseApp is not initialized in this process "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/daaw/hz0;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ". Make sure to call FirebaseApp.initializeApp(Context) first."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static p(Landroid/content/Context;)Lcom/daaw/s10;
    .locals 3

    sget-object v0, Lcom/daaw/s10;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/s10;->l:Ljava/util/Map;

    const-string v2, "[DEFAULT]"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/daaw/s10;->k()Lcom/daaw/s10;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/daaw/h20;->a(Landroid/content/Context;)Lcom/daaw/h20;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 p0, 0x0

    monitor-exit v0

    return-object p0

    :cond_1
    invoke-static {p0, v1}, Lcom/daaw/s10;->q(Landroid/content/Context;Lcom/daaw/h20;)Lcom/daaw/s10;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static q(Landroid/content/Context;Lcom/daaw/h20;)Lcom/daaw/s10;
    .locals 1

    const-string v0, "[DEFAULT]"

    invoke-static {p0, p1, v0}, Lcom/daaw/s10;->r(Landroid/content/Context;Lcom/daaw/h20;Ljava/lang/String;)Lcom/daaw/s10;

    move-result-object p0

    return-object p0
.end method

.method public static r(Landroid/content/Context;Lcom/daaw/h20;Ljava/lang/String;)Lcom/daaw/s10;
    .locals 5

    invoke-static {p0}, Lcom/daaw/s10$b;->b(Landroid/content/Context;)V

    invoke-static {p2}, Lcom/daaw/s10;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    :goto_0
    sget-object v0, Lcom/daaw/s10;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/s10;->l:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "FirebaseApp name "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " already exists!"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/daaw/ry0;->n(ZLjava/lang/Object;)V

    const-string v2, "Application context cannot be null."

    invoke-static {p0, v2}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/daaw/s10;

    invoke-direct {v2, p0, p2, p1}, Lcom/daaw/s10;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/h20;)V

    invoke-interface {v1, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Lcom/daaw/s10;->o()V

    return-object v2

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private synthetic u(Landroid/content/Context;)Lcom/daaw/fp;
    .locals 4

    new-instance v0, Lcom/daaw/fp;

    invoke-virtual {p0}, Lcom/daaw/s10;->n()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/s10;->d:Lcom/daaw/qi;

    const-class v3, Lcom/daaw/e01;

    invoke-virtual {v2, v3}, Lcom/daaw/qi;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/e01;

    invoke-direct {v0, p1, v1, v2}, Lcom/daaw/fp;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/e01;)V

    return-object v0
.end method

.method private synthetic v(Z)V
    .locals 0

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/s10;->h:Lcom/daaw/b01;

    invoke-interface {p1}, Lcom/daaw/b01;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/cr;

    invoke-virtual {p1}, Lcom/daaw/cr;->k()Lcom/daaw/rj1;

    :cond_0
    return-void
.end method

.method public static w(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/daaw/s10;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/s10;->b:Ljava/lang/String;

    check-cast p1, Lcom/daaw/s10;

    invoke-virtual {p1}, Lcom/daaw/s10;->l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public g(Lcom/daaw/s10$a;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/s10;->h()V

    iget-object v0, p0, Lcom/daaw/s10;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/fa;->b()Lcom/daaw/fa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/fa;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/daaw/s10$a;->a(Z)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/s10;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final h()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/s10;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "FirebaseApp was deleted"

    invoke-static {v0, v1}, Lcom/daaw/ry0;->n(ZLjava/lang/Object;)V

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/s10;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public i(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/s10;->h()V

    iget-object v0, p0, Lcom/daaw/s10;->d:Lcom/daaw/qi;

    invoke-virtual {v0, p1}, Lcom/daaw/qi;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j()Landroid/content/Context;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/s10;->h()V

    iget-object v0, p0, Lcom/daaw/s10;->a:Landroid/content/Context;

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/s10;->h()V

    iget-object v0, p0, Lcom/daaw/s10;->b:Ljava/lang/String;

    return-object v0
.end method

.method public m()Lcom/daaw/h20;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/s10;->h()V

    iget-object v0, p0, Lcom/daaw/s10;->c:Lcom/daaw/h20;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/daaw/s10;->l()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/ka;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/daaw/s10;->m()Lcom/daaw/h20;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/h20;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/ka;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final o()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/s10;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/mq1;->a(Landroid/content/Context;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/daaw/s10;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/daaw/s10;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/s10$c;->a(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Device unlocked: initializing all Firebase APIs for app "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/daaw/s10;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/daaw/s10;->d:Lcom/daaw/qi;

    invoke-virtual {p0}, Lcom/daaw/s10;->t()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/qi;->p(Z)V

    iget-object v0, p0, Lcom/daaw/s10;->h:Lcom/daaw/b01;

    invoke-interface {v0}, Lcom/daaw/b01;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/cr;

    invoke-virtual {v0}, Lcom/daaw/cr;->k()Lcom/daaw/rj1;

    :goto_0
    return-void
.end method

.method public s()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/s10;->h()V

    iget-object v0, p0, Lcom/daaw/s10;->g:Lcom/daaw/xi0;

    invoke-virtual {v0}, Lcom/daaw/xi0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/fp;

    invoke-virtual {v0}, Lcom/daaw/fp;->b()Z

    move-result v0

    return v0
.end method

.method public t()Z
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/s10;->l()Ljava/lang/String;

    move-result-object v0

    const-string v1, "[DEFAULT]"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/daaw/ot0;->c(Ljava/lang/Object;)Lcom/daaw/ot0$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/s10;->b:Ljava/lang/String;

    const-string v2, "name"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/ot0$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/daaw/ot0$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/s10;->c:Lcom/daaw/h20;

    const-string v2, "options"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/ot0$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/daaw/ot0$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/ot0$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x(Z)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/s10;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/s10$a;

    invoke-interface {v1, p1}, Lcom/daaw/s10$a;->a(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method
