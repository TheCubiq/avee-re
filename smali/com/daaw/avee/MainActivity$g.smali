.class public Lcom/daaw/avee/MainActivity$g;
.super Lcom/daaw/x30;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation


# instance fields
.field public final synthetic f:Lcom/daaw/avee/MainActivity;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/MainActivity;Landroid/app/FragmentManager;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/MainActivity$g;->f:Lcom/daaw/avee/MainActivity;

    invoke-direct {p0, p2}, Lcom/daaw/x30;-><init>(Landroid/app/FragmentManager;)V

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public e(I)Ljava/lang/CharSequence;
    .locals 6

    const/4 v0, 0x2

    const-string v1, "   "

    const/4 v2, 0x1

    if-eqz p1, :cond_2

    if-eq p1, v2, :cond_1

    if-eq p1, v0, :cond_0

    const-string p1, " "

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/MainActivity$g;->f:Lcom/daaw/avee/MainActivity;

    const v3, 0x7f08012f

    invoke-static {p1, v3}, Lcom/daaw/zk;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/MainActivity$g;->f:Lcom/daaw/avee/MainActivity;

    const v3, 0x7f08010e

    invoke-static {p1, v3}, Lcom/daaw/zk;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/daaw/avee/MainActivity$g;->f:Lcom/daaw/avee/MainActivity;

    const v3, 0x7f0800f5

    invoke-static {p1, v3}, Lcom/daaw/zk;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    :goto_0
    if-nez p1, :cond_3

    const-string p1, ""

    return-object p1

    :cond_3
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {p1, v5, v5, v1, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    new-instance v1, Landroid/text/style/ImageSpan;

    invoke-direct {v1, p1, v2}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;I)V

    const/16 p1, 0x21

    invoke-virtual {v3, v1, v2, v0, p1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    return-object v3
.end method

.method public p(I)Landroid/app/Fragment;
    .locals 1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {}, Lcom/daaw/o30;->i()Lcom/daaw/o30;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {}, Lcom/daaw/n30;->o()Lcom/daaw/n30;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, Lcom/daaw/m30;->w()Lcom/daaw/m30;

    move-result-object p1

    return-object p1
.end method
