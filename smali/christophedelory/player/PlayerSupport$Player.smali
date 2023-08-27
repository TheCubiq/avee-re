.class public final enum Lchristophedelory/player/PlayerSupport$Player;
.super Ljava/lang/Enum;
.source "PlayerSupport.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lchristophedelory/player/PlayerSupport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Player"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lchristophedelory/player/PlayerSupport$Player;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lchristophedelory/player/PlayerSupport$Player;

.field public static final enum FOOBAR2000:Lchristophedelory/player/PlayerSupport$Player;

.field public static final enum ITUNES:Lchristophedelory/player/PlayerSupport$Player;

.field public static final enum MEDIA_PLAYER_CLASSIC:Lchristophedelory/player/PlayerSupport$Player;

.field public static final enum MPLAYER:Lchristophedelory/player/PlayerSupport$Player;

.field public static final enum QUICKTIME:Lchristophedelory/player/PlayerSupport$Player;

.field public static final enum REALPLAYER:Lchristophedelory/player/PlayerSupport$Player;

.field public static final enum VLC_MEDIA_PLAYER:Lchristophedelory/player/PlayerSupport$Player;

.field public static final enum WINAMP:Lchristophedelory/player/PlayerSupport$Player;

.field public static final enum WINDOWS_MEDIA_PLAYER:Lchristophedelory/player/PlayerSupport$Player;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 48
    new-instance v0, Lchristophedelory/player/PlayerSupport$Player;

    const/4 v1, 0x0

    const-string v2, "FOOBAR2000"

    invoke-direct {v0, v2, v1}, Lchristophedelory/player/PlayerSupport$Player;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lchristophedelory/player/PlayerSupport$Player;->FOOBAR2000:Lchristophedelory/player/PlayerSupport$Player;

    .line 49
    new-instance v0, Lchristophedelory/player/PlayerSupport$Player;

    const/4 v2, 0x1

    const-string v3, "ITUNES"

    invoke-direct {v0, v3, v2}, Lchristophedelory/player/PlayerSupport$Player;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lchristophedelory/player/PlayerSupport$Player;->ITUNES:Lchristophedelory/player/PlayerSupport$Player;

    .line 50
    new-instance v0, Lchristophedelory/player/PlayerSupport$Player;

    const/4 v3, 0x2

    const-string v4, "MEDIA_PLAYER_CLASSIC"

    invoke-direct {v0, v4, v3}, Lchristophedelory/player/PlayerSupport$Player;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lchristophedelory/player/PlayerSupport$Player;->MEDIA_PLAYER_CLASSIC:Lchristophedelory/player/PlayerSupport$Player;

    .line 51
    new-instance v0, Lchristophedelory/player/PlayerSupport$Player;

    const/4 v4, 0x3

    const-string v5, "MPLAYER"

    invoke-direct {v0, v5, v4}, Lchristophedelory/player/PlayerSupport$Player;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lchristophedelory/player/PlayerSupport$Player;->MPLAYER:Lchristophedelory/player/PlayerSupport$Player;

    .line 53
    new-instance v0, Lchristophedelory/player/PlayerSupport$Player;

    const/4 v5, 0x4

    const-string v6, "QUICKTIME"

    invoke-direct {v0, v6, v5}, Lchristophedelory/player/PlayerSupport$Player;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lchristophedelory/player/PlayerSupport$Player;->QUICKTIME:Lchristophedelory/player/PlayerSupport$Player;

    .line 54
    new-instance v0, Lchristophedelory/player/PlayerSupport$Player;

    const/4 v6, 0x5

    const-string v7, "REALPLAYER"

    invoke-direct {v0, v7, v6}, Lchristophedelory/player/PlayerSupport$Player;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lchristophedelory/player/PlayerSupport$Player;->REALPLAYER:Lchristophedelory/player/PlayerSupport$Player;

    .line 55
    new-instance v0, Lchristophedelory/player/PlayerSupport$Player;

    const/4 v7, 0x6

    const-string v8, "VLC_MEDIA_PLAYER"

    invoke-direct {v0, v8, v7}, Lchristophedelory/player/PlayerSupport$Player;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lchristophedelory/player/PlayerSupport$Player;->VLC_MEDIA_PLAYER:Lchristophedelory/player/PlayerSupport$Player;

    .line 56
    new-instance v0, Lchristophedelory/player/PlayerSupport$Player;

    const/4 v8, 0x7

    const-string v9, "WINAMP"

    invoke-direct {v0, v9, v8}, Lchristophedelory/player/PlayerSupport$Player;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lchristophedelory/player/PlayerSupport$Player;->WINAMP:Lchristophedelory/player/PlayerSupport$Player;

    .line 57
    new-instance v0, Lchristophedelory/player/PlayerSupport$Player;

    const/16 v9, 0x8

    const-string v10, "WINDOWS_MEDIA_PLAYER"

    invoke-direct {v0, v10, v9}, Lchristophedelory/player/PlayerSupport$Player;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lchristophedelory/player/PlayerSupport$Player;->WINDOWS_MEDIA_PLAYER:Lchristophedelory/player/PlayerSupport$Player;

    const/16 v10, 0x9

    new-array v10, v10, [Lchristophedelory/player/PlayerSupport$Player;

    .line 46
    sget-object v11, Lchristophedelory/player/PlayerSupport$Player;->FOOBAR2000:Lchristophedelory/player/PlayerSupport$Player;

    aput-object v11, v10, v1

    sget-object v1, Lchristophedelory/player/PlayerSupport$Player;->ITUNES:Lchristophedelory/player/PlayerSupport$Player;

    aput-object v1, v10, v2

    sget-object v1, Lchristophedelory/player/PlayerSupport$Player;->MEDIA_PLAYER_CLASSIC:Lchristophedelory/player/PlayerSupport$Player;

    aput-object v1, v10, v3

    sget-object v1, Lchristophedelory/player/PlayerSupport$Player;->MPLAYER:Lchristophedelory/player/PlayerSupport$Player;

    aput-object v1, v10, v4

    sget-object v1, Lchristophedelory/player/PlayerSupport$Player;->QUICKTIME:Lchristophedelory/player/PlayerSupport$Player;

    aput-object v1, v10, v5

    sget-object v1, Lchristophedelory/player/PlayerSupport$Player;->REALPLAYER:Lchristophedelory/player/PlayerSupport$Player;

    aput-object v1, v10, v6

    sget-object v1, Lchristophedelory/player/PlayerSupport$Player;->VLC_MEDIA_PLAYER:Lchristophedelory/player/PlayerSupport$Player;

    aput-object v1, v10, v7

    sget-object v1, Lchristophedelory/player/PlayerSupport$Player;->WINAMP:Lchristophedelory/player/PlayerSupport$Player;

    aput-object v1, v10, v8

    aput-object v0, v10, v9

    sput-object v10, Lchristophedelory/player/PlayerSupport$Player;->$VALUES:[Lchristophedelory/player/PlayerSupport$Player;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 46
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lchristophedelory/player/PlayerSupport$Player;
    .locals 1

    .line 46
    const-class v0, Lchristophedelory/player/PlayerSupport$Player;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lchristophedelory/player/PlayerSupport$Player;

    return-object p0
.end method

.method public static values()[Lchristophedelory/player/PlayerSupport$Player;
    .locals 1

    .line 46
    sget-object v0, Lchristophedelory/player/PlayerSupport$Player;->$VALUES:[Lchristophedelory/player/PlayerSupport$Player;

    invoke-virtual {v0}, [Lchristophedelory/player/PlayerSupport$Player;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lchristophedelory/player/PlayerSupport$Player;

    return-object v0
.end method
