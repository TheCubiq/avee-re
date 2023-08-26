.class public Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;
.super Lcom/daaw/avee/comp/playback/BaseEqualizerEffect;
.source "ExoEqualizerEffect.java"


# static fields
.field public static name:Ljava/lang/String; = "Exo"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$IEqualizerEffectListener;)V
    .locals 1

    .line 14
    sget-object v0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;->name:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect;-><init>(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$IEqualizerEffectListener;Ljava/lang/String;)V

    return-void
.end method
