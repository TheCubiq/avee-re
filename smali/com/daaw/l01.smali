.class public Lcom/daaw/l01;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zo0;
.implements Lcom/daaw/ce0$a;


# static fields
.field public static t:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static u:Lcom/daaw/uw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/uw1<",
            "Lcom/daaw/lo1<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/vd0;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static v:Lcom/daaw/rw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/rw1<",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/vd0;",
            ">;",
            "Lcom/daaw/be0;",
            ">;"
        }
    .end annotation
.end field

.field public static w:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final x:Ljava/lang/Object;

.field public static volatile y:Lcom/daaw/l01;


# instance fields
.field public p:Lcom/daaw/be0;

.field public q:Lcom/daaw/er0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/vd0;",
            ">;"
        }
    .end annotation
.end field

.field public r:Lcom/daaw/ce0;

.field public s:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/l01;->t:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/uw1;

    invoke-direct {v0}, Lcom/daaw/uw1;-><init>()V

    sput-object v0, Lcom/daaw/l01;->u:Lcom/daaw/uw1;

    new-instance v0, Lcom/daaw/rw1;

    invoke-direct {v0}, Lcom/daaw/rw1;-><init>()V

    sput-object v0, Lcom/daaw/l01;->v:Lcom/daaw/rw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/l01;->w:Lcom/daaw/qw1;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/l01;->x:Ljava/lang/Object;

    const/4 v0, 0x0

    sput-object v0, Lcom/daaw/l01;->y:Lcom/daaw/l01;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/l01;->p:Lcom/daaw/be0;

    new-instance v0, Lcom/daaw/er0;

    invoke-direct {v0}, Lcom/daaw/er0;-><init>()V

    iput-object v0, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    new-instance v0, Lcom/daaw/o01;

    invoke-direct {v0}, Lcom/daaw/o01;-><init>()V

    iput-object v0, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/l01;->s:I

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Lcom/daaw/l01;->T(IZ)V

    invoke-virtual {p0}, Lcom/daaw/l01;->K()V

    return-void
.end method

.method public static c()Lcom/daaw/l01;
    .locals 2

    sget-object v0, Lcom/daaw/l01;->y:Lcom/daaw/l01;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lcom/daaw/l01;->x:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/l01;->y:Lcom/daaw/l01;

    if-nez v1, :cond_1

    new-instance v1, Lcom/daaw/l01;

    invoke-direct {v1}, Lcom/daaw/l01;-><init>()V

    sput-object v1, Lcom/daaw/l01;->y:Lcom/daaw/l01;

    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static f(ILjava/util/List;IIZ)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIZ)I"
        }
    .end annotation

    if-eqz p4, :cond_3

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v0, p2

    if-ne v0, p0, :cond_1

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p0

    add-int/2addr p0, p3

    return p0

    :cond_1
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v0, p3

    if-ne v0, p0, :cond_0

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p0

    add-int/2addr p0, p2

    :cond_2
    return p0

    :cond_3
    if-ltz p3, :cond_7

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    move v0, p0

    :cond_4
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/2addr v2, p3

    if-ge v2, p0, :cond_5

    add-int/lit8 v0, v0, -0x1

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/2addr v2, p3

    if-ne v2, p0, :cond_4

    if-ltz p2, :cond_6

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    add-int/2addr p0, p2

    return p0

    :cond_6
    const/4 p0, -0x1

    return p0

    :cond_7
    move v0, p0

    :cond_8
    if-ltz p2, :cond_a

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    add-int/2addr p3, p2

    if-gt p3, p0, :cond_9

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_a
    return v0
.end method

.method public static g(III)I
    .locals 0

    if-ge p0, p1, :cond_0

    return p0

    :cond_0
    add-int/2addr p0, p2

    if-gt p0, p1, :cond_1

    const/4 p0, -0x1

    :cond_1
    return p0
.end method

