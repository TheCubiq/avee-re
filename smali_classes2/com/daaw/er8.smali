.class public final Lcom/daaw/er8;
.super Lcom/daaw/ad2;
.source ""


# instance fields
.field public final r:Z

.field public final s:Z

.field public final synthetic t:Lcom/daaw/js8;


# direct methods
.method public constructor <init>(Lcom/daaw/js8;ZZ)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/er8;->t:Lcom/daaw/js8;

    const-string p1, "log"

    invoke-direct {p0, p1}, Lcom/daaw/ad2;-><init>(Ljava/lang/String;)V

    iput-boolean p2, p0, Lcom/daaw/er8;->r:Z

    iput-boolean p3, p0, Lcom/daaw/er8;->s:Z

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/w07;Ljava/util/List;)Lcom/daaw/gl2;
    .locals 11

    const-string v0, "log"

    const/4 v1, 0x1

    invoke-static {v0, v1, p2}, Lcom/daaw/ou7;->i(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/er8;->t:Lcom/daaw/js8;

    invoke-static {v0}, Lcom/daaw/js8;->c(Lcom/daaw/js8;)Lcom/daaw/zp8;

    move-result-object v3

    const/4 v4, 0x3

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/gl2;

    invoke-virtual {p1, p2}, Lcom/daaw/w07;->b(Lcom/daaw/gl2;)Lcom/daaw/gl2;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/gl2;->zzi()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    iget-boolean v7, p0, Lcom/daaw/er8;->r:Z

    iget-boolean v8, p0, Lcom/daaw/er8;->s:Z

    invoke-interface/range {v3 .. v8}, Lcom/daaw/zp8;->a(ILjava/lang/String;Ljava/util/List;ZZ)V

    :goto_0
    sget-object p1, Lcom/daaw/gl2;->g:Lcom/daaw/gl2;

    return-object p1

    :cond_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/gl2;

    invoke-virtual {p1, v0}, Lcom/daaw/w07;->b(Lcom/daaw/gl2;)Lcom/daaw/gl2;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/gl2;->zzh()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/daaw/ou7;->b(D)I

    move-result v0

    const/4 v2, 0x3

    const/4 v3, 0x5

    const/4 v4, 0x2

    if-eq v0, v4, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v3, :cond_2

    const/4 v5, 0x6

    if-eq v0, v5, :cond_1

    const/4 v6, 0x3

    goto :goto_1

    :cond_1
    const/4 v6, 0x2

    goto :goto_1

    :cond_2
    const/4 v6, 0x5

    goto :goto_1

    :cond_3
    const/4 v6, 0x1

    goto :goto_1

    :cond_4
    const/4 v2, 0x4

    const/4 v6, 0x4

    :goto_1
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/gl2;

    invoke-virtual {p1, v0}, Lcom/daaw/w07;->b(Lcom/daaw/gl2;)Lcom/daaw/gl2;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/gl2;->zzi()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v4, :cond_5

    iget-object p1, p0, Lcom/daaw/er8;->t:Lcom/daaw/js8;

    invoke-static {p1}, Lcom/daaw/js8;->c(Lcom/daaw/js8;)Lcom/daaw/zp8;

    move-result-object v5

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v8

    :goto_2
    iget-boolean v9, p0, Lcom/daaw/er8;->r:Z

    iget-boolean v10, p0, Lcom/daaw/er8;->s:Z

    invoke-interface/range {v5 .. v10}, Lcom/daaw/zp8;->a(ILjava/lang/String;Ljava/util/List;ZZ)V

    goto :goto_0

    :cond_5
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ge v4, v0, :cond_6

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/gl2;

    invoke-virtual {p1, v0}, Lcom/daaw/w07;->b(Lcom/daaw/gl2;)Lcom/daaw/gl2;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/gl2;->zzi()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lcom/daaw/er8;->t:Lcom/daaw/js8;

    invoke-static {p1}, Lcom/daaw/js8;->c(Lcom/daaw/js8;)Lcom/daaw/zp8;

    move-result-object v5

    goto :goto_2
.end method
