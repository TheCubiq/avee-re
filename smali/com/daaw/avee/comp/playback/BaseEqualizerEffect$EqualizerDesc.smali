.class public Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;
.super Ljava/lang/Object;
.source "BaseEqualizerEffect.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/BaseEqualizerEffect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EqualizerDesc"
.end annotation


# static fields
.field public static final empty:Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;


# instance fields
.field public bandsFreq:[I

.field public currentBandLevels:[F

.field public higherBandLevel:I

.field public lowerBandLevel:I

.field public name:Ljava/lang/String;

.field public numBands:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 283
    new-instance v0, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;

    const-string v1, "Default"

    invoke-direct {v0, v1}, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;->empty:Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 303
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 293
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 294
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;->name:Ljava/lang/String;

    const/4 p1, 0x0

    .line 295
    iput p1, p0, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;->numBands:I

    const/16 v0, -0x3e8

    .line 296
    iput v0, p0, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;->lowerBandLevel:I

    const/16 v0, 0x3e8

    .line 297
    iput v0, p0, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;->higherBandLevel:I

    new-array v0, p1, [I

    .line 298
    iput-object v0, p0, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;->bandsFreq:[I

    new-array p1, p1, [F

    .line 299
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;->currentBandLevels:[F

    return-void
.end method
