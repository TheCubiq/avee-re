.class public final Lcom/daaw/ar5;
.super Lcom/daaw/y98;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/ds5;->D()Lcom/daaw/ds5;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/kl5;)V
    .locals 0

    invoke-static {}, Lcom/daaw/ds5;->D()Lcom/daaw/ds5;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method


# virtual methods
.method public final s(Ljava/lang/String;)Lcom/daaw/ar5;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/ds5;

    invoke-static {v0, p1}, Lcom/daaw/ds5;->I(Lcom/daaw/ds5;Ljava/lang/String;)V

    return-object p0
.end method
