.class public Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;
.super Ljava/lang/Object;
.source "PlayerNotificationManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationBroadcastReceiver;,
        Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$PlayerListener;,
        Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$Priority;,
        Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$Visibility;,
        Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$BitmapCallback;,
        Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationListener;,
        Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$CustomActionReceiver;,
        Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$MediaDescriptionAdapter;
    }
.end annotation


# static fields
.field public static final ACTION_FAST_FORWARD:Ljava/lang/String; = "com.google.android.exoplayer.ffwd"

.field public static final ACTION_NEXT:Ljava/lang/String; = "com.google.android.exoplayer.next"

.field public static final ACTION_PAUSE:Ljava/lang/String; = "com.google.android.exoplayer.pause"

.field public static final ACTION_PLAY:Ljava/lang/String; = "com.google.android.exoplayer.play"

.field public static final ACTION_PREVIOUS:Ljava/lang/String; = "com.google.android.exoplayer.prev"

.field public static final ACTION_REWIND:Ljava/lang/String; = "com.google.android.exoplayer.rewind"

.field public static final ACTION_STOP:Ljava/lang/String; = "com.google.android.exoplayer.stop"

.field public static final DEFAULT_FAST_FORWARD_MS:I = 0x3a98

.field public static final DEFAULT_REWIND_MS:I = 0x1388

.field private static final MAX_POSITION_FOR_SEEK_TO_PREVIOUS:J = 0xbb8L


# instance fields
.field private badgeIconType:I

.field private final channelId:Ljava/lang/String;

.field private color:I

.field private colorized:Z

.field private final context:Landroid/content/Context;

.field private controlDispatcher:Lcom/google/android/exoplayer2/ControlDispatcher;

.field private currentNotificationTag:I

.field private final customActionReceiver:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$CustomActionReceiver;

.field private final customActions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/core/app/NotificationCompat$Action;",
            ">;"
        }
    .end annotation
.end field

.field private defaults:I

.field private fastForwardMs:J

.field private final intentFilter:Landroid/content/IntentFilter;

.field private isNotificationStarted:Z

.field private lastPlaybackState:I

.field private final mainHandler:Landroid/os/Handler;

.field private final mediaDescriptionAdapter:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$MediaDescriptionAdapter;

.field private mediaSessionToken:Landroid/support/v4/media/session/MediaSessionCompat$Token;

.field private final notificationBroadcastReceiver:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationBroadcastReceiver;

.field private final notificationId:I

.field private notificationListener:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationListener;

.field private final notificationManager:Landroidx/core/app/NotificationManagerCompat;

.field private ongoing:Z

.field private final playbackActions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/core/app/NotificationCompat$Action;",
            ">;"
        }
    .end annotation
.end field

.field private player:Lcom/google/android/exoplayer2/Player;

.field private final playerListener:Lcom/google/android/exoplayer2/Player$EventListener;

.field private priority:I

.field private rewindMs:J

.field private smallIconResourceId:I

.field private stopAction:Ljava/lang/String;

.field private stopPendingIntent:Landroid/app/PendingIntent;

.field private useChronometer:Z

.field private useNavigationActions:Z

.field private usePlayPauseActions:Z

.field private visibility:I

