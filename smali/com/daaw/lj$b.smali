.class public final enum Lcom/daaw/lj$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/lj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/lj$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum p:Lcom/daaw/lj$b;

.field public static final enum q:Lcom/daaw/lj$b;

.field public static final enum r:Lcom/daaw/lj$b;

.field public static final enum s:Lcom/daaw/lj$b;

.field public static final enum t:Lcom/daaw/lj$b;

.field public static final enum u:Lcom/daaw/lj$b;

.field public static final enum v:Lcom/daaw/lj$b;

.field public static final enum w:Lcom/daaw/lj$b;

.field public static final enum x:Lcom/daaw/lj$b;

.field public static final synthetic y:[Lcom/daaw/lj$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lcom/daaw/lj$b;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/lj$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/lj$b;->p:Lcom/daaw/lj$b;

    new-instance v1, Lcom/daaw/lj$b;

    const-string v3, "LEFT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/daaw/lj$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/daaw/lj$b;->q:Lcom/daaw/lj$b;

    new-instance v3, Lcom/daaw/lj$b;

    const-string v5, "TOP"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/daaw/lj$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/daaw/lj$b;->r:Lcom/daaw/lj$b;

    new-instance v5, Lcom/daaw/lj$b;

    const-string v7, "RIGHT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/daaw/lj$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/daaw/lj$b;->s:Lcom/daaw/lj$b;

    new-instance v7, Lcom/daaw/lj$b;

    const-string v9, "BOTTOM"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/daaw/lj$b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/daaw/lj$b;->t:Lcom/daaw/lj$b;

    new-instance v9, Lcom/daaw/lj$b;

    const-string v11, "BASELINE"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lcom/daaw/lj$b;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/daaw/lj$b;->u:Lcom/daaw/lj$b;

    new-instance v11, Lcom/daaw/lj$b;

    const-string v13, "CENTER"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lcom/daaw/lj$b;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lcom/daaw/lj$b;->v:Lcom/daaw/lj$b;

    new-instance v13, Lcom/daaw/lj$b;

    const-string v15, "CENTER_X"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Lcom/daaw/lj$b;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lcom/daaw/lj$b;->w:Lcom/daaw/lj$b;

    new-instance v15, Lcom/daaw/lj$b;

    const-string v14, "CENTER_Y"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Lcom/daaw/lj$b;-><init>(Ljava/lang/String;I)V

    sput-object v15, Lcom/daaw/lj$b;->x:Lcom/daaw/lj$b;

    const/16 v14, 0x9

    new-array v14, v14, [Lcom/daaw/lj$b;

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

    sput-object v14, Lcom/daaw/lj$b;->y:[Lcom/daaw/lj$b;

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

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/lj$b;
    .locals 1

    const-class v0, Lcom/daaw/lj$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/lj$b;

    return-object p0
.end method

.method public static values()[Lcom/daaw/lj$b;
    .locals 1

    sget-object v0, Lcom/daaw/lj$b;->y:[Lcom/daaw/lj$b;

    invoke-virtual {v0}, [Lcom/daaw/lj$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/lj$b;

    return-object v0
.end method
