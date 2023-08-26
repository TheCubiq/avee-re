.class public Lcom/daaw/avee/MainActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "MainActivity.java"

# interfaces
.implements Landroidx/core/app/ActivityCompat$OnRequestPermissionsResultCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/MainActivity$SectionsPagerAdapter;
    }
.end annotation


# static fields
.field public static final LIBRARY_PAGE_INDEX:I = 0x0

.field private static final MSG_HIDE:I = 0x2

.field private static final MSG_TICK1:I = 0x4

.field private static final MSG_TICK10:I = 0x3

.field public static final QUEUE_PAGE_INDEX:I = 0x1

.field public static final VISUAL_PAGE_INDEX:I = 0x2

.field static volatile instanceWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/MainActivity;",
            ">;"
        }
    .end annotation
.end field

.field public static onActivityResult:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/lang/Integer;",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field public static onActivityResult0:Lcom/daaw/avee/Common/Events/WeakEventR3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR3<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Landroid/content/Intent;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onBackPressed:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Landroid/app/Activity;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onCreate:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public static onCreateEarly:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public static onCreateView:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public static onDestroy:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field

.field public static onExit:Lcom/daaw/avee/Common/Events/WeakEvent;

.field public static onFullscreenChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onLaunchIntent:Lcom/daaw/avee/Common/Events/WeakEventR2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR2<",
            "Lcom/daaw/avee/ContextData;",
            "Landroid/content/Intent;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onMainUIAction:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field

.field public static onMainUIRequestSleepTimerConfig:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;",
            ">;"
        }
    .end annotation
.end field

.field public static onPause:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public static onPreviewOpen:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestAlbumArtLarge:Lcom/daaw/avee/Common/Events/WeakEvent4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent4<",
            "Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;",
            "Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestCurrentSearchEntry:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/comp/Common/ISearchEntry;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestIsPremiumIsPremiumAvailable:Lcom/daaw/avee/Common/Events/WeakEventR;
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

.field public static onRequestLockOrientState:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestPermissionsResult:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Landroid/app/Activity;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestShouldShowControls:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestTrackInfo:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
            ">;"
        }
    .end annotation
.end field

.field public static onResume:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public static onSetCurrentSearchIndex:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onStart:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public static onStop:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public static onToolbarAction:Lcom/daaw/avee/Common/Events/WeakEventR2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR2<",
            "Lcom/daaw/avee/ContextData;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onUISearchQueryStateChange:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onUISearchQueryTextChange:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static onViewPagerPageSelected:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/lang/Integer;",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public static onViewPagerSwipeOutAtStart:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public static onViewPagerSwipeProgressUpdate:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/lang/Float;",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private assignedSongData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

.field public currentFragmentPage:I

.field private drawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

.field private handler:Landroid/os/Handler;

.field private listenerReferenceHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private lockOrientIndicatorMenuItem:Landroid/view/MenuItem;

.field playerCore:Lcom/daaw/avee/PlayerCore;

.field premiumMenuWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation
.end field

.field private searchMenuItem:Landroid/view/MenuItem;

.field private sectionsPagerAdapter:Lcom/daaw/avee/MainActivity$SectionsPagerAdapter;

.field private sleepTimerIndicatorMenuItem:Landroid/view/MenuItem;

.field private slowClosingInProgress:Z

.field private slowClosingTimer:Ljava/util/Timer;

.field private slowClosingToast:Landroid/widget/Toast;

.field private switchLockOrient:Landroidx/appcompat/widget/SwitchCompat;

.field private switchSleepTimer:Landroidx/appcompat/widget/SwitchCompat;

.field private systemUiHider:Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;

.field private toolbar:Landroidx/appcompat/widget/Toolbar;

.field private viewPager:Lcom/daaw/avee/CustomViewPager;

.field private vizBtn0MenuItem:Landroid/view/MenuItem;

.field private vizBtn1MenuItem:Landroid/view/MenuItem;

.field private vizBtn2MenuItem:Landroid/view/MenuItem;

.field vizMenuButtonAnimator:Landroid/animation/ValueAnimator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 89
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onCreate:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 90
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onStart:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 91
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onResume:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 92
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onPause:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 93
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onStop:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 94
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onDestroy:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 95
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onExit:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 96
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onViewPagerPageSelected:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 97
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onCreateEarly:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 98
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onMainUIAction:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 99
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent4;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent4;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onRequestAlbumArtLarge:Lcom/daaw/avee/Common/Events/WeakEvent4;

    .line 100
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onMainUIRequestSleepTimerConfig:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 101
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onRequestLockOrientState:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 102
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onUISearchQueryTextChange:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 103
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onUISearchQueryStateChange:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 104
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onSetCurrentSearchIndex:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 105
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onRequestCurrentSearchEntry:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 106
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onCreateView:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 107
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onPreviewOpen:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 108
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onFullscreenChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 109
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onViewPagerSwipeOutAtStart:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 110
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onViewPagerSwipeProgressUpdate:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 111
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onRequestPermissionsResult:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 112
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR3;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onActivityResult0:Lcom/daaw/avee/Common/Events/WeakEventR3;

    .line 113
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onActivityResult:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 114
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onRequestTrackInfo:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 115
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onRequestIsPremiumIsPremiumAvailable:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 116
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onRequestShouldShowControls:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 117
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onBackPressed:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 118
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR2;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onLaunchIntent:Lcom/daaw/avee/Common/Events/WeakEventR2;

    .line 119
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR2;-><init>()V

    sput-object v0, Lcom/daaw/avee/MainActivity;->onToolbarAction:Lcom/daaw/avee/Common/Events/WeakEventR2;

    .line 121
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/MainActivity;->instanceWeak:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 151
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    const/4 v0, -0x1

    .line 125
    iput v0, p0, Lcom/daaw/avee/MainActivity;->currentFragmentPage:I

    .line 128
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/MainActivity;->premiumMenuWeak:Ljava/lang/ref/WeakReference;

    const/4 v0, 0x0

    .line 130
    iput-boolean v0, p0, Lcom/daaw/avee/MainActivity;->slowClosingInProgress:Z

    .line 132
    iput-object v1, p0, Lcom/daaw/avee/MainActivity;->slowClosingTimer:Ljava/util/Timer;

    .line 139
    iput-object v1, p0, Lcom/daaw/avee/MainActivity;->searchMenuItem:Landroid/view/MenuItem;

    .line 140
    iput-object v1, p0, Lcom/daaw/avee/MainActivity;->sleepTimerIndicatorMenuItem:Landroid/view/MenuItem;

    .line 141
    iput-object v1, p0, Lcom/daaw/avee/MainActivity;->lockOrientIndicatorMenuItem:Landroid/view/MenuItem;

    .line 142
    iput-object v1, p0, Lcom/daaw/avee/MainActivity;->vizBtn0MenuItem:Landroid/view/MenuItem;

    .line 143
    iput-object v1, p0, Lcom/daaw/avee/MainActivity;->vizBtn1MenuItem:Landroid/view/MenuItem;

    .line 144
    iput-object v1, p0, Lcom/daaw/avee/MainActivity;->vizBtn2MenuItem:Landroid/view/MenuItem;

    .line 147
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/MainActivity;->listenerReferenceHolder:Ljava/util/List;

    .line 149
    sget-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    iput-object v0, p0, Lcom/daaw/avee/MainActivity;->assignedSongData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 153
    sget-object v0, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/MainActivity$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/MainActivity$1;-><init>(Lcom/daaw/avee/MainActivity;)V

    iget-object v2, p0, Lcom/daaw/avee/MainActivity;->listenerReferenceHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 176
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/daaw/avee/MainActivity$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/MainActivity$2;-><init>(Lcom/daaw/avee/MainActivity;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/daaw/avee/MainActivity;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/MainActivity;)Landroid/os/Handler;
    .locals 0

    .line 79
    iget-object p0, p0, Lcom/daaw/avee/MainActivity;->handler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/MainActivity;ZIZ)V
    .locals 0

    .line 79
    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/avee/MainActivity;->showControls(ZIZ)V

    return-void
