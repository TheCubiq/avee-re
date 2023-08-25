.class public Lcom/daaw/oo$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/oo;->K(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;ZLjava/lang/String;Ljava/lang/String;FFF)V
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
.field public final synthetic a:[Z

.field public final synthetic b:Lcom/daaw/un;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/daaw/dm0;

.field public final synthetic e:Z

.field public final synthetic f:Landroid/widget/TextView;

.field public final synthetic g:Landroid/view/ViewGroup;

.field public final synthetic h:Landroid/view/View;

.field public final synthetic i:Landroid/view/View;

.field public final synthetic j:F

.field public final synthetic k:F

.field public final synthetic l:F

.field public final synthetic m:Z

.field public final synthetic n:I

.field public final synthetic o:[Landroid/widget/SeekBar;

.field public final synthetic p:[Landroid/widget/SeekBar;

.field public final synthetic q:[Landroid/widget/EditText;

.field public final synthetic r:[Landroid/widget/EditText;

.field public final synthetic s:[Landroid/widget/Spinner;

.field public final synthetic t:[Ljava/lang/String;

.field public final synthetic u:[Landroid/widget/TextView;

.field public final synthetic v:[Landroid/widget/TextView;


# direct methods
.method public constructor <init>([ZLcom/daaw/un;Ljava/lang/String;Lcom/daaw/dm0;ZLandroid/widget/TextView;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;FFFZI[Landroid/widget/SeekBar;[Landroid/widget/SeekBar;[Landroid/widget/EditText;[Landroid/widget/EditText;[Landroid/widget/Spinner;[Ljava/lang/String;[Landroid/widget/TextView;[Landroid/widget/TextView;)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, Lcom/daaw/oo$c;->a:[Z

    move-object v1, p2

    iput-object v1, v0, Lcom/daaw/oo$c;->b:Lcom/daaw/un;

    move-object v1, p3

    iput-object v1, v0, Lcom/daaw/oo$c;->c:Ljava/lang/String;

    move-object v1, p4

    iput-object v1, v0, Lcom/daaw/oo$c;->d:Lcom/daaw/dm0;

    move v1, p5

    iput-boolean v1, v0, Lcom/daaw/oo$c;->e:Z

    move-object v1, p6

    iput-object v1, v0, Lcom/daaw/oo$c;->f:Landroid/widget/TextView;

    move-object v1, p7

    iput-object v1, v0, Lcom/daaw/oo$c;->g:Landroid/view/ViewGroup;

    move-object v1, p8

    iput-object v1, v0, Lcom/daaw/oo$c;->h:Landroid/view/View;

    move-object v1, p9

    iput-object v1, v0, Lcom/daaw/oo$c;->i:Landroid/view/View;

    move v1, p10

    iput v1, v0, Lcom/daaw/oo$c;->j:F

    move v1, p11

    iput v1, v0, Lcom/daaw/oo$c;->k:F

    move v1, p12

    iput v1, v0, Lcom/daaw/oo$c;->l:F

    move v1, p13

    iput-boolean v1, v0, Lcom/daaw/oo$c;->m:Z

    move/from16 v1, p14

    iput v1, v0, Lcom/daaw/oo$c;->n:I

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/daaw/oo$c;->o:[Landroid/widget/SeekBar;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/daaw/oo$c;->p:[Landroid/widget/SeekBar;

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/daaw/oo$c;->q:[Landroid/widget/EditText;

    move-object/from16 v1, p18

    iput-object v1, v0, Lcom/daaw/oo$c;->r:[Landroid/widget/EditText;

    move-object/from16 v1, p19

    iput-object v1, v0, Lcom/daaw/oo$c;->s:[Landroid/widget/Spinner;

    move-object/from16 v1, p20

    iput-object v1, v0, Lcom/daaw/oo$c;->t:[Ljava/lang/String;

    move-object/from16 v1, p21

    iput-object v1, v0, Lcom/daaw/oo$c;->u:[Landroid/widget/TextView;

    move-object/from16 v1, p22

    iput-object v1, v0, Lcom/daaw/oo$c;->v:[Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 13

    iget-object v0, p0, Lcom/daaw/oo$c;->a:[Z

    const/4 v1, 0x0

    aget-boolean v2, v0, v1

    if-eqz v2, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x1

    aput-boolean v2, v0, v1

    iget-object v0, p0, Lcom/daaw/oo$c;->b:Lcom/daaw/un;

    iget-object v3, p0, Lcom/daaw/oo$c;->c:Ljava/lang/String;

    new-instance v4, Lcom/daaw/dm0;

    iget-object v5, p0, Lcom/daaw/oo$c;->d:Lcom/daaw/dm0;

    invoke-direct {v4, v5}, Lcom/daaw/dm0;-><init>(Lcom/daaw/dm0;)V

    invoke-virtual {v0, v3, v4}, Lcom/daaw/un;->s(Ljava/lang/String;Lcom/daaw/dm0;)Lcom/daaw/dm0;

    move-result-object v0

    iget-boolean v3, p0, Lcom/daaw/oo$c;->e:Z

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/daaw/oo$c;->f:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/daaw/oo$c;->g:Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/daaw/dm0;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lcom/daaw/oo$c;->f:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/daaw/oo$c;->g:Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/daaw/dm0;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    :goto_0
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, Lcom/daaw/oo$c;->h:Landroid/view/View;

    iget-object v4, p0, Lcom/daaw/oo$c;->i:Landroid/view/View;

    iget v5, p0, Lcom/daaw/oo$c;->j:F

    iget v6, p0, Lcom/daaw/oo$c;->k:F

    sub-float/2addr v5, v6

    iget v6, p0, Lcom/daaw/oo$c;->l:F

    div-float/2addr v5, v6

    invoke-virtual {v0}, Lcom/daaw/dm0;->f()F

    move-result v6

    iget v7, p0, Lcom/daaw/oo$c;->k:F

    sub-float/2addr v6, v7

    iget v7, p0, Lcom/daaw/oo$c;->l:F

    div-float/2addr v6, v7

    invoke-static {v3, v4, v5, v6}, Lcom/daaw/nd1;->a(Landroid/view/View;Landroid/view/View;FF)V

    iget-boolean v3, p0, Lcom/daaw/oo$c;->m:Z

    if-eqz v3, :cond_f

    const/4 v3, 0x0

    :goto_1
    iget v4, p0, Lcom/daaw/oo$c;->n:I

    if-ge v3, v4, :cond_f

    invoke-virtual {v0, v3}, Lcom/daaw/dm0;->g(I)Lcom/daaw/xn0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/xn0;->e()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/daaw/wn0;->e(Ljava/lang/String;)Lcom/daaw/wn0$a;

    move-result-object v5

    if-eqz v5, :cond_3

    iget-boolean v6, p0, Lcom/daaw/oo$c;->e:Z

    if-nez v6, :cond_3

    iget-boolean v6, v5, Lcom/daaw/wn0$a;->d:Z

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v6, 0x1

    :goto_3
    const-string v7, "%.3f"

    if-eqz v6, :cond_7

    invoke-virtual {v4}, Lcom/daaw/xn0;->g()Lcom/daaw/bs1;

    move-result-object v8

    iget-object v9, p0, Lcom/daaw/oo$c;->o:[Landroid/widget/SeekBar;

    aget-object v9, v9, v3

    invoke-virtual {v9, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    iget-object v9, p0, Lcom/daaw/oo$c;->o:[Landroid/widget/SeekBar;

    aget-object v9, v9, v3

    iget v10, v8, Lcom/daaw/bs1;->a:F

    iget v11, p0, Lcom/daaw/oo$c;->k:F

    sub-float/2addr v10, v11

    iget v11, p0, Lcom/daaw/oo$c;->l:F

    div-float/2addr v10, v11

    float-to-int v10, v10

    invoke-virtual {v9, v10}, Landroid/widget/SeekBar;->setProgress(I)V

    :cond_4
    iget-object v9, p0, Lcom/daaw/oo$c;->p:[Landroid/widget/SeekBar;

    aget-object v9, v9, v3

    invoke-virtual {v9, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    iget-object v9, p0, Lcom/daaw/oo$c;->p:[Landroid/widget/SeekBar;

    aget-object v9, v9, v3

    iget v10, v8, Lcom/daaw/bs1;->b:F

    iget v11, p0, Lcom/daaw/oo$c;->k:F

    sub-float/2addr v10, v11

    iget v11, p0, Lcom/daaw/oo$c;->l:F

    div-float/2addr v10, v11

    float-to-int v10, v10

    invoke-virtual {v9, v10}, Landroid/widget/SeekBar;->setProgress(I)V

    :cond_5
    iget-object v9, p0, Lcom/daaw/oo$c;->q:[Landroid/widget/EditText;

    aget-object v9, v9, v3

    invoke-virtual {v9, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    iget-object v9, p0, Lcom/daaw/oo$c;->q:[Landroid/widget/EditText;

    aget-object v9, v9, v3

    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v11, v2, [Ljava/lang/Object;

    iget v12, v8, Lcom/daaw/bs1;->a:F

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    aput-object v12, v11, v1

    invoke-static {v10, v7, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    iget-object v9, p0, Lcom/daaw/oo$c;->r:[Landroid/widget/EditText;

    aget-object v9, v9, v3

    invoke-virtual {v9, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    iget-object v9, p0, Lcom/daaw/oo$c;->r:[Landroid/widget/EditText;

    aget-object v9, v9, v3

    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v11, v2, [Ljava/lang/Object;

    iget v8, v8, Lcom/daaw/bs1;->b:F

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    aput-object v8, v11, v1

    invoke-static {v10, v7, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    :cond_7
    invoke-virtual {v4}, Lcom/daaw/xn0;->f()F

    move-result v8

    iget-object v9, p0, Lcom/daaw/oo$c;->o:[Landroid/widget/SeekBar;

    aget-object v9, v9, v3

    invoke-virtual {v9, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    iget-object v9, p0, Lcom/daaw/oo$c;->o:[Landroid/widget/SeekBar;

    aget-object v9, v9, v3

    iget v10, p0, Lcom/daaw/oo$c;->k:F

    sub-float v10, v8, v10

    iget v11, p0, Lcom/daaw/oo$c;->l:F

    div-float/2addr v10, v11

    float-to-int v10, v10

    invoke-virtual {v9, v10}, Landroid/widget/SeekBar;->setProgress(I)V

    :cond_8
    iget-object v9, p0, Lcom/daaw/oo$c;->q:[Landroid/widget/EditText;

    aget-object v9, v9, v3

    invoke-virtual {v9, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    iget-object v9, p0, Lcom/daaw/oo$c;->q:[Landroid/widget/EditText;

    aget-object v9, v9, v3

    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v11, v2, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    aput-object v8, v11, v1

    invoke-static {v10, v7, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    :goto_4
    invoke-virtual {v9, v7}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_9
    iget-object v7, p0, Lcom/daaw/oo$c;->s:[Landroid/widget/Spinner;

    aget-object v7, v7, v3

    invoke-virtual {v7, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    iget-object v7, p0, Lcom/daaw/oo$c;->t:[Ljava/lang/String;

    invoke-virtual {v4}, Lcom/daaw/xn0;->e()Ljava/lang/String;

    move-result-object v4

    invoke-static {v7, v4}, Lcom/daaw/br1;->e([Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    iget-object v7, p0, Lcom/daaw/oo$c;->s:[Landroid/widget/Spinner;

    aget-object v7, v7, v3

    invoke-virtual {v7, v4, v1}, Landroid/widget/Spinner;->setSelection(IZ)V

    :cond_a
    iget-object v4, p0, Lcom/daaw/oo$c;->u:[Landroid/widget/TextView;

    if-eqz v5, :cond_b

    aget-object v4, v4, v3

    iget-object v7, v5, Lcom/daaw/wn0$a;->b:Ljava/lang/String;

    iget-object v8, p0, Lcom/daaw/oo$c;->g:Landroid/view/ViewGroup;

    invoke-virtual {v8}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/daaw/oo;->J(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, Lcom/daaw/oo$c;->v:[Landroid/widget/TextView;

    aget-object v4, v4, v3

    iget-object v5, v5, Lcom/daaw/wn0$a;->c:Ljava/lang/String;

    iget-object v7, p0, Lcom/daaw/oo$c;->g:Landroid/view/ViewGroup;

    invoke-virtual {v7}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v5, v7}, Lcom/daaw/oo;->J(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    goto :goto_5

    :cond_b
    aget-object v4, v4, v3

    const-string v5, ""

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, Lcom/daaw/oo$c;->v:[Landroid/widget/TextView;

    aget-object v4, v4, v3

    :goto_5
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, Lcom/daaw/oo$c;->p:[Landroid/widget/SeekBar;

    aget-object v4, v4, v3

    const/16 v5, 0x8

    if-eqz v6, :cond_c

    const/4 v7, 0x0

    goto :goto_6

    :cond_c
    const/16 v7, 0x8

    :goto_6
    invoke-virtual {v4, v7}, Landroid/widget/SeekBar;->setVisibility(I)V

    iget-object v4, p0, Lcom/daaw/oo$c;->r:[Landroid/widget/EditText;

    aget-object v4, v4, v3

    if-eqz v6, :cond_d

    const/4 v7, 0x0

    goto :goto_7

    :cond_d
    const/16 v7, 0x8

    :goto_7
    invoke-virtual {v4, v7}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v4, p0, Lcom/daaw/oo$c;->v:[Landroid/widget/TextView;

    aget-object v4, v4, v3

    if-eqz v6, :cond_e

    const/4 v5, 0x0

    :cond_e
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setVisibility(I)V

    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_1

    :cond_f
    iget-object p1, p0, Lcom/daaw/oo$c;->a:[Z

    aput-boolean v1, p1, v1

    return-void
.end method
