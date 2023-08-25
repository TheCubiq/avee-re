.class public Lcom/daaw/dv1;
.super Landroid/app/DialogFragment;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/dv1$d;,
        Lcom/daaw/dv1$e;,
        Lcom/daaw/dv1$f;
    }
.end annotation


# static fields
.field public static M:Lcom/daaw/tw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/tw1<",
            "Landroid/app/Fragment;",
            "Lcom/daaw/al;",
            "Lcom/daaw/dv1$d;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static N:Lcom/daaw/pw1;

.field public static O:Lcom/daaw/sw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/sw1<",
            "Landroid/app/Fragment;",
            "Lcom/daaw/al;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static P:Lcom/daaw/sw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/sw1<",
            "Lcom/daaw/dv1;",
            "Ljava/lang/Integer;",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field public static Q:Lcom/daaw/pw1;

.field public static R:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Lcom/daaw/dv1$d;",
            ">;"
        }
    .end annotation
.end field

.field public static final S:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final T:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Lcom/daaw/dv1$f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public A:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

.field public B:Landroid/widget/CheckBox;

.field public C:Landroid/widget/CheckBox;

.field public D:Landroid/widget/CheckBox;

.field public E:Landroid/widget/CheckBox;

.field public F:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

.field public G:Landroid/widget/CheckBox;

.field public H:Landroid/widget/Button;

.field public I:Landroid/widget/Button;

.field public J:I

.field public K:I

.field public final L:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public p:Lcom/daaw/dv1$d;

.field public q:Lcom/daaw/fv1;

.field public r:Landroid/view/ViewGroup;

.field public s:Landroid/widget/Button;

.field public t:Landroid/widget/EditText;

.field public u:Landroid/widget/Spinner;

.field public v:Landroid/widget/Spinner;

.field public w:Landroid/widget/Spinner;

.field public x:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

.field public y:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

.field public z:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/tw1;

    invoke-direct {v0}, Lcom/daaw/tw1;-><init>()V

    sput-object v0, Lcom/daaw/dv1;->M:Lcom/daaw/tw1;

    new-instance v0, Lcom/daaw/pw1;

    invoke-direct {v0}, Lcom/daaw/pw1;-><init>()V

    sput-object v0, Lcom/daaw/dv1;->N:Lcom/daaw/pw1;

    new-instance v0, Lcom/daaw/sw1;

    invoke-direct {v0}, Lcom/daaw/sw1;-><init>()V

    sput-object v0, Lcom/daaw/dv1;->O:Lcom/daaw/sw1;

    new-instance v0, Lcom/daaw/sw1;

    invoke-direct {v0}, Lcom/daaw/sw1;-><init>()V

    sput-object v0, Lcom/daaw/dv1;->P:Lcom/daaw/sw1;

    new-instance v0, Lcom/daaw/pw1;

    invoke-direct {v0}, Lcom/daaw/pw1;-><init>()V

    sput-object v0, Lcom/daaw/dv1;->Q:Lcom/daaw/pw1;

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/dv1;->R:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/dv1;->S:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/dv1;->T:Lcom/daaw/qw1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/dv1;->p:Lcom/daaw/dv1$d;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/dv1;->J:I

    iput v0, p0, Lcom/daaw/dv1;->K:I

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/dv1;->L:Ljava/util/List;

    return-void
.end method

.method private synthetic A(Landroid/widget/TimePicker;II)V
    .locals 0

    mul-int/lit8 p2, p2, 0x3c

    add-int/2addr p3, p2

    mul-int/lit16 p3, p3, 0x3e8

    invoke-virtual {p0, p3}, Lcom/daaw/dv1;->F(I)V

    return-void
.end method

.method private synthetic B(Landroid/view/View;)V
    .locals 7

    new-instance p1, Landroid/app/TimePickerDialog;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/daaw/su1;

    invoke-direct {v2, p0}, Lcom/daaw/su1;-><init>(Lcom/daaw/dv1;)V

    iget v0, p0, Lcom/daaw/dv1;->K:I

    const v3, 0xea60

    div-int v4, v0, v3

    rem-int/2addr v0, v3

    div-int/lit16 v5, v0, 0x3e8

    const/4 v6, 0x1

    move-object v0, p1

    move v3, v4

    move v4, v5

    move v5, v6

    invoke-direct/range {v0 .. v5}, Landroid/app/TimePickerDialog;-><init>(Landroid/content/Context;Landroid/app/TimePickerDialog$OnTimeSetListener;IIZ)V

    invoke-virtual {p1}, Landroid/app/TimePickerDialog;->show()V

    return-void
