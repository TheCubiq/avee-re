.class public Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;
.super Landroid/app/DialogFragment;
.source "EqualizerDialog.java"


# static fields
.field public static onReceiveEqualizerDescChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestEqualizerDesc:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;",
            ">;"
        }
    .end annotation
.end field

.field public static onSubmitEqualizerSettings:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;",
            "Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;",
            ">;"
        }
    .end annotation
.end field

.field private static seekArcMax:I


# instance fields
.field private bandBarMax:I

.field private bandSeekBars:[Lcom/daaw/avee/Common/VerticalSeekBar;

.field private bandTexts:[Landroid/widget/TextView;

.field private bassValue:F

.field private currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

.field private equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

.field private linearLayoutBars:Landroid/view/ViewGroup;

.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private preventSettingsUpdate:Z

.field private scrollView1:Landroid/widget/ScrollView;

.field private scrollView2:Landroid/widget/HorizontalScrollView;

.field private seekArcBass:Lcom/triggertrap/seekarc/SeekArc;

.field private seekArcTreble:Lcom/triggertrap/seekarc/SeekArc;

.field seekBarTouch:Landroid/view/View$OnTouchListener;

.field private seekBarVirtualizer:Landroid/widget/SeekBar;

.field private spinnerPresets:Landroid/widget/Spinner;

.field private spinnerPresetsEventFromUser:Z

.field private switchEnable:Landroidx/appcompat/widget/SwitchCompat;

.field private textBass:Landroid/widget/TextView;

.field private textTreble:Landroid/widget/TextView;

.field private trebleValue:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 40
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->onReceiveEqualizerDescChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 42
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->onSubmitEqualizerSettings:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 43
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->onRequestEqualizerDesc:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/16 v0, 0x1e

    .line 60
    sput v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekArcMax:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 38
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    .line 45
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->listenerRefHolder:Ljava/util/List;

    const/4 v0, 0x0

    .line 59
    iput-boolean v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->spinnerPresetsEventFromUser:Z

    const/4 v1, 0x0

    .line 61
    iput-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    const/16 v1, 0x1e

    .line 62
    iput v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandBarMax:I

    .line 64
    sget-object v1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->empty:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    invoke-static {v1}, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->clone(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    .line 68
    iput-boolean v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->preventSettingsUpdate:Z

    .line 70
    new-instance v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$1;-><init>(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekBarTouch:Landroid/view/View$OnTouchListener;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)Landroid/widget/ScrollView;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->scrollView1:Landroid/widget/ScrollView;

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)Landroid/widget/HorizontalScrollView;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->scrollView2:Landroid/widget/HorizontalScrollView;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)I
    .locals 0

    .line 38
    iget p0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandBarMax:I

    return p0
.end method

.method static synthetic access$1300(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;IIZ)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->setBandProgress(IIZ)V

    return-void
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->onSettingsChanged()V

    return-void
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)Landroid/widget/Spinner;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->spinnerPresets:Landroid/widget/Spinner;

    return-object p0
.end method

.method static synthetic access$400(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)F
    .locals 0

    .line 38
    iget p0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bassValue:F

    return p0
.end method

.method static synthetic access$402(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;F)F
    .locals 0

    .line 38
    iput p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bassValue:F

    return p1
.end method

.method static synthetic access$500()I
    .locals 1

    .line 38
    sget v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekArcMax:I

    return v0
.end method

.method static synthetic access$600(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)F
    .locals 0

    .line 38
    iget p0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->trebleValue:F

    return p0
.end method

.method static synthetic access$602(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;F)F
    .locals 0

    .line 38
    iput p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->trebleValue:F

    return p1
.end method

.method static synthetic access$700(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;FFZZ)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->onBassTrebleChanged(FFZZ)V

    return-void
.end method

.method static synthetic access$800(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;FZ)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->onVirtualizerValueChanged(FZ)V

    return-void
.end method

