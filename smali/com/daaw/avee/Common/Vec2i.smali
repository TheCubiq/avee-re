.class public Lcom/daaw/avee/Common/Vec2i;
.super Ljava/lang/Object;
.source "Vec2i.java"


# static fields
.field public static invalid:Lcom/daaw/avee/Common/Vec2i;

.field public static one:Lcom/daaw/avee/Common/Vec2i;

.field public static zero:Lcom/daaw/avee/Common/Vec2i;


# instance fields
.field public x:I

.field public y:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 9
    new-instance v0, Lcom/daaw/avee/Common/Vec2i;

    const v1, -0x7fffffff

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2i;-><init>(II)V

    sput-object v0, Lcom/daaw/avee/Common/Vec2i;->invalid:Lcom/daaw/avee/Common/Vec2i;

    .line 10
    new-instance v0, Lcom/daaw/avee/Common/Vec2i;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2i;-><init>(II)V

    sput-object v0, Lcom/daaw/avee/Common/Vec2i;->zero:Lcom/daaw/avee/Common/Vec2i;

    .line 11
    new-instance v0, Lcom/daaw/avee/Common/Vec2i;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2i;-><init>(II)V

    sput-object v0, Lcom/daaw/avee/Common/Vec2i;->one:Lcom/daaw/avee/Common/Vec2i;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput p1, p0, Lcom/daaw/avee/Common/Vec2i;->x:I

    .line 17
    iput p2, p0, Lcom/daaw/avee/Common/Vec2i;->y:I

    return-void
.end method
