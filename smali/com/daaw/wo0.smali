.class public Lcom/daaw/wo0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Lcom/daaw/uw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/uw1<",
            "Landroid/content/Context;",
            "Lcom/daaw/i2;",
            "Lcom/daaw/af0;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/uw1;

    invoke-direct {v0}, Lcom/daaw/uw1;-><init>()V

    sput-object v0, Lcom/daaw/wo0;->a:Lcom/daaw/uw1;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/w40;Landroid/widget/RemoteViews;Landroid/content/Context;Ljava/lang/String;ILandroid/graphics/Bitmap;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/daaw/wo0;->h(Lcom/daaw/w40;Landroid/widget/RemoteViews;Landroid/content/Context;Ljava/lang/String;ILandroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic b(Landroid/graphics/Bitmap;Landroid/widget/RemoteViews;Landroid/content/Context;Ljava/lang/String;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/daaw/wo0;->g(Landroid/graphics/Bitmap;Landroid/widget/RemoteViews;Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method public static c(Landroid/content/Context;I)V
    .locals 1

    const-string v0, "notification"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/NotificationManager;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Landroid/app/NotificationManager;->cancel(I)V

    :cond_0
    return-void
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    const v0, 0x7f1001ea

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/app/NotificationChannel;

    const/4 v2, 0x2

    const-string v3, "Playback Service"

    invoke-direct {v1, v0, v3, v2}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/app/NotificationChannel;->setLockscreenVisibility(I)V

    const-string v2, "notification"

    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/NotificationManager;

    if-eqz p0, :cond_0

    invoke-virtual {p0, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_0
    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static e(Landroid/content/Context;ILjava/lang/String;Lcom/daaw/tx0$b;ZZLjava/lang/Class;ILcom/daaw/w40;)Landroid/app/Notification;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/lang/String;",
            "Lcom/daaw/tx0$b;",
            "ZZ",
            "Ljava/lang/Class<",
            "*>;I",
            "Lcom/daaw/w40<",
            "Landroid/os/Handler;",
            ">;)",
            "Landroid/app/Notification;"
        }
    .end annotation

    move-object v8, p0

    new-instance v9, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0c00bb

    invoke-direct {v9, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    move-object v0, p0

    move-object v1, v9

    move-object v2, p3

    move v3, p4

    move v4, p5

    move-object/from16 v5, p6

    move/from16 v6, p7

    move-object/from16 v7, p8

    invoke-static/range {v0 .. v7}, Lcom/daaw/wo0;->k(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/tx0$b;ZZLjava/lang/Class;ILcom/daaw/w40;)V

    move-object v4, p2

    invoke-static {p0, p2}, Lcom/daaw/wo0;->i(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v6

    invoke-virtual {v6, v9}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    new-instance v7, Lcom/daaw/uo0;

    move-object v0, v7

    move-object/from16 v1, p8

    move-object v2, v9

    move-object v3, p0

    move v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/daaw/uo0;-><init>(Lcom/daaw/w40;Landroid/widget/RemoteViews;Landroid/content/Context;Ljava/lang/String;I)V

    move-object v0, p3

    invoke-static {p0, v9, p3, v7, v1}, Lcom/daaw/wo0;->l(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/tx0$b;Lcom/daaw/e0;Lcom/daaw/w40;)V

    invoke-virtual {v6}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public static f(Landroid/content/Context;ILjava/lang/String;Lcom/daaw/tx0$b;ZZLjava/lang/Class;ILcom/daaw/w40;)Landroid/app/Notification;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/lang/String;",
            "Lcom/daaw/tx0$b;",
            "ZZ",
            "Ljava/lang/Class<",
            "*>;I",
            "Lcom/daaw/w40<",
            "Landroid/os/Handler;",
            ">;)",
            "Landroid/app/Notification;"
        }
    .end annotation

    invoke-static/range {p0 .. p8}, Lcom/daaw/wo0;->e(Landroid/content/Context;ILjava/lang/String;Lcom/daaw/tx0$b;ZZLjava/lang/Class;ILcom/daaw/w40;)Landroid/app/Notification;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroid/graphics/Bitmap;Landroid/widget/RemoteViews;Landroid/content/Context;Ljava/lang/String;I)V
    .locals 1

    const v0, 0x7f090168

    if-eqz p0, :cond_0

    invoke-virtual {p1, v0, p0}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    goto :goto_0

    :cond_0
    const p0, 0x7f08016c

    invoke-virtual {p1, v0, p0}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    :goto_0
    invoke-static {p2, p3}, Lcom/daaw/wo0;->i(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object p0

    const-string p1, "notification"

    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    invoke-virtual {p1, p4, p0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public static synthetic h(Lcom/daaw/w40;Landroid/widget/RemoteViews;Landroid/content/Context;Ljava/lang/String;ILandroid/graphics/Bitmap;)V
    .locals 7

    invoke-interface {p0}, Lcom/daaw/w40;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/Handler;

    if-eqz p0, :cond_0

    new-instance v6, Lcom/daaw/vo0;

    move-object v0, v6

    move-object v1, p5

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/daaw/vo0;-><init>(Landroid/graphics/Bitmap;Landroid/widget/RemoteViews;Landroid/content/Context;Ljava/lang/String;I)V

    invoke-virtual {p0, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public static i(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/daaw/avee/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x20000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const/4 v1, 0x0

    const/high16 v2, 0x4000000

    invoke-static {p0, v1, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    new-instance v1, Landroid/app/Notification$Builder;

    invoke-direct {v1, p0, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/app/Notification$Builder;

    invoke-direct {v1, p0}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    :goto_0
    const p0, 0x7f0800f2

    invoke-virtual {v1, p0}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    return-object v1
.end method

.method public static j(Landroid/content/Context;ILjava/lang/String;Lcom/daaw/tx0$b;ZZLjava/lang/Class;ILcom/daaw/w40;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/lang/String;",
            "Lcom/daaw/tx0$b;",
            "ZZ",
            "Ljava/lang/Class<",
            "*>;I",
            "Lcom/daaw/w40<",
            "Landroid/os/Handler;",
            ">;)V"
        }
    .end annotation

    invoke-static/range {p0 .. p8}, Lcom/daaw/wo0;->f(Landroid/content/Context;ILjava/lang/String;Lcom/daaw/tx0$b;ZZLjava/lang/Class;ILcom/daaw/w40;)Landroid/app/Notification;

    move-result-object p2

    const-string p3, "notification"

    invoke-virtual {p0, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/NotificationManager;

    invoke-virtual {p0, p1, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public static k(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/tx0$b;ZZLjava/lang/Class;ILcom/daaw/w40;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/widget/RemoteViews;",
            "Lcom/daaw/tx0$b;",
            "ZZ",
            "Ljava/lang/Class<",
            "*>;I",
            "Lcom/daaw/w40<",
            "Landroid/os/Handler;",
            ">;)V"
        }
    .end annotation

    const p3, 0x7f090168

    const p6, 0x7f08016c

    invoke-virtual {p1, p3, p6}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    iget-object p3, p2, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    iget-object p6, p2, Lcom/daaw/tx0$b;->h:Ljava/lang/String;

    iget-object p2, p2, Lcom/daaw/tx0$b;->f:Ljava/lang/String;

    const-string p7, "<unknown>"

    if-eqz p6, :cond_0

    invoke-virtual {p6, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const p6, 0x7f1002c4

    invoke-virtual {p0, p6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p6

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p2, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    :cond_2
    const p2, 0x7f1002c3

    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    :cond_3
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-eqz p4, :cond_4

    const p4, 0x7f0800d7

    goto :goto_0

    :cond_4
    const p4, 0x7f0800da

    :goto_0
    const p7, 0x7f090096

    invoke-virtual {p1, p7, p4}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    new-instance p4, Landroid/content/ComponentName;

    invoke-direct {p4, p0, p5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance p5, Landroid/content/Intent;

    const-string v0, "PREVIOUS_ACTION"

    invoke-direct {p5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x17

    const/4 v1, 0x0

    if-lt p2, v0, :cond_5

    const/high16 p2, 0x4000000

    goto :goto_1

    :cond_5
    const/4 p2, 0x0

    :goto_1
    invoke-virtual {p5, p4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const v0, 0x7f090099

    invoke-static {p0, v1, p5, p2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p5

    invoke-virtual {p1, v0, p5}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    new-instance p5, Landroid/content/Intent;

    const-string v0, "TOGGLE_PAUSE_ACTION"

    invoke-direct {p5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p5, p4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    invoke-static {p0, v1, p5, p2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p5

    invoke-virtual {p1, p7, p5}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    new-instance p5, Landroid/content/Intent;

    const-string p7, "NEXT_ACTION"

    invoke-direct {p5, p7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p5, p4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const p7, 0x7f090093

    invoke-static {p0, v1, p5, p2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p5

    invoke-virtual {p1, p7, p5}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    new-instance p5, Landroid/content/Intent;

    const-string p7, "ACTIVITY_AND_SERVICE_EXIT_ACTION"

    invoke-direct {p5, p7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p5, p4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const p4, 0x7f090081

    invoke-static {p0, v1, p5, p2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    invoke-virtual {p1, p4, p0}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    const p0, 0x7f0902f4

    invoke-virtual {p1, p0, p3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    const p0, 0x7f0902ef

    invoke-virtual {p1, p0, p6}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    return-void
.end method

.method public static l(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/daaw/tx0$b;Lcom/daaw/e0;Lcom/daaw/w40;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/widget/RemoteViews;",
            "Lcom/daaw/tx0$b;",
            "Lcom/daaw/e0<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/w40<",
            "Landroid/os/Handler;",
            ">;)V"
        }
    .end annotation

    new-instance p1, Lcom/daaw/g2;

    invoke-direct {p1}, Lcom/daaw/g2;-><init>()V

    new-instance v3, Lcom/daaw/wo0$a;

    invoke-direct {v3, p3}, Lcom/daaw/wo0$a;-><init>(Lcom/daaw/e0;)V

    sget-object v0, Lcom/daaw/wo0;->a:Lcom/daaw/uw1;

    new-instance v2, Lcom/daaw/i2;

    iget-object p1, p2, Lcom/daaw/tx0$b;->a:Landroid/net/Uri;

    invoke-virtual {p2}, Lcom/daaw/tx0$b;->d()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Lcom/daaw/tx0$b;->b()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, p1, p3, p2}, Lcom/daaw/i2;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0xc8

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/uw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
