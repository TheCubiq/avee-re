.class public final Lcom/daaw/o13;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Landroid/view/View;

.field public final synthetic q:Lcom/daaw/s13;


# direct methods
.method public constructor <init>(Lcom/daaw/s13;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/o13;->q:Lcom/daaw/s13;

    iput-object p2, p0, Lcom/daaw/o13;->p:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/o13;->q:Lcom/daaw/s13;

    iget-object v1, p0, Lcom/daaw/o13;->p:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/daaw/s13;->c(Landroid/view/View;)V

    return-void
.end method
