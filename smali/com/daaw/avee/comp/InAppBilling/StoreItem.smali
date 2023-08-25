.class public Lcom/daaw/avee/comp/InAppBilling/StoreItem;
.super Landroid/widget/FrameLayout;
.source ""


# instance fields
.field public p:Landroid/widget/RadioButton;

.field public q:Landroid/widget/TextView;

.field public r:Landroid/widget/TextView;

.field public s:Landroid/widget/TextView;

.field public t:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/daaw/avee/comp/InAppBilling/StoreItem;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->c()V

    return-void
.end method

.method public static a(Ljava/lang/String;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    const-string v0, "M"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Y"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const p0, 0x7f0e0009

    return p0

    :cond_0
    const p0, 0x7f0e000a

    return p0

    :cond_1
    const p0, 0x7f0e0008

    return p0
.end method

.method public static d(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 7

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {p1}, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->a(Ljava/lang/String;)I

    move-result v3

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    aput-object p1, v4, v1

    invoke-virtual {v2, v3, v0, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private getIsPurchased()Z
    .locals 3

    sget-object v0, Lcom/daaw/nc0;->o:Lcom/daaw/ww1;

    iget-object v1, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->t:Ljava/lang/String;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public b()V
    .locals 3

    invoke-direct {p0}, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->getIsPurchased()Z

    move-result v0

    const v1, 0x7f100296

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->s:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->s:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0600fc

    invoke-static {v1, v2}, Lcom/daaw/zk;->c(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->s:Landroid/widget/TextView;

    const/high16 v1, 0x41600000    # 14.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->s:Landroid/widget/TextView;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->s:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->s:Landroid/widget/TextView;

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final c()V
    .locals 3

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c00d7

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0900aa

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RadioButton;

    iput-object v1, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->p:Landroid/widget/RadioButton;

    const v1, 0x7f090200

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->q:Landroid/widget/TextView;

    const v1, 0x7f09016b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->r:Landroid/widget/TextView;

    const v1, 0x7f090293

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->s:Landroid/widget/TextView;

    return-void
.end method

.method public e()V
    .locals 2

    invoke-direct {p0}, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->getIsPurchased()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->s:Landroid/widget/TextView;

    const v1, 0x7f100294

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->s:Landroid/widget/TextView;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->s:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public getSku()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->t:Ljava/lang/String;

    return-object v0
.end method

.method public onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->p:Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->q:Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->r:Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->s:Landroid/widget/TextView;

    return-void
.end method

.method public setChecked(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->p:Landroid/widget/RadioButton;

    invoke-virtual {v0, p1}, Landroid/widget/RadioButton;->setChecked(Z)V

    return-void
.end method

.method public setDetails(Lcom/daaw/kz0;)V
    .locals 4

    if-nez p1, :cond_0

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    invoke-virtual {p1}, Lcom/daaw/kz0;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->t:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/wb;->m(Lcom/daaw/kz0;)Lcom/daaw/kz0$b;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->q:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/daaw/kz0$b;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\u00a0"

    const-string v3, " "

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->r:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/daaw/kz0$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/InAppBilling/StoreItem;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
