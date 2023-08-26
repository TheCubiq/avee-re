.class public Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;
.super Landroid/app/DialogFragment;
.source "VisExportDialog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;,
        Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;,
        Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;,
        Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingInfoStatus;
    }
.end annotation


# static fields
.field private static internalOnDestDirUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static internalOnExportingInfoStatusUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingInfoStatus;",
            ">;"
        }
    .end annotation
.end field

.field private static internalOnExportingProgressStatusUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;",
            ">;"
        }
    .end annotation
.end field

.field public static onActivityResult:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;",
            "Ljava/lang/Integer;",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field public static onCancelAction:Lcom/daaw/avee/Common/Events/WeakEvent;

.field public static onDestDirAction:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Landroid/app/Fragment;",
            "Lcom/daaw/avee/ContextData;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static onExportAction:Lcom/daaw/avee/Common/Events/WeakEvent4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent4<",
            "Landroid/app/Fragment;",
            "Lcom/daaw/avee/ContextData;",
            "Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestExportSettings:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private btnDestDir:Landroid/widget/Button;

.field private btnEndTime:Landroid/widget/Button;

.field private btnStartTime:Landroid/widget/Button;

.field private chkAudioStereo:Landroid/widget/CheckBox;

.field private chkBlurQuality:Landroid/widget/CheckBox;

.field private chkExportAudio:Landroid/widget/CheckBox;

.field private chkForceCompatibleWh:Landroid/widget/CheckBox;

.field private chkHideAppLogo:Landroid/widget/CheckBox;

.field private editAudioBitrate:Landroid/widget/EditText;

.field private editTxtBitrate:Landroid/widget/EditText;

.field private editTxtFilename:Landroid/widget/EditText;

.field private editTxtFramerate:Landroid/widget/EditText;

.field private editTxtHeight:Landroid/widget/EditText;

.field private editTxtWidth:Landroid/widget/EditText;

.field private layoutContent:Landroid/view/ViewGroup;

.field private layoutContentExporting:Landroid/view/ViewGroup;

.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field loadedExportSettings:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

.field private progressDecode:Landroid/widget/ProgressBar;

.field private progressRender:Landroid/widget/ProgressBar;

.field private spinnerProfile:Landroid/widget/Spinner;

.field private timeEndMs:I

.field private timeStartMs:I

.field private txtDecodeValue:Landroid/widget/TextView;

.field private txtRender:Landroid/widget/TextView;

.field private txtRenderValue:Landroid/widget/TextView;

.field private videoCodec:Landroid/widget/Spinner;

