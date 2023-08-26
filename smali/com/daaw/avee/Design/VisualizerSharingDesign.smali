.class public Lcom/daaw/avee/Design/VisualizerSharingDesign;
.super Lcom/daaw/avee/Design/DesignBase;
.source "VisualizerSharingDesign.java"


# static fields
.field public static final PackedContent_SceneFileName:Ljava/lang/String; = "scene.json"

.field public static final StringContent_FileExtWithDotAlt:Ljava/lang/String; = ".json"


# instance fields
.field final PackedContent_FileExtWithDot:Ljava/lang/String;

.field final PackedContent_FileExtWithDotAlt:Ljava/lang/String;

.field final StringContent_FileExtWithDot:Ljava/lang/String;

.field currentTemplateIndexes:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field final maxSizeOfContentEntry:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 85
    invoke-direct {p0}, Lcom/daaw/avee/Design/DesignBase;-><init>()V

    .line 47
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/Design/VisualizerSharingDesign;->currentTemplateIndexes:Ljava/lang/ref/WeakReference;

    const-string v0, ".txt"

    .line 49
    iput-object v0, p0, Lcom/daaw/avee/Design/VisualizerSharingDesign;->StringContent_FileExtWithDot:Ljava/lang/String;

    const-string v0, ".zip"

    .line 52
    iput-object v0, p0, Lcom/daaw/avee/Design/VisualizerSharingDesign;->PackedContent_FileExtWithDot:Ljava/lang/String;

    const-string v0, ".viz"

    .line 53
    iput-object v0, p0, Lcom/daaw/avee/Design/VisualizerSharingDesign;->PackedContent_FileExtWithDotAlt:Ljava/lang/String;

    const-wide/32 v0, 0x5f5e100

    .line 56
    iput-wide v0, p0, Lcom/daaw/avee/Design/VisualizerSharingDesign;->maxSizeOfContentEntry:J

    .line 88
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->onSaveToFileVisTemplateAction:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerSharingDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerSharingDesign$1;-><init>(Lcom/daaw/avee/Design/VisualizerSharingDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerSharingDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 196
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->onLoadFromFileVisTemplateAction:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerSharingDesign$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerSharingDesign$2;-><init>(Lcom/daaw/avee/Design/VisualizerSharingDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerSharingDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 255
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->onActivityResult:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerSharingDesign$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerSharingDesign$3;-><init>(Lcom/daaw/avee/Design/VisualizerSharingDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerSharingDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    return-void
.end method

.method public static AddNewVisualizerFromFile(Landroid/content/Context;Landroid/net/Uri;)I
    .locals 1

    .line 325
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    .line 326
    invoke-virtual {v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPrefThemeCustomizationIndexes()Ljava/util/List;

    move-result-object v0

    .line 330
    invoke-static {p0, p1, v0}, Lcom/daaw/avee/Design/VisualizerSharingDesign;->onVisLoadFilePickedAsPackedContent(Landroid/content/Context;Landroid/net/Uri;Ljava/util/List;)I

    move-result p0

    return p0
.end method

.method public static DetectVizFileTypeByFileSignature(Landroid/content/ContentResolver;Landroid/net/Uri;)Z
    .locals 3

    const/4 v0, 0x2

    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 64
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 67
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p0, :cond_1

    .line 70
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    if-eq p1, v0, :cond_2

    return v2

    .line 79
    :cond_2
    aget-byte p0, v1, v2

    const/16 p1, 0x50

    if-ne p0, p1, :cond_3

    const/4 p0, 0x1

    aget-byte p1, v1, p0

    const/16 v0, 0x4b

    if-ne p1, v0, :cond_3

    return p0

    :catch_0
    :cond_3
    return v2
.end method

.method static Fix_TransferCustomizationDataFromLocalFile(I)V
    .locals 9

    if-gez p0, :cond_0

    return-void

    .line 455
    :cond_0
    invoke-static {p0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->GetVisualizerFolderFromIdentifier(I)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 459
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v4, v2

    move-object v5, v4

    const/4 v3, 0x0

    .line 464
    :goto_0
    array-length v6, v0

    if-ge v3, v6, :cond_3

    .line 465
    aget-object v6, v0, v3

    .line 467
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/daaw/avee/Common/UtilsFileSys;->extractFilenameExtWithDot(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, ".json"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move-object v5, v6

    .line 469
    :cond_1
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "scene.json"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move-object v4, v6

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    if-nez v4, :cond_4

    move-object v4, v5

    :cond_4
    if-eqz v4, :cond_5

    .line 479
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 480
    :try_start_1
    invoke-static {v0}, Lcom/daaw/avee/Common/UtilsFileSys;->readInputStreamAsString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 481
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catchall_0
    move-exception v3

    .line 479
    :try_start_3
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v3

    .line 481
    :try_start_4
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    :try_start_5
    throw v3
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 488
    :catch_0
    :goto_1
    :try_start_6
    invoke-virtual {v4}, Ljava/io/File;->delete()Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_2

    :catch_1
    nop

    :cond_5
    :goto_2
    if-nez v2, :cond_6

    return-void

    .line 495
    :cond_6
    invoke-static {v2}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->deserialize(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object v0

    .line 496
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v2

    invoke-virtual {v2, p0, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->savePrefThemeCustomizationData(ILcom/daaw/avee/comp/Visualizer/CustomScene;Z)V

    :cond_7
    return-void
.end method

.method private SaveFileToPublicDirectory(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v3, v1

    const/4 v2, 0x0

    :goto_0
    const/16 v4, 0x64

    if-ge v0, v4, :cond_2

    if-nez v2, :cond_0

    .line 509
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, p1, p2, v3}, Lcom/daaw/avee/Design/VisualizerSharingDesign;->createFileToPublicDirectory(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    goto :goto_1

    .line 511
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, p1, p2, v3}, Lcom/daaw/avee/Design/VisualizerSharingDesign;->createFileToPublicDirectory(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    :goto_1
    if-eqz v3, :cond_1

    .line 514
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    if-eqz v3, :cond_3

    .line 521
    :try_start_0
    new-instance p1, Ljava/io/FileOutputStream;

    invoke-direct {p1, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 522
    invoke-virtual {p5}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/FileOutputStream;->write([B)V

    .line 523
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->flush()V

    .line 524
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    .line 527
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 530
    :goto_3
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v1
.end method

.method private SavePackedFileToPublicDirectory(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "scene.json"

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v4, v2

    const/4 v3, 0x0

    :goto_0
    const/16 v5, 0x64

    if-ge v1, v5, :cond_2

    if-nez v3, :cond_0

    .line 584
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, p1, p2, v4}, Lcom/daaw/avee/Design/VisualizerSharingDesign;->createFileToPublicDirectory(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    goto :goto_1

    .line 586
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ")"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, p1, p2, v4}, Lcom/daaw/avee/Design/VisualizerSharingDesign;->createFileToPublicDirectory(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    :goto_1
    if-eqz v4, :cond_1

    .line 589
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    if-eqz v4, :cond_5

    .line 596
    :try_start_0
    new-instance p1, Ljava/io/FileOutputStream;

    invoke-direct {p1, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 598
    new-instance p2, Ljava/util/zip/ZipOutputStream;

    invoke-direct {p2, p1}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 600
    invoke-static {p5, v0, p2}, Lcom/daaw/avee/Design/VisualizerSharingDesign;->addToZipFile(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;)V

    .line 602
    invoke-interface {p6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/io/File;

    .line 603
    invoke-virtual {p4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {v0, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_3

    goto :goto_3

    .line 604
    :cond_3
    invoke-static {p4, p2}, Lcom/daaw/avee/Design/VisualizerSharingDesign;->addToZipFile(Ljava/io/File;Ljava/util/zip/ZipOutputStream;)V

    goto :goto_3

    .line 608
    :cond_4
    invoke-virtual {p2}, Ljava/util/zip/ZipOutputStream;->close()V

    .line 609
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->flush()V

    .line 610
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    .line 613
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 616
    :goto_4
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_5
    return-object v2
.end method

.method static synthetic access$000(Lcom/daaw/avee/Design/VisualizerSharingDesign;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 0

    .line 44
    invoke-direct/range {p0 .. p6}, Lcom/daaw/avee/Design/VisualizerSharingDesign;->SavePackedFileToPublicDirectory(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/Design/VisualizerSharingDesign;Landroid/content/Context;Landroid/net/Uri;Ljava/util/List;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerSharingDesign;->onVisLoadFilePicked(Landroid/content/Context;Landroid/net/Uri;Ljava/util/List;)V

    return-void
.end method

.method public static addToZipFile(Ljava/io/File;Ljava/util/zip/ZipOutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 641
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 642
    new-instance v1, Ljava/util/zip/ZipEntry;

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    .line 643
    invoke-virtual {p1, v1}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    const/16 p0, 0x400

    new-array p0, p0, [B

    .line 647
    :goto_0
    invoke-virtual {v0, p0}, Ljava/io/FileInputStream;->read([B)I

    move-result v1

    if-ltz v1, :cond_0

    const/4 v2, 0x0

    .line 648
    invoke-virtual {p1, p0, v2, v1}, Ljava/util/zip/ZipOutputStream;->write([BII)V

    goto :goto_0

    .line 651
    :cond_0
    invoke-virtual {p1}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    .line 652
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    return-void
.end method

.method public static addToZipFile(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 630
    new-instance v0, Ljava/util/zip/ZipEntry;

    invoke-direct {v0, p1}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    .line 631
    invoke-virtual {p2, v0}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 633
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    .line 635
    invoke-virtual {p2, p0}, Ljava/util/zip/ZipOutputStream;->write([B)V

    .line 636
    invoke-virtual {p2}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    return-void
.end method

.method private createFile(Landroid/app/DialogFragment;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 562
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.CREATE_DOCUMENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "android.intent.category.OPENABLE"

    .line 566
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 569
    invoke-virtual {v0, p2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "android.intent.extra.TITLE"

    .line 570
    invoke-virtual {v0, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/16 p2, 0x3f

    .line 571
    invoke-virtual {p1, v0, p2}, Landroid/app/DialogFragment;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private createFileToPublicDirectory(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 0

    .line 542
    :try_start_0
    new-instance p1, Ljava/io/File;

    invoke-static {p2}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object p2

    invoke-static {p3}, Lcom/daaw/avee/Common/UtilsFileSys;->fixToValidFilename(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 543
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 545
    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    move-result p3

    if-nez p3, :cond_0

    .line 546
    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p1

    :catch_0
    move-exception p1

    .line 554
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method private onVisLoadFilePicked(Landroid/content/Context;Landroid/net/Uri;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 336
    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, ".txt"

    .line 338
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    const-string v2, ".json"

    .line 339
    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    const-string v3, ".zip"

    .line 340
    invoke-virtual {v0, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    const-string v4, ".viz"

    .line 341
    invoke-virtual {v0, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    .line 343
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-eq v0, v1, :cond_1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    .line 351
    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerSharingDesign;->onVisLoadFilePickedAsStringContent(Landroid/content/Context;Landroid/net/Uri;Ljava/util/List;)V

    goto :goto_2

    .line 353
    :cond_2
    invoke-static {p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerSharingDesign;->onVisLoadFilePickedAsPackedContent(Landroid/content/Context;Landroid/net/Uri;Ljava/util/List;)I

    :goto_2
    return-void
.end method

.method private static onVisLoadFilePickedAsPackedContent(Landroid/content/Context;Landroid/net/Uri;Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    const/4 v0, -0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/16 v1, 0x400

    new-array v1, v1, [B

    .line 391
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p0

    .line 392
    new-instance p1, Ljava/util/zip/ZipInputStream;

    invoke-direct {p1, p0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    const-string v2, ""

    .line 398
    invoke-static {v2}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->deserialize(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object v2

    .line 399
    invoke-static {v2, p2, v0}, Lcom/daaw/avee/Design/VisualizerDesign;->addNewVisualizer(Lcom/daaw/avee/comp/Visualizer/CustomScene;Ljava/util/List;I)I

    move-result p2
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    if-gez p2, :cond_1

    return v0

    .line 402
    :cond_1
    :try_start_1
    invoke-static {p2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->GetVisualizerFolderFromIdentifier(I)Ljava/io/File;

    move-result-object v0

    .line 409
    :goto_0
    invoke-virtual {p1}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 417
    invoke-virtual {v2}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v2

    .line 422
    new-instance v3, Ljava/io/FileOutputStream;

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v3, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 425
    :goto_1
    :try_start_2
    invoke-virtual {p1, v1}, Ljava/util/zip/ZipInputStream;->read([B)I

    move-result v2

    if-lez v2, :cond_2

    const/4 v4, 0x0

    .line 426
    invoke-virtual {v3, v1, v4, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 428
    :cond_2
    :try_start_3
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 422
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p0

    .line 428
    :try_start_5
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    :try_start_6
    throw p0

    .line 438
    :cond_3
    invoke-virtual {p1}, Ljava/util/zip/ZipInputStream;->close()V

    .line 439
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    goto :goto_2

    :catch_0
    move v0, p2

    :catch_1
    move p2, v0

    .line 447
    :goto_2
    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerSharingDesign;->Fix_TransferCustomizationDataFromLocalFile(I)V

    return p2
.end method

.method private onVisLoadFilePickedAsStringContent(Landroid/content/Context;Landroid/net/Uri;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    return-void

    .line 361
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1

    .line 364
    invoke-static {p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readInputStreamAsString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    return-void

    .line 367
    :cond_1
    invoke-static {p2}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->deserialize(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p2

    const/4 v0, -0x1

    .line 369
    invoke-static {p2, p3, v0}, Lcom/daaw/avee/Design/VisualizerDesign;->addNewVisualizer(Lcom/daaw/avee/comp/Visualizer/CustomScene;Ljava/util/List;I)I

    .line 371
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
