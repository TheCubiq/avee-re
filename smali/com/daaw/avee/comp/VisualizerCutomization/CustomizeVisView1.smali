.class public Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;
.super Ljava/lang/Object;
.source "CustomizeVisView1.java"


# instance fields
.field private currentElementCustom:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field private customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

.field private linearLayoutRootContent:Landroid/view/ViewGroup;

.field private propertiesExpandViews:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private propertiesUpdateValueCb:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private spinnerVersion:Landroid/widget/Spinner;

.field spinnerVersionInitalSelectedPosition:I

.field private spinnerVersionOnItemClickListener:Landroid/widget/AdapterView$OnItemSelectedListener;

.field private txtElementTitle:Landroid/widget/TextView;

.field private view1RootView:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;)V
    .locals 1

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 58
    iput v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->spinnerVersionInitalSelectedPosition:I

    .line 61
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->propertiesExpandViews:Ljava/util/Map;

    .line 62
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->propertiesUpdateValueCb:Ljava/util/Map;

    .line 69
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->currentElementCustom:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Ljava/util/Map;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->propertiesExpandViews:Ljava/util/Map;

    return-object p0
.end method

.method private static argb(II)I
    .locals 1

    shl-int/lit8 p0, p0, 0x18

    const v0, 0xffffff

    and-int/2addr p1, v0

    or-int/2addr p0, p1

    return p0
.end method

