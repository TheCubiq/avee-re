.class public Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;
.super Ljava/lang/Object;
.source "MediaControlsUI.java"


# static fields
.field private static final MSG_REFRESH:I = 0x1

.field private static final createInstanceLock:Ljava/lang/Object;

.field private static volatile instanceWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;",
            ">;"
        }
    .end annotation
.end field

.field public static onActionEq:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field

.field public static onPlaybackNext:Lcom/daaw/avee/Common/Events/WeakEvent;

.field public static onPlaybackPrev:Lcom/daaw/avee/Common/Events/WeakEvent;

.field public static onPlaybackTogglePause:Lcom/daaw/avee/Common/Events/WeakEvent;

.field public static onRequestAudioBalanceState:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onRequestAudioEffectVirtualizerState:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onRequestAudioEffectsActiveState:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestAudioViewExpandedState:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestAudioVolumeState:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onRequestCrossFadeState:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/Common/Tuple3<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onRequestEqState:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestMusicSystemIndex:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestPlaystate:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onRequestRepeatMode:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestShowState:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestShuffleMode:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestTrackInfo:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
            "Lcom/daaw/avee/comp/playback/PlayingMediaInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onRequestTrackPosition:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestVolumeMuteState:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onSelectMusicSysAction:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onSetAudioStereoBalance:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onSetAudioViewExpandedState:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onSetAudioVolume:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onSetCrossFade:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onSetRepeatMode:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onSetShuffleMode:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onSetTrackPosition:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static onToggleMuteAction:Lcom/daaw/avee/Common/Events/WeakEvent;

.field public static onToggleVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakEvent;

.field public static onToggleVisualPreferShowContent:Lcom/daaw/avee/Common/Events/WeakEvent;

.field public static onTrackSelect:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private buttonOverflow:Landroid/widget/ImageButton;

.field private buttonPause:Landroid/widget/ImageButton;

.field private buttonPauseS:Landroid/widget/ImageButton;

.field private buttonVolume:Landroid/widget/ImageButton;

.field private buttonVolumeS:Landroid/widget/ImageButton;

.field private ctrlOverflowPopupWindowSingleton:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;",
            ">;"
        }
    .end annotation
.end field

.field private currentTime:Landroid/widget/TextView;

.field private currentTitle:Landroid/widget/TextView;

.field private currentTitleS:Landroid/widget/TextView;

.field private designHeight0:F

.field private duration:J

.field private final handler:Landroid/os/Handler;

.field private lastSeekEventTime:J

.field private lastShowLevel:I

.field private lengthTime:Landroid/widget/TextView;

.field private overlayButtonPause:Landroid/widget/ImageView;

.field private overlayButtonPauseS:Landroid/widget/ImageView;

.field private posOverride:J

.field private progress:Landroid/widget/SeekBar;

.field private progressS:Landroid/widget/SeekBar;

.field private rotateAnimation:Landroid/view/animation/RotateAnimation;

.field private rotateAnimationS:Landroid/view/animation/RotateAnimation;

.field private seekListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

.field private txtSongDetailInfo:Landroid/widget/TextView;

.field private txtSongDetailInfo0:Landroid/widget/TextView;

.field private viewRootBg:Landroid/view/View;

.field private viewRootL:Landroid/view/View;

.field private viewRootLHide:Ljava/lang/Runnable;

.field private viewRootS:Landroid/view/View;

.field private viewRootSHide:Ljava/lang/Runnable;

