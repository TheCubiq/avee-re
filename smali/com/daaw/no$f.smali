.class public Lcom/daaw/no$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/no;->o(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;FFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/e0<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Lcom/daaw/un;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:F

.field public final synthetic e:Landroid/widget/TextView;

.field public final synthetic f:Landroid/view/View;

.field public final synthetic g:Landroid/view/View;

.field public final synthetic h:F

.field public final synthetic i:F

.field public final synthetic j:Z

.field public final synthetic k:[Landroid/widget/SeekBar;

.field public final synthetic l:[Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Lcom/daaw/un;Ljava/lang/String;FLandroid/widget/TextView;Landroid/view/View;Landroid/view/View;FFZ[Landroid/widget/SeekBar;[Landroid/widget/EditText;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/no$f;->b:Lcom/daaw/un;

    iput-object p2, p0, Lcom/daaw/no$f;->c:Ljava/lang/String;

    iput p3, p0, Lcom/daaw/no$f;->d:F

    iput-object p4, p0, Lcom/daaw/no$f;->e:Landroid/widget/TextView;

    iput-object p5, p0, Lcom/daaw/no$f;->f:Landroid/view/View;

    iput-object p6, p0, Lcom/daaw/no$f;->g:Landroid/view/View;

    iput p7, p0, Lcom/daaw/no$f;->h:F

    iput p8, p0, Lcom/daaw/no$f;->i:F

    iput-boolean p9, p0, Lcom/daaw/no$f;->j:Z

    iput-object p10, p0, Lcom/daaw/no$f;->k:[Landroid/widget/SeekBar;

    iput-object p11, p0, Lcom/daaw/no$f;->l:[Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/no$f;->a:Z

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 10

    iget-boolean v0, p0, Lcom/daaw/no$f;->a:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/no$f;->a:Z

    iget-object v1, p0, Lcom/daaw/no$f;->b:Lcom/daaw/un;

    iget-object v2, p0, Lcom/daaw/no$f;->c:Ljava/lang/String;

    iget v3, p0, Lcom/daaw/no$f;->d:F

    invoke-virtual {v1, v2, v3}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v1

    iget-object v2, p0, Lcom/daaw/no$f;->e:Landroid/widget/TextView;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const-string v5, "%.3f"

    invoke-static {v3, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/daaw/no$f;->f:Landroid/view/View;

    iget-object v4, p0, Lcom/daaw/no$f;->g:Landroid/view/View;

    iget v7, p0, Lcom/daaw/no$f;->h:F

    iget v8, p0, Lcom/daaw/no$f;->d:F

    sub-float/2addr v7, v8

    iget v9, p0, Lcom/daaw/no$f;->i:F

    div-float/2addr v7, v9

    sub-float v8, v1, v8

    div-float/2addr v8, v9

    invoke-static {v2, v4, v7, v8}, Lcom/daaw/nd1;->a(Landroid/view/View;Landroid/view/View;FF)V

    iget-boolean v2, p0, Lcom/daaw/no$f;->j:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/daaw/no$f;->k:[Landroid/widget/SeekBar;

    aget-object v2, v2, v6

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/daaw/no$f;->k:[Landroid/widget/SeekBar;

    aget-object v2, v2, v6

    iget v4, p0, Lcom/daaw/no$f;->d:F

    sub-float v4, v1, v4

    iget v7, p0, Lcom/daaw/no$f;->i:F

    div-float/2addr v4, v7

    float-to-int v4, v4

    invoke-virtual {v2, v4}, Landroid/widget/SeekBar;->setProgress(I)V

    :cond_1
    iget-object v2, p0, Lcom/daaw/no$f;->l:[Landroid/widget/EditText;

    aget-object v2, v2, v6

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/no$f;->l:[Landroid/widget/EditText;

    aget-object p1, p1, v6

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v0, v6

    invoke-static {v3, v5, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    iput-boolean v6, p0, Lcom/daaw/no$f;->a:Z

    return-void
.end method
