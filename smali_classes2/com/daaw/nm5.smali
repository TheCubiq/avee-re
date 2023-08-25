.class public final Lcom/daaw/nm5;
.super Lcom/daaw/y98;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/rn5;->G()Lcom/daaw/rn5;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/kl5;)V
    .locals 0

    invoke-static {}, Lcom/daaw/rn5;->G()Lcom/daaw/rn5;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method


# virtual methods
.method public final s()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/rn5;

    invoke-virtual {v0}, Lcom/daaw/rn5;->E()I

    move-result v0

    return v0
.end method

.method public final t()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/rn5;

    invoke-virtual {v0}, Lcom/daaw/rn5;->F()I

    move-result v0

    return v0
.end method

.method public final u(ILcom/daaw/uo5;)Lcom/daaw/nm5;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/rn5;

    invoke-virtual {p2}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object p2

    check-cast p2, Lcom/daaw/xp5;

    invoke-static {v0, p1, p2}, Lcom/daaw/rn5;->M(Lcom/daaw/rn5;ILcom/daaw/xp5;)V

    return-object p0
.end method

.method public final v(ILcom/daaw/wy5;)Lcom/daaw/nm5;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/rn5;

    invoke-virtual {p2}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object p2

    check-cast p2, Lcom/daaw/a06;

    invoke-static {v0, p1, p2}, Lcom/daaw/rn5;->L(Lcom/daaw/rn5;ILcom/daaw/a06;)V

    return-object p0
.end method

.method public final w(I)Lcom/daaw/xp5;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/rn5;

    invoke-virtual {v0, p1}, Lcom/daaw/rn5;->H(I)Lcom/daaw/xp5;

    move-result-object p1

    return-object p1
.end method

.method public final x(I)Lcom/daaw/a06;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/rn5;

    invoke-virtual {v0, p1}, Lcom/daaw/rn5;->I(I)Lcom/daaw/a06;

    move-result-object p1

    return-object p1
.end method