.method public static h(IIIIZ)I
    .locals 0

    if-eqz p4, :cond_2

    if-ne p0, p2, :cond_0

    return p1

    :cond_0
    if-ne p0, p1, :cond_1

    return p2

    :cond_1
    return p0

    :cond_2
    if-ge p0, p1, :cond_3

    return p0

    :cond_3
    sub-int/2addr p2, p1

    add-int/lit8 p2, p2, 0x1

    mul-int p3, p3, p2

    add-int/2addr p0, p3

    if-gt p0, p1, :cond_4

    const/4 p0, -0x1

    :cond_4
    return p0
.end method

.method public static i(ILjava/util/List;I)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_0
    if-ltz p1, :cond_1

    add-int v0, p1, p2

    if-ne v0, p0, :cond_0

    add-int/lit8 p0, p0, -0x1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    if-gez p0, :cond_2

    const/4 p0, 0x0

    :cond_2
    return p0
.end method

.method public static j(II)I
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p0, v0, p1}, Lcom/daaw/l01;->i(ILjava/util/List;I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public A(Ljava/util/List;IIZLcom/daaw/be0;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIZ",
            "Lcom/daaw/be0;",
            ")V"
        }
    .end annotation

    iput-object p5, p0, Lcom/daaw/l01;->p:Lcom/daaw/be0;

    iget-object v0, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    iget-object p5, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {p5}, Lcom/daaw/er0;->size()I

    move-result v5

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/daaw/ce0;->c(Ljava/util/List;IIZI)Z

    return-void
.end method

.method public B(IZZLjava/lang/Object;)V
    .locals 7

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v0}, Lcom/daaw/er0;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v0, p1}, Lcom/daaw/er0;->n(I)Lcom/daaw/lo1;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v2, v0

    sget-object v1, Lcom/daaw/l01;->u:Lcom/daaw/uw1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object v6, p4

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/uw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public C(Lcom/daaw/tx0;ZZLjava/lang/Object;)V
    .locals 6

    new-instance v1, Lcom/daaw/lo1;

    new-instance v0, Lcom/daaw/q01;

    const/4 v2, -0x1

    invoke-direct {v0, v2}, Lcom/daaw/q01;-><init>(I)V

    invoke-direct {v1, p1, v0}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/daaw/l01;->u:Lcom/daaw/uw1;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/uw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public D(Ljava/util/Collection;IILcom/daaw/be0;Ljava/lang/Object;IZ)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/daaw/tx0;",
            ">;II",
            "Lcom/daaw/be0;",
            "Ljava/lang/Object;",
            "IZ)V"
        }
    .end annotation

    move-object v7, p0

    move v0, p3

    const v1, 0x7fffffff

    const/4 v8, 0x0

    const/4 v2, -0x1

    const/4 v9, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_1

    :cond_0
    if-nez v0, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    if-ne v0, v9, :cond_2

    :goto_0
    const v2, 0x7fffffff

    goto :goto_1

    :cond_2
    const/4 v3, 0x2

    if-ne v0, v3, :cond_3

    iget-object v0, v7, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    invoke-interface {v0, v9}, Lcom/daaw/ce0;->i(Z)I

    move-result v0

    add-int/2addr v0, v9

    move v2, v0

    goto :goto_1

    :cond_3
    const/4 v3, 0x3

    if-ne v0, v3, :cond_4

    goto :goto_0

    :cond_4
    :goto_1
    if-gez v2, :cond_5

    const/4 v3, 0x1

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move/from16 v5, p6

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/l01;->b(Ljava/util/Collection;IZLcom/daaw/be0;IZ)I

    move-result v0

    if-ltz p2, :cond_6

    iget-object v1, v7, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    add-int/2addr v0, p2

    invoke-interface {v1, v0}, Lcom/daaw/ce0;->l(I)V

    iget-object v0, v7, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    invoke-interface {v0, v9}, Lcom/daaw/ce0;->i(Z)I

    move-result v0

    move-object v1, p5

    invoke-virtual {p0, v0, v8, v9, p5}, Lcom/daaw/l01;->B(IZZLjava/lang/Object;)V

    :cond_6
    return-void
.end method

.method public E(Ljava/util/List;IILcom/daaw/be0;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;II",
            "Lcom/daaw/be0;",
            ")V"
        }
    .end annotation

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/l01;->D(Ljava/util/Collection;IILcom/daaw/be0;Ljava/lang/Object;IZ)V

    return-void
