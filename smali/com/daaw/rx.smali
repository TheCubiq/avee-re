.class public Lcom/daaw/rx;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final k:Lcom/daaw/rx;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lcom/daaw/lv;

.field public c:Z

.field public d:I

.field public e:[Lcom/daaw/lv;

.field public f:F

.field public g:Lcom/daaw/lv;

.field public h:F

.field public i:Lcom/daaw/lv;

.field public j:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/rx;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/rx;-><init>(I)V

    sput-object v0, Lcom/daaw/rx;->k:Lcom/daaw/rx;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/rx;->a:Ljava/lang/String;

    sget-object v0, Lcom/daaw/lv;->c:Lcom/daaw/lv;

    iput-object v0, p0, Lcom/daaw/rx;->b:Lcom/daaw/lv;

    const/4 v1, -0x1

    iput v1, p0, Lcom/daaw/rx;->d:I

    new-array p1, p1, [Lcom/daaw/lv;

    iput-object p1, p0, Lcom/daaw/rx;->e:[Lcom/daaw/lv;

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/rx;->f:F

    invoke-static {v0}, Lcom/daaw/lv;->a(Lcom/daaw/lv;)Lcom/daaw/lv;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/rx;->g:Lcom/daaw/lv;

    iput p1, p0, Lcom/daaw/rx;->h:F

    invoke-static {v0}, Lcom/daaw/lv;->a(Lcom/daaw/lv;)Lcom/daaw/lv;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/rx;->i:Lcom/daaw/lv;

    iput p1, p0, Lcom/daaw/rx;->j:F

    return-void
.end method
