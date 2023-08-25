.class public final Lcom/daaw/de6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/bl6;


# instance fields
.field public final a:Lcom/daaw/cf6;


# direct methods
.method public constructor <init>(Lcom/daaw/cf6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/de6;->a:Lcom/daaw/cf6;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/cl6;)Lcom/daaw/f77;
    .locals 3

    check-cast p1, Lcom/daaw/ee6;

    iget-object v0, p0, Lcom/daaw/de6;->a:Lcom/daaw/cf6;

    iget-object v1, p1, Lcom/daaw/ee6;->b:Lcom/daaw/df6;

    iget-object p1, p1, Lcom/daaw/ee6;->a:Lcom/daaw/ye6;

    check-cast v0, Lcom/daaw/ae6;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lcom/daaw/ae6;->c(Lcom/daaw/df6;Lcom/daaw/ye6;Lcom/daaw/rp4;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/daaw/qk6;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/de6;->a:Lcom/daaw/cf6;

    check-cast v0, Lcom/daaw/ae6;

    invoke-virtual {v0}, Lcom/daaw/ae6;->b()Lcom/daaw/rp4;

    move-result-object v0

    iput-object v0, p1, Lcom/daaw/qk6;->a:Lcom/daaw/rp4;

    return-void
.end method
