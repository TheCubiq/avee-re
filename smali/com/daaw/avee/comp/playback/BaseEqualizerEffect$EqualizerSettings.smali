.class public Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;
.super Ljava/lang/Object;
.source "BaseEqualizerEffect.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/BaseEqualizerEffect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EqualizerSettings"
.end annotation


# instance fields
.field public bandLevels:[F

.field public enabled:Z

.field public preset:I

.field public usePreset:Z

.field public virtualizerStrength:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 273
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