.field private videoCodecProfile:Landroid/widget/Spinner;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 47
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent4;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent4;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onExportAction:Lcom/daaw/avee/Common/Events/WeakEvent4;

    .line 48
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onCancelAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 49
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onDestDirAction:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 50
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onActivityResult:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 53
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onRequestExportSettings:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 55
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->internalOnDestDirUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 56
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->internalOnExportingProgressStatusUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 57
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->internalOnExportingInfoStatusUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    const/4 v0, 0x0

    .line 59
    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->loadedExportSettings:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

    const/4 v0, 0x0

    .line 81
    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->timeStartMs:I

    .line 82
    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->timeEndMs:I

    .line 84
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->listenerRefHolder:Ljava/util/List;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->getCurrentExportSettings()Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;)Landroid/widget/Button;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->btnDestDir:Landroid/widget/Button;

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->internalDestDirUpdate(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->internalUpdateExportingProgressStatus(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;)V

    return-void
.end method

.method static synthetic access$500(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;[Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onExportSettingsProfileChanged(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;[Ljava/lang/String;)V

    return-void
.end method

.method public static createAndShowVisExportDialog(Lcom/daaw/avee/ContextData;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;
    .locals 2

    .line 103
    new-instance v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;

    invoke-direct {v0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;-><init>()V

    const-string v1, "VisExportDialog"

    .line 104
    invoke-static {v0, v1, p0}, Lcom/daaw/avee/Common/UtilsUI;->showDialogSafe(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/avee/ContextData;)V

    return-object v0
.end method

.method private getCurrentExportSettings()Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;
    .locals 11

    .line 383
    new-instance v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

    invoke-direct {v0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;-><init>()V

    .line 385
    new-instance v10, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editTxtWidth:Landroid/widget/EditText;

    .line 386
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;)I

    move-result v3

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editTxtHeight:Landroid/widget/EditText;

    .line 387
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;)I

    move-result v4

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editTxtFramerate:Landroid/widget/EditText;

    .line 388
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;)I

    move-result v5

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editTxtBitrate:Landroid/widget/EditText;

    .line 389
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/Utils;->strToFloatSafe(Ljava/lang/String;)F

    move-result v6

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->chkAudioStereo:Landroid/widget/CheckBox;

    .line 390
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
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editAudioBitrate:Landroid/widget/EditText;

    .line 391
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/Utils;->strToFloatSafe(Ljava/lang/String;)F

    move-result v8

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->videoCodecProfile:Landroid/widget/Spinner;

    .line 392
    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v9

    const/4 v2, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;-><init>(IIIIFIFI)V

    iput-object v10, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActive:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    .line 395
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->loadedExportSettings:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

    iget-object v1, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoCodecs:[Ljava/lang/String;

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoCodecs:[Ljava/lang/String;

    .line 396
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->loadedExportSettings:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

    iget-object v1, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoMimeTypes:[Ljava/lang/String;

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoMimeTypes:[Ljava/lang/String;

    .line 397
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->videoCodec:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v1

    iput v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoCodecActiveIndex:I

    .line 399
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->btnDestDir:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->destinationDir:Ljava/lang/String;

    .line 400
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editTxtFilename:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->filename:Ljava/lang/String;

    .line 401
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->chkForceCompatibleWh:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoForceCompatibleWH:Z

    .line 402
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->chkExportAudio:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->exportAudio:Z

    .line 403
    iget v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->timeStartMs:I

    iput v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->startMSec:I

    .line 404
    iget v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->timeEndMs:I

    iput v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->endMSec:I

    .line 405
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->chkBlurQuality:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->useHighQualityBlur:Z

    .line 407
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->chkHideAppLogo:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->hideAppLogo:Z

    return-object v0
.end method

.method private internalDestDirUpdate(Ljava/lang/String;)V
    .locals 1

    .line 414
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 416
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->btnDestDir:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private internalUpdateExportingProgressStatus(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;)V
    .locals 6

    .line 420
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 422
    :cond_0
    iget-boolean v0, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->active:Z

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    .line 423
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->layoutContentExporting:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 424
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->layoutContentExporting:Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 425
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->layoutContent:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 428
    :cond_1
    iget-boolean v0, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->isLoadingResources:Z

    if-eqz v0, :cond_2

    .line 429
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->txtRender:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 435
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->txtRender:Landroid/widget/TextView;

    const v1, 0x7f1001bf

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 441
    :cond_2
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->txtRender:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 444
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->progressRender:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->progressRender:Landroid/widget/ProgressBar;

    const v3, 0x7f0400a9

    invoke-static {v1, v3}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result v1

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v3}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 445
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->progressRender:Landroid/widget/ProgressBar;

    iget v1, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->progressMax:I

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 446
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->progressRender:Landroid/widget/ProgressBar;

    iget v1, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->progressValue:I

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 448
    iget v0, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->progressValue:I

    int-to-float v0, v0

    iget p1, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->progressMax:I

    int-to-float p1, p1

    div-float/2addr v0, p1

    .line 450
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->txtRenderValue:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f0e0009

    const/high16 v4, 0x42c80000    # 100.0f

    mul-float v0, v0, v4

    float-to-int v4, v0

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    .line 451
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, v5, v2

    .line 450
    invoke-virtual {v1, v3, v4, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 454
    :cond_3
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->layoutContent:Landroid/view/ViewGroup;

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 455
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->layoutContentExporting:Landroid/view/ViewGroup;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method private onExportSettingsProfileChanged(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;[Ljava/lang/String;)V
    .locals 6

    .line 347
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->layoutContent:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    return-void

    .line 349
    :cond_0
    iget v0, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoCodecProfile:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    new-array p2, v1, [Ljava/lang/String;

    const-string v3, "<empty>"

    aput-object v3, p2, v2

    .line 353
    :goto_0
    new-instance v3, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->getActivity()Landroid/app/Activity;

    move-result-object v4

    const v5, 0x1090008

    invoke-direct {v3, v4, v5, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 355
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->videoCodecProfile:Landroid/widget/Spinner;

    invoke-virtual {v4, v3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    if-ltz v0, :cond_2

    .line 357
    array-length p2, p2

    if-ge v0, p2, :cond_2

    .line 358
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->videoCodecProfile:Landroid/widget/Spinner;

    invoke-virtual {p2, v0, v2}, Landroid/widget/Spinner;->setSelection(IZ)V

    goto :goto_1

    .line 360
    :cond_2
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->videoCodecProfile:Landroid/widget/Spinner;

    invoke-virtual {p2, v2, v2}, Landroid/widget/Spinner;->setSelection(IZ)V

    .line 362
    :goto_1
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->videoCodecProfile:Landroid/widget/Spinner;

    new-instance v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$9;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$9;-><init>(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;)V

    invoke-virtual {p2, v0}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 373
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editTxtWidth:Landroid/widget/EditText;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->width:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 374
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editTxtHeight:Landroid/widget/EditText;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->height:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 375
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editTxtFramerate:Landroid/widget/EditText;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->frameRate:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 376
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editTxtBitrate:Landroid/widget/EditText;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoBitrateMbps:F

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 377
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->chkAudioStereo:Landroid/widget/CheckBox;

    iget v0, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioChannels:I

    if-le v0, v1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {p2, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 378
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editAudioBitrate:Landroid/widget/EditText;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioBitrateKbps:F

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private setTimeEndMs(I)V
    .locals 2

    .line 341
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->loadedExportSettings:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

    iget v0, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->endMSec:I

    const/4 v1, 0x0

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->timeEndMs:I

    .line 342
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->btnEndTime:Landroid/widget/Button;

    div-int/lit16 p1, p1, 0x3e8

    invoke-static {p1}, Lcom/daaw/avee/Common/Utils;->getDurationStringHMSS(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private setTimeStartMs(I)V
    .locals 2

    .line 336
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->loadedExportSettings:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

    iget v0, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->endMSec:I

    const/4 v1, 0x0

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->timeStartMs:I

    .line 337
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->btnStartTime:Landroid/widget/Button;

    div-int/lit16 p1, p1, 0x3e8

    invoke-static {p1}, Lcom/daaw/avee/Common/Utils;->getDurationStringHMSS(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static updateDestinationDirValue(Ljava/lang/String;)V
    .locals 1

    .line 88
    sget-object v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->internalOnDestDirUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public static updateExportingInfoStatus(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingInfoStatus;)V
    .locals 1

    .line 98
    sget-object v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->internalOnExportingInfoStatusUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public static updateExportingProgressStatus(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;)V
    .locals 1

    .line 93
    sget-object v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->internalOnExportingProgressStatusUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method isViewCreated()Z
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->layoutContent:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public synthetic lambda$null$0$VisExportDialog(Landroid/widget/TimePicker;II)V
    .locals 0

    mul-int/lit8 p2, p2, 0x3c

    add-int/2addr p3, p2

    mul-int/lit16 p3, p3, 0x3e8

    .line 193
    invoke-direct {p0, p3}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->setTimeStartMs(I)V

    return-void
.end method

.method public synthetic lambda$null$2$VisExportDialog(Landroid/widget/TimePicker;II)V
    .locals 0

    mul-int/lit8 p2, p2, 0x3c

    add-int/2addr p3, p2

    mul-int/lit16 p3, p3, 0x3e8

    .line 203
    invoke-direct {p0, p3}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->setTimeEndMs(I)V

    return-void
.end method

.method public synthetic lambda$onCreateDialog$1$VisExportDialog(Landroid/view/View;)V
    .locals 7

    .line 191
    new-instance p1, Landroid/app/TimePickerDialog;

    .line 192
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->getActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/daaw/avee/comp/VisualizerExporter/-$$Lambda$VisExportDialog$gPPsslRfx8di18K2bQBGwlR-xU4;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/VisualizerExporter/-$$Lambda$VisExportDialog$gPPsslRfx8di18K2bQBGwlR-xU4;-><init>(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;)V

    iget v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->timeStartMs:I

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

    .line 197
    invoke-virtual {p1}, Landroid/app/TimePickerDialog;->show()V

    return-void
.end method

.method public synthetic lambda$onCreateDialog$3$VisExportDialog(Landroid/view/View;)V
    .locals 7

    .line 201
    new-instance p1, Landroid/app/TimePickerDialog;

    .line 202
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->getActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/daaw/avee/comp/VisualizerExporter/-$$Lambda$VisExportDialog$-WUxOfgYVw4qJ9WuBjzxpyJFzFg;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/VisualizerExporter/-$$Lambda$VisExportDialog$-WUxOfgYVw4qJ9WuBjzxpyJFzFg;-><init>(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;)V

    iget v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->timeEndMs:I

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

    .line 207
    invoke-virtual {p1}, Landroid/app/TimePickerDialog;->show()V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 467
    invoke-super {p0, p1, p2, p3}, Landroid/app/DialogFragment;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 469
    sget-object p2, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onActivityResult:Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p0, p1, p3}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 224
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 227
    sget-object p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->internalOnDestDirUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$5;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$5;-><init>(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;)V

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 235
    sget-object p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->internalOnExportingProgressStatusUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$6;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$6;-><init>(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;)V

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 6

    .line 118
    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 120
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x7f0c0061

    invoke-static {v0, v2, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 121
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v2, 0x7f090126

    .line 123
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->layoutContent:Landroid/view/ViewGroup;

    const v2, 0x7f090127

    .line 124
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->layoutContentExporting:Landroid/view/ViewGroup;

    const v2, 0x7f090071

    .line 126
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    const v3, 0x7f0400a9

    .line 127
    invoke-static {v2, v3}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setTextColor(I)V

    const/4 v4, 0x1

    .line 128
    invoke-virtual {v2, v4}, Landroid/widget/Button;->setSelected(Z)V

    .line 129
    new-instance v4, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$1;

    invoke-direct {v4, p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$1;-><init>(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;)V

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f090072

    .line 136
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    .line 137
    invoke-static {v2, v3}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V

    .line 138
    new-instance v5, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$2;

    invoke-direct {v5, p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$2;-><init>(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;)V

    invoke-virtual {v4, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f09008a

    .line 145
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageButton;

    .line 146
    invoke-static {v2, v3}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result v2

    invoke-virtual {v4, v2}, Landroid/widget/ImageButton;->setColorFilter(I)V

    .line 147
    new-instance v2, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$3;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$3;-><init>(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;)V

    invoke-virtual {v4, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f090069

    .line 154
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->btnDestDir:Landroid/widget/Button;

    .line 155
    new-instance v3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$4;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$4;-><init>(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0900c8

    .line 162
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editTxtFilename:Landroid/widget/EditText;

    const v2, 0x7f0901dc

    .line 164
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->spinnerProfile:Landroid/widget/Spinner;

    const v2, 0x7f0901df

    .line 165
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->videoCodec:Landroid/widget/Spinner;

    const v2, 0x7f0901e0

    .line 166
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->videoCodecProfile:Landroid/widget/Spinner;

    const v2, 0x7f0900cd

    .line 168
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editTxtWidth:Landroid/widget/EditText;

    const v2, 0x7f0900cb

    .line 169
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editTxtHeight:Landroid/widget/EditText;

    const v2, 0x7f0900ca

    .line 170
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editTxtFramerate:Landroid/widget/EditText;

    const v2, 0x7f0900c7

    .line 171
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editTxtBitrate:Landroid/widget/EditText;

    const v2, 0x7f09024b

    .line 173
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->txtRender:Landroid/widget/TextView;

    const v2, 0x7f090184

    .line 175
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ProgressBar;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->progressRender:Landroid/widget/ProgressBar;

    const v2, 0x7f09024c

    .line 177
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->txtRenderValue:Landroid/widget/TextView;

    const v2, 0x7f0900a1

    .line 178
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->chkForceCompatibleWh:Landroid/widget/CheckBox;

    const v2, 0x7f09009f

    .line 179
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->chkBlurQuality:Landroid/widget/CheckBox;

    const v2, 0x7f0900a0

    .line 181
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->chkExportAudio:Landroid/widget/CheckBox;

    const v2, 0x7f09009e

    .line 182
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->chkAudioStereo:Landroid/widget/CheckBox;

    const v2, 0x7f0900c4

    .line 183
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editAudioBitrate:Landroid/widget/EditText;

    const v2, 0x7f0900a2

    .line 185
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->chkHideAppLogo:Landroid/widget/CheckBox;

    const v2, 0x7f090089

    .line 187
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    iput-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->btnStartTime:Landroid/widget/Button;

    const v2, 0x7f09006c

    .line 188
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->btnEndTime:Landroid/widget/Button;

    .line 190
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->btnStartTime:Landroid/widget/Button;

    new-instance v2, Lcom/daaw/avee/comp/VisualizerExporter/-$$Lambda$VisExportDialog$ar0CODVjUAVj2ENK9wucbcN5QiA;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/VisualizerExporter/-$$Lambda$VisExportDialog$ar0CODVjUAVj2ENK9wucbcN5QiA;-><init>(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 200
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->btnEndTime:Landroid/widget/Button;

    new-instance v2, Lcom/daaw/avee/comp/VisualizerExporter/-$$Lambda$VisExportDialog$ZpdWo_67szR0KSjENq4FqgOyWrI;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/VisualizerExporter/-$$Lambda$VisExportDialog$ZpdWo_67szR0KSjENq4FqgOyWrI;-><init>(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    const/4 v0, 0x0

    .line 212
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 213
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 217
    sget-object v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onRequestExportSettings:Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->updateExportSettings(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;)V

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 251
    sget-object v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->internalOnDestDirUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->unSubscribeWeak(Ljava/util/List;)V

    .line 252
    sget-object v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->internalOnExportingProgressStatusUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->unSubscribeWeak(Ljava/util/List;)V

    .line 253
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->listenerRefHolder:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 255
    invoke-super {p0}, Landroid/app/DialogFragment;->onDestroy()V

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 461
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 462
    sget-object p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onCancelAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    return-void
.end method

.method updateExportSettings(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;)V
    .locals 8

    .line 260
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->layoutContent:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    return-void

    .line 261
    :cond_0
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->loadedExportSettings:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

    if-nez p1, :cond_1

    return-void

    .line 264
    :cond_1
    iget-object v0, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoCodecProfileNames:[Ljava/lang/String;

    .line 266
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->btnDestDir:Landroid/widget/Button;

    iget-object v2, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->destinationDir:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 267
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->editTxtFilename:Landroid/widget/EditText;

    iget-object v2, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->filename:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 270
    iget v1, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoCodecActiveIndex:I

    .line 272
    iget-object v2, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoCodecs:[Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    iget-object v2, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoCodecs:[Ljava/lang/String;

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v4, "<empty>"

    aput-object v4, v2, v3

    .line 274
    :goto_0
    new-instance v4, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->getActivity()Landroid/app/Activity;

    move-result-object v5

    const v6, 0x1090008

    invoke-direct {v4, v5, v6, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 276
    iget-object v5, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->videoCodec:Landroid/widget/Spinner;

    invoke-virtual {v5, v4}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    if-ltz v1, :cond_3

    .line 278
    array-length v2, v2

    if-ge v1, v2, :cond_3

    .line 279
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->videoCodec:Landroid/widget/Spinner;

    invoke-virtual {v2, v1, v3}, Landroid/widget/Spinner;->setSelection(IZ)V

    goto :goto_1

    .line 281
    :cond_3
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->videoCodec:Landroid/widget/Spinner;

    invoke-virtual {v1, v3, v3}, Landroid/widget/Spinner;->setSelection(IZ)V

    .line 283
    :goto_1
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->videoCodec:Landroid/widget/Spinner;

    new-instance v2, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$7;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$7;-><init>(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;)V

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 300
    iget v1, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActiveIndex:I

    .line 302
    new-instance v2, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->getActivity()Landroid/app/Activity;

    move-result-object v4

    iget-object v5, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->spinnerProfile:Landroid/widget/Spinner;

    .line 303
    invoke-virtual {v5}, Landroid/widget/Spinner;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f1001af

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, v5}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->access$400(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v4, v6, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 304
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->spinnerProfile:Landroid/widget/Spinner;

    invoke-virtual {v4, v2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 306
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->spinnerProfile:Landroid/widget/Spinner;

    invoke-virtual {v2, v1, v3}, Landroid/widget/Spinner;->setSelection(IZ)V

    .line 307
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->spinnerProfile:Landroid/widget/Spinner;

    new-instance v2, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$8;

    invoke-direct {v2, p0, p1, v0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$8;-><init>(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;[Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 325
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->chkForceCompatibleWh:Landroid/widget/CheckBox;

    iget-boolean v2, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoForceCompatibleWH:Z

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 326
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->chkBlurQuality:Landroid/widget/CheckBox;

    iget-boolean v2, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->useHighQualityBlur:Z

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 327
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->chkExportAudio:Landroid/widget/CheckBox;

    iget-boolean v2, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->exportAudio:Z

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 328
    iget-object v1, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActive:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    invoke-direct {p0, v1, v0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onExportSettingsProfileChanged(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;[Ljava/lang/String;)V

    .line 330
    iget v0, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->startMSec:I

    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->setTimeStartMs(I)V

    .line 331
    iget p1, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->endMSec:I

    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->setTimeEndMs(I)V

    return-void
.end method
