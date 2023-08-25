.class public final Lcom/daaw/qb8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/j47;

.field public b:Ljava/util/List;

.field public c:Ljava/util/List;

.field public d:J

.field public final synthetic e:Lcom/daaw/yb8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/yb8;Lcom/daaw/nb8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qb8;->e:Lcom/daaw/yb8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final b(Lcom/daaw/it6;)J
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/it6;->G()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    div-long/2addr v0, v2

    div-long/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public final a(JLcom/daaw/it6;)Z
    .locals 7

    invoke-static {p3}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/qb8;->c:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/qb8;->c:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lcom/daaw/qb8;->b:Ljava/util/List;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/qb8;->b:Ljava/util/List;

    :cond_1
    iget-object v0, p0, Lcom/daaw/qb8;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/qb8;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/it6;

    invoke-static {v0}, Lcom/daaw/qb8;->b(Lcom/daaw/it6;)J

    move-result-wide v2

    invoke-static {p3}, Lcom/daaw/qb8;->b(Lcom/daaw/it6;)J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    return v1

    :cond_3
    :goto_0
    iget-wide v2, p0, Lcom/daaw/qb8;->d:J

    invoke-virtual {p3}, Lcom/daaw/ja8;->c()I

    move-result v0

    int-to-long v4, v0

    add-long/2addr v2, v4

    iget-object v0, p0, Lcom/daaw/qb8;->e:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->U()Lcom/daaw/qa2;

    sget-object v0, Lcom/daaw/m75;->j:Lcom/daaw/j65;

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Lcom/daaw/j65;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-long v5, v0

    cmp-long v0, v2, v5

    if-ltz v0, :cond_4

    return v1

    :cond_4
    iput-wide v2, p0, Lcom/daaw/qb8;->d:J

    iget-object v0, p0, Lcom/daaw/qb8;->c:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p3, p0, Lcom/daaw/qb8;->b:Ljava/util/List;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/daaw/qb8;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iget-object p2, p0, Lcom/daaw/qb8;->e:Lcom/daaw/yb8;

    invoke-virtual {p2}, Lcom/daaw/yb8;->U()Lcom/daaw/qa2;

    sget-object p2, Lcom/daaw/m75;->k:Lcom/daaw/j65;

    invoke-virtual {p2, v4}, Lcom/daaw/j65;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 p3, 0x1

    invoke-static {p3, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lt p1, p2, :cond_5

    return v1

    :cond_5
    return p3
.end method
