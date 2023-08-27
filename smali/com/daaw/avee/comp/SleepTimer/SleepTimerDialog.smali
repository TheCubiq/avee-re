.class public Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;
.super Landroid/app/DialogFragment;
.source "SleepTimerDialog.java"


# static fields
.field public static onSleepTimerUIRequestRemainingSeconds:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onSleepTimerUIRequestSleepAtTime:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/util/Date;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onSleepTimerUIRequestSleepTimerConfig:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;",
            ">;"
        }
    .end annotation
.end field

.field public static onSleepTimerUISubmit:Lcom/daaw/avee/Common/Events/WeakEvent4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent4<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/util/Date;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private btnToggle:Landroid/widget/ImageButton;

.field private colorOn:I

.field private nrH:Lcom/shawnlin/numberpicker/NumberPicker;

.field private nrM:Lcom/shawnlin/numberpicker/NumberPicker;

.field private secondsRemaining:I

.field private sleepAtTime:Ljava/util/Date;

.field private timerTask:Ljava/lang/Runnable;

.field private txtStatus:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent4;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent4;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->onSleepTimerUISubmit:Lcom/daaw/avee/Common/Events/WeakEvent4;

    .line 35
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->onSleepTimerUIRequestSleepTimerConfig:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 36
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->onSleepTimerUIRequestRemainingSeconds:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 37
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->onSleepTimerUIRequestSleepAtTime:Lcom/daaw/avee/Common/Events/WeakEventR;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->secondsRemaining:I

    .line 47
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->sleepAtTime:Ljava/util/Date;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;)Ljava/util/Date;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->sleepAtTime:Ljava/util/Date;

    return-object p0
.end method

.method static synthetic access$102(Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;I)I
    .locals 0

    .line 32
    iput p1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->secondsRemaining:I

    return p1
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;)Ljava/lang/Runnable;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->timerTask:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;)Landroid/widget/TextView;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->txtStatus:Landroid/widget/TextView;

    return-object p0
.end method

