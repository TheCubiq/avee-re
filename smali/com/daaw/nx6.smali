.class public final Lcom/daaw/nx6;
.super Lcom/daaw/dx6;
.source ""


# instance fields
.field public final synthetic q:Lcom/daaw/px6;


# direct methods
.method public constructor <init>(Lcom/daaw/px6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nx6;->q:Lcom/daaw/px6;

    invoke-direct {p0}, Lcom/daaw/dx6;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/nx6;->q:Lcom/daaw/px6;

    iget-object v0, v0, Lcom/daaw/px6;->a:Lcom/daaw/qx6;

    invoke-static {v0}, Lcom/daaw/qx6;->o(Lcom/daaw/qx6;)V

    iget-object v0, p0, Lcom/daaw/nx6;->q:Lcom/daaw/px6;

    iget-object v0, v0, Lcom/daaw/px6;->a:Lcom/daaw/qx6;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/qx6;->k(Lcom/daaw/qx6;Landroid/os/IInterface;)V

    iget-object v0, p0, Lcom/daaw/nx6;->q:Lcom/daaw/px6;

    iget-object v0, v0, Lcom/daaw/px6;->a:Lcom/daaw/qx6;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/qx6;->j(Lcom/daaw/qx6;Z)V

    return-void
.end method
