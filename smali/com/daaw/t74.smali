.class public final synthetic Lcom/daaw/t74;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w33;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/daaw/t74;->a:Z

    iput p2, p0, Lcom/daaw/t74;->b:I

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/u53;)V
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/t74;->a:Z

    iget v1, p0, Lcom/daaw/t74;->b:I

    sget v2, Lcom/daaw/w74;->p0:I

    invoke-static {}, Lcom/daaw/k83;->L()Lcom/daaw/j83;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/j83;->u()Z

    move-result v3

    if-eq v3, v0, :cond_0

    invoke-virtual {v2, v0}, Lcom/daaw/j83;->s(Z)Lcom/daaw/j83;

    :cond_0
    invoke-virtual {v2, v1}, Lcom/daaw/j83;->t(I)Lcom/daaw/j83;

    invoke-virtual {v2}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v0

    check-cast v0, Lcom/daaw/k83;

    invoke-virtual {p1, v0}, Lcom/daaw/u53;->B(Lcom/daaw/k83;)Lcom/daaw/u53;

    return-void
.end method
