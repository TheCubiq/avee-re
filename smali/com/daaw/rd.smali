.class public abstract Lcom/daaw/rd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final p:Lcom/daaw/ru0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/ru0;

    invoke-direct {v0}, Lcom/daaw/ru0;-><init>()V

    iput-object v0, p0, Lcom/daaw/rd;->p:Lcom/daaw/ru0;

    return-void
.end method

.method public static b(Ljava/util/UUID;Lcom/daaw/ey1;)Lcom/daaw/rd;
    .locals 1

    new-instance v0, Lcom/daaw/rd$a;

    invoke-direct {v0, p1, p0}, Lcom/daaw/rd$a;-><init>(Lcom/daaw/ey1;Ljava/util/UUID;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Lcom/daaw/ey1;Z)Lcom/daaw/rd;
    .locals 1

    new-instance v0, Lcom/daaw/rd$c;

    invoke-direct {v0, p1, p0, p2}, Lcom/daaw/rd$c;-><init>(Lcom/daaw/ey1;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static d(Ljava/lang/String;Lcom/daaw/ey1;)Lcom/daaw/rd;
    .locals 1

    new-instance v0, Lcom/daaw/rd$b;

    invoke-direct {v0, p1, p0}, Lcom/daaw/rd$b;-><init>(Lcom/daaw/ey1;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/daaw/ey1;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Lcom/daaw/ey1;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/daaw/rd;->f(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/daaw/ey1;->m()Lcom/daaw/jz0;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/daaw/jz0;->l(Ljava/lang/String;)Z

    invoke-virtual {p1}, Lcom/daaw/ey1;->n()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/r81;

    invoke-interface {v0, p2}, Lcom/daaw/r81;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e()Lcom/daaw/qu0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rd;->p:Lcom/daaw/ru0;

    return-object v0
.end method

.method public final f(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V
    .locals 5

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->B()Lcom/daaw/ry1;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->t()Lcom/daaw/bt;

    move-result-object p1

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {v1, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v1}, Ljava/util/LinkedList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {v1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {v0, p2}, Lcom/daaw/ry1;->l(Ljava/lang/String;)Lcom/daaw/yx1;

    move-result-object v2

    sget-object v3, Lcom/daaw/yx1;->r:Lcom/daaw/yx1;

    if-eq v2, v3, :cond_0

    sget-object v3, Lcom/daaw/yx1;->s:Lcom/daaw/yx1;

    if-eq v2, v3, :cond_0

    sget-object v2, Lcom/daaw/yx1;->u:Lcom/daaw/yx1;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    invoke-interface {v0, v2, v3}, Lcom/daaw/ry1;->k(Lcom/daaw/yx1;[Ljava/lang/String;)I

    :cond_0
    invoke-interface {p1, p2}, Lcom/daaw/bt;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public g(Lcom/daaw/ey1;)V
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/ey1;->i()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/ey1;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/ey1;->n()Ljava/util/List;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/daaw/v81;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void
.end method

.method public abstract h()V
.end method

.method public run()V
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/rd;->h()V

    iget-object v0, p0, Lcom/daaw/rd;->p:Lcom/daaw/ru0;

    sget-object v1, Lcom/daaw/qu0;->a:Lcom/daaw/qu0$b$c;

    invoke-virtual {v0, v1}, Lcom/daaw/ru0;->a(Lcom/daaw/qu0$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/rd;->p:Lcom/daaw/ru0;

    new-instance v2, Lcom/daaw/qu0$b$a;

    invoke-direct {v2, v0}, Lcom/daaw/qu0$b$a;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lcom/daaw/ru0;->a(Lcom/daaw/qu0$b;)V

    :goto_0
    return-void
.end method