.end method

.method private synthetic C(Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 1

    sget-object p1, Lcom/daaw/nc0;->g:Lcom/daaw/vw1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lcom/daaw/dv1;->R:Lcom/daaw/vw1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/dv1$d;

    invoke-virtual {p0, p1}, Lcom/daaw/dv1;->J(Lcom/daaw/dv1$d;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/daaw/az0;

    invoke-direct {p1}, Lcom/daaw/az0;-><init>()V

    invoke-virtual {p1}, Lcom/daaw/az0;->d()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/dv1;->L()V

    :cond_1
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public static I(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/daaw/dv1;->S:Lcom/daaw/qw1;

    invoke-virtual {v0, p0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static K(Lcom/daaw/dv1$f;)V
    .locals 1

    sget-object v0, Lcom/daaw/dv1;->T:Lcom/daaw/qw1;

    invoke-virtual {v0, p0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/dv1;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/dv1;->B(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/dv1;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/dv1;->w(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Lcom/daaw/dv1;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/dv1;->x(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lcom/daaw/dv1;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/dv1;->v(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lcom/daaw/dv1;Landroid/widget/TimePicker;II)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/dv1;->A(Landroid/widget/TimePicker;II)V

    return-void
.end method

.method public static synthetic f(Lcom/daaw/dv1;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/dv1;->r(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic g(Lcom/daaw/dv1;Lcom/daaw/dv1$f;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/dv1;->s(Lcom/daaw/dv1$f;)V

    return-void
.end method

.method public static synthetic h(Lcom/daaw/dv1;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/dv1;->u()V

    return-void
.end method

.method public static synthetic i(Lcom/daaw/dv1;Landroid/widget/TimePicker;II)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/dv1;->y(Landroid/widget/TimePicker;II)V

    return-void
.end method

.method public static synthetic j(Lcom/daaw/dv1;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/dv1;->z(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Lcom/daaw/dv1;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/dv1;->C(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/daaw/dv1;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/dv1;->o()V

    return-void
.end method

.method public static synthetic m(Lcom/daaw/dv1;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/dv1;->H()V

    return-void
.end method

.method public static synthetic n(Lcom/daaw/dv1;Lcom/daaw/dv1$e;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/dv1;->D(Lcom/daaw/dv1$e;)V

    return-void
.end method

.method public static p(Lcom/daaw/al;)V
    .locals 2

    new-instance v0, Lcom/daaw/dv1;

    invoke-direct {v0}, Lcom/daaw/dv1;-><init>()V

    const-string v1, "VisExportDialog"

    invoke-static {v0, v1, p0}, Lcom/daaw/gr1;->x(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/al;)V

    return-void
.end method

.method private synthetic u()V
    .locals 1

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method private synthetic v(Landroid/view/View;)V
    .locals 3

    sget-object v0, Lcom/daaw/dv1;->M:Lcom/daaw/tw1;

    new-instance v1, Lcom/daaw/al;

    invoke-direct {v1, p1}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/daaw/dv1;->q()Lcom/daaw/dv1$d;

    move-result-object p1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p0, v1, p1, v2}, Lcom/daaw/tw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/dv1;->G:Landroid/widget/CheckBox;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    return-void
.end method

.method private synthetic w(Landroid/view/View;)V
    .locals 3

    sget-object v0, Lcom/daaw/dv1;->M:Lcom/daaw/tw1;

    new-instance v1, Lcom/daaw/al;

    invoke-direct {v1, p1}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/daaw/dv1;->q()Lcom/daaw/dv1$d;

    move-result-object p1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p0, v1, p1, v2}, Lcom/daaw/tw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic x(Landroid/view/View;)V
    .locals 2

    sget-object v0, Lcom/daaw/dv1;->O:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/al;

    invoke-direct {v1, p1}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    iget-object p1, p0, Lcom/daaw/dv1;->s:Landroid/widget/Button;

    invoke-virtual {p1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, v1, p1}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic y(Landroid/widget/TimePicker;II)V
    .locals 0

    mul-int/lit8 p2, p2, 0x3c

    add-int/2addr p3, p2

    mul-int/lit16 p3, p3, 0x3e8

    invoke-virtual {p0, p3}, Lcom/daaw/dv1;->G(I)V

    return-void
.end method

.method private synthetic z(Landroid/view/View;)V
    .locals 7

    new-instance p1, Landroid/app/TimePickerDialog;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/daaw/uu1;

    invoke-direct {v2, p0}, Lcom/daaw/uu1;-><init>(Lcom/daaw/dv1;)V

    iget v0, p0, Lcom/daaw/dv1;->J:I

    const v3, 0xea60

    div-int v4, v0, v3

    rem-int/2addr v0, v3

    div-int/lit16 v5, v0, 0x3e8

    const/4 v6, 0x1

    move-object v0, p1

    move v3, v4

    move v4, v5

    move v5, v6

    invoke-direct/range {v0 .. v5}, Landroid/app/TimePickerDialog;-><init>(Landroid/content/Context;Landroid/app/TimePickerDialog$OnTimeSetListener;IIZ)V

    invoke-virtual {p1}, Landroid/app/TimePickerDialog;->show()V

    return-void
.end method


# virtual methods
.method public final D(Lcom/daaw/dv1$e;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/dv1;->r:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/dv1;->H()V

    iget v0, p1, Lcom/daaw/dv1$e;->i:I

    const/4 v1, 0x0

    if-ltz v0, :cond_1

    iget-object v2, p0, Lcom/daaw/dv1;->v:Landroid/widget/Spinner;

    invoke-virtual {v2}, Landroid/widget/Spinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v2

    invoke-interface {v2}, Landroid/widget/SpinnerAdapter;->getCount()I

    move-result v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lcom/daaw/dv1;->v:Landroid/widget/Spinner;

    invoke-virtual {v2, v0, v1}, Landroid/widget/Spinner;->setSelection(IZ)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/dv1;->v:Landroid/widget/Spinner;

    invoke-virtual {v0, v1, v1}, Landroid/widget/Spinner;->setSelection(IZ)V

    :goto_0
    iget-object v0, p0, Lcom/daaw/dv1;->v:Landroid/widget/Spinner;

    new-instance v2, Lcom/daaw/dv1$c;

    invoke-direct {v2, p0}, Lcom/daaw/dv1$c;-><init>(Lcom/daaw/dv1;)V

    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    iget-object v0, p0, Lcom/daaw/dv1;->x:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p1, Lcom/daaw/dv1$e;->c:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/daaw/dv1;->y:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p1, Lcom/daaw/dv1$e;->d:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/daaw/dv1;->z:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p1, Lcom/daaw/dv1$e;->e:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/daaw/dv1;->A:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p1, Lcom/daaw/dv1$e;->f:F

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/daaw/dv1;->E:Landroid/widget/CheckBox;

    iget v2, p1, Lcom/daaw/dv1$e;->g:I

    const/4 v4, 0x1

    if-le v2, v4, :cond_2

    const/4 v1, 0x1

    :cond_2
    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v0, p0, Lcom/daaw/dv1;->F:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lcom/daaw/dv1$e;->h:F

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final E(Lcom/daaw/dv1$e;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dv1;->x:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    iget v1, p1, Lcom/daaw/dv1$e;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Common/PrControls/PrEditText;->setLimit(Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/daaw/dv1;->y:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    iget v1, p1, Lcom/daaw/dv1$e;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Common/PrControls/PrEditText;->setLimit(Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/daaw/dv1;->A:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    iget v1, p1, Lcom/daaw/dv1$e;->f:F

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Common/PrControls/PrEditText;->setLimit(Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/daaw/dv1;->z:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    iget v1, p1, Lcom/daaw/dv1$e;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Common/PrControls/PrEditText;->setLimit(Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/daaw/dv1;->F:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    iget p1, p1, Lcom/daaw/dv1$e;->h:F

    float-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Common/PrControls/PrEditText;->setLimit(Ljava/lang/Integer;)V

    return-void
.end method

.method public final F(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dv1;->p:Lcom/daaw/dv1$d;

    iget v0, v0, Lcom/daaw/dv1$d;->j:I

    const/4 v1, 0x0

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/dv1;->K:I

    iget-object v0, p0, Lcom/daaw/dv1;->I:Landroid/widget/Button;

    div-int/lit16 p1, p1, 0x3e8

    invoke-static {p1}, Lcom/daaw/br1;->o(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final G(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dv1;->p:Lcom/daaw/dv1$d;

    iget v0, v0, Lcom/daaw/dv1$d;->j:I

    const/4 v1, 0x0

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/dv1;->J:I

    iget-object v0, p0, Lcom/daaw/dv1;->H:Landroid/widget/Button;

    div-int/lit16 p1, p1, 0x3e8

    invoke-static {p1}, Lcom/daaw/br1;->o(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final H()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/dv1;->p:Lcom/daaw/dv1$d;

    iget-object v0, v0, Lcom/daaw/dv1$d;->d:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/dv1;->u:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemId()J

    move-result-wide v1

    long-to-int v2, v1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/dx$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/dx$a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Lcom/daaw/dx;->b()Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v0, :cond_1

    const-string v0, "High"

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v0, p0, Lcom/daaw/dv1;->v:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/dv1;->v:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/SpinnerAdapter;->getCount()I

    move-result v0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-eq v0, v3, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/daaw/dv1;->v:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v0

    new-instance v3, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v4

    const v5, 0x1090008

    invoke-direct {v3, v4, v5, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    iget-object v4, p0, Lcom/daaw/dv1;->v:Landroid/widget/Spinner;

    invoke-virtual {v4, v3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    if-ltz v0, :cond_3

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_3

    iget-object v2, p0, Lcom/daaw/dv1;->v:Landroid/widget/Spinner;

    invoke-virtual {v2, v0, v1}, Landroid/widget/Spinner;->setSelection(IZ)V

    :cond_3
    return-void
.end method

.method public J(Lcom/daaw/dv1$d;)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/dv1;->r:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/daaw/dv1;->p:Lcom/daaw/dv1$d;

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    iget-object v1, p0, Lcom/daaw/dv1;->s:Landroid/widget/Button;

    iget-object v2, p1, Lcom/daaw/dv1$d;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/daaw/dv1;->t:Landroid/widget/EditText;

    iget-object v2, p1, Lcom/daaw/dv1$d;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget v1, p1, Lcom/daaw/dv1$d;->e:I

    iget-object v2, p1, Lcom/daaw/dv1$d;->d:Ljava/util/List;

    if-eqz v2, :cond_3

    invoke-static {v2}, Lcom/daaw/dx;->c(Ljava/util/List;)[Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_3
    const-string v2, "<empty>"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    :goto_0
    new-instance v3, Landroid/widget/ArrayAdapter;

    const v4, 0x1090008

    invoke-direct {v3, v0, v4, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/dv1;->u:Landroid/widget/Spinner;

    invoke-virtual {v0, v3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    const/4 v0, 0x0

    if-ltz v1, :cond_4

    array-length v2, v2

    if-ge v1, v2, :cond_4

    iget-object v2, p0, Lcom/daaw/dv1;->u:Landroid/widget/Spinner;

    invoke-virtual {v2, v1, v0}, Landroid/widget/Spinner;->setSelection(IZ)V

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lcom/daaw/dv1;->u:Landroid/widget/Spinner;

    invoke-virtual {v1, v0, v0}, Landroid/widget/Spinner;->setSelection(IZ)V

    :goto_1
    iget-object v1, p0, Lcom/daaw/dv1;->u:Landroid/widget/Spinner;

    new-instance v2, Lcom/daaw/dv1$a;

    invoke-direct {v2, p0}, Lcom/daaw/dv1$a;-><init>(Lcom/daaw/dv1;)V

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    iget v1, p1, Lcom/daaw/dv1$d;->b:I

    new-instance v2, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v3

    iget-object v5, p0, Lcom/daaw/dv1;->w:Landroid/widget/Spinner;

    invoke-virtual {v5}, Landroid/widget/Spinner;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f1002e6

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, v5}, Lcom/daaw/dv1$d;->a(Lcom/daaw/dv1$d;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/daaw/dv1;->w:Landroid/widget/Spinner;

    invoke-virtual {v3, v2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    iget-object v2, p0, Lcom/daaw/dv1;->w:Landroid/widget/Spinner;

    invoke-virtual {v2, v1, v0}, Landroid/widget/Spinner;->setSelection(IZ)V

    iget-object v1, p0, Lcom/daaw/dv1;->w:Landroid/widget/Spinner;

    new-instance v2, Lcom/daaw/dv1$b;

    invoke-direct {v2, p0, p1}, Lcom/daaw/dv1$b;-><init>(Lcom/daaw/dv1;Lcom/daaw/dv1$d;)V

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    iget-object v1, p0, Lcom/daaw/dv1;->B:Landroid/widget/CheckBox;

    iget-boolean v2, p1, Lcom/daaw/dv1$d;->l:Z

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v1, p0, Lcom/daaw/dv1;->C:Landroid/widget/CheckBox;

    iget-boolean v2, p1, Lcom/daaw/dv1$d;->k:Z

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v1, p0, Lcom/daaw/dv1;->D:Landroid/widget/CheckBox;

    iget-boolean v2, p1, Lcom/daaw/dv1$d;->h:Z

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v1, p1, Lcom/daaw/dv1$d;->c:Lcom/daaw/dv1$e;

    invoke-virtual {p0, v1}, Lcom/daaw/dv1;->D(Lcom/daaw/dv1$e;)V

    iget v1, p1, Lcom/daaw/dv1$d;->i:I

    invoke-virtual {p0, v1}, Lcom/daaw/dv1;->G(I)V

    iget v1, p1, Lcom/daaw/dv1$d;->j:I

    invoke-virtual {p0, v1}, Lcom/daaw/dv1;->F(I)V

    sget-object v1, Lcom/daaw/nc0;->g:Lcom/daaw/vw1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p1, Lcom/daaw/dv1$d;->a:[Lcom/daaw/dv1$e;

    invoke-static {v1}, Lcom/daaw/dv1$e;->d([Lcom/daaw/dv1$e;)Lcom/daaw/dv1$e;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/daaw/dv1;->E(Lcom/daaw/dv1$e;)V

    iget v1, p1, Lcom/daaw/dv1$d;->b:I

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/dv1$d;->c(I)Lcom/daaw/dv1$e;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/dv1;->D(Lcom/daaw/dv1$e;)V

    invoke-virtual {p0}, Lcom/daaw/dv1;->L()V

    iget-object p1, p0, Lcom/daaw/dv1;->I:Landroid/widget/Button;

    sget-object v0, Lcom/daaw/oy0;->c:Lcom/daaw/ww1;

    invoke-virtual {p1}, Landroid/widget/Button;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    :cond_5
    return-void
.end method

.method public L()V
    .locals 3

    sget-object v0, Lcom/daaw/oy0;->c:Lcom/daaw/ww1;

    iget-object v1, p0, Lcom/daaw/dv1;->G:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/dv1;->G:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/dv1;->G:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    iget-object v0, p0, Lcom/daaw/dv1;->G:Landroid/widget/CheckBox;

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    :goto_0
    return-void
.end method

.method public final o()V
    .locals 7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x17

    if-le v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/daaw/dv1;->p:Lcom/daaw/dv1$d;

    iget-object v2, v2, Lcom/daaw/dv1$d;->d:Ljava/util/List;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/daaw/dv1;->u:Landroid/widget/Spinner;

    invoke-virtual {v2}, Landroid/widget/Spinner;->getSelectedItemId()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_1

    iget-object v4, p0, Lcom/daaw/dv1;->p:Lcom/daaw/dv1$d;

    iget-object v4, v4, Lcom/daaw/dv1$d;->d:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    int-to-long v4, v4

    cmp-long v6, v2, v4

    if-gez v6, :cond_1

    iget-object v0, p0, Lcom/daaw/dv1;->p:Lcom/daaw/dv1$d;

    iget-object v0, v0, Lcom/daaw/dv1$d;->d:Ljava/util/List;

    long-to-int v3, v2

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/dx$a;

    invoke-virtual {v0}, Lcom/daaw/dx$a;->a()Ljava/lang/String;

    move-result-object v2

    const-string v3, "video/avc"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v0}, Lcom/daaw/dx$a;->c()Z

    move-result v0

    goto :goto_1

    :cond_1
    move v2, v0

    const/4 v0, 0x0

    :goto_1
    iget-object v3, p0, Lcom/daaw/dv1;->v:Landroid/widget/Spinner;

    invoke-virtual {v3}, Landroid/widget/Spinner;->getSelectedItemId()J

    move-result-wide v3

    long-to-int v4, v3

    const/4 v3, 0x2

    if-ne v4, v3, :cond_2

    if-eqz v0, :cond_3

    :cond_2
    if-lez v4, :cond_4

    if-nez v2, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/daaw/dv1;->v:Landroid/widget/Spinner;

    invoke-virtual {v0, v1, v1}, Landroid/widget/Spinner;->setSelection(IZ)V

    :cond_4
    iget-object v0, p0, Lcom/daaw/dv1;->v:Landroid/widget/Spinner;

    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setEnabled(Z)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroid/app/DialogFragment;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    sget-object p2, Lcom/daaw/dv1;->P:Lcom/daaw/sw1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p0, p1, p3}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, Lcom/daaw/dv1;->S:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/bv1;

    invoke-direct {v0, p0}, Lcom/daaw/bv1;-><init>(Lcom/daaw/dv1;)V

    iget-object v1, p0, Lcom/daaw/dv1;->L:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/dv1;->T:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/av1;

    invoke-direct {v0, p0}, Lcom/daaw/av1;-><init>(Lcom/daaw/dv1;)V

    iget-object v1, p0, Lcom/daaw/dv1;->L:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 5

    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0c0062

    invoke-static {v1, v2, v0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v2, 0x7f09017a

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, p0, Lcom/daaw/dv1;->r:Landroid/view/ViewGroup;

    const v2, 0x7f09008b

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    const v3, 0x7f0400cb

    invoke-static {v2, v3}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setTextColor(I)V

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setSelected(Z)V

    new-instance v4, Lcom/daaw/yu1;

    invoke-direct {v4, p0}, Lcom/daaw/yu1;-><init>(Lcom/daaw/dv1;)V

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f09008c

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    invoke-static {v2, v3}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result v2

    invoke-virtual {v4, v2}, Landroid/widget/Button;->setTextColor(I)V

    new-instance v2, Lcom/daaw/wu1;

    invoke-direct {v2, p0}, Lcom/daaw/wu1;-><init>(Lcom/daaw/dv1;)V

    invoke-virtual {v4, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f090083

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    iput-object v2, p0, Lcom/daaw/dv1;->s:Landroid/widget/Button;

    new-instance v3, Lcom/daaw/xu1;

    invoke-direct {v3, p0}, Lcom/daaw/xu1;-><init>(Lcom/daaw/dv1;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f090101

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    iput-object v2, p0, Lcom/daaw/dv1;->t:Landroid/widget/EditText;

    const v2, 0x7f090264

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    iput-object v2, p0, Lcom/daaw/dv1;->w:Landroid/widget/Spinner;

    const v2, 0x7f090267

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    iput-object v2, p0, Lcom/daaw/dv1;->u:Landroid/widget/Spinner;

    const v2, 0x7f090268

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    iput-object v2, p0, Lcom/daaw/dv1;->v:Landroid/widget/Spinner;

    const v2, 0x7f090106

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    iput-object v2, p0, Lcom/daaw/dv1;->x:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    const v2, 0x7f090104

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    iput-object v2, p0, Lcom/daaw/dv1;->y:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    const v2, 0x7f090103

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    iput-object v2, p0, Lcom/daaw/dv1;->z:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    const v2, 0x7f090100

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    iput-object v2, p0, Lcom/daaw/dv1;->A:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    const v2, 0x7f0900c2

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    iput-object v2, p0, Lcom/daaw/dv1;->B:Landroid/widget/CheckBox;

    const v2, 0x7f0900c0

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    iput-object v2, p0, Lcom/daaw/dv1;->C:Landroid/widget/CheckBox;

    const v2, 0x7f0900c1

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    iput-object v2, p0, Lcom/daaw/dv1;->D:Landroid/widget/CheckBox;

    const v2, 0x7f0900bf

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    iput-object v2, p0, Lcom/daaw/dv1;->E:Landroid/widget/CheckBox;

    const v2, 0x7f0900fd

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    iput-object v2, p0, Lcom/daaw/dv1;->F:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    const v2, 0x7f0900c3

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    iput-object v2, p0, Lcom/daaw/dv1;->G:Landroid/widget/CheckBox;

    new-instance v2, Lcom/daaw/az0;

    invoke-direct {v2}, Lcom/daaw/az0;-><init>()V

    sget-object v3, Lcom/daaw/nc0;->g:Lcom/daaw/vw1;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v3, v4}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/daaw/az0;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/daaw/dv1;->G:Landroid/widget/CheckBox;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setVisibility(I)V

    const v2, 0x7f0902e1

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    const v2, 0x7f090058

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    const v2, 0x7f0900a3

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    iput-object v2, p0, Lcom/daaw/dv1;->H:Landroid/widget/Button;

    const v2, 0x7f090086

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/daaw/dv1;->I:Landroid/widget/Button;

    iget-object v1, p0, Lcom/daaw/dv1;->H:Landroid/widget/Button;

    new-instance v2, Lcom/daaw/zu1;

    invoke-direct {v2, p0}, Lcom/daaw/zu1;-><init>(Lcom/daaw/dv1;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p0, Lcom/daaw/dv1;->I:Landroid/widget/Button;

    new-instance v2, Lcom/daaw/vu1;

    invoke-direct {v2, p0}, Lcom/daaw/vu1;-><init>(Lcom/daaw/dv1;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    sget-object v1, Lcom/daaw/dv1;->R:Lcom/daaw/vw1;

    invoke-virtual {v1, v0}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/dv1$d;

    invoke-virtual {p0, v0}, Lcom/daaw/dv1;->J(Lcom/daaw/dv1$d;)V

    sget-object v0, Lcom/daaw/nc0;->n:Lcom/daaw/ww1;

    new-instance v1, Lcom/daaw/cv1;

    invoke-direct {v1, p0}, Lcom/daaw/cv1;-><init>(Lcom/daaw/dv1;)V

    iget-object v2, p0, Lcom/daaw/dv1;->L:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    return-object p1

    :catch_0
    move-exception p1

    const-string v1, "Dialog inflation error"

    invoke-static {p1, v1}, Lcom/daaw/lz1;->b(Ljava/lang/Exception;Ljava/lang/String;)V

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/daaw/dv1;->S:Lcom/daaw/qw1;

    iget-object v1, p0, Lcom/daaw/dv1;->L:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/daaw/qw1;->c(Ljava/util/List;)V

    sget-object v0, Lcom/daaw/dv1;->T:Lcom/daaw/qw1;

    iget-object v1, p0, Lcom/daaw/dv1;->L:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/daaw/qw1;->c(Ljava/util/List;)V

    iget-object v0, p0, Lcom/daaw/dv1;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/dv1;->r:Landroid/view/ViewGroup;

    invoke-super {p0}, Landroid/app/DialogFragment;->onDestroy()V

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    sget-object p1, Lcom/daaw/dv1;->N:Lcom/daaw/pw1;

    invoke-virtual {p1}, Lcom/daaw/pw1;->a()V

    sget-object p1, Lcom/daaw/dv1;->Q:Lcom/daaw/pw1;

    invoke-virtual {p1}, Lcom/daaw/pw1;->a()V

    return-void
.end method

.method public final q()Lcom/daaw/dv1$d;
    .locals 11

    new-instance v0, Lcom/daaw/dv1$d;

    invoke-direct {v0}, Lcom/daaw/dv1$d;-><init>()V

    new-instance v10, Lcom/daaw/dv1$e;

    iget-object v1, p0, Lcom/daaw/dv1;->x:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/br1;->w(Ljava/lang/String;)I

    move-result v3

    iget-object v1, p0, Lcom/daaw/dv1;->y:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/br1;->w(Ljava/lang/String;)I

    move-result v4

    iget-object v1, p0, Lcom/daaw/dv1;->z:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/br1;->w(Ljava/lang/String;)I

    move-result v5

    iget-object v1, p0, Lcom/daaw/dv1;->A:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/br1;->u(Ljava/lang/String;)F

    move-result v6

    iget-object v1, p0, Lcom/daaw/dv1;->E:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    const/4 v7, 0x2

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    const/4 v7, 0x1

    :goto_0
    iget-object v1, p0, Lcom/daaw/dv1;->F:Lcom/daaw/avee/comp/Common/PrControls/PrEditText;

    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/br1;->u(Ljava/lang/String;)F

    move-result v8

    iget-object v1, p0, Lcom/daaw/dv1;->v:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v9

    const/4 v2, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lcom/daaw/dv1$e;-><init>(IIIIFIFI)V

    iput-object v10, v0, Lcom/daaw/dv1$d;->c:Lcom/daaw/dv1$e;

    iget-object v1, p0, Lcom/daaw/dv1;->p:Lcom/daaw/dv1$d;

    iget-object v1, v1, Lcom/daaw/dv1$d;->d:Ljava/util/List;

    iput-object v1, v0, Lcom/daaw/dv1$d;->d:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/dv1;->u:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v1

    iput v1, v0, Lcom/daaw/dv1$d;->e:I

    iget-object v1, p0, Lcom/daaw/dv1;->s:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/dv1$d;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/dv1;->t:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/dv1$d;->g:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/dv1;->B:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Lcom/daaw/dv1$d;->l:Z

    iget-object v1, p0, Lcom/daaw/dv1;->D:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Lcom/daaw/dv1$d;->h:Z

    iget v1, p0, Lcom/daaw/dv1;->J:I

    iput v1, v0, Lcom/daaw/dv1$d;->i:I

    iget v1, p0, Lcom/daaw/dv1;->K:I

    iput v1, v0, Lcom/daaw/dv1$d;->j:I

    iget-object v1, p0, Lcom/daaw/dv1;->C:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Lcom/daaw/dv1$d;->k:Z

    iget-object v1, p0, Lcom/daaw/dv1;->G:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Lcom/daaw/dv1$d;->m:Z

    return-object v0
.end method

.method public final r(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/dv1;->t()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/dv1;->s:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final s(Lcom/daaw/dv1$f;)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/dv1;->t()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p1, Lcom/daaw/dv1$f;->a:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/dv1;->q:Lcom/daaw/fv1;

    if-nez v0, :cond_1

    invoke-static {}, Lcom/daaw/fv1;->g()Lcom/daaw/fv1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/dv1;->q:Lcom/daaw/fv1;

    :cond_1
    iget-object v0, p0, Lcom/daaw/dv1;->q:Lcom/daaw/fv1;

    invoke-virtual {v0}, Landroid/app/DialogFragment;->isVisible()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/dv1;->q:Lcom/daaw/fv1;

    const-string v2, "progress"

    invoke-virtual {v1, v0, v2}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->hide()V

    iget-object v0, p0, Lcom/daaw/dv1;->q:Lcom/daaw/fv1;

    invoke-virtual {v0, p1}, Lcom/daaw/fv1;->h(Lcom/daaw/dv1$f;)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/daaw/dv1;->q:Lcom/daaw/fv1;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/app/DialogFragment;->isVisible()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/daaw/dv1;->q:Lcom/daaw/fv1;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->dismissAllowingStateLoss()V

    iget-object p1, p0, Lcom/daaw/dv1;->r:Landroid/view/ViewGroup;

    new-instance v0, Lcom/daaw/tu1;

    invoke-direct {v0, p0}, Lcom/daaw/tu1;-><init>(Lcom/daaw/dv1;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    :cond_4
    :goto_0
    return-void
.end method

.method public t()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/dv1;->r:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
