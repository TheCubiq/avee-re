.class public Lcom/daaw/no$p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/no;->s(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroid/widget/TextView;

.field public final synthetic q:Lcom/daaw/un;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Lcom/daaw/w40;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Lcom/daaw/un;Ljava/lang/String;Lcom/daaw/w40;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/no$p;->p:Landroid/widget/TextView;

    iput-object p2, p0, Lcom/daaw/no$p;->q:Lcom/daaw/un;

    iput-object p3, p0, Lcom/daaw/no$p;->r:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/no$p;->s:Lcom/daaw/w40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/no$p;->p:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/daaw/no$p;->q:Lcom/daaw/un;

    iget-object v1, p0, Lcom/daaw/no$p;->r:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/un;->i0(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/ho;->u()V

    iget-object p1, p0, Lcom/daaw/no$p;->s:Lcom/daaw/w40;

    invoke-interface {p1}, Lcom/daaw/w40;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/e0;

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

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