.end method

.method public F(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/ce0;->i(Z)I

    move-result v0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v1, p1}, Lcom/daaw/l01;->B(IZZLjava/lang/Object;)V

    return-void
.end method

.method public G(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    invoke-interface {v0}, Lcom/daaw/ce0;->j()V

    iget-object v0, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/ce0;->i(Z)I

    move-result v0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v1, p1}, Lcom/daaw/l01;->B(IZZLjava/lang/Object;)V

    return-void
.end method

.method public H()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/l01;->I(Ljava/lang/Object;)V

    return-void
.end method

.method public I(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    invoke-interface {v0}, Lcom/daaw/ce0;->g()V

    iget-object v0, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/ce0;->i(Z)I

    move-result v0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v1, p1}, Lcom/daaw/l01;->B(IZZLjava/lang/Object;)V

    return-void
.end method

.method public J(Ljava/util/List;ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;I",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    if-ltz p2, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/tx0;

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/daaw/l01;->C(Lcom/daaw/tx0;ZZLjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public K()V
    .locals 14

    const-string v0, "reloadQueue"

    invoke-static {v0}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/j5;->p(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "queue"

    const-string v3, ""

    invoke-static {v1, v2, v3}, Lcom/daaw/j5;->P(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "queueSizes"

    invoke-static {v1, v4, v3}, Lcom/daaw/j5;->P(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    iget-object v7, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v7}, Lcom/daaw/er0;->clear()V

    const/4 v7, 0x1

    if-le v5, v7, :cond_3

    if-lez v6, :cond_3

    const-string v5, ","

    invoke-virtual {v3, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v5, v3

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_2
    if-ge v6, v5, :cond_3

    aget-object v9, v3, v6

    invoke-static {v9}, Lcom/daaw/br1;->w(Ljava/lang/String;)I

    move-result v9

    add-int/2addr v9, v8

    invoke-virtual {v2, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    iget-object v10, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    new-instance v11, Lcom/daaw/tx0;

    invoke-direct {v11, v8}, Lcom/daaw/tx0;-><init>(Ljava/lang/String;)V

    new-instance v8, Lcom/daaw/q01;

    invoke-direct {v8}, Lcom/daaw/q01;-><init>()V

    invoke-virtual {v10, v11, v8}, Lcom/daaw/er0;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    move v8, v9

    goto :goto_2

    :cond_3
    iget-object v2, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v2}, Lcom/daaw/er0;->size()I

    move-result v2

    if-nez v2, :cond_4

    sget-object v2, Lcom/daaw/l01;->t:Lcom/daaw/vw1;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x1e

    invoke-static {v0, v2}, Lcom/daaw/dr1;->b(Landroid/content/Context;I)Ljava/util/List;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMostRecentTrackListByCount: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/tx0;

    iget-object v3, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    new-instance v5, Lcom/daaw/q01;

    invoke-direct {v5}, Lcom/daaw/q01;-><init>()V

    invoke-virtual {v3, v2, v5}, Lcom/daaw/er0;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    const-string v0, "curpos"

    invoke-static {v1, v0, v4}, Lcom/daaw/j5;->M(Landroid/content/SharedPreferences;Ljava/lang/String;I)I

    move-result v0

    iget-object v2, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    invoke-interface {v2, v0}, Lcom/daaw/ce0;->l(I)V

    const-string v0, "shufflemode"

    invoke-static {v1, v0, v4}, Lcom/daaw/j5;->M(Landroid/content/SharedPreferences;Ljava/lang/String;I)I

    move-result v0

    if-eq v0, v7, :cond_5

    const/4 v0, 0x0

    :cond_5
    invoke-virtual {p0, v0, v4, v7}, Lcom/daaw/l01;->U(IZZ)V

    const/4 v9, 0x0

    iget-object v0, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v0}, Lcom/daaw/er0;->size()I

    move-result v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v8, p0

    invoke-virtual/range {v8 .. v13}, Lcom/daaw/l01;->y(IIIZLcom/daaw/be0;)V

    return-void
.end method

.method public L(I)V
    .locals 6

    new-instance v1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v0, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v0}, Lcom/daaw/er0;->r()Lcom/daaw/er0$c;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/daaw/er0$c;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lcom/daaw/er0$c;->nextIndex()I

    move-result v2

    invoke-virtual {v0}, Lcom/daaw/er0$c;->b()Lcom/daaw/lo1;

    move-result-object v3

    iget-object v3, v3, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v3, Lcom/daaw/vd0;

    invoke-interface {v3}, Lcom/daaw/vd0;->c()I

    move-result v3

    if-ne p1, v3, :cond_0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lcom/daaw/er0$c;->remove()V

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/l01;->A(Ljava/util/List;IIZLcom/daaw/be0;)V

    return-void
.end method

.method public M(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/vd0;",
            ">;)V"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/vd0;

    iget-object v2, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v2}, Lcom/daaw/er0;->r()Lcom/daaw/er0$c;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-virtual {v2}, Lcom/daaw/er0$c;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/daaw/er0$c;->nextIndex()I

    move-result v3

    invoke-virtual {v2}, Lcom/daaw/er0$c;->b()Lcom/daaw/lo1;

    move-result-object v4

    iget-object v4, v4, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Lcom/daaw/er0$c;->remove()V

    goto :goto_0

    :cond_2
    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/l01;->A(Ljava/util/List;IIZLcom/daaw/be0;)V

    return-void
.end method

.method public final N(Landroid/content/Context;)V
    .locals 5

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/j5;->p(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v2}, Lcom/daaw/er0;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    iget-object v4, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v4, v3}, Lcom/daaw/er0;->o(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/tx0;

    invoke-virtual {v4}, Lcom/daaw/tx0;->g()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v4, 0x2c

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "queue"

    invoke-interface {p1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "queueSizes"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    invoke-interface {v0}, Lcom/daaw/ce0;->a()I

    move-result v0

    const-string v1, "curpos"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    iget v0, p0, Lcom/daaw/l01;->s:I

    const-string v1, "shufflemode"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public O(Lcom/daaw/vd0;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/l01;->P(Lcom/daaw/vd0;Ljava/lang/Object;)V

    return-void
.end method

.method public P(Lcom/daaw/vd0;Ljava/lang/Object;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Lcom/daaw/vd0;->a()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/l01;->e(Lcom/daaw/vd0;I)I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/l01;->S(ILjava/lang/Object;)V

    return-void
.end method

.method public Q(Lcom/daaw/vd0;I)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/daaw/vd0;->c()I

    move-result v0

    if-eq v0, p2, :cond_0

    invoke-interface {p1, p2}, Lcom/daaw/vd0;->b(I)V

    invoke-virtual {p0}, Lcom/daaw/l01;->w()V

    :cond_0
    return-void
.end method

.method public R(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/l01;->S(ILjava/lang/Object;)V

    return-void
.end method

.method public S(ILjava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    invoke-interface {v0, p1}, Lcom/daaw/ce0;->b(I)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/daaw/l01;->B(IZZLjava/lang/Object;)V

    return-void
.end method

.method public T(IZ)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/l01;->U(IZZ)V

    return-void
.end method

.method public U(IZZ)V
    .locals 6

    if-nez p3, :cond_0

    iget p3, p0, Lcom/daaw/l01;->s:I

    if-ne p3, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/daaw/l01;->s:I

    iget-object p1, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    const/4 p3, 0x0

    const/4 v0, 0x1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-interface {p1, v0}, Lcom/daaw/ce0;->i(Z)I

    move-result p1

    :goto_0
    iget v1, p0, Lcom/daaw/l01;->s:I

    if-nez v1, :cond_2

    new-instance p3, Lcom/daaw/o01;

    invoke-direct {p3}, Lcom/daaw/o01;-><init>()V

    iput-object p3, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    invoke-virtual {p3, p1, p0}, Lcom/daaw/o01;->n(ILcom/daaw/ce0$a;)V

    if-eqz p2, :cond_8

    invoke-static {}, Lcom/daaw/dx0;->b()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_8

    const p2, 0x7f1001eb

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_5

    :cond_2
    if-ne v1, v0, :cond_8

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v2}, Lcom/daaw/er0;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    if-gez p1, :cond_3

    const/4 v3, 0x0

    goto :goto_1

    :cond_3
    move v3, p1

    :goto_1
    iget-object v4, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v4}, Lcom/daaw/er0;->size()I

    move-result v4

    if-le v3, v4, :cond_4

    iget-object v3, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v3}, Lcom/daaw/er0;->size()I

    move-result v3

    sub-int/2addr v3, v0

    :cond_4
    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v3, v0

    :goto_3
    iget-object v4, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v4}, Lcom/daaw/er0;->size()I

    move-result v4

    if-ge v3, v4, :cond_6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_6
    invoke-static {v2}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    const/4 v3, 0x0

    :goto_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_7

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_7
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_8

    new-instance v3, Lcom/daaw/p01;

    invoke-direct {v3}, Lcom/daaw/p01;-><init>()V

    iput-object v3, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    invoke-virtual {v3, p1, v1, p0}, Lcom/daaw/p01;->m(ILjava/util/List;Lcom/daaw/ce0$a;)V

    if-eqz p2, :cond_8

    invoke-virtual {p0}, Lcom/daaw/l01;->n()Landroid/content/res/Resources;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {p0}, Lcom/daaw/l01;->n()Landroid/content/res/Resources;

    move-result-object p2

    const v1, 0x7f0e0014

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, p3

    invoke-virtual {p2, v1, p1, v0}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_5
    invoke-virtual {p0, p1}, Lcom/daaw/l01;->v(Ljava/lang/String;)V

    :cond_8
    invoke-virtual {p0}, Lcom/daaw/l01;->w()V

    sget-object p1, Lcom/daaw/l01;->w:Lcom/daaw/qw1;

    iget p2, p0, Lcom/daaw/l01;->s:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/daaw/ce0;ZZ)V
    .locals 4

    iget-object p2, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {p2}, Lcom/daaw/er0;->size()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    iget-object v2, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v2, v1}, Lcom/daaw/er0;->p(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/q01;

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Lcom/daaw/q01;->d(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {p2}, Lcom/daaw/er0;->size()I

    move-result p2

    invoke-interface {p1, p2}, Lcom/daaw/ce0;->d(I)I

    move-result p2

    const/4 v1, 0x0

    :goto_1
    if-ge v1, p2, :cond_2

    iget-object v2, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v2}, Lcom/daaw/er0;->size()I

    move-result v2

    invoke-interface {p1, v1, v2}, Lcom/daaw/ce0;->f(II)I

    move-result v2

    iget-object v3, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v3}, Lcom/daaw/er0;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v3, v2}, Lcom/daaw/er0;->p(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/q01;

    invoke-virtual {v2, v1}, Lcom/daaw/q01;->d(I)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/l01;->w()V

    if-eqz p3, :cond_3

    iget-object p1, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    const/4 p2, 0x1

    invoke-interface {p1, p2}, Lcom/daaw/ce0;->i(Z)I

    move-result p1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, v0, v0, p2}, Lcom/daaw/l01;->B(IZZLjava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public final b(Ljava/util/Collection;IZLcom/daaw/be0;IZ)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/daaw/tx0;",
            ">;IZ",
            "Lcom/daaw/be0;",
            "IZ)I"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    iget-object p2, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {p2}, Lcom/daaw/er0;->clear()V

    const/4 p2, 0x0

    :cond_0
    iget-object v1, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v1}, Lcom/daaw/er0;->size()I

    move-result v1

    if-le p2, v1, :cond_1

    iget-object p2, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {p2}, Lcom/daaw/er0;->size()I

    move-result p2

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    new-instance v2, Lcom/daaw/q01;

    invoke-direct {v2, p5}, Lcom/daaw/q01;-><init>(I)V

    invoke-interface {v1, v0, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-object p5, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {p5, p2, p1, v1}, Lcom/daaw/er0;->h(ILjava/util/Collection;Ljava/util/Collection;)Z

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    if-eqz p3, :cond_3

    add-int v3, p2, p1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x1

    move-object v1, p0

    move v2, p2

    move-object v6, p4

    goto :goto_1

    :cond_3
    add-int/2addr p1, p2

    add-int/lit8 v3, p1, -0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move v2, p2

    :goto_1
    move v8, p6

    invoke-virtual/range {v1 .. v8}, Lcom/daaw/l01;->z(IIIZLcom/daaw/be0;ZZ)V

    return p2
.end method

.method public d(Ljava/util/Collection;II)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/daaw/tx0;",
            ">;II)V"
        }
    .end annotation

    const/4 v2, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v6, p3

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/l01;->D(Ljava/util/Collection;IILcom/daaw/be0;Ljava/lang/Object;IZ)V

    return-void
.end method

.method public final e(Lcom/daaw/vd0;I)I
    .locals 3

    const/4 v0, -0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-ltz p2, :cond_1

    iget-object v1, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v1}, Lcom/daaw/er0;->size()I

    move-result v1

    if-ge p2, v1, :cond_1

    iget-object v1, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v1, p2}, Lcom/daaw/er0;->n(I)Lcom/daaw/lo1;

    move-result-object v1

    iget-object v1, v1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    if-eqz v1, :cond_1

    check-cast v1, Lcom/daaw/vd0;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return p2

    :cond_1
    iget-object p2, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {p2}, Lcom/daaw/er0;->r()Lcom/daaw/er0$c;

    move-result-object p2

    :cond_2
    invoke-virtual {p2}, Lcom/daaw/er0$c;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p2}, Lcom/daaw/er0$c;->nextIndex()I

    move-result v1

    invoke-virtual {p2}, Lcom/daaw/er0$c;->b()Lcom/daaw/lo1;

    move-result-object v2

    iget-object v2, v2, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    if-eqz v2, :cond_2

    check-cast v2, Lcom/daaw/vd0;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return v1

    :cond_3
    return v0
