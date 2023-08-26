.class public Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification;
.super Ljava/lang/Object;
.source "MediaPlaybackNotification.java"


# static fields
.field public static onRequestAlbumArtLarge:Lcom/daaw/avee/Common/Events/WeakEvent5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent5<",
            "Landroid/content/Context;",
            "Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;",
            "Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent5;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent5;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification;->onRequestAlbumArtLarge:Lcom/daaw/avee/Common/Events/WeakEvent5;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static CancelNotification(Landroid/content/Context;I)V
    .locals 1

    const-string v0, "notification"

    .line 83
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/NotificationManager;

    if-eqz p0, :cond_0

    .line 84
    invoke-virtual {p0, p1}, Landroid/app/NotificationManager;->cancel(I)V

    :cond_0
    return-void
.end method

.method public static createNotificationChannel(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 90
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    const v0, 0x7f10010f

    .line 91
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 93
    new-instance v1, Landroid/app/NotificationChannel;

    const/4 v2, 0x2

    const-string v3, "Playback Service"

    invoke-direct {v1, v0, v3, v2}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const/4 v2, 0x0

    .line 96
    invoke-virtual {v1, v2}, Landroid/app/NotificationChannel;->setLockscreenVisibility(I)V

    const-string v2, "notification"

    .line 97
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/NotificationManager;

    if-eqz p0, :cond_0

    .line 100
    invoke-virtual {p0, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_0
    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static createNotificationInternal(Landroid/content/Context;ILjava/lang/String;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;ILcom/daaw/avee/Common/Func/Func;)Landroid/app/Notification;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
            "ZZ",
            "Ljava/lang/Class<",
            "*>;I",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Landroid/os/Handler;",
            ">;)",
            "Landroid/app/Notification;"
        }
    .end annotation

    move-object v8, p0

    .line 118
    new-instance v9, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0c00a8

    invoke-direct {v9, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    move-object v0, p0

    move-object v1, v9

    move-object v2, p3

    move v3, p4

    move v4, p5

    move-object/from16 v5, p6

    move/from16 v6, p7

    move-object/from16 v7, p8

    .line 120
    invoke-static/range {v0 .. v7}, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification;->updateNotificationViews(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;ILcom/daaw/avee/Common/Func/Func;)V

    .line 122
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/daaw/avee/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x20000

    .line 123
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const/4 v1, 0x0

    .line 124
    invoke-static {p0, v1, v0, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 129
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    .line 130
    new-instance v1, Landroid/app/Notification$Builder;

    move-object v2, p2

    invoke-direct {v1, p0, p2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 132
    :cond_0
    new-instance v1, Landroid/app/Notification$Builder;

    invoke-direct {v1, p0}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    :goto_0
    move-object v6, v1

    .line 134
    invoke-virtual {v6, v9}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    const v1, 0x7f0800dd

    .line 135
    invoke-virtual {v6, v1}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 140
    invoke-virtual {v6, v0}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 142
    new-instance v7, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$1;

    move-object v0, v7

    move-object/from16 v1, p8

    move-object v2, v9

    move-object v3, v6

    move-object v4, p0

    move v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$1;-><init>(Lcom/daaw/avee/Common/Func/Func;Landroid/widget/RemoteViews;Landroid/app/Notification$Builder;Landroid/content/Context;I)V

    move-object v0, p3

    invoke-static {p0, v9, p3, v7, v1}, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification;->updateNotificationViewsImg(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/Common/Action1;Lcom/daaw/avee/Common/Func/Func;)V

    .line 172
    invoke-virtual {v6}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public static getOrCreateNotification(Landroid/content/Context;ILjava/lang/String;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;ILcom/daaw/avee/Common/Func/Func;)Landroid/app/Notification;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
            "ZZ",
            "Ljava/lang/Class<",
            "*>;I",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Landroid/os/Handler;",
            ">;)",
            "Landroid/app/Notification;"
        }
    .end annotation

    .line 50
    invoke-static/range {p0 .. p8}, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification;->createNotificationInternal(Landroid/content/Context;ILjava/lang/String;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;ILcom/daaw/avee/Common/Func/Func;)Landroid/app/Notification;

    move-result-object p0

    return-object p0
.end method

.method public static updateNotification(Landroid/content/Context;ILjava/lang/String;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;ILcom/daaw/avee/Common/Func/Func;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
            "ZZ",
            "Ljava/lang/Class<",
            "*>;I",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Landroid/os/Handler;",
            ">;)V"
        }
    .end annotation

    .line 70
    invoke-static/range {p0 .. p8}, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification;->getOrCreateNotification(Landroid/content/Context;ILjava/lang/String;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;ILcom/daaw/avee/Common/Func/Func;)Landroid/app/Notification;

    move-result-object p2

    const-string p3, "notification"

    .line 73
    invoke-virtual {p0, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/NotificationManager;

    .line 74
    invoke-virtual {p0, p1, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public static updateNotificationViews(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;ILcom/daaw/avee/Common/Func/Func;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/widget/RemoteViews;",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
            "ZZ",
            "Ljava/lang/Class<",
            "*>;I",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Landroid/os/Handler;",
            ">;)V"
        }
    .end annotation

    const p3, 0x7f09011e

    const p6, 0x7f080148

    .line 188
    invoke-virtual {p1, p3, p6}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 240
    iget-object p3, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    .line 241
    iget-object p6, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    .line 242
    iget-object p2, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumName:Ljava/lang/String;

    const-string p7, "<unknown>"

    if-eqz p6, :cond_0

    .line 244
    invoke-virtual {p6, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const p6, 0x7f10018c

    .line 245
    invoke-virtual {p0, p6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p6

    :cond_1
    if-eqz p2, :cond_2

    .line 246
    invoke-virtual {p2, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    :cond_2
    const p2, 0x7f10018b

    .line 247
    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 249
    :cond_3
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p7, 0xb

    if-lt p2, p7, :cond_5

    if-eqz p4, :cond_4

    const p2, 0x7f0800c0

    goto :goto_0

    :cond_4
    const p2, 0x7f0800c3

    :goto_0
    const p4, 0x7f09007c

    .line 251
    invoke-virtual {p1, p4, p2}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 253
    new-instance p2, Landroid/content/ComponentName;

    invoke-direct {p2, p0, p5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 255
    new-instance p5, Landroid/content/Intent;

    const-string p7, "PREVIOUS_ACTION"

    invoke-direct {p5, p7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 256
    invoke-virtual {p5, p2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const p7, 0x7f09007f

    const/4 v0, 0x0

    .line 257
    invoke-static {p0, v0, p5, v0}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p5

    invoke-virtual {p1, p7, p5}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 260
    new-instance p5, Landroid/content/Intent;

    const-string p7, "TOGGLE_PAUSE_ACTION"

    invoke-direct {p5, p7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 261
    invoke-virtual {p5, p2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 262
    invoke-static {p0, v0, p5, v0}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p5

    invoke-virtual {p1, p4, p5}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 264
    new-instance p4, Landroid/content/Intent;

    const-string p5, "NEXT_ACTION"

    invoke-direct {p4, p5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 265
    invoke-virtual {p4, p2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const p5, 0x7f090079

    .line 266
    invoke-static {p0, v0, p4, v0}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p4

    invoke-virtual {p1, p5, p4}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 268
    new-instance p4, Landroid/content/Intent;

    const-string p5, "ACTIVITY_AND_SERVICE_EXIT_ACTION"

    invoke-direct {p4, p5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 269
    invoke-virtual {p4, p2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const p2, 0x7f090067

    .line 270
    invoke-static {p0, v0, p4, v0}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    :cond_5
    const p0, 0x7f090254

    .line 274
    invoke-virtual {p1, p0, p3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    const p0, 0x7f09024f

    .line 275
    invoke-virtual {p1, p0, p6}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    return-void
.end method

.method public static updateNotificationViewsImg(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/Common/Action1;Lcom/daaw/avee/Common/Func/Func;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/widget/RemoteViews;",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
            "Lcom/daaw/avee/Common/Action1<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Landroid/os/Handler;",
            ">;)V"
        }
    .end annotation

    .line 295
    invoke-static {}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtFactory;->getInstance()Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 297
    new-instance v3, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$2;

    invoke-direct {v3, p3}, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$2;-><init>(Lcom/daaw/avee/Common/Action1;)V

    .line 318
    sget-object v0, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification;->onRequestAlbumArtLarge:Lcom/daaw/avee/Common/Events/WeakEvent5;

    new-instance v2, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object p1, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->dataSource:Landroid/net/Uri;

    .line 320
    invoke-virtual {p2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtPath0Str()Ljava/lang/String;

    move-result-object p3

    .line 321
    invoke-virtual {p2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtPath1Str()Ljava/lang/String;

    move-result-object p4

    .line 322
    invoke-virtual {p2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtGenerateStr()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, p1, p3, p4, p2}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0xc8

    .line 324
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object v1, p0

    .line 318
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/Common/Events/WeakEvent5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
