.class public Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;
.super Landroid/appwidget/AppWidgetProvider;
.source "MediaAppWidgetProvider.java"


# static fields
.field private static sInstance:Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    .line 39
    invoke-static {}, Lcom/daaw/avee/Design/WidgetAndNotificationDesign;->createInstance()Lcom/daaw/avee/Design/WidgetAndNotificationDesign;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;Landroid/content/Context;[ILandroid/widget/RemoteViews;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->pushUpdate(Landroid/content/Context;[ILandroid/widget/RemoteViews;)V

    return-void
.end method

.method private defaultAppWidget(Landroid/content/Context;[ILjava/lang/Class;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "[I",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 58
    new-instance v8, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0c00aa

    invoke-direct {v8, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 60
    sget-object v3, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v8

    move-object v6, p3

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->updateNotificationViews(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;I)V

    .line 62
    sget-object p3, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    new-instance v0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$1;

    invoke-direct {v0, p0, v8, p1, p2}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$1;-><init>(Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;Landroid/widget/RemoteViews;Landroid/content/Context;[I)V

    const/4 v1, 0x0

    invoke-static {p1, v8, p3, v0, v1}, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification;->updateNotificationViewsImg(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/Common/Action1;Lcom/daaw/avee/Common/Func/Func;)V

    .line 74
    invoke-direct {p0, p1, p2, v8}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->pushUpdate(Landroid/content/Context;[ILandroid/widget/RemoteViews;)V

    return-void
.end method

.method public static declared-synchronized getInstance()Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;
    .locals 2

    const-class v0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;

    monitor-enter v0

    .line 31
    :try_start_0
    sget-object v1, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->sInstance:Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;

    if-nez v1, :cond_0

    .line 32
    new-instance v1, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;-><init>()V

    sput-object v1, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->sInstance:Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;

    .line 34
    :cond_0
    sget-object v1, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->sInstance:Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private hasInstances(Landroid/content/Context;)Z
    .locals 3

    .line 157
    invoke-static {p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v0

    .line 158
    new-instance v1, Landroid/content/ComponentName;

    .line 159
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 158
    invoke-virtual {v0, v1}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    move-result-object p1

    .line 160
    array-length p1, p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private pushUpdate(Landroid/content/Context;[ILandroid/widget/RemoteViews;)V
    .locals 2

    .line 145
    invoke-static {p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v0

    if-eqz p2, :cond_0

    .line 147
    invoke-virtual {v0, p2, p3}, Landroid/appwidget/AppWidgetManager;->updateAppWidget([ILandroid/widget/RemoteViews;)V

    goto :goto_0

    .line 149
    :cond_0
    new-instance p2, Landroid/content/ComponentName;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {p2, p1, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p2, p3}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(Landroid/content/ComponentName;Landroid/widget/RemoteViews;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public notifyChange(Landroid/content/Context;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
            "ZZ",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 133
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->hasInstances(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move-object v7, p5

    .line 134
    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->performUpdate(Landroid/content/Context;[ILcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;)V

    :cond_0
    return-void
.end method

.method public onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 1

    .line 44
    const-class p2, Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-direct {p0, p1, p3, p2}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->defaultAppWidget(Landroid/content/Context;[ILjava/lang/Class;)V

    .line 47
    new-instance p2, Landroid/content/Intent;

    const-string v0, "APP_WIDGET_UPDATE_ACTION"

    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "appWidgetIds"

    .line 48
    invoke-virtual {p2, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    const/high16 p3, 0x40000000    # 2.0f

    .line 49
    invoke-virtual {p2, p3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 50
    invoke-virtual {p1, p2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method performUpdate(Landroid/content/Context;[ILcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "[I",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
            "ZZ",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 89
    new-instance v8, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0c00aa

    invoke-direct {v8, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v8

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    .line 91
    invoke-virtual/range {v0 .. v7}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->updateNotificationViews(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;I)V

    .line 93
    new-instance p4, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$2;

    invoke-direct {p4, p0, v8, p1, p2}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$2;-><init>(Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;Landroid/widget/RemoteViews;Landroid/content/Context;[I)V

    const/4 p5, 0x0

    invoke-static {p1, v8, p3, p4, p5}, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification;->updateNotificationViewsImg(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/Common/Action1;Lcom/daaw/avee/Common/Func/Func;)V

    .line 105
    invoke-direct {p0, p1, p2, v8}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->pushUpdate(Landroid/content/Context;[ILandroid/widget/RemoteViews;)V

    return-void
.end method

.method public updateNotificationViews(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/widget/RemoteViews;",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
            "ZZ",
            "Ljava/lang/Class<",
            "*>;I)V"
        }
    .end annotation

    const/4 v7, 0x0

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move v4, p5

    move-object v5, p6

    move v6, p7

    .line 116
    invoke-static/range {v0 .. v7}, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification;->updateNotificationViews(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;ILcom/daaw/avee/Common/Func/Func;)V

    const p3, 0x7f090067

    const/16 p4, 0x8

    .line 118
    invoke-virtual {p2, p3, p4}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 120
    new-instance p3, Landroid/content/Intent;

    const-class p4, Lcom/daaw/avee/MainActivity;

    invoke-direct {p3, p1, p4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 p4, 0x20000

    .line 121
    invoke-virtual {p3, p4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const/4 p4, 0x0

    .line 122
    invoke-static {p1, p4, p3, p4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    const p3, 0x7f09004d

    .line 125
    invoke-virtual {p2, p3, p1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    return-void
.end method
