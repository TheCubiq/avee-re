.class public Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;
.super Ljava/lang/Object;
.source "EqualizerUIDesc.java"


# static fields
.field public static final empty:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;


# instance fields
.field public bassBoost:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

.field public bassBoostValue:F

.field public currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

.field public currentPreset:I

.field public enabled:Z

.field public name:Ljava/lang/String;

.field public presets:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

.field public trebleBoost:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

.field public trebleBoostValue:F

.field public virtualizerStrength:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 9
    new-instance v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;-><init>(I)V

    sput-object v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->empty:Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private constructor <init>(I)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 24
    iput-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->name:Ljava/lang/String;

    .line 25
    sget-object v0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->empty:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iput-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    const/4 v0, -0x1

    .line 26
    iput v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->currentPreset:I

    .line 27
    new-array p1, p1, [Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iput-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->presets:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    const/4 p1, 0x0

    .line 28
    iput p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->bassBoostValue:F

    .line 29
    sget-object v0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->empty:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    invoke-static {v0}, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->clone(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->bassBoost:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    .line 30
    iput p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->trebleBoostValue:F

    .line 31
    sget-object v0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->empty:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    invoke-static {v0}, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->clone(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->trebleBoost:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    .line 32
    iput p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->virtualizerStrength:F

    return-void
.end method
