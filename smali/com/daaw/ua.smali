.class public abstract Lcom/daaw/ua;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/bp0;


# instance fields
.field public final p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/bp0$b;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Lcom/daaw/cp0$a;

.field public r:Lcom/daaw/rz;

.field public s:Lcom/daaw/nl1;

.field public t:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/ua;->p:Ljava/util/ArrayList;

    new-instance v0, Lcom/daaw/cp0$a;

    invoke-direct {v0}, Lcom/daaw/cp0$a;-><init>()V

    iput-object v0, p0, Lcom/daaw/ua;->q:Lcom/daaw/cp0$a;

    return-void
.end method


# virtual methods
.method public final c(Landroid/os/Handler;Lcom/daaw/cp0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ua;->q:Lcom/daaw/cp0$a;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/cp0$a;->a(Landroid/os/Handler;Lcom/daaw/cp0;)V

    return-void
.end method

.method public final f(Lcom/daaw/rz;ZLcom/daaw/bp0$b;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ua;->r:Lcom/daaw/rz;

    if-eqz v0, :cond_1

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lcom/daaw/s6;->a(Z)V

    iget-object v0, p0, Lcom/daaw/ua;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/ua;->r:Lcom/daaw/rz;

    if-nez v0, :cond_2

    iput-object p1, p0, Lcom/daaw/ua;->r:Lcom/daaw/rz;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ua;->m(Lcom/daaw/rz;Z)V

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lcom/daaw/ua;->s:Lcom/daaw/nl1;

    if-eqz p1, :cond_3

    iget-object p2, p0, Lcom/daaw/ua;->t:Ljava/lang/Object;

    invoke-interface {p3, p0, p1, p2}, Lcom/daaw/bp0$b;->d(Lcom/daaw/bp0;Lcom/daaw/nl1;Ljava/lang/Object;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public final h(Lcom/daaw/bp0$b;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ua;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/daaw/ua;->p:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/ua;->r:Lcom/daaw/rz;

    iput-object p1, p0, Lcom/daaw/ua;->s:Lcom/daaw/nl1;

    iput-object p1, p0, Lcom/daaw/ua;->t:Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/daaw/ua;->p()V

    :cond_0
    return-void
.end method

.method public final i(Lcom/daaw/cp0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ua;->q:Lcom/daaw/cp0$a;

    invoke-virtual {v0, p1}, Lcom/daaw/cp0$a;->u(Lcom/daaw/cp0;)V

    return-void
.end method

.method public final j(Lcom/daaw/bp0$a;)Lcom/daaw/cp0$a;
    .locals 4

    iget-object v0, p0, Lcom/daaw/ua;->q:Lcom/daaw/cp0$a;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/daaw/cp0$a;->x(ILcom/daaw/bp0$a;J)Lcom/daaw/cp0$a;

    move-result-object p1

    return-object p1
.end method

.method public final l(Lcom/daaw/bp0$a;J)Lcom/daaw/cp0$a;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lcom/daaw/s6;->a(Z)V

    iget-object v1, p0, Lcom/daaw/ua;->q:Lcom/daaw/cp0$a;

    invoke-virtual {v1, v0, p1, p2, p3}, Lcom/daaw/cp0$a;->x(ILcom/daaw/bp0$a;J)Lcom/daaw/cp0$a;

    move-result-object p1

    return-object p1
.end method

.method public abstract m(Lcom/daaw/rz;Z)V
.end method

.method public final n(Lcom/daaw/nl1;Ljava/lang/Object;)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/ua;->s:Lcom/daaw/nl1;

    iput-object p2, p0, Lcom/daaw/ua;->t:Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/ua;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/bp0$b;

    invoke-interface {v1, p0, p1, p2}, Lcom/daaw/bp0$b;->d(Lcom/daaw/bp0;Lcom/daaw/nl1;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract p()V
.end method
