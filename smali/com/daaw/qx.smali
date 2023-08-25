.class public Lcom/daaw/qx;
.super Landroid/app/DialogFragment;
.source ""


# static fields
.field public static K:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Lcom/daaw/rx;",
            ">;"
        }
    .end annotation
.end field

.field public static L:Lcom/daaw/rw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/rw1<",
            "Lcom/daaw/sx;",
            "Lcom/daaw/rx;",
            ">;"
        }
    .end annotation
.end field

.field public static M:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Lcom/daaw/rx;",
            ">;"
        }
    .end annotation
.end field

.field public static N:I


# instance fields
.field public A:Landroid/widget/TextView;

.field public B:Landroid/widget/SeekBar;

.field public C:Z

.field public D:Lcom/daaw/rx;

.field public E:I

.field public F:Lcom/daaw/lv;

.field public G:F

.field public H:F

.field public I:Z

.field public J:Landroid/view/View$OnTouchListener;

.field public p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public q:Landroidx/appcompat/widget/SwitchCompat;

.field public r:Landroid/widget/Spinner;

.field public s:Landroid/widget/ScrollView;

.field public t:Landroid/widget/HorizontalScrollView;

.field public u:Landroid/view/ViewGroup;

.field public v:[Lcom/daaw/avee/Common/VerticalSeekBar;

.field public w:[Landroid/widget/TextView;

.field public x:Lcom/triggertrap/seekarc/SeekArc;

.field public y:Lcom/triggertrap/seekarc/SeekArc;

.field public z:Landroid/widget/TextView;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/qx;->K:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/rw1;

    invoke-direct {v0}, Lcom/daaw/rw1;-><init>()V

    sput-object v0, Lcom/daaw/qx;->L:Lcom/daaw/rw1;

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/qx;->M:Lcom/daaw/vw1;

    const/16 v0, 0x1e

    sput v0, Lcom/daaw/qx;->N:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/qx;->p:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/qx;->C:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/qx;->D:Lcom/daaw/rx;

    const/16 v1, 0x1e

    iput v1, p0, Lcom/daaw/qx;->E:I

    sget-object v1, Lcom/daaw/lv;->c:Lcom/daaw/lv;

    invoke-static {v1}, Lcom/daaw/lv;->a(Lcom/daaw/lv;)Lcom/daaw/lv;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/qx;->F:Lcom/daaw/lv;

    iput-boolean v0, p0, Lcom/daaw/qx;->I:Z

    new-instance v0, Lcom/daaw/qx$a;

    invoke-direct {v0, p0}, Lcom/daaw/qx$a;-><init>(Lcom/daaw/qx;)V

    iput-object v0, p0, Lcom/daaw/qx;->J:Landroid/view/View$OnTouchListener;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/qx;)Landroid/widget/ScrollView;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qx;->s:Landroid/widget/ScrollView;

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/qx;)Landroid/widget/HorizontalScrollView;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qx;->t:Landroid/widget/HorizontalScrollView;

    return-object p0
.end method

.method public static synthetic c(Lcom/daaw/qx;)Lcom/daaw/rx;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qx;->D:Lcom/daaw/rx;

    return-object p0
.end method

.method public static synthetic d(Lcom/daaw/qx;)Lcom/daaw/lv;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qx;->F:Lcom/daaw/lv;

    return-object p0
.end method

.method public static synthetic e(Lcom/daaw/qx;)I
    .locals 0

    iget p0, p0, Lcom/daaw/qx;->E:I

    return p0
.end method

.method public static synthetic f(Lcom/daaw/qx;IIZ)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/qx;->x(IIZ)V

    return-void
.end method

