.class public Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeEqualizerEffect;
.super Lcom/daaw/avee/comp/playback/BaseEqualizerEffect;
.source "NativeEqualizerEffect.java"


# static fields
.field public static name:Ljava/lang/String; = "Native"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$IEqualizerEffectListener;)V
    .locals 1

    .line 14
    sget-object v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeEqualizerEffect;->name:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect;-><init>(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$IEqualizerEffectListener;Ljava/lang/String;)V

    return-void
.end method
