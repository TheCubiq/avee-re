.class public final Lcom/daaw/wf2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lcom/daaw/ve2;

.field public final c:Lcom/daaw/zf2;

.field public d:Z


# direct methods
.method public constructor <init>(Lcom/daaw/zf2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/wf2;->d:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/wf2;->a:Ljava/lang/Object;

    iput-object v0, p0, Lcom/daaw/wf2;->b:Lcom/daaw/ve2;

    iput-object p1, p0, Lcom/daaw/wf2;->c:Lcom/daaw/zf2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lcom/daaw/ve2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/wf2;->d:Z

    iput-object p1, p0, Lcom/daaw/wf2;->a:Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/wf2;->b:Lcom/daaw/ve2;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/wf2;->c:Lcom/daaw/zf2;

    return-void
.end method

.method public static a(Lcom/daaw/zf2;)Lcom/daaw/wf2;
    .locals 1

    new-instance v0, Lcom/daaw/wf2;

    invoke-direct {v0, p0}, Lcom/daaw/wf2;-><init>(Lcom/daaw/zf2;)V

    return-object v0
.end method

.method public static b(Ljava/lang/Object;Lcom/daaw/ve2;)Lcom/daaw/wf2;
    .locals 1

    new-instance v0, Lcom/daaw/wf2;

    invoke-direct {v0, p0, p1}, Lcom/daaw/wf2;-><init>(Ljava/lang/Object;Lcom/daaw/ve2;)V

    return-object v0
.end method


# virtual methods
.method public final c()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/wf2;->c:Lcom/daaw/zf2;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
