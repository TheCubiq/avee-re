.class public Lcom/daaw/no$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/no;->t(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;FFF)V
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

.field public final synthetic j:Landroid/view/View;

.field public final synthetic k:Landroid/view/View;

.field public final synthetic l:Z

.field public final synthetic m:[Landroid/widget/SeekBar;

.field public final synthetic n:[Landroid/widget/SeekBar;

.field public final synthetic o:[Landroid/widget/EditText;

.field public final synthetic p:[Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Lcom/daaw/un;Ljava/lang/String;FLandroid/widget/TextView;Landroid/view/View;Landroid/view/View;FFLandroid/view/View;Landroid/view/View;Z[Landroid/widget/SeekBar;[Landroid/widget/SeekBar;[Landroid/widget/EditText;[Landroid/widget/EditText;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/no$i;->b:Lcom/daaw/un;

    iput-object p2, p0, Lcom/daaw/no$i;->c:Ljava/lang/String;

    iput p3, p0, Lcom/daaw/no$i;->d:F

    iput-object p4, p0, Lcom/daaw/no$i;->e:Landroid/widget/TextView;

    iput-object p5, p0, Lcom/daaw/no$i;->f:Landroid/view/View;

    iput-object p6, p0, Lcom/daaw/no$i;->g:Landroid/view/View;

    iput p7, p0, Lcom/daaw/no$i;->h:F

    iput p8, p0, Lcom/daaw/no$i;->i:F

    iput-object p9, p0, Lcom/daaw/no$i;->j:Landroid/view/View;

    iput-object p10, p0, Lcom/daaw/no$i;->k:Landroid/view/View;

    iput-boolean p11, p0, Lcom/daaw/no$i;->l:Z

    iput-object p12, p0, Lcom/daaw/no$i;->m:[Landroid/widget/SeekBar;

    iput-object p13, p0, Lcom/daaw/no$i;->n:[Landroid/widget/SeekBar;

    iput-object p14, p0, Lcom/daaw/no$i;->o:[Landroid/widget/EditText;

    iput-object p15, p0, Lcom/daaw/no$i;->p:[Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/no$i;->a:Z

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 10

    iget-boolean v0, p0, Lcom/daaw/no$i;->a:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/no$i;->a:Z

    iget-object v1, p0, Lcom/daaw/no$i;->b:Lcom/daaw/un;

    iget-object v2, p0, Lcom/daaw/no$i;->c:Ljava/lang/String;

    new-instance v3, Lcom/daaw/bs1;

    iget v4, p0, Lcom/daaw/no$i;->d:F

    invoke-direct {v3, v4, v4}, Lcom/daaw/bs1;-><init>(FF)V

    invoke-virtual {v1, v2, v3}, Lcom/daaw/un;->z(Ljava/lang/String;Lcom/daaw/bs1;)Lcom/daaw/bs1;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/no$i;->e:Landroid/widget/TextView;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    iget v5, v1, Lcom/daaw/bs1;->a:F

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    iget v5, v1, Lcom/daaw/bs1;->b:F

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v4, v0

    const-string v5, "%.3f   %.3f"

    invoke-static {v3, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/daaw/no$i;->f:Landroid/view/View;

    iget-object v4, p0, Lcom/daaw/no$i;->g:Landroid/view/View;

    iget v5, p0, Lcom/daaw/no$i;->h:F

    iget v7, p0, Lcom/daaw/no$i;->d:F

    sub-float/2addr v5, v7

    iget v8, p0, Lcom/daaw/no$i;->i:F

    div-float/2addr v5, v8

    iget v9, v1, Lcom/daaw/bs1;->a:F

    sub-float/2addr v9, v7

    div-float/2addr v9, v8

    invoke-static {v2, v4, v5, v9}, Lcom/daaw/nd1;->a(Landroid/view/View;Landroid/view/View;FF)V

    iget-object v2, p0, Lcom/daaw/no$i;->j:Landroid/view/View;

    iget-object v4, p0, Lcom/daaw/no$i;->k:Landroid/view/View;

    iget v5, p0, Lcom/daaw/no$i;->h:F

    iget v7, p0, Lcom/daaw/no$i;->d:F

    sub-float/2addr v5, v7

    iget v8, p0, Lcom/daaw/no$i;->i:F

    div-float/2addr v5, v8

    iget v9, v1, Lcom/daaw/bs1;->b:F

    sub-float/2addr v9, v7

    div-float/2addr v9, v8

    invoke-static {v2, v4, v5, v9}, Lcom/daaw/nd1;->a(Landroid/view/View;Landroid/view/View;FF)V

    iget-boolean v2, p0, Lcom/daaw/no$i;->l:Z

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/daaw/no$i;->m:[Landroid/widget/SeekBar;

    aget-object v2, v2, v6

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/daaw/no$i;->m:[Landroid/widget/SeekBar;

    aget-object v2, v2, v6

    iget v4, v1, Lcom/daaw/bs1;->a:F

    iget v5, p0, Lcom/daaw/no$i;->d:F

    sub-float/2addr v4, v5

    iget v5, p0, Lcom/daaw/no$i;->i:F

    div-float/2addr v4, v5

    float-to-int v4, v4

    invoke-virtual {v2, v4}, Landroid/widget/SeekBar;->setProgress(I)V

    :cond_1
    iget-object v2, p0, Lcom/daaw/no$i;->n:[Landroid/widget/SeekBar;

    aget-object v2, v2, v6

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/daaw/no$i;->n:[Landroid/widget/SeekBar;

    aget-object v2, v2, v6

    iget v4, v1, Lcom/daaw/bs1;->b:F

    iget v5, p0, Lcom/daaw/no$i;->d:F

    sub-float/2addr v4, v5

    iget v5, p0, Lcom/daaw/no$i;->i:F

    div-float/2addr v4, v5

    float-to-int v4, v4

    invoke-virtual {v2, v4}, Landroid/widget/SeekBar;->setProgress(I)V

    :cond_2
    iget-object v2, p0, Lcom/daaw/no$i;->o:[Landroid/widget/EditText;

    aget-object v2, v2, v6

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v4, "%.3f"

    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/daaw/no$i;->o:[Landroid/widget/EditText;

    aget-object v2, v2, v6

    new-array v5, v0, [Ljava/lang/Object;

    iget v7, v1, Lcom/daaw/bs1;->a:F

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    iget-object v2, p0, Lcom/daaw/no$i;->p:[Landroid/widget/EditText;

    aget-object v2, v2, v6

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/daaw/no$i;->p:[Landroid/widget/EditText;

    aget-object p1, p1, v6

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, v1, Lcom/daaw/bs1;->b:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v0, v6

    invoke-static {v3, v4, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    iput-boolean v6, p0, Lcom/daaw/no$i;->a:Z

    return-void
.end method
