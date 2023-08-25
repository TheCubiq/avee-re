.class public final Lcom/daaw/fr;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pb0;
.implements Lcom/daaw/jk0$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/fr$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/pb0;",
        "Lcom/daaw/jk0$a<",
        "Lcom/daaw/vv0<",
        "Lcom/daaw/nb0;",
        ">;>;"
    }
.end annotation


# instance fields
.field public A:Lcom/daaw/lb0;

.field public B:Z

.field public C:J

.field public final p:Lcom/daaw/fb0;

.field public final q:Lcom/daaw/vv0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vv0$a<",
            "Lcom/daaw/nb0;",
            ">;"
        }
    .end annotation
.end field

.field public final r:I

.field public final s:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Lcom/daaw/ib0$a;",
            "Lcom/daaw/fr$a;",
            ">;"
        }
    .end annotation
.end field

.field public final t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/pb0$a;",
            ">;"
        }
    .end annotation
.end field

.field public u:Lcom/daaw/cp0$a;

.field public v:Lcom/daaw/jk0;

.field public w:Landroid/os/Handler;

.field public x:Lcom/daaw/pb0$d;

.field public y:Lcom/daaw/ib0;

.field public z:Lcom/daaw/ib0$a;


# direct methods
.method public constructor <init>(Lcom/daaw/fb0;ILcom/daaw/vv0$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/fb0;",
            "I",
            "Lcom/daaw/vv0$a<",
            "Lcom/daaw/nb0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fr;->p:Lcom/daaw/fb0;

    iput p2, p0, Lcom/daaw/fr;->r:I

    iput-object p3, p0, Lcom/daaw/fr;->q:Lcom/daaw/vv0$a;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/fr;->t:Ljava/util/List;

    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Lcom/daaw/fr;->s:Ljava/util/IdentityHashMap;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/fr;->C:J

    return-void
.end method

.method public static B(Lcom/daaw/lb0;Lcom/daaw/lb0;)Lcom/daaw/lb0$a;
    .locals 4

    iget-wide v0, p1, Lcom/daaw/lb0;->h:J

    iget-wide v2, p0, Lcom/daaw/lb0;->h:J

    sub-long/2addr v0, v2

    long-to-int p1, v0

    iget-object p0, p0, Lcom/daaw/lb0;->o:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/lb0$a;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static synthetic n(Lcom/daaw/fr;Lcom/daaw/lb0;Lcom/daaw/lb0;)Lcom/daaw/lb0;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/fr;->C(Lcom/daaw/lb0;Lcom/daaw/lb0;)Lcom/daaw/lb0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/daaw/fr;Lcom/daaw/ib0$a;Lcom/daaw/lb0;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/fr;->L(Lcom/daaw/ib0$a;Lcom/daaw/lb0;)V

    return-void
.end method

.method public static synthetic q(Lcom/daaw/fr;)Lcom/daaw/ib0$a;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fr;->z:Lcom/daaw/ib0$a;

    return-object p0
.end method

.method public static synthetic s(Lcom/daaw/fr;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/fr;->F()Z

    move-result p0

    return p0
.end method

.method public static synthetic t(Lcom/daaw/fr;)Lcom/daaw/fb0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fr;->p:Lcom/daaw/fb0;

    return-object p0
.end method

.method public static synthetic u(Lcom/daaw/fr;)Lcom/daaw/ib0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fr;->y:Lcom/daaw/ib0;

    return-object p0
.end method

.method public static synthetic v(Lcom/daaw/fr;)Lcom/daaw/vv0$a;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fr;->q:Lcom/daaw/vv0$a;

    return-object p0
.end method

.method public static synthetic w(Lcom/daaw/fr;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fr;->w:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic x(Lcom/daaw/fr;)Lcom/daaw/cp0$a;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fr;->u:Lcom/daaw/cp0$a;

    return-object p0
.end method

.method public static synthetic y(Lcom/daaw/fr;Lcom/daaw/ib0$a;Z)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/fr;->H(Lcom/daaw/ib0$a;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic z(Lcom/daaw/fr;)I
    .locals 0

    iget p0, p0, Lcom/daaw/fr;->r:I

    return p0
.end method


# virtual methods
.method public final A(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/ib0$a;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/ib0$a;

    new-instance v3, Lcom/daaw/fr$a;

    invoke-direct {v3, p0, v2}, Lcom/daaw/fr$a;-><init>(Lcom/daaw/fr;Lcom/daaw/ib0$a;)V

    iget-object v4, p0, Lcom/daaw/fr;->s:Ljava/util/IdentityHashMap;

    invoke-virtual {v4, v2, v3}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final C(Lcom/daaw/lb0;Lcom/daaw/lb0;)Lcom/daaw/lb0;
    .locals 2

    invoke-virtual {p2, p1}, Lcom/daaw/lb0;->f(Lcom/daaw/lb0;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean p2, p2, Lcom/daaw/lb0;->l:Z

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/daaw/lb0;->d()Lcom/daaw/lb0;

    move-result-object p1

    :cond_0
    return-object p1

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/daaw/fr;->E(Lcom/daaw/lb0;Lcom/daaw/lb0;)J

    move-result-wide v0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/fr;->D(Lcom/daaw/lb0;Lcom/daaw/lb0;)I

    move-result p1

    invoke-virtual {p2, v0, v1, p1}, Lcom/daaw/lb0;->c(JI)Lcom/daaw/lb0;

    move-result-object p1

    return-object p1
.end method

.method public final D(Lcom/daaw/lb0;Lcom/daaw/lb0;)I
    .locals 3

    iget-boolean v0, p2, Lcom/daaw/lb0;->f:Z

    if-eqz v0, :cond_0

    iget p1, p2, Lcom/daaw/lb0;->g:I

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/fr;->A:Lcom/daaw/lb0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget v0, v0, Lcom/daaw/lb0;->g:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez p1, :cond_2

    return v0

    :cond_2
    invoke-static {p1, p2}, Lcom/daaw/fr;->B(Lcom/daaw/lb0;Lcom/daaw/lb0;)Lcom/daaw/lb0$a;

    move-result-object v2

    if-eqz v2, :cond_3

    iget p1, p1, Lcom/daaw/lb0;->g:I

    iget v0, v2, Lcom/daaw/lb0$a;->s:I

    add-int/2addr p1, v0

    iget-object p2, p2, Lcom/daaw/lb0;->o:Ljava/util/List;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/lb0$a;

    iget p2, p2, Lcom/daaw/lb0$a;->s:I

    sub-int/2addr p1, p2

    return p1

    :cond_3
    return v0
.end method

.method public final E(Lcom/daaw/lb0;Lcom/daaw/lb0;)J
    .locals 8

    iget-boolean v0, p2, Lcom/daaw/lb0;->m:Z

    if-eqz v0, :cond_0

    iget-wide p1, p2, Lcom/daaw/lb0;->e:J

    return-wide p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/fr;->A:Lcom/daaw/lb0;

    if-eqz v0, :cond_1

    iget-wide v0, v0, Lcom/daaw/lb0;->e:J

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    if-nez p1, :cond_2

    return-wide v0

    :cond_2
    iget-object v2, p1, Lcom/daaw/lb0;->o:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {p1, p2}, Lcom/daaw/fr;->B(Lcom/daaw/lb0;Lcom/daaw/lb0;)Lcom/daaw/lb0$a;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-wide p1, p1, Lcom/daaw/lb0;->e:J

    iget-wide v0, v3, Lcom/daaw/lb0$a;->t:J

    add-long/2addr p1, v0

    return-wide p1

    :cond_3
    int-to-long v2, v2

    iget-wide v4, p2, Lcom/daaw/lb0;->h:J

    iget-wide v6, p1, Lcom/daaw/lb0;->h:J

    sub-long/2addr v4, v6

    cmp-long p2, v2, v4

    if-nez p2, :cond_4

    invoke-virtual {p1}, Lcom/daaw/lb0;->e()J

    move-result-wide p1

    return-wide p1

    :cond_4
    return-wide v0
.end method

.method public final F()Z
    .locals 10

    iget-object v0, p0, Lcom/daaw/fr;->y:Lcom/daaw/ib0;

    iget-object v0, v0, Lcom/daaw/ib0;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_1

    iget-object v6, p0, Lcom/daaw/fr;->s:Ljava/util/IdentityHashMap;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/fr$a;

    invoke-static {v6}, Lcom/daaw/fr$a;->b(Lcom/daaw/fr$a;)J

    move-result-wide v7

    cmp-long v9, v2, v7

    if-lez v9, :cond_0

    invoke-static {v6}, Lcom/daaw/fr$a;->c(Lcom/daaw/fr$a;)Lcom/daaw/ib0$a;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/fr;->z:Lcom/daaw/ib0$a;

    invoke-virtual {v6}, Lcom/daaw/fr$a;->g()V

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    return v4
.end method

.method public final G(Lcom/daaw/ib0$a;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fr;->z:Lcom/daaw/ib0$a;

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Lcom/daaw/fr;->y:Lcom/daaw/ib0;

    iget-object v0, v0, Lcom/daaw/ib0;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/fr;->A:Lcom/daaw/lb0;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lcom/daaw/lb0;->l:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/daaw/fr;->z:Lcom/daaw/ib0$a;

    iget-object v0, p0, Lcom/daaw/fr;->s:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/fr$a;

    invoke-virtual {p1}, Lcom/daaw/fr$a;->g()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final H(Lcom/daaw/ib0$a;Z)Z
    .locals 4

    iget-object v0, p0, Lcom/daaw/fr;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v3, p0, Lcom/daaw/fr;->t:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/pb0$a;

    invoke-interface {v3, p1, p2}, Lcom/daaw/pb0$a;->d(Lcom/daaw/ib0$a;Z)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v2
.end method

.method public I(Lcom/daaw/vv0;JJZ)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0<",
            "Lcom/daaw/nb0;",
            ">;JJZ)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/fr;->u:Lcom/daaw/cp0$a;

    iget-object v1, p1, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    invoke-virtual {p1}, Lcom/daaw/vv0;->c()J

    move-result-wide v7

    const/4 v2, 0x4

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v0 .. v8}, Lcom/daaw/cp0$a;->f(Lcom/daaw/pp;IJJJ)V

    return-void
.end method

.method public J(Lcom/daaw/vv0;JJ)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0<",
            "Lcom/daaw/nb0;",
            ">;JJ)V"
        }
    .end annotation

    move-object v0, p0

    invoke-virtual {p1}, Lcom/daaw/vv0;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/nb0;

    instance-of v2, v1, Lcom/daaw/lb0;

    if-eqz v2, :cond_0

    iget-object v3, v1, Lcom/daaw/nb0;->a:Ljava/lang/String;

    invoke-static {v3}, Lcom/daaw/ib0;->d(Ljava/lang/String;)Lcom/daaw/ib0;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v1

    check-cast v3, Lcom/daaw/ib0;

    :goto_0
    iput-object v3, v0, Lcom/daaw/fr;->y:Lcom/daaw/ib0;

    iget-object v4, v3, Lcom/daaw/ib0;->c:Ljava/util/List;

    const/4 v5, 0x0

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/ib0$a;

    iput-object v4, v0, Lcom/daaw/fr;->z:Lcom/daaw/ib0$a;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v5, v3, Lcom/daaw/ib0;->c:Ljava/util/List;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v5, v3, Lcom/daaw/ib0;->d:Ljava/util/List;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v3, v3, Lcom/daaw/ib0;->e:Ljava/util/List;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0, v4}, Lcom/daaw/fr;->A(Ljava/util/List;)V

    iget-object v3, v0, Lcom/daaw/fr;->s:Ljava/util/IdentityHashMap;

    iget-object v4, v0, Lcom/daaw/fr;->z:Lcom/daaw/ib0$a;

    invoke-virtual {v3, v4}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/fr$a;

    if-eqz v2, :cond_1

    check-cast v1, Lcom/daaw/lb0;

    invoke-static {v3, v1}, Lcom/daaw/fr$a;->a(Lcom/daaw/fr$a;Lcom/daaw/lb0;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/daaw/fr$a;->g()V

    :goto_1
    iget-object v4, v0, Lcom/daaw/fr;->u:Lcom/daaw/cp0$a;

    move-object v1, p1

    iget-object v5, v1, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    const/4 v6, 0x4

    invoke-virtual {p1}, Lcom/daaw/vv0;->c()J

    move-result-wide v11

    move-wide v7, p2

    move-wide/from16 v9, p4

    invoke-virtual/range {v4 .. v12}, Lcom/daaw/cp0$a;->i(Lcom/daaw/pp;IJJJ)V

    return-void
.end method

.method public K(Lcom/daaw/vv0;JJLjava/io/IOException;)I
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0<",
            "Lcom/daaw/nb0;",
            ">;JJ",
            "Ljava/io/IOException;",
            ")I"
        }
    .end annotation

    move-object/from16 v9, p6

    instance-of v11, v9, Lcom/daaw/tv0;

    move-object v12, p0

    iget-object v0, v12, Lcom/daaw/fr;->u:Lcom/daaw/cp0$a;

    move-object v1, p1

    iget-object v2, v1, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    invoke-virtual {p1}, Lcom/daaw/vv0;->c()J

    move-result-wide v7

    const/4 v3, 0x4

    move-object v1, v2

    move v2, v3

    move-wide v3, p2

    move-wide/from16 v5, p4

    move v10, v11

    invoke-virtual/range {v0 .. v10}, Lcom/daaw/cp0$a;->l(Lcom/daaw/pp;IJJJLjava/io/IOException;Z)V

    if-eqz v11, :cond_0

    const/4 v0, 0x3

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final L(Lcom/daaw/ib0$a;Lcom/daaw/lb0;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fr;->z:Lcom/daaw/ib0$a;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/daaw/fr;->A:Lcom/daaw/lb0;

    if-nez p1, :cond_0

    iget-boolean p1, p2, Lcom/daaw/lb0;->l:Z

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/fr;->B:Z

    iget-wide v0, p2, Lcom/daaw/lb0;->e:J

    iput-wide v0, p0, Lcom/daaw/fr;->C:J

    :cond_0
    iput-object p2, p0, Lcom/daaw/fr;->A:Lcom/daaw/lb0;

    iget-object p1, p0, Lcom/daaw/fr;->x:Lcom/daaw/pb0$d;

    invoke-interface {p1, p2}, Lcom/daaw/pb0$d;->d(Lcom/daaw/lb0;)V

    :cond_1
    iget-object p1, p0, Lcom/daaw/fr;->t:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_2

    iget-object v0, p0, Lcom/daaw/fr;->t:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/pb0$a;

    invoke-interface {v0}, Lcom/daaw/pb0$a;->h()V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public a()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/fr;->z:Lcom/daaw/ib0$a;

    iput-object v0, p0, Lcom/daaw/fr;->A:Lcom/daaw/lb0;

    iput-object v0, p0, Lcom/daaw/fr;->y:Lcom/daaw/ib0;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lcom/daaw/fr;->C:J

    iget-object v1, p0, Lcom/daaw/fr;->v:Lcom/daaw/jk0;

    invoke-virtual {v1}, Lcom/daaw/jk0;->i()V

    iput-object v0, p0, Lcom/daaw/fr;->v:Lcom/daaw/jk0;

    iget-object v1, p0, Lcom/daaw/fr;->s:Ljava/util/IdentityHashMap;

    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/fr$a;

    invoke-virtual {v2}, Lcom/daaw/fr$a;->p()V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/fr;->w:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/fr;->w:Landroid/os/Handler;

    iget-object v0, p0, Lcom/daaw/fr;->s:Ljava/util/IdentityHashMap;

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->clear()V

    return-void
.end method

.method public b(Landroid/net/Uri;Lcom/daaw/cp0$a;Lcom/daaw/pb0$d;)V
    .locals 3

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/daaw/fr;->w:Landroid/os/Handler;

    iput-object p2, p0, Lcom/daaw/fr;->u:Lcom/daaw/cp0$a;

    iput-object p3, p0, Lcom/daaw/fr;->x:Lcom/daaw/pb0$d;

    new-instance p3, Lcom/daaw/vv0;

    iget-object v0, p0, Lcom/daaw/fr;->p:Lcom/daaw/fb0;

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Lcom/daaw/fb0;->a(I)Lcom/daaw/mp;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/fr;->q:Lcom/daaw/vv0$a;

    invoke-direct {p3, v0, p1, v1, v2}, Lcom/daaw/vv0;-><init>(Lcom/daaw/mp;Landroid/net/Uri;ILcom/daaw/vv0$a;)V

    iget-object p1, p0, Lcom/daaw/fr;->v:Lcom/daaw/jk0;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lcom/daaw/s6;->f(Z)V

    new-instance p1, Lcom/daaw/jk0;

    const-string v0, "DefaultHlsPlaylistTracker:MasterPlaylist"

    invoke-direct {p1, v0}, Lcom/daaw/jk0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/fr;->v:Lcom/daaw/jk0;

    iget v0, p0, Lcom/daaw/fr;->r:I

    invoke-virtual {p1, p3, p0, v0}, Lcom/daaw/jk0;->k(Lcom/daaw/jk0$c;Lcom/daaw/jk0$a;I)J

    move-result-wide v0

    iget-object p1, p3, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    iget p3, p3, Lcom/daaw/vv0;->b:I

    invoke-virtual {p2, p1, p3, v0, v1}, Lcom/daaw/cp0$a;->o(Lcom/daaw/pp;IJ)V

    return-void
.end method

.method public c(Lcom/daaw/pb0$a;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fr;->t:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public d(Lcom/daaw/ib0$a;)Lcom/daaw/lb0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/fr;->s:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/fr$a;

    invoke-virtual {v0}, Lcom/daaw/fr$a;->e()Lcom/daaw/lb0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/fr;->G(Lcom/daaw/ib0$a;)V

    :cond_0
    return-object v0
.end method

.method public e(Lcom/daaw/ib0$a;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fr;->s:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/fr$a;

    invoke-virtual {p1}, Lcom/daaw/fr$a;->g()V

    return-void
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/fr;->C:J

    return-wide v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/fr;->B:Z

    return v0
.end method

.method public h(Lcom/daaw/ib0$a;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fr;->s:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/fr$a;

    invoke-virtual {p1}, Lcom/daaw/fr$a;->i()V

    return-void
.end method

.method public i()Lcom/daaw/ib0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/fr;->y:Lcom/daaw/ib0;

    return-object v0
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fr;->v:Lcom/daaw/jk0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/jk0;->a()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/fr;->z:Lcom/daaw/ib0$a;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lcom/daaw/fr;->h(Lcom/daaw/ib0$a;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic k(Lcom/daaw/jk0$c;JJZ)V
    .locals 0

    check-cast p1, Lcom/daaw/vv0;

    invoke-virtual/range {p0 .. p6}, Lcom/daaw/fr;->I(Lcom/daaw/vv0;JJZ)V

    return-void
.end method

.method public l(Lcom/daaw/pb0$a;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fr;->t:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public m(Lcom/daaw/ib0$a;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/fr;->s:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/fr$a;

    invoke-virtual {p1}, Lcom/daaw/fr$a;->f()Z

    move-result p1

    return p1
.end method

.method public bridge synthetic o(Lcom/daaw/jk0$c;JJ)V
    .locals 0

    check-cast p1, Lcom/daaw/vv0;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/fr;->J(Lcom/daaw/vv0;JJ)V

    return-void
.end method

.method public bridge synthetic r(Lcom/daaw/jk0$c;JJLjava/io/IOException;)I
    .locals 0

    check-cast p1, Lcom/daaw/vv0;

    invoke-virtual/range {p0 .. p6}, Lcom/daaw/fr;->K(Lcom/daaw/vv0;JJLjava/io/IOException;)I

    move-result p1

    return p1
.end method
