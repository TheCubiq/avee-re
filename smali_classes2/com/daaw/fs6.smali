.class public final Lcom/daaw/fs6;
.super Lcom/daaw/y98;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/it6;->I()Lcom/daaw/it6;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/lj6;)V
    .locals 0

    invoke-static {}, Lcom/daaw/it6;->I()Lcom/daaw/it6;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;)Lcom/daaw/fs6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/it6;

    invoke-static {v0, p1}, Lcom/daaw/it6;->R(Lcom/daaw/it6;Ljava/lang/String;)V

    return-object p0
.end method

.method public final B(ILcom/daaw/fw6;)Lcom/daaw/fs6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/it6;

    invoke-virtual {p2}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object p2

    check-cast p2, Lcom/daaw/ix6;

    invoke-static {v0, p1, p2}, Lcom/daaw/it6;->M(Lcom/daaw/it6;ILcom/daaw/ix6;)V

    return-object p0
.end method

.method public final C(ILcom/daaw/ix6;)Lcom/daaw/fs6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/it6;

    invoke-static {v0, p1, p2}, Lcom/daaw/it6;->M(Lcom/daaw/it6;ILcom/daaw/ix6;)V

    return-object p0
.end method

.method public final D(J)Lcom/daaw/fs6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/it6;

    invoke-static {v0, p1, p2}, Lcom/daaw/it6;->T(Lcom/daaw/it6;J)V

    return-object p0
.end method

.method public final E(J)Lcom/daaw/fs6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/it6;

    invoke-static {v0, p1, p2}, Lcom/daaw/it6;->S(Lcom/daaw/it6;J)V

    return-object p0
.end method

.method public final F(I)Lcom/daaw/ix6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/it6;

    invoke-virtual {v0, p1}, Lcom/daaw/it6;->J(I)Lcom/daaw/ix6;

    move-result-object p1

    return-object p1
.end method

.method public final G()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/it6;

    invoke-virtual {v0}, Lcom/daaw/it6;->K()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final H()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/it6;

    invoke-virtual {v0}, Lcom/daaw/it6;->L()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final I()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/it6;

    invoke-virtual {v0}, Lcom/daaw/it6;->W()Z

    move-result v0

    return v0
.end method

.method public final s()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/it6;

    invoke-virtual {v0}, Lcom/daaw/it6;->E()I

    move-result v0

    return v0
.end method

.method public final t()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/it6;

    invoke-virtual {v0}, Lcom/daaw/it6;->F()J

    move-result-wide v0

    return-wide v0
.end method

.method public final u()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/it6;

    invoke-virtual {v0}, Lcom/daaw/it6;->G()J

    move-result-wide v0

    return-wide v0
.end method

.method public final v(Ljava/lang/Iterable;)Lcom/daaw/fs6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/it6;

    invoke-static {v0, p1}, Lcom/daaw/it6;->O(Lcom/daaw/it6;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final w(Lcom/daaw/fw6;)Lcom/daaw/fs6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/it6;

    invoke-virtual {p1}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object p1

    check-cast p1, Lcom/daaw/ix6;

    invoke-static {v0, p1}, Lcom/daaw/it6;->N(Lcom/daaw/it6;Lcom/daaw/ix6;)V

    return-object p0
.end method

.method public final x(Lcom/daaw/ix6;)Lcom/daaw/fs6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/it6;

    invoke-static {v0, p1}, Lcom/daaw/it6;->N(Lcom/daaw/it6;Lcom/daaw/ix6;)V

    return-object p0
.end method

.method public final y()Lcom/daaw/fs6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/it6;

    invoke-static {v0}, Lcom/daaw/it6;->P(Lcom/daaw/it6;)V

    return-object p0
.end method

.method public final z(I)Lcom/daaw/fs6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/it6;

    invoke-static {v0, p1}, Lcom/daaw/it6;->Q(Lcom/daaw/it6;I)V

    return-object p0
.end method
