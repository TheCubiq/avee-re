.class public final Lcom/daaw/cw2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/yv2;


# instance fields
.field public final p:[Lcom/daaw/yv2;

.field public final q:Ljava/util/ArrayList;

.field public final r:Lcom/daaw/lq2;

.field public s:Lcom/daaw/xv2;

.field public t:Lcom/daaw/mq2;

.field public u:I

.field public v:Lcom/daaw/bw2;


# direct methods
.method public varargs constructor <init>([Lcom/daaw/yv2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cw2;->p:[Lcom/daaw/yv2;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/daaw/cw2;->q:Ljava/util/ArrayList;

    new-instance p1, Lcom/daaw/lq2;

    invoke-direct {p1}, Lcom/daaw/lq2;-><init>()V

    iput-object p1, p0, Lcom/daaw/cw2;->r:Lcom/daaw/lq2;

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/cw2;->u:I

    return-void
.end method

.method public static bridge synthetic d(Lcom/daaw/cw2;ILcom/daaw/mq2;Ljava/lang/Object;)V
    .locals 3

    iget-object p3, p0, Lcom/daaw/cw2;->v:Lcom/daaw/bw2;

    const/4 v0, 0x0

    if-nez p3, :cond_3

    const/4 p3, 0x0

    const/4 v1, 0x0

    :goto_0
    if-gtz v1, :cond_0

    iget-object v2, p0, Lcom/daaw/cw2;->r:Lcom/daaw/lq2;

    invoke-virtual {p2, v1, v2, p3}, Lcom/daaw/mq2;->g(ILcom/daaw/lq2;Z)Lcom/daaw/lq2;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget p3, p0, Lcom/daaw/cw2;->u:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-ne p3, v1, :cond_2

    iput v2, p0, Lcom/daaw/cw2;->u:I

    :cond_1
    move-object p3, v0

    goto :goto_1

    :cond_2
    if-eq p3, v2, :cond_1

    new-instance p3, Lcom/daaw/bw2;

    invoke-direct {p3, v2}, Lcom/daaw/bw2;-><init>(I)V

    :goto_1
    iput-object p3, p0, Lcom/daaw/cw2;->v:Lcom/daaw/bw2;

    :cond_3
    iget-object p3, p0, Lcom/daaw/cw2;->v:Lcom/daaw/bw2;

    if-eqz p3, :cond_4

    goto :goto_2

    :cond_4
    iget-object p3, p0, Lcom/daaw/cw2;->q:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/cw2;->p:[Lcom/daaw/yv2;

    aget-object v1, v1, p1

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    if-nez p1, :cond_5

    iput-object p2, p0, Lcom/daaw/cw2;->t:Lcom/daaw/mq2;

    :cond_5
    iget-object p1, p0, Lcom/daaw/cw2;->q:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/daaw/cw2;->s:Lcom/daaw/xv2;

    iget-object p0, p0, Lcom/daaw/cw2;->t:Lcom/daaw/mq2;

    invoke-interface {p1, p0, v0}, Lcom/daaw/xv2;->d(Lcom/daaw/mq2;Ljava/lang/Object;)V

    :cond_6
    :goto_2
    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/wv2;)V
    .locals 3

    check-cast p1, Lcom/daaw/zv2;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/cw2;->p:[Lcom/daaw/yv2;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    iget-object v2, p1, Lcom/daaw/zv2;->p:[Lcom/daaw/wv2;

    aget-object v2, v2, v0

    invoke-interface {v1, v2}, Lcom/daaw/yv2;->a(Lcom/daaw/wv2;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(Lcom/daaw/op2;ZLcom/daaw/xv2;)V
    .locals 2

    iput-object p3, p0, Lcom/daaw/cw2;->s:Lcom/daaw/xv2;

    const/4 p2, 0x0

    const/4 p3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/daaw/cw2;->p:[Lcom/daaw/yv2;

    array-length v1, v0

    if-ge p3, v1, :cond_0

    aget-object v0, v0, p3

    new-instance v1, Lcom/daaw/aw2;

    invoke-direct {v1, p0, p3}, Lcom/daaw/aw2;-><init>(Lcom/daaw/cw2;I)V

    invoke-interface {v0, p1, p2, v1}, Lcom/daaw/yv2;->b(Lcom/daaw/op2;ZLcom/daaw/xv2;)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c(ILcom/daaw/nx2;)Lcom/daaw/wv2;
    .locals 4

    iget-object v0, p0, Lcom/daaw/cw2;->p:[Lcom/daaw/yv2;

    array-length v0, v0

    new-array v1, v0, [Lcom/daaw/wv2;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, Lcom/daaw/cw2;->p:[Lcom/daaw/yv2;

    aget-object v3, v3, v2

    invoke-interface {v3, p1, p2}, Lcom/daaw/yv2;->c(ILcom/daaw/nx2;)Lcom/daaw/wv2;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/daaw/zv2;

    invoke-direct {p1, v1}, Lcom/daaw/zv2;-><init>([Lcom/daaw/wv2;)V

    return-object p1
.end method

.method public final zza()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/cw2;->v:Lcom/daaw/bw2;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/cw2;->p:[Lcom/daaw/yv2;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-interface {v3}, Lcom/daaw/yv2;->zza()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public final zzd()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/cw2;->p:[Lcom/daaw/yv2;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-interface {v3}, Lcom/daaw/yv2;->zzd()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
