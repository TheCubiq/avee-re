.class public abstract Lcom/daaw/n10;
.super Lcom/daaw/bk0;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V::",
        "Ljava/util/List<",
        "TT;>;>",
        "Lcom/daaw/bk0<",
        "TT;TV;>;"
    }
.end annotation


# instance fields
.field public G:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field public H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field public I:Ljava/lang/String;

.field public J:Lcom/daaw/s91$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/s91$b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/r40;Lcom/daaw/w40;Ljava/lang/String;Lcom/daaw/me0;ILcom/daaw/m10;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/r40<",
            "Lcom/daaw/yj;",
            "TV;>;",
            "Lcom/daaw/w40<",
            "TV;>;",
            "Ljava/lang/String;",
            "Lcom/daaw/me0<",
            "Ljava/lang/String;",
            ">;I",
            "Lcom/daaw/m10<",
            "TT;>;I)V"
        }
    .end annotation

    move-object v8, p0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    move/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/daaw/bk0;-><init>(Landroid/content/Context;Lcom/daaw/r40;Lcom/daaw/w40;Ljava/lang/String;Lcom/daaw/me0;II)V

    const/4 v0, 0x0

    iput-object v0, v8, Lcom/daaw/n10;->I:Ljava/lang/String;

    new-instance v0, Lcom/daaw/n10$a;

    invoke-direct {v0, p0}, Lcom/daaw/n10$a;-><init>(Lcom/daaw/n10;)V

    iput-object v0, v8, Lcom/daaw/n10;->J:Lcom/daaw/s91$b;

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object v0

    sget-object v1, Lcom/daaw/yj;->r:Lcom/daaw/xw1;

    invoke-static/range {p8 .. p8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v1, v2, v0, v3}, Lcom/daaw/xw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v1, p1

    move-object/from16 v2, p7

    invoke-virtual {p0, p1, v0, v2}, Lcom/daaw/n10;->W(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/m10;)V

    return-void
.end method


# virtual methods
.method public Q(Z)Lcom/daaw/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/daaw/lo1<",
            "TV;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/n10;->H:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lcom/daaw/bk0;->Q(Z)Lcom/daaw/lo1;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v1, Lcom/daaw/lo1;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/daaw/n10;->I:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/n10;->H:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public U(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/n10;->H:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final V(Ljava/lang/String;Lcom/daaw/m10;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/daaw/m10<",
            "TT;>;TV;)V"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lcom/daaw/s91;

    new-instance v2, Ljava/lang/ref/WeakReference;

    iget-object v3, p0, Lcom/daaw/n10;->J:Lcom/daaw/s91$b;

    invoke-direct {v2, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v1, v0, p3, p2, v2}, Lcom/daaw/s91;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/daaw/m10;Ljava/lang/ref/WeakReference;)V

    sget-object p2, Lcom/daaw/yj;->z:Lcom/daaw/sw1;

    iget p3, p0, Lcom/daaw/yj;->l:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, v1, p3, p1}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/String;

    const/4 p3, 0x0

    aput-object p1, p2, p3

    invoke-virtual {v1, p2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public W(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/m10;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/daaw/m10<",
            "TT;>;)V"
        }
    .end annotation

    const/4 p1, 0x1

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/bk0;->E:Lcom/daaw/w40;

    invoke-interface {v1}, Lcom/daaw/w40;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    iput-object v1, p0, Lcom/daaw/n10;->H:Ljava/util/List;

    iput-object p2, p0, Lcom/daaw/n10;->I:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lcom/daaw/yj;->N(ZZ)V

    iget-object p1, p0, Lcom/daaw/n10;->G:Ljava/util/List;

    if-nez p1, :cond_1

    invoke-super {p0}, Lcom/daaw/bk0;->S()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/n10;->G:Ljava/util/List;

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/bk0;->A()Z

    iget-object p1, p0, Lcom/daaw/n10;->G:Ljava/util/List;

    invoke-virtual {p0, p2, p3, p1}, Lcom/daaw/n10;->V(Ljava/lang/String;Lcom/daaw/m10;Ljava/util/List;)V

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p2, 0x0

    iput-object p2, p0, Lcom/daaw/n10;->H:Ljava/util/List;

    iput-object p2, p0, Lcom/daaw/n10;->I:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/n10;->G:Ljava/util/List;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/yj;->N(ZZ)V

    invoke-virtual {p0}, Lcom/daaw/bk0;->A()Z

    :goto_1
    return-void
.end method
