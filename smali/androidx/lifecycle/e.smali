.class public Landroidx/lifecycle/e;
.super Landroidx/lifecycle/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/e$a;
    }
.end annotation


# instance fields
.field public b:Lcom/daaw/m00;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/m00<",
            "Lcom/daaw/rj0;",
            "Landroidx/lifecycle/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public c:Landroidx/lifecycle/c$c;

.field public final d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/sj0;",
            ">;"
        }
    .end annotation
.end field

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/lifecycle/c$c;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Z


# direct methods
.method public constructor <init>(Lcom/daaw/sj0;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Landroidx/lifecycle/e;-><init>(Lcom/daaw/sj0;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/sj0;Z)V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/c;-><init>()V

    new-instance v0, Lcom/daaw/m00;

    invoke-direct {v0}, Lcom/daaw/m00;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/e;->b:Lcom/daaw/m00;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/lifecycle/e;->e:I

    iput-boolean v0, p0, Landroidx/lifecycle/e;->f:Z

    iput-boolean v0, p0, Landroidx/lifecycle/e;->g:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/e;->h:Ljava/util/ArrayList;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/lifecycle/e;->d:Ljava/lang/ref/WeakReference;

    sget-object p1, Landroidx/lifecycle/c$c;->q:Landroidx/lifecycle/c$c;

    iput-object p1, p0, Landroidx/lifecycle/e;->c:Landroidx/lifecycle/c$c;

    iput-boolean p2, p0, Landroidx/lifecycle/e;->i:Z

    return-void
.end method

.method public static k(Landroidx/lifecycle/c$c;Landroidx/lifecycle/c$c;)Landroidx/lifecycle/c$c;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_0

    move-object p0, p1

    :cond_0
    return-object p0
.end method


# virtual methods
.method public a(Lcom/daaw/rj0;)V
    .locals 6

    const-string v0, "addObserver"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/e;->f(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/e;->c:Landroidx/lifecycle/c$c;

    sget-object v1, Landroidx/lifecycle/c$c;->p:Landroidx/lifecycle/c$c;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Landroidx/lifecycle/c$c;->q:Landroidx/lifecycle/c$c;

    :goto_0
    new-instance v0, Landroidx/lifecycle/e$a;

    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/e$a;-><init>(Lcom/daaw/rj0;Landroidx/lifecycle/c$c;)V

    iget-object v1, p0, Landroidx/lifecycle/e;->b:Lcom/daaw/m00;

    invoke-virtual {v1, p1, v0}, Lcom/daaw/m00;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/e$a;

    if-eqz v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Landroidx/lifecycle/e;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/sj0;

    if-nez v1, :cond_2

    return-void

    :cond_2
    iget v2, p0, Landroidx/lifecycle/e;->e:I

    const/4 v3, 0x1

    if-nez v2, :cond_4

    iget-boolean v2, p0, Landroidx/lifecycle/e;->f:Z

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v2, 0x1

    :goto_2
    invoke-virtual {p0, p1}, Landroidx/lifecycle/e;->e(Lcom/daaw/rj0;)Landroidx/lifecycle/c$c;

    move-result-object v4

    iget v5, p0, Landroidx/lifecycle/e;->e:I

    add-int/2addr v5, v3

    iput v5, p0, Landroidx/lifecycle/e;->e:I

    :goto_3
    iget-object v5, v0, Landroidx/lifecycle/e$a;->a:Landroidx/lifecycle/c$c;

    invoke-virtual {v5, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-gez v4, :cond_6

    iget-object v4, p0, Landroidx/lifecycle/e;->b:Lcom/daaw/m00;

    invoke-virtual {v4, p1}, Lcom/daaw/m00;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v4, v0, Landroidx/lifecycle/e$a;->a:Landroidx/lifecycle/c$c;

    invoke-virtual {p0, v4}, Landroidx/lifecycle/e;->n(Landroidx/lifecycle/c$c;)V

    iget-object v4, v0, Landroidx/lifecycle/e$a;->a:Landroidx/lifecycle/c$c;

    invoke-static {v4}, Landroidx/lifecycle/c$b;->c(Landroidx/lifecycle/c$c;)Landroidx/lifecycle/c$b;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v0, v1, v4}, Landroidx/lifecycle/e$a;->a(Lcom/daaw/sj0;Landroidx/lifecycle/c$b;)V

    invoke-virtual {p0}, Landroidx/lifecycle/e;->m()V

    invoke-virtual {p0, p1}, Landroidx/lifecycle/e;->e(Lcom/daaw/rj0;)Landroidx/lifecycle/c$c;

    move-result-object v4

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "no event up from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Landroidx/lifecycle/e$a;->a:Landroidx/lifecycle/c$c;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    if-nez v2, :cond_7

    invoke-virtual {p0}, Landroidx/lifecycle/e;->p()V

    :cond_7
    iget p1, p0, Landroidx/lifecycle/e;->e:I

    sub-int/2addr p1, v3

    iput p1, p0, Landroidx/lifecycle/e;->e:I

    return-void
.end method

.method public b()Landroidx/lifecycle/c$c;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/e;->c:Landroidx/lifecycle/c$c;

    return-object v0
.end method

.method public c(Lcom/daaw/rj0;)V
    .locals 1

    const-string v0, "removeObserver"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/e;->f(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/e;->b:Lcom/daaw/m00;

    invoke-virtual {v0, p1}, Lcom/daaw/m00;->m(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final d(Lcom/daaw/sj0;)V
    .locals 5

    iget-object v0, p0, Landroidx/lifecycle/e;->b:Lcom/daaw/m00;

    invoke-virtual {v0}, Lcom/daaw/v71;->descendingIterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Landroidx/lifecycle/e;->g:Z

    if-nez v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/e$a;

    :goto_0
    iget-object v3, v2, Landroidx/lifecycle/e$a;->a:Landroidx/lifecycle/c$c;

    iget-object v4, p0, Landroidx/lifecycle/e;->c:Landroidx/lifecycle/c$c;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-lez v3, :cond_0

    iget-boolean v3, p0, Landroidx/lifecycle/e;->g:Z

    if-nez v3, :cond_0

    iget-object v3, p0, Landroidx/lifecycle/e;->b:Lcom/daaw/m00;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/rj0;

    invoke-virtual {v3, v4}, Lcom/daaw/m00;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v2, Landroidx/lifecycle/e$a;->a:Landroidx/lifecycle/c$c;

    invoke-static {v3}, Landroidx/lifecycle/c$b;->a(Landroidx/lifecycle/c$c;)Landroidx/lifecycle/c$b;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroidx/lifecycle/c$b;->b()Landroidx/lifecycle/c$c;

    move-result-object v4

    invoke-virtual {p0, v4}, Landroidx/lifecycle/e;->n(Landroidx/lifecycle/c$c;)V

    invoke-virtual {v2, p1, v3}, Landroidx/lifecycle/e$a;->a(Lcom/daaw/sj0;Landroidx/lifecycle/c$b;)V

    invoke-virtual {p0}, Landroidx/lifecycle/e;->m()V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "no event down from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v2, Landroidx/lifecycle/e$a;->a:Landroidx/lifecycle/c$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method public final e(Lcom/daaw/rj0;)Landroidx/lifecycle/c$c;
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/e;->b:Lcom/daaw/m00;

    invoke-virtual {v0, p1}, Lcom/daaw/m00;->n(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/e$a;

    iget-object p1, p1, Landroidx/lifecycle/e$a;->a:Landroidx/lifecycle/c$c;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iget-object v1, p0, Landroidx/lifecycle/e;->h:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, p0, Landroidx/lifecycle/e;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/c$c;

    :cond_1
    iget-object v1, p0, Landroidx/lifecycle/e;->c:Landroidx/lifecycle/c$c;

    invoke-static {v1, p1}, Landroidx/lifecycle/e;->k(Landroidx/lifecycle/c$c;Landroidx/lifecycle/c$c;)Landroidx/lifecycle/c$c;

    move-result-object p1

    invoke-static {p1, v0}, Landroidx/lifecycle/e;->k(Landroidx/lifecycle/c$c;Landroidx/lifecycle/c$c;)Landroidx/lifecycle/c$c;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ljava/lang/String;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    iget-boolean v0, p0, Landroidx/lifecycle/e;->i:Z

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/daaw/r5;->e()Lcom/daaw/r5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/r5;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Method "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must be called on the main thread"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final g(Lcom/daaw/sj0;)V
    .locals 5

    iget-object v0, p0, Landroidx/lifecycle/e;->b:Lcom/daaw/m00;

    invoke-virtual {v0}, Lcom/daaw/v71;->f()Lcom/daaw/v71$d;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Landroidx/lifecycle/e;->g:Z

    if-nez v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/e$a;

    :goto_0
    iget-object v3, v2, Landroidx/lifecycle/e$a;->a:Landroidx/lifecycle/c$c;

    iget-object v4, p0, Landroidx/lifecycle/e;->c:Landroidx/lifecycle/c$c;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-gez v3, :cond_0

    iget-boolean v3, p0, Landroidx/lifecycle/e;->g:Z

    if-nez v3, :cond_0

    iget-object v3, p0, Landroidx/lifecycle/e;->b:Lcom/daaw/m00;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/rj0;

    invoke-virtual {v3, v4}, Lcom/daaw/m00;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v2, Landroidx/lifecycle/e$a;->a:Landroidx/lifecycle/c$c;

    invoke-virtual {p0, v3}, Landroidx/lifecycle/e;->n(Landroidx/lifecycle/c$c;)V

    iget-object v3, v2, Landroidx/lifecycle/e$a;->a:Landroidx/lifecycle/c$c;

    invoke-static {v3}, Landroidx/lifecycle/c$b;->c(Landroidx/lifecycle/c$c;)Landroidx/lifecycle/c$b;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, p1, v3}, Landroidx/lifecycle/e$a;->a(Lcom/daaw/sj0;Landroidx/lifecycle/c$b;)V

    invoke-virtual {p0}, Landroidx/lifecycle/e;->m()V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "no event up from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v2, Landroidx/lifecycle/e$a;->a:Landroidx/lifecycle/c$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method public h(Landroidx/lifecycle/c$b;)V
    .locals 1

    const-string v0, "handleLifecycleEvent"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/e;->f(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/lifecycle/c$b;->b()Landroidx/lifecycle/c$c;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/e;->l(Landroidx/lifecycle/c$c;)V

    return-void
.end method

.method public final i()Z
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/e;->b:Lcom/daaw/m00;

    invoke-virtual {v0}, Lcom/daaw/v71;->size()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/e;->b:Lcom/daaw/m00;

    invoke-virtual {v0}, Lcom/daaw/v71;->d()Ljava/util/Map$Entry;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/e$a;

    iget-object v0, v0, Landroidx/lifecycle/e$a;->a:Landroidx/lifecycle/c$c;

    iget-object v2, p0, Landroidx/lifecycle/e;->b:Lcom/daaw/m00;

    invoke-virtual {v2}, Lcom/daaw/v71;->h()Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/e$a;

    iget-object v2, v2, Landroidx/lifecycle/e$a;->a:Landroidx/lifecycle/c$c;

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Landroidx/lifecycle/e;->c:Landroidx/lifecycle/c$c;

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public j(Landroidx/lifecycle/c$c;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "markState"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/e;->f(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroidx/lifecycle/e;->o(Landroidx/lifecycle/c$c;)V

    return-void
.end method

.method public final l(Landroidx/lifecycle/c$c;)V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/e;->c:Landroidx/lifecycle/c$c;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    sget-object v1, Landroidx/lifecycle/c$c;->q:Landroidx/lifecycle/c$c;

    if-ne v0, v1, :cond_2

    sget-object v0, Landroidx/lifecycle/c$c;->p:Landroidx/lifecycle/c$c;

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "no event down from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/lifecycle/e;->c:Landroidx/lifecycle/c$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/e;->c:Landroidx/lifecycle/c$c;

    iget-boolean p1, p0, Landroidx/lifecycle/e;->f:Z

    const/4 v0, 0x1

    if-nez p1, :cond_5

    iget p1, p0, Landroidx/lifecycle/e;->e:I

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iput-boolean v0, p0, Landroidx/lifecycle/e;->f:Z

    invoke-virtual {p0}, Landroidx/lifecycle/e;->p()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/lifecycle/e;->f:Z

    iget-object p1, p0, Landroidx/lifecycle/e;->c:Landroidx/lifecycle/c$c;

    sget-object v0, Landroidx/lifecycle/c$c;->p:Landroidx/lifecycle/c$c;

    if-ne p1, v0, :cond_4

    new-instance p1, Lcom/daaw/m00;

    invoke-direct {p1}, Lcom/daaw/m00;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/e;->b:Lcom/daaw/m00;

    :cond_4
    return-void

    :cond_5
    :goto_1
    iput-boolean v0, p0, Landroidx/lifecycle/e;->g:Z

    return-void
.end method

.method public final m()V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/e;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method public final n(Landroidx/lifecycle/c$c;)V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/e;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public o(Landroidx/lifecycle/c$c;)V
    .locals 1

    const-string v0, "setCurrentState"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/e;->f(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroidx/lifecycle/e;->l(Landroidx/lifecycle/c$c;)V

    return-void
.end method

.method public final p()V
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/e;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/sj0;

    if-eqz v0, :cond_3

    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroidx/lifecycle/e;->i()Z

    move-result v1

    const/4 v2, 0x0

    iput-boolean v2, p0, Landroidx/lifecycle/e;->g:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/lifecycle/e;->c:Landroidx/lifecycle/c$c;

    iget-object v2, p0, Landroidx/lifecycle/e;->b:Lcom/daaw/m00;

    invoke-virtual {v2}, Lcom/daaw/v71;->d()Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/e$a;

    iget-object v2, v2, Landroidx/lifecycle/e$a;->a:Landroidx/lifecycle/c$c;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_1

    invoke-virtual {p0, v0}, Landroidx/lifecycle/e;->d(Lcom/daaw/sj0;)V

    :cond_1
    iget-object v1, p0, Landroidx/lifecycle/e;->b:Lcom/daaw/m00;

    invoke-virtual {v1}, Lcom/daaw/v71;->h()Ljava/util/Map$Entry;

    move-result-object v1

    iget-boolean v2, p0, Landroidx/lifecycle/e;->g:Z

    if-nez v2, :cond_0

    if-eqz v1, :cond_0

    iget-object v2, p0, Landroidx/lifecycle/e;->c:Landroidx/lifecycle/c$c;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/e$a;

    iget-object v1, v1, Landroidx/lifecycle/e$a;->a:Landroidx/lifecycle/c$c;

    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {p0, v0}, Landroidx/lifecycle/e;->g(Lcom/daaw/sj0;)V

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method
