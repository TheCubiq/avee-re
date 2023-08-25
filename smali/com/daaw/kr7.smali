.class public final Lcom/daaw/kr7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/iu7;


# instance fields
.field public final a:Lcom/daaw/jr7;

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Lcom/daaw/jr7;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/kr7;->d:I

    const-string v0, "input"

    invoke-static {p1, v0}, Lcom/daaw/vs7;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    iput-object p0, p1, Lcom/daaw/jr7;->c:Lcom/daaw/kr7;

    return-void
.end method

.method public static A(Lcom/daaw/jr7;)Lcom/daaw/kr7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jr7;->c:Lcom/daaw/kr7;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/daaw/kr7;

    invoke-direct {v0, p0}, Lcom/daaw/kr7;-><init>(Lcom/daaw/jr7;)V

    return-object v0
.end method

.method public static final y(I)V
    .locals 0

    and-int/lit8 p0, p0, 0x3

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/daaw/xs7;->g()Lcom/daaw/xs7;

    move-result-object p0

    throw p0
.end method

.method public static final z(I)V
    .locals 0

    and-int/lit8 p0, p0, 0x7

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/daaw/xs7;->g()Lcom/daaw/xs7;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final a(Ljava/util/List;Lcom/daaw/cv7;Lcom/daaw/vr7;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-interface {p2}, Lcom/daaw/cv7;->zze()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1, p2, p3}, Lcom/daaw/kr7;->u(Ljava/lang/Object;Lcom/daaw/cv7;Lcom/daaw/vr7;)V

    invoke-interface {p2, v1}, Lcom/daaw/cv7;->b(Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->b()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/daaw/kr7;->d:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->r()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, Lcom/daaw/kr7;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final b(Ljava/util/List;)V
    .locals 2

    instance-of v0, p1, Lcom/daaw/ms7;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/daaw/ms7;

    iget p1, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->s()I

    move-result p1

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->m()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/ms7;->i(I)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->k()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/daaw/kr7;->w(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->m()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/ms7;->i(I)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->r()I

    move-result p1

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->k()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/daaw/kr7;->w(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->r()I

    move-result v0

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/daaw/kr7;->d:I

    return-void
.end method

.method public final c(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/daaw/mt7;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/daaw/mt7;

    iget p1, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->s()I

    move-result p1

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->u()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/daaw/mt7;->h(J)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->k()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/daaw/kr7;->w(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->u()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/mt7;->h(J)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->r()I

    move-result p1

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->u()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->k()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/daaw/kr7;->w(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->u()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->r()I

    move-result v0

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/daaw/kr7;->d:I

    return-void
.end method

.method public final d(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/daaw/mt7;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/daaw/mt7;

    iget p1, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->s()I

    move-result p1

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->x()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/daaw/mt7;->h(J)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->k()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/daaw/kr7;->w(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->x()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/mt7;->h(J)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->r()I

    move-result p1

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->x()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->k()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/daaw/kr7;->w(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->x()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->r()I

    move-result v0

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/daaw/kr7;->d:I

    return-void
.end method

.method public final e(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/daaw/sr7;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/daaw/sr7;

    iget p1, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->s()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/kr7;->z(I)V

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->i()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/daaw/sr7;->e(D)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->k()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->i()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sr7;->e(D)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->r()I

    move-result p1

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/kr7;->z(I)V

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->i()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->k()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->i()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->r()I

    move-result v0

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/daaw/kr7;->d:I

    return-void
.end method

.method public final f(Ljava/util/List;)V
    .locals 2

    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/kr7;->zzp()Lcom/daaw/yq7;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->r()I

    move-result v0

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    goto :goto_1

    :goto_0
    throw p1

    :goto_1
    goto :goto_0
.end method

.method public final g(Ljava/util/List;)V
    .locals 2

    instance-of v0, p1, Lcom/daaw/ms7;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/daaw/ms7;

    iget p1, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->s()I

    move-result p1

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->o()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/ms7;->i(I)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->k()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/daaw/kr7;->w(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->o()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/ms7;->i(I)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->r()I

    move-result p1

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->k()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/daaw/kr7;->w(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->r()I

    move-result v0

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/daaw/kr7;->d:I

    return-void
.end method

.method public final h(Ljava/lang/Object;Lcom/daaw/cv7;Lcom/daaw/vr7;)V
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/kr7;->u(Ljava/lang/Object;Lcom/daaw/cv7;Lcom/daaw/vr7;)V

    return-void
.end method

.method public final i(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/daaw/mt7;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/daaw/mt7;

    iget p1, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->s()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/kr7;->z(I)V

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->v()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/daaw/mt7;->h(J)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->k()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->v()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/mt7;->h(J)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->r()I

    move-result p1

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/kr7;->z(I)V

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->v()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->k()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->v()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->r()I

    move-result v0

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/daaw/kr7;->d:I

    return-void
.end method

.method public final j(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/daaw/ms7;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/daaw/ms7;

    iget p1, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->p()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/ms7;->i(I)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->r()I

    move-result p1

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->s()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/kr7;->y(I)V

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->p()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/ms7;->i(I)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->k()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->r()I

    move-result v0

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/kr7;->y(I)V

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->k()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final k(Ljava/lang/Object;Lcom/daaw/cv7;Lcom/daaw/vr7;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/kr7;->v(Ljava/lang/Object;Lcom/daaw/cv7;Lcom/daaw/vr7;)V

    return-void
.end method

.method public final l(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/daaw/ms7;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/daaw/ms7;

    iget p1, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->n()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/ms7;->i(I)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->r()I

    move-result p1

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->s()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/kr7;->y(I)V

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->n()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/ms7;->i(I)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->k()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->r()I

    move-result v0

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/kr7;->y(I)V

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->k()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final m(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/daaw/mt7;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/daaw/mt7;

    iget p1, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->s()I

    move-result p1

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->w()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/daaw/mt7;->h(J)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->k()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/daaw/kr7;->w(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->w()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/mt7;->h(J)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->r()I

    move-result p1

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->w()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->k()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/daaw/kr7;->w(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->w()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->r()I

    move-result v0

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/daaw/kr7;->d:I

    return-void
.end method

.method public final n(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/daaw/mt7;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/daaw/mt7;

    iget p1, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->s()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/kr7;->z(I)V

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->t()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/daaw/mt7;->h(J)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->k()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->t()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/mt7;->h(J)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->r()I

    move-result p1

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/kr7;->z(I)V

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->t()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->k()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->t()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->r()I

    move-result v0

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/daaw/kr7;->d:I

    return-void
.end method

.method public final o(Ljava/util/List;)V
    .locals 2

    instance-of v0, p1, Lcom/daaw/ms7;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/daaw/ms7;

    iget p1, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->s()I

    move-result p1

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->q()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/ms7;->i(I)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->k()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/daaw/kr7;->w(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->q()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/ms7;->i(I)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->r()I

    move-result p1

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->k()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/daaw/kr7;->w(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->r()I

    move-result v0

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/daaw/kr7;->d:I

    return-void
.end method

.method public final p(Ljava/util/List;)V
    .locals 2

    instance-of v0, p1, Lcom/daaw/ms7;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/daaw/ms7;

    iget p1, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->s()I

    move-result p1

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->s()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/ms7;->i(I)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->k()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/daaw/kr7;->w(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->s()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/ms7;->i(I)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->r()I

    move-result p1

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->k()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/daaw/kr7;->w(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->r()I

    move-result v0

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/daaw/kr7;->d:I

    return-void
.end method

.method public final q(Ljava/util/List;)V
    .locals 2

    instance-of v0, p1, Lcom/daaw/mq7;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/daaw/mq7;

    iget p1, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->s()I

    move-result p1

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->c()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/mq7;->e(Z)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->k()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/daaw/kr7;->w(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->c()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/mq7;->e(Z)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->r()I

    move-result p1

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->k()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/daaw/kr7;->w(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->r()I

    move-result v0

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/daaw/kr7;->d:I

    return-void
.end method

.method public final r(Ljava/util/List;Lcom/daaw/cv7;Lcom/daaw/vr7;)V
    .locals 3

    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-interface {p2}, Lcom/daaw/cv7;->zze()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1, p2, p3}, Lcom/daaw/kr7;->v(Ljava/lang/Object;Lcom/daaw/cv7;Lcom/daaw/vr7;)V

    invoke-interface {p2, v1}, Lcom/daaw/cv7;->b(Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->b()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/daaw/kr7;->d:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->r()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, Lcom/daaw/kr7;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final s(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/daaw/cs7;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/daaw/cs7;

    iget p1, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->j()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/cs7;->e(F)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->r()I

    move-result p1

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->s()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/kr7;->y(I)V

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->j()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/cs7;->e(F)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->k()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->j()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->r()I

    move-result v0

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/kr7;->y(I)V

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1}, Lcom/daaw/jr7;->k()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->j()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->k()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final t(Ljava/util/List;Z)V
    .locals 2

    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    instance-of v0, p1, Lcom/daaw/ct7;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_3

    move-object v0, p1

    check-cast v0, Lcom/daaw/ct7;

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/kr7;->zzp()Lcom/daaw/yq7;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/daaw/ct7;->l(Lcom/daaw/yq7;)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {p1}, Lcom/daaw/jr7;->r()I

    move-result p1

    iget p2, p0, Lcom/daaw/kr7;->b:I

    if-eq p1, p2, :cond_1

    iput p1, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_3
    :goto_0
    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lcom/daaw/kr7;->zzs()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lcom/daaw/kr7;->zzr()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->r()I

    move-result v0

    iget v1, p0, Lcom/daaw/kr7;->b:I

    if-eq v0, v1, :cond_3

    iput v0, p0, Lcom/daaw/kr7;->d:I

    return-void

    :cond_6
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public final u(Ljava/lang/Object;Lcom/daaw/cv7;Lcom/daaw/vr7;)V
    .locals 2

    iget v0, p0, Lcom/daaw/kr7;->c:I

    iget v1, p0, Lcom/daaw/kr7;->b:I

    ushr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/daaw/kr7;->c:I

    :try_start_0
    invoke-interface {p2, p1, p0, p3}, Lcom/daaw/cv7;->h(Ljava/lang/Object;Lcom/daaw/iu7;Lcom/daaw/vr7;)V

    iget p1, p0, Lcom/daaw/kr7;->b:I

    iget p2, p0, Lcom/daaw/kr7;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    iput v0, p0, Lcom/daaw/kr7;->c:I

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/daaw/xs7;->g()Lcom/daaw/xs7;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, Lcom/daaw/kr7;->c:I

    throw p1
.end method

.method public final v(Ljava/lang/Object;Lcom/daaw/cv7;Lcom/daaw/vr7;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    iget v2, v1, Lcom/daaw/jr7;->a:I

    iget v3, v1, Lcom/daaw/jr7;->b:I

    if-ge v2, v3, :cond_0

    invoke-virtual {v1, v0}, Lcom/daaw/jr7;->l(I)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    iget v2, v1, Lcom/daaw/jr7;->a:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lcom/daaw/jr7;->a:I

    invoke-interface {p2, p1, p0, p3}, Lcom/daaw/cv7;->h(Ljava/lang/Object;Lcom/daaw/iu7;Lcom/daaw/vr7;)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/daaw/jr7;->B(I)V

    iget-object p1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    iget p2, p1, Lcom/daaw/jr7;->a:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lcom/daaw/jr7;->a:I

    invoke-virtual {p1, v0}, Lcom/daaw/jr7;->a(I)V

    return-void

    :cond_0
    new-instance p1, Lcom/daaw/xs7;

    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    invoke-direct {p1, p2}, Lcom/daaw/xs7;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final w(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->k()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/daaw/xs7;->j()Lcom/daaw/xs7;

    move-result-object p1

    throw p1
.end method

.method public final x(I)V
    .locals 1

    iget v0, p0, Lcom/daaw/kr7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/daaw/xs7;->a()Lcom/daaw/ws7;

    move-result-object p1

    throw p1
.end method

.method public final zzN()Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->c()Z

    move-result v0

    return v0
.end method

.method public final zzO()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/daaw/kr7;->b:I

    iget v1, p0, Lcom/daaw/kr7;->c:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v1, v0}, Lcom/daaw/jr7;->d(I)Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zza()D
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->i()D

    move-result-wide v0

    return-wide v0
.end method

.method public final zzb()F
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->j()F

    move-result v0

    return v0
.end method

.method public final zzc()I
    .locals 2

    iget v0, p0, Lcom/daaw/kr7;->d:I

    if-eqz v0, :cond_0

    iput v0, p0, Lcom/daaw/kr7;->b:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/daaw/kr7;->d:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->r()I

    move-result v0

    iput v0, p0, Lcom/daaw/kr7;->b:I

    :goto_0
    if-eqz v0, :cond_2

    iget v1, p0, Lcom/daaw/kr7;->c:I

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    ushr-int/lit8 v0, v0, 0x3

    return v0

    :cond_2
    :goto_1
    const v0, 0x7fffffff

    return v0
.end method

.method public final zzd()I
    .locals 1

    iget v0, p0, Lcom/daaw/kr7;->b:I

    return v0
.end method

.method public final zze()I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->m()I

    move-result v0

    return v0
.end method

.method public final zzf()I
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->n()I

    move-result v0

    return v0
.end method

.method public final zzg()I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->o()I

    move-result v0

    return v0
.end method

.method public final zzh()I
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->p()I

    move-result v0

    return v0
.end method

.method public final zzi()I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->q()I

    move-result v0

    return v0
.end method

.method public final zzj()I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->s()I

    move-result v0

    return v0
.end method

.method public final zzk()J
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->t()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzl()J
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->u()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzm()J
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzn()J
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->w()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzo()J
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->x()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzp()Lcom/daaw/yq7;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->y()Lcom/daaw/yq7;

    move-result-object v0

    return-object v0
.end method

.method public final zzr()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->z()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzs()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/daaw/kr7;->x(I)V

    iget-object v0, p0, Lcom/daaw/kr7;->a:Lcom/daaw/jr7;

    invoke-virtual {v0}, Lcom/daaw/jr7;->A()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
