.class public Lcom/daaw/no$u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/no;->p(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroid/widget/TextView;

.field public final synthetic q:Lcom/daaw/un;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Lcom/daaw/e0;

.field public final synthetic t:Landroid/widget/Button;

.field public final synthetic u:Lcom/daaw/w40;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Lcom/daaw/un;Ljava/lang/String;Lcom/daaw/e0;Landroid/widget/Button;Lcom/daaw/w40;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/no$u;->p:Landroid/widget/TextView;

    iput-object p2, p0, Lcom/daaw/no$u;->q:Lcom/daaw/un;

    iput-object p3, p0, Lcom/daaw/no$u;->r:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/no$u;->s:Lcom/daaw/e0;

    iput-object p5, p0, Lcom/daaw/no$u;->t:Landroid/widget/Button;

    iput-object p6, p0, Lcom/daaw/no$u;->u:Lcom/daaw/w40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/no$u;->p:Landroid/widget/TextView;

    const-string v0, ""

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object p1, p0, Lcom/daaw/no$u;->q:Lcom/daaw/un;

    iget-object v1, p0, Lcom/daaw/no$u;->r:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lcom/daaw/un;->i0(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/ho;->u()V

    iget-object p1, p0, Lcom/daaw/no$u;->s:Lcom/daaw/e0;

    iget-object v0, p0, Lcom/daaw/no$u;->t:Landroid/widget/Button;

    invoke-interface {p1, v0}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/no$u;->u:Lcom/daaw/w40;

    invoke-interface {p1}, Lcom/daaw/w40;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/e0;

    if-eqz p1, :cond_2

    invoke-interface {p1, p0}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
