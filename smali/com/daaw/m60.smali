.class public Lcom/daaw/m60;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/z41;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/z41<",
        "Lcom/daaw/k60;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/k60;


# direct methods
.method public constructor <init>(Lcom/daaw/k60;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Data must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/m60;->a:Lcom/daaw/k60;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/m60;->a:Lcom/daaw/k60;

    invoke-virtual {v0}, Lcom/daaw/k60;->c()I

    move-result v0

    return v0
.end method

.method public b()Lcom/daaw/k60;
    .locals 1

    iget-object v0, p0, Lcom/daaw/m60;->a:Lcom/daaw/k60;

    return-object v0
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/m60;->a:Lcom/daaw/k60;

    invoke-virtual {v0}, Lcom/daaw/k60;->a()Lcom/daaw/z41;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/z41;->c()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/m60;->a:Lcom/daaw/k60;

    invoke-virtual {v0}, Lcom/daaw/k60;->b()Lcom/daaw/z41;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/daaw/z41;->c()V

    :cond_1
    return-void
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/m60;->b()Lcom/daaw/k60;

    move-result-object v0

    return-object v0
.end method
