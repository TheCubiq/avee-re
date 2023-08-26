.class public final Lcom/google/android/exoplayer2/audio/DefaultAudioSink;
.super Ljava/lang/Object;
.source "DefaultAudioSink.java"

# interfaces
.implements Lcom/google/android/exoplayer2/audio/AudioSink;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PositionTrackerListener;,
        Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;,
        Lcom/google/android/exoplayer2/audio/DefaultAudioSink$DefaultAudioProcessorChain;,
        Lcom/google/android/exoplayer2/audio/DefaultAudioSink$AudioProcessorChain;,
        Lcom/google/android/exoplayer2/audio/DefaultAudioSink$InvalidAudioTrackTimestampException;
    }
.end annotation


# static fields
.field private static final BUFFER_MULTIPLICATION_FACTOR:I = 0x4

.field private static final ERROR_BAD_VALUE:I = -0x2

.field private static final MAX_BUFFER_DURATION_US:J = 0xb71b0L

.field private static final MIN_BUFFER_DURATION_US:J = 0x3d090L

.field private static final MODE_STATIC:I = 0x0

.field private static final MODE_STREAM:I = 0x1

.field private static final PASSTHROUGH_BUFFER_DURATION_US:J = 0x3d090L

.field private static final START_IN_SYNC:I = 0x1

.field private static final START_NEED_SYNC:I = 0x2

.field private static final START_NOT_SET:I = 0x0

.field private static final STATE_INITIALIZED:I = 0x1

.field private static final TAG:Ljava/lang/String; = "AudioTrack"

.field private static final WRITE_NON_BLOCKING:I = 0x1

.field public static enablePreV21AudioSessionWorkaround:Z = false

.field public static failOnSpuriousAudioTimestamp:Z = false


