.class public Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;
.super Ljava/lang/Object;
.source "VisExportDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ExportSettingsProfile"
.end annotation


# instance fields
.field public audioBitrateKbps:F

.field public audioChannels:I

.field private decorLevel:I

.field public frameRate:I

.field public height:I

.field public name:Ljava/lang/String;

.field public videoBitrateMbps:F

.field public videoCodecProfile:I

.field public width:I


# direct methods
.method public constructor <init>(IIIIFIFI)V
    .locals 0

    .line 514
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 515
    iput p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->decorLevel:I

    .line 516
    iput p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->width:I

    .line 517
    iput p3, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->height:I

    .line 518
    iput p4, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->frameRate:I

    .line 519
    iput p5, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoBitrateMbps:F

    .line 520
    iput p6, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioChannels:I

    .line 521
    iput p7, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioBitrateKbps:F

    .line 522
    iput p8, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoCodecProfile:I

    .line 523
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->makeName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->name:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(IIIIFZI)V
    .locals 0

    .line 496
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 497
    iput p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->decorLevel:I

    .line 498
    iput p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->width:I

    .line 499
    iput p3, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->height:I

    .line 500
    iput p4, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->frameRate:I

    .line 501
    iput p5, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoBitrateMbps:F

    const/4 p1, 0x2

    if-eqz p6, :cond_0

    .line 503
    iput p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioChannels:I

    const/high16 p1, 0x43c00000    # 384.0f

    .line 504
    iput p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioBitrateKbps:F

    goto :goto_0

    .line 506
    :cond_0
    iput p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioChannels:I

    const/high16 p1, 0x43800000    # 256.0f

    .line 507
    iput p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioBitrateKbps:F

    .line 509
    :goto_0
    iput p7, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoCodecProfile:I

    .line 510
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->makeName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->name:Ljava/lang/String;

    return-void
.end method

