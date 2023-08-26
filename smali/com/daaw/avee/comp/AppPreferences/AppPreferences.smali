.class public Lcom/daaw/avee/comp/AppPreferences/AppPreferences;
.super Ljava/lang/Object;
.source "AppPreferences.java"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# static fields
.field private static PREF_Bool_COUNT:I

.field public static PREF_Bool_audioMuteState:I

.field public static PREF_Bool_disableFooterAds_unused:I

.field public static PREF_Bool_disableHeaderAds:I

.field public static PREF_Bool_equalizerEnabled:I

.field public static PREF_Bool_firstLaunch:I

.field public static PREF_Bool_fixAssumeMonoOutputFromMonoInput:I

.field public static PREF_Bool_followCurrentState:I

.field public static PREF_Bool_pref_visControlsTimeout:I

.field public static PREF_Bool_showAlbumArtInstead:I

.field public static PREF_Bool_tipShow_reorder:I

.field public static PREF_Bool_uiSectionOpened0:I

.field public static PREF_Bool_uiSectionOpened00:I

.field public static PREF_Bool_uiSectionOpened01:I

.field public static PREF_Bool_uiSectionOpened1:I

.field public static PREF_Bool_uiSectionOpened2:I

.field public static PREF_Bool_visualPreferShowVideoContent:I

.field public static PREF_Bool_visualizerUseGlobalSession:I

.field private static PREF_Int_COUNT:I

.field public static PREF_Int_SortMaskCheckOptions:I

.field public static PREF_Int_SortSelectedRadioOption:I

.field public static PREF_Int_acceptedEula:I

.field public static PREF_Int_audioVisOffset:I

.field public static PREF_Int_containerItemViewMode:I

.field public static PREF_Int_crossFadeValue:I

.field public static PREF_Int_equalizerBassValue:I

.field public static PREF_Int_equalizerPreset:I

.field public static PREF_Int_equalizerTrebleValue:I

.field public static PREF_Int_lockOrient:I

.field public static PREF_Int_mainPageIndex:I

.field public static PREF_Int_playbackEngine:I

.field public static PREF_Int_recentlyAddedWeeks:I

.field public static PREF_Int_reverbPreset:I

.field public static PREF_Int_videoScalingMode:I

.field public static PREF_Int_virtualizerStrength:I

.field public static PREF_Int_visualizerThemeId:I

.field public static PREF_Int_volumeStereoBalance:I

.field private static PREF_String_COUNT:I

.field public static PREF_String_currentAbsoluteLibraryAddress:I

.field public static PREF_String_currentExportSettings:I

.field public static PREF_String_currentExportSettingsExportDir_absolute:I

.field public static PREF_String_currentExportSettingsProfile:I

.field public static PREF_String_equalizerBarsValues:I

.field public static PREF_String_themeCustomizationIndexes:I

.field public static PREF_String_vThemeCustomization0:I

.field public static PREF_String_vThemeCustomization1:I

.field public static PREF_String_vThemeCustomization10:I

.field public static PREF_String_vThemeCustomization11:I

.field public static PREF_String_vThemeCustomization116end:I

.field public static PREF_String_vThemeCustomization12:I

.field public static PREF_String_vThemeCustomization13:I

.field public static PREF_String_vThemeCustomization14:I

.field public static PREF_String_vThemeCustomization15:I

.field public static PREF_String_vThemeCustomization16start:I

.field public static PREF_String_vThemeCustomization2:I

.field public static PREF_String_vThemeCustomization3:I

.field public static PREF_String_vThemeCustomization4:I

.field public static PREF_String_vThemeCustomization5:I

.field public static PREF_String_vThemeCustomization6:I

.field public static PREF_String_vThemeCustomization7:I

.field public static PREF_String_vThemeCustomization8:I

.field public static PREF_String_vThemeCustomization9:I

.field private static final createInstanceLock:Ljava/lang/Object;

.field private static volatile instanceWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/AppPreferences/AppPreferences;",
            ">;"
        }
    .end annotation
.end field

.field private static offset_Bool:I

.field private static offset_Int:I

.field private static offset_String:I

.field public static onBoolPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onIntPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onSharedPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/AppPreferences/AppPreferences;",
            ">;"
        }
    .end annotation
.end field

.field public static onStringPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private defaultFolderString:Ljava/lang/String;

.field private loaded:Z

.field private prefBool:Ljava/util/concurrent/atomic/AtomicIntegerArray;

.field private prefsInt:Ljava/util/concurrent/atomic/AtomicIntegerArray;

