.class public Landroidx/appcompat/widget/SearchView;
.super Landroidx/appcompat/widget/b;
.source ""

# interfaces
.implements Lcom/daaw/fg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/SearchView$k;,
        Landroidx/appcompat/widget/SearchView$o;,
        Landroidx/appcompat/widget/SearchView$SearchAutoComplete;,
        Landroidx/appcompat/widget/SearchView$p;,
        Landroidx/appcompat/widget/SearchView$SavedState;,
        Landroidx/appcompat/widget/SearchView$n;,
        Landroidx/appcompat/widget/SearchView$l;,
        Landroidx/appcompat/widget/SearchView$m;
    }
.end annotation


# static fields
.field public static final F0:Landroidx/appcompat/widget/SearchView$o;


# instance fields
.field public A0:Landroid/view/View$OnKeyListener;

.field public final B0:Landroid/widget/TextView$OnEditorActionListener;

.field public final C0:Landroid/widget/AdapterView$OnItemClickListener;

.field public final D0:Landroid/widget/AdapterView$OnItemSelectedListener;

.field public final E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

.field public E0:Landroid/text/TextWatcher;

.field public final F:Landroid/view/View;

.field public final G:Landroid/view/View;

.field public final H:Landroid/view/View;

.field public final I:Landroid/widget/ImageView;

.field public final J:Landroid/widget/ImageView;

.field public final K:Landroid/widget/ImageView;

.field public final L:Landroid/widget/ImageView;

.field public final M:Landroid/view/View;

.field public N:Landroidx/appcompat/widget/SearchView$p;

.field public O:Landroid/graphics/Rect;

.field public P:Landroid/graphics/Rect;

