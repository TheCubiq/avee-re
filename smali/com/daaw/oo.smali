.class public Lcom/daaw/oo;
.super Lcom/daaw/no;
.source ""


# direct methods
.method public static synthetic J(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/oo;->L(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static K(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;ZLjava/lang/String;Ljava/lang/String;FFF)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ho;",
            "Landroid/view/LayoutInflater;",
            "Lcom/daaw/un;",
            "Z",
            "Lcom/daaw/w40<",
            "Lcom/daaw/e0<",
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

    new-instance v8, Lcom/daaw/dm0;

    new-instance v0, Lcom/daaw/xn0;

    const-string v1, "Constant"

    invoke-direct {v0, v1, v9, v9}, Lcom/daaw/xn0;-><init>(Ljava/lang/String;FF)V

    invoke-direct {v8, v0}, Lcom/daaw/dm0;-><init>(Lcom/daaw/xn0;)V

    if-eqz p6, :cond_0

    sget-object v0, Lcom/daaw/wn0;->b:[Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/wn0;->a:[Ljava/lang/String;

    :goto_0
    move-object v7, v0

    new-instance v0, Lcom/daaw/dm0;

    invoke-direct {v0, v8}, Lcom/daaw/dm0;-><init>(Lcom/daaw/dm0;)V

    invoke-virtual {v11, v10, v0}, Lcom/daaw/un;->s(Ljava/lang/String;Lcom/daaw/dm0;)Lcom/daaw/dm0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/dm0;->h()I

    move-result v1

    if-nez v1, :cond_1

    new-instance v0, Lcom/daaw/dm0;

    invoke-direct {v0, v8}, Lcom/daaw/dm0;-><init>(Lcom/daaw/dm0;)V

    invoke-virtual {v11, v10, v0}, Lcom/daaw/un;->a0(Ljava/lang/String;Lcom/daaw/dm0;)V

    :cond_1
    move-object v6, v0

    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz p3, :cond_2

    const v1, 0x7f0c005f

    goto :goto_1

    :cond_2
    const v1, 0x7f0c0054

    :goto_1
    const/4 v13, 0x0

    invoke-static {v0, v1, v13}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v15

    const v0, 0x7f0902b2

    invoke-virtual {v15, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p7

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0902fb

    invoke-virtual {v15, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Landroid/widget/TextView;

    const v0, 0x7f09018c

    invoke-virtual {v15, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v21

    const v0, 0x7f09018f

    invoke-virtual {v15, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v22

    invoke-virtual {v6}, Lcom/daaw/dm0;->h()I

    move-result v14

    new-array v5, v14, [Landroid/widget/SeekBar;

    new-array v4, v14, [Landroid/widget/SeekBar;

    new-array v3, v14, [Landroid/widget/EditText;

    new-array v2, v14, [Landroid/widget/EditText;

    new-array v1, v14, [Landroid/widget/TextView;

    new-array v0, v14, [Landroid/widget/TextView;

    new-array v13, v14, [Landroid/widget/Spinner;

    move-object/from16 v36, v7

    if-eqz p3, :cond_6

    const v7, 0x7f09007e

    invoke-virtual {v15, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/Button;

    move-object/from16 v16, v0

    const v0, 0x7f09009a

    invoke-virtual {v15, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    move-object/from16 v17, v0

    const v0, 0x7f090308

    invoke-virtual {v15, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    move-object/from16 v18, v15

    new-instance v15, Lcom/daaw/oo$a;

    move-object/from16 v37, v0

    move-object/from16 v35, v16

    move-object/from16 v9, v17

    move-object v0, v15

    move-object/from16 v34, v1

    move-object/from16 v1, p2

    move-object/from16 v38, v2

    move-object/from16 v2, p8

    move-object/from16 v39, v3

    move-object v3, v8

    move-object/from16 v40, v4

    move/from16 v4, p9

    move-object/from16 v41, v5

    move-object/from16 v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/oo$a;-><init>(Lcom/daaw/un;Ljava/lang/String;Lcom/daaw/dm0;FLcom/daaw/ho;)V

    invoke-virtual {v7, v15}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v0, Lcom/daaw/oo$b;

    invoke-direct {v0, v11, v10, v8, v12}, Lcom/daaw/oo$b;-><init>(Lcom/daaw/un;Ljava/lang/String;Lcom/daaw/dm0;Lcom/daaw/ho;)V

    invoke-virtual {v9, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v0, 0x0

    :goto_2
    if-ge v0, v14, :cond_7

    invoke-virtual {v6, v0}, Lcom/daaw/dm0;->g(I)Lcom/daaw/xn0;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0c0055

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f090244

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/SeekBar;

    aput-object v3, v41, v0

    const v3, 0x7f090245

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/SeekBar;

    aput-object v3, v40, v0

    const v3, 0x7f0900fe

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    aput-object v3, v39, v0

    const v3, 0x7f0900ff

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    aput-object v3, v38, v0

    const v3, 0x7f090159

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    aput-object v3, v34, v0

    const v3, 0x7f09015a

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    aput-object v3, v35, v0

    const v3, 0x7f090265

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Spinner;

    aput-object v3, v13, v0

    move-object/from16 v3, v37

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    aget-object v5, v41, v0

    sub-float v7, p10, p9

    div-float v7, v7, p11

    float-to-int v7, v7

    invoke-virtual {v5, v7}, Landroid/widget/SeekBar;->setMax(I)V

    aget-object v5, v40, v0

    invoke-virtual {v5, v7}, Landroid/widget/SeekBar;->setMax(I)V

    invoke-virtual {v1}, Lcom/daaw/xn0;->e()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v7, v36

    invoke-static {v7, v1}, Lcom/daaw/br1;->e([Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    array-length v5, v7

    new-array v5, v5, [Ljava/lang/String;

    const/4 v9, 0x0

    :goto_3
    array-length v15, v7

    if-ge v9, v15, :cond_4

    aget-object v15, v7, v9

    invoke-static {v15}, Lcom/daaw/wn0;->a(Ljava/lang/String;)I

    move-result v15

    if-lez v15, :cond_3

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4, v15}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v5, v9

    goto :goto_4

    :cond_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "missing t "

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v15, v7, v9

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v4, v7, v9

    aput-object v4, v5, v9

    :goto_4
    add-int/lit8 v9, v9, 0x1

    const/4 v4, 0x0

    goto :goto_3

    :cond_4
    new-instance v2, Landroid/widget/ArrayAdapter;

    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v4

    const v9, 0x1090008

    invoke-direct {v2, v4, v9, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    aget-object v4, v13, v0

    invoke-virtual {v4, v2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    if-ltz v1, :cond_5

    aget-object v2, v13, v0

    const/4 v4, 0x0

    invoke-virtual {v2, v1, v4}, Landroid/widget/Spinner;->setSelection(IZ)V

    :cond_5
    aget-object v1, v13, v0

    invoke-virtual {v12, v1}, Lcom/daaw/ho;->b(Landroid/widget/Spinner;)V

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v37, v3

    move-object/from16 v36, v7

    goto/16 :goto_2

    :cond_6
    move-object/from16 v35, v0

    move-object/from16 v34, v1

    move-object/from16 v38, v2

    move-object/from16 v39, v3

    move-object/from16 v40, v4

    move-object/from16 v41, v5

    move-object/from16 v18, v15

    :cond_7
    move-object/from16 v7, v36

    const/4 v0, 0x1

    new-array v9, v0, [Z

    move v6, v14

    move-object v14, v9

    const/16 v36, 0x0

    aput-boolean v36, v9, v36

    new-instance v5, Lcom/daaw/oo$c;

    move-object/from16 v37, v13

    move-object v13, v5

    move-object/from16 v4, v18

    move-object/from16 v15, p2

    move-object/from16 v16, p8

    move-object/from16 v17, v8

    move/from16 v18, p6

    move-object/from16 v20, p5

    move/from16 v23, p10

    move/from16 v24, p9

    move/from16 v25, p11

    move/from16 v26, p3

    move/from16 v27, v6

    move-object/from16 v28, v41

    move-object/from16 v29, v40

    move-object/from16 v30, v39

    move-object/from16 v31, v38

    move-object/from16 v32, v37

    move-object/from16 v33, v7

    invoke-direct/range {v13 .. v35}, Lcom/daaw/oo$c;-><init>([ZLcom/daaw/un;Ljava/lang/String;Lcom/daaw/dm0;ZLandroid/widget/TextView;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;FFFZI[Landroid/widget/SeekBar;[Landroid/widget/SeekBar;[Landroid/widget/EditText;[Landroid/widget/EditText;[Landroid/widget/Spinner;[Ljava/lang/String;[Landroid/widget/TextView;[Landroid/widget/TextView;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    move-object v3, v4

    move-object v13, v4

    move-object/from16 v4, p8

    invoke-static/range {v0 .. v5}, Lcom/daaw/no;->k(Lcom/daaw/ho;Lcom/daaw/un;ZLandroid/view/View;Ljava/lang/String;Lcom/daaw/e0;)Lcom/daaw/e0;

    move-result-object v14

    if-eqz p3, :cond_8

    const/4 v15, 0x0

    :goto_5
    if-ge v15, v6, :cond_8

    aget-object v5, v41, v15

    new-instance v4, Lcom/daaw/oo$d;

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

    move-object/from16 v10, v41

    move-object/from16 v11, p4

    invoke-direct/range {v0 .. v11}, Lcom/daaw/oo$d;-><init>([ZFFLcom/daaw/un;Ljava/lang/String;Lcom/daaw/dm0;ILcom/daaw/ho;Lcom/daaw/e0;[Landroid/widget/SeekBar;Lcom/daaw/w40;)V

    invoke-virtual {v13, v12}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    aget-object v12, v40, v15

    new-instance v13, Lcom/daaw/oo$e;

    move-object v0, v13

    move-object/from16 v1, v20

    move-object/from16 v6, v19

    move-object/from16 v10, v40

    invoke-direct/range {v0 .. v11}, Lcom/daaw/oo$e;-><init>([ZFFLcom/daaw/un;Ljava/lang/String;Lcom/daaw/dm0;ILcom/daaw/ho;Lcom/daaw/e0;[Landroid/widget/SeekBar;Lcom/daaw/w40;)V

    invoke-virtual {v12, v13}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    aget-object v12, v39, v15

    new-instance v13, Lcom/daaw/oo$f;

    move-object v0, v13

    move/from16 v2, p9

    move/from16 v3, p10

    move-object/from16 v10, v39

    invoke-direct/range {v0 .. v11}, Lcom/daaw/oo$f;-><init>([ZFFLcom/daaw/un;Ljava/lang/String;Lcom/daaw/dm0;ILcom/daaw/ho;Lcom/daaw/e0;[Landroid/widget/EditText;Lcom/daaw/w40;)V

    invoke-virtual {v12, v13}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    aget-object v12, v38, v15

    new-instance v13, Lcom/daaw/oo$g;

    move-object v0, v13

    move-object/from16 v10, v38

    invoke-direct/range {v0 .. v11}, Lcom/daaw/oo$g;-><init>([ZFFLcom/daaw/un;Ljava/lang/String;Lcom/daaw/dm0;ILcom/daaw/ho;Lcom/daaw/e0;[Landroid/widget/EditText;Lcom/daaw/w40;)V

    invoke-virtual {v12, v13}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    aget-object v10, v37, v15

    new-instance v11, Lcom/daaw/oo$h;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, v17

    move-object/from16 v3, p2

    move-object/from16 v4, p8

    move-object/from16 v5, v19

    move v6, v15

    move-object v7, v14

    move-object/from16 v8, v37

    move-object/from16 v9, p4

    invoke-direct/range {v0 .. v9}, Lcom/daaw/oo$h;-><init>(Lcom/daaw/ho;[Ljava/lang/String;Lcom/daaw/un;Ljava/lang/String;Lcom/daaw/dm0;ILcom/daaw/e0;[Landroid/widget/Spinner;Lcom/daaw/w40;)V

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

    goto/16 :goto_5

    :cond_8
    move-object/from16 v0, p5

    move-object v1, v13

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public static L(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/daaw/no;->v(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method
