.class public Lcom/daaw/wu0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/b01;
.implements Lcom/daaw/es;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/b01<",
        "TT;>;",
        "Lcom/daaw/es<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final c:Lcom/daaw/es$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/es$a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lcom/daaw/b01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/b01<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Lcom/daaw/es$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/es$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public volatile b:Lcom/daaw/b01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/b01<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/uu0;->a:Lcom/daaw/uu0;

    sput-object v0, Lcom/daaw/wu0;->c:Lcom/daaw/es$a;

    sget-object v0, Lcom/daaw/vu0;->a:Lcom/daaw/vu0;

    sput-object v0, Lcom/daaw/wu0;->d:Lcom/daaw/b01;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/es$a;Lcom/daaw/b01;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/es$a<",
            "TT;>;",
            "Lcom/daaw/b01<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wu0;->a:Lcom/daaw/es$a;

    iput-object p2, p0, Lcom/daaw/wu0;->b:Lcom/daaw/b01;

    return-void
.end method

.method public static synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/daaw/wu0;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lcom/daaw/b01;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/wu0;->f(Lcom/daaw/b01;)V

    return-void
.end method

.method public static synthetic d(Lcom/daaw/es$a;Lcom/daaw/es$a;Lcom/daaw/b01;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/wu0;->h(Lcom/daaw/es$a;Lcom/daaw/es$a;Lcom/daaw/b01;)V

    return-void
.end method

.method public static e()Lcom/daaw/wu0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/daaw/wu0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/wu0;

    sget-object v1, Lcom/daaw/wu0;->c:Lcom/daaw/es$a;

    sget-object v2, Lcom/daaw/wu0;->d:Lcom/daaw/b01;

    invoke-direct {v0, v1, v2}, Lcom/daaw/wu0;-><init>(Lcom/daaw/es$a;Lcom/daaw/b01;)V

    return-object v0
.end method

.method public static synthetic f(Lcom/daaw/b01;)V
    .locals 0

    return-void
.end method

.method public static synthetic g()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic h(Lcom/daaw/es$a;Lcom/daaw/es$a;Lcom/daaw/b01;)V
    .locals 0

    invoke-interface {p0, p2}, Lcom/daaw/es$a;->a(Lcom/daaw/b01;)V

    invoke-interface {p1, p2}, Lcom/daaw/es$a;->a(Lcom/daaw/b01;)V

    return-void
.end method

.method public static i(Lcom/daaw/b01;)Lcom/daaw/wu0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/b01<",
            "TT;>;)",
            "Lcom/daaw/wu0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/wu0;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcom/daaw/wu0;-><init>(Lcom/daaw/es$a;Lcom/daaw/b01;)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/daaw/es$a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/es$a<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/wu0;->b:Lcom/daaw/b01;

    sget-object v1, Lcom/daaw/wu0;->d:Lcom/daaw/b01;

    if-eq v0, v1, :cond_0

    invoke-interface {p1, v0}, Lcom/daaw/es$a;->a(Lcom/daaw/b01;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lcom/daaw/wu0;->b:Lcom/daaw/b01;

    if-eq v2, v1, :cond_1

    move-object v0, v2

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/daaw/wu0;->a:Lcom/daaw/es$a;

    new-instance v3, Lcom/daaw/tu0;

    invoke-direct {v3, v1, p1}, Lcom/daaw/tu0;-><init>(Lcom/daaw/es$a;Lcom/daaw/es$a;)V

    iput-object v3, p0, Lcom/daaw/wu0;->a:Lcom/daaw/es$a;

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    invoke-interface {p1, v2}, Lcom/daaw/es$a;->a(Lcom/daaw/b01;)V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/wu0;->b:Lcom/daaw/b01;

    invoke-interface {v0}, Lcom/daaw/b01;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public j(Lcom/daaw/b01;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/b01<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/wu0;->b:Lcom/daaw/b01;

    sget-object v1, Lcom/daaw/wu0;->d:Lcom/daaw/b01;

    if-ne v0, v1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/wu0;->a:Lcom/daaw/es$a;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/wu0;->a:Lcom/daaw/es$a;

    iput-object p1, p0, Lcom/daaw/wu0;->b:Lcom/daaw/b01;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, p1}, Lcom/daaw/es$a;->a(Lcom/daaw/b01;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "provide() can be called only once."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
