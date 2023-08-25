.class public Lcom/daaw/xd1;
.super Landroid/app/DialogFragment;
.source ""


# static fields
.field public static A:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Lcom/daaw/lo1<",
            "Ljava/util/Date;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public static x:Lcom/daaw/tw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/tw1<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/util/Date;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static y:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Lcom/daaw/ud1;",
            ">;"
        }
    .end annotation
.end field

.field public static z:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public p:Lcom/shawnlin/numberpicker/NumberPicker;

.field public q:Lcom/shawnlin/numberpicker/NumberPicker;

.field public r:Landroid/widget/ImageButton;

.field public s:Landroid/widget/TextView;

.field public t:I

.field public u:Ljava/util/Date;

.field public v:I

.field public w:Ljava/lang/Runnable;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/tw1;

    invoke-direct {v0}, Lcom/daaw/tw1;-><init>()V

    sput-object v0, Lcom/daaw/xd1;->x:Lcom/daaw/tw1;

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/xd1;->y:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/xd1;->z:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/xd1;->A:Lcom/daaw/vw1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/xd1;->t:I

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lcom/daaw/xd1;->u:Ljava/util/Date;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/xd1;)Ljava/util/Date;
    .locals 0

    iget-object p0, p0, Lcom/daaw/xd1;->u:Ljava/util/Date;

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/xd1;I)I
    .locals 0

    iput p1, p0, Lcom/daaw/xd1;->t:I

    return p1
.end method

