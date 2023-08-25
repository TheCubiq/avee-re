.class public final Lcom/daaw/qi$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/qi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/b01<",
            "Lcom/google/firebase/components/ComponentRegistrar;",
            ">;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/vh<",
            "*>;>;"
        }
    .end annotation
.end field

.field public d:Lcom/daaw/li;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/qi$b;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/qi$b;->c:Ljava/util/List;

    sget-object v0, Lcom/daaw/li;->a:Lcom/daaw/li;

    iput-object v0, p0, Lcom/daaw/qi$b;->d:Lcom/daaw/li;

    iput-object p1, p0, Lcom/daaw/qi$b;->a:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/components/ComponentRegistrar;)Lcom/google/firebase/components/ComponentRegistrar;
    .locals 0

    invoke-static {p0}, Lcom/daaw/qi$b;->f(Lcom/google/firebase/components/ComponentRegistrar;)Lcom/google/firebase/components/ComponentRegistrar;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/google/firebase/components/ComponentRegistrar;)Lcom/google/firebase/components/ComponentRegistrar;
    .locals 0

    return-object p0
.end method


# virtual methods
.method public b(Lcom/daaw/vh;)Lcom/daaw/qi$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vh<",
            "*>;)",
            "Lcom/daaw/qi$b;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/qi$b;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c(Lcom/google/firebase/components/ComponentRegistrar;)Lcom/daaw/qi$b;
    .locals 2

    iget-object v0, p0, Lcom/daaw/qi$b;->b:Ljava/util/List;

    new-instance v1, Lcom/daaw/ri;

    invoke-direct {v1, p1}, Lcom/daaw/ri;-><init>(Lcom/google/firebase/components/ComponentRegistrar;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public d(Ljava/util/Collection;)Lcom/daaw/qi$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/daaw/b01<",
            "Lcom/google/firebase/components/ComponentRegistrar;",
            ">;>;)",
            "Lcom/daaw/qi$b;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/qi$b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public e()Lcom/daaw/qi;
    .locals 7

    new-instance v6, Lcom/daaw/qi;

    iget-object v1, p0, Lcom/daaw/qi$b;->a:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lcom/daaw/qi$b;->b:Ljava/util/List;

    iget-object v3, p0, Lcom/daaw/qi$b;->c:Ljava/util/List;

    iget-object v4, p0, Lcom/daaw/qi$b;->d:Lcom/daaw/li;

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/daaw/qi;-><init>(Ljava/util/concurrent/Executor;Ljava/lang/Iterable;Ljava/util/Collection;Lcom/daaw/li;Lcom/daaw/qi$a;)V

    return-object v6
.end method

.method public g(Lcom/daaw/li;)Lcom/daaw/qi$b;
    .locals 0

    iput-object p1, p0, Lcom/daaw/qi$b;->d:Lcom/daaw/li;

    return-object p0
.end method
