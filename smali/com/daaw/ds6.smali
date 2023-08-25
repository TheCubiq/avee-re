.class public final synthetic Lcom/daaw/ds6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/hl;


# instance fields
.field public final synthetic a:Lcom/daaw/oh2;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/oh2;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ds6;->a:Lcom/daaw/oh2;

    iput p2, p0, Lcom/daaw/ds6;->b:I

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/rj1;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/ds6;->a:Lcom/daaw/oh2;

    iget v1, p0, Lcom/daaw/ds6;->b:I

    sget v2, Lcom/daaw/es6;->f:I

    invoke-virtual {p1}, Lcom/daaw/rj1;->n()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lcom/daaw/rj1;->k()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ku6;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v0

    check-cast v0, Lcom/daaw/xh2;

    invoke-virtual {v0}, Lcom/daaw/hq7;->a()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/ku6;->a([B)Lcom/daaw/ju6;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/daaw/ju6;->a(I)Lcom/daaw/ju6;

    invoke-virtual {p1}, Lcom/daaw/ju6;->c()V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    return-object p1
.end method