.field private prefsString:Ljava/util/concurrent/atomic/AtomicReferenceArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceArray<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private standartFolderString:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 40
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->onIntPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 41
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->onBoolPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 42
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->onStringPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 43
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->onSharedPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 45
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createInstanceLock:Ljava/lang/Object;

    .line 46
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->instanceWeak:Ljava/lang/ref/WeakReference;

    const/16 v0, 0x3e8

    .line 48
    sput v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_Bool:I

    .line 49
    sput v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_pref_visControlsTimeout:I

    const/16 v1, 0x3e8

    add-int/lit8 v1, v1, 0x1

    .line 50
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_visualPreferShowVideoContent:I

    const/16 v1, 0x3e8

    add-int/lit8 v1, v1, 0x2

    .line 51
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_fixAssumeMonoOutputFromMonoInput:I

    const/16 v1, 0x3e8

    add-int/lit8 v1, v1, 0x3

    .line 52
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_followCurrentState:I

    const/16 v1, 0x3e8

    add-int/lit8 v1, v1, 0x4

    .line 53
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_audioMuteState:I

    const/16 v1, 0x3e8

    add-int/lit8 v1, v1, 0x5

    .line 54
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_showAlbumArtInstead:I

    const/16 v1, 0x3e8

    add-int/lit8 v1, v1, 0x6

    .line 55
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_tipShow_reorder:I

    const/16 v1, 0x3e8

    add-int/lit8 v1, v1, 0x7

    .line 56
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_firstLaunch:I

    const/16 v1, 0x3e8

    add-int/lit8 v1, v1, 0x8

    .line 57
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_uiSectionOpened0:I

    const/16 v1, 0x3e8

    add-int/lit8 v1, v1, 0x9

    .line 58
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_uiSectionOpened1:I

    const/16 v1, 0x3e8

    add-int/lit8 v1, v1, 0xa

    .line 59
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_uiSectionOpened00:I

    const/16 v1, 0x3e8

    add-int/lit8 v1, v1, 0xb

    .line 60
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_uiSectionOpened01:I

    const/16 v1, 0x3e8

    add-int/lit8 v1, v1, 0xc

    .line 61
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_uiSectionOpened2:I

    const/16 v1, 0x3e8

    add-int/lit8 v1, v1, 0xd

    .line 62
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_visualizerUseGlobalSession:I

    const/16 v1, 0x3e8

    add-int/lit8 v1, v1, 0xe

    .line 63
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_equalizerEnabled:I

    const/16 v1, 0x3e8

    add-int/lit8 v1, v1, 0xf

    .line 64
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_disableHeaderAds:I

    const/16 v1, 0x3e8

    add-int/lit8 v1, v1, 0x10

    .line 65
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_disableFooterAds_unused:I

    add-int/lit8 v0, v0, 0x11

    .line 66
    sput v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_COUNT:I

    const/16 v0, 0x7d0

    .line 68
    sput v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_Int:I

    .line 69
    sput v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_mainPageIndex:I

    const/16 v1, 0x7d0

    add-int/lit8 v1, v1, 0x1

    .line 70
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_recentlyAddedWeeks:I

    const/16 v1, 0x7d0

    add-int/lit8 v1, v1, 0x2

    .line 71
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_visualizerThemeId:I

    const/16 v1, 0x7d0

    add-int/lit8 v1, v1, 0x3

    .line 72
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_lockOrient:I

    const/16 v1, 0x7d0

    add-int/lit8 v1, v1, 0x4

    .line 73
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_playbackEngine:I

    const/16 v1, 0x7d0

    add-int/lit8 v1, v1, 0x5

    .line 74
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_videoScalingMode:I

    const/16 v1, 0x7d0

    add-int/lit8 v1, v1, 0x6

    .line 75
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_SortSelectedRadioOption:I

    const/16 v1, 0x7d0

    add-int/lit8 v1, v1, 0x7

    .line 76
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_SortMaskCheckOptions:I

    const/16 v1, 0x7d0

    add-int/lit8 v1, v1, 0x8

    .line 77
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_volumeStereoBalance:I

    const/16 v1, 0x7d0

    add-int/lit8 v1, v1, 0x9

    .line 78
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_crossFadeValue:I

    const/16 v1, 0x7d0

    add-int/lit8 v1, v1, 0xa

    .line 79
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_equalizerPreset:I

    const/16 v1, 0x7d0

    add-int/lit8 v1, v1, 0xb

    .line 80
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_equalizerBassValue:I

    const/16 v1, 0x7d0

    add-int/lit8 v1, v1, 0xc

    .line 81
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_equalizerTrebleValue:I

    const/16 v1, 0x7d0

    add-int/lit8 v1, v1, 0xd

    .line 82
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_virtualizerStrength:I

    const/16 v1, 0x7d0

    add-int/lit8 v1, v1, 0xe

    .line 83
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_reverbPreset:I

    const/16 v1, 0x7d0

    add-int/lit8 v1, v1, 0xf

    .line 84
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_containerItemViewMode:I

    const/16 v1, 0x7d0

    add-int/lit8 v1, v1, 0x10

    .line 85
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_audioVisOffset:I

    const/16 v1, 0x7d0

    add-int/lit8 v1, v1, 0x11

    .line 86
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_acceptedEula:I

    add-int/lit8 v0, v0, 0x12

    .line 87
    sput v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_COUNT:I

    const/16 v0, 0xbb8

    .line 89
    sput v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_String:I

    .line 90
    sput v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_currentAbsoluteLibraryAddress:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0x1

    .line 91
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization0:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0x2

    .line 92
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization1:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0x3

    .line 93
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization2:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0x4

    .line 94
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization3:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0x5

    .line 95
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization4:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0x6

    .line 96
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization5:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0x7

    .line 97
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization6:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0x8

    .line 98
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization7:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0x9

    .line 99
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization8:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0xa

    .line 100
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization9:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0xb

    .line 101
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization10:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0xc

    .line 102
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_equalizerBarsValues:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0xd

    .line 103
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization11:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0xe

    .line 104
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization12:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0xf

    .line 105
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization13:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0x10

    .line 106
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization14:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0x11

    .line 107
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization15:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0x12

    .line 108
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization16start:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0x76

    .line 109
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization116end:I

    const/16 v1, 0xbb8

    add-int/lit8 v1, v1, 0x77

    .line 110
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_themeCustomizationIndexes:I

    const/16 v1, 0xbb8

    add-int/lit16 v1, v1, 0xdc

    .line 111
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_currentExportSettingsExportDir_absolute:I

    const/16 v1, 0xbb8

    add-int/lit16 v1, v1, 0xdd

    .line 112
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_currentExportSettings:I

    const/16 v1, 0xbb8

    add-int/lit16 v1, v1, 0xde

    .line 113
    sput v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_currentExportSettingsProfile:I

    add-int/lit16 v0, v0, 0xdf

    .line 114
    sput v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_COUNT:I

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    new-instance v0, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_COUNT:I

    sget v2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_Bool:I

    sub-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefBool:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 117
    new-instance v0, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_COUNT:I

    sget v2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_Int:I

    sub-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefsInt:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 118
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_COUNT:I

    sget v2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_String:I

    sub-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefsString:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const/4 v0, 0x0

    .line 119
    iput-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->defaultFolderString:Ljava/lang/String;

    .line 120
    iput-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->standartFolderString:Ljava/lang/String;

    const/4 v0, 0x0

    .line 121
    iput-boolean v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->loaded:Z

    .line 124
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_pref_visControlsTimeout:I

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBoolDefault(IZ)V

    .line 125
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_visualPreferShowVideoContent:I

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBoolDefault(IZ)V

    .line 126
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_fixAssumeMonoOutputFromMonoInput:I

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBoolDefault(IZ)V

    .line 127
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_followCurrentState:I

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBoolDefault(IZ)V

    .line 128
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_audioMuteState:I

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBoolDefault(IZ)V

    .line 129
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_showAlbumArtInstead:I

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBoolDefault(IZ)V

    .line 130
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_tipShow_reorder:I

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBoolDefault(IZ)V

    .line 131
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_firstLaunch:I

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBoolDefault(IZ)V

    .line 132
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_uiSectionOpened0:I

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBoolDefault(IZ)V

    .line 133
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_uiSectionOpened1:I

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBoolDefault(IZ)V

    .line 134
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_uiSectionOpened00:I

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBoolDefault(IZ)V

    .line 135
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_uiSectionOpened01:I

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBoolDefault(IZ)V

    .line 136
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_visualizerUseGlobalSession:I

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBoolDefault(IZ)V

    .line 137
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_equalizerEnabled:I

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBoolDefault(IZ)V

    .line 138
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_disableFooterAds_unused:I

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBoolDefault(IZ)V

    .line 139
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_disableHeaderAds:I

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBoolDefault(IZ)V

    .line 141
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_mainPageIndex:I

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 142
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_recentlyAddedWeeks:I

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 143
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_visualizerThemeId:I

    const/16 v3, 0xe

    invoke-virtual {p0, v1, v3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 144
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_lockOrient:I

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 145
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_playbackEngine:I

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 146
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_videoScalingMode:I

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 147
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_SortSelectedRadioOption:I

    const/16 v3, 0x8

    invoke-virtual {p0, v1, v3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 148
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_SortMaskCheckOptions:I

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 149
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_volumeStereoBalance:I

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 150
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_crossFadeValue:I

    const/16 v3, -0x3e8

    invoke-virtual {p0, v1, v3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 151
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_equalizerPreset:I

    const/4 v3, -0x1

    invoke-virtual {p0, v1, v3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 152
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_equalizerBassValue:I

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 153
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_equalizerTrebleValue:I

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 154
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_virtualizerStrength:I

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 155
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_reverbPreset:I

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 156
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_containerItemViewMode:I

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 157
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_audioVisOffset:I

    const/16 v2, 0xa

    invoke-virtual {p0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 158
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_acceptedEula:I

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setIntDefault(II)V

    .line 160
    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_currentAbsoluteLibraryAddress:I

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setStringDefault(ILjava/lang/String;)V

    .line 161
    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_equalizerBarsValues:I

    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setStringDefault(ILjava/lang/String;)V

    .line 162
    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_currentExportSettingsExportDir_absolute:I

    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setStringDefault(ILjava/lang/String;)V

    .line 163
    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_currentExportSettings:I

    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setStringDefault(ILjava/lang/String;)V

    .line 164
    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_currentExportSettingsProfile:I

    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setStringDefault(ILjava/lang/String;)V

    return-void
.end method

.method public static GetVisualizerFolderFromIdentifier(I)Ljava/io/File;
    .locals 2

    .line 849
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "visualizer"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/comp/AppPreferences/AppSettingsCore;->CreateOrGetScenesFolder(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static SaveFileToLocal(Ljava/io/File;Ljava/io/File;)Ljava/io/File;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 860
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    .line 862
    invoke-static {p0, v1}, Lcom/daaw/avee/Common/UtilsFileSys;->GetUniqueFileName(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v0

    .line 866
    :cond_1
    :try_start_0
    invoke-static {p1, p0}, Lcom/daaw/avee/Common/UtilsFileSys;->CopyFile(Ljava/io/File;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method

.method public static SaveFileToLocal(Ljava/io/File;Ljava/io/InputStream;Ljava/lang/String;)Ljava/io/File;
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 883
    :cond_0
    invoke-static {p0, p2}, Lcom/daaw/avee/Common/UtilsFileSys;->GetUniqueFileName(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v0

    .line 887
    :cond_1
    :try_start_0
    invoke-static {p1, p0}, Lcom/daaw/avee/Common/UtilsFileSys;->CopyFile(Ljava/io/InputStream;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method

.method public static createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;
    .locals 3

    .line 168
    sget-object v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    if-eqz v0, :cond_0

    return-object v0

    .line 171
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createInstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 172
    :try_start_0
    sget-object v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    if-nez v1, :cond_1

    .line 174
    new-instance v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    invoke-direct {v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;-><init>()V

    .line 175
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->instanceWeak:Ljava/lang/ref/WeakReference;

    .line 178
    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 179
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static generateVisualizerCustomizationHash(Ljava/lang/String;)I
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 730
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    return p0
.end method

.method private getPrefThemeCustomization(I)Ljava/lang/String;
    .locals 2

    .line 757
    invoke-static {p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->themeCustomizationIdentifierToPref(I)I

    move-result p1

    const/4 v0, 0x0

    if-gez p1, :cond_0

    const-string p1, "invalid _identifier"

    .line 759
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-object v0

    .line 763
    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 765
    invoke-static {p1}, Lcom/daaw/avee/comp/AppPreferences/Crave;->iscry(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 766
    invoke-static {p1}, Lcom/daaw/avee/comp/AppPreferences/Crave;->decry(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    if-eqz p1, :cond_3

    .line 768
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_2

    goto :goto_0

    :cond_2
    return-object p1

    :cond_3
    :goto_0
    return-object v0
.end method

.method private onContext(Landroid/content/Context;)V
    .locals 0

    .line 306
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 307
    invoke-interface {p1, p0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 310
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->load_pref_visControlsTimeout(Landroid/content/SharedPreferences;)V

    .line 311
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->load_pref_visualizerGlobalSession(Landroid/content/SharedPreferences;)V

    .line 312
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->load_pref_audioVisOffset(Landroid/content/SharedPreferences;)V

    .line 313
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->load_pref_disableHeaderAds(Landroid/content/SharedPreferences;)V

    return-void
.end method

.method public static preferencesGetBoolSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Z)Z
    .locals 0

    .line 184
    :try_start_0
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return p2
.end method

.method public static preferencesGetFloatSafe(Landroid/content/SharedPreferences;Ljava/lang/String;F)F
    .locals 0

    .line 222
    :try_start_0
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return p2
.end method

.method public static preferencesGetIntSafe(Landroid/content/SharedPreferences;Ljava/lang/String;I)I
    .locals 0

    .line 206
    :try_start_0
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return p2
.end method

.method public static preferencesGetLongSafe(Landroid/content/SharedPreferences;Ljava/lang/String;J)J
    .locals 0

    .line 214
    :try_start_0
    invoke-interface {p0, p1, p2, p3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p0

    :catch_0
    return-wide p2
.end method

.method public static preferencesGetStringSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 230
    :try_start_0
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object p2
.end method

.method public static preferencesSetBoolSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V
    .locals 0

    .line 197
    :try_start_0
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    .line 198
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 199
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private savePrefThemeCustomization(ILjava/lang/String;Z)V
    .locals 0

    .line 788
    invoke-static {p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->themeCustomizationIdentifierToPref(I)I

    move-result p1

    if-gez p1, :cond_0

    const-string p1, "invalid _identifier"

    .line 790
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-void

    :cond_0
    if-nez p2, :cond_1

    const-string p2, ""

    .line 796
    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setString(ILjava/lang/String;Z)V

    return-void

    .line 801
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setString(ILjava/lang/String;Z)V

    return-void
.end method

.method public static themeCustomizationIdentifierToPref(I)I
    .locals 2

    if-ltz p0, :cond_0

    .line 809
    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization116end:I

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization16start:I

    sub-int/2addr v0, v1

    if-gt p0, v0, :cond_0

    add-int/2addr p0, v1

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method


# virtual methods
.method public getBool(I)Z
    .locals 2

    .line 249
    iget-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefBool:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_Bool:I

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method getDefaultFolderString()Ljava/lang/String;
    .locals 3

    .line 591
    iget-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->defaultFolderString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 592
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "001:"

    .line 594
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/storage"

    .line 595
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ";"

    .line 596
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :try_start_0
    const-string v2, "002:"

    .line 599
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    sget-object v2, Landroid/os/Environment;->DIRECTORY_DCIM:Ljava/lang/String;

    invoke-static {v2}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 601
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v2

    .line 600
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 602
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    const-string v2, "003:"

    .line 608
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 609
    sget-object v2, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    invoke-static {v2}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 610
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v2

    .line 609
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 611
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    const-string v2, "004:"

    .line 616
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    sget-object v2, Landroid/os/Environment;->DIRECTORY_MUSIC:Ljava/lang/String;

    invoke-static {v2}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 618
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v2

    .line 617
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 619
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    const-string v1, "005:"

    .line 624
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 625
    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {v1}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 626
    invoke-virtual {v1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v1

    .line 625
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 633
    :catch_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->defaultFolderString:Ljava/lang/String;

    .line 636
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->defaultFolderString:Ljava/lang/String;

    return-object v0
.end method

.method public getInt(I)I
    .locals 2

    .line 253
    iget-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefsInt:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_Int:I

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    move-result p1

    return p1
.end method

.method public getLibFoldersString(Landroid/content/SharedPreferences;)Ljava/lang/String;
    .locals 2

    .line 641
    invoke-virtual {p0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getStandartFolderString()Ljava/lang/String;

    move-result-object v0

    .line 643
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getDefaultFolderString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "libFolders"

    invoke-static {p1, v1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetStringSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getPrefThemeCustomizationData(I[I)Lcom/daaw/avee/comp/Visualizer/CustomScene;
    .locals 3

    .line 775
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPrefThemeCustomization(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 776
    invoke-static {v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->generateVisualizerCustomizationHash(Ljava/lang/String;)I

    move-result v2

    aput v2, p2, v1

    :cond_0
    if-nez p1, :cond_1

    return-object v0

    :cond_1
    if-eqz p2, :cond_2

    .line 778
    invoke-static {p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->generateVisualizerCustomizationHash(Ljava/lang/String;)I

    move-result v0

    aput v0, p2, v1

    .line 779
    :cond_2
    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->deserialize(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1
.end method

.method public getPrefThemeCustomizationIndexes()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 735
    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_themeCustomizationIndexes:I

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ";"

    .line 736
    invoke-static {v1, v0}, Lcom/daaw/avee/Common/UtilsSerialize;->deserializeIterableAsList(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 738
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 739
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, -0x1

    .line 741
    invoke-static {v2, v3}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;I)I

    move-result v2

    if-ltz v2, :cond_0

    .line 743
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public getPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 0

    .line 463
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    return-object p1
.end method

.method getStandartFolderString()Ljava/lang/String;
    .locals 4

    const-string v0, ";"

    .line 547
    iget-object v1, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->standartFolderString:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 548
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 555
    :try_start_0
    invoke-static {}, Lcom/AOSPutils/Context_storage;->getInternalStoragePath()Ljava/lang/String;

    move-result-object v2

    .line 557
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "-02:"

    .line 558
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 560
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 567
    :catch_0
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 570
    invoke-static {v2}, Lcom/AOSPutils/Context_storage;->getSDCardPathOnce(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 572
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "-01:"

    .line 573
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 575
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 582
    :catch_1
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->standartFolderString:Ljava/lang/String;

    .line 585
    :cond_2
    iget-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->standartFolderString:Ljava/lang/String;

    return-object v0
.end method

.method public getString(I)Ljava/lang/String;
    .locals 2

    .line 257
    iget-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefsString:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_String:I

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public load(Landroid/content/Context;)V
    .locals 5

    .line 318
    iget-boolean v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->loaded:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 319
    iput-boolean v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->loaded:Z

    .line 320
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->onContext(Landroid/content/Context;)V

    .line 323
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 325
    :goto_0
    iget-object v3, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefBool:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 327
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "bool"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefBool:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    invoke-static {p1, v3, v4}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Z)Z

    move-result v3

    .line 328
    sget v4, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_Bool:I

    add-int/2addr v4, v2

    invoke-virtual {p0, v4, v3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBool(IZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 333
    :goto_2
    iget-object v2, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefsInt:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_3

    .line 335
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "int"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefsInt:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    move-result v3

    invoke-static {p1, v2, v3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetIntSafe(Landroid/content/SharedPreferences;Ljava/lang/String;I)I

    move-result v2

    .line 336
    sget v3, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_Int:I

    add-int/2addr v3, v0

    invoke-virtual {p0, v3, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(II)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 342
    :cond_3
    :goto_3
    iget-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefsString:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 344
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "string"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefsString:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {p1, v0, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetStringSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 345
    sget v2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_String:I

    add-int/2addr v2, v1

    invoke-virtual {p0, v2, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setString(ILjava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_4
    return-void
.end method

.method load_pref_audioVisOffset(Landroid/content/SharedPreferences;)V
    .locals 2

    const-string v0, "pref_audioVisOffset"

    const-string v1, "0"

    .line 438
    invoke-static {p1, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetStringSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 439
    invoke-static {p1}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;)I

    move-result p1

    .line 440
    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_audioVisOffset:I

    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(II)V

    return-void
.end method

.method load_pref_disableHeaderAds(Landroid/content/SharedPreferences;)V
    .locals 2

    const-string v0, "pref_disableHeaderAds"

    const/4 v1, 0x0

    .line 448
    invoke-static {p1, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Z)Z

    move-result p1

    .line 449
    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_disableHeaderAds:I

    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBool(IZ)V

    return-void
.end method

.method load_pref_visControlsTimeout(Landroid/content/SharedPreferences;)V
    .locals 2

    const-string v0, "pref_visControlsTimeout"

    const/4 v1, 0x0

    .line 420
    invoke-static {p1, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Z)Z

    move-result p1

    .line 421
    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_pref_visControlsTimeout:I

    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBool(IZ)V

    return-void
.end method

.method load_pref_visualizerGlobalSession(Landroid/content/SharedPreferences;)V
    .locals 2

    const-string v0, "pref_visualizerGlobalSession"

    const/4 v1, 0x1

    .line 429
    invoke-static {p1, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Z)Z

    move-result p1

    .line 430
    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_visualizerUseGlobalSession:I

    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBool(IZ)V

    return-void
.end method

.method public onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 4

    .line 385
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "pref_visualizerGlobalSession"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :sswitch_1
    const-string v0, "pref_disableHeaderAds"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_1

    :sswitch_2
    const-string v0, "pref_visControlsTimeout"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :sswitch_3
    const-string v0, "pref_audioVisOffset"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, -0x1

    :goto_1
    if-eqz v0, :cond_4

    if-eq v0, v3, :cond_3

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_1

    goto :goto_2

    .line 399
    :cond_1
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->load_pref_disableHeaderAds(Landroid/content/SharedPreferences;)V

    goto :goto_2

    .line 396
    :cond_2
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->load_pref_audioVisOffset(Landroid/content/SharedPreferences;)V

    goto :goto_2

    .line 393
    :cond_3
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->load_pref_visualizerGlobalSession(Landroid/content/SharedPreferences;)V

    goto :goto_2

    .line 390
    :cond_4
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->load_pref_visControlsTimeout(Landroid/content/SharedPreferences;)V

    .line 406
    :goto_2
    sget-object p1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->onSharedPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-virtual {p1, p2, p0}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x209828c7 -> :sswitch_3
        -0x163fdad9 -> :sswitch_2
        0x6ad0a377 -> :sswitch_1
        0x7d250719 -> :sswitch_0
    .end sparse-switch
.end method

.method public prefAddLibraryFolder(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 4

    const-string v0, ";"

    .line 496
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const-string v1, ":"

    .line 497
    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-void

    .line 498
    :cond_1
    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-void

    .line 499
    :cond_2
    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    return-void

    .line 502
    :cond_3
    invoke-virtual {p0, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p3

    .line 503
    invoke-virtual {p0, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getLibFoldersString(Landroid/content/SharedPreferences;)Ljava/lang/String;

    move-result-object v2

    .line 504
    invoke-static {v0, v2}, Lcom/daaw/avee/Common/UtilsSerialize;->deserializeIterableAsList(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 506
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 508
    invoke-interface {p3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    const/4 p3, 0x1

    .line 509
    invoke-static {v0, v2, p1, p3}, Lcom/daaw/avee/Common/UtilsSerialize;->serializeIterableSkipInvalidWithAdd(Ljava/lang/CharSequence;Ljava/lang/Iterable;Ljava/lang/Object;Z)Ljava/lang/String;

    move-result-object p1

    const-string p3, "libFolders"

    invoke-interface {p2, p3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 510
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public prefAddLibraryFolderGenerateHash(Ljava/lang/String;Landroid/content/Context;)V
    .locals 6

    .line 480
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefGetLibraryFolders(Landroid/content/Context;)Lcom/daaw/avee/Common/MultiList;

    move-result-object v0

    .line 482
    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    const/4 v2, 0x0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 489
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v4, 0xf4240

    invoke-virtual {v1, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 490
    invoke-virtual {v0, v3}, Lcom/daaw/avee/Common/MultiList;->contains1(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    if-lt v2, v4, :cond_0

    .line 492
    :cond_1
    invoke-virtual {p0, v3, p1, p2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefAddLibraryFolder(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    return-void
.end method

.method public prefAddStandalonePlaylistGenerateHash(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 2

    .line 655
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 656
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 657
    invoke-virtual {p0, p1, v0, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefAddStandalonePlaylistGenerateHash(Landroid/content/Context;Ljava/util/List;Z)V

    return-void
.end method

.method public prefAddStandalonePlaylistGenerateHash(Landroid/content/Context;Ljava/util/List;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 662
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefGetStandalonePlaylists(Landroid/content/Context;)Lcom/daaw/avee/Common/MultiList;

    move-result-object v0

    .line 664
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 666
    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    .line 668
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz p3, :cond_0

    .line 671
    invoke-virtual {v0, v3}, Lcom/daaw/avee/Common/MultiList;->contains2(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    .line 675
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v5, 0xf4240

    invoke-virtual {v2, v5}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 676
    invoke-virtual {v0, v4}, Lcom/daaw/avee/Common/MultiList;->contains1(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, ";"

    .line 678
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_1
    const-string v6, ":"

    .line 679
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_0

    .line 680
    :cond_2
    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    .line 681
    :cond_3
    invoke-virtual {v3, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_0

    .line 683
    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    const-string p2, "libStandalonePlaylists"

    .line 687
    invoke-virtual {p0, v1, p1, p2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->saveAddTokenList(Ljava/util/List;Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public prefGetLibraryFolders(Landroid/content/Context;)Lcom/daaw/avee/Common/MultiList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lcom/daaw/avee/Common/MultiList<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 528
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 530
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getLibFoldersString(Landroid/content/SharedPreferences;)Ljava/lang/String;

    move-result-object p1

    const-string v0, ";"

    .line 531
    invoke-static {v0, p1}, Lcom/daaw/avee/Common/UtilsSerialize;->deserializeIterableAsList(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    .line 533
    new-instance v0, Lcom/daaw/avee/Common/MultiList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/daaw/avee/Common/MultiList;-><init>(I)V

    .line 534
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, ":"

    .line 535
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-gez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 537
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    .line 538
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 539
    new-instance v2, Lcom/daaw/avee/Common/Tuple2;

    invoke-direct {v2, v3, v1}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Lcom/daaw/avee/Common/MultiList;->add(Lcom/daaw/avee/Common/Tuple2;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public prefGetStandalonePlaylists(Landroid/content/Context;)Lcom/daaw/avee/Common/MultiList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lcom/daaw/avee/Common/MultiList<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 707
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "libStandalonePlaylists"

    const-string v1, ""

    .line 709
    invoke-static {p1, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetStringSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, ";"

    .line 710
    invoke-static {v0, p1}, Lcom/daaw/avee/Common/UtilsSerialize;->deserializeIterableAsList(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    .line 712
    new-instance v0, Lcom/daaw/avee/Common/MultiList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/daaw/avee/Common/MultiList;-><init>(I)V

    .line 713
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, ":"

    .line 715
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-gez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 717
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    .line 718
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 720
    invoke-static {v1}, Lcom/daaw/avee/Common/UtilsFileSys;->fileExists(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 721
    new-instance v2, Lcom/daaw/avee/Common/Tuple2;

    invoke-direct {v2, v3, v1}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Lcom/daaw/avee/Common/MultiList;->add(Lcom/daaw/avee/Common/Tuple2;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public prefRemoveLibraryFolder(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 3

    .line 515
    invoke-virtual {p0, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p3

    .line 516
    invoke-virtual {p0, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getLibFoldersString(Landroid/content/SharedPreferences;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ";"

    .line 517
    invoke-static {v1, v0}, Lcom/daaw/avee/Common/UtilsSerialize;->deserializeIterableAsList(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 519
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 522
    invoke-interface {p3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    const/4 p3, 0x1

    .line 523
    invoke-static {v1, v0, p1, p3}, Lcom/daaw/avee/Common/UtilsSerialize;->serializeIterableSkipInvalidWithExclude(Ljava/lang/CharSequence;Ljava/lang/Iterable;Ljava/lang/Object;Z)Ljava/lang/String;

    move-result-object p1

    const-string p3, "libFolders"

    invoke-interface {p2, p3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 524
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public prefRemoveStandalonePlaylist(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 4

    .line 693
    invoke-virtual {p0, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p3

    const-string v0, "libStandalonePlaylists"

    const-string v1, ""

    .line 694
    invoke-static {p3, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetStringSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ";"

    .line 695
    invoke-static {v2, v1}, Lcom/daaw/avee/Common/UtilsSerialize;->deserializeIterableAsList(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 697
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 700
    invoke-interface {p3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    const/4 p3, 0x1

    .line 701
    invoke-static {v2, v1, p1, p3}, Lcom/daaw/avee/Common/UtilsSerialize;->serializeIterableSkipInvalidWithExclude(Ljava/lang/CharSequence;Ljava/lang/Iterable;Ljava/lang/Object;Z)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 702
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public preferencesGetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)Z
    .locals 0

    .line 237
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-static {p1, p2, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public preferencesGetIntSafe(Landroid/content/Context;Ljava/lang/String;I)I
    .locals 0

    .line 241
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-static {p1, p2, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetIntSafe(Landroid/content/SharedPreferences;Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public preferencesGetStringSafe(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 245
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-static {p1, p2, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetStringSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public preferencesSetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 0

    .line 191
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-static {p1, p2, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesSetBoolSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    return-void
.end method

.method public resetTips()V
    .locals 2

    .line 843
    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_tipShow_reorder:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBool(IZ)V

    return-void
.end method

.method public save(Landroid/content/Context;)V
    .locals 5

    .line 352
    iget-boolean v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->loaded:Z

    if-nez v0, :cond_0

    return-void

    .line 354
    :cond_0
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 357
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 359
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefBool:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 360
    iget-object v2, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefBool:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 361
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "bool"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 364
    :goto_2
    iget-object v2, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefsInt:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 365
    iget-object v2, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefsInt:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    move-result v2

    .line 366
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "int"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 369
    :cond_3
    :goto_3
    iget-object v1, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefsString:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 370
    iget-object v1, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefsString:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 371
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "string"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 375
    :cond_4
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->save_pref_visControlsTimeout(Landroid/content/SharedPreferences$Editor;)V

    .line 376
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->save_pref_visualizerGlobalSession(Landroid/content/SharedPreferences$Editor;)V

    .line 377
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->save_pref_audioVisOffset(Landroid/content/SharedPreferences$Editor;)V

    .line 380
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public saveAddTokenList(Ljava/util/List;Landroid/content/Context;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 468
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p2

    const-string v0, ""

    .line 469
    invoke-static {p2, p3, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetStringSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ";"

    .line 470
    invoke-static {v1, v0}, Lcom/daaw/avee/Common/UtilsSerialize;->deserializeIterableAsList(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 473
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    const/4 v2, 0x1

    .line 474
    invoke-static {v1, v0, p1, v2}, Lcom/daaw/avee/Common/UtilsSerialize;->serializeIterableSkipInvalidWithAdd(Ljava/lang/CharSequence;Ljava/lang/Iterable;Ljava/lang/Iterable;Z)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 475
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public savePrefThemeCustomizationData(ILcom/daaw/avee/comp/Visualizer/CustomScene;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 783
    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->serialize()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->savePrefThemeCustomization(ILjava/lang/String;Z)V

    return-void
.end method

.method save_pref_audioVisOffset(Landroid/content/SharedPreferences$Editor;)V
    .locals 2

    .line 444
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_audioVisOffset:I

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "pref_audioVisOffset"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    return-void
.end method

.method save_pref_disableHeaderAds(Landroid/content/SharedPreferences$Editor;)V
    .locals 0

    return-void
.end method

.method save_pref_visControlsTimeout(Landroid/content/SharedPreferences$Editor;)V
    .locals 2

    .line 425
    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_pref_visControlsTimeout:I

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getBool(I)Z

    move-result v0

    const-string v1, "pref_visControlsTimeout"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    return-void
.end method

.method save_pref_visualizerGlobalSession(Landroid/content/SharedPreferences$Editor;)V
    .locals 2

    .line 434
    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_visualizerUseGlobalSession:I

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getBool(I)Z

    move-result v0

    const-string v1, "pref_visualizerGlobalSession"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    return-void
.end method

.method public setBool(IZ)V
    .locals 2

    .line 265
    iget-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefBool:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_Bool:I

    sub-int v1, p1, v1

    invoke-virtual {v0, v1, p2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->getAndSet(II)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eq p2, v0, :cond_1

    .line 268
    sget-object v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->onBoolPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public setBoolDefault(IZ)V
    .locals 2

    .line 294
    iget-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefBool:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_Bool:I

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->set(II)V

    return-void
.end method

.method public setInt(II)V
    .locals 1

    const/4 v0, 0x0

    .line 272
    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(IIZ)V

    return-void
.end method

.method public setInt(IIZ)V
    .locals 2

    .line 276
    iget-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefsInt:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_Int:I

    sub-int v1, p1, v1

    invoke-virtual {v0, v1, p2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->getAndSet(II)I

    move-result v0

    if-nez p3, :cond_0

    if-eq p2, v0, :cond_1

    .line 279
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->onIntPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public setIntDefault(II)V
    .locals 2

    .line 298
    iget-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefsInt:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_Int:I

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->set(II)V

    return-void
.end method

.method public setPrefThemeCustomizationIndexes(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, ";"

    .line 751
    invoke-static {v0, p1}, Lcom/daaw/avee/Common/UtilsSerialize;->serializeIterable(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    .line 752
    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_themeCustomizationIndexes:I

    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setString(ILjava/lang/String;)V

    return-void
.end method

.method public setString(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 283
    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setString(ILjava/lang/String;Z)V

    return-void
.end method

.method public setString(ILjava/lang/String;Z)V
    .locals 2

    .line 287
    iget-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefsString:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_String:I

    sub-int v1, p1, v1

    invoke-virtual {v0, v1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez p3, :cond_0

    .line 289
    invoke-static {v0, p2}, Lcom/daaw/avee/Common/Utils;->compareNullEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 290
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->onStringPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public setStringDefault(ILjava/lang/String;)V
    .locals 2

    .line 302
    iget-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefsString:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_String:I

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    return-void
.end method

.method public toggleBool(I)V
    .locals 2

    .line 261
    iget-object v0, p0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefBool:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->offset_Bool:I

    sub-int v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBool(IZ)V

    return-void
.end method