.field public Q:[I

.field public R:[I

.field public final S:Landroid/widget/ImageView;

.field public final T:Landroid/graphics/drawable/Drawable;

.field public final U:I

.field public final V:I

.field public final W:Landroid/content/Intent;

.field public final a0:Landroid/content/Intent;

.field public final b0:Ljava/lang/CharSequence;

.field public c0:Landroidx/appcompat/widget/SearchView$m;

.field public d0:Landroidx/appcompat/widget/SearchView$l;

.field public e0:Landroid/view/View$OnFocusChangeListener;

.field public f0:Landroidx/appcompat/widget/SearchView$n;

.field public g0:Landroid/view/View$OnClickListener;

.field public h0:Z

.field public i0:Z

.field public j0:Lcom/daaw/nn;

.field public k0:Z

.field public l0:Ljava/lang/CharSequence;

.field public m0:Z

.field public n0:Z

.field public o0:I

.field public p0:Z

.field public q0:Ljava/lang/CharSequence;

.field public r0:Ljava/lang/CharSequence;

.field public s0:Z

.field public t0:I

.field public u0:Landroid/app/SearchableInfo;

.field public v0:Landroid/os/Bundle;

.field public final w0:Ljava/lang/Runnable;

.field public x0:Ljava/lang/Runnable;

.field public final y0:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Ljava/lang/String;",
            "Landroid/graphics/drawable/Drawable$ConstantState;",
            ">;"
        }
    .end annotation
.end field

.field public final z0:Landroid/view/View$OnClickListener;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    new-instance v0, Landroidx/appcompat/widget/SearchView$o;

    invoke-direct {v0}, Landroidx/appcompat/widget/SearchView$o;-><init>()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-object v0, Landroidx/appcompat/widget/SearchView;->F0:Landroidx/appcompat/widget/SearchView$o;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget v0, Lcom/daaw/x01;->K:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 16

    move-object/from16 v7, p0

    invoke-direct/range {p0 .. p3}, Landroidx/appcompat/widget/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->O:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->P:Landroid/graphics/Rect;

    const/4 v0, 0x2

    new-array v1, v0, [I

    iput-object v1, v7, Landroidx/appcompat/widget/SearchView;->Q:[I

    new-array v0, v0, [I

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->R:[I

    new-instance v0, Landroidx/appcompat/widget/SearchView$b;

    invoke-direct {v0, v7}, Landroidx/appcompat/widget/SearchView$b;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->w0:Ljava/lang/Runnable;

    new-instance v0, Landroidx/appcompat/widget/SearchView$c;

    invoke-direct {v0, v7}, Landroidx/appcompat/widget/SearchView$c;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->x0:Ljava/lang/Runnable;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->y0:Ljava/util/WeakHashMap;

    new-instance v8, Landroidx/appcompat/widget/SearchView$f;

    invoke-direct {v8, v7}, Landroidx/appcompat/widget/SearchView$f;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v8, v7, Landroidx/appcompat/widget/SearchView;->z0:Landroid/view/View$OnClickListener;

    new-instance v0, Landroidx/appcompat/widget/SearchView$g;

    invoke-direct {v0, v7}, Landroidx/appcompat/widget/SearchView$g;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->A0:Landroid/view/View$OnKeyListener;

    new-instance v9, Landroidx/appcompat/widget/SearchView$h;

    invoke-direct {v9, v7}, Landroidx/appcompat/widget/SearchView$h;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v9, v7, Landroidx/appcompat/widget/SearchView;->B0:Landroid/widget/TextView$OnEditorActionListener;

    new-instance v10, Landroidx/appcompat/widget/SearchView$i;

    invoke-direct {v10, v7}, Landroidx/appcompat/widget/SearchView$i;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v10, v7, Landroidx/appcompat/widget/SearchView;->C0:Landroid/widget/AdapterView$OnItemClickListener;

    new-instance v11, Landroidx/appcompat/widget/SearchView$j;

    invoke-direct {v11, v7}, Landroidx/appcompat/widget/SearchView$j;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v11, v7, Landroidx/appcompat/widget/SearchView;->D0:Landroid/widget/AdapterView$OnItemSelectedListener;

    new-instance v0, Landroidx/appcompat/widget/SearchView$a;

    invoke-direct {v0, v7}, Landroidx/appcompat/widget/SearchView$a;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->E0:Landroid/text/TextWatcher;

    sget-object v2, Lcom/daaw/x21;->f2:[I

    const/4 v12, 0x0

    move-object/from16 v13, p1

    move-object/from16 v3, p2

    move/from16 v5, p3

    invoke-static {v13, v3, v2, v5, v12}, Lcom/daaw/ul1;->v(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lcom/daaw/ul1;

    move-result-object v14

    invoke-virtual {v14}, Lcom/daaw/ul1;->r()Landroid/content/res/TypedArray;

    move-result-object v4

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static/range {v0 .. v6}, Lcom/daaw/xs1;->p0(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/daaw/x21;->p2:I

    sget v2, Lcom/daaw/c21;->r:I

    invoke-virtual {v14, v1, v2}, Lcom/daaw/ul1;->n(II)I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v7, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    sget v0, Lcom/daaw/o11;->D:I

    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, v7}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setSearchView(Landroidx/appcompat/widget/SearchView;)V

    sget v1, Lcom/daaw/o11;->z:I

    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, v7, Landroidx/appcompat/widget/SearchView;->F:Landroid/view/View;

    sget v1, Lcom/daaw/o11;->C:I

    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, v7, Landroidx/appcompat/widget/SearchView;->G:Landroid/view/View;

    sget v3, Lcom/daaw/o11;->J:I

    invoke-virtual {v7, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, v7, Landroidx/appcompat/widget/SearchView;->H:Landroid/view/View;

    sget v4, Lcom/daaw/o11;->x:I

    invoke-virtual {v7, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, v7, Landroidx/appcompat/widget/SearchView;->I:Landroid/widget/ImageView;

    sget v5, Lcom/daaw/o11;->A:I

    invoke-virtual {v7, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    iput-object v5, v7, Landroidx/appcompat/widget/SearchView;->J:Landroid/widget/ImageView;

    sget v6, Lcom/daaw/o11;->y:I

    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, v7, Landroidx/appcompat/widget/SearchView;->K:Landroid/widget/ImageView;

    sget v13, Lcom/daaw/o11;->E:I

    invoke-virtual {v7, v13}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/ImageView;

    iput-object v13, v7, Landroidx/appcompat/widget/SearchView;->L:Landroid/widget/ImageView;

    sget v15, Lcom/daaw/o11;->B:I

    invoke-virtual {v7, v15}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Landroid/widget/ImageView;

    iput-object v15, v7, Landroidx/appcompat/widget/SearchView;->S:Landroid/widget/ImageView;

    sget v2, Lcom/daaw/x21;->q2:I

    invoke-virtual {v14, v2}, Lcom/daaw/ul1;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/daaw/xs1;->v0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    sget v1, Lcom/daaw/x21;->u2:I

    invoke-virtual {v14, v1}, Lcom/daaw/ul1;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/daaw/xs1;->v0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    sget v1, Lcom/daaw/x21;->t2:I

    invoke-virtual {v14, v1}, Lcom/daaw/ul1;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget v2, Lcom/daaw/x21;->n2:I

    invoke-virtual {v14, v2}, Lcom/daaw/ul1;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget v2, Lcom/daaw/x21;->k2:I

    invoke-virtual {v14, v2}, Lcom/daaw/ul1;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v6, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget v2, Lcom/daaw/x21;->w2:I

    invoke-virtual {v14, v2}, Lcom/daaw/ul1;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v13, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v14, v1}, Lcom/daaw/ul1;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v15, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget v1, Lcom/daaw/x21;->s2:I

    invoke-virtual {v14, v1}, Lcom/daaw/ul1;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v7, Landroidx/appcompat/widget/SearchView;->T:Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/daaw/i21;->n:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lcom/daaw/em1;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    sget v1, Lcom/daaw/x21;->v2:I

    sget v2, Lcom/daaw/c21;->q:I

    invoke-virtual {v14, v1, v2}, Lcom/daaw/ul1;->n(II)I

    move-result v1

    iput v1, v7, Landroidx/appcompat/widget/SearchView;->U:I

    sget v1, Lcom/daaw/x21;->l2:I

    invoke-virtual {v14, v1, v12}, Lcom/daaw/ul1;->n(II)I

    move-result v1

    iput v1, v7, Landroidx/appcompat/widget/SearchView;->V:I

    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v6, v8}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v5, v8}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v13, v8}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0, v8}, Landroid/widget/AutoCompleteTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, v7, Landroidx/appcompat/widget/SearchView;->E0:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-virtual {v0, v9}, Landroid/widget/AutoCompleteTextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    invoke-virtual {v0, v10}, Landroid/widget/AutoCompleteTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    invoke-virtual {v0, v11}, Landroid/widget/AutoCompleteTextView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    iget-object v1, v7, Landroidx/appcompat/widget/SearchView;->A0:Landroid/view/View$OnKeyListener;

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    new-instance v1, Landroidx/appcompat/widget/SearchView$d;

    invoke-direct {v1, v7}, Landroidx/appcompat/widget/SearchView$d;-><init>(Landroidx/appcompat/widget/SearchView;)V

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    sget v1, Lcom/daaw/x21;->o2:I

    const/4 v2, 0x1

    invoke-virtual {v14, v1, v2}, Lcom/daaw/ul1;->a(IZ)Z

    move-result v1

    invoke-virtual {v7, v1}, Landroidx/appcompat/widget/SearchView;->setIconifiedByDefault(Z)V

    sget v1, Lcom/daaw/x21;->h2:I

    const/4 v2, -0x1

    invoke-virtual {v14, v1, v2}, Lcom/daaw/ul1;->f(II)I

    move-result v1

    if-eq v1, v2, :cond_0

    invoke-virtual {v7, v1}, Landroidx/appcompat/widget/SearchView;->setMaxWidth(I)V

    :cond_0
    sget v1, Lcom/daaw/x21;->m2:I

    invoke-virtual {v14, v1}, Lcom/daaw/ul1;->p(I)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, v7, Landroidx/appcompat/widget/SearchView;->b0:Ljava/lang/CharSequence;

    sget v1, Lcom/daaw/x21;->r2:I

    invoke-virtual {v14, v1}, Lcom/daaw/ul1;->p(I)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, v7, Landroidx/appcompat/widget/SearchView;->l0:Ljava/lang/CharSequence;

    sget v1, Lcom/daaw/x21;->j2:I

    invoke-virtual {v14, v1, v2}, Lcom/daaw/ul1;->k(II)I

    move-result v1

    if-eq v1, v2, :cond_1

    invoke-virtual {v7, v1}, Landroidx/appcompat/widget/SearchView;->setImeOptions(I)V

    :cond_1
    sget v1, Lcom/daaw/x21;->i2:I

    invoke-virtual {v14, v1, v2}, Lcom/daaw/ul1;->k(II)I

    move-result v1

    if-eq v1, v2, :cond_2

    invoke-virtual {v7, v1}, Landroidx/appcompat/widget/SearchView;->setInputType(I)V

    :cond_2
    sget v1, Lcom/daaw/x21;->g2:I

    const/4 v2, 0x1

    invoke-virtual {v14, v1, v2}, Lcom/daaw/ul1;->a(IZ)Z

    move-result v1

    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->setFocusable(Z)V

    invoke-virtual {v14}, Lcom/daaw/ul1;->w()V

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.speech.action.WEB_SEARCH"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v1, v7, Landroidx/appcompat/widget/SearchView;->W:Landroid/content/Intent;

    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v3, "android.speech.extra.LANGUAGE_MODEL"

    const-string v4, "web_search"

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    new-instance v1, Landroid/content/Intent;

    const-string v3, "android.speech.action.RECOGNIZE_SPEECH"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v1, v7, Landroidx/appcompat/widget/SearchView;->a0:Landroid/content/Intent;

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getDropDownAnchor()I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->M:Landroid/view/View;

    if-eqz v0, :cond_3

    new-instance v1, Landroidx/appcompat/widget/SearchView$e;

    invoke-direct {v1, v7}, Landroidx/appcompat/widget/SearchView$e;-><init>(Landroidx/appcompat/widget/SearchView;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_3
    iget-boolean v0, v7, Landroidx/appcompat/widget/SearchView;->h0:Z

    invoke-virtual {v7, v0}, Landroidx/appcompat/widget/SearchView;->k0(Z)V

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/SearchView;->g0()V

    return-void
.end method

.method public static M(Landroid/content/Context;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->orientation:I

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private getPreferredHeight()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/daaw/g11;->g:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0
.end method

.method private getPreferredWidth()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/daaw/g11;->h:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0
.end method

.method private setQuery(Ljava/lang/CharSequence;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setSelection(I)V

    return-void
.end method


# virtual methods
.method public B()V
    .locals 6

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->M:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->G:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    invoke-static {p0}, Lcom/daaw/hu1;->b(Landroid/view/View;)Z

    move-result v3

    iget-boolean v4, p0, Landroidx/appcompat/widget/SearchView;->h0:Z

    if-eqz v4, :cond_0

    sget v4, Lcom/daaw/g11;->e:I

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    sget v5, Lcom/daaw/g11;->f:I

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    add-int/2addr v4, v0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget v0, v2, Landroid/graphics/Rect;->left:I

    if-eqz v3, :cond_1

    neg-int v0, v0

    goto :goto_1

    :cond_1
    add-int/2addr v0, v4

    sub-int v0, v1, v0

    :goto_1
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v3, v0}, Landroid/widget/AutoCompleteTextView;->setDropDownHorizontalOffset(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->M:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v3, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v0, v3

    iget v2, v2, Landroid/graphics/Rect;->right:I

    add-int/2addr v0, v2

    add-int/2addr v0, v4

    sub-int/2addr v0, v1

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v1, v0}, Landroid/widget/AutoCompleteTextView;->setDropDownWidth(I)V

    :cond_2
    return-void
.end method

.method public final C(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;
    .locals 1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 p1, 0x10000000

    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    if-eqz p2, :cond_0

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->r0:Ljava/lang/CharSequence;

    const-string p2, "user_query"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    if-eqz p4, :cond_1

    const-string p1, "query"

    invoke-virtual {v0, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_1
    if-eqz p3, :cond_2

    const-string p1, "intent_extra_data_key"

    invoke-virtual {v0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_2
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->v0:Landroid/os/Bundle;

    if-eqz p1, :cond_3

    const-string p2, "app_data"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_3
    if-eqz p5, :cond_4

    const-string p1, "action_key"

    invoke-virtual {v0, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "action_msg"

    invoke-virtual {v0, p1, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_4
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    return-object v0
.end method

.method public final D(Landroid/database/Cursor;ILjava/lang/String;)Landroid/content/Intent;
    .locals 9

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "suggest_intent_action"

    invoke-static {p1, v1}, Lcom/daaw/bi1;->o(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSuggestIntentAction()Ljava/lang/String;

    move-result-object v1

    :cond_0
    if-nez v1, :cond_1

    const-string v1, "android.intent.action.SEARCH"

    :cond_1
    move-object v3, v1

    const-string v1, "suggest_intent_data"

    invoke-static {p1, v1}, Lcom/daaw/bi1;->o(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSuggestIntentData()Ljava/lang/String;

    move-result-object v1

    :cond_2
    if-eqz v1, :cond_3

    const-string v2, "suggest_intent_data_id"

    invoke-static {p1, v2}, Lcom/daaw/bi1;->o(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_3
    if-nez v1, :cond_4

    move-object v4, v0

    goto :goto_0

    :cond_4
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    move-object v4, v1

    :goto_0
    const-string v1, "suggest_intent_query"

    invoke-static {p1, v1}, Lcom/daaw/bi1;->o(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "suggest_intent_extra_data"

    invoke-static {p1, v1}, Lcom/daaw/bi1;->o(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object v2, p0

    move v7, p2

    move-object v8, p3

    invoke-virtual/range {v2 .. v8}, Landroidx/appcompat/widget/SearchView;->C(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->getPosition()I

    move-result p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    const/4 p1, -0x1

    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Search suggestions cursor at row "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " returned exception."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public final E(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;
    .locals 9

    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.SEARCH"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    const/high16 v4, 0x42000000    # 32.0f

    invoke-static {v2, v3, v1, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->v0:Landroid/os/Bundle;

    if-eqz v3, :cond_0

    const-string v4, "app_data"

    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    const/4 p1, 0x1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageModeId()I

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageModeId()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_1
    const-string v5, "free_form"

    :goto_0
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoicePromptTextId()I

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoicePromptTextId()I

    move-result v6

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_2
    move-object v6, v7

    :goto_1
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageId()I

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageId()I

    move-result v8

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_3
    move-object v4, v7

    :goto_2
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceMaxResults()I

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceMaxResults()I

    move-result p1

    :cond_4
    const-string p2, "android.speech.extra.LANGUAGE_MODEL"

    invoke-virtual {v3, p2, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "android.speech.extra.PROMPT"

    invoke-virtual {v3, p2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "android.speech.extra.LANGUAGE"

    invoke-virtual {v3, p2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "android.speech.extra.MAX_RESULTS"

    invoke-virtual {v3, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v7

    :goto_3
    const-string p1, "calling_package"

    invoke-virtual {v3, p1, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "android.speech.extra.RESULTS_PENDINGINTENT"

    invoke-virtual {v3, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p1, "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"

    invoke-virtual {v3, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    return-object v3
.end method

.method public final F(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;
    .locals 1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-string p2, "calling_package"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method public final G()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    return-void
.end method

.method public H()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-static {v0}, Landroidx/appcompat/widget/SearchView$k;->a(Landroid/widget/AutoCompleteTextView;)V

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/appcompat/widget/SearchView;->F0:Landroidx/appcompat/widget/SearchView$o;

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$o;->b(Landroid/widget/AutoCompleteTextView;)V

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$o;->a(Landroid/widget/AutoCompleteTextView;)V

    :goto_0
    return-void
.end method

.method public final I(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->Q:[I

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->R:[I

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getLocationInWindow([I)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->Q:[I

    const/4 v1, 0x1

    aget v2, v0, v1

    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->R:[I

    aget v1, v3, v1

    sub-int/2addr v2, v1

    const/4 v1, 0x0

    aget v0, v0, v1

    aget v1, v3, v1

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    add-int/2addr p1, v2

    invoke-virtual {p2, v0, v2, v1, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public final J(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 5

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->h0:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->T:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getTextSize()F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3ff4000000000000L    # 1.25

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    double-to-int v0, v0

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->T:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2, v0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    new-instance v0, Landroid/text/SpannableStringBuilder;

    const-string v1, "   "

    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    new-instance v1, Landroid/text/style/ImageSpan;

    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->T:Landroid/graphics/drawable/Drawable;

    invoke-direct {v1, v2}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;)V

    const/4 v2, 0x1

    const/4 v3, 0x2

    const/16 v4, 0x21

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    return-object v0

    :cond_1
    :goto_0
    return-object p1
.end method

.method public final K()Z
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getVoiceSearchEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    invoke-virtual {v2}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->W:Landroid/content/Intent;

    goto :goto_0

    :cond_0
    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    invoke-virtual {v2}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a0:Landroid/content/Intent;

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/high16 v3, 0x10000

    invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public L()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->i0:Z

    return v0
.end method

.method public final N()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->k0:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->p0:Z

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->L()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final O(Landroid/content/Intent;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed launch activity: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_0
    return-void
.end method

.method public P(ILjava/lang/String;Ljava/lang/String;)V
    .locals 7

    const-string v1, "android.intent.action.SEARCH"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v4, p3

    move v5, p1

    move-object v6, p2

    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/SearchView;->C(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final Q(IILjava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->j0:Lcom/daaw/nn;

    invoke-virtual {v0}, Lcom/daaw/nn;->b()Landroid/database/Cursor;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0, p2, p3}, Landroidx/appcompat/widget/SearchView;->D(Landroid/database/Cursor;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->O(Landroid/content/Intent;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public R()V
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->h0:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->d0:Landroidx/appcompat/widget/SearchView$l;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/appcompat/widget/SearchView$l;->onClose()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->clearFocus()V

    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/SearchView;->k0(Z)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->requestFocus()Z

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method public S(IILjava/lang/String;)Z
    .locals 0

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->f0:Landroidx/appcompat/widget/SearchView$n;

    const/4 p3, 0x0

    if-eqz p2, :cond_1

    invoke-interface {p2, p1}, Landroidx/appcompat/widget/SearchView$n;->b(I)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    return p3

    :cond_1
    :goto_0
    const/4 p2, 0x0

    invoke-virtual {p0, p1, p3, p2}, Landroidx/appcompat/widget/SearchView;->Q(IILjava/lang/String;)Z

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->G()V

    const/4 p1, 0x1

    return p1
.end method

.method public T(I)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->f0:Landroidx/appcompat/widget/SearchView$n;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Landroidx/appcompat/widget/SearchView$n;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->c0(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public U(Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public V()V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->k0(Z)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->requestFocus()Z

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->g0:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public W()V
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v1

    if-lez v1, :cond_2

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->c0:Landroidx/appcompat/widget/SearchView$m;

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Landroidx/appcompat/widget/SearchView$m;->onQueryTextSubmit(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v2, v1, v0}, Landroidx/appcompat/widget/SearchView;->P(ILjava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->G()V

    :cond_2
    return-void
.end method

.method public X(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->j0:Lcom/daaw/nn;

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {p3}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    move-result p1

    if-eqz p1, :cond_7

    const/16 p1, 0x42

    if-eq p2, p1, :cond_6

    const/16 p1, 0x54

    if-eq p2, p1, :cond_6

    const/16 p1, 0x3d

    if-ne p2, p1, :cond_2

    goto :goto_2

    :cond_2
    const/16 p1, 0x15

    if-eq p2, p1, :cond_4

    const/16 p3, 0x16

    if-ne p2, p3, :cond_3

    goto :goto_0

    :cond_3
    const/16 p1, 0x13

    if-ne p2, p1, :cond_7

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getListSelection()I

    return v0

    :cond_4
    :goto_0
    if-ne p2, p1, :cond_5

    const/4 p1, 0x0

    goto :goto_1

    :cond_5
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->length()I

    move-result p1

    :goto_1
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p2, p1}, Landroid/widget/AutoCompleteTextView;->setSelection(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setListSelection(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->clearListSelection()V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->b()V

    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_2
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getListSelection()I

    move-result p1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, v0, p2}, Landroidx/appcompat/widget/SearchView;->S(IILjava/lang/String;)Z

    move-result p1

    return p1

    :cond_7
    return v0
.end method

.method public Y(Ljava/lang/CharSequence;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->r0:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->j0(Z)V

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->l0(Z)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->e0()V

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->i0()V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->c0:Landroidx/appcompat/widget/SearchView$m;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->q0:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->c0:Landroidx/appcompat/widget/SearchView$m;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/appcompat/widget/SearchView$m;->onQueryTextChange(Ljava/lang/String;)Z

    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->q0:Ljava/lang/CharSequence;

    return-void
.end method

.method public Z()V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->L()Z

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->k0(Z)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->b0()V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->H()V

    :cond_0
    return-void
.end method

.method public a0()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->W:Landroid/content/Intent;

    invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/SearchView;->F(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;

    move-result-object v0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->a0:Landroid/content/Intent;

    invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/SearchView;->E(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_2
    :goto_1
    return-void
.end method

.method public final b0()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->w0:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public c()V
    .locals 3

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->s0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->s0:Z

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getImeOptions()I

    move-result v0

    iput v0, p0, Landroidx/appcompat/widget/SearchView;->t0:I

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const/high16 v2, 0x2000000

    or-int/2addr v0, v2

    invoke-virtual {v1, v0}, Landroid/widget/AutoCompleteTextView;->setImeOptions(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->setIconified(Z)V

    return-void
.end method

.method public final c0(I)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->j0:Lcom/daaw/nn;

    invoke-virtual {v1}, Lcom/daaw/nn;->b()Landroid/database/Cursor;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-interface {v1, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->j0:Lcom/daaw/nn;

    invoke-virtual {p1, v1}, Lcom/daaw/nn;->c(Landroid/database/Cursor;)Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public clearFocus()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->n0:Z

    invoke-super {p0}, Landroid/view/ViewGroup;->clearFocus()V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->clearFocus()V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    iput-boolean v1, p0, Landroidx/appcompat/widget/SearchView;->n0:Z

    return-void
.end method

.method public d0(Ljava/lang/CharSequence;Z)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setSelection(I)V

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->r0:Ljava/lang/CharSequence;

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->W()V

    :cond_1
    return-void
.end method

.method public final e0()V
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    iget-boolean v3, p0, Landroidx/appcompat/widget/SearchView;->h0:Z

    if-eqz v3, :cond_0

    iget-boolean v3, p0, Landroidx/appcompat/widget/SearchView;->s0:Z

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->K:Landroid/widget/ImageView;

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const/16 v2, 0x8

    :goto_1
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->K:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_4

    if-eqz v0, :cond_3

    sget-object v0, Landroid/view/ViewGroup;->ENABLED_STATE_SET:[I

    goto :goto_2

    :cond_3
    sget-object v0, Landroid/view/ViewGroup;->EMPTY_STATE_SET:[I

    :goto_2
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_4
    return-void
.end method

.method public f()V
    .locals 3

    const-string v0, ""

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/SearchView;->d0(Ljava/lang/CharSequence;Z)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->clearFocus()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->k0(Z)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget v2, p0, Landroidx/appcompat/widget/SearchView;->t0:I

    invoke-virtual {v0, v2}, Landroid/widget/AutoCompleteTextView;->setImeOptions(I)V

    iput-boolean v1, p0, Landroidx/appcompat/widget/SearchView;->s0:Z

    return-void
.end method

.method public f0()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Landroid/view/ViewGroup;->FOCUSED_STATE_SET:[I

    goto :goto_0

    :cond_0
    sget-object v0, Landroid/view/ViewGroup;->EMPTY_STATE_SET:[I

    :goto_0
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->G:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_1
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->H:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method

.method public final g0()V
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->getQueryHint()Ljava/lang/CharSequence;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->J(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/AutoCompleteTextView;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public getImeOptions()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getImeOptions()I

    move-result v0

    return v0
.end method

.method public getInputType()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getInputType()I

    move-result v0

    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/SearchView;->o0:I

    return v0
.end method

.method public getQuery()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0
.end method

.method public getQueryHint()Ljava/lang/CharSequence;
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->l0:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getHintId()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getHintId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->b0:Ljava/lang/CharSequence;

    :goto_0
    return-object v0
.end method

.method public getSuggestionCommitIconResId()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/SearchView;->V:I

    return v0
.end method

.method public getSuggestionRowLayout()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/SearchView;->U:I

    return v0
.end method

.method public getSuggestionsAdapter()Lcom/daaw/nn;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->j0:Lcom/daaw/nn;

    return-object v0
.end method

.method public final h0()V
    .locals 5

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSuggestThreshold()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setThreshold(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getImeOptions()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setImeOptions(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getInputType()I

    move-result v0

    and-int/lit8 v1, v0, 0xf

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const v1, -0x10001

    and-int/2addr v0, v1

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const/high16 v1, 0x10000

    or-int/2addr v0, v1

    const/high16 v1, 0x80000

    or-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v1, v0}, Landroid/widget/AutoCompleteTextView;->setInputType(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->j0:Lcom/daaw/nn;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/nn;->a(Landroid/database/Cursor;)V

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v0, Lcom/daaw/bi1;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    iget-object v4, p0, Landroidx/appcompat/widget/SearchView;->y0:Ljava/util/WeakHashMap;

    invoke-direct {v0, v1, p0, v3, v4}, Lcom/daaw/bi1;-><init>(Landroid/content/Context;Landroidx/appcompat/widget/SearchView;Landroid/app/SearchableInfo;Ljava/util/WeakHashMap;)V

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->j0:Lcom/daaw/nn;

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v1, v0}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->j0:Lcom/daaw/nn;

    check-cast v0, Lcom/daaw/bi1;

    iget-boolean v1, p0, Landroidx/appcompat/widget/SearchView;->m0:Z

    if-eqz v1, :cond_2

    const/4 v2, 0x2

    :cond_2
    invoke-virtual {v0, v2}, Lcom/daaw/bi1;->y(I)V

    :cond_3
    return-void
.end method

.method public final i0()V
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->N()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->J:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->L:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/16 v0, 0x8

    :goto_0
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->H:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final j0(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->k0:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->N()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->p0:Z

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const/16 p1, 0x8

    :goto_0
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->J:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public final k0(Z)V
    .locals 5

    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->i0:Z

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p1, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    :goto_0
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v3}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    iget-object v4, p0, Landroidx/appcompat/widget/SearchView;->I:Landroid/widget/ImageView;

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0, v3}, Landroidx/appcompat/widget/SearchView;->j0(Z)V

    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->F:Landroid/view/View;

    if-eqz p1, :cond_1

    const/16 p1, 0x8

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->S:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->h0:Z

    if-eqz p1, :cond_3

    :cond_2
    const/16 v0, 0x8

    :cond_3
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->S:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->e0()V

    xor-int/lit8 p1, v3, 0x1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->l0(Z)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->i0()V

    return-void
.end method

.method public final l0(Z)V
    .locals 2

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->p0:Z

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->L()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->J:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 v1, 0x0

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->L:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->w0:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->x0:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 1

    invoke-super/range {p0 .. p5}, Landroidx/appcompat/widget/b;->onLayout(ZIIII)V

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->O:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/SearchView;->I(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->P:Landroid/graphics/Rect;

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->O:Landroid/graphics/Rect;

    iget p4, p2, Landroid/graphics/Rect;->left:I

    const/4 v0, 0x0

    iget p2, p2, Landroid/graphics/Rect;->right:I

    sub-int/2addr p5, p3

    invoke-virtual {p1, p4, v0, p2, p5}, Landroid/graphics/Rect;->set(IIII)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->N:Landroidx/appcompat/widget/SearchView$p;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/appcompat/widget/SearchView$p;

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->P:Landroid/graphics/Rect;

    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->O:Landroid/graphics/Rect;

    iget-object p4, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-direct {p1, p2, p3, p4}, Landroidx/appcompat/widget/SearchView$p;-><init>(Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->N:Landroidx/appcompat/widget/SearchView$p;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->P:Landroid/graphics/Rect;

    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->O:Landroid/graphics/Rect;

    invoke-virtual {p1, p2, p3}, Landroidx/appcompat/widget/SearchView$p;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 3

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/b;->onMeasure(II)V

    return-void

    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, -0x80000000

    const/high16 v2, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_4

    if-eqz v0, :cond_2

    if-eq v0, v2, :cond_1

    goto :goto_2

    :cond_1
    iget v0, p0, Landroidx/appcompat/widget/SearchView;->o0:I

    if-lez v0, :cond_6

    goto :goto_0

    :cond_2
    iget p1, p0, Landroidx/appcompat/widget/SearchView;->o0:I

    if-lez p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredWidth()I

    move-result p1

    goto :goto_2

    :cond_4
    iget v0, p0, Landroidx/appcompat/widget/SearchView;->o0:I

    if-lez v0, :cond_5

    :goto_0
    goto :goto_1

    :cond_5
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredWidth()I

    move-result v0

    :goto_1
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_6
    :goto_2
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    if-eq v0, v1, :cond_8

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredHeight()I

    move-result p2

    goto :goto_3

    :cond_8
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredHeight()I

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    :goto_3
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-static {p2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/b;->onMeasure(II)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Landroidx/appcompat/widget/SearchView$SavedState;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, Landroidx/appcompat/widget/SearchView$SavedState;

    invoke-virtual {p1}, Landroidx/customview/view/AbsSavedState;->a()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-boolean p1, p1, Landroidx/appcompat/widget/SearchView$SavedState;->r:Z

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->k0(Z)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Landroidx/appcompat/widget/SearchView$SavedState;

    invoke-direct {v1, v0}, Landroidx/appcompat/widget/SearchView$SavedState;-><init>(Landroid/os/Parcelable;)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->L()Z

    move-result v0

    iput-boolean v0, v1, Landroidx/appcompat/widget/SearchView$SavedState;->r:Z

    return-object v1
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowFocusChanged(Z)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->b0()V

    return-void
.end method

.method public requestFocus(ILandroid/graphics/Rect;)Z
    .locals 2

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->n0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->isFocusable()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->L()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1, p2}, Landroid/widget/AutoCompleteTextView;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/SearchView;->k0(Z)V

    :cond_2
    return p1

    :cond_3
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public setAppSearchData(Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->v0:Landroid/os/Bundle;

    return-void
.end method

.method public setIconified(Z)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->R()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->V()V

    :goto_0
    return-void
.end method

.method public setIconifiedByDefault(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->h0:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->h0:Z

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->k0(Z)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->g0()V

    return-void
.end method

.method public setImeOptions(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setImeOptions(I)V

    return-void
.end method

.method public setInputType(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setInputType(I)V

    return-void
.end method

.method public setMaxWidth(I)V
    .locals 0

    iput p1, p0, Landroidx/appcompat/widget/SearchView;->o0:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method

.method public setOnCloseListener(Landroidx/appcompat/widget/SearchView$l;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->d0:Landroidx/appcompat/widget/SearchView$l;

    return-void
.end method

.method public setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->e0:Landroid/view/View$OnFocusChangeListener;

    return-void
.end method

.method public setOnQueryTextListener(Landroidx/appcompat/widget/SearchView$m;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->c0:Landroidx/appcompat/widget/SearchView$m;

    return-void
.end method

.method public setOnSearchClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->g0:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public setOnSuggestionListener(Landroidx/appcompat/widget/SearchView$n;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->f0:Landroidx/appcompat/widget/SearchView$n;

    return-void
.end method

.method public setQueryHint(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->l0:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->g0()V

    return-void
.end method

.method public setQueryRefinementEnabled(Z)V
    .locals 2

    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->m0:Z

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->j0:Lcom/daaw/nn;

    instance-of v1, v0, Lcom/daaw/bi1;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/daaw/bi1;

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    invoke-virtual {v0, p1}, Lcom/daaw/bi1;->y(I)V

    :cond_1
    return-void
.end method

.method public setSearchableInfo(Landroid/app/SearchableInfo;)V
    .locals 1

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->u0:Landroid/app/SearchableInfo;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->h0()V

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->g0()V

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->K()Z

    move-result p1

    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->p0:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const-string v0, "nm"

    invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setPrivateImeOptions(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->L()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->k0(Z)V

    return-void
.end method

.method public setSubmitButtonEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->k0:Z

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->L()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->k0(Z)V

    return-void
.end method

.method public setSuggestionsAdapter(Lcom/daaw/nn;)V
    .locals 1

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->j0:Lcom/daaw/nn;

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method
