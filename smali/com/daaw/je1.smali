.class public Lcom/daaw/je1;
.super Landroid/widget/PopupWindow;
.source ""


# static fields
.field public static c:Lcom/daaw/yw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/yw1<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/sd0;",
            "Ljava/lang/String;",
            "Lcom/daaw/ie1$i;",
            ">;"
        }
    .end annotation
.end field

.field public static d:Lcom/daaw/tw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/tw1<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/sd0;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/widget/RadioButton;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/widget/CheckBox;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/yw1;

    invoke-direct {v0}, Lcom/daaw/yw1;-><init>()V

    sput-object v0, Lcom/daaw/je1;->c:Lcom/daaw/yw1;

    new-instance v0, Lcom/daaw/tw1;

    invoke-direct {v0}, Lcom/daaw/tw1;-><init>()V

    sput-object v0, Lcom/daaw/je1;->d:Lcom/daaw/tw1;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/al;Landroid/view/View;Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x7f110115

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object v0, p0, Lcom/daaw/je1;->a:Ljava/util/List;

    iput-object v0, p0, Lcom/daaw/je1;->b:Ljava/util/List;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/je1;->d(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/je1;ILcom/daaw/sd0;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/je1;->c(ILcom/daaw/sd0;)V

    return-void
.end method

.method public static b(Lcom/daaw/al;Landroid/view/View;Ljava/lang/String;)Lcom/daaw/je1;
    .locals 1

    new-instance v0, Lcom/daaw/je1;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/je1;-><init>(Lcom/daaw/al;Landroid/view/View;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final c(ILcom/daaw/sd0;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/je1;->a:Ljava/util/List;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lcom/daaw/je1;->b:Ljava/util/List;

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/RadioButton;

    invoke-virtual {v3}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Landroid/widget/RadioButton;->getTag()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/je1;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/CheckBox;

    invoke-virtual {v3}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Landroid/widget/CheckBox;->getTag()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    or-int/2addr v1, v3

    goto :goto_1

    :cond_4
    sget-object v0, Lcom/daaw/je1;->d:Lcom/daaw/tw1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v2, v1}, Lcom/daaw/tw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public d(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lcom/daaw/je1;->c:Lcom/daaw/yw1;

    const/4 v3, -0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    move-object/from16 v6, p3

    invoke-virtual {v2, v4, v5, v6, v5}, Lcom/daaw/yw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/ie1$i;

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const v6, 0x7f0c0069

    invoke-static {v4, v6, v5}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    const v6, 0x7f090179

    invoke-virtual {v4, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/LinearLayout;

    const v7, 0x7f090209

    invoke-virtual {v4, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/RadioGroup;

    const v8, 0x7f09025e

    invoke-virtual {v4, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/Space;

    new-instance v9, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v10, -0x2

    invoke-direct {v9, v10, v10}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v11, 0x9

    invoke-virtual {v9, v11, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    new-instance v3, Ljava/util/ArrayList;

    const/4 v11, 0x0

    if-nez v2, :cond_0

    const/4 v12, 0x0

    goto :goto_0

    :cond_0
    iget-object v12, v2, Lcom/daaw/ie1$i;->a:Lcom/daaw/er0;

    invoke-virtual {v12}, Lcom/daaw/er0;->size()I

    move-result v12

    :goto_0
    invoke-direct {v3, v12}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v3, v0, Lcom/daaw/je1;->a:Ljava/util/List;

    new-instance v3, Ljava/util/ArrayList;

    if-nez v2, :cond_1

    const/4 v12, 0x0

    goto :goto_1

    :cond_1
    iget-object v12, v2, Lcom/daaw/ie1$i;->b:Lcom/daaw/er0;

    invoke-virtual {v12}, Lcom/daaw/er0;->size()I

    move-result v12

    :goto_1
    invoke-direct {v3, v12}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v3, v0, Lcom/daaw/je1;->b:Ljava/util/List;

    const/4 v3, 0x1

    if-eqz v2, :cond_6

    iget-object v12, v2, Lcom/daaw/ie1$i;->a:Lcom/daaw/er0;

    invoke-virtual {v12}, Lcom/daaw/er0;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_3

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/daaw/lo1;

    new-instance v14, Landroid/widget/RadioButton;

    invoke-direct {v14, v1}, Landroid/widget/RadioButton;-><init>(Landroid/content/Context;)V

    iget-object v15, v13, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Integer;

    invoke-virtual {v14, v15}, Landroid/widget/RadioButton;->setTag(Ljava/lang/Object;)V

    iget-object v15, v13, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    invoke-virtual {v14, v15}, Landroid/widget/RadioButton;->setText(I)V

    invoke-virtual {v7, v14, v9}, Landroid/widget/RadioGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v13, v13, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget v15, v2, Lcom/daaw/ie1$i;->c:I

    if-ne v13, v15, :cond_2

    invoke-virtual {v14}, Landroid/widget/RadioButton;->getId()I

    move-result v13

    invoke-virtual {v7, v13}, Landroid/widget/RadioGroup;->check(I)V

    :cond_2
    iget-object v13, v0, Lcom/daaw/je1;->a:Ljava/util/List;

    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    iget-object v12, v2, Lcom/daaw/ie1$i;->b:Lcom/daaw/er0;

    invoke-virtual {v12}, Lcom/daaw/er0;->size()I

    move-result v12

    if-lez v12, :cond_4

    goto :goto_3

    :cond_4
    const/16 v11, 0x8

    :goto_3
    invoke-virtual {v8, v11}, Landroid/widget/Space;->setVisibility(I)V

    iget-object v8, v2, Lcom/daaw/ie1$i;->b:Lcom/daaw/er0;

    invoke-virtual {v8}, Lcom/daaw/er0;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/daaw/lo1;

    new-instance v12, Landroid/widget/CheckBox;

    invoke-direct {v12, v1}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;)V

    iget-object v13, v11, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v12, v13}, Landroid/widget/CheckBox;->setTag(Ljava/lang/Object;)V

    iget-object v13, v11, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/widget/CheckBox;->setText(I)V

    iget-object v11, v11, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v13, v2, Lcom/daaw/ie1$i;->d:I

    and-int/2addr v11, v13

    if-eqz v11, :cond_5

    invoke-virtual {v12, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    :cond_5
    invoke-virtual {v6, v12, v9}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v11, Lcom/daaw/je1$a;

    invoke-direct {v11, v0, v5}, Lcom/daaw/je1$a;-><init>(Lcom/daaw/je1;Lcom/daaw/sd0;)V

    invoke-virtual {v12, v11}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v11, v0, Lcom/daaw/je1;->b:Ljava/util/List;

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    new-instance v1, Lcom/daaw/je1$b;

    invoke-direct {v1, v0, v5}, Lcom/daaw/je1$b;-><init>(Lcom/daaw/je1;Lcom/daaw/sd0;)V

    invoke-virtual {v7, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    invoke-virtual {v0, v10}, Landroid/widget/PopupWindow;->setHeight(I)V

    invoke-virtual {v0, v10}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {v0, v3}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    invoke-virtual {v0, v3}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;)V

    return-void
.end method
