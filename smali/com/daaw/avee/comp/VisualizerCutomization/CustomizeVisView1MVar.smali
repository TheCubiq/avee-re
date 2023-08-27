.class public Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar;
.super Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;
.source "CustomizeVisView1MVar.java"


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;)V

    return-void
.end method

.method public static createPropertyViewMVarFloat(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;ZLjava/lang/String;Ljava/lang/String;FFF)V
    .locals 41
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
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "FFF)V"
        }
    .end annotation

    move-object/from16 v12, p0

    move-object/from16 v11, p2

    move-object/from16 v10, p8

    move/from16 v9, p9

    .line 42
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const-string v1, "Constant"

    invoke-direct {v0, v1, v9, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-direct {v8, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    if-eqz p6, :cond_0

    .line 44
    sget-object v0, Lcom/daaw/avee/comp/Common/MeasureDefs;->measures2dMVar:[Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/Common/MeasureDefs;->measures1dMVar:[Ljava/lang/String;

    :goto_0
    move-object v7, v0

    .line 47
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    invoke-direct {v0, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    invoke-virtual {v11, v10, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getMeasuredVarCount()I

    move-result v1

    if-nez v1, :cond_1

    .line 52
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    invoke-direct {v0, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    .line 53
    invoke-virtual {v11, v10, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloatValue(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    :cond_1
    move-object v6, v0

    .line 58
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz p3, :cond_2

    const v1, 0x7f0c005e

    goto :goto_1

    :cond_2
    const v1, 0x7f0c0053

    :goto_1
    const/4 v13, 0x0

    invoke-static {v0, v1, v13}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v15

    const v0, 0x7f090217

    .line 60
    invoke-virtual {v15, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p7

    .line 61
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f09025a

    .line 63
    invoke-virtual {v15, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Landroid/widget/TextView;

    const v0, 0x7f090135

    .line 64
    invoke-virtual {v15, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v20

    const v0, 0x7f090138

    .line 65
    invoke-virtual {v15, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v21

    .line 69
    invoke-virtual {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getMeasuredVarCount()I

    move-result v14

    .line 71
    new-array v5, v14, [Landroid/widget/SeekBar;

    .line 72
    new-array v4, v14, [Landroid/widget/SeekBar;

    .line 73
    new-array v3, v14, [Landroid/widget/EditText;

    .line 74
    new-array v2, v14, [Landroid/widget/EditText;

    .line 75
    new-array v1, v14, [Landroid/widget/TextView;

    .line 76
    new-array v0, v14, [Landroid/widget/TextView;

    .line 77
    new-array v13, v14, [Landroid/widget/Spinner;

    move-object/from16 v35, v7

    if-eqz p3, :cond_4

    const v7, 0x7f090064

    .line 81
    invoke-virtual {v15, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/Button;

    move-object/from16 v16, v0

    const v0, 0x7f090080

    .line 82
    invoke-virtual {v15, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    move-object/from16 v17, v0

    const v0, 0x7f090267

    .line 83
    invoke-virtual {v15, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    move-object/from16 v18, v15

    .line 86
    new-instance v15, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$1;

    move-object/from16 v36, v0

    move-object/from16 v34, v16

    move-object/from16 v9, v17

    move-object v0, v15

    move-object/from16 v33, v1

    move-object/from16 v1, p2

    move-object/from16 v37, v2

    move-object/from16 v2, p8

    move-object/from16 v38, v3

    move-object v3, v8

    move-object/from16 v39, v4

    move/from16 v4, p9

    move-object/from16 v40, v5

    move-object/from16 v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$1;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;FLcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;)V

    invoke-virtual {v7, v15}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    new-instance v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$2;

    invoke-direct {v0, v11, v10, v8, v12}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$2;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;)V

    invoke-virtual {v9, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v0, 0x0

    :goto_2
    if-ge v0, v14, :cond_5

    .line 117
    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getMeasuredVar(I)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    move-result-object v1

    .line 119
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0c0054

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0901c1

    .line 121
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/SeekBar;

    aput-object v3, v40, v0

    const v3, 0x7f0901c2

    .line 122
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/SeekBar;

    aput-object v3, v39, v0

    const v3, 0x7f0900c5

    .line 123
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    aput-object v3, v38, v0

    const v3, 0x7f0900c6

    .line 124
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    aput-object v3, v37, v0

    const v3, 0x7f090114

    .line 125
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    aput-object v3, v33, v0

    const v3, 0x7f090115

    .line 126
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    aput-object v3, v34, v0

    const v3, 0x7f0901dd

    .line 127
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Spinner;

    aput-object v3, v13, v0

    move-object/from16 v3, v36

    .line 129
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 131
    aget-object v2, v40, v0

    sub-float v5, p10, p9

    div-float v5, v5, p11

    float-to-int v5, v5

    invoke-virtual {v2, v5}, Landroid/widget/SeekBar;->setMax(I)V

    .line 132
    aget-object v2, v39, v0

    invoke-virtual {v2, v5}, Landroid/widget/SeekBar;->setMax(I)V

    .line 146
    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->getMeasure()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v7, v35

    invoke-static {v7, v1}, Lcom/daaw/avee/Common/Utils;->StringToIndex([Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 148
    new-instance v2, Landroid/widget/ArrayAdapter;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getActivity()Landroid/app/Activity;

    move-result-object v5

    const v9, 0x1090008

    invoke-direct {v2, v5, v9, v7}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 150
    aget-object v5, v13, v0

    invoke-virtual {v5, v2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    if-ltz v1, :cond_3

    .line 153
    aget-object v2, v13, v0

    const/4 v5, 0x0

    invoke-virtual {v2, v1, v5}, Landroid/widget/Spinner;->setSelection(IZ)V

    .line 155
    :cond_3
    aget-object v1, v13, v0

    invoke-virtual {v12, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->ApplySpinnerTheme(Landroid/widget/Spinner;)V

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v36, v3

    move-object/from16 v35, v7

    goto/16 :goto_2

    :cond_4
    move-object/from16 v34, v0

    move-object/from16 v33, v1

    move-object/from16 v37, v2

    move-object/from16 v38, v3

    move-object/from16 v39, v4

    move-object/from16 v40, v5

    move-object/from16 v18, v15

    :cond_5
    move-object/from16 v7, v35

    const/4 v0, 0x1

    new-array v9, v0, [Z

    move v6, v14

    move-object v14, v9

    const/16 v35, 0x0

    aput-boolean v35, v9, v35

    .line 166
    new-instance v5, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;

    move-object/from16 v36, v13

    move-object v13, v5

    move-object/from16 v4, v18

    move-object/from16 v15, p2

    move-object/from16 v16, p8

    move-object/from16 v17, v8

    move/from16 v18, p6

    move/from16 v22, p10

    move/from16 v23, p9

    move/from16 v24, p11

    move/from16 v25, p3

    move/from16 v26, v6

    move-object/from16 v27, v40

    move-object/from16 v28, v39

    move-object/from16 v29, v38

    move-object/from16 v30, v37

    move-object/from16 v31, v36

    move-object/from16 v32, v7

    invoke-direct/range {v13 .. v34}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;-><init>([ZLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;ZLandroid/widget/TextView;Landroid/view/View;Landroid/view/View;FFFZI[Landroid/widget/SeekBar;[Landroid/widget/SeekBar;[Landroid/widget/EditText;[Landroid/widget/EditText;[Landroid/widget/Spinner;[Ljava/lang/String;[Landroid/widget/TextView;[Landroid/widget/TextView;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    move-object v3, v4

    move-object v13, v4

    move-object/from16 v4, p8

    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar;->createPropertyCommon(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLandroid/view/View;Ljava/lang/String;Lcom/daaw/avee/Common/Action1;)Lcom/daaw/avee/Common/Action1;

    move-result-object v14

    if-eqz p3, :cond_6

    const/4 v15, 0x0

    :goto_3
    if-ge v15, v6, :cond_6

    .line 234
    aget-object v5, v40, v15

    new-instance v4, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$4;

    move-object v0, v4

    move-object v1, v9

    move/from16 v2, p11

    move/from16 v3, p9

    move-object v12, v4

    move-object/from16 v4, p2

    move-object/from16 v18, v13

    move-object v13, v5

    move-object/from16 v5, p8

    move/from16 v16, v6

    move-object v6, v8

    move-object/from16 v17, v7

    move v7, v15

    move-object/from16 v19, v8

    move-object/from16 v8, p0

    move-object/from16 v20, v9

    move-object v9, v14

    move-object/from16 v10, v40

    move-object/from16 v11, p4

    invoke-direct/range {v0 .. v11}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$4;-><init>([ZFFLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;ILcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/SeekBar;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v13, v12}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 271
    aget-object v12, v39, v15

    new-instance v13, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;

    move-object v0, v13

    move-object/from16 v1, v20

    move-object/from16 v6, v19

    move-object/from16 v10, v39

    invoke-direct/range {v0 .. v11}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;-><init>([ZFFLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;ILcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/SeekBar;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v12, v13}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 305
    aget-object v12, v38, v15

    new-instance v13, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$6;

    move-object v0, v13

    move/from16 v2, p9

    move/from16 v3, p10

    move-object/from16 v10, v38

    invoke-direct/range {v0 .. v11}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$6;-><init>([ZFFLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;ILcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/EditText;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v12, v13}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 346
    aget-object v12, v37, v15

    new-instance v13, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;

    move-object v0, v13

    move-object/from16 v10, v37

    invoke-direct/range {v0 .. v11}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;-><init>([ZFFLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;ILcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/EditText;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v12, v13}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 388
    aget-object v10, v36, v15

    new-instance v11, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, v17

    move-object/from16 v3, p2

    move-object/from16 v4, p8

    move-object/from16 v5, v19

    move v6, v15

    move-object v7, v14

    move-object/from16 v8, v36

    move-object/from16 v9, p4

    invoke-direct/range {v0 .. v9}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;[Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;ILcom/daaw/avee/Common/Action1;[Landroid/widget/Spinner;Lcom/daaw/avee/Common/Func/Func;)V

    invoke-virtual {v10, v11}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v12, p0

    move-object/from16 v11, p2

    move-object/from16 v10, p8

    move/from16 v6, v16

    move-object/from16 v7, v17

    move-object/from16 v13, v18

    move-object/from16 v8, v19

    move-object/from16 v9, v20

    goto/16 :goto_3

    :cond_6
    move-object/from16 v0, p5

    move-object v1, v13

    .line 435
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method
