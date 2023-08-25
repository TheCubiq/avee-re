.class public final enum Lcom/daaw/gx0$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/gx0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/gx0$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum p:Lcom/daaw/gx0$a;

.field public static final enum q:Lcom/daaw/gx0$a;

.field public static final enum r:Lcom/daaw/gx0$a;

.field public static final enum s:Lcom/daaw/gx0$a;

.field public static final enum t:Lcom/daaw/gx0$a;

.field public static final enum u:Lcom/daaw/gx0$a;

.field public static final enum v:Lcom/daaw/gx0$a;

.field public static final enum w:Lcom/daaw/gx0$a;

.field public static final enum x:Lcom/daaw/gx0$a;

.field public static final synthetic y:[Lcom/daaw/gx0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lcom/daaw/gx0$a;

    const-string v1, "FOOBAR2000"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/gx0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/gx0$a;->p:Lcom/daaw/gx0$a;

    new-instance v1, Lcom/daaw/gx0$a;

    const-string v3, "ITUNES"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/daaw/gx0$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/daaw/gx0$a;->q:Lcom/daaw/gx0$a;

    new-instance v3, Lcom/daaw/gx0$a;

    const-string v5, "MEDIA_PLAYER_CLASSIC"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/daaw/gx0$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/daaw/gx0$a;->r:Lcom/daaw/gx0$a;

    new-instance v5, Lcom/daaw/gx0$a;

    const-string v7, "MPLAYER"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/daaw/gx0$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/daaw/gx0$a;->s:Lcom/daaw/gx0$a;

    new-instance v7, Lcom/daaw/gx0$a;

    const-string v9, "QUICKTIME"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/daaw/gx0$a;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/daaw/gx0$a;->t:Lcom/daaw/gx0$a;

    new-instance v9, Lcom/daaw/gx0$a;

    const-string v11, "REALPLAYER"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lcom/daaw/gx0$a;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/daaw/gx0$a;->u:Lcom/daaw/gx0$a;

    new-instance v11, Lcom/daaw/gx0$a;

    const-string v13, "VLC_MEDIA_PLAYER"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lcom/daaw/gx0$a;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lcom/daaw/gx0$a;->v:Lcom/daaw/gx0$a;

    new-instance v13, Lcom/daaw/gx0$a;

    const-string v15, "WINAMP"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Lcom/daaw/gx0$a;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lcom/daaw/gx0$a;->w:Lcom/daaw/gx0$a;

    new-instance v15, Lcom/daaw/gx0$a;

    const-string v14, "WINDOWS_MEDIA_PLAYER"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Lcom/daaw/gx0$a;-><init>(Ljava/lang/String;I)V

    sput-object v15, Lcom/daaw/gx0$a;->x:Lcom/daaw/gx0$a;

    const/16 v14, 0x9

    new-array v14, v14, [Lcom/daaw/gx0$a;

    aput-object v0, v14, v2

    aput-object v1, v14, v4

    aput-object v3, v14, v6

    aput-object v5, v14, v8

    aput-object v7, v14, v10

    const/4 v0, 0x5

    aput-object v9, v14, v0

    const/4 v0, 0x6

    aput-object v11, v14, v0

    const/4 v0, 0x7

    aput-object v13, v14, v0

    aput-object v15, v14, v12

    sput-object v14, Lcom/daaw/gx0$a;->y:[Lcom/daaw/gx0$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/gx0$a;
    .locals 1

    const-class v0, Lcom/daaw/gx0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/gx0$a;

    return-object p0
.end method

.method public static values()[Lcom/daaw/gx0$a;
    .locals 1

    sget-object v0, Lcom/daaw/gx0$a;->y:[Lcom/daaw/gx0$a;

    invoke-virtual {v0}, [Lcom/daaw/gx0$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/gx0$a;

    return-object v0
.end method
