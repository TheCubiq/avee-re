.class public Lcom/daaw/avee/comp/playback/b$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final g:Lcom/daaw/avee/comp/playback/b$b;


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:I

.field public d:I

.field public e:[I

.field public f:[F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/avee/comp/playback/b$b;

    const-string v1, "Default"

    invoke-direct {v0, v1}, Lcom/daaw/avee/comp/playback/b$b;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/avee/comp/playback/b$b;->g:Lcom/daaw/avee/comp/playback/b$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/b$b;->a:Ljava/lang/String;

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/avee/comp/playback/b$b;->b:I

    const/16 v0, -0x3e8

    iput v0, p0, Lcom/daaw/avee/comp/playback/b$b;->c:I

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/daaw/avee/comp/playback/b$b;->d:I

    new-array v0, p1, [I

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/b$b;->e:[I

    new-array p1, p1, [F

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/b$b;->f:[F

    return-void
.end method