.method public static createAndShowSleepTimerDialog(Lcom/daaw/avee/ContextData;)Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;
    .locals 2

    .line 53
    new-instance v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;

    invoke-direct {v0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;-><init>()V

    const-string v1, "SleepTimerDialog"

    .line 54
    invoke-static {v0, v1, p0}, Lcom/daaw/avee/Common/UtilsUI;->showDialogSafe(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/avee/ContextData;)V

    return-object v0
.end method


# virtual methods
.method configure(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 219
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->configure(ZZ)V

    return-void
.end method

.method configure(ZZ)V
    .locals 5

    .line 225
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 227
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 228
    iget-object v2, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrH:Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-virtual {v2}, Lcom/shawnlin/numberpicker/NumberPicker;->getValue()I

    move-result v2

    const/16 v3, 0xb

    invoke-virtual {v1, v3, v2}, Ljava/util/Calendar;->set(II)V

    .line 229
    iget-object v2, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrM:Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-virtual {v2}, Lcom/shawnlin/numberpicker/NumberPicker;->getValue()I

    move-result v2

    const/16 v4, 0xc

    invoke-virtual {v1, v4, v2}, Ljava/util/Calendar;->set(II)V

    const/4 v2, 0x0

    const/16 v4, 0xd

    .line 230
    invoke-virtual {v1, v4, v2}, Ljava/util/Calendar;->set(II)V

    .line 232
    invoke-virtual {v1, v0}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x18

    .line 233
    invoke-virtual {v1, v3, v0}, Ljava/util/Calendar;->add(II)V

    .line 235
    :cond_0
    new-instance v0, Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    invoke-direct {v0, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 238
    iput-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->sleepAtTime:Ljava/util/Date;

    if-nez p2, :cond_1

    .line 240
    sget-object p2, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->onSleepTimerUISubmit:Lcom/daaw/avee/Common/Events/WeakEvent4;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->getMinutes()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->sleepAtTime:Ljava/util/Date;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p2, p1, v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method getMinutes()I
    .locals 2

    .line 192
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrM:Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-virtual {v0}, Lcom/shawnlin/numberpicker/NumberPicker;->getValue()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrH:Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-virtual {v1}, Lcom/shawnlin/numberpicker/NumberPicker;->getValue()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3c

    add-int/2addr v0, v1

    return v0
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 6

    .line 60
    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 62
    invoke-virtual {p0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x7f0c0064

    invoke-static {v0, v2, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 63
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v2, 0x7f10005c

    .line 69
    invoke-virtual {p1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    const v2, 0x7f090179

    .line 74
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shawnlin/numberpicker/NumberPicker;

    iput-object v2, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrM:Lcom/shawnlin/numberpicker/NumberPicker;

    const v2, 0x7f090178

    .line 75
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shawnlin/numberpicker/NumberPicker;

    iput-object v2, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrH:Lcom/shawnlin/numberpicker/NumberPicker;

    .line 76
    iput-object v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->btnToggle:Landroid/widget/ImageButton;

    const v2, 0x7f090256

    .line 77
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->txtStatus:Landroid/widget/TextView;

    .line 79
    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->colorOn:I

    .line 81
    sget-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->onSleepTimerUIRequestSleepAtTime:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v2, Lcom/daaw/avee/Common/Tuple2;

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-direct {v2, v3, v5}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/Common/Tuple2;

    .line 82
    iget-object v0, v0, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    iput-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->sleepAtTime:Ljava/util/Date;

    .line 84
    new-instance v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$1;-><init>(Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->timerTask:Ljava/lang/Runnable;

    .line 100
    sget-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->onSleepTimerUIRequestSleepTimerConfig:Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;

    if-nez v0, :cond_0

    .line 103
    new-instance v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;

    invoke-direct {v0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;-><init>()V

    .line 122
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 123
    iget-object v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->sleepAtTime:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/16 v1, 0xb

    .line 124
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/16 v2, 0xc

    .line 125
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 128
    iget-object v2, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrM:Lcom/shawnlin/numberpicker/NumberPicker;

    const/16 v3, 0x3b

    invoke-virtual {v2, v3}, Lcom/shawnlin/numberpicker/NumberPicker;->setMaxValue(I)V

    .line 129
    iget-object v2, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrM:Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-virtual {v2, v4}, Lcom/shawnlin/numberpicker/NumberPicker;->setMinValue(I)V

    .line 130
    iget-object v2, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrM:Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-virtual {v2, v0}, Lcom/shawnlin/numberpicker/NumberPicker;->setValue(I)V

    .line 132
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrH:Lcom/shawnlin/numberpicker/NumberPicker;

    const/16 v2, 0x17

    invoke-virtual {v0, v2}, Lcom/shawnlin/numberpicker/NumberPicker;->setMaxValue(I)V

    .line 133
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrH:Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-virtual {v0, v4}, Lcom/shawnlin/numberpicker/NumberPicker;->setMinValue(I)V

    .line 134
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrH:Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setValue(I)V

    .line 136
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrH:Lcom/shawnlin/numberpicker/NumberPicker;

    iget v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->colorOn:I

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setDividerColor(I)V

    .line 137
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrM:Lcom/shawnlin/numberpicker/NumberPicker;

    iget v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->colorOn:I

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setDividerColor(I)V

    .line 139
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrH:Lcom/shawnlin/numberpicker/NumberPicker;

    iget v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->colorOn:I

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setSelectedTextColor(I)V

    .line 140
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrM:Lcom/shawnlin/numberpicker/NumberPicker;

    iget v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->colorOn:I

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setSelectedTextColor(I)V

    .line 142
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrH:Lcom/shawnlin/numberpicker/NumberPicker;

    iget v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->colorOn:I

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setTextColor(I)V

    .line 143
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrM:Lcom/shawnlin/numberpicker/NumberPicker;

    iget v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->colorOn:I

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setTextColor(I)V

    .line 158
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrM:Lcom/shawnlin/numberpicker/NumberPicker;

    new-instance v1, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$2;-><init>(Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;)V

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setOnValueChangedListener(Lcom/shawnlin/numberpicker/NumberPicker$OnValueChangeListener;)V

    .line 164
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->nrH:Lcom/shawnlin/numberpicker/NumberPicker;

    new-instance v1, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$3;-><init>(Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;)V

    invoke-virtual {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->setOnValueChangedListener(Lcom/shawnlin/numberpicker/NumberPicker$OnValueChangeListener;)V

    const v0, 0x7f10005b

    .line 172
    new-instance v1, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$4;-><init>(Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const v0, 0x7f100045

    .line 179
    new-instance v1, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog$5;-><init>(Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 186
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->txtStatus:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->timerTask:Ljava/lang/Runnable;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/TextView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 188
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method

.method updateTxt()V
    .locals 4

    .line 212
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->txtStatus:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->txtStatus:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f100064

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerDialog;->secondsRemaining:I

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/daaw/avee/Common/Utils;->getDurationStringHHMMSS(IZ)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
