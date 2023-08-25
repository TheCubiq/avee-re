.class public Lcom/daaw/no$q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/no;->p(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V
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
.field public final synthetic a:Lcom/daaw/un;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/widget/TextView;

.field public final synthetic d:Landroid/widget/ImageButton;

.field public final synthetic e:Z

.field public final synthetic f:Z

.field public final synthetic g:[Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lcom/daaw/un;Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/ImageButton;ZZ[Landroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/no$q;->a:Lcom/daaw/un;

    iput-object p2, p0, Lcom/daaw/no$q;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/no$q;->c:Landroid/widget/TextView;

    iput-object p4, p0, Lcom/daaw/no$q;->d:Landroid/widget/ImageButton;

    iput-boolean p5, p0, Lcom/daaw/no$q;->e:Z

    iput-boolean p6, p0, Lcom/daaw/no$q;->f:Z

    iput-object p7, p0, Lcom/daaw/no$q;->g:[Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/no$q;->a:Lcom/daaw/un;

    iget-object v1, p0, Lcom/daaw/no$q;->b:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/daaw/un;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/qg0;->a(Ljava/lang/String;)I

    move-result v1

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-gtz v1, :cond_3

    invoke-static {v0}, Lcom/daaw/xi;->i0(Ljava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_0

    iget-object v3, p0, Lcom/daaw/no$q;->c:Landroid/widget/TextView;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v3, p0, Lcom/daaw/no$q;->c:Landroid/widget/TextView;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/daaw/no$q;->d:Landroid/widget/ImageButton;

    const v3, 0x7f08012e

    :goto_0
    invoke-virtual {v1, v3}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_2

    :cond_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/daaw/no$q;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, p0, Lcom/daaw/no$q;->d:Landroid/widget/ImageButton;

    const v3, 0x7f080130

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/daaw/no$q;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, p0, Lcom/daaw/no$q;->d:Landroid/widget/ImageButton;

    invoke-virtual {v1, v4}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_2

    :cond_3
    iget-object v5, p0, Lcom/daaw/no$q;->c:Landroid/widget/TextView;

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v3, p0, Lcom/daaw/no$q;->d:Landroid/widget/ImageButton;

    invoke-virtual {v3, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    :goto_2
    iget-boolean v1, p0, Lcom/daaw/no$q;->e:Z

    if-eqz v1, :cond_8

    iget-boolean v1, p0, Lcom/daaw/no$q;->f:Z

    if-nez v1, :cond_8

    iget-object v1, p0, Lcom/daaw/no$q;->g:[Landroid/widget/TextView;

    aget-object v1, v1, v4

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/daaw/no$q;->g:[Landroid/widget/TextView;

    aget-object p1, p1, v4

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    const/4 p1, 0x1

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/daaw/no$q;->g:[Landroid/widget/TextView;

    aget-object p1, v0, p1

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    :cond_5
    const-string v1, "composition:((\\d*))"

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/br1;->E(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    :goto_3
    iget-object v1, p0, Lcom/daaw/no$q;->g:[Landroid/widget/TextView;

    aget-object v3, v1, p1

    if-nez v0, :cond_7

    goto :goto_4

    :cond_7
    aget-object v1, v1, p1

    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e000b

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    new-array p1, p1, [Ljava/lang/Object;

    aput-object v0, p1, v4

    invoke-virtual {v1, v2, v5, p1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :goto_4
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_8
    :goto_5
    return-void
.end method