.method public static makeMaxProfile([Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;
    .locals 11

    if-eqz p0, :cond_2

    .line 601
    array-length v0, p0

    if-gtz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 602
    aget-object v1, p0, v0

    invoke-virtual {v1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->clone()Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    move-result-object v1

    .line 604
    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_1

    .line 605
    iget v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->width:I

    aget-object v3, p0, v0

    iget v3, v3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->width:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->width:I

    .line 606
    iget v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->height:I

    aget-object v3, p0, v0

    iget v3, v3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->height:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->height:I

    .line 607
    iget v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->frameRate:I

    aget-object v3, p0, v0

    iget v3, v3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->frameRate:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->frameRate:I

    .line 608
    iget v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoBitrateMbps:F

    aget-object v3, p0, v0

    iget v3, v3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoBitrateMbps:F

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iput v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoBitrateMbps:F

    .line 609
    iget v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioChannels:I

    aget-object v3, p0, v0

    iget v3, v3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioChannels:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioChannels:I

    .line 610
    iget v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioBitrateKbps:F

    aget-object v3, p0, v0

    iget v3, v3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioBitrateKbps:F

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iput v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioBitrateKbps:F

    .line 611
    iget v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoCodecProfile:I

    aget-object v3, p0, v0

    iget v3, v3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoCodecProfile:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoCodecProfile:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 614
    :cond_1
    invoke-virtual {v1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->makeName()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->name:Ljava/lang/String;

    return-object v1

    .line 601
    :cond_2
    :goto_1
    new-instance p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v10}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;-><init>(IIIIFIFI)V

    return-object p0
.end method


# virtual methods
.method public clone()Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;
    .locals 10

    .line 594
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 596
    :catch_0
    new-instance v9, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    iget v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->decorLevel:I

    iget v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->width:I

    iget v3, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->height:I

    iget v4, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->frameRate:I

    iget v5, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoBitrateMbps:F

    iget v6, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioChannels:I

    iget v7, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioBitrateKbps:F

    iget v8, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoCodecProfile:I

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;-><init>(IIIIFIFI)V

    return-object v9
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 484
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->clone()Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    move-result-object v0

    return-object v0
.end method

.method public deserialize(Ljava/lang/String;)V
    .locals 2

    const-string v0, ";"

    .line 554
    invoke-static {v0, p1}, Lcom/daaw/avee/Common/UtilsSerialize;->deserializeIterable(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 556
    array-length v0, p1

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 558
    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->decorLevel:I

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->decorLevel:I

    const/4 v0, 0x1

    .line 559
    aget-object v0, p1, v0

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->name:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->strToStrSafe(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->name:Ljava/lang/String;

    const/4 v0, 0x2

    .line 560
    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->width:I

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->width:I

    const/4 v0, 0x3

    .line 561
    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->height:I

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->height:I

    const/4 v0, 0x4

    .line 563
    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->frameRate:I

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->frameRate:I

    const/4 v0, 0x5

    .line 564
    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoBitrateMbps:F

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->strToFloatSafe(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoBitrateMbps:F

    const/4 v0, 0x6

    .line 565
    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioChannels:I

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioChannels:I

    const/4 v0, 0x7

    .line 566
    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioBitrateKbps:F

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->strToFloatSafe(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioBitrateKbps:F

    const/16 v0, 0x8

    .line 567
    aget-object p1, p1, v0

    iget v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoCodecProfile:I

    invoke-static {p1, v0}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoCodecProfile:I

    return-void
.end method

.method public forceMaxProfile(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;)V
    .locals 2

    .line 620
    iget v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->width:I

    iget v1, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->width:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->width:I

    .line 621
    iget v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->height:I

    iget v1, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->height:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->height:I

    .line 622
    iget v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->frameRate:I

    iget v1, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->frameRate:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->frameRate:I

    .line 623
    iget v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoBitrateMbps:F

    iget v1, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoBitrateMbps:F

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoBitrateMbps:F

    .line 624
    iget v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioChannels:I

    iget v1, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioChannels:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioChannels:I

    .line 625
    iget v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioBitrateKbps:F

    iget v1, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioBitrateKbps:F

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioBitrateKbps:F

    .line 626
    iget v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoCodecProfile:I

    iget p1, p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoCodecProfile:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoCodecProfile:I

    .line 627
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->makeName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->name:Ljava/lang/String;

    return-void
.end method

.method makeName()Ljava/lang/String;
    .locals 10

    .line 575
    iget v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->decorLevel:I

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const-string v5, ""

    if-ne v0, v4, :cond_0

    const-string v0, " "

    goto :goto_0

    :cond_0
    if-ne v0, v3, :cond_1

    const-string v0, "  "

    goto :goto_0

    :cond_1
    if-ne v0, v2, :cond_2

    const-string v0, "   "

    goto :goto_0

    :cond_2
    if-ne v0, v1, :cond_3

    const-string v0, "    "

    goto :goto_0

    :cond_3
    move-object v0, v5

    .line 585
    :goto_0
    iget v6, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoCodecProfile:I

    if-nez v6, :cond_4

    const-string v6, "L"

    goto :goto_1

    :cond_4
    const-string v6, "H"

    .line 588
    :goto_1
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v8, 0x7

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v0, v8, v9

    iget v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->height:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v8, v4

    iget v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->frameRate:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v8, v3

    iget v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoBitrateMbps:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, v8, v2

    aput-object v5, v8, v1

    const/4 v0, 0x5

    iget v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioBitrateKbps:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v8, v0

    const/4 v0, 0x6

    aput-object v6, v8, v0

    const-string v0, "%s%dp @%d %.1fMbps%s %.1fKbps %s"

    invoke-static {v7, v0, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public serialize()Ljava/lang/String;
    .locals 5

    .line 528
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 530
    iget v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->decorLevel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ";"

    .line 531
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->name:Ljava/lang/String;

    const/16 v3, 0x3b

    const/16 v4, 0x5f

    invoke-static {v3, v4, v2}, Lcom/daaw/avee/Common/UtilsSerialize;->replaceCharsInString(CCLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 534
    iget v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->width:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 535
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 536
    iget v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->height:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 537
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    iget v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->frameRate:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 539
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 540
    iget v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoBitrateMbps:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 541
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 542
    iget v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioChannels:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 543
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 544
    iget v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioBitrateKbps:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 545
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    iget v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoCodecProfile:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 549
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
