.class public final Lcom/daaw/t12;
.super Lcom/daaw/u12;
.source ""


# instance fields
.field public final synthetic p:Landroid/content/Intent;

.field public final synthetic q:Lcom/daaw/pj0;


# direct methods
.method public constructor <init>(Landroid/content/Intent;Lcom/daaw/pj0;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/t12;->p:Landroid/content/Intent;

    iput-object p2, p0, Lcom/daaw/t12;->q:Lcom/daaw/pj0;

    invoke-direct {p0}, Lcom/daaw/u12;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/t12;->p:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/t12;->q:Lcom/daaw/pj0;

    const/4 v2, 0x2

    invoke-interface {v1, v0, v2}, Lcom/daaw/pj0;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
