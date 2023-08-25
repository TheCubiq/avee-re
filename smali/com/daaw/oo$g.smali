.class public Lcom/daaw/oo$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/oo;->K(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;ZLjava/lang/String;Ljava/lang/String;FFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:[Z

.field public final synthetic q:F

.field public final synthetic r:F

.field public final synthetic s:Lcom/daaw/un;

.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Lcom/daaw/dm0;

.field public final synthetic v:I

.field public final synthetic w:Lcom/daaw/ho;

.field public final synthetic x:Lcom/daaw/e0;

.field public final synthetic y:[Landroid/widget/EditText;

.field public final synthetic z:Lcom/daaw/w40;


# direct methods
.method public constructor <init>([ZFFLcom/daaw/un;Ljava/lang/String;Lcom/daaw/dm0;ILcom/daaw/ho;Lcom/daaw/e0;[Landroid/widget/EditText;Lcom/daaw/w40;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/oo$g;->p:[Z

    iput p2, p0, Lcom/daaw/oo$g;->q:F

    iput p3, p0, Lcom/daaw/oo$g;->r:F

    iput-object p4, p0, Lcom/daaw/oo$g;->s:Lcom/daaw/un;

    iput-object p5, p0, Lcom/daaw/oo$g;->t:Ljava/lang/String;

    iput-object p6, p0, Lcom/daaw/oo$g;->u:Lcom/daaw/dm0;

    iput p7, p0, Lcom/daaw/oo$g;->v:I

    iput-object p8, p0, Lcom/daaw/oo$g;->w:Lcom/daaw/ho;

    iput-object p9, p0, Lcom/daaw/oo$g;->x:Lcom/daaw/e0;

    iput-object p10, p0, Lcom/daaw/oo$g;->y:[Landroid/widget/EditText;

    iput-object p11, p0, Lcom/daaw/oo$g;->z:Lcom/daaw/w40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/oo$g;->p:[Z

    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget v0, p0, Lcom/daaw/oo$g;->q:F

    iget v1, p0, Lcom/daaw/oo$g;->r:F

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v1, v1, v2

    add-float/2addr v0, v1

    invoke-static {p1, v0}, Lcom/daaw/br1;->v(Ljava/lang/String;F)F

    move-result p1

    iget-object v0, p0, Lcom/daaw/oo$g;->s:Lcom/daaw/un;

    iget-object v1, p0, Lcom/daaw/oo$g;->t:Ljava/lang/String;

    new-instance v2, Lcom/daaw/dm0;

    iget-object v3, p0, Lcom/daaw/oo$g;->u:Lcom/daaw/dm0;

    invoke-direct {v2, v3}, Lcom/daaw/dm0;-><init>(Lcom/daaw/dm0;)V

    invoke-virtual {v0, v1, v2}, Lcom/daaw/un;->s(Ljava/lang/String;Lcom/daaw/dm0;)Lcom/daaw/dm0;

    move-result-object v0

    iget v1, p0, Lcom/daaw/oo$g;->v:I

    invoke-virtual {v0}, Lcom/daaw/dm0;->h()I

    move-result v2

    if-lt v1, v2, :cond_1

    return-void

    :cond_1
    iget v1, p0, Lcom/daaw/oo$g;->v:I

    invoke-virtual {v0, v1}, Lcom/daaw/dm0;->g(I)Lcom/daaw/xn0;

    move-result-object v1

    iget v2, p0, Lcom/daaw/oo$g;->v:I

    new-instance v3, Lcom/daaw/xn0;

    invoke-virtual {v1}, Lcom/daaw/xn0;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/daaw/xn0;->g()Lcom/daaw/bs1;

    move-result-object v1

    iget v1, v1, Lcom/daaw/bs1;->a:F

    invoke-direct {v3, v4, v1, p1}, Lcom/daaw/xn0;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v0, v2, v3}, Lcom/daaw/dm0;->k(ILcom/daaw/xn0;)V

    iget-object p1, p0, Lcom/daaw/oo$g;->s:Lcom/daaw/un;

    iget-object v1, p0, Lcom/daaw/oo$g;->t:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lcom/daaw/un;->a0(Ljava/lang/String;Lcom/daaw/dm0;)V

    iget-object p1, p0, Lcom/daaw/oo$g;->w:Lcom/daaw/ho;

    invoke-virtual {p1}, Lcom/daaw/ho;->u()V

    iget-object p1, p0, Lcom/daaw/oo$g;->x:Lcom/daaw/e0;

    iget-object v0, p0, Lcom/daaw/oo$g;->y:[Landroid/widget/EditText;

    iget v1, p0, Lcom/daaw/oo$g;->v:I

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/oo$g;->z:Lcom/daaw/w40;

    invoke-interface {p1}, Lcom/daaw/w40;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/e0;

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    :cond_2
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
