.class public final Lcom/daaw/y57;
.super Lcom/daaw/y98;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/e87;->E()Lcom/daaw/e87;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/lj6;)V
    .locals 0

    invoke-static {}, Lcom/daaw/e87;->E()Lcom/daaw/e87;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method


# virtual methods
.method public final s(Lcom/daaw/gu6;)Lcom/daaw/y57;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/e87;

    invoke-virtual {p1}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object p1

    check-cast p1, Lcom/daaw/cv6;

    invoke-static {v0, p1}, Lcom/daaw/e87;->F(Lcom/daaw/e87;Lcom/daaw/cv6;)V

    return-object p0
.end method
