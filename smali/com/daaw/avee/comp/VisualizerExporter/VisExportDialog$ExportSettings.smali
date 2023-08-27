.class public Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;
.super Ljava/lang/Object;
.source "VisExportDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ExportSettings"
.end annotation


# instance fields
.field public destinationDir:Ljava/lang/String;

.field public endMSec:I

.field public exportAudio:Z

.field public filename:Ljava/lang/String;

.field public hideAppLogo:Z

.field public profileActive:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

.field public profileActiveIndex:I

.field public profiles:[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

.field public startMSec:I

.field public useHighQualityBlur:Z

.field public videoCodecActiveIndex:I

.field public videoCodecProfileNames:[Ljava/lang/String;

.field public videoCodecs:[Ljava/lang/String;

.field public videoForceCompatibleWH:Z

.field public videoMimeTypes:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 631
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$400(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;Ljava/lang/String;)[Ljava/lang/String;
    .locals 0

    .line 631
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->getProfileNames(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private getProfileNames(Ljava/lang/String;)[Ljava/lang/String;
    .locals 4

    .line 681
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profiles:[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    array-length v0, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    add-int/2addr v0, v3

    new-array v0, v0, [Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 686
    aput-object p1, v0, v2

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 690
    :goto_1
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profiles:[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    array-length v3, p1

    if-ge v2, v3, :cond_2

    add-int v3, v2, v1

    .line 691
    aget-object p1, p1, v2

    iget-object p1, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->name:Ljava/lang/String;

    aput-object p1, v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-object v0
.end method


# virtual methods
.method public deserialize(Ljava/lang/String;)V
    .locals 2

    const-string v0, ";"

    .line 725
    invoke-static {v0, p1}, Lcom/daaw/avee/Common/UtilsSerialize;->deserializeIterable(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 727
    array-length v0, p1

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 729
    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActiveIndex:I

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActiveIndex:I

    const/4 v0, 0x1

    .line 730
    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoCodecActiveIndex:I

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoCodecActiveIndex:I

    const/4 v0, 0x2

    .line 731
    aget-object v0, p1, v0

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->destinationDir:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->strToStrSafe(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->destinationDir:Ljava/lang/String;

    const/4 v0, 0x4

    .line 734
    aget-object v0, p1, v0

    iget-boolean v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->exportAudio:Z

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->strToBoolSafe(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->exportAudio:Z

    const/4 v0, 0x7

    .line 737
    aget-object v0, p1, v0

    iget-boolean v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->useHighQualityBlur:Z

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->strToBoolSafe(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->useHighQualityBlur:Z

    const/16 v0, 0x8

    .line 738
    aget-object p1, p1, v0

    iget-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoForceCompatibleWH:Z

    invoke-static {p1, v0}, Lcom/daaw/avee/Common/Utils;->strToBoolSafe(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoForceCompatibleWH:Z

    return-void
.end method

.method public getProfile(I)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;
    .locals 2

    if-ltz p1, :cond_1

    .line 654
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profiles:[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    array-length v1, v0

    if-lt p1, v1, :cond_0

    goto :goto_0

    .line 655
    :cond_0
    aget-object p1, v0, p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getProfileClone(I)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;
    .locals 0

    .line 660
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->getProfile(I)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 661
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->clone()Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getVideoCodec(I)Ljava/lang/String;
    .locals 3

    .line 667
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoCodecs:[Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    if-ltz p1, :cond_2

    .line 668
    array-length v2, v0

    if-lt p1, v2, :cond_1

    goto :goto_0

    .line 669
    :cond_1
    aget-object p1, v0, p1

    return-object p1

    :cond_2
    :goto_0
    return-object v1
.end method

.method public getVideoMimeTypeCodec(I)Ljava/lang/String;
    .locals 3

    .line 674
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoMimeTypes:[Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    if-ltz p1, :cond_2

    .line 675
    array-length v2, v0

    if-lt p1, v2, :cond_1

    goto :goto_0

    .line 676
    :cond_1
    aget-object p1, v0, p1

    return-object p1

    :cond_2
    :goto_0
    return-object v1
.end method

.method public serialize()Ljava/lang/String;
    .locals 5

    .line 699
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 701
    iget v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActiveIndex:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ";"

    .line 702
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 703
    iget v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoCodecActiveIndex:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 704
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 705
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->destinationDir:Ljava/lang/String;

    const/16 v3, 0x5f

    const/16 v4, 0x3b

    invoke-static {v4, v3, v2}, Lcom/daaw/avee/Common/UtilsSerialize;->replaceCharsInString(CCLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 706
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 707
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->filename:Ljava/lang/String;

    invoke-static {v4, v3, v2}, Lcom/daaw/avee/Common/UtilsSerialize;->replaceCharsInString(CCLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 708
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 709
    iget-boolean v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->exportAudio:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 710
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 711
    iget v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->startMSec:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 712
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 713
    iget v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->endMSec:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 714
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 715
    iget-boolean v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->useHighQualityBlur:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 716
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 717
    iget-boolean v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoForceCompatibleWH:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 720
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
