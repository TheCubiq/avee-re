.class public Lcom/daaw/avee/Design/GeneralDesign;
.super Ljava/lang/Object;
.source "GeneralDesign.java"


# static fields
.field public static volatile celebrationContentAvailable:Z = false

.field public static isFirstLaunch:Z = false

.field public static shouldLoadInitalSongMediaService:Z = false

.field public static shouldLoadInitalSongs:Z = false


# instance fields
.field private gotOnContext:Z

.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final newYearDate:Ljava/util/Date;

.field final newYearEndDate:Ljava/util/Date;

.field final newYearLateEndDate:Ljava/util/Date;

.field private final newestEulaId:I

.field final snowDate:Ljava/util/Date;

.field final snowEndDate:Ljava/util/Date;

.field private threadHandler:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/GeneralDesign;->listenerRefHolder:Ljava/util/List;

    .line 67
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/GeneralDesign;->threadHandler:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 68
    iput-boolean v0, p0, Lcom/daaw/avee/Design/GeneralDesign;->gotOnContext:Z

    const v1, 0x313ed

    .line 72
    iput v1, p0, Lcom/daaw/avee/Design/GeneralDesign;->newestEulaId:I

    .line 74
    new-instance v1, Ljava/util/Date;

    const/16 v2, 0xb

    const/16 v3, 0x75

    const/16 v4, 0x18

    invoke-direct {v1, v3, v2, v4}, Ljava/util/Date;-><init>(III)V

    iput-object v1, p0, Lcom/daaw/avee/Design/GeneralDesign;->snowDate:Ljava/util/Date;

    .line 75
    new-instance v1, Ljava/util/Date;

    const/16 v4, 0x1a

    invoke-direct {v1, v3, v2, v4}, Ljava/util/Date;-><init>(III)V

    iput-object v1, p0, Lcom/daaw/avee/Design/GeneralDesign;->snowEndDate:Ljava/util/Date;

    .line 77
    new-instance v1, Ljava/util/Date;

    const/16 v2, 0x76

    const/4 v3, 0x1

    invoke-direct {v1, v2, v0, v3}, Ljava/util/Date;-><init>(III)V

    iput-object v1, p0, Lcom/daaw/avee/Design/GeneralDesign;->newYearDate:Ljava/util/Date;

    .line 78
    new-instance v1, Ljava/util/Date;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v0, v3}, Ljava/util/Date;-><init>(III)V

    iput-object v1, p0, Lcom/daaw/avee/Design/GeneralDesign;->newYearEndDate:Ljava/util/Date;

    .line 79
    new-instance v1, Ljava/util/Date;

    const/4 v3, 0x4

    invoke-direct {v1, v2, v0, v3}, Ljava/util/Date;-><init>(III)V

    iput-object v1, p0, Lcom/daaw/avee/Design/GeneralDesign;->newYearLateEndDate:Ljava/util/Date;

    .line 83
    sget-object v0, Lcom/daaw/avee/SettingsActivity;->onClearCacheAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/GeneralDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/GeneralDesign$1;-><init>(Lcom/daaw/avee/Design/GeneralDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/GeneralDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 98
    sget-object v0, Lcom/daaw/avee/SettingsActivity;->onEulaAction:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/GeneralDesign$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/GeneralDesign$2;-><init>(Lcom/daaw/avee/Design/GeneralDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/GeneralDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 119
    invoke-direct {p0}, Lcom/daaw/avee/Design/GeneralDesign;->checkIfCelebration()V

    .line 121
    sget-object v0, Lcom/daaw/avee/comp/Legal/EulaDialog;->onAcceptEula:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/GeneralDesign$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/GeneralDesign$3;-><init>(Lcom/daaw/avee/Design/GeneralDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/GeneralDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 129
    sget-object v0, Lcom/daaw/avee/comp/Legal/EulaDialog;->onRejectEula:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/GeneralDesign$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/GeneralDesign$4;-><init>(Lcom/daaw/avee/Design/GeneralDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/GeneralDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 146
    sget-object v0, Lcom/daaw/avee/MainActivity;->onCreate:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/GeneralDesign$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/GeneralDesign$5;-><init>(Lcom/daaw/avee/Design/GeneralDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/GeneralDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 154
    sget-object v0, Lcom/daaw/avee/MainActivity;->onStart:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/GeneralDesign$6;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/GeneralDesign$6;-><init>(Lcom/daaw/avee/Design/GeneralDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/GeneralDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 161
    sget-object v0, Lcom/daaw/avee/MainActivity;->onStop:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/GeneralDesign$7;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/GeneralDesign$7;-><init>(Lcom/daaw/avee/Design/GeneralDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/GeneralDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 168
    sget-object v0, Lcom/daaw/avee/MainActivity;->onCreateEarly:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/GeneralDesign$8;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/GeneralDesign$8;-><init>(Lcom/daaw/avee/Design/GeneralDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/GeneralDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 175
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onCreateEarly:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/GeneralDesign$9;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/GeneralDesign$9;-><init>(Lcom/daaw/avee/Design/GeneralDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/GeneralDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 187
    sget-object v0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onRequestShouldReloadInitalSongs:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/GeneralDesign$10;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/GeneralDesign$10;-><init>(Lcom/daaw/avee/Design/GeneralDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/GeneralDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 199
    sget-object v0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueueStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/GeneralDesign$11;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/GeneralDesign$11;-><init>(Lcom/daaw/avee/Design/GeneralDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/GeneralDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 217
    sget-object v0, Lcom/daaw/avee/MainActivity;->onRequestPermissionsResult:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/GeneralDesign$12;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/GeneralDesign$12;-><init>(Lcom/daaw/avee/Design/GeneralDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/GeneralDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 236
    sget-object v0, Lcom/daaw/avee/MainActivity;->onCreateView:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/GeneralDesign$13;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/GeneralDesign$13;-><init>(Lcom/daaw/avee/Design/GeneralDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/GeneralDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 258
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onCreateView:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$mYJyJfrOcbYjtn3YCYZALljq2UE;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$mYJyJfrOcbYjtn3YCYZALljq2UE;-><init>(Lcom/daaw/avee/Design/GeneralDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/GeneralDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 274
    sget-object v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->onRequestLocalFolder:Lcom/daaw/avee/Common/Events/WeakEventR1;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$0haL71o_3GFtZhzH99t2vGPBRuw;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$0haL71o_3GFtZhzH99t2vGPBRuw;

    iget-object v2, p0, Lcom/daaw/avee/Design/GeneralDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 284
    sget-object v0, Lcom/daaw/avee/MainActivity;->onLaunchIntent:Lcom/daaw/avee/Common/Events/WeakEventR2;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$b5L43DtSnC-6J5Ib2E1DIqCrj_o;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$b5L43DtSnC-6J5Ib2E1DIqCrj_o;

    iget-object v2, p0, Lcom/daaw/avee/Design/GeneralDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/Design/GeneralDesign;Landroid/app/Activity;)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/GeneralDesign;->showEulaMaybe(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/Design/GeneralDesign;Landroid/content/Context;)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/GeneralDesign;->onContext(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$200(Lcom/daaw/avee/Design/GeneralDesign;)Landroid/os/Handler;
    .locals 0

    .line 61
    iget-object p0, p0, Lcom/daaw/avee/Design/GeneralDesign;->threadHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/Design/GeneralDesign;)Z
    .locals 0

    .line 61
    iget-boolean p0, p0, Lcom/daaw/avee/Design/GeneralDesign;->gotOnContext:Z

    return p0
.end method

.method static synthetic access$400(Lcom/daaw/avee/Design/GeneralDesign;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/daaw/avee/Design/GeneralDesign;->checkIfCelebration()V

    return-void
.end method

.method private checkIfCelebration()V
    .locals 2

    .line 335
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 336
    iget-object v1, p0, Lcom/daaw/avee/Design/GeneralDesign;->snowDate:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/avee/Design/GeneralDesign;->newYearLateEndDate:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 337
    sput-boolean v0, Lcom/daaw/avee/Design/GeneralDesign;->celebrationContentAvailable:Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 339
    sput-boolean v0, Lcom/daaw/avee/Design/GeneralDesign;->celebrationContentAvailable:Z

    :goto_0
    return-void
.end method

.method static synthetic lambda$new$1(Ljava/lang/Object;)Ljava/io/File;
    .locals 0

    .line 276
    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    .line 278
    invoke-static {p0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->GetVisualizerFolderFromIdentifier(I)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$new$2(Lcom/daaw/avee/ContextData;Landroid/content/Intent;)Ljava/lang/Boolean;
    .locals 3

    if-eqz p1, :cond_1

    .line 287
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 288
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "LaunchIntent: action: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ";"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ";null"

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 295
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v2, "android.intent.action.VIEW"

    .line 298
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 299
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 302
    invoke-virtual {p0}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    .line 304
    invoke-static {v1, p1}, Lcom/daaw/avee/Design/VisualizerSharingDesign;->DetectVizFileTypeByFileSignature(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 305
    invoke-virtual {p0}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/daaw/avee/Design/VisualizerSharingDesign;->AddNewVisualizerFromFile(Landroid/content/Context;Landroid/net/Uri;)I

    move-result p0

    if-lez p0, :cond_3

    .line 308
    invoke-static {p0}, Lcom/daaw/avee/Design/VisualizerDesign;->selectThemePreset(I)V

    goto :goto_1

    .line 310
    :cond_2
    new-instance v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    const-wide/16 v1, -0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;-><init>(JLandroid/net/Uri;)V

    :cond_3
    :goto_1
    const/4 p0, 0x0

    if-eqz v0, :cond_4

    .line 321
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 322
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 324
    sget-object v0, Lcom/daaw/avee/MainActivity;->onPreviewOpen:Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p1, p0}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p0, 0x1

    .line 326
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 329
    :cond_4
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private onContext(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x1

    .line 345
    iput-boolean v0, p0, Lcom/daaw/avee/Design/GeneralDesign;->gotOnContext:Z

    if-eqz p1, :cond_0

    .line 348
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    .line 349
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->load(Landroid/content/Context;)V

    .line 351
    sget-boolean p1, Lcom/daaw/avee/Design/GeneralDesign;->isFirstLaunch:Z

    if-nez p1, :cond_0

    .line 352
    sget p1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_firstLaunch:I

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getBool(I)Z

    move-result p1

    sput-boolean p1, Lcom/daaw/avee/Design/GeneralDesign;->isFirstLaunch:Z

    .line 353
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "isFirstLaunch: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v1, Lcom/daaw/avee/Design/GeneralDesign;->isFirstLaunch:Z

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 354
    sget p1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_firstLaunch:I

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBool(IZ)V

    .line 356
    sget-boolean p1, Lcom/daaw/avee/Design/GeneralDesign;->isFirstLaunch:Z

    sput-boolean p1, Lcom/daaw/avee/Design/GeneralDesign;->shouldLoadInitalSongs:Z

    sput-boolean p1, Lcom/daaw/avee/Design/GeneralDesign;->shouldLoadInitalSongMediaService:Z

    :cond_0
    return-void
.end method

.method public static restart(Landroid/content/Context;I)V
    .locals 6

    const/4 v0, 0x1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 366
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 367
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const/4 v2, 0x0

    const/high16 v3, 0x10000000

    .line 368
    invoke-static {p0, v2, v1, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    const-string v2, "alarm"

    .line 371
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AlarmManager;

    .line 372
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    int-to-long v4, p1

    add-long/2addr v2, v4

    invoke-virtual {p0, v0, v2, v3, v1}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    const/4 p0, 0x2

    .line 373
    invoke-static {p0}, Ljava/lang/System;->exit(I)V

    return-void
.end method

.method private showEulaMaybe(Landroid/app/Activity;)V
    .locals 2

    .line 378
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    .line 379
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_acceptedEula:I

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result v0

    const v1, 0x313ed

    if-eq v0, v1, :cond_0

    .line 381
    new-instance v0, Lcom/daaw/avee/ContextData;

    invoke-direct {v0, p1}, Lcom/daaw/avee/ContextData;-><init>(Landroid/app/Activity;)V

    const/4 p1, 0x1

    .line 382
    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Legal/EulaDialog;->createAndShow(Lcom/daaw/avee/ContextData;Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public synthetic lambda$new$0$GeneralDesign(Ljava/lang/Integer;Landroid/view/View;)V
    .locals 1

    .line 260
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 262
    iget-object v0, p0, Lcom/daaw/avee/Design/GeneralDesign;->snowDate:Ljava/util/Date;

    invoke-virtual {p1, v0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/Design/GeneralDesign;->snowEndDate:Ljava/util/Date;

    invoke-virtual {p1, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_1

    const p1, 0x7f080157

    .line 263
    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 264
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/Design/GeneralDesign;->newYearDate:Ljava/util/Date;

    invoke-virtual {p1, v0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/Design/GeneralDesign;->newYearEndDate:Ljava/util/Date;

    invoke-virtual {p1, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result p1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    const p1, 0x7f080131

    .line 265
    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_1
    :goto_0
    return-void
.end method
