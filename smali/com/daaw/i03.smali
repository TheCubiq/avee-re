.class public final Lcom/daaw/i03;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Landroid/view/Surface;

.field public final synthetic q:Lcom/daaw/k03;


# direct methods
.method public constructor <init>(Lcom/daaw/k03;Landroid/view/Surface;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/i03;->q:Lcom/daaw/k03;

    iput-object p2, p0, Lcom/daaw/i03;->p:Landroid/view/Surface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/i03;->q:Lcom/daaw/k03;

    invoke-static {v0}, Lcom/daaw/k03;->a(Lcom/daaw/k03;)Lcom/daaw/l03;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/i03;->p:Landroid/view/Surface;

    invoke-interface {v0, v1}, Lcom/daaw/l03;->C(Landroid/view/Surface;)V

    return-void
.end method
