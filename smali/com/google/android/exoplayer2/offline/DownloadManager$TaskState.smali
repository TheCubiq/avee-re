.class public final Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;
.super Ljava/lang/Object;
.source "DownloadManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/offline/DownloadManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TaskState"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState$State;
    }
.end annotation


# static fields
.field public static final STATE_CANCELED:I = 0x3

.field public static final STATE_COMPLETED:I = 0x2

.field public static final STATE_FAILED:I = 0x4

.field public static final STATE_QUEUED:I = 0x0

.field public static final STATE_STARTED:I = 0x1


# instance fields
.field public final action:Lcom/google/android/exoplayer2/offline/DownloadAction;

.field public final downloadPercentage:F

.field public final downloadedBytes:J

.field public final error:Ljava/lang/Throwable;

.field public final state:I

.field public final taskId:I


# direct methods
.method private constructor <init>(ILcom/google/android/exoplayer2/offline/DownloadAction;IFJLjava/lang/Throwable;)V
    .locals 0

    .line 601
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 602
    iput p1, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;->taskId:I

    .line 603
    iput-object p2, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;->action:Lcom/google/android/exoplayer2/offline/DownloadAction;

    .line 604
    iput p3, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;->state:I

    .line 605
    iput p4, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;->downloadPercentage:F

    .line 606
    iput-wide p5, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;->downloadedBytes:J

    .line 607
    iput-object p7, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;->error:Ljava/lang/Throwable;

    return-void
.end method

.method synthetic constructor <init>(ILcom/google/android/exoplayer2/offline/DownloadAction;IFJLjava/lang/Throwable;Lcom/google/android/exoplayer2/offline/DownloadManager$1;)V
    .locals 0

    .line 532
    invoke-direct/range {p0 .. p7}, Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;-><init>(ILcom/google/android/exoplayer2/offline/DownloadAction;IFJLjava/lang/Throwable;)V

    return-void
.end method

.method public static getStateString(I)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    const-string p0, "FAILED"

    return-object p0

    .line 573
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_1
    const-string p0, "CANCELED"

    return-object p0

    :cond_2
    const-string p0, "COMPLETED"

    return-object p0

    :cond_3
    const-string p0, "STARTED"

    return-object p0

    :cond_4
    const-string p0, "QUEUED"

    return-object p0
.end method
