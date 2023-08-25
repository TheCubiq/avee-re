.class public Lcom/daaw/no$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/no;->o(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;FFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:F

.field public final synthetic q:F

.field public final synthetic r:Lcom/daaw/un;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:Lcom/daaw/e0;

.field public final synthetic u:[Landroid/widget/EditText;

.field public final synthetic v:Lcom/daaw/w40;


# direct methods
.method public constructor <init>(FFLcom/daaw/un;Ljava/lang/String;Lcom/daaw/e0;[Landroid/widget/EditText;Lcom/daaw/w40;)V
    .locals 0

    iput p1, p0, Lcom/daaw/no$h;->p:F

    iput p2, p0, Lcom/daaw/no$h;->q:F

    iput-object p3, p0, Lcom/daaw/no$h;->r:Lcom/daaw/un;

    iput-object p4, p0, Lcom/daaw/no$h;->s:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/no$h;->t:Lcom/daaw/e0;

    iput-object p6, p0, Lcom/daaw/no$h;->u:[Landroid/widget/EditText;

    iput-object p7, p0, Lcom/daaw/no$h;->v:Lcom/daaw/w40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget v0, p0, Lcom/daaw/no$h;->p:F

    iget v1, p0, Lcom/daaw/no$h;->q:F

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v1, v1, v2

    add-float/2addr v0, v1

    invoke-static {p1, v0}, Lcom/daaw/br1;->v(Ljava/lang/String;F)F

    move-result p1

    iget-object v0, p0, Lcom/daaw/no$h;->r:Lcom/daaw/un;

    iget-object v1, p0, Lcom/daaw/no$h;->s:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/un;->Q(Ljava/lang/String;F)V

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/ho;->u()V

    iget-object p1, p0, Lcom/daaw/no$h;->t:Lcom/daaw/e0;

    iget-object v0, p0, Lcom/daaw/no$h;->u:[Landroid/widget/EditText;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/no$h;->v:Lcom/daaw/w40;

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
