.class public final Lcom/daaw/i12;
.super Lcom/daaw/u12;
.source ""


# instance fields
.field public final synthetic p:Landroid/content/Intent;

.field public final synthetic q:Landroid/app/Activity;

.field public final synthetic r:I


# direct methods
.method public constructor <init>(Landroid/content/Intent;Landroid/app/Activity;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/i12;->p:Landroid/content/Intent;

    iput-object p2, p0, Lcom/daaw/i12;->q:Landroid/app/Activity;

    iput p3, p0, Lcom/daaw/i12;->r:I

    invoke-direct {p0}, Lcom/daaw/u12;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/i12;->p:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/i12;->q:Landroid/app/Activity;

    iget v2, p0, Lcom/daaw/i12;->r:I

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
