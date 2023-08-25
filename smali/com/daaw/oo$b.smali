.class public Lcom/daaw/oo$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/oo;->K(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;ZLjava/lang/String;Ljava/lang/String;FFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/un;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Lcom/daaw/dm0;

.field public final synthetic s:Lcom/daaw/ho;


# direct methods
.method public constructor <init>(Lcom/daaw/un;Ljava/lang/String;Lcom/daaw/dm0;Lcom/daaw/ho;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/oo$b;->p:Lcom/daaw/un;

    iput-object p2, p0, Lcom/daaw/oo$b;->q:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/oo$b;->r:Lcom/daaw/dm0;

    iput-object p4, p0, Lcom/daaw/oo$b;->s:Lcom/daaw/ho;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    iget-object p1, p0, Lcom/daaw/oo$b;->p:Lcom/daaw/un;

    iget-object v0, p0, Lcom/daaw/oo$b;->q:Ljava/lang/String;

    new-instance v1, Lcom/daaw/dm0;

    iget-object v2, p0, Lcom/daaw/oo$b;->r:Lcom/daaw/dm0;

    invoke-direct {v1, v2}, Lcom/daaw/dm0;-><init>(Lcom/daaw/dm0;)V

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->s(Ljava/lang/String;Lcom/daaw/dm0;)Lcom/daaw/dm0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/dm0;->h()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    new-instance v0, Lcom/daaw/dm0;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/daaw/dm0;->h()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-direct {v0, p1, v2, v3}, Lcom/daaw/dm0;-><init>(Lcom/daaw/dm0;II)V

    iget-object p1, p0, Lcom/daaw/oo$b;->p:Lcom/daaw/un;

    iget-object v1, p0, Lcom/daaw/oo$b;->q:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lcom/daaw/un;->a0(Ljava/lang/String;Lcom/daaw/dm0;)V

    iget-object p1, p0, Lcom/daaw/oo$b;->s:Lcom/daaw/ho;

    invoke-virtual {p1}, Lcom/daaw/ho;->q()V

    :cond_0
    return-void
.end method