# instance fields
.field private activeAudioProcessors:[Lcom/google/android/exoplayer2/audio/AudioProcessor;

.field private afterDrainPlaybackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

.field private audioAttributes:Lcom/google/android/exoplayer2/audio/AudioAttributes;

.field private final audioCapabilities:Lcom/google/android/exoplayer2/audio/AudioCapabilities;

.field private final audioProcessorChain:Lcom/google/android/exoplayer2/audio/DefaultAudioSink$AudioProcessorChain;

.field private audioSessionId:I

.field private audioTrack:Landroid/media/AudioTrack;

.field private final audioTrackPositionTracker:Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;

.field private avSyncHeader:Ljava/nio/ByteBuffer;

.field private bufferSize:I

.field private bytesUntilNextAvSync:I

.field private canApplyPlaybackParameters:Z

.field private final channelMappingAudioProcessor:Lcom/google/android/exoplayer2/audio/ChannelMappingAudioProcessor;

.field private drainingAudioProcessorIndex:I

.field private final enableConvertHighResIntPcmToFloat:Z

.field private framesPerEncodedSample:I

.field private handledEndOfStream:Z

.field private inputBuffer:Ljava/nio/ByteBuffer;

.field private inputSampleRate:I

.field private isInputPcm:Z

.field private keepSessionIdAudioTrack:Landroid/media/AudioTrack;

.field private lastFeedElapsedRealtimeMs:J

.field private listener:Lcom/google/android/exoplayer2/audio/AudioSink$Listener;

.field private outputBuffer:Ljava/nio/ByteBuffer;

.field private outputBuffers:[Ljava/nio/ByteBuffer;

.field private outputChannelConfig:I

.field private outputEncoding:I

.field private outputPcmFrameSize:I

.field private outputSampleRate:I

.field private pcmFrameSize:I

.field private playbackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

.field private final playbackParametersCheckpoints:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;",
            ">;"
        }
    .end annotation
.end field

.field private playbackParametersOffsetUs:J

.field private playbackParametersPositionUs:J

.field private playing:Z

.field private preV21OutputBuffer:[B

.field private preV21OutputBufferOffset:I

.field private processingEnabled:Z

.field private final releasingConditionVariable:Landroid/os/ConditionVariable;

.field private shouldConvertHighResIntPcmToFloat:Z

.field private startMediaTimeState:I

.field private startMediaTimeUs:J

.field private submittedEncodedFrames:J

.field private submittedPcmBytes:J

.field private final toFloatPcmAvailableAudioProcessors:[Lcom/google/android/exoplayer2/audio/AudioProcessor;

.field private final toIntPcmAvailableAudioProcessors:[Lcom/google/android/exoplayer2/audio/AudioProcessor;

.field private final trimmingAudioProcessor:Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;

.field private tunneling:Z

.field private volume:F

.field private writtenEncodedFrames:J

.field private writtenPcmBytes:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/audio/AudioCapabilities;Lcom/google/android/exoplayer2/audio/DefaultAudioSink$AudioProcessorChain;Z)V
    .locals 4

    .line 336
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 337
    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioCapabilities:Lcom/google/android/exoplayer2/audio/AudioCapabilities;

    .line 338
    invoke-static {p2}, Lcom/google/android/exoplayer2/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$AudioProcessorChain;

    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioProcessorChain:Lcom/google/android/exoplayer2/audio/DefaultAudioSink$AudioProcessorChain;

    .line 339
    iput-boolean p3, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->enableConvertHighResIntPcmToFloat:Z

    .line 340
    new-instance p1, Landroid/os/ConditionVariable;

    const/4 p3, 0x1

    invoke-direct {p1, p3}, Landroid/os/ConditionVariable;-><init>(Z)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->releasingConditionVariable:Landroid/os/ConditionVariable;

    .line 341
    new-instance p1, Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;

    new-instance v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PositionTrackerListener;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PositionTrackerListener;-><init>(Lcom/google/android/exoplayer2/audio/DefaultAudioSink;Lcom/google/android/exoplayer2/audio/DefaultAudioSink$1;)V

    invoke-direct {p1, v0}, Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;-><init>(Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker$Listener;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrackPositionTracker:Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;

    .line 342
    new-instance p1, Lcom/google/android/exoplayer2/audio/ChannelMappingAudioProcessor;

    invoke-direct {p1}, Lcom/google/android/exoplayer2/audio/ChannelMappingAudioProcessor;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->channelMappingAudioProcessor:Lcom/google/android/exoplayer2/audio/ChannelMappingAudioProcessor;

    .line 343
    new-instance p1, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;

    invoke-direct {p1}, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->trimmingAudioProcessor:Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;

    .line 344
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/google/android/exoplayer2/audio/AudioProcessor;

    .line 345
    new-instance v1, Lcom/google/android/exoplayer2/audio/ResamplingAudioProcessor;

    invoke-direct {v1}, Lcom/google/android/exoplayer2/audio/ResamplingAudioProcessor;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->channelMappingAudioProcessor:Lcom/google/android/exoplayer2/audio/ChannelMappingAudioProcessor;

    aput-object v1, v0, p3

    iget-object v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->trimmingAudioProcessor:Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;

    const/4 v3, 0x2

    aput-object v1, v0, v3

    invoke-static {p1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 350
    invoke-interface {p2}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$AudioProcessorChain;->getAudioProcessors()[Lcom/google/android/exoplayer2/audio/AudioProcessor;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 352
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [Lcom/google/android/exoplayer2/audio/AudioProcessor;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/google/android/exoplayer2/audio/AudioProcessor;

    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->toIntPcmAvailableAudioProcessors:[Lcom/google/android/exoplayer2/audio/AudioProcessor;

    new-array p1, p3, [Lcom/google/android/exoplayer2/audio/AudioProcessor;

    .line 353
    new-instance p2, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;

    invoke-direct {p2}, Lcom/google/android/exoplayer2/audio/FloatResamplingAudioProcessor;-><init>()V

    aput-object p2, p1, v2

    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->toFloatPcmAvailableAudioProcessors:[Lcom/google/android/exoplayer2/audio/AudioProcessor;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 354
    iput p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->volume:F

    .line 355
    iput v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->startMediaTimeState:I

    .line 356
    sget-object p1, Lcom/google/android/exoplayer2/audio/AudioAttributes;->DEFAULT:Lcom/google/android/exoplayer2/audio/AudioAttributes;

    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioAttributes:Lcom/google/android/exoplayer2/audio/AudioAttributes;

    .line 357
    iput v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioSessionId:I

    .line 358
    sget-object p1, Lcom/google/android/exoplayer2/PlaybackParameters;->DEFAULT:Lcom/google/android/exoplayer2/PlaybackParameters;

    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    const/4 p1, -0x1

    .line 359
    iput p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->drainingAudioProcessorIndex:I

    new-array p1, v2, [Lcom/google/android/exoplayer2/audio/AudioProcessor;

    .line 360
    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->activeAudioProcessors:[Lcom/google/android/exoplayer2/audio/AudioProcessor;

    new-array p1, v2, [Ljava/nio/ByteBuffer;

    .line 361
    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputBuffers:[Ljava/nio/ByteBuffer;

    .line 362
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersCheckpoints:Ljava/util/ArrayDeque;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/audio/AudioCapabilities;[Lcom/google/android/exoplayer2/audio/AudioProcessor;)V
    .locals 1

    const/4 v0, 0x0

    .line 295
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;-><init>(Lcom/google/android/exoplayer2/audio/AudioCapabilities;[Lcom/google/android/exoplayer2/audio/AudioProcessor;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/audio/AudioCapabilities;[Lcom/google/android/exoplayer2/audio/AudioProcessor;Z)V
    .locals 1

    .line 314
    new-instance v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$DefaultAudioProcessorChain;

    invoke-direct {v0, p2}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$DefaultAudioProcessorChain;-><init>([Lcom/google/android/exoplayer2/audio/AudioProcessor;)V

    invoke-direct {p0, p1, v0, p3}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;-><init>(Lcom/google/android/exoplayer2/audio/AudioCapabilities;Lcom/google/android/exoplayer2/audio/DefaultAudioSink$AudioProcessorChain;Z)V

    return-void
.end method

.method static synthetic access$1000(Lcom/google/android/exoplayer2/audio/DefaultAudioSink;)J
    .locals 2

    .line 50
    iget-wide v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->lastFeedElapsedRealtimeMs:J

    return-wide v0
.end method

.method static synthetic access$300(Lcom/google/android/exoplayer2/audio/DefaultAudioSink;)Landroid/os/ConditionVariable;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->releasingConditionVariable:Landroid/os/ConditionVariable;

    return-object p0
.end method

.method static synthetic access$600(Lcom/google/android/exoplayer2/audio/DefaultAudioSink;)J
    .locals 2

    .line 50
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->getSubmittedFrames()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic access$700(Lcom/google/android/exoplayer2/audio/DefaultAudioSink;)J
    .locals 2

    .line 50
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->getWrittenFrames()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic access$900(Lcom/google/android/exoplayer2/audio/DefaultAudioSink;)Lcom/google/android/exoplayer2/audio/AudioSink$Listener;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->listener:Lcom/google/android/exoplayer2/audio/AudioSink$Listener;

    return-object p0
.end method

.method private applySkipping(J)J
    .locals 2

    .line 1066
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioProcessorChain:Lcom/google/android/exoplayer2/audio/DefaultAudioSink$AudioProcessorChain;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$AudioProcessorChain;->getSkippedOutputFrameCount()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->framesToDurationUs(J)J

    move-result-wide v0

    add-long/2addr p1, v0

    return-wide p1
.end method

.method private applySpeedup(J)J
    .locals 5

    const/4 v0, 0x0

    .line 1039
    :goto_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersCheckpoints:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersCheckpoints:Ljava/util/ArrayDeque;

    .line 1040
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;

    invoke-static {v1}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;->access$400(Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;)J

    move-result-wide v1

    cmp-long v3, p1, v1

    if-ltz v3, :cond_0

    .line 1041
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersCheckpoints:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    .line 1045
    invoke-static {v0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;->access$200(Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;)Lcom/google/android/exoplayer2/PlaybackParameters;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 1046
    invoke-static {v0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;->access$400(Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersPositionUs:J

    .line 1047
    invoke-static {v0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;->access$500(Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;)J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->startMediaTimeUs:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersOffsetUs:J

    .line 1050
    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    iget v0, v0, Lcom/google/android/exoplayer2/PlaybackParameters;->speed:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    .line 1051
    iget-wide v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersOffsetUs:J

    add-long/2addr p1, v0

    iget-wide v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersPositionUs:J

    sub-long/2addr p1, v0

    return-wide p1

    .line 1054
    :cond_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersCheckpoints:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1055
    iget-wide v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersOffsetUs:J

    iget-object v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioProcessorChain:Lcom/google/android/exoplayer2/audio/DefaultAudioSink$AudioProcessorChain;

    iget-wide v3, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersPositionUs:J

    sub-long/2addr p1, v3

    .line 1056
    invoke-interface {v2, p1, p2}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$AudioProcessorChain;->getMediaDuration(J)J

    move-result-wide p1

    :goto_1
    add-long/2addr v0, p1

    return-wide v0

    .line 1060
    :cond_3
    iget-wide v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersOffsetUs:J

    iget-wide v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersPositionUs:J

    sub-long/2addr p1, v2

    iget-object v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    iget v2, v2, Lcom/google/android/exoplayer2/PlaybackParameters;->speed:F

    .line 1061
    invoke-static {p1, p2, v2}, Lcom/google/android/exoplayer2/util/Util;->getMediaDurationForPlayoutDuration(JF)J

    move-result-wide p1

    goto :goto_1
.end method

.method private createAudioTrackV21()Landroid/media/AudioTrack;
    .locals 7

    .line 1138
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->tunneling:Z

    if-eqz v0, :cond_0

    .line 1139
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v1, 0x3

    .line 1140
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    const/16 v1, 0x10

    .line 1141
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 1142
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    .line 1143
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v0

    goto :goto_0

    .line 1145
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioAttributes:Lcom/google/android/exoplayer2/audio/AudioAttributes;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/audio/AudioAttributes;->getAudioAttributesV21()Landroid/media/AudioAttributes;

    move-result-object v0

    :goto_0
    move-object v2, v0

    .line 1147
    new-instance v0, Landroid/media/AudioFormat$Builder;

    invoke-direct {v0}, Landroid/media/AudioFormat$Builder;-><init>()V

    iget v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputChannelConfig:I

    .line 1149
    invoke-virtual {v0, v1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputEncoding:I

    .line 1150
    invoke-virtual {v0, v1}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputSampleRate:I

    .line 1151
    invoke-virtual {v0, v1}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object v0

    .line 1152
    invoke-virtual {v0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object v3

    .line 1153
    iget v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioSessionId:I

    if-eqz v0, :cond_1

    move v6, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    const/4 v6, 0x0

    .line 1155
    :goto_1
    new-instance v0, Landroid/media/AudioTrack;

    iget v4, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bufferSize:I

    const/4 v5, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Landroid/media/AudioTrack;-><init>(Landroid/media/AudioAttributes;Landroid/media/AudioFormat;III)V

    return-object v0
.end method

.method private drainAudioProcessorsToEndOfStream()Z
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/audio/AudioSink$WriteException;
        }
    .end annotation

    .line 822
    iget v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->drainingAudioProcessorIndex:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    .line 823
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->processingEnabled:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->activeAudioProcessors:[Lcom/google/android/exoplayer2/audio/AudioProcessor;

    array-length v0, v0

    :goto_0
    iput v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->drainingAudioProcessorIndex:I

    :goto_1
    const/4 v0, 0x1

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    .line 826
    :goto_2
    iget v4, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->drainingAudioProcessorIndex:I

    iget-object v5, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->activeAudioProcessors:[Lcom/google/android/exoplayer2/audio/AudioProcessor;

    array-length v6, v5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v4, v6, :cond_4

    .line 827
    aget-object v4, v5, v4

    if-eqz v0, :cond_2

    .line 829
    invoke-interface {v4}, Lcom/google/android/exoplayer2/audio/AudioProcessor;->queueEndOfStream()V

    .line 831
    :cond_2
    invoke-direct {p0, v7, v8}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->processBuffers(J)V

    .line 832
    invoke-interface {v4}, Lcom/google/android/exoplayer2/audio/AudioProcessor;->isEnded()Z

    move-result v0

    if-nez v0, :cond_3

    return v3

    .line 836
    :cond_3
    iget v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->drainingAudioProcessorIndex:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->drainingAudioProcessorIndex:I

    goto :goto_1

    .line 840
    :cond_4
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_5

    .line 841
    invoke-direct {p0, v0, v7, v8}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->writeBuffer(Ljava/nio/ByteBuffer;J)V

    .line 842
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_5

    return v3

    .line 846
    :cond_5
    iput v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->drainingAudioProcessorIndex:I

    return v2
.end method

.method private durationUsToFrames(J)J
    .locals 2

    .line 1082
    iget v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputSampleRate:I

    int-to-long v0, v0

    mul-long p1, p1, v0

    const-wide/32 v0, 0xf4240

    div-long/2addr p1, v0

    return-wide p1
.end method

.method private flushAudioProcessors()V
    .locals 3

    const/4 v0, 0x0

    .line 546
    :goto_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->activeAudioProcessors:[Lcom/google/android/exoplayer2/audio/AudioProcessor;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 547
    aget-object v1, v1, v0

    .line 548
    invoke-interface {v1}, Lcom/google/android/exoplayer2/audio/AudioProcessor;->flush()V

    .line 549
    iget-object v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputBuffers:[Ljava/nio/ByteBuffer;

    invoke-interface {v1}, Lcom/google/android/exoplayer2/audio/AudioProcessor;->getOutput()Ljava/nio/ByteBuffer;

    move-result-object v1

    aput-object v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private framesToDurationUs(J)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p1, p1, v0

    .line 1078
    iget v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputSampleRate:I

    int-to-long v0, v0

    div-long/2addr p1, v0

    return-wide p1
.end method

.method private getAvailableAudioProcessors()[Lcom/google/android/exoplayer2/audio/AudioProcessor;
    .locals 1

    .line 1168
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->shouldConvertHighResIntPcmToFloat:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->toFloatPcmAvailableAudioProcessors:[Lcom/google/android/exoplayer2/audio/AudioProcessor;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->toIntPcmAvailableAudioProcessors:[Lcom/google/android/exoplayer2/audio/AudioProcessor;

    :goto_0
    return-object v0
.end method

.method private static getFramesPerEncodedSample(ILjava/nio/ByteBuffer;)I
    .locals 2

    const/4 v0, 0x7

    if-eq p0, v0, :cond_5

    const/16 v0, 0x8

    if-ne p0, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x5

    if-ne p0, v0, :cond_1

    .line 1177
    invoke-static {}, Lcom/google/android/exoplayer2/audio/Ac3Util;->getAc3SyncframeAudioSampleCount()I

    move-result p0

    return p0

    :cond_1
    const/4 v0, 0x6

    if-ne p0, v0, :cond_2

    .line 1179
    invoke-static {p1}, Lcom/google/android/exoplayer2/audio/Ac3Util;->parseEAc3SyncframeAudioSampleCount(Ljava/nio/ByteBuffer;)I

    move-result p0

    return p0

    :cond_2
    const/16 v0, 0xe

    if-ne p0, v0, :cond_4

    .line 1181
    invoke-static {p1}, Lcom/google/android/exoplayer2/audio/Ac3Util;->findTrueHdSyncframeOffset(Ljava/nio/ByteBuffer;)I

    move-result p0

    const/4 v0, -0x1

    if-ne p0, v0, :cond_3

    const/4 p0, 0x0

    goto :goto_0

    .line 1184
    :cond_3
    invoke-static {p1, p0}, Lcom/google/android/exoplayer2/audio/Ac3Util;->parseTrueHdSyncframeAudioSampleCount(Ljava/nio/ByteBuffer;I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x10

    :goto_0
    return p0

    .line 1187
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected audio encoding: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1175
    :cond_5
    :goto_1
    invoke-static {p1}, Lcom/google/android/exoplayer2/audio/DtsUtil;->parseDtsAudioSampleCount(Ljava/nio/ByteBuffer;)I

    move-result p0

    return p0
.end method

.method private getSubmittedFrames()J
    .locals 4

    .line 1086
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInputPcm:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->submittedPcmBytes:J

    iget v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->pcmFrameSize:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->submittedEncodedFrames:J

    :goto_0
    return-wide v0
.end method

.method private getWrittenFrames()J
    .locals 4

    .line 1090
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInputPcm:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->writtenPcmBytes:J

    iget v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputPcmFrameSize:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->writtenEncodedFrames:J

    :goto_0
    return-wide v0
.end method

.method private initialize()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/audio/AudioSink$InitializationException;
        }
    .end annotation

    .line 559
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->releasingConditionVariable:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->block()V

    .line 561
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->initializeAudioTrack()Landroid/media/AudioTrack;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 562
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v0

    .line 563
    sget-boolean v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->enablePreV21AudioSessionWorkaround:Z

    if-eqz v1, :cond_1

    .line 564
    sget v1, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v2, 0x15

    if-ge v1, v2, :cond_1

    .line 567
    iget-object v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->keepSessionIdAudioTrack:Landroid/media/AudioTrack;

    if-eqz v1, :cond_0

    .line 568
    invoke-virtual {v1}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 569
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->releaseKeepSessionIdAudioTrack()V

    .line 571
    :cond_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->keepSessionIdAudioTrack:Landroid/media/AudioTrack;

    if-nez v1, :cond_1

    .line 572
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->initializeKeepSessionIdAudioTrack(I)Landroid/media/AudioTrack;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->keepSessionIdAudioTrack:Landroid/media/AudioTrack;

    .line 576
    :cond_1
    iget v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioSessionId:I

    if-eq v1, v0, :cond_2

    .line 577
    iput v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioSessionId:I

    .line 578
    iget-object v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->listener:Lcom/google/android/exoplayer2/audio/AudioSink$Listener;

    if-eqz v1, :cond_2

    .line 579
    invoke-interface {v1, v0}, Lcom/google/android/exoplayer2/audio/AudioSink$Listener;->onAudioSessionId(I)V

    .line 583
    :cond_2
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->canApplyPlaybackParameters:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioProcessorChain:Lcom/google/android/exoplayer2/audio/DefaultAudioSink$AudioProcessorChain;

    iget-object v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 585
    invoke-interface {v0, v1}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$AudioProcessorChain;->applyPlaybackParameters(Lcom/google/android/exoplayer2/PlaybackParameters;)Lcom/google/android/exoplayer2/PlaybackParameters;

    move-result-object v0

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/google/android/exoplayer2/PlaybackParameters;->DEFAULT:Lcom/google/android/exoplayer2/PlaybackParameters;

    :goto_0
    iput-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 587
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->setupAudioProcessors()V

    .line 589
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrackPositionTracker:Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;

    iget-object v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    iget v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputEncoding:I

    iget v3, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputPcmFrameSize:I

    iget v4, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bufferSize:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;->setAudioTrack(Landroid/media/AudioTrack;III)V

    .line 591
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->setVolumeInternal()V

    return-void
.end method

.method private initializeAudioTrack()Landroid/media/AudioTrack;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/audio/AudioSink$InitializationException;
        }
    .end annotation

    .line 1095
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 1096
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->createAudioTrackV21()Landroid/media/AudioTrack;

    move-result-object v0

    goto :goto_0

    .line 1098
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioAttributes:Lcom/google/android/exoplayer2/audio/AudioAttributes;

    iget v0, v0, Lcom/google/android/exoplayer2/audio/AudioAttributes;->usage:I

    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Util;->getStreamTypeForAudioUsage(I)I

    move-result v2

    .line 1099
    iget v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioSessionId:I

    if-nez v0, :cond_1

    .line 1100
    new-instance v0, Landroid/media/AudioTrack;

    iget v3, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputSampleRate:I

    iget v4, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputChannelConfig:I

    iget v5, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputEncoding:I

    iget v6, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bufferSize:I

    const/4 v7, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    goto :goto_0

    .line 1110
    :cond_1
    new-instance v0, Landroid/media/AudioTrack;

    iget v3, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputSampleRate:I

    iget v4, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputChannelConfig:I

    iget v5, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputEncoding:I

    iget v6, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bufferSize:I

    const/4 v7, 0x1

    iget v8, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioSessionId:I

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    .line 1122
    :goto_0
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getState()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    return-object v0

    .line 1125
    :cond_2
    :try_start_0
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1130
    :catch_0
    new-instance v0, Lcom/google/android/exoplayer2/audio/AudioSink$InitializationException;

    iget v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputSampleRate:I

    iget v3, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputChannelConfig:I

    iget v4, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bufferSize:I

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/exoplayer2/audio/AudioSink$InitializationException;-><init>(IIII)V

    throw v0
.end method

.method private initializeKeepSessionIdAudioTrack(I)Landroid/media/AudioTrack;
    .locals 9

    .line 1163
    new-instance v8, Landroid/media/AudioTrack;

    const/16 v2, 0xfa0

    const/4 v3, 0x4

    const/4 v4, 0x2

    const/4 v5, 0x2

    const/4 v1, 0x3

    const/4 v6, 0x0

    move-object v0, v8

    move v7, p1

    invoke-direct/range {v0 .. v7}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    return-object v8
.end method

.method private inputFramesToDurationUs(J)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p1, p1, v0

    .line 1074
    iget v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->inputSampleRate:I

    int-to-long v0, v0

    div-long/2addr p1, v0

    return-wide p1
.end method

.method private isInitialized()Z
    .locals 1

    .line 1070
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private processBuffers(J)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/audio/AudioSink$WriteException;
        }
    .end annotation

    .line 718
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->activeAudioProcessors:[Lcom/google/android/exoplayer2/audio/AudioProcessor;

    array-length v0, v0

    move v1, v0

    :goto_0
    if-ltz v1, :cond_5

    if-lez v1, :cond_0

    .line 721
    iget-object v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputBuffers:[Ljava/nio/ByteBuffer;

    add-int/lit8 v3, v1, -0x1

    aget-object v2, v2, v3

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    sget-object v2, Lcom/google/android/exoplayer2/audio/AudioProcessor;->EMPTY_BUFFER:Ljava/nio/ByteBuffer;

    :goto_1
    if-ne v1, v0, :cond_2

    .line 724
    invoke-direct {p0, v2, p1, p2}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->writeBuffer(Ljava/nio/ByteBuffer;J)V

    goto :goto_2

    .line 726
    :cond_2
    iget-object v3, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->activeAudioProcessors:[Lcom/google/android/exoplayer2/audio/AudioProcessor;

    aget-object v3, v3, v1

    .line 727
    invoke-interface {v3, v2}, Lcom/google/android/exoplayer2/audio/AudioProcessor;->queueInput(Ljava/nio/ByteBuffer;)V

    .line 728
    invoke-interface {v3}, Lcom/google/android/exoplayer2/audio/AudioProcessor;->getOutput()Ljava/nio/ByteBuffer;

    move-result-object v3

    .line 729
    iget-object v4, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputBuffers:[Ljava/nio/ByteBuffer;

    aput-object v3, v4, v1

    .line 730
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v3

    if-eqz v3, :cond_3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 737
    :cond_3
    :goto_2
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_4

    return-void

    :cond_4
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method private releaseKeepSessionIdAudioTrack()V
    .locals 2

    .line 1022
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->keepSessionIdAudioTrack:Landroid/media/AudioTrack;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 1028
    iput-object v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->keepSessionIdAudioTrack:Landroid/media/AudioTrack;

    .line 1029
    new-instance v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$2;

    invoke-direct {v1, p0, v0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$2;-><init>(Lcom/google/android/exoplayer2/audio/DefaultAudioSink;Landroid/media/AudioTrack;)V

    .line 1034
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$2;->start()V

    return-void
.end method

.method private setVolumeInternal()V
    .locals 2

    .line 940
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 942
    :cond_0
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 943
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    iget v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->volume:F

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->setVolumeInternalV21(Landroid/media/AudioTrack;F)V

    goto :goto_0

    .line 945
    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    iget v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->volume:F

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->setVolumeInternalV3(Landroid/media/AudioTrack;F)V

    :goto_0
    return-void
.end method

.method private static setVolumeInternalV21(Landroid/media/AudioTrack;F)V
    .locals 0

    .line 1237
    invoke-virtual {p0, p1}, Landroid/media/AudioTrack;->setVolume(F)I

    return-void
.end method

.method private static setVolumeInternalV3(Landroid/media/AudioTrack;F)V
    .locals 0

    .line 1242
    invoke-virtual {p0, p1, p1}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    return-void
.end method

.method private setupAudioProcessors()V
    .locals 6

    .line 531
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 532
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->getAvailableAudioProcessors()[Lcom/google/android/exoplayer2/audio/AudioProcessor;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 533
    invoke-interface {v4}, Lcom/google/android/exoplayer2/audio/AudioProcessor;->isActive()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 534
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 536
    :cond_0
    invoke-interface {v4}, Lcom/google/android/exoplayer2/audio/AudioProcessor;->flush()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 539
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 540
    new-array v2, v1, [Lcom/google/android/exoplayer2/audio/AudioProcessor;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/exoplayer2/audio/AudioProcessor;

    iput-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->activeAudioProcessors:[Lcom/google/android/exoplayer2/audio/AudioProcessor;

    .line 541
    new-array v0, v1, [Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputBuffers:[Ljava/nio/ByteBuffer;

    .line 542
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->flushAudioProcessors()V

    return-void
.end method

.method private writeBuffer(Ljava/nio/ByteBuffer;J)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/audio/AudioSink$WriteException;
        }
    .end annotation

    .line 749
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 752
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    const/4 v1, 0x1

    const/16 v2, 0x15

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    if-ne v0, p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 753
    :goto_0
    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkArgument(Z)V

    goto :goto_1

    .line 755
    :cond_2
    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 756
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    if-ge v0, v2, :cond_5

    .line 757
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    .line 758
    iget-object v4, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->preV21OutputBuffer:[B

    if-eqz v4, :cond_3

    array-length v4, v4

    if-ge v4, v0, :cond_4

    .line 759
    :cond_3
    new-array v4, v0, [B

    iput-object v4, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->preV21OutputBuffer:[B

    .line 761
    :cond_4
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    .line 762
    iget-object v5, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->preV21OutputBuffer:[B

    invoke-virtual {p1, v5, v3, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 763
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 764
    iput v3, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->preV21OutputBufferOffset:I

    .line 767
    :cond_5
    :goto_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    .line 769
    sget v4, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    if-ge v4, v2, :cond_6

    .line 771
    iget-object p2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrackPositionTracker:Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;

    iget-wide v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->writtenPcmBytes:J

    invoke-virtual {p2, v1, v2}, Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;->getAvailableBufferSize(J)I

    move-result p2

    if-lez p2, :cond_9

    .line 773
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 774
    iget-object p3, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    iget-object v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->preV21OutputBuffer:[B

    iget v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->preV21OutputBufferOffset:I

    invoke-virtual {p3, v1, v2, p2}, Landroid/media/AudioTrack;->write([BII)I

    move-result v3

    if-lez v3, :cond_9

    .line 776
    iget p2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->preV21OutputBufferOffset:I

    add-int/2addr p2, v3

    iput p2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->preV21OutputBufferOffset:I

    .line 777
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result p2

    add-int/2addr p2, v3

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_3

    .line 780
    :cond_6
    iget-boolean v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->tunneling:Z

    if-eqz v2, :cond_8

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p2, v4

    if-eqz v2, :cond_7

    goto :goto_2

    :cond_7
    const/4 v1, 0x0

    .line 781
    :goto_2
    invoke-static {v1}, Lcom/google/android/exoplayer2/util/Assertions;->checkState(Z)V

    .line 782
    iget-object v7, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    move-object v6, p0

    move-object v8, p1

    move v9, v0

    move-wide v10, p2

    invoke-direct/range {v6 .. v11}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->writeNonBlockingWithAvSyncV21(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I

    move-result v3

    goto :goto_3

    .line 785
    :cond_8
    iget-object p2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    invoke-static {p2, p1, v0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->writeNonBlockingV21(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    move-result v3

    .line 788
    :cond_9
    :goto_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->lastFeedElapsedRealtimeMs:J

    if-ltz v3, :cond_d

    .line 794
    iget-boolean p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInputPcm:Z

    if-eqz p1, :cond_a

    .line 795
    iget-wide p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->writtenPcmBytes:J

    int-to-long v1, v3

    add-long/2addr p1, v1

    iput-wide p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->writtenPcmBytes:J

    :cond_a
    if-ne v3, v0, :cond_c

    .line 798
    iget-boolean p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInputPcm:Z

    if-nez p1, :cond_b

    .line 799
    iget-wide p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->writtenEncodedFrames:J

    iget p3, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->framesPerEncodedSample:I

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->writtenEncodedFrames:J

    :cond_b
    const/4 p1, 0x0

    .line 801
    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    :cond_c
    return-void

    .line 791
    :cond_d
    new-instance p1, Lcom/google/android/exoplayer2/audio/AudioSink$WriteException;

    invoke-direct {p1, v3}, Lcom/google/android/exoplayer2/audio/AudioSink$WriteException;-><init>(I)V

    throw p1
.end method

.method private static writeNonBlockingV21(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I
    .locals 1

    const/4 v0, 0x1

    .line 1193
    invoke-virtual {p0, p1, p2, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p0

    return p0
.end method

.method private writeNonBlockingWithAvSyncV21(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I
    .locals 5

    .line 1204
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_0

    const/16 v0, 0x10

    .line 1205
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    .line 1206
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1207
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    const v1, 0x55550001

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 1209
    :cond_0
    iget v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bytesUntilNextAvSync:I

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 1210
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    const/4 v2, 0x4

    invoke-virtual {v0, v2, p3}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 1211
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    const/16 v2, 0x8

    const-wide/16 v3, 0x3e8

    mul-long p4, p4, v3

    invoke-virtual {v0, v2, p4, p5}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 1212
    iget-object p4, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    invoke-virtual {p4, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1213
    iput p3, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bytesUntilNextAvSync:I

    .line 1215
    :cond_1
    iget-object p4, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    invoke-virtual {p4}, Ljava/nio/ByteBuffer;->remaining()I

    move-result p4

    if-lez p4, :cond_3

    .line 1217
    iget-object p5, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    const/4 v0, 0x1

    invoke-virtual {p1, p5, p4, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p5

    if-gez p5, :cond_2

    .line 1219
    iput v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bytesUntilNextAvSync:I

    return p5

    :cond_2
    if-ge p5, p4, :cond_3

    return v1

    .line 1226
    :cond_3
    invoke-static {p1, p2, p3}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->writeNonBlockingV21(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    move-result p1

    if-gez p1, :cond_4

    .line 1228
    iput v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bytesUntilNextAvSync:I

    return p1

    .line 1231
    :cond_4
    iget p2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bytesUntilNextAvSync:I

    sub-int/2addr p2, p1

    iput p2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bytesUntilNextAvSync:I

    return p1
.end method


# virtual methods
.method public configure(IIII[III)V
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/audio/AudioSink$ConfigurationException;
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v0, p4

    move/from16 v2, p3

    .line 405
    iput v2, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->inputSampleRate:I

    .line 408
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/util/Util;->isEncodingPcm(I)Z

    move-result v3

    iput-boolean v3, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInputPcm:Z

    .line 409
    iget-boolean v3, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->enableConvertHighResIntPcmToFloat:Z

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    const/high16 v3, 0x40000000    # 2.0f

    .line 411
    invoke-virtual {v1, v3}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isEncodingSupported(I)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 412
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/util/Util;->isEncodingHighResolutionIntegerPcm(I)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iput-boolean v3, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->shouldConvertHighResIntPcmToFloat:Z

    .line 413
    iget-boolean v3, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInputPcm:Z

    if-eqz v3, :cond_1

    .line 414
    invoke-static/range {p1 .. p2}, Lcom/google/android/exoplayer2/util/Util;->getPcmFrameSize(II)I

    move-result v3

    iput v3, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->pcmFrameSize:I

    .line 417
    :cond_1
    iget-boolean v3, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInputPcm:Z

    const/4 v6, 0x4

    if-eqz v3, :cond_2

    move/from16 v3, p1

    if-eq v3, v6, :cond_3

    const/4 v7, 0x1

    goto :goto_1

    :cond_2
    move/from16 v3, p1

    :cond_3
    const/4 v7, 0x0

    :goto_1
    if-eqz v7, :cond_4

    .line 418
    iget-boolean v8, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->shouldConvertHighResIntPcmToFloat:Z

    if-nez v8, :cond_4

    const/4 v8, 0x1

    goto :goto_2

    :cond_4
    const/4 v8, 0x0

    :goto_2
    iput-boolean v8, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->canApplyPlaybackParameters:Z

    if-eqz v7, :cond_6

    .line 420
    iget-object v8, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->trimmingAudioProcessor:Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;

    move/from16 v9, p6

    move/from16 v10, p7

    invoke-virtual {v8, v9, v10}, Lcom/google/android/exoplayer2/audio/TrimmingAudioProcessor;->setTrimFrameCount(II)V

    .line 421
    iget-object v8, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->channelMappingAudioProcessor:Lcom/google/android/exoplayer2/audio/ChannelMappingAudioProcessor;

    move-object/from16 v9, p5

    invoke-virtual {v8, v9}, Lcom/google/android/exoplayer2/audio/ChannelMappingAudioProcessor;->setChannelMap([I)V

    .line 422
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->getAvailableAudioProcessors()[Lcom/google/android/exoplayer2/audio/AudioProcessor;

    move-result-object v8

    array-length v9, v8

    move v10, v2

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v2, p2

    :goto_3
    if-ge v11, v9, :cond_7

    aget-object v13, v8, v11

    .line 424
    :try_start_0
    invoke-interface {v13, v10, v2, v3}, Lcom/google/android/exoplayer2/audio/AudioProcessor;->configure(III)Z

    move-result v14
    :try_end_0
    .catch Lcom/google/android/exoplayer2/audio/AudioProcessor$UnhandledFormatException; {:try_start_0 .. :try_end_0} :catch_0

    or-int/2addr v12, v14

    .line 428
    invoke-interface {v13}, Lcom/google/android/exoplayer2/audio/AudioProcessor;->isActive()Z

    move-result v14

    if-eqz v14, :cond_5

    .line 429
    invoke-interface {v13}, Lcom/google/android/exoplayer2/audio/AudioProcessor;->getOutputChannelCount()I

    move-result v2

    .line 430
    invoke-interface {v13}, Lcom/google/android/exoplayer2/audio/AudioProcessor;->getOutputSampleRateHz()I

    move-result v3

    .line 431
    invoke-interface {v13}, Lcom/google/android/exoplayer2/audio/AudioProcessor;->getOutputEncoding()I

    move-result v10

    move/from16 v16, v10

    move v10, v3

    move/from16 v3, v16

    :cond_5
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 426
    new-instance v0, Lcom/google/android/exoplayer2/audio/AudioSink$ConfigurationException;

    invoke-direct {v0, v2}, Lcom/google/android/exoplayer2/audio/AudioSink$ConfigurationException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    move v10, v2

    const/4 v12, 0x0

    move/from16 v2, p2

    :cond_7
    const/16 v8, 0xfc

    const/16 v9, 0xc

    packed-switch v2, :pswitch_data_0

    .line 463
    new-instance v0, Lcom/google/android/exoplayer2/audio/AudioSink$ConfigurationException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unsupported channel count: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/android/exoplayer2/audio/AudioSink$ConfigurationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 460
    :pswitch_0
    sget v6, Lcom/google/android/exoplayer2/C;->CHANNEL_OUT_7POINT1_SURROUND:I

    goto :goto_4

    :pswitch_1
    const/16 v6, 0x4fc

    goto :goto_4

    :pswitch_2
    const/16 v6, 0xfc

    goto :goto_4

    :pswitch_3
    const/16 v6, 0xdc

    goto :goto_4

    :pswitch_4
    const/16 v6, 0xcc

    goto :goto_4

    :pswitch_5
    const/16 v6, 0x1c

    goto :goto_4

    :pswitch_6
    const/16 v6, 0xc

    .line 467
    :goto_4
    :pswitch_7
    sget v11, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v13, 0x17

    const/4 v14, 0x7

    const/4 v15, 0x5

    if-gt v11, v13, :cond_9

    sget-object v11, Lcom/google/android/exoplayer2/util/Util;->DEVICE:Ljava/lang/String;

    const-string v13, "foster"

    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    sget-object v11, Lcom/google/android/exoplayer2/util/Util;->MANUFACTURER:Ljava/lang/String;

    const-string v13, "NVIDIA"

    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    const/4 v11, 0x3

    if-eq v2, v11, :cond_a

    if-eq v2, v15, :cond_a

    if-eq v2, v14, :cond_8

    goto :goto_5

    .line 470
    :cond_8
    sget v8, Lcom/google/android/exoplayer2/C;->CHANNEL_OUT_7POINT1_SURROUND:I

    goto :goto_6

    :cond_9
    :goto_5
    move v8, v6

    .line 483
    :cond_a
    :goto_6
    sget v6, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v11, 0x19

    if-gt v6, v11, :cond_b

    sget-object v6, Lcom/google/android/exoplayer2/util/Util;->DEVICE:Ljava/lang/String;

    const-string v11, "fugu"

    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    iget-boolean v6, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInputPcm:Z

    if-nez v6, :cond_b

    if-ne v2, v4, :cond_b

    goto :goto_7

    :cond_b
    move v9, v8

    :goto_7
    if-nez v12, :cond_c

    .line 488
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInitialized()Z

    move-result v6

    if-eqz v6, :cond_c

    iget v6, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputEncoding:I

    if-ne v6, v3, :cond_c

    iget v6, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputSampleRate:I

    if-ne v6, v10, :cond_c

    iget v6, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputChannelConfig:I

    if-ne v6, v9, :cond_c

    return-void

    .line 496
    :cond_c
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->reset()V

    .line 498
    iput-boolean v7, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->processingEnabled:Z

    .line 499
    iput v10, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputSampleRate:I

    .line 500
    iput v9, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputChannelConfig:I

    .line 501
    iput v3, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputEncoding:I

    .line 502
    iget-boolean v6, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInputPcm:Z

    if-eqz v6, :cond_d

    .line 503
    invoke-static {v3, v2}, Lcom/google/android/exoplayer2/util/Util;->getPcmFrameSize(II)I

    move-result v2

    goto :goto_8

    :cond_d
    const/4 v2, -0x1

    :goto_8
    iput v2, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputPcmFrameSize:I

    if-eqz v0, :cond_e

    .line 505
    iput v0, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bufferSize:I

    goto :goto_b

    .line 506
    :cond_e
    iget-boolean v0, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInputPcm:Z

    if-eqz v0, :cond_10

    .line 507
    iget v0, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputEncoding:I

    invoke-static {v10, v9, v0}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v0

    const/4 v2, -0x2

    if-eq v0, v2, :cond_f

    goto :goto_9

    :cond_f
    const/4 v4, 0x0

    .line 508
    :goto_9
    invoke-static {v4}, Lcom/google/android/exoplayer2/util/Assertions;->checkState(Z)V

    mul-int/lit8 v2, v0, 0x4

    const-wide/32 v3, 0x3d090

    .line 510
    invoke-direct {v1, v3, v4}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->durationUsToFrames(J)J

    move-result-wide v3

    long-to-int v4, v3

    iget v3, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputPcmFrameSize:I

    mul-int v4, v4, v3

    int-to-long v5, v0

    const-wide/32 v7, 0xb71b0

    .line 512
    invoke-direct {v1, v7, v8}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->durationUsToFrames(J)J

    move-result-wide v7

    iget v0, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputPcmFrameSize:I

    int-to-long v9, v0

    mul-long v7, v7, v9

    .line 511
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    long-to-int v0, v5

    .line 513
    invoke-static {v2, v4, v0}, Lcom/google/android/exoplayer2/util/Util;->constrainValue(III)I

    move-result v0

    iput v0, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bufferSize:I

    goto :goto_b

    .line 517
    :cond_10
    iget v0, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputEncoding:I

    if-eq v0, v15, :cond_13

    const/4 v2, 0x6

    if-ne v0, v2, :cond_11

    goto :goto_a

    :cond_11
    if-ne v0, v14, :cond_12

    const v0, 0xc000

    .line 522
    iput v0, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bufferSize:I

    goto :goto_b

    :cond_12
    const v0, 0x48000

    .line 525
    iput v0, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bufferSize:I

    goto :goto_b

    :cond_13
    :goto_a
    const/16 v0, 0x5000

    .line 519
    iput v0, v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bufferSize:I

    :goto_b
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public disableTunneling()V
    .locals 1

    .line 924
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->tunneling:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 925
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->tunneling:Z

    .line 926
    iput v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioSessionId:I

    .line 927
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->reset()V

    :cond_0
    return-void
.end method

.method public enableTunnelingV21(I)V
    .locals 3

    .line 914
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkState(Z)V

    .line 915
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->tunneling:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioSessionId:I

    if-eq v0, p1, :cond_2

    .line 916
    :cond_1
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->tunneling:Z

    .line 917
    iput p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioSessionId:I

    .line 918
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->reset()V

    :cond_2
    return-void
.end method

.method public getCurrentPositionUs(Z)J
    .locals 4

    .line 386
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->startMediaTimeState:I

    if-nez v0, :cond_0

    goto :goto_0

    .line 389
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrackPositionTracker:Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;->getCurrentPositionUs(Z)J

    move-result-wide v0

    .line 390
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->getWrittenFrames()J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->framesToDurationUs(J)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    .line 391
    iget-wide v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->startMediaTimeUs:J

    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->applySpeedup(J)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->applySkipping(J)J

    move-result-wide v0

    add-long/2addr v2, v0

    return-wide v2

    :cond_1
    :goto_0
    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0
.end method

.method public getPlaybackParameters()Lcom/google/android/exoplayer2/PlaybackParameters;
    .locals 1

    .line 887
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    return-object v0
.end method

.method public handleBuffer(Ljava/nio/ByteBuffer;J)Z
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/audio/AudioSink$InitializationException;,
            Lcom/google/android/exoplayer2/audio/AudioSink$WriteException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, p2

    .line 615
    iget-object v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    if-ne v1, v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v4, 0x1

    :goto_1
    invoke-static {v4}, Lcom/google/android/exoplayer2/util/Assertions;->checkArgument(Z)V

    .line 616
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInitialized()Z

    move-result v4

    if-nez v4, :cond_2

    .line 617
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->initialize()V

    .line 618
    iget-boolean v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playing:Z

    if-eqz v4, :cond_2

    .line 619
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->play()V

    .line 623
    :cond_2
    iget-object v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrackPositionTracker:Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;

    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->getWrittenFrames()J

    move-result-wide v7

    invoke-virtual {v4, v7, v8}, Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;->mayHandleBuffer(J)Z

    move-result v4

    if-nez v4, :cond_3

    return v5

    .line 627
    :cond_3
    iget-object v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    const-string v7, "AudioTrack"

    const/4 v8, 0x0

    if-nez v4, :cond_c

    .line 629
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v4

    if-nez v4, :cond_4

    return v6

    .line 634
    :cond_4
    iget-boolean v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInputPcm:Z

    if-nez v4, :cond_5

    iget v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->framesPerEncodedSample:I

    if-nez v4, :cond_5

    .line 636
    iget v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputEncoding:I

    invoke-static {v4, v1}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->getFramesPerEncodedSample(ILjava/nio/ByteBuffer;)I

    move-result v4

    iput v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->framesPerEncodedSample:I

    if-nez v4, :cond_5

    return v6

    .line 646
    :cond_5
    iget-object v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->afterDrainPlaybackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    const-wide/16 v9, 0x0

    if-eqz v4, :cond_7

    .line 647
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->drainAudioProcessorsToEndOfStream()Z

    move-result v4

    if-nez v4, :cond_6

    return v5

    .line 651
    :cond_6
    iget-object v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->afterDrainPlaybackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 652
    iput-object v8, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->afterDrainPlaybackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 653
    iget-object v11, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioProcessorChain:Lcom/google/android/exoplayer2/audio/DefaultAudioSink$AudioProcessorChain;

    invoke-interface {v11, v4}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$AudioProcessorChain;->applyPlaybackParameters(Lcom/google/android/exoplayer2/PlaybackParameters;)Lcom/google/android/exoplayer2/PlaybackParameters;

    move-result-object v13

    .line 655
    iget-object v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersCheckpoints:Ljava/util/ArrayDeque;

    new-instance v11, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;

    .line 658
    invoke-static {v9, v10, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v14

    .line 659
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->getWrittenFrames()J

    move-result-wide v5

    invoke-direct {v0, v5, v6}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->framesToDurationUs(J)J

    move-result-wide v16

    const/16 v18, 0x0

    move-object v12, v11

    invoke-direct/range {v12 .. v18}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;-><init>(Lcom/google/android/exoplayer2/PlaybackParameters;JJLcom/google/android/exoplayer2/audio/DefaultAudioSink$1;)V

    .line 655
    invoke-virtual {v4, v11}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 661
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->setupAudioProcessors()V

    .line 664
    :cond_7
    iget v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->startMediaTimeState:I

    if-nez v4, :cond_8

    .line 665
    invoke-static {v9, v10, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->startMediaTimeUs:J

    const/4 v4, 0x1

    .line 666
    iput v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->startMediaTimeState:I

    goto :goto_2

    :cond_8
    const/4 v4, 0x1

    .line 669
    iget-wide v5, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->startMediaTimeUs:J

    .line 670
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->getSubmittedFrames()J

    move-result-wide v9

    invoke-direct {v0, v9, v10}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->inputFramesToDurationUs(J)J

    move-result-wide v9

    add-long/2addr v5, v9

    .line 671
    iget v9, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->startMediaTimeState:I

    const/4 v10, 0x2

    if-ne v9, v4, :cond_9

    sub-long v11, v5, v2

    .line 672
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    move-result-wide v11

    const-wide/32 v13, 0x30d40

    cmp-long v4, v11, v13

    if-lez v4, :cond_9

    .line 673
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Discontinuity detected [expected "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v9, ", got "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v9, "]"

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v7, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 675
    iput v10, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->startMediaTimeState:I

    .line 677
    :cond_9
    iget v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->startMediaTimeState:I

    if-ne v4, v10, :cond_a

    .line 680
    iget-wide v9, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->startMediaTimeUs:J

    sub-long v5, v2, v5

    add-long/2addr v9, v5

    iput-wide v9, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->startMediaTimeUs:J

    const/4 v4, 0x1

    .line 681
    iput v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->startMediaTimeState:I

    .line 682
    iget-object v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->listener:Lcom/google/android/exoplayer2/audio/AudioSink$Listener;

    if-eqz v4, :cond_a

    .line 683
    invoke-interface {v4}, Lcom/google/android/exoplayer2/audio/AudioSink$Listener;->onPositionDiscontinuity()V

    .line 688
    :cond_a
    :goto_2
    iget-boolean v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInputPcm:Z

    if-eqz v4, :cond_b

    .line 689
    iget-wide v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->submittedPcmBytes:J

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v6

    int-to-long v9, v6

    add-long/2addr v4, v9

    iput-wide v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->submittedPcmBytes:J

    goto :goto_3

    .line 691
    :cond_b
    iget-wide v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->submittedEncodedFrames:J

    iget v6, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->framesPerEncodedSample:I

    int-to-long v9, v6

    add-long/2addr v4, v9

    iput-wide v4, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->submittedEncodedFrames:J

    .line 694
    :goto_3
    iput-object v1, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    .line 697
    :cond_c
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->processingEnabled:Z

    if-eqz v1, :cond_d

    .line 698
    invoke-direct {v0, v2, v3}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->processBuffers(J)V

    goto :goto_4

    .line 700
    :cond_d
    iget-object v1, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->writeBuffer(Ljava/nio/ByteBuffer;J)V

    .line 703
    :goto_4
    iget-object v1, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_e

    .line 704
    iput-object v8, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    const/4 v1, 0x1

    return v1

    :cond_e
    const/4 v1, 0x1

    .line 708
    iget-object v2, v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrackPositionTracker:Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;

    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->getWrittenFrames()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;->isStalled(J)Z

    move-result v2

    if-eqz v2, :cond_f

    const-string v2, "Resetting stalled audio track"

    .line 709
    invoke-static {v7, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 710
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->reset()V

    return v1

    :cond_f
    const/4 v1, 0x0

    return v1
.end method

.method public handleDiscontinuity()V
    .locals 2

    .line 606
    iget v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->startMediaTimeState:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    .line 607
    iput v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->startMediaTimeState:I

    :cond_0
    return-void
.end method

.method public hasPendingData()Z
    .locals 3

    .line 857
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrackPositionTracker:Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;

    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->getWrittenFrames()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;->hasPendingData(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isEncodingSupported(I)Z
    .locals 3

    .line 374
    invoke-static {p1}, Lcom/google/android/exoplayer2/util/Util;->isEncodingPcm(I)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 378
    sget p1, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v0, 0x15

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1

    .line 380
    :cond_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioCapabilities:Lcom/google/android/exoplayer2/audio/AudioCapabilities;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/audio/AudioCapabilities;->supportsEncoding(I)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public isEnded()Z
    .locals 1

    .line 852
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->handledEndOfStream:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->hasPendingData()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public pause()V
    .locals 1

    const/4 v0, 0x0

    .line 951
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playing:Z

    .line 952
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrackPositionTracker:Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;->pause()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 953
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_0
    return-void
.end method

.method public play()V
    .locals 1

    const/4 v0, 0x1

    .line 596
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playing:Z

    .line 597
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 598
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrackPositionTracker:Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;->start()V

    .line 599
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    :cond_0
    return-void
.end method

.method public playToEndOfStream()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/audio/AudioSink$WriteException;
        }
    .end annotation

    .line 807
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->handledEndOfStream:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 811
    :cond_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->drainAudioProcessorsToEndOfStream()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 813
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrackPositionTracker:Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;

    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->getWrittenFrames()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;->handleEndOfStream(J)V

    .line 814
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    const/4 v0, 0x0

    .line 815
    iput v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bytesUntilNextAvSync:I

    const/4 v0, 0x1

    .line 816
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->handledEndOfStream:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public release()V
    .locals 5

    .line 1006
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->reset()V

    .line 1007
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->releaseKeepSessionIdAudioTrack()V

    .line 1008
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->toIntPcmAvailableAudioProcessors:[Lcom/google/android/exoplayer2/audio/AudioProcessor;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 1009
    invoke-interface {v4}, Lcom/google/android/exoplayer2/audio/AudioProcessor;->reset()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1011
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->toFloatPcmAvailableAudioProcessors:[Lcom/google/android/exoplayer2/audio/AudioProcessor;

    array-length v1, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 1012
    invoke-interface {v4}, Lcom/google/android/exoplayer2/audio/AudioProcessor;->reset()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1014
    :cond_1
    iput v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioSessionId:I

    .line 1015
    iput-boolean v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playing:Z

    return-void
.end method

.method public reset()V
    .locals 5

    .line 959
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_3

    const-wide/16 v0, 0x0

    .line 960
    iput-wide v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->submittedPcmBytes:J

    .line 961
    iput-wide v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->submittedEncodedFrames:J

    .line 962
    iput-wide v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->writtenPcmBytes:J

    .line 963
    iput-wide v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->writtenEncodedFrames:J

    const/4 v2, 0x0

    .line 964
    iput v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->framesPerEncodedSample:I

    .line 965
    iget-object v3, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->afterDrainPlaybackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    .line 966
    iput-object v3, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 967
    iput-object v4, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->afterDrainPlaybackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    goto :goto_0

    .line 968
    :cond_0
    iget-object v3, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersCheckpoints:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 969
    iget-object v3, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersCheckpoints:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;

    invoke-static {v3}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;->access$200(Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;)Lcom/google/android/exoplayer2/PlaybackParameters;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 971
    :cond_1
    :goto_0
    iget-object v3, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersCheckpoints:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->clear()V

    .line 972
    iput-wide v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersOffsetUs:J

    .line 973
    iput-wide v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersPositionUs:J

    .line 974
    iput-object v4, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    .line 975
    iput-object v4, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 976
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->flushAudioProcessors()V

    .line 977
    iput-boolean v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->handledEndOfStream:Z

    const/4 v0, -0x1

    .line 978
    iput v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->drainingAudioProcessorIndex:I

    .line 979
    iput-object v4, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    .line 980
    iput v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->bytesUntilNextAvSync:I

    .line 981
    iput v2, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->startMediaTimeState:I

    .line 982
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrackPositionTracker:Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 983
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 986
    :cond_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 987
    iput-object v4, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 988
    iget-object v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioTrackPositionTracker:Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/audio/AudioTrackPositionTracker;->reset()V

    .line 989
    iget-object v1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->releasingConditionVariable:Landroid/os/ConditionVariable;

    invoke-virtual {v1}, Landroid/os/ConditionVariable;->close()V

    .line 990
    new-instance v1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$1;

    invoke-direct {v1, p0, v0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$1;-><init>(Lcom/google/android/exoplayer2/audio/DefaultAudioSink;Landroid/media/AudioTrack;)V

    .line 1000
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$1;->start()V

    :cond_3
    return-void
.end method

.method public setAudioAttributes(Lcom/google/android/exoplayer2/audio/AudioAttributes;)V
    .locals 1

    .line 892
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioAttributes:Lcom/google/android/exoplayer2/audio/AudioAttributes;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/audio/AudioAttributes;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 895
    :cond_0
    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioAttributes:Lcom/google/android/exoplayer2/audio/AudioAttributes;

    .line 896
    iget-boolean p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->tunneling:Z

    if-eqz p1, :cond_1

    return-void

    .line 900
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->reset()V

    const/4 p1, 0x0

    .line 901
    iput p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioSessionId:I

    return-void
.end method

.method public setAudioSessionId(I)V
    .locals 1

    .line 906
    iget v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioSessionId:I

    if-eq v0, p1, :cond_0

    .line 907
    iput p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioSessionId:I

    .line 908
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->reset()V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/google/android/exoplayer2/audio/AudioSink$Listener;)V
    .locals 0

    .line 369
    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->listener:Lcom/google/android/exoplayer2/audio/AudioSink$Listener;

    return-void
.end method

.method public setPlaybackParameters(Lcom/google/android/exoplayer2/PlaybackParameters;)Lcom/google/android/exoplayer2/PlaybackParameters;
    .locals 1

    .line 862
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->canApplyPlaybackParameters:Z

    if-nez v0, :cond_0

    .line 863
    sget-object p1, Lcom/google/android/exoplayer2/PlaybackParameters;->DEFAULT:Lcom/google/android/exoplayer2/PlaybackParameters;

    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    return-object p1

    .line 866
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->afterDrainPlaybackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersCheckpoints:Ljava/util/ArrayDeque;

    .line 869
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParametersCheckpoints:Ljava/util/ArrayDeque;

    .line 870
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;

    invoke-static {v0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;->access$200(Lcom/google/android/exoplayer2/audio/DefaultAudioSink$PlaybackParametersCheckpoint;)Lcom/google/android/exoplayer2/PlaybackParameters;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 872
    :goto_0
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/PlaybackParameters;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 873
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 876
    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->afterDrainPlaybackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    goto :goto_1

    .line 879
    :cond_3
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->audioProcessorChain:Lcom/google/android/exoplayer2/audio/DefaultAudioSink$AudioProcessorChain;

    invoke-interface {v0, p1}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink$AudioProcessorChain;->applyPlaybackParameters(Lcom/google/android/exoplayer2/PlaybackParameters;)Lcom/google/android/exoplayer2/PlaybackParameters;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 882
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->playbackParameters:Lcom/google/android/exoplayer2/PlaybackParameters;

    return-object p1
.end method

.method public setVolume(F)V
    .locals 1

    .line 933
    iget v0, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->volume:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 934
    iput p1, p0, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->volume:F

    .line 935
    invoke-direct {p0}, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->setVolumeInternal()V

    :cond_0
    return-void
.end method
