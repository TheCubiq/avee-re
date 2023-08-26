.class public interface abstract Lcom/daaw/avee/comp/playback/MediaPlaybackServiceDefs;
.super Ljava/lang/Object;
.source "MediaPlaybackServiceDefs.java"


# static fields
.field public static final ACTION_HEADSET_PLUGGED_IN:Ljava/lang/String; = "ACTION_HEADSET_PLUGGED_IN"

.field public static final ACTIVITY_AND_SERVICE_EXIT_ACTION:Ljava/lang/String; = "ACTIVITY_AND_SERVICE_EXIT_ACTION"

.field public static final APP_WIDGET_UPDATE_ACTION:Ljava/lang/String; = "APP_WIDGET_UPDATE_ACTION"

.field public static final AUDIO_BECOMING_NOISY_ACTION:Ljava/lang/String; = "AUDIO_BECOMING_NOISY_ACTION"

.field public static final CLEAR:I = -0x1

.field public static final CROSS_FADE_VALUE_ACTION:Ljava/lang/String; = "CROSS_FADE_VALUE_ACTION"

.field public static final EXIT_ACTION:Ljava/lang/String; = "EXIT_ACTION"

.field public static final EXTRA_ARG_1:Ljava/lang/String; = "EXTRA_ARG_1"

.field public static final EXTRA_ARG_2:Ljava/lang/String; = "EXTRA_ARG_2"

.field public static final EXTRA_ARG_3:Ljava/lang/String; = "EXTRA_ARG_3"

.field public static final EXTRA_ARG_4:Ljava/lang/String; = "EXTRA_ARG_4"

.field public static final FIRST:I = 0x0

.field public static final HEADSET_ASSIST_ACTION:Ljava/lang/String; = "HEADSET_ASSIST_ACTION"

.field public static final LAST:I = 0x3

.field public static final MediaServiceClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static final NEXT:I = 0x2

.field public static final NEXT_ACTION:Ljava/lang/String; = "NEXT_ACTION"

.field public static final NONE_ACTION:Ljava/lang/String; = "NONE_ACTION"

.field public static final NOTIFICATION_CHANNEL_NAME:Ljava/lang/String; = "Playback Service"

.field public static final NOW:I = 0x1

.field public static final PAUSE_ACTION:Ljava/lang/String; = "PAUSE_ACTION"

.field public static final PLAY_ACTION:Ljava/lang/String; = "PLAY_ACTION"

.field public static final PLAY_DATA_SOURCE_ACTION:Ljava/lang/String; = "PLAY_DATA_SOURCE_ACTION"

.field public static final PREVIOUS_ACTION:Ljava/lang/String; = "PREVIOUS_ACTION"

.field public static final REPEAT_ALL:I = 0x2

.field public static final REPEAT_CURRENT:I = 0x1

.field public static final REPEAT_MODE_ACTION:Ljava/lang/String; = "REPEAT_MODE_ACTION"

.field public static final REPEAT_NONE:I = 0x0

.field public static final SEEK_ACTION:Ljava/lang/String; = "SEEK_ACTION"

.field public static final SET_MUTE_ACTION:Ljava/lang/String; = "SET_MUTE_ACTION"

.field public static final SHUFFLE_NONE:I = 0x0

.field public static final SHUFFLE_NORMAL:I = 0x1

.field public static final STOP_ACTION:Ljava/lang/String; = "STOP_ACTION"

.field public static final TIMEOUT_DISABLE_ACTION:Ljava/lang/String; = "TIMEOUT_DISABLE_ACTION"

.field public static final TOGGLE_MUTE_ACTION:Ljava/lang/String; = "TOGGLE_MUTE_ACTION"

.field public static final TOGGLE_PAUSE_ACTION:Ljava/lang/String; = "TOGGLE_PAUSE_ACTION"

.field public static final VIDEO_SCALING_MODE_ACTION:Ljava/lang/String; = "VIDEO_SCALING_MODE_ACTION"

.field public static final VOLUME_ACTION:Ljava/lang/String; = "VOLUME_ACTION"

.field public static final VOLUME_PERCENTAGE_ACTION:Ljava/lang/String; = "VOLUME_PERCENTAGE_ACTION"

.field public static final VOLUME_STEREO_BALANCE_ACTION:Ljava/lang/String; = "VOLUME_STEREO_BALANCE_ACTION"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    const-class v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackServiceDefs;->MediaServiceClass:Ljava/lang/Class;

    return-void
.end method