.field private volumePopupWindowSingleton:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 39
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestVolumeMuteState:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 40
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestAudioEffectsActiveState:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 41
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestShowState:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 42
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onPlaybackPrev:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 43
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onPlaybackNext:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 44
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onPlaybackTogglePause:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 45
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestTrackPosition:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 46
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestTrackInfo:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 47
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestPlaystate:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 48
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetTrackPosition:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 50
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestAudioVolumeState:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 51
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestAudioBalanceState:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 52
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestAudioEffectVirtualizerState:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 53
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestCrossFadeState:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 54
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetAudioVolume:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 55
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetAudioStereoBalance:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 56
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetCrossFade:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 57
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestAudioViewExpandedState:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 58
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetAudioViewExpandedState:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 59
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onToggleMuteAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 60
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onActionEq:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 61
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestEqState:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 63
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestShuffleMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 64
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetShuffleMode:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 65
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestRepeatMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 66
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetRepeatMode:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 67
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestMusicSystemIndex:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 68
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSelectMusicSysAction:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 69
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onTrackSelect:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 70
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 71
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onToggleVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 72
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onToggleVisualPreferShowContent:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 74
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->createInstanceLock:Ljava/lang/Object;

    .line 76
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->instanceWeak:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->volumePopupWindowSingleton:Ljava/lang/ref/WeakReference;

    .line 79
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->ctrlOverflowPopupWindowSingleton:Ljava/lang/ref/WeakReference;

    const-wide/16 v0, 0x3e8

    .line 94
    iput-wide v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->duration:J

    const-wide/16 v0, -0x1

    .line 95
    iput-wide v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->posOverride:J

    const/4 v0, -0x1

    .line 98
    iput v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->lastShowLevel:I

    .line 108
    new-instance v1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$1;-><init>(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)V

    iput-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootLHide:Ljava/lang/Runnable;

    .line 115
    new-instance v1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$2;-><init>(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)V

    iput-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootSHide:Ljava/lang/Runnable;

    .line 124
    new-instance v1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$3;-><init>(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)V

    iput-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->seekListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    .line 149
    new-instance v1, Landroid/view/animation/RotateAnimation;

    const/4 v3, 0x0

    const/high16 v4, 0x43b40000    # 360.0f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->rotateAnimation:Landroid/view/animation/RotateAnimation;

    .line 152
    new-instance v2, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/animation/RotateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 153
    iget-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->rotateAnimation:Landroid/view/animation/RotateAnimation;

    const-wide/16 v2, 0x1770

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    .line 154
    iget-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->rotateAnimation:Landroid/view/animation/RotateAnimation;

    invoke-virtual {v1, v0}, Landroid/view/animation/RotateAnimation;->setRepeatCount(I)V

    .line 156
    new-instance v1, Landroid/view/animation/RotateAnimation;

    const/4 v5, 0x0

    const/high16 v6, 0x43b40000    # 360.0f

    const/4 v9, 0x1

    const/high16 v10, 0x3f000000    # 0.5f

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->rotateAnimationS:Landroid/view/animation/RotateAnimation;

    .line 159
    new-instance v4, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v4}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v1, v4}, Landroid/view/animation/RotateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 160
    iget-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->rotateAnimationS:Landroid/view/animation/RotateAnimation;

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    .line 161
    iget-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->rotateAnimationS:Landroid/view/animation/RotateAnimation;

    invoke-virtual {v1, v0}, Landroid/view/animation/RotateAnimation;->setRepeatCount(I)V

    .line 163
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$4;-><init>(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)Landroid/view/View;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootL:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)Landroid/view/View;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootS:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)J
    .locals 2

    .line 37
    iget-wide v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->lastSeekEventTime:J

    return-wide v0
.end method

.method static synthetic access$202(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;J)J
    .locals 0

    .line 37
    iput-wide p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->lastSeekEventTime:J

    return-wide p1
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)J
    .locals 2

    .line 37
    iget-wide v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->posOverride:J

    return-wide v0
.end method

.method static synthetic access$302(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;J)J
    .locals 0

    .line 37
    iput-wide p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->posOverride:J

    return-wide p1
.end method

.method static synthetic access$400(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)J
    .locals 2

    .line 37
    iget-wide v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->duration:J

    return-wide v0
.end method

