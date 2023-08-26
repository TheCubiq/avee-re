.class public final Lcom/google/android/exoplayer2/ui/DownloadNotificationUtil;
.super Ljava/lang/Object;
.source "DownloadNotificationUtil.java"


# static fields
.field private static final NULL_STRING_ID:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static buildDownloadCompletedNotification(Landroid/content/Context;ILjava/lang/String;Landroid/app/PendingIntent;Ljava/lang/String;)Landroid/app/Notification;
    .locals 6

    .line 105
    sget v5, Lcom/google/android/exoplayer2/ui/R$string;->exo_download_completed:I

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 106
    invoke-static/range {v0 .. v5}, Lcom/google/android/exoplayer2/ui/DownloadNotificationUtil;->newNotificationBuilder(Landroid/content/Context;ILjava/lang/String;Landroid/app/PendingIntent;Ljava/lang/String;I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p0

    .line 108
    invoke-virtual {p0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p0

    return-object p0
.end method

.method public static buildDownloadFailedNotification(Landroid/content/Context;ILjava/lang/String;Landroid/app/PendingIntent;Ljava/lang/String;)Landroid/app/Notification;
    .locals 6

    .line 128
    sget v5, Lcom/google/android/exoplayer2/ui/R$string;->exo_download_failed:I

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 129
    invoke-static/range {v0 .. v5}, Lcom/google/android/exoplayer2/ui/DownloadNotificationUtil;->newNotificationBuilder(Landroid/content/Context;ILjava/lang/String;Landroid/app/PendingIntent;Ljava/lang/String;I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p0

    .line 131
    invoke-virtual {p0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p0

    return-object p0
.end method

.method public static buildProgressNotification(Landroid/content/Context;ILjava/lang/String;Landroid/app/PendingIntent;Ljava/lang/String;[Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;)Landroid/app/Notification;
    .locals 15

    move-object/from16 v0, p5

    .line 58
    array-length v1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    :goto_0
    if-ge v5, v1, :cond_4

    aget-object v9, v0, v5

    .line 59
    iget-object v10, v9, Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;->action:Lcom/google/android/exoplayer2/offline/DownloadAction;

    iget-boolean v10, v10, Lcom/google/android/exoplayer2/offline/DownloadAction;->isRemoveAction:Z

    if-nez v10, :cond_3

    iget v10, v9, Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;->state:I

    if-eq v10, v2, :cond_0

    goto :goto_2

    .line 62
    :cond_0
    iget v10, v9, Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;->downloadPercentage:F

    const/high16 v11, -0x40800000    # -1.0f

    cmpl-float v10, v10, v11

    if-eqz v10, :cond_1

    .line 64
    iget v8, v9, Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;->downloadPercentage:F

    add-float/2addr v4, v8

    const/4 v8, 0x0

    .line 66
    :cond_1
    iget-wide v9, v9, Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;->downloadedBytes:J

    const-wide/16 v11, 0x0

    cmp-long v13, v9, v11

    if-lez v13, :cond_2

    const/4 v9, 0x1

    goto :goto_1

    :cond_2
    const/4 v9, 0x0

    :goto_1
    or-int/2addr v7, v9

    add-int/lit8 v6, v6, 0x1

    :cond_3
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    if-lez v6, :cond_5

    const/4 v1, 0x1

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_6

    .line 71
    sget v0, Lcom/google/android/exoplayer2/ui/R$string;->exo_download_downloading:I

    :goto_4
    move v14, v0

    goto :goto_5

    :cond_6
    array-length v0, v0

    if-lez v0, :cond_7

    sget v0, Lcom/google/android/exoplayer2/ui/R$string;->exo_download_removing:I

    goto :goto_4

    :cond_7
    const/4 v14, 0x0

    :goto_5
    move-object v9, p0

    move/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    .line 76
    invoke-static/range {v9 .. v14}, Lcom/google/android/exoplayer2/ui/DownloadNotificationUtil;->newNotificationBuilder(Landroid/content/Context;ILjava/lang/String;Landroid/app/PendingIntent;Ljava/lang/String;I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    if-eqz v1, :cond_8

    int-to-float v5, v6

    div-float/2addr v4, v5

    float-to-int v4, v4

    goto :goto_6

    :cond_8
    const/4 v4, 0x0

    :goto_6
    if-eqz v1, :cond_a

    if-eqz v8, :cond_9

    if-eqz v7, :cond_9

    goto :goto_7

    :cond_9
    const/4 v1, 0x0

    goto :goto_8

    :cond_a
    :goto_7
    const/4 v1, 0x1

    :goto_8
    const/16 v5, 0x64

    .line 82
    invoke-virtual {v0, v5, v4, v1}, Landroidx/core/app/NotificationCompat$Builder;->setProgress(IIZ)Landroidx/core/app/NotificationCompat$Builder;

    .line 83
    invoke-virtual {v0, v2}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 84
    invoke-virtual {v0, v3}, Landroidx/core/app/NotificationCompat$Builder;->setShowWhen(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 85
    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method private static newNotificationBuilder(Landroid/content/Context;ILjava/lang/String;Landroid/app/PendingIntent;Ljava/lang/String;I)Landroidx/core/app/NotificationCompat$Builder;
    .locals 1

    .line 141
    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {v0, p0, p2}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 142
    invoke-virtual {v0, p1}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    if-eqz p5, :cond_0

    .line 144
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, p5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    :cond_0
    if-eqz p3, :cond_1

    .line 147
    invoke-virtual {p1, p3}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    :cond_1
    if-eqz p4, :cond_2

    .line 150
    new-instance p0, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {p0}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-virtual {p0, p4}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    :cond_2
    return-object p1
.end method
