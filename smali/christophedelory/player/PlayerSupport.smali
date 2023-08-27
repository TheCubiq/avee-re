.class public Lchristophedelory/player/PlayerSupport;
.super Ljava/lang/Object;
.source "PlayerSupport.java"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lchristophedelory/player/PlayerSupport$Player;
    }
.end annotation


# instance fields
.field private final _comment:Ljava/lang/String;

.field private final _isSaved:Z

.field private final _player:Lchristophedelory/player/PlayerSupport$Player;


# direct methods
.method public constructor <init>(Lchristophedelory/player/PlayerSupport$Player;ZLjava/lang/String;)V
    .locals 0

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 140
    iput-object p1, p0, Lchristophedelory/player/PlayerSupport;->_player:Lchristophedelory/player/PlayerSupport$Player;

    .line 141
    iput-boolean p2, p0, Lchristophedelory/player/PlayerSupport;->_isSaved:Z

    .line 142
    iput-object p3, p0, Lchristophedelory/player/PlayerSupport;->_comment:Ljava/lang/String;

    return-void

    .line 137
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "no player"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static toString(Lchristophedelory/player/PlayerSupport$Player;)Ljava/lang/String;
    .locals 1

    .line 70
    sget-object v0, Lchristophedelory/player/PlayerSupport$1;->$SwitchMap$christophedelory$player$PlayerSupport$Player:[I

    invoke-virtual {p0}, Lchristophedelory/player/PlayerSupport$Player;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    goto :goto_0

    :pswitch_0
    const-string p0, "Windows Media Player"

    goto :goto_0

    :pswitch_1
    const-string p0, "Winamp"

    goto :goto_0

    :pswitch_2
    const-string p0, "VLC Media Player (VideoLAN)"

    goto :goto_0

    :pswitch_3
    const-string p0, "RealPlayer"

    goto :goto_0

    :pswitch_4
    const-string p0, "QuickTime"

    goto :goto_0

    :pswitch_5
    const-string p0, "MPlayer"

    goto :goto_0

    :pswitch_6
    const-string p0, "Media Player Classic"

    goto :goto_0

    :pswitch_7
    const-string p0, "iTunes"

    goto :goto_0

    :pswitch_8
    const-string p0, "Foobar2000"

    :goto_0
    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
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


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 182
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getComment()Ljava/lang/String;
    .locals 1

    .line 169
    iget-object v0, p0, Lchristophedelory/player/PlayerSupport;->_comment:Ljava/lang/String;

    return-object v0
.end method

.method public getPlayer()Lchristophedelory/player/PlayerSupport$Player;
    .locals 1

    .line 151
    iget-object v0, p0, Lchristophedelory/player/PlayerSupport;->_player:Lchristophedelory/player/PlayerSupport$Player;

    return-object v0
.end method

.method public isSaved()Z
    .locals 1

    .line 160
    iget-boolean v0, p0, Lchristophedelory/player/PlayerSupport;->_isSaved:Z

    return v0
.end method
