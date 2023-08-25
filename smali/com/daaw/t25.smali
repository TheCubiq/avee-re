.class public final synthetic Lcom/daaw/t25;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/e35;

.field public final synthetic q:Landroid/view/View;

.field public final synthetic r:Z

.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/e35;Landroid/view/View;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/t25;->p:Lcom/daaw/e35;

    iput-object p2, p0, Lcom/daaw/t25;->q:Landroid/view/View;

    iput-boolean p3, p0, Lcom/daaw/t25;->r:Z

    iput p4, p0, Lcom/daaw/t25;->s:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/t25;->p:Lcom/daaw/e35;

    iget-object v1, p0, Lcom/daaw/t25;->q:Landroid/view/View;

    iget-boolean v2, p0, Lcom/daaw/t25;->r:Z

    iget v3, p0, Lcom/daaw/t25;->s:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/e35;->T(Landroid/view/View;ZI)V

    return-void
.end method
