.class public final synthetic Lcom/daaw/j88;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/s88;

.field public final synthetic q:I

.field public final synthetic r:Lcom/daaw/om5;

.field public final synthetic s:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/s88;ILcom/daaw/om5;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/j88;->p:Lcom/daaw/s88;

    iput p2, p0, Lcom/daaw/j88;->q:I

    iput-object p3, p0, Lcom/daaw/j88;->r:Lcom/daaw/om5;

    iput-object p4, p0, Lcom/daaw/j88;->s:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/j88;->p:Lcom/daaw/s88;

    iget v1, p0, Lcom/daaw/j88;->q:I

    iget-object v2, p0, Lcom/daaw/j88;->r:Lcom/daaw/om5;

    iget-object v3, p0, Lcom/daaw/j88;->s:Landroid/content/Intent;

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/s88;->c(ILcom/daaw/om5;Landroid/content/Intent;)V

    return-void
.end method
