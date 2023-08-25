.class public final Lcom/daaw/b17;
.super Lcom/daaw/y98;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/e27;->E()Lcom/daaw/e27;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/lj6;)V
    .locals 0

    invoke-static {}, Lcom/daaw/e27;->E()Lcom/daaw/e27;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method


# virtual methods
.method public final s(Lcom/daaw/g37;)Lcom/daaw/b17;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/e27;

    invoke-virtual {p1}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object p1

    check-cast p1, Lcom/daaw/j47;

    invoke-static {v0, p1}, Lcom/daaw/e27;->H(Lcom/daaw/e27;Lcom/daaw/j47;)V

    return-object p0
.end method

.method public final t(I)Lcom/daaw/j47;
    .locals 1

    iget-object p1, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast p1, Lcom/daaw/e27;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/e27;->F(I)Lcom/daaw/j47;

    move-result-object p1

    return-object p1
.end method