.method static synthetic access$900(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->updateEqualizerDesc(Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;)V

    return-void
.end method

.method public static createAndShowEqualizerDialog(Lcom/daaw/avee/ContextData;)Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;
    .locals 2

    .line 89
    new-instance v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-direct {v0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;-><init>()V

    const-string v1, "EqualizerDialog"

    .line 90
    invoke-static {v0, v1, p0}, Lcom/daaw/avee/Common/UtilsUI;->showDialogSafe(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/avee/ContextData;)V

    return-object v0
.end method

.method static formatFreqHz(F)Ljava/lang/String;
    .locals 1

    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float p0, p0, v0

    float-to-int p0, p0

    .line 487
    invoke-static {p0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->formatFreqHz(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static formatFreqHz(I)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/16 v2, 0x3e8

    if-ge p0, v2, :cond_0

    .line 480
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

    .line 481
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

    .line 482
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

.method private onBassTrebleChanged(FFZZ)V
    .locals 10

    .line 387
    iput p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bassValue:F

    .line 388
    iput p2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->trebleValue:F

    if-nez p3, :cond_0

    .line 392
    iget-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekArcBass:Lcom/triggertrap/seekarc/SeekArc;

    sget v1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekArcMax:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    mul-float v1, v1, p1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    sget v2, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekArcMax:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/triggertrap/seekarc/SeekArc;->setProgress(I)V

    .line 393
    iget-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekArcTreble:Lcom/triggertrap/seekarc/SeekArc;

    sget v1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekArcMax:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    mul-float v1, v1, p2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    sget v2, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekArcMax:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/triggertrap/seekarc/SeekArc;->setProgress(I)V

    .line 397
    :cond_0
    sget v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekArcMax:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    mul-float v0, v0, p1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 398
    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->textBass:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f0e0001

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/Object;

    .line 399
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    .line 398
    invoke-virtual {v2, v5, v0, v7}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 403
    sget v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekArcMax:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    mul-float v0, v0, p2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 404
    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->textTreble:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f0e0003

    new-array v6, v6, [Ljava/lang/Object;

    .line 405
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v9

    .line 404
    invoke-virtual {v2, v5, v0, v6}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 408
    iget-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iget-object v0, v0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v0, v0

    new-array v7, v0, [F

    .line 409
    iget-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iget-object v0, v0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v0, v0

    new-array v6, v0, [F

    :goto_0
    if-ge v9, v0, :cond_1

    .line 411
    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iget-object v1, v1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    aget-object v1, v1, v9

    iget v1, v1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->freq:F

    aput v1, v6, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_1
    if-eqz p4, :cond_2

    .line 414
    iget-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    iget-object v1, v1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->bassBoost:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iget-object v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    iget-object v2, v2, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->trebleBoost:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    move v3, p1

    move v4, p2

    move-object v5, v7

    invoke-static/range {v0 .. v6}, Lcom/daaw/avee/comp/EqualizerUI/Equalization;->getEqBandsBassTrebleControl(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;Lcom/daaw/avee/comp/EqualizerUI/EQPreset;Lcom/daaw/avee/comp/EqualizerUI/EQPreset;FF[F[F)V

    .line 422
    invoke-direct {p0, v7}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->setBandProgress([F)V

    :cond_2
    return-void
.end method

.method private onSettingsChanged()V
    .locals 4

    .line 428
    iget-boolean v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->preventSettingsUpdate:Z

    if-eqz v0, :cond_0

    return-void

    .line 429
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandSeekBars:[Lcom/daaw/avee/Common/VerticalSeekBar;

    if-nez v0, :cond_1

    return-void

    .line 430
    :cond_1
    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    if-nez v1, :cond_2

    return-void

    .line 432
    :cond_2
    array-length v0, v0

    iget-object v1, v1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iget-object v1, v1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v1, v1

    if-eq v0, v1, :cond_3

    const-string v0, "equalizerUIDesc bands count doesnt match "

    .line 433
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-void

    .line 436
    :cond_3
    new-instance v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;

    invoke-direct {v0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;-><init>()V

    .line 438
    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->switchEnable:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v1}, Landroidx/appcompat/widget/SwitchCompat;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->enabled:Z

    .line 439
    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->spinnerPresets:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->presetIndex:I

    .line 440
    new-instance v1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iget-object v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandSeekBars:[Lcom/daaw/avee/Common/VerticalSeekBar;

    array-length v2, v2

    const-string v3, "Default"

    invoke-direct {v1, v3, v2}, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;-><init>(Ljava/lang/String;I)V

    iput-object v1, v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->bandsFinal:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    .line 441
    iget v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bassValue:F

    iput v1, v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->bassValue:F

    .line 442
    iget v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->trebleValue:F

    iput v1, v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->trebleValue:F

    .line 443
    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iput-object v1, v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    .line 444
    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekBarVirtualizer:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekBarVirtualizer:Landroid/widget/SeekBar;

    invoke-virtual {v2}, Landroid/widget/SeekBar;->getMax()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    iput v1, v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->virtualizerStrength:F

    .line 446
    iget-object v1, v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->bandsFinal:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->setEqPresetFromBandBars(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;)V

    .line 448
    sget-object v1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->onSubmitEqualizerSettings:Lcom/daaw/avee/Common/Events/WeakEvent2;

    iget-object v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private onVirtualizerValueChanged(FZ)V
    .locals 1

    if-nez p2, :cond_0

    .line 468
    iget-object p2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekBarVirtualizer:Landroid/widget/SeekBar;

    const/high16 v0, 0x42c80000    # 100.0f

    mul-float p1, p1, v0

    float-to-int p1, p1

    invoke-virtual {p2, p1}, Landroid/widget/SeekBar;->setProgress(I)V

    :cond_0
    return-void
.end method

.method private setBandProgress(IIZ)V
    .locals 2

    .line 374
    iget v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandBarMax:I

    div-int/lit8 v1, v0, 0x2

    neg-int v1, v1

    div-int/lit8 v0, v0, 0x2

    invoke-static {p2, v1, v0}, Lcom/daaw/avee/Common/Utils;->ensureRange(III)I

    move-result p2

    if-nez p3, :cond_0

    .line 377
    iget p3, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandBarMax:I

    div-int/lit8 p3, p3, 0x2

    add-int/2addr p3, p2

    .line 378
    iget-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandSeekBars:[Lcom/daaw/avee/Common/VerticalSeekBar;

    aget-object v0, v0, p1

    invoke-virtual {v0, p3}, Lcom/daaw/avee/Common/VerticalSeekBar;->setProgress(I)V

    .line 379
    iget-object p3, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandSeekBars:[Lcom/daaw/avee/Common/VerticalSeekBar;

    aget-object p3, p3, p1

    invoke-virtual {p3}, Lcom/daaw/avee/Common/VerticalSeekBar;->updateThumb()V

    .line 382
    :cond_0
    iget-object p3, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandTexts:[Landroid/widget/TextView;

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

.method private setBandProgress(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;)V
    .locals 4

    .line 364
    iget-object v0, p1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v0, v0

    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandSeekBars:[Lcom/daaw/avee/Common/VerticalSeekBar;

    array-length v1, v1

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 366
    :goto_0
    iget-object v2, p1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v2, v2

    if-ge v1, v2, :cond_1

    .line 367
    iget v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandBarMax:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    iget-object v3, p1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    aget-object v3, v3, v1

    iget v3, v3, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->value:F

    mul-float v2, v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 368
    invoke-direct {p0, v1, v2, v0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->setBandProgress(IIZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private setBandProgress([F)V
    .locals 4

    .line 354
    array-length v0, p1

    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandSeekBars:[Lcom/daaw/avee/Common/VerticalSeekBar;

    array-length v1, v1

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 356
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 358
    iget v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandBarMax:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    aget v3, p1, v1

    mul-float v2, v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 359
    invoke-direct {p0, v1, v2, v0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->setBandProgress(IIZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private updateEqualizerDesc(Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;)V
    .locals 7

    .line 240
    invoke-virtual {p0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 241
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x1

    .line 243
    iput-boolean v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->preventSettingsUpdate:Z

    if-nez p1, :cond_2

    .line 246
    sget-object p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->empty:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    .line 247
    :cond_2
    iput-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    .line 249
    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->switchEnable:Landroidx/appcompat/widget/SwitchCompat;

    iget-boolean p1, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->enabled:Z

    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 251
    iget-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    iget-object p1, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    invoke-static {p1}, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->clone(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    .line 253
    iget-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    iget-object p1, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iget-object p1, p1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length p1, p1

    .line 255
    iget v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandBarMax:I

    rem-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_3

    add-int/2addr v1, v0

    .line 256
    iput v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandBarMax:I

    :cond_3
    const/4 v1, 0x0

    .line 260
    iput-boolean v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->spinnerPresetsEventFromUser:Z

    .line 262
    iget-object v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    iget-object v2, v2, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->presets:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    array-length v2, v2

    add-int/2addr v2, v0

    new-array v3, v2, [Ljava/lang/String;

    .line 263
    invoke-virtual {p0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f100027

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    const/4 v4, 0x0

    .line 264
    :goto_0
    iget-object v5, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    iget-object v5, v5, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->presets:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    array-length v5, v5

    if-ge v4, v5, :cond_4

    add-int/lit8 v5, v4, 0x1

    .line 265
    iget-object v6, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    iget-object v6, v6, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->presets:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    aget-object v4, v6, v4

    iget-object v4, v4, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->name:Ljava/lang/String;

    aput-object v4, v3, v5

    move v4, v5

    goto :goto_0

    .line 267
    :cond_4
    new-instance v4, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v5

    const v6, 0x1090008

    invoke-direct {v4, v5, v6, v3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 269
    iget-object v3, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->spinnerPresets:Landroid/widget/Spinner;

    invoke-virtual {v3, v4}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 271
    iget-object v3, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    iget v3, v3, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->currentPreset:I

    if-ltz v3, :cond_5

    iget-object v3, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    iget v3, v3, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->currentPreset:I

    add-int/2addr v3, v0

    goto :goto_1

    :cond_5
    const/4 v3, 0x0

    :goto_1
    if-ltz v3, :cond_6

    if-lt v3, v2, :cond_7

    :cond_6
    const/4 v3, 0x0

    .line 274
    :cond_7
    iget-object v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->spinnerPresets:Landroid/widget/Spinner;

    invoke-virtual {v2, v3, v1}, Landroid/widget/Spinner;->setSelection(IZ)V

    .line 275
    iget-object v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->spinnerPresets:Landroid/widget/Spinner;

    new-instance v3, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$7;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$7;-><init>(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)V

    invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 296
    iput-boolean v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->spinnerPresetsEventFromUser:Z

    .line 304
    new-array v2, p1, [Lcom/daaw/avee/Common/VerticalSeekBar;

    iput-object v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandSeekBars:[Lcom/daaw/avee/Common/VerticalSeekBar;

    .line 305
    new-array v2, p1, [Landroid/widget/TextView;

    iput-object v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandTexts:[Landroid/widget/TextView;

    .line 307
    iget-object v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->linearLayoutBars:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    const/4 v2, 0x0

    :goto_2
    if-ge v2, p1, :cond_8

    .line 310
    invoke-virtual {p0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f0c0060

    const/4 v5, 0x0

    invoke-static {v3, v4, v5}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 311
    iget-object v4, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandSeekBars:[Lcom/daaw/avee/Common/VerticalSeekBar;

    const v5, 0x7f0901c7

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/daaw/avee/Common/VerticalSeekBar;

    aput-object v5, v4, v2

    .line 312
    iget-object v4, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandTexts:[Landroid/widget/TextView;

    const v5, 0x7f090232

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    aput-object v5, v4, v2

    const v4, 0x7f090231

    .line 313
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 314
    iget-object v5, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    iget-object v5, v5, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iget-object v5, v5, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    aget-object v5, v5, v2

    iget v5, v5, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->freq:F

    invoke-static {v5}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->formatFreqHz(F)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 316
    iget-object v4, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandSeekBars:[Lcom/daaw/avee/Common/VerticalSeekBar;

    aget-object v4, v4, v2

    iget v5, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandBarMax:I

    invoke-virtual {v4, v5}, Lcom/daaw/avee/Common/VerticalSeekBar;->setMax(I)V

    .line 318
    iget-object v4, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandSeekBars:[Lcom/daaw/avee/Common/VerticalSeekBar;

    aget-object v4, v4, v2

    iget-object v5, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekBarTouch:Landroid/view/View$OnTouchListener;

    invoke-virtual {v4, v5}, Lcom/daaw/avee/Common/VerticalSeekBar;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 319
    iget-object v4, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandSeekBars:[Lcom/daaw/avee/Common/VerticalSeekBar;

    aget-object v4, v4, v2

    new-instance v5, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$8;

    invoke-direct {v5, p0, v2}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$8;-><init>(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;I)V

    invoke-virtual {v4, v5}, Lcom/daaw/avee/Common/VerticalSeekBar;->setOnSeekBarChangeFromUserListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 343
    iget-object v4, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->linearLayoutBars:Landroid/view/ViewGroup;

    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 346
    :cond_8
    iget-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    iget p1, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->bassBoostValue:F

    iget-object v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    iget v2, v2, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->trebleBoostValue:F

    invoke-direct {p0, p1, v2, v1, v0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->onBassTrebleChanged(FFZZ)V

    .line 347
    iget-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    iget p1, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->virtualizerStrength:F

    invoke-direct {p0, p1, v1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->onVirtualizerValueChanged(FZ)V

    .line 350
    iput-boolean v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->preventSettingsUpdate:Z

    return-void
.end method


# virtual methods
.method isViewCreated()Z
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->switchEnable:Landroidx/appcompat/widget/SwitchCompat;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 219
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 221
    sget-object p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->onReceiveEqualizerDescChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$6;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$6;-><init>(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)V

    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .line 117
    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 119
    invoke-virtual {p0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0c005f

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 120
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f0901ef

    .line 122
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/SwitchCompat;

    iput-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->switchEnable:Landroidx/appcompat/widget/SwitchCompat;

    .line 123
    new-instance v2, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$2;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$2;-><init>(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)V

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/SwitchCompat;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v1, 0x7f0901db

    .line 130
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Spinner;

    iput-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->spinnerPresets:Landroid/widget/Spinner;

    const v1, 0x7f0901ae

    .line 131
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ScrollView;

    iput-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->scrollView1:Landroid/widget/ScrollView;

    const v1, 0x7f0901af

    .line 132
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/HorizontalScrollView;

    iput-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->scrollView2:Landroid/widget/HorizontalScrollView;

    const v1, 0x7f09013b

    .line 133
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->linearLayoutBars:Landroid/view/ViewGroup;

    const v1, 0x7f090207

    .line 135
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->textBass:Landroid/widget/TextView;

    const v1, 0x7f0901bf

    .line 136
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/triggertrap/seekarc/SeekArc;

    iput-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekArcBass:Lcom/triggertrap/seekarc/SeekArc;

    .line 137
    iget-object v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekBarTouch:Landroid/view/View$OnTouchListener;

    invoke-virtual {v1, v2}, Lcom/triggertrap/seekarc/SeekArc;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 138
    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekArcBass:Lcom/triggertrap/seekarc/SeekArc;

    new-instance v2, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$3;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$3;-><init>(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)V

    invoke-virtual {v1, v2}, Lcom/triggertrap/seekarc/SeekArc;->setOnSeekArcChangeListener(Lcom/triggertrap/seekarc/SeekArc$OnSeekArcChangeListener;)V

    const v1, 0x7f09020e

    .line 160
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->textTreble:Landroid/widget/TextView;

    const v1, 0x7f0901c0

    .line 161
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/triggertrap/seekarc/SeekArc;

    iput-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekArcTreble:Lcom/triggertrap/seekarc/SeekArc;

    .line 162
    iget-object v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekBarTouch:Landroid/view/View$OnTouchListener;

    invoke-virtual {v1, v2}, Lcom/triggertrap/seekarc/SeekArc;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 163
    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekArcTreble:Lcom/triggertrap/seekarc/SeekArc;

    new-instance v2, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$4;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$4;-><init>(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)V

    invoke-virtual {v1, v2}, Lcom/triggertrap/seekarc/SeekArc;->setOnSeekArcChangeListener(Lcom/triggertrap/seekarc/SeekArc$OnSeekArcChangeListener;)V

    const v1, 0x7f0901c6

    .line 186
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekBarVirtualizer:Landroid/widget/SeekBar;

    const/16 v1, 0x64

    .line 187
    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 188
    iget-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekBarVirtualizer:Landroid/widget/SeekBar;

    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekBarTouch:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 189
    iget-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->seekBarVirtualizer:Landroid/widget/SeekBar;

    new-instance v1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$5;-><init>(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 207
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    const/4 v0, 0x1

    .line 209
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 210
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 232
    sget-object v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->onReceiveEqualizerDescChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->unSubscribeWeak(Ljava/util/List;)V

    .line 233
    iget-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->listenerRefHolder:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 235
    invoke-super {p0}, Landroid/app/DialogFragment;->onDestroy()V

    return-void
.end method

.method public onStart()V
    .locals 2

    .line 103
    invoke-super {p0}, Landroid/app/DialogFragment;->onStart()V

    .line 110
    sget-object v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->onRequestEqualizerDesc:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    .line 112
    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->updateEqualizerDesc(Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;)V

    return-void
.end method

.method setEqPresetFromBandBars(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;)V
    .locals 7

    .line 453
    iget-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandSeekBars:[Lcom/daaw/avee/Common/VerticalSeekBar;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-lez v1, :cond_0

    aget-object v0, v0, v2

    invoke-virtual {v0}, Lcom/daaw/avee/Common/VerticalSeekBar;->getMax()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    div-int/2addr v0, v3

    .line 455
    iget-object v1, p1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v1, v1

    iget-object v3, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandSeekBars:[Lcom/daaw/avee/Common/VerticalSeekBar;

    array-length v4, v3

    if-eq v1, v4, :cond_1

    .line 456
    array-length v1, v3

    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->resize(I)V

    .line 458
    :cond_1
    :goto_1
    iget-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandSeekBars:[Lcom/daaw/avee/Common/VerticalSeekBar;

    array-length v1, v1

    if-ge v2, v1, :cond_2

    .line 460
    iget-object v1, p1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    new-instance v3, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    iget-object v4, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->equalizerUIDesc:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    iget-object v4, v4, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iget-object v4, v4, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    aget-object v4, v4, v2

    iget v4, v4, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->freq:F

    iget-object v5, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->bandSeekBars:[Lcom/daaw/avee/Common/VerticalSeekBar;

    aget-object v5, v5, v2

    invoke-virtual {v5}, Lcom/daaw/avee/Common/VerticalSeekBar;->getProgress()I

    move-result v5

    sub-int/2addr v5, v0

    int-to-float v5, v5

    int-to-float v6, v0

    div-float/2addr v5, v6

    invoke-direct {v3, v4, v5}, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;-><init>(FF)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method
