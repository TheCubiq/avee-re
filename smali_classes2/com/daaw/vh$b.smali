.class public Lcom/daaw/vh$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/vh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/daaw/i01<",
            "-TT;>;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/daaw/ys;",
            ">;"
        }
    .end annotation
.end field

.field public d:I

.field public e:I

.field public f:Lcom/daaw/gi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/gi<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public varargs constructor <init>(Lcom/daaw/i01;[Lcom/daaw/i01;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/i01<",
            "TT;>;[",
            "Lcom/daaw/i01<",
            "-TT;>;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/vh$b;->a:Ljava/lang/String;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/daaw/vh$b;->b:Ljava/util/Set;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lcom/daaw/vh$b;->c:Ljava/util/Set;

    const/4 v1, 0x0

    iput v1, p0, Lcom/daaw/vh$b;->d:I

    iput v1, p0, Lcom/daaw/vh$b;->e:I

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lcom/daaw/vh$b;->g:Ljava/util/Set;

    const-string v2, "Null interface"

    invoke-static {p1, v2}, Lcom/daaw/sy0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    array-length p1, p2

    :goto_0
    if-ge v1, p1, :cond_0

    aget-object v0, p2, v1

    invoke-static {v0, v2}, Lcom/daaw/sy0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/vh$b;->b:Ljava/util/Set;

    invoke-static {p1, p2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/i01;[Lcom/daaw/i01;Lcom/daaw/vh$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/vh$b;-><init>(Lcom/daaw/i01;[Lcom/daaw/i01;)V

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/Class;[Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Ljava/lang/Class<",
            "-TT;>;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/vh$b;->a:Ljava/lang/String;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/daaw/vh$b;->b:Ljava/util/Set;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lcom/daaw/vh$b;->c:Ljava/util/Set;

    const/4 v1, 0x0

    iput v1, p0, Lcom/daaw/vh$b;->d:I

    iput v1, p0, Lcom/daaw/vh$b;->e:I

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lcom/daaw/vh$b;->g:Ljava/util/Set;

    const-string v2, "Null interface"

    invoke-static {p1, v2}, Lcom/daaw/sy0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/daaw/i01;->b(Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    array-length p1, p2

    :goto_0
    if-ge v1, p1, :cond_0

    aget-object v0, p2, v1

    invoke-static {v0, v2}, Lcom/daaw/sy0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/vh$b;->b:Ljava/util/Set;

    invoke-static {v0}, Lcom/daaw/i01;->b(Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;[Ljava/lang/Class;Lcom/daaw/vh$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/vh$b;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/vh$b;)Lcom/daaw/vh$b;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/vh$b;->f()Lcom/daaw/vh$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b(Lcom/daaw/ys;)Lcom/daaw/vh$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ys;",
            ")",
            "Lcom/daaw/vh$b<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "Null dependency"

    invoke-static {p1, v0}, Lcom/daaw/sy0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/daaw/ys;->c()Lcom/daaw/i01;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/vh$b;->i(Lcom/daaw/i01;)V

    iget-object v0, p0, Lcom/daaw/vh$b;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c()Lcom/daaw/vh;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/vh<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/vh$b;->f:Lcom/daaw/gi;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Missing required property: factory."

    invoke-static {v0, v1}, Lcom/daaw/sy0;->d(ZLjava/lang/String;)V

    new-instance v0, Lcom/daaw/vh;

    iget-object v3, p0, Lcom/daaw/vh$b;->a:Ljava/lang/String;

    new-instance v4, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/daaw/vh$b;->b:Ljava/util/Set;

    invoke-direct {v4, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance v5, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/daaw/vh$b;->c:Ljava/util/Set;

    invoke-direct {v5, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget v6, p0, Lcom/daaw/vh$b;->d:I

    iget v7, p0, Lcom/daaw/vh$b;->e:I

    iget-object v8, p0, Lcom/daaw/vh$b;->f:Lcom/daaw/gi;

    iget-object v9, p0, Lcom/daaw/vh$b;->g:Ljava/util/Set;

    const/4 v10, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v10}, Lcom/daaw/vh;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILcom/daaw/gi;Ljava/util/Set;Lcom/daaw/vh$a;)V

    return-object v0
.end method

.method public d()Lcom/daaw/vh$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/vh$b<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/daaw/vh$b;->h(I)Lcom/daaw/vh$b;

    move-result-object v0

    return-object v0
.end method

.method public e(Lcom/daaw/gi;)Lcom/daaw/vh$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/gi<",
            "TT;>;)",
            "Lcom/daaw/vh$b<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "Null factory"

    invoke-static {p1, v0}, Lcom/daaw/sy0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/gi;

    iput-object p1, p0, Lcom/daaw/vh$b;->f:Lcom/daaw/gi;

    return-object p0
.end method

.method public final f()Lcom/daaw/vh$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/vh$b<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/vh$b;->e:I

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lcom/daaw/vh$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/vh$b<",
            "TT;>;"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/vh$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final h(I)Lcom/daaw/vh$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/daaw/vh$b<",
            "TT;>;"
        }
    .end annotation

    iget v0, p0, Lcom/daaw/vh$b;->d:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Instantiation type has already been set."

    invoke-static {v0, v1}, Lcom/daaw/sy0;->d(ZLjava/lang/String;)V

    iput p1, p0, Lcom/daaw/vh$b;->d:I

    return-object p0
.end method

.method public final i(Lcom/daaw/i01;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/i01<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/vh$b;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    const-string v0, "Components are not allowed to depend on interfaces they themselves provide."

    invoke-static {p1, v0}, Lcom/daaw/sy0;->a(ZLjava/lang/String;)V

    return-void
.end method
