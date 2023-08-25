.class public Lcom/daaw/no$s;
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
.field public final synthetic p:Lcom/daaw/un;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Lcom/daaw/e0;

.field public final synthetic t:Landroid/widget/ImageButton;

.field public final synthetic u:Lcom/daaw/w40;


# direct methods
.method public constructor <init>(Lcom/daaw/un;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/e0;Landroid/widget/ImageButton;Lcom/daaw/w40;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/no$s;->p:Lcom/daaw/un;

    iput-object p2, p0, Lcom/daaw/no$s;->q:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/no$s;->r:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/no$s;->s:Lcom/daaw/e0;

    iput-object p5, p0, Lcom/daaw/no$s;->t:Landroid/widget/ImageButton;

    iput-object p6, p0, Lcom/daaw/no$s;->u:Lcom/daaw/w40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/no$s;->p:Lcom/daaw/un;

    iget-object v0, p0, Lcom/daaw/no$s;->q:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/no$s;->r:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->i0(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/ho;->u()V

    iget-object p1, p0, Lcom/daaw/no$s;->s:Lcom/daaw/e0;

    iget-object v0, p0, Lcom/daaw/no$s;->t:Landroid/widget/ImageButton;

    invoke-interface {p1, v0}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/no$s;->u:Lcom/daaw/w40;

    invoke-interface {p1}, Lcom/daaw/w40;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/e0;

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