.method static synthetic access$500(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)J
    .locals 2

    .line 37
    invoke-direct {p0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->refreshNow()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic access$600(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;J)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->queueNextRefresh(J)V

    return-void
.end method

.method static synthetic access$700(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->volumePopupWindowSingleton:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$702(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->volumePopupWindowSingleton:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic access$800(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->ctrlOverflowPopupWindowSingleton:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$802(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->ctrlOverflowPopupWindowSingleton:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method public static createOrGetInstance()Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;
    .locals 3

    .line 183
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    if-eqz v0, :cond_0

    return-object v0

    .line 186
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->createInstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 187
    :try_start_0
    sget-object v1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    if-nez v1, :cond_1

    .line 189
    new-instance v1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    invoke-direct {v1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;-><init>()V

    .line 190
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v2, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->instanceWeak:Ljava/lang/ref/WeakReference;

    .line 193
    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 194
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static getInstance()Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;
    .locals 1

    .line 198
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    return-object v0
.end method

.method private isViewCreated()Z
    .locals 1

    .line 202
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootBg:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private onVolumeMuteChanged(ZZ)V
    .locals 2

    .line 631
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->volumePopupWindowSingleton:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;

    if-eqz v0, :cond_0

    .line 633
    invoke-virtual {v0}, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 634
    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;->onVolumeMuteChanged(ZZ)V

    .line 636
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->updateButtonVolume(ZZ)V

    return-void
.end method

.method private queueNextRefresh(J)V
    .locals 3

    .line 468
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->handler:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 469
    iget-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->handler:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 470
    iget-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method private refreshNow()J
    .locals 13

    .line 474
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestTrackPosition:Lcom/daaw/avee/Common/Events/WeakEventR;

    const-wide/16 v1, -0x1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 475
    sget-object v2, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestPlaystate:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v3, Lcom/daaw/avee/Common/Tuple2;

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-direct {v3, v5, v5}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/Common/Tuple2;

    const-wide/16 v5, 0x1f4

    const-wide/16 v7, 0x0

    cmp-long v3, v0, v7

    if-gez v3, :cond_0

    return-wide v5

    .line 481
    :cond_0
    :try_start_0
    iget-wide v9, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->posOverride:J

    cmp-long v3, v9, v7

    if-gez v3, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->posOverride:J

    :goto_0
    const-wide/16 v9, 0x3e8

    cmp-long v3, v0, v7

    if-ltz v3, :cond_5

    .line 482
    iget-wide v11, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->duration:J

    cmp-long v3, v11, v7

    if-ltz v3, :cond_5

    .line 483
    iget-object v3, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTime:Landroid/widget/TextView;

    div-long v7, v0, v9

    long-to-int v8, v7

    invoke-static {v8}, Lcom/daaw/avee/Common/Utils;->getDurationStringHMSS(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    mul-long v7, v0, v9

    .line 484
    iget-wide v11, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->duration:J

    div-long/2addr v7, v11

    long-to-int v3, v7

    .line 485
    iget-object v7, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->progress:Landroid/widget/SeekBar;

    invoke-virtual {v7, v3}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 486
    iget-object v7, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->progressS:Landroid/widget/SeekBar;

    if-eqz v7, :cond_2

    iget-object v7, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->progressS:Landroid/widget/SeekBar;

    invoke-virtual {v7, v3}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 488
    :cond_2
    iget-object v2, v2, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 489
    iget-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTime:Landroid/widget/TextView;

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 491
    :cond_3
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTime:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    .line 492
    iget-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTime:Landroid/widget/TextView;

    const/4 v2, 0x4

    if-ne v0, v2, :cond_4

    goto :goto_1

    :cond_4
    const/4 v4, 0x4

    :goto_1
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    return-wide v5

    .line 496
    :cond_5
    iget-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTime:Landroid/widget/TextView;

    const-string v3, "--:--"

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 497
    iget-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->progress:Landroid/widget/SeekBar;

    const/16 v3, 0x3e8

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 498
    iget-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->progressS:Landroid/widget/SeekBar;

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->progressS:Landroid/widget/SeekBar;

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 502
    :cond_6
    :goto_2
    rem-long/2addr v0, v9

    sub-long/2addr v9, v0

    .line 506
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->progress:Landroid/widget/SeekBar;

    invoke-virtual {v0}, Landroid/widget/SeekBar;->getWidth()I

    move-result v0

    if-nez v0, :cond_7

    const/16 v0, 0x140

    .line 508
    :cond_7
    iget-wide v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->duration:J

    int-to-long v3, v0

    div-long/2addr v1, v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long v0, v1, v9

    if-lez v0, :cond_8

    return-wide v9

    :cond_8
    const-wide/16 v3, 0x14

    cmp-long v0, v1, v3

    if-gez v0, :cond_9

    return-wide v3

    :cond_9
    return-wide v1

    :catch_0
    return-wide v5
.end method

.method private updateButtonVolume(ZZ)V
    .locals 2

    .line 397
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonVolume:Landroid/widget/ImageButton;

    const v1, 0x7f0401bf

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result v0

    if-eqz p1, :cond_0

    .line 400
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonVolume:Landroid/widget/ImageButton;

    const p2, 0x7f0401c1

    invoke-static {p1, p2}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result p1

    .line 401
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonVolume:Landroid/widget/ImageButton;

    const v0, 0x7f0800f3

    invoke-virtual {p2, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 402
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonVolume:Landroid/widget/ImageButton;

    invoke-virtual {p2, p1}, Landroid/widget/ImageButton;->setColorFilter(I)V

    .line 404
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonVolumeS:Landroid/widget/ImageButton;

    if-eqz p2, :cond_2

    .line 405
    invoke-virtual {p2, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 406
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonVolumeS:Landroid/widget/ImageButton;

    invoke-virtual {p2, p1}, Landroid/widget/ImageButton;->setColorFilter(I)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 409
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonVolume:Landroid/widget/ImageButton;

    const p2, 0x7f080109

    invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 410
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonVolume:Landroid/widget/ImageButton;

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setColorFilter(I)V

    .line 412
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonVolumeS:Landroid/widget/ImageButton;

    if-eqz p1, :cond_2

    .line 413
    invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 414
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonVolumeS:Landroid/widget/ImageButton;

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setColorFilter(I)V

    goto :goto_0

    .line 417
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonVolume:Landroid/widget/ImageButton;

    const p2, 0x7f08010a

    invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 418
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonVolume:Landroid/widget/ImageButton;

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setColorFilter(I)V

    .line 420
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonVolumeS:Landroid/widget/ImageButton;

    if-eqz p1, :cond_2

    .line 421
    invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 422
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonVolumeS:Landroid/widget/ImageButton;

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setColorFilter(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method private updatePauseButtonImage(ZZ)V
    .locals 2

    if-eqz p2, :cond_7

    .line 337
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPause:Landroid/widget/ImageView;

    const/4 v0, 0x0

    if-eqz p2, :cond_3

    iget-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonPause:Landroid/widget/ImageButton;

    if-eqz v1, :cond_3

    if-eqz p1, :cond_1

    .line 340
    invoke-virtual {p2}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPause:Landroid/widget/ImageView;

    invoke-virtual {p2}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result p2

    if-nez p2, :cond_2

    .line 341
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPause:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->rotateAnimation:Landroid/view/animation/RotateAnimation;

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 343
    :cond_1
    invoke-virtual {p2}, Landroid/widget/ImageView;->clearAnimation()V

    .line 346
    :cond_2
    :goto_0
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPause:Landroid/widget/ImageView;

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 347
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonPause:Landroid/widget/ImageButton;

    const v1, 0x7f0800c0

    invoke-virtual {p2, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 350
    :cond_3
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPauseS:Landroid/widget/ImageView;

    if-eqz p2, :cond_9

    iget-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonPauseS:Landroid/widget/ImageButton;

    if-eqz v1, :cond_9

    if-eqz p1, :cond_5

    .line 352
    invoke-virtual {p2}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPauseS:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result p1

    if-nez p1, :cond_6

    .line 353
    :cond_4
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPauseS:Landroid/widget/ImageView;

    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->rotateAnimationS:Landroid/view/animation/RotateAnimation;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_1

    .line 355
    :cond_5
    invoke-virtual {p2}, Landroid/widget/ImageView;->clearAnimation()V

    .line 358
    :cond_6
    :goto_1
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPauseS:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 359
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonPauseS:Landroid/widget/ImageButton;

    const p2, 0x7f0800c1

    invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_2

    .line 364
    :cond_7
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPause:Landroid/widget/ImageView;

    const p2, 0x7f0800c3

    const/4 v0, 0x4

    if-eqz p1, :cond_8

    iget-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonPause:Landroid/widget/ImageButton;

    if-eqz v1, :cond_8

    .line 365
    invoke-virtual {p1}, Landroid/widget/ImageView;->clearAnimation()V

    .line 366
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPause:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 368
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonPause:Landroid/widget/ImageButton;

    invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 371
    :cond_8
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPauseS:Landroid/widget/ImageView;

    if-eqz p1, :cond_9

    iget-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonPauseS:Landroid/widget/ImageButton;

    if-eqz v1, :cond_9

    .line 372
    invoke-virtual {p1}, Landroid/widget/ImageView;->clearAnimation()V

    .line 373
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPauseS:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 375
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonPauseS:Landroid/widget/ImageButton;

    invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setImageResource(I)V

    :cond_9
    :goto_2
    return-void
.end method

.method private updatePauseButtonImageTrackUpdate()V
    .locals 2

    .line 381
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPause:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 382
    invoke-virtual {v0}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPause:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 383
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPause:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 384
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPause:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->rotateAnimation:Landroid/view/animation/RotateAnimation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 388
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPauseS:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 389
    invoke-virtual {v0}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPauseS:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 390
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPauseS:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 391
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPauseS:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->rotateAnimationS:Landroid/view/animation/RotateAnimation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public animateShow(I)V
    .locals 9

    .line 520
    invoke-direct {p0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x2

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    .line 522
    iget-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootS:Landroid/view/View;

    if-nez v2, :cond_1

    const/4 p1, 0x2

    .line 525
    :cond_1
    iget v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->lastShowLevel:I

    if-eq v2, p1, :cond_3

    .line 526
    iget-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->volumePopupWindowSingleton:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;

    if-eqz v2, :cond_2

    .line 528
    invoke-static {v2}, Lcom/daaw/avee/Common/UtilsUI;->dismissSafe(Landroid/widget/PopupWindow;)V

    .line 529
    iget-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->volumePopupWindowSingleton:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->clear()V

    .line 531
    :cond_2
    iget-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->ctrlOverflowPopupWindowSingleton:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;

    if-eqz v2, :cond_3

    .line 533
    invoke-static {v2}, Lcom/daaw/avee/Common/UtilsUI;->dismissSafe(Landroid/widget/PopupWindow;)V

    .line 534
    iget-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->ctrlOverflowPopupWindowSingleton:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->clear()V

    .line 540
    :cond_3
    iput p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->lastShowLevel:I

    .line 543
    iget-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootL:Landroid/view/View;

    .line 544
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const/high16 v4, 0x10e0000

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v3

    .line 546
    iget-object v4, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootBg:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f070159

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    const/4 v5, 0x0

    if-nez p1, :cond_4

    .line 550
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootBg:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 551
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootBg:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 552
    invoke-virtual {p1, v4}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    int-to-long v0, v3

    .line 553
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 555
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 556
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    iget-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootLHide:Ljava/lang/Runnable;

    invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 557
    invoke-virtual {p1, v4}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 558
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 560
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootS:Landroid/view/View;

    if-eqz p1, :cond_6

    .line 561
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 562
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootS:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    iget-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootSHide:Ljava/lang/Runnable;

    invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    iget v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->designHeight0:F

    .line 563
    invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 564
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    goto/16 :goto_0

    :cond_4
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    if-ne p1, v1, :cond_5

    .line 570
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootBg:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    iget v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->designHeight0:F

    sub-float v0, v4, v0

    .line 571
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v8}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    int-to-long v0, v3

    .line 572
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 574
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 575
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    iget-object v3, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootLHide:Ljava/lang/Runnable;

    invoke-virtual {p1, v3}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 576
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 577
    invoke-virtual {p1, v4}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 578
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 580
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootS:Landroid/view/View;

    if-eqz p1, :cond_6

    .line 581
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 582
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootS:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v6}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 583
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootS:Landroid/view/View;

    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 584
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootS:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 585
    invoke-virtual {p1, v5}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v8}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 586
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    goto :goto_0

    :cond_5
    if-ne p1, v0, :cond_6

    .line 592
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootBg:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 593
    invoke-virtual {p1, v5}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v8}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    int-to-long v0, v3

    .line 594
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 596
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 597
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 598
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v6}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 599
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 600
    invoke-virtual {p1, v5}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v8}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 601
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 603
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootS:Landroid/view/View;

    if-eqz p1, :cond_6

    .line 604
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 605
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootS:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    iget-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootSHide:Ljava/lang/Runnable;

    invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 606
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootS:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    iget v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->designHeight0:F

    neg-float v2, v2

    .line 607
    invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 608
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    :cond_6
    :goto_0
    return-void
.end method

.method public onAudioEffectsActiveChanged(Z)V
    .locals 2

    .line 623
    invoke-direct {p0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 625
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestVolumeMuteState:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 627
    invoke-direct {p0, v0, p1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onVolumeMuteChanged(ZZ)V

    return-void
.end method

.method public onCreateView(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
    .locals 5

    .line 206
    new-instance v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$5;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$5;-><init>(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)V

    .line 219
    new-instance v1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$6;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$6;-><init>(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)V

    .line 229
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07007e

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    iput v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->designHeight0:F

    .line 231
    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootL:Landroid/view/View;

    .line 232
    iput-object p3, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootBg:Landroid/view/View;

    .line 233
    iput-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootS:Landroid/view/View;

    .line 235
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/daaw/avee/Common/UtilsUI;->disallowInterceptTouchEventRecursive(Landroid/view/View;Landroid/view/ViewParent;)V

    const p2, 0x7f090250

    .line 239
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTime:Landroid/widget/TextView;

    const p2, 0x7f090253

    .line 240
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->lengthTime:Landroid/widget/TextView;

    const p2, 0x7f0901c5

    .line 242
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/SeekBar;

    iput-object p3, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->progress:Landroid/widget/SeekBar;

    const p3, 0x7f090254

    .line 243
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTitle:Landroid/widget/TextView;

    .line 244
    iget-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->progress:Landroid/widget/SeekBar;

    iget-object v3, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->seekListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    const v2, 0x7f09007f

    .line 246
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageButton;

    const v3, 0x7f0800bc

    .line 247
    invoke-virtual {v2, v3}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 248
    new-instance v3, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$7;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$7;-><init>(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f090079

    .line 255
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageButton;

    const v3, 0x7f0800be

    .line 256
    invoke-virtual {v2, v3}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 257
    new-instance v3, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$8;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$8;-><init>(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f09007a

    .line 264
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageButton;

    iput-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonPause:Landroid/widget/ImageButton;

    if-eqz v2, :cond_0

    .line 266
    new-instance v3, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$9;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$9;-><init>(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    const v2, 0x7f09026f

    .line 273
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPause:Landroid/widget/ImageView;

    const v2, 0x7f09008e

    .line 276
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageButton;

    iput-object v3, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonVolume:Landroid/widget/ImageButton;

    .line 277
    invoke-virtual {v3, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v3, 0x7f090076

    .line 280
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageButton;

    iput-object v4, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonOverflow:Landroid/widget/ImageButton;

    .line 281
    invoke-virtual {v4, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f090251

    .line 283
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iput-object v4, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->txtSongDetailInfo:Landroid/widget/TextView;

    const v4, 0x7f090252

    .line 284
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->txtSongDetailInfo0:Landroid/widget/TextView;

    .line 288
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootS:Landroid/view/View;

    if-eqz p1, :cond_1

    .line 289
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/SeekBar;

    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->progressS:Landroid/widget/SeekBar;

    .line 290
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootS:Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTitleS:Landroid/widget/TextView;

    .line 291
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->progressS:Landroid/widget/SeekBar;

    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->seekListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {p1, p2}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 295
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootS:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonVolumeS:Landroid/widget/ImageButton;

    .line 296
    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 298
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootS:Landroid/view/View;

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    .line 299
    invoke-virtual {p1, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 302
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootS:Landroid/view/View;

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->viewRootL:Landroid/view/View;

    :cond_2
    const p2, 0x7f09007b

    .line 304
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageButton;

    iput-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->buttonPauseS:Landroid/widget/ImageButton;

    if-eqz p2, :cond_3

    .line 306
    new-instance p3, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$10;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$10;-><init>(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)V

    invoke-virtual {p2, p3}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    const p2, 0x7f090270

    .line 313
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->overlayButtonPauseS:Landroid/widget/ImageView;

    .line 316
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestShowState:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 p2, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 p2, -0x1

    .line 317
    iput p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->lastShowLevel:I

    .line 318
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->animateShow(I)V

    .line 320
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestPlaystate:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance p2, Lcom/daaw/avee/Common/Tuple2;

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p2, v0, v1}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Common/Tuple2;

    .line 321
    iget-object p2, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->updatePlaystate(ZZ)V

    .line 322
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestTrackInfo:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance p2, Lcom/daaw/avee/Common/Tuple2;

    sget-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    sget-object v1, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;->empty:Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    invoke-direct {p2, v0, v1}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Common/Tuple2;

    .line 323
    iget-object p2, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    invoke-virtual {p0, p2, p1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->updateTrackInfo(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/comp/playback/PlayingMediaInfo;)V

    .line 325
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestVolumeMuteState:Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 326
    sget-object p2, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestAudioEffectsActiveState:Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 328
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onVolumeMuteChanged(ZZ)V

    const-wide/16 p1, 0x64

    .line 330
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->queueNextRefresh(J)V

    return-void
.end method

.method public onEqStateChanged(Z)V
    .locals 2

    .line 661
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->volumePopupWindowSingleton:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;

    if-eqz v0, :cond_0

    .line 663
    invoke-virtual {v0}, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 664
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;->onEqStateChanged(Z)V

    :cond_0
    return-void
.end method

.method public onMusicSysChanged(I)V
    .locals 2

    .line 654
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->ctrlOverflowPopupWindowSingleton:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;

    if-eqz v0, :cond_0

    .line 656
    invoke-virtual {v0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 657
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->onMusicSysChanged(I)V

    :cond_0
    return-void
.end method

.method public onRepeatModeChanged(I)V
    .locals 2

    .line 640
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->ctrlOverflowPopupWindowSingleton:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;

    if-eqz v0, :cond_0

    .line 642
    invoke-virtual {v0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 643
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->onRepeatModeChanged(I)V

    :cond_0
    return-void
.end method

.method public onShuffleModeChanged(I)V
    .locals 2

    .line 647
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->ctrlOverflowPopupWindowSingleton:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;

    if-eqz v0, :cond_0

    .line 649
    invoke-virtual {v0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 650
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->onShuffleModeChanged(I)V

    :cond_0
    return-void
.end method

.method public onVolumeMuteChanged(Z)V
    .locals 2

    .line 615
    invoke-direct {p0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 617
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestAudioEffectsActiveState:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 619
    invoke-direct {p0, p1, v0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onVolumeMuteChanged(ZZ)V

    return-void
.end method

.method public updatePlaystate(ZZ)V
    .locals 1

    .line 428
    invoke-direct {p0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 429
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->updatePauseButtonImage(ZZ)V

    return-void
.end method

.method public updateTrackInfo(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Lcom/daaw/avee/comp/playback/PlayingMediaInfo;)V
    .locals 4

    .line 433
    invoke-direct {p0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 435
    :cond_0
    iget-wide v0, p2, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;->duration:J

    iput-wide v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->duration:J

    .line 436
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->lengthTime:Landroid/widget/TextView;

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v1, v0

    invoke-static {v1}, Lcom/daaw/avee/Common/Utils;->getDurationStringHMSS(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 438
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTitle:Landroid/widget/TextView;

    iget-object v0, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 439
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTitle:Landroid/widget/TextView;

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setSelected(Z)V

    .line 440
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTitle:Landroid/widget/TextView;

    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 443
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTitle:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 444
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTitle:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setLongClickable(Z)V

    .line 446
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTitleS:Landroid/widget/TextView;

    if-eqz p2, :cond_1

    .line 447
    iget-object v2, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 448
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTitleS:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setSelected(Z)V

    .line 450
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTitleS:Landroid/widget/TextView;

    sget-object v0, Landroid/text/TextUtils$TruncateAt;->MARQUEE:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 451
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTitleS:Landroid/widget/TextView;

    new-instance v0, Lcom/daaw/avee/comp/MediaControlsUI/MyTitleScrollingMovementMethod;

    invoke-direct {v0}, Lcom/daaw/avee/comp/MediaControlsUI/MyTitleScrollingMovementMethod;-><init>()V

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 452
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTitleS:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 453
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->currentTitleS:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setLongClickable(Z)V

    .line 456
    :cond_1
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->txtSongDetailInfo:Landroid/widget/TextView;

    const-string v0, ""

    if-eqz p2, :cond_2

    .line 457
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 459
    :cond_2
    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->txtSongDetailInfo0:Landroid/widget/TextView;

    if-eqz p2, :cond_4

    .line 460
    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->isArtistKnownOrSecondName()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    :cond_3
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    const-wide/16 p1, 0x64

    .line 462
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->queueNextRefresh(J)V

    .line 464
    invoke-direct {p0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->updatePauseButtonImageTrackUpdate()V

    return-void
.end method

.method public updateVideoScaleMode(I)V
    .locals 2

    .line 669
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->ctrlOverflowPopupWindowSingleton:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;

    if-eqz v0, :cond_0

    .line 671
    invoke-virtual {v0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 672
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->updateVideoScaleMode(I)V

    :cond_0
    return-void
.end method
