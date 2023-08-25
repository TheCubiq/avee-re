.class public Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;
.super Landroid/appwidget/AppWidgetProvider;
.source ""


# static fields
.field public static a:Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    invoke-static {}, Lcom/daaw/ix1;->a()Lcom/daaw/ix1;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;Landroid/content/Context;[ILandroid/widget/RemoteViews;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->g(Landroid/content/Context;[ILandroid/widget/RemoteViews;)V

    return-void
.end method

.method public static declared-synchronized c()Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;
    .locals 2

    const-class v0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->a:Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;-><init>()V

    sput-object v1, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->a:Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;

    :cond_0
    sget-object v1, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->a:Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public final b(Landroid/content/Context;[ILjava/lang/Class;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "[I",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    new-instance v8, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0c00bd

    invoke-direct {v8, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    sget-object v9, Lcom/daaw/tx0;->h:Lcom/daaw/tx0$b;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v8

    move-object v3, v9

    move-object v6, p3

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->h(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/tx0$b;ZZLjava/lang/Class;I)V

    new-instance p3, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$a;

    invoke-direct {p3, p0, v8, p1, p2}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$a;-><init>(Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;Landroid/widget/RemoteViews;Landroid/content/Context;[I)V

    const/4 v0, 0x0

    invoke-static {p1, v8, v9, p3, v0}, Lcom/daaw/wo0;->l(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/tx0$b;Lcom/daaw/e0;Lcom/daaw/w40;)V

    invoke-virtual {p0, p1, p2, v8}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->g(Landroid/content/Context;[ILandroid/widget/RemoteViews;)V

    return-void
.end method

.method public final d(Landroid/content/Context;)Z
    .locals 3

    invoke-static {p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v0

    new-instance v1, Landroid/content/ComponentName;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    move-result-object p1

    array-length p1, p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public e(Landroid/content/Context;Lcom/daaw/tx0$b;ZZLjava/lang/Class;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/tx0$b;",
            "ZZ",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move-object v7, p5

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->f(Landroid/content/Context;[ILcom/daaw/tx0$b;ZZLjava/lang/Class;)V

    :cond_0
    return-void
.end method

.method public f(Landroid/content/Context;[ILcom/daaw/tx0$b;ZZLjava/lang/Class;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "[I",
            "Lcom/daaw/tx0$b;",
            "ZZ",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    new-instance v8, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0c00bd

    invoke-direct {v8, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v8

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->h(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/tx0$b;ZZLjava/lang/Class;I)V

    new-instance p4, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$b;

    invoke-direct {p4, p0, v8, p1, p2}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$b;-><init>(Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;Landroid/widget/RemoteViews;Landroid/content/Context;[I)V

    const/4 p5, 0x0

    invoke-static {p1, v8, p3, p4, p5}, Lcom/daaw/wo0;->l(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/tx0$b;Lcom/daaw/e0;Lcom/daaw/w40;)V

    invoke-virtual {p0, p1, p2, v8}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->g(Landroid/content/Context;[ILandroid/widget/RemoteViews;)V

    return-void
.end method

.method public final g(Landroid/content/Context;[ILandroid/widget/RemoteViews;)V
    .locals 2

    invoke-static {p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v0

    if-eqz p2, :cond_0

    invoke-virtual {v0, p2, p3}, Landroid/appwidget/AppWidgetManager;->updateAppWidget([ILandroid/widget/RemoteViews;)V

    goto :goto_0

    :cond_0
    new-instance p2, Landroid/content/ComponentName;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {p2, p1, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p2, p3}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(Landroid/content/ComponentName;Landroid/widget/RemoteViews;)V

    :goto_0
    return-void
.end method

.method public h(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/tx0$b;ZZLjava/lang/Class;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/widget/RemoteViews;",
            "Lcom/daaw/tx0$b;",
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

    invoke-static/range {v0 .. v7}, Lcom/daaw/wo0;->k(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/tx0$b;ZZLjava/lang/Class;ILcom/daaw/w40;)V

    const p3, 0x7f090081

    const/16 p4, 0x8

    invoke-virtual {p2, p3, p4}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    new-instance p3, Landroid/content/Intent;

    const-class p4, Lcom/daaw/avee/MainActivity;

    invoke-direct {p3, p1, p4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 p4, 0x20000

    invoke-virtual {p3, p4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const/4 p4, 0x0

    const/high16 p5, 0x4000000

    invoke-static {p1, p4, p3, p5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    const p3, 0x7f090059

    invoke-virtual {p2, p3, p1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    return-void
.end method

.method public onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 1

    const-class p2, Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-virtual {p0, p1, p3, p2}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->b(Landroid/content/Context;[ILjava/lang/Class;)V

    new-instance p2, Landroid/content/Intent;

    const-string v0, "APP_WIDGET_UPDATE_ACTION"

    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "appWidgetIds"

    invoke-virtual {p2, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    const/high16 p3, 0x40000000    # 2.0f

    invoke-virtual {p2, p3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p1, p2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method