.method private static createChildView(ZLcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;",
            "Landroid/view/LayoutInflater;",
            "Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;",
            "Z",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Object;",
            ">;>;",
            "Landroid/view/ViewGroup;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v5, p3

    move-object/from16 v11, p6

    move-object/from16 v6, p8

    move-object/from16 v12, p9

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, ""

    .line 470
    invoke-virtual {v5, v6, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertySelectString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f0c004e

    .line 471
    invoke-virtual {v10, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    move-object v13, v0

    move-object v14, v13

    move-object v15, v2

    goto :goto_0

    .line 473
    :cond_0
    invoke-virtual {v5, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v1

    .line 474
    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName()Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f0c0049

    .line 475
    invoke-virtual {v10, v3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v3, 0x7f09013c

    .line 476
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    move-object v15, v0

    move-object v13, v1

    move-object v1, v2

    move-object v14, v3

    :goto_0
    const v0, 0x7f090217

    .line 484
    invoke-virtual {v15, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    move-object/from16 v0, p7

    .line 485
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x1

    new-array v2, v0, [Z

    const/4 v7, 0x0

    aput-boolean v7, v2, v7

    const v3, 0x7f0901dd

    .line 490
    invoke-virtual {v15, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Landroid/widget/Spinner;

    const/4 v3, 0x0

    .line 493
    :goto_1
    array-length v0, v12

    if-ge v3, v0, :cond_2

    .line 494
    aget-object v0, v12, v3

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, -0x1

    .line 500
    :goto_2
    new-instance v0, Landroid/widget/ArrayAdapter;

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v7, 0x1090008

    invoke-direct {v0, v1, v7, v12}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 502
    invoke-virtual {v4, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    const/4 v7, 0x0

    if-ltz v3, :cond_3

    .line 504
    invoke-virtual {v4, v3, v7}, Landroid/widget/Spinner;->setSelection(IZ)V

    .line 506
    :cond_3
    invoke-virtual {v9, v4}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->ApplySpinnerTheme(Landroid/widget/Spinner;)V

    const/4 v0, 0x1

    aput-boolean v0, v2, v7

    .line 510
    new-instance v3, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;

    move-object v0, v3

    move-object/from16 v1, p1

    move-object v9, v3

    move-object/from16 v3, p9

    move-object v10, v4

    move/from16 v4, p0

    move-object/from16 v5, p3

    move-object/from16 v6, p8

    move-object/from16 p4, v14

    const/4 v14, 0x0

    move-object/from16 v7, p5

    move-object/from16 p3, v8

    move-object v8, v13

    invoke-direct/range {v0 .. v8}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;[Z[Ljava/lang/String;ZLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/Common/Func/Func;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    invoke-virtual {v10, v9}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 544
    array-length v0, v12

    const/16 v1, 0x8

    if-lez v0, :cond_4

    .line 545
    invoke-virtual {v10, v14}, Landroid/widget/Spinner;->setVisibility(I)V

    goto :goto_3

    .line 547
    :cond_4
    invoke-virtual {v10, v1}, Landroid/widget/Spinner;->setVisibility(I)V

    .line 548
    invoke-virtual/range {p3 .. p3}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f060128

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    move-object/from16 v2, p3

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_3
    if-eqz p0, :cond_5

    .line 553
    invoke-virtual {v11, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_4

    .line 556
    :cond_5
    invoke-virtual {v13}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->GetAllPropertiesSortedByOrder()Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p4

    invoke-static {v2, v3, v13, v4, v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->parseDataRecursive(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Landroid/view/ViewGroup;Ljava/util/Iterator;)I

    move-result v0

    .line 558
    array-length v2, v12

    if-gtz v2, :cond_6

    if-lez v0, :cond_7

    .line 560
    :cond_6
    invoke-virtual {v11, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_7
    if-gtz v0, :cond_8

    .line 563
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_8
    :goto_4
    return-void
.end method

.method protected static createPropertyCommon(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLandroid/view/View;Ljava/lang/String;Lcom/daaw/avee/Common/Action1;)Lcom/daaw/avee/Common/Action1;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;",
            "Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;",
            "Z",
            "Landroid/view/View;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 577
    invoke-virtual {p0, p1, p4, p5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->view1AddPropertyUpdateValueCb(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/Common/Action1;)V

    :cond_0
    if-eqz p2, :cond_1

    const p0, 0x7f0900d2

    .line 581
    invoke-virtual {p3, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_2

    const/4 p1, 0x0

    .line 582
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_1
    const p2, 0x7f0900d3

    .line 584
    invoke-virtual {p3, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    .line 585
    new-instance v6, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$9;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p4

    move-object v4, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$9;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Landroid/view/View;Lcom/daaw/avee/Common/Action1;)V

    invoke-virtual {p2, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    :goto_0
    if-eqz p5, :cond_3

    const/4 p0, 0x0

    .line 593
    invoke-interface {p5, p0}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    :cond_3
    return-object p5
.end method

.method private static createPropertyCommon(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLandroid/view/View;Ljava/lang/String;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 570
    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyCommon(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLandroid/view/View;Ljava/lang/String;Lcom/daaw/avee/Common/Action1;)Lcom/daaw/avee/Common/Action1;

    return-void
.end method

.method public static createPropertyView(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Landroid/view/ViewGroup;Ljava/lang/String;ZLcom/daaw/avee/Common/Func/Func;)Z
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;",
            "Landroid/view/LayoutInflater;",
            "Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;",
            "Landroid/view/ViewGroup;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Object;",
            ">;>;)Z"
        }
    .end annotation

    move-object/from16 v3, p2

    move-object/from16 v9, p4

    .line 364
    invoke-virtual {v3, v9}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 365
    invoke-virtual {v3, v9}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyHint(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 367
    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyTypeParts(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    .line 368
    aget-object v4, v0, v2

    const-string v5, "i"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x2

    const/4 v6, 0x3

    const/4 v12, 0x1

    if-eqz v4, :cond_0

    array-length v4, v0

    if-lt v4, v6, :cond_0

    .line 369
    aget-object v4, v0, v12

    invoke-static {v4, v2}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;I)I

    move-result v8

    .line 370
    aget-object v0, v0, v5

    const/16 v2, 0x64

    invoke-static {v0, v2}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;I)I

    move-result v10

    .line 371
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object/from16 v7, p4

    move v9, v10

    invoke-static/range {v0 .. v9}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewInt(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;II)V

    goto/16 :goto_0

    .line 372
    :cond_0
    aget-object v4, v0, v2

    const-string v7, "pb"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 373
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object/from16 v7, p4

    invoke-static/range {v0 .. v8}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewBool(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_0

    .line 374
    :cond_1
    aget-object v4, v0, v2

    const-string v7, "b"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 375
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object/from16 v7, p4

    invoke-static/range {v0 .. v8}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewBool(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_0

    .line 376
    :cond_2
    aget-object v4, v0, v2

    const-string v7, "crgb"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 377
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object/from16 v9, p4

    invoke-static/range {v0 .. v9}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewRGBA(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;ZZLjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 378
    :cond_3
    aget-object v4, v0, v2

    const-string v7, "crgba"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 379
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object/from16 v9, p4

    invoke-static/range {v0 .. v9}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewRGBA(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;ZZLjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 380
    :cond_4
    aget-object v4, v0, v2

    const-string v7, "crgb_hl"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 381
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object/from16 v9, p4

    invoke-static/range {v0 .. v9}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewRGBA(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;ZZLjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 382
    :cond_5
    aget-object v4, v0, v2

    const-string v7, "chsl4f"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/4 v6, 0x0

    const/4 v7, 0x1

    .line 383
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object/from16 v9, p4

    invoke-static/range {v0 .. v9}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewRGBA(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;ZZLjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 384
    :cond_6
    aget-object v4, v0, v2

    const-string v7, "chsla4f"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/4 v6, 0x1

    const/4 v7, 0x1

    .line 385
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object/from16 v9, p4

    invoke-static/range {v0 .. v9}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewRGBA(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;ZZLjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 386
    :cond_7
    aget-object v4, v0, v2

    const-string v7, "f"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/high16 v7, 0x42200000    # 40.0f

    const/high16 v8, 0x42c80000    # 100.0f

    const/4 v10, 0x0

    if-eqz v4, :cond_8

    array-length v4, v0

    if-lt v4, v6, :cond_8

    .line 387
    aget-object v2, v0, v12

    invoke-static {v2, v10}, Lcom/daaw/avee/Common/Utils;->strToFloatSafe(Ljava/lang/String;F)F

    move-result v10

    .line 388
    aget-object v0, v0, v5

    invoke-static {v0, v8}, Lcom/daaw/avee/Common/Utils;->strToFloatSafe(Ljava/lang/String;F)F

    move-result v11

    .line 389
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    sub-float v0, v11, v10

    div-float v13, v0, v7

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object/from16 v7, p4

    move v8, v10

    move v9, v11

    move v10, v13

    invoke-static/range {v0 .. v10}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewFloat(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;FFF)V

    goto/16 :goto_0

    .line 390
    :cond_8
    aget-object v4, v0, v2

    const-string v11, "f2"

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    array-length v4, v0

    if-lt v4, v6, :cond_9

    .line 391
    aget-object v2, v0, v12

    invoke-static {v2, v10}, Lcom/daaw/avee/Common/Utils;->strToFloatSafe(Ljava/lang/String;F)F

    move-result v10

    .line 392
    aget-object v0, v0, v5

    invoke-static {v0, v8}, Lcom/daaw/avee/Common/Utils;->strToFloatSafe(Ljava/lang/String;F)F

    move-result v11

    .line 393
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    sub-float v0, v11, v10

    div-float v13, v0, v7

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object/from16 v7, p4

    move v8, v10

    move v9, v11

    move v10, v13

    invoke-static/range {v0 .. v10}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewVec2f(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;FFF)V

    goto/16 :goto_0

    .line 394
    :cond_9
    aget-object v4, v0, v2

    const-string v11, "mvarf"

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    array-length v4, v0

    if-lt v4, v6, :cond_a

    .line 395
    aget-object v2, v0, v12

    invoke-static {v2, v10}, Lcom/daaw/avee/Common/Utils;->strToFloatSafe(Ljava/lang/String;F)F

    move-result v10

    .line 396
    aget-object v0, v0, v5

    invoke-static {v0, v8}, Lcom/daaw/avee/Common/Utils;->strToFloatSafe(Ljava/lang/String;F)F

    move-result v11

    const/4 v6, 0x0

    .line 397
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    sub-float v0, v11, v10

    div-float v13, v0, v7

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object v7, v8

    move-object/from16 v8, p4

    move v9, v10

    move v10, v11

    move v11, v13

    invoke-static/range {v0 .. v11}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar;->createPropertyViewMVarFloat(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;ZLjava/lang/String;Ljava/lang/String;FFF)V

    goto/16 :goto_0

    .line 398
    :cond_a
    aget-object v4, v0, v2

    const-string v11, "mvarf2"

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    array-length v4, v0

    if-lt v4, v6, :cond_b

    .line 399
    aget-object v2, v0, v12

    invoke-static {v2, v10}, Lcom/daaw/avee/Common/Utils;->strToFloatSafe(Ljava/lang/String;F)F

    move-result v10

    .line 400
    aget-object v0, v0, v5

    invoke-static {v0, v8}, Lcom/daaw/avee/Common/Utils;->strToFloatSafe(Ljava/lang/String;F)F

    move-result v11

    const/4 v6, 0x1

    .line 401
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    sub-float v0, v11, v10

    div-float v13, v0, v7

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object v7, v8

    move-object/from16 v8, p4

    move v9, v10

    move v10, v11

    move v11, v13

    invoke-static/range {v0 .. v11}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar;->createPropertyViewMVarFloat(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;ZLjava/lang/String;Ljava/lang/String;FFF)V

    goto/16 :goto_0

    .line 402
    :cond_b
    aget-object v4, v0, v2

    const-string v5, "txt"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    .line 403
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object/from16 v7, p4

    invoke-static/range {v0 .. v8}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewText(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_0

    .line 404
    :cond_c
    aget-object v4, v0, v2

    const-string v5, "ptxt"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    .line 405
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object/from16 v7, p4

    invoke-static/range {v0 .. v8}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewText(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_0

    .line 406
    :cond_d
    aget-object v4, v0, v2

    const-string v5, "img"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    .line 407
    array-length v4, v0

    sub-int/2addr v4, v12

    new-array v8, v4, [Ljava/lang/String;

    .line 408
    invoke-static {v0, v12, v8, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 409
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object/from16 v7, p4

    move v9, v10

    invoke-static/range {v0 .. v9}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewImage(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V

    goto/16 :goto_0

    .line 410
    :cond_e
    aget-object v4, v0, v2

    const-string v5, "pimg"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    .line 411
    array-length v4, v0

    sub-int/2addr v4, v12

    new-array v8, v4, [Ljava/lang/String;

    .line 412
    invoke-static {v0, v12, v8, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 413
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object/from16 v7, p4

    move v9, v10

    invoke-static/range {v0 .. v9}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewImage(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V

    goto/16 :goto_0

    .line 414
    :cond_f
    aget-object v4, v0, v2

    const-string v5, "asset"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    .line 415
    array-length v4, v0

    sub-int/2addr v4, v12

    new-array v8, v4, [Ljava/lang/String;

    .line 416
    invoke-static {v0, v12, v8, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 417
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object/from16 v7, p4

    move v9, v10

    invoke-static/range {v0 .. v9}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewAsset(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V

    goto/16 :goto_0

    .line 418
    :cond_10
    aget-object v4, v0, v2

    const-string v5, "passet"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    .line 419
    array-length v4, v0

    sub-int/2addr v4, v12

    new-array v8, v4, [Ljava/lang/String;

    .line 420
    invoke-static {v0, v12, v8, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 421
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p3

    move-object/from16 v7, p4

    move v9, v10

    invoke-static/range {v0 .. v9}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewAsset(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V

    goto :goto_0

    .line 422
    :cond_11
    aget-object v4, v0, v2

    const-string v5, "sel"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_12

    .line 423
    array-length v4, v0

    sub-int/2addr v4, v12

    new-array v10, v4, [Ljava/lang/String;

    .line 424
    invoke-static {v0, v12, v10, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v0, 0x1

    .line 425
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p3

    move-object/from16 v8, p4

    move-object v9, v10

    invoke-static/range {v0 .. v9}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createChildView(ZLcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    goto :goto_0

    .line 426
    :cond_12
    aget-object v4, v0, v2

    const-string v5, "_child"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_13

    .line 427
    array-length v4, v0

    sub-int/2addr v4, v12

    new-array v10, v4, [Ljava/lang/String;

    .line 428
    invoke-static {v0, v12, v10, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v0, 0x0

    .line 429
    invoke-static {v9, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p3

    move-object/from16 v8, p4

    move-object v9, v10

    invoke-static/range {v0 .. v9}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createChildView(ZLcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    :goto_0
    return v12

    :cond_13
    return v2
.end method

.method private static createPropertyViewAsset(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;",
            "Landroid/view/LayoutInflater;",
            "Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;",
            "Z",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Object;",
            ">;>;",
            "Landroid/view/ViewGroup;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v7, p8

    const-string v1, ""

    move-object/from16 v15, p2

    move-object/from16 v14, p7

    .line 1449
    invoke-virtual {v15, v14, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const/4 v13, 0x0

    if-eqz p9, :cond_1

    if-eqz p3, :cond_0

    const v1, 0x7f0c0059

    goto :goto_0

    :cond_0
    const v1, 0x7f0c004d

    .line 1452
    :goto_0
    invoke-virtual {v0, v1, v13}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    goto :goto_2

    :cond_1
    if-eqz p3, :cond_2

    const v1, 0x7f0c0058

    goto :goto_1

    :cond_2
    const v1, 0x7f0c004c

    .line 1453
    :goto_1
    invoke-virtual {v0, v1, v13}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    :goto_2
    move-object v12, v1

    const v1, 0x7f090217

    .line 1455
    invoke-virtual {v12, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    move-object/from16 v2, p6

    .line 1456
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f0900d1

    .line 1458
    invoke-virtual {v12, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const v11, 0x7f09005c

    .line 1459
    invoke-virtual {v1, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/widget/ImageButton;

    const v2, 0x7f090223

    .line 1460
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Landroid/widget/TextView;

    const/4 v9, 0x0

    .line 1461
    invoke-virtual {v10, v9}, Landroid/widget/ImageButton;->setClickable(Z)V

    .line 1463
    new-instance v8, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$31;

    move-object v1, v8

    move-object/from16 v2, p2

    move-object/from16 v3, p7

    move-object/from16 v4, p8

    move-object/from16 v5, v17

    move-object v6, v10

    invoke-direct/range {v1 .. v6}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$31;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;[Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/ImageButton;)V

    move-object/from16 v1, p0

    move/from16 v3, p3

    move-object v4, v12

    move-object/from16 v5, p7

    move-object v6, v8

    invoke-static/range {v1 .. v6}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyCommon(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLandroid/view/View;Ljava/lang/String;Lcom/daaw/avee/Common/Action1;)Lcom/daaw/avee/Common/Action1;

    if-eqz p3, :cond_5

    const v1, 0x7f090126

    .line 1498
    invoke-virtual {v12, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    const v2, 0x7f09008c

    .line 1499
    invoke-virtual {v12, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    const v4, 0x7f090087

    .line 1500
    invoke-virtual {v12, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Landroid/widget/Button;

    const/16 v4, 0x8

    .line 1504
    invoke-virtual {v2, v4}, Landroid/widget/Button;->setVisibility(I)V

    const/4 v2, 0x0

    .line 1506
    :goto_3
    array-length v4, v7

    if-ge v2, v4, :cond_4

    .line 1508
    aget-object v4, v7, v2

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/String;

    const/16 v8, 0x3a

    .line 1511
    invoke-static {v4, v8, v5}, Lcom/daaw/avee/Common/Utils;->stringSplitInTwo(Ljava/lang/String;I[Ljava/lang/String;)V

    const/4 v4, 0x1

    .line 1513
    aget-object v4, v5, v4

    invoke-static {v4, v9}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;I)I

    move-result v4

    if-eqz p9, :cond_3

    const v8, 0x7f0c0046

    .line 1517
    invoke-virtual {v0, v8, v13}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    goto :goto_4

    :cond_3
    const v8, 0x7f0c0045

    .line 1519
    invoke-virtual {v0, v8, v13}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    .line 1521
    :goto_4
    invoke-virtual {v8, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v16

    move-object/from16 v3, v16

    check-cast v3, Landroid/widget/ImageButton;

    .line 1523
    invoke-virtual {v3, v4}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 1524
    new-instance v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;

    move-object/from16 p6, v6

    move-object v6, v8

    move-object v8, v0

    const/16 v18, 0x0

    move-object/from16 v9, p2

    move-object/from16 v19, v10

    move-object/from16 v10, p7

    const v20, 0x7f09005c

    move-object v11, v5

    move-object v5, v12

    move-object/from16 v12, p0

    move-object/from16 v21, v13

    move-object/from16 v13, v19

    move v14, v4

    move-object/from16 v15, v17

    move-object/from16 v16, p4

    invoke-direct/range {v8 .. v16}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;[Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/widget/ImageButton;ILandroid/widget/TextView;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v3, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1542
    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v0, p1

    move-object/from16 v15, p2

    move-object/from16 v6, p6

    move-object/from16 v14, p7

    move-object v12, v5

    move-object/from16 v10, v19

    move-object/from16 v13, v21

    const/4 v9, 0x0

    const v11, 0x7f09005c

    goto :goto_3

    :cond_4
    move-object/from16 p6, v6

    move-object/from16 v19, v10

    move-object v5, v12

    .line 1545
    new-instance v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$33;

    move-object v2, v0

    const/4 v1, 0x0

    move-object v3, v1

    move-object/from16 v4, p2

    move-object v1, v5

    move-object/from16 v5, p7

    move-object/from16 v10, p6

    move-object/from16 v6, p0

    move-object/from16 v7, v19

    move-object/from16 v8, v17

    move-object/from16 v9, p4

    invoke-direct/range {v2 .. v9}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$33;-><init>(Landroid/widget/TextView;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/widget/ImageButton;Landroid/widget/TextView;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v10, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_5

    :cond_5
    move-object v1, v12

    :goto_5
    move-object/from16 v0, p5

    .line 1565
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private static createPropertyViewBool(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;",
            "Landroid/view/LayoutInflater;",
            "Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;",
            "Z",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Object;",
            ">;>;",
            "Landroid/view/ViewGroup;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p8, :cond_1

    if-eqz p3, :cond_0

    const p8, 0x7f0c005b

    goto :goto_0

    :cond_0
    const p8, 0x7f0c0050

    .line 601
    :goto_0
    invoke-virtual {p1, p8, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    goto :goto_2

    :cond_1
    if-eqz p3, :cond_2

    const p8, 0x7f0c005a

    goto :goto_1

    :cond_2
    const p8, 0x7f0c004f

    .line 602
    :goto_1
    invoke-virtual {p1, p8, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    :goto_2
    const p8, 0x7f090217

    .line 604
    invoke-virtual {p1, p8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p8

    check-cast p8, Landroid/widget/TextView;

    .line 605
    invoke-virtual {p8, p6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p6, 0x7f09009a

    .line 607
    invoke-virtual {p1, p6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p6

    check-cast p6, Landroid/widget/CheckBox;

    .line 608
    invoke-virtual {p6, v0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 610
    new-instance v6, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$10;

    invoke-direct {v6, p2, p7, p6}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$10;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Landroid/widget/CheckBox;)V

    move-object v1, p0

    move-object v2, p2

    move v3, p3

    move-object v4, p1

    move-object v5, p7

    invoke-static/range {v1 .. v6}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyCommon(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLandroid/view/View;Ljava/lang/String;Lcom/daaw/avee/Common/Action1;)Lcom/daaw/avee/Common/Action1;

    .line 618
    new-instance p3, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$11;

    invoke-direct {p3, p2, p7, p0, p4}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$11;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {p6, p3}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 629
    invoke-virtual {p5, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private static createPropertyViewFloat(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;FFF)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;",
            "Landroid/view/LayoutInflater;",
            "Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;",
            "Z",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Object;",
            ">;>;",
            "Landroid/view/ViewGroup;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "FFF)V"
        }
    .end annotation

    if-eqz p3, :cond_0

    const v0, 0x7f0c0055

    goto :goto_0

    :cond_0
    const v0, 0x7f0c0047

    :goto_0
    const/4 v1, 0x0

    move-object/from16 v2, p1

    .line 861
    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v12

    const v0, 0x7f090217

    .line 864
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v2, p6

    .line 865
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f09025a

    .line 867
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    const v0, 0x7f090135

    .line 868
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const v0, 0x7f090138

    .line 869
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    const/4 v0, 0x1

    new-array v15, v0, [Landroid/widget/SeekBar;

    const/16 v22, 0x0

    aput-object v1, v15, v22

    new-array v14, v0, [Landroid/widget/EditText;

    aput-object v1, v14, v22

    if-eqz p3, :cond_1

    const v0, 0x7f0901c1

    .line 876
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    aput-object v0, v15, v22

    const v0, 0x7f0900c5

    .line 877
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    aput-object v0, v14, v22

    .line 879
    aget-object v0, v15, v22

    sub-float v1, p9, p8

    div-float v1, v1, p10

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 883
    :cond_1
    new-instance v13, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;

    move-object v0, v13

    move-object/from16 v1, p2

    move-object/from16 v2, p7

    move/from16 v3, p8

    move/from16 v7, p9

    move/from16 v8, p10

    move/from16 v9, p3

    move-object v10, v15

    move-object v11, v14

    invoke-direct/range {v0 .. v11}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;FLandroid/widget/TextView;Landroid/view/View;Landroid/view/View;FFZ[Landroid/widget/SeekBar;[Landroid/widget/EditText;)V

    move-object/from16 v0, p0

    move/from16 v2, p3

    move-object v3, v12

    move-object/from16 v4, p7

    move-object v5, v13

    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyCommon(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLandroid/view/View;Ljava/lang/String;Lcom/daaw/avee/Common/Action1;)Lcom/daaw/avee/Common/Action1;

    move-result-object v29

    if-eqz p3, :cond_2

    .line 909
    aget-object v0, v15, v22

    new-instance v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;

    move-object v13, v1

    move-object v2, v14

    move/from16 v14, p10

    move-object v3, v15

    move/from16 v15, p8

    move-object/from16 v16, p2

    move-object/from16 v17, p7

    move-object/from16 v18, p0

    move-object/from16 v19, v29

    move-object/from16 v20, v3

    move-object/from16 v21, p4

    invoke-direct/range {v13 .. v21}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;-><init>(FFLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/SeekBar;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 938
    aget-object v0, v2, v22

    new-instance v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$17;

    move-object/from16 v23, v1

    move/from16 v24, p8

    move/from16 v25, p9

    move-object/from16 v26, p2

    move-object/from16 v27, p7

    move-object/from16 v28, p0

    move-object/from16 v30, v2

    move-object/from16 v31, p4

    invoke-direct/range {v23 .. v31}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$17;-><init>(FFLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/EditText;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_2
    move-object/from16 v0, p5

    .line 977
    invoke-virtual {v0, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private static createPropertyViewImage(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;",
            "Landroid/view/LayoutInflater;",
            "Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;",
            "Z",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Object;",
            ">;>;",
            "Landroid/view/ViewGroup;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move-object/from16 v10, p8

    .line 1236
    iget-object v0, v8, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->customizationScene:Lcom/daaw/avee/comp/Visualizer/CustomScene;

    const/4 v11, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v8, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->customizationScene:Lcom/daaw/avee/comp/Visualizer/CustomScene;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->getEntryCount()I

    move-result v0

    move v12, v0

    goto :goto_0

    :cond_0
    const/4 v12, 0x0

    :goto_0
    const-string v13, ""

    move-object/from16 v14, p2

    move-object/from16 v15, p7

    .line 1238
    invoke-virtual {v14, v15, v13}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const/4 v7, 0x0

    if-eqz p9, :cond_2

    if-eqz p3, :cond_1

    const v0, 0x7f0c0059

    goto :goto_1

    :cond_1
    const v0, 0x7f0c004d

    .line 1241
    :goto_1
    invoke-virtual {v9, v0, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_3

    :cond_2
    if-eqz p3, :cond_3

    const v0, 0x7f0c0058

    goto :goto_2

    :cond_3
    const v0, 0x7f0c004c

    .line 1242
    :goto_2
    invoke-virtual {v9, v0, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    :goto_3
    move-object v6, v0

    const v0, 0x7f090217

    .line 1244
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p6

    .line 1245
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0900d1

    .line 1247
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v5, 0x7f09005c

    .line 1248
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/ImageButton;

    const v3, 0x7f090223

    .line 1249
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Landroid/widget/TextView;

    .line 1250
    invoke-virtual {v4, v11}, Landroid/widget/ImageButton;->setClickable(Z)V

    const/4 v2, 0x1

    new-array v1, v2, [Landroid/widget/EditText;

    aput-object v7, v1, v11

    if-eqz p3, :cond_4

    const v0, 0x7f0900c5

    .line 1255
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    aput-object v0, v1, v11

    .line 1258
    :cond_4
    new-instance v18, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$25;

    move-object/from16 v0, v18

    move-object/from16 v19, v1

    move-object/from16 v1, p2

    const/16 v20, 0x1

    move-object/from16 v2, p7

    const v11, 0x7f090223

    move-object/from16 v3, v17

    const v11, 0x7f09005c

    move/from16 v5, p3

    move-object/from16 p6, v6

    move-object/from16 v6, v19

    invoke-direct/range {v0 .. v6}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$25;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/ImageButton;Z[Landroid/widget/EditText;)V

    move-object/from16 v0, p0

    move/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    move-object/from16 v5, v18

    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyCommon(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLandroid/view/View;Ljava/lang/String;Lcom/daaw/avee/Common/Action1;)Lcom/daaw/avee/Common/Action1;

    move-result-object v18

    if-eqz p3, :cond_9

    const/16 v21, 0x0

    const v0, 0x7f090126

    move-object/from16 v6, p6

    .line 1296
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout;

    const v0, 0x7f09008c

    .line 1297
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/Button;

    const v0, 0x7f090087

    .line 1298
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/Button;

    const/4 v2, 0x0

    const/16 v22, 0x0

    .line 1304
    :goto_4
    array-length v0, v10

    const v1, 0x7f0c0045

    if-ge v2, v0, :cond_7

    .line 1306
    aget-object v23, v10, v2

    .line 1307
    invoke-static/range {v23 .. v23}, Lcom/daaw/avee/comp/AlbumArt/InternalBitmapLoader;->getResIdFromPath(Ljava/lang/String;)I

    move-result v0

    if-gtz v0, :cond_5

    .line 1310
    invoke-static/range {v23 .. v23}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->getIndexFromStringPath(Ljava/lang/String;)I

    move-result v0

    move/from16 v24, v2

    move-object/from16 p9, v3

    move-object v10, v4

    move-object v14, v5

    move-object/from16 v23, v6

    move-object v15, v7

    if-ltz v0, :cond_6

    const/16 v22, 0x1

    goto :goto_5

    .line 1314
    :cond_5
    invoke-virtual {v9, v1, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 1315
    invoke-virtual {v1, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v24

    move-object/from16 v11, v24

    check-cast v11, Landroid/widget/ImageButton;

    .line 1317
    invoke-virtual {v11, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 1318
    new-instance v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$26;

    move-object/from16 p3, v0

    move-object v8, v1

    move-object/from16 v1, p2

    move/from16 v24, v2

    move-object/from16 v2, p7

    move-object/from16 p9, v3

    move-object/from16 v3, v23

    move-object v10, v4

    move-object/from16 v4, p0

    move-object v14, v5

    move-object/from16 v5, v18

    move-object v15, v6

    move-object v6, v11

    move-object/from16 v23, v15

    move-object v15, v7

    move-object/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$26;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;Landroid/widget/ImageButton;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v11, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1337
    invoke-virtual {v14, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    :cond_6
    :goto_5
    add-int/lit8 v2, v24, 0x1

    move-object/from16 v8, p0

    move-object/from16 v3, p9

    move-object v4, v10

    move-object v5, v14

    move-object v7, v15

    move-object/from16 v6, v23

    const v11, 0x7f09005c

    move-object/from16 v14, p2

    move-object/from16 v15, p7

    move-object/from16 v10, p8

    goto :goto_4

    :cond_7
    move-object/from16 p9, v3

    move-object v10, v4

    move-object v14, v5

    move-object/from16 v23, v6

    move-object v15, v7

    if-eqz v22, :cond_8

    const/4 v8, 0x1

    :goto_6
    if-ge v8, v12, :cond_8

    .line 1345
    invoke-static {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->makeIndexStringPath(I)Ljava/lang/String;

    move-result-object v3

    .line 1347
    invoke-virtual {v9, v1, v15}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v11

    const v7, 0x7f090223

    .line 1348
    invoke-virtual {v11, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v2, 0x0

    .line 1349
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1350
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v6, 0x7f09005c

    .line 1352
    invoke-virtual {v11, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageButton;

    const v0, 0x7f080116

    .line 1354
    invoke-virtual {v5, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 1355
    new-instance v4, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$27;

    move-object v0, v4

    const v17, 0x7f0c0045

    move-object/from16 v1, p2

    move-object/from16 v2, p7

    move-object v15, v4

    move-object/from16 v4, p0

    move-object/from16 p3, v5

    move-object/from16 v5, v18

    const v22, 0x7f09005c

    move-object/from16 v6, p3

    const v24, 0x7f090223

    move-object/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$27;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;Landroid/widget/ImageButton;Lcom/daaw/avee/Common/Func/Func;)V

    move-object/from16 v0, p3

    invoke-virtual {v0, v15}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1375
    invoke-virtual {v14, v11}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    add-int/lit8 v8, v8, 0x1

    const v1, 0x7f0c0045

    const/4 v15, 0x0

    goto :goto_6

    .line 1379
    :cond_8
    new-instance v6, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$28;

    const/4 v2, 0x0

    move-object v0, v6

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p7

    move-object/from16 v5, v16

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$28;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/widget/TextView;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v10, v6}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1390
    new-instance v8, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$29;

    move-object v0, v8

    move-object/from16 v1, v21

    move-object/from16 v2, p2

    move-object/from16 v3, p7

    move-object/from16 v4, p0

    move-object/from16 v5, v18

    move-object/from16 v6, p9

    move-object/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$29;-><init>(Landroid/widget/TextView;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;Landroid/widget/Button;Lcom/daaw/avee/Common/Func/Func;)V

    move-object/from16 v0, p9

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v0, 0x0

    .line 1408
    aget-object v7, v19, v0

    new-instance v8, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$30;

    move-object v0, v8

    move-object/from16 v1, p2

    move-object/from16 v2, p7

    move-object/from16 v3, p0

    move-object/from16 v4, v18

    move-object/from16 v5, v19

    move-object/from16 v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$30;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/EditText;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v7, v8}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    move-object/from16 v0, p5

    move-object/from16 v1, v23

    goto :goto_7

    :cond_9
    move-object/from16 v0, p5

    move-object/from16 v1, p6

    .line 1444
    :goto_7
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private static createPropertyViewInt(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;",
            "Landroid/view/LayoutInflater;",
            "Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;",
            "Z",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Object;",
            ">;>;",
            "Landroid/view/ViewGroup;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II)V"
        }
    .end annotation

    move/from16 v11, p8

    move-object/from16 v12, p2

    move-object/from16 v13, p7

    .line 634
    invoke-virtual {v12, v13, v11}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    if-eqz p3, :cond_0

    const v0, 0x7f0c0055

    goto :goto_0

    :cond_0
    const v0, 0x7f0c0047

    :goto_0
    const/4 v1, 0x0

    move-object/from16 v2, p1

    .line 636
    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v14

    const v0, 0x7f090217

    .line 638
    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v2, p6

    .line 639
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f09025a

    .line 641
    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    const v0, 0x7f090135

    .line 642
    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const v0, 0x7f090138

    .line 643
    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    const/4 v0, 0x1

    new-array v15, v0, [Landroid/widget/SeekBar;

    const/16 v16, 0x0

    aput-object v1, v15, v16

    new-array v10, v0, [Landroid/widget/EditText;

    aput-object v1, v10, v16

    if-eqz p3, :cond_1

    const v0, 0x7f0901c1

    .line 650
    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    aput-object v0, v15, v16

    const v0, 0x7f0900c5

    .line 651
    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    aput-object v0, v10, v16

    .line 654
    aget-object v0, v15, v16

    sub-int v1, p9, v11

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 657
    :cond_1
    new-instance v17, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;

    move-object/from16 v0, v17

    move-object/from16 v1, p2

    move-object/from16 v2, p7

    move/from16 v3, p8

    move/from16 v7, p9

    move/from16 v8, p3

    move-object v9, v15

    move-object/from16 v18, v10

    invoke-direct/range {v0 .. v10}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;ILandroid/widget/TextView;Landroid/view/View;Landroid/view/View;IZ[Landroid/widget/SeekBar;[Landroid/widget/EditText;)V

    move-object/from16 v0, p0

    move/from16 v2, p3

    move-object v3, v14

    move-object/from16 v4, p7

    move-object/from16 v5, v17

    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyCommon(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLandroid/view/View;Ljava/lang/String;Lcom/daaw/avee/Common/Action1;)Lcom/daaw/avee/Common/Action1;

    move-result-object v8

    if-eqz p3, :cond_2

    .line 682
    aget-object v9, v15, v16

    new-instance v10, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$13;

    move-object v0, v10

    move-object/from16 v1, p2

    move-object/from16 v2, p7

    move/from16 v3, p8

    move-object/from16 v4, p0

    move-object v5, v8

    move-object v6, v15

    move-object/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$13;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;ILcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/SeekBar;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v9, v10}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 711
    aget-object v9, v18, v16

    new-instance v10, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$14;

    move-object v0, v10

    move/from16 v1, p8

    move/from16 v2, p9

    move-object/from16 v3, p2

    move-object/from16 v4, p7

    move-object/from16 v5, p0

    move-object v6, v8

    move-object/from16 v7, v18

    move-object/from16 v8, p4

    invoke-direct/range {v0 .. v8}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$14;-><init>(IILcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/EditText;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v9, v10}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_2
    move-object/from16 v0, p5

    .line 749
    invoke-virtual {v0, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private static createPropertyViewRGBA(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;ZZLjava/lang/String;Ljava/lang/String;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;",
            "Landroid/view/LayoutInflater;",
            "Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;",
            "Z",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Object;",
            ">;>;",
            "Landroid/view/ViewGroup;",
            "ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    if-eqz p3, :cond_0

    const v0, 0x7f0c0057

    goto :goto_0

    :cond_0
    const v0, 0x7f0c004a

    :goto_0
    const/4 v1, 0x0

    move-object/from16 v2, p1

    .line 755
    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v9

    const v0, 0x7f090217

    .line 757
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v2, p8

    .line 758
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f09025a

    .line 760
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    const v0, 0x7f0901d8

    .line 761
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    const/4 v0, 0x1

    new-array v15, v0, [Lcom/flask/colorpicker/ColorPickerView;

    const/16 v18, 0x0

    aput-object v1, v15, v18

    new-array v2, v0, [Lcom/flask/colorpicker/slider/LightnessSlider;

    aput-object v1, v2, v18

    new-array v5, v0, [Lcom/flask/colorpicker/slider/AlphaSlider;

    aput-object v1, v5, v18

    if-eqz p3, :cond_1

    const v0, 0x7f0900aa

    .line 768
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/flask/colorpicker/ColorPickerView;

    aput-object v0, v15, v18

    const v0, 0x7f090132

    .line 769
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/flask/colorpicker/slider/LightnessSlider;

    aput-object v0, v2, v18

    const v0, 0x7f09004b

    .line 770
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/flask/colorpicker/slider/AlphaSlider;

    aput-object v0, v5, v18

    .line 772
    aget-object v0, v15, v18

    aget-object v1, v2, v18

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/ColorPickerView;->setLightnessSlider(Lcom/flask/colorpicker/slider/LightnessSlider;)V

    .line 773
    aget-object v0, v15, v18

    aget-object v1, v5, v18

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/ColorPickerView;->setAlphaSlider(Lcom/flask/colorpicker/slider/AlphaSlider;)V

    :cond_1
    if-eqz p7, :cond_2

    .line 779
    new-instance v10, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;

    move-object v0, v10

    move-object/from16 v1, p2

    move-object/from16 v2, p9

    move/from16 v3, p3

    move/from16 v4, p6

    move-object v6, v15

    invoke-direct/range {v0 .. v8}, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;ZZ[Lcom/flask/colorpicker/slider/AlphaSlider;[Lcom/flask/colorpicker/ColorPickerView;Landroid/widget/TextView;Landroid/view/View;)V

    move-object/from16 v0, p0

    move/from16 v2, p3

    move-object v3, v9

    move-object/from16 v4, p9

    move-object v5, v10

    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyCommon(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLandroid/view/View;Ljava/lang/String;Lcom/daaw/avee/Common/Action1;)Lcom/daaw/avee/Common/Action1;

    move-result-object v0

    goto :goto_1

    .line 795
    :cond_2
    new-instance v10, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$G4GpdLU9_FNgghx5rUnQgJzFpis;

    move-object v0, v10

    move-object/from16 v1, p2

    move-object/from16 v2, p9

    move/from16 v3, p3

    move/from16 v4, p6

    move-object v6, v15

    invoke-direct/range {v0 .. v8}, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$G4GpdLU9_FNgghx5rUnQgJzFpis;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;ZZ[Lcom/flask/colorpicker/slider/AlphaSlider;[Lcom/flask/colorpicker/ColorPickerView;Landroid/widget/TextView;Landroid/view/View;)V

    move-object/from16 v0, p0

    move/from16 v2, p3

    move-object v3, v9

    move-object/from16 v4, p9

    move-object v5, v10

    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyCommon(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLandroid/view/View;Ljava/lang/String;Lcom/daaw/avee/Common/Action1;)Lcom/daaw/avee/Common/Action1;

    move-result-object v0

    :goto_1
    if-eqz p3, :cond_3

    .line 815
    aget-object v1, v15, v18

    new-instance v2, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I;

    move-object v10, v2

    move/from16 v11, p7

    move-object/from16 v12, p2

    move-object/from16 v13, p9

    move-object/from16 v14, p0

    move-object v3, v15

    move-object v15, v0

    move-object/from16 v16, v3

    move-object/from16 v17, p4

    invoke-direct/range {v10 .. v17}, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I;-><init>(ZLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Lcom/flask/colorpicker/ColorPickerView;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v1, v2}, Lcom/flask/colorpicker/ColorPickerView;->addOnColorChangedListener(Lcom/flask/colorpicker/OnColorChangedListener;)V

    .line 834
    aget-object v1, v3, v18

    new-instance v2, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$Hogu75pJii5wXCOYYyLdh3Xdhdg;

    move-object v10, v2

    invoke-direct/range {v10 .. v17}, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$Hogu75pJii5wXCOYYyLdh3Xdhdg;-><init>(ZLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Lcom/flask/colorpicker/ColorPickerView;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v1, v2}, Lcom/flask/colorpicker/ColorPickerView;->addOnColorSelectedListener(Lcom/flask/colorpicker/OnColorSelectedListener;)V

    :cond_3
    move-object/from16 v0, p5

    .line 855
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private static createPropertyViewText(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;",
            "Landroid/view/LayoutInflater;",
            "Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;",
            "Z",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Object;",
            ">;>;",
            "Landroid/view/ViewGroup;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    const-string v0, ""

    .line 1174
    invoke-virtual {p2, p7, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p8, :cond_1

    if-eqz p3, :cond_0

    const p8, 0x7f0c005d

    goto :goto_0

    :cond_0
    const p8, 0x7f0c0052

    .line 1176
    :goto_0
    invoke-virtual {p1, p8, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    goto :goto_2

    :cond_1
    if-eqz p3, :cond_2

    const p8, 0x7f0c005c

    goto :goto_1

    :cond_2
    const p8, 0x7f0c0051

    .line 1177
    :goto_1
    invoke-virtual {p1, p8, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    :goto_2
    const p8, 0x7f090217

    .line 1179
    invoke-virtual {p1, p8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p8

    check-cast p8, Landroid/widget/TextView;

    .line 1180
    invoke-virtual {p8, p6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p6, 0x7f09025a

    .line 1182
    invoke-virtual {p1, p6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p6

    check-cast p6, Landroid/widget/TextView;

    .line 1184
    new-instance v6, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$23;

    invoke-direct {v6, p2, p7, p6}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$23;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Landroid/widget/TextView;)V

    move-object v1, p0

    move-object v2, p2

    move v3, p3

    move-object v4, p1

    move-object v5, p7

    invoke-static/range {v1 .. v6}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyCommon(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLandroid/view/View;Ljava/lang/String;Lcom/daaw/avee/Common/Action1;)Lcom/daaw/avee/Common/Action1;

    if-eqz p3, :cond_3

    const p3, 0x7f0900c5

    .line 1193
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/EditText;

    .line 1194
    invoke-virtual {p3, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1195
    new-instance p8, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$24;

    move-object v1, p8

    move-object v2, p6

    move-object v3, p2

    move-object v4, p7

    move-object v5, p0

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$24;-><init>(Landroid/widget/TextView;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {p3, p8}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1229
    :cond_3
    invoke-virtual {p5, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private static createPropertyViewVec2f(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;FFF)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;",
            "Landroid/view/LayoutInflater;",
            "Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;",
            "Z",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Object;",
            ">;>;",
            "Landroid/view/ViewGroup;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "FFF)V"
        }
    .end annotation

    move/from16 v15, p8

    .line 981
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v15, v15}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    move-object/from16 v14, p2

    move-object/from16 v13, p7

    invoke-virtual {v14, v13, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    if-eqz p3, :cond_0

    const v0, 0x7f0c0056

    goto :goto_0

    :cond_0
    const v0, 0x7f0c0048

    :goto_0
    const/4 v1, 0x0

    move-object/from16 v2, p1

    .line 983
    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v12

    const v0, 0x7f090217

    .line 985
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v2, p6

    .line 986
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f09025a

    .line 988
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    const v0, 0x7f090136

    .line 989
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const v0, 0x7f090139

    .line 990
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    const v0, 0x7f090137

    .line 991
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    const v0, 0x7f09013a

    .line 992
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    const/4 v0, 0x1

    new-array v11, v0, [Landroid/widget/SeekBar;

    const/16 v16, 0x0

    aput-object v1, v11, v16

    new-array v8, v0, [Landroid/widget/SeekBar;

    aput-object v1, v8, v16

    new-array v7, v0, [Landroid/widget/EditText;

    aput-object v1, v7, v16

    new-array v3, v0, [Landroid/widget/EditText;

    aput-object v1, v3, v16

    if-eqz p3, :cond_1

    const v0, 0x7f0901c9

    .line 1000
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    aput-object v0, v11, v16

    const v0, 0x7f0901ca

    .line 1001
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    aput-object v0, v8, v16

    const v0, 0x7f0900ce

    .line 1002
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    aput-object v0, v7, v16

    const v0, 0x7f0900cf

    .line 1003
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    aput-object v0, v3, v16

    .line 1005
    aget-object v0, v11, v16

    sub-float v1, p9, v15

    div-float v1, v1, p10

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 1006
    aget-object v0, v8, v16

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 1009
    :cond_1
    new-instance v17, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;

    move-object/from16 v0, v17

    move-object/from16 v1, p2

    move-object/from16 v2, p7

    move-object/from16 v18, v3

    move/from16 v3, p8

    move-object/from16 v19, v7

    move/from16 v7, p9

    move-object/from16 v20, v8

    move/from16 v8, p10

    move-object/from16 v21, v11

    move/from16 v11, p3

    move-object/from16 p1, v12

    move-object/from16 v12, v21

    move-object/from16 v13, v20

    move-object/from16 v14, v19

    move-object/from16 v15, v18

    invoke-direct/range {v0 .. v15}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;FLandroid/widget/TextView;Landroid/view/View;Landroid/view/View;FFLandroid/view/View;Landroid/view/View;Z[Landroid/widget/SeekBar;[Landroid/widget/SeekBar;[Landroid/widget/EditText;[Landroid/widget/EditText;)V

    move-object/from16 v0, p0

    move/from16 v2, p3

    move-object/from16 v3, p1

    move-object/from16 v4, p7

    move-object/from16 v5, v17

    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyCommon(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLandroid/view/View;Ljava/lang/String;Lcom/daaw/avee/Common/Action1;)Lcom/daaw/avee/Common/Action1;

    move-result-object v9

    if-eqz p3, :cond_2

    .line 1037
    aget-object v10, v21, v16

    new-instance v11, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$19;

    move-object v0, v11

    move-object/from16 v1, p2

    move-object/from16 v2, p7

    move/from16 v3, p8

    move/from16 v4, p10

    move-object/from16 v5, p0

    move-object v6, v9

    move-object/from16 v7, v21

    move-object/from16 v8, p4

    invoke-direct/range {v0 .. v8}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$19;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;FFLcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/SeekBar;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v10, v11}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 1069
    aget-object v10, v20, v16

    new-instance v11, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;

    move-object v0, v11

    move-object/from16 v7, v20

    invoke-direct/range {v0 .. v8}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;FFLcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/SeekBar;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v10, v11}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 1099
    aget-object v10, v19, v16

    new-instance v11, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;

    move-object v0, v11

    move/from16 v1, p8

    move/from16 v2, p9

    move-object/from16 v3, p2

    move-object/from16 v4, p7

    move-object/from16 v7, v19

    invoke-direct/range {v0 .. v8}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;-><init>(FFLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/EditText;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v10, v11}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1134
    aget-object v10, v18, v16

    new-instance v11, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$22;

    move-object v0, v11

    move-object/from16 v7, v18

    invoke-direct/range {v0 .. v8}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$22;-><init>(FFLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/EditText;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v10, v11}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_2
    move-object/from16 v1, p1

    move-object/from16 v0, p5

    .line 1169
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private static formatPropertyDisplayName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 77
    invoke-static {p0, v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static formatPropertyDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    .line 89
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v1

    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 91
    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v3, 0x1

    const/4 v4, 0x1

    .line 94
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_4

    .line 95
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 96
    invoke-static {v5}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-static {v5}, Ljava/lang/Character;->isDigit(C)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_2

    :cond_1
    const/4 v6, 0x0

    goto :goto_3

    :cond_2
    :goto_2
    const/4 v6, 0x1

    :goto_3
    if-eqz v1, :cond_3

    if-eqz v6, :cond_3

    const/16 v1, 0x20

    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 101
    :cond_3
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    xor-int/lit8 v1, v6, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    if-eqz p1, :cond_5

    .line 105
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    if-lez p0, :cond_5

    const-string p0, " ("

    .line 106
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    .line 108
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 111
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static formatPropertyDisplayNameWoPrefix(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    const/16 p1, 0x5f

    .line 81
    invoke-static {p0, p1, p0}, Lcom/daaw/avee/Common/Utils;->stringSplitInTwoGetSecond(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$createPropertyViewRGBA$0(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;ZZ[Lcom/flask/colorpicker/slider/AlphaSlider;[Lcom/flask/colorpicker/ColorPickerView;Landroid/widget/TextView;Landroid/view/View;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [F

    .line 780
    fill-array-data v0, :array_0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyArray4f(Ljava/lang/String;[F)[F

    move-result-object p0

    .line 781
    invoke-static {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->hlsa1ColorToInt([F)I

    move-result p0

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    if-eqz p3, :cond_0

    .line 784
    aget-object p2, p4, p1

    invoke-virtual {p2, p1}, Lcom/flask/colorpicker/slider/AlphaSlider;->setVisibility(I)V

    goto :goto_0

    .line 786
    :cond_0
    aget-object p2, p4, p1

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Lcom/flask/colorpicker/slider/AlphaSlider;->setVisibility(I)V

    .line 788
    :goto_0
    aget-object p2, p5, p1

    invoke-virtual {p2, p8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    aget-object p1, p5, p1

    const/4 p2, 0x1

    invoke-virtual {p1, p0, p2}, Lcom/flask/colorpicker/ColorPickerView;->setColor(IZ)V

    .line 791
    :cond_1
    invoke-static {p0}, Lcom/daaw/avee/Common/Utils;->intToHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p6, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 792
    invoke-virtual {p7, p0}, Landroid/view/View;->setBackgroundColor(I)V

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method static synthetic lambda$createPropertyViewRGBA$1(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;ZZ[Lcom/flask/colorpicker/slider/AlphaSlider;[Lcom/flask/colorpicker/ColorPickerView;Landroid/widget/TextView;Landroid/view/View;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, -0x1

    .line 796
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result p0

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    if-eqz p3, :cond_0

    .line 799
    aget-object p2, p4, p1

    invoke-virtual {p2, p1}, Lcom/flask/colorpicker/slider/AlphaSlider;->setVisibility(I)V

    goto :goto_0

    .line 801
    :cond_0
    aget-object p2, p4, p1

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Lcom/flask/colorpicker/slider/AlphaSlider;->setVisibility(I)V

    .line 804
    :goto_0
    aget-object p2, p5, p1

    invoke-virtual {p2, p8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    aget-object p1, p5, p1

    const/4 p2, 0x1

    invoke-virtual {p1, p0, p2}, Lcom/flask/colorpicker/ColorPickerView;->setColor(IZ)V

    .line 807
    :cond_1
    invoke-static {p0}, Lcom/daaw/avee/Common/Utils;->intToHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p6, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 808
    invoke-virtual {p7, p0}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method static synthetic lambda$createPropertyViewRGBA$2(ZLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Lcom/flask/colorpicker/ColorPickerView;Lcom/daaw/avee/Common/Func/Func;I)V
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x4

    new-array p0, p0, [F

    .line 818
    invoke-static {p0, p7}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToHlsa1([FI)V

    .line 820
    invoke-virtual {p1, p2, p0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyArray4fValue(Ljava/lang/String;[F)V

    goto :goto_0

    .line 823
    :cond_0
    invoke-virtual {p1, p2, p7}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntValue(Ljava/lang/String;I)V

    .line 826
    :goto_0
    invoke-virtual {p3}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onPropertyChanged()V

    const/4 p0, 0x0

    .line 828
    aget-object p0, p5, p0

    invoke-interface {p4, p0}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    .line 830
    invoke-interface {p6}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/avee/Common/Action1;

    if-eqz p0, :cond_1

    const/4 p1, 0x0

    .line 831
    invoke-interface {p0, p1}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method static synthetic lambda$createPropertyViewRGBA$3(ZLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Lcom/flask/colorpicker/ColorPickerView;Lcom/daaw/avee/Common/Func/Func;I)V
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x4

    new-array p0, p0, [F

    .line 837
    invoke-static {p0, p7}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToHlsa1([FI)V

    .line 839
    invoke-virtual {p1, p2, p0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyArray4fValue(Ljava/lang/String;[F)V

    goto :goto_0

    .line 842
    :cond_0
    invoke-virtual {p1, p2, p7}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntValue(Ljava/lang/String;I)V

    .line 845
    :goto_0
    invoke-virtual {p3}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onPropertyChanged()V

    const/4 p0, 0x0

    .line 847
    aget-object p0, p5, p0

    invoke-interface {p4, p0}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    .line 849
    invoke-interface {p6}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/avee/Common/Action1;

    if-eqz p0, :cond_1

    const/4 p1, 0x0

    .line 850
    invoke-interface {p0, p1}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private static parseDataRecursive(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Landroid/view/ViewGroup;Ljava/util/Iterator;)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;",
            "Landroid/view/LayoutInflater;",
            "Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;",
            "Landroid/view/ViewGroup;",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .line 442
    new-instance v7, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$7;

    invoke-direct {v7}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$7;-><init>()V

    const/4 v0, 0x0

    .line 449
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    add-int/lit8 v8, v0, 0x1

    .line 453
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, v7

    .line 455
    invoke-static/range {v0 .. v6}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyView(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Landroid/view/ViewGroup;Ljava/lang/String;ZLcom/daaw/avee/Common/Func/Func;)Z

    move-result v0

    if-nez v0, :cond_0

    add-int/lit8 v8, v8, -0x1

    :cond_0
    move v0, v8

    goto :goto_0

    :cond_1
    return v0
.end method


# virtual methods
.method public AddPropertyUpdateValueCb(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/Common/Action1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1594
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getHierarchyPath()Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->MakeHierarchyPathKeyString(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1595
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->propertiesUpdateValueCb:Ljava/util/Map;

    invoke-interface {p2, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public GetPropertyUpdateValueCb(Ljava/util/List;Ljava/lang/String;)Lcom/daaw/avee/Common/Action1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 1602
    :cond_0
    invoke-static {p1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->MakeHierarchyPathKeyString(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1604
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->propertiesUpdateValueCb:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Common/Action1;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method getActivity()Landroid/app/Activity;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method isViewCreated()Z
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->txtElementTitle:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onCreatedView1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 0

    const p1, 0x7f09026a

    .line 129
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->view1RootView:Landroid/view/View;

    const p1, 0x7f09013c

    .line 130
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->linearLayoutRootContent:Landroid/view/ViewGroup;

    const p1, 0x7f09023a

    .line 131
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->txtElementTitle:Landroid/widget/TextView;

    const p1, 0x7f090065

    .line 133
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    .line 134
    new-instance p3, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$1;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$1;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)V

    invoke-virtual {p1, p3}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f090073

    .line 141
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    .line 142
    new-instance p3, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$2;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$2;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)V

    invoke-virtual {p1, p3}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f090086

    .line 153
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    .line 154
    new-instance p3, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$3;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$3;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)V

    invoke-virtual {p1, p3}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 163
    new-instance p3, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$4;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$4;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)V

    invoke-virtual {p1, p3}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const p1, 0x7f0901de

    .line 175
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Spinner;

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->spinnerVersion:Landroid/widget/Spinner;

    .line 179
    new-instance p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$5;

    invoke-direct {p1, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$5;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)V

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->spinnerVersionOnItemClickListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 223
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->propertiesUpdateValueCb:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public onImagePropertyValuePicked(Landroid/widget/TextView;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/TextView;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1571
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "hierarchyPath"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " propertyName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 1573
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->linearLayoutRootContent:Landroid/view/ViewGroup;

    const-string v1, ""

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    if-eqz p4, :cond_0

    move-object v0, p4

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 1574
    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    if-eqz p2, :cond_5

    if-eqz p3, :cond_5

    .line 1578
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget-object p1, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->customizationScene:Lcom/daaw/avee/comp/Visualizer/CustomScene;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->getData(Ljava/util/List;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p1

    if-eqz p1, :cond_3

    if-eqz p4, :cond_2

    goto :goto_1

    :cond_2
    move-object p4, v1

    .line 1581
    :goto_1
    invoke-virtual {p1, p3, p4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 1582
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onFinishedChangingProperties()V

    goto :goto_3

    .line 1586
    :cond_3
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    .line 1587
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "invalid hierarchyPath: ["

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "]"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_5
    :goto_3
    return-void
.end method

.method parsePropertyData(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 13

    .line 230
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->isView1Created()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 232
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 234
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->currentElementCustom:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    if-nez p1, :cond_1

    .line 237
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->txtElementTitle:Landroid/widget/TextView;

    const v0, 0x7f100102

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 238
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->linearLayoutRootContent:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 239
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->propertiesUpdateValueCb:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    return-void

    .line 243
    :cond_1
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->txtElementTitle:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getCustomizationName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, -0x2

    .line 247
    iput v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->spinnerVersionInitalSelectedPosition:I

    .line 250
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->spinnerVersion:Landroid/widget/Spinner;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 254
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->currentElementCustom:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    const-string v3, ""

    if-eqz v1, :cond_2

    .line 255
    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getCustomizationName()Ljava/lang/String;

    move-result-object v3

    .line 256
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->currentElementCustom:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getVersionId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    move-object v1, v3

    .line 259
    :goto_0
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {v4, v3, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->InvokeOnRequestElementAvailableVersions(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/Common/Tuple2;

    move-result-object v3

    .line 262
    iget-object v4, v3, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v4, [Ljava/lang/String;

    array-length v4, v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-le v4, v5, :cond_5

    .line 263
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->spinnerVersion:Landroid/widget/Spinner;

    invoke-virtual {v4, v6}, Landroid/widget/Spinner;->setVisibility(I)V

    .line 265
    iget-object v4, v3, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v4, [Ljava/lang/String;

    invoke-static {v4, v1}, Lcom/daaw/avee/Common/Utils;->StringToIndex([Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 267
    iget-object v4, v3, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v4, [Ljava/lang/String;

    array-length v4, v4

    new-array v7, v4, [Ljava/lang/String;

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v4, :cond_3

    .line 269
    iget-object v9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {v9}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f1001a8

    new-array v11, v5, [Ljava/lang/Object;

    iget-object v12, v3, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v12, [Ljava/lang/String;

    aget-object v12, v12, v8

    aput-object v12, v11, v6

    invoke-virtual {v9, v10, v11}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 272
    :cond_3
    new-instance v3, Landroid/widget/ArrayAdapter;

    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {v4}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getActivity()Landroid/app/Activity;

    move-result-object v4

    const v5, 0x1090008

    invoke-direct {v3, v4, v5, v7}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 274
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->spinnerVersion:Landroid/widget/Spinner;

    invoke-virtual {v4, v3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 276
    iput v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->spinnerVersionInitalSelectedPosition:I

    if-ltz v1, :cond_4

    .line 277
    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->spinnerVersion:Landroid/widget/Spinner;

    invoke-virtual {v3, v1, v6}, Landroid/widget/Spinner;->setSelection(IZ)V

    .line 279
    :cond_4
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->spinnerVersion:Landroid/widget/Spinner;

    invoke-virtual {v1, v3}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->ApplySpinnerTheme(Landroid/widget/Spinner;)V

    .line 281
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->spinnerVersion:Landroid/widget/Spinner;

    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->spinnerVersionOnItemClickListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {v1, v3}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    goto :goto_2

    .line 284
    :cond_5
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->spinnerVersion:Landroid/widget/Spinner;

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, Landroid/widget/Spinner;->setVisibility(I)V

    .line 289
    :goto_2
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->linearLayoutRootContent:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 290
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->propertiesUpdateValueCb:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 291
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->GetAllPropertiesGroupedSortedByOrder()Ljava/util/Map;

    move-result-object v1

    .line 295
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 297
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/avee/Common/MultiList;

    const v7, 0x7f0c004b

    .line 301
    invoke-virtual {v0, v7, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    const v8, 0x7f09013c

    .line 302
    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/view/ViewGroup;

    const v9, 0x7f090110

    .line 303
    invoke-virtual {v7, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    const v10, 0x7f09006e

    .line 304
    invoke-virtual {v7, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    const v11, 0x7f090109

    .line 305
    invoke-virtual {v7, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/view/ViewGroup;

    .line 307
    iget-object v12, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {v5}, Lcom/daaw/avee/Common/MultiList;->iterator1()Ljava/util/Iterator;

    move-result-object v5

    invoke-static {v12, v0, p1, v8, v5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->parseDataRecursive(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Landroid/view/ViewGroup;Ljava/util/Iterator;)I

    move-result v5

    if-lez v5, :cond_6

    .line 310
    invoke-static {v4, v2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->formatPropertyDisplayNameWoPrefix(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 311
    iget-object v5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->linearLayoutRootContent:Landroid/view/ViewGroup;

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 313
    new-instance v5, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$6;

    invoke-direct {v5, p0, v8, v10, v4}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$6;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;Landroid/view/ViewGroup;Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {v11, v5}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 330
    iget-object v5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->propertiesExpandViews:Ljava/util/Map;

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    if-eqz v4, :cond_7

    .line 342
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_7

    const/4 v4, 0x0

    .line 345
    invoke-virtual {v10, v4}, Landroid/view/View;->setRotation(F)V

    const/16 v4, 0x8

    .line 346
    invoke-virtual {v8, v4}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_3

    :cond_7
    if-eqz v4, :cond_6

    .line 347
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_6

    const/high16 v4, -0x3d4c0000    # -90.0f

    .line 348
    invoke-virtual {v10, v4}, Landroid/view/View;->setRotation(F)V

    .line 349
    invoke-virtual {v8, v6}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto/16 :goto_3

    :cond_8
    :goto_4
    return-void
.end method

.method public setCollapsed(Z)V
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->view1RootView:Landroid/view/View;

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
