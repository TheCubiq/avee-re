.class public final synthetic Lcom/daaw/tb5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w33;


# instance fields
.field public final synthetic a:Lcom/daaw/fi6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/fi6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/tb5;->a:Lcom/daaw/fi6;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/u53;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/tb5;->a:Lcom/daaw/fi6;

    invoke-virtual {p1}, Lcom/daaw/u53;->s()Lcom/daaw/m43;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/ls7;->k()Lcom/daaw/fs7;

    move-result-object v1

    check-cast v1, Lcom/daaw/l43;

    invoke-virtual {p1}, Lcom/daaw/u53;->s()Lcom/daaw/m43;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/m43;->N()Lcom/daaw/j53;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/ls7;->k()Lcom/daaw/fs7;

    move-result-object v2

    check-cast v2, Lcom/daaw/d53;

    iget-object v0, v0, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v0, v0, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iget-object v0, v0, Lcom/daaw/wh6;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/daaw/d53;->s(Ljava/lang/String;)Lcom/daaw/d53;

    invoke-virtual {v1, v2}, Lcom/daaw/l43;->t(Lcom/daaw/d53;)Lcom/daaw/l43;

    invoke-virtual {p1, v1}, Lcom/daaw/u53;->w(Lcom/daaw/l43;)Lcom/daaw/u53;

    return-void
.end method
