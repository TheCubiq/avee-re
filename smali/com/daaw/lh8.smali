.class public final Lcom/daaw/lh8;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lcom/daaw/lh8;


# instance fields
.field public final a:Lcom/daaw/jh8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget v0, Lcom/daaw/it5;->a:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    new-instance v0, Lcom/daaw/lh8;

    invoke-direct {v0}, Lcom/daaw/lh8;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/lh8;

    sget-object v1, Lcom/daaw/jh8;->b:Lcom/daaw/jh8;

    invoke-direct {v0, v1}, Lcom/daaw/lh8;-><init>(Lcom/daaw/jh8;)V

    :goto_0
    sput-object v0, Lcom/daaw/lh8;->b:Lcom/daaw/lh8;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/lh8;->a:Lcom/daaw/jh8;

    sget v0, Lcom/daaw/it5;->a:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    return-void
.end method

.method public constructor <init>(Landroid/media/metrics/LogSessionId;)V
    .locals 1

    new-instance v0, Lcom/daaw/jh8;

    invoke-direct {v0, p1}, Lcom/daaw/jh8;-><init>(Landroid/media/metrics/LogSessionId;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/lh8;->a:Lcom/daaw/jh8;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/jh8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lh8;->a:Lcom/daaw/jh8;

    return-void
.end method


# virtual methods
.method public final a()Landroid/media/metrics/LogSessionId;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lh8;->a:Lcom/daaw/jh8;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/daaw/jh8;->a:Landroid/media/metrics/LogSessionId;

    return-object v0
.end method
