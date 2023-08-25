.class public Lcom/daaw/o30$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/o30;->l(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:F

.field public final synthetic q:Lcom/daaw/o30;


# direct methods
.method public constructor <init>(Lcom/daaw/o30;F)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/o30$g;->q:Lcom/daaw/o30;

    iput p2, p0, Lcom/daaw/o30$g;->p:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/o30$g;->q:Lcom/daaw/o30;

    iget v1, p0, Lcom/daaw/o30$g;->p:F

    invoke-static {v0, v1}, Lcom/daaw/o30;->f(Lcom/daaw/o30;F)F

    iget-object v0, p0, Lcom/daaw/o30$g;->q:Lcom/daaw/o30;

    invoke-static {v0}, Lcom/daaw/o30;->a(Lcom/daaw/o30;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/daaw/o30$g;->q:Lcom/daaw/o30;

    invoke-static {v2}, Lcom/daaw/o30;->a(Lcom/daaw/o30;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/o30;->o(FF)V

    return-void
.end method