.end method

.method static synthetic access$202(Lcom/daaw/avee/MainActivity;Z)Z
    .locals 0

    .line 79
    iput-boolean p1, p0, Lcom/daaw/avee/MainActivity;->slowClosingInProgress:Z

    return p1
.end method

.method static synthetic access$300(Lcom/daaw/avee/MainActivity;)Landroid/widget/Toast;
    .locals 0

    .line 79
    iget-object p0, p0, Lcom/daaw/avee/MainActivity;->slowClosingToast:Landroid/widget/Toast;

    return-object p0
.end method

.method static synthetic access$400(Lcom/daaw/avee/MainActivity;)Ljava/util/Timer;
    .locals 0

    .line 79
    iget-object p0, p0, Lcom/daaw/avee/MainActivity;->slowClosingTimer:Ljava/util/Timer;

    return-object p0
.end method

.method private closeSearchView()Z
    .locals 3

    .line 833
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->searchMenuItem:Landroid/view/MenuItem;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 834
    :cond_0
    invoke-interface {v0}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SearchView;

    if-nez v0, :cond_1

    return v1

    .line 837
    :cond_1
    invoke-virtual {v0}, Landroid/widget/SearchView;->isIconified()Z

    move-result v2

    if-nez v2, :cond_2

    .line 838
    iget v2, p0, Lcom/daaw/avee/MainActivity;->currentFragmentPage:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/SearchView;->setTag(Ljava/lang/Object;)V

    const-string v2, ""

    .line 839
    invoke-virtual {v0, v2, v1}, Landroid/widget/SearchView;->setQuery(Ljava/lang/CharSequence;Z)V

    const/4 v1, 0x1

    .line 840
    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconified(Z)V

    :cond_2
    return v1
.end method

