.class public final Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;
.super Ljava/lang/Object;
.source "DefaultLoadControl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/DefaultLoadControl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private allocator:Lcom/google/android/exoplayer2/upstream/DefaultAllocator;

.field private bufferForPlaybackAfterRebufferMs:I

.field private bufferForPlaybackMs:I

.field private maxBufferMs:I

.field private minBufferMs:I

.field private prioritizeTimeOverSizeThresholds:Z

.field private priorityTaskManager:Lcom/google/android/exoplayer2/util/PriorityTaskManager;

.field private targetBufferBytes:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 77
    iput-object v0, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->allocator:Lcom/google/android/exoplayer2/upstream/DefaultAllocator;

    const/16 v1, 0x3a98

    .line 78
    iput v1, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->minBufferMs:I

    const v1, 0xc350

    .line 79
    iput v1, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->maxBufferMs:I

    const/16 v1, 0x9c4

    .line 80
    iput v1, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->bufferForPlaybackMs:I

    const/16 v1, 0x1388

    .line 81
    iput v1, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->bufferForPlaybackAfterRebufferMs:I

    const/4 v1, -0x1

    .line 82
    iput v1, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->targetBufferBytes:I

    const/4 v1, 0x1

    .line 83
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->prioritizeTimeOverSizeThresholds:Z

    .line 84
    iput-object v0, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->priorityTaskManager:Lcom/google/android/exoplayer2/util/PriorityTaskManager;

    return-void
.end method


# virtual methods
.method public createDefaultLoadControl()Lcom/google/android/exoplayer2/DefaultLoadControl;
    .locals 12

    .line 158
    iget-object v0, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->allocator:Lcom/google/android/exoplayer2/upstream/DefaultAllocator;

    if-nez v0, :cond_0

    .line 159
    new-instance v0, Lcom/google/android/exoplayer2/upstream/DefaultAllocator;

    const/4 v1, 0x1

    const/high16 v2, 0x10000

    invoke-direct {v0, v1, v2}, Lcom/google/android/exoplayer2/upstream/DefaultAllocator;-><init>(ZI)V

    iput-object v0, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->allocator:Lcom/google/android/exoplayer2/upstream/DefaultAllocator;

    .line 161
    :cond_0
    new-instance v0, Lcom/google/android/exoplayer2/DefaultLoadControl;

    iget-object v4, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->allocator:Lcom/google/android/exoplayer2/upstream/DefaultAllocator;

    iget v5, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->minBufferMs:I

    iget v6, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->maxBufferMs:I

    iget v7, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->bufferForPlaybackMs:I

    iget v8, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->bufferForPlaybackAfterRebufferMs:I

    iget v9, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->targetBufferBytes:I

    iget-boolean v10, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->prioritizeTimeOverSizeThresholds:Z

    iget-object v11, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->priorityTaskManager:Lcom/google/android/exoplayer2/util/PriorityTaskManager;

    move-object v3, v0

    invoke-direct/range {v3 .. v11}, Lcom/google/android/exoplayer2/DefaultLoadControl;-><init>(Lcom/google/android/exoplayer2/upstream/DefaultAllocator;IIIIIZLcom/google/android/exoplayer2/util/PriorityTaskManager;)V

    return-object v0
.end method

.method public setAllocator(Lcom/google/android/exoplayer2/upstream/DefaultAllocator;)Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->allocator:Lcom/google/android/exoplayer2/upstream/DefaultAllocator;

    return-object p0
.end method

.method public setBufferDurationsMs(IIII)Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;
    .locals 0

    .line 117
    iput p1, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->minBufferMs:I

    .line 118
    iput p2, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->maxBufferMs:I

    .line 119
    iput p3, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->bufferForPlaybackMs:I

    .line 120
    iput p4, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->bufferForPlaybackAfterRebufferMs:I

    return-object p0
.end method

.method public setPrioritizeTimeOverSizeThresholds(Z)Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;
    .locals 0

    .line 146
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->prioritizeTimeOverSizeThresholds:Z

    return-object p0
.end method

.method public setPriorityTaskManager(Lcom/google/android/exoplayer2/util/PriorityTaskManager;)Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->priorityTaskManager:Lcom/google/android/exoplayer2/util/PriorityTaskManager;

    return-object p0
.end method

.method public setTargetBufferBytes(I)Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;
    .locals 0

    .line 133
    iput p1, p0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->targetBufferBytes:I

    return-object p0
.end method
