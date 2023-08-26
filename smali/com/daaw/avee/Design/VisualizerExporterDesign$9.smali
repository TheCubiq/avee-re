.class Lcom/daaw/avee/Design/VisualizerExporterDesign$9;
.super Ljava/lang/Object;
.source "VisualizerExporterDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerExporterDesign;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;Lcom/daaw/avee/Design/PlaybackDesign;Lcom/daaw/avee/Design/MainUIDesign;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR$Handler<",
        "Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V
    .locals 0

    .line 330
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$9;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;
    .locals 25

    move-object/from16 v0, p0

    .line 334
    new-instance v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

    invoke-direct {v1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;-><init>()V

    .line 345
    sget-object v2, Lcom/daaw/avee/Design/VisualizerExporterDesign;->isPremium:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_0

    .line 350
    iget-object v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$9;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    const/4 v7, 0x6

    new-array v7, v7, [Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    new-instance v16, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    const/4 v9, 0x0

    const/16 v10, 0x780

    const/16 v11, 0x438

    const/16 v12, 0x3c

    const/high16 v22, 0x41900000    # 18.0f

    const/4 v14, 0x1

    const/4 v15, 0x1

    move-object/from16 v8, v16

    move/from16 v13, v22

    invoke-direct/range {v8 .. v15}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;-><init>(IIIIFZI)V

    aput-object v16, v7, v3

    new-instance v8, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    const/16 v18, 0x1

    const/16 v19, 0x780

    const/16 v20, 0x438

    const/16 v21, 0x3c

    const/16 v23, 0x1

    const/16 v24, 0x0

    move-object/from16 v17, v8

    invoke-direct/range {v17 .. v24}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;-><init>(IIIIFZI)V

    aput-object v8, v7, v6

    new-instance v8, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    const/4 v10, 0x2

    const/16 v11, 0x780

    const/16 v12, 0x438

    const/16 v13, 0x1e

    const/high16 v22, 0x41400000    # 12.0f

    const/16 v16, 0x1

    move-object v9, v8

    move/from16 v14, v22

    invoke-direct/range {v9 .. v16}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;-><init>(IIIIFZI)V

    aput-object v8, v7, v5

    new-instance v8, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    const/4 v15, 0x3

    const/16 v16, 0x780

    const/16 v17, 0x438

    const/16 v18, 0x1e

    const/16 v20, 0x1

    const/16 v21, 0x0

    move-object v14, v8

    move/from16 v19, v22

    invoke-direct/range {v14 .. v21}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;-><init>(IIIIFZI)V

    aput-object v8, v7, v4

    const/4 v4, 0x4

    new-instance v8, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    const/4 v15, 0x0

    const/16 v16, 0x500

    const/16 v17, 0x2d0

    const/16 v18, 0x3c

    move-object v14, v8

    invoke-direct/range {v14 .. v21}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;-><init>(IIIIFZI)V

    aput-object v8, v7, v4

    const/4 v4, 0x5

    new-instance v16, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    const/4 v9, 0x1

    const/16 v10, 0x500

    const/16 v11, 0x2d0

    const/16 v12, 0x1e

    const/high16 v13, 0x40f00000    # 7.5f

    const/4 v14, 0x1

    move-object/from16 v8, v16

    invoke-direct/range {v8 .. v15}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;-><init>(IIIIFZI)V

    aput-object v16, v7, v4

    invoke-static {v2, v7}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$802(Lcom/daaw/avee/Design/VisualizerExporterDesign;[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;)[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    .line 381
    iput v5, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActiveIndex:I

    const/4 v2, 0x1

    goto :goto_0

    .line 386
    :cond_0
    iget-object v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$9;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    new-array v4, v4, [Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    new-instance v15, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    const/4 v8, 0x0

    const/16 v9, 0x780

    const/16 v10, 0x438

    const/16 v11, 0x1e

    const/high16 v21, 0x41400000    # 12.0f

    const/4 v13, 0x0

    const/4 v14, 0x1

    move-object v7, v15

    move/from16 v12, v21

    invoke-direct/range {v7 .. v14}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;-><init>(IIIIFZI)V

    aput-object v15, v4, v3

    new-instance v7, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    const/16 v17, 0x0

    const/16 v18, 0x780

    const/16 v19, 0x438

    const/16 v20, 0x1e

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v16, v7

    invoke-direct/range {v16 .. v23}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;-><init>(IIIIFZI)V

    aput-object v7, v4, v6

    new-instance v7, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    const/4 v9, 0x0

    const/16 v10, 0x500

    const/16 v11, 0x2d0

    const/16 v12, 0x1e

    const/high16 v13, 0x40f00000    # 7.5f

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v8, v7

    invoke-direct/range {v8 .. v15}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;-><init>(IIIIFZI)V

    aput-object v7, v4, v5

    invoke-static {v2, v4}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$802(Lcom/daaw/avee/Design/VisualizerExporterDesign;[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;)[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    .line 415
    iput v3, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActiveIndex:I

    const/4 v2, 0x0

    .line 418
    :goto_0
    iget-object v4, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$9;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v4}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$800(Lcom/daaw/avee/Design/VisualizerExporterDesign;)[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    move-result-object v4

    iput-object v4, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profiles:[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    .line 419
    iget v4, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActiveIndex:I

    invoke-virtual {v1, v4}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->getProfileClone(I)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    move-result-object v4

    iput-object v4, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActive:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    .line 420
    iget-object v4, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActive:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    if-nez v4, :cond_1

    .line 421
    new-instance v4, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    const/4 v8, 0x0

    const/16 v9, 0x780

    const/16 v10, 0x438

    const/16 v11, 0x1e

    const/high16 v12, 0x41000000    # 8.0f

    const/4 v13, 0x1

    const/high16 v14, 0x43000000    # 128.0f

    const/4 v15, 0x0

    move-object v7, v4

    invoke-direct/range {v7 .. v15}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;-><init>(IIIIFIFI)V

    iput-object v4, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActive:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    :cond_1
    new-array v4, v6, [I

    aput v3, v4, v3

    .line 424
    invoke-static {v4}, Lcom/daaw/avee/comp/VisualizerExporter/EncodingUtils;->getListAvailableCodecsNames([I)Ljava/util/List;

    move-result-object v5

    .line 426
    invoke-static {v5}, Lcom/daaw/avee/Common/Utils;->getListTupleObj1ToArray(Ljava/util/List;)[Ljava/lang/String;

    move-result-object v7

    iput-object v7, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoCodecs:[Ljava/lang/String;

    .line 427
    invoke-static {v5}, Lcom/daaw/avee/Common/Utils;->getListTupleObj2ToArray(Ljava/util/List;)[Ljava/lang/String;

    move-result-object v5

    iput-object v5, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoMimeTypes:[Ljava/lang/String;

    .line 428
    aget v4, v4, v3

    iput v4, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoCodecActiveIndex:I

    const/4 v4, 0x0

    .line 429
    invoke-static {v4}, Lcom/daaw/avee/comp/VisualizerExporter/EncodingUtils;->getListAvailableCodecsProfileNames([I)[Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoCodecProfileNames:[Ljava/lang/String;

    .line 431
    iget-object v4, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$9;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    const-string v5, "/"

    invoke-static {v4, v5}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$900(Lcom/daaw/avee/Design/VisualizerExporterDesign;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->destinationDir:Ljava/lang/String;

    const-string v4, ""

    .line 433
    iput-object v4, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->filename:Ljava/lang/String;

    .line 434
    iget-object v4, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$9;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v4}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1000(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 435
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$9;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v5}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1000(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v5

    iget-object v5, v5, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " exported"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/daaw/avee/Common/UtilsFileSys;->fixToValidFilename(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->filename:Ljava/lang/String;

    .line 437
    :cond_2
    iget-object v4, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->filename:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v4, v6, :cond_3

    const-string v4, "exported"

    .line 438
    invoke-static {v4}, Lcom/daaw/avee/Common/UtilsFileSys;->fixToValidFilename(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->filename:Ljava/lang/String;

    .line 440
    :cond_3
    iput-boolean v6, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoForceCompatibleWH:Z

    .line 441
    iput-boolean v3, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->hideAppLogo:Z

    .line 442
    iput-boolean v3, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->useHighQualityBlur:Z

    .line 443
    iput-boolean v6, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->exportAudio:Z

    .line 445
    iput v3, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->startMSec:I

    .line 446
    iget-object v4, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$9;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v4}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1000(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v4

    if-eqz v4, :cond_5

    if-eqz v2, :cond_4

    .line 448
    iget-object v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$9;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1000(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v2

    iget v2, v2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->duration:I

    iput v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->endMSec:I

    goto :goto_1

    :cond_4
    const v2, 0x927c0

    .line 450
    iget-object v3, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$9;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1000(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v3

    iget v3, v3, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->duration:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->endMSec:I

    goto :goto_1

    .line 452
    :cond_5
    iput v3, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->endMSec:I

    .line 455
    :goto_1
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v2

    sget v3, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_currentExportSettings:I

    invoke-virtual {v2, v3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->deserialize(Ljava/lang/String;)V

    .line 456
    iget-object v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActive:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v3

    sget v4, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_currentExportSettingsProfile:I

    invoke-virtual {v3, v4}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->deserialize(Ljava/lang/String;)V

    const/4 v2, -0x1

    .line 458
    iput v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActiveIndex:I

    return-object v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 330
    invoke-virtual {p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$9;->invoke()Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

    move-result-object v0

    return-object v0
.end method