.method public static synthetic g(Lcom/daaw/qx;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/qx;->v()V

    return-void
.end method

.method public static synthetic h(Lcom/daaw/qx;)Landroid/widget/Spinner;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qx;->r:Landroid/widget/Spinner;

    return-object p0
.end method

.method public static synthetic i(Lcom/daaw/qx;)F
    .locals 0

    iget p0, p0, Lcom/daaw/qx;->G:F

    return p0
.end method

.method public static synthetic j(Lcom/daaw/qx;F)F
    .locals 0

    iput p1, p0, Lcom/daaw/qx;->G:F

    return p1
.end method

.method public static synthetic k()I
    .locals 1

    sget v0, Lcom/daaw/qx;->N:I

    return v0
.end method

.method public static synthetic l(Lcom/daaw/qx;)F
    .locals 0

    iget p0, p0, Lcom/daaw/qx;->H:F

    return p0
.end method

.method public static synthetic m(Lcom/daaw/qx;F)F
    .locals 0

    iput p1, p0, Lcom/daaw/qx;->H:F

    return p1
.end method

.method public static synthetic n(Lcom/daaw/qx;FFZZ)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/qx;->u(FFZZ)V

    return-void
.end method

.method public static synthetic o(Lcom/daaw/qx;FZ)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/qx;->w(FZ)V

    return-void
.end method

.method public static synthetic p(Lcom/daaw/qx;Lcom/daaw/rx;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/qx;->A(Lcom/daaw/rx;)V

    return-void
.end method

.method public static q(Lcom/daaw/al;)Lcom/daaw/qx;
    .locals 2

    new-instance v0, Lcom/daaw/qx;

    invoke-direct {v0}, Lcom/daaw/qx;-><init>()V

    const-string v1, "EqualizerDialog"

    invoke-static {v0, v1, p0}, Lcom/daaw/gr1;->x(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/al;)V

    return-object v0
.end method

.method public static r(F)Ljava/lang/String;
    .locals 1

    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float p0, p0, v0

    float-to-int p0, p0

    invoke-static {p0}, Lcom/daaw/qx;->s(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static s(I)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/16 v2, 0x3e8

    if-ge p0, v2, :cond_0

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v1, v1, [Ljava/lang/Object;

    int-to-float p0, p0

    const v3, 0x3a83126f    # 0.001f

    mul-float p0, p0, v3

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    aput-object p0, v1, v0

    const-string p0, "%.1fHz"

    invoke-static {v2, p0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const v3, 0xf4240

    if-ge p0, v3, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    div-int/2addr p0, v2

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "Hz"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v1, v1, [Ljava/lang/Object;

    int-to-float p0, p0

    const v3, 0x358637bd    # 1.0E-6f

    mul-float p0, p0, v3

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    aput-object p0, v1, v0

    const-string p0, "%.1fkHz"

    invoke-static {v2, p0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A(Lcom/daaw/rx;)V
    .locals 7

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/qx;->t()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/qx;->I:Z

    if-nez p1, :cond_2

    sget-object p1, Lcom/daaw/rx;->k:Lcom/daaw/rx;

    :cond_2
    iput-object p1, p0, Lcom/daaw/qx;->D:Lcom/daaw/rx;

    iget-object v1, p0, Lcom/daaw/qx;->q:Landroidx/appcompat/widget/SwitchCompat;

    iget-boolean p1, p1, Lcom/daaw/rx;->c:Z

    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    iget-object p1, p0, Lcom/daaw/qx;->D:Lcom/daaw/rx;

    iget-object p1, p1, Lcom/daaw/rx;->b:Lcom/daaw/lv;

    invoke-static {p1}, Lcom/daaw/lv;->a(Lcom/daaw/lv;)Lcom/daaw/lv;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/qx;->F:Lcom/daaw/lv;

    iget-object p1, p0, Lcom/daaw/qx;->D:Lcom/daaw/rx;

    iget-object v1, p1, Lcom/daaw/rx;->b:Lcom/daaw/lv;

    iget-object v1, v1, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    array-length v1, v1

    iget v2, p0, Lcom/daaw/qx;->E:I

    rem-int/lit8 v3, v2, 0x2

    if-eqz v3, :cond_3

    add-int/2addr v2, v0

    iput v2, p0, Lcom/daaw/qx;->E:I

    :cond_3
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/daaw/qx;->C:Z

    iget-object p1, p1, Lcom/daaw/rx;->e:[Lcom/daaw/lv;

    array-length p1, p1

    add-int/2addr p1, v0

    new-array v3, p1, [Ljava/lang/String;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f10004b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v2

    const/4 v4, 0x0

    :goto_0
    iget-object v5, p0, Lcom/daaw/qx;->D:Lcom/daaw/rx;

    iget-object v5, v5, Lcom/daaw/rx;->e:[Lcom/daaw/lv;

    array-length v6, v5

    if-ge v4, v6, :cond_4

    add-int/lit8 v6, v4, 0x1

    aget-object v4, v5, v4

    iget-object v4, v4, Lcom/daaw/lv;->a:Ljava/lang/String;

    aput-object v4, v3, v6

    move v4, v6

    goto :goto_0

    :cond_4
    new-instance v4, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v5

    const v6, 0x1090008

    invoke-direct {v4, v5, v6, v3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/daaw/qx;->r:Landroid/widget/Spinner;

    invoke-virtual {v3, v4}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    iget-object v3, p0, Lcom/daaw/qx;->D:Lcom/daaw/rx;

    iget v3, v3, Lcom/daaw/rx;->d:I

    if-ltz v3, :cond_5

    add-int/2addr v3, v0

    goto :goto_1

    :cond_5
    const/4 v3, 0x0

    :goto_1
    if-ltz v3, :cond_6

    if-lt v3, p1, :cond_7

    :cond_6
    const/4 v3, 0x0

    :cond_7
    iget-object p1, p0, Lcom/daaw/qx;->r:Landroid/widget/Spinner;

    invoke-virtual {p1, v3, v2}, Landroid/widget/Spinner;->setSelection(IZ)V

    iget-object p1, p0, Lcom/daaw/qx;->r:Landroid/widget/Spinner;

    new-instance v3, Lcom/daaw/qx$g;

    invoke-direct {v3, p0}, Lcom/daaw/qx$g;-><init>(Lcom/daaw/qx;)V

    invoke-virtual {p1, v3}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    iput-boolean v0, p0, Lcom/daaw/qx;->C:Z

    new-array p1, v1, [Lcom/daaw/avee/Common/VerticalSeekBar;

    iput-object p1, p0, Lcom/daaw/qx;->v:[Lcom/daaw/avee/Common/VerticalSeekBar;

    new-array p1, v1, [Landroid/widget/TextView;

    iput-object p1, p0, Lcom/daaw/qx;->w:[Landroid/widget/TextView;

    iget-object p1, p0, Lcom/daaw/qx;->u:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    const/4 p1, 0x0

    :goto_2
    if-ge p1, v1, :cond_8

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f0c0061

    const/4 v5, 0x0

    invoke-static {v3, v4, v5}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/qx;->v:[Lcom/daaw/avee/Common/VerticalSeekBar;

    const v5, 0x7f09024a

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/daaw/avee/Common/VerticalSeekBar;

    aput-object v5, v4, p1

    iget-object v4, p0, Lcom/daaw/qx;->w:[Landroid/widget/TextView;

    const v5, 0x7f0902d2

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    aput-object v5, v4, p1

    const v4, 0x7f0902d1

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iget-object v5, p0, Lcom/daaw/qx;->D:Lcom/daaw/rx;

    iget-object v5, v5, Lcom/daaw/rx;->b:Lcom/daaw/lv;

    iget-object v5, v5, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    aget-object v5, v5, p1

    iget v5, v5, Lcom/daaw/lv$a;->a:F

    invoke-static {v5}, Lcom/daaw/qx;->r(F)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, Lcom/daaw/qx;->v:[Lcom/daaw/avee/Common/VerticalSeekBar;

    aget-object v4, v4, p1

    iget v5, p0, Lcom/daaw/qx;->E:I

    invoke-virtual {v4, v5}, Landroid/widget/SeekBar;->setMax(I)V

    iget-object v4, p0, Lcom/daaw/qx;->v:[Lcom/daaw/avee/Common/VerticalSeekBar;

    aget-object v4, v4, p1

    iget-object v5, p0, Lcom/daaw/qx;->J:Landroid/view/View$OnTouchListener;

    invoke-virtual {v4, v5}, Landroid/widget/SeekBar;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v4, p0, Lcom/daaw/qx;->v:[Lcom/daaw/avee/Common/VerticalSeekBar;

    aget-object v4, v4, p1

    new-instance v5, Lcom/daaw/qx$h;

    invoke-direct {v5, p0, p1}, Lcom/daaw/qx$h;-><init>(Lcom/daaw/qx;I)V

    invoke-virtual {v4, v5}, Lcom/daaw/avee/Common/VerticalSeekBar;->setOnSeekBarChangeFromUserListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    iget-object v4, p0, Lcom/daaw/qx;->u:Landroid/view/ViewGroup;

    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_8
    iget-object p1, p0, Lcom/daaw/qx;->D:Lcom/daaw/rx;

    iget v1, p1, Lcom/daaw/rx;->f:F

    iget p1, p1, Lcom/daaw/rx;->h:F

    invoke-virtual {p0, v1, p1, v2, v0}, Lcom/daaw/qx;->u(FFZZ)V

    iget-object p1, p0, Lcom/daaw/qx;->D:Lcom/daaw/rx;

    iget p1, p1, Lcom/daaw/rx;->j:F

    invoke-virtual {p0, p1, v2}, Lcom/daaw/qx;->w(FZ)V

    iput-boolean v2, p0, Lcom/daaw/qx;->I:Z

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, Lcom/daaw/qx;->K:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/qx$f;

    invoke-direct {v0, p0}, Lcom/daaw/qx$f;-><init>(Lcom/daaw/qx;)V

    iget-object v1, p0, Lcom/daaw/qx;->p:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0c0060

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f090282

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/SwitchCompat;

    iput-object v1, p0, Lcom/daaw/qx;->q:Landroidx/appcompat/widget/SwitchCompat;

    new-instance v2, Lcom/daaw/qx$b;

    invoke-direct {v2, p0}, Lcom/daaw/qx$b;-><init>(Lcom/daaw/qx;)V

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v1, 0x7f090263

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Spinner;

    iput-object v1, p0, Lcom/daaw/qx;->r:Landroid/widget/Spinner;

    const v1, 0x7f090231

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ScrollView;

    iput-object v1, p0, Lcom/daaw/qx;->s:Landroid/widget/ScrollView;

    const v1, 0x7f090232

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/HorizontalScrollView;

    iput-object v1, p0, Lcom/daaw/qx;->t:Landroid/widget/HorizontalScrollView;

    const v1, 0x7f090193

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/daaw/qx;->u:Landroid/view/ViewGroup;

    const v1, 0x7f09029d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/daaw/qx;->z:Landroid/widget/TextView;

    const v1, 0x7f090242

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/triggertrap/seekarc/SeekArc;

    iput-object v1, p0, Lcom/daaw/qx;->x:Lcom/triggertrap/seekarc/SeekArc;

    iget-object v2, p0, Lcom/daaw/qx;->J:Landroid/view/View$OnTouchListener;

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v1, p0, Lcom/daaw/qx;->x:Lcom/triggertrap/seekarc/SeekArc;

    new-instance v2, Lcom/daaw/qx$c;

    invoke-direct {v2, p0}, Lcom/daaw/qx$c;-><init>(Lcom/daaw/qx;)V

    invoke-virtual {v1, v2}, Lcom/triggertrap/seekarc/SeekArc;->setOnSeekArcChangeListener(Lcom/triggertrap/seekarc/SeekArc$a;)V

    const v1, 0x7f0902a5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/daaw/qx;->A:Landroid/widget/TextView;

    const v1, 0x7f090243

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/triggertrap/seekarc/SeekArc;

    iput-object v1, p0, Lcom/daaw/qx;->y:Lcom/triggertrap/seekarc/SeekArc;

    iget-object v2, p0, Lcom/daaw/qx;->J:Landroid/view/View$OnTouchListener;

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v1, p0, Lcom/daaw/qx;->y:Lcom/triggertrap/seekarc/SeekArc;

    new-instance v2, Lcom/daaw/qx$d;

    invoke-direct {v2, p0}, Lcom/daaw/qx$d;-><init>(Lcom/daaw/qx;)V

    invoke-virtual {v1, v2}, Lcom/triggertrap/seekarc/SeekArc;->setOnSeekArcChangeListener(Lcom/triggertrap/seekarc/SeekArc$a;)V

    const v1, 0x7f090249

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/daaw/qx;->B:Landroid/widget/SeekBar;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    iget-object v0, p0, Lcom/daaw/qx;->B:Landroid/widget/SeekBar;

    iget-object v1, p0, Lcom/daaw/qx;->J:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v0, p0, Lcom/daaw/qx;->B:Landroid/widget/SeekBar;

    new-instance v1, Lcom/daaw/qx$e;

    invoke-direct {v1, p0}, Lcom/daaw/qx$e;-><init>(Lcom/daaw/qx;)V

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/daaw/qx;->K:Lcom/daaw/qw1;

    iget-object v1, p0, Lcom/daaw/qx;->p:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/daaw/qw1;->c(Ljava/util/List;)V

    iget-object v0, p0, Lcom/daaw/qx;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-super {p0}, Landroid/app/DialogFragment;->onDestroy()V

    return-void
.end method

.method public onStart()V
    .locals 2

    invoke-super {p0}, Landroid/app/DialogFragment;->onStart()V

    sget-object v0, Lcom/daaw/qx;->M:Lcom/daaw/vw1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/rx;

    invoke-virtual {p0, v0}, Lcom/daaw/qx;->A(Lcom/daaw/rx;)V

    return-void
.end method

.method public t()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/qx;->q:Landroidx/appcompat/widget/SwitchCompat;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final u(FFZZ)V
    .locals 10

    iput p1, p0, Lcom/daaw/qx;->G:F

    iput p2, p0, Lcom/daaw/qx;->H:F

    if-nez p3, :cond_0

    iget-object v0, p0, Lcom/daaw/qx;->x:Lcom/triggertrap/seekarc/SeekArc;

    sget v1, Lcom/daaw/qx;->N:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    mul-float v1, v1, p1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    sget v2, Lcom/daaw/qx;->N:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/triggertrap/seekarc/SeekArc;->setProgress(I)V

    iget-object v0, p0, Lcom/daaw/qx;->y:Lcom/triggertrap/seekarc/SeekArc;

    sget v1, Lcom/daaw/qx;->N:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    mul-float v1, v1, p2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    sget v2, Lcom/daaw/qx;->N:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/triggertrap/seekarc/SeekArc;->setProgress(I)V

    :cond_0
    sget v0, Lcom/daaw/qx;->N:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    mul-float v0, v0, p1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/qx;->z:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f0e0001

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    invoke-virtual {v2, v5, v0, v7}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v0, Lcom/daaw/qx;->N:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    mul-float v0, v0, p2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/qx;->A:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f0e0003

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v9

    invoke-virtual {v2, v5, v0, v6}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/daaw/qx;->F:Lcom/daaw/lv;

    iget-object v0, v0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    array-length v1, v0

    new-array v7, v1, [F

    array-length v0, v0

    new-array v6, v0, [F

    :goto_0
    if-ge v9, v0, :cond_1

    iget-object v1, p0, Lcom/daaw/qx;->F:Lcom/daaw/lv;

    iget-object v1, v1, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    aget-object v1, v1, v9

    iget v1, v1, Lcom/daaw/lv$a;->a:F

    aput v1, v6, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_1
    if-eqz p4, :cond_2

    iget-object v0, p0, Lcom/daaw/qx;->F:Lcom/daaw/lv;

    iget-object v1, p0, Lcom/daaw/qx;->D:Lcom/daaw/rx;

    iget-object v2, v1, Lcom/daaw/rx;->g:Lcom/daaw/lv;

    iget-object v5, v1, Lcom/daaw/rx;->i:Lcom/daaw/lv;

    move-object v1, v2

    move-object v2, v5

    move v3, p1

    move v4, p2

    move-object v5, v7

    invoke-static/range {v0 .. v6}, Lcom/daaw/px;->b(Lcom/daaw/lv;Lcom/daaw/lv;Lcom/daaw/lv;FF[F[F)V

    invoke-virtual {p0, v7}, Lcom/daaw/qx;->y([F)V

    :cond_2
    return-void
.end method

.method public final v()V
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/qx;->I:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/qx;->v:[Lcom/daaw/avee/Common/VerticalSeekBar;

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lcom/daaw/qx;->D:Lcom/daaw/rx;

    if-nez v1, :cond_2

    return-void

    :cond_2
    array-length v0, v0

    iget-object v1, v1, Lcom/daaw/rx;->b:Lcom/daaw/lv;

    iget-object v1, v1, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    array-length v1, v1

    if-eq v0, v1, :cond_3

    const-string v0, "equalizerUIDesc bands count doesnt match "

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    return-void

    :cond_3
    new-instance v0, Lcom/daaw/sx;

    invoke-direct {v0}, Lcom/daaw/sx;-><init>()V

    iget-object v1, p0, Lcom/daaw/qx;->q:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Lcom/daaw/sx;->a:Z

    iget-object v1, p0, Lcom/daaw/qx;->r:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lcom/daaw/sx;->b:I

    new-instance v1, Lcom/daaw/lv;

    iget-object v2, p0, Lcom/daaw/qx;->v:[Lcom/daaw/avee/Common/VerticalSeekBar;

    array-length v2, v2

    const-string v3, "Default"

    invoke-direct {v1, v3, v2}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iput-object v1, v0, Lcom/daaw/sx;->f:Lcom/daaw/lv;

    iget v1, p0, Lcom/daaw/qx;->G:F

    iput v1, v0, Lcom/daaw/sx;->d:F

    iget v1, p0, Lcom/daaw/qx;->H:F

    iput v1, v0, Lcom/daaw/sx;->e:F

    iget-object v1, p0, Lcom/daaw/qx;->F:Lcom/daaw/lv;

    iput-object v1, v0, Lcom/daaw/sx;->c:Lcom/daaw/lv;

    iget-object v1, p0, Lcom/daaw/qx;->B:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/daaw/qx;->B:Landroid/widget/SeekBar;

    invoke-virtual {v2}, Landroid/widget/SeekBar;->getMax()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    iput v1, v0, Lcom/daaw/sx;->g:F

    iget-object v1, v0, Lcom/daaw/sx;->f:Lcom/daaw/lv;

    invoke-virtual {p0, v1}, Lcom/daaw/qx;->z(Lcom/daaw/lv;)V

    sget-object v1, Lcom/daaw/qx;->L:Lcom/daaw/rw1;

    iget-object v2, p0, Lcom/daaw/qx;->D:Lcom/daaw/rx;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final w(FZ)V
    .locals 1

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/daaw/qx;->B:Landroid/widget/SeekBar;

    const/high16 v0, 0x42c80000    # 100.0f

    mul-float p1, p1, v0

    float-to-int p1, p1

    invoke-virtual {p2, p1}, Landroid/widget/SeekBar;->setProgress(I)V

    :cond_0
    return-void
.end method

.method public final x(IIZ)V
    .locals 2

    iget v0, p0, Lcom/daaw/qx;->E:I

    div-int/lit8 v1, v0, 0x2

    neg-int v1, v1

    div-int/lit8 v0, v0, 0x2

    invoke-static {p2, v1, v0}, Lcom/daaw/br1;->k(III)I

    move-result p2

    if-nez p3, :cond_0

    iget p3, p0, Lcom/daaw/qx;->E:I

    div-int/lit8 p3, p3, 0x2

    add-int/2addr p3, p2

    iget-object v0, p0, Lcom/daaw/qx;->v:[Lcom/daaw/avee/Common/VerticalSeekBar;

    aget-object v0, v0, p1

    invoke-virtual {v0, p3}, Landroid/widget/SeekBar;->setProgress(I)V

    iget-object p3, p0, Lcom/daaw/qx;->v:[Lcom/daaw/avee/Common/VerticalSeekBar;

    aget-object p3, p3, p1

    invoke-virtual {p3}, Lcom/daaw/avee/Common/VerticalSeekBar;->a()V

    :cond_0
    iget-object p3, p0, Lcom/daaw/qx;->w:[Landroid/widget/TextView;

    aget-object p1, p3, p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, ""

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final y([F)V
    .locals 4

    array-length v0, p1

    iget-object v1, p0, Lcom/daaw/qx;->v:[Lcom/daaw/avee/Common/VerticalSeekBar;

    array-length v1, v1

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    iget v2, p0, Lcom/daaw/qx;->E:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    aget v3, p1, v1

    mul-float v2, v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/daaw/qx;->x(IIZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public z(Lcom/daaw/lv;)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/qx;->v:[Lcom/daaw/avee/Common/VerticalSeekBar;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-lez v1, :cond_0

    aget-object v0, v0, v2

    invoke-virtual {v0}, Landroid/widget/SeekBar;->getMax()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    div-int/2addr v0, v3

    iget-object v1, p1, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    array-length v1, v1

    iget-object v3, p0, Lcom/daaw/qx;->v:[Lcom/daaw/avee/Common/VerticalSeekBar;

    array-length v4, v3

    if-eq v1, v4, :cond_1

    array-length v1, v3

    invoke-virtual {p1, v1}, Lcom/daaw/lv;->d(I)V

    :cond_1
    :goto_1
    iget-object v1, p0, Lcom/daaw/qx;->v:[Lcom/daaw/avee/Common/VerticalSeekBar;

    array-length v3, v1

    if-ge v2, v3, :cond_2

    iget-object v3, p1, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v4, Lcom/daaw/lv$a;

    iget-object v5, p0, Lcom/daaw/qx;->D:Lcom/daaw/rx;

    iget-object v5, v5, Lcom/daaw/rx;->b:Lcom/daaw/lv;

    iget-object v5, v5, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    aget-object v5, v5, v2

    iget v5, v5, Lcom/daaw/lv$a;->a:F

    aget-object v1, v1, v2

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v1

    sub-int/2addr v1, v0

    int-to-float v1, v1

    int-to-float v6, v0

    div-float/2addr v1, v6

    invoke-direct {v4, v5, v1}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method
