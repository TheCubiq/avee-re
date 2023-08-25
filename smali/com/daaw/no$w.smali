.class public Lcom/daaw/no$w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/text/TextWatcher;


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

.field public final synthetic r:Lcom/daaw/e0;

.field public final synthetic s:[Landroid/widget/TextView;

.field public final synthetic t:Lcom/daaw/w40;


# direct methods
.method public constructor <init>(Lcom/daaw/un;Ljava/lang/String;Lcom/daaw/e0;[Landroid/widget/TextView;Lcom/daaw/w40;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/no$w;->p:Lcom/daaw/un;

    iput-object p2, p0, Lcom/daaw/no$w;->q:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/no$w;->r:Lcom/daaw/e0;

    iput-object p4, p0, Lcom/daaw/no$w;->s:[Landroid/widget/TextView;

    iput-object p5, p0, Lcom/daaw/no$w;->t:Lcom/daaw/w40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/no$w;->p:Lcom/daaw/un;

    iget-object v1, p0, Lcom/daaw/no$w;->q:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/un;->i0(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/ho;->u()V

    iget-object p1, p0, Lcom/daaw/no$w;->r:Lcom/daaw/e0;

    iget-object v0, p0, Lcom/daaw/no$w;->s:[Landroid/widget/TextView;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/no$w;->t:Lcom/daaw/w40;

    invoke-interface {p1}, Lcom/daaw/w40;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/e0;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