.method private findFragmentByPosition(I)Landroid/app/Fragment;
    .locals 5

    .line 856
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->viewPager:Lcom/daaw/avee/CustomViewPager;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/daaw/avee/MainActivity;->sectionsPagerAdapter:Lcom/daaw/avee/MainActivity$SectionsPagerAdapter;

    if-nez v1, :cond_0

    goto :goto_0

    .line 859
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "android:switcher:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 860
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getId()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 861
    invoke-virtual {v1, p1}, Landroidx/legacy/app/FragmentPagerAdapter;->getItemId(I)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 859
    invoke-virtual {v2, p1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public static getFragment0Instance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;
    .locals 2

    .line 244
    sget-object v0, Lcom/daaw/avee/MainActivity;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/MainActivity;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 246
    invoke-direct {v0, v1}, Lcom/daaw/avee/MainActivity;->findFragmentByPosition(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;

    return-object v0
.end method

.method public static getFragment1Instance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;
    .locals 2

    .line 250
    sget-object v0, Lcom/daaw/avee/MainActivity;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/MainActivity;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v1, 0x1

    .line 252
    invoke-direct {v0, v1}, Lcom/daaw/avee/MainActivity;->findFragmentByPosition(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;

    return-object v0
.end method

.method public static getFragment2Instance()Lcom/daaw/avee/comp/VisualUI/Fragment2;
    .locals 2

    .line 256
    sget-object v0, Lcom/daaw/avee/MainActivity;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/MainActivity;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v1, 0x2

    .line 258
    invoke-direct {v0, v1}, Lcom/daaw/avee/MainActivity;->findFragmentByPosition(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;

    return-object v0
.end method

.method public static getInstance()Lcom/daaw/avee/MainActivity;
    .locals 1

    .line 240
    sget-object v0, Lcom/daaw/avee/MainActivity;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/MainActivity;

    return-object v0
.end method

.method private getToolBar()Landroidx/appcompat/widget/Toolbar;
    .locals 1

    .line 262
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->toolbar:Landroidx/appcompat/widget/Toolbar;

    return-object v0
.end method

.method private setSearchViewStyle(Landroid/widget/SearchView;)V
    .locals 2

    const v0, 0x7f060126

    .line 828
    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    const v1, 0x7f0600e2

    .line 829
    invoke-static {p0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    .line 827
    invoke-static {p1, v0, v1}, Lcom/daaw/avee/Common/UtilsUI;->setViewStyle(Landroid/view/View;II)V

    return-void
.end method

.method private showControls(ZIZ)V
    .locals 5

    .line 955
    invoke-virtual {p0, p1}, Lcom/daaw/avee/MainActivity;->resetVideoMaximizeTimeout(Z)V

    .line 957
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne p2, v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 960
    :goto_0
    invoke-direct {p0, v4}, Lcom/daaw/avee/MainActivity;->updateVizButtonVisibility(Z)V

    if-eqz p1, :cond_3

    if-eqz v0, :cond_2

    if-ne p2, v1, :cond_1

    .line 966
    invoke-virtual {v0, v2}, Landroidx/appcompat/app/ActionBar;->setDisplayShowTitleEnabled(Z)V

    .line 967
    invoke-virtual {v0, v2}, Landroidx/appcompat/app/ActionBar;->setDisplayShowHomeEnabled(Z)V

    .line 969
    invoke-direct {p0}, Lcom/daaw/avee/MainActivity;->getToolBar()Landroidx/appcompat/widget/Toolbar;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/avee/Common/UtilsUI;->showControl(Landroid/view/View;)V

    goto :goto_1

    .line 971
    :cond_1
    invoke-virtual {v0, v3}, Landroidx/appcompat/app/ActionBar;->setDisplayShowTitleEnabled(Z)V

    .line 972
    invoke-virtual {v0, v3}, Landroidx/appcompat/app/ActionBar;->setDisplayShowHomeEnabled(Z)V

    .line 974
    invoke-direct {p0}, Lcom/daaw/avee/MainActivity;->getToolBar()Landroidx/appcompat/widget/Toolbar;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/avee/Common/UtilsUI;->showControl(Landroid/view/View;)V

    .line 978
    :cond_2
    :goto_1
    sget-object p2, Lcom/daaw/avee/MainActivity;->onRequestTrackInfo:Lcom/daaw/avee/Common/Events/WeakEventR;

    sget-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    invoke-virtual {p2, v0}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    invoke-virtual {p0, p2}, Lcom/daaw/avee/MainActivity;->updateActionBar(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V

    if-nez p3, :cond_5

    .line 980
    iget-object p2, p0, Lcom/daaw/avee/MainActivity;->systemUiHider:Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->show()V

    goto :goto_2

    :cond_3
    if-eqz v0, :cond_4

    .line 985
    invoke-direct {p0}, Lcom/daaw/avee/MainActivity;->getToolBar()Landroidx/appcompat/widget/Toolbar;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/avee/Common/UtilsUI;->hideControl(Landroid/view/View;)V

    :cond_4
    if-nez p3, :cond_5

    .line 988
    iget-object p2, p0, Lcom/daaw/avee/MainActivity;->systemUiHider:Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->hide()V

    .line 991
    :cond_5
    :goto_2
    sget-object p2, Lcom/daaw/avee/MainActivity;->onFullscreenChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    xor-int/2addr p1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method private updateVizButtonVisibility(Z)V
    .locals 6

    const/high16 v0, 0x10e0000

    const/16 v1, 0x13

    if-eqz p1, :cond_1

    .line 903
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->vizBtn0MenuItem:Landroid/view/MenuItem;

    if-eqz p1, :cond_3

    .line 905
    invoke-interface {p1}, Landroid/view/MenuItem;->isVisible()Z

    move-result p1

    if-nez p1, :cond_3

    .line 906
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v2, 0x1

    if-lt p1, v1, :cond_0

    .line 907
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    .line 910
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->vizBtn0MenuItem:Landroid/view/MenuItem;

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 911
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->vizBtn1MenuItem:Landroid/view/MenuItem;

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 912
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->vizBtn2MenuItem:Landroid/view/MenuItem;

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 914
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->vizMenuButtonAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/daaw/avee/-$$Lambda$MainActivity$hbXXvgvLAuFEVG1Ve8IPNP6TJXk;

    invoke-direct {v1, p0}, Lcom/daaw/avee/-$$Lambda$MainActivity$hbXXvgvLAuFEVG1Ve8IPNP6TJXk;-><init>(Lcom/daaw/avee/MainActivity;)V

    iget-object v2, p0, Lcom/daaw/avee/MainActivity;->vizBtn0MenuItem:Landroid/view/MenuItem;

    .line 918
    invoke-interface {v2}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getAlpha()I

    move-result v2

    int-to-long v3, p1

    .line 914
    invoke-static {v0, v1, v2, v3, v4}, Lcom/daaw/avee/Common/UtilsUI;->animShowCustom255(Landroid/animation/ValueAnimator;Lcom/daaw/avee/Common/Action1;IJ)Landroid/animation/ValueAnimator;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/MainActivity;->vizMenuButtonAnimator:Landroid/animation/ValueAnimator;

    goto :goto_0

    .line 920
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->vizBtn0MenuItem:Landroid/view/MenuItem;

    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 921
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->vizBtn1MenuItem:Landroid/view/MenuItem;

    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 922
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->vizBtn2MenuItem:Landroid/view/MenuItem;

    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_0

    .line 927
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->vizBtn0MenuItem:Landroid/view/MenuItem;

    if-eqz p1, :cond_3

    .line 928
    invoke-interface {p1}, Landroid/view/MenuItem;->isVisible()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 929
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v1, :cond_2

    .line 930
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    .line 934
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->vizMenuButtonAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/daaw/avee/-$$Lambda$MainActivity$i_DABTj1lyFM03D9yEWI3RZHKqA;

    invoke-direct {v1, p0}, Lcom/daaw/avee/-$$Lambda$MainActivity$i_DABTj1lyFM03D9yEWI3RZHKqA;-><init>(Lcom/daaw/avee/MainActivity;)V

    iget-object v2, p0, Lcom/daaw/avee/MainActivity;->vizBtn0MenuItem:Landroid/view/MenuItem;

    .line 938
    invoke-interface {v2}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getAlpha()I

    move-result v2

    int-to-long v3, p1

    new-instance v5, Lcom/daaw/avee/-$$Lambda$MainActivity$DJR_I-3mdGPxVyBIJS5TddvTK3g;

    invoke-direct {v5, p0}, Lcom/daaw/avee/-$$Lambda$MainActivity$DJR_I-3mdGPxVyBIJS5TddvTK3g;-><init>(Lcom/daaw/avee/MainActivity;)V

    .line 934
    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/Common/UtilsUI;->animHideCustom255(Landroid/animation/ValueAnimator;Lcom/daaw/avee/Common/Action1;IJLcom/daaw/avee/Common/Action;)Landroid/animation/ValueAnimator;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/MainActivity;->vizMenuButtonAnimator:Landroid/animation/ValueAnimator;

    goto :goto_0

    .line 944
    :cond_2
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->vizBtn0MenuItem:Landroid/view/MenuItem;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 945
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->vizBtn1MenuItem:Landroid/view/MenuItem;

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 946
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->vizBtn2MenuItem:Landroid/view/MenuItem;

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public doExit()V
    .locals 1

    .line 865
    sget-object v0, Lcom/daaw/avee/MainActivity;->onExit:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    .line 866
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->finish()V

    return-void
.end method

.method public doExitFromService()V
    .locals 0

    .line 870
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->finish()V

    return-void
.end method

.method public synthetic lambda$onCreate$0$MainActivity(Landroid/view/MenuItem;)Z
    .locals 0

    .line 323
    invoke-virtual {p0, p1}, Lcom/daaw/avee/MainActivity;->onMenuItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 327
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->drawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1}, Landroidx/drawerlayout/widget/DrawerLayout;->closeDrawers()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public synthetic lambda$onCreate$1$MainActivity(Landroid/widget/CompoundButton;Z)V
    .locals 1

    if-eqz p2, :cond_0

    .line 345
    sget-object p1, Lcom/daaw/avee/MainActivity;->onMainUIAction:Lcom/daaw/avee/Common/Events/WeakEvent2;

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-instance v0, Lcom/daaw/avee/ContextData;

    invoke-direct {v0, p0}, Lcom/daaw/avee/ContextData;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p1, p2, v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 347
    :cond_0
    sget-object p1, Lcom/daaw/avee/MainActivity;->onMainUIAction:Lcom/daaw/avee/Common/Events/WeakEvent2;

    const/16 p2, 0xa

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-instance v0, Lcom/daaw/avee/ContextData;

    invoke-direct {v0, p0}, Lcom/daaw/avee/ContextData;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p1, p2, v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public synthetic lambda$onCreate$2$MainActivity(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 354
    sget-object p1, Lcom/daaw/avee/MainActivity;->onMainUIAction:Lcom/daaw/avee/Common/Events/WeakEvent2;

    const/4 p2, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-instance v0, Lcom/daaw/avee/ContextData;

    invoke-direct {v0, p0}, Lcom/daaw/avee/ContextData;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p1, p2, v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic lambda$updateSleepTimerIndicatorTh$6$MainActivity(ZZ)V
    .locals 0

    .line 1052
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/MainActivity;->updateSleepTimerIndicator(ZZ)V

    return-void
.end method

.method public synthetic lambda$updateVizButtonVisibility$3$MainActivity(Ljava/lang/Integer;)V
    .locals 2

    .line 915
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->vizBtn0MenuItem:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 916
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->vizBtn1MenuItem:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 917
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->vizBtn2MenuItem:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void
.end method

.method public synthetic lambda$updateVizButtonVisibility$4$MainActivity(Ljava/lang/Integer;)V
    .locals 2

    .line 935
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->vizBtn0MenuItem:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 936
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->vizBtn1MenuItem:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 937
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->vizBtn2MenuItem:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void
.end method

.method public synthetic lambda$updateVizButtonVisibility$5$MainActivity()V
    .locals 2

    .line 939
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->vizBtn0MenuItem:Landroid/view/MenuItem;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 940
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->vizBtn1MenuItem:Landroid/view/MenuItem;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 941
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->vizBtn2MenuItem:Landroid/view/MenuItem;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .line 1102
    invoke-super {p0, p1, p2, p3}, Landroidx/appcompat/app/AppCompatActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 1104
    sget-object v0, Lcom/daaw/avee/MainActivity;->onActivityResult0:Lcom/daaw/avee/Common/Events/WeakEventR3;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, p1, v1, p3, v2}, Lcom/daaw/avee/Common/Events/WeakEventR3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    .line 1106
    sget-object p1, Lcom/daaw/avee/MainActivity;->onActivityResult:Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 581
    sget-object v0, Lcom/daaw/avee/MainActivity;->onBackPressed:Lcom/daaw/avee/Common/Events/WeakEventR1;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 583
    :cond_0
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onBackPressed()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 277
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 279
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object p1, Lcom/daaw/avee/MainActivity;->instanceWeak:Ljava/lang/ref/WeakReference;

    .line 281
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/daaw/avee/AppPermissions;->isPermissionsGranted(Landroid/content/Context;Landroid/app/Activity;)Z

    .line 283
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/MainActivity;->playerCore:Lcom/daaw/avee/PlayerCore;

    const/4 p1, 0x0

    .line 285
    iput-object p1, p0, Lcom/daaw/avee/MainActivity;->sectionsPagerAdapter:Lcom/daaw/avee/MainActivity$SectionsPagerAdapter;

    .line 286
    iput-object p1, p0, Lcom/daaw/avee/MainActivity;->viewPager:Lcom/daaw/avee/CustomViewPager;

    const/4 v0, 0x0

    .line 289
    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f130004

    invoke-static {v1, v2, v0}, Landroid/preference/PreferenceManager;->setDefaultValues(Landroid/content/Context;IZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 291
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 294
    :goto_0
    sget-object v1, Lcom/daaw/avee/MainActivity;->onCreateEarly:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 295
    sget-object v1, Lcom/daaw/avee/MainActivity;->onCreate:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v1, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    const v1, 0x7f0c0085

    .line 298
    invoke-virtual {p0, v1}, Lcom/daaw/avee/MainActivity;->setContentView(I)V

    const v1, 0x7f09021a

    .line 302
    invoke-virtual {p0, v1}, Lcom/daaw/avee/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/Toolbar;

    iput-object v1, p0, Lcom/daaw/avee/MainActivity;->toolbar:Landroidx/appcompat/widget/Toolbar;

    .line 303
    invoke-virtual {p0, v1}, Lcom/daaw/avee/MainActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    const v1, 0x7f090272

    .line 305
    invoke-virtual {p0, v1}, Lcom/daaw/avee/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/UtilsUI;->setStatusBarDimensions(Landroid/view/View;)V

    const v1, 0x7f0900c1

    .line 309
    invoke-virtual {p0, v1}, Lcom/daaw/avee/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/drawerlayout/widget/DrawerLayout;

    iput-object v1, p0, Lcom/daaw/avee/MainActivity;->drawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

    const v1, 0x7f09016d

    .line 310
    invoke-virtual {p0, v1}, Lcom/daaw/avee/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/navigation/NavigationView;

    .line 314
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    const v3, 0x7f0400bf

    const v4, 0x7f060126

    invoke-static {v2, p0, v3, v4}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColorWithAlphaRes(Landroid/content/res/Resources$Theme;Landroid/content/Context;II)I

    move-result v2

    .line 315
    invoke-virtual {v1, v2}, Lcom/google/android/material/navigation/NavigationView;->setBackgroundColor(I)V

    .line 317
    invoke-virtual {v1, v0}, Lcom/google/android/material/navigation/NavigationView;->getHeaderView(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f09016c

    .line 318
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 319
    invoke-static {}, Lcom/daaw/avee/Common/Utils;->getAppVersionName()Ljava/lang/String;

    move-result-object v3

    .line 320
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 321
    new-instance v2, Lcom/daaw/avee/-$$Lambda$MainActivity$Omt0EhIBoNicXgyrJLwWm_NpyJE;

    invoke-direct {v2, p0}, Lcom/daaw/avee/-$$Lambda$MainActivity$Omt0EhIBoNicXgyrJLwWm_NpyJE;-><init>(Lcom/daaw/avee/MainActivity;)V

    invoke-virtual {v1, v2}, Lcom/google/android/material/navigation/NavigationView;->setNavigationItemSelectedListener(Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;)V

    .line 335
    invoke-virtual {v1}, Lcom/google/android/material/navigation/NavigationView;->getMenu()Landroid/view/Menu;

    move-result-object v2

    const v3, 0x7f090148

    invoke-interface {v2, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    .line 336
    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v3, p0, Lcom/daaw/avee/MainActivity;->premiumMenuWeak:Ljava/lang/ref/WeakReference;

    .line 338
    invoke-virtual {v1}, Lcom/google/android/material/navigation/NavigationView;->getMenu()Landroid/view/Menu;

    move-result-object v2

    const v3, 0x7f09014b

    invoke-interface {v2, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0900c2

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/SwitchCompat;

    iput-object v2, p0, Lcom/daaw/avee/MainActivity;->switchSleepTimer:Landroidx/appcompat/widget/SwitchCompat;

    .line 339
    invoke-virtual {v1}, Lcom/google/android/material/navigation/NavigationView;->getMenu()Landroid/view/Menu;

    move-result-object v1

    const v2, 0x7f090147

    invoke-interface {v1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/SwitchCompat;

    iput-object v1, p0, Lcom/daaw/avee/MainActivity;->switchLockOrient:Landroidx/appcompat/widget/SwitchCompat;

    .line 342
    iget-object v1, p0, Lcom/daaw/avee/MainActivity;->switchSleepTimer:Landroidx/appcompat/widget/SwitchCompat;

    new-instance v2, Lcom/daaw/avee/-$$Lambda$MainActivity$QxIAKQWMvFeSGtI0xAak5lNXQLo;

    invoke-direct {v2, p0}, Lcom/daaw/avee/-$$Lambda$MainActivity$QxIAKQWMvFeSGtI0xAak5lNXQLo;-><init>(Lcom/daaw/avee/MainActivity;)V

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/SwitchCompat;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 352
    iget-object v1, p0, Lcom/daaw/avee/MainActivity;->switchLockOrient:Landroidx/appcompat/widget/SwitchCompat;

    new-instance v2, Lcom/daaw/avee/-$$Lambda$MainActivity$aGyIZYEjlGhQ3vaRru5rzQiNo4w;

    invoke-direct {v2, p0}, Lcom/daaw/avee/-$$Lambda$MainActivity$aGyIZYEjlGhQ3vaRru5rzQiNo4w;-><init>(Lcom/daaw/avee/MainActivity;)V

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/SwitchCompat;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 367
    sget-object v1, Lcom/daaw/avee/MainActivity;->onCreateView:Lcom/daaw/avee/Common/Events/WeakEvent3;

    const v2, 0x7f090129

    invoke-virtual {p0, v2}, Lcom/daaw/avee/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f09012b

    .line 368
    invoke-virtual {p0, v3}, Lcom/daaw/avee/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f09012a

    .line 369
    invoke-virtual {p0, v4}, Lcom/daaw/avee/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 367
    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 373
    new-instance v1, Lcom/daaw/avee/MainActivity$SectionsPagerAdapter;

    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/daaw/avee/MainActivity$SectionsPagerAdapter;-><init>(Lcom/daaw/avee/MainActivity;Landroid/app/FragmentManager;)V

    iput-object v1, p0, Lcom/daaw/avee/MainActivity;->sectionsPagerAdapter:Lcom/daaw/avee/MainActivity$SectionsPagerAdapter;

    const v1, 0x7f090271

    .line 374
    invoke-virtual {p0, v1}, Lcom/daaw/avee/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/CustomViewPager;

    iput-object v1, p0, Lcom/daaw/avee/MainActivity;->viewPager:Lcom/daaw/avee/CustomViewPager;

    .line 375
    iget-object v2, p0, Lcom/daaw/avee/MainActivity;->sectionsPagerAdapter:Lcom/daaw/avee/MainActivity$SectionsPagerAdapter;

    invoke-virtual {v1, v2}, Lcom/daaw/avee/CustomViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 376
    iget-object v1, p0, Lcom/daaw/avee/MainActivity;->viewPager:Lcom/daaw/avee/CustomViewPager;

    new-instance v2, Lcom/daaw/avee/MainActivity$3;

    invoke-direct {v2, p0}, Lcom/daaw/avee/MainActivity$3;-><init>(Lcom/daaw/avee/MainActivity;)V

    invoke-virtual {v1, v2}, Lcom/daaw/avee/CustomViewPager;->setOnSwipeOutListener(Lcom/daaw/avee/CustomViewPager$OnSwipeOutListener;)V

    .line 393
    iput-object p1, p0, Lcom/daaw/avee/MainActivity;->systemUiHider:Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;

    .line 394
    new-instance p1, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;

    iget-object v1, p0, Lcom/daaw/avee/MainActivity;->viewPager:Lcom/daaw/avee/CustomViewPager;

    const/4 v2, 0x2

    invoke-direct {p1, v1, v2}, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;-><init>(Landroid/view/View;I)V

    iput-object p1, p0, Lcom/daaw/avee/MainActivity;->systemUiHider:Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;

    .line 395
    invoke-virtual {p1}, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->setup()V

    .line 396
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->systemUiHider:Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->show()V

    .line 398
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->systemUiHider:Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;

    new-instance v1, Lcom/daaw/avee/MainActivity$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/MainActivity$4;-><init>(Lcom/daaw/avee/MainActivity;)V

    invoke-virtual {p1, v1}, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->setOnVisibilityChangeListener(Lcom/daaw/avee/Common/SystemUiHider$OnVisibilityChangeListener;)V

    .line 406
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    .line 408
    sget-object v1, Lcom/daaw/avee/MainActivity;->onLaunchIntent:Lcom/daaw/avee/Common/Events/WeakEventR2;

    new-instance v3, Lcom/daaw/avee/ContextData;

    invoke-direct {v3, p0}, Lcom/daaw/avee/ContextData;-><init>(Landroid/app/Activity;)V

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v3, p1, v0}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 409
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->viewPager:Lcom/daaw/avee/CustomViewPager;

    invoke-virtual {p1, v2}, Lcom/daaw/avee/CustomViewPager;->setCurrentItem(I)V

    .line 410
    invoke-virtual {p0, v2}, Lcom/daaw/avee/MainActivity;->onViewPagerPageSelected(I)V

    goto :goto_1

    .line 412
    :cond_0
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_mainPageIndex:I

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result p1

    .line 413
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->viewPager:Lcom/daaw/avee/CustomViewPager;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/CustomViewPager;->setCurrentItem(I)V

    .line 414
    invoke-virtual {p0, p1}, Lcom/daaw/avee/MainActivity;->onViewPagerPageSelected(I)V

    .line 419
    :goto_1
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->viewPager:Lcom/daaw/avee/CustomViewPager;

    new-instance v0, Lcom/daaw/avee/MainActivity$5;

    invoke-direct {v0, p0}, Lcom/daaw/avee/MainActivity$5;-><init>(Lcom/daaw/avee/MainActivity;)V

    invoke-virtual {p1, v0}, Lcom/daaw/avee/CustomViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 434
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->handler:Landroid/os/Handler;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    .line 435
    iget-object v1, p0, Lcom/daaw/avee/MainActivity;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 436
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->handler:Landroid/os/Handler;

    const-wide/16 v1, 0x2710

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 438
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->handler:Landroid/os/Handler;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    .line 439
    iget-object v1, p0, Lcom/daaw/avee/MainActivity;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 440
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->handler:Landroid/os/Handler;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 4

    .line 588
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0002

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 592
    sget-object v0, Lcom/daaw/avee/MainActivity;->onMainUIRequestSleepTimerConfig:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;

    if-nez v0, :cond_0

    .line 595
    new-instance v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;

    invoke-direct {v0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;-><init>()V

    .line 597
    :cond_0
    iget-boolean v0, v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;->enabled:Z

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/MainActivity;->updateSleepTimerIndicator(ZZ)V

    .line 602
    sget-object v0, Lcom/daaw/avee/MainActivity;->onRequestLockOrientState:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 603
    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/MainActivity;->updateLockOrientIndicator(ZZ)V

    const v0, 0x7f090032

    .line 607
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/MainActivity;->searchMenuItem:Landroid/view/MenuItem;

    .line 608
    invoke-interface {v0}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SearchView;

    if-eqz v0, :cond_1

    .line 610
    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconifiedByDefault(Z)V

    .line 611
    invoke-virtual {v0, v2}, Landroid/widget/SearchView;->setSubmitButtonEnabled(Z)V

    .line 612
    new-instance v3, Lcom/daaw/avee/MainActivity$7;

    invoke-direct {v3, p0, v0}, Lcom/daaw/avee/MainActivity$7;-><init>(Lcom/daaw/avee/MainActivity;Landroid/widget/SearchView;)V

    invoke-virtual {v0, v3}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    .line 633
    new-instance v3, Lcom/daaw/avee/MainActivity$8;

    invoke-direct {v3, p0}, Lcom/daaw/avee/MainActivity$8;-><init>(Lcom/daaw/avee/MainActivity;)V

    invoke-virtual {v0, v3}, Landroid/widget/SearchView;->setOnCloseListener(Landroid/widget/SearchView$OnCloseListener;)V

    .line 641
    new-instance v3, Lcom/daaw/avee/MainActivity$9;

    invoke-direct {v3, p0}, Lcom/daaw/avee/MainActivity$9;-><init>(Lcom/daaw/avee/MainActivity;)V

    invoke-virtual {v0, v3}, Landroid/widget/SearchView;->setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 647
    invoke-direct {p0, v0}, Lcom/daaw/avee/MainActivity;->setSearchViewStyle(Landroid/widget/SearchView;)V

    .line 648
    invoke-virtual {p0, v1}, Lcom/daaw/avee/MainActivity;->updateSearchView(Z)V

    .line 655
    :cond_1
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->updatePremiumMenu()V

    const v0, 0x7f090036

    .line 659
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/MainActivity;->vizBtn0MenuItem:Landroid/view/MenuItem;

    const v0, 0x7f090037

    .line 660
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/MainActivity;->vizBtn1MenuItem:Landroid/view/MenuItem;

    const v0, 0x7f090038

    .line 661
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/MainActivity;->vizBtn2MenuItem:Landroid/view/MenuItem;

    .line 668
    iget v0, p0, Lcom/daaw/avee/MainActivity;->currentFragmentPage:I

    const/4 v3, 0x2

    if-ne v0, v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-direct {p0, v1}, Lcom/daaw/avee/MainActivity;->updateVizButtonVisibility(Z)V

    .line 671
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onDestroy()V
    .locals 2

    const-string v0, "######### onDestroy"

    .line 503
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 504
    sget-object v0, Lcom/daaw/avee/MainActivity;->onDestroy:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/ContextData;

    invoke-direct {v1, p0}, Lcom/daaw/avee/ContextData;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 505
    invoke-virtual {p0, v0, v0}, Lcom/daaw/avee/MainActivity;->setKeepScreenOnLock(ZZ)V

    .line 506
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 573
    invoke-direct {p0}, Lcom/daaw/avee/MainActivity;->closeSearchView()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 575
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public onKeyLongPress(ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 514
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    const-string v3, "pref_hold_exit"

    invoke-virtual {v0, v1, v3, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 516
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f0a000a

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v3, 0x4

    if-ne p1, v3, :cond_1

    if-lez v0, :cond_1

    .line 526
    iput-boolean v2, p0, Lcom/daaw/avee/MainActivity;->slowClosingInProgress:Z

    .line 527
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f1000a3

    .line 528
    invoke-virtual {p0, p2}, Lcom/daaw/avee/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 530
    invoke-static {p1, p2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/MainActivity;->slowClosingToast:Landroid/widget/Toast;

    .line 531
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 533
    new-instance p1, Ljava/util/Timer;

    invoke-direct {p1}, Ljava/util/Timer;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/MainActivity;->slowClosingTimer:Ljava/util/Timer;

    .line 534
    new-instance p2, Lcom/daaw/avee/MainActivity$6;

    invoke-direct {p2, p0}, Lcom/daaw/avee/MainActivity$6;-><init>(Lcom/daaw/avee/MainActivity;)V

    int-to-long v0, v0

    invoke-virtual {p1, p2, v0, v1}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return v2

    .line 547
    :cond_1
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyLongPress(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 554
    iget-boolean v0, p0, Lcom/daaw/avee/MainActivity;->slowClosingInProgress:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 555
    iput-boolean p1, p0, Lcom/daaw/avee/MainActivity;->slowClosingInProgress:Z

    .line 556
    iget-object p2, p0, Lcom/daaw/avee/MainActivity;->slowClosingTimer:Ljava/util/Timer;

    invoke-virtual {p2}, Ljava/util/Timer;->cancel()V

    const/4 p2, 0x0

    .line 557
    iput-object p2, p0, Lcom/daaw/avee/MainActivity;->slowClosingTimer:Ljava/util/Timer;

    .line 559
    iget-object p2, p0, Lcom/daaw/avee/MainActivity;->slowClosingToast:Landroid/widget/Toast;

    const v0, 0x7f1000a4

    invoke-virtual {p0, v0}, Lcom/daaw/avee/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 560
    iget-object p2, p0, Lcom/daaw/avee/MainActivity;->slowClosingToast:Landroid/widget/Toast;

    invoke-virtual {p2, p1}, Landroid/widget/Toast;->setDuration(I)V

    .line 561
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->slowClosingToast:Landroid/widget/Toast;

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    const/4 p1, 0x1

    return p1

    .line 567
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method onMenuItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .line 703
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    return v0

    .line 754
    :pswitch_1
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->viewPager:Lcom/daaw/avee/CustomViewPager;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/daaw/avee/CustomViewPager;->setCurrentItem(I)V

    return v1

    .line 730
    :pswitch_2
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->switchSleepTimer:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1}, Landroidx/appcompat/widget/SwitchCompat;->toggle()V

    return v0

    .line 720
    :pswitch_3
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/daaw/avee/SettingsActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 721
    invoke-virtual {p0, p1}, Lcom/daaw/avee/MainActivity;->startActivity(Landroid/content/Intent;)V

    return v1

    .line 750
    :pswitch_4
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->viewPager:Lcom/daaw/avee/CustomViewPager;

    invoke-virtual {p1, v1}, Lcom/daaw/avee/CustomViewPager;->setCurrentItem(I)V

    return v1

    .line 726
    :pswitch_5
    sget-object p1, Lcom/daaw/avee/MainActivity;->onMainUIAction:Lcom/daaw/avee/Common/Events/WeakEvent2;

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v2, Lcom/daaw/avee/ContextData;

    invoke-direct {v2, p0}, Lcom/daaw/avee/ContextData;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p1, v0, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return v1

    .line 739
    :pswitch_6
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->switchLockOrient:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1}, Landroidx/appcompat/widget/SwitchCompat;->toggle()V

    return v0

    .line 746
    :pswitch_7
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->viewPager:Lcom/daaw/avee/CustomViewPager;

    invoke-virtual {p1, v0}, Lcom/daaw/avee/CustomViewPager;->setCurrentItem(I)V

    return v1

    .line 735
    :pswitch_8
    sget-object p1, Lcom/daaw/avee/MainActivity;->onMainUIAction:Lcom/daaw/avee/Common/Events/WeakEvent2;

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v2, Lcom/daaw/avee/ContextData;

    invoke-direct {v2, p0}, Lcom/daaw/avee/ContextData;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p1, v0, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return v1

    :pswitch_data_0
    .packed-switch 0x7f090145
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 3

    .line 268
    sget-object v0, Lcom/daaw/avee/MainActivity;->onLaunchIntent:Lcom/daaw/avee/Common/Events/WeakEventR2;

    new-instance v1, Lcom/daaw/avee/ContextData;

    invoke-direct {v1, p0}, Lcom/daaw/avee/ContextData;-><init>(Landroid/app/Activity;)V

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 269
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->viewPager:Lcom/daaw/avee/CustomViewPager;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/daaw/avee/CustomViewPager;->setCurrentItem(I)V

    .line 270
    invoke-virtual {p0, v1}, Lcom/daaw/avee/MainActivity;->onViewPagerPageSelected(I)V

    .line 272
    :cond_0
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onNewIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 6

    .line 766
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    const/4 v2, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 773
    :pswitch_0
    sget-object v0, Lcom/daaw/avee/MainActivity;->onToolbarAction:Lcom/daaw/avee/Common/Events/WeakEventR2;

    new-instance v3, Lcom/daaw/avee/ContextData;

    invoke-direct {v3, p0}, Lcom/daaw/avee/ContextData;-><init>(Landroid/app/Activity;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v0, v3, v4, v5}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    .line 776
    :cond_0
    :pswitch_1
    sget-object v0, Lcom/daaw/avee/MainActivity;->onToolbarAction:Lcom/daaw/avee/Common/Events/WeakEventR2;

    new-instance v3, Lcom/daaw/avee/ContextData;

    invoke-direct {v3, p0}, Lcom/daaw/avee/ContextData;-><init>(Landroid/app/Activity;)V

    const/4 v4, 0x2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v0, v3, v4, v5}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    .line 779
    :cond_1
    :pswitch_2
    sget-object v0, Lcom/daaw/avee/MainActivity;->onToolbarAction:Lcom/daaw/avee/Common/Events/WeakEventR2;

    new-instance v3, Lcom/daaw/avee/ContextData;

    invoke-direct {v3, p0}, Lcom/daaw/avee/ContextData;-><init>(Landroid/app/Activity;)V

    const/4 v4, 0x3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v3, v4, v1}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    return v2

    .line 781
    :cond_2
    :goto_0
    invoke-virtual {p0, p1}, Lcom/daaw/avee/MainActivity;->onMenuItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_3

    return v2

    .line 784
    :cond_3
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 769
    :cond_4
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->drawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

    const v0, 0x800003

    invoke-virtual {p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->openDrawer(I)V

    return v2

    :pswitch_data_0
    .packed-switch 0x7f090036
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected onPause()V
    .locals 1

    const-string v0, "######### onPause"

    .line 490
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 491
    sget-object v0, Lcom/daaw/avee/MainActivity;->onPause:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 492
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onPause()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0

    .line 1096
    invoke-super {p0, p1, p2, p3}, Landroidx/appcompat/app/AppCompatActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 1097
    sget-object p2, Lcom/daaw/avee/MainActivity;->onRequestPermissionsResult:Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p0, p1}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 497
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onResume()V

    .line 498
    sget-object v0, Lcom/daaw/avee/MainActivity;->onResume:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method protected onStart()V
    .locals 4

    .line 447
    sget-object v0, Lcom/daaw/avee/MainActivity;->onStart:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 448
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    .line 449
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->handler:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 450
    iget-object v2, p0, Lcom/daaw/avee/MainActivity;->handler:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 451
    iget-object v1, p0, Lcom/daaw/avee/MainActivity;->handler:Landroid/os/Handler;

    const-wide/16 v2, 0x2710

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method protected onStop()V
    .locals 1

    const-string v0, "######### onStop"

    .line 483
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 484
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStop()V

    .line 485
    sget-object v0, Lcom/daaw/avee/MainActivity;->onStop:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public onUserInteraction()V
    .locals 1

    const/4 v0, 0x1

    .line 790
    invoke-virtual {p0, v0}, Lcom/daaw/avee/MainActivity;->resetVideoMaximizeTimeout(Z)V

    .line 791
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onUserInteraction()V

    return-void
.end method

.method public onViewPagerPageSelected(I)V
    .locals 1

    .line 848
    iput p1, p0, Lcom/daaw/avee/MainActivity;->currentFragmentPage:I

    .line 849
    sget-object p1, Lcom/daaw/avee/MainActivity;->onRequestShouldShowControls:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget v0, p0, Lcom/daaw/avee/MainActivity;->currentFragmentPage:I

    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/MainActivity;->showControls(ZI)V

    .line 851
    sget-object p1, Lcom/daaw/avee/MainActivity;->onViewPagerPageSelected:Lcom/daaw/avee/Common/Events/WeakEvent2;

    iget v0, p0, Lcom/daaw/avee/MainActivity;->currentFragmentPage:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 852
    sget-object p1, Lcom/daaw/avee/MainActivity;->onSetCurrentSearchIndex:Lcom/daaw/avee/Common/Events/WeakEvent1;

    iget v0, p0, Lcom/daaw/avee/MainActivity;->currentFragmentPage:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public resetVideoMaximizeTimeout(Z)V
    .locals 4

    .line 1083
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_pref_visControlsTimeout:I

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getBool(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1084
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->handler:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    if-eqz p1, :cond_0

    .line 1086
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f0a0019

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    .line 1087
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->handler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 1088
    iget-object v1, p0, Lcom/daaw/avee/MainActivity;->handler:Landroid/os/Handler;

    int-to-long v2, p1

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method

.method public setKeepScreenOnLock(ZZ)V
    .locals 2

    .line 875
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 876
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    if-eqz p2, :cond_0

    const/high16 p2, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 877
    :goto_0
    iput p2, v1, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 878
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    const/16 p2, 0x80

    if-eqz p1, :cond_1

    .line 881
    invoke-virtual {v0, p2}, Landroid/view/Window;->addFlags(I)V

    goto :goto_1

    .line 884
    :cond_1
    invoke-virtual {v0, p2}, Landroid/view/Window;->clearFlags(I)V

    :goto_1
    return-void
.end method

.method public showControls(ZI)V
    .locals 1

    const/4 v0, 0x0

    .line 894
    invoke-direct {p0, p1, p2, v0}, Lcom/daaw/avee/MainActivity;->showControls(ZIZ)V

    return-void
.end method

.method public toggleShowControls(I)V
    .locals 1

    .line 889
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 890
    invoke-virtual {v0}, Landroidx/appcompat/app/ActionBar;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/MainActivity;->showControls(ZI)V

    return-void
.end method

.method public updateActionBar(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V
    .locals 6

    .line 997
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->assignedSongData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 998
    :cond_0
    iput-object p1, p0, Lcom/daaw/avee/MainActivity;->assignedSongData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 1000
    invoke-virtual {p0}, Lcom/daaw/avee/MainActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1003
    iget-object v1, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 1004
    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->isArtistKnownOrSecondName()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1005
    iget-object v1, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ActionBar;->setSubtitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    const-string v1, ""

    .line 1007
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ActionBar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1013
    :cond_2
    :goto_0
    new-instance v0, Lcom/daaw/avee/MainActivity$10;

    invoke-direct {v0, p0}, Lcom/daaw/avee/MainActivity$10;-><init>(Lcom/daaw/avee/MainActivity;)V

    .line 1037
    sget-object v1, Lcom/daaw/avee/MainActivity;->onRequestAlbumArtLarge:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v2, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object v3, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->dataSource:Landroid/net/Uri;

    .line 1040
    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtPath0Str()Ljava/lang/String;

    move-result-object v4

    .line 1041
    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtPath1Str()Ljava/lang/String;

    move-result-object v5

    .line 1042
    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtGenerateStr()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v3, v4, v5, p1}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0xc8

    .line 1043
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 1037
    invoke-virtual {v1, v2, v0, v3, p1}, Lcom/daaw/avee/Common/Events/WeakEvent4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public updateLockOrientIndicator(ZZ)V
    .locals 0

    .line 1074
    iget-object p2, p0, Lcom/daaw/avee/MainActivity;->lockOrientIndicatorMenuItem:Landroid/view/MenuItem;

    if-eqz p2, :cond_0

    .line 1075
    invoke-interface {p2, p1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 1077
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/MainActivity;->switchLockOrient:Landroidx/appcompat/widget/SwitchCompat;

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    :cond_1
    return-void
.end method

.method public updatePremiumMenu()V
    .locals 6

    .line 677
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->premiumMenuWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/MenuItem;

    if-nez v0, :cond_0

    return-void

    .line 680
    :cond_0
    sget-object v1, Lcom/daaw/avee/MainActivity;->onRequestIsPremiumIsPremiumAvailable:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v2, Lcom/daaw/avee/Common/Tuple2;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/Common/Tuple2;

    .line 682
    iget-object v2, v1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 684
    iget-object v1, v1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    const v1, 0x7f0800d8

    .line 685
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    goto :goto_0

    :cond_1
    const v1, 0x7f0800ba

    .line 687
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    :goto_0
    const/4 v1, 0x1

    .line 689
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_1

    .line 693
    :cond_2
    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :goto_1
    return-void
.end method

.method public updateSearchView(Lcom/daaw/avee/comp/Common/ISearchEntry;Z)V
    .locals 5

    .line 801
    iget-object p2, p0, Lcom/daaw/avee/MainActivity;->searchMenuItem:Landroid/view/MenuItem;

    if-nez p2, :cond_0

    return-void

    .line 802
    :cond_0
    invoke-interface {p2}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/SearchView;

    if-nez p2, :cond_1

    return-void

    :cond_1
    const-string v0, ""

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    .line 805
    invoke-interface {p1}, Lcom/daaw/avee/comp/Common/ISearchEntry;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 806
    invoke-interface {p1}, Lcom/daaw/avee/comp/Common/ISearchEntry;->getQuery()Ljava/lang/String;

    move-result-object v2

    .line 808
    iget-object v3, p0, Lcom/daaw/avee/MainActivity;->searchMenuItem:Landroid/view/MenuItem;

    const/4 v4, 0x1

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    if-eqz v2, :cond_2

    .line 809
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 810
    invoke-interface {p1}, Lcom/daaw/avee/comp/Common/ISearchEntry;->getIndex()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/SearchView;->setTag(Ljava/lang/Object;)V

    .line 811
    invoke-virtual {p2, v2, v1}, Landroid/widget/SearchView;->setQuery(Ljava/lang/CharSequence;Z)V

    .line 812
    invoke-virtual {p2}, Landroid/widget/SearchView;->isIconified()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 813
    invoke-virtual {p2, v1}, Landroid/widget/SearchView;->setIconified(Z)V

    goto :goto_0

    .line 815
    :cond_2
    invoke-interface {p1}, Lcom/daaw/avee/comp/Common/ISearchEntry;->getIndex()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p2, v2}, Landroid/widget/SearchView;->setTag(Ljava/lang/Object;)V

    .line 816
    invoke-virtual {p2, v0, v1}, Landroid/widget/SearchView;->setQuery(Ljava/lang/CharSequence;Z)V

    .line 819
    :cond_3
    :goto_0
    invoke-interface {p1}, Lcom/daaw/avee/comp/Common/ISearchEntry;->getHint()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 821
    :cond_4
    iget-object p1, p0, Lcom/daaw/avee/MainActivity;->searchMenuItem:Landroid/view/MenuItem;

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 822
    invoke-virtual {p2, v0}, Landroid/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method

.method public updateSearchView(Z)V
    .locals 2

    .line 795
    sget-object v0, Lcom/daaw/avee/MainActivity;->onRequestCurrentSearchEntry:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Common/ISearchEntry;

    .line 796
    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/MainActivity;->updateSearchView(Lcom/daaw/avee/comp/Common/ISearchEntry;Z)V

    return-void
.end method

.method public updateSleepTimerIndicator(ZZ)V
    .locals 0

    .line 1062
    iget-object p2, p0, Lcom/daaw/avee/MainActivity;->sleepTimerIndicatorMenuItem:Landroid/view/MenuItem;

    if-eqz p2, :cond_0

    .line 1063
    invoke-interface {p2, p1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 1065
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/MainActivity;->switchSleepTimer:Landroidx/appcompat/widget/SwitchCompat;

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    :cond_1
    return-void
.end method

.method public updateSleepTimerIndicatorTh(ZZ)V
    .locals 2

    .line 1050
    iget-object v0, p0, Lcom/daaw/avee/MainActivity;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/avee/-$$Lambda$MainActivity$OwTimvHZ3VGSZamUAxx7nLxJ3d0;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/avee/-$$Lambda$MainActivity$OwTimvHZ3VGSZamUAxx7nLxJ3d0;-><init>(Lcom/daaw/avee/MainActivity;ZZ)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