.end method

.method public k()Lcom/daaw/lo1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/lo1<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/vd0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/ce0;->i(Z)I

    move-result v0

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v1}, Lcom/daaw/er0;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v1, v0}, Lcom/daaw/er0;->n(I)Lcom/daaw/lo1;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public l()Lcom/daaw/er0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/vd0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v0}, Lcom/daaw/er0;->v()Lcom/daaw/er0;

    move-result-object v0

    return-object v0
.end method

.method public m()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/ce0;->i(Z)I

    move-result v0

    return v0
.end method

.method public final n()Landroid/content/res/Resources;
    .locals 1

    invoke-static {}, Lcom/daaw/dx0;->b()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public o()I
    .locals 1

    iget v0, p0, Lcom/daaw/l01;->s:I

    return v0
.end method

.method public p()Lcom/daaw/be0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/l01;->p:Lcom/daaw/be0;

    return-object v0
.end method

.method public q()Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/daaw/ce0;->h(Z)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    iget-object v2, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v2}, Lcom/daaw/er0;->size()I

    move-result v2

    if-lt v0, v2, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public r(IILjava/util/List;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I)V"
        }
    .end annotation

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/daaw/lo1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    new-instance v4, Lcom/daaw/lo1;

    iget-object v5, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    add-int/2addr v3, p1

    invoke-virtual {v5, v3}, Lcom/daaw/er0;->o(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/tx0;

    iget-object v6, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v6, v3}, Lcom/daaw/er0;->p(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/vd0;

    invoke-direct {v4, v5, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v4, v0, v2

    aget-object v3, v0, v2

    iget-object v3, v3, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v3, Lcom/daaw/vd0;

    invoke-interface {v3, p4}, Lcom/daaw/vd0;->b(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p4

    add-int/lit8 p4, p4, -0x1

    :goto_1
    if-ltz p4, :cond_1

    invoke-interface {p3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    add-int/2addr v2, p1

    invoke-virtual {v3, v2}, Lcom/daaw/er0;->s(I)Lcom/daaw/lo1;

    add-int/lit8 p4, p4, -0x1

    goto :goto_1

    :cond_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p4

    add-int/lit8 p4, p4, -0x1

    :goto_2
    if-ltz p4, :cond_2

    invoke-interface {p3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v3}, Lcom/daaw/er0;->size()I

    move-result v3

    add-int/2addr v2, p2

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget-object v3, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    aget-object v4, v0, p4

    invoke-virtual {v3, v2, v4}, Lcom/daaw/er0;->d(ILcom/daaw/lo1;)V

    add-int/lit8 p4, p4, -0x1

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p3

    move v4, p2

    move v5, p1

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/l01;->A(Ljava/util/List;IIZLcom/daaw/be0;)V

    return-void
.end method

.method public s(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    iget-object v1, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v1}, Lcom/daaw/er0;->size()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/daaw/ce0;->e(I)Z

    move-result v0

    iget-object v1, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/daaw/ce0;->i(Z)I

    move-result v1

    invoke-virtual {p0, v1, v0, v2, p1}, Lcom/daaw/l01;->B(IZZLjava/lang/Object;)V

    return-void
.end method

.method public t()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/l01;->u(Ljava/lang/Object;)V

    return-void
.end method

.method public u(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/l01;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/l01;->G(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/l01;->s(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final v(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    invoke-virtual {v0, p1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final w()V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/l01;->l()Lcom/daaw/er0;

    move-result-object v0

    sget-object v1, Lcom/daaw/l01;->v:Lcom/daaw/rw1;

    iget-object v2, p0, Lcom/daaw/l01;->p:Lcom/daaw/be0;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public x(Landroid/content/Context;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/l01;->N(Landroid/content/Context;)V

    return-void
.end method

.method public y(IIIZLcom/daaw/be0;)V
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/l01;->z(IIIZLcom/daaw/be0;ZZ)V

    return-void
.end method

.method public z(IIIZLcom/daaw/be0;ZZ)V
    .locals 7

    iput-object p5, p0, Lcom/daaw/l01;->p:Lcom/daaw/be0;

    if-le p1, p2, :cond_0

    return-void

    :cond_0
    const/4 p5, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    :cond_1
    iget-object v0, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v0}, Lcom/daaw/er0;->size()I

    move-result v0

    const/4 v6, 0x1

    if-lt p2, v0, :cond_2

    iget-object p2, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {p2}, Lcom/daaw/er0;->size()I

    move-result p2

    sub-int/2addr p2, v6

    :cond_2
    if-eqz p6, :cond_3

    invoke-virtual {p0, p5, v6}, Lcom/daaw/l01;->T(IZ)V

    :cond_3
    iget-object v0, p0, Lcom/daaw/l01;->r:Lcom/daaw/ce0;

    iget-object v1, p0, Lcom/daaw/l01;->q:Lcom/daaw/er0;

    invoke-virtual {v1}, Lcom/daaw/er0;->size()I

    move-result v5

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/daaw/ce0;->k(IIIZI)Z

    if-nez p4, :cond_6

    if-eqz p7, :cond_6

    sub-int/2addr p2, p1

    add-int/2addr p2, v6

    invoke-virtual {p0}, Lcom/daaw/l01;->n()Landroid/content/res/Resources;

    move-result-object p1

    if-eqz p1, :cond_6

    if-ne p3, v6, :cond_4

    invoke-virtual {p0}, Lcom/daaw/l01;->n()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f0e000f

    new-array p4, v6, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    aput-object p6, p4, p5

    invoke-virtual {p1, p3, p2, p4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    sget-object p2, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    invoke-virtual {p2, p1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    const/4 p1, -0x1

    if-ne p3, p1, :cond_5

    invoke-virtual {p0}, Lcom/daaw/l01;->n()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f0e0012

    new-array p4, v6, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    aput-object p6, p4, p5

    invoke-virtual {p1, p3, p2, p4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_5
    if-nez p3, :cond_6

    if-eqz p6, :cond_6

    invoke-virtual {p0}, Lcom/daaw/l01;->n()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f0e0011

    new-array p4, v6, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    aput-object p6, p4, p5

    invoke-virtual {p1, p3, p2, p4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_6
    :goto_1
    return-void
.end method
