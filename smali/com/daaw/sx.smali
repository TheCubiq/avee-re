.class public Lcom/daaw/sx;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Z

.field public b:I

.field public c:Lcom/daaw/lv;

.field public d:F

.field public e:F

.field public f:Lcom/daaw/lv;

.field public g:F


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/sx;->a:Z

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/sx;->b:I

    sget-object v0, Lcom/daaw/lv;->c:Lcom/daaw/lv;

    invoke-static {v0}, Lcom/daaw/lv;->a(Lcom/daaw/lv;)Lcom/daaw/lv;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/sx;->c:Lcom/daaw/lv;

    const/4 v1, 0x0

    iput v1, p0, Lcom/daaw/sx;->d:F

    iput v1, p0, Lcom/daaw/sx;->e:F

    invoke-static {v0}, Lcom/daaw/lv;->a(Lcom/daaw/lv;)Lcom/daaw/lv;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/sx;->f:Lcom/daaw/lv;

    iput v1, p0, Lcom/daaw/sx;->g:F

    return-void
.end method
