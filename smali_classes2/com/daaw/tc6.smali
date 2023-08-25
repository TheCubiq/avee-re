.class public final Lcom/daaw/tc6;
.super Lcom/daaw/y98;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/wd6;->I()Lcom/daaw/wd6;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/t66;)V
    .locals 0

    invoke-static {}, Lcom/daaw/wd6;->I()Lcom/daaw/wd6;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method


# virtual methods
.method public final s()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/wd6;

    invoke-virtual {v0}, Lcom/daaw/wd6;->E()I

    move-result v0

    return v0
.end method

.method public final t(I)Lcom/daaw/qb6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/wd6;

    invoke-virtual {v0, p1}, Lcom/daaw/wd6;->G(I)Lcom/daaw/qb6;

    move-result-object p1

    return-object p1
.end method

.method public final u()Lcom/daaw/tc6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/wd6;

    invoke-static {v0}, Lcom/daaw/wd6;->R(Lcom/daaw/wd6;)V

    return-object p0
.end method

.method public final v(ILcom/daaw/na6;)Lcom/daaw/tc6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/wd6;

    invoke-virtual {p2}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object p2

    check-cast p2, Lcom/daaw/qb6;

    invoke-static {v0, p1, p2}, Lcom/daaw/wd6;->Q(Lcom/daaw/wd6;ILcom/daaw/qb6;)V

    return-object p0
.end method

.method public final w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/wd6;

    invoke-virtual {v0}, Lcom/daaw/wd6;->L()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/wd6;

    invoke-virtual {v0}, Lcom/daaw/wd6;->M()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final y()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/wd6;

    invoke-virtual {v0}, Lcom/daaw/wd6;->N()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
