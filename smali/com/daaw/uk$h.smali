.class public Lcom/daaw/uk$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/uk;->Y([Lcom/daaw/l0;ILcom/daaw/wc0;ZZLcom/daaw/e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/wc0;

.field public final synthetic q:Lcom/daaw/uk;


# direct methods
.method public constructor <init>(Lcom/daaw/uk;Lcom/daaw/wc0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/uk$h;->q:Lcom/daaw/uk;

    iput-object p2, p0, Lcom/daaw/uk$h;->p:Lcom/daaw/wc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    sget-object v0, Lcom/daaw/uk;->I:Lcom/daaw/vw1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/uk$h;->p:Lcom/daaw/wc0;

    iget-object v1, p0, Lcom/daaw/uk$h;->q:Lcom/daaw/uk;

    iget v1, v1, Lcom/daaw/uk;->v:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/daaw/wc0;->m(ILandroid/content/Context;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/uk$h;->q:Lcom/daaw/uk;

    iget-object v0, p1, Lcom/daaw/uk;->t:Lcom/daaw/jh0$a;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/daaw/uk;->H:Lcom/daaw/sw1;

    invoke-static {p1}, Lcom/daaw/uk;->P(Lcom/daaw/uk;)[Lcom/daaw/l0;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/uk$h;->q:Lcom/daaw/uk;

    iget-object v1, v1, Lcom/daaw/uk;->w:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->isSelected()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/uk$h;->q:Lcom/daaw/uk;

    iget-object v2, v2, Lcom/daaw/uk;->t:Lcom/daaw/jh0$a;

    invoke-virtual {v0, p1, v1, v2}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method
