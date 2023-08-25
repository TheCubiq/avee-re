.class public Lcom/daaw/ux1;
.super Lcom/daaw/tx1;
.source ""


# static fields
.field public static final j:Ljava/lang/String;


# instance fields
.field public final a:Lcom/daaw/ey1;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/daaw/lz;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/daaw/oy1;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/ux1;",
            ">;"
        }
    .end annotation
.end field

.field public h:Z

.field public i:Lcom/daaw/qu0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkContinuationImpl"

    invoke-static {v0}, Lcom/daaw/ll0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/ux1;->j:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/ey1;Ljava/lang/String;Lcom/daaw/lz;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ey1;",
            "Ljava/lang/String;",
            "Lcom/daaw/lz;",
            "Ljava/util/List<",
            "+",
            "Lcom/daaw/oy1;",
            ">;",
            "Ljava/util/List<",
            "Lcom/daaw/ux1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/daaw/tx1;-><init>()V

    iput-object p1, p0, Lcom/daaw/ux1;->a:Lcom/daaw/ey1;

    iput-object p2, p0, Lcom/daaw/ux1;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/ux1;->c:Lcom/daaw/lz;

    iput-object p4, p0, Lcom/daaw/ux1;->d:Ljava/util/List;

    iput-object p5, p0, Lcom/daaw/ux1;->g:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/ux1;->e:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/ux1;->f:Ljava/util/List;

    if-eqz p5, :cond_0

    invoke-interface {p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/ux1;

    iget-object p3, p0, Lcom/daaw/ux1;->f:Ljava/util/List;

    iget-object p2, p2, Lcom/daaw/ux1;->f:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_1
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p2

    if-ge p1, p2, :cond_1

    invoke-interface {p4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/oy1;

    invoke-virtual {p2}, Lcom/daaw/oy1;->a()Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Lcom/daaw/ux1;->e:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p3, p0, Lcom/daaw/ux1;->f:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public constructor <init>(Lcom/daaw/ey1;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ey1;",
            "Ljava/util/List<",
            "+",
            "Lcom/daaw/oy1;",
            ">;)V"
        }
    .end annotation

    sget-object v3, Lcom/daaw/lz;->q:Lcom/daaw/lz;

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/daaw/ux1;-><init>(Lcom/daaw/ey1;Ljava/lang/String;Lcom/daaw/lz;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static i(Lcom/daaw/ux1;Ljava/util/Set;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ux1;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/ux1;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-static {p0}, Lcom/daaw/ux1;->l(Lcom/daaw/ux1;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v3

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/ux1;->e()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ux1;

    invoke-static {v1, p1}, Lcom/daaw/ux1;->i(Lcom/daaw/ux1;Ljava/util/Set;)Z

    move-result v1

    if-eqz v1, :cond_2

    return v3

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/ux1;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    const/4 p0, 0x0

    return p0
.end method

.method public static l(Lcom/daaw/ux1;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ux1;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p0}, Lcom/daaw/ux1;->e()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ux1;

    invoke-virtual {v1}, Lcom/daaw/ux1;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()Lcom/daaw/qu0;
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/ux1;->h:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/mx;

    invoke-direct {v0, p0}, Lcom/daaw/mx;-><init>(Lcom/daaw/ux1;)V

    iget-object v1, p0, Lcom/daaw/ux1;->a:Lcom/daaw/ey1;

    invoke-virtual {v1}, Lcom/daaw/ey1;->p()Lcom/daaw/wj1;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/daaw/wj1;->b(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/daaw/mx;->d()Lcom/daaw/qu0;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ux1;->i:Lcom/daaw/qu0;

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v0

    sget-object v1, Lcom/daaw/ux1;->j:Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/ux1;->e:Ljava/util/List;

    const-string v4, ", "

    invoke-static {v4, v3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "Already enqueued work ids (%s)"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Throwable;

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/ll0;->h(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, p0, Lcom/daaw/ux1;->i:Lcom/daaw/qu0;

    return-object v0
.end method

.method public b()Lcom/daaw/lz;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ux1;->c:Lcom/daaw/lz;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ux1;->e:Ljava/util/List;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ux1;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/daaw/ux1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ux1;->g:Ljava/util/List;

    return-object v0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/daaw/oy1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ux1;->d:Ljava/util/List;

    return-object v0
.end method

.method public g()Lcom/daaw/ey1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ux1;->a:Lcom/daaw/ey1;

    return-object v0
.end method

.method public h()Z
    .locals 1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {p0, v0}, Lcom/daaw/ux1;->i(Lcom/daaw/ux1;Ljava/util/Set;)Z

    move-result v0

    return v0
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ux1;->h:Z

    return v0
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ux1;->h:Z

    return-void
.end method