.field private wasPlayWhenReady:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;ILcom/google/android/exoplayer2/ui/PlayerNotificationManager$MediaDescriptionAdapter;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    .line 336
    invoke-direct/range {v0 .. v5}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;-><init>(Landroid/content/Context;Ljava/lang/String;ILcom/google/android/exoplayer2/ui/PlayerNotificationManager$MediaDescriptionAdapter;Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$CustomActionReceiver;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;ILcom/google/android/exoplayer2/ui/PlayerNotificationManager$MediaDescriptionAdapter;Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$CustomActionReceiver;)V
    .locals 1

    .line 359
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 360
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->context:Landroid/content/Context;

    .line 361
    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->channelId:Ljava/lang/String;

    .line 362
    iput p3, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->notificationId:I

    .line 363
    iput-object p4, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->mediaDescriptionAdapter:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$MediaDescriptionAdapter;

    .line 364
    iput-object p5, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->customActionReceiver:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$CustomActionReceiver;

    .line 365
    new-instance p2, Lcom/google/android/exoplayer2/DefaultControlDispatcher;

    invoke-direct {p2}, Lcom/google/android/exoplayer2/DefaultControlDispatcher;-><init>()V

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->controlDispatcher:Lcom/google/android/exoplayer2/ControlDispatcher;

    .line 366
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->mainHandler:Landroid/os/Handler;

    .line 367
    invoke-static {p1}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->notificationManager:Landroidx/core/app/NotificationManagerCompat;

    .line 368
    new-instance p2, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$PlayerListener;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$PlayerListener;-><init>(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$1;)V

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->playerListener:Lcom/google/android/exoplayer2/Player$EventListener;

    .line 369
    new-instance p2, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationBroadcastReceiver;

    invoke-direct {p2, p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationBroadcastReceiver;-><init>(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;)V

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->notificationBroadcastReceiver:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationBroadcastReceiver;

    .line 370
    new-instance p2, Landroid/content/IntentFilter;

    invoke-direct {p2}, Landroid/content/IntentFilter;-><init>()V

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->intentFilter:Landroid/content/IntentFilter;

    const/4 p2, 0x1

    .line 371
    iput-boolean p2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->useNavigationActions:Z

    .line 372
    iput-boolean p2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->usePlayPauseActions:Z

    .line 373
    iput-boolean p2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->ongoing:Z

    .line 374
    iput-boolean p2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->colorized:Z

    .line 375
    iput-boolean p2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->useChronometer:Z

    const/4 p3, 0x0

    .line 376
    iput p3, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->color:I

    .line 377
    sget p4, Lcom/google/android/exoplayer2/ui/R$drawable;->exo_notification_small_icon:I

    iput p4, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->smallIconResourceId:I

    .line 378
    iput p3, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->defaults:I

    const/4 p3, -0x1

    .line 379
    iput p3, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->priority:I

    const-wide/16 p3, 0x3a98

    .line 380
    iput-wide p3, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->fastForwardMs:J

    const-wide/16 p3, 0x1388

    .line 381
    iput-wide p3, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->rewindMs:J

    const-string p3, "com.google.android.exoplayer.stop"

    .line 382
    iput-object p3, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->stopAction:Ljava/lang/String;

    .line 383
    iput p2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->badgeIconType:I

    .line 384
    iput p2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->visibility:I

    .line 387
    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->createPlaybackActions(Landroid/content/Context;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->playbackActions:Ljava/util/Map;

    .line 388
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    .line 389
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->intentFilter:Landroid/content/IntentFilter;

    invoke-virtual {v0, p4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-eqz p5, :cond_1

    .line 393
    invoke-interface {p5, p1}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$CustomActionReceiver;->createCustomActions(Landroid/content/Context;)Ljava/util/Map;

    move-result-object p1

    goto :goto_1

    .line 394
    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->customActions:Ljava/util/Map;

    .line 395
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 396
    iget-object p4, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->intentFilter:Landroid/content/IntentFilter;

    invoke-virtual {p4, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    goto :goto_2

    .line 398
    :cond_2
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->playbackActions:Ljava/util/Map;

    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/exoplayer2/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/core/app/NotificationCompat$Action;

    iget-object p1, p1, Landroidx/core/app/NotificationCompat$Action;->actionIntent:Landroid/app/PendingIntent;

    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->stopPendingIntent:Landroid/app/PendingIntent;

    return-void
.end method

.method static synthetic access$000(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;)Lcom/google/android/exoplayer2/Player;
    .locals 0

    .line 94
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->player:Lcom/google/android/exoplayer2/Player;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;)V
    .locals 0

    .line 94
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->startOrUpdateNotification()V

    return-void
.end method

.method static synthetic access$1100(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;)Lcom/google/android/exoplayer2/ControlDispatcher;
    .locals 0

    .line 94
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->controlDispatcher:Lcom/google/android/exoplayer2/ControlDispatcher;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;)J
    .locals 2

    .line 94
    iget-wide v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->fastForwardMs:J

    return-wide v0
.end method

.method static synthetic access$1300(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;)J
    .locals 2

    .line 94
    iget-wide v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->rewindMs:J

    return-wide v0
.end method

.method static synthetic access$1400(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;)V
    .locals 0

    .line 94
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->stopNotification()V

    return-void
.end method

.method static synthetic access$1500(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;)Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$CustomActionReceiver;
    .locals 0

    .line 94
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->customActionReceiver:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$CustomActionReceiver;

    return-object p0
.end method

.method static synthetic access$1600(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;)Ljava/util/Map;
    .locals 0

    .line 94
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->customActions:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$200(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;)I
    .locals 0

    .line 94
    iget p0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->currentNotificationTag:I

    return p0
.end method

.method static synthetic access$300(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;)Z
    .locals 0

    .line 94
    iget-boolean p0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->isNotificationStarted:Z

    return p0
.end method

.method static synthetic access$400(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;Landroid/graphics/Bitmap;)Landroid/app/Notification;
    .locals 0

    .line 94
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->updateNotification(Landroid/graphics/Bitmap;)Landroid/app/Notification;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$500(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;)Landroid/os/Handler;
    .locals 0

    .line 94
    iget-object p0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->mainHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$800(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;)Z
    .locals 0

    .line 94
    iget-boolean p0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->wasPlayWhenReady:Z

    return p0
.end method

.method static synthetic access$802(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;Z)Z
    .locals 0

    .line 94
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->wasPlayWhenReady:Z

    return p1
.end method

.method static synthetic access$900(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;)I
    .locals 0

    .line 94
    iget p0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->lastPlaybackState:I

    return p0
.end method

.method static synthetic access$902(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;I)I
    .locals 0

    .line 94
    iput p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->lastPlaybackState:I

    return p1
.end method

.method private static createPlaybackActions(Landroid/content/Context;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/core/app/NotificationCompat$Action;",
            ">;"
        }
    .end annotation

    .line 882
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 883
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.android.exoplayer.play"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 884
    new-instance v3, Landroidx/core/app/NotificationCompat$Action;

    sget v4, Lcom/google/android/exoplayer2/ui/R$drawable;->exo_notification_play:I

    sget v5, Lcom/google/android/exoplayer2/ui/R$string;->exo_controls_play_description:I

    .line 888
    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/high16 v6, 0x10000000

    const/4 v7, 0x0

    .line 889
    invoke-static {p0, v7, v1, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-direct {v3, v4, v5, v1}, Landroidx/core/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 884
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 890
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.android.exoplayer.pause"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 891
    new-instance v3, Landroidx/core/app/NotificationCompat$Action;

    sget v4, Lcom/google/android/exoplayer2/ui/R$drawable;->exo_notification_pause:I

    sget v5, Lcom/google/android/exoplayer2/ui/R$string;->exo_controls_pause_description:I

    .line 895
    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 896
    invoke-static {p0, v7, v1, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-direct {v3, v4, v5, v1}, Landroidx/core/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 891
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 898
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.android.exoplayer.stop"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 899
    new-instance v3, Landroidx/core/app/NotificationCompat$Action;

    sget v4, Lcom/google/android/exoplayer2/ui/R$drawable;->exo_notification_stop:I

    sget v5, Lcom/google/android/exoplayer2/ui/R$string;->exo_controls_stop_description:I

    .line 903
    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 904
    invoke-static {p0, v7, v1, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-direct {v3, v4, v5, v1}, Landroidx/core/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 899
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 905
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.android.exoplayer.rewind"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 906
    new-instance v3, Landroidx/core/app/NotificationCompat$Action;

    sget v4, Lcom/google/android/exoplayer2/ui/R$drawable;->exo_notification_rewind:I

    sget v5, Lcom/google/android/exoplayer2/ui/R$string;->exo_controls_rewind_description:I

    .line 910
    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 911
    invoke-static {p0, v7, v1, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-direct {v3, v4, v5, v1}, Landroidx/core/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 906
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 913
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.android.exoplayer.ffwd"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 914
    new-instance v3, Landroidx/core/app/NotificationCompat$Action;

    sget v4, Lcom/google/android/exoplayer2/ui/R$drawable;->exo_notification_fastforward:I

    sget v5, Lcom/google/android/exoplayer2/ui/R$string;->exo_controls_fastforward_description:I

    .line 918
    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 919
    invoke-static {p0, v7, v1, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-direct {v3, v4, v5, v1}, Landroidx/core/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 914
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 921
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.android.exoplayer.prev"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 922
    new-instance v3, Landroidx/core/app/NotificationCompat$Action;

    sget v4, Lcom/google/android/exoplayer2/ui/R$drawable;->exo_notification_previous:I

    sget v5, Lcom/google/android/exoplayer2/ui/R$string;->exo_controls_previous_description:I

    .line 926
    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 927
    invoke-static {p0, v7, v1, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-direct {v3, v4, v5, v1}, Landroidx/core/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 922
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 929
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.android.exoplayer.next"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 930
    new-instance v3, Landroidx/core/app/NotificationCompat$Action;

    sget v4, Lcom/google/android/exoplayer2/ui/R$drawable;->exo_notification_next:I

    sget v5, Lcom/google/android/exoplayer2/ui/R$string;->exo_controls_next_description:I

    .line 934
    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 935
    invoke-static {p0, v7, v1, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    invoke-direct {v3, v4, v5, p0}, Landroidx/core/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 930
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static createWithNotificationChannel(Landroid/content/Context;Ljava/lang/String;IILcom/google/android/exoplayer2/ui/PlayerNotificationManager$MediaDescriptionAdapter;)Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;
    .locals 1

    const/4 v0, 0x2

    .line 316
    invoke-static {p0, p1, p2, v0}, Lcom/google/android/exoplayer2/util/NotificationUtil;->createNotificationChannel(Landroid/content/Context;Ljava/lang/String;II)V

    .line 318
    new-instance p2, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;

    invoke-direct {p2, p0, p1, p3, p4}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;-><init>(Landroid/content/Context;Ljava/lang/String;ILcom/google/android/exoplayer2/ui/PlayerNotificationManager$MediaDescriptionAdapter;)V

    return-object p2
.end method

.method private maybeUpdateNotification()V
    .locals 1

    .line 723
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->isNotificationStarted:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->player:Lcom/google/android/exoplayer2/Player;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 724
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->updateNotification(Landroid/graphics/Bitmap;)Landroid/app/Notification;

    :cond_0
    return-void
.end method

.method private startOrUpdateNotification()V
    .locals 4

    .line 710
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->player:Lcom/google/android/exoplayer2/Player;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 711
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->updateNotification(Landroid/graphics/Bitmap;)Landroid/app/Notification;

    move-result-object v0

    .line 712
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->isNotificationStarted:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 713
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->isNotificationStarted:Z

    .line 714
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->notificationBroadcastReceiver:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationBroadcastReceiver;

    iget-object v3, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->intentFilter:Landroid/content/IntentFilter;

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 715
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->notificationListener:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationListener;

    if-eqz v1, :cond_0

    .line 716
    iget v2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->notificationId:I

    invoke-interface {v1, v2, v0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationListener;->onNotificationStarted(ILandroid/app/Notification;)V

    :cond_0
    return-void
.end method

.method private stopNotification()V
    .locals 2

    .line 729
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->isNotificationStarted:Z

    if-eqz v0, :cond_0

    .line 730
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->notificationManager:Landroidx/core/app/NotificationManagerCompat;

    iget v1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->notificationId:I

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationManagerCompat;->cancel(I)V

    const/4 v0, 0x0

    .line 731
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->isNotificationStarted:Z

    .line 732
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->notificationBroadcastReceiver:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationBroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 733
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->notificationListener:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationListener;

    if-eqz v0, :cond_0

    .line 734
    iget v1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->notificationId:I

    invoke-interface {v0, v1}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationListener;->onNotificationCancelled(I)V

    :cond_0
    return-void
.end method

.method private updateNotification(Landroid/graphics/Bitmap;)Landroid/app/Notification;
    .locals 2
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "player"
        }
    .end annotation

    .line 704
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->player:Lcom/google/android/exoplayer2/Player;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->createNotification(Lcom/google/android/exoplayer2/Player;Landroid/graphics/Bitmap;)Landroid/app/Notification;

    move-result-object p1

    .line 705
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->notificationManager:Landroidx/core/app/NotificationManagerCompat;

    iget v1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->notificationId:I

    invoke-virtual {v0, v1, p1}, Landroidx/core/app/NotificationManagerCompat;->notify(ILandroid/app/Notification;)V

    return-object p1
.end method


# virtual methods
.method protected createNotification(Lcom/google/android/exoplayer2/Player;Landroid/graphics/Bitmap;)Landroid/app/Notification;
    .locals 8

    .line 747
    invoke-interface {p1}, Lcom/google/android/exoplayer2/Player;->isPlayingAd()Z

    move-result v0

    .line 748
    new-instance v1, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->context:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->channelId:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 749
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->getActions(Lcom/google/android/exoplayer2/Player;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 750
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_2

    .line 751
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 752
    iget-object v6, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->playbackActions:Ljava/util/Map;

    .line 753
    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    iget-object v6, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->playbackActions:Ljava/util/Map;

    .line 754
    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/core/app/NotificationCompat$Action;

    goto :goto_1

    :cond_0
    iget-object v6, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->customActions:Ljava/util/Map;

    .line 755
    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/core/app/NotificationCompat$Action;

    :goto_1
    if-eqz v5, :cond_1

    .line 757
    invoke-virtual {v1, v5}, Landroidx/core/app/NotificationCompat$Builder;->addAction(Landroidx/core/app/NotificationCompat$Action;)Landroidx/core/app/NotificationCompat$Builder;

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 761
    :cond_2
    new-instance v2, Landroidx/media/app/NotificationCompat$MediaStyle;

    invoke-direct {v2}, Landroidx/media/app/NotificationCompat$MediaStyle;-><init>()V

    .line 762
    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    .line 763
    iget-object v4, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->mediaSessionToken:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    if-eqz v4, :cond_3

    .line 764
    invoke-virtual {v2, v4}, Landroidx/media/app/NotificationCompat$MediaStyle;->setMediaSession(Landroid/support/v4/media/session/MediaSessionCompat$Token;)Landroidx/media/app/NotificationCompat$MediaStyle;

    .line 766
    :cond_3
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->getActionIndicesForCompactView(Lcom/google/android/exoplayer2/Player;)[I

    move-result-object v4

    invoke-virtual {v2, v4}, Landroidx/media/app/NotificationCompat$MediaStyle;->setShowActionsInCompactView([I)Landroidx/media/app/NotificationCompat$MediaStyle;

    .line 768
    iget-object v4, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->stopAction:Ljava/lang/String;

    const/4 v5, 0x1

    if-eqz v4, :cond_4

    if-nez v0, :cond_4

    const/4 v0, 0x1

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    .line 769
    :goto_2
    invoke-virtual {v2, v0}, Landroidx/media/app/NotificationCompat$MediaStyle;->setShowCancelButton(Z)Landroidx/media/app/NotificationCompat$MediaStyle;

    if-eqz v0, :cond_5

    .line 770
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->stopPendingIntent:Landroid/app/PendingIntent;

    if-eqz v0, :cond_5

    .line 771
    invoke-virtual {v1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    .line 772
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->stopPendingIntent:Landroid/app/PendingIntent;

    invoke-virtual {v2, v0}, Landroidx/media/app/NotificationCompat$MediaStyle;->setCancelButtonIntent(Landroid/app/PendingIntent;)Landroidx/media/app/NotificationCompat$MediaStyle;

    .line 775
    :cond_5
    iget v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->badgeIconType:I

    .line 776
    invoke-virtual {v1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setBadgeIconType(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    iget-boolean v2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->ongoing:Z

    .line 777
    invoke-virtual {v0, v2}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    iget v2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->color:I

    .line 778
    invoke-virtual {v0, v2}, Landroidx/core/app/NotificationCompat$Builder;->setColor(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    iget-boolean v2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->colorized:Z

    .line 779
    invoke-virtual {v0, v2}, Landroidx/core/app/NotificationCompat$Builder;->setColorized(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    iget v2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->smallIconResourceId:I

    .line 780
    invoke-virtual {v0, v2}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    iget v2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->visibility:I

    .line 781
    invoke-virtual {v0, v2}, Landroidx/core/app/NotificationCompat$Builder;->setVisibility(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    iget v2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->priority:I

    .line 782
    invoke-virtual {v0, v2}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    iget v2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->defaults:I

    .line 783
    invoke-virtual {v0, v2}, Landroidx/core/app/NotificationCompat$Builder;->setDefaults(I)Landroidx/core/app/NotificationCompat$Builder;

    .line 784
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->useChronometer:Z

    if-eqz v0, :cond_6

    .line 785
    invoke-interface {p1}, Lcom/google/android/exoplayer2/Player;->isCurrentWindowDynamic()Z

    move-result v0

    if-nez v0, :cond_6

    .line 786
    invoke-interface {p1}, Lcom/google/android/exoplayer2/Player;->getPlayWhenReady()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 787
    invoke-interface {p1}, Lcom/google/android/exoplayer2/Player;->getPlaybackState()I

    move-result v0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_6

    .line 789
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {p1}, Lcom/google/android/exoplayer2/Player;->getContentPosition()J

    move-result-wide v6

    sub-long/2addr v2, v6

    invoke-virtual {v1, v2, v3}, Landroidx/core/app/NotificationCompat$Builder;->setWhen(J)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    .line 790
    invoke-virtual {v0, v5}, Landroidx/core/app/NotificationCompat$Builder;->setShowWhen(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    .line 791
    invoke-virtual {v0, v5}, Landroidx/core/app/NotificationCompat$Builder;->setUsesChronometer(Z)Landroidx/core/app/NotificationCompat$Builder;

    goto :goto_3

    .line 793
    :cond_6
    invoke-virtual {v1, v3}, Landroidx/core/app/NotificationCompat$Builder;->setShowWhen(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroidx/core/app/NotificationCompat$Builder;->setUsesChronometer(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 796
    :goto_3
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->mediaDescriptionAdapter:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$MediaDescriptionAdapter;

    invoke-interface {v0, p1}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$MediaDescriptionAdapter;->getCurrentContentTitle(Lcom/google/android/exoplayer2/Player;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    .line 797
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->mediaDescriptionAdapter:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$MediaDescriptionAdapter;

    invoke-interface {v0, p1}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$MediaDescriptionAdapter;->getCurrentContentText(Lcom/google/android/exoplayer2/Player;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    if-nez p2, :cond_7

    .line 799
    iget-object p2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->mediaDescriptionAdapter:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$MediaDescriptionAdapter;

    new-instance v0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$BitmapCallback;

    iget v2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->currentNotificationTag:I

    add-int/2addr v2, v5

    iput v2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->currentNotificationTag:I

    const/4 v3, 0x0

    invoke-direct {v0, p0, v2, v3}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$BitmapCallback;-><init>(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;ILcom/google/android/exoplayer2/ui/PlayerNotificationManager$1;)V

    .line 800
    invoke-interface {p2, p1, v0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$MediaDescriptionAdapter;->getCurrentLargeIcon(Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$BitmapCallback;)Landroid/graphics/Bitmap;

    move-result-object p2

    :cond_7
    if-eqz p2, :cond_8

    .line 804
    invoke-virtual {v1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroidx/core/app/NotificationCompat$Builder;

    .line 806
    :cond_8
    iget-object p2, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->mediaDescriptionAdapter:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$MediaDescriptionAdapter;

    invoke-interface {p2, p1}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$MediaDescriptionAdapter;->createCurrentContentIntent(Lcom/google/android/exoplayer2/Player;)Landroid/app/PendingIntent;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 808
    invoke-virtual {v1, p1}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    .line 810
    :cond_9
    invoke-virtual {v1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    return-object p1
.end method

.method protected getActionIndicesForCompactView(Lcom/google/android/exoplayer2/Player;)[I
    .locals 7

    .line 873
    iget-boolean p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->usePlayPauseActions:Z

    const/4 v0, 0x0

    if-nez p1, :cond_0

    new-array p1, v0, [I

    return-object p1

    .line 876
    :cond_0
    iget-boolean p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->useNavigationActions:Z

    .line 877
    iget-wide v1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->fastForwardMs:J

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    cmp-long v6, v1, v3

    if-lez v6, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    add-int/2addr p1, v1

    new-array v1, v5, [I

    aput p1, v1, v0

    return-object v1
.end method

.method protected getActions(Lcom/google/android/exoplayer2/Player;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/Player;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 833
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 834
    invoke-interface {p1}, Lcom/google/android/exoplayer2/Player;->isPlayingAd()Z

    move-result v1

    if-nez v1, :cond_7

    .line 835
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->useNavigationActions:Z

    if-eqz v1, :cond_0

    const-string v1, "com.google.android.exoplayer.prev"

    .line 836
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 838
    :cond_0
    iget-wide v1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->rewindMs:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_1

    const-string v1, "com.google.android.exoplayer.rewind"

    .line 839
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 841
    :cond_1
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->usePlayPauseActions:Z

    if-eqz v1, :cond_3

    .line 842
    invoke-interface {p1}, Lcom/google/android/exoplayer2/Player;->getPlayWhenReady()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "com.google.android.exoplayer.pause"

    .line 843
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const-string v1, "com.google.android.exoplayer.play"

    .line 845
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 848
    :cond_3
    :goto_0
    iget-wide v1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->fastForwardMs:J

    cmp-long v5, v1, v3

    if-lez v5, :cond_4

    const-string v1, "com.google.android.exoplayer.ffwd"

    .line 849
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 851
    :cond_4
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->useNavigationActions:Z

    if-eqz v1, :cond_5

    invoke-interface {p1}, Lcom/google/android/exoplayer2/Player;->getNextWindowIndex()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_5

    const-string v1, "com.google.android.exoplayer.next"

    .line 852
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 854
    :cond_5
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->customActionReceiver:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$CustomActionReceiver;

    if-eqz v1, :cond_6

    .line 855
    invoke-interface {v1, p1}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$CustomActionReceiver;->getCustomActions(Lcom/google/android/exoplayer2/Player;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 857
    :cond_6
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->stopAction:Ljava/lang/String;

    const-string v1, "com.google.android.exoplayer.stop"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 858
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->stopAction:Ljava/lang/String;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    return-object v0
.end method

.method public final setBadgeIconType(I)V
    .locals 1

    .line 546
    iget v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->badgeIconType:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    goto :goto_0

    .line 556
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 553
    :cond_2
    :goto_0
    iput p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->badgeIconType:I

    .line 558
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->maybeUpdateNotification()V

    return-void
.end method

.method public final setColor(I)V
    .locals 1

    .line 598
    iget v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->color:I

    if-eq v0, p1, :cond_0

    .line 599
    iput p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->color:I

    .line 600
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->maybeUpdateNotification()V

    :cond_0
    return-void
.end method

.method public final setColorized(Z)V
    .locals 1

    .line 570
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->colorized:Z

    if-eq v0, p1, :cond_0

    .line 571
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->colorized:Z

    .line 572
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->maybeUpdateNotification()V

    :cond_0
    return-void
.end method

.method public final setControlDispatcher(Lcom/google/android/exoplayer2/ControlDispatcher;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    .line 439
    :cond_0
    new-instance p1, Lcom/google/android/exoplayer2/DefaultControlDispatcher;

    invoke-direct {p1}, Lcom/google/android/exoplayer2/DefaultControlDispatcher;-><init>()V

    :goto_0
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->controlDispatcher:Lcom/google/android/exoplayer2/ControlDispatcher;

    return-void
.end method

.method public final setDefaults(I)V
    .locals 1

    .line 584
    iget v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->defaults:I

    if-eq v0, p1, :cond_0

    .line 585
    iput p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->defaults:I

    .line 586
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->maybeUpdateNotification()V

    :cond_0
    return-void
.end method

.method public final setFastForwardIncrementMs(J)V
    .locals 3

    .line 459
    iget-wide v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->fastForwardMs:J

    cmp-long v2, v0, p1

    if-nez v2, :cond_0

    return-void

    .line 462
    :cond_0
    iput-wide p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->fastForwardMs:J

    .line 463
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->maybeUpdateNotification()V

    return-void
.end method

.method public final setMediaSessionToken(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .locals 1

    .line 532
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->mediaSessionToken:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-static {v0, p1}, Lcom/google/android/exoplayer2/util/Util;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 533
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->mediaSessionToken:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 534
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->maybeUpdateNotification()V

    :cond_0
    return-void
.end method

.method public final setNotificationListener(Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationListener;)V
    .locals 0

    .line 449
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->notificationListener:Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationListener;

    return-void
.end method

.method public final setOngoing(Z)V
    .locals 1

    .line 614
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->ongoing:Z

    if-eq v0, p1, :cond_0

    .line 615
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->ongoing:Z

    .line 616
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->maybeUpdateNotification()V

    :cond_0
    return-void
.end method

.method public final setPlayer(Lcom/google/android/exoplayer2/Player;)V
    .locals 2

    .line 412
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->player:Lcom/google/android/exoplayer2/Player;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    if-eqz v0, :cond_1

    .line 416
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->playerListener:Lcom/google/android/exoplayer2/Player$EventListener;

    invoke-interface {v0, v1}, Lcom/google/android/exoplayer2/Player;->removeListener(Lcom/google/android/exoplayer2/Player$EventListener;)V

    if-nez p1, :cond_1

    .line 418
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->stopNotification()V

    .line 421
    :cond_1
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->player:Lcom/google/android/exoplayer2/Player;

    if-eqz p1, :cond_2

    .line 423
    invoke-interface {p1}, Lcom/google/android/exoplayer2/Player;->getPlayWhenReady()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->wasPlayWhenReady:Z

    .line 424
    invoke-interface {p1}, Lcom/google/android/exoplayer2/Player;->getPlaybackState()I

    move-result v0

    iput v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->lastPlaybackState:I

    .line 425
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->playerListener:Lcom/google/android/exoplayer2/Player$EventListener;

    invoke-interface {p1, v0}, Lcom/google/android/exoplayer2/Player;->addListener(Lcom/google/android/exoplayer2/Player$EventListener;)V

    .line 426
    iget p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->lastPlaybackState:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    .line 427
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->startOrUpdateNotification()V

    :cond_2
    return-void
.end method

.method public final setPriority(I)V
    .locals 1

    .line 631
    iget v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->priority:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    const/4 v0, -0x2

    if-eq p1, v0, :cond_2

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    goto :goto_0

    .line 643
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 640
    :cond_2
    :goto_0
    iput p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->priority:I

    .line 645
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->maybeUpdateNotification()V

    return-void
.end method

.method public final setRewindIncrementMs(J)V
    .locals 3

    .line 473
    iget-wide v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->rewindMs:J

    cmp-long v2, v0, p1

    if-nez v2, :cond_0

    return-void

    .line 476
    :cond_0
    iput-wide p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->rewindMs:J

    .line 477
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->maybeUpdateNotification()V

    return-void
.end method

.method public final setSmallIcon(I)V
    .locals 1

    .line 656
    iget v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->smallIconResourceId:I

    if-eq v0, p1, :cond_0

    .line 657
    iput p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->smallIconResourceId:I

    .line 658
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->maybeUpdateNotification()V

    :cond_0
    return-void
.end method

.method public final setStopAction(Ljava/lang/String;)V
    .locals 2

    .line 512
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->stopAction:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/google/android/exoplayer2/util/Util;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 515
    :cond_0
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->stopAction:Ljava/lang/String;

    const-string v0, "com.google.android.exoplayer.stop"

    .line 516
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 517
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->playbackActions:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/exoplayer2/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/core/app/NotificationCompat$Action;

    iget-object p1, p1, Landroidx/core/app/NotificationCompat$Action;->actionIntent:Landroid/app/PendingIntent;

    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->stopPendingIntent:Landroid/app/PendingIntent;

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    .line 519
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->customActions:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/exoplayer2/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/core/app/NotificationCompat$Action;

    iget-object p1, p1, Landroidx/core/app/NotificationCompat$Action;->actionIntent:Landroid/app/PendingIntent;

    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->stopPendingIntent:Landroid/app/PendingIntent;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 521
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->stopPendingIntent:Landroid/app/PendingIntent;

    .line 523
    :goto_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->maybeUpdateNotification()V

    return-void
.end method

.method public final setUseChronometer(Z)V
    .locals 1

    .line 670
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->useChronometer:Z

    if-eq v0, p1, :cond_0

    .line 671
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->useChronometer:Z

    .line 672
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->maybeUpdateNotification()V

    :cond_0
    return-void
.end method

.method public final setUseNavigationActions(Z)V
    .locals 1

    .line 486
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->useNavigationActions:Z

    if-eq v0, p1, :cond_0

    .line 487
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->useNavigationActions:Z

    .line 488
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->maybeUpdateNotification()V

    :cond_0
    return-void
.end method

.method public final setUsePlayPauseActions(Z)V
    .locals 1

    .line 498
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->usePlayPauseActions:Z

    if-eq v0, p1, :cond_0

    .line 499
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->usePlayPauseActions:Z

    .line 500
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->maybeUpdateNotification()V

    :cond_0
    return-void
.end method

.method public final setVisibility(I)V
    .locals 1

    .line 687
    iget v0, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->visibility:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    goto :goto_0

    .line 697
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 694
    :cond_2
    :goto_0
    iput p1, p0, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->visibility:I

    .line 699
    invoke-direct {p0}, Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;->maybeUpdateNotification()V

    return-void
.end method
