.class public final synthetic Lcom/daaw/pp5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w33;


# instance fields
.field public final synthetic a:Lcom/daaw/k73;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/k73;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/pp5;->a:Lcom/daaw/k73;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/u53;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/pp5;->a:Lcom/daaw/k73;

    invoke-virtual {p1}, Lcom/daaw/u53;->t()Lcom/daaw/n53;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/ls7;->k()Lcom/daaw/fs7;

    move-result-object v1

    check-cast v1, Lcom/daaw/m53;

    invoke-virtual {v1, v0}, Lcom/daaw/m53;->t(Lcom/daaw/k73;)Lcom/daaw/m53;

    invoke-virtual {p1, v1}, Lcom/daaw/u53;->y(Lcom/daaw/m53;)Lcom/daaw/u53;

    return-void
.end method