.method public static synthetic c(Lcom/daaw/xd1;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/daaw/xd1;->w:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static synthetic d(Lcom/daaw/xd1;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/daaw/xd1;->s:Landroid/widget/TextView;

    return-object p0
.end method

.method public static g(Lcom/daaw/al;)Lcom/daaw/xd1;
    .locals 2

    new-instance v0, Lcom/daaw/xd1;

    invoke-direct {v0}, Lcom/daaw/xd1;-><init>()V

    const-string v1, "SleepTimerDialog"

    invoke-static {v0, v1, p0}, Lcom/daaw/gr1;->x(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/al;)V

    return-object v0
.end method


# virtual methods
.method public e(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/xd1;->f(ZZ)V

    return-void
.end method

.method public f(ZZ)V
    .locals 5

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/xd1;->q:Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-virtual {v2}, Lcom/shawnlin/numberpicker/NumberPicker;->getValue()I

    move-result v2

    const/16 v3, 0xb

    invoke-virtual {v1, v3, v2}, Ljava/util/Calendar;->set(II)V

    iget-object v2, p0, Lcom/daaw/xd1;->p:Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-virtual {v2}, Lcom/shawnlin/numberpicker/NumberPicker;->getValue()I

    move-result v2

    const/16 v4, 0xc

    invoke-virtual {v1, v4, v2}, Ljava/util/Calendar;->set(II)V

    const/16 v2, 0xd

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x18

    invoke-virtual {v1, v3, v0}, Ljava/util/Calendar;->add(II)V

    :cond_0
    new-instance v0, Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/daaw/xd1;->u:Ljava/util/Date;

    if-nez p2, :cond_1

    sget-object p2, Lcom/daaw/xd1;->x:Lcom/daaw/tw1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/xd1;->h()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/xd1;->u:Ljava/util/Date;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, p1, v0, v1, v2}, Lcom/daaw/tw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public h()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/xd1;->p:Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-virtual {v0}, Lcom/shawnlin/numberpicker/NumberPicker;->getValue()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/xd1;->q:Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-virtual {v1}, Lcom/shawnlin/numberpicker/NumberPicker;->getValue()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3c

    add-int/2addr v0, v1

    return v0
.end method

.method public i()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/xd1;->s:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/daaw/xd1;->s:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f1000bd

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/daaw/xd1;->t:I

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/daaw/br1;->n(IZ)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 5

    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0c0067

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f1000bb

    invoke-virtual {p1, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f0901eb

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shawnlin/numberpicker/NumberPicker;

    iput-object v1, p0, Lcom/daaw/xd1;->p:Lcom/shawnlin/numberpicker/NumberPicker;

    const v1, 0x7f0901ea

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shawnlin/numberpicker/NumberPicker;

    iput-object v1, p0, Lcom/daaw/xd1;->q:Lcom/shawnlin/numberpicker/NumberPicker;

    iput-object v2, p0, Lcom/daaw/xd1;->r:Landroid/widget/ImageButton;

    const v1, 0x7f0902f6

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/xd1;->s:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v0

    iput v0, p0, Lcom/daaw/xd1;->v:I

    sget-object v0, Lcom/daaw/xd1;->A:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v3, v4}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/lo1;

    iget-object v0, v0, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    iput-object v0, p0, Lcom/daaw/xd1;->u:Ljava/util/Date;

    new-instance v0, Lcom/daaw/xd1$a;

    invoke-direct {v0, p0}, Lcom/daaw/xd1$a;-><init>(Lcom/daaw/xd1;)V

    iput-object v0, p0, Lcom/daaw/xd1;->w:Ljava/lang/Runnable;

    sget-object v0, Lcom/daaw/xd1;->y:Lcom/daaw/vw1;

    invoke-virtual {v0, v2}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ud1;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/ud1;

    invoke-direct {v0}, Lcom/daaw/ud1;-><init>()V

    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/xd1;->u:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/16 v2, 0xc

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iget-object v2, p0, Lcom/daaw/xd1;->p:Lcom/shawnlin/numberpicker/NumberPicker;

    const/16 v3, 0x3b

    invoke-virtual {v2, v3}, Lcom/shawnlin/numberpicker/NumberPicker;->setMaxValue(I)V

    iget-object v2, p0, Lcom/daaw/xd1;->p:Lcom/shawnlin/numberpicker/NumberPicker;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/shawnlin/numberpicker/NumberPicker;->setMinValue(I)V

    iget-object v2, p0, Lcom/daaw/xd1;->p:Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-virtual {v2, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->setValue(I)V

    iget-object v0, p0, Lcom/daaw/xd1;->q:Lcom/shawnlin/numberpicker/NumberPicker;

    const/16 v2, 0x17

    invoke-virtual {v0, v2}, Lcom/shawnlin/numberpicker/NumberPicker;->setMaxValue(I)V

    iget-object v0, p0, Lcom/daaw/xd1;->q:Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-virtual {v0, v3}, Lcom/shawnlin/numberpicker/NumberPicker;->setMinValue(I)V

    iget-object v0, p0, Lcom/daaw/xd1;->q:Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setValue(I)V

    iget-object v0, p0, Lcom/daaw/xd1;->q:Lcom/shawnlin/numberpicker/NumberPicker;

    iget v1, p0, Lcom/daaw/xd1;->v:I

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setDividerColor(I)V

    iget-object v0, p0, Lcom/daaw/xd1;->p:Lcom/shawnlin/numberpicker/NumberPicker;

    iget v1, p0, Lcom/daaw/xd1;->v:I

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setDividerColor(I)V

    iget-object v0, p0, Lcom/daaw/xd1;->q:Lcom/shawnlin/numberpicker/NumberPicker;

    iget v1, p0, Lcom/daaw/xd1;->v:I

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setSelectedTextColor(I)V

    iget-object v0, p0, Lcom/daaw/xd1;->p:Lcom/shawnlin/numberpicker/NumberPicker;

    iget v1, p0, Lcom/daaw/xd1;->v:I

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setSelectedTextColor(I)V

    iget-object v0, p0, Lcom/daaw/xd1;->q:Lcom/shawnlin/numberpicker/NumberPicker;

    iget v1, p0, Lcom/daaw/xd1;->v:I

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setTextColor(I)V

    iget-object v0, p0, Lcom/daaw/xd1;->p:Lcom/shawnlin/numberpicker/NumberPicker;

    iget v1, p0, Lcom/daaw/xd1;->v:I

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setTextColor(I)V

    iget-object v0, p0, Lcom/daaw/xd1;->p:Lcom/shawnlin/numberpicker/NumberPicker;

    new-instance v1, Lcom/daaw/xd1$b;

    invoke-direct {v1, p0}, Lcom/daaw/xd1$b;-><init>(Lcom/daaw/xd1;)V

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setOnValueChangedListener(Lcom/shawnlin/numberpicker/NumberPicker$e;)V

    iget-object v0, p0, Lcom/daaw/xd1;->q:Lcom/shawnlin/numberpicker/NumberPicker;

    new-instance v1, Lcom/daaw/xd1$c;

    invoke-direct {v1, p0}, Lcom/daaw/xd1$c;-><init>(Lcom/daaw/xd1;)V

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setOnValueChangedListener(Lcom/shawnlin/numberpicker/NumberPicker$e;)V

    const v0, 0x7f1000ba

    new-instance v1, Lcom/daaw/xd1$d;

    invoke-direct {v1, p0}, Lcom/daaw/xd1$d;-><init>(Lcom/daaw/xd1;)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const v0, 0x7f1000a7

    new-instance v1, Lcom/daaw/xd1$e;

    invoke-direct {v1, p0}, Lcom/daaw/xd1$e;-><init>(Lcom/daaw/xd1;)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lcom/daaw/xd1;->s:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/daaw/xd1;->w:Ljava/lang/Runnable;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/TextView;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method
